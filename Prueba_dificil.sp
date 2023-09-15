void main (){


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
}

/* Comentario
Multilinea
*/