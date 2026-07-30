package p149l;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tantanapp.common.data.ProtobufAdapter;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class nb5 {

    /* JADX INFO: renamed from: a */
    public final byte[] f138004a;

    /* JADX INFO: renamed from: b */
    public int f138005b;

    /* JADX INFO: renamed from: c */
    public int f138006c;

    /* JADX INFO: renamed from: d */
    public int f138007d;

    /* JADX INFO: renamed from: e */
    public int f138008e;

    /* JADX INFO: renamed from: f */
    public int f138009f;

    /* JADX INFO: renamed from: h */
    public int f138011h;

    /* JADX INFO: renamed from: g */
    public int f138010g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: i */
    public int f138012i = 64;

    /* JADX INFO: renamed from: j */
    public int f138013j = AudioRoutingController.DEVICE_OUT_USB_HEADSET;

    public nb5(byte[] bArr, int i, int i2) {
        this.f138004a = bArr;
        this.f138005b = i;
        this.f138006c = i2 + i;
        this.f138008e = i;
    }

    /* JADX INFO: renamed from: d */
    public static nb5 m158732d(byte[] bArr, int i, int i2) {
        return new nb5(bArr, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m158733a(int i) throws InvalidProtocolBufferNanoException {
        if (this.f138009f != i) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m158734b() {
        return this.f138008e - this.f138005b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m158735c() {
        return this.f138008e == this.f138006c;
    }

    /* JADX INFO: renamed from: e */
    public void m158736e(int i) {
        this.f138010g = i;
        m158753v();
    }

    /* JADX INFO: renamed from: f */
    public int m158737f(int i) throws InvalidProtocolBufferNanoException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i2 = i + this.f138008e;
        int i3 = this.f138010g;
        if (i2 > i3) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.f138010g = i2;
        m158753v();
        return i3;
    }

    /* JADX INFO: renamed from: g */
    public boolean m158738g() throws IOException {
        return m158748q() != 0;
    }

    /* JADX INFO: renamed from: h */
    public double m158739h() throws IOException {
        return Double.longBitsToDouble(m158747p());
    }

    /* JADX INFO: renamed from: i */
    public float m158740i() throws IOException {
        return Float.intBitsToFloat(m158746o());
    }

    /* JADX INFO: renamed from: j */
    public int m158741j() throws IOException {
        return m158748q();
    }

    /* JADX INFO: renamed from: k */
    public long m158742k() throws IOException {
        return m158749r();
    }

    /* JADX INFO: renamed from: l */
    public <T> T m158743l(ProtobufAdapter<T> protobufAdapter) throws IOException {
        int iM158748q = m158748q();
        if (this.f138011h >= this.f138012i) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int iM158737f = m158737f(iM158748q);
        this.f138011h++;
        T t = protobufAdapter.parse(this);
        this.f138011h--;
        m158736e(iM158737f);
        return t;
    }

    /* JADX INFO: renamed from: m */
    public byte m158744m() throws IOException {
        int i = this.f138008e;
        if (i == this.f138006c) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.f138004a;
        this.f138008e = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: n */
    public byte[] m158745n(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i2 = this.f138008e;
        int i3 = i2 + i;
        int i4 = this.f138010g;
        if (i3 > i4) {
            m158757z(i4 - i2);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i > this.f138006c - i2) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f138004a, i2, bArr, 0, i);
        this.f138008e += i;
        return bArr;
    }

    /* JADX INFO: renamed from: o */
    public int m158746o() throws IOException {
        byte bM158744m = m158744m();
        byte bM158744m2 = m158744m();
        byte bM158744m3 = m158744m();
        return ((m158744m() & 255) << 24) | (bM158744m & 255) | ((bM158744m2 & 255) << 8) | ((bM158744m3 & 255) << 16);
    }

    /* JADX INFO: renamed from: p */
    public long m158747p() throws IOException {
        byte bM158744m = m158744m();
        return ((((long) m158744m()) & 255) << 8) | (((long) bM158744m) & 255) | ((((long) m158744m()) & 255) << 16) | ((((long) m158744m()) & 255) << 24) | ((((long) m158744m()) & 255) << 32) | ((((long) m158744m()) & 255) << 40) | ((((long) m158744m()) & 255) << 48) | ((((long) m158744m()) & 255) << 56);
    }

    /* JADX INFO: renamed from: q */
    public int m158748q() throws IOException {
        int i;
        byte bM158744m = m158744m();
        if (bM158744m >= 0) {
            return bM158744m;
        }
        int i2 = bM158744m & 127;
        byte bM158744m2 = m158744m();
        if (bM158744m2 >= 0) {
            i = bM158744m2 << 7;
        } else {
            i2 |= (bM158744m2 & 127) << 7;
            byte bM158744m3 = m158744m();
            if (bM158744m3 >= 0) {
                i = bM158744m3 << 14;
            } else {
                i2 |= (bM158744m3 & 127) << 14;
                byte bM158744m4 = m158744m();
                if (bM158744m4 < 0) {
                    int i3 = i2 | ((bM158744m4 & 127) << 21);
                    byte bM158744m5 = m158744m();
                    int i4 = i3 | (bM158744m5 << 28);
                    if (bM158744m5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (m158744m() < 0) {
                            }
                        }
                        throw InvalidProtocolBufferNanoException.malformedVarint();
                    }
                    return i4;
                }
                i = bM158744m4 << 21;
            }
        }
        return i | i2;
    }

    /* JADX INFO: renamed from: r */
    public long m158749r() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM158744m = m158744m();
            j |= ((long) (bM158744m & 127)) << i;
            if ((bM158744m & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    /* JADX INFO: renamed from: s */
    public String m158750s() throws IOException {
        int iM158748q = m158748q();
        int i = this.f138006c;
        int i2 = this.f138008e;
        if (iM158748q > i - i2 || iM158748q <= 0) {
            return new String(m158745n(iM158748q), rxm.f161486a);
        }
        String str = new String(this.f138004a, i2, iM158748q, rxm.f161486a);
        this.f138008e += iM158748q;
        return str;
    }

    /* JADX INFO: renamed from: t */
    public String m158751t() throws IOException {
        byte[] bArr = this.f138004a;
        int i = this.f138008e;
        String str = new String(bArr, i, this.f138006c - i, rxm.f161486a);
        this.f138008e = this.f138006c;
        return str;
    }

    /* JADX INFO: renamed from: u */
    public int m158752u() throws IOException {
        if (m158735c()) {
            this.f138009f = 0;
            return 0;
        }
        int iM158748q = m158748q();
        this.f138009f = iM158748q;
        if (iM158748q != 0) {
            return iM158748q;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    /* JADX INFO: renamed from: v */
    public final void m158753v() {
        int i = this.f138006c + this.f138007d;
        this.f138006c = i;
        int i2 = this.f138010g;
        if (i <= i2) {
            this.f138007d = 0;
            return;
        }
        int i3 = i - i2;
        this.f138007d = i3;
        this.f138006c = i - i3;
    }

    /* JADX INFO: renamed from: w */
    public void m158754w(int i) {
        int i2 = this.f138008e;
        int i3 = this.f138005b;
        if (i > i2 - i3) {
            yfq0.m214580a("Position ", i, " is beyond current ", this.f138008e - this.f138005b);
        } else if (i >= 0) {
            this.f138008e = i3 + i;
        } else {
            k250.m144273a("Bad position ", i);
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m158755x(int i) throws IOException {
        int iM100786c = b8q0.m100786c(i);
        if (iM100786c == 0) {
            m158741j();
            return true;
        }
        if (iM100786c == 1) {
            m158747p();
            return true;
        }
        if (iM100786c == 2) {
            m158757z(m158748q());
            return true;
        }
        if (iM100786c == 3) {
            m158756y();
            m158733a(b8q0.m100787d(b8q0.m100785b(i), 4));
            return true;
        }
        if (iM100786c == 4) {
            return false;
        }
        if (iM100786c != 5) {
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
        m158746o();
        return true;
    }

    /* JADX INFO: renamed from: y */
    public void m158756y() throws IOException {
        int iM158752u;
        do {
            iM158752u = m158752u();
            if (iM158752u == 0) {
                return;
            }
        } while (m158755x(iM158752u));
    }

    /* JADX INFO: renamed from: z */
    public void m158757z(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i2 = this.f138008e;
        int i3 = i2 + i;
        int i4 = this.f138010g;
        if (i3 > i4) {
            m158757z(i4 - i2);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i > this.f138006c - i2) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.f138008e = i2 + i;
    }
}
