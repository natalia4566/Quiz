import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Scanner;

public class Context {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la ruta completa de la imagen: ");
        String imagePath = scanner.nextLine();

        BufferedImage originalImage = cargarImagen(imagePath);
        if (originalImage != null) {
            ImageFilterStrategy selectedFilter = obtenerFiltroDelUsuario();
            if (selectedFilter != null) {
                BufferedImage filteredImage = selectedFilter.applyFilter(originalImage);
                guardarImagenFiltrada(filteredImage, "imagen_filtrada.jpg");
                System.out.println("Imagen filtrada guardada como imagen_filtrada.jpg");
            } else {
                System.out.println("No se seleccionó ningún filtro.");
            }
        } else {
            System.out.println("Error al cargar la imagen.");
        }
    }

    private static ImageFilterStrategy obtenerFiltroDelUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona un filtro:");
        System.out.println("1. Alto contraste");
        System.out.println("2. Escala de grises");
        System.out.println("3. Sepia");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                return new HighContrastFilter();
            case 2:
                return new GrayscaleFilter();
            case 3:
                return new SepiaFilter();
            default:
                return null;
        }
    }

    private static BufferedImage cargarImagen(String imagePath) {
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
            return null;
        }
    }

    private static void guardarImagenFiltrada(BufferedImage image, String outputPath) {
        try {
            ImageIO.write(image, "jpg", new File(outputPath));
        } catch (IOException e) {
            System.err.println("Error al guardar la imagen filtrada: " + e.getMessage());
        }
    }
}
