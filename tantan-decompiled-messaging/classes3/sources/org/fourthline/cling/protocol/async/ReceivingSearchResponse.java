package org.fourthline.cling.protocol.async;

import java.util.Iterator;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.ValidationError;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.IncomingDatagramMessage;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.discovery.IncomingSearchResponse;
import org.fourthline.cling.model.meta.RemoteDevice;
import org.fourthline.cling.model.meta.RemoteDeviceIdentity;
import org.fourthline.cling.model.types.UDN;
import org.fourthline.cling.protocol.ReceivingAsync;
import org.fourthline.cling.protocol.RetrieveRemoteDescriptors;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ReceivingSearchResponse extends ReceivingAsync<IncomingSearchResponse> {
    private static final Logger log = Logger.getLogger(ReceivingSearchResponse.class.getName());

    public ReceivingSearchResponse(UpnpService upnpService, IncomingDatagramMessage<UpnpResponse> incomingDatagramMessage) {
        super(upnpService, new IncomingSearchResponse(incomingDatagramMessage));
    }

    @Override // org.fourthline.cling.protocol.ReceivingAsync
    public void execute() throws RouterException {
        if (!getInputMessage().isSearchResponseMessage()) {
            log.fine("Ignoring invalid search response message: " + getInputMessage());
            return;
        }
        UDN rootDeviceUDN = getInputMessage().getRootDeviceUDN();
        if (rootDeviceUDN == null) {
            log.fine("Ignoring search response message without UDN: " + getInputMessage());
            return;
        }
        RemoteDeviceIdentity remoteDeviceIdentity = new RemoteDeviceIdentity(getInputMessage());
        Logger logger = log;
        logger.fine("Received device search response: " + remoteDeviceIdentity);
        if (getUpnpService().getRegistry().update(remoteDeviceIdentity)) {
            logger.fine("Remote device was already known: " + rootDeviceUDN);
            return;
        }
        try {
            RemoteDevice remoteDevice = new RemoteDevice(remoteDeviceIdentity);
            if (remoteDeviceIdentity.getDescriptorURL() == null) {
                logger.finer("Ignoring message without location URL header: " + getInputMessage());
            } else {
                if (remoteDeviceIdentity.getMaxAgeSeconds() != null) {
                    getUpnpService().getConfiguration().getAsyncProtocolExecutor().execute(new RetrieveRemoteDescriptors(getUpnpService(), remoteDevice));
                    return;
                }
                logger.finer("Ignoring message without max-age header: " + getInputMessage());
            }
        } catch (ValidationException e) {
            log.warning("Validation errors of device during discovery: " + remoteDeviceIdentity);
            Iterator<ValidationError> it = e.getErrors().iterator();
            while (it.hasNext()) {
                log.warning(it.next().toString());
            }
        }
    }
}
