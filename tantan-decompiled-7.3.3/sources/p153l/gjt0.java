package p153l;

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
import com.google.android.gms.ads.internal.overlay.BinderC2096b;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2098b;
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
public class gjt0 extends WebViewClient implements nkt0 {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;

    @Nullable
    private final qbv0 zzE;
    private View.OnAttachStateChangeListener zzF;

    @Nullable
    protected w8t0 zza;
    private final wit0 zzc;

    @Nullable
    private final fcs0 zzd;
    private har0 zzg;
    private joy0 zzh;
    private lkt0 zzi;
    private mkt0 zzj;
    private yns0 zzk;
    private aos0 zzl;
    private ggu0 zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private rar0 zzv;

    @Nullable
    private r0t0 zzw;
    private w9s0 zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private m0t0 zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) jas0.m144075c().m176505a(sgs0.f167969E5)).split(Constants.SEPARATOR_COMMA)));

    @VisibleForTesting
    public gjt0(wit0 wit0Var, @Nullable fcs0 fcs0Var, boolean z, r0t0 r0t0Var, @Nullable m0t0 m0t0Var, @Nullable qbv0 qbv0Var) {
        this.zzd = fcs0Var;
        this.zzc = wit0Var;
        this.zzs = z;
        this.zzw = r0t0Var;
        this.zzE = qbv0Var;
    }

    @Nullable
    private static WebResourceResponse zzO() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168024J0)).booleanValue()) {
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
                WebResourceResponse webResourceResponseMo109051b = null;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    zpg0.m220844a("Too many redirects (20)");
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
                bxy0.m106934r().m12390H(this.zzc.getContext(), this.zzc.zzn().zza, false, httpURLConnection, false, HuiYanResultSender.TIMEOUT_MS);
                cct0 cct0Var = new cct0(null);
                cct0Var.m109071c(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                cct0Var.m109073e(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    bxy0.m106934r();
                    bxy0.m106934r();
                    String contentType = httpURLConnection.getContentType();
                    String strTrim = "";
                    String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(com.meituan.robust.Constants.PACKNAME_END)[0].trim();
                    bxy0.m106934r();
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
                    webResourceResponseMo109051b = bxy0.m106935s().mo109051b(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (!headerField.startsWith("tel:")) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            dct0.m115298g("Protocol is null");
                            webResourceResponseMo109051b = zzO();
                        } else if (protocol.equals("http") || protocol.equals("https")) {
                            dct0.m115293b("Redirecting to " + headerField);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            dct0.m115298g("Unsupported scheme: " + protocol);
                            webResourceResponseMo109051b = zzO();
                        }
                    }
                }
                TrafficStats.clearThreadStatsTag();
                return webResourceResponseMo109051b;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ(Map map, List list, String str) {
        if (d2v0.m113739m()) {
            d2v0.m113737k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                d2v0.m113737k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((bqs0) it.next()).mo12917a(this.zzc, map);
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
    public final void zzS(final View view, final w8t0 w8t0Var, final int i) {
        if (!w8t0Var.zzi() || i <= 0) {
            return;
        }
        w8t0Var.mo185107a(view);
        if (w8t0Var.zzi()) {
            C2098b.f9751l.postDelayed(new Runnable() { // from class: l.xit0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194507a.zzp(view, w8t0Var, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzT(wit0 wit0Var) {
        if (wit0Var.mo13733c() != null) {
            return wit0Var.mo13733c().f155892j0;
        }
        return false;
    }

    private static final boolean zzU(boolean z, wit0 wit0Var) {
        return (!z || wit0Var.zzO().m211423i() || wit0Var.mo13737e().equals("interstitial_mb")) ? false : true;
    }

    @Override // p153l.har0
    public final void onAdClicked() {
        har0 har0Var = this.zzg;
        if (har0Var != null) {
            har0Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        d2v0.m113737k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzj(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                if (this.zzc.mo13724V()) {
                    d2v0.m113737k("Blank page loaded, 1...");
                    this.zzc.zzV();
                    return;
                }
                this.zzz = true;
                mkt0 mkt0Var = this.zzj;
                if (mkt0Var != null) {
                    mkt0Var.zza();
                    this.zzj = null;
                }
                zzg();
                if (this.zzc.zzL() != null) {
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f168395mb)).booleanValue()) {
                        this.zzc.zzL().m12329t8(str);
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
        return this.zzc.mo13713J(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
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
        d2v0.m113737k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriM199145a = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriM199145a.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriM199145a.getHost())) {
            zzj(uriM199145a);
        } else {
            if (this.zzn && webView == this.zzc.mo13715L()) {
                String scheme = uriM199145a.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    har0 har0Var = this.zzg;
                    if (har0Var != null) {
                        har0Var.onAdClicked();
                        w8t0 w8t0Var = this.zza;
                        if (w8t0Var != null) {
                            w8t0Var.mo185106A(str);
                        }
                        this.zzg = null;
                    }
                    ggu0 ggu0Var = this.zzm;
                    if (ggu0Var != null) {
                        ggu0Var.zzs();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.mo13715L().willNotDraw()) {
                dct0.m115298g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    v2s0 v2s0VarMo13757p = this.zzc.mo13757p();
                    s7w0 s7w0VarMo13739f = this.zzc.mo13739f();
                    if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168460rb)).booleanValue() || s7w0VarMo13739f == null) {
                        if (v2s0VarMo13757p != null && v2s0VarMo13757p.m199150f(uriM199145a)) {
                            Context context = this.zzc.getContext();
                            wit0 wit0Var = this.zzc;
                            uriM199145a = v2s0VarMo13757p.m199145a(uriM199145a, context, (View) wit0Var, wit0Var.zzi());
                        }
                    } else if (v2s0VarMo13757p != null && v2s0VarMo13757p.m199150f(uriM199145a)) {
                        Context context2 = this.zzc.getContext();
                        wit0 wit0Var2 = this.zzc;
                        uriM199145a = s7w0VarMo13739f.m185039a(uriM199145a, context2, (View) wit0Var2, wit0Var2.zzi());
                    }
                } catch (zzavj unused) {
                    dct0.m115298g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                w9s0 w9s0Var = this.zzx;
                if (w9s0Var == null || w9s0Var.m205627c()) {
                    zzu(new zzc("android.intent.action.VIEW", uriM199145a.toString(), null, null, null, null, null, null), true);
                } else {
                    w9s0Var.m205626b(str);
                }
            }
        }
        return true;
    }

    public final void zzA(String str, bqs0 bqs0Var) {
        synchronized (this.zzf) {
            try {
                List copyOnWriteArrayList = (List) this.zze.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.zze.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(bqs0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.nkt0
    public final void zzB(lkt0 lkt0Var) {
        this.zzi = lkt0Var;
    }

    @Override // p153l.nkt0
    public final void zzC(int i, int i2) {
        m0t0 m0t0Var = this.zzy;
        if (m0t0Var != null) {
            m0t0Var.m156538l(i, i2);
        }
    }

    public final void zzD(boolean z) {
        this.zzn = false;
    }

    @Override // p153l.nkt0
    public final void zzE(boolean z) {
        synchronized (this.zzf) {
            this.zzu = z;
        }
    }

    @Override // p153l.nkt0
    public final void zzF() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            oct0.f146737e.execute(new Runnable() { // from class: l.yit0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f200238a.zzn();
                }
            });
        }
    }

    @Override // p153l.nkt0
    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // p153l.nkt0
    public final void zzH(mkt0 mkt0Var) {
        this.zzj = mkt0Var;
    }

    public final void zzI(String str, bqs0 bqs0Var) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(bqs0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzJ(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<bqs0> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (bqs0 bqs0Var : list) {
                    if (predicate.apply(bqs0Var)) {
                        arrayList.add(bqs0Var);
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

    @Override // p153l.nkt0
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

    @Override // p153l.nkt0
    public final void zzN(@Nullable har0 har0Var, @Nullable yns0 yns0Var, @Nullable joy0 joy0Var, @Nullable aos0 aos0Var, @Nullable rar0 rar0Var, boolean z, @Nullable dqs0 dqs0Var, @Nullable w9s0 w9s0Var, @Nullable t0t0 t0t0Var, @Nullable w8t0 w8t0Var, @Nullable final fbv0 fbv0Var, @Nullable final yew0 yew0Var, @Nullable xwu0 xwu0Var, @Nullable vcw0 vcw0Var, @Nullable uqs0 uqs0Var, @Nullable final ggu0 ggu0Var, @Nullable tqs0 tqs0Var, @Nullable nqs0 nqs0Var, @Nullable final dut0 dut0Var) {
        w9s0 w9s0Var2 = w9s0Var == null ? new w9s0(this.zzc.getContext(), w8t0Var, null) : w9s0Var;
        this.zzy = new m0t0(this.zzc, t0t0Var);
        this.zza = w8t0Var;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168120R0)).booleanValue()) {
            zzA("/adMetadata", new xns0(yns0Var));
        }
        if (aos0Var != null) {
            zzA("/appEvent", new zns0(aos0Var));
        }
        zzA("/backButton", aqs0.f72861j);
        zzA("/refresh", aqs0.f72862k);
        zzA("/canOpenApp", aqs0.f72853b);
        zzA("/canOpenURLs", aqs0.f72852a);
        zzA("/canOpenIntents", aqs0.f72854c);
        zzA("/close", aqs0.f72855d);
        zzA("/customClose", aqs0.f72856e);
        zzA("/instrument", aqs0.f72865n);
        zzA("/delayPageLoaded", aqs0.f72867p);
        zzA("/delayPageClosed", aqs0.f72868q);
        zzA("/getLocationInfo", aqs0.f72869r);
        zzA("/log", aqs0.f72858g);
        zzA("/mraid", new hqs0(w9s0Var2, this.zzy, t0t0Var));
        r0t0 r0t0Var = this.zzw;
        if (r0t0Var != null) {
            zzA("/mraidLoaded", r0t0Var);
        }
        w9s0 w9s0Var3 = w9s0Var2;
        zzA("/open", new mqs0(w9s0Var3, this.zzy, fbv0Var, xwu0Var, vcw0Var, dut0Var));
        zzA("/precache", new vgt0());
        zzA("/touch", aqs0.f72860i);
        zzA("/video", aqs0.f72863l);
        zzA("/videoMeta", aqs0.f72864m);
        if (fbv0Var == null || yew0Var == null) {
            zzA("/click", new pos0(ggu0Var, dut0Var));
            zzA("/httpTrack", aqs0.f72857f);
        } else {
            zzA("/click", new bqs0() { // from class: l.v7w0
                @Override // p153l.bqs0
                /* JADX INFO: renamed from: a */
                public final void mo12917a(Object obj, Map map) {
                    wit0 wit0Var = (wit0) obj;
                    aqs0.m99556c(map, ggu0Var);
                    String str = (String) map.get("u");
                    if (str == null) {
                        dct0.m115298g("URL missing from click GMSG.");
                        return;
                    }
                    fbv0 fbv0Var2 = fbv0Var;
                    yew0 yew0Var2 = yew0Var;
                    pvw0.m173991r(aqs0.m99554a(wit0Var, str), new x7w0(wit0Var, dut0Var, yew0Var2, fbv0Var2), oct0.f146733a);
                }
            });
            zzA("/httpTrack", new bqs0() { // from class: l.w7w0
                @Override // p153l.bqs0
                /* JADX INFO: renamed from: a */
                public final void mo12917a(Object obj, Map map) {
                    nit0 nit0Var = (nit0) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        dct0.m115298g("URL missing from httpTrack GMSG.");
                    } else if (nit0Var.mo13733c().f155892j0) {
                        fbv0Var.m124959g(new hbv0(bxy0.m106918b().currentTimeMillis(), ((zjt0) nit0Var).mo13743h().f172368b, str, 2));
                    } else {
                        yew0Var.m215479c(str, null);
                    }
                }
            });
        }
        if (bxy0.m106932p().m185241p(this.zzc.getContext())) {
            zzA("/logScionEvent", new gqs0(this.zzc.getContext()));
        }
        if (dqs0Var != null) {
            zzA("/setInterstitialProperties", new cqs0(dqs0Var));
        }
        if (uqs0Var != null) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue()) {
                zzA("/inspectorNetworkExtras", uqs0Var);
            }
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168315g9)).booleanValue() && tqs0Var != null) {
            zzA("/shareSheet", tqs0Var);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168380l9)).booleanValue() && nqs0Var != null) {
            zzA("/inspectorOutOfContextTest", nqs0Var);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168154Ta)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", aqs0.f72872u);
            zzA("/presentPlayStoreOverlay", aqs0.f72873v);
            zzA("/expandPlayStoreOverlay", aqs0.f72874w);
            zzA("/collapsePlayStoreOverlay", aqs0.f72875x);
            zzA("/closePlayStoreOverlay", aqs0.f72876y);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168231a3)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", aqs0.f72849A);
            zzA("/resetPAID", aqs0.f72877z);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168382lb)).booleanValue()) {
            wit0 wit0Var = this.zzc;
            if (wit0Var.mo13733c() != null && wit0Var.mo13733c().f155908r0) {
                zzA("/writeToLocalStorage", aqs0.f72850B);
                zzA("/clearLocalStorageKeys", aqs0.f72851C);
            }
        }
        this.zzg = har0Var;
        this.zzh = joy0Var;
        this.zzk = yns0Var;
        this.zzl = aos0Var;
        this.zzv = rar0Var;
        this.zzx = w9s0Var3;
        this.zzm = ggu0Var;
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

    @Override // p153l.ggu0
    public final void zzbo() {
        ggu0 ggu0Var = this.zzm;
        if (ggu0Var != null) {
            ggu0Var.zzbo();
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
        InputStream inputStreamM13597I;
        Long l2;
        final boolean z;
        final boolean z2;
        final boolean z3;
        String str2;
        try {
            String strM195119c = u9t0.m195119c(str, this.zzc.getContext(), this.zzC);
            if (!strM195119c.equals(str)) {
                return zzP(strM195119c, map);
            }
            zzbbb zzbbbVarM13600g = zzbbb.m13600g(Uri.parse(str));
            if (zzbbbVarM13600g != null) {
                HashMap map2 = new HashMap();
                map2.put(OSSHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
                Uri uri = Uri.parse(str);
                final boolean z4 = true;
                if (uri.getQueryParameterNames().contains("range")) {
                    List listM117430f = dpw0.m117427c(bow0.m105711b('-')).m117430f(uri.getQueryParameter("range"));
                    if (listM117430f.size() == 2) {
                        int i2 = Integer.parseInt((String) listM117430f.get(0));
                        int i3 = Integer.parseInt((String) listM117430f.get(1)) + 1;
                        if (i2 > 0) {
                            zzbbbVarM13600g.zzh = i2;
                        }
                        i = i3 - i2;
                    } else {
                        i = -1;
                    }
                } else {
                    i = -1;
                }
                webResourceResponse = null;
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168349j4)).booleanValue()) {
                    zzbbbVarM13600g.zzi = epw0.m121874c(this.zzc.zzr());
                    zzbbbVarM13600g.zzj = this.zzc.zzf();
                    if (zzbbbVarM13600g.zzg) {
                        dgs0 dgs0Var = sgs0.f168375l4;
                        qgs0 qgs0VarM144075c = jas0.m144075c();
                        l2 = (Long) qgs0VarM144075c.m176505a(dgs0Var);
                        z = qgs0VarM144075c;
                    } else {
                        dgs0 dgs0Var2 = sgs0.f168362k4;
                        qgs0 qgs0VarM144075c2 = jas0.m144075c();
                        l2 = (Long) qgs0VarM144075c2.m176505a(dgs0Var2);
                        z = qgs0VarM144075c2;
                    }
                    try {
                        long jLongValue = l2.longValue();
                        long jElapsedRealtime = bxy0.m106918b().elapsedRealtime();
                        bxy0.m106922f();
                        Future futureM109060a = ccs0.m109060a(this.zzc.getContext(), zzbbbVarM13600g);
                        try {
                            dcs0 dcs0Var = (dcs0) futureM109060a.get(jLongValue, TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(dcs0Var.m115286d()));
                                    map2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(dcs0Var.m115288f()));
                                    map2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(dcs0Var.m115287e()));
                                    map2.put("X-Afma-Gcache-CachedBytes", Long.toString(dcs0Var.m115284a()));
                                    inputStreamM13597I = dcs0Var.m115285c();
                                    if (i != -1) {
                                        try {
                                            inputStreamM13597I = itw0.m142129a(inputStreamM13597I, i);
                                        } catch (InterruptedException unused) {
                                            z3 = true;
                                            futureM109060a.cancel(true);
                                            Thread.currentThread().interrupt();
                                            final long jElapsedRealtime2 = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime;
                                            C2098b.f9751l.post(new Runnable() { // from class: l.ajt0
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.f71878a.zzo(z3, jElapsedRealtime2);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime2 + "ms";
                                            z = z3;
                                        } catch (ExecutionException | TimeoutException unused2) {
                                            z2 = true;
                                            futureM109060a.cancel(true);
                                            final long jElapsedRealtime3 = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime;
                                            C2098b.f9751l.post(new Runnable() { // from class: l.ajt0
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.f71878a.zzo(z2, jElapsedRealtime3);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime3 + "ms";
                                            z = z2;
                                        }
                                    }
                                    final long jElapsedRealtime4 = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime;
                                    C2098b.f9751l.post(new Runnable() { // from class: l.ajt0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f71878a.zzo(z4, jElapsedRealtime4);
                                        }
                                    });
                                    str2 = "Cache connection took " + jElapsedRealtime4 + "ms";
                                } catch (Throwable th) {
                                    th = th;
                                    z = 1;
                                    final long jElapsedRealtime5 = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime;
                                    C2098b.f9751l.post(new Runnable() { // from class: l.ajt0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f71878a.zzo(z, jElapsedRealtime5);
                                        }
                                    });
                                    d2v0.m113737k("Cache connection took " + jElapsedRealtime5 + "ms");
                                    throw th;
                                }
                            } catch (InterruptedException unused3) {
                                z3 = true;
                                inputStreamM13597I = null;
                            } catch (ExecutionException | TimeoutException unused4) {
                                z2 = true;
                                inputStreamM13597I = null;
                            }
                        } catch (InterruptedException unused5) {
                            inputStreamM13597I = null;
                            z3 = false;
                        } catch (ExecutionException | TimeoutException unused6) {
                            inputStreamM13597I = null;
                            z2 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            z = 0;
                        }
                        d2v0.m113737k(str2);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    zzbay zzbayVarM134422b = bxy0.m106921e().m134422b(zzbbbVarM13600g);
                    if (zzbayVarM134422b == null || !zzbayVarM134422b.zze()) {
                        inputStream = null;
                    } else {
                        map2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbayVarM134422b.zzd()));
                        map2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbayVarM134422b.m13599h0()));
                        map2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbayVarM134422b.m13598J()));
                        map2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbayVarM134422b.m13595F()));
                        inputStreamM13597I = zzbayVarM134422b.m13597I();
                        if (i != -1) {
                            inputStreamM13597I = itw0.m142129a(inputStreamM13597I, i);
                        }
                    }
                    if (inputStream != null) {
                        return new WebResourceResponse("", "", 200, "OK", map2, inputStream);
                    }
                }
                inputStream = inputStreamM13597I;
                if (inputStream != null) {
                    return new WebResourceResponse("", "", 200, "OK", map2, inputStream);
                }
            } else {
                webResourceResponse = null;
            }
            return (cct0.m109067k() && ((Boolean) uis0.f179145b.m149974e()).booleanValue()) ? zzP(str, map) : webResourceResponse;
        } catch (Exception | NoClassDefFoundError e) {
            bxy0.m106933q().m120275w(e, "AdWebViewClient.interceptRequest");
            return zzO();
        }
    }

    @Override // p153l.nkt0
    public final w9s0 zzd() {
        return this.zzx;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue() && this.zzc.zzm() != null) {
                chs0.m109843a(this.zzc.zzm().m140032a(), this.zzc.zzk(), "awfllc");
            }
            lkt0 lkt0Var = this.zzi;
            boolean z = false;
            if (!this.zzA && !this.zzo) {
                z = true;
            }
            lkt0Var.mo99557a(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.mo13749l();
    }

    public final void zzh() {
        w8t0 w8t0Var = this.zza;
        if (w8t0Var != null) {
            w8t0Var.zze();
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
                m0t0 m0t0Var = this.zzy;
                if (m0t0Var != null) {
                    m0t0Var.m156534h(true);
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

    @Override // p153l.nkt0
    public final void zzj(Uri uri) {
        d2v0.m113737k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            d2v0.m113737k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168066M6)).booleanValue() || bxy0.m106933q().m120262g() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            oct0.f146733a.execute(new Runnable() { // from class: l.zit0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i = gjt0.zzb;
                    bxy0.m106933q().m120262g().m97915e(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167957D5)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) jas0.m144075c().m176505a(sgs0.f167981F5)).intValue()) {
                d2v0.m113737k("Parsing gmsg query params on BG thread: ".concat(path));
                pvw0.m173991r(bxy0.m106934r().m12388D(uri), new cjt0(this, list, path, uri), oct0.f146737e);
                return;
            }
        }
        bxy0.m106934r();
        zzQ(C2098b.m12376o(uri), list, path);
    }

    @Override // p153l.nkt0
    public final void zzk() {
        fcs0 fcs0Var = this.zzd;
        if (fcs0Var != null) {
            fcs0Var.m125047c(10005);
        }
        this.zzA = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // p153l.nkt0
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // p153l.nkt0
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    public final /* synthetic */ void zzn() {
        this.zzc.mo13751m();
        BinderC2096b binderC2096bZzL = this.zzc.zzL();
        if (binderC2096bZzL != null) {
            binderC2096bZzL.m12316G();
        }
    }

    public final /* synthetic */ void zzo(boolean z, long j) {
        this.zzc.mo13714K(z, j);
    }

    public final /* synthetic */ void zzp(View view, w8t0 w8t0Var, int i) {
        zzS(view, w8t0Var, i - 1);
    }

    @Override // p153l.nkt0
    public final void zzq(int i, int i2, boolean z) {
        r0t0 r0t0Var = this.zzw;
        if (r0t0Var != null) {
            r0t0Var.m179243h(i, i2);
        }
        m0t0 m0t0Var = this.zzy;
        if (m0t0Var != null) {
            m0t0Var.m156537k(i, i2, false);
        }
    }

    @Override // p153l.nkt0
    public final void zzr() {
        w8t0 w8t0Var = this.zza;
        if (w8t0Var != null) {
            WebView webViewMo13715L = this.zzc.mo13715L();
            if (kkl0.m150133O(webViewMo13715L)) {
                zzS(webViewMo13715L, w8t0Var, 10);
                return;
            }
            zzR();
            bjt0 bjt0Var = new bjt0(this, w8t0Var);
            this.zzF = bjt0Var;
            ((View) this.zzc).addOnAttachStateChangeListener(bjt0Var);
        }
    }

    @Override // p153l.ggu0
    public final void zzs() {
        ggu0 ggu0Var = this.zzm;
        if (ggu0Var != null) {
            ggu0Var.zzs();
        }
    }

    public final void zzu(zzc zzcVar, boolean z) {
        wit0 wit0Var = this.zzc;
        boolean zMo13730a0 = wit0Var.mo13730a0();
        boolean zZzU = zzU(zMo13730a0, wit0Var);
        boolean z2 = true;
        if (!zZzU && z) {
            z2 = false;
        }
        har0 har0Var = zZzU ? null : this.zzg;
        joy0 joy0Var = zMo13730a0 ? null : this.zzh;
        rar0 rar0Var = this.zzv;
        wit0 wit0Var2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcVar, har0Var, joy0Var, rar0Var, wit0Var2.zzn(), wit0Var2, z2 ? null : this.zzm));
    }

    public final void zzv(String str, String str2, int i) {
        qbv0 qbv0Var = this.zzE;
        wit0 wit0Var = this.zzc;
        zzx(new AdOverlayInfoParcel(wit0Var, wit0Var.zzn(), str, str2, 14, qbv0Var));
    }

    public final void zzw(boolean z, int i, boolean z2) {
        wit0 wit0Var = this.zzc;
        boolean zZzU = zzU(wit0Var.mo13730a0(), wit0Var);
        boolean z3 = true;
        if (!zZzU && z2) {
            z3 = false;
        }
        har0 har0Var = zZzU ? null : this.zzg;
        joy0 joy0Var = this.zzh;
        rar0 rar0Var = this.zzv;
        wit0 wit0Var2 = this.zzc;
        zzx(new AdOverlayInfoParcel(har0Var, joy0Var, rar0Var, wit0Var2, z, i, wit0Var2.zzn(), z3 ? null : this.zzm, zzT(this.zzc) ? this.zzE : null));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        m0t0 m0t0Var = this.zzy;
        boolean zM156539m = m0t0Var != null ? m0t0Var.m156539m() : false;
        bxy0.m106927k();
        ghy0.m130283a(this.zzc.getContext(), adOverlayInfoParcel, !zM156539m);
        w8t0 w8t0Var = this.zza;
        if (w8t0Var != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            w8t0Var.mo185106A(str);
        }
    }

    public final void zzy(boolean z, int i, String str, String str2, boolean z2) {
        wit0 wit0Var = this.zzc;
        boolean zMo13730a0 = wit0Var.mo13730a0();
        boolean zZzU = zzU(zMo13730a0, wit0Var);
        boolean z3 = true;
        if (!zZzU && z2) {
            z3 = false;
        }
        har0 har0Var = zZzU ? null : this.zzg;
        djt0 djt0Var = zMo13730a0 ? null : new djt0(this.zzc, this.zzh);
        yns0 yns0Var = this.zzk;
        aos0 aos0Var = this.zzl;
        rar0 rar0Var = this.zzv;
        wit0 wit0Var2 = this.zzc;
        zzx(new AdOverlayInfoParcel(har0Var, djt0Var, yns0Var, aos0Var, rar0Var, wit0Var2, z, i, str, str2, wit0Var2.zzn(), z3 ? null : this.zzm, zzT(this.zzc) ? this.zzE : null));
    }

    public final void zzz(boolean z, int i, String str, boolean z2, boolean z3) {
        wit0 wit0Var = this.zzc;
        boolean zMo13730a0 = wit0Var.mo13730a0();
        boolean zZzU = zzU(zMo13730a0, wit0Var);
        boolean z4 = true;
        if (!zZzU && z2) {
            z4 = false;
        }
        har0 har0Var = zZzU ? null : this.zzg;
        djt0 djt0Var = zMo13730a0 ? null : new djt0(this.zzc, this.zzh);
        yns0 yns0Var = this.zzk;
        aos0 aos0Var = this.zzl;
        rar0 rar0Var = this.zzv;
        wit0 wit0Var2 = this.zzc;
        zzx(new AdOverlayInfoParcel(har0Var, djt0Var, yns0Var, aos0Var, rar0Var, wit0Var2, z, i, str, wit0Var2.zzn(), z4 ? null : this.zzm, zzT(this.zzc) ? this.zzE : null, z3));
    }
}
