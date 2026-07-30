package p006l;

import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.fy80;
import l.sab0;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class it80 {

    /* JADX INFO: renamed from: l.it80$a */
    public static /* synthetic */ class C0855a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14778a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f14778a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14778a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14778a[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14778a[Privilege.vip_location.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14778a[Privilege.vip_badge.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14778a[Privilege.vip_greet.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14778a[Privilege.leave_message.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14778a[Privilege.message_read_state.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14778a[Privilege.greet.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14778a[Privilege.recover_unmatches.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14778a[Privilege.online_match_tickets.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14778a[Privilege.letter.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14778a[Privilege.liked_user.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14778a[Privilege.boost.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14778a[Privilege.see_who_likes_me.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14778a[Privilege.privacy_membership.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14778a[Privilege.advanced_filter.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14778a[Privilege.svip_greet.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f14778a[Privilege.nearby_people.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f14778a[Privilege.unlock_learn_about_him_module.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f14778a[Privilege.hide_me_from_nearby.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f14778a[Privilege.city_topping.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f14778a[Privilege.personal_customization.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f14778a[Privilege.mysterious_mode.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f14778a[Privilege.exclusive_dressing_up.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f14778a[Privilege.customer_service.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f14778a[Privilege.immediately_match.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f14778a[Privilege.top_like.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f14778a[Privilege.accelerate_pairing.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f14778a[Privilege.top_chat.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f14778a[Privilege.say_hi_pkg.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f14778a[Privilege.confession_first.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f14778a[Privilege.oDiamondSvipSkin.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f14778a[Privilege.oDiamondGreetings.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f14778a[Privilege.oDiamondVisitor.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f14778a[Privilege.moment_boost.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f14778a[Privilege.ads_not_disturb.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f14778a[Privilege.block_harassing_words.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f14778a[Privilege.pick_tantan_credits_users.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f14778a[Privilege.youth_roaming.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f14778a[Privilege.youth_find_partner.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f14778a[Privilege.youth_blind_box.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f14778a[Privilege.youth_superlike.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f14778a[Privilege.youth_message_read.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static PrivilegeDescListItem.C0424a m17027a(Privilege privilege, PurchaseType purchaseType) {
        int iM17032f;
        String string;
        if (sab0.x(purchaseType)) {
            iM17032f = m17034h(privilege);
        } else if (sab0.g(purchaseType)) {
            iM17032f = m17029c(privilege);
        } else if (sab0.q(purchaseType)) {
            iM17032f = m17031e(privilege);
        } else if (sab0.i(purchaseType)) {
            iM17032f = m17028b(privilege);
        } else if (sab0.o(purchaseType)) {
            iM17032f = m17030d(privilege);
        } else {
            iM17032f = sab0.u(purchaseType) ? m17032f(privilege) : m17033g(privilege);
        }
        int i = iM17032f;
        wx80 wx80VarM = fy80.m(purchaseType, privilege);
        String string2 = (privilege != Privilege.vip_super_like || sab0.i(purchaseType) || ura.m25555e().m25559d().m5671Oi()) ? wx80VarM.m26849t().toString() : CoreModule.f1533b.getString(R$string.f2886rs, 5);
        if (privilege == Privilege.see_who_likes_me && (sab0.q(purchaseType) || sab0.o(purchaseType))) {
            string = CoreModule.f1533b.getString(R$string.f1603Bh);
        } else if (privilege == Privilege.accelerate_pairing && sab0.o(purchaseType)) {
            string = "30分钟斩获最多10倍配对！";
        } else if (privilege == Privilege.online_match_tickets) {
            string = String.format("每天3次，和附近在线的%s立即开聊", zz6.u0() ? "他" : "她");
        } else {
            string = wx80VarM.m26846q().toString();
        }
        return new PrivilegeDescListItem.C0424a(i, string2, string, privilege, purchaseType);
    }

    @DrawableRes
    /* JADX INFO: renamed from: b */
    public static int m17028b(Privilege privilege) {
        int i = x2c0.f26212Qk;
        boolean zM15592o = g6a.m15592o();
        int i2 = C0855a.f14778a[privilege.ordinal()];
        if (i2 == 1) {
            return x2c0.f26212Qk;
        }
        if (i2 == 2) {
            return zM15592o ? x2c0.f26711gi : x2c0.f25995Jk;
        }
        if (i2 == 11) {
            return x2c0.f27287yk;
        }
        if (i2 == 14) {
            return zM15592o ? x2c0.f26457Yh : x2c0.f26490Zj;
        }
        if (i2 == 19) {
            return zM15592o ? x2c0.f26616di : x2c0.f25769Cf;
        }
        if (i2 == 26) {
            return zM15592o ? x2c0.f26552bi : x2c0.f26649ek;
        }
        if (i2 == 27) {
            return zM15592o ? x2c0.f26584ci : x2c0.f26839kk;
        }
        switch (i2) {
            case 33:
                return zM15592o ? x2c0.f26679fi : x2c0.f25964Ik;
            case 34:
                return x2c0.f26776ik;
            case 35:
                return zM15592o ? x2c0.f26743hi : x2c0.f26367Vk;
            case 36:
                return x2c0.f27031qk;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: c */
    public static int m17029c(Privilege privilege) {
        int i = C0855a.f14778a[privilege.ordinal()];
        if (i == 16) {
            return x2c0.f26168P7;
        }
        if (i == 20) {
            return x2c0.f26137O7;
        }
        if (i != 37) {
            return i != 38 ? x2c0.f26106N7 : x2c0.f26075M7;
        }
        return x2c0.f26044L7;
    }

    @DrawableRes
    /* JADX INFO: renamed from: d */
    public static int m17030d(Privilege privilege) {
        int i = x2c0.f26119Nk;
        int i2 = C0855a.f14778a[privilege.ordinal()];
        if (i2 == 11) {
            return x2c0.f27319zk;
        }
        if (i2 == 19) {
            return x2c0.f25801Df;
        }
        switch (i2) {
            case 15:
                return x2c0.f25902Gk;
            case 16:
                return x2c0.f27255xk;
            case 17:
                return x2c0.f26397Wj;
            default:
                switch (i2) {
                    case 28:
                        return g6a.m15595r() ? x2c0.f26150Ok : x2c0.f26119Nk;
                    case 29:
                        return x2c0.f26304Tj;
                    case 30:
                        return x2c0.f26088Mk;
                    case 31:
                        return x2c0.f25806Dk;
                    case 32:
                        return x2c0.f26586ck;
                    default:
                        return i;
                }
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public static int m17031e(Privilege privilege) {
        int i = x2c0.f26243Rk;
        int i2 = C0855a.f14778a[privilege.ordinal()];
        if (i2 == 1) {
            return x2c0.f26274Sk;
        }
        if (i2 == 2) {
            return x2c0.f26026Kk;
        }
        if (i2 == 7) {
            return x2c0.f27211w8;
        }
        if (i2 == 8) {
            return x2c0.f25742Bk;
        }
        switch (i2) {
            case 11:
                return upa.m25361L1() ? x2c0.f26987p8 : x2c0.f25710Ak;
            case 12:
                return x2c0.f26903mk;
            case 13:
                return x2c0.f26935nk;
            case 14:
                return x2c0.f26522ak;
            case 15:
                return x2c0.f25933Hk;
            case 16:
                return x2c0.f27223wk;
            case 17:
                return x2c0.f26428Xj;
            case 18:
                return x2c0.f26745hk;
            case 19:
                return x2c0.f25833Ef;
            case 20:
                return x2c0.f26738hd;
            case 21:
                return x2c0.f26807jk;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    public static int m17032f(Privilege privilege) {
        int i = x2c0.f26554bk;
        int i2 = C0855a.f14778a[privilege.ordinal()];
        if (i2 == 19) {
            return x2c0.f27095sk;
        }
        switch (i2) {
            case 22:
                return x2c0.f26554bk;
            case 23:
                return x2c0.f27127tk;
            case 24:
                return x2c0.f27063rk;
            case 25:
                return x2c0.f26681fk;
            case 26:
                return x2c0.f26618dk;
            case 27:
                return x2c0.f26871lk;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    public static int m17033g(Privilege privilege) {
        int i = x2c0.f26305Tk;
        switch (C0855a.f14778a[privilege.ordinal()]) {
            case 1:
                return x2c0.f26336Uk;
            case 2:
                return x2c0.f26057Lk;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return x2c0.f26181Pk;
            case CameraSticker.STATE_ERROR /* 4 */:
                return x2c0.f26967ok;
            case 5:
                return x2c0.f26459Yj;
            case 6:
                return x2c0.f26745hk;
            case 7:
                return x2c0.f27243x8;
            case 8:
                return x2c0.f26999pk;
            case 9:
                return x2c0.f26713gk;
            case 10:
                return x2c0.f25774Ck;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public static int m17034h(Privilege privilege) {
        switch (C0855a.f14778a[privilege.ordinal()]) {
            case 40:
                return x2c0.f26878lr;
            case 41:
                return x2c0.f26783ir;
            case 42:
                return x2c0.f26846kr;
            case 43:
                return x2c0.f26910mr;
            default:
                return x2c0.f26814jr;
        }
    }
}
