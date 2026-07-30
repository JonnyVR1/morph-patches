package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.C2112c;
import com.google.android.gms.tasks.Task;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class p8w0 {

    /* JADX INFO: renamed from: e */
    public static volatile int f147640e = 1;

    /* JADX INFO: renamed from: a */
    public final Context f147641a;

    /* JADX INFO: renamed from: b */
    public final Executor f147642b;

    /* JADX INFO: renamed from: c */
    public final Task f147643c;

    /* JADX INFO: renamed from: d */
    public final boolean f147644d;

    public p8w0(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z) {
        this.f147641a = context;
        this.f147642b = executor;
        this.f147643c = task;
        this.f147644d = z;
    }

    /* JADX INFO: renamed from: a */
    public static p8w0 m167824a(@NonNull final Context context, @NonNull Executor executor, boolean z) {
        final sei0 sei0Var = new sei0();
        if (z) {
            executor.execute(new Runnable() { // from class: l.n8w0
                @Override // java.lang.Runnable
                public final void run() {
                    sei0Var.m183659c(raw0.m178538b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: l.o8w0
                @Override // java.lang.Runnable
                public final void run() {
                    sei0Var.m183659c(raw0.m178539c());
                }
            });
        }
        return new p8w0(context, executor, sei0Var.m183657a(), z);
    }

    /* JADX INFO: renamed from: g */
    public static void m167825g(int i) {
        f147640e = i;
    }

    /* JADX INFO: renamed from: b */
    public final Task m167826b(int i, String str) {
        return m167831h(i, 0L, null, null, null, str);
    }

    /* JADX INFO: renamed from: c */
    public final Task m167827c(int i, long j, Exception exc) {
        return m167831h(i, j, exc, null, null, null);
    }

    /* JADX INFO: renamed from: d */
    public final Task m167828d(int i, long j) {
        return m167831h(i, j, null, null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public final Task m167829e(int i, long j, String str) {
        return m167831h(i, j, null, null, null, str);
    }

    /* JADX INFO: renamed from: f */
    public final Task m167830f(int i, long j, String str, Map map) {
        return m167831h(i, j, null, str, null, null);
    }

    /* JADX INFO: renamed from: h */
    public final Task m167831h(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.f147644d) {
            return this.f147643c.mo15368g(this.f147642b, new n16() { // from class: l.l8w0
                @Override // p149l.n16
                public final Object then(Task task) {
                    return Boolean.valueOf(task.mo15377p());
                }
            });
        }
        Context context = this.f147641a;
        final fpr0 fpr0VarM12610L = C2112c.m12610L();
        fpr0VarM12610L.m122639q(context.getPackageName());
        fpr0VarM12610L.m122643u(j);
        fpr0VarM12610L.m122645w(f147640e);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            fpr0VarM12610L.m122644v(stringWriter.toString());
            fpr0VarM12610L.m122642t(exc.getClass().getName());
        }
        if (str2 != null) {
            fpr0VarM12610L.m122640r(str2);
        }
        if (str != null) {
            fpr0VarM12610L.m122641s(str);
        }
        return this.f147643c.mo15368g(this.f147642b, new n16() { // from class: l.m8w0
            @Override // p149l.n16
            public final Object then(Task task) {
                int i2 = p8w0.f147640e;
                if (!task.mo15377p()) {
                    return Boolean.FALSE;
                }
                int i3 = i;
                qaw0 qaw0VarM178540a = ((raw0) task.mo15373l()).m178540a(((C2112c) fpr0VarM12610L.m153521m()).m12744h());
                qaw0VarM178540a.m173782a(i3);
                qaw0VarM178540a.m173784c();
                return Boolean.TRUE;
            }
        });
    }
}
