package p006l;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.CrashHelper;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cll0 {

    /* JADX INFO: renamed from: l.cll0$a */
    public static /* synthetic */ class C0610a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9717a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f9717a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9717a[Privilege.vip_unlimited_likes.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9717a[Privilege.vip_location.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9717a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9717a[Privilege.vip_super_like.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9717a[Privilege.message_read_state.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9717a[Privilege.advanced_filter.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9717a[Privilege.privacy_membership.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9717a[Privilege.letter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9717a[Privilege.recover_unmatches.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9717a[Privilege.superlike_pkg.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9717a[Privilege.likeNoLimit_pkg.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9717a[Privilege.undo_pkg.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9717a[Privilege.roaming_pkg.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13519a(PurchaseType purchaseType, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m16584k(purchaseType));
            jSONObject.put("is_privileged", m13522d(purchaseType));
            jSONObject.put("is_TeamTanTanlink", z);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        zvf0.t("e_buy_privilege_button", "p_privileges_view", jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public static void m13520b(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m16584k(purchaseType));
            jSONObject.put("is_privileged", m13522d(purchaseType));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        zvf0.t("e_buy_privilege_button", "p_privilege_intro", jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public static String m13521c(Privilege privilege) {
        switch (C0610a.f9717a[privilege.ordinal()]) {
            case 1:
                return "badge";
            case 2:
                return "likeLimit";
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return "location";
            case CameraSticker.STATE_ERROR /* 4 */:
                return "undo";
            case 5:
                return "superLike";
            case 6:
                return "readMessages";
            case 7:
                return "advancedFilter";
            case 8:
                return "privacyMembership";
            case 9:
                return "letter";
            case 10:
                return "recoverMatches";
            case 11:
            case 12:
            case 13:
            case 14:
                return privilege.getFunctionType();
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m13522d(PurchaseType purchaseType) {
        return m13523e(CoreModule.f1543l.m11709e().m6914Xp(purchaseType));
    }

    /* JADX INFO: renamed from: e */
    public static String m13523e(boolean z) {
        return z ? "yes" : "no";
    }

    /* JADX INFO: renamed from: f */
    public static void m13524f(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m16584k(purchaseType));
            jSONObject.put("is_privileged", m13522d(purchaseType));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        zvf0.z("e_buy_privilege_button", "p_privileges_view", jSONObject);
    }

    /* JADX INFO: renamed from: g */
    public static void m13525g(PurchaseType purchaseType, Privilege privilege) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m16584k(purchaseType));
            jSONObject.put("privilegeType", m13521c(privilege));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        zvf0.z("e_privilege_intro_banner", "p_privilege_intro", jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public static void m13526h(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m16584k(purchaseType));
            jSONObject.put("is_privileged", m13522d(purchaseType));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        zvf0.z("e_buy_privilege_button", "p_privilege_intro", jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public static void m13527i(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m16584k(purchaseType));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        zvf0.z("e_privilege_page_card", "p_privileges_view", jSONObject);
    }
}
