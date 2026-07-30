package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p149l.guq0;
import p149l.huq0;
import p149l.iuq0;
import p149l.quq0;
import p149l.suq0;
import p149l.tuq0;
import p149l.yuq0;

/* JADX INFO: renamed from: com.xiaomi.push.hw */
/* JADX INFO: loaded from: classes2.dex */
public class C14779hw extends quq0 {

    /* JADX INFO: renamed from: n */
    private static final tuq0 f62657n = new tuq0();

    /* JADX INFO: renamed from: b */
    protected boolean f62658b;

    /* JADX INFO: renamed from: c */
    protected boolean f62659c;

    /* JADX INFO: renamed from: d */
    protected int f62660d;

    /* JADX INFO: renamed from: e */
    protected boolean f62661e;

    /* JADX INFO: renamed from: f */
    private byte[] f62662f;

    /* JADX INFO: renamed from: g */
    private byte[] f62663g;

    /* JADX INFO: renamed from: h */
    private byte[] f62664h;

    /* JADX INFO: renamed from: i */
    private byte[] f62665i;

    /* JADX INFO: renamed from: j */
    private byte[] f62666j;

    /* JADX INFO: renamed from: k */
    private byte[] f62667k;

    /* JADX INFO: renamed from: l */
    private byte[] f62668l;

    /* JADX INFO: renamed from: m */
    private byte[] f62669m;

    public C14779hw(yuq0 yuq0Var, boolean z, boolean z2) {
        super(yuq0Var);
        this.f62661e = false;
        this.f62662f = new byte[1];
        this.f62663g = new byte[2];
        this.f62664h = new byte[4];
        this.f62665i = new byte[8];
        this.f62666j = new byte[1];
        this.f62667k = new byte[2];
        this.f62668l = new byte[4];
        this.f62669m = new byte[8];
        this.f62658b = z;
        this.f62659c = z2;
    }

    /* JADX INFO: renamed from: J */
    private int m86204J(byte[] bArr, int i, int i2) throws C14778hu {
        m86215M(i2);
        return this.f156534a.m216153g(bArr, i, i2);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: A */
    public void mo86205A() {
        mo86229n((byte) 0);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: B */
    public void mo86206B() {
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: C */
    public void mo86207C() {
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: D */
    public void mo86208D() {
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: E */
    public void mo86209E() {
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: F */
    public void mo86210F() {
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: G */
    public void mo86211G() {
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: H */
    public void mo86212H() {
    }

    /* JADX INFO: renamed from: K */
    public String m86213K(int i) throws C14778hu {
        try {
            m86215M(i);
            byte[] bArr = new byte[i];
            this.f156534a.m216153g(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new C14778hu("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* JADX INFO: renamed from: L */
    public void m86214L(int i) {
        this.f62660d = i;
        this.f62661e = true;
    }

    /* JADX INFO: renamed from: M */
    public void m86215M(int i) throws C14778hu {
        if (i < 0) {
            throw new C14778hu("Negative length: " + i);
        }
        if (this.f62661e) {
            int i2 = this.f62660d - i;
            this.f62660d = i2;
            if (i2 >= 0) {
                return;
            }
            throw new C14778hu("Message length exceeded: " + i);
        }
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: a */
    public byte mo86216a() throws C14778hu {
        if (this.f156534a.mo211181f() < 1) {
            m86204J(this.f62666j, 0, 1);
            return this.f62666j[0];
        }
        byte b = this.f156534a.mo211179d()[this.f156534a.mo211180e()];
        this.f156534a.mo211178b(1);
        return b;
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: b */
    public double mo86217b() {
        return Double.longBitsToDouble(mo86219d());
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: c */
    public int mo86218c() throws C14778hu {
        int iMo211180e;
        byte[] bArrMo211179d = this.f62668l;
        if (this.f156534a.mo211181f() >= 4) {
            bArrMo211179d = this.f156534a.mo211179d();
            iMo211180e = this.f156534a.mo211180e();
            this.f156534a.mo211178b(4);
        } else {
            m86204J(this.f62668l, 0, 4);
            iMo211180e = 0;
        }
        return ((bArrMo211179d[iMo211180e] & 255) << 24) | ((bArrMo211179d[iMo211180e + 1] & 255) << 16) | ((bArrMo211179d[iMo211180e + 2] & 255) << 8) | (bArrMo211179d[iMo211180e + 3] & 255);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: d */
    public long mo86219d() throws C14778hu {
        int iMo211180e;
        byte[] bArrMo211179d = this.f62669m;
        if (this.f156534a.mo211181f() >= 8) {
            bArrMo211179d = this.f156534a.mo211179d();
            iMo211180e = this.f156534a.mo211180e();
            this.f156534a.mo211178b(8);
        } else {
            m86204J(this.f62669m, 0, 8);
            iMo211180e = 0;
        }
        return ((long) (bArrMo211179d[iMo211180e + 7] & 255)) | (((long) (bArrMo211179d[iMo211180e] & 255)) << 56) | (((long) (bArrMo211179d[iMo211180e + 1] & 255)) << 48) | (((long) (bArrMo211179d[iMo211180e + 2] & 255)) << 40) | (((long) (bArrMo211179d[iMo211180e + 3] & 255)) << 32) | (((long) (bArrMo211179d[iMo211180e + 4] & 255)) << 24) | (((long) (bArrMo211179d[iMo211180e + 5] & 255)) << 16) | (((long) (bArrMo211179d[iMo211180e + 6] & 255)) << 8);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: e */
    public String mo86220e() throws C14778hu {
        int iMo86218c = mo86218c();
        if (this.f156534a.mo211181f() < iMo86218c) {
            return m86213K(iMo86218c);
        }
        try {
            String str = new String(this.f156534a.mo211179d(), this.f156534a.mo211180e(), iMo86218c, "UTF-8");
            this.f156534a.mo211178b(iMo86218c);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C14778hu("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: f */
    public ByteBuffer mo86221f() throws C14778hu {
        int iMo86218c = mo86218c();
        m86215M(iMo86218c);
        if (this.f156534a.mo211181f() >= iMo86218c) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f156534a.mo211179d(), this.f156534a.mo211180e(), iMo86218c);
            this.f156534a.mo211178b(iMo86218c);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iMo86218c];
        this.f156534a.m216153g(bArr, 0, iMo86218c);
        return ByteBuffer.wrap(bArr);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: g */
    public guq0 mo86222g() throws C14778hu {
        byte bMo86216a = mo86216a();
        return new guq0("", bMo86216a, bMo86216a == 0 ? (short) 0 : mo86227l());
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: h */
    public huq0 mo86223h() {
        return new huq0(mo86216a(), mo86218c());
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: i */
    public iuq0 mo86224i() {
        return new iuq0(mo86216a(), mo86216a(), mo86218c());
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: j */
    public suq0 mo86225j() {
        return new suq0(mo86216a(), mo86218c());
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: k */
    public tuq0 mo86226k() {
        return f62657n;
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: l */
    public short mo86227l() throws C14778hu {
        int iMo211180e;
        byte[] bArrMo211179d = this.f62667k;
        if (this.f156534a.mo211181f() >= 2) {
            bArrMo211179d = this.f156534a.mo211179d();
            iMo211180e = this.f156534a.mo211180e();
            this.f156534a.mo211178b(2);
        } else {
            m86204J(this.f62667k, 0, 2);
            iMo211180e = 0;
        }
        return (short) (((bArrMo211179d[iMo211180e] & 255) << 8) | (bArrMo211179d[iMo211180e + 1] & 255));
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: m */
    public void mo86228m() {
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: n */
    public void mo86229n(byte b) {
        byte[] bArr = this.f62662f;
        bArr[0] = b;
        this.f156534a.mo200089c(bArr, 0, 1);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: o */
    public void mo86230o(int i) {
        byte[] bArr = this.f62664h;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f156534a.mo200089c(bArr, 0, 4);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: p */
    public void mo86231p(long j) {
        byte[] bArr = this.f62665i;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.f156534a.mo200089c(bArr, 0, 8);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: q */
    public void mo86232q(String str) throws C14778hu {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo86230o(bytes.length);
            this.f156534a.mo200089c(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C14778hu("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: r */
    public void mo86233r(ByteBuffer byteBuffer) {
        int iLimit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo86230o(iLimit);
        this.f156534a.mo200089c(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: s */
    public void mo86234s(guq0 guq0Var) {
        mo86229n(guq0Var.f104457b);
        mo86238w(guq0Var.f104458c);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: t */
    public void mo86235t(huq0 huq0Var) {
        mo86229n(huq0Var.f109581a);
        mo86230o(huq0Var.f109582b);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: u */
    public void mo86236u(iuq0 iuq0Var) {
        mo86229n(iuq0Var.f115046a);
        mo86229n(iuq0Var.f115047b);
        mo86230o(iuq0Var.f115048c);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: w */
    public void mo86238w(short s) {
        byte[] bArr = this.f62663g;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f156534a.mo200089c(bArr, 0, 2);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: x */
    public void mo86239x(boolean z) {
        mo86229n(z ? (byte) 1 : (byte) 0);
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: y */
    public boolean mo86240y() {
        return mo86216a() == 1;
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: z */
    public void mo86241z() {
    }

    /* JADX INFO: renamed from: com.xiaomi.push.hw$a */
    public static class a implements InterfaceC14782ic {

        /* JADX INFO: renamed from: a */
        protected int f62670a;

        /* JADX INFO: renamed from: a */
        protected boolean f62671a;

        /* JADX INFO: renamed from: b */
        protected boolean f62672b;

        public a(boolean z, boolean z2, int i) {
            this.f62671a = z;
            this.f62672b = z2;
            this.f62670a = i;
        }

        @Override // com.xiaomi.push.InterfaceC14782ic
        /* JADX INFO: renamed from: a */
        public quq0 mo86242a(yuq0 yuq0Var) {
            C14779hw c14779hw = new C14779hw(yuq0Var, this.f62671a, this.f62672b);
            int i = this.f62670a;
            if (i != 0) {
                c14779hw.m86214L(i);
            }
            return c14779hw;
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a() {
            this(false, true);
        }
    }

    @Override // p149l.quq0
    /* JADX INFO: renamed from: v */
    public void mo86237v(tuq0 tuq0Var) {
    }
}
