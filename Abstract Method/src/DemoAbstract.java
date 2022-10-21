import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/*
 * A aplicação pega o tipo de fábrica e a cria no run time (geralmente na etapa de inicialização),
 * dependendo ou da variável de configuração ou da variável de ambiente.
 */
public class DemoAbstract {
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
    
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase(); // identifica seu SO
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
}