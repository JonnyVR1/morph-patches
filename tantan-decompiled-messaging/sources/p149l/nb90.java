package p149l;

import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class nb90 {

    /* JADX INFO: renamed from: l.nb90$a */
    public static /* synthetic */ class C18664a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f138021a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f138021a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f138021a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f138021a[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f138021a[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f138021a[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f138021a[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f138021a[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f138021a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m158763a(PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privilege_type", m158765c(purchaseType));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220398t("e_privileges_cards", OMSDialogPositon.p_privileges_view, jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public static void m158764b() {
        zvf0.m220396r("e_privilege_svip_filter_more", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: c */
    public static String m158765c(PurchaseType purchaseType) {
        switch (C18664a.f138021a[purchaseType.ordinal()]) {
            case 1:
                return "vip";
            case 2:
                return "odiamond";
            case 3:
                return SummarizedPrivilegesId.supremePartner;
            case 4:
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
    public static void m158766d() {
        zvf0.m220396r("e_privilege_help", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: e */
    public static void m158767e() {
        zvf0.m220396r("e_privilege_svip_privacy_more", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: f */
    public static void m158768f() {
        zvf0.m220396r("e_privilege_svip_see_more", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: g */
    public static void m158769g() {
        zvf0.m220396r("e_privilege_svip_upgrade", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: h */
    public static void m158770h() {
        zvf0.m220402x("e_privilege_svip_upgrade", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: i */
    public static void m158771i() {
        zvf0.m220396r("e_privilege_vip_upgrade", OMSDialogPositon.p_privileges_view);
    }

    /* JADX INFO: renamed from: j */
    public static void m158772j() {
        zvf0.m220402x("e_privilege_vip_upgrade", OMSDialogPositon.p_privileges_view);
    }
}
