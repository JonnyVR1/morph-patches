package p149l;

import android.app.Application;
import android.content.Context;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g0r0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("AppComponent.class")
    public static g0r0 f100078a;

    /* JADX INFO: renamed from: a */
    public static g0r0 m123998a(Context context) {
        g0r0 g0r0Var;
        synchronized (g0r0.class) {
            try {
                if (f100078a == null) {
                    z9r0 z9r0Var = new z9r0(null);
                    z9r0Var.m217683b((Application) context.getApplicationContext());
                    f100078a = z9r0Var.m217682a();
                }
                g0r0Var = f100078a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g0r0Var;
    }

    /* JADX INFO: renamed from: b */
    public abstract opx0 mo123999b();

    /* JADX INFO: renamed from: c */
    public abstract ics0 mo124000c();
}
