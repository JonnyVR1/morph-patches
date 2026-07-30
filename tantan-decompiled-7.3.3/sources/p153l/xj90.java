package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes12.dex */
public final class xj90 {

    /* JADX INFO: renamed from: a */
    public final Act f194542a;

    /* JADX INFO: renamed from: l.xj90$a */
    public static /* synthetic */ class C21349a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f194543a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f194543a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f194543a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f194543a[Privilege.unlimit_free_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f194543a[Privilege.immediately_match.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f194543a[Privilege.premium_compliment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f194543a[Privilege.see_who_likes_me.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f194543a[Privilege.boost.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f194543a[Privilege.full_boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f194543a[Privilege.intl_advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f194543a[Privilege.intl_visitor.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f194543a[Privilege.tribe.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f194543a[Privilege.loveBuzz.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f194543a[Privilege.vip_undo.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f194543a[Privilege.vip_location.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f194543a[Privilege.message_read_state.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f194543a[Privilege.intl_no_ad.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f194543a[Privilege.vip_membership_active_time_gp.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f194543a[Privilege.vip_badge.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f194543a[Privilege.ultra_premium_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f194543a[Privilege.vip_membership_search_gp.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public xj90(Act act) {
        this.f194542a = act;
    }

    /* JADX INFO: renamed from: a */
    public final int m211197a(boolean z, boolean z2) {
        if (z) {
            return z2 ? R$string.f18733Og : R$string.f18703Ng;
        }
        return z2 ? R$string.f19155cg : R$string.f19186dg;
    }

    /* JADX INFO: renamed from: b */
    public int m211198b(Privilege privilege) {
        int i = C21349a.f194543a[privilege.ordinal()];
        if (i == 4) {
            return R$string.f19617rg;
        }
        if (i == 5) {
            return R$string.f18788Qb;
        }
        if (i == 8) {
            return IntlCountryCodeController.m29125v() ? R$string.f18673Mg : R$string.f18643Lg;
        }
        if (i != 11) {
            return 0;
        }
        return R$string.f19340ih;
    }

    /* JADX INFO: renamed from: c */
    public final int m211199c(boolean z) {
        return z ? R$string.f18968Wb : R$string.f18938Vb;
    }

    /* JADX INFO: renamed from: d */
    public final int m211200d(boolean z, boolean z2) {
        if (z) {
            return z2 ? R$string.f18823Rg : R$string.f18793Qg;
        }
        return z2 ? R$string.f19369jg : R$string.f19339ig;
    }

    /* JADX INFO: renamed from: e */
    public String m211201e(PurchaseType purchaseType) {
        if (this.f194542a == null) {
            return null;
        }
        boolean zM206578v = wib0.m206578v(purchaseType);
        boolean zM206573q = wib0.m206573q(purchaseType);
        boolean zM29125v = IntlCountryCodeController.m29125v();
        if (zM206578v) {
            Act act = this.f194542a;
            return zM29125v ? act.getString(R$string.f18823Rg) : act.getString(R$string.f18793Qg);
        }
        if (zM206573q) {
            Act act2 = this.f194542a;
            return zM29125v ? act2.getString(R$string.f18968Wb) : act2.getString(R$string.f18938Vb);
        }
        Act act3 = this.f194542a;
        return zM29125v ? act3.getString(R$string.f19369jg) : act3.getString(R$string.f19339ig);
    }

    /* JADX INFO: renamed from: f */
    public int m211202f(Privilege privilege, PurchaseType purchaseType) {
        boolean zM206578v = wib0.m206578v(purchaseType);
        boolean zM29125v = IntlCountryCodeController.m29125v();
        switch (C21349a.f194543a[privilege.ordinal()]) {
            case 1:
                return R$string.f18685Ms;
            case 2:
                return wib0.m206573q(purchaseType) ? m211199c(zM29125v) : m211200d(zM206578v, zM29125v);
            case 3:
                return zM29125v ? R$string.f18823Rg : R$string.f18793Qg;
            case 4:
                return R$string.f18913Ug;
            case 5:
                return R$string.f18818Rb;
            case 6:
                return R$string.f18680Mn;
            case 7:
                return m211197a(zM206578v, zM29125v);
            case 8:
                return zM29125v ? R$string.f18733Og : R$string.f18703Ng;
            case 9:
                return R$string.f19573q3;
            case 10:
                return R$string.f19089ac;
            case 11:
                return R$string.f18967Wa;
            case 12:
                return R$string.f19247fg;
            case 13:
                return R$string.f18313Ar;
            case 14:
                return R$string.f19876zr;
            case 15:
                return R$string.f19216eg;
            case 16:
                return R$string.f19431lg;
            case 17:
                return R$string.f19400kg;
            case 18:
            case 19:
                return R$string.f19462mg;
            case 20:
                return R$string.f18329Bc;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public String m211203g(Privilege privilege, PurchaseType purchaseType) {
        Act act;
        if (privilege != Privilege.premium_compliment || (act = this.f194542a) == null) {
            return null;
        }
        return String.format(act.getString(R$string.f18818Rb), Integer.valueOf(joa.m146406s3()));
    }
}
