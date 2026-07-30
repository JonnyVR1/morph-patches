package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p149l.huq0;
import p149l.iuq0;
import p149l.quq0;
import p149l.suq0;
import p149l.uuq0;
import p149l.yuq0;

/* JADX INFO: renamed from: com.xiaomi.push.ig */
/* JADX INFO: loaded from: classes2.dex */
public class C14783ig extends C14779hw {

    /* JADX INFO: renamed from: o */
    private static int f62677o = 10000;

    /* JADX INFO: renamed from: p */
    private static int f62678p = 10000;

    /* JADX INFO: renamed from: q */
    private static int f62679q = 10000;

    /* JADX INFO: renamed from: r */
    private static int f62680r = 10485760;

    /* JADX INFO: renamed from: s */
    private static int f62681s = 104857600;

    public C14783ig(yuq0 yuq0Var, boolean z, boolean z2) {
        super(yuq0Var, z, z2);
    }

    @Override // com.xiaomi.push.C14779hw, p149l.quq0
    /* JADX INFO: renamed from: e */
    public String mo86220e() throws C14778hu {
        int iMo86218c = mo86218c();
        if (iMo86218c > f62680r) {
            uuq0.m195384a("Thrift string size ", iMo86218c);
            return null;
        }
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

    @Override // com.xiaomi.push.C14779hw, p149l.quq0
    /* JADX INFO: renamed from: f */
    public ByteBuffer mo86221f() throws C14778hu {
        int iMo86218c = mo86218c();
        if (iMo86218c > f62681s) {
            uuq0.m195384a("Thrift binary size ", iMo86218c);
            return null;
        }
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

    @Override // com.xiaomi.push.C14779hw, p149l.quq0
    /* JADX INFO: renamed from: h */
    public huq0 mo86223h() throws C14778hu {
        byte bMo86216a = mo86216a();
        int iMo86218c = mo86218c();
        if (iMo86218c <= f62678p) {
            return new huq0(bMo86216a, iMo86218c);
        }
        uuq0.m195384a("Thrift list size ", iMo86218c);
        return null;
    }

    @Override // com.xiaomi.push.C14779hw, p149l.quq0
    /* JADX INFO: renamed from: i */
    public iuq0 mo86224i() throws C14778hu {
        byte bMo86216a = mo86216a();
        byte bMo86216a2 = mo86216a();
        int iMo86218c = mo86218c();
        if (iMo86218c <= f62677o) {
            return new iuq0(bMo86216a, bMo86216a2, iMo86218c);
        }
        uuq0.m195384a("Thrift map size ", iMo86218c);
        return null;
    }

    @Override // com.xiaomi.push.C14779hw, p149l.quq0
    /* JADX INFO: renamed from: j */
    public suq0 mo86225j() throws C14778hu {
        byte bMo86216a = mo86216a();
        int iMo86218c = mo86218c();
        if (iMo86218c <= f62679q) {
            return new suq0(bMo86216a, iMo86218c);
        }
        uuq0.m195384a("Thrift set size ", iMo86218c);
        return null;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.ig$a */
    public static class a extends C14779hw.a {
        public a() {
            super(false, true);
        }

        @Override // com.xiaomi.push.C14779hw.a, com.xiaomi.push.InterfaceC14782ic
        /* JADX INFO: renamed from: a */
        public quq0 mo86242a(yuq0 yuq0Var) {
            C14783ig c14783ig = new C14783ig(yuq0Var, ((C14779hw.a) this).f62671a, this.f62672b);
            int i = ((C14779hw.a) this).f62670a;
            if (i != 0) {
                c14783ig.m86214L(i);
            }
            return c14783ig;
        }

        public a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }
    }
}
