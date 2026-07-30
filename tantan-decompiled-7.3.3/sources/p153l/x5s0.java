package p153l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x5s0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final String f192518a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    public final b4s0 f192519b;

    /* JADX INFO: renamed from: c */
    public final String f192520c;

    /* JADX INFO: renamed from: d */
    public final String f192521d;

    /* JADX INFO: renamed from: e */
    public final fzr0 f192522e;

    /* JADX INFO: renamed from: f */
    public Method f192523f;

    /* JADX INFO: renamed from: g */
    public final int f192524g;

    /* JADX INFO: renamed from: h */
    public final int f192525h;

    public x5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        this.f192519b = b4s0Var;
        this.f192520c = str;
        this.f192521d = str2;
        this.f192522e = fzr0Var;
        this.f192524g = i;
        this.f192525h = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo96251a() throws IllegalAccessException, InvocationTargetException;

    /* JADX INFO: renamed from: b */
    public Void mo102627b() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            Method methodM102524j = this.f192519b.m102524j(this.f192520c, this.f192521d);
            this.f192523f = methodM102524j;
            if (methodM102524j == null) {
                return null;
            }
            mo96251a();
            q2s0 q2s0VarM102519d = this.f192519b.m102519d();
            if (q2s0VarM102519d == null || (i = this.f192524g) == Integer.MIN_VALUE) {
                return null;
            }
            q2s0VarM102519d.m175096c(this.f192525h, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        mo102627b();
        return null;
    }
}
