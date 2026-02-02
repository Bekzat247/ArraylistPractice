import java.util.*;

public class ArraylistPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
////        First number
//        ArrayList<String> books1 = new ArrayList<>();
//        ArrayList<String> books2 = new ArrayList<>();
//        System.out.println("Write the number of books for one shelf");
//        int amountOfBooks1 = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Write the number of books for another shelf");
//        int amountOfBooks2 = sc.nextInt();
//        sc.nextLine();
//
//        for (int i = 0 ; i < amountOfBooks1; i++){
//            System.out.println("Write the book number " + (i+1) + " for the first shelf");
//            String bookname = sc.nextLine();
//            books1.add(bookname);
//        }
//        for (int i = 0 ; i < amountOfBooks2; i++){
//            System.out.println("Write the book number " + (i+1) + " for the second shelf");
//            String bookname = sc.nextLine();
//            books2.add(bookname);
//        }
//        for (int i = 0 ; i< books2.size(); i++){
//            if (!books1.contains(books2.get(i))){
//                books1.add(books2.get(i));
//            }
//        }
//        books2.clear();
//        System.out.println("Merged array : " +  books1);
//        System.out.println(books2);
////        2
//        ArrayList<String> movieTittle = new ArrayList<>();
//        System.out.println("Write the number of movie for one shelf");
//        int amountOfMovie = sc.nextInt();
//        sc.nextLine();
//        int lengthOfTittle = 0;
//        int indexOfMovie = 0;
//        for (int i = 0 ; i < amountOfMovie; i++){
//            System.out.println("Write the book number " + (i+1) + " for the first shelf");
//            String bookname = sc.nextLine();
//            movieTittle.add(bookname);
//            if (bookname.length() > lengthOfTittle){
//                lengthOfTittle = bookname.length();
//                indexOfMovie = i;
//
//            }
//        }
//        System.out.println("Movie with the longest tittle is : " + movieTittle.get(indexOfMovie));
////        3
//        ArrayList<String> foods = new ArrayList<>();
//        System.out.println("Write the number of foods");
//        int amountOfFoods = sc.nextInt();
//        sc.nextLine();
//        int theCountOfPizza = 0;
//        for (int i = 0 ; i < amountOfFoods; i++){
//            System.out.println("Write the food number " + (i+1));
//            String foodName = sc.nextLine();
//
//            foods.add(foodName);
//            if (foodName.equals("Pizza")){
//                theCountOfPizza+=1;
//            }
//        }
//        System.out.println("Pizza repeats " + theCountOfPizza + " times");
////        4
//        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Strawberry", "Banana", "Blueberry"));
//        fruits.removeAll(Collections.singletonList("Banana"));
//        System.out.println(fruits);
////        5
//        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "Green", "White", "Purple", "Black"));
//        int count = Collections.frequency(colors, "Black");
//        while (count != 0){
//            System.out.println("Write the word that you want to put above 'black' ");
//            String replace = sc.nextLine();
//            colors.set(colors.indexOf("Black"), replace);
//            count --;
//        }
//        System.out.println(colors);
////        6
//        ArrayList<Object> sports = new ArrayList<>();
//        sports.add("BasketBall");
//        sports.add("Volleyball");
//        sports.add("Ping Pong");
//        ArrayList<String> miniList = new ArrayList<>();
//        miniList.add("Football");
//        miniList.add("Tennis");
//        sports.add(miniList);
//        System.out.println(sports);
//        if(sports.contains(miniList)){
//            System.out.println("Yes it consists");
//        }else {
//            System.out.println("NOOOOO");
//        }
////        7
//        ArrayList<String> flowers = new ArrayList<>(Arrays.asList("Roses", "Romashka", "Sunflower", "Zveroboi", "Roses", "Oh yes"));
//        System.out.println("The first index of element Roses is :" + flowers.indexOf("Roses") + ". And the last index of : " + flowers.lastIndexOf("Roses"));
////        8
//        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Elephant", "Tiger", "Tutle", "Dolphine","Elephant",  "Hypopotamus", "Jiraf", "Zebra"));
//        for (int i = 0 ; i < animals.size(); i++){
//            for (int j = i+1; j < animals.size(); j++){
//                if (animals.get(i) .equals(animals.get(j))){
//                    animals.remove(j);
//                }
//            }
//        }
//        System.out.println(animals);
////        9
//        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Denver", "Dallas", "Talas", "Manas"));
//        String[] citiesRegularArray = new String[cities.size()];
//        for (int i = 0; i< cities.size(); i++){
//            citiesRegularArray[i] = cities.get(i);
//        }
//        for(int i = 0; i < citiesRegularArray.length; i++){
//            System.out.println(citiesRegularArray[i]);
//        }
////        10
//        ArrayList<String> cities2 = new ArrayList<>();
//        String[] citiesRegularArray2 = {"Denver", "Dallas", "Talas", "Manas"};
//        for (int i = 0; i< citiesRegularArray2.length; i++){
//            cities2.add(citiesRegularArray2[i]);
//        }
//        System.out.println(cities2);
////        11
//        ArrayList<String> countries1 = new ArrayList<>(Arrays.asList("Kyrgyzstan", "Kazakhstan", "Kyrgyzstan", "Russia"));
//        ArrayList<String> countries2 = new ArrayList<>(Arrays.asList("Kyrgyzstan", "Kazakhstan", "Kyrgyzstan", "Russia"));
//        ArrayList<String> commonElements = new ArrayList<>();
//        ArrayList<Integer> counts = new ArrayList<>();
//
//        for (int i = 0; i < countries1.size(); i++) {
//            String current = countries1.get(i);
//
//            if (countries2.contains(current) && !commonElements.contains(current)) {
//                int count = 0;
//
//                for (int j = 0; j < countries1.size(); j++) {
//                    if (countries1.get(j).equals(current) && countries2.contains(current)) {
//                        count++;
//                    }
//                }
//
//                commonElements.add(current);
//                counts.add(count);
//            }
//        }
//        int max = 0;
//        String mostCommon = null;
//        for (int i = 0; i < counts.size(); i++) {
//            if (counts.get(i) > max) {
//                max = counts.get(i);
//                mostCommon = commonElements.get(i);
//            }
//        }
//        System.out.println("Самый распространённый: " + mostCommon);
//        System.out.println("Количество: " + max);
        ////12
//        ArrayList<String> names =  new ArrayList<>(Arrays.asList("Vladislav", "Eren", "Nurisbek", "Nurslutan", "Nurbek", "Karaghat"));
//        for (int i = 0; i < names.size(); i++){
//            if (names.get(i).length() % 2 ==0){
//                names.remove(i);
//            }
//        }
//        System.out.println(names);
        ////13
//        ArrayList<String> songs = new ArrayList<>(Arrays.asList("Imagine", "Yesterday", "One", "Bohemian Rhapsody"));
//
//        String shortest = songs.get(0);
//
//        for (int i = 1; i < songs.size(); i++) {
//            if (songs.get(i).length() < shortest.length()) {
//                shortest = songs.get(i);
//            }
//        }
//
//        System.out.println(shortest);
        ////14
//        ArrayList<String> words = new ArrayList<>(Arrays.asList("Apple", "Banana", "Programmng", "Java"));
//        System.out.println("Список до изменения: " + words);
//        for (int i = 0; i < words.size(); i++) {
//            String currentWord = words.get(i);
//            String modifiedWord = currentWord.replaceAll("[aeiouAEIOU]", "*");
//            words.set(i, modifiedWord);
//        }
//        System.out.println("Список после: " + words);
        ////15
//        ArrayList<Integer> allNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
//        ArrayList<Integer> allEvenNumbers = new ArrayList<>();
//        ArrayList<Integer> allOddNumbers = new ArrayList<>();
//        for (Integer number : allNumbers){
//            if (number % 2 == 0 ){
//                allEvenNumbers.add(number);
//            }else {
//                allOddNumbers.add(number);
//            }
//        }
//        System.out.println("Весь ряд чисел: " + allNumbers);
//        System.out.println("Все нечетные числа: " + allOddNumbers);
//        System.out.println("Все четные числа: " + allEvenNumbers);
        ////16
//        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
//        System.out.println("До: " + days);
//        Collections.rotate(days, 2);
//        System.out.println("После (сдвиг на 2): " + days);
        ////17
//        ArrayList<String> studentNames = new ArrayList<>(Arrays.asList("Nurlan", "Esen", "Almambet", null, "Evgenye", null));
//        studentNames.removeAll(Collections.singleton(null));
//        System.out.println(studentNames);
        ////18
//        ArrayList<String> titlesofMovies = new ArrayList<>(Arrays.asList("Inception", "The Godfather", "Interstellar", "Pulp Fiction", "The Dark Knight"));
//        for (int i = 0 ; i < titlesofMovies.size(); i++){
//            for (int j = i+1 ; j < titlesofMovies.size(); j++){
//                if (titlesofMovies.get(i).length() < titlesofMovies.get(j).length()){
//                    String smallerWord = titlesofMovies.get(i);
//                    titlesofMovies.set(i, titlesofMovies.get(j));
//                    titlesofMovies.set(j, smallerWord);
//                }
//            }
//        }
//        String secondTitleByLength = titlesofMovies.size() >= 2 ? titlesofMovies.get(1) : titlesofMovies.get(0);
//        System.out.println(secondTitleByLength);
        ////19
//        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Kiwi", "Mango"));
//        ArrayList<Integer> lengths = new ArrayList<>();
//        for (String fruit : fruits) {
//            lengths.add(fruit.length());
//        }
//        System.out.println("Фрукты: " + fruits);
//        System.out.println("Длины: " + lengths);
        ////20
//        ArrayList<ArrayList<String>> company = new ArrayList<>();
//        ArrayList<String> itDepartment = new ArrayList<>(Arrays.asList("Nazbek", "Ularbek", "Timofey"));
//        ArrayList<String> hrDepartment = new ArrayList<>(Arrays.asList("Elena", "Andrey"));
//
//        company.add(itDepartment);
//        company.add(hrDepartment);
//
//        System.out.println("Весь департамент: " + company);
//
//        String employee = company.get(0).get(1);
//
//        System.out.println("Лучший работник первого отдела: " + employee);
//        System.out.println("Список всех отедлов с работниками:");
//        for (int i = 0; i < company.size(); i++) {
//            System.out.println("Отдел №" + (i + 1) + ": " + company.get(i));
//        }

    }
}
