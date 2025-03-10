public class Main {
    public static void main(String[] args) {
        UniBHList<Integer> myList = new UniBHList<>();

        for (int i = 0; i < 10; i++) {
            myList.insertAtBeginning(i + 1);
            System.out.println(myList);
        }

        System.out.println(myList);

        myList.removeAtBeginning();
        System.out.println(myList);

        myList.insertAtEnd(20);
        System.out.println(myList);

        myList.removeAtEnd();
        System.out.println(myList);

        System.out.println("Contém o valor 5? " + myList.contains(5));
        System.out.println("Contém o valor 20? " + myList.contains(20));

        myList.removeByValue(5);
        System.out.println("Lista após remover o valor 5: " + myList);
    }
}