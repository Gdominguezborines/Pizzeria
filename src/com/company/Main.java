package com.company;

public class Main {

    public static void main(String[] args) {
	//


        /*

        Pizzas casera =new Pizzas();

        casera.setMasa("fina");
        casera.setTipo(3);
        casera.setTipoSalsa("solo tomate");
        casera.setBacon(true);
        casera.setCebolla(true);
        casera.setChampinhones(true);
        casera.setMaiz(false);
        casera.setJamon(true);

        String mostrarPizza = casera.toString();

        System.out.println(mostrarPizza);



        Pizzas margarita =new Pizzas();

        margarita.setMasa("normal");
        margarita.setTipo(2);
        margarita.setTipoSalsa("solo tomate");
        margarita.setBacon(false);
        margarita.setCebolla(false);
        margarita.setChampinhones(false);
        margarita.setMaiz(false);
        margarita.setJamon(true);
        margarita.setMozzaarela(true);
        margarita.setCebolla(true);


        String mostrarPizza2 = margarita.toString();

        System.out.println(mostrarPizza2);




        Pizzas barbacoa =new Pizzas();

        barbacoa.setMasa("masa pan");
        barbacoa.setTipo(2);
        barbacoa.setTipoSalsa("barbacoa");
        barbacoa.setBacon(true);
        barbacoa.setCebolla(true);
        barbacoa.setChampinhones(false);
        barbacoa.setMaiz(false);
        barbacoa.setJamon(true);
        barbacoa.setMozzaarela(true);
        barbacoa.setCebolla(true);


        String mostrarPizza3 = margarita.toString();

        System.out.println(mostrarPizza3);

      */

        Pizzas base = new BuilderPizzas()
        .setChampinhones(true)
        .setMasa("fina")
        .setMozzaarela(true)
        .setChampinhones(true)
        .build();
        System.out.println("Las pizzas "+base);


    }
}
