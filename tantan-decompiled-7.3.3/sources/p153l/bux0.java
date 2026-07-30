package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzhz;
import com.tencent.ugc.TXRecordCommon;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class bux0 extends m8x0 {

    /* JADX INFO: renamed from: e */
    public final byte[] f78559e;

    /* JADX INFO: renamed from: f */
    public final DatagramPacket f78560f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Uri f78561g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public DatagramSocket f78562h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public MulticastSocket f78563i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public InetAddress f78564j;

    /* JADX INFO: renamed from: k */
    public boolean f78565k;

    /* JADX INFO: renamed from: l */
    public int f78566l;

    public bux0(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f78559e = bArr;
        this.f78560f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws zzhz {
        if (i2 == 0) {
            return 0;
        }
        if (this.f78566l == 0) {
            try {
                DatagramSocket datagramSocket = this.f78562h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(this.f78560f);
                int length = this.f78560f.getLength();
                this.f78566l = length;
                zzg(length);
            } catch (SocketTimeoutException e) {
                throw new zzhz(e, 2002);
            } catch (IOException e2) {
                throw new zzhz(e2, 2001);
            }
        }
        int length2 = this.f78560f.getLength();
        int i3 = this.f78566l;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f78559e, length2 - i3, bArr, i, iMin);
        this.f78566l -= iMin;
        return iMin;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws zzhz {
        Uri uri = akx0Var.f72047a;
        this.f78561g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f78561g.getPort();
        m157522k(akx0Var);
        try {
            this.f78564j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f78564j, port);
            if (this.f78564j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f78563i = multicastSocket;
                multicastSocket.joinGroup(this.f78564j);
                this.f78562h = this.f78563i;
            } else {
                this.f78562h = new DatagramSocket(inetSocketAddress);
            }
            this.f78562h.setSoTimeout(TXRecordCommon.AUDIO_SAMPLERATE_8000);
            this.f78565k = true;
            m157523l(akx0Var);
            return -1L;
        } catch (IOException e) {
            throw new zzhz(e, 2001);
        } catch (SecurityException e2) {
            throw new zzhz(e2, 2006);
        }
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        return this.f78561g;
    }

    @Override // p153l.fex0
    public final void zzd() {
        this.f78561g = null;
        MulticastSocket multicastSocket = this.f78563i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f78564j;
                if (inetAddress == null) {
                    throw null;
                }
                multicastSocket.leaveGroup(inetAddress);
                this.f78563i = null;
            } catch (IOException unused) {
            }
        }
        DatagramSocket datagramSocket = this.f78562h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f78562h = null;
        }
        this.f78564j = null;
        this.f78566l = 0;
        if (this.f78565k) {
            this.f78565k = false;
            m157521j();
        }
    }

    public bux0() {
        this(2000);
    }
}
