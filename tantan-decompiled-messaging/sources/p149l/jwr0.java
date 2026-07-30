package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class jwr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public final StackTraceElement[] f120107i;

    public jwr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(vur0Var, "kB6Ls9/mn9iw4biP/HsD3FFR9Vy1jOQ1ljTH52MXzz14qrvyk1QMusJQlJpZNqjT", "pY1LPqV65osROa0AkcabhXHjwpz5nP0HOapDW2QtdtU=", zpr0Var, i, 45);
        this.f120107i = stackTraceElementArr;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.f120107i;
        if (stackTraceElementArr != null) {
            nur0 nur0Var = new nur0((String) this.f161372f.invoke(null, stackTraceElementArr));
            synchronized (this.f161371e) {
                try {
                    this.f161371e.m219790v(nur0Var.f140647a.longValue());
                    boolean zBooleanValue = nur0Var.f140648b.booleanValue();
                    zpr0 zpr0Var = this.f161371e;
                    if (zBooleanValue) {
                        zpr0Var.m219761X(true != nur0Var.f140649c.booleanValue() ? 2 : 1);
                    } else {
                        zpr0Var.m219761X(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
