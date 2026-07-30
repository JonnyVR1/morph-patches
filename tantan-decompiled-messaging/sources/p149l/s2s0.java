package p149l;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class s2s0 extends PushbackInputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t2s0 f162002a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2s0(t2s0 t2s0Var, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f162002a = t2s0Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        v2s0.m196819e(this.f162002a.f167548c);
        super.close();
    }
}
