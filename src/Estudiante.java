package src;
/**
 * Clase que representa a un estudiante y gestiona sus notas académicas.
 * 
 * @author Kadir González 8-1044-1802 y Kenneth Lau 8-1047-1451
 * @version 1.0
 */
public class Estudiante {

    // -------------------------------------------------------------
    // PASO 1 (BÁSICO): Atributos Privados
    // -------------------------------------------------------------
    // TODO 1: Declara un atributo 'nombre' (String) y 'notas' (arreglo de double: double[])
    private String nombre;
    private double[] notas;

    // -------------------------------------------------------------
    // PASO 2 (BÁSICO/INTERMEDIO): Constructor y Encapsulamiento
    // -------------------------------------------------------------
    /**
     * Constructor principal de la clase Estudiante.
     * 
     * @param nombre Nombre completo del estudiante.
     * @param notas  Arreglo con las 3 notas del semestre.
     */
    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        setNotas(notas); // Usamos el setter para aplicar validaciones
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    /**
     * Asigna las notas asegurando que estén en el rango válido [0.0 - 100.0].
     * 
     * @param notas Arreglo de notas a validar.
     */
    public void setNotas(double[] notas) {
        if (notas != null) {
            this.notas = new double[notas.length];
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] < 0.0 || notas[i] > 100.0) {
                    this.notas[i] = 0.0;
                } else {
                    this.notas[i] = notas[i];
                }
            }
        }
    }

    // -------------------------------------------------------------
    // PASO 3 (AVANZADO): Lógica con Arreglos y Métodos
    // -------------------------------------------------------------
    /**
     * Calcula y retorna el promedio numérico de las 3 notas.
     * 
     * @return Promedio final acumulado.
     */
    public double calcularPromedio() {
        double suma = 0.0;
        // TODO 3 (AVANZADO): Usa un bucle 'for' o 'for-each' para sumar todas las 'notas'
        for (double nota : notas) {
            suma += nota;
        }
        
        // TODO 4: Retorna el promedio (suma dividida entre la cantidad de notas)
        return suma / notas.length;
    }

    /**
     * Evalúa si el estudiante aprobó la asignatura en base oficial UTP (>= 71.0).
     * 
     * @return true si aprobó, false en caso contrario.
     */
    public boolean estaAprobado() {
        // TODO 5: Retorna true si calcularPromedio() es mayor o igual a 71.0
        return calcularPromedio() >= 71.0;
    }
}
