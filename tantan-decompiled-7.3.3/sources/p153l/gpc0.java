package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class gpc0 {
    /* JADX INFO: renamed from: b */
    public static String m131242b(String str, boolean z) {
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
        return TextUtils.equals(zeu.f204081h, str) ? zeu.f204081h : "NA";
    }

    /* JADX INFO: renamed from: c */
    public static void m131243c(String str, int i, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", str2);
            jSONObject.put("productType", "coin");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138523u("e_purchase_button", "p_purchase_page", jyb.m147494Y("skuID", str), jyb.m147494Y("platform", "alipay"), jyb.m147494Y("purchaseShowFrom", str2), jyb.m147494Y("productType", "coin"), jyb.m147494Y(FirebaseAnalytics.Param.PRICE, Integer.valueOf(i)), jyb.m147494Y("fold", Integer.valueOf(z ? 1 : 0)), jyb.m147494Y("pageExtras", jSONObject), jyb.m147494Y("livefrist", Integer.valueOf(z2 ? 1 : 0)), jyb.m147494Y("no_secret_payment", zrv.f205799a.m207677k0() ? "yes" : "no"), jyb.m147494Y("user_secret_staus", zrv.f205799a.m207677k0() ? "yes" : "no"));
    }

    /* JADX INFO: renamed from: d */
    public static void m131244d(uoe0 uoe0Var, String str, boolean z) {
        if (uoe0Var.m196984k()) {
            i4g0.m138495D("e_live_send_gift_into", str, jyb.m147494Y("event_type", "MC"), jyb.m147494Y("gift_redpackage_event_type", "redpackage"), jyb.m147494Y("gift_redpackage_operate", z ? "yes" : "no"));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m131245e(uoe0 uoe0Var, String str) {
        if (uoe0Var.m196984k()) {
            i4g0.m138495D("e_live_send_gift_into", str, jyb.m147494Y("event_type", "MV"), jyb.m147494Y("gift_redpackage_event_type", "redpackage"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m131246f(String str) {
        i4g0.m138523u("e_user_live_room_first_recharge_success", "p_user_live_room", jyb.m147494Y("livefrist", str));
    }

    /* JADX INFO: renamed from: g */
    public static void m131247g(String str) {
        i4g0.m138492A("e_user_live_room_first_recharge_success", "p_user_live_room", jyb.m147494Y("livefrist", str));
    }

    /* JADX INFO: renamed from: h */
    public static void m131248h() {
        i4g0.m138520r("e_fold_click", "p_purchase_page");
    }

    /* JADX INFO: renamed from: i */
    public static void m131249i(String str, List<BLiveMerchandise> list, boolean z, String str2) {
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "p_purchase_page";
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        i4g0.m138517o(q4fVar, jyb.m147494Y("purchaseShowFrom", str), jyb.m147494Y("productType", "coin"), jyb.m147494Y("fold", Integer.valueOf(z ? 1 : 0)), jyb.m147494Y("livefrist", str2), jyb.m147494Y("skuGroup", jyb.m147490U(jyb.m147486Q(list, new qcj() { // from class: l.fpc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveMerchandise) obj).defaultStockKeepUnit.f45291id;
            }
        }), Constants.SEPARATOR_COMMA)), jyb.m147494Y("ui_type", "NA"), jyb.m147494Y("function_type", "live"));
    }

    /* JADX INFO: renamed from: j */
    public static void m131250j(String str) {
        i4g0.m138523u("e_purchase_intermediate_button", "p_purchase_page", jyb.m147494Y("skuID", str));
    }

    /* JADX INFO: renamed from: k */
    public static void m131251k(String str, int i, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", str2);
            jSONObject.put("productType", "coin");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138523u("e_purchase_button", "p_purchase_page", jyb.m147494Y("skuID", str), jyb.m147494Y("platform", "wechat"), jyb.m147494Y("purchaseShowFrom", str2), jyb.m147494Y("productType", "coin"), jyb.m147494Y(FirebaseAnalytics.Param.PRICE, Integer.valueOf(i)), jyb.m147494Y("fold", Integer.valueOf(z ? 1 : 0)), jyb.m147494Y("livefrist", Integer.valueOf(z2 ? 1 : 0)), jyb.m147494Y("pageExtras", jSONObject), jyb.m147494Y("no_secret_payment", zrv.f205799a.m207677k0() ? "yes" : "no"), jyb.m147494Y("user_secret_staus", zrv.f205799a.m207677k0() ? "yes" : "no"));
    }
}
