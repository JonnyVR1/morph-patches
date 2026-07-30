package p149l;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.seepage.match.FakeMatchAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class n1g extends jq2<t1g> {

    /* JADX INFO: renamed from: a */
    public User f136630a;

    /* JADX INFO: renamed from: b */
    public boolean f136631b;

    /* JADX INFO: renamed from: c */
    public boolean f136632c;

    /* JADX INFO: renamed from: d */
    public String f136633d;

    public n1g(mcr mcrVar) {
        super(mcrVar);
        this.f136631b = false;
        this.f136632c = false;
        this.f136633d = "";
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m157352j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m157353m0() {
        m157362t0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m157354n0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra("user");
        this.f136633d = act().getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(stringExtra);
        this.f136630a = userM169430Pa;
        if (!NullChecker.m81303a(userM169430Pa)) {
            act().m66873d2();
            return;
        }
        ((t1g) this.viewModel).m186912q(this.f136630a, CoreModule.f17545c.f19639e0.m169527p9());
        if (tae0.m187700c()) {
            this.f136632c = true;
            e51.m114743H(act(), new Runnable() { // from class: l.j1g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115794a.m157353m0();
                }
            }, 1500L);
        }
        m157363u0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.h1g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105428a.m157354n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final Act m157355k0() {
        if (!NullChecker.m81303a(Act.foreground_()) || !(Act.foreground_().f15343a.get() instanceof Act)) {
            return act();
        }
        Act act = (Act) Act.foreground_().f15343a.get();
        if (!(act instanceof FakeMatchAct)) {
            return act;
        }
        act();
        ArrayList<Act.C4299r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(act().getTaskId()));
        if (arrayList == null) {
            return act();
        }
        Activity activity = arrayList.size() > 1 ? arrayList.get(arrayList.size() - 2).f15343a.get() : null;
        return (!(activity instanceof Act) || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) ? act() : (Act) activity;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m157356l0() {
        return this.f136631b;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m157357o0() {
        this.f136632c = false;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m157358p0(Integer num) {
        Act actM157355k0 = m157355k0();
        actM157355k0.startActivityWithCustomTransition(CoreModule.m29935P().m94651a().mo33363Lm(actM157355k0, vwb.m200324f0(this.f136630a.f56011id), num.intValue(), vwb.m200324f0(this.f136630a.f56011id)), CoreModule.m29935P().m94651a().mo33512hg(actM157355k0));
        act().m66873d2();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m157359q0(Counter counter) {
        if (CoreModule.m29935P().m94651a().mo33489e2()) {
            return;
        }
        this.f136631b = true;
        tae0.m187716t(act(), this.f136630a, new e30() { // from class: l.m1g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130830a.m157358p0((Integer) obj);
            }
        });
    }

    @MainThread
    /* JADX INFO: renamed from: r0 */
    public void m157360r0(String str) {
        lsi0.m151595y(str);
    }

    /* JADX INFO: renamed from: s0 */
    public void m157361s0() {
        m157360r0(String.format(act().getResources().getString(R$string.f20579F0), new Object[0]));
    }

    /* JADX INFO: renamed from: t0 */
    public void m157362t0(boolean z) {
        String strM201089c;
        CoreModule.m29935P().m94651a().mo33620wk(this.f136630a);
        if (z || !this.f136632c) {
            this.f136632c = true;
            CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
            Act act = act();
            d30 d30Var = new d30() { // from class: l.i1g
                @Override // p149l.d30
                public final void call() {
                    this.f110454a.m157357o0();
                }
            };
            if (TextUtils.isEmpty(this.f136633d)) {
                strM201089c = w2b0.m201089c("p_navigation_see,card_button_pull", z ? 2 : 3);
            } else {
                strM201089c = this.f136633d;
            }
            coreBusinessServiceM94651a.showSeeDialog(act, d30Var, strM201089c);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m157363u0() {
        duringCreated(CoreModule.f17545c.m31483n3().distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.k1g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120583a.m157359q0((Counter) obj);
            }
        }, new e30() { // from class: l.l1g
            @Override // p149l.e30
            public final void call(Object obj) {
                n1g.m157352j0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
