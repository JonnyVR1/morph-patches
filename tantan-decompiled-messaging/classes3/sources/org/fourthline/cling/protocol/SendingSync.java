package org.fourthline.cling.protocol;

import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class SendingSync<IN extends StreamRequestMessage, OUT extends StreamResponseMessage> extends SendingAsync {
    private final IN inputMessage;
    protected OUT outputMessage;

    public SendingSync(UpnpService upnpService, IN in) {
        super(upnpService);
        this.inputMessage = in;
    }

    @Override // org.fourthline.cling.protocol.SendingAsync
    public final void execute() throws RouterException {
        this.outputMessage = (OUT) executeSync();
    }

    public abstract OUT executeSync() throws RouterException;

    public IN getInputMessage() {
        return this.inputMessage;
    }

    public OUT getOutputMessage() {
        return this.outputMessage;
    }

    @Override // org.fourthline.cling.protocol.SendingAsync
    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
