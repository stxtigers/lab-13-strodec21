import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Main
{
  //Assume no null data inbetween non-null data
  //Won't have this -> ("Hello", "Bob", null, "happy")
  //Array doesn't have to be full
  public static String[] insert(String s, int i, String[] a, int logicalSize)
  {
    //If physical size equals logical size then the array is full
    if(a.length == logicalSize)
    {
      return null;
    }

    String[] newArray = Arrays.copyOf(a. a.length); //If you do newArray = a you create an aias
    //Before I can insert, I have to move everything down one
    //Start with last thing, work backwards so no data gets overwritten 
    for(int j = logicalSize - 1; j>= i; j--)
    {
      newArray[j+1] = newArray[j]; //Move element up one (current index + 1)
    }

    //Insert string s at i 
    //YOU WRITE CODE HERE
    newArray[i] = s;
  }
    //Return new array
    return newArray;
  }

  public static int[] delete(int target, int[] a, int logicalSize)
  {
    for(int j = logicalSize - 1; j>= i; j--)
    {
      a[j-1] = a[j]; 
    }
    
    if(target < 0)
    {
      return a[j];
    }
    else 
    {
      return newArray;
    }
  }

  public static void stats(String filename) throws IOException
  {
    Scanner fileReader = new Scanner(new File(filename));
    int[] buffer = new int[5000]; //A buffer is a place in memory you read data info
    int count = 0;

    //Load file into buffer array
    while(fileReader.hasNext())
    { 
    buffer[count] = fileReader.nextInt();
    count++;
    }

    int[] numbers = Arrays.copyOf(buffer, count); //This will give us the right size array
    buffer = null; //Allow the buffer to be garbage collected 

    //Now you are ready to roll!
    //You are more than welcome to use java.lang.Math
  }
  
  public static double stdev(int[] a)
  {
    double avg = average(a);
    double[] diff = new double[a.length];
    for(int i = 0; i < a.length; i++)
    {
      diff[i] = a[i] - avg;
    }
    double[] diffSquared = new double[a.length];
    for(int i = 0; i < a.length; i++)
    {
      diffSquared[i] = diff[i] * diff[i];
    }
    double avg2 = average(diffSquared);
    avg2 = Math.sqrt(avg2);

    return avg2;
  }
}