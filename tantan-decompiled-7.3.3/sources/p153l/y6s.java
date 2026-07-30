package p153l;

import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;

/* JADX INFO: loaded from: classes13.dex */
public class y6s {

    /* JADX INFO: renamed from: a */
    public static Boolean f197708a = null;

    /* JADX INFO: renamed from: b */
    public static String f197709b = "virtual_top_like_bubble_key";

    /* JADX INFO: renamed from: c */
    public static String f197710c = "virtual_auction_bubble_key";

    /* JADX INFO: renamed from: d */
    public static String f197711d = "momo";

    /* JADX INFO: renamed from: e */
    public static String f197712e = "message_entrance";

    /* JADX INFO: renamed from: a */
    public static boolean m214493a(String str) {
        return "commercialRoom".equals(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m214494b(String str) {
        return m214496d(str) || m214493a(str) || m214495c(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m214495c(String str) {
        return VirtualVoiceMotionType.lovePlanet.equals(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m214496d(String str) {
        return "virtualAvatar".equals(str);
    }
}
