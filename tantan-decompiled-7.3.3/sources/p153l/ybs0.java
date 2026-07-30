package p153l;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class ybs0 extends PushbackInputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zbs0 f198360a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybs0(zbs0 zbs0Var, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f198360a = zbs0Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        bcs0.m103548e(this.f198360a.f203702c);
        super.close();
    }
}
