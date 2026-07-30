package p153l;

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
import com.google.android.gms.ads.nonagon.signalgeneration.C2099a;
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
public final class tar0 extends dat0 {

    /* JADX INFO: renamed from: H */
    public static final List f172761H = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* JADX INFO: renamed from: I */
    public static final List f172762I = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* JADX INFO: renamed from: J */
    public static final List f172763J = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* JADX INFO: renamed from: K */
    public static final List f172764K = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* JADX INFO: renamed from: A */
    public final List f172765A;

    /* JADX INFO: renamed from: B */
    public final List f172766B;

    /* JADX INFO: renamed from: C */
    public final List f172767C;

    /* JADX INFO: renamed from: G */
    public final fis0 f172771G;

    /* JADX INFO: renamed from: a */
    public final dlt0 f172772a;

    /* JADX INFO: renamed from: b */
    public Context f172773b;

    /* JADX INFO: renamed from: c */
    public final v2s0 f172774c;

    /* JADX INFO: renamed from: d */
    public final s7w0 f172775d;

    /* JADX INFO: renamed from: e */
    public final s8w0 f172776e;

    /* JADX INFO: renamed from: g */
    public final xvw0 f172778g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f172779h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public zzbxr f172780i;

    /* JADX INFO: renamed from: m */
    public final C2099a f172784m;

    /* JADX INFO: renamed from: n */
    public final cxu0 f172785n;

    /* JADX INFO: renamed from: o */
    public final yew0 f172786o;

    /* JADX INFO: renamed from: w */
    public final zzcei f172794w;

    /* JADX INFO: renamed from: x */
    public String f172795x;

    /* JADX INFO: renamed from: z */
    public final List f172797z;

    /* JADX INFO: renamed from: f */
    public swu0 f172777f = null;

    /* JADX INFO: renamed from: j */
    public Point f172781j = new Point();

    /* JADX INFO: renamed from: k */
    public Point f172782k = new Point();

    /* JADX INFO: renamed from: l */
    public final Set f172783l = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: v */
    public final AtomicInteger f172793v = new AtomicInteger(0);

    /* JADX INFO: renamed from: D */
    public final AtomicBoolean f172768D = new AtomicBoolean(false);

    /* JADX INFO: renamed from: E */
    public final AtomicBoolean f172769E = new AtomicBoolean(false);

    /* JADX INFO: renamed from: F */
    public final AtomicInteger f172770F = new AtomicInteger(0);

    /* JADX INFO: renamed from: p */
    public final boolean f172787p = ((Boolean) jas0.m144075c().m176505a(sgs0.f168378l7)).booleanValue();

    /* JADX INFO: renamed from: q */
    public final boolean f172788q = ((Boolean) jas0.m144075c().m176505a(sgs0.f168365k7)).booleanValue();

    /* JADX INFO: renamed from: r */
    public final boolean f172789r = ((Boolean) jas0.m144075c().m176505a(sgs0.f168404n7)).booleanValue();

    /* JADX INFO: renamed from: s */
    public final boolean f172790s = ((Boolean) jas0.m144075c().m176505a(sgs0.f168430p7)).booleanValue();

    /* JADX INFO: renamed from: t */
    public final String f172791t = (String) jas0.m144075c().m176505a(sgs0.f168417o7);

    /* JADX INFO: renamed from: u */
    public final String f172792u = (String) jas0.m144075c().m176505a(sgs0.f168443q7);

    /* JADX INFO: renamed from: y */
    public final String f172796y = (String) jas0.m144075c().m176505a(sgs0.f168456r7);

    public tar0(dlt0 dlt0Var, Context context, v2s0 v2s0Var, s8w0 s8w0Var, xvw0 xvw0Var, ScheduledExecutorService scheduledExecutorService, cxu0 cxu0Var, yew0 yew0Var, zzcei zzceiVar, fis0 fis0Var, s7w0 s7w0Var) {
        List listM189923R8;
        this.f172772a = dlt0Var;
        this.f172773b = context;
        this.f172774c = v2s0Var;
        this.f172775d = s7w0Var;
        this.f172776e = s8w0Var;
        this.f172778g = xvw0Var;
        this.f172779h = scheduledExecutorService;
        this.f172784m = dlt0Var.mo116885s();
        this.f172785n = cxu0Var;
        this.f172786o = yew0Var;
        this.f172794w = zzceiVar;
        this.f172771G = fis0Var;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168469s7)).booleanValue()) {
            this.f172797z = m189923R8((String) jas0.m144075c().m176505a(sgs0.f168481t7));
            this.f172765A = m189923R8((String) jas0.m144075c().m176505a(sgs0.f168493u7));
            this.f172766B = m189923R8((String) jas0.m144075c().m176505a(sgs0.f168505v7));
            listM189923R8 = m189923R8((String) jas0.m144075c().m176505a(sgs0.f168517w7));
        } else {
            this.f172797z = f172761H;
            this.f172765A = f172762I;
            this.f172766B = f172763J;
            listM189923R8 = f172764K;
        }
        this.f172767C = listM189923R8;
    }

    /* JADX INFO: renamed from: I8 */
    public static final /* synthetic */ Uri m189919I8(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m189922Q8(uri, "nas", str) : uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L8 */
    public final void m189920L8() {
        tar0 tar0Var;
        hpr hprVarMo150964c;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167938Ba)).booleanValue()) {
            hprVarMo150964c = pvw0.m173984k(new wuw0() { // from class: l.rtx0
                @Override // p153l.wuw0
                public final hpr zza() {
                    return this.f164876a.m189955c9();
                }
            }, oct0.f146733a);
            tar0Var = this;
        } else {
            tar0Var = this;
            hprVarMo150964c = tar0Var.m189948J8(this.f172773b, null, AdFormat.BANNER.name(), null, null).mo150964c();
        }
        pvw0.m173991r(hprVarMo150964c, new j6z0(tar0Var), tar0Var.f172772a.mo116871c());
    }

    /* JADX INFO: renamed from: O8 */
    public static boolean m189921O8(@NonNull Uri uri, List list, List list2) {
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
    public static final Uri m189922Q8(Uri uri, String str, String str2) {
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
    public static final List m189923R8(String str) {
        String[] strArrSplit = TextUtils.split(str, Constants.SEPARATOR_COMMA);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!epw0.m121875d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S4 */
    private final void m189924S4() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168432p9)).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168471s9)).booleanValue()) {
                return;
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168519w9)).booleanValue() && this.f172768D.getAndSet(true)) {
                return;
            }
            m189920L8();
        }
    }

    /* JADX INFO: renamed from: Z8 */
    public static /* bridge */ /* synthetic */ cew0 m189930Z8(hpr hprVar, zzccx zzccxVar) {
        if (!hew0.m134676a() || !((Boolean) ris0.f163393e.m149974e()).booleanValue()) {
            return null;
        }
        try {
            cew0 cew0VarMo150963b = ((rix0) pvw0.m173989p(hprVar)).mo150963b();
            cew0VarMo150963b.m109464d(new ArrayList(Collections.singletonList(zzccxVar.zzb)));
            zzl zzlVar = zzccxVar.zzd;
            cew0VarMo150963b.m109462b(zzlVar == null ? "" : zzlVar.zzp);
            return cew0VarMo150963b;
        } catch (ExecutionException e) {
            bxy0.m106933q().m120275w(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* JADX INFO: renamed from: x8 */
    public static /* bridge */ /* synthetic */ void m189941x8(tar0 tar0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (tar0Var.m189946G8((Uri) it.next())) {
                tar0Var.f172793v.getAndIncrement();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: z8 */
    public static /* bridge */ /* synthetic */ void m189943z8(final tar0 tar0Var, final String str, final String str2, final swu0 swu0Var) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168198X6)).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168274d7)).booleanValue()) {
                oct0.f146733a.execute(new Runnable() { // from class: l.s3y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f166040a.m189945B8(str, str2, swu0Var);
                    }
                });
            } else {
                tar0Var.f172784m.m12413d(str, str2, swu0Var);
            }
        }
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ void m189944A8(qru0[] qru0VarArr) {
        qru0 qru0Var = qru0VarArr[0];
        if (qru0Var != null) {
            this.f172776e.m185113b(pvw0.m173981h(qru0Var));
        }
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m189945B8(String str, String str2, swu0 swu0Var) {
        this.f172784m.m12413d(str, str2, swu0Var);
    }

    @Override // p153l.eat0
    /* JADX INFO: renamed from: C */
    public final void mo120139C(p1m p1mVar) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167959D7)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) h950.m134037P2(p1mVar);
            zzbxr zzbxrVar = this.f172780i;
            this.f172781j = d4t0.m114235a(motionEvent, zzbxrVar == null ? null : zzbxrVar.zza);
            if (motionEvent.getAction() == 0) {
                this.f172782k = this.f172781j;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f172781j;
            motionEventObtain.setLocation(point.x, point.y);
            this.f172774c.m199148d(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // p153l.eat0
    @SuppressLint({"AddJavascriptInterface"})
    /* JADX INFO: renamed from: E */
    public final void mo120140E(p1m p1mVar) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168419o9)).booleanValue()) {
            dgs0 dgs0Var = sgs0.f167935B7;
            if (!((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue()) {
                m189924S4();
            }
            WebView webView = (WebView) h950.m134037P2(p1mVar);
            if (webView == null) {
                dct0.m115295d("The webView cannot be null.");
                return;
            }
            if (this.f172783l.contains(webView)) {
                dct0.m115297f("This webview has already been registered.");
                return;
            }
            this.f172783l.add(webView);
            webView.addJavascriptInterface(new w2i0(webView, this.f172774c, this.f172785n, this.f172786o, this.f172775d), "gmaSdk");
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168543y9)).booleanValue()) {
                bxy0.m106933q().m120271s();
            }
            if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue()) {
                m189924S4();
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: G8 */
    public final boolean m189946G8(@NonNull Uri uri) {
        return m189921O8(uri, this.f172797z, this.f172765A);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: H8 */
    public final boolean m189947H8(@NonNull Uri uri) {
        return m189921O8(uri, this.f172766B, this.f172767C);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX INFO: renamed from: J8 */
    public final rix0 m189948J8(Context context, String str, String str2, zzq zzqVar, zzl zzlVar) {
        m7w0 m7w0Var = new m7w0();
        if ("REWARDED".equals(str2)) {
            m7w0Var.m157311F().m200154a(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            m7w0Var.m157311F().m200154a(3);
        }
        hrw0 hrw0VarMo116886t = this.f172772a.mo116886t();
        q5u0 q5u0Var = new q5u0();
        q5u0Var.m175527e(context);
        if (str == null) {
            str = "adUnitId";
        }
        m7w0Var.m157315J(str);
        if (zzlVar == null) {
            zzlVar = new udy0().m195585a();
        }
        m7w0Var.m157327e(zzlVar);
        if (zzqVar == null) {
            switch (str2) {
                case "NATIVE":
                    zzqVar = zzq.m12307H();
                    break;
                case "APP_OPEN_AD":
                    zzqVar = zzq.m12306F();
                    break;
                case "REWARDED":
                case "REWARDED_INTERSTITIAL":
                    zzqVar = zzq.m12308I();
                    break;
                case "BANNER":
                    zzqVar = new zzq(context, w70.f187681i);
                    break;
                default:
                    zzqVar = new zzq();
                    break;
            }
        }
        m7w0Var.m157314I(zzqVar);
        m7w0Var.m157320O(true);
        q5u0Var.m175531i(m7w0Var.m157329g());
        hrw0VarMo116886t.mo136933b(q5u0Var.m175532j());
        ndr0 ndr0Var = new ndr0();
        ndr0Var.m162785a(str2);
        hrw0VarMo116886t.mo136932a(new kgr0(ndr0Var, null));
        new ldu0();
        rix0 rix0VarZzc = hrw0VarMo116886t.zzc();
        this.f172777f = rix0VarZzc.mo150962a();
        return rix0VarZzc;
    }

    /* JADX INFO: renamed from: K8 */
    public final hpr m189949K8(final String str) {
        final qru0[] qru0VarArr = new qru0[1];
        hpr hprVarM173987n = pvw0.m173987n(this.f172776e.m185112a(), new xuw0() { // from class: l.w8y0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f187942a.m189956d9(qru0VarArr, str, (qru0) obj);
            }
        }, this.f172778g);
        hprVarM173987n.addListener(new Runnable() { // from class: l.wdy0
            @Override // java.lang.Runnable
            public final void run() {
                this.f188661a.m189944A8(qru0VarArr);
            }
        }, this.f172778g);
        return pvw0.m173978e(pvw0.m173986m((gvw0) pvw0.m173988o(gvw0.m132580C(hprVarM173987n), ((Integer) jas0.m144075c().m176505a(sgs0.f167971E7)).intValue(), TimeUnit.MILLISECONDS, this.f172779h), new eow0() { // from class: l.ouy0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                List list = tar0.f172761H;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f172778g), Exception.class, new eow0() { // from class: l.uwy0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                List list = tar0.f172761H;
                dct0.m115296e("", (Exception) obj);
                return null;
            }
        }, this.f172778g);
    }

    /* JADX INFO: renamed from: M8 */
    public final void m189950M8(List list, final p1m p1mVar, p2t0 p2t0Var, boolean z) {
        hpr hprVarMo155969R;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f167959D7)).booleanValue()) {
            dct0.m115298g("The updating URL feature is not enabled.");
            try {
                p2t0Var.mo161254c("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                dct0.m115296e("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (m189946G8((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            dct0.m115298g("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (m189946G8(uri)) {
                hprVarMo155969R = this.f172778g.mo155969R(new Callable() { // from class: l.ihy0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f115036a.m189953U8(uri, p1mVar);
                    }
                });
                if (m189952P8()) {
                    hprVarMo155969R = pvw0.m173987n(hprVarMo155969R, new xuw0() { // from class: l.zky0
                        @Override // p153l.xuw0
                        public final hpr zza(Object obj) {
                            tar0 tar0Var = this.f204865a;
                            return pvw0.m173986m(tar0Var.m189949K8("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new eow0() { // from class: l.loy0
                                @Override // p153l.eow0
                                public final Object apply(Object obj2) {
                                    return tar0.m189919I8(uri, (String) obj2);
                                }
                            }, tar0Var.f172778g);
                        }
                    }, this.f172778g);
                } else {
                    dct0.m115297f("Asset view map is empty.");
                }
            } else {
                dct0.m115298g("Not a Google URL: ".concat(String.valueOf(uri)));
                hprVarMo155969R = pvw0.m173981h(uri);
            }
            arrayList.add(hprVarMo155969R);
        }
        pvw0.m173991r(pvw0.m173977d(arrayList), new x4z0(this, p2t0Var, z), this.f172772a.mo116871c());
    }

    /* JADX INFO: renamed from: N8 */
    public final void m189951N8(final List list, final p1m p1mVar, p2t0 p2t0Var, boolean z) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f167959D7)).booleanValue()) {
            try {
                p2t0Var.mo161254c("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                dct0.m115296e("", e);
                return;
            }
        }
        hpr hprVarMo155969R = this.f172778g.mo155969R(new Callable() { // from class: l.kyy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f129372a.m189959s8(list, p1mVar);
            }
        });
        if (m189952P8()) {
            hprVarMo155969R = pvw0.m173987n(hprVarMo155969R, new xuw0() { // from class: l.d0z0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    return this.f84630a.m189957e9((ArrayList) obj);
                }
            }, this.f172778g);
        } else {
            dct0.m115297f("Asset view map is empty.");
        }
        pvw0.m173991r(hprVarMo155969R, new f3z0(this, p2t0Var, z), this.f172772a.mo116871c());
    }

    /* JADX INFO: renamed from: P8 */
    public final boolean m189952P8() {
        Map map;
        zzbxr zzbxrVar = this.f172780i;
        return (zzbxrVar == null || (map = zzbxrVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    @Override // p153l.eat0
    /* JADX INFO: renamed from: U1 */
    public final void mo120141U1(List list, p1m p1mVar, p2t0 p2t0Var) {
        m189950M8(list, p1mVar, p2t0Var, false);
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ Uri m189953U8(Uri uri, p1m p1mVar) throws Exception {
        s7w0 s7w0Var;
        try {
            uri = (!((Boolean) jas0.m144075c().m176505a(sgs0.f168460rb)).booleanValue() || (s7w0Var = this.f172775d) == null) ? this.f172774c.m199145a(uri, this.f172773b, (View) h950.m134037P2(p1mVar), null) : s7w0Var.m185039a(uri, this.f172773b, (View) h950.m134037P2(p1mVar), null);
        } catch (zzavj e) {
            dct0.m115299h("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        brq0.m106161a("Failed to append spam signals to click url.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0069  */
    /* JADX WARN: Code duplicated, block: B:12:0x007b  */
    /* JADX WARN: Code duplicated, block: B:13:0x008e  */
    @Override // p153l.eat0
    /* JADX INFO: renamed from: W6 */
    public final void mo108508W6(p1m p1mVar, final zzccx zzccxVar, bat0 bat0Var) {
        hpr hprVarMo150964c;
        hpr hprVarMo155969R;
        Context context = (Context) h950.m134037P2(p1mVar);
        this.f172773b = context;
        rdw0 rdw0VarM176209a = qdw0.m176209a(context, 22);
        rdw0VarM176209a.zzh();
        if ("UNKNOWN".equals(zzccxVar.zzb)) {
            List arrayList = new ArrayList();
            dgs0 dgs0Var = sgs0.f167947C7;
            if (!((String) jas0.m144075c().m176505a(dgs0Var)).isEmpty()) {
                arrayList = Arrays.asList(((String) jas0.m144075c().m176505a(dgs0Var)).split(Constants.SEPARATOR_COMMA));
            }
            if (arrayList.contains(qyv0.m178751b(zzccxVar.zzd))) {
                hpr hprVarM173980g = pvw0.m173980g(new IllegalArgumentException("Unknown format is no longer supported."));
                hprVarMo150964c = pvw0.m173980g(new IllegalArgumentException("Unknown format is no longer supported."));
                hprVarMo155969R = hprVarM173980g;
            } else {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167938Ba)).booleanValue()) {
                    xvw0 xvw0Var = oct0.f146733a;
                    hprVarMo155969R = xvw0Var.mo155969R(new Callable() { // from class: l.zqy0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f205719a.m189954Y8(zzccxVar);
                        }
                    });
                    hprVarMo150964c = pvw0.m173987n(hprVarMo155969R, new xuw0() { // from class: l.zsy0
                        @Override // p153l.xuw0
                        public final hpr zza(Object obj) {
                            return ((rix0) obj).mo150964c();
                        }
                    }, xvw0Var);
                } else {
                    rix0 rix0VarM189948J8 = m189948J8(this.f172773b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
                    hpr hprVarM173981h = pvw0.m173981h(rix0VarM189948J8);
                    hprVarMo150964c = rix0VarM189948J8.mo150964c();
                    hprVarMo155969R = hprVarM173981h;
                }
            }
        } else {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167938Ba)).booleanValue()) {
                xvw0 xvw0Var2 = oct0.f146733a;
                hprVarMo155969R = xvw0Var2.mo155969R(new Callable() { // from class: l.zqy0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f205719a.m189954Y8(zzccxVar);
                    }
                });
                hprVarMo150964c = pvw0.m173987n(hprVarMo155969R, new xuw0() { // from class: l.zsy0
                    @Override // p153l.xuw0
                    public final hpr zza(Object obj) {
                        return ((rix0) obj).mo150964c();
                    }
                }, xvw0Var2);
            } else {
                rix0 rix0VarM189948J9 = m189948J8(this.f172773b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
                hpr hprVarM173981h2 = pvw0.m173981h(rix0VarM189948J9);
                hprVarMo150964c = rix0VarM189948J9.mo150964c();
                hprVarMo155969R = hprVarM173981h2;
            }
        }
        pvw0.m173991r(hprVarMo150964c, new p1z0(this, hprVarMo155969R, zzccxVar, bat0Var, rdw0VarM176209a, bxy0.m106918b().currentTimeMillis()), this.f172772a.mo116871c());
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ rix0 m189954Y8(zzccx zzccxVar) throws Exception {
        return m189948J8(this.f172773b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
    }

    @Override // p153l.eat0
    /* JADX INFO: renamed from: Z2 */
    public final void mo120142Z2(List list, p1m p1mVar, p2t0 p2t0Var) {
        m189950M8(list, p1mVar, p2t0Var, true);
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ hpr m189955c9() throws Exception {
        return m189948J8(this.f172773b, null, AdFormat.BANNER.name(), null, null).mo150964c();
    }

    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ hpr m189956d9(qru0[] qru0VarArr, String str, qru0 qru0Var) throws Exception {
        qru0VarArr[0] = qru0Var;
        Context context = this.f172773b;
        zzbxr zzbxrVar = this.f172780i;
        Map map = zzbxrVar.zzb;
        JSONObject jSONObjectM114238d = d4t0.m114238d(context, map, map, zzbxrVar.zza, null);
        JSONObject jSONObjectM114241g = d4t0.m114241g(this.f172773b, this.f172780i.zza);
        JSONObject jSONObjectM114240f = d4t0.m114240f(this.f172780i.zza);
        JSONObject jSONObjectM114239e = d4t0.m114239e(this.f172773b, this.f172780i.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectM114238d);
        jSONObject.put("ad_view_signal", jSONObjectM114241g);
        jSONObject.put("scroll_view_signal", jSONObjectM114240f);
        jSONObject.put("lock_screen_signal", jSONObjectM114239e);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", d4t0.m114237c(null, this.f172773b, this.f172782k, this.f172781j));
        }
        return qru0Var.m177702d(str, jSONObject);
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ hpr m189957e9(final ArrayList arrayList) throws Exception {
        return pvw0.m173986m(m189949K8("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new eow0() { // from class: l.oyx0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return this.f149831a.m189958r8(arrayList, (String) obj);
            }
        }, this.f172778g);
    }

    @Override // p153l.eat0
    /* JADX INFO: renamed from: n2 */
    public final void mo120143n2(List list, p1m p1mVar, p2t0 p2t0Var) {
        m189951N8(list, p1mVar, p2t0Var, false);
    }

    @Override // p153l.eat0
    /* JADX INFO: renamed from: o3 */
    public final void mo120144o3(List list, p1m p1mVar, p2t0 p2t0Var) {
        m189951N8(list, p1mVar, p2t0Var, true);
    }

    @Override // p153l.eat0
    /* JADX INFO: renamed from: p1 */
    public final void mo120145p1(zzbxr zzbxrVar) {
        this.f172780i = zzbxrVar;
        this.f172776e.m185114c(1);
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ ArrayList m189958r8(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!m189947H8(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(m189922Q8(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ ArrayList m189959s8(List list, p1m p1mVar) throws Exception {
        this.f172774c.m199147c();
        String strMo165761h = this.f172774c.m199147c().mo165761h(this.f172773b, (View) h950.m134037P2(p1mVar), null);
        if (TextUtils.isEmpty(strMo165761h)) {
            brq0.m106161a("Failed to get view signals.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (m189947H8(uri)) {
                arrayList.add(m189922Q8(uri, "ms", strMo165761h));
            } else {
                dct0.m115298g("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        brq0.m106161a("Empty impression URLs result.");
        return null;
    }

    @Override // p153l.eat0
    /* JADX INFO: renamed from: t5 */
    public final p1m mo120146t5(p1m p1mVar, p1m p1mVar2, String str, p1m p1mVar3) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168555z9)).booleanValue()) {
            return h950.m134038Y2(null);
        }
        this.f172771G.m125720g((Context) h950.m134037P2(p1mVar), (uzb) h950.m134037P2(p1mVar2), str, (tzb) h950.m134037P2(p1mVar3));
        return h950.m134038Y2(this.f172771G.m125716b());
    }
}
