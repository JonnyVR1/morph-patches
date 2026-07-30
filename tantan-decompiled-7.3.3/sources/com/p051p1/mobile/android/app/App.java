package com.p051p1.mobile.android.app;

import android.app.Application;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.lang.reflect.Field;
import p153l.byd0;
import p153l.ive0;
import p153l.j1e;
import p153l.jxd0;
import p153l.l51;
import p153l.oki;
import p153l.vxd0;
import p153l.xhi0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class App {

    /* JADX INFO: renamed from: b */
    public static boolean f16085b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f16086c = false;

    /* JADX INFO: renamed from: d */
    public static App f16087d = null;

    /* JADX INFO: renamed from: e */
    public static Application f16088e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f16089f = false;

    /* JADX INFO: renamed from: g */
    public static long f16090g;

    /* JADX INFO: renamed from: h */
    public static boolean f16091h;

    /* JADX INFO: renamed from: i */
    public static final vxd0 f16092i = new vxd0("application_started", 0);

    /* JADX INFO: renamed from: j */
    public static final long f16093j = 3600000;

    /* JADX INFO: renamed from: k */
    public static final byd0 f16094k = new byd0("previous_app_start_uptime_millis", 0L);

    /* JADX INFO: renamed from: l */
    public static boolean f16095l = false;

    /* JADX INFO: renamed from: m */
    public static long f16096m = 0;

    /* JADX INFO: renamed from: n */
    public static long f16097n = 0;

    /* JADX INFO: renamed from: o */
    public static final byd0 f16098o = new byd0("aggregate_app_creation_start", 0L);

    /* JADX INFO: renamed from: p */
    public static final vxd0 f16099p = new vxd0("aggregate_app_start_count", 0);

    /* JADX INFO: renamed from: q */
    public static final jxd0 f16100q = new jxd0("foreLivingEnable", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public String f16101a;

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
    public static long m21425e() {
        return SystemClock.elapsedRealtime() - f16096m;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m21426f() {
        f16100q.get().getClass();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m21427h() {
        return f16092i.get().intValue() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m21428i() throws Throwable {
        try {
            mo21435n();
        } catch (Exception e) {
            CrashHelper.m82483g(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m21429j() {
        xhi0.m211045a(new Runnable() { // from class: l.iu0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f116886a.m21428i();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void mo21430d() {
    }

    /* JADX INFO: renamed from: g */
    public File m21431g(String str) {
        return f16088e.getDatabasePath(str);
    }

    /* JADX INFO: renamed from: k */
    public void m21432k(Throwable th) {
        m21433l(th, null);
    }

    /* JADX INFO: renamed from: l */
    public void m21433l(Throwable th, String str) {
    }

    /* JADX INFO: renamed from: m */
    public void mo21434m() {
        f16087d = this;
        if (f16089f) {
            mo21430d();
            if (f16085b) {
                Debug.startMethodTracing(oki.m168034v() + "/debug.trace");
            }
            mo21436o();
            f16090g = SQLiteDatabase.uselessStaticMethod();
            long jMaxMemory = Runtime.getRuntime().maxMemory();
            f16090g = jMaxMemory;
            f16091h = jMaxMemory < 73400320;
            vxd0 vxd0Var = f16092i;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            f16096m = SystemClock.elapsedRealtime();
            byd0 byd0Var = f16098o;
            if (byd0Var.get().longValue() == 0 || byd0Var.get().longValue() > System.currentTimeMillis()) {
                byd0Var.put(Long.valueOf(System.currentTimeMillis()));
            }
            if (System.currentTimeMillis() - byd0Var.get().longValue() > f16093j) {
                byd0Var.put(Long.valueOf(System.currentTimeMillis()));
                f16099p.put(0);
            } else {
                vxd0 vxd0Var2 = f16099p;
                vxd0Var2.put(Integer.valueOf(vxd0Var2.get().intValue() + 1));
            }
            long j = f16096m;
            byd0 byd0Var2 = f16094k;
            if (j < byd0Var2.get().longValue()) {
                f16095l = true;
            }
            byd0Var2.put(Long.valueOf(f16096m));
            l51.m152888H(f16088e, new Runnable() { // from class: l.gu0
                @Override // java.lang.Runnable
                public final void run() {
                    App.f16094k.put(Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }, Constants.ONE_MIN_IN_MILLIS);
            l51.m152887G(new Runnable() { // from class: l.hu0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111612a.m21429j();
                }
            });
            j1e.m143118i();
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo21435n() throws Throwable {
        ViewConfiguration viewConfiguration;
        try {
            viewConfiguration = ViewConfiguration.get(f16088e);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
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
                CrashHelper.m82479c(e2);
            } catch (NoSuchFieldException e3) {
                CrashHelper.m82479c(e3);
            }
        }
        ive0.m142288b();
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo21436o();
}
