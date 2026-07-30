package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.ezw0;
import p149l.ksx0;
import p149l.m1x0;
import p149l.mix0;
import p149l.oox0;
import p149l.qkq0;
import p149l.sjw0;
import p149l.smx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2372a0 extends sjw0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f10304b = Logger.getLogger(AbstractC2372a0.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f10305c = ksx0.m147106C();

    /* JADX INFO: renamed from: a */
    public m1x0 f10306a;

    public /* synthetic */ AbstractC2372a0(ezw0 ezw0Var) {
    }

    /* JADX INFO: renamed from: A */
    public static int m14716A(String str) {
        int length;
        try {
            length = C2396l0.m14865c(str);
        } catch (zzjs unused) {
            length = str.getBytes(mix0.f134047a).length;
        }
        return m14717B(length) + length;
    }

    /* JADX INFO: renamed from: B */
    public static int m14717B(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: a */
    public static int m14718a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static int m14720y(int i, smx0 smx0Var, oox0 oox0Var) {
        int iM14717B = m14717B(i << 3);
        return iM14717B + iM14717B + ((AbstractC2421y) smx0Var).mo14767b(oox0Var);
    }

    /* JADX INFO: renamed from: z */
    public static int m14721z(smx0 smx0Var, oox0 oox0Var) {
        int iMo14767b = ((AbstractC2421y) smx0Var).mo14767b(oox0Var);
        return m14717B(iMo14767b) + iMo14767b;
    }

    /* JADX INFO: renamed from: b */
    public final void m14722b() {
        if (mo14724e() == 0) {
            return;
        }
        qkq0.m175383a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: c */
    public final void m14723c(String str, zzjs zzjsVar) throws IOException {
        f10304b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzjsVar);
        byte[] bytes = str.getBytes(mix0.f134047a);
        try {
            int length = bytes.length;
            mo14741v(length);
            mo14734o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgp(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo14724e();

    /* JADX INFO: renamed from: f */
    public abstract void mo14725f(byte b) throws IOException;

    /* JADX INFO: renamed from: g */
    public abstract void mo14726g(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo14727h(int i, zzgk zzgkVar) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo14728i(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo14729j(int i) throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract void mo14730k(int i, long j) throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract void mo14731l(long j) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract void mo14732m(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract void mo14733n(int i) throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract void mo14734o(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract void mo14735p(int i, smx0 smx0Var, oox0 oox0Var) throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract void mo14736q(int i, smx0 smx0Var) throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract void mo14737r(int i, zzgk zzgkVar) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo14738s(int i, String str) throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract void mo14739t(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract void mo14740u(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract void mo14741v(int i) throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract void mo14742w(int i, long j) throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract void mo14743x(long j) throws IOException;

    public AbstractC2372a0() {
        throw null;
    }
}
