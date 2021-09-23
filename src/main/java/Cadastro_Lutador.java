public class Cadastro_Lutador {
    public static void main(String[] args) {
        Lutador l[] = new Lutador [4];
        l[0] = new Lutador("Filipe", "Brasileiro", 25, 81.00f, 1.77f, 10, 0, 0);
        l[1] = new Lutador("Renato", "Americano",31,82f, 1.75f, 10,1,0 );
        l[2] = new Lutador("Marcos", "Africano", 28 ,70 , 1.80f,5, 5, 3);
        l[3] = new Lutador("Rodrigo", "Canadense", 35, 65f, 1.63f ,6,3,5);

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0], l[1]);
        UFC01.lutar();
        l[0].status();
        l[1].status();
    }
}
