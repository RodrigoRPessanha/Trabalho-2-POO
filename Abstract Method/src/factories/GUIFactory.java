package factories;

import checkboxes.Checkbox;
import buttons.Button;

// A GUIFactory conhece sobre todos os tipos de produtos abstratos.

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
