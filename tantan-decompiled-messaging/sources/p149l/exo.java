package p149l;

import android.app.Application;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes9.dex */
public class exo {

    /* JADX INFO: renamed from: l.exo$a */
    public static /* synthetic */ class C16717a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93681a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f93681a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93681a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93681a[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93681a[Privilege.vip_membership_active_time_gp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93681a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93681a[Privilege.vip_badge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93681a[Privilege.vip_membership_remark_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f93681a[Privilege.intl_no_ad.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f93681a[Privilege.vip_message_block_gp.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f93681a[Privilege.vip_membership_search_gp.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f93681a[Privilege.see_who_likes_me.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f93681a[Privilege.boost.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f93681a[Privilege.message_read_state.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f93681a[Privilege.loveBuzz.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f93681a[Privilege.intl_advanced_filter.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f93681a[Privilege.liked_user.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f93681a[Privilege.picksMembership.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f93681a[Privilege.svip_greet.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f93681a[Privilege.intl_visitor.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f93681a[Privilege.tribe.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f93681a[Privilege.full_boost.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f93681a[Privilege.unlimit_free_super_like.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f93681a[Privilege.ultra_premium_badge.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f93681a[Privilege.immediately_match.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static IntlPrivilegeDescListItem.C9020a m118682a(Privilege privilege, PurchaseType purchaseType) {
        int iM118686e;
        String string;
        String string2;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            iM118686e = m118684c(privilege);
        } else {
            iM118686e = sab0.m182904v(purchaseType) ? m118686e(privilege) : m118687f(privilege);
        }
        int i = iM118686e;
        if (sab0.m182904v(purchaseType)) {
            wx80 wx80VarM114088b = dyo.m114088b(purchaseType, privilege);
            string = wx80VarM114088b.m205968t().toString();
            string2 = wx80VarM114088b.m205948d().toString();
        } else {
            wx80 wx80VarM123717m = fy80.m123717m(purchaseType, privilege);
            string = (privilege != Privilege.vip_super_like || ura.m195053e().m195057d().mo33734Oi()) ? wx80VarM123717m.m205968t().toString() : CoreModule.f17544b.getString(R$string.f18897rs, 5);
            string2 = wx80VarM123717m.m205965q().toString();
        }
        return new IntlPrivilegeDescListItem.C9020a(i, string, string2, privilege, purchaseType);
    }

    /* JADX INFO: renamed from: b */
    public static IntlPrivilegePolicyItem.C9023a m118683b(VipNewUiFrag vipNewUiFrag, PurchaseType purchaseType, C8765d c8765d) {
        C8765d.a aVarM53522d;
        String string = App.f15369e.getString(R$string.f18806os);
        int i = IntlCountryCodeController.m28115k() ? R$string.f17904L7 : R$string.f17762Gf;
        if (c8765d != null) {
            aVarM53522d = c8765d.m53522d() != null ? c8765d.m53522d() : c8765d.m53520b();
        } else {
            aVarM53522d = null;
        }
        int i2 = purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? w0c0.f183795P0 : w0c0.f183789N0;
        if (aVarM53522d != null && CoreModule.f17545c.f19569G2.m105983k3(aVarM53522d.m53579f())) {
            i = R$string.f17792Hf;
            string = "";
        }
        if (sab0.m182904v(purchaseType)) {
            Act act = vipNewUiFrag.act();
            Application application = App.f15369e;
            return new IntlPrivilegePolicyItem.C9023a("", rza.m181721A0(act, application.getString(i, application.getString(R$string.f17852Jf), App.f15369e.getString(R$string.f17822If)), w0c0.f183824Z, App.f15369e.getString(R$string.f17852Jf), juk.m143328j(), App.f15369e.getString(R$string.f17822If), juk.m143327i()), purchaseType);
        }
        Act act2 = vipNewUiFrag.act();
        Application application2 = App.f15369e;
        return new IntlPrivilegePolicyItem.C9023a(string, rza.m181721A0(act2, application2.getString(i, application2.getString(R$string.f19087y8), App.f15369e.getString(R$string.f18429ck)), i2, App.f15369e.getString(R$string.f19087y8), juk.m143328j(), App.f15369e.getString(R$string.f18429ck), juk.m143327i()), purchaseType);
    }

    @DrawableRes
    /* JADX INFO: renamed from: c */
    public static int m118684c(Privilege privilege) {
        int i = x2c0.f190486qb;
        switch (C16717a.f93681a[privilege.ordinal()]) {
            case 1:
                return x2c0.f190486qb;
            case 2:
                return x2c0.f190136fb;
            case 3:
                return x2c0.f190358mb;
            case 4:
                return x2c0.f190677wa;
            case 5:
                return x2c0.f189666Qa;
            case 6:
                return x2c0.f190741ya;
            case 7:
                return x2c0.f189883Xa;
            case 8:
                return x2c0.f189759Ta;
            case 9:
                return x2c0.f189728Sa;
            case 10:
                return x2c0.f189914Ya;
            case 11:
                return x2c0.f190073db;
            case 12:
                return x2c0.f189164Aa;
            case 13:
                return x2c0.f189852Wa;
            case 14:
                return x2c0.f190200hb;
            case 15:
                return x2c0.f190134f9;
            case 16:
                return x2c0.f190550sb;
            case 17:
                return x2c0.f189790Ua;
            case 18:
                return x2c0.f189542Ma;
            case 19:
                return x2c0.f190678wb;
            case 20:
                return x2c0.f189294Ec;
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: d */
    public static e4g0 m118685d(PurchaseType purchaseType) {
        return new e4g0(CoreModule.f17544b.getString(R$string.f17846J9), CoreModule.f17544b.getString(R$string.f17816I9), purchaseType);
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public static int m118686e(Privilege privilege) {
        int i = x2c0.f189511La;
        switch (C16717a.f93681a[privilege.ordinal()]) {
            case 21:
                return x2c0.f189511La;
            case 22:
                return IntlCountryCodeController.m28126v() ? x2c0.f190454pb : x2c0.f190422ob;
            case 23:
                return x2c0.f190773za;
            case 24:
                return x2c0.f189573Na;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    public static int m118687f(Privilege privilege) {
        int i = x2c0.f190518rb;
        switch (C16717a.f93681a[privilege.ordinal()]) {
            case 1:
                return x2c0.f190518rb;
            case 2:
                return x2c0.f190168gb;
            case 3:
                return x2c0.f190390nb;
            case 4:
                return x2c0.f190709xa;
            case 5:
                return x2c0.f189697Ra;
            case 6:
                return x2c0.f189589Nq;
            case 7:
                return x2c0.f189558Mq;
            case 8:
                return x2c0.f190645va;
            case 9:
                return x2c0.f189651Pq;
            case 10:
                return x2c0.f189620Oq;
            default:
                return i;
        }
    }
}
