package p149l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class xor0 extends vfx0 implements Closeable {

    /* JADX INFO: renamed from: i */
    public static final cgx0 f193879i = cgx0.m106844b(xor0.class);

    public xor0(wfx0 wfx0Var, wor0 wor0Var) throws IOException {
        m198300n(wfx0Var, wfx0Var.zzc(), wor0Var);
    }

    @Override // p149l.vfx0
    public final String toString() {
        String string = this.f181330b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // p149l.vfx0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
