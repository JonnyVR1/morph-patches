package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes9.dex */
public final class tb90 {

    /* JADX INFO: renamed from: a */
    public final Act f169240a;

    /* JADX INFO: renamed from: l.tb90$a */
    public static /* synthetic */ class C20138a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f169241a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f169241a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f169241a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f169241a[Privilege.unlimit_free_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f169241a[Privilege.immediately_match.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f169241a[Privilege.premium_compliment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f169241a[Privilege.see_who_likes_me.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f169241a[Privilege.boost.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f169241a[Privilege.full_boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f169241a[Privilege.intl_advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f169241a[Privilege.intl_visitor.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f169241a[Privilege.tribe.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f169241a[Privilege.loveBuzz.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f169241a[Privilege.vip_undo.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f169241a[Privilege.vip_location.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f169241a[Privilege.message_read_state.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f169241a[Privilege.intl_no_ad.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f169241a[Privilege.vip_membership_active_time_gp.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f169241a[Privilege.vip_badge.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f169241a[Privilege.ultra_premium_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f169241a[Privilege.vip_membership_search_gp.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public tb90(Act act) {
        this.f169240a = act;
    }

    /* JADX INFO: renamed from: a */
    public final int m187845a(boolean z, boolean z2) {
        if (z) {
            return z2 ? R$string.f19005vg : R$string.f18975ug;
        }
        return z2 ? R$string.f17882Kf : R$string.f17912Lf;
    }

    /* JADX INFO: renamed from: b */
    public int m187846b(Privilege privilege) {
        int i = C20138a.f169241a[privilege.ordinal()];
        if (i == 4) {
            return R$string.f18302Yf;
        }
        if (i == 5) {
            return R$string.f17608Bb;
        }
        if (i == 8) {
            return IntlCountryCodeController.m28126v() ? R$string.f18945tg : R$string.f18915sg;
        }
        if (i != 11) {
            return 0;
        }
        return R$string.f18003Og;
    }

    /* JADX INFO: renamed from: c */
    public final int m187847c(boolean z) {
        return z ? R$string.f17788Hb : R$string.f17758Gb;
    }

    /* JADX INFO: renamed from: d */
    public final int m187848d(boolean z, boolean z2) {
        if (z) {
            return z2 ? R$string.f19095yg : R$string.f19065xg;
        }
        return z2 ? R$string.f18092Rf : R$string.f18062Qf;
    }

    /* JADX INFO: renamed from: e */
    public String m187849e(PurchaseType purchaseType) {
        if (this.f169240a == null) {
            return null;
        }
        boolean zM182904v = sab0.m182904v(purchaseType);
        boolean zM182899q = sab0.m182899q(purchaseType);
        boolean zM28126v = IntlCountryCodeController.m28126v();
        if (zM182904v) {
            Act act = this.f169240a;
            return zM28126v ? act.getString(R$string.f19095yg) : act.getString(R$string.f19065xg);
        }
        if (zM182899q) {
            Act act2 = this.f169240a;
            return zM28126v ? act2.getString(R$string.f17788Hb) : act2.getString(R$string.f17758Gb);
        }
        Act act3 = this.f169240a;
        return zM28126v ? act3.getString(R$string.f18092Rf) : act3.getString(R$string.f18062Qf);
    }

    /* JADX INFO: renamed from: f */
    public int m187850f(Privilege privilege, PurchaseType purchaseType) {
        boolean zM182904v = sab0.m182904v(purchaseType);
        boolean zM28126v = IntlCountryCodeController.m28126v();
        switch (C20138a.f169241a[privilege.ordinal()]) {
            case 1:
                return R$string.f18867qs;
            case 2:
                return sab0.m182899q(purchaseType) ? m187847c(zM28126v) : m187848d(zM182904v, zM28126v);
            case 3:
                return zM28126v ? R$string.f19095yg : R$string.f19065xg;
            case 4:
                return R$string.f17613Bg;
            case 5:
                return R$string.f17638Cb;
            case 6:
                return R$string.f18862qn;
            case 7:
                return m187845a(zM182904v, zM28126v);
            case 8:
                return zM28126v ? R$string.f19005vg : R$string.f18975ug;
            case 9:
                return R$string.f18781o3;
            case 10:
                return R$string.f17908Lb;
            case 11:
                return R$string.f17907La;
            case 12:
                return R$string.f17972Nf;
            case 13:
                return R$string.f18528fr;
            case 14:
                return R$string.f18497er;
            case 15:
                return R$string.f17942Mf;
            case 16:
                return R$string.f18152Tf;
            case 17:
                return R$string.f18122Sf;
            case 18:
            case 19:
                return R$string.f18182Uf;
            case 20:
                return R$string.f18728mc;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public String m187851g(Privilege privilege, PurchaseType purchaseType) {
        Act act;
        if (privilege != Privilege.premium_compliment || (act = this.f169240a) == null) {
            return null;
        }
        return String.format(act.getString(R$string.f17638Cb), Integer.valueOf(xma.m210091r3()));
    }
}
