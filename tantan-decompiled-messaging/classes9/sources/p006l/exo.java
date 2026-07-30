package p006l;

import android.app.Application;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import l.fy80;
import l.juk;
import l.rza;
import l.sab0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class exo {

    /* JADX INFO: renamed from: l.exo$a */
    public static /* synthetic */ class C0693a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11496a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f11496a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11496a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11496a[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11496a[Privilege.vip_membership_active_time_gp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11496a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11496a[Privilege.vip_badge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11496a[Privilege.vip_membership_remark_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11496a[Privilege.intl_no_ad.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11496a[Privilege.vip_message_block_gp.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11496a[Privilege.vip_membership_search_gp.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11496a[Privilege.see_who_likes_me.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11496a[Privilege.boost.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11496a[Privilege.message_read_state.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11496a[Privilege.loveBuzz.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11496a[Privilege.intl_advanced_filter.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11496a[Privilege.liked_user.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11496a[Privilege.picksMembership.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11496a[Privilege.svip_greet.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f11496a[Privilege.intl_visitor.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11496a[Privilege.tribe.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11496a[Privilege.full_boost.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11496a[Privilege.unlimit_free_super_like.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11496a[Privilege.ultra_premium_badge.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f11496a[Privilege.immediately_match.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static IntlPrivilegeDescListItem.C0456a m14919a(Privilege privilege, PurchaseType purchaseType) {
        int iM14923e;
        String string;
        String string2;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            iM14923e = m14921c(privilege);
        } else {
            iM14923e = sab0.v(purchaseType) ? m14923e(privilege) : m14924f(privilege);
        }
        int i = iM14923e;
        if (sab0.v(purchaseType)) {
            wx80 wx80VarM14315b = dyo.m14315b(purchaseType, privilege);
            string = wx80VarM14315b.m26849t().toString();
            string2 = wx80VarM14315b.m26829d().toString();
        } else {
            wx80 wx80VarM = fy80.m(purchaseType, privilege);
            string = (privilege != Privilege.vip_super_like || ura.m25555e().m25559d().m5671Oi()) ? wx80VarM.m26849t().toString() : CoreModule.f1533b.getString(R$string.f2886rs, 5);
            string2 = wx80VarM.m26846q().toString();
        }
        return new IntlPrivilegeDescListItem.C0456a(i, string, string2, privilege, purchaseType);
    }

    /* JADX INFO: renamed from: b */
    public static IntlPrivilegePolicyItem.C0459a m14920b(VipNewUiFrag vipNewUiFrag, PurchaseType purchaseType, d dVar) {
        d.a aVarD;
        String string = App.e.getString(R$string.f2795os);
        int i = IntlCountryCodeController.m10k() ? R$string.f1893L7 : R$string.f1751Gf;
        if (dVar != null) {
            aVarD = dVar.d() != null ? dVar.d() : dVar.b();
        } else {
            aVarD = null;
        }
        int i2 = purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? w0c0.f24635P0 : w0c0.f24629N0;
        if (aVarD != null && CoreModule.f1534c.f3558G2.m13328k3(aVarD.f())) {
            i = R$string.f1781Hf;
            string = "";
        }
        if (sab0.v(purchaseType)) {
            Act act = vipNewUiFrag.act();
            Application application = App.e;
            return new IntlPrivilegePolicyItem.C0459a("", rza.A0(act, application.getString(i, application.getString(R$string.f1841Jf), App.e.getString(R$string.f1811If)), w0c0.f24664Z, new String[]{App.e.getString(R$string.f1841Jf), juk.j(), App.e.getString(R$string.f1811If), juk.i()}), purchaseType);
        }
        Act act2 = vipNewUiFrag.act();
        Application application2 = App.e;
        return new IntlPrivilegePolicyItem.C0459a(string, rza.A0(act2, application2.getString(i, application2.getString(R$string.f3076y8), App.e.getString(R$string.f2418ck)), i2, new String[]{App.e.getString(R$string.f3076y8), juk.j(), App.e.getString(R$string.f2418ck), juk.i()}), purchaseType);
    }

    @DrawableRes
    /* JADX INFO: renamed from: c */
    public static int m14921c(Privilege privilege) {
        int i = x2c0.f27022qb;
        switch (C0693a.f11496a[privilege.ordinal()]) {
            case 1:
                return x2c0.f27022qb;
            case 2:
                return x2c0.f26672fb;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return x2c0.f26894mb;
            case CameraSticker.STATE_ERROR /* 4 */:
                return x2c0.f27213wa;
            case 5:
                return x2c0.f26202Qa;
            case 6:
                return x2c0.f27277ya;
            case 7:
                return x2c0.f26419Xa;
            case 8:
                return x2c0.f26295Ta;
            case 9:
                return x2c0.f26264Sa;
            case 10:
                return x2c0.f26450Ya;
            case 11:
                return x2c0.f26609db;
            case 12:
                return x2c0.f25700Aa;
            case 13:
                return x2c0.f26388Wa;
            case 14:
                return x2c0.f26736hb;
            case 15:
                return x2c0.f26670f9;
            case 16:
                return x2c0.f27086sb;
            case 17:
                return x2c0.f26326Ua;
            case 18:
                return x2c0.f26078Ma;
            case 19:
                return x2c0.f27214wb;
            case 20:
                return x2c0.f25830Ec;
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: d */
    public static e4g0 m14922d(PurchaseType purchaseType) {
        return new e4g0(CoreModule.f1533b.getString(R$string.f1835J9), CoreModule.f1533b.getString(R$string.f1805I9), purchaseType);
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public static int m14923e(Privilege privilege) {
        int i = x2c0.f26047La;
        switch (C0693a.f11496a[privilege.ordinal()]) {
            case 21:
                return x2c0.f26047La;
            case 22:
                return IntlCountryCodeController.m21v() ? x2c0.f26990pb : x2c0.f26958ob;
            case 23:
                return x2c0.f27309za;
            case 24:
                return x2c0.f26109Na;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    public static int m14924f(Privilege privilege) {
        int i = x2c0.f27054rb;
        switch (C0693a.f11496a[privilege.ordinal()]) {
            case 1:
                return x2c0.f27054rb;
            case 2:
                return x2c0.f26704gb;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return x2c0.f26926nb;
            case CameraSticker.STATE_ERROR /* 4 */:
                return x2c0.f27245xa;
            case 5:
                return x2c0.f26233Ra;
            case 6:
                return x2c0.f26125Nq;
            case 7:
                return x2c0.f26094Mq;
            case 8:
                return x2c0.f27181va;
            case 9:
                return x2c0.f26187Pq;
            case 10:
                return x2c0.f26156Oq;
            default:
                return i;
        }
    }
}
