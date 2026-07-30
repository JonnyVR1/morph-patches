package org.fourthline.cling;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import l.reg0;
import org.fourthline.cling.binding.xml.DeviceDescriptorBinder;
import org.fourthline.cling.binding.xml.ServiceDescriptorBinder;
import org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderImpl;
import org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderImpl;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.Namespace;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.meta.RemoteDeviceIdentity;
import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.transport.impl.DatagramIOConfigurationImpl;
import org.fourthline.cling.transport.impl.DatagramIOImpl;
import org.fourthline.cling.transport.impl.DatagramProcessorImpl;
import org.fourthline.cling.transport.impl.GENAEventProcessorImpl;
import org.fourthline.cling.transport.impl.MulticastReceiverConfigurationImpl;
import org.fourthline.cling.transport.impl.MulticastReceiverImpl;
import org.fourthline.cling.transport.impl.NetworkAddressFactoryImpl;
import org.fourthline.cling.transport.impl.SOAPActionProcessorImpl;
import org.fourthline.cling.transport.impl.StreamClientConfigurationImpl;
import org.fourthline.cling.transport.impl.StreamClientImpl;
import org.fourthline.cling.transport.impl.StreamServerConfigurationImpl;
import org.fourthline.cling.transport.impl.StreamServerImpl;
import org.fourthline.cling.transport.spi.DatagramIO;
import org.fourthline.cling.transport.spi.DatagramProcessor;
import org.fourthline.cling.transport.spi.GENAEventProcessor;
import org.fourthline.cling.transport.spi.MulticastReceiver;
import org.fourthline.cling.transport.spi.NetworkAddressFactory;
import org.fourthline.cling.transport.spi.SOAPActionProcessor;
import org.fourthline.cling.transport.spi.StreamClient;
import org.fourthline.cling.transport.spi.StreamServer;
import org.seamless.util.Exceptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Alternative
public class DefaultUpnpServiceConfiguration implements UpnpServiceConfiguration {
    private static Logger log = Logger.getLogger(DefaultUpnpServiceConfiguration.class.getName());
    private final DatagramProcessor datagramProcessor;
    private final ExecutorService defaultExecutorService;
    private final DeviceDescriptorBinder deviceDescriptorBinderUDA10;
    private final GENAEventProcessor genaEventProcessor;
    private final Namespace namespace;
    private final ServiceDescriptorBinder serviceDescriptorBinderUDA10;
    private final SOAPActionProcessor soapActionProcessor;
    private final int streamListenPort;

    public static class ClingThreadFactory implements ThreadFactory {
        protected final ThreadGroup group;
        protected final AtomicInteger threadNumber = new AtomicInteger(1);
        protected final String namePrefix = "cling-";

        public ClingThreadFactory() {
            SecurityManager securityManager = System.getSecurityManager();
            this.group = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.group, runnable, "cling-" + this.threadNumber.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public DefaultUpnpServiceConfiguration(int i, boolean z) {
        if (z && ModelUtil.ANDROID_RUNTIME) {
            throw new Error("Unsupported runtime environment, use org.fourthline.cling.android.AndroidUpnpServiceConfiguration");
        }
        this.streamListenPort = i;
        this.defaultExecutorService = createDefaultExecutorService();
        this.datagramProcessor = createDatagramProcessor();
        this.soapActionProcessor = createSOAPActionProcessor();
        this.genaEventProcessor = createGENAEventProcessor();
        this.deviceDescriptorBinderUDA10 = createDeviceDescriptorBinderUDA10();
        this.serviceDescriptorBinderUDA10 = createServiceDescriptorBinderUDA10();
        this.namespace = createNamespace();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public DatagramIO createDatagramIO(NetworkAddressFactory networkAddressFactory) {
        return new DatagramIOImpl(new DatagramIOConfigurationImpl());
    }

    public DatagramProcessor createDatagramProcessor() {
        return new DatagramProcessorImpl();
    }

    public ExecutorService createDefaultExecutorService() {
        return new ClingExecutor();
    }

    public DeviceDescriptorBinder createDeviceDescriptorBinderUDA10() {
        return new UDA10DeviceDescriptorBinderImpl();
    }

    public GENAEventProcessor createGENAEventProcessor() {
        return new GENAEventProcessorImpl();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public MulticastReceiver createMulticastReceiver(NetworkAddressFactory networkAddressFactory) {
        return new MulticastReceiverImpl(new MulticastReceiverConfigurationImpl(networkAddressFactory.getMulticastGroup(), networkAddressFactory.getMulticastPort()));
    }

    public Namespace createNamespace() {
        return new Namespace();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public NetworkAddressFactory createNetworkAddressFactory() {
        return createNetworkAddressFactory(this.streamListenPort);
    }

    public SOAPActionProcessor createSOAPActionProcessor() {
        return new SOAPActionProcessorImpl();
    }

    public ServiceDescriptorBinder createServiceDescriptorBinderUDA10() {
        return new UDA10ServiceDescriptorBinderImpl();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public StreamClient createStreamClient() {
        return new StreamClientImpl(new StreamClientConfigurationImpl(getSyncProtocolExecutorService()));
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public StreamServer createStreamServer(NetworkAddressFactory networkAddressFactory) {
        return new StreamServerImpl(new StreamServerConfigurationImpl(networkAddressFactory.getStreamListenPort()));
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public int getAliveIntervalMillis() {
        return 0;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public Executor getAsyncProtocolExecutor() {
        return getDefaultExecutorService();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public Executor getDatagramIOExecutor() {
        return getDefaultExecutorService();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public DatagramProcessor getDatagramProcessor() {
        return this.datagramProcessor;
    }

    public ExecutorService getDefaultExecutorService() {
        return this.defaultExecutorService;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public UpnpHeaders getDescriptorRetrievalHeaders(RemoteDeviceIdentity remoteDeviceIdentity) {
        return null;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public DeviceDescriptorBinder getDeviceDescriptorBinderUDA10() {
        return this.deviceDescriptorBinderUDA10;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public UpnpHeaders getEventSubscriptionHeaders(RemoteService remoteService) {
        return null;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public ServiceType[] getExclusiveServiceTypes() {
        return new ServiceType[0];
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public GENAEventProcessor getGenaEventProcessor() {
        return this.genaEventProcessor;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public Executor getMulticastReceiverExecutor() {
        return getDefaultExecutorService();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public Namespace getNamespace() {
        return this.namespace;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public Executor getRegistryListenerExecutor() {
        return getDefaultExecutorService();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public Executor getRegistryMaintainerExecutor() {
        return getDefaultExecutorService();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public int getRegistryMaintenanceIntervalMillis() {
        return 1000;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public Integer getRemoteDeviceMaxAgeSeconds() {
        return null;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public ServiceDescriptorBinder getServiceDescriptorBinderUDA10() {
        return this.serviceDescriptorBinderUDA10;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public SOAPActionProcessor getSoapActionProcessor() {
        return this.soapActionProcessor;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public ExecutorService getStreamServerExecutorService() {
        return getDefaultExecutorService();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public ExecutorService getSyncProtocolExecutorService() {
        return getDefaultExecutorService();
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public boolean isReceivedSubscriptionTimeoutIgnored() {
        return false;
    }

    @Override // org.fourthline.cling.UpnpServiceConfiguration
    public void shutdown() {
        log.fine("Shutting down default executor service");
        getDefaultExecutorService().shutdownNow();
    }

    public NetworkAddressFactory createNetworkAddressFactory(int i) {
        return new NetworkAddressFactoryImpl(i);
    }

    public static class ClingExecutor extends ThreadPoolExecutor implements AutoCloseable {
        public ClingExecutor(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory, rejectedExecutionHandler);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th != null) {
                Throwable thUnwrap = Exceptions.unwrap(th);
                if (thUnwrap instanceof InterruptedException) {
                    return;
                }
                DefaultUpnpServiceConfiguration.log.warning("Thread terminated " + runnable + " abruptly with exception: " + th);
                Logger logger = DefaultUpnpServiceConfiguration.log;
                StringBuilder sb = new StringBuilder("Root cause: ");
                sb.append(thUnwrap);
                logger.warning(sb.toString());
            }
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            reg0.a(this);
        }

        public ClingExecutor() {
            this(new ClingThreadFactory(), new ThreadPoolExecutor.DiscardPolicy() { // from class: org.fourthline.cling.DefaultUpnpServiceConfiguration.ClingExecutor.1
                @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    DefaultUpnpServiceConfiguration.log.info("Thread pool rejected execution of " + runnable.getClass());
                    super.rejectedExecution(runnable, threadPoolExecutor);
                }
            });
        }
    }

    public DefaultUpnpServiceConfiguration(int i) {
        this(i, true);
    }

    public DefaultUpnpServiceConfiguration(boolean z) {
        this(0, z);
    }

    public DefaultUpnpServiceConfiguration() {
        this(0);
    }
}
