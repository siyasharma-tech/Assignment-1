//import java.util.Scanner;

//even odd numbers
// class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("ENTER A NUMBER:-");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i + " -> Even");
//             } else {
//                 System.out.println(i + " -> Odd");
//             }
//         }
//         sc.close();
//     }
// }

//table
// class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("ENTER A NUMBER:-");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             System.out.println("-------------------------");
//             System.out.println("Table of " + i);
//             System.out.println("-------------------------");
//             for (int j = 1; j <= 10; j++) {
//                 System.out.println(i + " * " + j + " = " + (i * j));
//             }
//         }
//         sc.close();
//     }
// }

// //prime number
// class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER START:-");
//         int n = sc.nextInt();
//         System.out.println("ENTER END:-");
//         int m = sc.nextInt();
//         boolean isprime;
//         for (int i = n; i <= m; i++) {
//             if (i < 2)
//                 continue;
//             isprime = true;
//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     isprime = false;
//                     break;
//                 }
//             }
//             if (isprime) {
//                 System.out.println(i);
//             }
//         }
//         sc.close();
//     }
// }


// //guessing game
// class hw {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int secret = 27;
//         boolean guessed = false;
//         for (int i = 1; i <= 5; i++) {
//             int guess = sc.nextInt();
//             if (guess < secret) {
//                 System.out.println("Too Low");
//             } 
//             else if (guess > secret) {
//                 System.out.println("Too High");
//             } 
//             else {
//                 System.out.println("Congratulations! You guessed it.");
//                 guessed = true;
//                 break;
//             }
//         }
//         if (!guessed) {
//             System.out.println("Better Luck Next Time!");
//         }
//         sc.close();
//     }
// }

// //strong number
// class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER START:-");
//         int start = sc.nextInt();
//         System.out.println("ENTER END:-");
//         int end = sc.nextInt();
//         for (int i = start; i <= end; i++) {
//             int num = i;
//             int sum = 0;
//             while (num > 0) {
//                 int digit = num % 10;
//                 int fact = 1;
//                 for (int j = 1; j <= digit; j++) {
//                     fact = fact * j;
//                 }
//                 sum = sum + fact;
//                 num = num / 10;
//             }
//             if (sum == i) {
//                 System.out.println(i);
//             }
//         }
//         sc.close();
//     }
// }