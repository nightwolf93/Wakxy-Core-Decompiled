package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.util.*;
import java.awt.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.core.renderer.condition.*;
import com.ankamagames.xulor2.appearance.*;

public class CollectingProgressDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public CollectingProgressDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final WatcherContainer watcherContainer = new WatcherContainer();
        watcherContainer.onCheckOut();
        watcherContainer.setElementMap(elementMap);
        watcherContainer.setYOffset(0);
        watcherContainer.setXOffset(0);
        watcherContainer.setPack(true);
        watcherContainer.setAlign(Alignment9.NORTH);
        watcherContainer.setNonBlocking(true);
        watcherContainer.onAttributesInitialized();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setNonBlocking(true);
        watcherContainer.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final RowLayout checkOut2 = RowLayout.checkOut();
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        final Container checkOut3 = Container.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setStyle("characterBookBar");
        checkOut3.setPrefSize(new Dimension(14, 18));
        checkOut3.setNonBlocking(true);
        checkOut2.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        final DecoratorAppearance appearance = checkOut3.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut3.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut4 = Margin.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setInsets(new Insets(8, 0, 7, 0));
        appearance.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance.onChildrenAdded();
        final PropertyElement checkOut5 = PropertyElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setLocal(true);
        checkOut5.setName("collectInProgress");
        checkOut5.setField("slots");
        checkOut5.setAttribute("visible");
        checkOut3.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        final ConditionResult element = new ConditionResult();
        element.onCheckOut();
        element.setElementMap(elementMap);
        checkOut5.addBasicElement(element);
        element.onAttributesInitialized();
        final NotCondition element2 = new NotCondition();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        final EqualCondition element3 = new EqualCondition();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setValue("0");
        element2.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        element2.onChildrenAdded();
        element.onChildrenAdded();
        checkOut5.onChildrenAdded();
        final RepeatableImage element4 = new RepeatableImage();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setStyle("CollectNumberCharacters");
        element4.setNonBlocking(true);
        checkOut3.addBasicElement(element4);
        element4.onAttributesInitialized();
        final DecoratorAppearance appearance2 = element4.getAppearance();
        appearance2.setElementMap(elementMap);
        element4.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut6 = Margin.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setInsets(new Insets(0, 2, 0, 0));
        appearance2.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        appearance2.onChildrenAdded();
        final PropertyElement checkOut7 = PropertyElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setLocal(true);
        checkOut7.setName("collectInProgress");
        checkOut7.setField("slots");
        checkOut7.setAttribute("repeatNumber");
        element4.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        element4.onChildrenAdded();
        final RepeatableImage element5 = new RepeatableImage();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setStyle("waitOthers");
        element5.setNonBlocking(true);
        element5.setPrefSize(new Dimension(10, 18));
        checkOut3.addBasicElement(element5);
        element5.onAttributesInitialized();
        final PropertyElement checkOut8 = PropertyElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setLocal(true);
        checkOut8.setName("collectInProgress");
        checkOut8.setField("wait");
        checkOut8.setAttribute("visible");
        element5.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        final ConditionResult element6 = new ConditionResult();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        checkOut8.addBasicElement(element6);
        element6.onAttributesInitialized();
        final TrueCondition element7 = new TrueCondition();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element6.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        element6.onChildrenAdded();
        checkOut8.onChildrenAdded();
        final PropertyElement checkOut9 = PropertyElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setLocal(true);
        checkOut9.setName("collectInProgress");
        checkOut9.setField("drawNumber");
        checkOut9.setAttribute("repeatNumber");
        element5.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        element5.onChildrenAdded();
        checkOut3.onChildrenAdded();
        final Container checkOut10 = Container.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setPrefSize(new Dimension(120, 40));
        checkOut10.setNonBlocking(true);
        checkOut2.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        final StaticLayout element8 = new StaticLayout();
        element8.onCheckOut();
        checkOut10.addBasicElement(element8);
        element8.onAttributesInitialized();
        final Container checkOut11 = Container.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setStyle("ProgressBarCollect");
        checkOut11.setPrefSize(new Dimension(100, 40));
        checkOut11.setNonBlocking(true);
        element8.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        final StaticLayoutData element9 = new StaticLayoutData();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setX(0);
        element9.setY(0);
        element9.setSize(new Dimension(120, 40));
        checkOut11.addBasicElement(element9);
        element9.onAttributesInitialized();
        element9.onChildrenAdded();
        checkOut11.onChildrenAdded();
        final Container checkOut12 = Container.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setPrefSize(new Dimension(16, 16));
        checkOut12.setNonBlocking(true);
        element8.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        final StaticLayoutData element10 = new StaticLayoutData();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        element10.setX(9);
        element10.setY(11);
        element10.setSize(new Dimension(16, 16));
        checkOut12.addBasicElement(element10);
        element10.onAttributesInitialized();
        element10.onChildrenAdded();
        final Image element11 = new Image();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        element11.setDisplaySize(new Dimension(16, 16));
        element11.setScaled(true);
        element11.setNonBlocking(true);
        checkOut12.addBasicElement(element11);
        element11.onAttributesInitialized();
        final PropertyElement checkOut13 = PropertyElement.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setAttribute("style");
        checkOut13.setLocal(true);
        checkOut13.setField("iconskill");
        checkOut13.setName("collectInProgress");
        element11.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        element11.onChildrenAdded();
        checkOut12.onChildrenAdded();
        final Container checkOut14 = Container.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setExpandable(false);
        element8.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        final StaticLayoutData element12 = new StaticLayoutData();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        element12.setX(27);
        element12.setY(0);
        element12.setSize(new Dimension(82, 40));
        checkOut14.addBasicElement(element12);
        element12.onAttributesInitialized();
        element12.onChildrenAdded();
        final DecoratorAppearance appearance3 = checkOut14.getAppearance();
        appearance3.setElementMap(elementMap);
        checkOut14.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Padding element13 = new Padding();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element13.setInsets(new Insets(0, 5, 0, 0));
        appearance3.addBasicElement(element13);
        element13.onAttributesInitialized();
        element13.onChildrenAdded();
        appearance3.onChildrenAdded();
        final StaticLayout element14 = new StaticLayout();
        element14.onCheckOut();
        element14.setAdaptToContentSize(true);
        checkOut14.addBasicElement(element14);
        element14.onAttributesInitialized();
        element14.onChildrenAdded();
        final String id = "progressBarWait";
        final ProgressBar progressBar = new ProgressBar();
        progressBar.onCheckOut();
        progressBar.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, progressBar);
        }
        progressBar.setStyle("XP2");
        progressBar.setNonBlocking(true);
        checkOut14.addBasicElement(progressBar);
        progressBar.onAttributesInitialized();
        final DecoratorAppearance appearance4 = progressBar.getAppearance();
        appearance4.setElementMap(elementMap);
        progressBar.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final Margin checkOut15 = Margin.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setInsets(new Insets(1, 1, 1, 1));
        appearance4.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final ColorElement checkOut16 = ColorElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setName("progressBar");
        checkOut16.setColor(new Color(0.8f, 0.1f, 0.1f, 1.0f));
        appearance4.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        appearance4.onChildrenAdded();
        final PropertyElement checkOut17 = PropertyElement.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setLocal(true);
        checkOut17.setName("collectInProgress");
        checkOut17.setField("wait");
        checkOut17.setAttribute("visible");
        progressBar.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        final StaticLayoutData element15 = new StaticLayoutData();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element15.setSize(new Dimension(100.0f, 15));
        element15.setAlign(Alignment17.CENTER);
        element15.setYOffset(-1);
        progressBar.addBasicElement(element15);
        element15.onAttributesInitialized();
        element15.onChildrenAdded();
        progressBar.onChildrenAdded();
        final String id2 = "progressBar";
        final ProgressBar progressBar2 = new ProgressBar();
        progressBar2.onCheckOut();
        progressBar2.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, progressBar2);
        }
        progressBar2.setStyle("XP2");
        progressBar2.setNonBlocking(true);
        checkOut14.addBasicElement(progressBar2);
        progressBar2.onAttributesInitialized();
        final DecoratorAppearance appearance5 = progressBar2.getAppearance();
        appearance5.setElementMap(elementMap);
        progressBar2.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final Margin checkOut18 = Margin.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setInsets(new Insets(1, 1, 1, 1));
        appearance5.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        appearance5.onChildrenAdded();
        final PropertyElement checkOut19 = PropertyElement.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setLocal(true);
        checkOut19.setName("collectInProgress");
        checkOut19.setField("wait");
        checkOut19.setAttribute("visible");
        progressBar2.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        final ConditionResult element16 = new ConditionResult();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        checkOut19.addBasicElement(element16);
        element16.onAttributesInitialized();
        final FalseCondition element17 = new FalseCondition();
        element17.onCheckOut();
        element17.setElementMap(elementMap);
        element16.addBasicElement(element17);
        element17.onAttributesInitialized();
        element17.onChildrenAdded();
        element16.onChildrenAdded();
        checkOut19.onChildrenAdded();
        final StaticLayoutData element18 = new StaticLayoutData();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        element18.setSize(new Dimension(100.0f, 15));
        element18.setAlign(Alignment17.CENTER);
        element18.setYOffset(-1);
        progressBar2.addBasicElement(element18);
        element18.onAttributesInitialized();
        element18.onChildrenAdded();
        progressBar2.onChildrenAdded();
        final Container checkOut20 = Container.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setStyle("ProgressBar");
        checkOut20.setNonBlocking(true);
        checkOut14.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        final StaticLayoutData element19 = new StaticLayoutData();
        element19.onCheckOut();
        element19.setElementMap(elementMap);
        element19.setSize(new Dimension(100.0f, 15));
        element19.setAlign(Alignment17.CENTER);
        element19.setYOffset(-1);
        checkOut20.addBasicElement(element19);
        element19.onAttributesInitialized();
        element19.onChildrenAdded();
        checkOut20.onChildrenAdded();
        checkOut14.onChildrenAdded();
        element8.onChildrenAdded();
        checkOut10.onChildrenAdded();
        checkOut2.onChildrenAdded();
        checkOut.onChildrenAdded();
        watcherContainer.onChildrenAdded();
        return watcherContainer;
    }
}
