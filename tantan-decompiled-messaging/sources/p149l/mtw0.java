package p149l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class mtw0 {

    /* JADX INFO: renamed from: a */
    public String f135708a;

    /* JADX INFO: renamed from: b */
    public ntw0 f135709b;

    /* JADX INFO: renamed from: c */
    public apw0 f135710c;

    public /* synthetic */ mtw0(ltw0 ltw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final mtw0 m156362a(apw0 apw0Var) {
        this.f135710c = apw0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final mtw0 m156363b(ntw0 ntw0Var) {
        this.f135709b = ntw0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final mtw0 m156364c(String str) {
        this.f135708a = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final ptw0 m156365d() throws GeneralSecurityException {
        if (this.f135708a == null) {
            j8w0.m140474a("kekUri must be set");
            return null;
        }
        ntw0 ntw0Var = this.f135709b;
        if (ntw0Var == null) {
            j8w0.m140474a("dekParsingStrategy must be set");
            return null;
        }
        apw0 apw0Var = this.f135710c;
        if (apw0Var == null) {
            j8w0.m140474a("dekParametersForNewKeys must be set");
            return null;
        }
        if (apw0Var.mo104696a()) {
            j8w0.m140474a("dekParametersForNewKeys must note have ID Requirements");
            return null;
        }
        if ((ntw0Var == ntw0.f140544b && (apw0Var instanceof irw0)) || ((ntw0Var == ntw0.f140546d && (apw0Var instanceof lsw0)) || ((ntw0Var == ntw0.f140545c && (apw0Var instanceof iuw0)) || ((ntw0Var == ntw0.f140547e && (apw0Var instanceof rpw0)) || ((ntw0Var == ntw0.f140548f && (apw0Var instanceof lqw0)) || (ntw0Var == ntw0.f140549g && (apw0Var instanceof vrw0))))))) {
            return new ptw0(this.f135708a, this.f135709b, this.f135710c, null);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + this.f135709b.toString() + " when new keys are picked according to " + String.valueOf(this.f135710c) + ".");
    }
}
