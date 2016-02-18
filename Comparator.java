class Checker
    {
    public static Comparator<Player> desc = new Comparator<Player>()
        {
        @Override
        public int compare(Player a , Player b)
            {
            //If age of first object is greater than the second, we are returning positive value, for ascending order
            //If age of first object is less than the second object, we are returning negative value, it can be any negative value and if age of both objects are equal, we are returning 0.
               if(a.score > b.score)
                   {
                   return -4;
               }
                else if(a.score < b.score)
                    {
                    return 1;
                }
                else if(a.score == b.score)
                    {
                    if(a.name.compareTo(b.name) >0)
                        {
                        return -1;
                    }
                    else {return 1;}
                }
                else
                    {return 0;}
            }
        
        
        
    };
    
}


 





