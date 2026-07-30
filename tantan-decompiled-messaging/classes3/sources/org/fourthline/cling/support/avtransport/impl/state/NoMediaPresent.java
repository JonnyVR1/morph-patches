package org.fourthline.cling.support.avtransport.impl.state;

import java.net.URI;
import java.util.logging.Logger;
import org.fourthline.cling.support.avtransport.lastchange.AVTransportVariable;
import org.fourthline.cling.support.model.AVTransport;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportInfo;
import org.fourthline.cling.support.model.TransportState;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class NoMediaPresent<T extends AVTransport> extends AbstractState<T> {
    private static final Logger log = Logger.getLogger(Stopped.class.getName());

    public NoMediaPresent(T t) {
        super(t);
    }

    @Override // org.fourthline.cling.support.avtransport.impl.state.AbstractState
    public TransportAction[] getCurrentTransportActions() {
        return new TransportAction[]{TransportAction.Stop};
    }

    public void onEntry() {
        log.fine("Setting transport state to NO_MEDIA_PRESENT");
        T transport = getTransport();
        TransportState transportState = TransportState.NO_MEDIA_PRESENT;
        transport.setTransportInfo(new TransportInfo(transportState, getTransport().getTransportInfo().getCurrentTransportStatus(), getTransport().getTransportInfo().getCurrentSpeed()));
        getTransport().getLastChange().setEventedValue(getTransport().getInstanceId(), new AVTransportVariable.TransportState(transportState), new AVTransportVariable.CurrentTransportActions(getCurrentTransportActions()));
    }

    public abstract Class<? extends AbstractState> setTransportURI(URI uri, String str);
}
