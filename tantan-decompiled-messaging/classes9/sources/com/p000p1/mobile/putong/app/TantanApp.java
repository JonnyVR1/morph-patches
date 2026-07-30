package com.p000p1.mobile.putong.app;

import android.app.Application;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.appcompat.app.b;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import java.io.File;
import l.br2;
import l.e51;
import l.edk0;
import l.epd0;
import l.f7r;
import l.g30;
import l.g50;
import l.hpd0;
import l.ipd0;
import l.jj10;
import l.lsi0;
import l.osi0;
import l.w85;
import l.zjw;
import p006l.au2;
import p006l.e1i0;
import p006l.k5h0;
import p006l.klp0;
import p006l.mr4;
import p006l.nuw;
import p006l.qib0;
import p006l.r500;
import p006l.ulp0;
import p006l.woi0;
import p006l.ydb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TantanApp extends Application {

    /* JADX INFO: renamed from: b */
    public static qib0 f1168b;

    /* JADX INFO: renamed from: c */
    public static ydb0 f1169c;

    /* JADX INFO: renamed from: f */
    public static long f1172f;

    /* JADX INFO: renamed from: g */
    public static boolean f1173g;

    /* JADX INFO: renamed from: h */
    public static long f1174h;

    /* JADX INFO: renamed from: i */
    public static e1i0 f1175i;

    /* JADX INFO: renamed from: a */
    public volatile Resources f1180a;

    /* JADX INFO: renamed from: d */
    public static final ipd0 f1170d = new ipd0(App.e, "putongUserMeSaved", Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public static final epd0 f1171e = new epd0(App.e, "putongAuthdata", true, "putongPref");

    /* JADX INFO: renamed from: j */
    public static hpd0 f1176j = new hpd0(App.e, "first_cold_launch_time_record_" + qib0.f19821s, Boolean.TRUE);

    /* JADX INFO: renamed from: k */
    public static boolean f1177k = false;

    /* JADX INFO: renamed from: l */
    public static Boolean f1178l = null;

    /* JADX INFO: renamed from: m */
    public static long f1179m = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.TantanApp$a */
    public class C0123a implements MMKV.LibLoader {
        public C0123a() {
        }

        public void loadLibrary(String str) {
            System.loadLibrary(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.TantanApp$b */
    public class C0124b implements osi0.c {
        public C0124b() {
        }

        /* JADX INFO: renamed from: a */
        public void m1559a(int i) {
            lsi0.w(i);
        }

        /* JADX INFO: renamed from: b */
        public void m1560b(String str) {
            lsi0.y(str);
        }

        /* JADX INFO: renamed from: c */
        public void m1561c(String str) {
            lsi0.j(str);
        }

        /* JADX INFO: renamed from: d */
        public void m1562d(int i) {
            lsi0.h(i);
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f1172f = SystemClock.elapsedRealtime();
        jj10.k(context);
        qib0.f19808f0 = context.getResources().getConfiguration().mcc;
    }

    /* JADX INFO: renamed from: d */
    public final void m1558d() {
        osi0.h(new C0124b());
        klp0.m18189e(this);
        new woi0().m26560e();
        if (!App.f) {
            r500.m22641n().m22645o(App.e);
            return;
        }
        f1175i = new e1i0(App.e);
        mr4.m19500c();
        try {
            ulp0.m25272b(this);
        } catch (Throwable th) {
            CrashHelper.g(th);
        }
        qib0 qib0Var = new qib0();
        f1168b = qib0Var;
        qib0Var.m22201m();
        k5h0.m17941a();
        boolean zBooleanValue = ((Boolean) f1176j.get()).booleanValue();
        f1173g = zBooleanValue;
        if (zBooleanValue) {
            f1176j.put(Boolean.FALSE);
        }
        f1174h = SystemClock.elapsedRealtime();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (!IntlCountryCodeController.m21v()) {
            return super.getResources();
        }
        if (this.f1180a == null) {
            synchronized (this) {
                try {
                    if (this.f1180a == null) {
                        this.f1180a = new nuw(super.getResources());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f1180a;
    }

    @Override // android.app.Application
    public void onCreate() {
        String absolutePath;
        C0123a c0123a;
        try {
            b.D(1);
        } catch (Exception unused) {
        }
        g50.b(this);
        super.onCreate();
        App.e = this;
        App.f = e51.C();
        w85.INSTANCE.j(this);
        if (App.f) {
            f1179m = SystemClock.elapsedRealtime();
            f7r.a();
        }
        try {
            try {
                edk0.a(this, false, false);
                if (TextUtils.isEmpty(MMKV.getRootDir())) {
                    absolutePath = new File(getFilesDir().getParent(), "tantan_save_value_dir").getAbsolutePath();
                    c0123a = new C0123a();
                    MMKV.initialize(this, absolutePath, c0123a);
                }
            } catch (Throwable th) {
                CrashHelper.g(th);
            }
        } catch (Throwable th2) {
            try {
                CrashHelper.g(th2);
                if (TextUtils.isEmpty(MMKV.getRootDir())) {
                    absolutePath = new File(getFilesDir().getParent(), "tantan_save_value_dir").getAbsolutePath();
                    c0123a = new C0123a();
                }
            } catch (Throwable th3) {
                if (TextUtils.isEmpty(MMKV.getRootDir())) {
                    try {
                        MMKV.initialize(this, new File(getFilesDir().getParent(), "tantan_save_value_dir").getAbsolutePath(), new C0123a());
                    } catch (Throwable th4) {
                        CrashHelper.g(th4);
                    }
                }
                throw th3;
            }
        }
        try {
            br2.b().d(this);
        } catch (Throwable th5) {
            CrashHelper.g(th5);
        }
        try {
            zjw.b(this);
        } catch (Throwable th6) {
            CrashHelper.g(th6);
        }
        if (App.f) {
            try {
                au2.m12231p(this);
            } catch (Throwable th7) {
                CrashHelper.g(th7);
            }
            CrashHelper.b(new g30() { // from class: l.l1i0
                /* JADX INFO: renamed from: a */
                public final void m18492a(Object obj, Object obj2, Object obj3) {
                    au2.m12238w((Throwable) obj);
                }
            }, new g30() { // from class: l.m1i0
                /* JADX INFO: renamed from: a */
                public final void m19095a(Object obj, Object obj2, Object obj3) {
                    au2.m12238w((Throwable) obj);
                }
            });
            try {
                FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(TextUtils.equals(br2.b().c("sp_protocal", "https"), "https"));
            } catch (Throwable th8) {
                CrashHelper.g(th8);
            }
        }
        try {
            m1558d();
        } catch (Exception e) {
            new Handler().postDelayed(new Runnable() { // from class: l.n1i0
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    TantanApp.m1557c(e);
                }
            }, 1000L);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        qib0 qib0Var = f1168b;
        if (qib0Var != null) {
            qib0Var.m22196P0();
        }
        super.onLowMemory();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        qib0 qib0Var = f1168b;
        if (qib0Var != null) {
            qib0Var.m22197Q0(i);
        }
        super.onTrimMemory(i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1557c(Exception exc) throws Exception {
        throw exc;
    }
}
