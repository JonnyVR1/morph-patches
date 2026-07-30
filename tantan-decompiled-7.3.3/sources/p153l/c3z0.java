package p153l;

import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;

/* JADX INFO: loaded from: classes7.dex */
public final class c3z0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ joi0 f79654a;

    public /* synthetic */ c3z0(joi0 joi0Var, n1z0 n1z0Var) {
        this.f79654a = joi0Var;
        Preconditions.checkState(((Thread) joi0Var.f122032d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f79654a.f122032d.set(null);
        this.f79654a.m146467e();
    }
}
