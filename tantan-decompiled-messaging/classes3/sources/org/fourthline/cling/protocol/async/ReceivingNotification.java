package org.fourthline.cling.protocol.async;

import java.util.Iterator;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.ValidationError;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.IncomingDatagramMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.discovery.IncomingNotificationRequest;
import org.fourthline.cling.model.meta.RemoteDevice;
import org.fourthline.cling.model.meta.RemoteDeviceIdentity;
import org.fourthline.cling.model.types.UDN;
import org.fourthline.cling.protocol.ReceivingAsync;
import org.fourthline.cling.protocol.RetrieveRemoteDescriptors;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ReceivingNotification extends ReceivingAsync<IncomingNotificationRequest> {
    private static final Logger log = Logger.getLogger(ReceivingNotification.class.getName());

    public ReceivingNotification(UpnpService upnpService, IncomingDatagramMessage<UpnpRequest> incomingDatagramMessage) {
        super(upnpService, new IncomingNotificationRequest(incomingDatagramMessage));
    }

    @Override // org.fourthline.cling.protocol.ReceivingAsync
    public void execute() throws RouterException {
        UDN udn = getInputMessage().getUDN();
        if (udn == null) {
            log.fine("Ignoring notification message without UDN: " + getInputMessage());
            return;
        }
        RemoteDeviceIdentity remoteDeviceIdentity = new RemoteDeviceIdentity(getInputMessage());
        Logger logger = log;
        logger.fine("Received device notification: " + remoteDeviceIdentity);
        try {
            RemoteDevice remoteDevice = new RemoteDevice(remoteDeviceIdentity);
            if (!getInputMessage().isAliveMessage()) {
                if (!getInputMessage().isByeByeMessage()) {
                    logger.finer("Ignoring unknown notification message: " + getInputMessage());
                    return;
                } else {
                    logger.fine("Received device BYEBYE advertisement");
                    if (getUpnpService().getRegistry().removeDevice(remoteDevice)) {
                        logger.fine("Removed remote device from registry: " + remoteDevice);
                        return;
                    }
                    return;
                }
            }
            logger.fine("Received device ALIVE advertisement, descriptor location is: " + remoteDeviceIdentity.getDescriptorURL());
            if (remoteDeviceIdentity.getDescriptorURL() == null) {
                logger.finer("Ignoring message without location URL header: " + getInputMessage());
            } else if (remoteDeviceIdentity.getMaxAgeSeconds() == null) {
                logger.finer("Ignoring message without max-age header: " + getInputMessage());
            } else {
                if (!getUpnpService().getRegistry().update(remoteDeviceIdentity)) {
                    getUpnpService().getConfiguration().getAsyncProtocolExecutor().execute(new RetrieveRemoteDescriptors(getUpnpService(), remoteDevice));
                    return;
                }
                logger.finer("Remote device was already known: " + udn);
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
