package com.p046p1.mobile.putong.app;

import android.app.Application;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.appcompat.app.AbstractC0075b;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import java.io.File;
import p149l.au2;
import p149l.br2;
import p149l.e1i0;
import p149l.e51;
import p149l.edk0;
import p149l.epd0;
import p149l.f7r;
import p149l.fpd0;
import p149l.g30;
import p149l.g50;
import p149l.hpd0;
import p149l.ipd0;
import p149l.jj10;
import p149l.k5h0;
import p149l.klp0;
import p149l.lsi0;
import p149l.mr4;
import p149l.nuw;
import p149l.osi0;
import p149l.qib0;
import p149l.r500;
import p149l.ulp0;
import p149l.w85;
import p149l.woi0;
import p149l.ydb0;
import p149l.zjw;

/* JADX INFO: loaded from: classes9.dex */
public class TantanApp extends Application {

    /* JADX INFO: renamed from: b */
    public static qib0 f17179b;

    /* JADX INFO: renamed from: c */
    public static ydb0 f17180c;

    /* JADX INFO: renamed from: f */
    public static long f17183f;

    /* JADX INFO: renamed from: g */
    public static boolean f17184g;

    /* JADX INFO: renamed from: h */
    public static long f17185h;

    /* JADX INFO: renamed from: i */
    public static e1i0 f17186i;

    /* JADX INFO: renamed from: a */
    public volatile Resources f17191a;

    /* JADX INFO: renamed from: d */
    public static final ipd0 f17181d = new ipd0(App.f15369e, "putongUserMeSaved", Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public static final epd0 f17182e = new epd0(App.f15369e, "putongAuthdata", true, "putongPref");

    /* JADX INFO: renamed from: j */
    public static hpd0 f17187j = new hpd0(App.f15369e, "first_cold_launch_time_record_" + qib0.f154730s, Boolean.TRUE);

    /* JADX INFO: renamed from: k */
    public static boolean f17188k = false;

    /* JADX INFO: renamed from: l */
    public static Boolean f17189l = null;

    /* JADX INFO: renamed from: m */
    public static long f17190m = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.TantanApp$a */
    public class C4697a implements MMKV.LibLoader {
        public C4697a() {
        }

        @Override // com.tencent.mmkv.MMKV.LibLoader
        public void loadLibrary(String str) {
            System.loadLibrary(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.TantanApp$b */
    public class C4698b implements osi0.InterfaceC19015c {
        public C4698b() {
        }

        @Override // p149l.osi0.InterfaceC19015c
        /* JADX INFO: renamed from: a */
        public void mo29649a(int i) {
            lsi0.m151593w(i);
        }

        @Override // p149l.osi0.InterfaceC19015c
        /* JADX INFO: renamed from: b */
        public void mo29650b(String str) {
            lsi0.m151595y(str);
        }

        @Override // p149l.osi0.InterfaceC19015c
        /* JADX INFO: renamed from: c */
        public void mo29651c(String str) {
            lsi0.m151580j(str);
        }

        @Override // p149l.osi0.InterfaceC19015c
        /* JADX INFO: renamed from: d */
        public void mo29652d(int i) {
            lsi0.m151578h(i);
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f17183f = SystemClock.elapsedRealtime();
        jj10.m141730k(context);
        qib0.f154717f0 = context.getResources().getConfiguration().mcc;
    }

    /* JADX INFO: renamed from: d */
    public final void m29648d() {
        osi0.m165784h(new C4698b());
        klp0.m146426e(this);
        new woi0().m204818e();
        if (!App.f15370f) {
            r500.m177876n().m177877o(App.f15369e);
            return;
        }
        f17186i = new e1i0(App.f15369e);
        mr4.m156016c();
        try {
            ulp0.m194256b(this);
        } catch (Throwable th) {
            CrashHelper.m81300g(th);
        }
        qib0 qib0Var = new qib0();
        f17179b = qib0Var;
        qib0Var.mo20435m();
        k5h0.m144540a();
        boolean zBooleanValue = f17187j.get().booleanValue();
        f17184g = zBooleanValue;
        if (zBooleanValue) {
            f17187j.put(Boolean.FALSE);
        }
        f17185h = SystemClock.elapsedRealtime();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (!IntlCountryCodeController.m28126v()) {
            return super.getResources();
        }
        if (this.f17191a == null) {
            synchronized (this) {
                try {
                    if (this.f17191a == null) {
                        this.f17191a = new nuw(super.getResources());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f17191a;
    }

    @Override // android.app.Application
    public void onCreate() {
        String absolutePath;
        C4697a c4697a;
        try {
            AbstractC0075b.m359D(1);
        } catch (Exception unused) {
        }
        g50.m124432b(this);
        super.onCreate();
        App.f15369e = this;
        App.f15370f = e51.m114738C();
        w85.INSTANCE.m202143j(this);
        if (App.f15370f) {
            f17190m = SystemClock.elapsedRealtime();
            f7r.m119817a();
        }
        try {
            try {
                edk0.m115811a(this, false, false);
                if (TextUtils.isEmpty(MMKV.getRootDir())) {
                    absolutePath = new File(getFilesDir().getParent(), fpd0.MMKV_DIR).getAbsolutePath();
                    c4697a = new C4697a();
                    MMKV.initialize(this, absolutePath, c4697a);
                }
            } catch (Throwable th) {
                CrashHelper.m81300g(th);
            }
        } catch (Throwable th2) {
            try {
                CrashHelper.m81300g(th2);
                if (TextUtils.isEmpty(MMKV.getRootDir())) {
                    absolutePath = new File(getFilesDir().getParent(), fpd0.MMKV_DIR).getAbsolutePath();
                    c4697a = new C4697a();
                }
            } catch (Throwable th3) {
                if (TextUtils.isEmpty(MMKV.getRootDir())) {
                    try {
                        MMKV.initialize(this, new File(getFilesDir().getParent(), fpd0.MMKV_DIR).getAbsolutePath(), new C4697a());
                    } catch (Throwable th4) {
                        CrashHelper.m81300g(th4);
                    }
                }
                throw th3;
            }
        }
        try {
            br2.m103433b().m103436d(this);
        } catch (Throwable th5) {
            CrashHelper.m81300g(th5);
        }
        try {
            zjw.m219152b(this);
        } catch (Throwable th6) {
            CrashHelper.m81300g(th6);
        }
        if (App.f15370f) {
            try {
                au2.m98928p(this);
            } catch (Throwable th7) {
                CrashHelper.m81300g(th7);
            }
            CrashHelper.m81295b(new g30() { // from class: l.l1i0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    au2.m98935w((Throwable) obj);
                }
            }, new g30() { // from class: l.m1i0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    au2.m98935w((Throwable) obj);
                }
            });
            try {
                FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(TextUtils.equals(br2.m103433b().m103435c("sp_protocal", "https"), "https"));
            } catch (Throwable th8) {
                CrashHelper.m81300g(th8);
            }
        }
        try {
            m29648d();
        } catch (Exception e) {
            new Handler().postDelayed(new Runnable() { // from class: l.n1i0
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    TantanApp.m29647c(e);
                }
            }, 1000L);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        qib0 qib0Var = f17179b;
        if (qib0Var != null) {
            qib0Var.m174852P0();
        }
        super.onLowMemory();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        qib0 qib0Var = f17179b;
        if (qib0Var != null) {
            qib0Var.m174853Q0(i);
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
    public static /* synthetic */ void m29647c(Exception exc) throws Exception {
        throw exc;
    }
}
