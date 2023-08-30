import java.util.*;

public class EdadMamaJuan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese edad de Juan");
        int EdadJuan=input.nextInt();
        int EdadAlberto=(EdadJuan*2)/3;
        int EdadAna=(EdadJuan*4)/3;
        int EdadMama=EdadJuan+EdadAlberto+EdadAna;

        System.out.println("La edad de Juan es= "+EdadJuan);
        System.out.println("La edad de Alberto es= "+EdadAlberto);
        System.out.println("La edad de Ana es= "+EdadAna);
        System.out.println("La edad de la mama de los tres hijos es= "+EdadMama);
    }
}