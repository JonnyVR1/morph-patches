package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.List;
import l.j760;
import l.l3f;
import l.vwb;
import l.w9j;
import l.ycu;
import l.ypv;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zgc0 {
    /* JADX INFO: renamed from: b */
    public static String m27327b(String str, boolean z) {
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
        return TextUtils.equals(ycu.h, str) ? ycu.h : "NA";
    }

    /* JADX INFO: renamed from: c */
    public static void m27328c(String str, int i, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", str2);
            jSONObject.put("productType", "coin");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        zvf0.u("e_purchase_button", "p_purchase_page", new j760[]{vwb.Y("skuID", str), vwb.Y("platform", "alipay"), vwb.Y("purchaseShowFrom", str2), vwb.Y("productType", "coin"), vwb.Y("price", Integer.valueOf(i)), vwb.Y("fold", Integer.valueOf(z ? 1 : 0)), vwb.Y("pageExtras", jSONObject), vwb.Y("livefrist", Integer.valueOf(z2 ? 1 : 0)), vwb.Y("no_secret_payment", ypv.a.k0() ? "yes" : "no"), vwb.Y("user_secret_staus", ypv.a.k0() ? "yes" : "no")});
    }

    /* JADX INFO: renamed from: d */
    public static void m27329d(pge0 pge0Var, String str, boolean z) {
        if (pge0Var.m20250k()) {
            zvf0.D("e_live_send_gift_into", str, new j760[]{vwb.Y("event_type", "MC"), vwb.Y("gift_redpackage_event_type", "redpackage"), vwb.Y("gift_redpackage_operate", z ? "yes" : "no")});
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m27330e(pge0 pge0Var, String str) {
        if (pge0Var.m20250k()) {
            zvf0.D("e_live_send_gift_into", str, new j760[]{vwb.Y("event_type", "MV"), vwb.Y("gift_redpackage_event_type", "redpackage")});
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m27331f(String str) {
        zvf0.u("e_user_live_room_first_recharge_success", "p_user_live_room", new j760[]{vwb.Y("livefrist", str)});
    }

    /* JADX INFO: renamed from: g */
    public static void m27332g(String str) {
        zvf0.A("e_user_live_room_first_recharge_success", "p_user_live_room", new j760[]{vwb.Y("livefrist", str)});
    }

    /* JADX INFO: renamed from: h */
    public static void m27333h() {
        zvf0.r("e_fold_click", "p_purchase_page");
    }

    /* JADX INFO: renamed from: i */
    public static void m27334i(String str, List<BLiveMerchandise> list, boolean z, String str2) {
        l3f l3fVar = new l3f();
        l3fVar.n = "p_purchase_page";
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        zvf0.o(l3fVar, new j760[]{vwb.Y("purchaseShowFrom", str), vwb.Y("productType", "coin"), vwb.Y("fold", Integer.valueOf(z ? 1 : 0)), vwb.Y("livefrist", str2), vwb.Y("skuGroup", vwb.U(vwb.Q(list, new w9j() { // from class: l.ygc0
            public final Object call(Object obj) {
                return ((BLiveMerchandise) obj).defaultStockKeepUnit.id;
            }
        }), ",")), vwb.Y("ui_type", "NA"), vwb.Y("function_type", "live")});
    }

    /* JADX INFO: renamed from: j */
    public static void m27335j(String str) {
        zvf0.u("e_purchase_intermediate_button", "p_purchase_page", new j760[]{vwb.Y("skuID", str)});
    }

    /* JADX INFO: renamed from: k */
    public static void m27336k(String str, int i, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", str2);
            jSONObject.put("productType", "coin");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        zvf0.u("e_purchase_button", "p_purchase_page", new j760[]{vwb.Y("skuID", str), vwb.Y("platform", "wechat"), vwb.Y("purchaseShowFrom", str2), vwb.Y("productType", "coin"), vwb.Y("price", Integer.valueOf(i)), vwb.Y("fold", Integer.valueOf(z ? 1 : 0)), vwb.Y("livefrist", Integer.valueOf(z2 ? 1 : 0)), vwb.Y("pageExtras", jSONObject), vwb.Y("no_secret_payment", ypv.a.k0() ? "yes" : "no"), vwb.Y("user_secret_staus", ypv.a.k0() ? "yes" : "no")});
    }
}
