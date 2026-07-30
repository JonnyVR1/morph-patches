package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabIapType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/fix;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;", "type", "", "layoutType", "", "a", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/data/User;", "me", "g", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;Ljava/lang/String;)V", "b", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "f", "e", "c", "(Lcom/p1/mobile/android/app/Act;)V", Constants.INAPP_DATA_TAG, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fix {

    @NotNull
    public static final fix INSTANCE = new fix();

    /* JADX INFO: renamed from: l.fix$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C16984a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99273a;

        static {
            int[] iArr = new int[MeTabIapType.values().length];
            try {
                iArr[MeTabIapType.BOOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MeTabIapType.SUPER_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MeTabIapType.COMPLIMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MeTabIapType.INSTANT_MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f99273a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m125763a(@NotNull Act act, @NotNull MeTabIapType type, @NotNull String layoutType) {
        act.getClass();
        type.getClass();
        layoutType.getClass();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return;
        }
        m125769g(userM116600p9, type, layoutType);
        int i = C16984a.f99273a[type.ordinal()];
        if (i == 1) {
            m125764b(act, userM116600p9);
            return;
        }
        if (i == 2) {
            m125767e(act, userM116600p9);
            return;
        }
        if (i == 3) {
            m125765c(act);
        } else if (i == 4) {
            m125766d(act);
        } else {
            nbr.m162172a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m125764b(Act act, User me2) {
        if (me2.isUltraPremium() && !joa.m146396k4()) {
            m125768f();
        } else if (CoreModule.f18264c.f20318J0.m156766F3()) {
            m125768f();
        } else {
            y63.m214366j().m214371o();
            ma3.Companion.m157627h(ma3.INSTANCE, act, false, null, false, "p_navigation_view,e_intl_me_tab_consumables_sku_click,click", 8, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m125765c(Act act) {
        o8n.Companion.m166607b(o8n.INSTANCE, act, "p_navigation_view,e_intl_me_tab_consumables_sku_click,click", null, null, 12, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m125766d(Act act) {
        if (gix.m130389c()) {
            C8927c.m54597N0(act, "p_navigation_view,e_intl_me_tab_consumables_sku_click,click", null, null, null, Privilege.immediately_match, null, 92, null);
        } else {
            new nxm.C18984e(act).m165204b("p_navigation_view,e_intl_me_tab_consumables_sku_click,click").m165206d();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m125767e(Act act, User me2) {
        if (!me2.isUltraPremium() || joa.m146396k4()) {
            C8927c.m54580H1(act, "p_navigation_view,e_intl_me_tab_consumables_sku_click,click", 0, null, 12, null);
        } else {
            o1j0.m165649w(IntlCountryCodeController.m29125v() ? R$string.f18344Br : R$string.f19723ut);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m125768f() {
        o1j0.m165649w(R$string.f19630rt);
    }

    /* JADX INFO: renamed from: g */
    public final void m125769g(User me2, MeTabIapType type, String layoutType) {
        String str;
        String str2;
        if (me2.isUltraPremium()) {
            str = "ultra_premium";
        } else if (me2.isSVIP()) {
            str = "premium";
        } else if (rbb0.m180746s(null, 1, null)) {
            str = me2.isVIP() ? "vip" : "free";
        } else {
            str = "see";
        }
        int i = C16984a.f99273a[type.ordinal()];
        if (i == 1) {
            str2 = "boost";
        } else if (i == 2) {
            str2 = "superlike";
        } else if (i == 3) {
            str2 = "compliment";
        } else {
            if (i != 4) {
                nbr.m162172a();
                return;
            }
            str2 = "instant_match";
        }
        box.INSTANCE.m105716e(str, str2, layoutType, gix.m130391f(type) > 0);
    }
}
