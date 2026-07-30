package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046mm.mmfile.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class mib0 {

    /* JADX INFO: renamed from: l.mib0$a */
    public static /* synthetic */ class C18619a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f136943a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f136944b;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f136944b = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f136944b[PurchaseType.TYPE_GET_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f136944b[PurchaseType.TYPE_GET_BOOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f136944b[PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f136944b[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f136944b[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f136944b[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f136944b[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f136944b[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f136944b[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f136944b[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f136944b[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f136944b[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f136944b[PurchaseType.TYPE_PRIVATE_CUSTOM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f136944b[PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f136944b[PurchaseType.TYPE_LIMITED_TRIAL_SEE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[Privilege.values().length];
            f136943a = iArr2;
            try {
                iArr2[Privilege.vip_super_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f136943a[Privilege.vip_undo.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f136943a[Privilege.vip_unlimited_likes.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f136943a[Privilege.vip_location.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f136943a[Privilege.vip_badge.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f136943a[Privilege.vip_membership_active_time_gp.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f136943a[Privilege.vip_membership_remark_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f136943a[Privilege.vip_membership_search_gp.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f136943a[Privilege.vip_membership_read_gp.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f136943a[Privilege.ads_not_disturb.ordinal()] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f136943a[Privilege.block_harassing_words.ordinal()] = 11;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f136943a[Privilege.unlock_learn_about_him_module.ordinal()] = 12;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f136943a[Privilege.pick_tantan_credits_users.ordinal()] = 13;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f136943a[Privilege.youth_roaming.ordinal()] = 14;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f136943a[Privilege.youth_find_partner.ordinal()] = 15;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f136943a[Privilege.youth_blind_box.ordinal()] = 16;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f136943a[Privilege.youth_superlike.ordinal()] = 17;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f136943a[Privilege.youth_message_read.ordinal()] = 18;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f136943a[Privilege.private_custom.ordinal()] = 19;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f136943a[Privilege.hide_me_from_nearby.ordinal()] = 20;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m158472a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        CrashHelper.m82480d(new Throwable("track purchaseId is empty"), 100);
        return niw.m163315e(CoreModule.m30929H().userId() + pzi0.m174454o());
    }

    /* JADX INFO: renamed from: b */
    public static String m158473b(String str) {
        return str.replaceAll(Constants.SEPARATOR_COMMA, "");
    }

    /* JADX INFO: renamed from: c */
    public static Coupon m158474c(List<Coupon> list) {
        for (Coupon coupon : list) {
            double dM174454o = pzi0.m174454o();
            if (dM174454o >= coupon.beginTime && dM174454o <= coupon.endTime) {
                return coupon;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m158475d(@Nullable Boolean bool, String str) {
        if (bool == null) {
            return str;
        }
        return bool.booleanValue() ? "true" : "false";
    }

    /* JADX INFO: renamed from: e */
    public static String m158476e(Merchandise merchandise) {
        if (merchandise == null) {
            return "";
        }
        if (merchandise.isNoneLiveCoin()) {
            return merchandise.quantity + "coin";
        }
        if (merchandise.isAcceleratePairing()) {
            return merchandise.quantity + "";
        }
        if (merchandise.weekly() && merchandise.autoRenewable()) {
            return "7d";
        }
        if (merchandise.weekly()) {
            return "-7d";
        }
        if (merchandise.monthly() && merchandise.autoRenewable()) {
            return "1m";
        }
        if (merchandise.monthly()) {
            return "-1m";
        }
        if (merchandise.quarterly() && merchandise.autoRenewable()) {
            return "3m";
        }
        if (merchandise.quarterly()) {
            return "-3m";
        }
        if (merchandise.semiAnnual() && merchandise.autoRenewable()) {
            return "6m";
        }
        if (merchandise.semiAnnual()) {
            return "-6m";
        }
        if (merchandise.yearly() && merchandise.autoRenewable()) {
            return "12m";
        }
        if (merchandise.yearly()) {
            return "-12m";
        }
        if (merchandise.daily() && merchandise.noneRenewable()) {
            return "-1d";
        }
        return (merchandise.hour() && merchandise.noneRenewable()) ? "-1h" : "";
    }

    /* JADX INFO: renamed from: f */
    public static String m158477f(Privilege privilege, String str) {
        if (TextUtils.isEmpty(m158478g(str))) {
            return privilege != null ? privilege.getFunctionType() : "otherVas";
        }
        return m158478g(str);
    }

    /* JADX INFO: renamed from: g */
    public static String m158478g(String str) {
        if ("p_special_card,deeplink,click".equals(str)) {
            return "otherVas";
        }
        return "NA,NA,offline_popup".equals(str) ? "see" : "";
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m158479h(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject2.put(next, jSONObject.optString(next));
                } catch (JSONException e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: i */
    public static String m158480i(C8928d.a aVar) {
        if (aVar == null) {
            return "";
        }
        return (!m158483l(aVar) || TextUtils.isEmpty(aVar.m54786u())) ? m158473b(aVar.m54774l()) : m158473b(aVar.m54786u());
    }

    /* JADX INFO: renamed from: j */
    public static List<String> m158481j(List<C8928d> list) {
        ArrayList arrayList = new ArrayList();
        for (C8928d c8928d : list) {
            if (NullChecker.m82486a(c8928d.m54705d())) {
                arrayList.add(c8928d.m54705d().m54784s().defaultStockKeepUnit.f21249id);
            }
            if (NullChecker.m82486a(c8928d.m54703b())) {
                arrayList.add(c8928d.m54703b().m54784s().defaultStockKeepUnit.f21249id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static String m158482k(PurchaseType purchaseType) {
        switch (C18619a.f136944b[purchaseType.ordinal()]) {
            case 1:
                return "seeWhoLikedMe";
            case 2:
                return "vip";
            case 3:
                return "boost";
            case 4:
                return CoreModule.m30933P().m143405a().mo34637z9() ? "quickchatNumber" : "quickchatMembership";
            case 5:
                return "svip";
            case 6:
                return "undo";
            case 7:
                return "superlike";
            case 8:
                return "likelimit";
            case 9:
                return "location";
            case 10:
                return "oDiamond";
            case 11:
                return SummarizedPrivilegesId.supremePartner;
            case 12:
                return SchemeKey.femaleVIP;
            case 13:
                return "youthVip";
            case 14:
                return "PrivateCustom";
            case 15:
                return ProductCategory.oDiamondPrivateCustom;
            case 16:
                return "limitedTrialSee";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m158483l(C8928d.a aVar) {
        if (aVar == null) {
            return false;
        }
        return aVar.m54732E() || aVar.m54733F() || v5b0.m199785k(aVar.m54784s());
    }

    /* JADX INFO: renamed from: m */
    public static String m158484m(Privilege privilege) {
        double dM174454o = pzi0.m174454o() - CoreModule.f18264c.f20381e0.m116600p9().createdTime;
        if (CoreModule.f18264c.f20381e0.f89246i0.get().intValue() <= 5 && dM174454o > 2.592E8d) {
            return "upgradeInform";
        }
        if (privilege == null) {
            return "likeLimit";
        }
        switch (C18619a.f136943a[privilege.ordinal()]) {
            case 1:
                return "superlike";
            case 2:
                return "undo";
            case 3:
                return "likeLimit";
            case 4:
                return "locationRoam";
            case 5:
                return "vipBadge";
            case 6:
                return "hideActiveTime";
            case 7:
            default:
                return "setNickname";
            case 8:
                return FirebaseAnalytics.Event.SEARCH;
            case 9:
                return "readReceipts";
            case 10:
                return "adsNotDisturb";
            case 11:
                return "blockHarassingWords";
            case 12:
                return "unlockLearnAboutHimModule";
            case 13:
                return "pickTanTanCreditsUsers";
            case 14:
                return "youthRoaming";
            case 15:
                return "youthFindPartner";
            case 16:
                return "youthBlindBox";
            case 17:
                return "youthSuperLike";
            case 18:
                return "youthMessageRead";
            case 19:
                return "privateCustom";
            case 20:
                return "hideMeFromNearby";
        }
    }
}
