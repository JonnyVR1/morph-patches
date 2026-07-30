package p153l;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeii;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfom;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class jcv0 implements kcv0 {
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ hfw0 m144380i(String str, String str2, String str3, zzeih zzeihVar, String str4, WebView webView, String str5, String str6, zzeii zzeiiVar) {
        lfw0 lfw0VarM154039a = lfw0.m154039a(ThirdPushManager.VENDOR_TYPE_FCM, str2);
        zzfom zzfomVarM144384m = m144384m("javascript");
        zzfoi zzfoiVarM144382k = m144382k(zzeihVar.toString());
        zzfom zzfomVar = zzfom.NONE;
        if (zzfomVarM144384m == zzfomVar) {
            dct0.m115298g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfoiVarM144382k == null) {
            dct0.m115298g("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzeihVar)));
            return null;
        }
        zzfom zzfomVarM144384m2 = m144384m(str4);
        if (zzfoiVarM144382k == zzfoi.VIDEO && zzfomVarM144384m2 == zzfomVar) {
            dct0.m115298g("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return hfw0.m134882a(ifw0.m139752a(zzfoiVarM144382k, m144383l(zzeiiVar.toString()), zzfomVarM144384m, zzfomVarM144384m2, true), jfw0.m144730b(lfw0VarM154039a, webView, str5, ""));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ hfw0 m144381j(String str, String str2, String str3, String str4, zzeih zzeihVar, WebView webView, String str5, String str6, zzeii zzeiiVar) {
        lfw0 lfw0VarM154039a = lfw0.m154039a(str, str2);
        zzfom zzfomVarM144384m = m144384m("javascript");
        zzfom zzfomVarM144384m2 = m144384m(str4);
        zzfoi zzfoiVarM144382k = m144382k(zzeihVar.toString());
        zzfom zzfomVar = zzfom.NONE;
        if (zzfomVarM144384m == zzfomVar) {
            dct0.m115298g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfoiVarM144382k == null) {
            dct0.m115298g("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzeihVar)));
            return null;
        }
        if (zzfoiVarM144382k == zzfoi.VIDEO && zzfomVarM144384m2 == zzfomVar) {
            dct0.m115298g("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return hfw0.m134882a(ifw0.m139752a(zzfoiVarM144382k, m144383l(zzeiiVar.toString()), zzfomVarM144384m, zzfomVarM144384m2, true), jfw0.m144731c(lfw0VarM154039a, webView, str5, ""));
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static zzfoi m144382k(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return zzfoi.HTML_DISPLAY;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return zzfoi.VIDEO;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return zzfoi.NATIVE_DISPLAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static zzfol m144383l(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return zzfol.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return zzfol.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return zzfol.BEGIN_TO_RENDER;
        }
        return zzfol.UNSPECIFIED;
    }

    /* JADX INFO: renamed from: m */
    public static zzfom m144384m(@Nullable String str) {
        if ("native".equals(str)) {
            return zzfom.NATIVE;
        }
        return "javascript".equals(str) ? zzfom.JAVASCRIPT : zzfom.NONE;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final Object m144385n(icv0 icv0Var) {
        try {
            return icv0Var.zza();
        } catch (RuntimeException e) {
            bxy0.m106933q().m120274v(e, "omid exception");
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m144386o(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            bxy0.m106933q().m120274v(e, "omid exception");
        }
    }

    @Override // p153l.kcv0
    /* JADX INFO: renamed from: a */
    public final void mo144387a(final hfw0 hfw0Var, final View view) {
        m144386o(new Runnable() { // from class: l.ubv0
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168160U4)).booleanValue() && ffw0.m125428b()) {
                    hfw0Var.mo134883b(view, zzfok.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // p153l.kcv0
    /* JADX INFO: renamed from: b */
    public final boolean mo144388b(final Context context) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168160U4)).booleanValue()) {
            Boolean bool = (Boolean) m144385n(new icv0() { // from class: l.ecv0
                @Override // p153l.icv0
                public final Object zza() {
                    if (ffw0.m125428b()) {
                        return Boolean.TRUE;
                    }
                    ffw0.m125427a(context);
                    return Boolean.valueOf(ffw0.m125428b());
                }
            });
            return bool != null && bool.booleanValue();
        }
        dct0.m115298g("Omid flag is disabled");
        return false;
    }

    @Override // p153l.kcv0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final hfw0 mo144389c(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final zzeii zzeiiVar, final zzeih zzeihVar, @Nullable final String str5) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168160U4)).booleanValue() || !ffw0.m125428b()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = ThirdPushManager.VENDOR_TYPE_FCM;
        final String str8 = "";
        return (hfw0) m144385n(new icv0(str7, str, str6, zzeihVar, str4, webView, str5, str8, zzeiiVar) { // from class: l.fcv0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f98286b;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ zzeih f98288d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ String f98289e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ WebView f98290f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ String f98291g;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ zzeii f98293i;

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f98285a = ThirdPushManager.VENDOR_TYPE_FCM;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f98287c = "javascript";

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ String f98292h = "";

            {
                this.f98286b = str;
                this.f98288d = zzeihVar;
                this.f98289e = str4;
                this.f98290f = webView;
                this.f98291g = str5;
                this.f98293i = zzeiiVar;
            }

            @Override // p153l.icv0
            public final Object zza() {
                return jcv0.m144380i(this.f98285a, this.f98286b, this.f98287c, this.f98288d, this.f98289e, this.f98290f, this.f98291g, this.f98292h, this.f98293i);
            }
        });
    }

    @Override // p153l.kcv0
    /* JADX INFO: renamed from: d */
    public final void mo144390d(final hfw0 hfw0Var) {
        m144386o(new Runnable() { // from class: l.hcv0
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168160U4)).booleanValue() && ffw0.m125428b()) {
                    hfw0Var.mo134884c();
                }
            }
        });
    }

    @Override // p153l.kcv0
    /* JADX INFO: renamed from: e */
    public final void mo144391e(final hfw0 hfw0Var, final View view) {
        m144386o(new Runnable() { // from class: l.vbv0
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168160U4)).booleanValue() && ffw0.m125428b()) {
                    hfw0Var.mo134885d(view);
                }
            }
        });
    }

    @Override // p153l.kcv0
    @Nullable
    /* JADX INFO: renamed from: f */
    public final hfw0 mo144392f(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final String str5, final zzeii zzeiiVar, final zzeih zzeihVar, @Nullable final String str6) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168160U4)).booleanValue() || !ffw0.m125428b()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (hfw0) m144385n(new icv0(str5, str, str8, str4, zzeihVar, webView, str6, str7, zzeiiVar) { // from class: l.wbv0

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f188280a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f188281b;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f188283d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ zzeih f188284e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ WebView f188285f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ String f188286g;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ zzeii f188288i;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f188282c = "javascript";

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ String f188287h = "";

            {
                this.f188283d = str4;
                this.f188284e = zzeihVar;
                this.f188285f = webView;
                this.f188286g = str6;
                this.f188288i = zzeiiVar;
            }

            @Override // p153l.icv0
            public final Object zza() {
                return jcv0.m144381j(this.f188280a, this.f188281b, this.f188282c, this.f188283d, this.f188284e, this.f188285f, this.f188286g, this.f188287h, this.f188288i);
            }
        });
    }

    @Override // p153l.kcv0
    @Nullable
    /* JADX INFO: renamed from: g */
    public final String mo144393g(Context context) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168160U4)).booleanValue()) {
            return (String) m144385n(new icv0() { // from class: l.gcv0
                @Override // p153l.icv0
                public final Object zza() {
                    return "a.1.4.8-google_20230803";
                }
            });
        }
        return null;
    }

    @Override // p153l.kcv0
    /* JADX INFO: renamed from: h */
    public final void mo144394h(final hfw0 hfw0Var) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168160U4)).booleanValue() && ffw0.m125428b()) {
            Objects.requireNonNull(hfw0Var);
            m144386o(new Runnable() { // from class: l.xbv0
                @Override // java.lang.Runnable
                public final void run() {
                    hfw0Var.mo134886e();
                }
            });
        }
    }
}
