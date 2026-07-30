package p149l;

import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.tantanapp.foxstatistics.entity.EventNameEnum;

/* JADX INFO: loaded from: classes5.dex */
public class tyj {
    /* JADX INFO: renamed from: a */
    public static void m191048a(String str) {
        boolean zM97310i = alk0.m97310i(str);
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = "p_audio_giftwall";
        zvf0.m220393o(l3fVar, j760.m140076a("sight", zM97310i ? "me" : LiveRegionTag.others), j760.m140076a("other_user_id", str));
    }

    /* JADX INFO: renamed from: b */
    public static void m191049b(String str, String str2, String str3, String str4, String str5, boolean z) {
        zvf0.m220399u("e_gift", "p_audio_light_gift", vwb.m200311Y("enoughCoin", Boolean.valueOf(z)), vwb.m200311Y("module", str), vwb.m200311Y("giftId", str2), vwb.m200311Y("giftUnitPrice", str3), vwb.m200311Y("gift_type", str4), vwb.m200311Y("gift_receiver_id", str5));
    }

    /* JADX INFO: renamed from: c */
    public static void m191050c(Boolean bool, String str) {
        zvf0.m220368A("e_gift", "p_audio_light_gift", vwb.m200311Y("module", bool.booleanValue() ? "light_gift_pop_rightwall" : "light_gift_pop_giftwall"), vwb.m200311Y("giftId", str));
    }

    /* JADX INFO: renamed from: d */
    public static void m191051d(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        if (str.equals("gift_naming_pop_profile") || str.equals("gift_naming_pop_giftwall")) {
            m191052e(str2, str3, str4, str5, str6, z);
        } else if (str.equals("light_gift_pop_giftwall") || str.equals("light_gift_pop_rightwall")) {
            m191049b(str2, str3, str4, str5, str6, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m191052e(String str, String str2, String str3, String str4, String str5, boolean z) {
        zvf0.m220399u("e_gift", "p_audio_gift_naming", vwb.m200311Y("enoughCoin", Boolean.valueOf(z)), vwb.m200311Y("module", str), vwb.m200311Y("giftId", str2), vwb.m200311Y("giftUnitPrice", str3), vwb.m200311Y("gift_type", str4), vwb.m200311Y("gift_receiver_id", str5));
    }

    /* JADX INFO: renamed from: f */
    public static void m191053f(Boolean bool, String str) {
        zvf0.m220368A("e_gift", "p_audio_gift_naming", vwb.m200311Y("module", bool.booleanValue() ? "gift_naming_pop_profile" : "gift_naming_pop_giftwall"), vwb.m200311Y("giftId", str));
    }

    /* JADX INFO: renamed from: g */
    public static void m191054g() {
        zvf0.m220396r("e_audio_rightwall_get_button", "p_audio_rightwall");
    }
}
