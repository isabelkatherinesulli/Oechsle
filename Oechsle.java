import java.util.Scanner;

class OECHLE {
    private Scanner esponja = new Scanner(System.in);

    public void inicio_sesion() {
        String apodo, correo, correo_in, contraseña, contraseña_in;
        System.out.println("Bienvenido a OECHLE");
        System.out.println("-----CREAR CUENTA-----");
        System.out.println("Ingrese su nombre completo");
        apodo = esponja.nextLine();
        System.out.println("Ingrese su correo");
        correo = esponja.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña = esponja.nextLine();
        System.out.println("-----INICIAR SESION-----");
        System.out.println("Ingrese su correo");
        correo_in = esponja.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña_in = esponja.nextLine();
        if (correo_in.equals(correo) && contraseña_in.equals(contraseña)) {
            menu();
        } else {
            System.out.println("Credenciales incorrectas. Inténtalo nuevamente.");
        }
    }

    public void menu() {
        System.out.println("OECHLE");
        System.out.println(":::MENU:::");
        System.out.println("¿QUÉ ESTÁS BUSCANDO HOY?");
        System.out.println("1. MODA MUJER");
        System.out.println("2. MODA HOMBRE");
        System.out.println("3. MODA INFANTIL");
        System.out.println("4. CALZADOS");
        int opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("1.Moda mujer");
                this.op_moda_mujer();


                break;

            case 2:
                System.out.println("2.MODA HOMBRE .");
                this.op_moda_hombre();
                break;
            case 3:
                System.out.println("3.MODA INFANTIL .");
                this.op_moda_infantil();
                break;
            case 4:
                System.out.println("4 CALZADOS ");
                break;
            default:
                System.out.println("5 Opción no válida");
        }
    }
    public String op_moda_mujer() {
        esponja.nextLine();
        System.out.println("TENEMOS EN:");
        System.out.println("1. JEANS");
        System.out.println("2. MARCAS MUJER");
        System.out.println("3. NIGHT x HIPNOTIC");
        System.out.println("4. LENCERÍA Y PIJAMAS");
        String subOpcion = esponja.nextLine();
        switch (subOpcion) {
            case "1":
                System.out.println("JEANS.");
                String opc_jeans= esponja.nextLine();
                switch (opc_jeans){
                    case "1":
                        System.out.println("1.Skinny");
                        System.out.println("2. palazzo");
                        System.out.println("3.jogger");
                        System.out.println("4. flare");
                        System.out.println("5. wide leg");
                        System.out.println("6. cargo");
                        System.out.println("7. culotte");
                }
                break;
            case "2":
                System.out.println(" MARCAS MUJER.");
                break;
            case "3":
                System.out.println(" NIGHT x HIPNOTIC.");
                break;
            case "4":
                System.out.println(" LENCERÍA Y PIJAMAS.");
                break;
            default:
                System.out.println("Opción no válida");
        }



        return null;
    }
    public String op_moda_hombre() {
        esponja.nextLine();
        System.out.println("TENEMOS EN:");
        System.out.println("1. marcas");
        System.out.println("2. pijamas y ropa interior");
        System.out.println("3. accesorios hombre");
        System.out.println("4. basicos hombre");
        System.out.println("5. modo verano");
        System.out.println("6. moda peru pasion hombre");
        System.out.println("7. especial hypnotic");
        String subOpcion = esponja.nextLine();
        switch (subOpcion) {
            case "1":
                System.out.println("JEANS.");
                String opc_jeans= esponja.nextLine();
                switch (opc_jeans){
                    case "1":
                        System.out.println("1.hypnotic");
                        System.out.println("2. malabar");
                        System.out.println("3.AMC");
                        System.out.println("4. madison");
                        System.out.println("5. The royal parks");
                        System.out.println("6. aereal");
                        System.out.println("7. sfera ");
                        System.out.println("8. oneill");
                        System.out.println("9. kansas");
                        System.out.println("10. puma");
                        System.out.println("11. parada 111");
                        System.out.println("13. pierre cardín");
                        System.out.println("14. lois");
                        System.out.println("15. ritzi of italy");
                        System.out.println("16. palmers");
                        System.out.println("17. levis");
                        System.out.println("18. norton");
                        System.out.println("19. cat");
                        System.out.println("20. crepier");
                        System.out.println("21. rusty");
                        System.out.println("22. cottons jeans");
                        System.out.println("23. tabu");
                        System.out.println("24. bronco");
                        System.out.println("25. kayser");

                }
                break;
            case "2":
                System.out.println("pijama y ropa interior.");
                break;
            case "3":
                System.out.println(" accesorios hombre.");
                break;
            case "4":
                System.out.println(" basicos hombre.");
                break;
            case "5":
                System.out.println("modo verano");
                break;
            case "6":
                System.out.println("moda peru pasion hombre");
                break;
            case "7":
                System.out.println("especial hypnotic");
                break;
            default:
                System.out.println("Opción no válida");
        }



        return null;
    }
    public String op_moda_infantil() {
        esponja.nextLine();
        System.out.println("TENEMOS EN:");
        System.out.println("1. recien nacido");
        System.out.println("2. bebe niña 0-36 meses");
        System.out.println("3. bebe niño o-36 meses");
        System.out.println("4. niñas 4-12 años");
        System.out.println("5. niños 4-12 años");
        System.out.println("6. teen niñas 12-16 años");
        System.out.println("7. teen niños 12-16 años");
        System.out.println("8. ropa deportiva para niñas");
        System.out.println("9. ropa deportiva para niños");
        System.out.println("10. personajes favoritos");
        System.out.println("11. zapatos niños");
        String subOpcion = esponja.nextLine();
        switch (subOpcion) {
            case "1":
                System.out.println("JEANS.");
                String opc_jeans= esponja.nextLine();
                switch (opc_jeans){
                    case "1":
                        System.out.println("1.Skinny");
                        System.out.println("2. palazzo");
                        System.out.println("3.jogger");
                        System.out.println("4. flare");
                        System.out.println("5. wide leg");
                        System.out.println("6. cargo");
                        System.out.println("7. culotte");
                }
                break;
            case "2":
                System.out.println(" MARCAS MUJER.");
                break;
            case "3":
                System.out.println(" NIGHT x HIPNOTIC.");
                break;
            case "4":
                System.out.println(" LENCERÍA Y PIJAMAS.");
                break;
            default:
                System.out.println("Opción no válida");
        }



        return null;
    }

    public static void main(String[] args) {
        OECHLE frank = new OECHLE();
        frank.inicio_sesion();
    }
}