package p149l;

import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.common.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class mu5 extends lu5 {

    /* JADX INFO: renamed from: a */
    public static uqd0 f135733a = new uqd0("unstableName", "tantanapp", false);

    /* JADX INFO: renamed from: b */
    public static uqd0 f135734b = new uqd0("protocal", "https");

    /* JADX INFO: renamed from: c */
    public static final String f135735c = f135733a.get();

    /* JADX INFO: renamed from: d */
    public static final String f135736d = f135734b.get();

    /* JADX INFO: renamed from: e */
    public static final String f135737e = "https://core.tantanapp.com";

    /* JADX INFO: renamed from: f */
    public static final String f135738f = "https://account.tantanapp.com";

    /* JADX INFO: renamed from: g */
    public static final String f135739g = "https://cloud.tantanapp.com";

    /* JADX INFO: renamed from: h */
    public static final String f135740h = "https://client-tracking.tantanapp.com";

    /* JADX INFO: renamed from: i */
    public static final String f135741i = "https://client-tracking_new.tantanapp.com";

    /* JADX INFO: renamed from: j */
    public static final String f135742j = "https://asset.tantanapp.com";

    /* JADX INFO: renamed from: k */
    public static final String f135743k = "https://autoupdate.tantanapp.com";

    /* JADX INFO: renamed from: l */
    public static final String f135744l = "https://abtest.tantanapp.com";

    /* JADX INFO: renamed from: m */
    public static final String f135745m = "https://ai-growth.tantanapp.com";

    /* JADX INFO: renamed from: n */
    public static final String f135746n = "https://growth.tantanapp.com";

    /* JADX INFO: renamed from: o */
    public static final String f135747o = "https://m.tantanapp.com";

    /* JADX INFO: renamed from: p */
    public static final String f135748p = "https://my-tantan.tantanapp.com";

    /* JADX INFO: renamed from: q */
    public static final String f135749q = "https://i.tantanapp.com";

    /* JADX INFO: renamed from: r */
    public static final String f135750r = "https://live-web.tantanapp.com";

    /* JADX INFO: renamed from: s */
    public static final String f135751s = "https://ai-suggest.tantanapp.com";

    /* JADX INFO: renamed from: t */
    public static final String f135752t = "https://openapi.tantanapp.com";

    /* JADX INFO: renamed from: u */
    public static final String f135753u = "https://gif.tantanapp.com";

    /* JADX INFO: renamed from: v */
    public static final String f135754v = "https://accounts.tantanapp.com";

    /* JADX INFO: renamed from: w */
    public static final String f135755w = "https://devices.tantanapp.com";

    /* JADX INFO: renamed from: x */
    public static final String f135756x = "http://feedback.tantanapp.com";

    /* JADX INFO: renamed from: y */
    public static final String f135757y = "https://order.tantanapp.com";

    /* JADX INFO: renamed from: z */
    public static final String f135758z = "https://decommercialize.tantanapp.com";

    /* JADX INFO: renamed from: A */
    public static final String f135727A = "https://oms.tantanapp.com";

    /* JADX INFO: renamed from: B */
    public static final String f135728B = "https://intl-live-activity.tantanapp.com";

    /* JADX INFO: renamed from: C */
    public static final String f135729C = "https://live-realtime.tantanapp.com";

    /* JADX INFO: renamed from: D */
    public static final String f135730D = "https://m.tantanapp.com";

    /* JADX INFO: renamed from: E */
    public static final String f135731E = "https://intlweb.tantanapp.com";

    /* JADX INFO: renamed from: F */
    public static final String f135732F = "https://h5-static-overseas.tantanapp.com";

    /* JADX INFO: renamed from: a */
    public static String m156376a(String str) {
        return m156379d() + "://" + str + "." + m156378c() + ".com";
    }

    /* JADX INFO: renamed from: b */
    public static String m156377b() {
        return App.f15369e.getResources().getString(R$string.f17382U0);
    }

    /* JADX INFO: renamed from: c */
    public static String m156378c() {
        return "tantanapp";
    }

    /* JADX INFO: renamed from: d */
    public static String m156379d() {
        return f135736d;
    }

    /* JADX INFO: renamed from: e */
    public static void m156380e(boolean z) {
        if (z) {
            f135734b.put("https");
            br2.m103433b().m103437e("sp_protocal", "https");
        } else {
            f135734b.put("http");
            br2.m103433b().m103437e("sp_protocal", "http");
        }
    }
}
