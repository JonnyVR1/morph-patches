package org.fourthline.cling.support.avtransport.impl.state;

import java.net.URI;
import java.util.logging.Logger;
import org.fourthline.cling.support.avtransport.lastchange.AVTransportVariable;
import org.fourthline.cling.support.model.AVTransport;
import org.fourthline.cling.support.model.SeekMode;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportInfo;
import org.fourthline.cling.support.model.TransportState;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class Playing<T extends AVTransport> extends AbstractState<T> {
    private static final Logger log = Logger.getLogger(Playing.class.getName());

    public Playing(T t) {
        super(t);
    }

    @Override // org.fourthline.cling.support.avtransport.impl.state.AbstractState
    public TransportAction[] getCurrentTransportActions() {
        return new TransportAction[]{TransportAction.Stop, TransportAction.Play, TransportAction.Pause, TransportAction.Next, TransportAction.Previous, TransportAction.Seek};
    }

    public abstract Class<? extends AbstractState<?>> next();

    public void onEntry() {
        log.fine("Setting transport state to PLAYING");
        T transport = getTransport();
        TransportState transportState = TransportState.PLAYING;
        transport.setTransportInfo(new TransportInfo(transportState, getTransport().getTransportInfo().getCurrentTransportStatus(), getTransport().getTransportInfo().getCurrentSpeed()));
        getTransport().getLastChange().setEventedValue(getTransport().getInstanceId(), new AVTransportVariable.TransportState(transportState), new AVTransportVariable.CurrentTransportActions(getCurrentTransportActions()));
    }

    public abstract Class<? extends AbstractState<?>> pause();

    public abstract Class<? extends AbstractState<?>> play(String str);

    public abstract Class<? extends AbstractState<?>> previous();

    public abstract Class<? extends AbstractState<?>> seek(SeekMode seekMode, String str);

    public abstract Class<? extends AbstractState<?>> setTransportURI(URI uri, String str);

    public abstract Class<? extends AbstractState<?>> stop();
}
