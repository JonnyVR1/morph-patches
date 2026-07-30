package org.fourthline.cling.model.message;

import java.net.InetAddress;
import org.fourthline.cling.model.message.UpnpOperation;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class OutgoingDatagramMessage<O extends UpnpOperation> extends UpnpMessage<O> {
    private InetAddress destinationAddress;
    private int destinationPort;
    private UpnpHeaders headers;

    public OutgoingDatagramMessage(O o, InetAddress inetAddress, int i) {
        super(o);
        this.headers = new UpnpHeaders(false);
        this.destinationAddress = inetAddress;
        this.destinationPort = i;
    }

    public InetAddress getDestinationAddress() {
        return this.destinationAddress;
    }

    public int getDestinationPort() {
        return this.destinationPort;
    }

    @Override // org.fourthline.cling.model.message.UpnpMessage
    public UpnpHeaders getHeaders() {
        return this.headers;
    }

    public OutgoingDatagramMessage(O o, UpnpMessage.BodyType bodyType, Object obj, InetAddress inetAddress, int i) {
        super(o, bodyType, obj);
        this.headers = new UpnpHeaders(false);
        this.destinationAddress = inetAddress;
        this.destinationPort = i;
    }
}
