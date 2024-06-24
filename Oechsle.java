import java.util.Scanner;

public class OECHSLE{
    private Scanner esponja = new Scanner(System.in);
    private String apodo;
    public void inicio_sesion() {
        String correo, correo_in, contraseña, contraseña_in;
        System.out.println("Bienvenido a OECHLE");
        System.out.println("---INICIAR SECION---");
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
            this.menu();
        } else {
            System.out.println("Credenciales incorrectas. Inténtalo nuevamente.");

        }
    }

    public void menu() {
        System.out.println("---- OECHLE ----");
        System.out.println(":::MENU:::");
        System.out.println("¿QUÉ ESTÁS BUSCANDO HOY?");
        System.out.println("1. MODA MUJER");
        System.out.println("2. MODA HOMBRE");
        System.out.println("3. MODA INFANTIL");
        System.out.println("4. CALZADOS");
        int opcion = esponja.nextInt();
        switch (opcion) {
            case 1:
                this.op_moda_mujer();

                break;

            case 3:

                this.op_moda_infantil();
                break;
            case 4:
                this.op_moda_calzado();
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
                        System.out.println("1. skinny");;
                        System.out.println("2. palazzo");
                        System.out.println("3.jogger");


                        String modelo= esponja.nextLine();
                        switch (modelo){
                            case"1":
                                System.out.println("1.JEAN AMC MUJER PITILLO FLERCHI= $119.00");
                                System.out.println("2. JEGGING MADISON MUJER =$29.95");
                                System.out.println("3. ");
                                System.out.println("1. PAGO EFECTIVO/2. TAJETA");
                                int opcionpago = esponja.nextInt();
                                if (opcionpago==1){
                                    double precio = 119.00;
                                    System.out.println("INGRESE EL MONTO EN EFECTIVO");
                                    double montoefectivo = esponja.nextDouble();
                                    if (montoefectivo >= precio){
                                        Double cambio = montoefectivo - precio;
                                        System.out.println("tu cambio es: $" + cambio);
                                        System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                                    } else {
                                        System.out.println("MONTO INSUFICIENTE");
                                    }



                                }else if (opcionpago==2){
                                    System.out.println("ingrese el numero de la tarjeta");
                                    String numerotarjeta = esponja.next();
                                    System.out.println("ingrese la fecha de vencimiento MM/AA");
                                    String fechadevencimiento = esponja.next();
                                    System.out.println("INGRESE EL CODIGO CVV");
                                    int codigocvv = esponja.nextInt();
                                    //muestra la boleta


                                    System.out.println("-----BOLETA DE COMPRA-----");
                                    System.out.println("MODELO DE JEANS:JEAN AMC MUJER PITILLO FLERCHI");
                                    System.out.println("PRECIO: $119.00");
                                    System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                                    System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                                    System.out.println("pago realizado gracias por su compra");




                                }else {
                                    System.out.println("OPCION DEE PAGO NO VALIDA");
                                }

                                break;
                            case"2":
                                System.out.println("2. JEAN MALABAR CORREA= $129.00");
                                System.out.println(" 1. PAGO EFECTIVO/2. TAJETA");
                                int pcionpago = esponja.nextInt();

                                if (pcionpago==1) {
                                    double precio = 129.00;
                                    System.out.println("INGRESE EL MONTO EN EFECTIVO");
                                    double montoefectivo = esponja.nextDouble();
                                    if (montoefectivo >= precio){
                                        Double cambio = montoefectivo - precio;
                                        System.out.println("tu cambio es: $" + cambio);
                                        System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                                    } else {
                                        System.out.println("MONTO INSUFICIENTE");
                                    }



                                }else if (pcionpago==2){
                                    System.out.println("ingrese el numero de la tarjeta");
                                    String numerotarjeta = esponja.next();
                                    System.out.println("ingrese la fecha de vencimiento MM/AA");
                                    String fechadevencimiento = esponja.next();
                                    System.out.println("INGRESE EL CODIGO CVV");
                                    int codigocvv = esponja.nextInt();
                                    //muestra la boleta


                                    System.out.println("-----BOLETA DE COMPRA-----");
                                    System.out.println("MODELO DE JEANS:JEAN MALABAR CORREA");
                                    System.out.println("PRECIO: $129.00");
                                    System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                                    System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                                    System.out.println("pago realizado gracias por su compra");




                                }else {
                                    System.out.println("OPCION DEE PAGO NO VALIDA");
                                }

                                break;
                            case"3":
                                System.out.println("3. JOGGER PARA MUJER PARADA 111 ALLY= $111.93");
                                System.out.println("¿1. PAGO EFECTIVO/2. TAJETA");
                                int cionpago = esponja.nextInt();

                                if (cionpago==1) {
                                    double precio = 111.93;
                                    System.out.println("INGRESE EL MONTO EN EFECTIVO");
                                    double montoefectivo = esponja.nextDouble();
                                    if (montoefectivo >= precio){
                                        Double cambio = montoefectivo - precio;
                                        System.out.println("tu cambio es: $" + cambio);
                                        System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                                    } else {
                                        System.out.println("MONTO INSUFICIENTE");
                                    }



                                }else if (cionpago==2){
                                    System.out.println("ingrese el numero de la tarjeta");
                                    String numerotarjeta = esponja.next();
                                    System.out.println("ingrese la fecha de vencimiento MM/AA");
                                    String fechadevencimiento = esponja.next();
                                    System.out.println("INGRESE EL CODIGO CVV");
                                    int codigocvv = esponja.nextInt();
                                    //muestra la boleta


                                    System.out.println("-----BOLETA DE COMPRA-----");
                                    System.out.println("MODELO DE JEANS:JOGGER PARA MUJER PARADA 111 ALLY");
                                    System.out.println("PRECIO: $111.93");
                                    System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                                    System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                                    System.out.println("pago realizado gracias por su compra");




                                }else {
                                    System.out.println("OPCION DEE PAGO NO VALIDA");
                                }



                        }




                }
                break;
            case "2":
                System.out.println(" MARCAS MUJER.");
                System.out.println("-------------------");
                System.out.println("1. hypnotic");
                System.out.println("2. malabar");
                System.out.println("3. sfera");

                String modelo= esponja.nextLine();
                switch (modelo){
                    case "1":
                        System.out.println("CASACA HYPNOTIC MUJER GREEN PRINT A= $69.96");
                        System.out.println("¿1. PAGO EFECTIVO/2. TAJETA");
                        int opcionpago = esponja.nextInt();
                        if (opcionpago==1){
                            double precio = 69.96;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }



                        }else if (opcionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta


                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("MODELO DE MARCA:CASACA HYPNOTIC MUJER GREEN PRINT");
                            System.out.println("PRECIO: $69.96");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                            System.out.println("pago realizado gracias por su compra");




                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                    case "2":
                        System.out.println("CHOMPA MALABAR MANGA LARGA MEL A= $119.00");
                        System.out.println("¿1. PAGO EFECTIVO/2. TAJETA");
                        int pcionpago = esponja.nextInt();
                        if (pcionpago==1){
                            double precio = 69.96;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }



                        }else if (pcionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta


                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("MODELO DE MARCA:CHOMPA MALABAR MANGA LARGA MEL");
                            System.out.println("PRECIO:119.00$");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                            System.out.println("pago realizado gracias por su compra");




                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }


                    case "3":
                        System.out.println("ABRIGO SFERA SOLAPA CAMEL A= $229.00 ");
                        System.out.println("¿1. PAGO EFECTIVO/2. TAJETA");
                        int cionpago = esponja.nextInt();
                        if (cionpago==1){
                            double precio = 229.00;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }



                        }else if (cionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta


                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("MODELO DE MARCA:ABRIGO SFERA SOLAPA CAMEL");
                            System.out.println("PRECIO:229.00$");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                            System.out.println("pago realizado gracias por su compra");




                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }







                }

                break;
            case "3":
                System.out.println("NIGHT x HIPNOTIC");
                System.out.println("--------------------");
                System.out.println("3. chaleco hypnotic mujer cruce a=$129.00");

                System.out.println("¿1. PAGO EFECTIVO/2. TAJETA");
                int opcionpago = esponja.nextInt();
                if (opcionpago==1){
                    double precio = 129.00;
                    System.out.println("INGRESE EL MONTO EN EFECTIVO");
                    double montoefectivo = esponja.nextDouble();
                    if (montoefectivo >= precio){
                        Double cambio = montoefectivo - precio;
                        System.out.println("tu cambio es: $" + cambio);
                        System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                    } else {
                        System.out.println("MONTO INSUFICIENTE");
                    }



                }else if (opcionpago==2){
                    System.out.println("ingrese el numero de la tarjeta");
                    String numerotarjeta = esponja.next();
                    System.out.println("ingrese la fecha de vencimiento MM/AA");
                    String fechadevencimiento = esponja.next();
                    System.out.println("INGRESE EL CODIGO CVV");
                    int codigocvv = esponja.nextInt();
                    //muestra la boleta


                    System.out.println("-----BOLETA DE COMPRA-----");
                    System.out.println("MODELO DE MARCA:CHALECO HYPNOTIC MUJER CRUCE");
                    System.out.println("PRECIO: $129.00");
                    System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                    System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                    System.out.println("pago realizado gracias por su compra");




                }else {
                    System.out.println("OPCION DEE PAGO NO VALIDA");
                }

                break;
            case "4":
                System.out.println(" LENCERÍA Y PIJAMAS");
                System.out.println("-----------------------");
                System.out.println("1. pijamas");
                System.out.println("2. botas ");
                System.out.println("3. pantuflas");
                String odelo= esponja.nextLine();
                switch (odelo){
                    case "1":
                        System.out.println("PIJAMA ZAFIN MUJER MICRO CI POLAR A= $69.95");
                        System.out.println("¿1. PAGO EFECTIVO/2. TAJETA");
                        int pcionpago = esponja.nextInt();
                        if (pcionpago==1){
                            double precio = 69.95;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }



                        }else if (pcionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta


                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("MODELO DE MARCA: PIJAMA ZAFIN MUJER MICRO CI POLAR");
                            System.out.println("PRECIO: $69.95");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);







                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                        break;
                    case "2":
                        System.out.println("BATA ZAFIN MUJER ESPIGA A= $89.95");
                        System.out.println("¿1. PAGO EFECTIVO/2. TAJETA");
                        int cionpago = esponja.nextInt();
                        if (cionpago==1){
                            double precio =89.95;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }



                        }else if (cionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta


                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("BATA ZAFIN MUJER ESPIGA");
                            System.out.println("PRECIO: $89.95");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                            System.out.println("pago realizado gracias por su compra");




                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                        break;
                    case "3":
                        System.out.println("PANTUFLA ZAFIN BASICA V2 A= $29.95");
                        System.out.println("¿1. PAGO EFECTIVO/2. TAJETA");
                        int onpago = esponja.nextInt();
                        if (onpago==1){
                            double precio = 29.95;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }



                        }else if (onpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta


                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("MODELO DE MARCA:PANTUFLA ZAFIN BASICA V2");
                            System.out.println("PRECIO: $29.95");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                            System.out.println("pago realizado gracias por su compra");




                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }

                }

                break;
            default:
                System.out.println("opcion no valida");
        }
        return null;
    }
    public String op_moda_hombre() {

        double totalCompra = 0.0;

        System.out.println("Bienvenido a la tienda de moda para hombres.");
        System.out.println("Opciones disponibles:");
        System.out.println("1. Marcas");
        System.out.println("2. Pijamas y ropa interior");
        System.out.println("3. Accesorios hombre");

        int opcionPrincipal = esponja.nextInt();

        switch (opcionPrincipal) {
            case 1:
                System.out.println("Marcas disponibles:");
                System.out.println("1. Hypnotic");
                System.out.println("2. Madison");
                System.out.println("3. Pioner");
                int opcionMarca = esponja.nextInt();

                switch (opcionMarca) {
                    case 1:
                        System.out.println("Opciones de Hypnotic:");
                        System.out.println("1. Casaca Hypnotic Lingt hombre azul (200 soles)");
                        System.out.println("2. Casaca Hypnotic Revers negro (120 soles)");
                        int opcionHypnotic = esponja.nextInt();
                        if (opcionHypnotic == 1) {
                            totalCompra += 200;
                        } else if (opcionHypnotic == 2) {
                            totalCompra += 120;
                        } else {
                            System.out.println("Opción no válida.");
                        }
                        break;
                    case 2:
                        System.out.println("Opciones de Madison:");
                        System.out.println("1. Casaca Madison New Bomber azul (85 soles)");
                        System.out.println("2. Casaca Madison Caspa Bomber negro (250 soles)");
                        int opcionMadison = esponja.nextInt();
                        if (opcionMadison == 1) {
                            totalCompra += 85;
                        } else if (opcionMadison == 2) {
                            totalCompra += 250;
                        } else {
                            System.out.println("Opción no válida.");
                        }
                        break;
                    case 3:
                        System.out.println("Opciones de Pioner:");
                        System.out.println("1. Gorro Traffic Hat hombre verde (50 soles)");
                        int opcionPioner = esponja.nextInt();
                        if (opcionPioner == 1) {
                            totalCompra += 50;
                        } else {
                            System.out.println("Opción no válida.");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                break;
            case 2:
                System.out.println("Opciones de pijamas y ropa interior:");
                System.out.println("1. Arma tu pijama");
                System.out.println("2. Batas");
                System.out.println("3. Boxer");
                int opcionPijamas = esponja.nextInt();

                switch (opcionPijamas) {
                    case 1:
                        System.out.println("Opciones para armar tu pijama:");
                        System.out.println("1. Polo pijama Hypnotic Manga larga (69 soles)");
                        int opcionPoloPijama = esponja.nextInt();
                        if (opcionPoloPijama == 1) {
                            totalCompra += 69;
                        } else {
                            System.out.println("Opción no válida.");
                        }
                        break;
                    case 2:
                        System.out.println("Opciones de batas:");
                        System.out.println("1. Bata Madison Flannel hombre (85 soles)");
                        System.out.println("2. Bata Madison con pantufla (68 soles)");
                        int opcionBatas = esponja.nextInt();
                        if (opcionBatas == 1) {
                            totalCompra += 85;
                        } else if (opcionBatas == 2) {
                            totalCompra += 68;
                        } else {
                            System.out.println("Opción no válida.");
                        }
                        break;
                    case 3:
                        System.out.println("Opciones de boxer:");
                        System.out.println("1. Pack boxer y medias hombre (85 soles)");
                        System.out.println("2. Pack boxer y medias Hypnotic hombre (60 soles)");
                        int opcionBoxer = esponja.nextInt();
                        if (opcionBoxer == 1) {
                            totalCompra += 85;
                        } else if (opcionBoxer == 2) {
                            totalCompra += 60;
                        } else {
                            System.out.println("Opción no válida.");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
                break;
            default:
                System.out.println("opcion no valida");
        }
        return null;
    }
    public String op_moda_infantil() {
        esponja.nextLine();
        System.out.println("TENEMOS EN:");
        System.out.println("1. recien nacido");
        System.out.println("2. personajes favoritos");
        System.out.println("3. zapatos niños");
        String subOpcion = esponja.nextLine();
        switch (subOpcion) {
            case "1":
                System.out.println("RECIEN NACIDO");
                String opc_r = esponja.nextLine();
                switch (opc_r) {
                    case "1":
                        double unidades_rn, total_rn;
                        String op_LG;
                        System.out.println("1 PIJAMA 2 PIEZAS PARA RECEIN NACIDO BABY CIRCUS PANTALON");
                        System.out.println("2 PIJAMA PARA RECIEN NACIDO ENTERIZO BABY CIRCUS MAMÁ ");
                        System.out.println("3 CONJUNTO PARA RECEIN NACIDO BABY CIRCUS CAPUCHA JACQUARD ");
                        System.out.println("4 CONJUNTO PARA RECIEN NACIDO BABY CIRCUS JUMPER VESTIDO ");
                        System.out.println("5 CONJUNTO PARA RECIEN NACIDO BABY CIRCUS OREJITAS ");
                        System.out.println("6 PANTALON INTERINO PACK X3 BABY CIRCUS PARA RECIEN NACIDO ");
                        System.out.println("7 PACK ENTERIZO CON GORRITO PARA RECIEN NACIDO BABY CIRCUS QUILT CIERRE ");
                        System.out.println("8 POLO PACK X3 PARA RECIEN NACIDO BABY CIRCUS MANGA LARGA ");
                        System.out.println("9 BABEROS PACK X3 RECIEN NACIDO BABY CIRCUS ");
                        System.out.println("10 MANTA PARA RECIEN NACIDO BABY CIRCUS  ");
                        opc_r = esponja.nextLine();
                        switch (opc_r) {
                            case "1":
                                System.out.println("PIJAMA 2 PIEZAS PARA RECEIN NACIDO BABY CIRCUS PANTALON");
                                System.out.println("Con un precio de: S/ 34.95");
                                System.out.println("¿Cuantos desea compra?");
                                unidades_rn = esponja.nextDouble();
                                total_rn = unidades_rn * 34.95;
                                System.out.println("El total a pagar es: " + total_rn);
                                break;
                            case "2":
                                System.out.println(" PIJAMA PARA RECIEN NACIDO ENTERIZO BABY CIRCUS MAMÁ ");
                                System.out.println("Con un precio de: S/ 34.95");
                                System.out.println("¿Cuantos desea compra?");
                                unidades_rn = esponja.nextDouble();
                                total_rn = unidades_rn * 34.95;
                                System.out.println("El total a pagar es: " + total_rn);
                                break;
                            case "3":
                                System.out.println("CONJUNTO PARA RECEIN NACIDO BABY CIRCUS CAPUCHA JACQUARD )");
                                System.out.println("Con un precio de: S/ 59.95");
                                System.out.println("¿Cuantos desea compra?");
                                unidades_rn = esponja.nextDouble();
                                total_rn = unidades_rn * 59.95;
                                System.out.println("El total a pagar es: " + total_rn);
                                break;
                            case "4":
                                System.out.println("CONJUNTO PARA RECIEN NACIDO BABY CIRCUS JUMPER VESTIDO ");
                                System.out.println("Con un precio de: S/ 59.95");
                                System.out.println("¿Cuantos desea compra?");
                                unidades_rn = esponja.nextDouble();
                                total_rn = unidades_rn * 59.95;
                                System.out.println("El total a pagar es: " + total_rn);
                                break;
                            case "5":
                                System.out.println("CONJUNTO PARA RECIEN NACIDO BABY CIRCUS OREJITAS ");
                                System.out.println("Con un precio de: S/ 69.95");
                                System.out.println("¿Cuantos desea compra?");
                                unidades_rn = esponja.nextDouble();
                                total_rn = unidades_rn * 69.95;
                                System.out.println("El total a pagar es: " + total_rn);
                                break;
                            case "6":
                                System.out.println("PANTALON INTERINO PACK X3 BABY CIRCUS PARA RECIEN NACIDO ");
                                System.out.println("Con un precio de: S/ 34.95");
                                System.out.println("¿Cuantos desea compra?");
                                unidades_rn = esponja.nextDouble();
                                total_rn = unidades_rn * 34.95;
                                System.out.println("El total a pagar es: " + total_rn);
                                break;
                            case "7":
                                System.out.println("PACK ENTERIZO CON GORRITO PARA RECIEN NACIDO BABY CIRCUS QUILT CIERRE ");
                                System.out.println("Con un precio de: S/ 49.95");
                                System.out.println("¿Cuantos desea compra?");
                                unidades_rn = esponja.nextDouble();
                                total_rn = unidades_rn * 49.95;
                                System.out.println("El total a pagar es: " + total_rn);
                                break;
                            case "8":
                                System.out.println("POLO PACK X3 PARA RECIEN NACIDO BABY CIRCUS MANGA LARGA ");
                                System.out.println("Con un precio de: S/ 34.95");
                                System.out.println("¿Cuantos desea compra?");
                                unidades_rn = esponja.nextDouble();
                                total_rn = unidades_rn * 34.95;
                                System.out.println("El total a pagar es: " + total_rn);
                                break;
                            case "9":
                                System.out.println("BABEROS PACK X3 RECIEN NACIDO BABY CIRCUS ");
                                System.out.println("Con un precio de: S/ 39.95");
                                System.out.println("¿Cuantos desea compra?");
                                unidades_rn = esponja.nextDouble();
                                total_rn = unidades_rn * 39.95;
                                System.out.println("El total a pagar es: " + total_rn);
                                break;
                            case "10":
                                System.out.println("MANTA PARA RECIEN NACIDO BABY CIRCUS ");
                                System.out.println("Con un precio de: S/ 39.95");
                                System.out.println("¿Cuantos desea compra?");
                                unidades_rn = esponja.nextDouble();
                                total_rn = unidades_rn * 39.95;
                                System.out.println("El total a pagar es: " + total_rn);
                                break;
                        }
                }
                break;
            case "2":
                System.out.println("personajes favoritos");

                String pf = esponja.nextLine();
                switch (pf) {
                    case "1":
                        double unidades_pf, total_pf;
                        String op_LG;
                        System.out.println("1.1 BARBIE");
                        System.out.println("1.2 SPIDERMAN");
                        System.out.println("1.3 KUNG FU PANDA");
                        pf = esponja.nextLine();
                        switch (pf) {
                            case "1.1":
                                double unidades_bar, total_bar;
                                String op_pf;
                                System.out.println("en ropas barbie tenemos:");
                                System.out.println("1 POLO DE NIÑA BRABIE COLOR BLANCO ");
                                System.out.println("2 POLO MANGA LARGA PARA NIÑA BARBIE ");
                                System.out.println("3 VESTIDO PARA NIÑA COLOR ARCOIRIS ");
                                System.out.println("4 JUMPER PARA NIÑA BARBIE ");
                                System.out.println("5 PANTALON PARA NIÑA BARBIE COLOR CELESTE ");
                                System.out.println("6 PATALON NIÑA BARBIE COLOR AZUL OSCURO  ");
                                System.out.println("7 BLUSA TEEM NIÑA COLOR ROSADO ");
                                System.out.println("8 BLUSA TEEM NIÑA COLOR NEGRO ");
                                System.out.println("9 POLO MANGA LARGA PARA NIÑA BARBIE PLAY DAY");
                                System.out.println("10 POLO MANGA LARGA PARA NIÑA BARBIE CON RAYAS ");
                                op_pf = esponja.nextLine();
                                switch (op_pf) {
                                    case "1":
                                        System.out.println("POLO DE NIÑA BRABIE COLOR BLANCO ");
                                        System.out.println("Con un precio de: S/ 39.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_pf = esponja.nextDouble();
                                        total_pf = unidades_pf * 39.95;
                                        System.out.println("El total a pagar es: " + total_pf);
                                        break;
                                    case "2":
                                        System.out.println(" POLO MANGA LARGA PARA NIÑA BARBIE  ");
                                        System.out.println("Con un precio de: S/ 19.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_pf = esponja.nextDouble();
                                        total_pf = unidades_pf * 19.95;
                                        System.out.println("El total a pagar es: " + total_pf);
                                        break;
                                    case "3":
                                        System.out.println("VESTIDO PARA NIÑA COLOR ARCOIRIS  )");
                                        System.out.println("Con un precio de: S/ 109.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_pf = esponja.nextDouble();
                                        total_pf = unidades_pf * 109.95;
                                        System.out.println("El total a pagar es: " + total_pf);
                                        break;
                                    case "4":
                                        System.out.println("JUMPER PARA NIÑA BARBIE  ");
                                        System.out.println("Con un precio de: S/139.95 ");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_pf = esponja.nextDouble();
                                        total_pf = unidades_pf * 139.95;
                                        System.out.println("El total a pagar es: " + total_pf);
                                        break;
                                    case "5":
                                        System.out.println("PANTALON PARA NIÑA BARBIE COLOR CELESTE  ");
                                        System.out.println("Con un precio de: S/ 139.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_pf = esponja.nextDouble();
                                        total_pf = unidades_pf * 139.95;
                                        System.out.println("El total a pagar es: " + total_pf);
                                        break;
                                    case "6":
                                        System.out.println("PATALON NIÑA BARBIE COLOR AZUL OSCURO  ");
                                        System.out.println("Con un precio de: S/ 159.90");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_pf = esponja.nextDouble();
                                        total_pf = unidades_pf * 159.90;
                                        System.out.println("El total a pagar es: " + total_pf);
                                        break;
                                    case "7":
                                        System.out.println("BLUSA TEEM NIÑA COLOR ROSADO  ");
                                        System.out.println("Con un precio de: S/ 59.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_pf = esponja.nextDouble();
                                        total_pf = unidades_pf * 59.95;
                                        System.out.println("El total a pagar es: " + total_pf);
                                        break;
                                    case "8":
                                        System.out.println("BLUSA TEEM NIÑA COLOR NEGRO ");
                                        System.out.println("Con un precio de: S/ 24.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_pf = esponja.nextDouble();
                                        total_pf = unidades_pf * 24.95;
                                        System.out.println("El total a pagar es: " + total_pf);
                                        break;
                                    case "9":
                                        System.out.println("POLO MANGA LARGA PARA NIÑA BARBIE PLAY DAY ");
                                        System.out.println("Con un precio de: S/ 19.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_pf = esponja.nextDouble();
                                        total_pf = unidades_pf * 19.95;
                                        System.out.println("El total a pagar es: " + total_pf);
                                        break;
                                    case "10":
                                        System.out.println("POLO MANGA LARGA PARA NIÑA BARBIE CON RAYAS ");
                                        System.out.println("Con un precio de: S/ 24.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_pf = esponja.nextDouble();
                                        total_pf = unidades_pf * 24.95;
                                        System.out.println("El total a pagar es: " + total_pf);
                                        break;
                                }

                            case "1.2":

                                double unidades_Sp, total_Sp;
                                String op_sp;
                                System.out.println("en ropas SPIDERMAN le ofrecemos");
                                System.out.println("1 POLO PARA NIÑO SPIDERMAN MSM -4040-A NEGRO ");
                                System.out.println("2 POLO PARA NIÑO SPIDERMAN BASICO ROJO ");
                                System.out.println("3 POLO PARA NIÑO SPIDERMAN ACERO ");
                                System.out.println("4 POLO PARA NIÑO SPIDERMAN BASICO MANGA CORTA ROJO ");
                                System.out.println("5 POLO PARA NIÑO SPIDERMAN FULL PRINT ");
                                System.out.println("6 PATALON BASICO NIÑO SPIDERMAN GRIS ");
                                System.out.println("7 PANTALON NIÑO SPIDERMAN AZUL ");
                                System.out.println("8  POLO PARA NIÑO SPIDERMAN COLLARETE ");
                                System.out.println("9 POLO NIÑO MANGA LARGA BASICO NEGRO ");
                                System.out.println("10 POLO NIÑO SPIDERMAN BASICO MANGA LARGA ACERO ");
                                op_sp = esponja.nextLine();
                                switch (op_sp) {
                                    case "1":
                                        System.out.println("POLO PARA NIÑO SPIDERMAN MSM -4040-A NEGRO");
                                        System.out.println("Con un precio de: S/ 39.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_Sp = esponja.nextDouble();
                                        total_Sp = unidades_Sp * 39.95;
                                        System.out.println("El total a pagar es: " + total_Sp);
                                        break;
                                    case "2":
                                        System.out.println(" POLO PARA NIÑO SPIDERMAN BASICO ROJO  ");
                                        System.out.println("Con un precio de: S/ 39.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_Sp = esponja.nextDouble();
                                        total_Sp = unidades_Sp * 39.95;
                                        System.out.println("El total a pagar es: " + total_Sp);
                                        break;
                                    case "3":
                                        System.out.println("POLO PARA NIÑO SPIDERMAN ACERO ");
                                        System.out.println("Con un precio de: S/ 24.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_Sp = esponja.nextDouble();
                                        total_Sp = unidades_Sp * 24.95;
                                        System.out.println("El total a pagar es: " + total_Sp);
                                        break;
                                    case "4":
                                        System.out.println("POLO PARA NIÑO SPIDERMAN BASICO MANGA CORTA ROJO ");
                                        System.out.println("Con un precio de: S/ 19.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_Sp = esponja.nextDouble();
                                        total_Sp = unidades_Sp * 19.95;
                                        System.out.println("El total a pagar es: " + total_Sp);
                                        break;
                                    case "5":
                                        System.out.println("POLO PARA NIÑO SPIDERMAN FULL PRINT ");
                                        System.out.println("Con un precio de: S/ 139.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_Sp = esponja.nextDouble();
                                        total_Sp = unidades_Sp * 139.95;
                                        System.out.println("El total a pagar es: " + total_Sp);
                                        break;
                                    case "6":
                                        System.out.println("PATALON BASICO NIÑO SPIDERMAN GRIS ");
                                        System.out.println("Con un precio de: S/ 24.90");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_Sp = esponja.nextDouble();
                                        total_Sp = unidades_Sp * 24.90;
                                        System.out.println("El total a pagar es: " + total_Sp);
                                        break;
                                    case "7":
                                        System.out.println("PANTALON NIÑO SPIDERMAN AZUL ");
                                        System.out.println("Con un precio de: S/ 59.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_Sp = esponja.nextDouble();
                                        total_Sp = unidades_Sp * 59.95;
                                        System.out.println("El total a pagar es: " + total_Sp);
                                        break;
                                    case "8":
                                        System.out.println("POLO PARA NIÑO SPIDERMAN COLLARETE ");
                                        System.out.println("Con un precio de: S/ 24.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_Sp = esponja.nextDouble();
                                        total_Sp = unidades_Sp * 24.95;
                                        System.out.println("El total a pagar es: " + total_Sp);
                                        break;
                                    case "9":
                                        System.out.println("POLO NIÑO MANGA LARGA BASICO NEGRO ");
                                        System.out.println("Con un precio de: S/ 29.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_Sp = esponja.nextDouble();
                                        total_Sp = unidades_Sp * 29.95;
                                        System.out.println("El total a pagar es: " + total_Sp);
                                        break;
                                    case "10":
                                        System.out.println("POLO NIÑO SPIDERMAN BASICO MANGA LARGA ACERO ");
                                        System.out.println("Con un precio de: S/ 19.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_Sp = esponja.nextDouble();
                                        total_Sp = unidades_Sp * 19.95;
                                        System.out.println("El total a pagar es: " + total_Sp);
                                        break;
                                }
                            case "1.3":
                                double unidades_ku, total_ku;
                                String op_ku;
                                System.out.println("en ropas KUNG FU PANDA tenemos:");
                                System.out.println("1 POLO DE NIÑA KUNG FU PANDA MANGA COLOR BLANCO ");
                                System.out.println("2 POLO  PARA NIÑA KUNG FU PANDA MANGA LARGA ");
                                System.out.println("3 POLO PARA NIÑO KUNG FU PANDA MANGA CORTA ROJO ");
                                System.out.println("4 POLO PARA NIÑO KUNG FU PANDA MANGA CORTA BEIGE");
                                System.out.println("5 POLERA PARA NIÑO KUNG FU PANDA AOP ");
                                System.out.println("6 POLERA PARA NIÑO KUNG FU PANDA PRINT CENTRAL ");
                                op_ku = esponja.nextLine();
                                switch (op_ku) {
                                    case "1":
                                        System.out.println(" POLO DE NIÑA KUNG FU PANDA MANGA COLOR BLANCO ");
                                        System.out.println("Con un precio de: S/ 19.96");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_ku = esponja.nextDouble();
                                        total_ku = unidades_ku * 19.96;
                                        System.out.println("El total a pagar es: " + total_ku);
                                        break;
                                    case "2":
                                        System.out.println(" POLO  PARA NIÑA  KUNG FU PANDA MANGA LARGA ");
                                        System.out.println("Con un precio de: S/ 19.96");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_ku = esponja.nextDouble();
                                        total_ku = unidades_ku * 19.96;
                                        System.out.println("El total a pagar es: " + total_ku);
                                        break;
                                    case "3":
                                        System.out.println("POLO PARA NIÑO KUNG FU PANDA MANGA CORTA ROJO ");
                                        System.out.println("Con un precio de: S/ 19.96");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_ku = esponja.nextDouble();
                                        total_ku = unidades_ku * 19.96;
                                        System.out.println("El total a pagar es: " + total_ku);
                                        break;
                                    case "4":
                                        System.out.println("POLO PARA NIÑO KUNG FU PANDA MANGA CORTA BEIGE");
                                        System.out.println("Con un precio de: S/19.96 ");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_ku = esponja.nextDouble();
                                        total_ku = unidades_ku * 19.96;
                                        System.out.println("El total a pagar es: " + total_ku);
                                        break;
                                    case "5":
                                        System.out.println("POLERA PARA NIÑO KUNG FU PANDA AOP ");
                                        System.out.println("Con un precio de: S/ 31.96");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_ku = esponja.nextDouble();
                                        total_ku = unidades_ku * 31.96;
                                        System.out.println("El total a pagar es: " + total_ku);
                                        break;
                                    case "6":
                                        System.out.println("POLERA PARA NIÑO KUNG FU PANDA PRINT CENTRAL ");
                                        System.out.println("Con un precio de: S/ 31.96");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_ku = esponja.nextDouble();
                                        total_ku = unidades_ku * 31.96;
                                        System.out.println("El total a pagar es: " + total_ku);
                                        break;
                                }
                        }
                }
                break;
            case "3":
                System.out.println("ZAPATOS");

                String zapa = esponja.nextLine();
                switch (zapa) {
                    case "1":
                        double unidades_zapa, total_zapa;
                        String op_LG;
                        System.out.println("1 SANDALIAS DE PLAYA");
                        System.out.println("2 CALZADO ESCOLAR");
                        System.out.println("3 ZAPATILLAS DEPORTIVAS NIÑOS");
                        zapa = esponja.nextLine();
                        switch (zapa) {
                            case "1":
                                double unidades_sa, total_sa;
                                String op_sa;
                                System.out.println("en SANDALIAS DE PLAYA TENEMOS:");
                                System.out.println("1 SANDALIAS PARA NIÑA PAW PATROL FUCSIA SINTETICO ");
                                System.out.println("2 SANDALIAS DE PLAYA HAVAIANAS PARA NIÑA 4140577 AZUL ");
                                System.out.println("3 SANDALIAS DE PLAYA CIRCUS PARA NIÑO AZUL ");
                                System.out.println("4 SANDALIAS DE PLAYA CIRCUS PARA NIÑO VERDE ");
                                System.out.println("5 SLOP DISEÑO TACO ARCOIRIS EUREKA NIÑA CNA10BV24 MULTICOLOR TALLA 31  ");
                                System.out.println("6 MUNEQUERA SUPPORT STRAP NEGRA ");
                                System.out.println("7 SANDALIAS DE OKAYA DINEY STORE PRINCESAS ");
                                System.out.println("8 SANDALIAS DE MINNIE MOUSE 2-MN828 ROSADO ");
                                System.out.println("9 SANDALIAS DE PLAYA HAVAIANAS PARA NIÑA 4123328 VERDE ");
                                System.out.println("10 SANDALIAS DE PLAYA HAVAINAS PARA NILO 4123463 ROJO3 ");
                                op_sa = esponja.nextLine();
                                switch (op_sa) {
                                    case "1":
                                        System.out.println(" SANDALIAS PARA NIÑA PAW PATROL FUCSIA SINTETICO ");
                                        System.out.println("Con un precio de: S/ 29.94");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_sa = esponja.nextDouble();
                                        total_sa = unidades_sa * 29.94;
                                        System.out.println("El total a pagar es: " + total_sa);
                                        break;
                                    case "2":
                                        System.out.println(" SANDALIAS DE PLAYA HAVAIANAS PARA NIÑA 4140577 AZUL ");
                                        System.out.println("Con un precio de: S/ 39.90");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_sa = esponja.nextDouble();
                                        total_sa = unidades_sa * 39.90;
                                        System.out.println("El total a pagar es: " + total_sa);
                                        break;
                                    case "3":
                                        System.out.println("SANDALIAS DE PLAYA CIRCUS PARA NIÑO AZUL");
                                        System.out.println("Con un precio de: S/ 19.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_sa = esponja.nextDouble();
                                        total_sa = unidades_sa * 19.95;
                                        System.out.println("El total a pagar es: " + total_sa);
                                        break;
                                    case "4":
                                        System.out.println("SANDALIAS DE PLAYA CIRCUS PARA NIÑO VERDE  ");
                                        System.out.println("Con un precio de: S/19.95 ");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_sa = esponja.nextDouble();
                                        total_sa = unidades_sa * 19.95;
                                        System.out.println("El total a pagar es: " + total_sa);
                                        break;
                                    case "5":
                                        System.out.println("SLOP DISEÑO TACO ARCOIRIS EUREKA NIÑA CNA10BV24 MULTICOLOR TALLA 31 ");
                                        System.out.println("Con un precio de: S/ 6.90");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_sa = esponja.nextDouble();
                                        total_sa = unidades_sa * 6.90;
                                        System.out.println("El total a pagar es: " + total_sa);
                                        break;
                                    case "6":
                                        System.out.println("MUNEQUERA SUPPORT STRAP NEGRA ");
                                        System.out.println("Con un precio de: S/ 100.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_sa = esponja.nextDouble();
                                        total_sa = unidades_sa * 100.00;
                                        System.out.println("El total a pagar es: " + total_sa);
                                        break;
                                    case "7":
                                        System.out.println("SANDALIAS DE OKAYA DINEY STORE PRINCESAS ");
                                        System.out.println("Con un precio de: S/ 69.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_sa = esponja.nextDouble();
                                        total_sa =unidades_sa * 69.00;
                                        System.out.println("El total a pagar es: " + total_sa);
                                        break;
                                    case "8":
                                        System.out.println("SANDALIAS DE MINNIE MOUSE 2-MN828 ROSADO ");
                                        System.out.println("Con un precio de: S/ 49.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_sa = esponja.nextDouble();
                                        total_sa = unidades_sa * 49.00;
                                        System.out.println("El total a pagar es: " + total_sa);
                                        break;
                                    case "9":
                                        System.out.println("SANDALIAS DE PLAYA HAVAIANAS PARA NIÑA 4123328 VERDE ");
                                        System.out.println("Con un precio de: S/ 69.90");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_sa = esponja.nextDouble();
                                        total_sa = unidades_sa * 69.90;
                                        System.out.println("El total a pagar es: " + total_sa);
                                        break;
                                    case "10":
                                        System.out.println("SANDALIAS DE PLAYA HAVAINAS PARA NILO 4123463 ROJO3  ");
                                        System.out.println("Con un precio de: S/ 59.90");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_sa = esponja.nextDouble();
                                        total_sa = unidades_sa * 59.90;
                                        System.out.println("El total a pagar es: " + total_sa);
                                        break;
                                }

                            case "2":

                                double unidades_cal, total_cal;
                                String op_cal;
                                System.out.println("en CALZADO ESCOLAR TENEMOS");
                                System.out.println("1 ZAPATO ESCOLAR CUERO PAR&SS.MV24-2068 NEGRO ");
                                System.out.println("2 ZAPATILLAS ESCOLARES HUSH PUPPIES UNISEX RUNNER LACES0");
                                System.out.println("3 ZAPATO ESCOLAR DE CUERO PARA MUJER PAR&SS MV24-2060NEGRO ");
                                System.out.println("4 ZAPATO ESCOLAR DE CUERO JUVENIL CONTERS ES-126 NEGRO ");
                                System.out.println("5 ZAPATILLAS PATRICIO ESTRELLA BOB ESPONJA ");
                                System.out.println("6 ZAPATOS ESCOLAR FAENA FNK-012(33-40) JUSTIN CUERO ");
                                System.out.println("7 ZAPATILLAS ESCOLARES DE CUERO PARA HOMBRE KAIDA JA24-CG8 NEGRO ");
                                System.out.println("8  ZAPATILLAS ESCOLARES UNISEX R18-QY027(28-34)  ");
                                System.out.println("9 ZAPATILLAS ESCOLARES DE CUERO PARA NIÑOS PAR&SS JA24-CG82  ");
                                System.out.println("10 ZAPATO ESCOLAR DE CUERO PARA DAMA PAR&SS MV24-2064  ");
                                op_cal = esponja.nextLine();
                                switch (op_cal) {
                                    case "1":
                                        System.out.println("ZAPATO ESCOLAR CUERO PAR&SS.MV24-2068 NEGRO ");
                                        System.out.println("Con un precio de: S/ 111.30");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_cal = esponja.nextDouble();
                                        total_cal = unidades_cal * 111.30;
                                        System.out.println("El total a pagar es: " + total_cal);
                                        break;
                                    case "2":
                                        System.out.println(" ZAPATILLAS ESCOLARES HUSH PUPPIES UNISEX RUNNER LACES ");
                                        System.out.println("Con un precio de: S/ 104.30");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_cal = esponja.nextDouble();
                                        total_cal = unidades_cal * 104.30;
                                        System.out.println("El total a pagar es: " + total_cal);
                                        break;
                                    case "3":
                                        System.out.println("ZAPATO ESCOLAR DE CUERO PARA MUJER PAR&SS MV24-2060NEGRO ");
                                        System.out.println("Con un precio de: S/111.30");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_cal = esponja.nextDouble();
                                        total_cal = unidades_cal * 111.30;
                                        System.out.println("El total a pagar es: " + total_cal);
                                        break;
                                    case "4":
                                        System.out.println("ZAPATO ESCOLAR DE CUERO JUVENIL CONTERS ES-126 NEGRO ");
                                        System.out.println("Con un precio de: S/ 135.85");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_cal = esponja.nextDouble();
                                        total_cal = unidades_cal * 135.85;
                                        System.out.println("El total a pagar es: " + total_cal);
                                        break;
                                    case "5":
                                        System.out.println("ZAPATILLAS PATRICIO ESTRELLA BOB ESPONJA ");
                                        System.out.println("Con un precio de: S/ 172.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_cal = esponja.nextDouble();
                                        total_cal = unidades_cal * 172.00;
                                        System.out.println("El total a pagar es: " + total_cal);
                                        break;
                                    case "6":
                                        System.out.println("ZAPATOS ESCOLAR FAENA FNK-012(33-40) JUSTIN CUERO ");
                                        System.out.println("Con un precio de: S/ 117.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_cal = esponja.nextDouble();
                                        total_cal = unidades_cal * 117.00;
                                        System.out.println("El total a pagar es: " + total_cal);
                                        break;
                                    case "7":
                                        System.out.println("ZAPATILLAS ESCOLARES DE CUERO PARA HOMBRE KAIDA JA24-CG8 NEGRO ");
                                        System.out.println("Con un precio de: S/ 146.30");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_cal = esponja.nextDouble();
                                        total_cal = unidades_cal * 59.95;
                                        System.out.println("El total a pagar es: " + total_cal);
                                        break;
                                    case "1.2.8":
                                        System.out.println("ZAPATILLAS ESCOLARES UNISEX R18-QY027(28-34) 70.00 ");
                                        System.out.println("Con un precio de: S/ 70.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_cal = esponja.nextDouble();
                                        total_cal = unidades_cal * 70.00;
                                        System.out.println("El total a pagar es: " + total_cal);
                                        break;
                                    case "9":
                                        System.out.println(" ZAPATILLAS ESCOLARES DE CUERO PARA NIÑOS PAR&SS JA24-CG82 ");
                                        System.out.println("Con un precio de: S/ 109.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_cal = esponja.nextDouble();
                                        total_cal = unidades_cal * 109.00;
                                        System.out.println("El total a pagar es: " + total_cal);
                                        break;
                                    case "10":
                                        System.out.println("ZAPATO ESCOLAR DE CUERO PARA DAMA PAR&SS MV24-2064   ");
                                        System.out.println("Con un precio de: S/ 111.30");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_cal = esponja.nextDouble();
                                        total_cal = unidades_cal* 111.30;
                                        System.out.println("El total a pagar es: " + total_cal);
                                        break;
                                }
                            case "3":
                                double unidades_zap, total_zap;
                                String op_zap;
                                System.out.println("en ropas ZAPATILLAS DEPORTIVAS tenemos:");
                                System.out.println("1 ZAPATILLAS DE FUTBOL PARA NIÑO ADIDAS HP2520 DEPORTIVO LI TF ");
                                System.out.println("2 ZAPATILLAS DE FUTBOL ADIDAS PARA NIÑO HP6456 BLANCO 149.00");
                                System.out.println("3 ZAPATILLAS DE FURBOL ADIDAD PARA NIÑO HP3061 NEGRO 149.00 ");
                                System.out.println("4 ZAPATILLAS DE FUTBOL PUMA UNISEX 107481 06 NEGRO 99.00 ");
                                System.out.println("5 ZAPATILLAS DE FUTBOL PUMA UNISEX 107482 06 MULTICOLOR 149.00");
                                System.out.println("6 ZAPATILLAS DE FUTBOL PARA NIÑO PODIUM KUN CELESTE 59.95");
                                System.out.println("7 zapatillas de futbol para niño podium kylian amarillo 59.95");
                                System.out.println("8 ZAPATILLAS DE FUTBOL UMBRO PARA NIÑO CLASICO JR TF AZUL 129.90");
                                op_zap = esponja.nextLine();
                                switch (op_zap) {
                                    case "1":
                                        System.out.println("ZAPATILLAS DE FUTBOL PARA NIÑO ADIDAS HP2520 DEPORTIVO LI TF  ");
                                        System.out.println("Con un precio de: S/ 139.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_zap = esponja.nextDouble();
                                        total_zap = unidades_zap * 139.00;
                                        System.out.println("El total a pagar es: " + total_zap);
                                        break;
                                    case "2":
                                        System.out.println(" ZAPATILLAS DE FUTBOL ADIDAS PARA NIÑO HP6456 BLANCO");
                                        System.out.println("Con un precio de: S/ 149.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_zap = esponja.nextDouble();
                                        total_zap = unidades_zap* 19.96;
                                        System.out.println("El total a pagar es: " + total_zap);
                                        break;
                                    case "3":
                                        System.out.println("1.1.3 ZAPATILLAS DE FURBOL ADIDAD PARA NIÑO HP3061 NEGRO ");
                                        System.out.println("Con un precio de: S/ 149.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_zap = esponja.nextDouble();
                                        total_zap = unidades_zap * 149.00;
                                        System.out.println("El total a pagar es: " + total_zap);
                                        break;
                                    case "4":
                                        System.out.println("ZAPATILLAS DE FUTBOL PUMA UNISEX 107481 06 NEGRO  ");
                                        System.out.println("Con un precio de: S/99.00 ");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_zap = esponja.nextDouble();
                                        total_zap= unidades_zap * 99.00;
                                        System.out.println("El total a pagar es: " + total_zap);
                                        break;
                                    case "5":
                                        System.out.println("ZAPATILLAS DE FUTBOL PUMA UNISEX 107482 06 MULTICOLOR ");
                                        System.out.println("Con un precio de: S/ 149.00");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_zap = esponja.nextDouble();
                                        total_zap = unidades_zap * 149.00;
                                        System.out.println("El total a pagar es: " + total_zap);
                                        break;
                                    case "6":
                                        System.out.println("ZAPATILLAS DE FUTBOL PARA NIÑO PODIUM KUN CELESTE");
                                        System.out.println("Con un precio de: S/ 59.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_zap = esponja.nextDouble();
                                        total_zap = unidades_zap* 59.95;
                                        System.out.println("El total a pagar es: " + total_zap);
                                        break;
                                    case "7":
                                        System.out.println("zapatillas de futbol para niño podium kylian amarillo ");
                                        System.out.println("Con un precio de: S/ 59.95");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_zap = esponja.nextDouble();
                                        total_zap = unidades_zap* 59.95;
                                        System.out.println("El total a pagar es: " + total_zap);
                                        break;
                                    case "8":
                                        System.out.println("ZAPATILLAS DE FUTBOL UMBRO PARA NIÑO CLASICO JR TF AZUL 129.90");
                                        System.out.println("Con un precio de: S/ 129.90");
                                        System.out.println("¿Cuantos desea compra?");
                                        unidades_zap = esponja.nextDouble();
                                        total_zap = unidades_zap* 129.90;
                                        System.out.println("El total a pagar es: " + total_zap);
                                        break;
                                }
                        }
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
        return null;
    }
    public String op_moda_calzado() {
        esponja.nextLine();
        System.out.println("TENEMOS EN:");
        System.out.println("1. ZAPATILLA MUJER");
        System.out.println("2. ZAPATILLA HOMBRE");
        System.out.println("3. ZAPATILLA NIÑOS");
        String subOpcion = esponja.nextLine();
        switch (subOpcion) {
            case "1":
                System.out.println("ZAPATILLA MUJER");
                String opc_jeans= esponja.nextLine();
                switch (opc_jeans){
                    case "1":
                        System.out.println("1. PUMA");;
                        System.out.println("2. ADIDAS");
                        System.out.println("3. HYPNOTIC");
                        String modelo= esponja.nextLine();
                        switch (modelo){
                            case"1":
                                System.out.println("1.ZAPATILLAS URBANAS PUMA= $159.10");
                                System.out.println("PARA PAGO EFECTIVO = 1");
                                System.out.println("PAGO CON TARJETA = 2");
                                int opcionpago = esponja.nextInt();
                                if (opcionpago==1){
                                    double precio = 159.10;
                                    System.out.println("INGRESE EL MONTO EN EFECTIVO");
                                    double montoefectivo = esponja.nextDouble();
                                    if (montoefectivo >= precio){
                                        Double cambio = montoefectivo - precio;
                                        System.out.println("tu cambio es: $" + cambio);
                                        System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                                    } else {
                                        System.out.println("MONTO INSUFICIENTE");
                                    }



                                }else if (opcionpago==2){
                                    System.out.println("ingrese el numero de la tarjeta");
                                    String numerotarjeta = esponja.next();
                                    System.out.println("ingrese la fecha de vencimiento MM/AA");
                                    String fechadevencimiento = esponja.next();
                                    System.out.println("INGRESE EL CODIGO CVV");
                                    int codigocvv = esponja.nextInt();
                                    //muestra la boleta
                                    System.out.println("-----BOLETA DE COMPRA-----");
                                    System.out.println("ZAPATILLAS URBANAS PUMA");
                                    System.out.println("NOMBRE:" +apodo);
                                    System.out.println("PRECIO: $119.00");
                                    System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                                    System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                                    System.out.println("pago realizado gracias por su compra");
                                }else {
                                    System.out.println("OPCION DEE PAGO NO VALIDA");
                                }

                                break;
                            case"2":
                                System.out.println("2.ZAPATILLAS URBANAS ADIDAS =$199.95");
                                System.out.println("PARA PAGO EFECTIVO = 1");
                                System.out.println("PAGO CON TARJETA = 2");
                                int pcionpago = esponja.nextInt();

                                if (pcionpago==1) {
                                    double precio = 129.00;
                                    System.out.println("INGRESE EL MONTO EN EFECTIVO");
                                    double montoefectivo = esponja.nextDouble();
                                    if (montoefectivo >= precio){
                                        Double cambio = montoefectivo - precio;
                                        System.out.println("tu cambio es: $" + cambio);
                                        System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                                    } else {
                                        System.out.println("MONTO INSUFICIENTE");
                                    }



                                }else if (pcionpago==2){
                                    System.out.println("ingrese el numero de la tarjeta");
                                    String numerotarjeta = esponja.next();
                                    System.out.println("ingrese la fecha de vencimiento MM/AA");
                                    String fechadevencimiento = esponja.next();
                                    System.out.println("INGRESE EL CODIGO CVV");
                                    int codigocvv = esponja.nextInt();
                                    //muestra la boleta
                                    System.out.println("-----BOLETA DE COMPRA-----");
                                    System.out.println("MODELO DE JEANS:JEAN MALABAR CORREA");
                                    System.out.println("NOMBRE:" +apodo);
                                    System.out.println("PRECIO: $199.95");
                                    System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                                    System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                                    System.out.println("pago realizado gracias por su compra");

                                }else {
                                    System.out.println("OPCION DEE PAGO NO VALIDA");
                                }

                                break;
                            case"3":
                                System.out.println("3.ZAPATILLAS URBANAS HYPNOTIC =$130.99");
                                System.out.println("PARA PAGO EFECTIVO = 1");
                                System.out.println("PAGO CON TARJETA = 2");
                                int cionpago = esponja.nextInt();

                                if (cionpago==1) {
                                    double precio = 111.93;
                                    System.out.println("INGRESE EL MONTO EN EFECTIVO");
                                    double montoefectivo = esponja.nextDouble();
                                    if (montoefectivo >= precio){
                                        Double cambio = montoefectivo - precio;
                                        System.out.println("tu cambio es: $" + cambio);
                                        System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                                    } else {
                                        System.out.println("MONTO INSUFICIENTE");
                                    }



                                }else if (cionpago==2){
                                    System.out.println("ingrese el numero de la tarjeta");
                                    String numerotarjeta = esponja.next();
                                    System.out.println("ingrese la fecha de vencimiento MM/AA");
                                    String fechadevencimiento = esponja.next();
                                    System.out.println("INGRESE EL CODIGO CVV");
                                    int codigocvv = esponja.nextInt();
                                    //muestra la boleta
                                    System.out.println("-----BOLETA DE COMPRA-----");
                                    System.out.println("MODELO DE JEANS:JOGGER PARA MUJER PARADA 111 ALLY");
                                    System.out.println("NOMBRE:" +apodo);
                                    System.out.println("PRECIO: $130.99");
                                    System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                                    System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                                    System.out.println("pago realizado gracias por su compra");
                                }else {
                                    System.out.println("OPCION DEE PAGO NO VALIDA");
                                }
                        }
                }
                break;
            case "2":
                System.out.println(" ZAPATILLAS HOMBRES.");
                System.out.println("-------------------");
                System.out.println("1. HYPNOTIC");
                System.out.println("2. ADIDAS");
                System.out.println("3. PUMA");
                String modelo= esponja.nextLine();
                switch (modelo){
                    case "1":
                        System.out.println("ZAPATILLAS HOPNOTIC $160.99");
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int opcionpago = esponja.nextInt();
                        if (opcionpago==1){
                            double precio = 160.99;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }



                        }else if (opcionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta


                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("ZAPATILLAS HOPNOTIC");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $160.99");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                            System.out.println("pago realizado gracias por su compra");




                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                    case "2":
                        System.out.println("ZAPATILLAS ADIDAS = $160.99");
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int pcionpago = esponja.nextInt();
                        if (pcionpago==1){
                            double precio = 160.99;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (pcionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta
                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("ZAPATILLAS ADIDAS");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO:$160.99");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                    case "3":
                        System.out.println("ZAPATILLAS PUMA = $229.00 ");
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int cionpago = esponja.nextInt();
                        if (cionpago==1){
                            double precio = 229.00;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (cionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta


                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("MODELO DE MARCA:ABRIGO SFERA SOLAPA CAMEL");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO:229.00$");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                }
                break;
            case "3":
                System.out.println("ZAPATILLAS PARA NIÑOS");
                System.out.println("-----------------------");
                System.out.println("1. PUMA");
                System.out.println("2. PUNTO ");
                System.out.println("3. ADIDAS");
                String odelo= esponja.nextLine();
                switch (odelo){
                    case "1":
                        System.out.println("ZAPATILLAS PUMA NIÑOS= $69.95");
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int pcionpago = esponja.nextInt();
                        if (pcionpago==1){
                            double precio = 69.95;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (pcionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta
                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("ZAPATILLAS PUMA");
                            System.out.println("NOMNBRE:" +apodo );
                            System.out.println("PRECIO: $69.95");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                        break;
                    case "2":
                        System.out.println("ZAPATILLAS PUNTO NIÑOS = $89.95");
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int cionpago = esponja.nextInt();
                        if (cionpago==1){
                            double precio =89.95;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (cionpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta


                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("ZAPATILLAS PUNTO NIÑOS");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $89.95");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);
                            System.out.println("pago realizado gracias por su compra");
                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                        break;
                    case "3":
                        System.out.println("ZAPATILLAS ADIDAS NIÑOS= $29.95");
                        System.out.println("PARA PAGO EFECTIVO = 1");
                        System.out.println("PAGO CON TARJETA = 2");
                        int onpago = esponja.nextInt();
                        if (onpago==1){
                            double precio = 29.95;
                            System.out.println("INGRESE EL MONTO EN EFECTIVO");
                            double montoefectivo = esponja.nextDouble();
                            if (montoefectivo >= precio){
                                Double cambio = montoefectivo - precio;
                                System.out.println("tu cambio es: $" + cambio);
                                System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
                            } else {
                                System.out.println("MONTO INSUFICIENTE");
                            }
                        }else if (onpago==2){
                            System.out.println("ingrese el numero de la tarjeta");
                            String numerotarjeta = esponja.next();
                            System.out.println("ingrese la fecha de vencimiento MM/AA");
                            String fechadevencimiento = esponja.next();
                            System.out.println("INGRESE EL CODIGO CVV");
                            int codigocvv = esponja.nextInt();
                            //muestra la boleta


                            System.out.println("-----BOLETA DE COMPRA-----");
                            System.out.println("ZAPATILLAS ADIDAS NIÑOS");
                            System.out.println("NOMBRE:" +apodo);
                            System.out.println("PRECIO: $29.95");
                            System.out.println("NUMERO DE TARJETA: **** **** ****" +numerotarjeta.substring(numerotarjeta.length()-4));
                            System.out.println("FECHA DE VENCIMIENTO:" +fechadevencimiento);

                            System.out.println("pago realizado gracias por su compra");
                        }else {
                            System.out.println("OPCION DEE PAGO NO VALIDA");
                        }
                }
                break;
            default:
                System.out.println("opcion no valida");
        }
        return null;
    }
    public static void main (String[]args){
        OECHSLE frank = new OECHSLE();
        frank.inicio_sesion();
    }
}
