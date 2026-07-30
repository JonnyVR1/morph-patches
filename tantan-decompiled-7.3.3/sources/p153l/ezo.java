package p153l;

import android.app.Application;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes12.dex */
public class ezo {

    /* JADX INFO: renamed from: l.ezo$a */
    public static /* synthetic */ class C16870a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f96611a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f96611a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96611a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96611a[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96611a[Privilege.vip_membership_active_time_gp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96611a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96611a[Privilege.vip_badge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f96611a[Privilege.vip_membership_remark_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f96611a[Privilege.intl_no_ad.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f96611a[Privilege.vip_message_block_gp.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f96611a[Privilege.vip_membership_search_gp.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f96611a[Privilege.see_who_likes_me.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f96611a[Privilege.boost.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f96611a[Privilege.message_read_state.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f96611a[Privilege.loveBuzz.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f96611a[Privilege.intl_advanced_filter.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f96611a[Privilege.liked_user.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f96611a[Privilege.picksMembership.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f96611a[Privilege.svip_greet.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f96611a[Privilege.intl_visitor.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f96611a[Privilege.tribe.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f96611a[Privilege.full_boost.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f96611a[Privilege.unlimit_free_super_like.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f96611a[Privilege.ultra_premium_badge.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f96611a[Privilege.immediately_match.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static IntlPrivilegeDescListItem.C9183a m123389a(Privilege privilege, PurchaseType purchaseType) {
        int iM123393e;
        String string;
        String string2;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            iM123393e = m123391c(privilege);
        } else {
            iM123393e = wib0.m206578v(purchaseType) ? m123393e(privilege) : m123394f(privilege);
        }
        int i = iM123393e;
        if (wib0.m206578v(purchaseType)) {
            a690 a690VarM113420b = d0p.m113420b(purchaseType, privilege);
            string = a690VarM113420b.m96314t().toString();
            string2 = a690VarM113420b.m96294d().toString();
        } else {
            a690 a690VarM143621m = j690.m143621m(purchaseType, privilege);
            string = (privilege != Privilege.vip_super_like || gta.m132210e().m132214d().mo34737Oi()) ? a690VarM143621m.m96314t().toString() : CoreModule.f18263b.getString(R$string.f18715Ns, 5);
            string2 = a690VarM143621m.m96311q().toString();
        }
        return new IntlPrivilegeDescListItem.C9183a(i, string, string2, privilege, purchaseType);
    }

    /* JADX INFO: renamed from: b */
    public static IntlPrivilegePolicyItem.C9186a m123390b(VipNewUiFrag vipNewUiFrag, PurchaseType purchaseType, C8928d c8928d) {
        C8928d.a aVarM54705d;
        String string = App.f16088e.getString(R$string.f18624Ks);
        int i = IntlCountryCodeController.m29114k() ? R$string.f18694N7 : R$string.f19032Yf;
        if (c8928d != null) {
            aVarM54705d = c8928d.m54705d() != null ? c8928d.m54705d() : c8928d.m54703b();
        } else {
            aVarM54705d = null;
        }
        int i2 = purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? c9c0.f80367Q0 : c9c0.f80361O0;
        if (aVarM54705d != null && CoreModule.f18264c.f20311G2.m153653k3(aVarM54705d.m54762f())) {
            i = R$string.f19062Zf;
            string = "";
        }
        if (wib0.m206578v(purchaseType)) {
            Act act = vipNewUiFrag.act();
            Application application = App.f16088e;
            return new IntlPrivilegePolicyItem.C9186a("", e1b.m118943A0(act, application.getString(i, application.getString(R$string.f19124bg), App.f16088e.getString(R$string.f19093ag)), c9c0.f80397a0, App.f16088e.getString(R$string.f19124bg), zwk.m221910j(), App.f16088e.getString(R$string.f19093ag), zwk.m221909i()), purchaseType);
        }
        Act act2 = vipNewUiFrag.act();
        Application application2 = App.f16088e;
        return new IntlPrivilegePolicyItem.C9186a(string, e1b.m118943A0(act2, application2.getString(i, application2.getString(R$string.f18294A8), App.f16088e.getString(R$string.f19838yk)), i2, App.f16088e.getString(R$string.f18294A8), zwk.m221910j(), App.f16088e.getString(R$string.f19838yk), zwk.m221909i()), purchaseType);
    }

    @DrawableRes
    /* JADX INFO: renamed from: c */
    public static int m123391c(Privilege privilege) {
        int i = dbc0.f87378rb;
        switch (C16870a.f96611a[privilege.ordinal()]) {
            case 1:
                return dbc0.f87378rb;
            case 2:
                return dbc0.f87017gb;
            case 3:
                return dbc0.f87246nb;
            case 4:
                return dbc0.f87572xa;
            case 5:
                return dbc0.f86531Ra;
            case 6:
                return dbc0.f87636za;
            case 7:
                return dbc0.f86755Ya;
            case 8:
                return dbc0.f86627Ua;
            case 9:
                return dbc0.f86595Ta;
            case 10:
                return dbc0.f86787Za;
            case 11:
                return dbc0.f86951eb;
            case 12:
                return dbc0.f86019Ba;
            case 13:
                return dbc0.f86723Xa;
            case 14:
                return dbc0.f87083ib;
            case 15:
                return dbc0.f87015g9;
            case 16:
                return dbc0.f87444tb;
            case 17:
                return dbc0.f86659Va;
            case 18:
                return dbc0.f86403Na;
            case 19:
                return dbc0.f87573xb;
            case 20:
                return dbc0.f86149Fc;
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: d */
    public static mcg0 m123392d(PurchaseType purchaseType) {
        return new mcg0(CoreModule.f18263b.getString(R$string.f18876T9), CoreModule.f18263b.getString(R$string.f18846S9), purchaseType);
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public static int m123393e(Privilege privilege) {
        int i = dbc0.f86371Ma;
        switch (C16870a.f96611a[privilege.ordinal()]) {
            case 21:
                return dbc0.f86371Ma;
            case 22:
                return IntlCountryCodeController.m29125v() ? dbc0.f87345qb : dbc0.f87312pb;
            case 23:
                return dbc0.f85987Aa;
            case 24:
                return dbc0.f86435Oa;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    public static int m123394f(Privilege privilege) {
        int i = dbc0.f87411sb;
        switch (C16870a.f96611a[privilege.ordinal()]) {
            case 1:
                return dbc0.f87411sb;
            case 2:
                return dbc0.f87050hb;
            case 3:
                return dbc0.f87279ob;
            case 4:
                return dbc0.f87604ya;
            case 5:
                return dbc0.f86563Sa;
            case 6:
                return dbc0.f86036Br;
            case 7:
                return dbc0.f86004Ar;
            case 8:
                return dbc0.f87540wa;
            case 9:
                return dbc0.f86100Dr;
            case 10:
                return dbc0.f86068Cr;
            default:
                return i;
        }
    }
}
