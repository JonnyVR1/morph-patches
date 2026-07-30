package com.p003p1.mobile.android.app;

import android.app.Application;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.p003p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.lang.reflect.Field;
import l.bne0;
import l.hpd0;
import l.rhi;
import l.tpd0;
import l.x8i0;
import l.zpd0;
import p007l.e51;
import p007l.vzd;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public abstract class App {

    /* JADX INFO: renamed from: b */
    public static boolean f1065b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f1066c = false;

    /* JADX INFO: renamed from: d */
    public static App f1067d = null;

    /* JADX INFO: renamed from: e */
    public static Application f1068e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f1069f = false;

    /* JADX INFO: renamed from: g */
    public static long f1070g;

    /* JADX INFO: renamed from: h */
    public static boolean f1071h;

    /* JADX INFO: renamed from: i */
    public static final tpd0 f1072i = new tpd0("application_started", 0);

    /* JADX INFO: renamed from: j */
    public static final long f1073j = 3600000;

    /* JADX INFO: renamed from: k */
    public static final zpd0 f1074k = new zpd0("previous_app_start_uptime_millis", 0L);

    /* JADX INFO: renamed from: l */
    public static boolean f1075l = false;

    /* JADX INFO: renamed from: m */
    public static long f1076m = 0;

    /* JADX INFO: renamed from: n */
    public static long f1077n = 0;

    /* JADX INFO: renamed from: o */
    public static final zpd0 f1078o = new zpd0("aggregate_app_creation_start", 0L);

    /* JADX INFO: renamed from: p */
    public static final tpd0 f1079p = new tpd0("aggregate_app_start_count", 0);

    /* JADX INFO: renamed from: q */
    public static final hpd0 f1080q = new hpd0("foreLivingEnable", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public String f1081a;

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
    public static long m697e() {
        return SystemClock.elapsedRealtime() - f1076m;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m698f() {
        ((Boolean) f1080q.get()).getClass();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m699h() {
        return ((Integer) f1072i.get()).intValue() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m700i() {
        try {
            m707n();
        } catch (Exception e) {
            CrashHelper.g(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m701j() {
        x8i0.a(new Runnable() { // from class: l.cu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2482a.m700i();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m702d() {
    }

    /* JADX INFO: renamed from: g */
    public File m703g(String str) {
        return f1068e.getDatabasePath(str);
    }

    /* JADX INFO: renamed from: k */
    public void m704k(Throwable th) {
        m705l(th, null);
    }

    /* JADX INFO: renamed from: l */
    public void m705l(Throwable th, String str) {
    }

    /* JADX INFO: renamed from: m */
    public void m706m() {
        f1067d = this;
        if (f1069f) {
            m702d();
            if (f1065b) {
                Debug.startMethodTracing(rhi.v() + "/debug.trace");
            }
            m708o();
            f1070g = SQLiteDatabase.uselessStaticMethod();
            long jMaxMemory = Runtime.getRuntime().maxMemory();
            f1070g = jMaxMemory;
            f1071h = jMaxMemory < 73400320;
            tpd0 tpd0Var = f1072i;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            f1076m = SystemClock.elapsedRealtime();
            zpd0 zpd0Var = f1078o;
            if (((Long) zpd0Var.get()).longValue() == 0 || ((Long) zpd0Var.get()).longValue() > System.currentTimeMillis()) {
                zpd0Var.put(Long.valueOf(System.currentTimeMillis()));
            }
            if (System.currentTimeMillis() - ((Long) zpd0Var.get()).longValue() > f1073j) {
                zpd0Var.put(Long.valueOf(System.currentTimeMillis()));
                f1079p.put(0);
            } else {
                tpd0 tpd0Var2 = f1079p;
                tpd0Var2.put(Integer.valueOf(((Integer) tpd0Var2.get()).intValue() + 1));
            }
            long j = f1076m;
            zpd0 zpd0Var2 = f1074k;
            if (j < ((Long) zpd0Var2.get()).longValue()) {
                f1075l = true;
            }
            zpd0Var2.put(Long.valueOf(f1076m));
            e51.m9025H(f1068e, new Runnable() { // from class: l.au0
                @Override // java.lang.Runnable
                public final void run() {
                    App.f1074k.put(Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }, 60000L);
            e51.m9024G(new Runnable() { // from class: l.bu0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2347a.m701j();
                }
            });
            vzd.m11301i();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m707n() {
        ViewConfiguration viewConfiguration;
        try {
            viewConfiguration = ViewConfiguration.get(f1068e);
        } catch (Exception e) {
            CrashHelper.c(e);
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
                CrashHelper.c(e2);
            } catch (NoSuchFieldException e3) {
                CrashHelper.c(e3);
            }
        }
        bne0.b();
    }

    /* JADX INFO: renamed from: o */
    public abstract void m708o();
}
