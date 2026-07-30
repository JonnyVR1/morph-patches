package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.C2076a;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n1r0 extends x0t0 {

    /* JADX INFO: renamed from: H */
    public static final List f136684H = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* JADX INFO: renamed from: I */
    public static final List f136685I = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* JADX INFO: renamed from: J */
    public static final List f136686J = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* JADX INFO: renamed from: K */
    public static final List f136687K = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* JADX INFO: renamed from: A */
    public final List f136688A;

    /* JADX INFO: renamed from: B */
    public final List f136689B;

    /* JADX INFO: renamed from: C */
    public final List f136690C;

    /* JADX INFO: renamed from: G */
    public final z8s0 f136694G;

    /* JADX INFO: renamed from: a */
    public final xbt0 f136695a;

    /* JADX INFO: renamed from: b */
    public Context f136696b;

    /* JADX INFO: renamed from: c */
    public final ptr0 f136697c;

    /* JADX INFO: renamed from: d */
    public final myv0 f136698d;

    /* JADX INFO: renamed from: e */
    public final mzv0 f136699e;

    /* JADX INFO: renamed from: g */
    public final rmw0 f136701g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f136702h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public zzbxr f136703i;

    /* JADX INFO: renamed from: m */
    public final C2076a f136707m;

    /* JADX INFO: renamed from: n */
    public final wnu0 f136708n;

    /* JADX INFO: renamed from: o */
    public final s5w0 f136709o;

    /* JADX INFO: renamed from: w */
    public final zzcei f136717w;

    /* JADX INFO: renamed from: x */
    public String f136718x;

    /* JADX INFO: renamed from: z */
    public final List f136720z;

    /* JADX INFO: renamed from: f */
    public mnu0 f136700f = null;

    /* JADX INFO: renamed from: j */
    public Point f136704j = new Point();

    /* JADX INFO: renamed from: k */
    public Point f136705k = new Point();

    /* JADX INFO: renamed from: l */
    public final Set f136706l = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: v */
    public final AtomicInteger f136716v = new AtomicInteger(0);

    /* JADX INFO: renamed from: D */
    public final AtomicBoolean f136691D = new AtomicBoolean(false);

    /* JADX INFO: renamed from: E */
    public final AtomicBoolean f136692E = new AtomicBoolean(false);

    /* JADX INFO: renamed from: F */
    public final AtomicInteger f136693F = new AtomicInteger(0);

    /* JADX INFO: renamed from: p */
    public final boolean f136710p = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132307l7)).booleanValue();

    /* JADX INFO: renamed from: q */
    public final boolean f136711q = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132294k7)).booleanValue();

    /* JADX INFO: renamed from: r */
    public final boolean f136712r = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132333n7)).booleanValue();

    /* JADX INFO: renamed from: s */
    public final boolean f136713s = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132359p7)).booleanValue();

    /* JADX INFO: renamed from: t */
    public final String f136714t = (String) d1s0.m109677c().m144697a(m7s0.f132346o7);

    /* JADX INFO: renamed from: u */
    public final String f136715u = (String) d1s0.m109677c().m144697a(m7s0.f132372q7);

    /* JADX INFO: renamed from: y */
    public final String f136719y = (String) d1s0.m109677c().m144697a(m7s0.f132385r7);

    public n1r0(xbt0 xbt0Var, Context context, ptr0 ptr0Var, mzv0 mzv0Var, rmw0 rmw0Var, ScheduledExecutorService scheduledExecutorService, wnu0 wnu0Var, s5w0 s5w0Var, zzcei zzceiVar, z8s0 z8s0Var, myv0 myv0Var) {
        List listM157466R8;
        this.f136695a = xbt0Var;
        this.f136696b = context;
        this.f136697c = ptr0Var;
        this.f136698d = myv0Var;
        this.f136699e = mzv0Var;
        this.f136701g = rmw0Var;
        this.f136702h = scheduledExecutorService;
        this.f136707m = xbt0Var.mo135808s();
        this.f136708n = wnu0Var;
        this.f136709o = s5w0Var;
        this.f136717w = zzceiVar;
        this.f136694G = z8s0Var;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132398s7)).booleanValue()) {
            this.f136720z = m157466R8((String) d1s0.m109677c().m144697a(m7s0.f132410t7));
            this.f136688A = m157466R8((String) d1s0.m109677c().m144697a(m7s0.f132422u7));
            this.f136689B = m157466R8((String) d1s0.m109677c().m144697a(m7s0.f132434v7));
            listM157466R8 = m157466R8((String) d1s0.m109677c().m144697a(m7s0.f132446w7));
        } else {
            this.f136720z = f136684H;
            this.f136688A = f136685I;
            this.f136689B = f136686J;
            listM157466R8 = f136687K;
        }
        this.f136690C = listM157466R8;
    }

    /* JADX INFO: renamed from: I8 */
    public static final /* synthetic */ Uri m157462I8(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m157465Q8(uri, "nas", str) : uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L8 */
    public final void m157463L8() {
        n1r0 n1r0Var;
        gnr gnrVarMo116597c;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131867Ba)).booleanValue()) {
            gnrVarMo116597c = jmw0.m142238k(new qlw0() { // from class: l.lkx0
                @Override // p149l.qlw0
                public final gnr zza() {
                    return this.f128616a.m157503c9();
                }
            }, i3t0.f111372a);
            n1r0Var = this;
        } else {
            n1r0Var = this;
            gnrVarMo116597c = n1r0Var.m157493J8(this.f136696b, null, AdFormat.BANNER.name(), null, null).mo116597c();
        }
        jmw0.m142245r(gnrVarMo116597c, new dxy0(n1r0Var), n1r0Var.f136695a.mo135794c());
    }

    /* JADX INFO: renamed from: O8 */
    public static boolean m157464O8(@NonNull Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q8 */
    public static final Uri m157465Q8(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(string.substring(0, i) + str + "=" + str2 + "&" + string.substring(i));
    }

    /* JADX INFO: renamed from: R8 */
    public static final List m157466R8(String str) {
        String[] strArrSplit = TextUtils.split(str, Constants.SEPARATOR_COMMA);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!yfw0.m214596d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S4 */
    private final void m157467S4() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132361p9)).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132400s9)).booleanValue()) {
                return;
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132448w9)).booleanValue() && this.f136691D.getAndSet(true)) {
                return;
            }
            m157463L8();
        }
    }

    /* JADX INFO: renamed from: Z8 */
    public static /* bridge */ /* synthetic */ w4w0 m157473Z8(gnr gnrVar, zzccx zzccxVar) {
        if (!b5w0.m100343a() || !((Boolean) l9s0.f127144e.m115379e()).booleanValue()) {
            return null;
        }
        try {
            w4w0 w4w0VarMo116596b = ((l9x0) jmw0.m142243p(gnrVar)).mo116596b();
            w4w0VarMo116596b.m201586d(new ArrayList(Collections.singletonList(zzccxVar.zzb)));
            zzl zzlVar = zzccxVar.zzd;
            w4w0VarMo116596b.m201584b(zzlVar == null ? "" : zzlVar.zzp);
            return w4w0VarMo116596b;
        } catch (ExecutionException e) {
            vny0.m199079q().m212290w(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* JADX INFO: renamed from: x8 */
    public static /* bridge */ /* synthetic */ void m157484x8(n1r0 n1r0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (n1r0Var.m157491G8((Uri) it.next())) {
                n1r0Var.f136716v.getAndIncrement();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: z8 */
    public static /* bridge */ /* synthetic */ void m157486z8(final n1r0 n1r0Var, final String str, final String str2, final mnu0 mnu0Var) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132127X6)).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132203d7)).booleanValue()) {
                i3t0.f111372a.execute(new Runnable() { // from class: l.mux0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f135851a.m157488B8(str, str2, mnu0Var);
                    }
                });
            } else {
                n1r0Var.f136707m.m12359d(str, str2, mnu0Var);
            }
        }
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ void m157487A8(kiu0[] kiu0VarArr) {
        kiu0 kiu0Var = kiu0VarArr[0];
        if (kiu0Var != null) {
            this.f136699e.m157172b(jmw0.m142235h(kiu0Var));
        }
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m157488B8(String str, String str2, mnu0 mnu0Var) {
        this.f136707m.m12359d(str, str2, mnu0Var);
    }

    @Override // p149l.y0t0
    /* JADX INFO: renamed from: C */
    public final void mo157489C(uyl uylVar) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131888D7)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) s050.m181847P2(uylVar);
            zzbxr zzbxrVar = this.f136703i;
            this.f136704j = xus0.m211184a(motionEvent, zzbxrVar == null ? null : zzbxrVar.zza);
            if (motionEvent.getAction() == 0) {
                this.f136705k = this.f136704j;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f136704j;
            motionEventObtain.setLocation(point.x, point.y);
            this.f136697c.m171379d(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // p149l.y0t0
    @SuppressLint({"AddJavascriptInterface"})
    /* JADX INFO: renamed from: E */
    public final void mo157490E(uyl uylVar) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132348o9)).booleanValue()) {
            x6s0 x6s0Var = m7s0.f131864B7;
            if (!((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue()) {
                m157467S4();
            }
            WebView webView = (WebView) s050.m181847P2(uylVar);
            if (webView == null) {
                x2t0.m206866d("The webView cannot be null.");
                return;
            }
            if (this.f136706l.contains(webView)) {
                x2t0.m206868f("This webview has already been registered.");
                return;
            }
            this.f136706l.add(webView);
            webView.addJavascriptInterface(new ouh0(webView, this.f136697c, this.f136708n, this.f136709o, this.f136698d), "gmaSdk");
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132472y9)).booleanValue()) {
                vny0.m199079q().m212286s();
            }
            if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue()) {
                m157467S4();
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: G8 */
    public final boolean m157491G8(@NonNull Uri uri) {
        return m157464O8(uri, this.f136720z, this.f136688A);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: H8 */
    public final boolean m157492H8(@NonNull Uri uri) {
        return m157464O8(uri, this.f136689B, this.f136690C);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX INFO: renamed from: J8 */
    public final l9x0 m157493J8(Context context, String str, String str2, zzq zzqVar, zzl zzlVar) {
        gyv0 gyv0Var = new gyv0();
        if ("REWARDED".equals(str2)) {
            gyv0Var.m128754F().m171957a(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            gyv0Var.m128754F().m171957a(3);
        }
        biw0 biw0VarMo135809t = this.f136695a.mo135809t();
        kwt0 kwt0Var = new kwt0();
        kwt0Var.m147644e(context);
        if (str == null) {
            str = "adUnitId";
        }
        gyv0Var.m128758J(str);
        if (zzlVar == null) {
            zzlVar = new o4y0().m162735a();
        }
        gyv0Var.m128770e(zzlVar);
        if (zzqVar == null) {
            switch (str2) {
                case "NATIVE":
                    zzqVar = zzq.m12253H();
                    break;
                case "APP_OPEN_AD":
                    zzqVar = zzq.m12252F();
                    break;
                case "REWARDED":
                case "REWARDED_INTERSTITIAL":
                    zzqVar = zzq.m12254I();
                    break;
                case "BANNER":
                    zzqVar = new zzq(context, a80.f67968i);
                    break;
                default:
                    zzqVar = new zzq();
                    break;
            }
        }
        gyv0Var.m128757I(zzqVar);
        gyv0Var.m128763O(true);
        kwt0Var.m147648i(gyv0Var.m128772g());
        biw0VarMo135809t.mo102125b(kwt0Var.m147649j());
        h4r0 h4r0Var = new h4r0();
        h4r0Var.m129279a(str2);
        biw0VarMo135809t.mo102124a(new e7r0(h4r0Var, null));
        new f4u0();
        l9x0 l9x0VarZzc = biw0VarMo135809t.zzc();
        this.f136700f = l9x0VarZzc.mo116595a();
        return l9x0VarZzc;
    }

    /* JADX INFO: renamed from: K8 */
    public final gnr m157494K8(final String str) {
        final kiu0[] kiu0VarArr = new kiu0[1];
        gnr gnrVarM142241n = jmw0.m142241n(this.f136699e.m157171a(), new rlw0() { // from class: l.qzx0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f157118a.m157504d9(kiu0VarArr, str, (kiu0) obj);
            }
        }, this.f136701g);
        gnrVarM142241n.addListener(new Runnable() { // from class: l.q4y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f152685a.m157487A8(kiu0VarArr);
            }
        }, this.f136701g);
        return jmw0.m142232e(jmw0.m142240m((amw0) jmw0.m142242o(amw0.m97696C(gnrVarM142241n), ((Integer) d1s0.m109677c().m144697a(m7s0.f131900E7)).intValue(), TimeUnit.MILLISECONDS, this.f136702h), new yew0() { // from class: l.ily0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                List list = n1r0.f136684H;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f136701g), Exception.class, new yew0() { // from class: l.ony0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                List list = n1r0.f136684H;
                x2t0.m206867e("", (Exception) obj);
                return null;
            }
        }, this.f136701g);
    }

    /* JADX INFO: renamed from: M8 */
    public final void m157495M8(List list, final uyl uylVar, jts0 jts0Var, boolean z) {
        gnr gnrVarMo122102R;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131888D7)).booleanValue()) {
            x2t0.m206869g("The updating URL feature is not enabled.");
            try {
                jts0Var.mo132940c("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                x2t0.m206867e("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (m157491G8((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            x2t0.m206869g("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (m157491G8(uri)) {
                gnrVarMo122102R = this.f136701g.mo122102R(new Callable() { // from class: l.c8y0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f79829a.m157499U8(uri, uylVar);
                    }
                });
                if (m157497P8()) {
                    gnrVarMo122102R = jmw0.m142241n(gnrVarMo122102R, new rlw0() { // from class: l.tby0
                        @Override // p149l.rlw0
                        public final gnr zza(Object obj) {
                            n1r0 n1r0Var = this.f169368a;
                            return jmw0.m142240m(n1r0Var.m157494K8("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new yew0() { // from class: l.ffy0
                                @Override // p149l.yew0
                                public final Object apply(Object obj2) {
                                    return n1r0.m157462I8(uri, (String) obj2);
                                }
                            }, n1r0Var.f136701g);
                        }
                    }, this.f136701g);
                } else {
                    x2t0.m206868f("Asset view map is empty.");
                }
            } else {
                x2t0.m206869g("Not a Google URL: ".concat(String.valueOf(uri)));
                gnrVarMo122102R = jmw0.m142235h(uri);
            }
            arrayList.add(gnrVarMo122102R);
        }
        jmw0.m142245r(jmw0.m142231d(arrayList), new rvy0(this, jts0Var, z), this.f136695a.mo135794c());
    }

    /* JADX INFO: renamed from: N8 */
    public final void m157496N8(final List list, final uyl uylVar, jts0 jts0Var, boolean z) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131888D7)).booleanValue()) {
            try {
                jts0Var.mo132940c("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                x2t0.m206867e("", e);
                return;
            }
        }
        gnr gnrVarMo122102R = this.f136701g.mo122102R(new Callable() { // from class: l.epy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f92726a.m157510s8(list, uylVar);
            }
        });
        if (m157497P8()) {
            gnrVarMo122102R = jmw0.m142241n(gnrVarMo122102R, new rlw0() { // from class: l.xqy0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    return this.f194061a.m157505e9((ArrayList) obj);
                }
            }, this.f136701g);
        } else {
            x2t0.m206868f("Asset view map is empty.");
        }
        jmw0.m142245r(gnrVarMo122102R, new zty0(this, jts0Var, z), this.f136695a.mo135794c());
    }

    /* JADX INFO: renamed from: P8 */
    public final boolean m157497P8() {
        Map map;
        zzbxr zzbxrVar = this.f136703i;
        return (zzbxrVar == null || (map = zzbxrVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    @Override // p149l.y0t0
    /* JADX INFO: renamed from: U1 */
    public final void mo157498U1(List list, uyl uylVar, jts0 jts0Var) {
        m157495M8(list, uylVar, jts0Var, false);
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ Uri m157499U8(Uri uri, uyl uylVar) throws Exception {
        myv0 myv0Var;
        try {
            uri = (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132389rb)).booleanValue() || (myv0Var = this.f136698d) == null) ? this.f136697c.m171376a(uri, this.f136696b, (View) s050.m181847P2(uylVar), null) : myv0Var.m157092a(uri, this.f136696b, (View) s050.m181847P2(uylVar), null);
        } catch (zzavj e) {
            x2t0.m206870h("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        whq0.m203241a("Failed to append spam signals to click url.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0069  */
    /* JADX WARN: Code duplicated, block: B:12:0x007b  */
    /* JADX WARN: Code duplicated, block: B:13:0x008e  */
    @Override // p149l.y0t0
    /* JADX INFO: renamed from: W6 */
    public final void mo157500W6(uyl uylVar, final zzccx zzccxVar, v0t0 v0t0Var) {
        gnr gnrVarMo116597c;
        gnr gnrVarMo122102R;
        Context context = (Context) s050.m181847P2(uylVar);
        this.f136696b = context;
        l4w0 l4w0VarM144514a = k4w0.m144514a(context, 22);
        l4w0VarM144514a.zzh();
        if ("UNKNOWN".equals(zzccxVar.zzb)) {
            List arrayList = new ArrayList();
            x6s0 x6s0Var = m7s0.f131876C7;
            if (!((String) d1s0.m109677c().m144697a(x6s0Var)).isEmpty()) {
                arrayList = Arrays.asList(((String) d1s0.m109677c().m144697a(x6s0Var)).split(Constants.SEPARATOR_COMMA));
            }
            if (arrayList.contains(kpv0.m146888b(zzccxVar.zzd))) {
                gnr gnrVarM142234g = jmw0.m142234g(new IllegalArgumentException("Unknown format is no longer supported."));
                gnrVarMo116597c = jmw0.m142234g(new IllegalArgumentException("Unknown format is no longer supported."));
                gnrVarMo122102R = gnrVarM142234g;
            } else {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131867Ba)).booleanValue()) {
                    rmw0 rmw0Var = i3t0.f111372a;
                    gnrVarMo122102R = rmw0Var.mo122102R(new Callable() { // from class: l.thy0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f170338a.m157501Y8(zzccxVar);
                        }
                    });
                    gnrVarMo116597c = jmw0.m142241n(gnrVarMo122102R, new rlw0() { // from class: l.tjy0
                        @Override // p149l.rlw0
                        public final gnr zza(Object obj) {
                            return ((l9x0) obj).mo116597c();
                        }
                    }, rmw0Var);
                } else {
                    l9x0 l9x0VarM157493J8 = m157493J8(this.f136696b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
                    gnr gnrVarM142235h = jmw0.m142235h(l9x0VarM157493J8);
                    gnrVarMo116597c = l9x0VarM157493J8.mo116597c();
                    gnrVarMo122102R = gnrVarM142235h;
                }
            }
        } else {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131867Ba)).booleanValue()) {
                rmw0 rmw0Var2 = i3t0.f111372a;
                gnrVarMo122102R = rmw0Var2.mo122102R(new Callable() { // from class: l.thy0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f170338a.m157501Y8(zzccxVar);
                    }
                });
                gnrVarMo116597c = jmw0.m142241n(gnrVarMo122102R, new rlw0() { // from class: l.tjy0
                    @Override // p149l.rlw0
                    public final gnr zza(Object obj) {
                        return ((l9x0) obj).mo116597c();
                    }
                }, rmw0Var2);
            } else {
                l9x0 l9x0VarM157493J9 = m157493J8(this.f136696b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
                gnr gnrVarM142235h2 = jmw0.m142235h(l9x0VarM157493J9);
                gnrVarMo116597c = l9x0VarM157493J9.mo116597c();
                gnrVarMo122102R = gnrVarM142235h2;
            }
        }
        jmw0.m142245r(gnrVarMo116597c, new jsy0(this, gnrVarMo122102R, zzccxVar, v0t0Var, l4w0VarM144514a, vny0.m199064b().currentTimeMillis()), this.f136695a.mo135794c());
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ l9x0 m157501Y8(zzccx zzccxVar) throws Exception {
        return m157493J8(this.f136696b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
    }

    @Override // p149l.y0t0
    /* JADX INFO: renamed from: Z2 */
    public final void mo157502Z2(List list, uyl uylVar, jts0 jts0Var) {
        m157495M8(list, uylVar, jts0Var, true);
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ gnr m157503c9() throws Exception {
        return m157493J8(this.f136696b, null, AdFormat.BANNER.name(), null, null).mo116597c();
    }

    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ gnr m157504d9(kiu0[] kiu0VarArr, String str, kiu0 kiu0Var) throws Exception {
        kiu0VarArr[0] = kiu0Var;
        Context context = this.f136696b;
        zzbxr zzbxrVar = this.f136703i;
        Map map = zzbxrVar.zzb;
        JSONObject jSONObjectM211187d = xus0.m211187d(context, map, map, zzbxrVar.zza, null);
        JSONObject jSONObjectM211190g = xus0.m211190g(this.f136696b, this.f136703i.zza);
        JSONObject jSONObjectM211189f = xus0.m211189f(this.f136703i.zza);
        JSONObject jSONObjectM211188e = xus0.m211188e(this.f136696b, this.f136703i.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectM211187d);
        jSONObject.put("ad_view_signal", jSONObjectM211190g);
        jSONObject.put("scroll_view_signal", jSONObjectM211189f);
        jSONObject.put("lock_screen_signal", jSONObjectM211188e);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", xus0.m211186c(null, this.f136696b, this.f136705k, this.f136704j));
        }
        return kiu0Var.m146139d(str, jSONObject);
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ gnr m157505e9(final ArrayList arrayList) throws Exception {
        return jmw0.m142240m(m157494K8("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new yew0() { // from class: l.ipx0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return this.f114360a.m157509r8(arrayList, (String) obj);
            }
        }, this.f136701g);
    }

    @Override // p149l.y0t0
    /* JADX INFO: renamed from: n2 */
    public final void mo157506n2(List list, uyl uylVar, jts0 jts0Var) {
        m157496N8(list, uylVar, jts0Var, false);
    }

    @Override // p149l.y0t0
    /* JADX INFO: renamed from: o3 */
    public final void mo157507o3(List list, uyl uylVar, jts0 jts0Var) {
        m157496N8(list, uylVar, jts0Var, true);
    }

    @Override // p149l.y0t0
    /* JADX INFO: renamed from: p1 */
    public final void mo157508p1(zzbxr zzbxrVar) {
        this.f136703i = zzbxrVar;
        this.f136699e.m157173c(1);
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ ArrayList m157509r8(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!m157492H8(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(m157465Q8(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ ArrayList m157510s8(List list, uyl uylVar) throws Exception {
        this.f136697c.m171378c();
        String strMo136911h = this.f136697c.m171378c().mo136911h(this.f136696b, (View) s050.m181847P2(uylVar), null);
        if (TextUtils.isEmpty(strMo136911h)) {
            whq0.m203241a("Failed to get view signals.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (m157492H8(uri)) {
                arrayList.add(m157465Q8(uri, "ms", strMo136911h));
            } else {
                x2t0.m206869g("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        whq0.m203241a("Empty impression URLs result.");
        return null;
    }

    @Override // p149l.y0t0
    /* JADX INFO: renamed from: t5 */
    public final uyl mo157511t5(uyl uylVar, uyl uylVar2, String str, uyl uylVar3) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132484z9)).booleanValue()) {
            return s050.m181848Y2(null);
        }
        this.f136694G.m217629g((Context) s050.m181847P2(uylVar), (gyb) s050.m181847P2(uylVar2), str, (fyb) s050.m181847P2(uylVar3));
        return s050.m181848Y2(this.f136694G.m217625b());
    }
}
