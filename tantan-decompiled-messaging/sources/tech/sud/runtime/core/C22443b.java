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
import tech.sud.runtime.component.p138a.C22403a;
import tech.sud.runtime.component.p139b.C22406a;
import tech.sud.runtime.component.p140c.C22407a;
import tech.sud.runtime.component.p140c.C22409c;
import tech.sud.runtime.component.p140c.C22411e;
import tech.sud.runtime.component.p140c.C22412f;
import tech.sud.runtime.component.p140c.C22415i;
import tech.sud.runtime.component.p141d.C22417a;
import tech.sud.runtime.component.p143f.C22422a;
import tech.sud.runtime.component.p144g.C22429g;
import tech.sud.runtime.component.p145h.C22435f;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: renamed from: tech.sud.runtime.core.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22443b {

    /* JADX INFO: renamed from: c */
    private static C22443b f207863c;

    /* JADX INFO: renamed from: a */
    public C22442a f207864a;

    /* JADX INFO: renamed from: d */
    private final Activity f207866d;

    /* JADX INFO: renamed from: e */
    private final a f207867e;

    /* JADX INFO: renamed from: f */
    private final C22406a f207868f;

    /* JADX INFO: renamed from: g */
    private C22412f f207869g;

    /* JADX INFO: renamed from: h */
    private C22411e f207870h;

    /* JADX INFO: renamed from: i */
    private C22407a f207871i;

    /* JADX INFO: renamed from: j */
    private final C22417a f207872j;

    /* JADX INFO: renamed from: k */
    private C22415i f207873k;

    /* JADX INFO: renamed from: l */
    private final C22448g f207874l;

    /* JADX INFO: renamed from: m */
    private String f207875m;

    /* JADX INFO: renamed from: n */
    private C22422a f207876n;

    /* JADX INFO: renamed from: p */
    private boolean f207878p;

    /* JADX INFO: renamed from: b */
    public boolean f207865b = false;

    /* JADX INFO: renamed from: o */
    private int f207877o = 0;

    /* JADX INFO: renamed from: tech.sud.runtime.core.b$a */
    public static class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        C22443b f207886a;

        /* JADX INFO: renamed from: b */
        boolean f207887b;

        private a(C22443b c22443b) {
            this.f207887b = false;
            this.f207886a = c22443b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            final Application application = activity.getApplication();
            C22443b c22443b = this.f207886a;
            if (c22443b == null || !activity.equals(c22443b.f207866d)) {
                return;
            }
            this.f207886a.m221948a(new Runnable() { // from class: tech.sud.runtime.core.b.a.3
                @Override // java.lang.Runnable
                public void run() {
                    C22443b c22443b2 = a.this.f207886a;
                    if (c22443b2 != null && !c22443b2.f207865b) {
                        c22443b2.m221946a();
                        a.this.f207886a = null;
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
            C22443b c22443b = this.f207886a;
            if (c22443b == null || !activity.equals(c22443b.f207866d)) {
                return;
            }
            this.f207886a.m221948a(new Runnable() { // from class: tech.sud.runtime.core.b.a.2
                @Override // java.lang.Runnable
                public void run() {
                    C22435f.m221860e("SudNative", "J: onActivityPaused");
                    a aVar = a.this;
                    C22443b c22443b2 = aVar.f207886a;
                    if (c22443b2 != null && !aVar.f207887b) {
                        c22443b2.m221957g();
                    }
                    a.this.f207887b = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C22443b c22443b = this.f207886a;
            if (c22443b == null || !activity.equals(c22443b.f207866d)) {
                return;
            }
            this.f207886a.m221948a(new Runnable() { // from class: tech.sud.runtime.core.b.a.1
                @Override // java.lang.Runnable
                public void run() {
                    C22435f.m221860e("SudNative", "J: onActivityResumed");
                    a aVar = a.this;
                    C22443b c22443b2 = aVar.f207886a;
                    if (c22443b2 != null && aVar.f207887b) {
                        c22443b2.m221956f();
                    }
                    a.this.f207887b = false;
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

    public C22443b(Activity activity, C22448g c22448g, HashMap<String, String> map, C22417a c22417a) {
        int i;
        C22443b c22443b = f207863c;
        if (c22443b != null && !c22443b.f207865b) {
            C22435f.m221860e("SudNative", "J: NativePlayer _currentNativePlayer != null");
            f207863c.m221946a();
        }
        f207863c = this;
        this.f207874l = c22448g;
        this.f207866d = activity;
        this.f207875m = activity.getFilesDir().getAbsolutePath();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        String value = "";
        boolean z = false;
        boolean z2 = false;
        boolean zM221936b = false;
        int iM221932a = 0;
        boolean zM221936b2 = false;
        boolean zM221936b3 = false;
        boolean zM221936b4 = false;
        boolean zM221936b5 = false;
        boolean z3 = false;
        boolean zEquals = false;
        boolean zM221936b6 = true;
        boolean zM221936b7 = true;
        Integer numValueOf = null;
        int iM221932a2 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (zM221936b6) {
                    a aVar = new a();
                    this.f207867e = aVar;
                    activity.getApplication().registerActivityLifecycleCallbacks(aVar);
                } else {
                    this.f207867e = null;
                }
                Context contextM221954d = m221954d();
                String packageName = contextM221954d.getPackageName();
                this.f207874l.m221990a("app.id", packageName);
                try {
                    PackageManager packageManager = contextM221954d.getPackageManager();
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                        this.f207874l.m221990a("app.verName", packageInfo.versionName);
                        this.f207874l.m221990a("app.verCode", Integer.toString(packageInfo.versionCode));
                        i = 0;
                        try {
                            this.f207874l.m221990a("app.name", packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i = 0;
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    i = 0;
                }
                this.f207872j = c22417a;
                if (!c22417a.m221742a("@enableConsole")) {
                    c22417a.m221741a("@enableConsole", new InterfaceC22400a.a() { // from class: tech.sud.runtime.core.b.1
                        @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
                        /* JADX INFO: renamed from: a */
                        public void mo95422a(String str) {
                            C22443b.this.m221947a(str.equals("true") ? C22443b.this.f207864a : null);
                        }
                    });
                }
                m221955e();
                int i2 = iM221932a | (zM221936b2 ? 16 : i) | (zM221936b3 ? 2 : i) | (zM221936b4 ? 64 : i);
                int i3 = z3 ? 128 : i;
                C22435f.m221856b("SudNative", "NativePlayer AdapterLayout");
                this.f207864a = new C22442a(activity, i2 | i3, this.f207874l, zM221936b, iM221932a2, value, c22417a, numValueOf);
                this.f207868f = new C22406a(activity);
                this.f207869g = new C22412f(this.f207874l, activity);
                if (zM221936b5 && zM221936b7) {
                    m221947a(this.f207864a);
                }
                this.f207870h = new C22411e(activity);
                this.f207873k = new C22415i(this);
                if (zEquals) {
                    return;
                }
                this.f207871i = new C22407a(this.f207874l, activity);
                return;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            key.getClass();
            switch (key) {
                case "fps.logTime":
                    iM221932a2 = m221932a(next.getValue());
                    break;
                case "activityLifecycle":
                    zM221936b6 = m221936b(next.getValue());
                    break;
                case "transparent":
                    if (!z) {
                        iM221932a = m221932a(next.getValue()) & 15;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "jsConsole":
                    zM221936b5 = m221936b(next.getValue());
                    this.f207874l.m221990a(key, next.getValue());
                    break;
                case "useCutout":
                    zM221936b4 = m221936b(next.getValue());
                    break;
                case "cachePath":
                    this.f207875m = next.getValue();
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
                    this.f207878p = m221936b(next.getValue());
                    break;
                case "fullscreen":
                    zM221936b3 = m221936b(next.getValue());
                    z2 = true;
                    break;
                case "immersiveMode":
                    zM221936b2 = m221936b(next.getValue());
                    if (!z2) {
                        zM221936b3 = zM221936b2;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "disableAudioFocus":
                    zEquals = "true".equals(next.getValue());
                    break;
                case "jsConsole.autoCreate":
                    zM221936b7 = m221936b(next.getValue());
                    break;
                case "fps.show":
                    zM221936b = m221936b(next.getValue());
                    break;
                case "sud.frameworkVersion":
                    value = next.getValue();
                    break;
                case "runtime.mode":
                    m221932a(next.getValue());
                    this.f207874l.m221990a(key, next.getValue());
                    z = true;
                    iM221932a = 3;
                    break;
                case "sysUIVis":
                    z3 = !m221936b(next.getValue());
                    break;
                default:
                    this.f207874l.m221990a(key, next.getValue());
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m221936b(String str) {
        if (str.compareToIgnoreCase("YES") == 0 || str.compareToIgnoreCase("TRUE") == 0) {
            return true;
        }
        try {
            return Integer.parseInt(str) != 0;
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    private void m221943j() {
        if (f207863c == null) {
            return;
        }
        C22435f.m221856b("SudNative", "J: Begin destroy NativePlayer");
        m221944k();
        this.f207864a.m221929h();
        this.f207872j.m221739a();
        C22422a c22422a = this.f207876n;
        if (c22422a != null) {
            c22422a.m221803c();
            this.f207876n = null;
        }
        C22411e c22411e = this.f207870h;
        if (c22411e != null) {
            c22411e.m221690a(this.f207866d);
            this.f207870h = null;
        }
        C22412f c22412f = this.f207869g;
        if (c22412f != null) {
            c22412f.m221698a(this.f207866d);
            this.f207869g = null;
        }
        C22415i c22415i = this.f207873k;
        if (c22415i != null) {
            c22415i.m221725a();
            this.f207873k = null;
        }
        C22407a c22407a = this.f207871i;
        if (c22407a != null) {
            c22407a.m221615a();
            this.f207871i = null;
        }
        this.f207874l.m221983a();
        try {
            if (this.f207867e != null) {
                this.f207866d.getApplication().unregisterActivityLifecycleCallbacks(this.f207867e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this == f207863c) {
            f207863c = null;
        }
        C22435f.m221856b("SudNative", "J: End destroy NativePlayer");
        ViewParent parent = this.f207864a.getParent();
        boolean z = parent instanceof ViewGroup;
        C22442a c22442a = this.f207864a;
        if (z) {
            ((ViewGroup) parent).removeView(c22442a);
        } else {
            c22442a.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m221944k() {
        C22406a c22406a = this.f207868f;
        if (c22406a != null) {
            c22406a.m221612a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m221945l() {
        m221944k();
    }

    /* JADX INFO: renamed from: a */
    public void m221947a(FrameLayout frameLayout) {
        C22422a c22422a = this.f207876n;
        if (c22422a == null && frameLayout != null) {
            C22422a c22422a2 = new C22422a(this.f207866d, frameLayout);
            this.f207876n = c22422a2;
            c22422a2.m221802b();
        } else {
            if (c22422a == null || frameLayout != null) {
                return;
            }
            c22422a.m221802b();
            ((FrameLayout) this.f207876n.getParent()).removeView(this.f207876n);
            this.f207876n.m221803c();
            this.f207876n = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public Context m221954d() {
        return m221953c();
    }

    /* JADX INFO: renamed from: e */
    public void m221955e() {
        this.f207874l.m221991a(this, this.f207866d.getResources().getAssets(), this.f207875m);
    }

    public Object emit(final int i, final int i2, final int i3, final String str) {
        if (i == 1) {
            this.f207874l.m221993b().m221808a();
        } else {
            if (i != 18) {
                if (i == 26) {
                    this.f207864a.m221926e().mo221960a().m221971a(i2);
                    return null;
                }
                switch (i) {
                    case 29:
                        return C22409c.m221621a((Context) this.f207866d);
                    case 30:
                        if (C22409c.m221627a((Context) this.f207866d, str)) {
                            return Boolean.TRUE;
                        }
                        return null;
                    case 31:
                        return C22409c.m221628b(this.f207866d);
                    default:
                        switch (i) {
                            case 33:
                                return "" + ((int) (C22409c.m221620a(this.f207866d) * 10000.0f));
                            case 34:
                                if (this.f207870h.m221691a()) {
                                    return Boolean.TRUE;
                                }
                                return null;
                            case 35:
                                return "" + C22412f.m221695b(this.f207866d);
                            default:
                                switch (i) {
                                    case 37:
                                        if (i2 != 1) {
                                            return null;
                                        }
                                        return new C22429g(this.f207874l);
                                    case 38:
                                        return this.f207874l.m221993b().m221811b(str);
                                    case 39:
                                        this.f207874l.m221993b().m221809a(i2);
                                        return null;
                                }
                        }
                }
            }
            this.f207864a.m221924c().m222024a(true);
        }
        m221948a(new Runnable() { // from class: tech.sud.runtime.core.b.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int i4 = i;
                    if (i4 == 27) {
                        C22409c.m221625a(C22443b.this.f207866d, i2 != 0);
                        return;
                    }
                    if (i4 == 28) {
                        C22409c.m221626a((Context) C22443b.this.f207866d, i2);
                        return;
                    }
                    if (i4 == 32) {
                        C22409c.m221622a(C22443b.this.f207866d, i2 * 1.0E-4f);
                        return;
                    }
                    switch (i4) {
                        case 1:
                            C22443b.this.m221945l();
                            break;
                        case 2:
                            if (C22443b.this.f207868f != null) {
                                C22443b.this.f207868f.m221613a(str);
                            }
                            break;
                        case 3:
                            if (C22443b.this.f207876n != null) {
                                C22443b.this.f207876n.m221801a(str);
                            }
                            break;
                        case 4:
                            if (C22443b.this.f207869g != null) {
                                C22443b.this.f207869g.m221697a();
                            }
                            break;
                        case 5:
                            C22403a c22403aM221930i = C22443b.this.f207864a.m221930i();
                            if (c22403aM221930i != null) {
                                c22403aM221930i.m221598a(true);
                            }
                            break;
                        case 6:
                            JSONArray jSONArray = new JSONArray(str);
                            C22443b.this.f207872j.m221740a(jSONArray.opt(0).toString(), jSONArray.opt(1).toString());
                            break;
                        case 7:
                            C22403a c22403aM221930i2 = C22443b.this.f207864a.m221930i();
                            if (c22403aM221930i2 != null) {
                                c22403aM221930i2.m221597a(i2, str);
                            }
                            break;
                        case 8:
                            C22403a c22403aM221930i3 = C22443b.this.f207864a.m221930i();
                            if (c22403aM221930i3 != null) {
                                c22403aM221930i3.m221596a(i2, i3, str);
                            }
                            break;
                        case 9:
                            if (C22443b.this.f207873k != null) {
                                C22443b.this.f207873k.m221727a(i2, i3);
                            }
                            break;
                        case 10:
                            if (C22443b.this.f207873k != null) {
                                C22443b.this.f207873k.m221726a(i2);
                            }
                            break;
                        case 11:
                            C22443b c22443b = C22443b.this;
                            if (!c22443b.f207865b) {
                                c22443b.f207864a.m221922a().m221874a(C22443b.m221934b(), i2);
                            }
                            break;
                        case 12:
                            C22443b c22443b2 = C22443b.this;
                            if (!c22443b2.f207865b) {
                                c22443b2.f207864a.m221922a().m221870a(i2);
                            }
                            break;
                        case 13:
                            C22443b.this.f207864a.m221922a().m221873a(i2, str);
                            break;
                        case 14:
                            C22443b.this.f207864a.m221922a().m221875b(i2);
                            break;
                        case 15:
                            C22443b.this.f207864a.m221922a().m221876c(i2);
                            break;
                        case 16:
                            C22443b.this.f207864a.m221922a().m221872a(i2, i3);
                            break;
                        case 17:
                            C22443b.this.f207864a.m221922a().m221871a(i2, i3 * 0.01f);
                            break;
                        case 18:
                            C22443b.this.f207864a.m221924c().m222024a(false);
                            JSONArray jSONArray2 = new JSONArray(str);
                            C22443b.this.f207864a.m221923b().m221788a(jSONArray2.opt(0).toString(), i2, (float) jSONArray2.optDouble(1), (float) jSONArray2.optDouble(2), jSONArray2.optBoolean(3));
                            break;
                        case 19:
                            C22443b.this.f207864a.m221923b().m221789b();
                            C22443b.this.m221949a(new Runnable() { // from class: tech.sud.runtime.core.b.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    C22443b.this.f207864a.m221924c().m222025b();
                                }
                            }, 500L);
                            break;
                        case 20:
                            C22443b.this.f207864a.m221923b().m221787a(str, i2);
                            break;
                        case 21:
                            C22443b.this.f207864a.m221923b().m221786a(str);
                            break;
                        case 22:
                            C22443b.this.f207864a.m221925d().m221776a(str);
                            break;
                        case 23:
                            C22443b.this.f207864a.m221925d().m221777b(str);
                            break;
                        case 24:
                            if (C22443b.this.f207878p) {
                                C22409c.m221623a(C22443b.this.f207866d, i2, i3);
                            }
                            break;
                        case 25:
                            if (C22443b.this.f207878p) {
                                C22409c.m221624a(C22443b.this.f207866d, str);
                            }
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {
                    C22435f.m221860e("SudNative", "J: Async emit get: " + e.getMessage());
                }
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m221956f() {
        int i;
        if (f207863c != this || this.f207865b || (i = this.f207877o) == 0) {
            return;
        }
        int i2 = i - 1;
        this.f207877o = i2;
        if (i2 == 0) {
            this.f207864a.m221927f();
            C22415i c22415i = this.f207873k;
            if (c22415i != null) {
                c22415i.m221729c();
            }
            C22407a c22407a = this.f207871i;
            if (c22407a != null) {
                c22407a.m221617c();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m221957g() {
        if (f207863c != this || this.f207865b) {
            return;
        }
        if (this.f207877o == 0) {
            this.f207864a.m221928g();
            C22415i c22415i = this.f207873k;
            if (c22415i != null) {
                c22415i.m221728b();
            }
            C22407a c22407a = this.f207871i;
            if (c22407a != null) {
                c22407a.m221616b();
            }
        }
        this.f207877o++;
    }

    /* JADX INFO: renamed from: h */
    public void m221958h() {
        FileOperation.m221804a(new File(this.f207875m + "/games/"));
    }

    /* JADX INFO: renamed from: i */
    public String[] m221959i() {
        return new String[]{"1.3.0", JNIShell.version(0), JNIShell.version(1)};
    }

    /* JADX INFO: renamed from: c */
    public Activity m221953c() {
        return this.f207866d;
    }

    /* JADX INFO: renamed from: b */
    public static Context m221934b() {
        C22443b c22443b = f207863c;
        if (c22443b == null) {
            return null;
        }
        return c22443b.f207866d;
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
    public void m221952b(String str, String str2) {
        if ("WXAudioInterruption_onChange".equals(str)) {
            this.f207874l.m221994b(13, "1".equals(str2) ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221946a() {
        this.f207865b = true;
        m221943j();
    }

    /* JADX INFO: renamed from: a */
    public static int m221932a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221948a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        C22442a c22442a = this.f207864a;
        if (c22442a == null) {
            this.f207866d.runOnUiThread(runnable);
        } else {
            c22442a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221949a(Runnable runnable, long j) {
        if (j == 0) {
            m221948a(runnable);
        } else {
            this.f207864a.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221950a(String str, String str2) {
        C22417a c22417a = this.f207872j;
        if (c22417a != null) {
            c22417a.m221743b(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221951a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PushService.KEY_COMMAND, str);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
            m221950a("RTGlobalEvent", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }
}
