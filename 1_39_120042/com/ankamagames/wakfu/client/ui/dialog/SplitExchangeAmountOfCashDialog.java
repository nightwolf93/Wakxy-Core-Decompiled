package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import java.awt.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.util.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.appearance.*;

public class SplitExchangeAmountOfCashDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public SplitExchangeAmountOfCashDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final String id = "splitExchangeCashContainer";
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut);
        }
        checkOut.setStyle("spellInventory");
        checkOut.setPack(true);
        checkOut.onAttributesInitialized();
        final BorderLayout element = new BorderLayout();
        element.onCheckOut();
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        final Container checkOut2 = Container.checkOut();
        checkOut2.setElementMap(elementMap);
        element.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        final DecoratorAppearance appearance = checkOut2.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut2.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut3 = Margin.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setInsets(new Insets(0, 5, 0, 0));
        appearance.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        appearance.onChildrenAdded();
        final BorderLayoutData checkOut4 = BorderLayoutData.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setData(BorderLayoutData.Values.CENTER);
        checkOut2.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final BorderLayout element2 = new BorderLayout();
        element2.onCheckOut();
        checkOut2.addBasicElement(element2);
        element2.onAttributesInitialized();
        final String id2 = "quantityTextEditor";
        final TextEditor textEditor = new TextEditor();
        textEditor.onCheckOut();
        textEditor.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, textEditor);
        }
        textEditor.setStyle("dark");
        textEditor.setPrefSize(new Dimension(80, 0));
        textEditor.setMaxChars(10);
        textEditor.setRestrict("[0-9]+");
        textEditor.setSelectOnFocus(true);
        textEditor.setFocused(true);
        final KeyTypedListener onKeyType = new KeyTypedListener();
        onKeyType.setCallBackFunc("wakfu.exchange:keyType(quantityTextEditor)");
        textEditor.setOnKeyType(onKeyType);
        element2.addBasicElement(textEditor);
        textEditor.onAttributesInitialized();
        final PropertyElement checkOut5 = PropertyElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setName("exchange.amountOfCash");
        checkOut5.setAttribute("text");
        textEditor.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final BorderLayoutData checkOut6 = BorderLayoutData.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setData(BorderLayoutData.Values.CENTER);
        textEditor.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final DecoratorAppearance appearance2 = textEditor.getAppearance();
        appearance2.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance2).setAlign(Alignment9.EAST);
        textEditor.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut7 = Margin.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setInsets(new Insets(8, 0, 5, 0));
        appearance2.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        appearance2.onChildrenAdded();
        textEditor.onChildrenAdded();
        element2.onChildrenAdded();
        checkOut2.onChildrenAdded();
        final Button element3 = new Button();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setStyle("smallValid");
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.exchange:applyQuantity");
        element3.setOnClick(onClick);
        element.addBasicElement(element3);
        element3.onAttributesInitialized();
        final BorderLayoutData checkOut8 = BorderLayoutData.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setData(BorderLayoutData.Values.EAST);
        element3.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final DecoratorAppearance appearance3 = element3.getAppearance();
        appearance3.setElementMap(elementMap);
        element3.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Margin checkOut9 = Margin.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setInsets(new Insets(3, 5, 0, 5));
        appearance3.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        appearance3.onChildrenAdded();
        element3.onChildrenAdded();
        element.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
}
