class Solution {
    public int romanToInt(String s) {
        int a =0, b=0 , c=0;
        for (int i=s.length()-1;i>=0;i--)
    {
            switch(s.charAt(i))
            {
                case 'I':
                  a=1;
                  break;
                case 'V':
                   a=5;
                   break;
                case 'X':
                  a=10;
                  break;
                case 'L' :
                    a=50;
                    break;
                case 'C':
                    a=100;
                    break;
                case 'D':
                    a=500;
                    break;
                case'M':
                    a=1000;
                    break;
            }
            if(b>a)
            c -= a;
            else
            {
            c +=a;
            b=a;
        }
        }
      return c;  
    }
}
