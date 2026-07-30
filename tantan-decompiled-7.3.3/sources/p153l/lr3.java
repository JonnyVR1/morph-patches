package p153l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lr3 {
    /* JADX INFO: renamed from: a */
    public long m155577a(kr3 kr3Var) throws Throwable {
        xn80.m212111p(kr3Var);
        ob5 ob5VarM167021k = ob5.m167021k();
        try {
            long jM159619a = mr3.m159619a((InputStream) ob5VarM167021k.m167022m(mo16420b()), (OutputStream) ob5VarM167021k.m167022m(kr3Var.mo16418a()));
            ob5VarM167021k.close();
            return jM159619a;
        } catch (Throwable th) {
            try {
                throw ob5VarM167021k.m167023n(th);
            } catch (Throwable th2) {
                ob5VarM167021k.close();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InputStream mo16420b() throws IOException;
}
