package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p153l.fx0;
import p153l.gx0;
import p153l.ryx0;
import p153l.sni0;

/* JADX INFO: renamed from: com.google.android.gms.internal.appset.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2328a implements fx0 {

    /* JADX INFO: renamed from: e */
    @Nullable
    @GuardedBy("InternalAppSetAppSideClientImpl.class")
    public static fx0 f10270e;

    /* JADX INFO: renamed from: a */
    public final Context f10271a;

    /* JADX INFO: renamed from: b */
    public boolean f10272b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f10273c;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f10274d;

    public C2328a(Context context) {
        this.f10272b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f10273c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f10274d = Executors.newSingleThreadExecutor();
        this.f10271a = context;
        if (this.f10272b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new ryx0(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f10272b = true;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static synchronized fx0 m13805d(@NonNull Context context) {
        try {
            Preconditions.checkNotNull(context, "Context must not be null");
            if (f10270e == null) {
                f10270e = new C2328a(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10270e;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static final void m13806f(Context context) {
        if (!m13807g(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (m13807g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    /* JADX INFO: renamed from: g */
    public static final SharedPreferences m13807g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* JADX INFO: renamed from: h */
    public static final void m13808h(Context context) throws zzk {
        if (m13807g(context).edit().putLong("app_set_id_last_used_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new zzk("Failed to store the app set ID last used time.");
    }

    @Override // p153l.fx0
    /* JADX INFO: renamed from: a */
    public final Task<gx0> mo13809a() {
        final sni0 sni0Var = new sni0();
        this.f10274d.execute(new Runnable() { // from class: l.cix0
            @Override // java.lang.Runnable
            public final void run() {
                this.f82086a.m13811e(sni0Var);
            }
        });
        return sni0Var.m186939a();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final long m13810b() {
        long j = m13807g(this.f10271a).getLong("app_set_id_last_used_time", -1L);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m13811e(sni0 sni0Var) {
        String string = m13807g(this.f10271a).getString("app_set_id", null);
        long jM13810b = m13810b();
        if (string == null || DefaultClock.getInstance().currentTimeMillis() > jM13810b) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f10271a;
                if (!m13807g(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new zzk("Failed to store the app set ID.");
                }
                m13808h(context);
                Context context2 = this.f10271a;
                if (!m13807g(context2).edit().putLong("app_set_id_creation_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new zzk("Failed to store the app set ID creation time.");
                }
            } catch (zzk e) {
                sni0Var.m186940b(e);
                return;
            }
        } else {
            try {
                m13808h(this.f10271a);
            } catch (zzk e2) {
                sni0Var.m186940b(e2);
                return;
            }
        }
        sni0Var.m186941c(new gx0(string, 1));
    }
}
