package p149l;

import com.google.android.gms.internal.measurement.C2343r0;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class sty0 extends ggr0 {

    /* JADX INFO: renamed from: c */
    public final Callable<Object> f166401c;

    public sty0(String str, Callable<Object> callable) {
        super(str);
        this.f166401c = callable;
    }

    @Override // p149l.ggr0
    /* JADX INFO: renamed from: d */
    public final ymr0 mo108642d(a9x0 a9x0Var, List<ymr0> list) {
        try {
            return C2343r0.m14279b(this.f166401c.call());
        } catch (Exception unused) {
            return ymr0.f199051w0;
        }
    }
}
