package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class p5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public final StackTraceElement[] f150673i;

    public p5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(b4s0Var, "kB6Ls9/mn9iw4biP/HsD3FFR9Vy1jOQ1ljTH52MXzz14qrvyk1QMusJQlJpZNqjT", "pY1LPqV65osROa0AkcabhXHjwpz5nP0HOapDW2QtdtU=", fzr0Var, i, 45);
        this.f150673i = stackTraceElementArr;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.f150673i;
        if (stackTraceElementArr != null) {
            t3s0 t3s0Var = new t3s0((String) this.f192523f.invoke(null, stackTraceElementArr));
            synchronized (this.f192522e) {
                try {
                    this.f192522e.m128325v(t3s0Var.f171951a.longValue());
                    boolean zBooleanValue = t3s0Var.f171952b.booleanValue();
                    fzr0 fzr0Var = this.f192522e;
                    if (zBooleanValue) {
                        fzr0Var.m128296X(true != t3s0Var.f171953c.booleanValue() ? 2 : 1);
                    } else {
                        fzr0Var.m128296X(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
