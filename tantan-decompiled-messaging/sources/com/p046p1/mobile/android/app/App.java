package com.p046p1.mobile.android.app;

import android.app.Application;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.lang.reflect.Field;
import p149l.bne0;
import p149l.e51;
import p149l.hpd0;
import p149l.rhi;
import p149l.tpd0;
import p149l.vzd;
import p149l.x8i0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class App {

    /* JADX INFO: renamed from: b */
    public static boolean f15366b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f15367c = false;

    /* JADX INFO: renamed from: d */
    public static App f15368d = null;

    /* JADX INFO: renamed from: e */
    public static Application f15369e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f15370f = false;

    /* JADX INFO: renamed from: g */
    public static long f15371g;

    /* JADX INFO: renamed from: h */
    public static boolean f15372h;

    /* JADX INFO: renamed from: i */
    public static final tpd0 f15373i = new tpd0("application_started", 0);

    /* JADX INFO: renamed from: j */
    public static final long f15374j = 3600000;

    /* JADX INFO: renamed from: k */
    public static final zpd0 f15375k = new zpd0("previous_app_start_uptime_millis", 0L);

    /* JADX INFO: renamed from: l */
    public static boolean f15376l = false;

    /* JADX INFO: renamed from: m */
    public static long f15377m = 0;

    /* JADX INFO: renamed from: n */
    public static long f15378n = 0;

    /* JADX INFO: renamed from: o */
    public static final zpd0 f15379o = new zpd0("aggregate_app_creation_start", 0L);

    /* JADX INFO: renamed from: p */
    public static final tpd0 f15380p = new tpd0("aggregate_app_start_count", 0);

    /* JADX INFO: renamed from: q */
    public static final hpd0 f15381q = new hpd0("foreLivingEnable", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public String f15382a;

    public static class HandledGlobally extends Exception {
        private final Throwable excep;

        public HandledGlobally(Throwable th) {
            super("handled globally:\n" + th.getMessage());
            this.excep = th;
        }

        public Throwable getThrowable() {
            return this.excep;
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m20426e() {
        return SystemClock.elapsedRealtime() - f15377m;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m20427f() {
        f15381q.get().getClass();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20428h() {
        return f15373i.get().intValue() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m20429i() throws Throwable {
        try {
            mo20436n();
        } catch (Exception e) {
            CrashHelper.m81300g(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m20430j() {
        x8i0.m207417a(new Runnable() { // from class: l.cu0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f82518a.m20429i();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void mo20431d() {
    }

    /* JADX INFO: renamed from: g */
    public File m20432g(String str) {
        return f15369e.getDatabasePath(str);
    }

    /* JADX INFO: renamed from: k */
    public void m20433k(Throwable th) {
        m20434l(th, null);
    }

    /* JADX INFO: renamed from: l */
    public void m20434l(Throwable th, String str) {
    }

    /* JADX INFO: renamed from: m */
    public void mo20435m() {
        f15368d = this;
        if (f15370f) {
            mo20431d();
            if (f15366b) {
                Debug.startMethodTracing(rhi.m179378v() + "/debug.trace");
            }
            mo20437o();
            f15371g = SQLiteDatabase.uselessStaticMethod();
            long jMaxMemory = Runtime.getRuntime().maxMemory();
            f15371g = jMaxMemory;
            f15372h = jMaxMemory < 73400320;
            tpd0 tpd0Var = f15373i;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            f15377m = SystemClock.elapsedRealtime();
            zpd0 zpd0Var = f15379o;
            if (zpd0Var.get().longValue() == 0 || zpd0Var.get().longValue() > System.currentTimeMillis()) {
                zpd0Var.put(Long.valueOf(System.currentTimeMillis()));
            }
            if (System.currentTimeMillis() - zpd0Var.get().longValue() > f15374j) {
                zpd0Var.put(Long.valueOf(System.currentTimeMillis()));
                f15380p.put(0);
            } else {
                tpd0 tpd0Var2 = f15380p;
                tpd0Var2.put(Integer.valueOf(tpd0Var2.get().intValue() + 1));
            }
            long j = f15377m;
            zpd0 zpd0Var2 = f15375k;
            if (j < zpd0Var2.get().longValue()) {
                f15376l = true;
            }
            zpd0Var2.put(Long.valueOf(f15377m));
            e51.m114743H(f15369e, new Runnable() { // from class: l.au0
                @Override // java.lang.Runnable
                public final void run() {
                    App.f15375k.put(Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }, Constants.ONE_MIN_IN_MILLIS);
            e51.m114742G(new Runnable() { // from class: l.bu0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77274a.m20430j();
                }
            });
            vzd.m200742i();
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo20436n() throws Throwable {
        ViewConfiguration viewConfiguration;
        try {
            viewConfiguration = ViewConfiguration.get(f15369e);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            viewConfiguration = null;
        }
        if (Build.VERSION.SDK_INT < 29 && viewConfiguration != null && viewConfiguration.hasPermanentMenuKey()) {
            try {
                Field declaredField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    declaredField.setBoolean(viewConfiguration, false);
                }
            } catch (IllegalAccessException e2) {
                CrashHelper.m81296c(e2);
            } catch (NoSuchFieldException e3) {
                CrashHelper.m81296c(e3);
            }
        }
        bne0.m102773b();
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo20437o();
}
