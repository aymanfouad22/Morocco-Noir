package com.example.application.views.akinator;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Akinator")
@Menu(icon = "line-awesome/svg/magic-solid.svg", order = 0)
@Route("")
public class AkinatorView extends Composite<VerticalLayout> {

    public AkinatorView() {
        Paragraph textMedium = new Paragraph();
        TextArea textArea = new TextArea();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        Button buttonPrimary3 = new Button();
        Button buttonPrimary4 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        textMedium.setText(
                "INSTRUCTIONS : Think of a random famous character, You will be asked 20 questions and the bot will try to determine which character you are thinking of.");
        textMedium.setWidth("100%");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        textArea.setLabel("Akinator");
        textArea.setWidth("100%");
        buttonPrimary.setText("Yes");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("No");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary2);
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary3.setText("Maybe");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary3);
        buttonPrimary3.setWidth("min-content");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary4.setText("I don't Know");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary4);
        buttonPrimary4.setWidth("min-content");
        buttonPrimary4.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(textMedium);
        getContent().add(textArea);
        getContent().add(buttonPrimary);
        getContent().add(buttonPrimary2);
        getContent().add(buttonPrimary3);
        getContent().add(buttonPrimary4);
    }
}
