# Leaders in an array
# optimal
```java
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> arrl = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        arrl.add(maxFromRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                arrl.add(maxFromRight);
            }
        }

        // Reverse to maintain original order
        Collections.reverse(arrl);
        return arrl;
    }
}

```
# Brutforce
```java
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> arrl = new ArrayList<>();
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j] && arr.length - 1 != i) {
                    flag = false;
                    continue;
                }
            }

            if (flag == true) {
                arrl.add(arr[i]);
                continue;
            }

            if (arr.length - 1 == i) {
                arrl.add(arr[i]);
            }
        }

        return arrl;
    }
}

```
# Get alternate numbers
```java
class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
    ArrayList<Integer> arrl = new ArrayList<>();
        for(int i=0;i<arr.length;i+=2){
            arrl.add(arr[i]);
        }
        return arrl;
    }
}
```
# isSorted array
```java
class Solution {
    public boolean isSorted(int[] arr) {
        int max=arr[0];
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
         if(arr[i]>=max){
             max=arr[i];
             flag =true;
         }else{
             return false;
         }
     }
     return true;
        
    }
}
```
# Remove Duplicates
```java
class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
       LinkedHashSet<Integer>lh=new LinkedHashSet<>();
       for(int a:arr){
           lh.add(a);
       }
       int i = 0;
        for (int val : lh) {
            arr[i++] = val; // modify original array
        }

        return lh.size();
    }
}
//Note dont forget to change the orginal array
```
