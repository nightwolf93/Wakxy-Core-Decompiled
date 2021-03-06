package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.*;
import java.awt.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.appearance.*;
import com.ankamagames.xulor2.core.renderer.condition.*;
import com.ankamagames.xulor2.component.*;

public class GovernmentMemberDetailsDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public GovernmentMemberDetailsDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final String id = "governorMemberDetailWindow";
        final Window element = new Window();
        element.onCheckOut();
        element.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, element);
        }
        element.onAttributesInitialized();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setInitValue(true);
        element2.setSize(new Dimension(-2, -2));
        element2.setAlign(Alignment17.NORTH_EAST);
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        final WindowMovePoint element3 = new WindowMovePoint();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element.addBasicElement(element3);
        element3.onAttributesInitialized();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setStyle("challengeCurrent");
        checkOut.setPrefSize(new Dimension(390, 0));
        element3.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final DecoratorAppearance appearance = checkOut.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Padding element4 = new Padding();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setInsets(new Insets(5, 25, 25, 30));
        appearance.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        appearance.onChildrenAdded();
        final RowLayout checkOut2 = RowLayout.checkOut();
        checkOut2.setHorizontal(false);
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final Container checkOut3 = Container.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setExpandable(false);
        checkOut.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        final StaticLayout element5 = new StaticLayout();
        element5.onCheckOut();
        element5.setAdaptToContentSize(true);
        checkOut3.addBasicElement(element5);
        element5.onAttributesInitialized();
        element5.onChildrenAdded();
        final Container checkOut4 = Container.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut3.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        final StaticLayoutData element6 = new StaticLayoutData();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setAlign(Alignment17.CENTER);
        element6.setSize(new Dimension(100.0f, 100.0f));
        checkOut4.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        final DecoratorAppearance appearance2 = checkOut4.getAppearance();
        appearance2.setElementMap(elementMap);
        checkOut4.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut5 = Margin.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setInsets(new Insets(0, 70, 0, 0));
        appearance2.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        appearance2.onChildrenAdded();
        final RowLayout checkOut6 = RowLayout.checkOut();
        checkOut6.setHorizontal(false);
        checkOut6.setAlign(Alignment9.NORTH);
        checkOut4.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final Container checkOut7 = Container.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setExpandable(false);
        checkOut4.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        final StaticLayout element7 = new StaticLayout();
        element7.onCheckOut();
        element7.setAdaptToContentSize(true);
        checkOut7.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        final Container checkOut8 = Container.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setExpandable(false);
        checkOut7.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        final StaticLayoutData element8 = new StaticLayoutData();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setAlign(Alignment17.CENTER);
        element8.setSize(new Dimension(100.0f, 100.0f));
        element8.setYOffset(-5);
        checkOut8.addBasicElement(element8);
        element8.onAttributesInitialized();
        element8.onChildrenAdded();
        final DecoratorAppearance appearance3 = checkOut8.getAppearance();
        appearance3.setElementMap(elementMap);
        checkOut8.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Margin checkOut9 = Margin.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setInsets(new Insets(0, 0, 2, 0));
        appearance3.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final Padding element9 = new Padding();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setInsets(new Insets(0, 9, 2, 9));
        appearance3.addBasicElement(element9);
        element9.onAttributesInitialized();
        element9.onChildrenAdded();
        appearance3.onChildrenAdded();
        final StaticLayout element10 = new StaticLayout();
        element10.onCheckOut();
        element10.setAdaptToContentSize(true);
        checkOut8.addBasicElement(element10);
        element10.onAttributesInitialized();
        element10.onChildrenAdded();
        final Container checkOut10 = Container.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setStyle("EncyclopediaSplashTitle");
        checkOut8.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        final StaticLayoutData element11 = new StaticLayoutData();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        element11.setAlign(Alignment17.WEST);
        element11.setSize(new Dimension(100.0f, 38));
        element11.setXOffset(-20);
        checkOut10.addBasicElement(element11);
        element11.onAttributesInitialized();
        element11.onChildrenAdded();
        final StaticLayout element12 = new StaticLayout();
        element12.onCheckOut();
        element12.setAdaptToContentSize(true);
        checkOut10.addBasicElement(element12);
        element12.onAttributesInitialized();
        element12.onChildrenAdded();
        final DecoratorAppearance appearance4 = checkOut10.getAppearance();
        appearance4.setElementMap(elementMap);
        checkOut10.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final Padding element13 = new Padding();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element13.setInsets(new Insets(0, 25, 0, 0));
        appearance4.addBasicElement(element13);
        element13.onAttributesInitialized();
        element13.onChildrenAdded();
        appearance4.onChildrenAdded();
        final TextView element14 = new TextView();
        element14.onCheckOut();
        element14.setElementMap(elementMap);
        element14.setStyle("titleName16");
        element14.setNonBlocking(true);
        element14.setExpandable(false);
        element14.setMultiline(false);
        checkOut10.addBasicElement(element14);
        element14.onAttributesInitialized();
        final StaticLayoutData element15 = new StaticLayoutData();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element15.setAlign(Alignment17.WEST);
        element14.addBasicElement(element15);
        element15.onAttributesInitialized();
        element15.onChildrenAdded();
        final DecoratorAppearance appearance5 = element14.getAppearance();
        appearance5.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance5).setAlignment(Alignment9.WEST);
        element14.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final ColorElement checkOut11 = ColorElement.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setName("text");
        checkOut11.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        appearance5.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        appearance5.onChildrenAdded();
        final PropertyElement checkOut12 = PropertyElement.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setLocal(true);
        checkOut12.setField("name");
        checkOut12.setName("governmentMemberDetails");
        checkOut12.setAttribute("text");
        element14.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        element14.onChildrenAdded();
        checkOut10.onChildrenAdded();
        final String id2 = "closeButton";
        final Button button = new Button();
        button.onCheckOut();
        button.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, button);
        }
        button.setStyle("backgroundDisplayClose");
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("unloadDialog");
        button.setOnClick(onClick);
        checkOut8.addBasicElement(button);
        button.onAttributesInitialized();
        final StaticLayoutData element16 = new StaticLayoutData();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        element16.setAlign(Alignment17.NORTH_EAST);
        button.addBasicElement(element16);
        element16.onAttributesInitialized();
        element16.onChildrenAdded();
        final DecoratorAppearance appearance6 = button.getAppearance();
        appearance6.setElementMap(elementMap);
        button.addBasicElement(appearance6);
        appearance6.onAttributesInitialized();
        final Margin checkOut13 = Margin.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setInsets(new Insets(5, 0, 0, 0));
        appearance6.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        appearance6.onChildrenAdded();
        button.onChildrenAdded();
        checkOut8.onChildrenAdded();
        checkOut7.onChildrenAdded();
        final Container checkOut14 = Container.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setExpandable(false);
        checkOut14.setNonBlocking(true);
        checkOut4.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        final DecoratorAppearance appearance7 = checkOut14.getAppearance();
        appearance7.setElementMap(elementMap);
        checkOut14.addBasicElement(appearance7);
        appearance7.onAttributesInitialized();
        final Margin checkOut15 = Margin.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setInsets(new Insets(0, 15, 0, 10));
        appearance7.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        appearance7.onChildrenAdded();
        final StaticLayout element17 = new StaticLayout();
        element17.onCheckOut();
        element17.setAdaptToContentSize(true);
        checkOut14.addBasicElement(element17);
        element17.onAttributesInitialized();
        element17.onChildrenAdded();
        final Container checkOut16 = Container.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setStyle("TiledScrollCenter");
        checkOut16.setPrefSize(new Dimension(334, 30));
        checkOut16.setNonBlocking(true);
        checkOut14.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        final StaticLayoutData element18 = new StaticLayoutData();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        element18.setAlign(Alignment17.WEST);
        checkOut16.addBasicElement(element18);
        element18.onAttributesInitialized();
        element18.onChildrenAdded();
        checkOut16.onChildrenAdded();
        final Image element19 = new Image();
        element19.onCheckOut();
        element19.setElementMap(elementMap);
        element19.setStyle("TiledScrollTop");
        element19.setNonBlocking(true);
        checkOut14.addBasicElement(element19);
        element19.onAttributesInitialized();
        final StaticLayoutData element20 = new StaticLayoutData();
        element20.onCheckOut();
        element20.setElementMap(elementMap);
        element20.setAlign(Alignment17.NORTH_WEST);
        element19.addBasicElement(element20);
        element20.onAttributesInitialized();
        element20.onChildrenAdded();
        element19.onChildrenAdded();
        final Image element21 = new Image();
        element21.onCheckOut();
        element21.setElementMap(elementMap);
        element21.setStyle("TiledScrollBottom");
        element21.setNonBlocking(true);
        checkOut14.addBasicElement(element21);
        element21.onAttributesInitialized();
        final StaticLayoutData element22 = new StaticLayoutData();
        element22.onCheckOut();
        element22.setElementMap(elementMap);
        element22.setAlign(Alignment17.SOUTH_WEST);
        element21.addBasicElement(element22);
        element22.onAttributesInitialized();
        element22.onChildrenAdded();
        element21.onChildrenAdded();
        final Container checkOut17 = Container.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setNonBlocking(true);
        checkOut14.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        final StaticLayoutData element23 = new StaticLayoutData();
        element23.onCheckOut();
        element23.setElementMap(elementMap);
        element23.setAlign(Alignment17.EAST);
        element23.setSize(new Dimension(100.0f, 100.0f));
        checkOut17.addBasicElement(element23);
        element23.onAttributesInitialized();
        element23.onChildrenAdded();
        final RowLayout checkOut18 = RowLayout.checkOut();
        checkOut18.setAlign(Alignment9.WEST);
        checkOut17.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        final Label element24 = new Label();
        element24.onCheckOut();
        element24.setElementMap(elementMap);
        element24.setStyle("blackBold");
        element24.setExpandable(false);
        element24.setText("%nation.rank%%colon%".replace("%nation.rank%", Xulor.getInstance().getTranslatedString("nation.rank")).replace("%colon%", Xulor.getInstance().getTranslatedString("colon")));
        element24.setNonBlocking(true);
        checkOut17.addBasicElement(element24);
        element24.onAttributesInitialized();
        element24.onChildrenAdded();
        final TextView element25 = new TextView();
        element25.onCheckOut();
        element25.setElementMap(elementMap);
        element25.setStyle("DefaultDarkBold14");
        element25.setExpandable(false);
        element25.setNonBlocking(true);
        checkOut17.addBasicElement(element25);
        element25.onAttributesInitialized();
        final PropertyElement checkOut19 = PropertyElement.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setLocal(true);
        checkOut19.setAttribute("text");
        checkOut19.setName("governmentMemberDetails");
        checkOut19.setField("rankDescription");
        element25.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        checkOut19.onChildrenAdded();
        element25.onChildrenAdded();
        final Spacer element26 = new Spacer();
        element26.onCheckOut();
        element26.setElementMap(elementMap);
        element26.setNonBlocking(true);
        checkOut17.addBasicElement(element26);
        element26.onAttributesInitialized();
        element26.onChildrenAdded();
        final Image element27 = new Image();
        element27.onCheckOut();
        element27.setElementMap(elementMap);
        element27.setExpandable(false);
        element27.setNonBlocking(true);
        checkOut17.addBasicElement(element27);
        element27.onAttributesInitialized();
        final StaticLayoutData element28 = new StaticLayoutData();
        element28.onCheckOut();
        element28.setElementMap(elementMap);
        element28.setAlign(Alignment17.EAST);
        element27.addBasicElement(element28);
        element28.onAttributesInitialized();
        element28.onChildrenAdded();
        final PropertyElement checkOut20 = PropertyElement.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setLocal(true);
        checkOut20.setName("governmentMemberDetails");
        checkOut20.setAttribute("style");
        checkOut20.setField("wakfuValue");
        element27.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        final ConditionResult element29 = new ConditionResult();
        element29.onCheckOut();
        element29.setElementMap(elementMap);
        element29.setValue("StasisIcon");
        element29.setElseValue("WakfuIcon");
        checkOut20.addBasicElement(element29);
        element29.onAttributesInitialized();
        final LessCondition element30 = new LessCondition();
        element30.onCheckOut();
        element30.setElementMap(elementMap);
        element30.setValue("0");
        element29.addBasicElement(element30);
        element30.onAttributesInitialized();
        element30.onChildrenAdded();
        element29.onChildrenAdded();
        checkOut20.onChildrenAdded();
        final DecoratorAppearance appearance8 = element27.getAppearance();
        appearance8.setElementMap(elementMap);
        element27.addBasicElement(appearance8);
        appearance8.onAttributesInitialized();
        final PropertyElement checkOut21 = PropertyElement.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setLocal(true);
        checkOut21.setName("governmentMemberDetails");
        checkOut21.setAttribute("modulationColor");
        checkOut21.setField("wakfuStasisColor");
        appearance8.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        checkOut21.onChildrenAdded();
        appearance8.onChildrenAdded();
        element27.onChildrenAdded();
        final Label element31 = new Label();
        element31.onCheckOut();
        element31.setElementMap(elementMap);
        element31.setStyle("darkBold");
        element31.setExpandable(false);
        element31.setNonBlocking(true);
        checkOut17.addBasicElement(element31);
        element31.onAttributesInitialized();
        final PropertyElement checkOut22 = PropertyElement.checkOut();
        checkOut22.setElementMap(elementMap);
        checkOut22.setLocal(true);
        checkOut22.setName("governmentMemberDetails");
        checkOut22.setAttribute("text");
        checkOut22.setField("wakfuStasisDescription");
        element31.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        element31.onChildrenAdded();
        checkOut17.onChildrenAdded();
        checkOut14.onChildrenAdded();
        final Container checkOut23 = Container.checkOut();
        checkOut23.setElementMap(elementMap);
        checkOut23.setExpandable(false);
        checkOut4.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        final DecoratorAppearance appearance9 = checkOut23.getAppearance();
        appearance9.setElementMap(elementMap);
        checkOut23.addBasicElement(appearance9);
        appearance9.onAttributesInitialized();
        final Margin checkOut24 = Margin.checkOut();
        checkOut24.setElementMap(elementMap);
        checkOut24.setInsets(new Insets(0, 15, 0, 0));
        appearance9.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        checkOut24.onChildrenAdded();
        appearance9.onChildrenAdded();
        final StaticLayout element32 = new StaticLayout();
        element32.onCheckOut();
        element32.setAdaptToContentSize(true);
        checkOut23.addBasicElement(element32);
        element32.onAttributesInitialized();
        element32.onChildrenAdded();
        final Container checkOut25 = Container.checkOut();
        checkOut25.setElementMap(elementMap);
        checkOut25.setStyle("TiledScrollCenter");
        checkOut25.setPrefSize(new Dimension(334, 30));
        checkOut25.setNonBlocking(true);
        checkOut23.addBasicElement(checkOut25);
        checkOut25.onAttributesInitialized();
        final StaticLayoutData element33 = new StaticLayoutData();
        element33.onCheckOut();
        element33.setElementMap(elementMap);
        element33.setAlign(Alignment17.WEST);
        checkOut25.addBasicElement(element33);
        element33.onAttributesInitialized();
        element33.onChildrenAdded();
        checkOut25.onChildrenAdded();
        final Image element34 = new Image();
        element34.onCheckOut();
        element34.setElementMap(elementMap);
        element34.setStyle("TiledScrollTop");
        element34.setNonBlocking(true);
        checkOut23.addBasicElement(element34);
        element34.onAttributesInitialized();
        final StaticLayoutData element35 = new StaticLayoutData();
        element35.onCheckOut();
        element35.setElementMap(elementMap);
        element35.setAlign(Alignment17.NORTH_WEST);
        element34.addBasicElement(element35);
        element35.onAttributesInitialized();
        element35.onChildrenAdded();
        element34.onChildrenAdded();
        final Image element36 = new Image();
        element36.onCheckOut();
        element36.setElementMap(elementMap);
        element36.setStyle("TiledScrollBottom");
        element36.setNonBlocking(true);
        checkOut23.addBasicElement(element36);
        element36.onAttributesInitialized();
        this.method0(element36);
        element36.onChildrenAdded();
        this.method1(checkOut23);
        checkOut23.onChildrenAdded();
        checkOut4.onChildrenAdded();
        this.method2(checkOut3);
        checkOut3.onChildrenAdded();
        checkOut.onChildrenAdded();
        element3.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method0(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setAlign(Alignment17.SOUTH_WEST);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method1(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setAlign(Alignment17.EAST);
        element.setSize(new Dimension(100.0f, 100.0f));
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final RowLayout checkOut2 = RowLayout.checkOut();
        checkOut2.setAlign(Alignment9.WEST);
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final Label element2 = new Label();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setStyle("blackBold");
        element2.setExpandable(false);
        element2.setText("%desc.guild%%colon%".replace("%desc.guild%", Xulor.getInstance().getTranslatedString("desc.guild")).replace("%colon%", Xulor.getInstance().getTranslatedString("colon")));
        element2.setNonBlocking(true);
        checkOut.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        final TextView element3 = new TextView();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setStyle("DefaultDarkBold14");
        element3.setExpandable(false);
        element3.setNonBlocking(true);
        checkOut.addBasicElement(element3);
        element3.onAttributesInitialized();
        final PropertyElement checkOut3 = PropertyElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setLocal(true);
        checkOut3.setAttribute("text");
        checkOut3.setName("governmentMemberDetails");
        checkOut3.setField("guildName");
        element3.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        final ConditionResult element4 = new ConditionResult();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setElseValue("-");
        element4.setReturnOriginalValue(true);
        checkOut3.addBasicElement(element4);
        element4.onAttributesInitialized();
        final NotNullCondition element5 = new NotNullCondition();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element4.addBasicElement(element5);
        element5.onAttributesInitialized();
        element5.onChildrenAdded();
        element4.onChildrenAdded();
        checkOut3.onChildrenAdded();
        element3.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method2(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setExpandable(false);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setAlign(Alignment17.WEST);
        element.setSize(new Dimension(-2, 100.0f));
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final StaticLayout element2 = new StaticLayout();
        element2.onCheckOut();
        element2.setAdaptToContentSize(true);
        checkOut.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        final Container checkOut2 = Container.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        final StaticLayoutData element3 = new StaticLayoutData();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setAlign(Alignment17.NORTH);
        checkOut2.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        final StaticLayout element4 = new StaticLayout();
        element4.onCheckOut();
        element4.setAdaptToContentSize(true);
        checkOut2.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        final Image element5 = new Image();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setStyle("Portrait");
        element5.setNonBlocking(true);
        checkOut2.addBasicElement(element5);
        element5.onAttributesInitialized();
        final StaticLayoutData element6 = new StaticLayoutData();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setAlign(Alignment17.CENTER);
        element6.setSize(new Dimension(87, 102));
        element5.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        element5.onChildrenAdded();
        final Container checkOut3 = Container.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setNeedsScissor(true);
        checkOut2.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        final StaticLayoutData element7 = new StaticLayoutData();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setAlign(Alignment17.CENTER);
        element7.setSize(new Dimension(55, 68));
        element7.setXOffset(-1);
        checkOut3.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        final AnimatedElementViewer element8 = new AnimatedElementViewer();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setOffsetY(-125.0f);
        element8.setOffsetX(0.0f);
        element8.setScale(2.2f);
        element8.setAnimName("AnimStatique");
        element8.setDirection(2);
        element8.setNonBlocking(true);
        checkOut3.addBasicElement(element8);
        element8.onAttributesInitialized();
        final PropertyElement checkOut4 = PropertyElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setLocal(true);
        checkOut4.setField("actorDescriptorLibrary");
        checkOut4.setName("governmentMemberDetails");
        checkOut4.setAttribute("animatedElement");
        element8.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        element8.onChildrenAdded();
        checkOut3.onChildrenAdded();
        checkOut2.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
}
