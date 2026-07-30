package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.aax0;
import p149l.d7x0;
import p149l.obx0;
import p149l.qkq0;
import p149l.rcx0;
import p149l.t7x0;
import p149l.z7x0;
import p149l.zax0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2214o5 extends d7x0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f10016b = Logger.getLogger(AbstractC2214o5.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f10017c = rcx0.m178823a();

    /* JADX INFO: renamed from: a */
    public z7x0 f10018a;

    public AbstractC2214o5() {
    }

    /* JADX INFO: renamed from: A */
    public static int m13094A(String str) {
        int length;
        try {
            length = C2294y5.m13497e(str);
        } catch (zzhdd unused) {
            length = str.getBytes(aax0.f68608b).length;
        }
        return m13095B(length) + length;
    }

    /* JADX INFO: renamed from: B */
    public static int m13095B(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: b */
    public static int m13096b(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC2214o5 m13097c(byte[] bArr, int i, int i2) {
        return new C2198m5(bArr, 0, i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static int m13099y(int i, zax0 zax0Var, obx0 obx0Var) {
        int iM13095B = m13095B(i << 3);
        return iM13095B + iM13095B + ((AbstractC2158h5) zax0Var).mo12741b(obx0Var);
    }

    /* JADX INFO: renamed from: z */
    public static int m13100z(zax0 zax0Var, obx0 obx0Var) {
        int iMo12741b = ((AbstractC2158h5) zax0Var).mo12741b(obx0Var);
        return m13095B(iMo12741b) + iMo12741b;
    }

    @Override // p149l.d7x0
    /* JADX INFO: renamed from: a */
    public abstract void mo12911a(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: d */
    public final void m13101d() {
        if (mo12916k() == 0) {
            return;
        }
        qkq0.m175383a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: e */
    public final void m13102e(String str, zzhdd zzhddVar) throws IOException {
        f10016b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhddVar);
        byte[] bytes = str.getBytes(aax0.f68608b);
        try {
            int length = bytes.length;
            mo12927v(length);
            mo12911a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo12912g() throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo12913h(byte b) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo12914i(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo12915j(int i, zzgyl zzgylVar) throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract int mo12916k();

    /* JADX INFO: renamed from: l */
    public abstract void mo12917l(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract void mo12918m(int i) throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract void mo12919n(int i, long j) throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract void mo12920o(long j) throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract void mo12921p(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract void mo12922q(int i) throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract void mo12923r(int i, zax0 zax0Var, obx0 obx0Var) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo12924s(int i, String str) throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract void mo12925t(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract void mo12926u(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract void mo12927v(int i) throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract void mo12928w(int i, long j) throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract void mo12929x(long j) throws IOException;

    public /* synthetic */ AbstractC2214o5(t7x0 t7x0Var) {
    }
}
