package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p041mm.mmfile.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class iab0 {

    /* JADX INFO: renamed from: l.iab0$a */
    public static /* synthetic */ class C17513a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f112294a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f112295b;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f112295b = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112295b[PurchaseType.TYPE_GET_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112295b[PurchaseType.TYPE_GET_BOOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112295b[PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112295b[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112295b[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112295b[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f112295b[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f112295b[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f112295b[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f112295b[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f112295b[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f112295b[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f112295b[PurchaseType.TYPE_PRIVATE_CUSTOM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f112295b[PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f112295b[PurchaseType.TYPE_LIMITED_TRIAL_SEE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[Privilege.values().length];
            f112294a = iArr2;
            try {
                iArr2[Privilege.vip_super_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f112294a[Privilege.vip_undo.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f112294a[Privilege.vip_unlimited_likes.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f112294a[Privilege.vip_location.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f112294a[Privilege.vip_badge.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f112294a[Privilege.vip_membership_active_time_gp.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f112294a[Privilege.vip_membership_remark_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f112294a[Privilege.vip_membership_search_gp.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f112294a[Privilege.vip_membership_read_gp.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f112294a[Privilege.ads_not_disturb.ordinal()] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f112294a[Privilege.block_harassing_words.ordinal()] = 11;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f112294a[Privilege.unlock_learn_about_him_module.ordinal()] = 12;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f112294a[Privilege.pick_tantan_credits_users.ordinal()] = 13;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f112294a[Privilege.youth_roaming.ordinal()] = 14;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f112294a[Privilege.youth_find_partner.ordinal()] = 15;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f112294a[Privilege.youth_blind_box.ordinal()] = 16;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f112294a[Privilege.youth_superlike.ordinal()] = 17;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f112294a[Privilege.youth_message_read.ordinal()] = 18;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f112294a[Privilege.private_custom.ordinal()] = 19;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f112294a[Privilege.hide_me_from_nearby.ordinal()] = 20;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m135140a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        CrashHelper.m81297d(new Throwable("track purchaseId is empty"), 100);
        return ogw.m164284e(CoreModule.m29931H().userId() + mqi0.m155944o());
    }

    /* JADX INFO: renamed from: b */
    public static String m135141b(String str) {
        return str.replaceAll(Constants.SEPARATOR_COMMA, "");
    }

    /* JADX INFO: renamed from: c */
    public static Coupon m135142c(List<Coupon> list) {
        for (Coupon coupon : list) {
            double dM155944o = mqi0.m155944o();
            if (dM155944o >= coupon.beginTime && dM155944o <= coupon.endTime) {
                return coupon;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m135143d(@Nullable Boolean bool, String str) {
        if (bool == null) {
            return str;
        }
        return bool.booleanValue() ? "true" : "false";
    }

    /* JADX INFO: renamed from: e */
    public static String m135144e(Merchandise merchandise) {
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
    public static String m135145f(Privilege privilege, String str) {
        if (TextUtils.isEmpty(m135146g(str))) {
            return privilege != null ? privilege.getFunctionType() : "otherVas";
        }
        return m135146g(str);
    }

    /* JADX INFO: renamed from: g */
    public static String m135146g(String str) {
        if ("p_special_card,deeplink,click".equals(str)) {
            return "otherVas";
        }
        return "NA,NA,offline_popup".equals(str) ? "see" : "";
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m135147h(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject2.put(next, jSONObject.optString(next));
                } catch (JSONException e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: i */
    public static String m135148i(C8765d.a aVar) {
        if (aVar == null) {
            return "";
        }
        return (!m135151l(aVar) || TextUtils.isEmpty(aVar.m53603u())) ? m135141b(aVar.m53591l()) : m135141b(aVar.m53603u());
    }

    /* JADX INFO: renamed from: j */
    public static List<String> m135149j(List<C8765d> list) {
        ArrayList arrayList = new ArrayList();
        for (C8765d c8765d : list) {
            if (NullChecker.m81303a(c8765d.m53522d())) {
                arrayList.add(c8765d.m53522d().m53601s().defaultStockKeepUnit.f20507id);
            }
            if (NullChecker.m81303a(c8765d.m53520b())) {
                arrayList.add(c8765d.m53520b().m53601s().defaultStockKeepUnit.f20507id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static String m135150k(PurchaseType purchaseType) {
        switch (C17513a.f112295b[purchaseType.ordinal()]) {
            case 1:
                return "seeWhoLikedMe";
            case 2:
                return "vip";
            case 3:
                return "boost";
            case 4:
                return CoreModule.m29935P().m94651a().mo33634z9() ? "quickchatNumber" : "quickchatMembership";
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
    public static boolean m135151l(C8765d.a aVar) {
        if (aVar == null) {
            return false;
        }
        return aVar.m53549E() || aVar.m53550F() || rxa0.m181490k(aVar.m53601s());
    }

    /* JADX INFO: renamed from: m */
    public static String m135152m(Privilege privilege) {
        double dM155944o = mqi0.m155944o() - CoreModule.f17545c.f19639e0.m169527p9().createdTime;
        if (CoreModule.f17545c.f19639e0.f149389i0.get().intValue() <= 5 && dM155944o > 2.592E8d) {
            return "upgradeInform";
        }
        if (privilege == null) {
            return "likeLimit";
        }
        switch (C17513a.f112294a[privilege.ordinal()]) {
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
