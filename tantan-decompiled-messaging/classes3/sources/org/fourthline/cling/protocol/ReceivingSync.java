package org.fourthline.cling.protocol;

import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.profile.RemoteClientInfo;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class ReceivingSync<IN extends StreamRequestMessage, OUT extends StreamResponseMessage> extends ReceivingAsync<IN> {
    private static final Logger log = Logger.getLogger(UpnpService.class.getName());
    protected OUT outputMessage;
    protected final RemoteClientInfo remoteClientInfo;

    public ReceivingSync(UpnpService upnpService, IN in) {
        super(upnpService, in);
        this.remoteClientInfo = new RemoteClientInfo(in);
    }

    @Override // org.fourthline.cling.protocol.ReceivingAsync
    public final void execute() throws RouterException {
        OUT out = (OUT) executeSync();
        this.outputMessage = out;
        if (out == null || getRemoteClientInfo().getExtraResponseHeaders().size() <= 0) {
            return;
        }
        log.fine("Setting extra headers on response message: " + getRemoteClientInfo().getExtraResponseHeaders().size());
        this.outputMessage.getHeaders().putAll(getRemoteClientInfo().getExtraResponseHeaders());
    }

    public abstract OUT executeSync() throws RouterException;

    public OUT getOutputMessage() {
        return this.outputMessage;
    }

    public RemoteClientInfo getRemoteClientInfo() {
        return this.remoteClientInfo;
    }

    public void responseException(Throwable th) {
    }

    public void responseSent(StreamResponseMessage streamResponseMessage) {
    }

    @Override // org.fourthline.cling.protocol.ReceivingAsync
    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
