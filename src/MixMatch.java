public class MixMatch {
    public static void main(String[] args) {
        
        String varString = "Hello world!"; 
        char varChar = 'N';
        short varShort = 32767;
        int varInt = 2147483647;
        long varLong = 9000000000000000000l;
        float varFloat = 14.999f;
        double varDouble = 0.0000000001;
        boolean varBoolean = true;

        System.out.println(varString + " <- String, stores a sequence of characters.");
        System.out.println(varChar + " <- Char, stores a single character/letter or ASCII values");
        System.out.println(varShort + " <- Short, stores whole numbers from -32,768 to 32,767");
        System.out.println(varInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647");
        System.out.println(varLong + " <- Long, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println(varFloat + " <- Float, stores fractional numbers up to 7 decimal digits");
        System.out.println(varDouble + " <- Double, stores fractional numbers up to 15 decimal digits");
        System.out.println(varBoolean + " <- Boolean, stores true or false values");

        System.out.println("String: " + varString + "; Char: " + varChar + "; Short: " + varShort + "; Int: " + varInt + "; Long: " + varLong + "; Float: " + varFloat + "; Double: " + varDouble + "; Boolean: " + varBoolean);
    }
}