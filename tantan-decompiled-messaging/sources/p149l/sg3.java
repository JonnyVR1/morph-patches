package p149l;

import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public class sg3 {
    /* JADX INFO: renamed from: a */
    public synchronized void m184032a(lec0 lec0Var, s460 s460Var) throws Exception {
        try {
            lec0Var.m149499m().mo216485a("start write buffer");
            Buffer buffer = new Buffer();
            s460Var.m182209b().mo152007b(buffer, lec0Var);
            if (s460Var.m182208a() != null) {
                buffer.write(s460Var.m182208a());
            }
            lec0Var.m149499m().mo216485a("write buffer size " + buffer.size());
            lec0Var.m149492f().m118447R(buffer);
        } catch (Throwable th) {
            throw th;
        }
    }
}
