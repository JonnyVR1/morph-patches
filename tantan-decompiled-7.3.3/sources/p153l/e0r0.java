package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0r0 {
    /* JADX INFO: renamed from: a */
    public abstract int mo118916a();

    /* JADX INFO: renamed from: b */
    public abstract e0r0 mo118917b(suq0 suq0Var);

    /* JADX INFO: renamed from: c */
    public e0r0 m118918c(byte[] bArr) {
        return m118919d(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: d */
    public e0r0 m118919d(byte[] bArr, int i, int i2) throws C14878d {
        try {
            suq0 suq0VarM188072h = suq0.m188072h(bArr, i, i2);
            mo118917b(suq0VarM188072h);
            suq0VarM188072h.m188082j(0);
            return this;
        } catch (C14878d e) {
            throw e;
        } catch (IOException unused) {
            azk0.m101074a("Reading from a byte array threw an IOException (should never happen).");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo118920e(C14877c c14877c);

    /* JADX INFO: renamed from: f */
    public void m118921f(byte[] bArr, int i, int i2) {
        try {
            C14877c c14877cM86657p = C14877c.m86657p(bArr, i, i2);
            mo118920e(c14877cM86657p);
            c14877cM86657p.m86664K();
        } catch (IOException unused) {
            azk0.m101074a("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m118922g(suq0 suq0Var, int i) {
        return suq0Var.m188085m(i);
    }

    /* JADX INFO: renamed from: h */
    public byte[] m118923h() {
        int iMo118924i = mo118924i();
        byte[] bArr = new byte[iMo118924i];
        m118921f(bArr, 0, iMo118924i);
        return bArr;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo118924i();
}
