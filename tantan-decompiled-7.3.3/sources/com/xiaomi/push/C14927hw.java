package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p153l.e4r0;
import p153l.m3r0;
import p153l.n3r0;
import p153l.o3r0;
import p153l.w3r0;
import p153l.y3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.hw */
/* JADX INFO: loaded from: classes2.dex */
public class C14927hw extends w3r0 {

    /* JADX INFO: renamed from: n */
    private static final z3r0 f63504n = new z3r0();

    /* JADX INFO: renamed from: b */
    protected boolean f63505b;

    /* JADX INFO: renamed from: c */
    protected boolean f63506c;

    /* JADX INFO: renamed from: d */
    protected int f63507d;

    /* JADX INFO: renamed from: e */
    protected boolean f63508e;

    /* JADX INFO: renamed from: f */
    private byte[] f63509f;

    /* JADX INFO: renamed from: g */
    private byte[] f63510g;

    /* JADX INFO: renamed from: h */
    private byte[] f63511h;

    /* JADX INFO: renamed from: i */
    private byte[] f63512i;

    /* JADX INFO: renamed from: j */
    private byte[] f63513j;

    /* JADX INFO: renamed from: k */
    private byte[] f63514k;

    /* JADX INFO: renamed from: l */
    private byte[] f63515l;

    /* JADX INFO: renamed from: m */
    private byte[] f63516m;

    public C14927hw(e4r0 e4r0Var, boolean z, boolean z2) {
        super(e4r0Var);
        this.f63508e = false;
        this.f63509f = new byte[1];
        this.f63510g = new byte[2];
        this.f63511h = new byte[4];
        this.f63512i = new byte[8];
        this.f63513j = new byte[1];
        this.f63514k = new byte[2];
        this.f63515l = new byte[4];
        this.f63516m = new byte[8];
        this.f63505b = z;
        this.f63506c = z2;
    }

    /* JADX INFO: renamed from: J */
    private int m87375J(byte[] bArr, int i, int i2) throws C14926hu {
        m87386M(i2);
        return this.f187165a.m119472g(bArr, i, i2);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: A */
    public void mo87376A() {
        mo87400n((byte) 0);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: B */
    public void mo87377B() {
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: C */
    public void mo87378C() {
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: D */
    public void mo87379D() {
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: E */
    public void mo87380E() {
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: F */
    public void mo87381F() {
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: G */
    public void mo87382G() {
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: H */
    public void mo87383H() {
    }

    /* JADX INFO: renamed from: K */
    public String m87384K(int i) throws C14926hu {
        try {
            m87386M(i);
            byte[] bArr = new byte[i];
            this.f187165a.m119472g(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new C14926hu("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* JADX INFO: renamed from: L */
    public void m87385L(int i) {
        this.f63507d = i;
        this.f63508e = true;
    }

    /* JADX INFO: renamed from: M */
    public void m87386M(int i) throws C14926hu {
        if (i < 0) {
            throw new C14926hu("Negative length: " + i);
        }
        if (this.f63508e) {
            int i2 = this.f63507d - i;
            this.f63507d = i2;
            if (i2 >= 0) {
                return;
            }
            throw new C14926hu("Message length exceeded: " + i);
        }
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: a */
    public byte mo87387a() throws C14926hu {
        if (this.f187165a.mo114232f() < 1) {
            m87375J(this.f63513j, 0, 1);
            return this.f63513j[0];
        }
        byte b = this.f187165a.mo114230d()[this.f187165a.mo114231e()];
        this.f187165a.mo114229b(1);
        return b;
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: b */
    public double mo87388b() {
        return Double.longBitsToDouble(mo87390d());
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: c */
    public int mo87389c() throws C14926hu {
        int iMo114231e;
        byte[] bArrMo114230d = this.f63515l;
        if (this.f187165a.mo114232f() >= 4) {
            bArrMo114230d = this.f187165a.mo114230d();
            iMo114231e = this.f187165a.mo114231e();
            this.f187165a.mo114229b(4);
        } else {
            m87375J(this.f63515l, 0, 4);
            iMo114231e = 0;
        }
        return ((bArrMo114230d[iMo114231e] & 255) << 24) | ((bArrMo114230d[iMo114231e + 1] & 255) << 16) | ((bArrMo114230d[iMo114231e + 2] & 255) << 8) | (bArrMo114230d[iMo114231e + 3] & 255);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: d */
    public long mo87390d() throws C14926hu {
        int iMo114231e;
        byte[] bArrMo114230d = this.f63516m;
        if (this.f187165a.mo114232f() >= 8) {
            bArrMo114230d = this.f187165a.mo114230d();
            iMo114231e = this.f187165a.mo114231e();
            this.f187165a.mo114229b(8);
        } else {
            m87375J(this.f63516m, 0, 8);
            iMo114231e = 0;
        }
        return ((long) (bArrMo114230d[iMo114231e + 7] & 255)) | (((long) (bArrMo114230d[iMo114231e] & 255)) << 56) | (((long) (bArrMo114230d[iMo114231e + 1] & 255)) << 48) | (((long) (bArrMo114230d[iMo114231e + 2] & 255)) << 40) | (((long) (bArrMo114230d[iMo114231e + 3] & 255)) << 32) | (((long) (bArrMo114230d[iMo114231e + 4] & 255)) << 24) | (((long) (bArrMo114230d[iMo114231e + 5] & 255)) << 16) | (((long) (bArrMo114230d[iMo114231e + 6] & 255)) << 8);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: e */
    public String mo87391e() throws C14926hu {
        int iMo87389c = mo87389c();
        if (this.f187165a.mo114232f() < iMo87389c) {
            return m87384K(iMo87389c);
        }
        try {
            String str = new String(this.f187165a.mo114230d(), this.f187165a.mo114231e(), iMo87389c, "UTF-8");
            this.f187165a.mo114229b(iMo87389c);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C14926hu("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: f */
    public ByteBuffer mo87392f() throws C14926hu {
        int iMo87389c = mo87389c();
        m87386M(iMo87389c);
        if (this.f187165a.mo114232f() >= iMo87389c) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f187165a.mo114230d(), this.f187165a.mo114231e(), iMo87389c);
            this.f187165a.mo114229b(iMo87389c);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iMo87389c];
        this.f187165a.m119472g(bArr, 0, iMo87389c);
        return ByteBuffer.wrap(bArr);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: g */
    public m3r0 mo87393g() throws C14926hu {
        byte bMo87387a = mo87387a();
        return new m3r0("", bMo87387a, bMo87387a == 0 ? (short) 0 : mo87398l());
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: h */
    public n3r0 mo87394h() {
        return new n3r0(mo87387a(), mo87389c());
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: i */
    public o3r0 mo87395i() {
        return new o3r0(mo87387a(), mo87387a(), mo87389c());
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: j */
    public y3r0 mo87396j() {
        return new y3r0(mo87387a(), mo87389c());
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: k */
    public z3r0 mo87397k() {
        return f63504n;
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: l */
    public short mo87398l() throws C14926hu {
        int iMo114231e;
        byte[] bArrMo114230d = this.f63514k;
        if (this.f187165a.mo114232f() >= 2) {
            bArrMo114230d = this.f187165a.mo114230d();
            iMo114231e = this.f187165a.mo114231e();
            this.f187165a.mo114229b(2);
        } else {
            m87375J(this.f63514k, 0, 2);
            iMo114231e = 0;
        }
        return (short) (((bArrMo114230d[iMo114231e] & 255) << 8) | (bArrMo114230d[iMo114231e + 1] & 255));
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: m */
    public void mo87399m() {
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: n */
    public void mo87400n(byte b) {
        byte[] bArr = this.f63509f;
        bArr[0] = b;
        this.f187165a.mo102510c(bArr, 0, 1);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: o */
    public void mo87401o(int i) {
        byte[] bArr = this.f63511h;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f187165a.mo102510c(bArr, 0, 4);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: p */
    public void mo87402p(long j) {
        byte[] bArr = this.f63512i;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.f187165a.mo102510c(bArr, 0, 8);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: q */
    public void mo87403q(String str) throws C14926hu {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo87401o(bytes.length);
            this.f187165a.mo102510c(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C14926hu("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: r */
    public void mo87404r(ByteBuffer byteBuffer) {
        int iLimit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo87401o(iLimit);
        this.f187165a.mo102510c(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: s */
    public void mo87405s(m3r0 m3r0Var) {
        mo87400n(m3r0Var.f134700b);
        mo87409w(m3r0Var.f134701c);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: t */
    public void mo87406t(n3r0 n3r0Var) {
        mo87400n(n3r0Var.f140032a);
        mo87401o(n3r0Var.f140033b);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: u */
    public void mo87407u(o3r0 o3r0Var) {
        mo87400n(o3r0Var.f144849a);
        mo87400n(o3r0Var.f144850b);
        mo87401o(o3r0Var.f144851c);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: w */
    public void mo87409w(short s) {
        byte[] bArr = this.f63510g;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f187165a.mo102510c(bArr, 0, 2);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: x */
    public void mo87410x(boolean z) {
        mo87400n(z ? (byte) 1 : (byte) 0);
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: y */
    public boolean mo87411y() {
        return mo87387a() == 1;
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: z */
    public void mo87412z() {
    }

    /* JADX INFO: renamed from: com.xiaomi.push.hw$a */
    public static class a implements InterfaceC14930ic {

        /* JADX INFO: renamed from: a */
        protected int f63517a;

        /* JADX INFO: renamed from: a */
        protected boolean f63518a;

        /* JADX INFO: renamed from: b */
        protected boolean f63519b;

        public a(boolean z, boolean z2, int i) {
            this.f63518a = z;
            this.f63519b = z2;
            this.f63517a = i;
        }

        @Override // com.xiaomi.push.InterfaceC14930ic
        /* JADX INFO: renamed from: a */
        public w3r0 mo87413a(e4r0 e4r0Var) {
            C14927hw c14927hw = new C14927hw(e4r0Var, this.f63518a, this.f63519b);
            int i = this.f63517a;
            if (i != 0) {
                c14927hw.m87385L(i);
            }
            return c14927hw;
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a() {
            this(false, true);
        }
    }

    @Override // p153l.w3r0
    /* JADX INFO: renamed from: v */
    public void mo87408v(z3r0 z3r0Var) {
    }
}
