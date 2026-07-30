package p153l;

import okio.Buffer;

/* JADX INFO: loaded from: classes5.dex */
public class gh3 {
    /* JADX INFO: renamed from: a */
    public synchronized void m130242a(smc0 smc0Var, yc60 yc60Var) throws Exception {
        try {
            smc0Var.m186795m().mo204126a("start write buffer");
            Buffer buffer = new Buffer();
            yc60Var.m215136b().mo127314b(buffer, smc0Var);
            if (yc60Var.m215135a() != null) {
                buffer.write(yc60Var.m215135a());
            }
            smc0Var.m186795m().mo204126a("write buffer size " + buffer.size());
            smc0Var.m186788f().m147319R(buffer);
        } catch (Throwable th) {
            throw th;
        }
    }
}
