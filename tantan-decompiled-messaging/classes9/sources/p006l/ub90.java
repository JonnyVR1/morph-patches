package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p1.mobile.putong.core.data.Privilege;
import l.j760;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class ub90 {

    /* JADX INFO: renamed from: l.ub90$a */
    public static /* synthetic */ class C1338a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23477a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f23477a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23477a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23477a[Privilege.unlimit_free_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23477a[Privilege.see_who_likes_me.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23477a[Privilege.immediately_match.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23477a[Privilege.premium_compliment.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23477a[Privilege.intl_advanced_filter.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23477a[Privilege.advanced_filter.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23477a[Privilege.boost.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23477a[Privilege.full_boost.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23477a[Privilege.intl_visitor.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23477a[Privilege.tribe.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23477a[Privilege.loveBuzz.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23477a[Privilege.vip_undo.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23477a[Privilege.vip_location.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23477a[Privilege.message_read_state.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23477a[Privilege.intl_no_ad.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f23477a[Privilege.vip_membership_active_time_gp.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f23477a[Privilege.vip_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f23477a[Privilege.svip_badge.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f23477a[Privilege.ultra_premium_badge.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f23477a[Privilege.vip_membership_search_gp.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m25171a(Privilege privilege) {
        if (privilege == null) {
            return "";
        }
        switch (C1338a.f23477a[privilege.ordinal()]) {
            case 1:
                return "unlimited_likes";
            case 2:
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return "superlike";
            case CameraSticker.STATE_ERROR /* 4 */:
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
                return "search";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25172b(Privilege privilege, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        String strM25171a = m25171a(privilege);
        if (TextUtils.isEmpty(strM25171a)) {
            return;
        }
        zvf0.u("e_ttc_subcription_privilege_description", intlVipNewUiFrag.pageId(), new j760[]{j760.a("privilege_description", strM25171a)});
    }
}
