package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a8s0 {

    /* JADX INFO: renamed from: a */
    public final Object f68944a = new Object();

    /* JADX INFO: renamed from: b */
    public y7s0 f68945b = null;

    /* JADX INFO: renamed from: c */
    public boolean f68946c = false;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Activity m96483a() {
        synchronized (this.f68944a) {
            try {
                y7s0 y7s0Var = this.f68945b;
                if (y7s0Var == null) {
                    return null;
                }
                return y7s0Var.m214598a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Context m96484b() {
        synchronized (this.f68944a) {
            try {
                y7s0 y7s0Var = this.f68945b;
                if (y7s0Var == null) {
                    return null;
                }
                return y7s0Var.m214599b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m96485c(z7s0 z7s0Var) {
        synchronized (this.f68944a) {
            try {
                if (this.f68945b == null) {
                    this.f68945b = new y7s0();
                }
                this.f68945b.m214600f(z7s0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m96486d(Context context) {
        synchronized (this.f68944a) {
            try {
                if (!this.f68946c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        dct0.m115298g("Can not cast Context to Application");
                        return;
                    }
                    if (this.f68945b == null) {
                        this.f68945b = new y7s0();
                    }
                    this.f68945b.m214601g(application, context);
                    this.f68946c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m96487e(z7s0 z7s0Var) {
        synchronized (this.f68944a) {
            try {
                y7s0 y7s0Var = this.f68945b;
                if (y7s0Var == null) {
                    return;
                }
                y7s0Var.m214602h(z7s0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
