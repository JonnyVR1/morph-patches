package p153l;

import androidx.annotation.DrawableRes;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem;

/* JADX INFO: loaded from: classes12.dex */
public class m190 {

    /* JADX INFO: renamed from: l.m190$a */
    public static /* synthetic */ class C18522a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f134401a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f134401a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f134401a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f134401a[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f134401a[Privilege.vip_location.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f134401a[Privilege.vip_badge.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f134401a[Privilege.vip_greet.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f134401a[Privilege.leave_message.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f134401a[Privilege.message_read_state.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f134401a[Privilege.greet.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f134401a[Privilege.recover_unmatches.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f134401a[Privilege.online_match_tickets.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f134401a[Privilege.letter.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f134401a[Privilege.liked_user.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f134401a[Privilege.boost.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f134401a[Privilege.see_who_likes_me.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f134401a[Privilege.privacy_membership.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f134401a[Privilege.advanced_filter.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f134401a[Privilege.svip_greet.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f134401a[Privilege.nearby_people.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f134401a[Privilege.unlock_learn_about_him_module.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f134401a[Privilege.hide_me_from_nearby.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f134401a[Privilege.city_topping.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f134401a[Privilege.personal_customization.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f134401a[Privilege.mysterious_mode.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f134401a[Privilege.exclusive_dressing_up.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f134401a[Privilege.customer_service.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f134401a[Privilege.immediately_match.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f134401a[Privilege.top_like.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f134401a[Privilege.accelerate_pairing.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f134401a[Privilege.top_chat.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f134401a[Privilege.say_hi_pkg.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f134401a[Privilege.confession_first.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f134401a[Privilege.oDiamondSvipSkin.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f134401a[Privilege.oDiamondGreetings.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f134401a[Privilege.oDiamondVisitor.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f134401a[Privilege.moment_boost.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f134401a[Privilege.ads_not_disturb.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f134401a[Privilege.block_harassing_words.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f134401a[Privilege.pick_tantan_credits_users.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f134401a[Privilege.youth_roaming.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f134401a[Privilege.youth_find_partner.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f134401a[Privilege.youth_blind_box.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f134401a[Privilege.youth_superlike.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f134401a[Privilege.youth_message_read.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static PrivilegeDescListItem.C9151a m156630a(Privilege privilege, PurchaseType purchaseType) {
        int iM156635f;
        String string;
        if (wib0.m206580x(purchaseType)) {
            iM156635f = m156637h(privilege);
        } else if (wib0.m206563g(purchaseType)) {
            iM156635f = m156632c(privilege);
        } else if (wib0.m206573q(purchaseType)) {
            iM156635f = m156634e(privilege);
        } else if (wib0.m206565i(purchaseType)) {
            iM156635f = m156631b(privilege);
        } else if (wib0.m206571o(purchaseType)) {
            iM156635f = m156633d(privilege);
        } else {
            iM156635f = wib0.m206577u(purchaseType) ? m156635f(privilege) : m156636g(privilege);
        }
        int i = iM156635f;
        a690 a690VarM143621m = j690.m143621m(purchaseType, privilege);
        String string2 = (privilege != Privilege.vip_super_like || wib0.m206565i(purchaseType) || gta.m132210e().m132214d().mo34737Oi()) ? a690VarM143621m.m96314t().toString() : CoreModule.f18263b.getString(R$string.f18715Ns, 5);
        if (privilege == Privilege.see_who_likes_me && (wib0.m206573q(purchaseType) || wib0.m206571o(purchaseType))) {
            string = CoreModule.f18263b.getString(R$string.f18974Wh);
        } else if (privilege == Privilege.accelerate_pairing && wib0.m206571o(purchaseType)) {
            string = "30分钟斩获最多10倍配对！";
        } else if (privilege == Privilege.online_match_tickets) {
            string = String.format("每天3次，和附近在线的%s立即开聊", c17.m107528u0() ? "他" : "她");
        } else {
            string = a690VarM143621m.m96311q().toString();
        }
        return new PrivilegeDescListItem.C9151a(i, string2, string, privilege, purchaseType);
    }

    @DrawableRes
    /* JADX INFO: renamed from: b */
    public static int m156631b(Privilege privilege) {
        int i = dbc0.f86126El;
        boolean zM184986o = s7a.m184986o();
        int i2 = C18522a.f134401a[privilege.ordinal()];
        if (i2 == 1) {
            return dbc0.f86126El;
        }
        if (i2 == 2) {
            return zM184986o ? dbc0.f86635Ui : dbc0.f87583xl;
        }
        if (i2 == 11) {
            return dbc0.f87223ml;
        }
        if (i2 == 14) {
            return zM184986o ? dbc0.f86379Mi : dbc0.f86413Nk;
        }
        if (i2 == 19) {
            return zM184986o ? dbc0.f86539Ri : dbc0.f87350qg;
        }
        if (i2 == 26) {
            return zM184986o ? dbc0.f86475Pi : dbc0.f86573Sk;
        }
        if (i2 == 27) {
            return zM184986o ? dbc0.f86507Qi : dbc0.f86765Yk;
        }
        switch (i2) {
            case 33:
                return zM184986o ? dbc0.f86603Ti : dbc0.f87551wl;
            case 34:
                return dbc0.f86701Wk;
            case 35:
                return zM184986o ? dbc0.f86667Vi : dbc0.f86286Jl;
            case 36:
                return dbc0.f86961el;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: c */
    public static int m156632c(Privilege privilege) {
        int i = C18522a.f134401a[privilege.ordinal()];
        if (i == 16) {
            return dbc0.f86496Q7;
        }
        if (i == 20) {
            return dbc0.f86464P7;
        }
        if (i != 37) {
            return i != 38 ? dbc0.f86432O7 : dbc0.f86400N7;
        }
        return dbc0.f86368M7;
    }

    @DrawableRes
    /* JADX INFO: renamed from: d */
    public static int m156633d(Privilege privilege) {
        int i = dbc0.f86030Bl;
        int i2 = C18522a.f134401a[privilege.ordinal()];
        if (i2 == 11) {
            return dbc0.f87256nl;
        }
        if (i2 == 19) {
            return dbc0.f87383rg;
        }
        switch (i2) {
            case 15:
                return dbc0.f87487ul;
            case 16:
                return dbc0.f87190ll;
            case 17:
                return dbc0.f86317Kk;
            default:
                switch (i2) {
                    case 28:
                        return s7a.m184989r() ? dbc0.f86062Cl : dbc0.f86030Bl;
                    case 29:
                        return dbc0.f86221Hk;
                    case 30:
                        return dbc0.f85998Al;
                    case 31:
                        return dbc0.f87388rl;
                    case 32:
                        return dbc0.f86509Qk;
                    default:
                        return i;
                }
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public static int m156634e(Privilege privilege) {
        int i = dbc0.f86158Fl;
        int i2 = C18522a.f134401a[privilege.ordinal()];
        if (i2 == 1) {
            return dbc0.f86190Gl;
        }
        if (i2 == 2) {
            return dbc0.f87615yl;
        }
        if (i2 == 7) {
            return dbc0.f87570x8;
        }
        if (i2 == 8) {
            return dbc0.f87322pl;
        }
        switch (i2) {
            case 11:
                return gra.m131594L1() ? dbc0.f87342q8 : dbc0.f87289ol;
            case 12:
                return dbc0.f86830al;
            case 13:
                return dbc0.f86863bl;
            case 14:
                return dbc0.f86445Ok;
            case 15:
                return dbc0.f87519vl;
            case 16:
                return dbc0.f87157kl;
            case 17:
                return dbc0.f86349Lk;
            case 18:
                return dbc0.f86669Vk;
            case 19:
                return dbc0.f87416sg;
            case 20:
                return dbc0.f87085id;
            case 21:
                return dbc0.f86733Xk;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    public static int m156635f(Privilege privilege) {
        int i = dbc0.f86477Pk;
        int i2 = C18522a.f134401a[privilege.ordinal()];
        if (i2 == 19) {
            return dbc0.f87027gl;
        }
        switch (i2) {
            case 22:
                return dbc0.f86477Pk;
            case 23:
                return dbc0.f87060hl;
            case 24:
                return dbc0.f86994fl;
            case 25:
                return dbc0.f86605Tk;
            case 26:
                return dbc0.f86541Rk;
            case 27:
                return dbc0.f86797Zk;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    public static int m156636g(Privilege privilege) {
        int i = dbc0.f86222Hl;
        switch (C18522a.f134401a[privilege.ordinal()]) {
            case 1:
                return dbc0.f86254Il;
            case 2:
                return dbc0.f87647zl;
            case 3:
                return dbc0.f86094Dl;
            case 4:
                return dbc0.f86896cl;
            case 5:
                return dbc0.f86381Mk;
            case 6:
                return dbc0.f86669Vk;
            case 7:
                return dbc0.f87602y8;
            case 8:
                return dbc0.f86929dl;
            case 9:
                return dbc0.f86637Uk;
            case 10:
                return dbc0.f87355ql;
            default:
                return i;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public static int m156637h(Privilege privilege) {
        switch (C18522a.f134401a[privilege.ordinal()]) {
            case 40:
                return dbc0.f86804Zr;
            case 41:
                return dbc0.f86708Wr;
            case 42:
                return dbc0.f86772Yr;
            case 43:
                return dbc0.f86837as;
            default:
                return dbc0.f86740Xr;
        }
    }
}
