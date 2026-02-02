import java.util.*;

public class ArraylistClassWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] numbers = {12, 23, 34, 45, 56};
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println("The element of index [" + i + "] is : " + numbers[i]);
//        }
//        numbers[0] = 1000;
//        System.out.print("Updated array : " );
//        for (int i = 0 ; i < numbers.length; i++){
//            System.out.print("[" + numbers[i] + "], " );
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println("Enter the amount of the list :");
//        int n = sc.nextInt();
//        for (int i = 0; i < n ; i++){
//            System.out.println("Enter your number : ");
//            int num = sc.nextInt();
//            sc.nextLine();
//            list.add(num);
//        }
//        System.out.println(list);
//        System.out.println("Do you want to work with your array ? (y/n): ");
//        String choice = sc.nextLine();
//        while (choice.equals("y")){
//            System.out.println("Do you want to do something from the list (1:Edit array, 2:Remove some element, 3:add some element (the exact placement is choosable), 4:find some element ?, 5:Clear the array, 6:Sort array, 7: reverse it , 8: find min/max, 9: shuffle the array");
//            int numChoice = sc.nextInt();
//            sc.nextLine();
//            switch (numChoice){
//                case 1 :
//                    System.out.println("Print the exact index that you want to edit : ");
//                    int exactInd = sc.nextInt();
//                    sc.nextLine();
//                    System.out.println("Print the exact numbers that you want to replace over [" + list.get(exactInd) + "] : ");
//                    int exactNum = sc.nextInt();
//                    sc.nextLine();
//                    list.set(exactInd, exactNum);
//                    break;
//                case 2 :
//                    System.out.println("Print the exact index that you want to remove : ");
//                    int exactInd1 = sc.nextInt();
//                    sc.nextLine();
//                    list.remove(exactInd1);
//                    break;
//                case 3 :
//                    System.out.println("Do you want to add new element in array in exact index ? (y/n): ");
//                    String yesNo = sc.nextLine();
//                    if (yesNo.equals("y")){
//                        System.out.println("Print the exact index that you want to add : ");
//                        int exactInd2 = sc.nextInt();
//                        sc.nextLine();
//                        System.out.println("Print the exact number that you want to add : ");
//                        int exactNum1 = sc.nextInt();sc.nextLine();
//
//                        list.add(exactInd2, exactNum1);
//
//                    }else {
//                        System.out.println("Print the exact number that you want to add : ");
//                        int exactNum1 = sc.nextInt();
//                        sc.nextLine();
//                        list.add( exactNum1);
//                    }
//                    break;
//                case 4 :
//                    System.out.println("What number do you want to find ? ");
//                    int findingNum = sc.nextInt();
//                    sc.nextLine();
//                    if (list.contains(findingNum)){
//                        System.out.println("Yhe index of your number = " + list.indexOf(findingNum));
//                    }else {
//                        System.out.println("The number doesn't exist in this array");
//                    }
//                    break;
//                case 5 :
//                    list.clear();
//                    System.out.println("The array is successfully cleared");
//                    break;
//                case 6 :
//                    System.out.println("In which order ? (reversed/straight) : ");
//                    String direction = sc.nextLine();
//                    if (direction.equals("reversed")) {
//                        Collections.sort(list, Collections.reverseOrder());
//                    }else {
//                        Collections.sort(list);
//                    }
//                    break;
//                case 7 :
//                    Collections.reverse(list);
//                    break;
//                case 8:
//                    System.out.println("Find what ? (max/min):  ");
//                    String maxMin = sc.nextLine();
//                    if (maxMin.equals("max")){
//                        System.out.println(Collections.max(list));
//                    }else {
//                        System.out.println(Collections.min(list));
//                    }
//                    break;
//                case 9:
//                    Collections.shuffle(list);
//            }
//            System.out.println("The array is " + list);
//            System.out.println("Do you want to complete ? (y/n): ");
//            choice = sc.nextLine();
//        }
//        ArrayList<Integer> zeros = new ArrayList<>(Collections.nCopies(10, 0));
//        System.out.println(zeros);

    }
}