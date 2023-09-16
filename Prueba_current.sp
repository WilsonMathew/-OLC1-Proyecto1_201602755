// Hola, Bienvenido al archivo de Prueba

/*
	Vamos a poner a Prueba si aceptan comentarios
	en varias Lineas
*/

void main (){
    int simpleEntero = 10;
    int enteros = simpleEntero + 2 - 2 * 2 / 2;
    double decimales = 2.0 - 3.4;
    decimales = 65.7 * decimales; // Asignacion
    String concatenacion = "Hola mundo" + "Esto es una concatenacion";
    String concatenacion_2 = "Concatenar con variables" + concatenacion;
	bool flag2 = 6 > 9898;
    bool flag = 5 > 9 || 7 > 10 && 20 > 12;
	
    //console.write(5 > 9 || 7 > 10 && 20 > 12 + x + concatenacion + "Esto es un write"+ 48 * 7 - 5 * 20 + True || False+ x == 10);

	while(a < 10){
		Console.Write("el valor de a es: " + a);
	}
	
    for (int x = 0; x >= 10; x++) {
        int j = 10;
        if (x == 5 || x == 10) {
            console.write("Esto es un if dentro de un for");
            while (j != 10 && x != 20) {
                j = j + 1;
                console.write("esto es un while dentro de un if");
                if (j == 10) {

                    for (int f = 5; f > 10 ; f++){
                        console.write("XD");
                    }
                    break;
                }
            }
        }
    }
    int contador = 0;
    do{
        if ( contador == 5){
            console.write("mitad");
        }else if (contador == 6){
            console.write("Mas de la mitad");
        } else if ( contador == 7){
            console.write ("Dos más que la mitad");

            if (contador == 8){
                console.write("Ya casi llegamos");
            }
        }


    } while ( contador != 10 );

    // switch con instrucciones anidadas

    int precio = 0;

    switch (precio){

        case 1:
            console.write("Este es el caso número 1");
            break;

        case 2:
            if ( precio == 2 || precio == 68){
                    precio = 68;

                    do{
                        console.write ("Esto es un do while simple");
                    }while (precio != 68);
            }

       case "H":
           console.write("Caso 3");

       default:
            console.write("No se encontro el valor");
            break;


    }

    console.write("Felicidades, haz llegado al final y tu archivo no trono :)");


    // Final

}

/* Comentario
Multilinea
*/