package us.lsi.common;

public class Metricas {
	private int numeroDeIteraciones =0;
	private int numeroDeLLamadasRecursivas=0;
	private int numeroDePasos=0;
	private int numeroDeUsosDeLaMemoria=0;
	private long tiempoDeEjecucionInicial;
	private long tiempoDeEjecucionFinal;
	private int numeroDeCasosBase=0;
	private int numeroDeFueraDeRango=0;
	public int getNumeroDeFueraDeRango() {
		return numeroDeFueraDeRango;
	}

	private int numeroDeVecesQueFiltra =0;
	private int numeroEstadosFinales = 0;
	private int numeroDeSolucionesEncontradas = 0;
	private int numeroDeMejoresSolucionesEncontradas = 0;	
	private int numeroDeActualizacionesMejorValor = 0;

	public Metricas(){		
	}
	
	
	
	public int getNumeroDeIteraciones() {
		return numeroDeIteraciones;
	}


	/* (non-Javadoc)
	 * @see tipos.MetricasI#getNumDeLLamadasRecursivas()
	 */
	public int getNumeroDeLLamadasRecursivas() {
		return numeroDeLLamadasRecursivas;
	}

	/* (non-Javadoc)
	 * @see tipos.MetricasI#getNumDePasos()
	 */
	public int getNumeroDePasos() {
		return numeroDePasos;
	}

	/* (non-Javadoc)
	 * @see tipos.MetricasI#getNumDeUsosDeLaMemoria()
	 */
	public int getNumeroDeUsosDeLaMemoria() {
		return numeroDeUsosDeLaMemoria;
	}

	/* (non-Javadoc)
	 * @see tipos.MetricasI#getTiempoDeEjecucion()
	 */
	public long getTiempoDeEjecucion() {
		return tiempoDeEjecucionFinal-tiempoDeEjecucionInicial;
	}
	
	/* (non-Javadoc)
	 * @see tipos.MetricasI#getNumDeCasosBase()
	 */
	public int getNumeroDeCasosBase(){
		return numeroDeCasosBase;
	}

	/* (non-Javadoc)
	 * @see tipos.MetricasI#addIteracion()
	 */
	public void addIteracion() {
		numeroDeIteraciones++;
	}

	/* (non-Javadoc)
	 * @see tipos.MetricasI#addLLamadaRecursiva()
	 */
	public void addLLamadaRecursiva() {
		numeroDeLLamadasRecursivas++;
	}


	/* (non-Javadoc)
	 * @see tipos.MetricasI#addPaso()
	 */
	public void addPaso() {
		numeroDePasos++;
	}

	/* (non-Javadoc)
	 * @see tipos.MetricasI#addUsoDeLaMemoria()
	 */
	public void addUsoDeLaMemoria() {
		numeroDeUsosDeLaMemoria++;
	}

	public void setTiempoDeEjecucionInicial() {
		tiempoDeEjecucionInicial = System.nanoTime();
	}
	
	public void setTiempoDeEjecucionFinal() {
		tiempoDeEjecucionFinal = System.nanoTime();
	}
	
	/* (non-Javadoc)
	 * @see tipos.MetricasI#addCasoBase()
	 */
	public void addCasoBase(){
		numeroDeCasosBase++;
	}
	
	public void addFueraDeRango(){
		numeroDeFueraDeRango++;
	}
	
	/* (non-Javadoc)
	 * @see tipos.MetricasI#getNumDeVecesQueFiltra()
	 */
	public int getNumeroDeVecesQueFiltra(){
		return numeroDeVecesQueFiltra;
	}
	
	/* (non-Javadoc)
	 * @see tipos.MetricasI#addUnFiltro()
	 */
	public void addUnFiltro(){
		numeroDeVecesQueFiltra++;
	}

	public int getNumeroEstadosFinales() {
		return numeroEstadosFinales;
	}
	
	public void addUnEstadoFinal() {
		numeroEstadosFinales++;
	}
	
	public int getNumeroDeSolucionesEncontradas() {
		return numeroDeSolucionesEncontradas;
	}
	
	public void addUnaSolucionEncontrada() {
		numeroDeSolucionesEncontradas++;
	}
	
	public int getNumeroDeMejoresSolucionesEncontradas() {
		return numeroDeMejoresSolucionesEncontradas;
	}
	
	public void addUnaMejorSolucionEncontrada() {
		numeroDeMejoresSolucionesEncontradas++;
	}
	
	public int getNumeroDeActualizacionesMejorValor() {
		return numeroDeActualizacionesMejorValor;
	}

	public void addActualizacionMejorValor() {
		this.numeroDeActualizacionesMejorValor = this.numeroDeActualizacionesMejorValor+1;
	}
	
	public String toString(){
		String s = "N�mero de Iteraciones         = "+ numeroDeIteraciones + "\n"+
		           "N�mero de Llamadas Recursivas = "+ numeroDeLLamadasRecursivas+ "\n"+
		           "N�mero de Pasos               = "+ numeroDePasos +"\n"+
		           "Numero de Usos de la Memoria  = "+ numeroDeUsosDeLaMemoria + "\n"+
		           "Tiempo de Ejecucion en nanoseg= "+ getTiempoDeEjecucion() + "\n" +
		           "N�mero de Casos Base          = "+ numeroDeCasosBase + "\n" +
		           "N�mero de Fuera de Rango      = "+ numeroDeFueraDeRango + "\n" +
		           "N�mero de Veces que Filtra    = "+ numeroDeVecesQueFiltra+ "\n"+
		           "Numero de Estados Finales     = "+ numeroEstadosFinales+ "\n" +
		           "N�mero de Soluciones Encont.  = "+ numeroDeSolucionesEncontradas+ "\n"+
		           "N�mero de Mejores Sol. Enc.   = "+ numeroDeMejoresSolucionesEncontradas+ "\n"+
		 		   "N�mero de Act. Mejor Valor    = "+ numeroDeActualizacionesMejorValor;
		return s;
	}
	
	
}
