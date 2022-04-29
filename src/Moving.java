public class Moving {
    public static void main(String[] args) {
        int nbcartonslocal1;
        int nbcartonslocal2;
        int nbcartonscamion;
        int capacitecamion;
        nbcartonslocal1=34;
        nbcartonslocal2=0;
        nbcartonscamion=0;
        capacitecamion=9;
        while ( nbcartonslocal1 > capacitecamion ) {
            while (nbcartonscamion<capacitecamion) {
                nbcartonscamion=nbcartonscamion+1;
                nbcartonslocal1=nbcartonslocal1-1;
            }
            nbcartonslocal2=nbcartonslocal2+nbcartonscamion;
            nbcartonscamion=0;
        }
        while (nbcartonslocal1>0) {
            nbcartonscamion=nbcartonscamion+1;
            nbcartonslocal1=nbcartonslocal1-1;
        }
        nbcartonslocal2=nbcartonslocal2 + nbcartonscamion;
        nbcartonscamion=0;

        System.out.println("nombre cartons nouveau local:" + nbcartonslocal2 + "," + "nombre cartons ancien local:" + nbcartonslocal1);
    }
}
