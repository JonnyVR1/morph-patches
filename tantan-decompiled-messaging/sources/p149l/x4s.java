package p149l;

import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;

/* JADX INFO: loaded from: classes13.dex */
public class x4s {

    /* JADX INFO: renamed from: a */
    public static Boolean f191053a = null;

    /* JADX INFO: renamed from: b */
    public static String f191054b = "virtual_top_like_bubble_key";

    /* JADX INFO: renamed from: c */
    public static String f191055c = "virtual_auction_bubble_key";

    /* JADX INFO: renamed from: d */
    public static String f191056d = "momo";

    /* JADX INFO: renamed from: e */
    public static String f191057e = "message_entrance";

    /* JADX INFO: renamed from: a */
    public static boolean m207011a(String str) {
        return "commercialRoom".equals(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m207012b(String str) {
        return m207014d(str) || m207011a(str) || m207013c(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m207013c(String str) {
        return VirtualVoiceMotionType.lovePlanet.equals(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m207014d(String str) {
        return "virtualAvatar".equals(str);
    }
}
