package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.FakeLikersFrag;
import com.p000p1.mobile.putong.core.p004ui.seepage.match.FakeMatchAct;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAct;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.PicksHelper;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.PicksItemView;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.header.PicksHeaderView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.PicksUser;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import l.d30;
import l.e30;
import l.e51;
import l.hpd0;
import l.j760;
import l.jq2;
import l.mkd0;
import l.mqi0;
import l.vwb;
import l.w2b0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yzf extends jq2<l0g> {

    /* JADX INFO: renamed from: a */
    public String f28515a;

    /* JADX INFO: renamed from: b */
    public final BusinessEntranceStyle f28516b;

    /* JADX INFO: renamed from: c */
    public boolean f28517c;

    /* JADX INFO: renamed from: d */
    public boolean f28518d;

    /* JADX INFO: renamed from: e */
    public PutongAct f28519e;

    /* JADX INFO: renamed from: f */
    public User f28520f;

    /* JADX INFO: renamed from: g */
    public int f28521g;

    /* JADX INFO: renamed from: h */
    public int f28522h;

    /* JADX INFO: renamed from: i */
    public long f28523i;

    /* JADX INFO: renamed from: j */
    public hpd0 f28524j;

    /* JADX INFO: renamed from: k */
    public hpd0 f28525k;

    /* JADX INFO: renamed from: l */
    public boolean f28526l;

    /* JADX WARN: Type inference failed for: r6v2, types: [android.app.Activity, com.p1.mobile.putong.app.PutongAct] */
    public yzf(FakeLikersFrag fakeLikersFrag) {
        super(fakeLikersFrag);
        this.f28520f = null;
        this.f28521g = 0;
        this.f28522h = 0;
        this.f28523i = 0L;
        String str = "show_see_guide_dlg" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f28524j = new hpd0(str, bool);
        this.f28525k = new hpd0("show_see_guide_anim" + CoreModule.m1850H().userId(), bool);
        this.f28526l = false;
        ?? r6 = (PutongAct) fakeLikersFrag.act();
        this.f28519e = r6;
        this.f28515a = r6.getIntent().getStringExtra("from");
        this.f28516b = this.f28519e.getIntent().getSerializableExtra("style");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ Boolean m28480C0(c cVar) {
        return Boolean.valueOf(cVar == c.i && this.f28517c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m28481D0(c cVar) {
        m28508R0();
    }

    /* JADX INFO: renamed from: F0 */
    private void m28482F0() {
        CoreModule.f1534c.f3676u0.m2384m5();
        CoreModule.f1534c.f3676u0.m2367f7(50, this.f28523i, "");
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m28486h0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m28488j0(d30 d30Var, Boolean bool) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m28491m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m28492n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m28495y0(Bundle bundle) {
        boolean z = false;
        if (!NullChecker.a(bundle) || !bundle.getBoolean("price_recall_shown", false)) {
            tae0.m24547h().m24561u(false);
        }
        m28482F0();
        if (tae0.m24543d() && !m28506P0()) {
            z = true;
        }
        this.f28518d = z;
        if (TextUtils.equals(this.f28515a, "p_special_card,deeplink,click") || TextUtils.equals(this.f28515a, "p_special_card,deeplink_intl,click")) {
            this.f28518d = act().getIntent().getBooleanExtra("preferred_show_purchase", true);
        }
        if (this.f28518d) {
            e51.H(act(), new Runnable() { // from class: l.mzf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17406a.m28513s0();
                }
            }, 400L);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m28496A0(Counter counter) {
        if (CoreModule.m1854P().m11706a().m5426e2()) {
            return;
        }
        if (lifecycle_() == c.j) {
            this.f28517c = true;
        } else {
            m28508R0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m28498E0(int i, Intent intent, c cVar) {
        PicksHeaderView picksHeaderViewM18465J = ((l0g) ((jq2) this).viewModel).m18465J();
        if (picksHeaderViewM18465J != null) {
            PicksItemView clickedItem = picksHeaderViewM18465J.presenter.getClickedItem();
            PicksUser picksUser = picksHeaderViewM18465J.presenter.clickedUser;
            if (NullChecker.a(clickedItem) && NullChecker.a(picksUser)) {
                User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(picksUser.id);
                int intExtra = 0;
                boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
                SwipeDirection swipeDirection = SwipeDirection.UP;
                boolean z2 = i == swipeDirection.getValue();
                String stringExtra = ((Media) userM21393Pa.pictures.get(0)).url;
                String stringExtra2 = null;
                if (NullChecker.a(intent)) {
                    intExtra = intent.getIntExtra("currentImageIndex", 0);
                    stringExtra = intent.getStringExtra("currentImageUrl");
                    if (i == swipeDirection.getValue()) {
                        stringExtra2 = intent.getStringExtra(CoreMemberModule.F().b().pc());
                    }
                }
                String str = stringExtra2;
                picksHeaderViewM18465J.presenter.m19243n0(z, z2, true, intExtra, stringExtra, userM21393Pa, str);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m28499G0(int i, final int i2, final Intent intent) {
        if (i != CoreMemberModule.F().b().bj()) {
            if (i != 786) {
                return false;
            }
            CoreMemberModule.F().b().Yq(i2, intent, act());
            return true;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.wzf
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.xzf
            public final void call(Object obj) {
                this.f27825a.m28498E0(i2, intent, (c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: H0 */
    public void m28500H0(User user) {
        m28507Q0(user);
    }

    /* JADX INFO: renamed from: I0 */
    public void m28501I0(d30 d30Var) {
        m28504N0(m28515u0(), d30Var);
    }

    /* JADX INFO: renamed from: J0 */
    public void m28502J0() {
        m28503L0(m28515u0());
    }

    /* JADX INFO: renamed from: L0 */
    public void m28503L0(String str) {
        m28504N0(str, null);
    }

    /* JADX INFO: renamed from: N0 */
    public void m28504N0(String str, final d30 d30Var) {
        if (CoreModule.f1534c.f3661p0.m21961e3()) {
            CoreModule.m1854P().m11706a().m5299Lf(act(), str, Privilege.see_who_likes_me, null, new e30() { // from class: l.nzf
                public final void call(Object obj) {
                    yzf.m28488j0(d30Var, (Boolean) obj);
                }
            });
        } else {
            CoreModule.m1854P().m11706a().showSeeDialog(act(), d30Var, str);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m28505O0() {
        if (((Boolean) this.f28525k.get()).booleanValue()) {
            return;
        }
        this.f28525k.put(Boolean.TRUE);
        ((l0g) ((jq2) this).viewModel).m18479b0();
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m28506P0() {
        return "p_navigation_view,e_see_banner,intl_click".equals(this.f28515a) || "p_special_card,deeplink_intl,click".equals(this.f28515a);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m28507Q0(User user) {
        FakeMatchAct.m8353b2(((DbObject) user).id, act());
    }

    /* JADX INFO: renamed from: R0 */
    public void m28508R0() {
        act().startActivity(LikersAct.m9986X1(act(), this.f28515a));
        act().finish();
    }

    /* JADX INFO: renamed from: Z */
    public void m28509Z() {
        super.Z();
        this.f28523i = ((Long) CoreModule.f1534c.f3676u0.f3244l0.get()).longValue();
        CoreModule.f1534c.f3676u0.f3244l0.put(Long.valueOf(mqi0.o()));
        CoreModule.f1534c.f3676u0.f3243k0.put(Long.valueOf(qib0.f19784H.guessedCurrentServerTime()));
    }

    /* JADX INFO: renamed from: a0 */
    public void m28510a0() {
        super.a0();
        tae0.m24547h().f21977a = true;
        creates(new e30() { // from class: l.lzf
            public final void call(Object obj) {
                this.f16726a.m28495y0((Bundle) obj);
            }
        }, new d30() { // from class: l.pzf
            public final void call() {
                yzf.m28492n0();
            }
        });
        duringCreated(CoreModule.f1534c.f3676u0.m2339R6()).subscribe(mkd0.H(new e30() { // from class: l.qzf
            public final void call(Object obj) {
                this.f20189a.m28517z0((j760) obj);
            }
        }, new e30() { // from class: l.rzf
            public final void call(Object obj) {
                yzf.m28491m0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.m3413n3().distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.szf
            public final void call(Object obj) {
                this.f21778a.m28496A0((Counter) obj);
            }
        }, new e30() { // from class: l.tzf
            public final void call(Object obj) {
                yzf.m28486h0((Throwable) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.uzf
            public final Object call(Object obj) {
                return this.f23827a.m28480C0((c) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.vzf
            public final void call(Object obj) {
                this.f24560a.m28481D0((c) obj);
            }
        }));
    }

    public void destroy() {
        tae0.m24547h().f21977a = false;
    }

    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void m28497C(l0g l0gVar) {
        super.C(l0gVar);
    }

    /* JADX INFO: renamed from: r0 */
    public final String m28512r0() {
        return ((CoreModule.m1854P().m11706a().m5456ht() && TextUtils.equals(this.f28515a, "p_meet_view,e_see_banner,click")) || TextUtils.equals(this.f28515a, "p_meet_view,e_see_banner,click") || TextUtils.equals(this.f28515a, "p_navigation_see,default") || TextUtils.equals(this.f28515a, "p_messages_view,e_see_banner,click") || TextUtils.equals(this.f28515a, "p_popup_see,default")) ? this.f28515a : w2b0.c("p_navigation_see,default", 1);
    }

    /* JADX INFO: renamed from: s0 */
    public void m28513s0() {
        if ((CoreModule.m1854P().m11706a().m5466k() && mqi0.x(12, 13)) || !NullChecker.a(act()) || act().isFinishing() || act().isDestroyed()) {
            return;
        }
        CoreModule.m1854P().m11706a().showSeeDialog(act(), new d30() { // from class: l.ozf
            public final void call() {
                this.f18509a.m28505O0();
            }
        }, m28512r0());
    }

    /* JADX INFO: renamed from: t0 */
    public final String m28514t0(int i) {
        if (i == 0) {
            return "?";
        }
        return i >= 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: u0 */
    public final String m28515u0() {
        if ((CoreModule.m1854P().m11706a().m5456ht() && TextUtils.equals(this.f28515a, "p_meet_view,e_see_banner,click")) || TextUtils.equals(this.f28515a, "p_meet_view,e_see_banner,click") || TextUtils.equals(this.f28515a, "p_navigation_see,default") || TextUtils.equals(this.f28515a, "p_messages_view,e_see_banner,click")) {
            return this.f28515a;
        }
        return TextUtils.equals(this.f28515a, "p_popup_see,default") ? "p_popup_see,card_button_pull" : w2b0.c("p_navigation_see,card_button_pull", 1);
    }

    /* JADX INFO: renamed from: x0 */
    public String m28516x0() {
        int i = this.f28521g;
        if (i < 10000) {
            return String.valueOf(i);
        }
        return new DecimalFormat("#.#").format(this.f28521g / 10000.0f) + "w";
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m28517z0(j760 j760Var) {
        String string;
        CoreModule.f1534c.f3676u0.f3252t0 = true;
        int iIntValue = ((Integer) j760Var.a).intValue();
        boolean zJ = vwb.J((Collection) j760Var.b);
        this.f28521g = iIntValue;
        if (!zJ) {
            ((l0g) ((jq2) this).viewModel).m18476Y((List) j760Var.b);
            if (!this.f28518d && this.f28521g > 0) {
                m28505O0();
            }
        } else if ((CoreModule.m1854P().m11706a().m5466k() && PicksHelper.INSTANCE.m10199b().m10194m()) || m28506P0()) {
            ((l0g) ((jq2) this).viewModel).m18476Y((List) j760Var.b);
        }
        if (iIntValue <= 0) {
            act().setTitle(m28506P0() ? R.string.l0 : R.string.Y0);
            return;
        }
        Act act = act();
        if (m28506P0()) {
            string = act().getResources().getString(R.string.l0) + "(" + iIntValue + ")";
        } else {
            string = act().getResources().getString(R.string.X0, m28514t0(iIntValue));
        }
        act.setTitle(string);
    }
}
