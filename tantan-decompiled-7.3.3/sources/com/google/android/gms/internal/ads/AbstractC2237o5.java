package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.fhx0;
import p153l.fkx0;
import p153l.gjx0;
import p153l.jgx0;
import p153l.ukx0;
import p153l.wtq0;
import p153l.xlx0;
import p153l.zgx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2237o5 extends jgx0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f10053b = Logger.getLogger(AbstractC2237o5.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f10054c = xlx0.m211688a();

    /* JADX INFO: renamed from: a */
    public fhx0 f10055a;

    public AbstractC2237o5() {
    }

    /* JADX INFO: renamed from: A */
    public static int m13148A(String str) {
        int length;
        try {
            length = C2317y5.m13551e(str);
        } catch (zzhdd unused) {
            length = str.getBytes(gjx0.f104689b).length;
        }
        return m13149B(length) + length;
    }

    /* JADX INFO: renamed from: B */
    public static int m13149B(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: b */
    public static int m13150b(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC2237o5 m13151c(byte[] bArr, int i, int i2) {
        return new C2221m5(bArr, 0, i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static int m13153y(int i, fkx0 fkx0Var, ukx0 ukx0Var) {
        int iM13149B = m13149B(i << 3);
        return iM13149B + iM13149B + ((AbstractC2181h5) fkx0Var).mo12795b(ukx0Var);
    }

    /* JADX INFO: renamed from: z */
    public static int m13154z(fkx0 fkx0Var, ukx0 ukx0Var) {
        int iMo12795b = ((AbstractC2181h5) fkx0Var).mo12795b(ukx0Var);
        return m13149B(iMo12795b) + iMo12795b;
    }

    @Override // p153l.jgx0
    /* JADX INFO: renamed from: a */
    public abstract void mo12965a(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: d */
    public final void m13155d() {
        if (mo12970k() == 0) {
            return;
        }
        wtq0.m207906a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: e */
    public final void m13156e(String str, zzhdd zzhddVar) throws IOException {
        f10053b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhddVar);
        byte[] bytes = str.getBytes(gjx0.f104689b);
        try {
            int length = bytes.length;
            mo12981v(length);
            mo12965a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo12966g() throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo12967h(byte b) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo12968i(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo12969j(int i, zzgyl zzgylVar) throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract int mo12970k();

    /* JADX INFO: renamed from: l */
    public abstract void mo12971l(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract void mo12972m(int i) throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract void mo12973n(int i, long j) throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract void mo12974o(long j) throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract void mo12975p(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract void mo12976q(int i) throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract void mo12977r(int i, fkx0 fkx0Var, ukx0 ukx0Var) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo12978s(int i, String str) throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract void mo12979t(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract void mo12980u(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract void mo12981v(int i) throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract void mo12982w(int i, long j) throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract void mo12983x(long j) throws IOException;

    public /* synthetic */ AbstractC2237o5(zgx0 zgx0Var) {
    }
}
