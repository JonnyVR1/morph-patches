package p153l;

import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.tantanapp.foxstatistics.entity.EventNameEnum;

/* JADX INFO: loaded from: classes5.dex */
public class j1k {
    /* JADX INFO: renamed from: a */
    public static void m143139a(String str) {
        boolean zM132330i = guk0.m132330i(str);
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_audio_giftwall";
        i4g0.m138517o(q4fVar, pf60.m172085a("sight", zM132330i ? "me" : LiveRegionTag.others), pf60.m172085a("other_user_id", str));
    }

    /* JADX INFO: renamed from: b */
    public static void m143140b(String str, String str2, String str3, String str4, String str5, boolean z) {
        i4g0.m138523u("e_gift", "p_audio_light_gift", jyb.m147494Y("enoughCoin", Boolean.valueOf(z)), jyb.m147494Y("module", str), jyb.m147494Y("giftId", str2), jyb.m147494Y("giftUnitPrice", str3), jyb.m147494Y("gift_type", str4), jyb.m147494Y("gift_receiver_id", str5));
    }

    /* JADX INFO: renamed from: c */
    public static void m143141c(Boolean bool, String str) {
        i4g0.m138492A("e_gift", "p_audio_light_gift", jyb.m147494Y("module", bool.booleanValue() ? "light_gift_pop_rightwall" : "light_gift_pop_giftwall"), jyb.m147494Y("giftId", str));
    }

    /* JADX INFO: renamed from: d */
    public static void m143142d(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        if (str.equals("gift_naming_pop_profile") || str.equals("gift_naming_pop_giftwall")) {
            m143143e(str2, str3, str4, str5, str6, z);
        } else if (str.equals("light_gift_pop_giftwall") || str.equals("light_gift_pop_rightwall")) {
            m143140b(str2, str3, str4, str5, str6, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m143143e(String str, String str2, String str3, String str4, String str5, boolean z) {
        i4g0.m138523u("e_gift", "p_audio_gift_naming", jyb.m147494Y("enoughCoin", Boolean.valueOf(z)), jyb.m147494Y("module", str), jyb.m147494Y("giftId", str2), jyb.m147494Y("giftUnitPrice", str3), jyb.m147494Y("gift_type", str4), jyb.m147494Y("gift_receiver_id", str5));
    }

    /* JADX INFO: renamed from: f */
    public static void m143144f(Boolean bool, String str) {
        i4g0.m138492A("e_gift", "p_audio_gift_naming", jyb.m147494Y("module", bool.booleanValue() ? "gift_naming_pop_profile" : "gift_naming_pop_giftwall"), jyb.m147494Y("giftId", str));
    }

    /* JADX INFO: renamed from: g */
    public static void m143145g() {
        i4g0.m138520r("e_audio_rightwall_get_button", "p_audio_rightwall");
    }
}
