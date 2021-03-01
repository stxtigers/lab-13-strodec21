//Given an array a of strings, print each string to it's own console

//Using a standard for loop
for(int i = 0; i < a.length; i++)
{
  System.out.println(a[i]);
}

//Using an enhanced for loop (for-each loop)
//For each string s in array a, do this
for(String s: a)
{
  System.out.println(s);
}
//When would I want to use an enhanced for loop?
//Use for each when you want to do the same thing to each element in the array, but you don't care about the index 