public class ch_16_17
{
   /* Write a method called removeRange that accepts a starting and ending index as parameters and removes the
    elements at those indexes (inclusive) from the list. For example, if a variable list stores the values [8, 13, 17,
    4, 9, 12, 98, 41, 7, 23, 0, 92], the call of listRange.removeRange(3, 8); should remove values
    between index 3 and index 8 (the values 4 and 7), leaving the list of [8, 13, 17, 23, 0, 92]. The method
    should throw an IllegalArgumentException if either of the positions is negative. Otherwise you may assume
    that the positions represent a legal range of the list (0  start  end  size).
    */

    public static void main(String[] args)
    {
        LinkedIntList LL = new LinkedIntList();
        LL.add(8);
        LL.add(13);
        LL.add(17);
        LL.add(4);
        LL.add(9);
        LL.add(12);
        LL.add(98);
        LL.add(41);
        LL.add(7);
        LL.add(23);
        LL.add(0);
        LL.add(92);

        System.out.println(removeRange(3, 8, LL));
    }

    public static LinkedIntList removeRange(int start, int end, LinkedIntList list){
        for (int i = 0; i < end ; i++)
        {
            if (i >= start) {
                list.set(i,9000);
            }
        }
        while (list.contains(9000)) {
            for (int i = 0; i < list.size() ; i++)
            {
                if (list.get(i) == 9000)
                    list.remove(i);
            }
        }
        return list;
    }
}
