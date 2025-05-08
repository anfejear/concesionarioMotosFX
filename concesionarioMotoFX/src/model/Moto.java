package model;

public class Moto {
    private int referencia;
    private String marca;
    private String modelo;
    private String color;
    private int cantidad;
  

    public Moto(int referencia, String marca, String modelo, String color, int cantidad) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidad = cantidad;

    }

    // Getters and setters
    public int getReferencia() { return referencia; }
    public void setReferencia(int referencia) { this.referencia = referencia; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

}

