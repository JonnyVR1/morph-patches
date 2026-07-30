package p153l;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tantanapp.common.data.ProtobufAdapter;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class nc5 {

    /* JADX INFO: renamed from: a */
    public final byte[] f141308a;

    /* JADX INFO: renamed from: b */
    public int f141309b;

    /* JADX INFO: renamed from: c */
    public int f141310c;

    /* JADX INFO: renamed from: d */
    public int f141311d;

    /* JADX INFO: renamed from: e */
    public int f141312e;

    /* JADX INFO: renamed from: f */
    public int f141313f;

    /* JADX INFO: renamed from: h */
    public int f141315h;

    /* JADX INFO: renamed from: g */
    public int f141314g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: i */
    public int f141316i = 64;

    /* JADX INFO: renamed from: j */
    public int f141317j = AudioRoutingController.DEVICE_OUT_USB_HEADSET;

    public nc5(byte[] bArr, int i, int i2) {
        this.f141308a = bArr;
        this.f141309b = i;
        this.f141310c = i2 + i;
        this.f141312e = i;
    }

    /* JADX INFO: renamed from: d */
    public static nc5 m162477d(byte[] bArr, int i, int i2) {
        return new nc5(bArr, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m162478a(int i) throws InvalidProtocolBufferNanoException {
        if (this.f141313f != i) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m162479b() {
        return this.f141312e - this.f141309b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m162480c() {
        return this.f141312e == this.f141310c;
    }

    /* JADX INFO: renamed from: e */
    public void m162481e(int i) {
        this.f141314g = i;
        m162498v();
    }

    /* JADX INFO: renamed from: f */
    public int m162482f(int i) throws InvalidProtocolBufferNanoException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i2 = i + this.f141312e;
        int i3 = this.f141314g;
        if (i2 > i3) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.f141314g = i2;
        m162498v();
        return i3;
    }

    /* JADX INFO: renamed from: g */
    public boolean m162483g() throws IOException {
        return m162493q() != 0;
    }

    /* JADX INFO: renamed from: h */
    public double m162484h() throws IOException {
        return Double.longBitsToDouble(m162492p());
    }

    /* JADX INFO: renamed from: i */
    public float m162485i() throws IOException {
        return Float.intBitsToFloat(m162491o());
    }

    /* JADX INFO: renamed from: j */
    public int m162486j() throws IOException {
        return m162493q();
    }

    /* JADX INFO: renamed from: k */
    public long m162487k() throws IOException {
        return m162494r();
    }

    /* JADX INFO: renamed from: l */
    public <T> T m162488l(ProtobufAdapter<T> protobufAdapter) throws IOException {
        int iM162493q = m162493q();
        if (this.f141315h >= this.f141316i) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int iM162482f = m162482f(iM162493q);
        this.f141315h++;
        T t = protobufAdapter.parse(this);
        this.f141315h--;
        m162481e(iM162482f);
        return t;
    }

    /* JADX INFO: renamed from: m */
    public byte m162489m() throws IOException {
        int i = this.f141312e;
        if (i == this.f141310c) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.f141308a;
        this.f141312e = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: n */
    public byte[] m162490n(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i2 = this.f141312e;
        int i3 = i2 + i;
        int i4 = this.f141314g;
        if (i3 > i4) {
            m162502z(i4 - i2);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i > this.f141310c - i2) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f141308a, i2, bArr, 0, i);
        this.f141312e += i;
        return bArr;
    }

    /* JADX INFO: renamed from: o */
    public int m162491o() throws IOException {
        byte bM162489m = m162489m();
        byte bM162489m2 = m162489m();
        byte bM162489m3 = m162489m();
        return ((m162489m() & 255) << 24) | (bM162489m & 255) | ((bM162489m2 & 255) << 8) | ((bM162489m3 & 255) << 16);
    }

    /* JADX INFO: renamed from: p */
    public long m162492p() throws IOException {
        byte bM162489m = m162489m();
        return ((((long) m162489m()) & 255) << 8) | (((long) bM162489m) & 255) | ((((long) m162489m()) & 255) << 16) | ((((long) m162489m()) & 255) << 24) | ((((long) m162489m()) & 255) << 32) | ((((long) m162489m()) & 255) << 40) | ((((long) m162489m()) & 255) << 48) | ((((long) m162489m()) & 255) << 56);
    }

    /* JADX INFO: renamed from: q */
    public int m162493q() throws IOException {
        int i;
        byte bM162489m = m162489m();
        if (bM162489m >= 0) {
            return bM162489m;
        }
        int i2 = bM162489m & 127;
        byte bM162489m2 = m162489m();
        if (bM162489m2 >= 0) {
            i = bM162489m2 << 7;
        } else {
            i2 |= (bM162489m2 & 127) << 7;
            byte bM162489m3 = m162489m();
            if (bM162489m3 >= 0) {
                i = bM162489m3 << 14;
            } else {
                i2 |= (bM162489m3 & 127) << 14;
                byte bM162489m4 = m162489m();
                if (bM162489m4 < 0) {
                    int i3 = i2 | ((bM162489m4 & 127) << 21);
                    byte bM162489m5 = m162489m();
                    int i4 = i3 | (bM162489m5 << 28);
                    if (bM162489m5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (m162489m() < 0) {
                            }
                        }
                        throw InvalidProtocolBufferNanoException.malformedVarint();
                    }
                    return i4;
                }
                i = bM162489m4 << 21;
            }
        }
        return i | i2;
    }

    /* JADX INFO: renamed from: r */
    public long m162494r() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM162489m = m162489m();
            j |= ((long) (bM162489m & 127)) << i;
            if ((bM162489m & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    /* JADX INFO: renamed from: s */
    public String m162495s() throws IOException {
        int iM162493q = m162493q();
        int i = this.f141310c;
        int i2 = this.f141312e;
        if (iM162493q > i - i2 || iM162493q <= 0) {
            return new String(m162490n(iM162493q), rzm.f165551a);
        }
        String str = new String(this.f141308a, i2, iM162493q, rzm.f165551a);
        this.f141312e += iM162493q;
        return str;
    }

    /* JADX INFO: renamed from: t */
    public String m162496t() throws IOException {
        byte[] bArr = this.f141308a;
        int i = this.f141312e;
        String str = new String(bArr, i, this.f141310c - i, rzm.f165551a);
        this.f141312e = this.f141310c;
        return str;
    }

    /* JADX INFO: renamed from: u */
    public int m162497u() throws IOException {
        if (m162480c()) {
            this.f141313f = 0;
            return 0;
        }
        int iM162493q = m162493q();
        this.f141313f = iM162493q;
        if (iM162493q != 0) {
            return iM162493q;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    /* JADX INFO: renamed from: v */
    public final void m162498v() {
        int i = this.f141310c + this.f141311d;
        this.f141310c = i;
        int i2 = this.f141314g;
        if (i <= i2) {
            this.f141311d = 0;
            return;
        }
        int i3 = i - i2;
        this.f141311d = i3;
        this.f141310c = i - i3;
    }

    /* JADX INFO: renamed from: w */
    public void m162499w(int i) {
        int i2 = this.f141312e;
        int i3 = this.f141309b;
        if (i > i2 - i3) {
            dpq0.m117417a("Position ", i, " is beyond current ", this.f141312e - this.f141309b);
        } else if (i >= 0) {
            this.f141312e = i3 + i;
        } else {
            za50.m219101a("Bad position ", i);
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m162500x(int i) throws IOException {
        int iM130258c = ghq0.m130258c(i);
        if (iM130258c == 0) {
            m162486j();
            return true;
        }
        if (iM130258c == 1) {
            m162492p();
            return true;
        }
        if (iM130258c == 2) {
            m162502z(m162493q());
            return true;
        }
        if (iM130258c == 3) {
            m162501y();
            m162478a(ghq0.m130259d(ghq0.m130257b(i), 4));
            return true;
        }
        if (iM130258c == 4) {
            return false;
        }
        if (iM130258c != 5) {
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
        m162491o();
        return true;
    }

    /* JADX INFO: renamed from: y */
    public void m162501y() throws IOException {
        int iM162497u;
        do {
            iM162497u = m162497u();
            if (iM162497u == 0) {
                return;
            }
        } while (m162500x(iM162497u));
    }

    /* JADX INFO: renamed from: z */
    public void m162502z(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i2 = this.f141312e;
        int i3 = i2 + i;
        int i4 = this.f141314g;
        if (i3 > i4) {
            m162502z(i4 - i2);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i > this.f141310c - i2) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.f141312e = i2 + i;
    }
}
