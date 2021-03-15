package com.company;

public class BuilderPizzas {

    protected Pizzas _pizza;

    public Pizzas build(){
        return this._pizza;
    }

    public BuilderPizzas(){
        _pizza= new Pizzas();
    }

    public BuilderPizzas setMasa(String tipoMasa){
        _pizza.setMasa(tipoMasa);
        return this;
    }

    public BuilderPizzas setSalsa(boolean salsa){
        _pizza.setSalsa(salsa);
        return this;
    }
    public BuilderPizzas setMozzaarela(boolean mozzaarela){
        _pizza.setMozzaarela(mozzaarela);
        return this;
    }
    public BuilderPizzas setChampinhones(boolean champinhones){
        _pizza.setChampinhones(champinhones);
        return this;
    }


}
