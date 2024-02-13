import read.controllers.readControllers;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\Julian Cabra\\OneDrive\\Documents\\Sem_3\\progra2\\Proyectos Visual\\readText\\texto.txt";
        readControllers controllers = new readControllers();
        controllers.showText(path);
    }
}
