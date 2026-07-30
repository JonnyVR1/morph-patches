package org.fourthline.cling.mock;

import javax.enterprise.inject.Alternative;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.UpnpServiceConfiguration;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.controlpoint.ControlPointImpl;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.meta.LocalDevice;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.protocol.ProtocolFactoryImpl;
import org.fourthline.cling.protocol.async.SendingNotificationAlive;
import org.fourthline.cling.protocol.async.SendingSearch;
import org.fourthline.cling.registry.Registry;
import org.fourthline.cling.registry.RegistryImpl;
import org.fourthline.cling.registry.RegistryMaintainer;
import org.fourthline.cling.transport.RouterException;
import org.fourthline.cling.transport.spi.NetworkAddressFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Alternative
public class MockUpnpService implements UpnpService {
    protected final UpnpServiceConfiguration configuration;
    protected final ControlPoint controlPoint;
    protected final NetworkAddressFactory networkAddressFactory;
    protected final ProtocolFactory protocolFactory;
    protected final Registry registry;
    protected final MockRouter router;

    public static class MockProtocolFactory extends ProtocolFactoryImpl {
        private boolean sendsAlive;

        public MockProtocolFactory(UpnpService upnpService, boolean z) {
            super(upnpService);
            this.sendsAlive = z;
        }

        @Override // org.fourthline.cling.protocol.ProtocolFactoryImpl, org.fourthline.cling.protocol.ProtocolFactory
        public SendingNotificationAlive createSendingNotificationAlive(LocalDevice localDevice) {
            return new SendingNotificationAlive(getUpnpService(), localDevice) { // from class: org.fourthline.cling.mock.MockUpnpService.MockProtocolFactory.1
                @Override // org.fourthline.cling.protocol.async.SendingNotificationAlive, org.fourthline.cling.protocol.async.SendingNotification, org.fourthline.cling.protocol.SendingAsync
                public void execute() throws RouterException {
                    if (MockProtocolFactory.this.sendsAlive) {
                        super.execute();
                    }
                }
            };
        }

        @Override // org.fourthline.cling.protocol.ProtocolFactoryImpl, org.fourthline.cling.protocol.ProtocolFactory
        public SendingSearch createSendingSearch(UpnpHeader upnpHeader, int i) {
            return new SendingSearch(getUpnpService(), upnpHeader, i) { // from class: org.fourthline.cling.mock.MockUpnpService.MockProtocolFactory.2
                @Override // org.fourthline.cling.protocol.async.SendingSearch
                public int getBulkIntervalMilliseconds() {
                    return 0;
                }
            };
        }
    }

    public MockUpnpService(boolean z, final MockUpnpServiceConfiguration mockUpnpServiceConfiguration) {
        this.configuration = mockUpnpServiceConfiguration;
        ProtocolFactory protocolFactoryCreateProtocolFactory = createProtocolFactory(this, z);
        this.protocolFactory = protocolFactoryCreateProtocolFactory;
        RegistryImpl registryImpl = new RegistryImpl(this) { // from class: org.fourthline.cling.mock.MockUpnpService.1
            @Override // org.fourthline.cling.registry.RegistryImpl
            public RegistryMaintainer createRegistryMaintainer() {
                if (mockUpnpServiceConfiguration.isMaintainsRegistry()) {
                    return super.createRegistryMaintainer();
                }
                return null;
            }
        };
        this.registry = registryImpl;
        this.networkAddressFactory = mockUpnpServiceConfiguration.createNetworkAddressFactory();
        this.router = createRouter();
        this.controlPoint = new ControlPointImpl(mockUpnpServiceConfiguration, protocolFactoryCreateProtocolFactory, registryImpl);
    }

    public ProtocolFactory createProtocolFactory(UpnpService upnpService, boolean z) {
        return new MockProtocolFactory(upnpService, z);
    }

    public MockRouter createRouter() {
        return new MockRouter(getConfiguration(), getProtocolFactory());
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
    public void shutdown() {
        getRegistry().shutdown();
        getConfiguration().shutdown();
    }

    @Override // org.fourthline.cling.UpnpService
    public MockRouter getRouter() {
        return this.router;
    }

    public MockUpnpService(MockUpnpServiceConfiguration mockUpnpServiceConfiguration) {
        this(false, mockUpnpServiceConfiguration);
    }

    public MockUpnpService(boolean z, boolean z2) {
        this(z, new MockUpnpServiceConfiguration(z2, false));
    }

    public MockUpnpService(boolean z, boolean z2, boolean z3) {
        this(z, new MockUpnpServiceConfiguration(z2, z3));
    }

    public MockUpnpService() {
        this(false, new MockUpnpServiceConfiguration(false, false));
    }
}
