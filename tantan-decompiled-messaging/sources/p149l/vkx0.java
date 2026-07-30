package p149l;

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
public final class vkx0 extends gzw0 {

    /* JADX INFO: renamed from: e */
    public final byte[] f181859e;

    /* JADX INFO: renamed from: f */
    public final DatagramPacket f181860f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Uri f181861g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public DatagramSocket f181862h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public MulticastSocket f181863i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public InetAddress f181864j;

    /* JADX INFO: renamed from: k */
    public boolean f181865k;

    /* JADX INFO: renamed from: l */
    public int f181866l;

    public vkx0(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f181859e = bArr;
        this.f181860f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws zzhz {
        if (i2 == 0) {
            return 0;
        }
        if (this.f181866l == 0) {
            try {
                DatagramSocket datagramSocket = this.f181862h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(this.f181860f);
                int length = this.f181860f.getLength();
                this.f181866l = length;
                zzg(length);
            } catch (SocketTimeoutException e) {
                throw new zzhz(e, 2002);
            } catch (IOException e2) {
                throw new zzhz(e2, 2001);
            }
        }
        int length2 = this.f181860f.getLength();
        int i3 = this.f181866l;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f181859e, length2 - i3, bArr, i, iMin);
        this.f181866l -= iMin;
        return iMin;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws zzhz {
        Uri uri = uax0Var.f175648a;
        this.f181861g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f181861g.getPort();
        m128923k(uax0Var);
        try {
            this.f181864j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f181864j, port);
            if (this.f181864j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f181863i = multicastSocket;
                multicastSocket.joinGroup(this.f181864j);
                this.f181862h = this.f181863i;
            } else {
                this.f181862h = new DatagramSocket(inetSocketAddress);
            }
            this.f181862h.setSoTimeout(TXRecordCommon.AUDIO_SAMPLERATE_8000);
            this.f181865k = true;
            m128924l(uax0Var);
            return -1L;
        } catch (IOException e) {
            throw new zzhz(e, 2001);
        } catch (SecurityException e2) {
            throw new zzhz(e2, 2006);
        }
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        return this.f181861g;
    }

    @Override // p149l.z4x0
    public final void zzd() {
        this.f181861g = null;
        MulticastSocket multicastSocket = this.f181863i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f181864j;
                if (inetAddress == null) {
                    throw null;
                }
                multicastSocket.leaveGroup(inetAddress);
                this.f181863i = null;
            } catch (IOException unused) {
            }
        }
        DatagramSocket datagramSocket = this.f181862h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f181862h = null;
        }
        this.f181864j = null;
        this.f181866l = 0;
        if (this.f181865k) {
            this.f181865k = false;
            m128922j();
        }
    }

    public vkx0() {
        this(2000);
    }
}
