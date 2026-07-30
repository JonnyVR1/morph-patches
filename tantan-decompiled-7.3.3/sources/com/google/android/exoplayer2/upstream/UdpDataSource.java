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
import p153l.w11;
import p153l.zi2;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class UdpDataSource extends zi2 {

    /* JADX INFO: renamed from: e */
    public final int f9520e;

    /* JADX INFO: renamed from: f */
    public final byte[] f9521f;

    /* JADX INFO: renamed from: g */
    public final DatagramPacket f9522g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Uri f9523h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public DatagramSocket f9524i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public MulticastSocket f9525j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public InetAddress f9526k;

    /* JADX INFO: renamed from: l */
    public boolean f9527l;

    /* JADX INFO: renamed from: m */
    public int f9528m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public UdpDataSource(int i, int i2) {
        super(true);
        this.f9520e = i2;
        byte[] bArr = new byte[i];
        this.f9521f = bArr;
        this.f9522g = new DatagramPacket(bArr, 0, i);
    }

    @Override // p153l.g6c
    public void close() {
        this.f9523h = null;
        MulticastSocket multicastSocket = this.f9525j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) w11.m204369e(this.f9526k));
            } catch (IOException unused) {
            }
            this.f9525j = null;
        }
        DatagramSocket datagramSocket = this.f9524i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f9524i = null;
        }
        this.f9526k = null;
        this.f9528m = 0;
        if (this.f9527l) {
            this.f9527l = false;
            m219719r();
        }
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        return this.f9523h;
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f9524i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) throws UdpDataSourceException {
        Uri uri = c2070a.f9529a;
        this.f9523h = uri;
        String str = (String) w11.m204369e(uri.getHost());
        int port = this.f9523h.getPort();
        m219720s(c2070a);
        try {
            this.f9526k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f9526k, port);
            if (this.f9526k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f9525j = multicastSocket;
                multicastSocket.joinGroup(this.f9526k);
                this.f9524i = this.f9525j;
            } else {
                this.f9524i = new DatagramSocket(inetSocketAddress);
            }
            this.f9524i.setSoTimeout(this.f9520e);
            this.f9527l = true;
            m219721t(c2070a);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(e2, 2006);
        }
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f9528m == 0) {
            try {
                ((DatagramSocket) w11.m204369e(this.f9524i)).receive(this.f9522g);
                int length = this.f9522g.getLength();
                this.f9528m = length;
                m219718q(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = this.f9522g.getLength();
        int i3 = this.f9528m;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f9521f, length2 - i3, bArr, i, iMin);
        this.f9528m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i) {
        this(i, TXRecordCommon.AUDIO_SAMPLERATE_8000);
    }

    public UdpDataSource() {
        this(2000);
    }
}
