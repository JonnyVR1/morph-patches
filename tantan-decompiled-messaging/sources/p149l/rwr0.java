package p149l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rwr0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final String f161367a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    public final vur0 f161368b;

    /* JADX INFO: renamed from: c */
    public final String f161369c;

    /* JADX INFO: renamed from: d */
    public final String f161370d;

    /* JADX INFO: renamed from: e */
    public final zpr0 f161371e;

    /* JADX INFO: renamed from: f */
    public Method f161372f;

    /* JADX INFO: renamed from: g */
    public final int f161373g;

    /* JADX INFO: renamed from: h */
    public final int f161374h;

    public rwr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        this.f161368b = vur0Var;
        this.f161369c = str;
        this.f161370d = str2;
        this.f161371e = zpr0Var;
        this.f161373g = i;
        this.f161374h = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo99305a() throws IllegalAccessException, InvocationTargetException;

    /* JADX INFO: renamed from: b */
    public Void mo181444b() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            Method methodM200108j = this.f161368b.m200108j(this.f161369c, this.f161370d);
            this.f161372f = methodM200108j;
            if (methodM200108j == null) {
                return null;
            }
            mo99305a();
            ktr0 ktr0VarM200103d = this.f161368b.m200103d();
            if (ktr0VarM200103d == null || (i = this.f161373g) == Integer.MIN_VALUE) {
                return null;
            }
            ktr0VarM200103d.m147219c(this.f161374h, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        mo181444b();
        return null;
    }
}
