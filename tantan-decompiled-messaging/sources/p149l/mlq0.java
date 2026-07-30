package p149l;

import com.google.android.gms.common.api.Api;
import com.xiaomi.push.C14730d;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.InputStream;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public final class mlq0 {

    /* JADX INFO: renamed from: a */
    private final byte[] f134461a;

    /* JADX INFO: renamed from: b */
    private int f134462b;

    /* JADX INFO: renamed from: c */
    private int f134463c;

    /* JADX INFO: renamed from: d */
    private int f134464d;

    /* JADX INFO: renamed from: e */
    private final InputStream f134465e;

    /* JADX INFO: renamed from: f */
    private int f134466f;

    /* JADX INFO: renamed from: g */
    private int f134467g;

    /* JADX INFO: renamed from: h */
    private int f134468h;

    /* JADX INFO: renamed from: i */
    private int f134469i;

    /* JADX INFO: renamed from: j */
    private int f134470j;

    /* JADX INFO: renamed from: k */
    private int f134471k;

    private mlq0(InputStream inputStream) {
        this.f134468h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f134470j = 64;
        this.f134471k = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f134461a = new byte[4096];
        this.f134462b = 0;
        this.f134464d = 0;
        this.f134465e = inputStream;
    }

    /* JADX INFO: renamed from: g */
    public static mlq0 m155170g(InputStream inputStream) {
        return new mlq0(inputStream);
    }

    /* JADX INFO: renamed from: h */
    public static mlq0 m155171h(byte[] bArr, int i, int i2) {
        return new mlq0(bArr, i, i2);
    }

    /* JADX INFO: renamed from: n */
    private boolean m155172n(boolean z) throws C14730d {
        int i = this.f134464d;
        int i2 = this.f134462b;
        if (i < i2) {
            qkq0.m175383a("refillBuffer() called when buffer wasn't empty.");
            return false;
        }
        int i3 = this.f134467g;
        if (i3 + i2 == this.f134468h) {
            if (z) {
                throw C14730d.m85513a();
            }
            return false;
        }
        this.f134467g = i3 + i2;
        this.f134464d = 0;
        InputStream inputStream = this.f134465e;
        int i4 = inputStream == null ? -1 : inputStream.read(this.f134461a);
        this.f134462b = i4;
        if (i4 == 0 || i4 < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f134462b + "\nThe InputStream implementation is buggy.");
        }
        if (i4 == -1) {
            this.f134462b = 0;
            if (z) {
                throw C14730d.m85513a();
            }
            return false;
        }
        m155173r();
        int i5 = this.f134467g + this.f134462b + this.f134463c;
        if (i5 > this.f134471k || i5 < 0) {
            throw C14730d.m85520h();
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    private void m155173r() {
        int i = this.f134462b + this.f134463c;
        this.f134462b = i;
        int i2 = this.f134467g + i;
        int i3 = this.f134468h;
        if (i2 <= i3) {
            this.f134463c = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f134463c = i4;
        this.f134462b = i - i4;
    }

    /* JADX INFO: renamed from: a */
    public byte m155174a() throws C14730d {
        if (this.f134464d == this.f134462b) {
            m155172n(true);
        }
        byte[] bArr = this.f134461a;
        int i = this.f134464d;
        this.f134464d = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: b */
    public int m155175b() throws C14730d {
        if (m155189t()) {
            this.f134466f = 0;
            return 0;
        }
        int iM155193x = m155193x();
        this.f134466f = iM155193x;
        if (iM155193x != 0) {
            return iM155193x;
        }
        throw C14730d.m85516d();
    }

    /* JADX INFO: renamed from: c */
    public int m155176c(int i) throws C14730d {
        if (i < 0) {
            throw C14730d.m85514b();
        }
        int i2 = i + this.f134467g + this.f134464d;
        int i3 = this.f134468h;
        if (i2 > i3) {
            throw C14730d.m85513a();
        }
        this.f134468h = i2;
        m155173r();
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public long m155177d() {
        return m155191v();
    }

    /* JADX INFO: renamed from: e */
    public String m155178e() throws C14730d {
        int iM155193x = m155193x();
        int i = this.f134462b;
        int i2 = this.f134464d;
        if (iM155193x > i - i2 || iM155193x <= 0) {
            return new String(m155185o(iM155193x), "UTF-8");
        }
        String str = new String(this.f134461a, i2, iM155193x, "UTF-8");
        this.f134464d += iM155193x;
        return str;
    }

    /* JADX INFO: renamed from: f */
    public viq0 m155179f() throws C14730d {
        int iM155193x = m155193x();
        int i = this.f134462b;
        int i2 = this.f134464d;
        if (iM155193x > i - i2 || iM155193x <= 0) {
            return viq0.m198603b(m155185o(iM155193x));
        }
        viq0 viq0VarM198604c = viq0.m198604c(this.f134461a, i2, iM155193x);
        this.f134464d += iM155193x;
        return viq0VarM198604c;
    }

    /* JADX INFO: renamed from: i */
    public void m155180i() throws C14730d {
        int iM155175b;
        do {
            iM155175b = m155175b();
            if (iM155175b == 0) {
                return;
            }
        } while (m155184m(iM155175b));
    }

    /* JADX INFO: renamed from: j */
    public void m155181j(int i) throws C14730d {
        if (this.f134466f != i) {
            throw C14730d.m85517e();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m155182k(yqq0 yqq0Var) throws C14730d {
        int iM155193x = m155193x();
        if (this.f134469i >= this.f134470j) {
            throw C14730d.m85519g();
        }
        int iM155176c = m155176c(iM155193x);
        this.f134469i++;
        yqq0Var.mo98327b(this);
        m155181j(0);
        this.f134469i--;
        m155188s(iM155176c);
    }

    /* JADX INFO: renamed from: l */
    public boolean m155183l() {
        return m155193x() != 0;
    }

    /* JADX INFO: renamed from: m */
    public boolean m155184m(int i) throws C14730d {
        int iM156168a = msq0.m156168a(i);
        if (iM156168a == 0) {
            m155186p();
            return true;
        }
        if (iM156168a == 1) {
            m155194y();
            return true;
        }
        if (iM156168a == 2) {
            m155192w(m155193x());
            return true;
        }
        if (iM156168a == 3) {
            m155180i();
            m155181j(msq0.m156169b(msq0.m156170c(i), 4));
            return true;
        }
        if (iM156168a == 4) {
            return false;
        }
        if (iM156168a != 5) {
            throw C14730d.m85518f();
        }
        m155195z();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public byte[] m155185o(int i) throws C14730d {
        if (i < 0) {
            throw C14730d.m85514b();
        }
        int i2 = this.f134467g;
        int i3 = this.f134464d;
        int i4 = i2 + i3 + i;
        int i5 = this.f134468h;
        if (i4 > i5) {
            m155192w((i5 - i2) - i3);
            throw C14730d.m85513a();
        }
        int i6 = this.f134462b;
        if (i <= i6 - i3) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f134461a, i3, bArr, 0, i);
            this.f134464d += i;
            return bArr;
        }
        if (i >= 4096) {
            this.f134467g = i2 + i6;
            this.f134464d = 0;
            this.f134462b = 0;
            int length = i6 - i3;
            int i7 = i - length;
            Vector vector = new Vector();
            while (i7 > 0) {
                int iMin = Math.min(i7, 4096);
                byte[] bArr2 = new byte[iMin];
                int i8 = 0;
                while (i8 < iMin) {
                    InputStream inputStream = this.f134465e;
                    int i9 = inputStream == null ? -1 : inputStream.read(bArr2, i8, iMin - i8);
                    if (i9 == -1) {
                        throw C14730d.m85513a();
                    }
                    this.f134467g += i9;
                    i8 += i9;
                }
                i7 -= iMin;
                vector.addElement(bArr2);
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(this.f134461a, i3, bArr3, 0, length);
            for (int i10 = 0; i10 < vector.size(); i10++) {
                byte[] bArr4 = (byte[]) vector.elementAt(i10);
                System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                length += bArr4.length;
            }
            return bArr3;
        }
        byte[] bArr5 = new byte[i];
        int i11 = i6 - i3;
        System.arraycopy(this.f134461a, i3, bArr5, 0, i11);
        this.f134464d = this.f134462b;
        m155172n(true);
        while (true) {
            int i12 = i - i11;
            int i13 = this.f134462b;
            byte[] bArr6 = this.f134461a;
            if (i12 <= i13) {
                System.arraycopy(bArr6, 0, bArr5, i11, i12);
                this.f134464d = i12;
                return bArr5;
            }
            System.arraycopy(bArr6, 0, bArr5, i11, i13);
            int i14 = this.f134462b;
            i11 += i14;
            this.f134464d = i14;
            m155172n(true);
        }
    }

    /* JADX INFO: renamed from: p */
    public int m155186p() {
        return m155193x();
    }

    /* JADX INFO: renamed from: q */
    public long m155187q() {
        return m155191v();
    }

    /* JADX INFO: renamed from: s */
    public void m155188s(int i) {
        this.f134468h = i;
        m155173r();
    }

    /* JADX INFO: renamed from: t */
    public boolean m155189t() {
        return this.f134464d == this.f134462b && !m155172n(false);
    }

    /* JADX INFO: renamed from: u */
    public int m155190u() {
        return m155193x();
    }

    /* JADX INFO: renamed from: v */
    public long m155191v() throws C14730d {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM155174a = m155174a();
            j |= ((long) (bM155174a & 127)) << i;
            if ((bM155174a & 128) == 0) {
                return j;
            }
        }
        throw C14730d.m85515c();
    }

    /* JADX INFO: renamed from: w */
    public void m155192w(int i) throws C14730d {
        if (i < 0) {
            throw C14730d.m85514b();
        }
        int i2 = this.f134467g;
        int i3 = this.f134464d;
        int i4 = i2 + i3 + i;
        int i5 = this.f134468h;
        if (i4 > i5) {
            m155192w((i5 - i2) - i3);
            throw C14730d.m85513a();
        }
        int i6 = this.f134462b;
        if (i <= i6 - i3) {
            this.f134464d = i3 + i;
            return;
        }
        int i7 = i6 - i3;
        this.f134467g = i2 + i6;
        this.f134464d = 0;
        this.f134462b = 0;
        while (i7 < i) {
            InputStream inputStream = this.f134465e;
            int iSkip = inputStream == null ? -1 : (int) inputStream.skip(i - i7);
            if (iSkip <= 0) {
                throw C14730d.m85513a();
            }
            i7 += iSkip;
            this.f134467g += iSkip;
        }
    }

    /* JADX INFO: renamed from: x */
    public int m155193x() throws C14730d {
        int i;
        byte bM155174a = m155174a();
        if (bM155174a >= 0) {
            return bM155174a;
        }
        int i2 = bM155174a & 127;
        byte bM155174a2 = m155174a();
        if (bM155174a2 >= 0) {
            i = bM155174a2 << 7;
        } else {
            i2 |= (bM155174a2 & 127) << 7;
            byte bM155174a3 = m155174a();
            if (bM155174a3 >= 0) {
                i = bM155174a3 << 14;
            } else {
                i2 |= (bM155174a3 & 127) << 14;
                byte bM155174a4 = m155174a();
                if (bM155174a4 < 0) {
                    int i3 = i2 | ((bM155174a4 & 127) << 21);
                    byte bM155174a5 = m155174a();
                    int i4 = i3 | (bM155174a5 << 28);
                    if (bM155174a5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (m155174a() < 0) {
                            }
                        }
                        throw C14730d.m85515c();
                    }
                    return i4;
                }
                i = bM155174a4 << 21;
            }
        }
        return i | i2;
    }

    /* JADX INFO: renamed from: y */
    public long m155194y() throws C14730d {
        byte bM155174a = m155174a();
        return ((((long) m155174a()) & 255) << 8) | (((long) bM155174a) & 255) | ((((long) m155174a()) & 255) << 16) | ((((long) m155174a()) & 255) << 24) | ((((long) m155174a()) & 255) << 32) | ((((long) m155174a()) & 255) << 40) | ((((long) m155174a()) & 255) << 48) | ((((long) m155174a()) & 255) << 56);
    }

    /* JADX INFO: renamed from: z */
    public int m155195z() throws C14730d {
        byte bM155174a = m155174a();
        byte bM155174a2 = m155174a();
        byte bM155174a3 = m155174a();
        return ((m155174a() & 255) << 24) | (bM155174a & 255) | ((bM155174a2 & 255) << 8) | ((bM155174a3 & 255) << 16);
    }

    private mlq0(byte[] bArr, int i, int i2) {
        this.f134468h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f134470j = 64;
        this.f134471k = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f134461a = bArr;
        this.f134462b = i2 + i;
        this.f134464d = i;
        this.f134465e = null;
    }
}
