package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.k8x0;
import p153l.q1y0;
import p153l.sax0;
import p153l.srx0;
import p153l.uxx0;
import p153l.wtq0;
import p153l.ysw0;
import p153l.yvx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2395a0 extends ysw0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f10341b = Logger.getLogger(AbstractC2395a0.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f10342c = q1y0.m174932C();

    /* JADX INFO: renamed from: a */
    public sax0 f10343a;

    public /* synthetic */ AbstractC2395a0(k8x0 k8x0Var) {
    }

    /* JADX INFO: renamed from: A */
    public static int m14770A(String str) {
        int length;
        try {
            length = C2419l0.m14919c(str);
        } catch (zzjs unused) {
            length = str.getBytes(srx0.f170385a).length;
        }
        return m14771B(length) + length;
    }

    /* JADX INFO: renamed from: B */
    public static int m14771B(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: a */
    public static int m14772a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static int m14774y(int i, yvx0 yvx0Var, uxx0 uxx0Var) {
        int iM14771B = m14771B(i << 3);
        return iM14771B + iM14771B + ((AbstractC2444y) yvx0Var).mo14821b(uxx0Var);
    }

    /* JADX INFO: renamed from: z */
    public static int m14775z(yvx0 yvx0Var, uxx0 uxx0Var) {
        int iMo14821b = ((AbstractC2444y) yvx0Var).mo14821b(uxx0Var);
        return m14771B(iMo14821b) + iMo14821b;
    }

    /* JADX INFO: renamed from: b */
    public final void m14776b() {
        if (mo14778e() == 0) {
            return;
        }
        wtq0.m207906a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: c */
    public final void m14777c(String str, zzjs zzjsVar) throws IOException {
        f10341b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzjsVar);
        byte[] bytes = str.getBytes(srx0.f170385a);
        try {
            int length = bytes.length;
            mo14795v(length);
            mo14788o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgp(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo14778e();

    /* JADX INFO: renamed from: f */
    public abstract void mo14779f(byte b) throws IOException;

    /* JADX INFO: renamed from: g */
    public abstract void mo14780g(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo14781h(int i, zzgk zzgkVar) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo14782i(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo14783j(int i) throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract void mo14784k(int i, long j) throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract void mo14785l(long j) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract void mo14786m(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract void mo14787n(int i) throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract void mo14788o(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract void mo14789p(int i, yvx0 yvx0Var, uxx0 uxx0Var) throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract void mo14790q(int i, yvx0 yvx0Var) throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract void mo14791r(int i, zzgk zzgkVar) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo14792s(int i, String str) throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract void mo14793t(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract void mo14794u(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract void mo14795v(int i) throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract void mo14796w(int i, long j) throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract void mo14797x(long j) throws IOException;

    public AbstractC2395a0() {
        throw null;
    }
}
