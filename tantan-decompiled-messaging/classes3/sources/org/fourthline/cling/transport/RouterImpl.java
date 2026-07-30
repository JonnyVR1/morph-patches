package org.fourthline.cling.transport;

import java.net.BindException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Default;
import org.fourthline.cling.UpnpServiceConfiguration;
import org.fourthline.cling.model.NetworkAddress;
import org.fourthline.cling.model.message.IncomingDatagramMessage;
import org.fourthline.cling.model.message.OutgoingDatagramMessage;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.protocol.ProtocolCreationException;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.protocol.ReceivingAsync;
import org.fourthline.cling.transport.spi.DatagramIO;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.MulticastReceiver;
import org.fourthline.cling.transport.spi.NetworkAddressFactory;
import org.fourthline.cling.transport.spi.NoNetworkException;
import org.fourthline.cling.transport.spi.StreamClient;
import org.fourthline.cling.transport.spi.StreamServer;
import org.fourthline.cling.transport.spi.UpnpStream;
import org.seamless.util.Exceptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@ApplicationScoped
public class RouterImpl implements Router {
    private static Logger log = Logger.getLogger(Router.class.getName());
    protected UpnpServiceConfiguration configuration;
    protected final Map<InetAddress, DatagramIO> datagramIOs;
    protected volatile boolean enabled;
    protected final Map<NetworkInterface, MulticastReceiver> multicastReceivers;
    protected NetworkAddressFactory networkAddressFactory;
    protected ProtocolFactory protocolFactory;
    protected Lock readLock;
    protected ReentrantReadWriteLock routerLock;
    protected StreamClient streamClient;
    protected final Map<InetAddress, StreamServer> streamServers;
    protected Lock writeLock;

    public RouterImpl(UpnpServiceConfiguration upnpServiceConfiguration, ProtocolFactory protocolFactory) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.routerLock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = this.routerLock.writeLock();
        this.multicastReceivers = new HashMap();
        this.datagramIOs = new HashMap();
        this.streamServers = new HashMap();
        log.info("Creating Router: ".concat(getClass().getName()));
        this.configuration = upnpServiceConfiguration;
        this.protocolFactory = protocolFactory;
    }

    @Override // org.fourthline.cling.transport.Router
    public void broadcast(byte[] bArr) throws RouterException {
        lock(this.readLock);
        try {
            if (this.enabled) {
                for (Map.Entry<InetAddress, DatagramIO> entry : this.datagramIOs.entrySet()) {
                    InetAddress broadcastAddress = this.networkAddressFactory.getBroadcastAddress(entry.getKey());
                    if (broadcastAddress != null) {
                        log.fine("Sending UDP datagram to broadcast address: " + broadcastAddress.getHostAddress());
                        entry.getValue().send(new DatagramPacket(bArr, bArr.length, broadcastAddress, 9));
                    }
                }
            } else {
                log.fine("Router disabled, not broadcasting bytes: " + bArr.length);
            }
            unlock(this.readLock);
        } catch (Throwable th) {
            unlock(this.readLock);
            throw th;
        }
    }

    @Override // org.fourthline.cling.transport.Router
    public boolean disable() throws RouterException {
        lock(this.writeLock);
        try {
            if (!this.enabled) {
                return false;
            }
            log.fine("Disabling network services...");
            if (this.streamClient != null) {
                log.fine("Stopping stream client connection management/pool");
                this.streamClient.stop();
                this.streamClient = null;
            }
            for (Map.Entry<InetAddress, StreamServer> entry : this.streamServers.entrySet()) {
                log.fine("Stopping stream server on address: " + entry.getKey());
                entry.getValue().stop();
            }
            this.streamServers.clear();
            for (Map.Entry<NetworkInterface, MulticastReceiver> entry2 : this.multicastReceivers.entrySet()) {
                log.fine("Stopping multicast receiver on interface: " + entry2.getKey().getDisplayName());
                entry2.getValue().stop();
            }
            this.multicastReceivers.clear();
            for (Map.Entry<InetAddress, DatagramIO> entry3 : this.datagramIOs.entrySet()) {
                log.fine("Stopping datagram I/O on address: " + entry3.getKey());
                entry3.getValue().stop();
            }
            this.datagramIOs.clear();
            this.networkAddressFactory = null;
            this.enabled = false;
            return true;
        } finally {
            unlock(this.writeLock);
        }
    }

    @Override // org.fourthline.cling.transport.Router
    public boolean enable() throws RouterException {
        lock(this.writeLock);
        try {
            if (!this.enabled) {
                try {
                    log.fine("Starting networking services...");
                    NetworkAddressFactory networkAddressFactoryCreateNetworkAddressFactory = getConfiguration().createNetworkAddressFactory();
                    this.networkAddressFactory = networkAddressFactoryCreateNetworkAddressFactory;
                    startInterfaceBasedTransports(networkAddressFactoryCreateNetworkAddressFactory.getNetworkInterfaces());
                    startAddressBasedTransports(this.networkAddressFactory.getBindAddresses());
                    if (!this.networkAddressFactory.hasUsableNetwork()) {
                        throw new NoNetworkException("No usable network interface and/or addresses available, check the log for errors.");
                    }
                    this.streamClient = getConfiguration().createStreamClient();
                    this.enabled = true;
                    unlock(this.writeLock);
                    return true;
                } catch (InitializationException e) {
                    handleStartFailure(e);
                }
            }
            unlock(this.writeLock);
            return false;
        } catch (Throwable th) {
            unlock(this.writeLock);
            throw th;
        }
    }

    @Override // org.fourthline.cling.transport.Router
    public List<NetworkAddress> getActiveStreamServers(InetAddress inetAddress) throws RouterException {
        StreamServer streamServer;
        lock(this.readLock);
        try {
            if (!this.enabled || this.streamServers.size() <= 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (inetAddress == null || (streamServer = this.streamServers.get(inetAddress)) == null) {
                for (Map.Entry<InetAddress, StreamServer> entry : this.streamServers.entrySet()) {
                    arrayList.add(new NetworkAddress(entry.getKey(), entry.getValue().getPort(), this.networkAddressFactory.getHardwareAddress(entry.getKey())));
                }
            } else {
                arrayList.add(new NetworkAddress(inetAddress, streamServer.getPort(), this.networkAddressFactory.getHardwareAddress(inetAddress)));
            }
            return arrayList;
        } finally {
            unlock(this.readLock);
        }
    }

    @Override // org.fourthline.cling.transport.Router
    public UpnpServiceConfiguration getConfiguration() {
        return this.configuration;
    }

    public int getLockTimeoutMillis() {
        return 6000;
    }

    @Override // org.fourthline.cling.transport.Router
    public ProtocolFactory getProtocolFactory() {
        return this.protocolFactory;
    }

    @Override // org.fourthline.cling.transport.Router
    public void handleStartFailure(InitializationException initializationException) throws InitializationException {
        if (initializationException instanceof NoNetworkException) {
            log.info("Unable to initialize network router, no network found.");
            return;
        }
        log.severe("Unable to initialize network router: " + initializationException);
        log.severe("Cause: " + Exceptions.unwrap(initializationException));
    }

    @Override // org.fourthline.cling.transport.Router
    public boolean isEnabled() {
        return this.enabled;
    }

    public void lock(Lock lock, int i) throws RouterException {
        try {
            log.finest("Trying to obtain lock with timeout milliseconds '" + i + "': " + lock.getClass().getSimpleName());
            if (lock.tryLock(i, TimeUnit.MILLISECONDS)) {
                log.finest("Acquired router lock: ".concat(lock.getClass().getSimpleName()));
                return;
            }
            throw new RouterException("Router wasn't available exclusively after waiting " + i + "ms, lock failed: " + lock.getClass().getSimpleName());
        } catch (InterruptedException e) {
            throw new RouterException("Interruption while waiting for exclusive access: ".concat(lock.getClass().getSimpleName()), e);
        }
    }

    @Override // org.fourthline.cling.transport.Router
    public void received(IncomingDatagramMessage incomingDatagramMessage) {
        if (!this.enabled) {
            log.fine("Router disabled, ignoring incoming message: " + incomingDatagramMessage);
            return;
        }
        try {
            ReceivingAsync receivingAsyncCreateReceivingAsync = getProtocolFactory().createReceivingAsync(incomingDatagramMessage);
            if (receivingAsyncCreateReceivingAsync == null) {
                if (log.isLoggable(Level.FINEST)) {
                    log.finest("No protocol, ignoring received message: " + incomingDatagramMessage);
                    return;
                }
                return;
            }
            if (log.isLoggable(Level.FINE)) {
                log.fine("Received asynchronous message: " + incomingDatagramMessage);
            }
            getConfiguration().getAsyncProtocolExecutor().execute(receivingAsyncCreateReceivingAsync);
        } catch (ProtocolCreationException e) {
            log.warning("Handling received datagram failed - " + Exceptions.unwrap(e).toString());
        }
    }

    @Override // org.fourthline.cling.transport.Router
    public StreamResponseMessage send(StreamRequestMessage streamRequestMessage) throws RouterException {
        lock(this.readLock);
        try {
            if (!this.enabled) {
                log.fine("Router disabled, not sending stream request: " + streamRequestMessage);
            } else {
                if (this.streamClient != null) {
                    log.fine("Sending via TCP unicast stream: " + streamRequestMessage);
                    try {
                        StreamResponseMessage streamResponseMessageSendRequest = this.streamClient.sendRequest(streamRequestMessage);
                        unlock(this.readLock);
                        return streamResponseMessageSendRequest;
                    } catch (InterruptedException e) {
                        throw new RouterException("Sending stream request was interrupted", e);
                    }
                }
                log.fine("No StreamClient available, not sending: " + streamRequestMessage);
            }
            unlock(this.readLock);
            return null;
        } catch (Throwable th) {
            unlock(this.readLock);
            throw th;
        }
    }

    @Override // org.fourthline.cling.transport.Router
    public void shutdown() throws RouterException {
        disable();
    }

    public void startAddressBasedTransports(Iterator<InetAddress> it) throws InitializationException {
        while (it.hasNext()) {
            InetAddress next = it.next();
            StreamServer streamServerCreateStreamServer = getConfiguration().createStreamServer(this.networkAddressFactory);
            if (streamServerCreateStreamServer == null) {
                log.info("Configuration did not create a StreamServer for: " + next);
            } else {
                try {
                    if (log.isLoggable(Level.FINE)) {
                        log.fine("Init stream server on address: " + next);
                    }
                    streamServerCreateStreamServer.init(next, this);
                    this.streamServers.put(next, streamServerCreateStreamServer);
                } catch (InitializationException e) {
                    Throwable thUnwrap = Exceptions.unwrap(e);
                    if (!(thUnwrap instanceof BindException)) {
                        throw e;
                    }
                    log.warning("Failed to init StreamServer: " + thUnwrap);
                    Logger logger = log;
                    Level level = Level.FINE;
                    if (logger.isLoggable(level)) {
                        log.log(level, "Initialization exception root cause", thUnwrap);
                    }
                    log.warning("Removing unusable address: " + next);
                    it.remove();
                }
            }
            DatagramIO datagramIOCreateDatagramIO = getConfiguration().createDatagramIO(this.networkAddressFactory);
            if (datagramIOCreateDatagramIO == null) {
                log.info("Configuration did not create a StreamServer for: " + next);
            } else {
                if (log.isLoggable(Level.FINE)) {
                    log.fine("Init datagram I/O on address: " + next);
                }
                datagramIOCreateDatagramIO.init(next, this, getConfiguration().getDatagramProcessor());
                this.datagramIOs.put(next, datagramIOCreateDatagramIO);
            }
        }
        for (Map.Entry<InetAddress, StreamServer> entry : this.streamServers.entrySet()) {
            if (log.isLoggable(Level.FINE)) {
                log.fine("Starting stream server on address: " + entry.getKey());
            }
            getConfiguration().getStreamServerExecutorService().execute(entry.getValue());
        }
        for (Map.Entry<InetAddress, DatagramIO> entry2 : this.datagramIOs.entrySet()) {
            if (log.isLoggable(Level.FINE)) {
                log.fine("Starting datagram I/O on address: " + entry2.getKey());
            }
            getConfiguration().getDatagramIOExecutor().execute(entry2.getValue());
        }
    }

    public void startInterfaceBasedTransports(Iterator<NetworkInterface> it) throws InitializationException {
        while (it.hasNext()) {
            NetworkInterface next = it.next();
            MulticastReceiver multicastReceiverCreateMulticastReceiver = getConfiguration().createMulticastReceiver(this.networkAddressFactory);
            if (multicastReceiverCreateMulticastReceiver == null) {
                log.info("Configuration did not create a MulticastReceiver for: " + next);
            } else {
                if (log.isLoggable(Level.FINE)) {
                    log.fine("Init multicast receiver on interface: " + next.getDisplayName());
                }
                multicastReceiverCreateMulticastReceiver.init(next, this, this.networkAddressFactory, getConfiguration().getDatagramProcessor());
                this.multicastReceivers.put(next, multicastReceiverCreateMulticastReceiver);
            }
        }
        for (Map.Entry<NetworkInterface, MulticastReceiver> entry : this.multicastReceivers.entrySet()) {
            if (log.isLoggable(Level.FINE)) {
                log.fine("Starting multicast receiver on interface: " + entry.getKey().getDisplayName());
            }
            getConfiguration().getMulticastReceiverExecutor().execute(entry.getValue());
        }
    }

    public void unlock(Lock lock) {
        log.finest("Releasing router lock: ".concat(lock.getClass().getSimpleName()));
        lock.unlock();
    }

    public RouterImpl() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.routerLock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = this.routerLock.writeLock();
        this.multicastReceivers = new HashMap();
        this.datagramIOs = new HashMap();
        this.streamServers = new HashMap();
    }

    public boolean enable(@Observes @Default EnableRouter enableRouter) throws RouterException {
        return enable();
    }

    @Override // org.fourthline.cling.transport.Router
    public void send(OutgoingDatagramMessage outgoingDatagramMessage) throws RouterException {
        lock(this.readLock);
        try {
            if (this.enabled) {
                Iterator<DatagramIO> it = this.datagramIOs.values().iterator();
                while (it.hasNext()) {
                    it.next().send(outgoingDatagramMessage);
                }
            } else {
                log.fine("Router disabled, not sending datagram: " + outgoingDatagramMessage);
            }
        } finally {
            unlock(this.readLock);
        }
    }

    public void lock(Lock lock) throws RouterException {
        lock(lock, getLockTimeoutMillis());
    }

    @Override // org.fourthline.cling.transport.Router
    public void received(UpnpStream upnpStream) {
        if (!this.enabled) {
            log.fine("Router disabled, ignoring incoming: " + upnpStream);
            return;
        }
        log.fine("Received synchronous stream: " + upnpStream);
        getConfiguration().getSyncProtocolExecutorService().execute(upnpStream);
    }

    public boolean disable(@Observes @Default DisableRouter disableRouter) throws RouterException {
        return disable();
    }
}
