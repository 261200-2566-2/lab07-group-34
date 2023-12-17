import java.util.Arrays;

public class lab07 {
    public static void main(String[] args) {
        mySet<String> mySet = new mySet<>();

        //Test add method
        mySet.add("Java");
        mySet.add("Python");
        mySet.add("C++");
        mySet.add("Java");// Duplicate, should not be added

        //Test iterator method
        System.out.println("Elements: ");
        for(String element : mySet){
            System.out.println("'" + element + "'");
        }

        //Test size method
        System.out.println("Size: " + mySet.size());
        //Test isEmpty method
        System.out.println("Is Empty?: " + mySet.isEmpty());

        //Test contains method
        System.out.println("Contains 'Python'?: " + mySet.contains("Python"));
        System.out.println("Contains 'JavaScript'?: " + mySet.contains("JavaScript"));

        //Test toArray method
        String[] arr1 = new String[mySet.size()];
        arr1 = mySet.toArray(arr1);
        System.out.println("Array: " + Arrays.toString(arr1));

        //Test remove method
        mySet.remove("C++");
        String[] arr2 = new String[mySet.size()];
        arr2 = mySet.toArray(arr2);
        System.out.println("After removing 'C++': " + Arrays.toString(arr2));

        //Test containsAll method
        System.out.println("Contains all elements?: " + mySet.containsAll(Arrays.asList("Java","Python")));

        // Test addAll method
        mySet.addAll(Arrays.asList("JavaScript", "C#"));
        String[] arr3 = new String[mySet.size()];
        arr3 = mySet.toArray(arr3);
        System.out.println("After adding 'JavaScript' and 'C#': " + Arrays.toString(arr3));

        // Test retainAll method
        mySet.retainAll(Arrays.asList("Java", "Python"));
        String[] arr4 = new String[mySet.size()];
        arr4 = mySet.toArray(arr4);
        System.out.println("After retaining 'Java' and 'Python': " + Arrays.toString(arr4));

        // Test removeAll method
        mySet.removeAll(Arrays.asList("Java"));
        String[] arr5 = new String[mySet.size()];
        arr5 = mySet.toArray(arr5);
        System.out.println("After removing 'Java': " + Arrays.toString(arr5));

        // Test clear method
        mySet.clear();
        String[] arr6 = new String[mySet.size()];
        arr6 = mySet.toArray(arr6);
        System.out.println("After clear: " + Arrays.toString(arr6));
    }
}
