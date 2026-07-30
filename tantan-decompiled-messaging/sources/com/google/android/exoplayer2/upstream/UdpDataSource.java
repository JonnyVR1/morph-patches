package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.tencent.ugc.TXRecordCommon;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import p149l.p11;
import p149l.si2;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class UdpDataSource extends si2 {

    /* JADX INFO: renamed from: e */
    public final int f9483e;

    /* JADX INFO: renamed from: f */
    public final byte[] f9484f;

    /* JADX INFO: renamed from: g */
    public final DatagramPacket f9485g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Uri f9486h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public DatagramSocket f9487i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public MulticastSocket f9488j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public InetAddress f9489k;

    /* JADX INFO: renamed from: l */
    public boolean f9490l;

    /* JADX INFO: renamed from: m */
    public int f9491m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public UdpDataSource(int i, int i2) {
        super(true);
        this.f9483e = i2;
        byte[] bArr = new byte[i];
        this.f9484f = bArr;
        this.f9485g = new DatagramPacket(bArr, 0, i);
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        return this.f9486h;
    }

    @Override // p149l.a5c
    public void close() {
        this.f9486h = null;
        MulticastSocket multicastSocket = this.f9488j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) p11.m167011e(this.f9489k));
            } catch (IOException unused) {
            }
            this.f9488j = null;
        }
        DatagramSocket datagramSocket = this.f9487i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f9487i = null;
        }
        this.f9489k = null;
        this.f9491m = 0;
        if (this.f9490l) {
            this.f9490l = false;
            m184311r();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f9487i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) throws UdpDataSourceException {
        Uri uri = c2047a.f9492a;
        this.f9486h = uri;
        String str = (String) p11.m167011e(uri.getHost());
        int port = this.f9486h.getPort();
        m184312s(c2047a);
        try {
            this.f9489k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f9489k, port);
            if (this.f9489k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f9488j = multicastSocket;
                multicastSocket.joinGroup(this.f9489k);
                this.f9487i = this.f9488j;
            } else {
                this.f9487i = new DatagramSocket(inetSocketAddress);
            }
            this.f9487i.setSoTimeout(this.f9483e);
            this.f9490l = true;
            m184313t(c2047a);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(e2, 2006);
        }
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f9491m == 0) {
            try {
                ((DatagramSocket) p11.m167011e(this.f9487i)).receive(this.f9485g);
                int length = this.f9485g.getLength();
                this.f9491m = length;
                m184310q(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = this.f9485g.getLength();
        int i3 = this.f9491m;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f9484f, length2 - i3, bArr, i, iMin);
        this.f9491m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i) {
        this(i, TXRecordCommon.AUDIO_SAMPLERATE_8000);
    }

    public UdpDataSource() {
        this(2000);
    }
}
