/* 5. Write programs in Java to use Wrapper class of each primitive data types. (CO2) */

class P5
{
    public static void main(String args[])
    {
        // Boolean bl = new Boolean(true);
        Boolean bl = Boolean.valueOf(true);
        Byte b = Byte.valueOf("1");
        Short s = Short.valueOf(b);
        Character c = Character.valueOf('c');
        Integer i = Integer.valueOf(c);
        Long l = Long.valueOf(i);
        Float f = Float.valueOf(l);
        Double d = Double.valueOf(f);
        System.out.println(bl + "\n" + b + "\n" + s + "\n" + c + "\n" + i + "\n" + l + "\n" + f + "\n" + d);
    }
}