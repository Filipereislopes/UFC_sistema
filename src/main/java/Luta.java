import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovado;


    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
                this.aprovado = true;
                this.desafiado = l1;
                this.desafiante = l2;
                System.out.println("Luta marcada!");
        }
        else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Um dos requisitos está invalido");
        }
    }

    public void lutar(){
        if (this.aprovado){
            System.out.println("-----DESAFIADO-----");
            this.desafiado.apresentar();
            System.out.println("-----DESAFIANTE-----");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("=======RESULTADO=======");
            switch (vencedor){
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println("Venceu a luta " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println("Venceu a luta " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=======================");

        }
        else{
            System.out.println("Não pode acontecer!");
        }

    }

    public Lutador getDesafiado(){
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public int getRound(){
        return round;
    }

    public void setRound(int round){
        this.round = round;
    }

    public boolean getAprovado(){
        return aprovado;
    }

    public void setAprovado(boolean aprovado){
        this.aprovado = aprovado;
    }
}
