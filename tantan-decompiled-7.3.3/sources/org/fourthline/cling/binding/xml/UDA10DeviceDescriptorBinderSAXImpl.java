package org.fourthline.cling.binding.xml;

import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.binding.staging.MutableDevice;
import org.fourthline.cling.binding.staging.MutableIcon;
import org.fourthline.cling.binding.staging.MutableService;
import org.fourthline.cling.binding.staging.MutableUDAVersion;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.types.DLNACaps;
import org.fourthline.cling.model.types.DLNADoc;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.model.types.ServiceId;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDN;
import org.seamless.util.MimeType;
import org.seamless.xml.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import p153l.toj0;

/* JADX INFO: loaded from: classes3.dex */
public class UDA10DeviceDescriptorBinderSAXImpl extends UDA10DeviceDescriptorBinderImpl {
    private static Logger log = Logger.getLogger(DeviceDescriptorBinder.class.getName());

    /* JADX INFO: renamed from: org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl$1 */
    public static /* synthetic */ class C221021 {

        /* JADX INFO: renamed from: $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT */
        static final /* synthetic */ int[] f206828xcea4acb6;

        static {
            int[] iArr = new int[Descriptor.Device.ELEMENT.values().length];
            f206828xcea4acb6 = iArr;
            try {
                iArr[Descriptor.Device.ELEMENT.URLBase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.major.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.minor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.deviceType.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.friendlyName.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.manufacturer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.manufacturerURL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.modelDescription.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.modelName.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.modelNumber.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.modelURL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.presentationURL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.UPC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.serialNumber.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.UDN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.X_DLNADOC.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.X_DLNACAP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.width.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.height.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.depth.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.url.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.mimetype.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.serviceType.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.serviceId.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.SCPDURL.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.controlURL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f206828xcea4acb6[Descriptor.Device.ELEMENT.eventSubURL.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static class DeviceHandler extends DeviceDescriptorHandler<MutableDevice> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Device.ELEMENT f206829EL = Descriptor.Device.ELEMENT.device;

        public DeviceHandler(MutableDevice mutableDevice, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(mutableDevice, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void endElement(Descriptor.Device.ELEMENT element) throws SAXException {
            switch (C221021.f206828xcea4acb6[element.ordinal()]) {
                case 4:
                    getInstance().deviceType = getCharacters();
                    break;
                case 5:
                    getInstance().friendlyName = getCharacters();
                    break;
                case 6:
                    getInstance().manufacturer = getCharacters();
                    break;
                case 7:
                    getInstance().manufacturerURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                    break;
                case 8:
                    getInstance().modelDescription = getCharacters();
                    break;
                case 9:
                    getInstance().modelName = getCharacters();
                    break;
                case 10:
                    getInstance().modelNumber = getCharacters();
                    break;
                case 11:
                    getInstance().modelURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                    break;
                case 12:
                    getInstance().presentationURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                    break;
                case 13:
                    getInstance().upc = getCharacters();
                    break;
                case 14:
                    getInstance().serialNumber = getCharacters();
                    break;
                case 15:
                    getInstance().udn = UDN.valueOf(getCharacters());
                    break;
                case 16:
                    String characters = getCharacters();
                    try {
                        getInstance().dlnaDocs.add(DLNADoc.valueOf(characters));
                    } catch (InvalidValueException unused) {
                        UDA10DeviceDescriptorBinderSAXImpl.log.info("Invalid X_DLNADOC value, ignoring value: " + characters);
                        return;
                    }
                    break;
                case 17:
                    getInstance().dlnaCaps = DLNACaps.valueOf(getCharacters());
                    break;
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(f206829EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(IconListHandler.f206832EL)) {
                ArrayList arrayList = new ArrayList();
                getInstance().icons = arrayList;
                new IconListHandler(arrayList, this);
            }
            if (element.equals(ServiceListHandler.f206834EL)) {
                ArrayList arrayList2 = new ArrayList();
                getInstance().services = arrayList2;
                new ServiceListHandler(arrayList2, this);
            }
            if (element.equals(DeviceListHandler.f206830EL)) {
                ArrayList arrayList3 = new ArrayList();
                getInstance().embeddedDevices = arrayList3;
                new DeviceListHandler(arrayList3, this);
            }
        }
    }

    public static class DeviceListHandler extends DeviceDescriptorHandler<List<MutableDevice>> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Device.ELEMENT f206830EL = Descriptor.Device.ELEMENT.deviceList;

        public DeviceListHandler(List<MutableDevice> list, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(list, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(f206830EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(DeviceHandler.f206829EL)) {
                MutableDevice mutableDevice = new MutableDevice();
                getInstance().add(mutableDevice);
                new DeviceHandler(mutableDevice, this);
            }
        }
    }

    public static class IconHandler extends DeviceDescriptorHandler<MutableIcon> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Device.ELEMENT f206831EL = Descriptor.Device.ELEMENT.icon;

        public IconHandler(MutableIcon mutableIcon, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(mutableIcon, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void endElement(Descriptor.Device.ELEMENT element) throws SAXException {
            switch (C221021.f206828xcea4acb6[element.ordinal()]) {
                case 18:
                    getInstance().width = Integer.valueOf(getCharacters()).intValue();
                    break;
                case 19:
                    getInstance().height = Integer.valueOf(getCharacters()).intValue();
                    break;
                case 20:
                    try {
                        getInstance().depth = Integer.valueOf(getCharacters()).intValue();
                    } catch (NumberFormatException e) {
                        UDA10DeviceDescriptorBinderSAXImpl.log.warning("Invalid icon depth '" + getCharacters() + "', using 16 as default: " + e);
                        getInstance().depth = 16;
                        return;
                    }
                    break;
                case 21:
                    getInstance().uri = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                    break;
                case 22:
                    try {
                        getInstance().mimeType = getCharacters();
                        MimeType.valueOf(getInstance().mimeType);
                    } catch (IllegalArgumentException unused) {
                        UDA10DeviceDescriptorBinderSAXImpl.log.warning("Ignoring invalid icon mime type: " + getInstance().mimeType);
                        getInstance().mimeType = "";
                        return;
                    }
                    break;
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(f206831EL);
        }
    }

    public static class IconListHandler extends DeviceDescriptorHandler<List<MutableIcon>> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Device.ELEMENT f206832EL = Descriptor.Device.ELEMENT.iconList;

        public IconListHandler(List<MutableIcon> list, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(list, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(f206832EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(IconHandler.f206831EL)) {
                MutableIcon mutableIcon = new MutableIcon();
                getInstance().add(mutableIcon);
                new IconHandler(mutableIcon, this);
            }
        }
    }

    public static class RootHandler extends DeviceDescriptorHandler<MutableDevice> {
        public RootHandler(MutableDevice mutableDevice, SAXParser sAXParser) {
            super(mutableDevice, sAXParser);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void endElement(Descriptor.Device.ELEMENT element) throws SAXException {
            if (C221021.f206828xcea4acb6[element.ordinal()] != 1) {
                return;
            }
            try {
                String characters = getCharacters();
                if (characters == null || characters.length() <= 0) {
                    return;
                }
                getInstance().baseURL = new URL(characters);
            } catch (Exception e) {
                throw new SAXException("Invalid URLBase: " + e.toString());
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(SpecVersionHandler.f206835EL)) {
                MutableUDAVersion mutableUDAVersion = new MutableUDAVersion();
                getInstance().udaVersion = mutableUDAVersion;
                new SpecVersionHandler(mutableUDAVersion, this);
            }
            if (element.equals(DeviceHandler.f206829EL)) {
                new DeviceHandler(getInstance(), this);
            }
        }
    }

    public static class ServiceHandler extends DeviceDescriptorHandler<MutableService> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Device.ELEMENT f206833EL = Descriptor.Device.ELEMENT.service;

        public ServiceHandler(MutableService mutableService, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(mutableService, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void endElement(Descriptor.Device.ELEMENT element) throws SAXException {
            try {
                switch (C221021.f206828xcea4acb6[element.ordinal()]) {
                    case 23:
                        getInstance().serviceType = ServiceType.valueOf(getCharacters());
                        break;
                    case 24:
                        getInstance().serviceId = ServiceId.valueOf(getCharacters());
                        break;
                    case 25:
                        getInstance().descriptorURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                        break;
                    case 26:
                        getInstance().controlURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                        break;
                    case 27:
                        getInstance().eventSubscriptionURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                        break;
                }
            } catch (InvalidValueException e) {
                UDA10DeviceDescriptorBinderSAXImpl.log.warning("UPnP specification violation, skipping invalid service declaration. " + e.getMessage());
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(f206833EL);
        }
    }

    public static class ServiceListHandler extends DeviceDescriptorHandler<List<MutableService>> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Device.ELEMENT f206834EL = Descriptor.Device.ELEMENT.serviceList;

        public ServiceListHandler(List<MutableService> list, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(list, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            boolean zEquals = element.equals(f206834EL);
            if (zEquals) {
                Iterator<MutableService> it = getInstance().iterator();
                while (it.hasNext()) {
                    MutableService next = it.next();
                    if (next.serviceType == null || next.serviceId == null) {
                        it.remove();
                    }
                }
            }
            return zEquals;
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) throws SAXException {
            if (element.equals(ServiceHandler.f206833EL)) {
                MutableService mutableService = new MutableService();
                getInstance().add(mutableService);
                new ServiceHandler(mutableService, this);
            }
        }
    }

    public static class SpecVersionHandler extends DeviceDescriptorHandler<MutableUDAVersion> {

        /* JADX INFO: renamed from: EL */
        public static final Descriptor.Device.ELEMENT f206835EL = Descriptor.Device.ELEMENT.specVersion;

        public SpecVersionHandler(MutableUDAVersion mutableUDAVersion, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(mutableUDAVersion, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void endElement(Descriptor.Device.ELEMENT element) throws SAXException {
            int i = C221021.f206828xcea4acb6[element.ordinal()];
            if (i == 2) {
                String strTrim = getCharacters().trim();
                if (!strTrim.equals("1")) {
                    UDA10DeviceDescriptorBinderSAXImpl.log.warning("Unsupported UDA major version, ignoring: ".concat(strTrim));
                    strTrim = "1";
                }
                getInstance().major = Integer.valueOf(strTrim).intValue();
                return;
            }
            if (i != 3) {
                return;
            }
            String strTrim2 = getCharacters().trim();
            if (!strTrim2.equals("0")) {
                UDA10DeviceDescriptorBinderSAXImpl.log.warning("Unsupported UDA minor version, ignoring: ".concat(strTrim2));
                strTrim2 = "0";
            }
            getInstance().minor = Integer.valueOf(strTrim2).intValue();
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(f206835EL);
        }
    }

    @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderImpl, org.fourthline.cling.binding.xml.DeviceDescriptorBinder
    public <D extends Device> D describe(D d, String str) throws ValidationException, DescriptorBindingException {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            log.fine("Populating device from XML descriptor: " + d);
            SAXParser sAXParser = new SAXParser();
            MutableDevice mutableDevice = new MutableDevice();
            new RootHandler(mutableDevice, sAXParser);
            sAXParser.parse(new InputSource(new StringReader(str.trim())));
            return (D) mutableDevice.build(d);
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            toj0.m192076a("Could not parse device descriptor: ", e2);
            return null;
        }
    }

    public static class DeviceDescriptorHandler<I> extends SAXParser.Handler<I> {
        public DeviceDescriptorHandler(I i) {
            super(i);
        }

        @Override // org.seamless.xml.SAXParser.Handler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            super.endElement(str, str2, str3);
            Descriptor.Device.ELEMENT elementValueOrNullOf = Descriptor.Device.ELEMENT.valueOrNullOf(str2);
            if (elementValueOrNullOf == null) {
                return;
            }
            endElement(elementValueOrNullOf);
        }

        @Override // org.seamless.xml.SAXParser.Handler
        public boolean isLastElement(String str, String str2, String str3) {
            Descriptor.Device.ELEMENT elementValueOrNullOf = Descriptor.Device.ELEMENT.valueOrNullOf(str2);
            return elementValueOrNullOf != null && isLastElement(elementValueOrNullOf);
        }

        @Override // org.seamless.xml.SAXParser.Handler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            super.startElement(str, str2, str3, attributes);
            Descriptor.Device.ELEMENT elementValueOrNullOf = Descriptor.Device.ELEMENT.valueOrNullOf(str2);
            if (elementValueOrNullOf == null) {
                return;
            }
            startElement(elementValueOrNullOf, attributes);
        }

        public DeviceDescriptorHandler(I i, SAXParser sAXParser) {
            super(i, sAXParser);
        }

        public DeviceDescriptorHandler(I i, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(i, deviceDescriptorHandler);
        }

        public DeviceDescriptorHandler(I i, SAXParser sAXParser, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(i, sAXParser, deviceDescriptorHandler);
        }

        public void endElement(Descriptor.Device.ELEMENT element) throws SAXException {
        }

        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) throws SAXException {
        }

        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return false;
        }
    }
}
