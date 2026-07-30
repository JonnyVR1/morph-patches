package org.fourthline.cling.protocol.sync;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.ContentTypeHeader;
import org.fourthline.cling.model.message.header.ServerHeader;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.meta.Icon;
import org.fourthline.cling.model.meta.LocalDevice;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.resource.DeviceDescriptorResource;
import org.fourthline.cling.model.resource.IconResource;
import org.fourthline.cling.model.resource.Resource;
import org.fourthline.cling.model.resource.ServiceDescriptorResource;
import org.fourthline.cling.protocol.ReceivingSync;
import org.fourthline.cling.transport.RouterException;
import org.seamless.util.Exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class ReceivingRetrieval extends ReceivingSync<StreamRequestMessage, StreamResponseMessage> {
    private static final Logger log = Logger.getLogger(ReceivingRetrieval.class.getName());

    public ReceivingRetrieval(UpnpService upnpService, StreamRequestMessage streamRequestMessage) {
        super(upnpService, streamRequestMessage);
    }

    public StreamResponseMessage createResponse(URI uri, Resource resource) {
        StreamResponseMessage streamResponseMessage;
        try {
            if (DeviceDescriptorResource.class.isAssignableFrom(resource.getClass())) {
                log.fine("Found local device matching relative request URI: " + uri);
                streamResponseMessage = new StreamResponseMessage(getUpnpService().getConfiguration().getDeviceDescriptorBinderUDA10().generate((LocalDevice) resource.getModel(), getRemoteClientInfo(), getUpnpService().getConfiguration().getNamespace()), new ContentTypeHeader(ContentTypeHeader.DEFAULT_CONTENT_TYPE));
            } else if (ServiceDescriptorResource.class.isAssignableFrom(resource.getClass())) {
                log.fine("Found local service matching relative request URI: " + uri);
                streamResponseMessage = new StreamResponseMessage(getUpnpService().getConfiguration().getServiceDescriptorBinderUDA10().generate((LocalService) resource.getModel()), new ContentTypeHeader(ContentTypeHeader.DEFAULT_CONTENT_TYPE));
            } else {
                if (!IconResource.class.isAssignableFrom(resource.getClass())) {
                    log.fine("Ignoring GET for found local resource: " + resource);
                    return null;
                }
                log.fine("Found local icon matching relative request URI: " + uri);
                Icon icon = (Icon) resource.getModel();
                streamResponseMessage = new StreamResponseMessage(icon.getData(), icon.getMimeType());
            }
        } catch (DescriptorBindingException e) {
            Logger logger = log;
            logger.warning("Error generating requested device/service descriptor: " + e.toString());
            logger.log(Level.WARNING, "Exception root cause: ", Exceptions.unwrap(e));
            streamResponseMessage = new StreamResponseMessage(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        }
        streamResponseMessage.getHeaders().add(UpnpHeader.Type.SERVER, new ServerHeader());
        return streamResponseMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.fourthline.cling.protocol.ReceivingSync
    public StreamResponseMessage executeSync() throws RouterException {
        if (!((StreamRequestMessage) getInputMessage()).hasHostHeader()) {
            log.fine("Ignoring message, missing HOST header: " + getInputMessage());
            return new StreamResponseMessage(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        URI uri = ((StreamRequestMessage) getInputMessage()).getOperation().getURI();
        Resource resource = getUpnpService().getRegistry().getResource(uri);
        if (resource != null || (resource = onResourceNotFound(uri)) != null) {
            return createResponse(uri, resource);
        }
        log.fine("No local resource found: " + getInputMessage());
        return null;
    }

    public Resource onResourceNotFound(URI uri) {
        return null;
    }
}
