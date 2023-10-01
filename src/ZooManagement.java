//Instruction 3
import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "myZoo";

    public static void main(String[] args) {
        //Instruction 1
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages);


        System.out.println("-------------------------------------------------------------");
        //Instruction 3
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de cages souhaité:");
        int nbrCagesSaisie = sc.nextInt();
        ZooManagement zm1 = new ZooManagement();
        zm1.nbrCages = nbrCagesSaisie;
        //Etape optionelle
        zm1.zooName = "YaFa";
        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages + " cages ");*/
        Animal lion = new Animal();
        lion.name="Ousayed";
        lion.family="Felidae";
        lion.age =1;
        lion.isMammal=true;

        Zoo myZoo = new Zoo();
        myZoo.name="Yafa";
        myZoo.city="El mourouj 4";
        //myZoo.nbrCages=20;
        myZoo.animals= new Animal[25];

        Animal hippopotame = new Animal("Artiodactyles", "Taweret", 26, true);
        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));

        myZoo.isZooFull();
        myZoo.displayAnimals();
    }

}