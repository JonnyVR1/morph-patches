package org.fourthline.cling.binding.xml;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.StringReader;
import java.net.URI;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.fourthline.cling.binding.staging.MutableDevice;
import org.fourthline.cling.binding.staging.MutableIcon;
import org.fourthline.cling.binding.staging.MutableService;
import org.fourthline.cling.model.Namespace;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.XMLUtil;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.meta.DeviceDetails;
import org.fourthline.cling.model.meta.Icon;
import org.fourthline.cling.model.meta.LocalDevice;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.meta.RemoteDevice;
import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.profile.RemoteClientInfo;
import org.fourthline.cling.model.types.DLNACaps;
import org.fourthline.cling.model.types.DLNADoc;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.model.types.ServiceId;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDN;
import org.seamless.util.Exceptions;
import org.seamless.util.MimeType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import p153l.toj0;

/* JADX INFO: loaded from: classes3.dex */
public class UDA10DeviceDescriptorBinderImpl implements DeviceDescriptorBinder, ErrorHandler {
    private static Logger log = Logger.getLogger(DeviceDescriptorBinder.class.getName());

    public static URI parseURI(String str) {
        if (str.startsWith("www.")) {
            str = "http://".concat(str);
        }
        if (str.contains(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)) {
            str = str.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "%20");
        }
        try {
            return URI.create(str);
        } catch (Throwable th) {
            log.fine("Illegal URI, trying with ./ prefix: " + Exceptions.unwrap(th));
            try {
                return URI.create("./" + str);
            } catch (IllegalArgumentException e) {
                log.warning("Illegal URI '" + str + "', ignoring value: " + Exceptions.unwrap(e));
                return null;
            }
        }
    }

    @Override // org.fourthline.cling.binding.xml.DeviceDescriptorBinder
    public Document buildDOM(Device device, RemoteClientInfo remoteClientInfo, Namespace namespace) throws DescriptorBindingException {
        try {
            log.fine("Generating DOM from device model: " + device);
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
            generateRoot(namespace, device, documentNewDocument, remoteClientInfo);
            return documentNewDocument;
        } catch (Exception e) {
            throw new DescriptorBindingException("Could not generate device descriptor: " + e.getMessage(), e);
        }
    }

    public <D extends Device> D buildInstance(D d, MutableDevice mutableDevice) throws ValidationException {
        return (D) mutableDevice.build(d);
    }

    @Override // org.fourthline.cling.binding.xml.DeviceDescriptorBinder
    public <D extends Device> D describe(D d, String str) throws ValidationException, DescriptorBindingException {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            log.fine("Populating device from XML descriptor: " + d);
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(this);
            return (D) describe(d, documentBuilderNewDocumentBuilder.parse(new InputSource(new StringReader(str.trim()))));
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            toj0.m192076a("Could not parse device descriptor: ", e2);
            return null;
        }
    }

    @Override // org.fourthline.cling.binding.xml.DeviceDescriptorBinder
    public String generate(Device device, RemoteClientInfo remoteClientInfo, Namespace namespace) throws DescriptorBindingException {
        try {
            log.fine("Generating XML descriptor from device model: " + device);
            return XMLUtil.documentToString(buildDOM(device, remoteClientInfo, namespace));
        } catch (Exception e) {
            throw new DescriptorBindingException("Could not build DOM: " + e.getMessage(), e);
        }
    }

    public void generateDevice(Namespace namespace, Device device, Document document, Element element, RemoteClientInfo remoteClientInfo) {
        Element elementAppendNewElement = XMLUtil.appendNewElement(document, element, Descriptor.Device.ELEMENT.device);
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.deviceType, device.getType());
        DeviceDetails details = device.getDetails(remoteClientInfo);
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.friendlyName, details.getFriendlyName());
        if (details.getManufacturerDetails() != null) {
            XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.manufacturer, details.getManufacturerDetails().getManufacturer());
            XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.manufacturerURL, details.getManufacturerDetails().getManufacturerURI());
        }
        if (details.getModelDetails() != null) {
            XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.modelDescription, details.getModelDetails().getModelDescription());
            XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.modelName, details.getModelDetails().getModelName());
            XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.modelNumber, details.getModelDetails().getModelNumber());
            XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.modelURL, details.getModelDetails().getModelURI());
        }
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.serialNumber, details.getSerialNumber());
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.UDN, device.getIdentity().getUdn());
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.presentationURL, details.getPresentationURI());
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.UPC, details.getUpc());
        if (details.getDlnaDocs() != null) {
            for (DLNADoc dLNADoc : details.getDlnaDocs()) {
                XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, "dlna:" + Descriptor.Device.ELEMENT.X_DLNADOC, dLNADoc, Descriptor.Device.DLNA_NAMESPACE_URI);
            }
        }
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, "dlna:" + Descriptor.Device.ELEMENT.X_DLNACAP, details.getDlnaCaps(), Descriptor.Device.DLNA_NAMESPACE_URI);
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, "sec:" + Descriptor.Device.ELEMENT.ProductCap, details.getSecProductCaps(), Descriptor.Device.SEC_NAMESPACE_URI);
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, "sec:" + Descriptor.Device.ELEMENT.X_ProductCap, details.getSecProductCaps(), Descriptor.Device.SEC_NAMESPACE_URI);
        generateIconList(namespace, device, document, elementAppendNewElement);
        generateServiceList(namespace, device, document, elementAppendNewElement);
        generateDeviceList(namespace, device, document, elementAppendNewElement, remoteClientInfo);
    }

    public void generateDeviceList(Namespace namespace, Device device, Document document, Element element, RemoteClientInfo remoteClientInfo) {
        if (device.hasEmbeddedDevices()) {
            Element elementAppendNewElement = XMLUtil.appendNewElement(document, element, Descriptor.Device.ELEMENT.deviceList);
            for (Device device2 : device.getEmbeddedDevices()) {
                generateDevice(namespace, device2, document, elementAppendNewElement, remoteClientInfo);
            }
        }
    }

    public void generateIconList(Namespace namespace, Device device, Document document, Element element) {
        if (device.hasIcons()) {
            Element elementAppendNewElement = XMLUtil.appendNewElement(document, element, Descriptor.Device.ELEMENT.iconList);
            for (Icon icon : device.getIcons()) {
                Element elementAppendNewElement2 = XMLUtil.appendNewElement(document, elementAppendNewElement, Descriptor.Device.ELEMENT.icon);
                XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.mimetype, icon.getMimeType());
                XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.width, Integer.valueOf(icon.getWidth()));
                XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.height, Integer.valueOf(icon.getHeight()));
                XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.depth, Integer.valueOf(icon.getDepth()));
                if (device instanceof RemoteDevice) {
                    XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.url, icon.getUri());
                } else if (device instanceof LocalDevice) {
                    XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.url, namespace.getIconPath(icon));
                }
            }
        }
    }

    public void generateRoot(Namespace namespace, Device device, Document document, RemoteClientInfo remoteClientInfo) {
        Element elementCreateElementNS = document.createElementNS(Descriptor.Device.NAMESPACE_URI, Descriptor.Device.ELEMENT.root.toString());
        document.appendChild(elementCreateElementNS);
        generateSpecVersion(namespace, device, document, elementCreateElementNS);
        generateDevice(namespace, device, document, elementCreateElementNS, remoteClientInfo);
    }

    public void generateServiceList(Namespace namespace, Device device, Document document, Element element) {
        if (device.hasServices()) {
            Element elementAppendNewElement = XMLUtil.appendNewElement(document, element, Descriptor.Device.ELEMENT.serviceList);
            for (Service service : device.getServices()) {
                Element elementAppendNewElement2 = XMLUtil.appendNewElement(document, elementAppendNewElement, Descriptor.Device.ELEMENT.service);
                XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.serviceType, service.getServiceType());
                XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.serviceId, service.getServiceId());
                if (service instanceof RemoteService) {
                    RemoteService remoteService = (RemoteService) service;
                    XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.SCPDURL, remoteService.getDescriptorURI());
                    XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.controlURL, remoteService.getControlURI());
                    XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.eventSubURL, remoteService.getEventSubscriptionURI());
                } else if (service instanceof LocalService) {
                    LocalService localService = (LocalService) service;
                    XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.SCPDURL, namespace.getDescriptorPath(localService));
                    XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.controlURL, namespace.getControlPath(localService));
                    XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement2, Descriptor.Device.ELEMENT.eventSubURL, namespace.getEventSubscriptionPath(localService));
                }
            }
        }
    }

    public void generateSpecVersion(Namespace namespace, Device device, Document document, Element element) {
        Element elementAppendNewElement = XMLUtil.appendNewElement(document, element, Descriptor.Device.ELEMENT.specVersion);
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.major, Integer.valueOf(device.getVersion().getMajor()));
        XMLUtil.appendNewElementIfNotNull(document, elementAppendNewElement, Descriptor.Device.ELEMENT.minor, Integer.valueOf(device.getVersion().getMinor()));
    }

    public void hydrateDevice(MutableDevice mutableDevice, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor.Device.ELEMENT.deviceType.equals(nodeItem)) {
                    mutableDevice.deviceType = XMLUtil.getTextContent(nodeItem);
                } else if (Descriptor.Device.ELEMENT.friendlyName.equals(nodeItem)) {
                    mutableDevice.friendlyName = XMLUtil.getTextContent(nodeItem);
                } else if (Descriptor.Device.ELEMENT.manufacturer.equals(nodeItem)) {
                    mutableDevice.manufacturer = XMLUtil.getTextContent(nodeItem);
                } else if (Descriptor.Device.ELEMENT.manufacturerURL.equals(nodeItem)) {
                    mutableDevice.manufacturerURI = parseURI(XMLUtil.getTextContent(nodeItem));
                } else if (Descriptor.Device.ELEMENT.modelDescription.equals(nodeItem)) {
                    mutableDevice.modelDescription = XMLUtil.getTextContent(nodeItem);
                } else if (Descriptor.Device.ELEMENT.modelName.equals(nodeItem)) {
                    mutableDevice.modelName = XMLUtil.getTextContent(nodeItem);
                } else if (Descriptor.Device.ELEMENT.modelNumber.equals(nodeItem)) {
                    mutableDevice.modelNumber = XMLUtil.getTextContent(nodeItem);
                } else if (Descriptor.Device.ELEMENT.modelURL.equals(nodeItem)) {
                    mutableDevice.modelURI = parseURI(XMLUtil.getTextContent(nodeItem));
                } else if (Descriptor.Device.ELEMENT.presentationURL.equals(nodeItem)) {
                    mutableDevice.presentationURI = parseURI(XMLUtil.getTextContent(nodeItem));
                } else if (Descriptor.Device.ELEMENT.UPC.equals(nodeItem)) {
                    mutableDevice.upc = XMLUtil.getTextContent(nodeItem);
                } else if (Descriptor.Device.ELEMENT.serialNumber.equals(nodeItem)) {
                    mutableDevice.serialNumber = XMLUtil.getTextContent(nodeItem);
                } else if (Descriptor.Device.ELEMENT.UDN.equals(nodeItem)) {
                    mutableDevice.udn = UDN.valueOf(XMLUtil.getTextContent(nodeItem));
                } else if (Descriptor.Device.ELEMENT.iconList.equals(nodeItem)) {
                    hydrateIconList(mutableDevice, nodeItem);
                } else if (Descriptor.Device.ELEMENT.serviceList.equals(nodeItem)) {
                    hydrateServiceList(mutableDevice, nodeItem);
                } else if (Descriptor.Device.ELEMENT.deviceList.equals(nodeItem)) {
                    hydrateDeviceList(mutableDevice, nodeItem);
                } else if (Descriptor.Device.ELEMENT.X_DLNADOC.equals(nodeItem) && Descriptor.Device.DLNA_PREFIX.equals(nodeItem.getPrefix())) {
                    String textContent = XMLUtil.getTextContent(nodeItem);
                    try {
                        mutableDevice.dlnaDocs.add(DLNADoc.valueOf(textContent));
                    } catch (InvalidValueException unused) {
                        log.info("Invalid X_DLNADOC value, ignoring value: " + textContent);
                    }
                } else if (Descriptor.Device.ELEMENT.X_DLNACAP.equals(nodeItem) && Descriptor.Device.DLNA_PREFIX.equals(nodeItem.getPrefix())) {
                    mutableDevice.dlnaCaps = DLNACaps.valueOf(XMLUtil.getTextContent(nodeItem));
                }
            }
        }
    }

    public void hydrateDeviceList(MutableDevice mutableDevice, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1 && Descriptor.Device.ELEMENT.device.equals(nodeItem)) {
                MutableDevice mutableDevice2 = new MutableDevice();
                mutableDevice2.parentDevice = mutableDevice;
                mutableDevice.embeddedDevices.add(mutableDevice2);
                hydrateDevice(mutableDevice2, nodeItem);
            }
        }
    }

    public void hydrateIconList(MutableDevice mutableDevice, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1 && Descriptor.Device.ELEMENT.icon.equals(nodeItem)) {
                MutableIcon mutableIcon = new MutableIcon();
                NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    Node nodeItem2 = childNodes2.item(i2);
                    if (nodeItem2.getNodeType() == 1) {
                        if (Descriptor.Device.ELEMENT.width.equals(nodeItem2)) {
                            mutableIcon.width = Integer.valueOf(XMLUtil.getTextContent(nodeItem2)).intValue();
                        } else if (Descriptor.Device.ELEMENT.height.equals(nodeItem2)) {
                            mutableIcon.height = Integer.valueOf(XMLUtil.getTextContent(nodeItem2)).intValue();
                        } else if (Descriptor.Device.ELEMENT.depth.equals(nodeItem2)) {
                            String textContent = XMLUtil.getTextContent(nodeItem2);
                            try {
                                mutableIcon.depth = Integer.valueOf(textContent).intValue();
                            } catch (NumberFormatException e) {
                                log.warning("Invalid icon depth '" + textContent + "', using 16 as default: " + e);
                                mutableIcon.depth = 16;
                            }
                        } else if (Descriptor.Device.ELEMENT.url.equals(nodeItem2)) {
                            mutableIcon.uri = parseURI(XMLUtil.getTextContent(nodeItem2));
                        } else if (Descriptor.Device.ELEMENT.mimetype.equals(nodeItem2)) {
                            try {
                                String textContent2 = XMLUtil.getTextContent(nodeItem2);
                                mutableIcon.mimeType = textContent2;
                                MimeType.valueOf(textContent2);
                            } catch (IllegalArgumentException unused) {
                                log.warning("Ignoring invalid icon mime type: " + mutableIcon.mimeType);
                                mutableIcon.mimeType = "";
                            }
                        }
                    }
                }
                mutableDevice.icons.add(mutableIcon);
            }
        }
    }

    public void hydrateRoot(MutableDevice mutableDevice, Element element) throws DescriptorBindingException {
        if (element.getNamespaceURI() == null || !element.getNamespaceURI().equals(Descriptor.Device.NAMESPACE_URI)) {
            log.warning("Wrong XML namespace declared on root element: " + element.getNamespaceURI());
        }
        if (!element.getNodeName().equals(Descriptor.Device.ELEMENT.root.name())) {
            throw new DescriptorBindingException("Root element name is not <root>: " + element.getNodeName());
        }
        NodeList childNodes = element.getChildNodes();
        Node node = null;
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor.Device.ELEMENT.specVersion.equals(nodeItem)) {
                    hydrateSpecVersion(mutableDevice, nodeItem);
                } else if (Descriptor.Device.ELEMENT.URLBase.equals(nodeItem)) {
                    try {
                        String textContent = XMLUtil.getTextContent(nodeItem);
                        if (textContent != null && textContent.length() > 0) {
                            mutableDevice.baseURL = new URL(textContent);
                        }
                    } catch (Exception e) {
                        throw new DescriptorBindingException("Invalid URLBase: " + e.getMessage());
                    }
                } else if (!Descriptor.Device.ELEMENT.device.equals(nodeItem)) {
                    log.finer("Ignoring unknown element: " + nodeItem.getNodeName());
                } else {
                    if (node != null) {
                        throw new DescriptorBindingException("Found multiple <device> elements in <root>");
                    }
                    node = nodeItem;
                }
            }
        }
        if (node == null) {
            throw new DescriptorBindingException("No <device> element in <root>");
        }
        hydrateDevice(mutableDevice, node);
    }

    public void hydrateServiceList(MutableDevice mutableDevice, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1 && Descriptor.Device.ELEMENT.service.equals(nodeItem)) {
                NodeList childNodes2 = nodeItem.getChildNodes();
                try {
                    MutableService mutableService = new MutableService();
                    for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                        Node nodeItem2 = childNodes2.item(i2);
                        if (nodeItem2.getNodeType() == 1) {
                            if (Descriptor.Device.ELEMENT.serviceType.equals(nodeItem2)) {
                                mutableService.serviceType = ServiceType.valueOf(XMLUtil.getTextContent(nodeItem2));
                            } else if (Descriptor.Device.ELEMENT.serviceId.equals(nodeItem2)) {
                                mutableService.serviceId = ServiceId.valueOf(XMLUtil.getTextContent(nodeItem2));
                            } else if (Descriptor.Device.ELEMENT.SCPDURL.equals(nodeItem2)) {
                                mutableService.descriptorURI = parseURI(XMLUtil.getTextContent(nodeItem2));
                            } else if (Descriptor.Device.ELEMENT.controlURL.equals(nodeItem2)) {
                                mutableService.controlURI = parseURI(XMLUtil.getTextContent(nodeItem2));
                            } else if (Descriptor.Device.ELEMENT.eventSubURL.equals(nodeItem2)) {
                                mutableService.eventSubscriptionURI = parseURI(XMLUtil.getTextContent(nodeItem2));
                            }
                        }
                    }
                    mutableDevice.services.add(mutableService);
                } catch (InvalidValueException e) {
                    log.warning("UPnP specification violation, skipping invalid service declaration. " + e.getMessage());
                }
            }
        }
    }

    public void hydrateSpecVersion(MutableDevice mutableDevice, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor.Device.ELEMENT.major.equals(nodeItem)) {
                    String strTrim = XMLUtil.getTextContent(nodeItem).trim();
                    if (!strTrim.equals("1")) {
                        log.warning("Unsupported UDA major version, ignoring: ".concat(strTrim));
                        strTrim = "1";
                    }
                    mutableDevice.udaVersion.major = Integer.valueOf(strTrim).intValue();
                } else if (Descriptor.Device.ELEMENT.minor.equals(nodeItem)) {
                    String strTrim2 = XMLUtil.getTextContent(nodeItem).trim();
                    if (!strTrim2.equals("0")) {
                        log.warning("Unsupported UDA minor version, ignoring: ".concat(strTrim2));
                        strTrim2 = "0";
                    }
                    mutableDevice.udaVersion.minor = Integer.valueOf(strTrim2).intValue();
                }
            }
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        log.warning(sAXParseException.toString());
    }

    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    @Override // org.fourthline.cling.binding.xml.DeviceDescriptorBinder
    public <D extends Device> D describe(D d, Document document) throws ValidationException, DescriptorBindingException {
        try {
            log.fine("Populating device from DOM: " + d);
            MutableDevice mutableDevice = new MutableDevice();
            hydrateRoot(mutableDevice, document.getDocumentElement());
            return (D) buildInstance(d, mutableDevice);
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            toj0.m192076a("Could not parse device DOM: ", e2);
            return null;
        }
    }
}
