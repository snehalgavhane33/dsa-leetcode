                 //HARD PROBLEM ON ARRAY


//pascal triangle : given R & C print specific no.
import java.util.*;

// public class Darray3{
//     public static long nCr(int n , int r){
//         int res = 1;
//         for(int i=0; i<r; i++){
//             res = res *(n-1);
//             res = res/(i+1);
//         }
//         return res;
//     }

//      public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter row number: ");
//         int r = sc.nextInt();
//         System.out.print("Enter column number: ");
//         int c = sc.nextInt();
//         long ans = nCr(r - 1, c - 1);
//         System.out.println("Element at (" + r + ", " + c + ") = " + ans); 
//     }
// }

//pascal triangle : print entire row
// public class Darray3 {

//     public static void printRow(int n){
//         int ans = 1;
//         System.out.println(ans + " ");
//         for(int i=1; i<n; i++){
//             ans = ans * (n-i);
//             ans = ans/i;
//             System.out.println(ans + "  ");
//         }
//     } 
//      public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

        
//         System.out.print("Enter row number: ");
//         int n = sc.nextInt();
//         printRow(n);
// }
// }   

//pascal triangle : print entire triangle
// public class Darray3 {

//     public static int nCr(int n, int r){
//     int ans = 1;
//     for(int i=0; i<r; i++){
//         ans = ans * (n-i);
//         ans = ans / (i+1);

//     }
//     return ans;
    
// }

// public static ArrayList<ArrayList<Integer>> pascalTriangle(int n){
//     ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//     for(int row=1; row<=n; row++){
//         ArrayList<Integer> temp = new ArrayList<>();
//         for(int col=1; col<=row; col++){
//             temp.add(nCr(row-1 ,col-1));
//         }
//         ans.add(temp);
//     }
//     return ans;
// }

//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter number of rows: ");
//     int n = sc.nextInt();
//     ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
//     for (ArrayList<Integer> row : triangle) {
//         for (int num : row) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
//     sc.close();
// }
// }


//majority element (n/3) better
// public class Darray3 {

//     public static List<Integer> majorityEle(int arr[] , int n){
//         HashMap<Integer,Integer> map = new HashMap<>();
//         List<Integer> ans = new ArrayList<>();
//         int min = (n/3)+1;

//         for(int i=0; i<n; i++){
//             map.put(arr[i], map.getOrDefault(arr[i],0)+1 );
//             if(map.get(arr[i])==min){
//                 ans.add(arr[i]);
//             }
//             if(ans.size()==2) break;
//         }
//         Collections.sort(ans);
//         return ans;
//     }
//      public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//          List<Integer> ans1 = majorityEle(arr, n);
//          System.out.println("Majority Elements (> n/3 times): " + ans1);
//     }
// }

//majority element (n/3) better
// public class Darray3 {

//      public static List<Integer> majorityEle(int[] nums, int n){
//         int cnt1=0,cnt2=0;
//         int ele1 = Integer.MAX_VALUE;
//         int ele2 = Integer.MIN_VALUE;

//         for(int i=0; i<n; i++){
//             if(cnt1==0 && nums[i] != ele2){
//                 cnt1 = 1;
//                 ele1 = nums[i];

//             }
//             else if(cnt2==00 && nums[i] != ele1){
//                 cnt2 = 1;
//                 ele2 = nums[i];
//             }
//             else if(nums[i] == ele1){
//                 cnt1++;
//             }
//             else if(nums[i] == ele2){
//                 cnt2++;
//             }
//             else{
//                 cnt1--;
//                 cnt2--;
//             }
//         }
//         cnt1 = 0;
//         cnt2 = 0;

//         for(int i=0; i<n; i++){
//             if(nums[i]==ele1){
//                 cnt1++;
//             }
//             else if(nums[i]==ele2){
//                 cnt2++;
//             }
//         }
//         List<Integer> ans = new ArrayList<>();
//         int min = (n/3)+1;

//         if(cnt1>= min)
//             ans.add(ele1);
//         if(cnt2>=min)
//             ans.add(ele2);
//         return ans;
    
//  }
//   public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] nums = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }
//          List<Integer> ans = majorityEle(nums, n);
//          System.out.println("Majority Elements (> n/3 times): " + ans);
//     }
// }


//sum 3 better
// public class Darray3 {

//     public static List<List<Integer>> threeSum(int arr[], int n){
//         Set<List<Integer>> st = new HashSet<>();
//         for(int i=0; i<n; i++){
//             HashSet<Integer> hashSet = new HashSet<>();
//             for(int j=i+1; j<n; j++){
//                 int third = -(arr[i]+arr[j]);
//                 if(hashSet.contains(third)){
//                      List<Integer> temp = new ArrayList<>();
//                      temp.add(arr[i]);
//                      temp.add(arr[j]);
//                      temp.add(third);
//                      Collections.sort(temp);
//                      st.add(temp);

                     
//                 }
//                 hashSet.add(arr[j]);
//             }
//         }
//         return new ArrayList<>(st);
//     }

//      public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         List<List<Integer>> ans1 = threeSum(arr, n);
//         System.out.println("Triplets are:");
//         for (List<Integer> list : ans1) {
//             System.out.println(list);
//         }
//     }
// }


//sum 3 optimal
// public class Darray3 {

//     public static List<List<Integer>> threeSum(int arr[], int n){
//         List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(arr);
//         for(int i=0; i<n; i++){
//             if(i>0 && arr[i]==arr[i-1]) continue;
//             int j = i+1;
//             int k = n-1;
//             while(j<k){
//                 int sum = arr[i]+arr[j]+arr[k];

//                 if(sum<0){
//                     j++;
//                 }
//                 else if(sum>0){
//                     k--;
//                 }
//                 else{
//                     List<Integer> temp = new ArrayList<>();
//                     temp.add(arr[i]);
//                     temp.add(arr[j]);
//                     temp.add(arr[k]);

//                     ans.add(temp);
//                     j++;
//                     k--;

//                     while(j<k && arr[j] == arr[j-1]) j++;
//                     while(j<k && arr[k] == arr[k+1]) k--;
//                 }
//             }
//         }
//         return ans;
        
//     }

//      public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//           List<List<Integer>> ans2 = threeSum(arr, n);
//         System.out.println("Triplets are:");
//         for (List<Integer> list : ans2) {
//             System.out.println(list);
//         }
//     }
// }


//4 sum better 
public class Darray3{
    public static List<List<Integer>> fourSum(int arr[], int n, int target){
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                HashSet<Long> hashSet = new HashSet<>();
                for(int k=j+1; k<n; k++){
                    long sum = arr[i]+arr[j]+arr[k];
                    long fourth = target - sum;

                    if(hashSet.contains(fourth)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add((int)fourth);

                        Collections.sort(temp);
                        st.add(temp);
                    }
                    hashSet.add((long)arr[k]);
                }
            }
        }
        return new ArrayList<>(st);
    }

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();
        List<List<Integer>> ans = fourSum(arr,n, target);
        System.out.println("Quadruplets are:");
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
     }
}