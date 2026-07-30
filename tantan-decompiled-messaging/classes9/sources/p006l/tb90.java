package p006l;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.sab0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class tb90 {

    /* JADX INFO: renamed from: a */
    public final Act f21995a;

    /* JADX INFO: renamed from: l.tb90$a */
    public static /* synthetic */ class C1301a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21996a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f21996a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21996a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21996a[Privilege.unlimit_free_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21996a[Privilege.immediately_match.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21996a[Privilege.premium_compliment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21996a[Privilege.see_who_likes_me.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21996a[Privilege.boost.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21996a[Privilege.full_boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21996a[Privilege.intl_advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21996a[Privilege.intl_visitor.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21996a[Privilege.tribe.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21996a[Privilege.loveBuzz.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21996a[Privilege.vip_undo.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21996a[Privilege.vip_location.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21996a[Privilege.message_read_state.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21996a[Privilege.intl_no_ad.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21996a[Privilege.vip_membership_active_time_gp.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21996a[Privilege.vip_badge.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21996a[Privilege.ultra_premium_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21996a[Privilege.vip_membership_search_gp.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public tb90(Act act) {
        this.f21995a = act;
    }

    /* JADX INFO: renamed from: a */
    public final int m24599a(boolean z, boolean z2) {
        if (z) {
            return z2 ? R$string.f2994vg : R$string.f2964ug;
        }
        return z2 ? R$string.f1871Kf : R$string.f1901Lf;
    }

    /* JADX INFO: renamed from: b */
    public int m24600b(Privilege privilege) {
        int i = C1301a.f21996a[privilege.ordinal()];
        if (i == 4) {
            return R$string.f2291Yf;
        }
        if (i == 5) {
            return R$string.f1597Bb;
        }
        if (i == 8) {
            return IntlCountryCodeController.m21v() ? R$string.f2934tg : R$string.f2904sg;
        }
        if (i != 11) {
            return 0;
        }
        return R$string.f1992Og;
    }

    /* JADX INFO: renamed from: c */
    public final int m24601c(boolean z) {
        return z ? R$string.f1777Hb : R$string.f1747Gb;
    }

    /* JADX INFO: renamed from: d */
    public final int m24602d(boolean z, boolean z2) {
        if (z) {
            return z2 ? R$string.f3084yg : R$string.f3054xg;
        }
        return z2 ? R$string.f2081Rf : R$string.f2051Qf;
    }

    /* JADX INFO: renamed from: e */
    public String m24603e(PurchaseType purchaseType) {
        if (this.f21995a == null) {
            return null;
        }
        boolean zV = sab0.v(purchaseType);
        boolean zQ = sab0.q(purchaseType);
        boolean zM21v = IntlCountryCodeController.m21v();
        if (zV) {
            Act act = this.f21995a;
            return zM21v ? act.getString(R$string.f3084yg) : act.getString(R$string.f3054xg);
        }
        if (zQ) {
            Act act2 = this.f21995a;
            return zM21v ? act2.getString(R$string.f1777Hb) : act2.getString(R$string.f1747Gb);
        }
        Act act3 = this.f21995a;
        return zM21v ? act3.getString(R$string.f2081Rf) : act3.getString(R$string.f2051Qf);
    }

    /* JADX INFO: renamed from: f */
    public int m24604f(Privilege privilege, PurchaseType purchaseType) {
        boolean zV = sab0.v(purchaseType);
        boolean zM21v = IntlCountryCodeController.m21v();
        switch (C1301a.f21996a[privilege.ordinal()]) {
            case 1:
                return R$string.f2856qs;
            case 2:
                return sab0.q(purchaseType) ? m24601c(zM21v) : m24602d(zV, zM21v);
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return zM21v ? R$string.f3084yg : R$string.f3054xg;
            case CameraSticker.STATE_ERROR /* 4 */:
                return R$string.f1602Bg;
            case 5:
                return R$string.f1627Cb;
            case 6:
                return R$string.f2851qn;
            case 7:
                return m24599a(zV, zM21v);
            case 8:
                return zM21v ? R$string.f2994vg : R$string.f2964ug;
            case 9:
                return R$string.f2770o3;
            case 10:
                return R$string.f1897Lb;
            case 11:
                return R$string.f1896La;
            case 12:
                return R$string.f1961Nf;
            case 13:
                return R$string.f2517fr;
            case 14:
                return R$string.f2486er;
            case 15:
                return R$string.f1931Mf;
            case 16:
                return R$string.f2141Tf;
            case 17:
                return R$string.f2111Sf;
            case 18:
            case 19:
                return R$string.f2171Uf;
            case 20:
                return R$string.f2717mc;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public String m24605g(Privilege privilege, PurchaseType purchaseType) {
        Act act;
        if (privilege != Privilege.premium_compliment || (act = this.f21995a) == null) {
            return null;
        }
        return String.format(act.getString(R$string.f1627Cb), Integer.valueOf(xma.m27399r3()));
    }
}
