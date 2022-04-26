
import java.io.*;
import java.util.*;

public class Max {
public static void main (String[] args) {

int[] numbers = {10, 45, 100};  

for (int i = 2; i < numbers.length; i++) {
System.out.println(numbers[i]);

} 
}
}

/*
FINAL ANSWER: 
This method cannot be written using and enhanced for loop because I would not have access to an index value in an enhanced for loop, just the number itself. In a for loop I have access to the index value, see example above  "int i = 2", where as in an enhanced for loop, I do not have access to the index, just access to the number itself. See following example.

import java.io.*;
import java.util.*;

public class Max {
public static void main (String[] args) {

int[] numbers = {10, 45, 100};
for (int number : numbers) {

 System.out.println(number); 
}
}
}

The output is 
10
45
100

*/

