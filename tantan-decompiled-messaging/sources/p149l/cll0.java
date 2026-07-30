package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class cll0 {

    /* JADX INFO: renamed from: l.cll0$a */
    public static /* synthetic */ class C16189a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81447a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f81447a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81447a[Privilege.vip_unlimited_likes.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81447a[Privilege.vip_location.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81447a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f81447a[Privilege.vip_super_like.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81447a[Privilege.message_read_state.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f81447a[Privilege.advanced_filter.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f81447a[Privilege.privacy_membership.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f81447a[Privilege.letter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f81447a[Privilege.recover_unmatches.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f81447a[Privilege.superlike_pkg.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f81447a[Privilege.likeNoLimit_pkg.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f81447a[Privilege.undo_pkg.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f81447a[Privilege.roaming_pkg.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m107554a(PurchaseType purchaseType, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m135150k(purchaseType));
            jSONObject.put("is_privileged", m107557d(purchaseType));
            jSONObject.put("is_TeamTanTanlink", z);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220398t("e_buy_privilege_button", OMSDialogPositon.p_privileges_view, jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public static void m107555b(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m135150k(purchaseType));
            jSONObject.put("is_privileged", m107557d(purchaseType));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220398t("e_buy_privilege_button", "p_privilege_intro", jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public static String m107556c(Privilege privilege) {
        switch (C16189a.f81447a[privilege.ordinal()]) {
            case 1:
                return "badge";
            case 2:
                return "likeLimit";
            case 3:
                return "location";
            case 4:
                return "undo";
            case 5:
                return "superLike";
            case 6:
                return "readMessages";
            case 7:
                return "advancedFilter";
            case 8:
                return SummarizedPrivilegesId.privacyMembership;
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
    public static String m107557d(PurchaseType purchaseType) {
        return m107558e(CoreModule.f17554l.m94654e().mo34977Xp(purchaseType));
    }

    /* JADX INFO: renamed from: e */
    public static String m107558e(boolean z) {
        return z ? "yes" : "no";
    }

    /* JADX INFO: renamed from: f */
    public static void m107559f(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m135150k(purchaseType));
            jSONObject.put("is_privileged", m107557d(purchaseType));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220404z("e_buy_privilege_button", OMSDialogPositon.p_privileges_view, jSONObject);
    }

    /* JADX INFO: renamed from: g */
    public static void m107560g(PurchaseType purchaseType, Privilege privilege) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m135150k(purchaseType));
            jSONObject.put("privilegeType", m107556c(privilege));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220404z("e_privilege_intro_banner", "p_privilege_intro", jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public static void m107561h(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m135150k(purchaseType));
            jSONObject.put("is_privileged", m107557d(purchaseType));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220404z("e_buy_privilege_button", "p_privilege_intro", jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public static void m107562i(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m135150k(purchaseType));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220404z("e_privilege_page_card", OMSDialogPositon.p_privileges_view, jSONObject);
    }
}
