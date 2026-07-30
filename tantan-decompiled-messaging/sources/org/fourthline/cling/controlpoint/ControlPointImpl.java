package org.fourthline.cling.controlpoint;

import java.util.concurrent.Future;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import org.fourthline.cling.UpnpServiceConfiguration;
import org.fourthline.cling.controlpoint.event.ExecuteAction;
import org.fourthline.cling.controlpoint.event.Search;
import org.fourthline.cling.model.message.header.MXHeader;
import org.fourthline.cling.model.message.header.STAllHeader;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.registry.Registry;

/* JADX INFO: loaded from: classes3.dex */
@ApplicationScoped
public class ControlPointImpl implements ControlPoint {
    private static Logger log = Logger.getLogger(ControlPointImpl.class.getName());
    protected UpnpServiceConfiguration configuration;
    protected ProtocolFactory protocolFactory;
    protected Registry registry;

    public ControlPointImpl(UpnpServiceConfiguration upnpServiceConfiguration, ProtocolFactory protocolFactory, Registry registry) {
        log.fine("Creating ControlPoint: ".concat(getClass().getName()));
        this.configuration = upnpServiceConfiguration;
        this.protocolFactory = protocolFactory;
        this.registry = registry;
    }

    @Override // org.fourthline.cling.controlpoint.ControlPoint
    public Future execute(ActionCallback actionCallback) {
        log.fine("Invoking action in background: " + actionCallback);
        actionCallback.setControlPoint(this);
        return getConfiguration().getSyncProtocolExecutorService().submit(actionCallback);
    }

    @Override // org.fourthline.cling.controlpoint.ControlPoint
    public UpnpServiceConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // org.fourthline.cling.controlpoint.ControlPoint
    public ProtocolFactory getProtocolFactory() {
        return this.protocolFactory;
    }

    @Override // org.fourthline.cling.controlpoint.ControlPoint
    public Registry getRegistry() {
        return this.registry;
    }

    @Override // org.fourthline.cling.controlpoint.ControlPoint
    public void search(UpnpHeader upnpHeader, int i) {
        log.fine("Sending asynchronous search for: " + upnpHeader.getString());
        getConfiguration().getAsyncProtocolExecutor().execute(getProtocolFactory().createSendingSearch(upnpHeader, i));
    }

    public ControlPointImpl() {
    }

    public void execute(ExecuteAction executeAction) {
        execute(executeAction.getCallback());
    }

    @Override // org.fourthline.cling.controlpoint.ControlPoint
    public void execute(SubscriptionCallback subscriptionCallback) {
        log.fine("Invoking subscription in background: " + subscriptionCallback);
        subscriptionCallback.setControlPoint(this);
        getConfiguration().getSyncProtocolExecutorService().execute(subscriptionCallback);
    }

    @Override // org.fourthline.cling.controlpoint.ControlPoint
    public void search() {
        search(new STAllHeader(), MXHeader.DEFAULT_VALUE.intValue());
    }

    @Override // org.fourthline.cling.controlpoint.ControlPoint
    public void search(UpnpHeader upnpHeader) {
        search(upnpHeader, MXHeader.DEFAULT_VALUE.intValue());
    }

    @Override // org.fourthline.cling.controlpoint.ControlPoint
    public void search(int i) {
        search(new STAllHeader(), i);
    }

    public void search(@Observes Search search) {
        search(search.getSearchType(), search.getMxSeconds());
    }
}
