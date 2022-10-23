package factories;

import buttons.Button;
import buttons.LinuxButton;
import checkboxes.Checkbox;
import checkboxes.LinuxCheckbox;
// Cada Fábrica concreta recebe a Fábrica Básica e é responsável por criar um produto de uma dada variedade.
public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
    
}
