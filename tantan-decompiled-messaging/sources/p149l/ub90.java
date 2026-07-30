package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;

/* JADX INFO: loaded from: classes9.dex */
public final class ub90 {

    /* JADX INFO: renamed from: l.ub90$a */
    public static /* synthetic */ class C20400a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f175677a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f175677a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f175677a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f175677a[Privilege.unlimit_free_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f175677a[Privilege.see_who_likes_me.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f175677a[Privilege.immediately_match.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f175677a[Privilege.premium_compliment.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f175677a[Privilege.intl_advanced_filter.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f175677a[Privilege.advanced_filter.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f175677a[Privilege.boost.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f175677a[Privilege.full_boost.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f175677a[Privilege.intl_visitor.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f175677a[Privilege.tribe.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f175677a[Privilege.loveBuzz.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f175677a[Privilege.vip_undo.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f175677a[Privilege.vip_location.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f175677a[Privilege.message_read_state.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f175677a[Privilege.intl_no_ad.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f175677a[Privilege.vip_membership_active_time_gp.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f175677a[Privilege.vip_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f175677a[Privilege.svip_badge.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f175677a[Privilege.ultra_premium_badge.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f175677a[Privilege.vip_membership_search_gp.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m192817a(Privilege privilege) {
        if (privilege == null) {
            return "";
        }
        switch (C20400a.f175677a[privilege.ordinal()]) {
            case 1:
                return "unlimited_likes";
            case 2:
            case 3:
                return "superlike";
            case 4:
                return "see";
            case 5:
                return "instant_match";
            case 6:
                return "compliment";
            case 7:
            case 8:
                return "advanced_showme";
            case 9:
            case 10:
                return "boost";
            case 11:
                return "vistors";
            case 12:
                return "tribe";
            case 13:
                return "buzz";
            case 14:
                return "undo";
            case 15:
                return "passport";
            case 16:
                return "receipts";
            case 17:
                return "ad-free";
            case 18:
                return "hide_active";
            case 19:
            case 20:
            case 21:
                return "badge";
            case 22:
                return FirebaseAnalytics.Event.SEARCH;
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m192818b(Privilege privilege, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        String strM192817a = m192817a(privilege);
        if (TextUtils.isEmpty(strM192817a)) {
            return;
        }
        zvf0.m220399u("e_ttc_subcription_privilege_description", intlVipNewUiFrag.pageId(), j760.m140076a("privilege_description", strM192817a));
    }
}
