package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes12.dex */
public final class eep {

    /* JADX INFO: renamed from: l.eep$a */
    public static /* synthetic */ class C16762a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93655a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f93655a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93655a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93655a[Privilege.unlimit_free_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93655a[Privilege.immediately_match.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93655a[Privilege.premium_compliment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93655a[Privilege.see_who_likes_me.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93655a[Privilege.boost.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f93655a[Privilege.full_boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f93655a[Privilege.intl_advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f93655a[Privilege.intl_visitor.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f93655a[Privilege.tribe.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f93655a[Privilege.loveBuzz.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f93655a[Privilege.vip_undo.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f93655a[Privilege.vip_location.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f93655a[Privilege.message_read_state.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f93655a[Privilege.intl_no_ad.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f93655a[Privilege.vip_membership_active_time_gp.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f93655a[Privilege.vip_badge.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f93655a[Privilege.ultra_premium_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f93655a[Privilege.vip_membership_search_gp.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* JADX INFO: renamed from: l.eep$b */
    public static final class C16763b {

        /* JADX INFO: renamed from: a */
        public final String f93656a;

        /* JADX INFO: renamed from: b */
        public final String f93657b;

        public C16763b(String str, String str2) {
            this.f93656a = str;
            this.f93657b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m120553a(boolean z, boolean z2) {
        if (z) {
            return z2 ? "INTL_TTC_ULTRA_FULLBOOST_TITLE_USA" : "INTL_TTC_ULTRA_FULLBOOST_TITLE";
        }
        return z2 ? "INTL_TTC_FULLSCREEN_PREMIUM_BOOST_TITLE_USA" : "INTL_TTC_FULLSCREEN_PREMIUM_PRIVILEGE_TITLE_6";
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m120554b(Privilege privilege) {
        int i = C16762a.f93655a[privilege.ordinal()];
        if (i == 4) {
            return "INTL_TTC_INSTANT_SALE_TEXT";
        }
        if (i == 5) {
            return "INTL_PREMIUM_COMPLIMENT_TEXT";
        }
        if (i == 8) {
            return IntlCountryCodeController.m29125v() ? "INTL_TTC_ULTRA_FULLBOOST_INTRO_USA" : "INTL_TTC_ULTRA_FULLBOOST_INTRO";
        }
        if (i != 11) {
            return null;
        }
        return "INTL_VIP_PRIVILEGE_TRIBE_TEXT";
    }

    /* JADX INFO: renamed from: c */
    public static String m120555c(boolean z, boolean z2) {
        if (z) {
            return z2 ? "INTL_TTC_ULTRA_SUPERLIKE_TITLE_USA" : "INTL_TTC_ULTRA_SUPERLIKE_TITLE";
        }
        return z2 ? "INTL_TTC_FULLSCREEN_VIP_PRIVILEGE_TITLE_2_USA" : "INTL_TTC_FULLSCREEN_VIP_PRIVILEGE_TITLE_2";
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m120556d(Privilege privilege, PurchaseType purchaseType) {
        boolean zM206578v = wib0.m206578v(purchaseType);
        boolean zM29125v = IntlCountryCodeController.m29125v();
        switch (C16762a.f93655a[privilege.ordinal()]) {
            case 1:
                return "VIP_ALERT_DIGEST_LIKE_GROUP_A";
            case 2:
                if (wib0.m206573q(purchaseType) && gta.m132210e().m132214d().mo34737Oi()) {
                    return zM29125v ? "INTL_PREMIUM_PRIVILEGE_2SUPERLIKE_DAY_USA" : "INTL_PREMIUM_PRIVILEGE_2SUPERLIKE_DAY";
                }
                return m120555c(zM206578v, zM29125v);
            case 3:
                return zM29125v ? "INTL_TTC_ULTRA_SUPERLIKE_TITLE_USA" : "INTL_TTC_ULTRA_SUPERLIKE_TITLE";
            case 4:
                return "INTL_ULTRA_INSTANTMATCH_TITLE";
            case 5:
                return "INTL_PREMIUM_COMPLIMENT_TITLE";
            case 6:
                return "SEE_WHO_LIKED_ME_INTRO_TITLE";
            case 7:
                return m120553a(zM206578v, zM29125v);
            case 8:
                return zM29125v ? "INTL_TTC_ULTRA_FULLBOOST_TITLE_USA" : "INTL_TTC_ULTRA_FULLBOOST_TITLE";
            case 9:
                return "CORE_SVIP_PURCHASE_PRIVILEGE_ADVANCED_FILTER_TITLE";
            case 10:
                return "INTL_PREMIUM_VISITORS_TITLE";
            case 11:
                return "INTL_MEET_TRIBE_TAB";
            case 12:
                return "INTL_TTC_FULLSCREEN_PREMIUM_SIGNAGE_BUZZ";
            case 13:
                return "US_VIP_ALERT_DIGEST_UNDO";
            case 14:
                return "US_VIP_ALERT_DIGEST_LOCATION";
            case 15:
                return "INTL_TTC_FULLSCREEN_PREMIUM_PRIVILEGE_TITLE_8";
            case 16:
                return "INTL_TTC_FULLSCREEN_VIP_PRIVILEGE_TITLE_8";
            case 17:
                return "INTL_TTC_FULLSCREEN_VIP_PRIVILEGE_TITLE_6";
            case 18:
            case 19:
                return "INTL_TTC_FULLSCREEN_VIP_PRIVILEGE_TITLE_9";
            case 20:
                return "INTL_SEARCH_MATCHES_GROUP_A";
            default:
                return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static String m120557e(Act act, Privilege privilege, PurchaseType purchaseType) {
        if (privilege == Privilege.premium_compliment) {
            return String.format(act.getString(R$string.f28276e3), Integer.valueOf(joa.m146406s3()));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C16763b m120558f(Act act, PurchaseType purchaseType, Privilege privilege) {
        String strM120559g;
        String strM120559g2;
        a690 a690VarM143621m = j690.m143621m(purchaseType, privilege);
        String string = (privilege != Privilege.vip_super_like || gta.m132210e().m132214d().mo34737Oi()) ? a690VarM143621m.m96314t().toString() : CoreModule.f18263b.getString(R$string.f28246b9, 5);
        String string2 = a690VarM143621m.m96311q().toString();
        String strM120557e = m120557e(act, privilege, purchaseType);
        String strM120556d = m120556d(privilege, purchaseType);
        String strM120554b = m120554b(privilege);
        if (strM120557e != null) {
            string = strM120557e;
        } else if (strM120556d != null && (strM120559g = m120559g(act, strM120556d)) != null) {
            string = strM120559g;
        }
        if (strM120554b != null && (strM120559g2 = m120559g(act, strM120554b)) != null) {
            string2 = strM120559g2;
        }
        return new C16763b(string, string2);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static String m120559g(Act act, String str) {
        int identifier = act.getResources().getIdentifier(str, "string", act.getPackageName());
        if (identifier == 0) {
            return null;
        }
        return act.getString(identifier);
    }
}
