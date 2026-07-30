package com.p051p1.mobile.putong.app;

import android.app.Application;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.appcompat.app.AbstractC0076b;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import java.io.File;
import p153l.a30;
import p153l.b50;
import p153l.cmb0;
import p153l.de00;
import p153l.g9r;
import p153l.gxd0;
import p153l.hxd0;
import p153l.jxd0;
import p153l.kmk0;
import p153l.kxd0;
import p153l.l51;
import p153l.ls4;
import p153l.m9i0;
import p153l.mxw;
import p153l.o1j0;
import p153l.oup0;
import p153l.qu2;
import p153l.r1j0;
import p153l.rr2;
import p153l.sdh0;
import p153l.tr10;
import p153l.uqb0;
import p153l.x95;
import p153l.ymw;
import p153l.yup0;
import p153l.yxi0;

/* JADX INFO: loaded from: classes9.dex */
public class TantanApp extends Application {

    /* JADX INFO: renamed from: b */
    public static uqb0 f17898b;

    /* JADX INFO: renamed from: c */
    public static cmb0 f17899c;

    /* JADX INFO: renamed from: f */
    public static long f17902f;

    /* JADX INFO: renamed from: g */
    public static boolean f17903g;

    /* JADX INFO: renamed from: h */
    public static long f17904h;

    /* JADX INFO: renamed from: i */
    public static m9i0 f17905i;

    /* JADX INFO: renamed from: a */
    public volatile Resources f17910a;

    /* JADX INFO: renamed from: d */
    public static final kxd0 f17900d = new kxd0(App.f16088e, "putongUserMeSaved", Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public static final gxd0 f17901e = new gxd0(App.f16088e, "putongAuthdata", true, "putongPref");

    /* JADX INFO: renamed from: j */
    public static jxd0 f17906j = new jxd0(App.f16088e, "first_cold_launch_time_record_" + uqb0.f180413s, Boolean.TRUE);

    /* JADX INFO: renamed from: k */
    public static boolean f17907k = false;

    /* JADX INFO: renamed from: l */
    public static Boolean f17908l = null;

    /* JADX INFO: renamed from: m */
    public static long f17909m = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.TantanApp$a */
    public class C4848a implements MMKV.LibLoader {
        public C4848a() {
        }

        @Override // com.tencent.mmkv.MMKV.LibLoader
        public void loadLibrary(String str) {
            System.loadLibrary(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.TantanApp$b */
    public class C4849b implements r1j0.InterfaceC19737c {
        public C4849b() {
        }

        @Override // p153l.r1j0.InterfaceC19737c
        /* JADX INFO: renamed from: a */
        public void mo30647a(int i) {
            o1j0.m165649w(i);
        }

        @Override // p153l.r1j0.InterfaceC19737c
        /* JADX INFO: renamed from: b */
        public void mo30648b(String str) {
            o1j0.m165651y(str);
        }

        @Override // p153l.r1j0.InterfaceC19737c
        /* JADX INFO: renamed from: c */
        public void mo30649c(String str) {
            o1j0.m165636j(str);
        }

        @Override // p153l.r1j0.InterfaceC19737c
        /* JADX INFO: renamed from: d */
        public void mo30650d(int i) {
            o1j0.m165634h(i);
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f17902f = SystemClock.elapsedRealtime();
        tr10.m192393k(context);
        uqb0.f180400f0 = context.getResources().getConfiguration().mcc;
    }

    /* JADX INFO: renamed from: d */
    public final void m30646d() {
        r1j0.m179421h(new C4849b());
        oup0.m169373e(this);
        new yxi0().m217718e();
        if (!App.f16089f) {
            de00.m115372n().m115373o(App.f16088e);
            return;
        }
        f17905i = new m9i0(App.f16088e);
        ls4.m155672c();
        try {
            yup0.m217463b(this);
        } catch (Throwable th) {
            CrashHelper.m82483g(th);
        }
        uqb0 uqb0Var = new uqb0();
        f17898b = uqb0Var;
        uqb0Var.mo21434m();
        sdh0.m185464a();
        boolean zBooleanValue = f17906j.get().booleanValue();
        f17903g = zBooleanValue;
        if (zBooleanValue) {
            f17906j.put(Boolean.FALSE);
        }
        f17904h = SystemClock.elapsedRealtime();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (!IntlCountryCodeController.m29125v()) {
            return super.getResources();
        }
        if (this.f17910a == null) {
            synchronized (this) {
                try {
                    if (this.f17910a == null) {
                        this.f17910a = new mxw(super.getResources());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f17910a;
    }

    @Override // android.app.Application
    public void onCreate() {
        String absolutePath;
        C4848a c4848a;
        try {
            AbstractC0076b.m360D(1);
        } catch (Exception unused) {
        }
        b50.m102546b(this);
        super.onCreate();
        App.f16088e = this;
        App.f16089f = l51.m152883C();
        x95.INSTANCE.m209791j(this);
        if (App.f16089f) {
            f17909m = SystemClock.elapsedRealtime();
            g9r.m129598a();
        }
        try {
            try {
                kmk0.m150487a(this, false, false);
                if (TextUtils.isEmpty(MMKV.getRootDir())) {
                    absolutePath = new File(getFilesDir().getParent(), hxd0.MMKV_DIR).getAbsolutePath();
                    c4848a = new C4848a();
                    MMKV.initialize(this, absolutePath, c4848a);
                }
            } catch (Throwable th) {
                CrashHelper.m82483g(th);
            }
        } catch (Throwable th2) {
            try {
                CrashHelper.m82483g(th2);
                if (TextUtils.isEmpty(MMKV.getRootDir())) {
                    absolutePath = new File(getFilesDir().getParent(), hxd0.MMKV_DIR).getAbsolutePath();
                    c4848a = new C4848a();
                }
            } catch (Throwable th3) {
                if (TextUtils.isEmpty(MMKV.getRootDir())) {
                    try {
                        MMKV.initialize(this, new File(getFilesDir().getParent(), hxd0.MMKV_DIR).getAbsolutePath(), new C4848a());
                    } catch (Throwable th4) {
                        CrashHelper.m82483g(th4);
                    }
                }
                throw th3;
            }
        }
        try {
            rr2.m182682b().m182685d(this);
        } catch (Throwable th5) {
            CrashHelper.m82483g(th5);
        }
        try {
            ymw.m216739b(this);
        } catch (Throwable th6) {
            CrashHelper.m82483g(th6);
        }
        if (App.f16089f) {
            try {
                qu2.m178121p(this);
            } catch (Throwable th7) {
                CrashHelper.m82483g(th7);
            }
            CrashHelper.m82478b(new a30() { // from class: l.t9i0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    qu2.m178128w((Throwable) obj);
                }
            }, new a30() { // from class: l.u9i0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    qu2.m178128w((Throwable) obj);
                }
            });
            try {
                FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(TextUtils.equals(rr2.m182682b().m182684c("sp_protocal", "https"), "https"));
            } catch (Throwable th8) {
                CrashHelper.m82483g(th8);
            }
        }
        try {
            m30646d();
        } catch (Exception e) {
            new Handler().postDelayed(new Runnable() { // from class: l.v9i0
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    TantanApp.m30645c(e);
                }
            }, 1000L);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        uqb0 uqb0Var = f17898b;
        if (uqb0Var != null) {
            uqb0Var.m197306P0();
        }
        super.onLowMemory();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        uqb0 uqb0Var = f17898b;
        if (uqb0Var != null) {
            uqb0Var.m197307Q0(i);
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
    public static /* synthetic */ void m30645c(Exception exc) throws Exception {
        throw exc;
    }
}
