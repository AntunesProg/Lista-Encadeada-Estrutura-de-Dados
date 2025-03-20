public class Main {
    public static void main(String[] args) {
        UniBHList<Integer> myList = new UniBHList<>();

        System.out.println("✅ Inserindo elementos no início da lista:");
        for (int i = 0; i < 5; i++) {
            myList.insertAtBeginning(i + 1);
            System.out.println(myList);
        }

        System.out.println("\n✅ Inserindo elementos no final da lista:");
        for (int i = 6; i <= 10; i++) {
            myList.insertAtEnd(i);
            System.out.println(myList);
        }

        System.out.println("\n✅ Tamanho da lista: " + myList.size());

        System.out.println("\n✅ Buscando elementos na lista:");
        try {
            System.out.println("Elemento 3 encontrado: " + myList.search(3));
            System.out.println("Elemento 11 encontrado: " + myList.search(11)); // Deve gerar erro
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n✅ Verificando se a lista contém elementos:");
        System.out.println("Contém o valor 5? " + myList.contains(5));
        System.out.println("Contém o valor 20? " + myList.contains(20));

        System.out.println("\n✅ Removendo primeiro elemento:");
        myList.removeAtBeginning();
        System.out.println(myList);

        System.out.println("\n✅ Removendo último elemento:");
        myList.removeAtEnd();
        System.out.println(myList);

        System.out.println("\n✅ Removendo elemento pelo valor:");
        try {
            myList.removeByValue(4);
            System.out.println("Lista após remover o valor 4: " + myList);
            myList.removeByValue(100); // Deve gerar erro
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n✅ Inserindo elemento após o índice 2:");
        try {
            myList.insertAfterIndex(2, 99);
            System.out.println(myList);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n✅ Removendo elemento na posição 3:");
        try {
            myList.removeAtIndex(2);
            System.out.println(myList);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n✅ Modificando um elemento:");
        try {
            myList.modifyElement(3, 50);
            System.out.println(myList);
            myList.modifyElement(100, 200); // Deve gerar erro
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n✅ Verificando se a lista está vazia:");
        System.out.println("Lista está vazia? " + myList.isEmpty());

        System.out.println("\n✅ Tamanho final da lista: " + myList.size());
    }
}
