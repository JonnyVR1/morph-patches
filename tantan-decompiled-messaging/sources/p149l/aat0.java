package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.BinderC2073b;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;
import com.momo.momortc.MMConstants;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting(otherwise = 3)
public class aat0 extends WebViewClient implements hbt0 {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;

    @Nullable
    private final k2v0 zzE;
    private View.OnAttachStateChangeListener zzF;

    @Nullable
    protected qzs0 zza;
    private final q9t0 zzc;

    @Nullable
    private final z2s0 zzd;
    private b1r0 zzg;
    private dfy0 zzh;
    private fbt0 zzi;
    private gbt0 zzj;
    private ses0 zzk;
    private ues0 zzl;
    private a7u0 zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private l1r0 zzv;

    @Nullable
    private lrs0 zzw;
    private q0s0 zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private grs0 zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) d1s0.m109677c().m144697a(m7s0.f131898E5)).split(Constants.SEPARATOR_COMMA)));

    @VisibleForTesting
    public aat0(q9t0 q9t0Var, @Nullable z2s0 z2s0Var, boolean z, lrs0 lrs0Var, @Nullable grs0 grs0Var, @Nullable k2v0 k2v0Var) {
        this.zzd = z2s0Var;
        this.zzc = q9t0Var;
        this.zzs = z;
        this.zzw = lrs0Var;
        this.zzE = k2v0Var;
    }

    @Nullable
    private static WebResourceResponse zzO() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131953J0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Nullable
    private final WebResourceResponse zzP(String str, Map map) throws IOException {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                WebResourceResponse webResourceResponseMo112968b = null;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    rhg0.m179353a("Too many redirects (20)");
                    return null;
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                vny0.m199080r().m12336H(this.zzc.getContext(), this.zzc.zzn().zza, false, httpURLConnection, false, HuiYanResultSender.TIMEOUT_MS);
                w2t0 w2t0Var = new w2t0(null);
                w2t0Var.m201224c(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                w2t0Var.m201226e(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    vny0.m199080r();
                    vny0.m199080r();
                    String contentType = httpURLConnection.getContentType();
                    String strTrim = "";
                    String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(com.meituan.robust.Constants.PACKNAME_END)[0].trim();
                    vny0.m199080r();
                    String contentType2 = httpURLConnection.getContentType();
                    if (!TextUtils.isEmpty(contentType2)) {
                        String[] strArrSplit = contentType2.split(com.meituan.robust.Constants.PACKNAME_END);
                        if (strArrSplit.length != 1) {
                            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                                if (strArrSplit[i2].trim().startsWith("charset")) {
                                    String[] strArrSplit2 = strArrSplit[i2].trim().split("=");
                                    if (strArrSplit2.length > 1) {
                                        strTrim = strArrSplit2[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String str2 = strTrim;
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap map2 = new HashMap(headerFields.size());
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                            map2.put(entry2.getKey(), entry2.getValue().get(0));
                        }
                    }
                    webResourceResponseMo112968b = vny0.m199081s().mo112968b(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (!headerField.startsWith("tel:")) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            x2t0.m206869g("Protocol is null");
                            webResourceResponseMo112968b = zzO();
                        } else if (protocol.equals("http") || protocol.equals("https")) {
                            x2t0.m206864b("Redirecting to " + headerField);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            x2t0.m206869g("Unsupported scheme: " + protocol);
                            webResourceResponseMo112968b = zzO();
                        }
                    }
                }
                TrafficStats.clearThreadStatsTag();
                return webResourceResponseMo112968b;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ(Map map, List list, String str) {
        if (xsu0.m210836m()) {
            xsu0.m210834k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                xsu0.m210834k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((vgs0) it.next()).mo12863a(this.zzc, map);
        }
    }

    private final void zzR() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzS(final View view, final qzs0 qzs0Var, final int i) {
        if (!qzs0Var.zzi() || i <= 0) {
            return;
        }
        qzs0Var.mo157165a(view);
        if (qzs0Var.zzi()) {
            C2075b.f9714l.postDelayed(new Runnable() { // from class: l.r9t0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158440a.zzp(view, qzs0Var, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzT(q9t0 q9t0Var) {
        if (q9t0Var.mo13679c() != null) {
            return q9t0Var.mo13679c().f125202j0;
        }
        return false;
    }

    private static final boolean zzU(boolean z, q9t0 q9t0Var) {
        return (!z || q9t0Var.zzO().m178700i() || q9t0Var.mo13683e().equals("interstitial_mb")) ? false : true;
    }

    @Override // p149l.b1r0
    public final void onAdClicked() {
        b1r0 b1r0Var = this.zzg;
        if (b1r0Var != null) {
            b1r0Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        xsu0.m210834k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzj(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                if (this.zzc.mo13670V()) {
                    xsu0.m210834k("Blank page loaded, 1...");
                    this.zzc.zzV();
                    return;
                }
                this.zzz = true;
                gbt0 gbt0Var = this.zzj;
                if (gbt0Var != null) {
                    gbt0Var.zza();
                    this.zzj = null;
                }
                zzg();
                if (this.zzc.zzL() != null) {
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132324mb)).booleanValue()) {
                        this.zzc.zzL().m12275t8(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.mo13659J(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case EACTags.TRACK1_APPLICATION /* 86 */:
            case 87:
            case 88:
            case 89:
            case 90:
            case EACTags.NAME /* 91 */:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case MMConstants.ERR_WATERMARK_READ /* 129 */:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        xsu0.m210834k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriM171376a = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriM171376a.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriM171376a.getHost())) {
            zzj(uriM171376a);
        } else {
            if (this.zzn && webView == this.zzc.mo13661L()) {
                String scheme = uriM171376a.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    b1r0 b1r0Var = this.zzg;
                    if (b1r0Var != null) {
                        b1r0Var.onAdClicked();
                        qzs0 qzs0Var = this.zza;
                        if (qzs0Var != null) {
                            qzs0Var.mo157164A(str);
                        }
                        this.zzg = null;
                    }
                    a7u0 a7u0Var = this.zzm;
                    if (a7u0Var != null) {
                        a7u0Var.zzs();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.mo13661L().willNotDraw()) {
                x2t0.m206869g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    ptr0 ptr0VarMo13703p = this.zzc.mo13703p();
                    myv0 myv0VarMo13685f = this.zzc.mo13685f();
                    if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132389rb)).booleanValue() || myv0VarMo13685f == null) {
                        if (ptr0VarMo13703p != null && ptr0VarMo13703p.m171381f(uriM171376a)) {
                            Context context = this.zzc.getContext();
                            q9t0 q9t0Var = this.zzc;
                            uriM171376a = ptr0VarMo13703p.m171376a(uriM171376a, context, (View) q9t0Var, q9t0Var.zzi());
                        }
                    } else if (ptr0VarMo13703p != null && ptr0VarMo13703p.m171381f(uriM171376a)) {
                        Context context2 = this.zzc.getContext();
                        q9t0 q9t0Var2 = this.zzc;
                        uriM171376a = myv0VarMo13685f.m157092a(uriM171376a, context2, (View) q9t0Var2, q9t0Var2.zzi());
                    }
                } catch (zzavj unused) {
                    x2t0.m206869g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                q0s0 q0s0Var = this.zzx;
                if (q0s0Var == null || q0s0Var.m172358c()) {
                    zzu(new zzc("android.intent.action.VIEW", uriM171376a.toString(), null, null, null, null, null, null), true);
                } else {
                    q0s0Var.m172357b(str);
                }
            }
        }
        return true;
    }

    public final void zzA(String str, vgs0 vgs0Var) {
        synchronized (this.zzf) {
            try {
                List copyOnWriteArrayList = (List) this.zze.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.zze.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(vgs0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.hbt0
    public final void zzB(fbt0 fbt0Var) {
        this.zzi = fbt0Var;
    }

    @Override // p149l.hbt0
    public final void zzC(int i, int i2) {
        grs0 grs0Var = this.zzy;
        if (grs0Var != null) {
            grs0Var.m127770l(i, i2);
        }
    }

    public final void zzD(boolean z) {
        this.zzn = false;
    }

    @Override // p149l.hbt0
    public final void zzE(boolean z) {
        synchronized (this.zzf) {
            this.zzu = z;
        }
    }

    @Override // p149l.hbt0
    public final void zzF() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            i3t0.f111376e.execute(new Runnable() { // from class: l.s9t0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163233a.zzn();
                }
            });
        }
    }

    @Override // p149l.hbt0
    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // p149l.hbt0
    public final void zzH(gbt0 gbt0Var) {
        this.zzj = gbt0Var;
    }

    public final void zzI(String str, vgs0 vgs0Var) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(vgs0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzJ(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<vgs0> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (vgs0 vgs0Var : list) {
                    if (predicate.apply(vgs0Var)) {
                        arrayList.add(vgs0Var);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzK() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    @Override // p149l.hbt0
    public final boolean zzL() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzM() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    @Override // p149l.hbt0
    public final void zzN(@Nullable b1r0 b1r0Var, @Nullable ses0 ses0Var, @Nullable dfy0 dfy0Var, @Nullable ues0 ues0Var, @Nullable l1r0 l1r0Var, boolean z, @Nullable xgs0 xgs0Var, @Nullable q0s0 q0s0Var, @Nullable nrs0 nrs0Var, @Nullable qzs0 qzs0Var, @Nullable final z1v0 z1v0Var, @Nullable final s5w0 s5w0Var, @Nullable rnu0 rnu0Var, @Nullable p3w0 p3w0Var, @Nullable ohs0 ohs0Var, @Nullable final a7u0 a7u0Var, @Nullable nhs0 nhs0Var, @Nullable hhs0 hhs0Var, @Nullable final xkt0 xkt0Var) {
        q0s0 q0s0Var2 = q0s0Var == null ? new q0s0(this.zzc.getContext(), qzs0Var, null) : q0s0Var;
        this.zzy = new grs0(this.zzc, nrs0Var);
        this.zza = qzs0Var;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132049R0)).booleanValue()) {
            zzA("/adMetadata", new res0(ses0Var));
        }
        if (ues0Var != null) {
            zzA("/appEvent", new tes0(ues0Var));
        }
        zzA("/backButton", ugs0.f176434j);
        zzA("/refresh", ugs0.f176435k);
        zzA("/canOpenApp", ugs0.f176426b);
        zzA("/canOpenURLs", ugs0.f176425a);
        zzA("/canOpenIntents", ugs0.f176427c);
        zzA("/close", ugs0.f176428d);
        zzA("/customClose", ugs0.f176429e);
        zzA("/instrument", ugs0.f176438n);
        zzA("/delayPageLoaded", ugs0.f176440p);
        zzA("/delayPageClosed", ugs0.f176441q);
        zzA("/getLocationInfo", ugs0.f176442r);
        zzA("/log", ugs0.f176431g);
        zzA("/mraid", new bhs0(q0s0Var2, this.zzy, nrs0Var));
        lrs0 lrs0Var = this.zzw;
        if (lrs0Var != null) {
            zzA("/mraidLoaded", lrs0Var);
        }
        q0s0 q0s0Var3 = q0s0Var2;
        zzA("/open", new ghs0(q0s0Var3, this.zzy, z1v0Var, rnu0Var, p3w0Var, xkt0Var));
        zzA("/precache", new p7t0());
        zzA("/touch", ugs0.f176433i);
        zzA("/video", ugs0.f176436l);
        zzA("/videoMeta", ugs0.f176437m);
        if (z1v0Var == null || s5w0Var == null) {
            zzA("/click", new jfs0(a7u0Var, xkt0Var));
            zzA("/httpTrack", ugs0.f176430f);
        } else {
            zzA("/click", new vgs0() { // from class: l.pyv0
                @Override // p149l.vgs0
                /* JADX INFO: renamed from: a */
                public final void mo12863a(Object obj, Map map) {
                    q9t0 q9t0Var = (q9t0) obj;
                    ugs0.m193574c(map, a7u0Var);
                    String str = (String) map.get("u");
                    if (str == null) {
                        x2t0.m206869g("URL missing from click GMSG.");
                        return;
                    }
                    z1v0 z1v0Var2 = z1v0Var;
                    s5w0 s5w0Var2 = s5w0Var;
                    jmw0.m142245r(ugs0.m193572a(q9t0Var, str), new ryv0(q9t0Var, xkt0Var, s5w0Var2, z1v0Var2), i3t0.f111372a);
                }
            });
            zzA("/httpTrack", new vgs0() { // from class: l.qyv0
                @Override // p149l.vgs0
                /* JADX INFO: renamed from: a */
                public final void mo12863a(Object obj, Map map) {
                    h9t0 h9t0Var = (h9t0) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        x2t0.m206869g("URL missing from httpTrack GMSG.");
                    } else if (h9t0Var.mo13679c().f125202j0) {
                        z1v0Var.m216820g(new b2v0(vny0.m199064b().currentTimeMillis(), ((tat0) h9t0Var).mo13689h().f141055b, str, 2));
                    } else {
                        s5w0Var.m182382c(str, null);
                    }
                }
            });
        }
        if (vny0.m199078p().m152537p(this.zzc.getContext())) {
            zzA("/logScionEvent", new ahs0(this.zzc.getContext()));
        }
        if (xgs0Var != null) {
            zzA("/setInterstitialProperties", new wgs0(xgs0Var));
        }
        if (ohs0Var != null) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue()) {
                zzA("/inspectorNetworkExtras", ohs0Var);
            }
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132244g9)).booleanValue() && nhs0Var != null) {
            zzA("/shareSheet", nhs0Var);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132309l9)).booleanValue() && hhs0Var != null) {
            zzA("/inspectorOutOfContextTest", hhs0Var);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132083Ta)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", ugs0.f176445u);
            zzA("/presentPlayStoreOverlay", ugs0.f176446v);
            zzA("/expandPlayStoreOverlay", ugs0.f176447w);
            zzA("/collapsePlayStoreOverlay", ugs0.f176448x);
            zzA("/closePlayStoreOverlay", ugs0.f176449y);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132160a3)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", ugs0.f176422A);
            zzA("/resetPAID", ugs0.f176450z);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132311lb)).booleanValue()) {
            q9t0 q9t0Var = this.zzc;
            if (q9t0Var.mo13679c() != null && q9t0Var.mo13679c().f125218r0) {
                zzA("/writeToLocalStorage", ugs0.f176423B);
                zzA("/clearLocalStorageKeys", ugs0.f176424C);
            }
        }
        this.zzg = b1r0Var;
        this.zzh = dfy0Var;
        this.zzk = ses0Var;
        this.zzl = ues0Var;
        this.zzv = l1r0Var;
        this.zzx = q0s0Var3;
        this.zzm = a7u0Var;
        this.zzn = z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    @Override // p149l.a7u0
    public final void zzbo() {
        a7u0 a7u0Var = this.zzm;
        if (a7u0Var != null) {
            a7u0Var.zzbo();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0080  */
    /* JADX WARN: Code duplicated, block: B:65:0x0238 A[Catch: Exception | NoClassDefFoundError -> 0x0262, Exception | NoClassDefFoundError -> 0x0262, TryCatch #5 {Exception | NoClassDefFoundError -> 0x0262, blocks: (B:3:0x000a, B:5:0x001c, B:7:0x0023, B:9:0x002f, B:11:0x004b, B:13:0x0064, B:15:0x007b, B:16:0x007e, B:18:0x0081, B:21:0x009d, B:21:0x009d, B:23:0x00b5, B:23:0x00b5, B:25:0x00ce, B:25:0x00ce, B:47:0x0171, B:47:0x0171, B:52:0x01be, B:52:0x01be, B:65:0x0238, B:65:0x0238, B:68:0x0248, B:68:0x0248, B:70:0x024e, B:70:0x024e, B:72:0x025c, B:72:0x025c, B:54:0x01c3, B:54:0x01c3, B:55:0x01e9, B:55:0x01e9, B:51:0x019b, B:51:0x019b, B:37:0x012f, B:37:0x012f, B:24:0x00c2, B:24:0x00c2, B:56:0x01ea, B:56:0x01ea, B:58:0x01f4, B:58:0x01f4, B:60:0x01fa, B:60:0x01fa, B:62:0x022d, B:62:0x022d), top: B:81:0x000a }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Nullable
    public final WebResourceResponse zzc(String str, Map map) {
        WebResourceResponse webResourceResponse;
        int i;
        InputStream inputStream;
        InputStream inputStreamM13543I;
        Long l2;
        final boolean z;
        final boolean z2;
        final boolean z3;
        String str2;
        try {
            String strM162169c = o0t0.m162169c(str, this.zzc.getContext(), this.zzC);
            if (!strM162169c.equals(str)) {
                return zzP(strM162169c, map);
            }
            zzbbb zzbbbVarM13546g = zzbbb.m13546g(Uri.parse(str));
            if (zzbbbVarM13546g != null) {
                HashMap map2 = new HashMap();
                map2.put(OSSHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
                Uri uri = Uri.parse(str);
                final boolean z4 = true;
                if (uri.getQueryParameterNames().contains("range")) {
                    List listM208619f = xfw0.m208616c(vew0.m198261b('-')).m208619f(uri.getQueryParameter("range"));
                    if (listM208619f.size() == 2) {
                        int i2 = Integer.parseInt((String) listM208619f.get(0));
                        int i3 = Integer.parseInt((String) listM208619f.get(1)) + 1;
                        if (i2 > 0) {
                            zzbbbVarM13546g.zzh = i2;
                        }
                        i = i3 - i2;
                    } else {
                        i = -1;
                    }
                } else {
                    i = -1;
                }
                webResourceResponse = null;
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132278j4)).booleanValue()) {
                    zzbbbVarM13546g.zzi = yfw0.m214595c(this.zzc.zzr());
                    zzbbbVarM13546g.zzj = this.zzc.zzf();
                    if (zzbbbVarM13546g.zzg) {
                        x6s0 x6s0Var = m7s0.f132304l4;
                        k7s0 k7s0VarM109677c = d1s0.m109677c();
                        l2 = (Long) k7s0VarM109677c.m144697a(x6s0Var);
                        z = k7s0VarM109677c;
                    } else {
                        x6s0 x6s0Var2 = m7s0.f132291k4;
                        k7s0 k7s0VarM109677c2 = d1s0.m109677c();
                        l2 = (Long) k7s0VarM109677c2.m144697a(x6s0Var2);
                        z = k7s0VarM109677c2;
                    }
                    try {
                        long jLongValue = l2.longValue();
                        long jElapsedRealtime = vny0.m199064b().elapsedRealtime();
                        vny0.m199068f();
                        Future futureM201215a = w2s0.m201215a(this.zzc.getContext(), zzbbbVarM13546g);
                        try {
                            x2s0 x2s0Var = (x2s0) futureM201215a.get(jLongValue, TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(x2s0Var.m206860d()));
                                    map2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(x2s0Var.m206862f()));
                                    map2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(x2s0Var.m206861e()));
                                    map2.put("X-Afma-Gcache-CachedBytes", Long.toString(x2s0Var.m206858a()));
                                    inputStreamM13543I = x2s0Var.m206859c();
                                    if (i != -1) {
                                        try {
                                            inputStreamM13543I = ckw0.m107431a(inputStreamM13543I, i);
                                        } catch (InterruptedException unused) {
                                            z3 = true;
                                            futureM201215a.cancel(true);
                                            Thread.currentThread().interrupt();
                                            final long jElapsedRealtime2 = vny0.m199064b().elapsedRealtime() - jElapsedRealtime;
                                            C2075b.f9714l.post(new Runnable() { // from class: l.u9t0
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.f175504a.zzo(z3, jElapsedRealtime2);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime2 + "ms";
                                            z = z3;
                                        } catch (ExecutionException | TimeoutException unused2) {
                                            z2 = true;
                                            futureM201215a.cancel(true);
                                            final long jElapsedRealtime3 = vny0.m199064b().elapsedRealtime() - jElapsedRealtime;
                                            C2075b.f9714l.post(new Runnable() { // from class: l.u9t0
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.f175504a.zzo(z2, jElapsedRealtime3);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime3 + "ms";
                                            z = z2;
                                        }
                                    }
                                    final long jElapsedRealtime4 = vny0.m199064b().elapsedRealtime() - jElapsedRealtime;
                                    C2075b.f9714l.post(new Runnable() { // from class: l.u9t0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f175504a.zzo(z4, jElapsedRealtime4);
                                        }
                                    });
                                    str2 = "Cache connection took " + jElapsedRealtime4 + "ms";
                                } catch (Throwable th) {
                                    th = th;
                                    z = 1;
                                    final long jElapsedRealtime5 = vny0.m199064b().elapsedRealtime() - jElapsedRealtime;
                                    C2075b.f9714l.post(new Runnable() { // from class: l.u9t0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f175504a.zzo(z, jElapsedRealtime5);
                                        }
                                    });
                                    xsu0.m210834k("Cache connection took " + jElapsedRealtime5 + "ms");
                                    throw th;
                                }
                            } catch (InterruptedException unused3) {
                                z3 = true;
                                inputStreamM13543I = null;
                            } catch (ExecutionException | TimeoutException unused4) {
                                z2 = true;
                                inputStreamM13543I = null;
                            }
                        } catch (InterruptedException unused5) {
                            inputStreamM13543I = null;
                            z3 = false;
                        } catch (ExecutionException | TimeoutException unused6) {
                            inputStreamM13543I = null;
                            z2 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            z = 0;
                        }
                        xsu0.m210834k(str2);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    zzbay zzbayVarM100027b = vny0.m199067e().m100027b(zzbbbVarM13546g);
                    if (zzbayVarM100027b == null || !zzbayVarM100027b.zze()) {
                        inputStream = null;
                    } else {
                        map2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbayVarM100027b.zzd()));
                        map2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbayVarM100027b.m13545g0()));
                        map2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbayVarM100027b.m13544J()));
                        map2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbayVarM100027b.m13541F()));
                        inputStreamM13543I = zzbayVarM100027b.m13543I();
                        if (i != -1) {
                            inputStreamM13543I = ckw0.m107431a(inputStreamM13543I, i);
                        }
                    }
                    if (inputStream != null) {
                        return new WebResourceResponse("", "", 200, "OK", map2, inputStream);
                    }
                }
                inputStream = inputStreamM13543I;
                if (inputStream != null) {
                    return new WebResourceResponse("", "", 200, "OK", map2, inputStream);
                }
            } else {
                webResourceResponse = null;
            }
            return (w2t0.m201220k() && ((Boolean) o9s0.f142742b.m115379e()).booleanValue()) ? zzP(str, map) : webResourceResponse;
        } catch (Exception | NoClassDefFoundError e) {
            vny0.m199079q().m212290w(e, "AdWebViewClient.interceptRequest");
            return zzO();
        }
    }

    @Override // p149l.hbt0
    public final q0s0 zzd() {
        return this.zzx;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue() && this.zzc.zzm() != null) {
                w7s0.m202071a(this.zzc.zzm().m105818a(), this.zzc.zzk(), "awfllc");
            }
            fbt0 fbt0Var = this.zzi;
            boolean z = false;
            if (!this.zzA && !this.zzo) {
                z = true;
            }
            fbt0Var.mo96131a(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.mo13695l();
    }

    public final void zzh() {
        qzs0 qzs0Var = this.zza;
        if (qzs0Var != null) {
            qzs0Var.zze();
            this.zza = null;
        }
        zzR();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzv = null;
                this.zzx = null;
                this.zzw = null;
                grs0 grs0Var = this.zzy;
                if (grs0Var != null) {
                    grs0Var.m127766h(true);
                    this.zzy = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi(boolean z) {
        this.zzC = z;
    }

    @Override // p149l.hbt0
    public final void zzj(Uri uri) {
        xsu0.m210834k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            xsu0.m210834k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131995M6)).booleanValue() || vny0.m199079q().m212277g() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            i3t0.f111372a.execute(new Runnable() { // from class: l.t9t0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i = aat0.zzb;
                    vny0.m199079q().m212277g().m192161e(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131886D5)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) d1s0.m109677c().m144697a(m7s0.f131910F5)).intValue()) {
                xsu0.m210834k("Parsing gmsg query params on BG thread: ".concat(path));
                jmw0.m142245r(vny0.m199080r().m12334D(uri), new w9t0(this, list, path, uri), i3t0.f111376e);
                return;
            }
        }
        vny0.m199080r();
        zzQ(C2075b.m12322o(uri), list, path);
    }

    @Override // p149l.hbt0
    public final void zzk() {
        z2s0 z2s0Var = this.zzd;
        if (z2s0Var != null) {
            z2s0Var.m216994c(10005);
        }
        this.zzA = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // p149l.hbt0
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // p149l.hbt0
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    public final /* synthetic */ void zzn() {
        this.zzc.mo13697m();
        BinderC2073b binderC2073bZzL = this.zzc.zzL();
        if (binderC2073bZzL != null) {
            binderC2073bZzL.m12262G();
        }
    }

    public final /* synthetic */ void zzo(boolean z, long j) {
        this.zzc.mo13660K(z, j);
    }

    public final /* synthetic */ void zzp(View view, qzs0 qzs0Var, int i) {
        zzS(view, qzs0Var, i - 1);
    }

    @Override // p149l.hbt0
    public final void zzq(int i, int i2, boolean z) {
        lrs0 lrs0Var = this.zzw;
        if (lrs0Var != null) {
            lrs0Var.m151505h(i, i2);
        }
        grs0 grs0Var = this.zzy;
        if (grs0Var != null) {
            grs0Var.m127769k(i, i2, false);
        }
    }

    @Override // p149l.hbt0
    public final void zzr() {
        qzs0 qzs0Var = this.zza;
        if (qzs0Var != null) {
            WebView webViewMo13661L = this.zzc.mo13661L();
            if (gbl0.m125170O(webViewMo13661L)) {
                zzS(webViewMo13661L, qzs0Var, 10);
                return;
            }
            zzR();
            v9t0 v9t0Var = new v9t0(this, qzs0Var);
            this.zzF = v9t0Var;
            ((View) this.zzc).addOnAttachStateChangeListener(v9t0Var);
        }
    }

    @Override // p149l.a7u0
    public final void zzs() {
        a7u0 a7u0Var = this.zzm;
        if (a7u0Var != null) {
            a7u0Var.zzs();
        }
    }

    public final void zzu(zzc zzcVar, boolean z) {
        q9t0 q9t0Var = this.zzc;
        boolean zMo13676a0 = q9t0Var.mo13676a0();
        boolean zZzU = zzU(zMo13676a0, q9t0Var);
        boolean z2 = true;
        if (!zZzU && z) {
            z2 = false;
        }
        b1r0 b1r0Var = zZzU ? null : this.zzg;
        dfy0 dfy0Var = zMo13676a0 ? null : this.zzh;
        l1r0 l1r0Var = this.zzv;
        q9t0 q9t0Var2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcVar, b1r0Var, dfy0Var, l1r0Var, q9t0Var2.zzn(), q9t0Var2, z2 ? null : this.zzm));
    }

    public final void zzv(String str, String str2, int i) {
        k2v0 k2v0Var = this.zzE;
        q9t0 q9t0Var = this.zzc;
        zzx(new AdOverlayInfoParcel(q9t0Var, q9t0Var.zzn(), str, str2, 14, k2v0Var));
    }

    public final void zzw(boolean z, int i, boolean z2) {
        q9t0 q9t0Var = this.zzc;
        boolean zZzU = zzU(q9t0Var.mo13676a0(), q9t0Var);
        boolean z3 = true;
        if (!zZzU && z2) {
            z3 = false;
        }
        b1r0 b1r0Var = zZzU ? null : this.zzg;
        dfy0 dfy0Var = this.zzh;
        l1r0 l1r0Var = this.zzv;
        q9t0 q9t0Var2 = this.zzc;
        zzx(new AdOverlayInfoParcel(b1r0Var, dfy0Var, l1r0Var, q9t0Var2, z, i, q9t0Var2.zzn(), z3 ? null : this.zzm, zzT(this.zzc) ? this.zzE : null));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        grs0 grs0Var = this.zzy;
        boolean zM127771m = grs0Var != null ? grs0Var.m127771m() : false;
        vny0.m199073k();
        a8y0.m95388a(this.zzc.getContext(), adOverlayInfoParcel, !zM127771m);
        qzs0 qzs0Var = this.zza;
        if (qzs0Var != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            qzs0Var.mo157164A(str);
        }
    }

    public final void zzy(boolean z, int i, String str, String str2, boolean z2) {
        q9t0 q9t0Var = this.zzc;
        boolean zMo13676a0 = q9t0Var.mo13676a0();
        boolean zZzU = zzU(zMo13676a0, q9t0Var);
        boolean z3 = true;
        if (!zZzU && z2) {
            z3 = false;
        }
        b1r0 b1r0Var = zZzU ? null : this.zzg;
        x9t0 x9t0Var = zMo13676a0 ? null : new x9t0(this.zzc, this.zzh);
        ses0 ses0Var = this.zzk;
        ues0 ues0Var = this.zzl;
        l1r0 l1r0Var = this.zzv;
        q9t0 q9t0Var2 = this.zzc;
        zzx(new AdOverlayInfoParcel(b1r0Var, x9t0Var, ses0Var, ues0Var, l1r0Var, q9t0Var2, z, i, str, str2, q9t0Var2.zzn(), z3 ? null : this.zzm, zzT(this.zzc) ? this.zzE : null));
    }

    public final void zzz(boolean z, int i, String str, boolean z2, boolean z3) {
        q9t0 q9t0Var = this.zzc;
        boolean zMo13676a0 = q9t0Var.mo13676a0();
        boolean zZzU = zzU(zMo13676a0, q9t0Var);
        boolean z4 = true;
        if (!zZzU && z2) {
            z4 = false;
        }
        b1r0 b1r0Var = zZzU ? null : this.zzg;
        x9t0 x9t0Var = zMo13676a0 ? null : new x9t0(this.zzc, this.zzh);
        ses0 ses0Var = this.zzk;
        ues0 ues0Var = this.zzl;
        l1r0 l1r0Var = this.zzv;
        q9t0 q9t0Var2 = this.zzc;
        zzx(new AdOverlayInfoParcel(b1r0Var, x9t0Var, ses0Var, ues0Var, l1r0Var, q9t0Var2, z, i, str, q9t0Var2.zzn(), z4 ? null : this.zzm, zzT(this.zzc) ? this.zzE : null, z3));
    }
}
