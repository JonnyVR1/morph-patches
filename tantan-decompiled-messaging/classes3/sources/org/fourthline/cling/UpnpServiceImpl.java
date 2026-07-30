package org.fourthline.cling;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.controlpoint.ControlPointImpl;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.protocol.ProtocolFactoryImpl;
import org.fourthline.cling.registry.Registry;
import org.fourthline.cling.registry.RegistryImpl;
import org.fourthline.cling.registry.RegistryListener;
import org.fourthline.cling.transport.Router;
import org.fourthline.cling.transport.RouterException;
import org.fourthline.cling.transport.RouterImpl;
import org.seamless.util.Exceptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Alternative
public class UpnpServiceImpl implements UpnpService {
    private static Logger log = Logger.getLogger(UpnpServiceImpl.class.getName());
    protected final UpnpServiceConfiguration configuration;
    protected final ControlPoint controlPoint;
    protected final ProtocolFactory protocolFactory;
    protected final Registry registry;
    protected final Router router;

    public UpnpServiceImpl(UpnpServiceConfiguration upnpServiceConfiguration, RegistryListener... registryListenerArr) {
        this.configuration = upnpServiceConfiguration;
        log.info(">>> Starting UPnP service...");
        log.info("Using configuration: ".concat(getConfiguration().getClass().getName()));
        ProtocolFactory protocolFactoryCreateProtocolFactory = createProtocolFactory();
        this.protocolFactory = protocolFactoryCreateProtocolFactory;
        this.registry = createRegistry(protocolFactoryCreateProtocolFactory);
        for (RegistryListener registryListener : registryListenerArr) {
            this.registry.addListener(registryListener);
        }
        Router routerCreateRouter = createRouter(this.protocolFactory, this.registry);
        this.router = routerCreateRouter;
        try {
            routerCreateRouter.enable();
            this.controlPoint = createControlPoint(this.protocolFactory, this.registry);
            log.info("<<< UPnP service started successfully");
        } catch (RouterException e) {
            throw new RuntimeException("Enabling network router failed: " + e, e);
        }
    }

    public ControlPoint createControlPoint(ProtocolFactory protocolFactory, Registry registry) {
        return new ControlPointImpl(getConfiguration(), protocolFactory, registry);
    }

    public ProtocolFactory createProtocolFactory() {
        return new ProtocolFactoryImpl(this);
    }

    public Registry createRegistry(ProtocolFactory protocolFactory) {
        return new RegistryImpl(this);
    }

    public Router createRouter(ProtocolFactory protocolFactory, Registry registry) {
        return new RouterImpl(getConfiguration(), protocolFactory);
    }

    @Override // org.fourthline.cling.UpnpService
    public UpnpServiceConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // org.fourthline.cling.UpnpService
    public ControlPoint getControlPoint() {
        return this.controlPoint;
    }

    @Override // org.fourthline.cling.UpnpService
    public ProtocolFactory getProtocolFactory() {
        return this.protocolFactory;
    }

    @Override // org.fourthline.cling.UpnpService
    public Registry getRegistry() {
        return this.registry;
    }

    @Override // org.fourthline.cling.UpnpService
    public Router getRouter() {
        return this.router;
    }

    public void shutdown(boolean z) {
        Runnable runnable = new Runnable() { // from class: org.fourthline.cling.UpnpServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                UpnpServiceImpl.log.info(">>> Shutting down UPnP service...");
                UpnpServiceImpl.this.shutdownRegistry();
                UpnpServiceImpl.this.shutdownRouter();
                UpnpServiceImpl.this.shutdownConfiguration();
                UpnpServiceImpl.log.info("<<< UPnP service shutdown completed");
            }
        };
        if (z) {
            new Thread(runnable).start();
        } else {
            runnable.run();
        }
    }

    public void shutdownConfiguration() {
        getConfiguration().shutdown();
    }

    public void shutdownRegistry() {
        getRegistry().shutdown();
    }

    public void shutdownRouter() {
        try {
            getRouter().shutdown();
        } catch (RouterException e) {
            Throwable thUnwrap = Exceptions.unwrap(e);
            if (thUnwrap instanceof InterruptedException) {
                log.log(Level.INFO, "Router shutdown was interrupted: " + e, thUnwrap);
                return;
            }
            log.log(Level.SEVERE, "Router error on shutdown: " + e, thUnwrap);
        }
    }

    @Override // org.fourthline.cling.UpnpService
    public synchronized void shutdown() {
        shutdown(false);
    }

    public UpnpServiceImpl(RegistryListener... registryListenerArr) {
        this(new DefaultUpnpServiceConfiguration(), registryListenerArr);
    }

    public UpnpServiceImpl() {
        this(new DefaultUpnpServiceConfiguration(), new RegistryListener[0]);
    }
}
