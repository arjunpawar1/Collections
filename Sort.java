import java.util.*;

class Student
{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
     // super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
    
    public static Comparator<Student> cgpaSort = new Comparator<Student>()
    {
        @Override
        public int compare(Student s1, Student s2)
            {
                        //If age of first object is greater than the second, we are returning positive value, for ascending order
            //If age of first object is less than the second object, we are returning negative value, it can be any negative value and if age of both objects are equal, we are returning 0.
            //but as we are solving  in descending order we need to do reverse
            
            if(s1.cgpa > s2.cgpa)
                {
                return -1;
            }
            else if(s1.cgpa < s2.cgpa)
                {
                return 1;
            }
            //if both are same compare on names (alphabetical order)
            else if(s1.cgpa == s2.cgpa)
                                {
                                        if(s1.fname.compareTo(s2.fname) >0)
                                            {
                                            return 1;
                                        }
                                        else if(s1.fname.compareTo(s2.fname) < 0)
                                            {return -1;}
                                            else if(s1.fname.compareTo(s2.fname) ==0)
                                                {
                                                //if both the names are equal compare on id's
                                                
                                                                if(s1.id > s2.id)
                                                                    {
                                                                    return -1;
                                                                }
                                                                else if(s1.id < s2.id)
                                                                    {return 1;}
                                                                else {return 0;}
                                            }
                                                else
                                                    {return 0;}
                            }
            else
                {
                return 0;
            }
        }
        
    };
    
    
   
    // @Override
   // public String toString() {
   //     return "[ ID=" + id + ", name=" + fname + ", grade=" + cgpa + "]";
   // }
}

//Complete the code
 public class Sort
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0)
      {
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
        
         testCases--;
      }
       Collections.sort(studentList,Student.cgpaSort);
         for(Student st: studentList)
         {
          System.out.println(st.getFname());
      }
   }
}
