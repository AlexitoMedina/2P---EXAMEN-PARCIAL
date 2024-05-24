class Animal {
    String nombre;
    int edad;
    double peso;

    Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    String moverse() {
        return nombre + " se está moviendo";
    }
}

class Mamifero extends Animal {
    boolean tienePelo;
    int periodoGestacion;
    String habitat;

    Mamifero(String nombre, int edad, double peso, boolean tienePelo, int periodoGestacion, String habitat) {
        super(nombre, edad, peso);
        this.tienePelo = tienePelo;
        this.periodoGestacion = periodoGestacion;
        this.habitat = habitat;
    }

    String amamantar() {
        return nombre + " está amamantando a sus crías";
    }
}

class Perro extends Mamifero {
    String raza;
    String colorPelaje;
    String nivelEnergia;

    Perro(String nombre, int edad, double peso, boolean tienePelo, int periodoGestacion, String habitat, String raza, String colorPelaje, String nivelEnergia) {
        super(nombre, edad, peso, tienePelo, periodoGestacion, habitat);
        this.raza = raza;
        this.colorPelaje = colorPelaje;
        this.nivelEnergia = nivelEnergia;
    }

    String ladrar() {
        return nombre + " está ladrando";
    }
}

public class herencia_multinivel {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Fido", 3, 20.0, true, 60, "Doméstico", "Labrador", "Marrón", "Alto");

        System.out.println("Nombre: " + miPerro.nombre);                  
        System.out.println("Edad: " + miPerro.edad);                      
        System.out.println("Peso: " + miPerro.peso + " kg");              
        System.out.println("Tiene pelo: " + miPerro.tienePelo);            
        System.out.println("Período de gestación: " + miPerro.periodoGestacion + " días"); 
        System.out.println("Hábitat: " + miPerro.habitat);              
        System.out.println("Raza: " + miPerro.raza);                       
        System.out.println("Color del pelaje: " + miPerro.colorPelaje);    
        System.out.println("Nivel de energía: " + miPerro.nivelEnergia);  
        System.out.println(miPerro.moverse());                             
        System.out.println(miPerro.amamantar());                           
        System.out.println(miPerro.ladrar());                             
    }
}
