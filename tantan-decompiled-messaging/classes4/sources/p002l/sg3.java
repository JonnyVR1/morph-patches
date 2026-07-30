package p002l;

import okio.Buffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sg3 {
    /* JADX INFO: renamed from: a */
    public synchronized void m22451a(lec0 lec0Var, s460 s460Var) throws Exception {
        try {
            lec0Var.m17157m().mo26978a("start write buffer");
            Buffer buffer = new Buffer();
            s460Var.m22194b().mo17496b(buffer, lec0Var);
            if (s460Var.m22193a() != null) {
                buffer.write(s460Var.m22193a());
            }
            lec0Var.m17157m().mo26978a("write buffer size " + buffer.size());
            lec0Var.m17150f().m12782R(buffer);
        } catch (Throwable th) {
            throw th;
        }
    }
}
