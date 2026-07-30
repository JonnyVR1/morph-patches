package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yqq0 {
    /* JADX INFO: renamed from: a */
    public abstract int mo98326a();

    /* JADX INFO: renamed from: b */
    public abstract yqq0 mo98327b(mlq0 mlq0Var);

    /* JADX INFO: renamed from: c */
    public yqq0 m215757c(byte[] bArr) {
        return m215758d(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: d */
    public yqq0 m215758d(byte[] bArr, int i, int i2) throws C14730d {
        try {
            mlq0 mlq0VarM155171h = mlq0.m155171h(bArr, i, i2);
            mo98327b(mlq0VarM155171h);
            mlq0VarM155171h.m155181j(0);
            return this;
        } catch (C14730d e) {
            throw e;
        } catch (IOException unused) {
            upk0.m194883a("Reading from a byte array threw an IOException (should never happen).");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo98328e(C14729c c14729c);

    /* JADX INFO: renamed from: f */
    public void m215759f(byte[] bArr, int i, int i2) {
        try {
            C14729c c14729cM85486p = C14729c.m85486p(bArr, i, i2);
            mo98328e(c14729cM85486p);
            c14729cM85486p.m85493K();
        } catch (IOException unused) {
            upk0.m194883a("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m215760g(mlq0 mlq0Var, int i) {
        return mlq0Var.m155184m(i);
    }

    /* JADX INFO: renamed from: h */
    public byte[] m215761h() {
        int iMo98329i = mo98329i();
        byte[] bArr = new byte[iMo98329i];
        m215759f(bArr, 0, iMo98329i);
        return bArr;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo98329i();
}
