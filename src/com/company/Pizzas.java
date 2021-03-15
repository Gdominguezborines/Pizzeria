package com.company;

public class Pizzas {

    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private String tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean pinha;
    private boolean champinhones;
    private boolean ExtraQueso;
    private boolean jamon;
    private boolean Bacon;
    private boolean maiz;
    private boolean Mozzaarela;
    private boolean pechuga;



    public Pizzas() {
    }

    public Pizzas(String masa, boolean relleno, int tipo, boolean salsa, String tipoSalsa, boolean cebolla, boolean sinGluten, boolean pinha, boolean champinhones, boolean extraQueso, boolean jamon, boolean bacon, boolean maiz, boolean mozzaarela, boolean pechuga) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.pinha = pinha;
        this.champinhones = champinhones;
        ExtraQueso = extraQueso;
        this.jamon = jamon;
        Bacon = bacon;
        this.maiz = maiz;
        Mozzaarela = mozzaarela;
        this.pechuga = pechuga;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isPinha() {
        return pinha;
    }

    public void setPinha(boolean pinha) {
        this.pinha = pinha;
    }

    public boolean isChampinhones() {
        return champinhones;
    }

    public void setChampinhones(boolean champinhones) {
        this.champinhones = champinhones;
    }

    public boolean isExtraQueso() {
        return ExtraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        ExtraQueso = extraQueso;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isBacon() {
        return Bacon;
    }

    public void setBacon(boolean bacon) {
        Bacon = bacon;
    }

    public boolean isMaiz() {
        return maiz;
    }

    public void setMaiz(boolean maiz) {
        this.maiz = maiz;
    }

    public boolean isMozzaarela() {
        return Mozzaarela;
    }

    public void setMozzaarela(boolean mozzaarela) {
        Mozzaarela = mozzaarela;
    }

    public boolean isPechuga() {
        return pechuga;
    }

    public void setPechuga(boolean pechuga) {
        this.pechuga = pechuga;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "masa='" + masa + '\'' +
                ", relleno=" + relleno +
                ", tipo=" + tipo +
                ", salsa=" + salsa +
                ", tipoSalsa='" + tipoSalsa + '\'' +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", pinha=" + pinha +
                ", champinhones=" + champinhones +
                ", ExtraQueso=" + ExtraQueso +
                ", jamon=" + jamon +
                ", Bacon=" + Bacon +
                ", maiz=" + maiz +
                ", Mozzaarela=" + Mozzaarela +
                ", pechuga=" + pechuga +
                '}';
    }
}

