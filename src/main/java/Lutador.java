public class Lutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public Lutador(String no, String na, int id, float pe, float al, int vi, int de, int emp){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setPeso(pe);
        this.altura = al;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = emp;
    }


    public void apresentar(){
        System.out.println("-------------------------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println( this.getIdade() +" anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("-------------------------------------------");
    }

    public void status(){
        System.out.println("-------------------------------------------");
        System.out.println(this.getNome());
        System.out.println("Categoria " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("-------------------------------------------");
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public float getPeso(){
        return peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();

    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public String getCategoria(){
        return categoria;
    }

    private void setCategoria(){
        if (this.peso < 55){
            this.categoria = "Peso muito abaixo da categoria!";
        }
        else if (this.peso <= 70.3f){
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.9f){
            this.categoria = "Médio";
        }
        else if (this.peso <= 120.2f){
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Peso muito alto para a categoria!";
        }
    }

    public int getVitorias(){
        return vitorias;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates(){
        return empates;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }
}
