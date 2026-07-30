package p006l;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.CrashHelper;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nb90 {

    /* JADX INFO: renamed from: l.nb90$a */
    public static /* synthetic */ class C1042a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17573a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f17573a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17573a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17573a[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17573a[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17573a[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17573a[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17573a[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17573a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19997a(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privilege_type", m19999c(purchaseType));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        zvf0.t("e_privileges_cards", "p_privileges_view", jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public static void m19998b() {
        zvf0.r("e_privilege_svip_filter_more", "p_privileges_view");
    }

    /* JADX INFO: renamed from: c */
    public static String m19999c(PurchaseType purchaseType) {
        switch (C1042a.f17573a[purchaseType.ordinal()]) {
            case 1:
                return "vip";
            case 2:
                return "odiamond";
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return "supremePartner";
            case CameraSticker.STATE_ERROR /* 4 */:
                return "undo";
            case 5:
                return "superlike";
            case 6:
                return "likelimit";
            case 7:
                return "location";
            default:
                return "svip";
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m20000d() {
        zvf0.r("e_privilege_help", "p_privileges_view");
    }

    /* JADX INFO: renamed from: e */
    public static void m20001e() {
        zvf0.r("e_privilege_svip_privacy_more", "p_privileges_view");
    }

    /* JADX INFO: renamed from: f */
    public static void m20002f() {
        zvf0.r("e_privilege_svip_see_more", "p_privileges_view");
    }

    /* JADX INFO: renamed from: g */
    public static void m20003g() {
        zvf0.r("e_privilege_svip_upgrade", "p_privileges_view");
    }

    /* JADX INFO: renamed from: h */
    public static void m20004h() {
        zvf0.x("e_privilege_svip_upgrade", "p_privileges_view");
    }

    /* JADX INFO: renamed from: i */
    public static void m20005i() {
        zvf0.r("e_privilege_vip_upgrade", "p_privileges_view");
    }

    /* JADX INFO: renamed from: j */
    public static void m20006j() {
        zvf0.x("e_privilege_vip_upgrade", "p_privileges_view");
    }
}
