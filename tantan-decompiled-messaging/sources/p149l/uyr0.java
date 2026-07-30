package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class uyr0 {

    /* JADX INFO: renamed from: a */
    public final Object f178903a = new Object();

    /* JADX INFO: renamed from: b */
    public syr0 f178904b = null;

    /* JADX INFO: renamed from: c */
    public boolean f178905c = false;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Activity m196343a() {
        synchronized (this.f178903a) {
            try {
                syr0 syr0Var = this.f178904b;
                if (syr0Var == null) {
                    return null;
                }
                return syr0Var.m186722a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Context m196344b() {
        synchronized (this.f178903a) {
            try {
                syr0 syr0Var = this.f178904b;
                if (syr0Var == null) {
                    return null;
                }
                return syr0Var.m186723b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m196345c(tyr0 tyr0Var) {
        synchronized (this.f178903a) {
            try {
                if (this.f178904b == null) {
                    this.f178904b = new syr0();
                }
                this.f178904b.m186724f(tyr0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m196346d(Context context) {
        synchronized (this.f178903a) {
            try {
                if (!this.f178905c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        x2t0.m206869g("Can not cast Context to Application");
                        return;
                    }
                    if (this.f178904b == null) {
                        this.f178904b = new syr0();
                    }
                    this.f178904b.m186725g(application, context);
                    this.f178905c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m196347e(tyr0 tyr0Var) {
        synchronized (this.f178903a) {
            try {
                syr0 syr0Var = this.f178904b;
                if (syr0Var == null) {
                    return;
                }
                syr0Var.m186726h(tyr0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
