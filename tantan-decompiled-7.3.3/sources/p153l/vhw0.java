package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.C2135c;
import com.google.android.gms.tasks.Task;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class vhw0 {

    /* JADX INFO: renamed from: e */
    public static volatile int f184195e = 1;

    /* JADX INFO: renamed from: a */
    public final Context f184196a;

    /* JADX INFO: renamed from: b */
    public final Executor f184197b;

    /* JADX INFO: renamed from: c */
    public final Task f184198c;

    /* JADX INFO: renamed from: d */
    public final boolean f184199d;

    public vhw0(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z) {
        this.f184196a = context;
        this.f184197b = executor;
        this.f184198c = task;
        this.f184199d = z;
    }

    /* JADX INFO: renamed from: a */
    public static vhw0 m201299a(@NonNull final Context context, @NonNull Executor executor, boolean z) {
        final sni0 sni0Var = new sni0();
        if (z) {
            executor.execute(new Runnable() { // from class: l.thw0
                @Override // java.lang.Runnable
                public final void run() {
                    sni0Var.m186941c(xjw0.m211270b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: l.uhw0
                @Override // java.lang.Runnable
                public final void run() {
                    sni0Var.m186941c(xjw0.m211271c());
                }
            });
        }
        return new vhw0(context, executor, sni0Var.m186939a(), z);
    }

    /* JADX INFO: renamed from: g */
    public static void m201300g(int i) {
        f184195e = i;
    }

    /* JADX INFO: renamed from: b */
    public final Task m201301b(int i, String str) {
        return m201306h(i, 0L, null, null, null, str);
    }

    /* JADX INFO: renamed from: c */
    public final Task m201302c(int i, long j, Exception exc) {
        return m201306h(i, j, exc, null, null, null);
    }

    /* JADX INFO: renamed from: d */
    public final Task m201303d(int i, long j) {
        return m201306h(i, j, null, null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public final Task m201304e(int i, long j, String str) {
        return m201306h(i, j, null, null, null, str);
    }

    /* JADX INFO: renamed from: f */
    public final Task m201305f(int i, long j, String str, Map map) {
        return m201306h(i, j, null, str, null, null);
    }

    /* JADX INFO: renamed from: h */
    public final Task m201306h(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.f184199d) {
            return this.f184198c.mo15422g(this.f184197b, new s26() { // from class: l.rhw0
                @Override // p153l.s26
                public final Object then(Task task) {
                    return Boolean.valueOf(task.mo15431p());
                }
            });
        }
        Context context = this.f184196a;
        final lyr0 lyr0VarM12664L = C2135c.m12664L();
        lyr0VarM12664L.m156379q(context.getPackageName());
        lyr0VarM12664L.m156383u(j);
        lyr0VarM12664L.m156385w(f184195e);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            lyr0VarM12664L.m156384v(stringWriter.toString());
            lyr0VarM12664L.m156382t(exc.getClass().getName());
        }
        if (str2 != null) {
            lyr0VarM12664L.m156380r(str2);
        }
        if (str != null) {
            lyr0VarM12664L.m156381s(str);
        }
        return this.f184198c.mo15422g(this.f184197b, new s26() { // from class: l.shw0
            @Override // p153l.s26
            public final Object then(Task task) {
                int i2 = vhw0.f184195e;
                if (!task.mo15431p()) {
                    return Boolean.FALSE;
                }
                int i3 = i;
                wjw0 wjw0VarM211272a = ((xjw0) task.mo15427l()).m211272a(((C2135c) lyr0VarM12664L.m185950m()).m12798h());
                wjw0VarM211272a.m206734a(i3);
                wjw0VarM211272a.m206736c();
                return Boolean.TRUE;
            }
        });
    }
}
