package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class zgc0 {
    /* JADX INFO: renamed from: b */
    public static String m218630b(String str, boolean z) {
        if ("liveFastGiftClick".equals(str)) {
            return z ? "p_anchor_live_room,e_quickgift,click" : "p_user_live_room,e_quickgift,click";
        }
        if ("liveGiftBarGiftClick".equals(str)) {
            return z ? "p_anchor_live_room,e_gift,click" : "p_user_live_room,e_gift,click";
        }
        if ("liveGiftBarRechargeClick".equals(str)) {
            return z ? "p_anchor_live_room,e_recharge,click" : "p_user_live_room,e_recharge,click";
        }
        if ("liveGiftSuitClick".equals(str)) {
            return z ? "p_anchor_live_room,e_live_gift_set,click" : "p_user_live_room,e_live_gift_set,click";
        }
        if ("liveGiftGuardClick".equals(str)) {
            return "p_anchor_live_room,e_live_guard_info,click";
        }
        if (TextUtils.equals("liveGiftH5Click", str)) {
            return z ? "p_anchor_live_room,e_h5,click" : "p_user_live_room,e_h5,click";
        }
        if (TextUtils.equals("liveGiftDanMuKuClick", str)) {
            return z ? "p_anchor_live_room,e_pay_bullet_button,click" : "p_user_live_room,e_pay_bullet_button,click";
        }
        if (TextUtils.equals("e_audio_ktv_panel", str)) {
            return "e_audio_ktv_panel";
        }
        return TextUtils.equals(ycu.f197490h, str) ? ycu.f197490h : "NA";
    }

    /* JADX INFO: renamed from: c */
    public static void m218631c(String str, int i, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", str2);
            jSONObject.put("productType", "coin");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220399u("e_purchase_button", "p_purchase_page", vwb.m200311Y("skuID", str), vwb.m200311Y("platform", "alipay"), vwb.m200311Y("purchaseShowFrom", str2), vwb.m200311Y("productType", "coin"), vwb.m200311Y(FirebaseAnalytics.Param.PRICE, Integer.valueOf(i)), vwb.m200311Y("fold", Integer.valueOf(z ? 1 : 0)), vwb.m200311Y("pageExtras", jSONObject), vwb.m200311Y("livefrist", Integer.valueOf(z2 ? 1 : 0)), vwb.m200311Y("no_secret_payment", ypv.f199493a.m199355k0() ? "yes" : "no"), vwb.m200311Y("user_secret_staus", ypv.f199493a.m199355k0() ? "yes" : "no"));
    }

    /* JADX INFO: renamed from: d */
    public static void m218632d(pge0 pge0Var, String str, boolean z) {
        if (pge0Var.m168685k()) {
            zvf0.m220371D("e_live_send_gift_into", str, vwb.m200311Y("event_type", "MC"), vwb.m200311Y("gift_redpackage_event_type", "redpackage"), vwb.m200311Y("gift_redpackage_operate", z ? "yes" : "no"));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m218633e(pge0 pge0Var, String str) {
        if (pge0Var.m168685k()) {
            zvf0.m220371D("e_live_send_gift_into", str, vwb.m200311Y("event_type", "MV"), vwb.m200311Y("gift_redpackage_event_type", "redpackage"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m218634f(String str) {
        zvf0.m220399u("e_user_live_room_first_recharge_success", "p_user_live_room", vwb.m200311Y("livefrist", str));
    }

    /* JADX INFO: renamed from: g */
    public static void m218635g(String str) {
        zvf0.m220368A("e_user_live_room_first_recharge_success", "p_user_live_room", vwb.m200311Y("livefrist", str));
    }

    /* JADX INFO: renamed from: h */
    public static void m218636h() {
        zvf0.m220396r("e_fold_click", "p_purchase_page");
    }

    /* JADX INFO: renamed from: i */
    public static void m218637i(String str, List<BLiveMerchandise> list, boolean z, String str2) {
        l3f l3fVar = new l3f();
        l3fVar.f125895n = "p_purchase_page";
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        zvf0.m220393o(l3fVar, vwb.m200311Y("purchaseShowFrom", str), vwb.m200311Y("productType", "coin"), vwb.m200311Y("fold", Integer.valueOf(z ? 1 : 0)), vwb.m200311Y("livefrist", str2), vwb.m200311Y("skuGroup", vwb.m200307U(vwb.m200303Q(list, new w9j() { // from class: l.ygc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveMerchandise) obj).defaultStockKeepUnit.f44443id;
            }
        }), Constants.SEPARATOR_COMMA)), vwb.m200311Y("ui_type", "NA"), vwb.m200311Y("function_type", "live"));
    }

    /* JADX INFO: renamed from: j */
    public static void m218638j(String str) {
        zvf0.m220399u("e_purchase_intermediate_button", "p_purchase_page", vwb.m200311Y("skuID", str));
    }

    /* JADX INFO: renamed from: k */
    public static void m218639k(String str, int i, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", str2);
            jSONObject.put("productType", "coin");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220399u("e_purchase_button", "p_purchase_page", vwb.m200311Y("skuID", str), vwb.m200311Y("platform", "wechat"), vwb.m200311Y("purchaseShowFrom", str2), vwb.m200311Y("productType", "coin"), vwb.m200311Y(FirebaseAnalytics.Param.PRICE, Integer.valueOf(i)), vwb.m200311Y("fold", Integer.valueOf(z ? 1 : 0)), vwb.m200311Y("livefrist", Integer.valueOf(z2 ? 1 : 0)), vwb.m200311Y("pageExtras", jSONObject), vwb.m200311Y("no_secret_payment", ypv.f199493a.m199355k0() ? "yes" : "no"), vwb.m200311Y("user_secret_staus", ypv.f199493a.m199355k0() ? "yes" : "no"));
    }
}
