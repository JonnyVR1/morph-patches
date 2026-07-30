package p006l;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p000p1.mobile.putong.core.p004ui.seepage.match.FakeMatchAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.e51;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w2b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class n1g extends jq2<t1g> {

    /* JADX INFO: renamed from: a */
    public User f17440a;

    /* JADX INFO: renamed from: b */
    public boolean f17441b;

    /* JADX INFO: renamed from: c */
    public boolean f17442c;

    /* JADX INFO: renamed from: d */
    public String f17443d;

    public n1g(mcr mcrVar) {
        super(mcrVar);
        this.f17441b = false;
        this.f17442c = false;
        this.f17443d = "";
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m19629j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m19630m0() {
        m19640t0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m19631n0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra("user");
        this.f17443d = act().getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(stringExtra);
        this.f17440a = userM21393Pa;
        if (!NullChecker.a(userM21393Pa)) {
            act().finish();
            return;
        }
        ((t1g) ((jq2) this).viewModel).m24430q(this.f17440a, CoreModule.f1534c.f3628e0.m21490p9());
        if (tae0.m24542c()) {
            this.f17442c = true;
            e51.H(act(), new Runnable() { // from class: l.j1g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14957a.m19630m0();
                }
            }, 1500L);
        }
        m19641u0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m19632a0() {
        super.a0();
        creates(new e30() { // from class: l.h1g
            public final void call(Object obj) {
                this.f13630a.m19631n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final Act m19633k0() {
        if (!NullChecker.a(Act.foreground_()) || !(Act.foreground_().a.get() instanceof Act)) {
            return act();
        }
        Act act = (Act) Act.foreground_().a.get();
        if (!(act instanceof FakeMatchAct)) {
            return act;
        }
        act();
        ArrayList arrayList = (ArrayList) Act.globalLifeCycle_().get(Integer.valueOf(act().getTaskId()));
        if (arrayList == null) {
            return act();
        }
        Activity activity = arrayList.size() > 1 ? (Activity) ((Act.r) arrayList.get(arrayList.size() - 2)).a.get() : null;
        return (!(activity instanceof Act) || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) ? act() : (Act) activity;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m19634l0() {
        return this.f17441b;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m19635o0() {
        this.f17442c = false;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m19636p0(Integer num) {
        Act actM19633k0 = m19633k0();
        actM19633k0.startActivityWithCustomTransition(CoreModule.m1854P().m11706a().m5300Lm(actM19633k0, vwb.f0(new String[]{((DbObject) this.f17440a).id}), num.intValue(), vwb.f0(new String[]{((DbObject) this.f17440a).id})), CoreModule.m1854P().m11706a().m5449hg(actM19633k0));
        act().finish();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m19637q0(Counter counter) {
        if (CoreModule.m1854P().m11706a().m5426e2()) {
            return;
        }
        this.f17441b = true;
        tae0.m24558t(act(), this.f17440a, new e30() { // from class: l.m1g
            public final void call(Object obj) {
                this.f16749a.m19636p0((Integer) obj);
            }
        });
    }

    @MainThread
    /* JADX INFO: renamed from: r0 */
    public void m19638r0(String str) {
        lsi0.y(str);
    }

    /* JADX INFO: renamed from: s0 */
    public void m19639s0() {
        m19638r0(String.format(act().getResources().getString(R.string.F0), new Object[0]));
    }

    /* JADX INFO: renamed from: t0 */
    public void m19640t0(boolean z) {
        String strC;
        CoreModule.m1854P().m11706a().m5557wk(this.f17440a);
        if (z || !this.f17442c) {
            this.f17442c = true;
            CoreBusinessService coreBusinessServiceM11706a = CoreModule.m1854P().m11706a();
            Act act = act();
            d30 d30Var = new d30() { // from class: l.i1g
                public final void call() {
                    this.f14193a.m19635o0();
                }
            };
            if (TextUtils.isEmpty(this.f17443d)) {
                strC = w2b0.c("p_navigation_see,card_button_pull", z ? 2 : 3);
            } else {
                strC = this.f17443d;
            }
            coreBusinessServiceM11706a.showSeeDialog(act, d30Var, strC);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m19641u0() {
        duringCreated(CoreModule.f1534c.m3413n3().distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.k1g
            public final void call(Object obj) {
                this.f15546a.m19637q0((Counter) obj);
            }
        }, new e30() { // from class: l.l1g
            public final void call(Object obj) {
                n1g.m19629j0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
