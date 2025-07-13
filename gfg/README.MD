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
