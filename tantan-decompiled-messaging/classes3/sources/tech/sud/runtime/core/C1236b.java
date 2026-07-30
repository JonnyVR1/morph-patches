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
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.component.file.FileOperation;
import tech.sud.runtime.component.p019a.C1196a;
import tech.sud.runtime.component.p020b.C1199a;
import tech.sud.runtime.component.p021c.C1200a;
import tech.sud.runtime.component.p021c.C1202c;
import tech.sud.runtime.component.p021c.C1204e;
import tech.sud.runtime.component.p021c.C1205f;
import tech.sud.runtime.component.p021c.C1208i;
import tech.sud.runtime.component.p022d.C1210a;
import tech.sud.runtime.component.p024f.C1215a;
import tech.sud.runtime.component.p025g.C1222g;
import tech.sud.runtime.component.p026h.C1228f;
import tech.sud.runtime.p018a.InterfaceC1193a;

/* JADX INFO: renamed from: tech.sud.runtime.core.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1236b {

    /* JADX INFO: renamed from: c */
    private static C1236b f11488c;

    /* JADX INFO: renamed from: a */
    public C1235a f11489a;

    /* JADX INFO: renamed from: d */
    private final Activity f11491d;

    /* JADX INFO: renamed from: e */
    private final a f11492e;

    /* JADX INFO: renamed from: f */
    private final C1199a f11493f;

    /* JADX INFO: renamed from: g */
    private C1205f f11494g;

    /* JADX INFO: renamed from: h */
    private C1204e f11495h;

    /* JADX INFO: renamed from: i */
    private C1200a f11496i;

    /* JADX INFO: renamed from: j */
    private final C1210a f11497j;

    /* JADX INFO: renamed from: k */
    private C1208i f11498k;

    /* JADX INFO: renamed from: l */
    private final C1241g f11499l;

    /* JADX INFO: renamed from: m */
    private String f11500m;

    /* JADX INFO: renamed from: n */
    private C1215a f11501n;

    /* JADX INFO: renamed from: p */
    private boolean f11503p;

    /* JADX INFO: renamed from: b */
    public boolean f11490b = false;

    /* JADX INFO: renamed from: o */
    private int f11502o = 0;

    /* JADX INFO: renamed from: tech.sud.runtime.core.b$a */
    public static class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        C1236b f11511a;

        /* JADX INFO: renamed from: b */
        boolean f11512b;

        private a(C1236b c1236b) {
            this.f11512b = false;
            this.f11511a = c1236b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            final Application application = activity.getApplication();
            C1236b c1236b = this.f11511a;
            if (c1236b == null || !activity.equals(c1236b.f11491d)) {
                return;
            }
            this.f11511a.m10419a(new Runnable() { // from class: tech.sud.runtime.core.b.a.3
                @Override // java.lang.Runnable
                public void run() {
                    C1236b c1236b2 = a.this.f11511a;
                    if (c1236b2 != null && !c1236b2.f11490b) {
                        c1236b2.m10417a();
                        a.this.f11511a = null;
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
            C1236b c1236b = this.f11511a;
            if (c1236b == null || !activity.equals(c1236b.f11491d)) {
                return;
            }
            this.f11511a.m10419a(new Runnable() { // from class: tech.sud.runtime.core.b.a.2
                @Override // java.lang.Runnable
                public void run() {
                    C1228f.m10331e("SudNative", "J: onActivityPaused");
                    a aVar = a.this;
                    C1236b c1236b2 = aVar.f11511a;
                    if (c1236b2 != null && !aVar.f11512b) {
                        c1236b2.m10428g();
                    }
                    a.this.f11512b = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C1236b c1236b = this.f11511a;
            if (c1236b == null || !activity.equals(c1236b.f11491d)) {
                return;
            }
            this.f11511a.m10419a(new Runnable() { // from class: tech.sud.runtime.core.b.a.1
                @Override // java.lang.Runnable
                public void run() {
                    C1228f.m10331e("SudNative", "J: onActivityResumed");
                    a aVar = a.this;
                    C1236b c1236b2 = aVar.f11511a;
                    if (c1236b2 != null && aVar.f11512b) {
                        c1236b2.m10427f();
                    }
                    a.this.f11512b = false;
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

    public C1236b(Activity activity, C1241g c1241g, HashMap<String, String> map, C1210a c1210a) {
        int i;
        C1236b c1236b = f11488c;
        if (c1236b != null && !c1236b.f11490b) {
            C1228f.m10331e("SudNative", "J: NativePlayer _currentNativePlayer != null");
            f11488c.m10417a();
        }
        f11488c = this;
        this.f11499l = c1241g;
        this.f11491d = activity;
        this.f11500m = activity.getFilesDir().getAbsolutePath();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        String value = "";
        boolean z = false;
        boolean z2 = false;
        boolean zM10407b = false;
        int iM10403a = 0;
        boolean zM10407b2 = false;
        boolean zM10407b3 = false;
        boolean zM10407b4 = false;
        boolean zM10407b5 = false;
        boolean z3 = false;
        boolean zEquals = false;
        boolean zM10407b6 = true;
        boolean zM10407b7 = true;
        Integer numValueOf = null;
        int iM10403a2 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (zM10407b6) {
                    a aVar = new a();
                    this.f11492e = aVar;
                    activity.getApplication().registerActivityLifecycleCallbacks(aVar);
                } else {
                    this.f11492e = null;
                }
                Context contextM10425d = m10425d();
                String packageName = contextM10425d.getPackageName();
                this.f11499l.m10461a("app.id", packageName);
                try {
                    PackageManager packageManager = contextM10425d.getPackageManager();
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                        this.f11499l.m10461a("app.verName", packageInfo.versionName);
                        this.f11499l.m10461a("app.verCode", Integer.toString(packageInfo.versionCode));
                        i = 0;
                        try {
                            this.f11499l.m10461a("app.name", packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i = 0;
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    i = 0;
                }
                this.f11497j = c1210a;
                if (!c1210a.m10213a("@enableConsole")) {
                    c1210a.m10212a("@enableConsole", new InterfaceC1193a.a() { // from class: tech.sud.runtime.core.b.1
                        @Override // tech.sud.runtime.p018a.InterfaceC1193a.a
                        /* JADX INFO: renamed from: a */
                        public void mo10060a(String str) {
                            C1236b.this.m10418a(str.equals("true") ? C1236b.this.f11489a : null);
                        }
                    });
                }
                m10426e();
                int i2 = iM10403a | (zM10407b2 ? 16 : i) | (zM10407b3 ? 2 : i) | (zM10407b4 ? 64 : i);
                int i3 = z3 ? 128 : i;
                C1228f.m10327b("SudNative", "NativePlayer AdapterLayout");
                this.f11489a = new C1235a(activity, i2 | i3, this.f11499l, zM10407b, iM10403a2, value, c1210a, numValueOf);
                this.f11493f = new C1199a(activity);
                this.f11494g = new C1205f(this.f11499l, activity);
                if (zM10407b5 && zM10407b7) {
                    m10418a(this.f11489a);
                }
                this.f11495h = new C1204e(activity);
                this.f11498k = new C1208i(this);
                if (zEquals) {
                    return;
                }
                this.f11496i = new C1200a(this.f11499l, activity);
                return;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            key.getClass();
            switch (key) {
                case "fps.logTime":
                    iM10403a2 = m10403a(next.getValue());
                    break;
                case "activityLifecycle":
                    zM10407b6 = m10407b(next.getValue());
                    break;
                case "transparent":
                    if (!z) {
                        iM10403a = m10403a(next.getValue()) & 15;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "jsConsole":
                    zM10407b5 = m10407b(next.getValue());
                    this.f11499l.m10461a(key, next.getValue());
                    break;
                case "useCutout":
                    zM10407b4 = m10407b(next.getValue());
                    break;
                case "cachePath":
                    this.f11500m = next.getValue();
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
                    this.f11503p = m10407b(next.getValue());
                    break;
                case "fullscreen":
                    zM10407b3 = m10407b(next.getValue());
                    z2 = true;
                    break;
                case "immersiveMode":
                    zM10407b2 = m10407b(next.getValue());
                    if (!z2) {
                        zM10407b3 = zM10407b2;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "disableAudioFocus":
                    zEquals = "true".equals(next.getValue());
                    break;
                case "jsConsole.autoCreate":
                    zM10407b7 = m10407b(next.getValue());
                    break;
                case "fps.show":
                    zM10407b = m10407b(next.getValue());
                    break;
                case "sud.frameworkVersion":
                    value = next.getValue();
                    break;
                case "runtime.mode":
                    m10403a(next.getValue());
                    this.f11499l.m10461a(key, next.getValue());
                    z = true;
                    iM10403a = 3;
                    break;
                case "sysUIVis":
                    z3 = !m10407b(next.getValue());
                    break;
                default:
                    this.f11499l.m10461a(key, next.getValue());
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10407b(String str) {
        if (str.compareToIgnoreCase("YES") == 0 || str.compareToIgnoreCase("TRUE") == 0) {
            return true;
        }
        try {
            return Integer.parseInt(str) != 0;
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    private void m10414j() {
        if (f11488c == null) {
            return;
        }
        C1228f.m10327b("SudNative", "J: Begin destroy NativePlayer");
        m10415k();
        this.f11489a.m10400h();
        this.f11497j.m10210a();
        C1215a c1215a = this.f11501n;
        if (c1215a != null) {
            c1215a.m10274c();
            this.f11501n = null;
        }
        C1204e c1204e = this.f11495h;
        if (c1204e != null) {
            c1204e.m10161a(this.f11491d);
            this.f11495h = null;
        }
        C1205f c1205f = this.f11494g;
        if (c1205f != null) {
            c1205f.m10169a(this.f11491d);
            this.f11494g = null;
        }
        C1208i c1208i = this.f11498k;
        if (c1208i != null) {
            c1208i.m10196a();
            this.f11498k = null;
        }
        C1200a c1200a = this.f11496i;
        if (c1200a != null) {
            c1200a.m10086a();
            this.f11496i = null;
        }
        this.f11499l.m10454a();
        try {
            if (this.f11492e != null) {
                this.f11491d.getApplication().unregisterActivityLifecycleCallbacks(this.f11492e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this == f11488c) {
            f11488c = null;
        }
        C1228f.m10327b("SudNative", "J: End destroy NativePlayer");
        ViewParent parent = this.f11489a.getParent();
        boolean z = parent instanceof ViewGroup;
        C1235a c1235a = this.f11489a;
        if (z) {
            ((ViewGroup) parent).removeView(c1235a);
        } else {
            c1235a.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m10415k() {
        C1199a c1199a = this.f11493f;
        if (c1199a != null) {
            c1199a.m10083a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m10416l() {
        m10415k();
    }

    /* JADX INFO: renamed from: a */
    public void m10418a(FrameLayout frameLayout) {
        C1215a c1215a = this.f11501n;
        if (c1215a == null && frameLayout != null) {
            C1215a c1215a2 = new C1215a(this.f11491d, frameLayout);
            this.f11501n = c1215a2;
            c1215a2.m10273b();
        } else {
            if (c1215a == null || frameLayout != null) {
                return;
            }
            c1215a.m10273b();
            ((FrameLayout) this.f11501n.getParent()).removeView(this.f11501n);
            this.f11501n.m10274c();
            this.f11501n = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public Context m10425d() {
        return m10424c();
    }

    /* JADX INFO: renamed from: e */
    public void m10426e() {
        this.f11499l.m10462a(this, this.f11491d.getResources().getAssets(), this.f11500m);
    }

    public Object emit(final int i, final int i2, final int i3, final String str) {
        if (i == 1) {
            this.f11499l.m10464b().m10279a();
        } else {
            if (i != 18) {
                if (i == 26) {
                    this.f11489a.m10397e().mo10431a().m10442a(i2);
                    return null;
                }
                switch (i) {
                    case HttpHeaders.IF_MODIFIED_SINCE_ORDINAL /* 29 */:
                        return C1202c.m10092a((Context) this.f11491d);
                    case 30:
                        if (C1202c.m10098a((Context) this.f11491d, str)) {
                            return Boolean.TRUE;
                        }
                        return null;
                    case 31:
                        return C1202c.m10099b(this.f11491d);
                    default:
                        switch (i) {
                            case 33:
                                return "" + ((int) (C1202c.m10091a(this.f11491d) * 10000.0f));
                            case HttpHeaders.MAX_FORWARDS_ORDINAL /* 34 */:
                                if (this.f11495h.m10162a()) {
                                    return Boolean.TRUE;
                                }
                                return null;
                            case 35:
                                return "" + C1205f.m10166b(this.f11491d);
                            default:
                                switch (i) {
                                    case 37:
                                        if (i2 != 1) {
                                            return null;
                                        }
                                        return new C1222g(this.f11499l);
                                    case HttpHeaders.REFERER_ORDINAL /* 38 */:
                                        return this.f11499l.m10464b().m10282b(str);
                                    case HttpHeaders.TE_ORDINAL /* 39 */:
                                        this.f11499l.m10464b().m10280a(i2);
                                        return null;
                                }
                        }
                }
            }
            this.f11489a.m10395c().m10495a(true);
        }
        m10419a(new Runnable() { // from class: tech.sud.runtime.core.b.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int i4 = i;
                    if (i4 == 27) {
                        C1202c.m10096a(C1236b.this.f11491d, i2 != 0);
                        return;
                    }
                    if (i4 == 28) {
                        C1202c.m10097a((Context) C1236b.this.f11491d, i2);
                        return;
                    }
                    if (i4 == 32) {
                        C1202c.m10093a(C1236b.this.f11491d, i2 * 1.0E-4f);
                        return;
                    }
                    switch (i4) {
                        case 1:
                            C1236b.this.m10416l();
                            break;
                        case 2:
                            if (C1236b.this.f11493f != null) {
                                C1236b.this.f11493f.m10084a(str);
                            }
                            break;
                        case 3:
                            if (C1236b.this.f11501n != null) {
                                C1236b.this.f11501n.m10272a(str);
                            }
                            break;
                        case 4:
                            if (C1236b.this.f11494g != null) {
                                C1236b.this.f11494g.m10168a();
                            }
                            break;
                        case 5:
                            C1196a c1196aM10401i = C1236b.this.f11489a.m10401i();
                            if (c1196aM10401i != null) {
                                c1196aM10401i.m10069a(true);
                            }
                            break;
                        case 6:
                            JSONArray jSONArray = new JSONArray(str);
                            C1236b.this.f11497j.m10211a(jSONArray.opt(0).toString(), jSONArray.opt(1).toString());
                            break;
                        case 7:
                            C1196a c1196aM10401i2 = C1236b.this.f11489a.m10401i();
                            if (c1196aM10401i2 != null) {
                                c1196aM10401i2.m10068a(i2, str);
                            }
                            break;
                        case 8:
                            C1196a c1196aM10401i3 = C1236b.this.f11489a.m10401i();
                            if (c1196aM10401i3 != null) {
                                c1196aM10401i3.m10067a(i2, i3, str);
                            }
                            break;
                        case 9:
                            if (C1236b.this.f11498k != null) {
                                C1236b.this.f11498k.m10198a(i2, i3);
                            }
                            break;
                        case 10:
                            if (C1236b.this.f11498k != null) {
                                C1236b.this.f11498k.m10197a(i2);
                            }
                            break;
                        case 11:
                            C1236b c1236b = C1236b.this;
                            if (!c1236b.f11490b) {
                                c1236b.f11489a.m10393a().m10345a(C1236b.m10405b(), i2);
                            }
                            break;
                        case 12:
                            C1236b c1236b2 = C1236b.this;
                            if (!c1236b2.f11490b) {
                                c1236b2.f11489a.m10393a().m10341a(i2);
                            }
                            break;
                        case 13:
                            C1236b.this.f11489a.m10393a().m10344a(i2, str);
                            break;
                        case 14:
                            C1236b.this.f11489a.m10393a().m10346b(i2);
                            break;
                        case 15:
                            C1236b.this.f11489a.m10393a().m10347c(i2);
                            break;
                        case 16:
                            C1236b.this.f11489a.m10393a().m10343a(i2, i3);
                            break;
                        case 17:
                            C1236b.this.f11489a.m10393a().m10342a(i2, i3 * 0.01f);
                            break;
                        case 18:
                            C1236b.this.f11489a.m10395c().m10495a(false);
                            JSONArray jSONArray2 = new JSONArray(str);
                            C1236b.this.f11489a.m10394b().m10259a(jSONArray2.opt(0).toString(), i2, (float) jSONArray2.optDouble(1), (float) jSONArray2.optDouble(2), jSONArray2.optBoolean(3));
                            break;
                        case 19:
                            C1236b.this.f11489a.m10394b().m10260b();
                            C1236b.this.m10420a(new Runnable() { // from class: tech.sud.runtime.core.b.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    C1236b.this.f11489a.m10395c().m10496b();
                                }
                            }, 500L);
                            break;
                        case 20:
                            C1236b.this.f11489a.m10394b().m10258a(str, i2);
                            break;
                        case 21:
                            C1236b.this.f11489a.m10394b().m10257a(str);
                            break;
                        case 22:
                            C1236b.this.f11489a.m10396d().m10247a(str);
                            break;
                        case 23:
                            C1236b.this.f11489a.m10396d().m10248b(str);
                            break;
                        case 24:
                            if (C1236b.this.f11503p) {
                                C1202c.m10094a(C1236b.this.f11491d, i2, i3);
                            }
                            break;
                        case 25:
                            if (C1236b.this.f11503p) {
                                C1202c.m10095a(C1236b.this.f11491d, str);
                            }
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {
                    C1228f.m10331e("SudNative", "J: Async emit get: " + e.getMessage());
                }
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m10427f() {
        int i;
        if (f11488c != this || this.f11490b || (i = this.f11502o) == 0) {
            return;
        }
        int i2 = i - 1;
        this.f11502o = i2;
        if (i2 == 0) {
            this.f11489a.m10398f();
            C1208i c1208i = this.f11498k;
            if (c1208i != null) {
                c1208i.m10200c();
            }
            C1200a c1200a = this.f11496i;
            if (c1200a != null) {
                c1200a.m10088c();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10428g() {
        if (f11488c != this || this.f11490b) {
            return;
        }
        if (this.f11502o == 0) {
            this.f11489a.m10399g();
            C1208i c1208i = this.f11498k;
            if (c1208i != null) {
                c1208i.m10199b();
            }
            C1200a c1200a = this.f11496i;
            if (c1200a != null) {
                c1200a.m10087b();
            }
        }
        this.f11502o++;
    }

    /* JADX INFO: renamed from: h */
    public void m10429h() {
        FileOperation.m10275a(new File(this.f11500m + "/games/"));
    }

    /* JADX INFO: renamed from: i */
    public String[] m10430i() {
        return new String[]{"1.3.0", JNIShell.version(0), JNIShell.version(1)};
    }

    /* JADX INFO: renamed from: c */
    public Activity m10424c() {
        return this.f11491d;
    }

    /* JADX INFO: renamed from: b */
    public static Context m10405b() {
        C1236b c1236b = f11488c;
        if (c1236b == null) {
            return null;
        }
        return c1236b.f11491d;
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
    public void m10423b(String str, String str2) {
        if ("WXAudioInterruption_onChange".equals(str)) {
            this.f11499l.m10465b(13, "1".equals(str2) ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10417a() {
        this.f11490b = true;
        m10414j();
    }

    /* JADX INFO: renamed from: a */
    public static int m10403a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10419a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        C1235a c1235a = this.f11489a;
        if (c1235a == null) {
            this.f11491d.runOnUiThread(runnable);
        } else {
            c1235a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10420a(Runnable runnable, long j) {
        if (j == 0) {
            m10419a(runnable);
        } else {
            this.f11489a.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10421a(String str, String str2) {
        C1210a c1210a = this.f11497j;
        if (c1210a != null) {
            c1210a.m10214b(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10422a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cmd", str);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
            m10421a("RTGlobalEvent", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }
}
