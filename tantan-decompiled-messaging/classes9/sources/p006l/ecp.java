package p006l;

import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import l.fy80;
import l.sab0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class ecp {

    /* JADX INFO: renamed from: l.ecp$a */
    public static /* synthetic */ class C0667a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11078a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f11078a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11078a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11078a[Privilege.unlimit_free_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11078a[Privilege.immediately_match.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11078a[Privilege.premium_compliment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11078a[Privilege.see_who_likes_me.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11078a[Privilege.boost.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11078a[Privilege.full_boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11078a[Privilege.intl_advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11078a[Privilege.intl_visitor.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11078a[Privilege.tribe.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11078a[Privilege.loveBuzz.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11078a[Privilege.vip_undo.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11078a[Privilege.vip_location.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11078a[Privilege.message_read_state.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11078a[Privilege.intl_no_ad.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11078a[Privilege.vip_membership_active_time_gp.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11078a[Privilege.vip_badge.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f11078a[Privilege.ultra_premium_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11078a[Privilege.vip_membership_search_gp.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* JADX INFO: renamed from: l.ecp$b */
    public static final class C0668b {

        /* JADX INFO: renamed from: a */
        public final String f11079a;

        /* JADX INFO: renamed from: b */
        public final String f11080b;

        public C0668b(String str, String str2) {
            this.f11079a = str;
            this.f11080b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m14477a(boolean z, boolean z2) {
        if (z) {
            return z2 ? "INTL_TTC_ULTRA_FULLBOOST_TITLE_USA" : "INTL_TTC_ULTRA_FULLBOOST_TITLE";
        }
        return z2 ? "INTL_TTC_FULLSCREEN_PREMIUM_BOOST_TITLE_USA" : "INTL_TTC_FULLSCREEN_PREMIUM_PRIVILEGE_TITLE_6";
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m14478b(Privilege privilege) {
        int i = C0667a.f11078a[privilege.ordinal()];
        if (i == 4) {
            return "INTL_TTC_INSTANT_SALE_TEXT";
        }
        if (i == 5) {
            return "INTL_PREMIUM_COMPLIMENT_TEXT";
        }
        if (i == 8) {
            return IntlCountryCodeController.m21v() ? "INTL_TTC_ULTRA_FULLBOOST_INTRO_USA" : "INTL_TTC_ULTRA_FULLBOOST_INTRO";
        }
        if (i != 11) {
            return null;
        }
        return "INTL_VIP_PRIVILEGE_TRIBE_TEXT";
    }

    /* JADX INFO: renamed from: c */
    public static String m14479c(boolean z, boolean z2) {
        if (z) {
            return z2 ? "INTL_TTC_ULTRA_SUPERLIKE_TITLE_USA" : "INTL_TTC_ULTRA_SUPERLIKE_TITLE";
        }
        return z2 ? "INTL_TTC_FULLSCREEN_VIP_PRIVILEGE_TITLE_2_USA" : "INTL_TTC_FULLSCREEN_VIP_PRIVILEGE_TITLE_2";
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m14480d(Privilege privilege, PurchaseType purchaseType) {
        boolean zV = sab0.v(purchaseType);
        boolean zM21v = IntlCountryCodeController.m21v();
        switch (C0667a.f11078a[privilege.ordinal()]) {
            case 1:
                return "VIP_ALERT_DIGEST_LIKE_GROUP_A";
            case 2:
                if (sab0.q(purchaseType) && ura.m25555e().m25559d().m5671Oi()) {
                    return zM21v ? "INTL_PREMIUM_PRIVILEGE_2SUPERLIKE_DAY_USA" : "INTL_PREMIUM_PRIVILEGE_2SUPERLIKE_DAY";
                }
                return m14479c(zV, zM21v);
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return zM21v ? "INTL_TTC_ULTRA_SUPERLIKE_TITLE_USA" : "INTL_TTC_ULTRA_SUPERLIKE_TITLE";
            case CameraSticker.STATE_ERROR /* 4 */:
                return "INTL_ULTRA_INSTANTMATCH_TITLE";
            case 5:
                return "INTL_PREMIUM_COMPLIMENT_TITLE";
            case 6:
                return "SEE_WHO_LIKED_ME_INTRO_TITLE";
            case 7:
                return m14477a(zV, zM21v);
            case 8:
                return zM21v ? "INTL_TTC_ULTRA_FULLBOOST_TITLE_USA" : "INTL_TTC_ULTRA_FULLBOOST_TITLE";
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
    public static String m14481e(Act act, Privilege privilege, PurchaseType purchaseType) {
        if (privilege == Privilege.premium_compliment) {
            return String.format(act.getString(R.string.e3), Integer.valueOf(xma.m27399r3()));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C0668b m14482f(Act act, PurchaseType purchaseType, Privilege privilege) {
        String strM14483g;
        String strM14483g2;
        wx80 wx80VarM = fy80.m(purchaseType, privilege);
        String string = (privilege != Privilege.vip_super_like || ura.m25555e().m25559d().m5671Oi()) ? wx80VarM.m26849t().toString() : CoreModule.f1533b.getString(R.string.b9, 5);
        String string2 = wx80VarM.m26846q().toString();
        String strM14481e = m14481e(act, privilege, purchaseType);
        String strM14480d = m14480d(privilege, purchaseType);
        String strM14478b = m14478b(privilege);
        if (strM14481e != null) {
            string = strM14481e;
        } else if (strM14480d != null && (strM14483g = m14483g(act, strM14480d)) != null) {
            string = strM14483g;
        }
        if (strM14478b != null && (strM14483g2 = m14483g(act, strM14478b)) != null) {
            string2 = strM14483g2;
        }
        return new C0668b(string, string2);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static String m14483g(Act act, String str) {
        int identifier = act.getResources().getIdentifier(str, "string", act.getPackageName());
        if (identifier == 0) {
            return null;
        }
        return act.getString(identifier);
    }
}
