package org.fourthline.cling;

import java.lang.annotation.Annotation;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.util.AnnotationLiteral;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.model.meta.LocalDevice;
import org.fourthline.cling.model.meta.RemoteDevice;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.registry.Registry;
import org.fourthline.cling.registry.RegistryListener;
import org.fourthline.cling.registry.event.After;
import org.fourthline.cling.registry.event.Before;
import org.fourthline.cling.registry.event.FailedRemoteDeviceDiscovery;
import org.fourthline.cling.registry.event.LocalDeviceDiscovery;
import org.fourthline.cling.registry.event.Phase;
import org.fourthline.cling.registry.event.RegistryShutdown;
import org.fourthline.cling.registry.event.RemoteDeviceDiscovery;
import org.fourthline.cling.transport.DisableRouter;
import org.fourthline.cling.transport.EnableRouter;
import org.fourthline.cling.transport.Router;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@ApplicationScoped
public class ManagedUpnpService implements UpnpService {
    private static final Logger log = Logger.getLogger(ManagedUpnpService.class.getName());
    Instance<UpnpServiceConfiguration> configuration;
    Instance<ControlPoint> controlPointInstance;
    Event<DisableRouter> disableRouterEvent;
    Event<EnableRouter> enableRouterEvent;
    Instance<ProtocolFactory> protocolFactoryInstance;
    Instance<Registry> registryInstance;
    RegistryListenerAdapter registryListenerAdapter;
    Instance<Router> routerInstance;

    @ApplicationScoped
    public static class RegistryListenerAdapter implements RegistryListener {

        @Any
        Event<FailedRemoteDeviceDiscovery> failedRemoteDeviceDiscoveryEvent;

        @Any
        Event<LocalDeviceDiscovery> localDeviceDiscoveryEvent;

        @Any
        Event<RegistryShutdown> registryShutdownEvent;

        @Any
        Event<RemoteDeviceDiscovery> remoteDeviceDiscoveryEvent;

        @Override // org.fourthline.cling.registry.RegistryListener
        public void afterShutdown() {
            this.registryShutdownEvent.select(new Annotation[]{new AnnotationLiteral<After>() { // from class: org.fourthline.cling.ManagedUpnpService.RegistryListenerAdapter.2
            }}).fire(new RegistryShutdown());
        }

        @Override // org.fourthline.cling.registry.RegistryListener
        public void beforeShutdown(Registry registry) {
            this.registryShutdownEvent.select(new Annotation[]{new AnnotationLiteral<Before>() { // from class: org.fourthline.cling.ManagedUpnpService.RegistryListenerAdapter.1
            }}).fire(new RegistryShutdown());
        }

        @Override // org.fourthline.cling.registry.RegistryListener
        public void localDeviceAdded(Registry registry, LocalDevice localDevice) {
            this.localDeviceDiscoveryEvent.select(new Annotation[]{Phase.COMPLETE}).fire(new LocalDeviceDiscovery(localDevice));
        }

        @Override // org.fourthline.cling.registry.RegistryListener
        public void localDeviceRemoved(Registry registry, LocalDevice localDevice) {
            this.localDeviceDiscoveryEvent.select(new Annotation[]{Phase.BYEBYE}).fire(new LocalDeviceDiscovery(localDevice));
        }

        @Override // org.fourthline.cling.registry.RegistryListener
        public void remoteDeviceAdded(Registry registry, RemoteDevice remoteDevice) {
            this.remoteDeviceDiscoveryEvent.select(new Annotation[]{Phase.COMPLETE}).fire(new RemoteDeviceDiscovery(remoteDevice));
        }

        @Override // org.fourthline.cling.registry.RegistryListener
        public void remoteDeviceDiscoveryFailed(Registry registry, RemoteDevice remoteDevice, Exception exc) {
            this.failedRemoteDeviceDiscoveryEvent.fire(new FailedRemoteDeviceDiscovery(remoteDevice, exc));
        }

        @Override // org.fourthline.cling.registry.RegistryListener
        public void remoteDeviceDiscoveryStarted(Registry registry, RemoteDevice remoteDevice) {
            this.remoteDeviceDiscoveryEvent.select(new Annotation[]{Phase.ALIVE}).fire(new RemoteDeviceDiscovery(remoteDevice));
        }

        @Override // org.fourthline.cling.registry.RegistryListener
        public void remoteDeviceRemoved(Registry registry, RemoteDevice remoteDevice) {
            this.remoteDeviceDiscoveryEvent.select(new Annotation[]{Phase.BYEBYE}).fire(new RemoteDeviceDiscovery(remoteDevice));
        }

        @Override // org.fourthline.cling.registry.RegistryListener
        public void remoteDeviceUpdated(Registry registry, RemoteDevice remoteDevice) {
            this.remoteDeviceDiscoveryEvent.select(new Annotation[]{Phase.UPDATED}).fire(new RemoteDeviceDiscovery(remoteDevice));
        }
    }

    @Override // org.fourthline.cling.UpnpService
    public UpnpServiceConfiguration getConfiguration() {
        return (UpnpServiceConfiguration) this.configuration.get();
    }

    @Override // org.fourthline.cling.UpnpService
    public ControlPoint getControlPoint() {
        return (ControlPoint) this.controlPointInstance.get();
    }

    @Override // org.fourthline.cling.UpnpService
    public ProtocolFactory getProtocolFactory() {
        return (ProtocolFactory) this.protocolFactoryInstance.get();
    }

    @Override // org.fourthline.cling.UpnpService
    public Registry getRegistry() {
        return (Registry) this.registryInstance.get();
    }

    @Override // org.fourthline.cling.UpnpService
    public Router getRouter() {
        return (Router) this.routerInstance.get();
    }

    public void shutdown(@Observes UpnpService.Shutdown shutdown) {
        Logger logger = log;
        logger.info(">>> Shutting down managed UPnP service...");
        getRegistry().shutdown();
        this.disableRouterEvent.fire(new DisableRouter());
        getConfiguration().shutdown();
        logger.info("<<< Managed UPnP service shutdown completed");
    }

    public void start(@Observes UpnpService.Start start) {
        Logger logger = log;
        logger.info(">>> Starting managed UPnP service...");
        getRegistry().addListener(this.registryListenerAdapter);
        this.enableRouterEvent.fire(new EnableRouter());
        logger.info("<<< Managed UPnP service started successfully");
    }

    @Override // org.fourthline.cling.UpnpService
    public void shutdown() {
        shutdown(null);
    }
}
