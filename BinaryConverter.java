public class BinaryConverter
{
	//Instance Variables
	private int value;
	private String binaryValue;

	//Default Constructor
    public BinaryConverter()
    {
    	value=0;
    	binaryValue="0";
    }

    //Modified  Constructor(s)
    public BinaryConverter(int newValue)
    {
    	value=newValue;
    	binaryValue="0";
    }

    public BinaryConverter(String newBinary)
    {
    	value=0;
    	binaryValue=newBinary;
    }

    //Methods
    public int getValue()
    {
    	return value;
    }

    public String getBinary ()
    {
        return binaryValue;
    }

    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public String toBinary()
    {
    	//Convert the integer value to binary
       

        String result = "";
        int tempVal = value;
       
       while (tempVal >0)
       {
        int tempBin = tempVal % 2;
        result = tempBin + result;
        tempVal = tempVal/2;
       }
       binaryValue= result;
       return binaryValue;
    }

    public int toDecimal()
    {
        
    	//Convert the binary value to decimal

        //instantiate vars
        int result = 0;
        int power = 0;
            
        for (int i = binaryValue.length()-1; i>=0; i--)
        {
            char c = binaryValue.charAt(i);
            int bin = c - '0';
            result += bin * (int)Math.pow(2,power); 
            power++; 
        }
        value= result;
        return value;
    }
}
    