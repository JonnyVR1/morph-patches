package p153l;

import android.app.Application;
import android.content.Context;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m9r0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("AppComponent.class")
    public static m9r0 f135433a;

    /* JADX INFO: renamed from: a */
    public static m9r0 m157594a(Context context) {
        m9r0 m9r0Var;
        synchronized (m9r0.class) {
            try {
                if (f135433a == null) {
                    fjr0 fjr0Var = new fjr0(null);
                    fjr0Var.m125915b((Application) context.getApplicationContext());
                    f135433a = fjr0Var.m125914a();
                }
                m9r0Var = f135433a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m9r0Var;
    }

    /* JADX INFO: renamed from: b */
    public abstract uyx0 mo157595b();

    /* JADX INFO: renamed from: c */
    public abstract ols0 mo157596c();
}
