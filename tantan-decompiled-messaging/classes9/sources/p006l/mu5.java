package p006l;

import com.p000p1.mobile.putong.common.R$string;
import com.p1.mobile.android.app.App;
import l.br2;
import l.lu5;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mu5 extends lu5 {

    /* JADX INFO: renamed from: a */
    public static uqd0 f17252a = new uqd0("unstableName", "tantanapp", false);

    /* JADX INFO: renamed from: b */
    public static uqd0 f17253b = new uqd0("protocal", "https");

    /* JADX INFO: renamed from: c */
    public static final String f17254c = (String) f17252a.get();

    /* JADX INFO: renamed from: d */
    public static final String f17255d = (String) f17253b.get();

    /* JADX INFO: renamed from: e */
    public static final String f17256e = "https://core.tantanapp.com";

    /* JADX INFO: renamed from: f */
    public static final String f17257f = "https://account.tantanapp.com";

    /* JADX INFO: renamed from: g */
    public static final String f17258g = "https://cloud.tantanapp.com";

    /* JADX INFO: renamed from: h */
    public static final String f17259h = "https://client-tracking.tantanapp.com";

    /* JADX INFO: renamed from: i */
    public static final String f17260i = "https://client-tracking_new.tantanapp.com";

    /* JADX INFO: renamed from: j */
    public static final String f17261j = "https://asset.tantanapp.com";

    /* JADX INFO: renamed from: k */
    public static final String f17262k = "https://autoupdate.tantanapp.com";

    /* JADX INFO: renamed from: l */
    public static final String f17263l = "https://abtest.tantanapp.com";

    /* JADX INFO: renamed from: m */
    public static final String f17264m = "https://ai-growth.tantanapp.com";

    /* JADX INFO: renamed from: n */
    public static final String f17265n = "https://growth.tantanapp.com";

    /* JADX INFO: renamed from: o */
    public static final String f17266o = "https://m.tantanapp.com";

    /* JADX INFO: renamed from: p */
    public static final String f17267p = "https://my-tantan.tantanapp.com";

    /* JADX INFO: renamed from: q */
    public static final String f17268q = "https://i.tantanapp.com";

    /* JADX INFO: renamed from: r */
    public static final String f17269r = "https://live-web.tantanapp.com";

    /* JADX INFO: renamed from: s */
    public static final String f17270s = "https://ai-suggest.tantanapp.com";

    /* JADX INFO: renamed from: t */
    public static final String f17271t = "https://openapi.tantanapp.com";

    /* JADX INFO: renamed from: u */
    public static final String f17272u = "https://gif.tantanapp.com";

    /* JADX INFO: renamed from: v */
    public static final String f17273v = "https://accounts.tantanapp.com";

    /* JADX INFO: renamed from: w */
    public static final String f17274w = "https://devices.tantanapp.com";

    /* JADX INFO: renamed from: x */
    public static final String f17275x = "http://feedback.tantanapp.com";

    /* JADX INFO: renamed from: y */
    public static final String f17276y = "https://order.tantanapp.com";

    /* JADX INFO: renamed from: z */
    public static final String f17277z = "https://decommercialize.tantanapp.com";

    /* JADX INFO: renamed from: A */
    public static final String f17246A = "https://oms.tantanapp.com";

    /* JADX INFO: renamed from: B */
    public static final String f17247B = "https://intl-live-activity.tantanapp.com";

    /* JADX INFO: renamed from: C */
    public static final String f17248C = "https://live-realtime.tantanapp.com";

    /* JADX INFO: renamed from: D */
    public static final String f17249D = "https://m.tantanapp.com";

    /* JADX INFO: renamed from: E */
    public static final String f17250E = "https://intlweb.tantanapp.com";

    /* JADX INFO: renamed from: F */
    public static final String f17251F = "https://h5-static-overseas.tantanapp.com";

    /* JADX INFO: renamed from: a */
    public static String m19508a(String str) {
        return m19511d() + "://" + str + "." + m19510c() + ".com";
    }

    /* JADX INFO: renamed from: b */
    public static String m19509b() {
        return App.e.getResources().getString(R$string.f1371U0);
    }

    /* JADX INFO: renamed from: c */
    public static String m19510c() {
        return "tantanapp";
    }

    /* JADX INFO: renamed from: d */
    public static String m19511d() {
        return f17255d;
    }

    /* JADX INFO: renamed from: e */
    public static void m19512e(boolean z) {
        if (z) {
            f17253b.put("https");
            br2.b().e("sp_protocal", "https");
        } else {
            f17253b.put("http");
            br2.b().e("sp_protocal", "http");
        }
    }
}
