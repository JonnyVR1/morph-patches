package p006l;

import android.text.TextUtils;
import com.mm.mmfile.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.mqi0;
import l.ogw;
import l.rxa0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class iab0 {

    /* JADX INFO: renamed from: l.iab0$a */
    public static /* synthetic */ class C0832a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14343a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f14344b;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f14344b = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14344b[PurchaseType.TYPE_GET_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14344b[PurchaseType.TYPE_GET_BOOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14344b[PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14344b[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14344b[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14344b[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14344b[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14344b[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14344b[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14344b[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14344b[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14344b[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14344b[PurchaseType.TYPE_PRIVATE_CUSTOM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14344b[PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14344b[PurchaseType.TYPE_LIMITED_TRIAL_SEE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[Privilege.values().length];
            f14343a = iArr2;
            try {
                iArr2[Privilege.vip_super_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14343a[Privilege.vip_undo.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f14343a[Privilege.vip_unlimited_likes.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f14343a[Privilege.vip_location.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f14343a[Privilege.vip_badge.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f14343a[Privilege.vip_membership_active_time_gp.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f14343a[Privilege.vip_membership_remark_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f14343a[Privilege.vip_membership_search_gp.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f14343a[Privilege.vip_membership_read_gp.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f14343a[Privilege.ads_not_disturb.ordinal()] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f14343a[Privilege.block_harassing_words.ordinal()] = 11;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f14343a[Privilege.unlock_learn_about_him_module.ordinal()] = 12;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f14343a[Privilege.pick_tantan_credits_users.ordinal()] = 13;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f14343a[Privilege.youth_roaming.ordinal()] = 14;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f14343a[Privilege.youth_find_partner.ordinal()] = 15;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f14343a[Privilege.youth_blind_box.ordinal()] = 16;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f14343a[Privilege.youth_superlike.ordinal()] = 17;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f14343a[Privilege.youth_message_read.ordinal()] = 18;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f14343a[Privilege.private_custom.ordinal()] = 19;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f14343a[Privilege.hide_me_from_nearby.ordinal()] = 20;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m16574a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        CrashHelper.d(new Throwable("track purchaseId is empty"), 100);
        return ogw.e(CoreModule.m1850H().userId() + mqi0.o());
    }

    /* JADX INFO: renamed from: b */
    public static String m16575b(String str) {
        return str.replaceAll(",", "");
    }

    /* JADX INFO: renamed from: c */
    public static Coupon m16576c(List<Coupon> list) {
        for (Coupon coupon : list) {
            double dO = mqi0.o();
            if (dO >= coupon.beginTime && dO <= coupon.endTime) {
                return coupon;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m16577d(@Nullable Boolean bool, String str) {
        if (bool == null) {
            return str;
        }
        return bool.booleanValue() ? "true" : "false";
    }

    /* JADX INFO: renamed from: e */
    public static String m16578e(Merchandise merchandise) {
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
    public static String m16579f(Privilege privilege, String str) {
        if (TextUtils.isEmpty(m16580g(str))) {
            return privilege != null ? privilege.getFunctionType() : "otherVas";
        }
        return m16580g(str);
    }

    /* JADX INFO: renamed from: g */
    public static String m16580g(String str) {
        if ("p_special_card,deeplink,click".equals(str)) {
            return "otherVas";
        }
        return "NA,NA,offline_popup".equals(str) ? "see" : "";
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m16581h(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject2.put(next, jSONObject.optString(next));
                } catch (JSONException e) {
                    CrashHelper.c(e);
                }
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: i */
    public static String m16582i(d.a aVar) {
        if (aVar == null) {
            return "";
        }
        return (!m16585l(aVar) || TextUtils.isEmpty(aVar.u())) ? m16575b(aVar.l()) : m16575b(aVar.u());
    }

    /* JADX INFO: renamed from: j */
    public static List<String> m16583j(List<d> list) {
        ArrayList arrayList = new ArrayList();
        for (d dVar : list) {
            if (NullChecker.a(dVar.d())) {
                arrayList.add(dVar.d().s().defaultStockKeepUnit.id);
            }
            if (NullChecker.a(dVar.b())) {
                arrayList.add(dVar.b().s().defaultStockKeepUnit.id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static String m16584k(PurchaseType purchaseType) {
        switch (C0832a.f14344b[purchaseType.ordinal()]) {
            case 1:
                return "seeWhoLikedMe";
            case 2:
                return "vip";
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return "boost";
            case CameraSticker.STATE_ERROR /* 4 */:
                return CoreModule.m1854P().m11706a().m5571z9() ? "quickchatNumber" : "quickchatMembership";
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
                return "supremePartner";
            case 12:
                return "femaleVIP";
            case 13:
                return "youthVip";
            case 14:
                return "PrivateCustom";
            case 15:
                return "oDiamondPrivateCustom";
            case 16:
                return "limitedTrialSee";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m16585l(d.a aVar) {
        if (aVar == null) {
            return false;
        }
        return aVar.E() || aVar.F() || rxa0.k(aVar.s());
    }

    /* JADX INFO: renamed from: m */
    public static String m16586m(Privilege privilege) {
        double dO = mqi0.o() - CoreModule.f1534c.f3628e0.m21490p9().createdTime;
        if (((Integer) CoreModule.f1534c.f3628e0.f19001i0.get()).intValue() <= 5 && dO > 2.592E8d) {
            return "upgradeInform";
        }
        if (privilege == null) {
            return "likeLimit";
        }
        switch (C0832a.f14343a[privilege.ordinal()]) {
            case 1:
                return "superlike";
            case 2:
                return "undo";
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return "likeLimit";
            case CameraSticker.STATE_ERROR /* 4 */:
                return "locationRoam";
            case 5:
                return "vipBadge";
            case 6:
                return "hideActiveTime";
            case 7:
            default:
                return "setNickname";
            case 8:
                return "search";
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
