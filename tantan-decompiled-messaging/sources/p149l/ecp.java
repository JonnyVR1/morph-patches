package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes9.dex */
public final class ecp {

    /* JADX INFO: renamed from: l.ecp$a */
    public static /* synthetic */ class C16574a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90556a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f90556a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90556a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90556a[Privilege.unlimit_free_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90556a[Privilege.immediately_match.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90556a[Privilege.premium_compliment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90556a[Privilege.see_who_likes_me.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90556a[Privilege.boost.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f90556a[Privilege.full_boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f90556a[Privilege.intl_advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f90556a[Privilege.intl_visitor.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f90556a[Privilege.tribe.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f90556a[Privilege.loveBuzz.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f90556a[Privilege.vip_undo.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f90556a[Privilege.vip_location.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f90556a[Privilege.message_read_state.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f90556a[Privilege.intl_no_ad.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f90556a[Privilege.vip_membership_active_time_gp.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f90556a[Privilege.vip_badge.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f90556a[Privilege.ultra_premium_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f90556a[Privilege.vip_membership_search_gp.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* JADX INFO: renamed from: l.ecp$b */
    public static final class C16575b {

        /* JADX INFO: renamed from: a */
        public final String f90557a;

        /* JADX INFO: renamed from: b */
        public final String f90558b;

        public C16575b(String str, String str2) {
            this.f90557a = str;
            this.f90558b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m115740a(boolean z, boolean z2) {
        if (z) {
            return z2 ? "INTL_TTC_ULTRA_FULLBOOST_TITLE_USA" : "INTL_TTC_ULTRA_FULLBOOST_TITLE";
        }
        return z2 ? "INTL_TTC_FULLSCREEN_PREMIUM_BOOST_TITLE_USA" : "INTL_TTC_FULLSCREEN_PREMIUM_PRIVILEGE_TITLE_6";
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m115741b(Privilege privilege) {
        int i = C16574a.f90556a[privilege.ordinal()];
        if (i == 4) {
            return "INTL_TTC_INSTANT_SALE_TEXT";
        }
        if (i == 5) {
            return "INTL_PREMIUM_COMPLIMENT_TEXT";
        }
        if (i == 8) {
            return IntlCountryCodeController.m28126v() ? "INTL_TTC_ULTRA_FULLBOOST_INTRO_USA" : "INTL_TTC_ULTRA_FULLBOOST_INTRO";
        }
        if (i != 11) {
            return null;
        }
        return "INTL_VIP_PRIVILEGE_TRIBE_TEXT";
    }

    /* JADX INFO: renamed from: c */
    public static String m115742c(boolean z, boolean z2) {
        if (z) {
            return z2 ? "INTL_TTC_ULTRA_SUPERLIKE_TITLE_USA" : "INTL_TTC_ULTRA_SUPERLIKE_TITLE";
        }
        return z2 ? "INTL_TTC_FULLSCREEN_VIP_PRIVILEGE_TITLE_2_USA" : "INTL_TTC_FULLSCREEN_VIP_PRIVILEGE_TITLE_2";
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m115743d(Privilege privilege, PurchaseType purchaseType) {
        boolean zM182904v = sab0.m182904v(purchaseType);
        boolean zM28126v = IntlCountryCodeController.m28126v();
        switch (C16574a.f90556a[privilege.ordinal()]) {
            case 1:
                return "VIP_ALERT_DIGEST_LIKE_GROUP_A";
            case 2:
                if (sab0.m182899q(purchaseType) && ura.m195053e().m195057d().mo33734Oi()) {
                    return zM28126v ? "INTL_PREMIUM_PRIVILEGE_2SUPERLIKE_DAY_USA" : "INTL_PREMIUM_PRIVILEGE_2SUPERLIKE_DAY";
                }
                return m115742c(zM182904v, zM28126v);
            case 3:
                return zM28126v ? "INTL_TTC_ULTRA_SUPERLIKE_TITLE_USA" : "INTL_TTC_ULTRA_SUPERLIKE_TITLE";
            case 4:
                return "INTL_ULTRA_INSTANTMATCH_TITLE";
            case 5:
                return "INTL_PREMIUM_COMPLIMENT_TITLE";
            case 6:
                return "SEE_WHO_LIKED_ME_INTRO_TITLE";
            case 7:
                return m115740a(zM182904v, zM28126v);
            case 8:
                return zM28126v ? "INTL_TTC_ULTRA_FULLBOOST_TITLE_USA" : "INTL_TTC_ULTRA_FULLBOOST_TITLE";
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
    public static String m115744e(Act act, Privilege privilege, PurchaseType purchaseType) {
        if (privilege == Privilege.premium_compliment) {
            return String.format(act.getString(R$string.f27428e3), Integer.valueOf(xma.m210091r3()));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C16575b m115745f(Act act, PurchaseType purchaseType, Privilege privilege) {
        String strM115746g;
        String strM115746g2;
        wx80 wx80VarM123717m = fy80.m123717m(purchaseType, privilege);
        String string = (privilege != Privilege.vip_super_like || ura.m195053e().m195057d().mo33734Oi()) ? wx80VarM123717m.m205968t().toString() : CoreModule.f17544b.getString(R$string.f27398b9, 5);
        String string2 = wx80VarM123717m.m205965q().toString();
        String strM115744e = m115744e(act, privilege, purchaseType);
        String strM115743d = m115743d(privilege, purchaseType);
        String strM115741b = m115741b(privilege);
        if (strM115744e != null) {
            string = strM115744e;
        } else if (strM115743d != null && (strM115746g = m115746g(act, strM115743d)) != null) {
            string = strM115746g;
        }
        if (strM115741b != null && (strM115746g2 = m115746g(act, strM115741b)) != null) {
            string2 = strM115746g2;
        }
        return new C16575b(string, string2);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static String m115746g(Act act, String str) {
        int identifier = act.getResources().getIdentifier(str, "string", act.getPackageName());
        if (identifier == 0) {
            return null;
        }
        return act.getString(identifier);
    }
}
