package Dialog;

import Button.HtmlButton;
import Button.Button;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}