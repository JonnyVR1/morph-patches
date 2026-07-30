package p149l;

import androidx.annotation.DrawableRes;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem;

/* JADX INFO: loaded from: classes9.dex */
public class it80 {

    /* JADX INFO: renamed from: l.it80$a */
    public static /* synthetic */ class C17615a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f114866a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f114866a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f114866a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f114866a[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f114866a[Privilege.vip_location.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f114866a[Privilege.vip_badge.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f114866a[Privilege.vip_greet.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f114866a[Privilege.leave_message.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f114866a[Privilege.message_read_state.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f114866a[Privilege.greet.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f114866a[Privilege.recover_unmatches.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f114866a[Privilege.online_match_tickets.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f114866a[Privilege.letter.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f114866a[Privilege.liked_user.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f114866a[Privilege.boost.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f114866a[Privilege.see_who_likes_me.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f114866a[Privilege.privacy_membership.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f114866a[Privilege.advanced_filter.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f114866a[Privilege.svip_greet.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f114866a[Privilege.nearby_people.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f114866a[Privilege.unlock_learn_about_him_module.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f114866a[Privilege.hide_me_from_nearby.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f114866a[Privilege.city_topping.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f114866a[Privilege.personal_customization.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f114866a[Privilege.mysterious_mode.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f114866a[Privilege.exclusive_dressing_up.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f114866a[Privilege.customer_service.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f114866a[Privilege.immediately_match.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f114866a[Privilege.top_like.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f114866a[Privilege.accelerate_pairing.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f114866a[Privilege.top_chat.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f114866a[Privilege.say_hi_pkg.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f114866a[Privilege.confession_first.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f114866a[Privilege.oDiamondSvipSkin.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f114866a[Privilege.oDiamondGreetings.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f114866a[Privilege.oDiamondVisitor.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f114866a[Privilege.moment_boost.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f114866a[Privilege.ads_not_disturb.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f114866a[Privilege.block_harassing_words.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f114866a[Privilege.pick_tantan_credits_users.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f114866a[Privilege.youth_roaming.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f114866a[Privilege.youth_find_partner.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f114866a[Privilege.youth_blind_box.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f114866a[Privilege.youth_superlike.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f114866a[Privilege.youth_message_read.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static PrivilegeDescListItem.C8988a m138185a(Privilege privilege, PurchaseType purchaseType) {
        int iM138190f;
        String string;
        if (sab0.m182906x(purchaseType)) {
            iM138190f = m138192h(privilege);
        } else if (sab0.m182889g(purchaseType)) {
            iM138190f = m138187c(privilege);
        } else if (sab0.m182899q(purchaseType)) {
            iM138190f = m138189e(privilege);
        } else if (sab0.m182891i(purchaseType)) {
            iM138190f = m138186b(privilege);
        } else if (sab0.m182897o(purchaseType)) {
            iM138190f = m138188d(privilege);
        } else {
            iM138190f = sab0.m182903u(purchaseType) ? m138190f(privilege) : m138191g(privilege);
        }
        int i = iM138190f;
        wx80 wx80VarM123717m = fy80.m123717m(purchaseType, privilege);
        String string2 = (privilege != Privilege.vip_super_like || sab0.m182891i(purchaseType) || ura.m195053e().m195057d().mo33734Oi()) ? wx80VarM123717m.m205968t().toString() : CoreModule.f17544b.getString(R$string.f18897rs, 5);
        if (privilege == Privilege.see_who_likes_me && (sab0.m182899q(purchaseType) || sab0.m182897o(purchaseType))) {
            string = CoreModule.f17544b.getString(R$string.f17614Bh);
        } else if (privilege == Privilege.accelerate_pairing && sab0.m182897o(purchaseType)) {
            string = "30分钟斩获最多10倍配对！";
        } else if (privilege == Privilege.online_match_tickets) {
            string = String.format("每天3次，和附近在线的%s立即开聊", zz6.m221004u0() ? "他" : "她");
        } else {
            string = wx80VarM123717m.m205965q().toString();
        }
        return new PrivilegeDescListItem.C8988a(i, string2, string, privilege, purchaseType);
    }

    @DrawableRes
    /* JADX INFO: renamed from: b */
    public static int m138186b(Privilege privilege) {
        int i = x2c0.f189676Qk;
        boolean zM124566o = g6a.m124566o();
        int i2 = C17615a.f114866a[privilege.ordinal()];
        if (i2 == 1) {
            return x2c0.f189676Qk;
        }
        if (i2 == 2) {
            return zM124566o ? x2c0.f190175gi : x2c0.f189459Jk;
        }
        if (i2 == 11) {
            return x2c0.f190751yk;
        }
        if (i2 == 14) {
            return zM124566o ? x2c0.f189921Yh : x2c0.f189954Zj;
        }
        if (i2 == 19) {
            return zM124566o ? x2c0.f190080di : x2c0.f189233Cf;
        }
        if (i2 == 26) {
            return zM124566o ? x2c0.f190016bi : x2c0.f190113ek;
        }
        if (i2 == 27) {
            return zM124566o ? x2c0.f190048ci : x2c0.f190303kk;
        }
        switch (i2) {
            case 33:
                return zM124566o ? x2c0.f190143fi : x2c0.f189428Ik;
            case 34:
                return x2c0.f190240ik;
            case 35:
                return zM124566o ? x2c0.f190207hi : x2c0.f189831Vk;
            case 36:
                return x2c0.f190495qk;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: c */
    public static int m138187c(Privilege privilege) {
        int i = C17615a.f114866a[privilege.ordinal()];
        if (i == 16) {
            return x2c0.f189632P7;
        }
        if (i == 20) {
            return x2c0.f189601O7;
        }
        if (i != 37) {
            return i != 38 ? x2c0.f189570N7 : x2c0.f189539M7;
        }
        return x2c0.f189508L7;
    }

    @DrawableRes
    /* JADX INFO: renamed from: d */
    public static int m138188d(Privilege privilege) {
        int i = x2c0.f189583Nk;
        int i2 = C17615a.f114866a[privilege.ordinal()];
        if (i2 == 11) {
            return x2c0.f190783zk;
        }
        if (i2 == 19) {
            return x2c0.f189265Df;
        }
        switch (i2) {
            case 15:
                return x2c0.f189366Gk;
            case 16:
                return x2c0.f190719xk;
            case 17:
                return x2c0.f189861Wj;
            default:
                switch (i2) {
                    case 28:
                        return g6a.m124569r() ? x2c0.f189614Ok : x2c0.f189583Nk;
                    case 29:
                        return x2c0.f189768Tj;
                    case 30:
                        return x2c0.f189552Mk;
                    case 31:
                        return x2c0.f189270Dk;
                    case 32:
                        return x2c0.f190050ck;
                    default:
                        return i;
                }
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public static int m138189e(Privilege privilege) {
        int i = x2c0.f189707Rk;
        int i2 = C17615a.f114866a[privilege.ordinal()];
        if (i2 == 1) {
            return x2c0.f189738Sk;
        }
        if (i2 == 2) {
            return x2c0.f189490Kk;
        }
        if (i2 == 7) {
            return x2c0.f190675w8;
        }
        if (i2 == 8) {
            return x2c0.f189206Bk;
        }
        switch (i2) {
            case 11:
                return upa.m194663L1() ? x2c0.f190451p8 : x2c0.f189174Ak;
            case 12:
                return x2c0.f190367mk;
            case 13:
                return x2c0.f190399nk;
            case 14:
                return x2c0.f189986ak;
            case 15:
                return x2c0.f189397Hk;
            case 16:
                return x2c0.f190687wk;
            case 17:
                return x2c0.f189892Xj;
            case 18:
                return x2c0.f190209hk;
            case 19:
                return x2c0.f189297Ef;
            case 20:
                return x2c0.f190202hd;
            case 21:
                return x2c0.f190271jk;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    public static int m138190f(Privilege privilege) {
        int i = x2c0.f190018bk;
        int i2 = C17615a.f114866a[privilege.ordinal()];
        if (i2 == 19) {
            return x2c0.f190559sk;
        }
        switch (i2) {
            case 22:
                return x2c0.f190018bk;
            case 23:
                return x2c0.f190591tk;
            case 24:
                return x2c0.f190527rk;
            case 25:
                return x2c0.f190145fk;
            case 26:
                return x2c0.f190082dk;
            case 27:
                return x2c0.f190335lk;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    public static int m138191g(Privilege privilege) {
        int i = x2c0.f189769Tk;
        switch (C17615a.f114866a[privilege.ordinal()]) {
            case 1:
                return x2c0.f189800Uk;
            case 2:
                return x2c0.f189521Lk;
            case 3:
                return x2c0.f189645Pk;
            case 4:
                return x2c0.f190431ok;
            case 5:
                return x2c0.f189923Yj;
            case 6:
                return x2c0.f190209hk;
            case 7:
                return x2c0.f190707x8;
            case 8:
                return x2c0.f190463pk;
            case 9:
                return x2c0.f190177gk;
            case 10:
                return x2c0.f189238Ck;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public static int m138192h(Privilege privilege) {
        switch (C17615a.f114866a[privilege.ordinal()]) {
            case 40:
                return x2c0.f190342lr;
            case 41:
                return x2c0.f190247ir;
            case 42:
                return x2c0.f190310kr;
            case 43:
                return x2c0.f190374mr;
            default:
                return x2c0.f190278jr;
        }
    }
}
