class Estudiante {
    private String nombre;
    private int[] calificaciones;

    public Estudiante(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public int calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public char obtenerCalificacion(int promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

        public static void main (String[] args) {
            int[] calificaciones = {85, 90, 78, 92, 68};
            Estudiante estudiante = new Estudiante("Diego Gonzalez", calificaciones);

            int promedio = estudiante.calcularPromedio();
            char calificacion = estudiante.obtenerCalificacion(promedio);

            System.out.println("Nombre del estudiante: " + estudiante.nombre);
            for (int i = 0; i < estudiante.calificaciones.length; i++) {
                System.out.println("Calificacion" +(i + 1) + ": " + estudiante.calificaciones[i]);
            }
            System.out.println("Promedio: " + promedio);
            System.out.println("Calificacion: " + calificacion);
        }
    }

