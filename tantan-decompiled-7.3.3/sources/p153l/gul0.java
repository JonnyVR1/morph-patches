package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class gul0 {

    /* JADX INFO: renamed from: l.gul0$a */
    public static /* synthetic */ class C17315a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f106517a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f106517a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106517a[Privilege.vip_unlimited_likes.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106517a[Privilege.vip_location.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106517a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f106517a[Privilege.vip_super_like.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f106517a[Privilege.message_read_state.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f106517a[Privilege.advanced_filter.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f106517a[Privilege.privacy_membership.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f106517a[Privilege.letter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f106517a[Privilege.recover_unmatches.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f106517a[Privilege.superlike_pkg.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f106517a[Privilege.likeNoLimit_pkg.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f106517a[Privilege.undo_pkg.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f106517a[Privilege.roaming_pkg.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m132336a(PurchaseType purchaseType, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", mib0.m158482k(purchaseType));
            jSONObject.put("is_privileged", m132339d(purchaseType));
            jSONObject.put("is_TeamTanTanlink", z);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138522t("e_buy_privilege_button", OMSDialogPositon.p_privileges_view, jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public static void m132337b(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", mib0.m158482k(purchaseType));
            jSONObject.put("is_privileged", m132339d(purchaseType));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138522t("e_buy_privilege_button", "p_privilege_intro", jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public static String m132338c(Privilege privilege) {
        switch (C17315a.f106517a[privilege.ordinal()]) {
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
    public static String m132339d(PurchaseType purchaseType) {
        return m132340e(CoreModule.f18273l.m143408e().mo35980Xp(purchaseType));
    }

    /* JADX INFO: renamed from: e */
    public static String m132340e(boolean z) {
        return z ? "yes" : "no";
    }

    /* JADX INFO: renamed from: f */
    public static void m132341f(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", mib0.m158482k(purchaseType));
            jSONObject.put("is_privileged", m132339d(purchaseType));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138528z("e_buy_privilege_button", OMSDialogPositon.p_privileges_view, jSONObject);
    }

    /* JADX INFO: renamed from: g */
    public static void m132342g(PurchaseType purchaseType, Privilege privilege) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", mib0.m158482k(purchaseType));
            jSONObject.put("privilegeType", m132338c(privilege));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138528z("e_privilege_intro_banner", "p_privilege_intro", jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public static void m132343h(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", mib0.m158482k(purchaseType));
            jSONObject.put("is_privileged", m132339d(purchaseType));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138528z("e_buy_privilege_button", "p_privilege_intro", jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public static void m132344i(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", mib0.m158482k(purchaseType));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138528z("e_privilege_page_card", OMSDialogPositon.p_privileges_view, jSONObject);
    }
}
