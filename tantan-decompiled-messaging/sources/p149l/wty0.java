package p149l;

import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;

/* JADX INFO: loaded from: classes7.dex */
public final class wty0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jfi0 f188068a;

    public /* synthetic */ wty0(jfi0 jfi0Var, hsy0 hsy0Var) {
        this.f188068a = jfi0Var;
        Preconditions.checkState(((Thread) jfi0Var.f117669d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f188068a.f117669d.set(null);
        this.f188068a.m141187e();
    }
}
