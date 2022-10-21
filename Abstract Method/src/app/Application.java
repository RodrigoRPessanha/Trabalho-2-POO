package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;
/* 
 * Os usuários das fábricas não se preocupam com qual fábrica concreta eles estão trabalhando, uma vez que eles trabalham
 * com fábricas e produtos através de interfaces abstratas.
*/
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}