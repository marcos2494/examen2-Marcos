/**
 * Temperatura Cálculo de temperatura media para la estación 1:
 */
public class Temperatura {

    public static void main(String[] args) {
        double[] temp1 = { 3, 5, 7, 8, 9, 4, 6, 2, 9, 5, 15, 17 };
        double[] temp2 = { 1, 6, 8, 8, 11, 4, 6, 2, 8, 5, 13, 17 };
        double[] temp3 = { 1, 7, 7, 7, 9, 4, 6, 2, 9, 5, 13, 18 };
        double[] temp4 = { 3, 5, 8, 8, 10, 4, 6, 2, 9, 7, 15, 17 };
        double[] temp5 = { 1, 6, 7, 9, 9, 4, 6, 3, 8, 5, 13, 19 };

        double suma1 = 0;
        for (int i = 0; i < temp1.length; i++) {
            suma1 = suma1 + temp1[i];
        }
        double media1 = (double) suma1 / temp1.length;
        System.out.println("Media de temperaturas estación 1: " + media1);
        double suma2 = 0;
        for (int i = 0; i < temp2.length; i++) {
            suma2 = suma2 + temp2[i];
        }
        double media2 = (double) suma2 / temp2.length;
        System.out.println("Media de temperaturas estación 2: " + media2);
        double suma3 = 0;
        for (int i = 0; i < temp3.length; i++) {
            suma3 = suma3 + temp3[i];
        }
        double media3 = (double) suma3 / temp3.length;
        double suma4 = 0;
        System.out.println("Media de temperaturas estación 3: " + media3);
        for (int i = 0; i < temp4.length; i++) {
            suma4 = suma4 + temp4[i];
        }
        double media4 = (double) suma4 / temp4.length;
        System.out.println("Media de temperaturas estación 4: " + media4);
        double suma5 = 0;
        for (int i = 0; i < temp5.length; i++) {
            suma5 = suma5 + temp5[i];
        }
        double media5 = (double) suma5 / temp5.length;
        System.out.println("Media de temperaturas estación 5: " + media5);

        double sumamedia;
        sumamedia = (double) (media1 + media2 + media3 + media4 + media5) / 5;
        System.out.println(" ");
        System.out.println("Media total: " + sumamedia);
        System.out.println(" ");

        int enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre = 0;

        for (int i = 0; i < 11; i++)
            ;
        enero = (3 + 1 + 1 + 3 + 1)/5;
        febrero = (5 + 6 + 7 + 5 + 6)/5;
        marzo = (7 + 8 + 7 + 8 + 7)/5;
        abril = (8 + 8 + 7 + 8 + 9)/5;
        mayo = (9 + 11 + 9 + 10 + 9)/5;
        junio = (4 + 4 + 4 + 4 + 4)/5;
        julio = (6 + 6 + 6 + 6 + 6)/5;
        agosto = (2 + 2 + 2 + 2 + 3)/5;
        septiembre = (9 + 8 + 9 + 9 + 8)/5;
        octubre = (5 + 5 + 5 + 7 + 5)/5;
        noviembre = (15 + 13 + 13 + 15 + 13)/5;
        diciembre = (17 + 17 + 18 + 17 + 19)/5;
        System.out.println("Media del enero: " + enero);
        System.out.println("Media del febrero: " + febrero);
        System.out.println("Media del marzo: " + marzo);
        System.out.println("Media del abril: " + abril);
        System.out.println("Media del mayo: " + mayo);
        System.out.println("Media del junio: " + junio);
        System.out.println("Media del julio: " + julio);
        System.out.println("Media del agosto: " + agosto);
        System.out.println("Media del septiembre: " + septiembre);
        System.out.println("Media del octubre: " + octubre);
        System.out.println("Media del noviembre: " + noviembre);
        System.out.println("Media del diciembre: " + diciembre);

    }
}
