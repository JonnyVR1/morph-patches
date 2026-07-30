package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p153l.a4r0;
import p153l.e4r0;
import p153l.n3r0;
import p153l.o3r0;
import p153l.w3r0;
import p153l.y3r0;

/* JADX INFO: renamed from: com.xiaomi.push.ig */
/* JADX INFO: loaded from: classes2.dex */
public class C14931ig extends C14927hw {

    /* JADX INFO: renamed from: o */
    private static int f63524o = 10000;

    /* JADX INFO: renamed from: p */
    private static int f63525p = 10000;

    /* JADX INFO: renamed from: q */
    private static int f63526q = 10000;

    /* JADX INFO: renamed from: r */
    private static int f63527r = 10485760;

    /* JADX INFO: renamed from: s */
    private static int f63528s = 104857600;

    public C14931ig(e4r0 e4r0Var, boolean z, boolean z2) {
        super(e4r0Var, z, z2);
    }

    @Override // com.xiaomi.push.C14927hw, p153l.w3r0
    /* JADX INFO: renamed from: e */
    public String mo87391e() throws C14926hu {
        int iMo87389c = mo87389c();
        if (iMo87389c > f63527r) {
            a4r0.m95988a("Thrift string size ", iMo87389c);
            return null;
        }
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

    @Override // com.xiaomi.push.C14927hw, p153l.w3r0
    /* JADX INFO: renamed from: f */
    public ByteBuffer mo87392f() throws C14926hu {
        int iMo87389c = mo87389c();
        if (iMo87389c > f63528s) {
            a4r0.m95988a("Thrift binary size ", iMo87389c);
            return null;
        }
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

    @Override // com.xiaomi.push.C14927hw, p153l.w3r0
    /* JADX INFO: renamed from: h */
    public n3r0 mo87394h() throws C14926hu {
        byte bMo87387a = mo87387a();
        int iMo87389c = mo87389c();
        if (iMo87389c <= f63525p) {
            return new n3r0(bMo87387a, iMo87389c);
        }
        a4r0.m95988a("Thrift list size ", iMo87389c);
        return null;
    }

    @Override // com.xiaomi.push.C14927hw, p153l.w3r0
    /* JADX INFO: renamed from: i */
    public o3r0 mo87395i() throws C14926hu {
        byte bMo87387a = mo87387a();
        byte bMo87387a2 = mo87387a();
        int iMo87389c = mo87389c();
        if (iMo87389c <= f63524o) {
            return new o3r0(bMo87387a, bMo87387a2, iMo87389c);
        }
        a4r0.m95988a("Thrift map size ", iMo87389c);
        return null;
    }

    @Override // com.xiaomi.push.C14927hw, p153l.w3r0
    /* JADX INFO: renamed from: j */
    public y3r0 mo87396j() throws C14926hu {
        byte bMo87387a = mo87387a();
        int iMo87389c = mo87389c();
        if (iMo87389c <= f63526q) {
            return new y3r0(bMo87387a, iMo87389c);
        }
        a4r0.m95988a("Thrift set size ", iMo87389c);
        return null;
    }

    /* JADX INFO: renamed from: com.xiaomi.push.ig$a */
    public static class a extends C14927hw.a {
        public a() {
            super(false, true);
        }

        @Override // com.xiaomi.push.C14927hw.a, com.xiaomi.push.InterfaceC14930ic
        /* JADX INFO: renamed from: a */
        public w3r0 mo87413a(e4r0 e4r0Var) {
            C14931ig c14931ig = new C14931ig(e4r0Var, ((C14927hw.a) this).f63518a, this.f63519b);
            int i = ((C14927hw.a) this).f63517a;
            if (i != 0) {
                c14931ig.m87385L(i);
            }
            return c14931ig;
        }

        public a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }
    }
}
