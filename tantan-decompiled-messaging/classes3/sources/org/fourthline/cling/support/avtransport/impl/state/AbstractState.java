package org.fourthline.cling.support.avtransport.impl.state;

import org.fourthline.cling.support.model.AVTransport;
import org.fourthline.cling.support.model.TransportAction;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractState<T extends AVTransport> {
    private T transport;

    public AbstractState(T t) {
        this.transport = t;
    }

    public abstract TransportAction[] getCurrentTransportActions();

    public T getTransport() {
        return this.transport;
    }
}
