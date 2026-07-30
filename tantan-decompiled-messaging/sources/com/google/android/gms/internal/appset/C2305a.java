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
import p149l.lpx0;
import p149l.sei0;
import p149l.yw0;
import p149l.zw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.appset.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2305a implements yw0 {

    /* JADX INFO: renamed from: e */
    @Nullable
    @GuardedBy("InternalAppSetAppSideClientImpl.class")
    public static yw0 f10233e;

    /* JADX INFO: renamed from: a */
    public final Context f10234a;

    /* JADX INFO: renamed from: b */
    public boolean f10235b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f10236c;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f10237d;

    public C2305a(Context context) {
        this.f10235b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f10236c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f10237d = Executors.newSingleThreadExecutor();
        this.f10234a = context;
        if (this.f10235b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new lpx0(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f10235b = true;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static synchronized yw0 m13751d(@NonNull Context context) {
        try {
            Preconditions.checkNotNull(context, "Context must not be null");
            if (f10233e == null) {
                f10233e = new C2305a(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10233e;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static final void m13752f(Context context) {
        if (!m13753g(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (m13753g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    /* JADX INFO: renamed from: g */
    public static final SharedPreferences m13753g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* JADX INFO: renamed from: h */
    public static final void m13754h(Context context) throws zzk {
        if (m13753g(context).edit().putLong("app_set_id_last_used_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new zzk("Failed to store the app set ID last used time.");
    }

    @Override // p149l.yw0
    /* JADX INFO: renamed from: a */
    public final Task<zw0> mo13755a() {
        final sei0 sei0Var = new sei0();
        this.f10237d.execute(new Runnable() { // from class: l.w8x0
            @Override // java.lang.Runnable
            public final void run() {
                this.f185280a.m13757e(sei0Var);
            }
        });
        return sei0Var.m183657a();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final long m13756b() {
        long j = m13753g(this.f10234a).getLong("app_set_id_last_used_time", -1L);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m13757e(sei0 sei0Var) {
        String string = m13753g(this.f10234a).getString("app_set_id", null);
        long jM13756b = m13756b();
        if (string == null || DefaultClock.getInstance().currentTimeMillis() > jM13756b) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f10234a;
                if (!m13753g(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new zzk("Failed to store the app set ID.");
                }
                m13754h(context);
                Context context2 = this.f10234a;
                if (!m13753g(context2).edit().putLong("app_set_id_creation_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new zzk("Failed to store the app set ID creation time.");
                }
            } catch (zzk e) {
                sei0Var.m183658b(e);
                return;
            }
        } else {
            try {
                m13754h(this.f10234a);
            } catch (zzk e2) {
                sei0Var.m183658b(e2);
                return;
            }
        }
        sei0Var.m183659c(new zw0(string, 1));
    }
}
