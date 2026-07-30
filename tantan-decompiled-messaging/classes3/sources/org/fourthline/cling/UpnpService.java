package org.fourthline.cling;

import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.registry.Registry;
import org.fourthline.cling.transport.Router;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface UpnpService {

    public static class Shutdown {
    }

    public static class Start {
    }

    UpnpServiceConfiguration getConfiguration();

    ControlPoint getControlPoint();

    ProtocolFactory getProtocolFactory();

    Registry getRegistry();

    Router getRouter();

    void shutdown();
}
