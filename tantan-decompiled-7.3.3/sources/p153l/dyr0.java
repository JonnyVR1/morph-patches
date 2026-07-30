package p153l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class dyr0 extends bpx0 implements Closeable {

    /* JADX INFO: renamed from: i */
    public static final ipx0 f91283i = ipx0.m141544b(dyr0.class);

    public dyr0(cpx0 cpx0Var, cyr0 cyr0Var) throws IOException {
        m105857n(cpx0Var, cpx0Var.zzc(), cyr0Var);
    }

    @Override // p153l.bpx0
    public final String toString() {
        String string = this.f77833b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // p153l.bpx0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
