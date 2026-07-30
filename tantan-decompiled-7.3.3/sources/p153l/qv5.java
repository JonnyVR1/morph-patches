package p153l;

import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.common.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class qv5 extends pv5 {

    /* JADX INFO: renamed from: a */
    public static wyd0 f159697a = new wyd0("unstableName", "tantanapp", false);

    /* JADX INFO: renamed from: b */
    public static wyd0 f159698b = new wyd0("protocal", "https");

    /* JADX INFO: renamed from: c */
    public static final String f159699c = f159697a.get();

    /* JADX INFO: renamed from: d */
    public static final String f159700d = f159698b.get();

    /* JADX INFO: renamed from: e */
    public static final String f159701e = "https://core.tantanapp.com";

    /* JADX INFO: renamed from: f */
    public static final String f159702f = "https://account.tantanapp.com";

    /* JADX INFO: renamed from: g */
    public static final String f159703g = "https://cloud.tantanapp.com";

    /* JADX INFO: renamed from: h */
    public static final String f159704h = "https://client-tracking.tantanapp.com";

    /* JADX INFO: renamed from: i */
    public static final String f159705i = "https://client-tracking_new.tantanapp.com";

    /* JADX INFO: renamed from: j */
    public static final String f159706j = "https://asset.tantanapp.com";

    /* JADX INFO: renamed from: k */
    public static final String f159707k = "https://autoupdate.tantanapp.com";

    /* JADX INFO: renamed from: l */
    public static final String f159708l = "https://abtest.tantanapp.com";

    /* JADX INFO: renamed from: m */
    public static final String f159709m = "https://ai-growth.tantanapp.com";

    /* JADX INFO: renamed from: n */
    public static final String f159710n = "https://growth.tantanapp.com";

    /* JADX INFO: renamed from: o */
    public static final String f159711o = "https://m.tantanapp.com";

    /* JADX INFO: renamed from: p */
    public static final String f159712p = "https://my-tantan.tantanapp.com";

    /* JADX INFO: renamed from: q */
    public static final String f159713q = "https://i.tantanapp.com";

    /* JADX INFO: renamed from: r */
    public static final String f159714r = "https://live-web.tantanapp.com";

    /* JADX INFO: renamed from: s */
    public static final String f159715s = "https://ai-suggest.tantanapp.com";

    /* JADX INFO: renamed from: t */
    public static final String f159716t = "https://openapi.tantanapp.com";

    /* JADX INFO: renamed from: u */
    public static final String f159717u = "https://gif.tantanapp.com";

    /* JADX INFO: renamed from: v */
    public static final String f159718v = "https://accounts.tantanapp.com";

    /* JADX INFO: renamed from: w */
    public static final String f159719w = "https://devices.tantanapp.com";

    /* JADX INFO: renamed from: x */
    public static final String f159720x = "http://feedback.tantanapp.com";

    /* JADX INFO: renamed from: y */
    public static final String f159721y = "https://order.tantanapp.com";

    /* JADX INFO: renamed from: z */
    public static final String f159722z = "https://decommercialize.tantanapp.com";

    /* JADX INFO: renamed from: A */
    public static final String f159691A = "https://oms.tantanapp.com";

    /* JADX INFO: renamed from: B */
    public static final String f159692B = "https://intl-live-activity.tantanapp.com";

    /* JADX INFO: renamed from: C */
    public static final String f159693C = "https://live-realtime.tantanapp.com";

    /* JADX INFO: renamed from: D */
    public static final String f159694D = "https://m.tantanapp.com";

    /* JADX INFO: renamed from: E */
    public static final String f159695E = "https://intlweb.tantanapp.com";

    /* JADX INFO: renamed from: F */
    public static final String f159696F = "https://h5-static-overseas.tantanapp.com";

    /* JADX INFO: renamed from: a */
    public static String m178247a(String str) {
        return m178250d() + "://" + str + "." + m178249c() + ".com";
    }

    /* JADX INFO: renamed from: b */
    public static String m178248b() {
        return App.f16088e.getResources().getString(R$string.f18101U0);
    }

    /* JADX INFO: renamed from: c */
    public static String m178249c() {
        return "tantanapp";
    }

    /* JADX INFO: renamed from: d */
    public static String m178250d() {
        return f159700d;
    }

    /* JADX INFO: renamed from: e */
    public static void m178251e(boolean z) {
        if (z) {
            f159698b.put("https");
            rr2.m182682b().m182686e("sp_protocal", "https");
        } else {
            f159698b.put("http");
            rr2.m182682b().m182686e("sp_protocal", "http");
        }
    }
}
