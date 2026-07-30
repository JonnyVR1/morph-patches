package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import l.ig3;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UDPTransport implements DatagramTransport {
    protected static final int MAX_IP_OVERHEAD = 84;
    protected static final int MIN_IP_OVERHEAD = 20;
    protected static final int UDP_OVERHEAD = 8;
    protected final int receiveLimit;
    protected final int sendLimit;
    protected final DatagramSocket socket;

    public UDPTransport(DatagramSocket datagramSocket, int i) throws IOException {
        if (!datagramSocket.isBound() || !datagramSocket.isConnected()) {
            ig3.a("'socket' must be bound and connected");
            throw null;
        }
        this.socket = datagramSocket;
        this.receiveLimit = i - 28;
        this.sendLimit = i - 92;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void close() throws IOException {
        this.socket.close();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getReceiveLimit() {
        return this.receiveLimit;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getSendLimit() {
        return this.sendLimit;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int receive(byte[] bArr, int i, int i2, int i3) throws IOException {
        this.socket.setSoTimeout(i3);
        DatagramPacket datagramPacket = new DatagramPacket(bArr, i, i2);
        this.socket.receive(datagramPacket);
        return datagramPacket.getLength();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void send(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > getSendLimit()) {
            csi0.m3424a(80);
        } else {
            this.socket.send(new DatagramPacket(bArr, i, i2));
        }
    }
}
