package tech.sud.runtime.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.cosmos.photon.push.service.PushService;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.component.file.FileOperation;
import tech.sud.runtime.component.p142a.C22518a;
import tech.sud.runtime.component.p143b.C22521a;
import tech.sud.runtime.component.p144c.C22522a;
import tech.sud.runtime.component.p144c.C22524c;
import tech.sud.runtime.component.p144c.C22526e;
import tech.sud.runtime.component.p144c.C22527f;
import tech.sud.runtime.component.p144c.C22530i;
import tech.sud.runtime.component.p145d.C22532a;
import tech.sud.runtime.component.p147f.C22537a;
import tech.sud.runtime.component.p148g.C22544g;
import tech.sud.runtime.component.p149h.C22550f;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: renamed from: tech.sud.runtime.core.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22558b {

    /* JADX INFO: renamed from: c */
    private static C22558b f208785c;

    /* JADX INFO: renamed from: a */
    public C22557a f208786a;

    /* JADX INFO: renamed from: d */
    private final Activity f208788d;

    /* JADX INFO: renamed from: e */
    private final a f208789e;

    /* JADX INFO: renamed from: f */
    private final C22521a f208790f;

    /* JADX INFO: renamed from: g */
    private C22527f f208791g;

    /* JADX INFO: renamed from: h */
    private C22526e f208792h;

    /* JADX INFO: renamed from: i */
    private C22522a f208793i;

    /* JADX INFO: renamed from: j */
    private final C22532a f208794j;

    /* JADX INFO: renamed from: k */
    private C22530i f208795k;

    /* JADX INFO: renamed from: l */
    private final C22563g f208796l;

    /* JADX INFO: renamed from: m */
    private String f208797m;

    /* JADX INFO: renamed from: n */
    private C22537a f208798n;

    /* JADX INFO: renamed from: p */
    private boolean f208800p;

    /* JADX INFO: renamed from: b */
    public boolean f208787b = false;

    /* JADX INFO: renamed from: o */
    private int f208799o = 0;

    /* JADX INFO: renamed from: tech.sud.runtime.core.b$a */
    public static class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        C22558b f208808a;

        /* JADX INFO: renamed from: b */
        boolean f208809b;

        private a(C22558b c22558b) {
            this.f208809b = false;
            this.f208808a = c22558b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            final Application application = activity.getApplication();
            C22558b c22558b = this.f208808a;
            if (c22558b == null || !activity.equals(c22558b.f208788d)) {
                return;
            }
            this.f208808a.m223194a(new Runnable() { // from class: tech.sud.runtime.core.b.a.3
                @Override // java.lang.Runnable
                public void run() {
                    C22558b c22558b2 = a.this.f208808a;
                    if (c22558b2 != null && !c22558b2.f208787b) {
                        c22558b2.m223192a();
                        a.this.f208808a = null;
                    }
                    try {
                        application.unregisterActivityLifecycleCallbacks(this);
                    } catch (Exception unused) {
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C22558b c22558b = this.f208808a;
            if (c22558b == null || !activity.equals(c22558b.f208788d)) {
                return;
            }
            this.f208808a.m223194a(new Runnable() { // from class: tech.sud.runtime.core.b.a.2
                @Override // java.lang.Runnable
                public void run() {
                    C22550f.m223106e("SudNative", "J: onActivityPaused");
                    a aVar = a.this;
                    C22558b c22558b2 = aVar.f208808a;
                    if (c22558b2 != null && !aVar.f208809b) {
                        c22558b2.m223203g();
                    }
                    a.this.f208809b = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C22558b c22558b = this.f208808a;
            if (c22558b == null || !activity.equals(c22558b.f208788d)) {
                return;
            }
            this.f208808a.m223194a(new Runnable() { // from class: tech.sud.runtime.core.b.a.1
                @Override // java.lang.Runnable
                public void run() {
                    C22550f.m223106e("SudNative", "J: onActivityResumed");
                    a aVar = a.this;
                    C22558b c22558b2 = aVar.f208808a;
                    if (c22558b2 != null && aVar.f208809b) {
                        c22558b2.m223202f();
                    }
                    a.this.f208809b = false;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public C22558b(Activity activity, C22563g c22563g, HashMap<String, String> map, C22532a c22532a) {
        int i;
        C22558b c22558b = f208785c;
        if (c22558b != null && !c22558b.f208787b) {
            C22550f.m223106e("SudNative", "J: NativePlayer _currentNativePlayer != null");
            f208785c.m223192a();
        }
        f208785c = this;
        this.f208796l = c22563g;
        this.f208788d = activity;
        this.f208797m = activity.getFilesDir().getAbsolutePath();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        String value = "";
        boolean z = false;
        boolean z2 = false;
        boolean zM223182b = false;
        int iM223178a = 0;
        boolean zM223182b2 = false;
        boolean zM223182b3 = false;
        boolean zM223182b4 = false;
        boolean zM223182b5 = false;
        boolean z3 = false;
        boolean zEquals = false;
        boolean zM223182b6 = true;
        boolean zM223182b7 = true;
        Integer numValueOf = null;
        int iM223178a2 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (zM223182b6) {
                    a aVar = new a();
                    this.f208789e = aVar;
                    activity.getApplication().registerActivityLifecycleCallbacks(aVar);
                } else {
                    this.f208789e = null;
                }
                Context contextM223200d = m223200d();
                String packageName = contextM223200d.getPackageName();
                this.f208796l.m223236a("app.id", packageName);
                try {
                    PackageManager packageManager = contextM223200d.getPackageManager();
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                        this.f208796l.m223236a("app.verName", packageInfo.versionName);
                        this.f208796l.m223236a("app.verCode", Integer.toString(packageInfo.versionCode));
                        i = 0;
                        try {
                            this.f208796l.m223236a("app.name", packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i = 0;
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    i = 0;
                }
                this.f208794j = c22532a;
                if (!c22532a.m222988a("@enableConsole")) {
                    c22532a.m222987a("@enableConsole", new InterfaceC22515a.a() { // from class: tech.sud.runtime.core.b.1
                        @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
                        /* JADX INFO: renamed from: a */
                        public void mo106566a(String str) {
                            C22558b.this.m223193a(str.equals("true") ? C22558b.this.f208786a : null);
                        }
                    });
                }
                m223201e();
                int i2 = iM223178a | (zM223182b2 ? 16 : i) | (zM223182b3 ? 2 : i) | (zM223182b4 ? 64 : i);
                int i3 = z3 ? 128 : i;
                C22550f.m223102b("SudNative", "NativePlayer AdapterLayout");
                this.f208786a = new C22557a(activity, i2 | i3, this.f208796l, zM223182b, iM223178a2, value, c22532a, numValueOf);
                this.f208790f = new C22521a(activity);
                this.f208791g = new C22527f(this.f208796l, activity);
                if (zM223182b5 && zM223182b7) {
                    m223193a(this.f208786a);
                }
                this.f208792h = new C22526e(activity);
                this.f208795k = new C22530i(this);
                if (zEquals) {
                    return;
                }
                this.f208793i = new C22522a(this.f208796l, activity);
                return;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            key.getClass();
            switch (key) {
                case "fps.logTime":
                    iM223178a2 = m223178a(next.getValue());
                    break;
                case "activityLifecycle":
                    zM223182b6 = m223182b(next.getValue());
                    break;
                case "transparent":
                    if (!z) {
                        iM223178a = m223178a(next.getValue()) & 15;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "jsConsole":
                    zM223182b5 = m223182b(next.getValue());
                    this.f208796l.m223236a(key, next.getValue());
                    break;
                case "useCutout":
                    zM223182b4 = m223182b(next.getValue());
                    break;
                case "cachePath":
                    this.f208797m = next.getValue();
                    break;
                case "keyboardBottomOffset":
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt(next.getValue()));
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }
                    break;
                case "enableOrientation":
                    this.f208800p = m223182b(next.getValue());
                    break;
                case "fullscreen":
                    zM223182b3 = m223182b(next.getValue());
                    z2 = true;
                    break;
                case "immersiveMode":
                    zM223182b2 = m223182b(next.getValue());
                    if (!z2) {
                        zM223182b3 = zM223182b2;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "disableAudioFocus":
                    zEquals = "true".equals(next.getValue());
                    break;
                case "jsConsole.autoCreate":
                    zM223182b7 = m223182b(next.getValue());
                    break;
                case "fps.show":
                    zM223182b = m223182b(next.getValue());
                    break;
                case "sud.frameworkVersion":
                    value = next.getValue();
                    break;
                case "runtime.mode":
                    m223178a(next.getValue());
                    this.f208796l.m223236a(key, next.getValue());
                    z = true;
                    iM223178a = 3;
                    break;
                case "sysUIVis":
                    z3 = !m223182b(next.getValue());
                    break;
                default:
                    this.f208796l.m223236a(key, next.getValue());
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m223182b(String str) {
        if (str.compareToIgnoreCase("YES") == 0 || str.compareToIgnoreCase("TRUE") == 0) {
            return true;
        }
        try {
            return Integer.parseInt(str) != 0;
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    private void m223189j() {
        if (f208785c == null) {
            return;
        }
        C22550f.m223102b("SudNative", "J: Begin destroy NativePlayer");
        m223190k();
        this.f208786a.m223175h();
        this.f208794j.m222985a();
        C22537a c22537a = this.f208798n;
        if (c22537a != null) {
            c22537a.m223049c();
            this.f208798n = null;
        }
        C22526e c22526e = this.f208792h;
        if (c22526e != null) {
            c22526e.m222936a(this.f208788d);
            this.f208792h = null;
        }
        C22527f c22527f = this.f208791g;
        if (c22527f != null) {
            c22527f.m222944a(this.f208788d);
            this.f208791g = null;
        }
        C22530i c22530i = this.f208795k;
        if (c22530i != null) {
            c22530i.m222971a();
            this.f208795k = null;
        }
        C22522a c22522a = this.f208793i;
        if (c22522a != null) {
            c22522a.m222861a();
            this.f208793i = null;
        }
        this.f208796l.m223229a();
        try {
            if (this.f208789e != null) {
                this.f208788d.getApplication().unregisterActivityLifecycleCallbacks(this.f208789e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this == f208785c) {
            f208785c = null;
        }
        C22550f.m223102b("SudNative", "J: End destroy NativePlayer");
        ViewParent parent = this.f208786a.getParent();
        boolean z = parent instanceof ViewGroup;
        C22557a c22557a = this.f208786a;
        if (z) {
            ((ViewGroup) parent).removeView(c22557a);
        } else {
            c22557a.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m223190k() {
        C22521a c22521a = this.f208790f;
        if (c22521a != null) {
            c22521a.m222858a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m223191l() {
        m223190k();
    }

    /* JADX INFO: renamed from: a */
    public void m223193a(FrameLayout frameLayout) {
        C22537a c22537a = this.f208798n;
        if (c22537a == null && frameLayout != null) {
            C22537a c22537a2 = new C22537a(this.f208788d, frameLayout);
            this.f208798n = c22537a2;
            c22537a2.m223048b();
        } else {
            if (c22537a == null || frameLayout != null) {
                return;
            }
            c22537a.m223048b();
            ((FrameLayout) this.f208798n.getParent()).removeView(this.f208798n);
            this.f208798n.m223049c();
            this.f208798n = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public Context m223200d() {
        return m223199c();
    }

    /* JADX INFO: renamed from: e */
    public void m223201e() {
        this.f208796l.m223237a(this, this.f208788d.getResources().getAssets(), this.f208797m);
    }

    public Object emit(final int i, final int i2, final int i3, final String str) {
        if (i == 1) {
            this.f208796l.m223239b().m223054a();
        } else {
            if (i != 18) {
                if (i == 26) {
                    this.f208786a.m223172e().mo223206a().m223217a(i2);
                    return null;
                }
                switch (i) {
                    case 29:
                        return C22524c.m222867a((Context) this.f208788d);
                    case 30:
                        if (C22524c.m222873a((Context) this.f208788d, str)) {
                            return Boolean.TRUE;
                        }
                        return null;
                    case 31:
                        return C22524c.m222874b(this.f208788d);
                    default:
                        switch (i) {
                            case 33:
                                return "" + ((int) (C22524c.m222866a(this.f208788d) * 10000.0f));
                            case 34:
                                if (this.f208792h.m222937a()) {
                                    return Boolean.TRUE;
                                }
                                return null;
                            case 35:
                                return "" + C22527f.m222941b(this.f208788d);
                            default:
                                switch (i) {
                                    case 37:
                                        if (i2 != 1) {
                                            return null;
                                        }
                                        return new C22544g(this.f208796l);
                                    case 38:
                                        return this.f208796l.m223239b().m223057b(str);
                                    case 39:
                                        this.f208796l.m223239b().m223055a(i2);
                                        return null;
                                }
                        }
                }
            }
            this.f208786a.m223170c().m223270a(true);
        }
        m223194a(new Runnable() { // from class: tech.sud.runtime.core.b.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int i4 = i;
                    if (i4 == 27) {
                        C22524c.m222871a(C22558b.this.f208788d, i2 != 0);
                        return;
                    }
                    if (i4 == 28) {
                        C22524c.m222872a((Context) C22558b.this.f208788d, i2);
                        return;
                    }
                    if (i4 == 32) {
                        C22524c.m222868a(C22558b.this.f208788d, i2 * 1.0E-4f);
                        return;
                    }
                    switch (i4) {
                        case 1:
                            C22558b.this.m223191l();
                            break;
                        case 2:
                            if (C22558b.this.f208790f != null) {
                                C22558b.this.f208790f.m222859a(str);
                            }
                            break;
                        case 3:
                            if (C22558b.this.f208798n != null) {
                                C22558b.this.f208798n.m223047a(str);
                            }
                            break;
                        case 4:
                            if (C22558b.this.f208791g != null) {
                                C22558b.this.f208791g.m222943a();
                            }
                            break;
                        case 5:
                            C22518a c22518aM223176i = C22558b.this.f208786a.m223176i();
                            if (c22518aM223176i != null) {
                                c22518aM223176i.m222844a(true);
                            }
                            break;
                        case 6:
                            JSONArray jSONArray = new JSONArray(str);
                            C22558b.this.f208794j.m222986a(jSONArray.opt(0).toString(), jSONArray.opt(1).toString());
                            break;
                        case 7:
                            C22518a c22518aM223176i2 = C22558b.this.f208786a.m223176i();
                            if (c22518aM223176i2 != null) {
                                c22518aM223176i2.m222843a(i2, str);
                            }
                            break;
                        case 8:
                            C22518a c22518aM223176i3 = C22558b.this.f208786a.m223176i();
                            if (c22518aM223176i3 != null) {
                                c22518aM223176i3.m222842a(i2, i3, str);
                            }
                            break;
                        case 9:
                            if (C22558b.this.f208795k != null) {
                                C22558b.this.f208795k.m222973a(i2, i3);
                            }
                            break;
                        case 10:
                            if (C22558b.this.f208795k != null) {
                                C22558b.this.f208795k.m222972a(i2);
                            }
                            break;
                        case 11:
                            C22558b c22558b = C22558b.this;
                            if (!c22558b.f208787b) {
                                c22558b.f208786a.m223168a().m223120a(C22558b.m223180b(), i2);
                            }
                            break;
                        case 12:
                            C22558b c22558b2 = C22558b.this;
                            if (!c22558b2.f208787b) {
                                c22558b2.f208786a.m223168a().m223116a(i2);
                            }
                            break;
                        case 13:
                            C22558b.this.f208786a.m223168a().m223119a(i2, str);
                            break;
                        case 14:
                            C22558b.this.f208786a.m223168a().m223121b(i2);
                            break;
                        case 15:
                            C22558b.this.f208786a.m223168a().m223122c(i2);
                            break;
                        case 16:
                            C22558b.this.f208786a.m223168a().m223118a(i2, i3);
                            break;
                        case 17:
                            C22558b.this.f208786a.m223168a().m223117a(i2, i3 * 0.01f);
                            break;
                        case 18:
                            C22558b.this.f208786a.m223170c().m223270a(false);
                            JSONArray jSONArray2 = new JSONArray(str);
                            C22558b.this.f208786a.m223169b().m223034a(jSONArray2.opt(0).toString(), i2, (float) jSONArray2.optDouble(1), (float) jSONArray2.optDouble(2), jSONArray2.optBoolean(3));
                            break;
                        case 19:
                            C22558b.this.f208786a.m223169b().m223035b();
                            C22558b.this.m223195a(new Runnable() { // from class: tech.sud.runtime.core.b.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    C22558b.this.f208786a.m223170c().m223271b();
                                }
                            }, 500L);
                            break;
                        case 20:
                            C22558b.this.f208786a.m223169b().m223033a(str, i2);
                            break;
                        case 21:
                            C22558b.this.f208786a.m223169b().m223032a(str);
                            break;
                        case 22:
                            C22558b.this.f208786a.m223171d().m223022a(str);
                            break;
                        case 23:
                            C22558b.this.f208786a.m223171d().m223023b(str);
                            break;
                        case 24:
                            if (C22558b.this.f208800p) {
                                C22524c.m222869a(C22558b.this.f208788d, i2, i3);
                            }
                            break;
                        case 25:
                            if (C22558b.this.f208800p) {
                                C22524c.m222870a(C22558b.this.f208788d, str);
                            }
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {
                    C22550f.m223106e("SudNative", "J: Async emit get: " + e.getMessage());
                }
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m223202f() {
        int i;
        if (f208785c != this || this.f208787b || (i = this.f208799o) == 0) {
            return;
        }
        int i2 = i - 1;
        this.f208799o = i2;
        if (i2 == 0) {
            this.f208786a.m223173f();
            C22530i c22530i = this.f208795k;
            if (c22530i != null) {
                c22530i.m222975c();
            }
            C22522a c22522a = this.f208793i;
            if (c22522a != null) {
                c22522a.m222863c();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m223203g() {
        if (f208785c != this || this.f208787b) {
            return;
        }
        if (this.f208799o == 0) {
            this.f208786a.m223174g();
            C22530i c22530i = this.f208795k;
            if (c22530i != null) {
                c22530i.m222974b();
            }
            C22522a c22522a = this.f208793i;
            if (c22522a != null) {
                c22522a.m222862b();
            }
        }
        this.f208799o++;
    }

    /* JADX INFO: renamed from: h */
    public void m223204h() {
        FileOperation.m223050a(new File(this.f208797m + "/games/"));
    }

    /* JADX INFO: renamed from: i */
    public String[] m223205i() {
        return new String[]{"1.3.0", JNIShell.version(0), JNIShell.version(1)};
    }

    /* JADX INFO: renamed from: c */
    public Activity m223199c() {
        return this.f208788d;
    }

    /* JADX INFO: renamed from: b */
    public static Context m223180b() {
        C22558b c22558b = f208785c;
        if (c22558b == null) {
            return null;
        }
        return c22558b.f208788d;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public void m223198b(String str, String str2) {
        if ("WXAudioInterruption_onChange".equals(str)) {
            this.f208796l.m223240b(13, "1".equals(str2) ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223192a() {
        this.f208787b = true;
        m223189j();
    }

    /* JADX INFO: renamed from: a */
    public static int m223178a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223194a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        C22557a c22557a = this.f208786a;
        if (c22557a == null) {
            this.f208788d.runOnUiThread(runnable);
        } else {
            c22557a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223195a(Runnable runnable, long j) {
        if (j == 0) {
            m223194a(runnable);
        } else {
            this.f208786a.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223196a(String str, String str2) {
        C22532a c22532a = this.f208794j;
        if (c22532a != null) {
            c22532a.m222989b(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223197a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PushService.KEY_COMMAND, str);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
            m223196a("RTGlobalEvent", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }
}
