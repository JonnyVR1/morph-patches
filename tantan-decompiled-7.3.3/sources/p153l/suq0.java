package p153l;

import com.google.android.gms.common.api.Api;
import com.xiaomi.push.C14878d;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.InputStream;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public final class suq0 {

    /* JADX INFO: renamed from: a */
    private final byte[] f170740a;

    /* JADX INFO: renamed from: b */
    private int f170741b;

    /* JADX INFO: renamed from: c */
    private int f170742c;

    /* JADX INFO: renamed from: d */
    private int f170743d;

    /* JADX INFO: renamed from: e */
    private final InputStream f170744e;

    /* JADX INFO: renamed from: f */
    private int f170745f;

    /* JADX INFO: renamed from: g */
    private int f170746g;

    /* JADX INFO: renamed from: h */
    private int f170747h;

    /* JADX INFO: renamed from: i */
    private int f170748i;

    /* JADX INFO: renamed from: j */
    private int f170749j;

    /* JADX INFO: renamed from: k */
    private int f170750k;

    private suq0(InputStream inputStream) {
        this.f170747h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f170749j = 64;
        this.f170750k = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f170740a = new byte[4096];
        this.f170741b = 0;
        this.f170743d = 0;
        this.f170744e = inputStream;
    }

    /* JADX INFO: renamed from: g */
    public static suq0 m188071g(InputStream inputStream) {
        return new suq0(inputStream);
    }

    /* JADX INFO: renamed from: h */
    public static suq0 m188072h(byte[] bArr, int i, int i2) {
        return new suq0(bArr, i, i2);
    }

    /* JADX INFO: renamed from: n */
    private boolean m188073n(boolean z) throws C14878d {
        int i = this.f170743d;
        int i2 = this.f170741b;
        if (i < i2) {
            wtq0.m207906a("refillBuffer() called when buffer wasn't empty.");
            return false;
        }
        int i3 = this.f170746g;
        if (i3 + i2 == this.f170747h) {
            if (z) {
                throw C14878d.m86684a();
            }
            return false;
        }
        this.f170746g = i3 + i2;
        this.f170743d = 0;
        InputStream inputStream = this.f170744e;
        int i4 = inputStream == null ? -1 : inputStream.read(this.f170740a);
        this.f170741b = i4;
        if (i4 == 0 || i4 < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f170741b + "\nThe InputStream implementation is buggy.");
        }
        if (i4 == -1) {
            this.f170741b = 0;
            if (z) {
                throw C14878d.m86684a();
            }
            return false;
        }
        m188074r();
        int i5 = this.f170746g + this.f170741b + this.f170742c;
        if (i5 > this.f170750k || i5 < 0) {
            throw C14878d.m86691h();
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    private void m188074r() {
        int i = this.f170741b + this.f170742c;
        this.f170741b = i;
        int i2 = this.f170746g + i;
        int i3 = this.f170747h;
        if (i2 <= i3) {
            this.f170742c = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f170742c = i4;
        this.f170741b = i - i4;
    }

    /* JADX INFO: renamed from: a */
    public byte m188075a() throws C14878d {
        if (this.f170743d == this.f170741b) {
            m188073n(true);
        }
        byte[] bArr = this.f170740a;
        int i = this.f170743d;
        this.f170743d = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: b */
    public int m188076b() throws C14878d {
        if (m188090t()) {
            this.f170745f = 0;
            return 0;
        }
        int iM188094x = m188094x();
        this.f170745f = iM188094x;
        if (iM188094x != 0) {
            return iM188094x;
        }
        throw C14878d.m86687d();
    }

    /* JADX INFO: renamed from: c */
    public int m188077c(int i) throws C14878d {
        if (i < 0) {
            throw C14878d.m86685b();
        }
        int i2 = i + this.f170746g + this.f170743d;
        int i3 = this.f170747h;
        if (i2 > i3) {
            throw C14878d.m86684a();
        }
        this.f170747h = i2;
        m188074r();
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public long m188078d() {
        return m188092v();
    }

    /* JADX INFO: renamed from: e */
    public String m188079e() throws C14878d {
        int iM188094x = m188094x();
        int i = this.f170741b;
        int i2 = this.f170743d;
        if (iM188094x > i - i2 || iM188094x <= 0) {
            return new String(m188086o(iM188094x), "UTF-8");
        }
        String str = new String(this.f170740a, i2, iM188094x, "UTF-8");
        this.f170743d += iM188094x;
        return str;
    }

    /* JADX INFO: renamed from: f */
    public asq0 m188080f() throws C14878d {
        int iM188094x = m188094x();
        int i = this.f170741b;
        int i2 = this.f170743d;
        if (iM188094x > i - i2 || iM188094x <= 0) {
            return asq0.m99965b(m188086o(iM188094x));
        }
        asq0 asq0VarM99966c = asq0.m99966c(this.f170740a, i2, iM188094x);
        this.f170743d += iM188094x;
        return asq0VarM99966c;
    }

    /* JADX INFO: renamed from: i */
    public void m188081i() throws C14878d {
        int iM188076b;
        do {
            iM188076b = m188076b();
            if (iM188076b == 0) {
                return;
            }
        } while (m188085m(iM188076b));
    }

    /* JADX INFO: renamed from: j */
    public void m188082j(int i) throws C14878d {
        if (this.f170745f != i) {
            throw C14878d.m86688e();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m188083k(e0r0 e0r0Var) throws C14878d {
        int iM188094x = m188094x();
        if (this.f170748i >= this.f170749j) {
            throw C14878d.m86690g();
        }
        int iM188077c = m188077c(iM188094x);
        this.f170748i++;
        e0r0Var.mo118917b(this);
        m188082j(0);
        this.f170748i--;
        m188089s(iM188077c);
    }

    /* JADX INFO: renamed from: l */
    public boolean m188084l() {
        return m188094x() != 0;
    }

    /* JADX INFO: renamed from: m */
    public boolean m188085m(int i) throws C14878d {
        int iM184057a = s1r0.m184057a(i);
        if (iM184057a == 0) {
            m188087p();
            return true;
        }
        if (iM184057a == 1) {
            m188095y();
            return true;
        }
        if (iM184057a == 2) {
            m188093w(m188094x());
            return true;
        }
        if (iM184057a == 3) {
            m188081i();
            m188082j(s1r0.m184058b(s1r0.m184059c(i), 4));
            return true;
        }
        if (iM184057a == 4) {
            return false;
        }
        if (iM184057a != 5) {
            throw C14878d.m86689f();
        }
        m188096z();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public byte[] m188086o(int i) throws C14878d {
        if (i < 0) {
            throw C14878d.m86685b();
        }
        int i2 = this.f170746g;
        int i3 = this.f170743d;
        int i4 = i2 + i3 + i;
        int i5 = this.f170747h;
        if (i4 > i5) {
            m188093w((i5 - i2) - i3);
            throw C14878d.m86684a();
        }
        int i6 = this.f170741b;
        if (i <= i6 - i3) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f170740a, i3, bArr, 0, i);
            this.f170743d += i;
            return bArr;
        }
        if (i >= 4096) {
            this.f170746g = i2 + i6;
            this.f170743d = 0;
            this.f170741b = 0;
            int length = i6 - i3;
            int i7 = i - length;
            Vector vector = new Vector();
            while (i7 > 0) {
                int iMin = Math.min(i7, 4096);
                byte[] bArr2 = new byte[iMin];
                int i8 = 0;
                while (i8 < iMin) {
                    InputStream inputStream = this.f170744e;
                    int i9 = inputStream == null ? -1 : inputStream.read(bArr2, i8, iMin - i8);
                    if (i9 == -1) {
                        throw C14878d.m86684a();
                    }
                    this.f170746g += i9;
                    i8 += i9;
                }
                i7 -= iMin;
                vector.addElement(bArr2);
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(this.f170740a, i3, bArr3, 0, length);
            for (int i10 = 0; i10 < vector.size(); i10++) {
                byte[] bArr4 = (byte[]) vector.elementAt(i10);
                System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                length += bArr4.length;
            }
            return bArr3;
        }
        byte[] bArr5 = new byte[i];
        int i11 = i6 - i3;
        System.arraycopy(this.f170740a, i3, bArr5, 0, i11);
        this.f170743d = this.f170741b;
        m188073n(true);
        while (true) {
            int i12 = i - i11;
            int i13 = this.f170741b;
            byte[] bArr6 = this.f170740a;
            if (i12 <= i13) {
                System.arraycopy(bArr6, 0, bArr5, i11, i12);
                this.f170743d = i12;
                return bArr5;
            }
            System.arraycopy(bArr6, 0, bArr5, i11, i13);
            int i14 = this.f170741b;
            i11 += i14;
            this.f170743d = i14;
            m188073n(true);
        }
    }

    /* JADX INFO: renamed from: p */
    public int m188087p() {
        return m188094x();
    }

    /* JADX INFO: renamed from: q */
    public long m188088q() {
        return m188092v();
    }

    /* JADX INFO: renamed from: s */
    public void m188089s(int i) {
        this.f170747h = i;
        m188074r();
    }

    /* JADX INFO: renamed from: t */
    public boolean m188090t() {
        return this.f170743d == this.f170741b && !m188073n(false);
    }

    /* JADX INFO: renamed from: u */
    public int m188091u() {
        return m188094x();
    }

    /* JADX INFO: renamed from: v */
    public long m188092v() throws C14878d {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM188075a = m188075a();
            j |= ((long) (bM188075a & 127)) << i;
            if ((bM188075a & 128) == 0) {
                return j;
            }
        }
        throw C14878d.m86686c();
    }

    /* JADX INFO: renamed from: w */
    public void m188093w(int i) throws C14878d {
        if (i < 0) {
            throw C14878d.m86685b();
        }
        int i2 = this.f170746g;
        int i3 = this.f170743d;
        int i4 = i2 + i3 + i;
        int i5 = this.f170747h;
        if (i4 > i5) {
            m188093w((i5 - i2) - i3);
            throw C14878d.m86684a();
        }
        int i6 = this.f170741b;
        if (i <= i6 - i3) {
            this.f170743d = i3 + i;
            return;
        }
        int i7 = i6 - i3;
        this.f170746g = i2 + i6;
        this.f170743d = 0;
        this.f170741b = 0;
        while (i7 < i) {
            InputStream inputStream = this.f170744e;
            int iSkip = inputStream == null ? -1 : (int) inputStream.skip(i - i7);
            if (iSkip <= 0) {
                throw C14878d.m86684a();
            }
            i7 += iSkip;
            this.f170746g += iSkip;
        }
    }

    /* JADX INFO: renamed from: x */
    public int m188094x() throws C14878d {
        int i;
        byte bM188075a = m188075a();
        if (bM188075a >= 0) {
            return bM188075a;
        }
        int i2 = bM188075a & 127;
        byte bM188075a2 = m188075a();
        if (bM188075a2 >= 0) {
            i = bM188075a2 << 7;
        } else {
            i2 |= (bM188075a2 & 127) << 7;
            byte bM188075a3 = m188075a();
            if (bM188075a3 >= 0) {
                i = bM188075a3 << 14;
            } else {
                i2 |= (bM188075a3 & 127) << 14;
                byte bM188075a4 = m188075a();
                if (bM188075a4 < 0) {
                    int i3 = i2 | ((bM188075a4 & 127) << 21);
                    byte bM188075a5 = m188075a();
                    int i4 = i3 | (bM188075a5 << 28);
                    if (bM188075a5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (m188075a() < 0) {
                            }
                        }
                        throw C14878d.m86686c();
                    }
                    return i4;
                }
                i = bM188075a4 << 21;
            }
        }
        return i | i2;
    }

    /* JADX INFO: renamed from: y */
    public long m188095y() throws C14878d {
        byte bM188075a = m188075a();
        return ((((long) m188075a()) & 255) << 8) | (((long) bM188075a) & 255) | ((((long) m188075a()) & 255) << 16) | ((((long) m188075a()) & 255) << 24) | ((((long) m188075a()) & 255) << 32) | ((((long) m188075a()) & 255) << 40) | ((((long) m188075a()) & 255) << 48) | ((((long) m188075a()) & 255) << 56);
    }

    /* JADX INFO: renamed from: z */
    public int m188096z() throws C14878d {
        byte bM188075a = m188075a();
        byte bM188075a2 = m188075a();
        byte bM188075a3 = m188075a();
        return ((m188075a() & 255) << 24) | (bM188075a & 255) | ((bM188075a2 & 255) << 8) | ((bM188075a3 & 255) << 16);
    }

    private suq0(byte[] bArr, int i, int i2) {
        this.f170747h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f170749j = 64;
        this.f170750k = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f170740a = bArr;
        this.f170741b = i2 + i;
        this.f170743d = i;
        this.f170744e = null;
    }
}
