// Ya salio compi1 :)

void main ( ){
	int b = 2;
	int a =1;
	int var1 = 5+8*9;
	bool simple_flag = 6 < 9898;
    bool flag = 5 > 9 || 7 > 10 && 20 > 12;

	if (b > a){
		Console.Write("b mayor que a");
	}else if(a == b){
		Console.Write("a y b son iguales");
	}

	while(a < 10){
		Console.Write("el valor de a es: " + a);
	}
	
	
	void DefinirGlobales(){
		string reporte1 = "Grafica pie test";
		string reporte2 = "Grafica barras test";
		double pe1 = 0.8;
		double pe2 = 0.5;
		double pe3 = 0.2;
		double po1 = 3.5;
		double po2 = 9.5;
		string vart = "Valor Obtenido";
		string var2 = "esto es un puto test";
		string var22 = "Valor Obtenido clase 1";
		string var3 = "Valore Esperado clase 2";
		string var3 = "Valor Obtenido clase 3";
	}


	void GraficaPie(){
		string Titulo= reporte1;
		string [] Ejex= { 		var2, "Probabilidad Obtenida Clase 1",
							"Probabilidad Esperada clase 2", "Probabilidad Obtenida Clase 2",
							"Probabilidad Esperada clase 3", "Probabilidad Obtenida Clase 3" };
		double [] Valores= { po2, 3.9, po1, 0.7, 6.7, 3.3};
	
	}
	
	void Graficabarras(){
		string Titulo= reporte2;
		string [] Ejex= { 	"Probabilidad Esperada clase 1", var2,
							"Probabilidad Esperada clase 2", "Probabilidad Obtenida Clase 2",
							"Probabilidad Esperada clase 3", "Probabilidad Obtenida Clase 3" };
		double [] Valores= { po2, pe2, pe3, 4.8 , 4.8, 4.8};
		string TituloX= "Atributo";
		string TituloY= "Puntaje";
	}


}