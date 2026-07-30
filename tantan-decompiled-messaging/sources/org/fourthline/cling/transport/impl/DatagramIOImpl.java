package org.fourthline.cling.transport.impl;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.OutgoingDatagramMessage;
import org.fourthline.cling.transport.Router;
import org.fourthline.cling.transport.spi.DatagramIO;
import org.fourthline.cling.transport.spi.DatagramProcessor;
import org.fourthline.cling.transport.spi.InitializationException;
import p149l.aag0;

/* JADX INFO: loaded from: classes3.dex */
public class DatagramIOImpl implements DatagramIO<DatagramIOConfigurationImpl> {
    private static Logger log = Logger.getLogger(DatagramIO.class.getName());
    protected final DatagramIOConfigurationImpl configuration;
    protected DatagramProcessor datagramProcessor;
    protected InetSocketAddress localAddress;
    protected Router router;
    protected MulticastSocket socket;

    public DatagramIOImpl(DatagramIOConfigurationImpl datagramIOConfigurationImpl) {
        this.configuration = datagramIOConfigurationImpl;
    }

    @Override // org.fourthline.cling.transport.spi.DatagramIO
    public synchronized void init(InetAddress inetAddress, Router router, DatagramProcessor datagramProcessor) throws InitializationException {
        this.router = router;
        this.datagramProcessor = datagramProcessor;
        try {
            log.info("Creating bound socket (for datagram input/output) on: " + inetAddress);
            this.localAddress = new InetSocketAddress(inetAddress, 0);
            MulticastSocket multicastSocket = new MulticastSocket(this.localAddress);
            this.socket = multicastSocket;
            multicastSocket.setTimeToLive(this.configuration.getTimeToLive());
            this.socket.setReceiveBufferSize(262144);
        } catch (Exception e) {
            throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        log.fine("Entering blocking receiving loop, listening for UDP datagrams on: " + this.socket.getLocalAddress());
        while (true) {
            try {
                int maxDatagramBytes = getConfiguration().getMaxDatagramBytes();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[maxDatagramBytes], maxDatagramBytes);
                this.socket.receive(datagramPacket);
                log.fine("UDP datagram received from: " + datagramPacket.getAddress().getHostAddress() + ":" + datagramPacket.getPort() + " on: " + this.localAddress);
                this.router.received(this.datagramProcessor.read(this.localAddress.getAddress(), datagramPacket));
            } catch (SocketException unused) {
                log.fine("Socket closed");
                try {
                    if (this.socket.isClosed()) {
                        return;
                    }
                    log.fine("Closing unicast socket");
                    this.socket.close();
                    return;
                } catch (Exception e) {
                    aag0.m95543a(e);
                    return;
                }
            } catch (UnsupportedDataException e2) {
                log.info("Could not read datagram: " + e2.getMessage());
            } catch (Exception e3) {
                aag0.m95543a(e3);
                return;
            }
        }
    }

    @Override // org.fourthline.cling.transport.spi.DatagramIO
    public synchronized void send(DatagramPacket datagramPacket) {
        if (log.isLoggable(Level.FINE)) {
            log.fine("Sending message from address: " + this.localAddress);
        }
        try {
            try {
                this.socket.send(datagramPacket);
            } catch (SocketException unused) {
                log.fine("Socket closed, aborting datagram send to: " + datagramPacket.getAddress());
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            log.log(Level.SEVERE, "Exception sending datagram to: " + datagramPacket.getAddress() + ": " + e2, (Throwable) e2);
        }
    }

    @Override // org.fourthline.cling.transport.spi.DatagramIO
    public synchronized void stop() {
        MulticastSocket multicastSocket = this.socket;
        if (multicastSocket != null && !multicastSocket.isClosed()) {
            this.socket.close();
        }
    }

    @Override // org.fourthline.cling.transport.spi.DatagramIO
    public DatagramIOConfigurationImpl getConfiguration() {
        return this.configuration;
    }

    @Override // org.fourthline.cling.transport.spi.DatagramIO
    public synchronized void send(OutgoingDatagramMessage outgoingDatagramMessage) {
        try {
            Logger logger = log;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                log.fine("Sending message from address: " + this.localAddress);
            }
            DatagramPacket datagramPacketWrite = this.datagramProcessor.write(outgoingDatagramMessage);
            if (log.isLoggable(level)) {
                log.fine("Sending UDP datagram packet to: " + outgoingDatagramMessage.getDestinationAddress() + ":" + outgoingDatagramMessage.getDestinationPort());
            }
            send(datagramPacketWrite);
        } catch (Throwable th) {
            throw th;
        }
    }
}
