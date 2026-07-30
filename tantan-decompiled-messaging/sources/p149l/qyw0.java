package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class qyw0 {

    /* JADX INFO: renamed from: a */
    public bzw0 f156976a = null;

    /* JADX INFO: renamed from: b */
    public r6x0 f156977b = null;

    /* JADX INFO: renamed from: c */
    public Integer f156978c = null;

    public /* synthetic */ qyw0(pyw0 pyw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final qyw0 m177108a(r6x0 r6x0Var) throws GeneralSecurityException {
        this.f156977b = r6x0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final qyw0 m177109b(Integer num) {
        this.f156978c = num;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final qyw0 m177110c(bzw0 bzw0Var) {
        this.f156976a = bzw0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final syw0 m177111d() throws GeneralSecurityException {
        r6x0 r6x0Var;
        q6x0 q6x0VarM173179b;
        bzw0 bzw0Var = this.f156976a;
        if (bzw0Var == null || (r6x0Var = this.f156977b) == null) {
            j8w0.m140474a("Cannot build without parameters and/or key material");
            return null;
        }
        if (bzw0Var.m104698c() != r6x0Var.m178104a()) {
            j8w0.m140474a("Key size mismatch");
            return null;
        }
        if (bzw0Var.mo104696a() && this.f156978c == null) {
            j8w0.m140474a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f156976a.mo104696a() && this.f156978c != null) {
            j8w0.m140474a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f156976a.m104700e() == zyw0.f205755e) {
            q6x0VarM173179b = q6x0.m173179b(new byte[0]);
        } else if (this.f156976a.m104700e() == zyw0.f205754d || this.f156976a.m104700e() == zyw0.f205753c) {
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f156978c.intValue()).array());
        } else {
            if (this.f156976a.m104700e() != zyw0.f205752b) {
                qkq0.m175383a("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f156976a.m104700e())));
                return null;
            }
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f156978c.intValue()).array());
        }
        return new syw0(this.f156976a, this.f156977b, q6x0VarM173179b, this.f156978c, null);
    }
}
