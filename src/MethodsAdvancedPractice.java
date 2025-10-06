import java.util.Arrays;

public class MethodsAdvancedPractice {

    // Static variable untuk demonstrasi
    private static int counter = 0;

    // Instance variable untuk demonstrasi
    private String instanceName;

    // Constructor
    public MethodsAdvancedPractice(String name) {
        this.instanceName = name;
        counter++;
    }

    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Methods Advanced
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * method signature, overloading, pass by value/reference, static vs instance methods.
         */

        // ===== METHOD SIGNATURE DAN DECLARATION =====
        System.out.println("=== METHOD SIGNATURE DAN DECLARATION ===");

        // Contoh pemanggilan method calculate dengan signature berbeda
        System.out.println(calculate(3, 5));
        System.out.println(calculate(2.5, 3.5));
        System.out.println(calculate(1, 2, 3));
        System.out.println(calculate("Oshi", " no Ko"));

        // ===== METHOD OVERLOADING =====
        System.out.println("\n=== METHOD OVERLOADING ===");

        print(42);
        print(3.14);
        print("Akane Kurokawa");
        print(new int[]{1, 2, 3, 4, 5});

        // ===== STATIC VS INSTANCE METHODS =====
        System.out.println("\n=== STATIC VS INSTANCE METHODS ===");

        System.out.println("Counter awal: " + getCounter());
        incrementCounter();
        System.out.println("Counter setelah increment: " + getCounter());

        MethodsAdvancedPractice obj1 = new MethodsAdvancedPractice("Objek1");
        obj1.displayInfo();

        // ===== PASS BY VALUE - PRIMITIVES =====
        System.out.println("\n=== PASS BY VALUE - PRIMITIVES ===");
        int originalNumber = 10;
        System.out.println("Sebelum: " + originalNumber);
        modifyPrimitive(originalNumber);
        System.out.println("Sesudah: " + originalNumber);

        // ===== PASS BY VALUE OF REFERENCE - OBJECTS =====
        System.out.println("\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Sebelum: " + Arrays.toString(originalArray));
        modifyArray(originalArray);
        System.out.println("Sesudah: " + Arrays.toString(originalArray));

        int[] anotherArray = {10, 20, 30};
        System.out.println("Sebelum reassignment: " + Arrays.toString(anotherArray));
        reassignArray(anotherArray);
        System.out.println("Sesudah reassignment: " + Arrays.toString(anotherArray));

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = sortArrayCopy(numbers);
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Sorted: " + Arrays.toString(sorted));
        double[] stats = getArrayStats(numbers);
        System.out.println("Min: " + stats[0] + ", Max: " + stats[1] + ", Avg: " + stats[2]);
        int[] merged = mergeArrays(numbers, originalArray);
        System.out.println("Merged: " + Arrays.toString(merged));

        // ===== VARIABLE ARGUMENTS (VARARGS) =====
        System.out.println("\n=== VARIABLE ARGUMENTS (VARARGS) ===");
        System.out.println("Sum 1: " + sum(1, 2, 3));
        System.out.println("Sum 2: " + sum(5, 10, 15, 20));
        printInfo("Nilai:", 1, 2, 3, 4);

        // ===== METHOD CHAINING =====
        System.out.println("\n=== METHOD CHAINING ===");
        Calculator calc = new Calculator(10);
        double result = calc.add(5).multiply(2).subtract(3).getResult();
        System.out.println("Hasil chaining: " + result);

        // ===== RECURSIVE METHODS =====
        System.out.println("\n=== RECURSIVE METHODS ===");
        System.out.println("Faktorial 5: " + factorial(5));
        System.out.println("Fibonacci 7: " + fibonacci(7));
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("Binary search (target 7): " + binarySearchRecursive(arr, 7, 0, arr.length - 1));

        // ===== UTILITY STATIC METHODS =====
        System.out.println("\n=== UTILITY STATIC METHODS ===");
        System.out.println("2^5 = " + MathUtils.power(2, 5));
        System.out.println("Apakah 7 prima? " + MathUtils.isPrime(7));
        System.out.println("GCD dari 20 dan 15: " + MathUtils.gcd(20, 15));

        System.out.println("Reverse 'level': " + StringUtils.reverse("level"));
        System.out.println("Palindrome 'madam': " + StringUtils.isPalindrome("madam"));
        System.out.println("Jumlah kata: " + StringUtils.countWords("Akane adalah idol terbaik"));

        int[][] matrix = {{1, 2}, {3, 4}};
        ArrayUtils.printMatrix(matrix);
        int[] dupes = ArrayUtils.findDuplicates(new int[]{1, 2, 3, 2, 4, 1});
        System.out.println("Duplikat: " + Arrays.toString(dupes));
        System.out.println("Array sama? " + ArrayUtils.areEqual(new int[]{1, 2}, new int[]{1, 2}));

        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");
        System.out.println("Calculator Overload: " + calculate(10, 5));
        System.out.println("Calculator String: " + calculate("Oshi", " no Ko"));
    }

    // ===== METHOD OVERLOADING EXAMPLES =====
    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double a, double b) {
        return a + b;
    }

    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculate(String a, String b) {
        return a + b;
    }

    public static void print(int value) {
        System.out.println("Integer: " + value);
    }

    public static void print(double value) {
        System.out.println("Double: " + value);
    }

    public static void print(String value) {
        System.out.println("String: " + value);
    }

    public static void print(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    // ===== STATIC VS INSTANCE METHODS =====
    public static int getCounter() {
        return counter;
    }

    public static void incrementCounter() {
        counter++;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String name) {
        this.instanceName = name;
    }

    public void displayInfo() {
        System.out.println("Instance: " + instanceName + ", Counter: " + counter);
    }

    // ===== PASS BY VALUE DEMONSTRATIONS =====
    public static void modifyPrimitive(int number) {
        number = 50;
        System.out.println("Di dalam method: " + number);
    }

    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
    }

    public static void reassignArray(int[] array) {
        array = new int[]{99, 88, 77};
        System.out.println("Di dalam method: " + Arrays.toString(array));
    }

    // ===== ARRAY METHODS =====
    public static int[] sortArrayCopy(int[] original) {
        int[] copy = Arrays.copyOf(original, original.length);
        Arrays.sort(copy);
        return copy;
    }

    public static double[] getArrayStats(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        double avg = Arrays.stream(array).average().getAsDouble();
        return new double[]{min, max, avg};
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }

    // ===== VARIABLE ARGUMENTS (VARARGS) =====
    public static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) total += n;
        return total;
    }

    public static void printInfo(String title, int... values) {
        System.out.println(title + " " + Arrays.toString(values));
    }

    // ===== RECURSIVE METHODS =====
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (array[mid] == target) return mid;
        if (array[mid] > target)
            return binarySearchRecursive(array, target, left, mid - 1);
        else
            return binarySearchRecursive(array, target, mid + 1, right);
    }

    // ===== UTILITY CLASSES (INNER STATIC CLASSES) =====
    public static class MathUtils {
        public static double power(double base, int exponent) {
            double result = 1;
            for (int i = 0; i < exponent; i++) result *= base;
            return result;
        }

        public static boolean isPrime(int number) {
            if (number <= 1) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        }

        public static int gcd(int a, int b) {
            if (b == 0) return a;
            return gcd(b, a % b);
        }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        public static boolean isPalindrome(String str) {
            return str.equalsIgnoreCase(reverse(str));
        }

        public static int countWords(String str) {
            if (str == null || str.trim().isEmpty()) return 0;
            return str.trim().split("\\s+").length;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }

        public static int[] findDuplicates(int[] array) {
            java.util.Set<Integer> seen = new java.util.HashSet<>();
            java.util.Set<Integer> dupes = new java.util.HashSet<>();
            for (int n : array) {
                if (!seen.add(n)) dupes.add(n);
            }
            return dupes.stream().mapToInt(Integer::intValue).toArray();
        }

        public static boolean areEqual(int[] array1, int[] array2) {
            return Arrays.equals(array1, array2);
        }
    }

    // ===== METHOD CHAINING EXAMPLE =====
    public static class Calculator {
        private double value;

        public Calculator(double initial) {
            this.value = initial;
        }

        public Calculator add(double n) {
            this.value += n;
            return this;
        }

        public Calculator multiply(double n) {
            this.value *= n;
            return this;
        }

        public Calculator subtract(double n) {
            this.value -= n;
            return this;
        }

        public double getResult() {
            return value;
        }
    }
}
