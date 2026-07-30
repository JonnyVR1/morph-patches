package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class fpw0 {

    /* JADX INFO: renamed from: a */
    public rpw0 f98745a = null;

    /* JADX INFO: renamed from: b */
    public r6x0 f98746b = null;

    /* JADX INFO: renamed from: c */
    public r6x0 f98747c = null;

    /* JADX INFO: renamed from: d */
    public Integer f98748d = null;

    public /* synthetic */ fpw0(epw0 epw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final fpw0 m122676a(r6x0 r6x0Var) {
        this.f98746b = r6x0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final fpw0 m122677b(r6x0 r6x0Var) {
        this.f98747c = r6x0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final fpw0 m122678c(Integer num) {
        this.f98748d = num;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final fpw0 m122679d(rpw0 rpw0Var) {
        this.f98745a = rpw0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final hpw0 m122680e() throws GeneralSecurityException {
        q6x0 q6x0VarM173179b;
        rpw0 rpw0Var = this.f98745a;
        if (rpw0Var == null) {
            j8w0.m140474a("Cannot build without parameters");
            return null;
        }
        r6x0 r6x0Var = this.f98746b;
        if (r6x0Var == null || this.f98747c == null) {
            j8w0.m140474a("Cannot build without key material");
            return null;
        }
        if (rpw0Var.m180402b() != r6x0Var.m178104a()) {
            j8w0.m140474a("AES key size mismatch");
            return null;
        }
        if (rpw0Var.m180403c() != this.f98747c.m178104a()) {
            j8w0.m140474a("HMAC key size mismatch");
            return null;
        }
        if (this.f98745a.mo104696a() && this.f98748d == null) {
            j8w0.m140474a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f98745a.mo104696a() && this.f98748d != null) {
            j8w0.m140474a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f98745a.m180407g() == ppw0.f150728d) {
            q6x0VarM173179b = q6x0.m173179b(new byte[0]);
        } else if (this.f98745a.m180407g() == ppw0.f150727c) {
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f98748d.intValue()).array());
        } else {
            if (this.f98745a.m180407g() != ppw0.f150726b) {
                qkq0.m175383a("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f98745a.m180407g())));
                return null;
            }
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f98748d.intValue()).array());
        }
        return new hpw0(this.f98745a, this.f98746b, this.f98747c, q6x0VarM173179b, this.f98748d, null);
    }
}
