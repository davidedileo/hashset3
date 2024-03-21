//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato


//Create la struttura, La popolate e poi implementate una ricerca nel set a partire da
//un valore di input, se lo trovate allora lo togliete dal set. Fate in modo di trovare tutti
// i valori con cui avete popolato il set in modo che rimanga vuoto. A quel punto stampate
//il set per vedere che sia effettivamente vuoto.

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);

        int valueInput = 3;
        if (intSet.contains(valueInput)){
            intSet.remove(valueInput);
            System.out.println("Il valore " + valueInput + " è stato rimosso");
        } else {
            System.out.println("Il valore " + valueInput + " non è presente");
        }
        System.out.println("I valori del set dopo la rimozione " + intSet);

        Iterator<Integer> iterator = intSet.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        /*for (Integer valoriDaRimuovere : intSet){
            System.out.println("Rimozione valori " + valoriDaRimuovere);
        }
        intSet.clear();*/

        System.out.println("L'hashset dopo il ciclo di rimozione " + intSet);

    }

}