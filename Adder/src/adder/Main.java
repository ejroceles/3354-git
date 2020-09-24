package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Please provide at least two integers to add");
        } catch (NumberFormatException e) {
	    System.err.println("First argument must be a '-' or an integer, and all arguments to be added must be integers.");
	}
    }

    private static int addArguments(String[] args) {
	int sum;
	int start;
	if(args[0].equals("-")){
        	sum = (Integer.valueOf(args[1]) + Integer.valueOf(args[2])) * -1;
		start = 3;
	}
	else{
		sum = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
		start = 2;
	}
	for(int i = start; i < args.length; i++) 
	{
		if(args[0].equals("-"))
			sum += Integer.valueOf(args[i]) * -1;
		else
			sum += Integer.valueOf(args[i]);
	}
	return sum;
    }
}
