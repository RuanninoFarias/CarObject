import java.util.Scanner;

class Carro {
    //Atributos ou propriedades da classe
    private String marca;
    private String modelo;
    private int ano;

    Carro () {
        this.marca = "Sem marca";
        this.modelo = "Não consta";
        this.ano = 0;
    }
    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    void setMarca (String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    void setModelo (String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    void setAno (int ano) {
        this.ano = ano;
    }

    void exibirCarro() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
