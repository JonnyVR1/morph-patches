package org.fourthline.cling.binding.xml;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import org.fourthline.cling.binding.staging.MutableAction;
import org.fourthline.cling.binding.staging.MutableActionArgument;
import org.fourthline.cling.binding.staging.MutableAllowedValueRange;
import org.fourthline.cling.binding.staging.MutableService;
import org.fourthline.cling.binding.staging.MutableStateVariable;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.meta.StateVariableEventDetails;
import org.fourthline.cling.model.types.CustomDatatype;
import org.fourthline.cling.model.types.Datatype;
import org.seamless.xml.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import p149l.pfj0;

/* JADX INFO: loaded from: classes3.dex */
public class UDA10ServiceDescriptorBinderSAXImpl extends UDA10ServiceDescriptorBinderImpl {
    private static Logger log = Logger.getLogger(ServiceDescriptorBinder.class.getName());

    /* JADX INFO: renamed from: org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl$1 */
    public static /* synthetic */ class C219821 {

        /* JADX INFO: renamed from: $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT */
        static final /* synthetic */ int[] f205907x632136c5;

        static {
            int[] iArr = new int[Descriptor.Service.ELEMENT.values().length];
            f205907x632136c5 = iArr;
            try {
                iArr[Descriptor.Service.ELEMENT.name.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f205907x632136c5[Descriptor.Service.ELEMENT.direction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f205907x632136c5[Descriptor.Service.ELEMENT.relatedStateVariable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f205907x632136c5[Descriptor.Service.ELEMENT.retval.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f205907x632136c5[Descriptor.Service.ELEMENT.dataType.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f205907x632136c5[Descriptor.Service.ELEMENT.defaultValue.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f205907x632136c5[Descriptor.Service.ELEMENT.allowedValue.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f205907x632136c5[Descriptor.Service.ELEMENT.minimum.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f205907x632136c5[Descriptor.Service.ELEMENT.maximum.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f205907x632136c5[Descriptor.Service.ELEMENT.step.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class ActionArgumentHandler extends ServiceDescriptorHandler<MutableActionArgument> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Service.ELEMENT f205908EL = Descriptor.Service.ELEMENT.argument;

        public ActionArgumentHandler(MutableActionArgument mutableActionArgument, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(mutableActionArgument, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void endElement(Descriptor.Service.ELEMENT element) throws SAXException {
            int i = C219821.f205907x632136c5[element.ordinal()];
            if (i == 1) {
                getInstance().name = getCharacters();
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    getInstance().relatedStateVariable = getCharacters();
                    return;
                } else {
                    if (i != 4) {
                        return;
                    }
                    getInstance().retval = true;
                    return;
                }
            }
            String characters = getCharacters();
            try {
                getInstance().direction = ActionArgument.Direction.valueOf(characters.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException unused) {
                UDA10ServiceDescriptorBinderSAXImpl.log.warning("UPnP specification violation: Invalid action argument direction, assuming 'IN': " + characters);
                getInstance().direction = ActionArgument.Direction.IN;
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(f205908EL);
        }
    }

    public static class ActionArgumentListHandler extends ServiceDescriptorHandler<List<MutableActionArgument>> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Service.ELEMENT f205909EL = Descriptor.Service.ELEMENT.argumentList;

        public ActionArgumentListHandler(List<MutableActionArgument> list, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(list, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(f205909EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(ActionArgumentHandler.f205908EL)) {
                MutableActionArgument mutableActionArgument = new MutableActionArgument();
                getInstance().add(mutableActionArgument);
                new ActionArgumentHandler(mutableActionArgument, this);
            }
        }
    }

    public static class ActionHandler extends ServiceDescriptorHandler<MutableAction> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Service.ELEMENT f205910EL = Descriptor.Service.ELEMENT.action;

        public ActionHandler(MutableAction mutableAction, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(mutableAction, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void endElement(Descriptor.Service.ELEMENT element) throws SAXException {
            if (C219821.f205907x632136c5[element.ordinal()] != 1) {
                return;
            }
            getInstance().name = getCharacters();
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(f205910EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(ActionArgumentListHandler.f205909EL)) {
                ArrayList arrayList = new ArrayList();
                getInstance().arguments = arrayList;
                new ActionArgumentListHandler(arrayList, this);
            }
        }
    }

    public static class ActionListHandler extends ServiceDescriptorHandler<List<MutableAction>> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Service.ELEMENT f205911EL = Descriptor.Service.ELEMENT.actionList;

        public ActionListHandler(List<MutableAction> list, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(list, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(f205911EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(ActionHandler.f205910EL)) {
                MutableAction mutableAction = new MutableAction();
                getInstance().add(mutableAction);
                new ActionHandler(mutableAction, this);
            }
        }
    }

    public static class AllowedValueListHandler extends ServiceDescriptorHandler<List<String>> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Service.ELEMENT f205912EL = Descriptor.Service.ELEMENT.allowedValueList;

        public AllowedValueListHandler(List<String> list, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(list, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void endElement(Descriptor.Service.ELEMENT element) throws SAXException {
            if (C219821.f205907x632136c5[element.ordinal()] != 7) {
                return;
            }
            getInstance().add(getCharacters());
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(f205912EL);
        }
    }

    public static class AllowedValueRangeHandler extends ServiceDescriptorHandler<MutableAllowedValueRange> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Service.ELEMENT f205913EL = Descriptor.Service.ELEMENT.allowedValueRange;

        public AllowedValueRangeHandler(MutableAllowedValueRange mutableAllowedValueRange, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(mutableAllowedValueRange, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void endElement(Descriptor.Service.ELEMENT element) throws SAXException {
            try {
                switch (C219821.f205907x632136c5[element.ordinal()]) {
                    case 8:
                        getInstance().minimum = Long.valueOf(getCharacters());
                        break;
                    case 9:
                        getInstance().maximum = Long.valueOf(getCharacters());
                        break;
                    case 10:
                        getInstance().step = Long.valueOf(getCharacters());
                        break;
                    default:
                        break;
                }
            } catch (Exception unused) {
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(f205913EL);
        }
    }

    public static class RootHandler extends ServiceDescriptorHandler<MutableService> {
        public RootHandler(MutableService mutableService, SAXParser sAXParser) {
            super(mutableService, sAXParser);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(ActionListHandler.f205911EL)) {
                ArrayList arrayList = new ArrayList();
                getInstance().actions = arrayList;
                new ActionListHandler(arrayList, this);
            }
            if (element.equals(StateVariableListHandler.f205915EL)) {
                ArrayList arrayList2 = new ArrayList();
                getInstance().stateVariables = arrayList2;
                new StateVariableListHandler(arrayList2, this);
            }
        }
    }

    public static class StateVariableHandler extends ServiceDescriptorHandler<MutableStateVariable> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Service.ELEMENT f205914EL = Descriptor.Service.ELEMENT.stateVariable;

        public StateVariableHandler(MutableStateVariable mutableStateVariable, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(mutableStateVariable, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void endElement(Descriptor.Service.ELEMENT element) throws SAXException {
            int i = C219821.f205907x632136c5[element.ordinal()];
            if (i == 1) {
                getInstance().name = getCharacters();
                return;
            }
            if (i != 5) {
                if (i != 6) {
                    return;
                }
                getInstance().defaultValue = getCharacters();
            } else {
                String characters = getCharacters();
                Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(characters);
                getInstance().dataType = byDescriptorName != null ? byDescriptorName.getDatatype() : new CustomDatatype(characters);
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(f205914EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(AllowedValueListHandler.f205912EL)) {
                ArrayList arrayList = new ArrayList();
                getInstance().allowedValues = arrayList;
                new AllowedValueListHandler(arrayList, this);
            }
            if (element.equals(AllowedValueRangeHandler.f205913EL)) {
                MutableAllowedValueRange mutableAllowedValueRange = new MutableAllowedValueRange();
                getInstance().allowedValueRange = mutableAllowedValueRange;
                new AllowedValueRangeHandler(mutableAllowedValueRange, this);
            }
        }
    }

    public static class StateVariableListHandler extends ServiceDescriptorHandler<List<MutableStateVariable>> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Service.ELEMENT f205915EL = Descriptor.Service.ELEMENT.serviceStateTable;

        public StateVariableListHandler(List<MutableStateVariable> list, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(list, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(f205915EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(StateVariableHandler.f205914EL)) {
                MutableStateVariable mutableStateVariable = new MutableStateVariable();
                String value = attributes.getValue(Descriptor.Service.ATTRIBUTE.sendEvents.toString());
                mutableStateVariable.eventDetails = new StateVariableEventDetails(value != null && value.toUpperCase(Locale.ROOT).equals("YES"));
                getInstance().add(mutableStateVariable);
                new StateVariableHandler(mutableStateVariable, this);
            }
        }
    }

    @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderImpl, org.fourthline.cling.binding.xml.ServiceDescriptorBinder
    public <S extends Service> S describe(S s, String str) throws ValidationException, DescriptorBindingException {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            log.fine("Reading service from XML descriptor");
            SAXParser sAXParser = new SAXParser();
            MutableService mutableService = new MutableService();
            hydrateBasic(mutableService, s);
            new RootHandler(mutableService, sAXParser);
            sAXParser.parse(new InputSource(new StringReader(str.trim())));
            return (S) mutableService.build(s.getDevice());
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            pfj0.m168641a("Could not parse service descriptor: ", e2);
            return null;
        }
    }

    public static class ServiceDescriptorHandler<I> extends SAXParser.Handler<I> {
        public ServiceDescriptorHandler(I i) {
            super(i);
        }

        @Override // org.seamless.xml.SAXParser.Handler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            super.endElement(str, str2, str3);
            Descriptor.Service.ELEMENT elementValueOrNullOf = Descriptor.Service.ELEMENT.valueOrNullOf(str2);
            if (elementValueOrNullOf == null) {
                return;
            }
            endElement(elementValueOrNullOf);
        }

        @Override // org.seamless.xml.SAXParser.Handler
        public boolean isLastElement(String str, String str2, String str3) {
            Descriptor.Service.ELEMENT elementValueOrNullOf = Descriptor.Service.ELEMENT.valueOrNullOf(str2);
            return elementValueOrNullOf != null && isLastElement(elementValueOrNullOf);
        }

        @Override // org.seamless.xml.SAXParser.Handler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            super.startElement(str, str2, str3, attributes);
            Descriptor.Service.ELEMENT elementValueOrNullOf = Descriptor.Service.ELEMENT.valueOrNullOf(str2);
            if (elementValueOrNullOf == null) {
                return;
            }
            startElement(elementValueOrNullOf, attributes);
        }

        public ServiceDescriptorHandler(I i, SAXParser sAXParser) {
            super(i, sAXParser);
        }

        public ServiceDescriptorHandler(I i, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(i, serviceDescriptorHandler);
        }

        public ServiceDescriptorHandler(I i, SAXParser sAXParser, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(i, sAXParser, serviceDescriptorHandler);
        }

        public void endElement(Descriptor.Service.ELEMENT element) throws SAXException {
        }

        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) throws SAXException {
        }

        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return false;
        }
    }
}
