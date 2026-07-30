package p009l;

import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import l.h6a;
import l.j760;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0003J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0003J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0003J\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0003¨\u0006\u001d"}, d2 = {"Ll/dfx;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "", "p", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "o", "g", "u", "t", "b", "a", "l", "k", "q", "r", "c", "d", "i", "j", "m", "s", "h", "n", "f", "e", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class dfx {

    @NotNull
    public static final dfx INSTANCE = new dfx();

    /* JADX INFO: renamed from: l.dfx$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0848a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11830a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11830a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13316a() {
        zvf0.u("e_my_profile_navigation_appeal_guide", "p_navigation_view", new j760[]{vwb.Y("ban_user_appeal_state", rc2.m21492e().m21494b())});
    }

    /* JADX INFO: renamed from: b */
    public final void m13317b() {
        zvf0.A("e_my_profile_navigation_appeal_guide", "p_navigation_view", new j760[]{vwb.Y("ban_user_appeal_state", rc2.m21492e().m21494b())});
    }

    /* JADX INFO: renamed from: c */
    public final void m13318c() {
        zvf0.r("e_navigation_turbo", "p_navigation_view");
    }

    /* JADX INFO: renamed from: d */
    public final void m13319d() {
        zvf0.x("e_navigation_turbo", "p_navigation_view");
    }

    /* JADX INFO: renamed from: e */
    public final void m13320e() {
        zvf0.r("e_intl_mkt_catnmouse_entrance", "p_navigation_view");
    }

    /* JADX INFO: renamed from: f */
    public final void m13321f() {
        zvf0.x("e_intl_mkt_catnmouse_entrance", "p_navigation_view");
    }

    /* JADX INFO: renamed from: g */
    public final void m13322g() {
        zvf0.x("e_intl_like_i_sent", "p_navigation_view");
    }

    /* JADX INFO: renamed from: h */
    public final void m13323h() {
        zvf0.B("e_setting_finish_no_location", "p_navigation_view", new j760[0]);
    }

    /* JADX INFO: renamed from: i */
    public final void m13324i() {
        zvf0.r("e_navigation_daily_picks", "p_navigation_view");
    }

    /* JADX INFO: renamed from: j */
    public final void m13325j() {
        zvf0.x("e_navigation_daily_picks", "p_navigation_view");
    }

    /* JADX INFO: renamed from: k */
    public final void m13326k() {
        zvf0.u("e_picture_fake_button", "p_navigation_view", new j760[]{vwb.Y("pic_show_from", "picture_banner")});
    }

    /* JADX INFO: renamed from: l */
    public final void m13327l() {
        zvf0.A("e_picture_fake_button", "p_navigation_view", new j760[]{vwb.Y("pic_show_from", "picture_banner")});
    }

    /* JADX INFO: renamed from: m */
    public final void m13328m() {
        zvf0.r("e_self_edit", "p_navigation_view");
    }

    /* JADX INFO: renamed from: n */
    public final void m13329n() {
        zvf0.s("e_red_dot_me_settings", "p_navigation_view", u4e.m22747d());
    }

    /* JADX INFO: renamed from: o */
    public final void m13330o(@NotNull PurchaseType type) {
        String strName;
        type.getClass();
        int i = C0848a.f11830a[type.ordinal()];
        int i2 = 1;
        if (i == 1) {
            strName = "vip";
        } else if (i == 2) {
            strName = "see";
        } else if (i == 3) {
            strName = (h6a.c() && CoreModule.c.G2.l3(type) && CoreModule.c.j0.P4()) ? CoreModule.c.G2.i3().name() : "premium";
        } else if (i != 4) {
            strName = "";
        } else {
            strName = (h6a.c() && CoreModule.c.G2.l3(type) && CoreModule.c.j0.P4()) ? CoreModule.c.G2.i3().name() : "ultraPremium";
        }
        strName.getClass();
        if (strName.length() > 0) {
            User userP9 = CoreModule.c.e0.p9();
            if (NullChecker.a(userP9) && type == CoreModule.c.p0.d3()) {
                qqh0 qqh0Var = qqh0.INSTANCE;
                userP9.getClass();
                if (qqh0Var.m21177d(userP9) != -1) {
                    i2 = 0;
                }
            }
            zvf0.u("e_intl_me_subscription_card", "p_navigation_view", new j760[]{vwb.Y("subtype", strName), vwb.Y("default_position", Integer.valueOf(i2))});
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m13331p(@NotNull PurchaseType type) {
        String strName;
        type.getClass();
        int i = C0848a.f11830a[type.ordinal()];
        int i2 = 1;
        if (i == 1) {
            strName = "vip";
        } else if (i == 2) {
            strName = "see";
        } else if (i == 3) {
            strName = (h6a.c() && CoreModule.c.G2.l3(type) && CoreModule.c.j0.P4()) ? CoreModule.c.G2.i3().name() : "premium";
        } else if (i != 4) {
            strName = "";
        } else {
            strName = (h6a.c() && CoreModule.c.G2.l3(type) && CoreModule.c.j0.P4()) ? CoreModule.c.G2.i3().name() : "ultraPremium";
        }
        strName.getClass();
        if (strName.length() > 0) {
            User userP9 = CoreModule.c.e0.p9();
            if (NullChecker.a(userP9) && type == CoreModule.c.p0.d3()) {
                qqh0 qqh0Var = qqh0.INSTANCE;
                userP9.getClass();
                if (qqh0Var.m21177d(userP9) != -1) {
                    i2 = 0;
                }
            }
            zvf0.A("e_intl_me_subscription_card", "p_navigation_view", new j760[]{vwb.Y("subtype", strName), vwb.Y("default_position", Integer.valueOf(i2))});
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m13332q() {
        zvf0.r("e_navigation_super_like", "p_navigation_view");
    }

    /* JADX INFO: renamed from: r */
    public final void m13333r() {
        zvf0.x("e_navigation_super_like", "p_navigation_view");
    }

    /* JADX INFO: renamed from: s */
    public final void m13334s() {
        zvf0.r("e_intl_tabme_tantanid_icon", "p_navigation_view");
    }

    /* JADX INFO: renamed from: t */
    public final void m13335t() {
        zvf0.r("e_intl_tab_me_visitors", "p_navigation_view");
    }

    /* JADX INFO: renamed from: u */
    public final void m13336u() {
        zvf0.x("e_intl_tab_me_visitors", "p_navigation_view");
    }
}
