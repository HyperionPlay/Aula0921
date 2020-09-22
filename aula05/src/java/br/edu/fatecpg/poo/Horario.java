package br.edu.fatecpg.poo;
public class Horario {

    private int hora;
    private int minutos;
    private int segundo;

    public Horario() {}
    
    public Horario(int hora, int minutos, int segundo) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundo = segundo;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return the minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * @return the segundo
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * @param segundo the segundo to set
     */
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}
