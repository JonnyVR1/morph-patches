package p149l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public abstract class mq3 {
    /* JADX INFO: renamed from: a */
    public long m155876a(lq3 lq3Var) throws Throwable {
        sf80.m183894p(lq3Var);
        oa5 oa5VarM163282k = oa5.m163282k();
        try {
            long jM160554a = nq3.m160554a((InputStream) oa5VarM163282k.m163283m(mo16365b()), (OutputStream) oa5VarM163282k.m163283m(lq3Var.mo16363a()));
            oa5VarM163282k.close();
            return jM160554a;
        } catch (Throwable th) {
            try {
                throw oa5VarM163282k.m163284n(th);
            } catch (Throwable th2) {
                oa5VarM163282k.close();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InputStream mo16365b() throws IOException;
}
