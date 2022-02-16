// java program to demonstrate wrapping and unwrapping in java classes

class wrappingUnwrapping
{
    public static void main(string args[])
    {
        byte a = 1;

        Byte byteobj = new  Byte(a);

        int b = 10;

        integer intobj = new Integer(b);

        float c = 18.6f;

        Float floatobj = new Float(c);

        double d = 250.5;

        Double doubleobj = new Double(d);

        char e ='a';

        Character charobj=e;

        system.out.println("values of wrapper objects(printing as objects)");
        system.out.println("Byte object byteobj: " + byteobj);
        system.out.println("Integer object intobj: " + intobj);
        system.out.println("Float object floatobj: " + floatobj);
        system.out.println("Double object doubleobj: " + doubleobj);
        system.out.println("character object charobj: " + charobj);

        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        system.out.println("Unwrapped values(printing as data types)");
        system.out.println("byte value, bv: " + bv);
        system.out.println("int value, iv: " + iv);
        system.out.println("float value, fv: " + fv);
        system.out.println("double value, dv: " + dv);
        systen.out.println("char value, cv: " + cv);
    }
}