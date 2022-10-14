public class Main {
    public static void main(String[] args) {

        cliente cliente1=new cliente();
        cliente1.edad=22;
        cliente1.nombre="Juan";
        cliente1.telefono=2323213;
        cliente1.setCredito(1000);

        System.out.println("Nombre: "+cliente1.nombre);
        System.out.println("Edad: "+cliente1.edad);
        System.out.println("Telefono: "+cliente1.telefono);
        System.out.println("Credito: "+cliente1.getCredito());

        trabajador trabajador1=new trabajador();
        trabajador1.edad=44;
        trabajador1.nombre="Antonio";
        trabajador1.telefono=43242423;
        trabajador1.setSalario(1200);

        System.out.println("Nombre: "+trabajador1.nombre);
        System.out.println("Edad: "+trabajador1.edad);
        System.out.println("Telefono: "+trabajador1.telefono);
        System.out.println("Salario: "+trabajador1.getSalario());

    }
}

class persona{
    int edad;
    String nombre;
    int telefono;


}

class cliente extends persona{
    private int credito;

    public int getCredito(){
        return this.credito;
    }

    public void setCredito(int credito){
        this.credito=credito;
    }
}

class trabajador extends persona{
    private int salario;

    public int getSalario(){
        return this.salario;
    }

    public void setSalario(int salario){
        this.salario=salario;
    }

}