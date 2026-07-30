package p149l;

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
public final class d3v0 implements e3v0 {
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ b6w0 m109945i(String str, String str2, String str3, zzeih zzeihVar, String str4, WebView webView, String str5, String str6, zzeii zzeiiVar) {
        f6w0 f6w0VarM119697a = f6w0.m119697a(ThirdPushManager.VENDOR_TYPE_FCM, str2);
        zzfom zzfomVarM109949m = m109949m("javascript");
        zzfoi zzfoiVarM109947k = m109947k(zzeihVar.toString());
        zzfom zzfomVar = zzfom.NONE;
        if (zzfomVarM109949m == zzfomVar) {
            x2t0.m206869g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfoiVarM109947k == null) {
            x2t0.m206869g("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzeihVar)));
            return null;
        }
        zzfom zzfomVarM109949m2 = m109949m(str4);
        if (zzfoiVarM109947k == zzfoi.VIDEO && zzfomVarM109949m2 == zzfomVar) {
            x2t0.m206869g("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return b6w0.m100476a(c6w0.m105510a(zzfoiVarM109947k, m109948l(zzeiiVar.toString()), zzfomVarM109949m, zzfomVarM109949m2, true), d6w0.m110193b(f6w0VarM119697a, webView, str5, ""));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ b6w0 m109946j(String str, String str2, String str3, String str4, zzeih zzeihVar, WebView webView, String str5, String str6, zzeii zzeiiVar) {
        f6w0 f6w0VarM119697a = f6w0.m119697a(str, str2);
        zzfom zzfomVarM109949m = m109949m("javascript");
        zzfom zzfomVarM109949m2 = m109949m(str4);
        zzfoi zzfoiVarM109947k = m109947k(zzeihVar.toString());
        zzfom zzfomVar = zzfom.NONE;
        if (zzfomVarM109949m == zzfomVar) {
            x2t0.m206869g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfoiVarM109947k == null) {
            x2t0.m206869g("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzeihVar)));
            return null;
        }
        if (zzfoiVarM109947k == zzfoi.VIDEO && zzfomVarM109949m2 == zzfomVar) {
            x2t0.m206869g("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return b6w0.m100476a(c6w0.m105510a(zzfoiVarM109947k, m109948l(zzeiiVar.toString()), zzfomVarM109949m, zzfomVarM109949m2, true), d6w0.m110194c(f6w0VarM119697a, webView, str5, ""));
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static zzfoi m109947k(String str) {
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
    public static zzfol m109948l(String str) {
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
    public static zzfom m109949m(@Nullable String str) {
        if ("native".equals(str)) {
            return zzfom.NATIVE;
        }
        return "javascript".equals(str) ? zzfom.JAVASCRIPT : zzfom.NONE;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final Object m109950n(c3v0 c3v0Var) {
        try {
            return c3v0Var.zza();
        } catch (RuntimeException e) {
            vny0.m199079q().m212289v(e, "omid exception");
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m109951o(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            vny0.m199079q().m212289v(e, "omid exception");
        }
    }

    @Override // p149l.e3v0
    /* JADX INFO: renamed from: a */
    public final void mo109952a(final b6w0 b6w0Var, final View view) {
        m109951o(new Runnable() { // from class: l.o2v0
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132089U4)).booleanValue() && z5w0.m217378b()) {
                    b6w0Var.mo100477b(view, zzfok.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // p149l.e3v0
    /* JADX INFO: renamed from: b */
    public final boolean mo109953b(final Context context) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132089U4)).booleanValue()) {
            Boolean bool = (Boolean) m109950n(new c3v0() { // from class: l.y2v0
                @Override // p149l.c3v0
                public final Object zza() {
                    if (z5w0.m217378b()) {
                        return Boolean.TRUE;
                    }
                    z5w0.m217377a(context);
                    return Boolean.valueOf(z5w0.m217378b());
                }
            });
            return bool != null && bool.booleanValue();
        }
        x2t0.m206869g("Omid flag is disabled");
        return false;
    }

    @Override // p149l.e3v0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final b6w0 mo109954c(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final zzeii zzeiiVar, final zzeih zzeihVar, @Nullable final String str5) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132089U4)).booleanValue() || !z5w0.m217378b()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = ThirdPushManager.VENDOR_TYPE_FCM;
        final String str8 = "";
        return (b6w0) m109950n(new c3v0(str7, str, str6, zzeihVar, str4, webView, str5, str8, zzeiiVar) { // from class: l.z2v0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f201281b;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ zzeih f201283d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ String f201284e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ WebView f201285f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ String f201286g;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ zzeii f201288i;

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f201280a = ThirdPushManager.VENDOR_TYPE_FCM;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f201282c = "javascript";

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ String f201287h = "";

            {
                this.f201281b = str;
                this.f201283d = zzeihVar;
                this.f201284e = str4;
                this.f201285f = webView;
                this.f201286g = str5;
                this.f201288i = zzeiiVar;
            }

            @Override // p149l.c3v0
            public final Object zza() {
                return d3v0.m109945i(this.f201280a, this.f201281b, this.f201282c, this.f201283d, this.f201284e, this.f201285f, this.f201286g, this.f201287h, this.f201288i);
            }
        });
    }

    @Override // p149l.e3v0
    /* JADX INFO: renamed from: d */
    public final void mo109955d(final b6w0 b6w0Var) {
        m109951o(new Runnable() { // from class: l.b3v0
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132089U4)).booleanValue() && z5w0.m217378b()) {
                    b6w0Var.mo100478c();
                }
            }
        });
    }

    @Override // p149l.e3v0
    /* JADX INFO: renamed from: e */
    public final void mo109956e(final b6w0 b6w0Var, final View view) {
        m109951o(new Runnable() { // from class: l.p2v0
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132089U4)).booleanValue() && z5w0.m217378b()) {
                    b6w0Var.mo100479d(view);
                }
            }
        });
    }

    @Override // p149l.e3v0
    @Nullable
    /* JADX INFO: renamed from: f */
    public final b6w0 mo109957f(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final String str5, final zzeii zzeiiVar, final zzeih zzeihVar, @Nullable final String str6) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132089U4)).booleanValue() || !z5w0.m217378b()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (b6w0) m109950n(new c3v0(str5, str, str8, str4, zzeihVar, webView, str6, str7, zzeiiVar) { // from class: l.q2v0

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f152313a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f152314b;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f152316d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ zzeih f152317e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ WebView f152318f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ String f152319g;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ zzeii f152321i;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f152315c = "javascript";

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ String f152320h = "";

            {
                this.f152316d = str4;
                this.f152317e = zzeihVar;
                this.f152318f = webView;
                this.f152319g = str6;
                this.f152321i = zzeiiVar;
            }

            @Override // p149l.c3v0
            public final Object zza() {
                return d3v0.m109946j(this.f152313a, this.f152314b, this.f152315c, this.f152316d, this.f152317e, this.f152318f, this.f152319g, this.f152320h, this.f152321i);
            }
        });
    }

    @Override // p149l.e3v0
    @Nullable
    /* JADX INFO: renamed from: g */
    public final String mo109958g(Context context) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132089U4)).booleanValue()) {
            return (String) m109950n(new c3v0() { // from class: l.a3v0
                @Override // p149l.c3v0
                public final Object zza() {
                    return "a.1.4.8-google_20230803";
                }
            });
        }
        return null;
    }

    @Override // p149l.e3v0
    /* JADX INFO: renamed from: h */
    public final void mo109959h(final b6w0 b6w0Var) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132089U4)).booleanValue() && z5w0.m217378b()) {
            Objects.requireNonNull(b6w0Var);
            m109951o(new Runnable() { // from class: l.r2v0
                @Override // java.lang.Runnable
                public final void run() {
                    b6w0Var.mo100480e();
                }
            });
        }
    }
}
