package p153l;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.seepage.match.FakeMatchAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class b3g extends ar2<h3g> {

    /* JADX INFO: renamed from: a */
    public User f74766a;

    /* JADX INFO: renamed from: b */
    public boolean f74767b;

    /* JADX INFO: renamed from: c */
    public boolean f74768c;

    /* JADX INFO: renamed from: d */
    public String f74769d;

    public b3g(ner nerVar) {
        super(nerVar);
        this.f74767b = false;
        this.f74768c = false;
        this.f74769d = "";
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m102321j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m102322m0() {
        m102331t0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m102323n0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra("user");
        this.f74769d = act().getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(stringExtra);
        this.f74766a = userM116503Pa;
        if (!NullChecker.m82486a(userM116503Pa)) {
            act().m68056e2();
            return;
        }
        ((h3g) this.viewModel).m133481q(this.f74766a, CoreModule.f18264c.f20381e0.m116600p9());
        if (yie0.m216071c()) {
            this.f74768c = true;
            l51.m152888H(act(), new Runnable() { // from class: l.x2g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f192147a.m102322m0();
                }
            }, 1500L);
        }
        m102332u0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.v2g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182090a.m102323n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final Act m102324k0() {
        if (!NullChecker.m82486a(Act.foreground_()) || !(Act.foreground_().f16062a.get() instanceof Act)) {
            return act();
        }
        Act act = (Act) Act.foreground_().f16062a.get();
        if (!(act instanceof FakeMatchAct)) {
            return act;
        }
        act();
        ArrayList<Act.C4450r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(act().getTaskId()));
        if (arrayList == null) {
            return act();
        }
        Activity activity = arrayList.size() > 1 ? arrayList.get(arrayList.size() - 2).f16062a.get() : null;
        return (!(activity instanceof Act) || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) ? act() : (Act) activity;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m102325l0() {
        return this.f74767b;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m102326o0() {
        this.f74768c = false;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m102327p0(Integer num) {
        Act actM102324k0 = m102324k0();
        actM102324k0.startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34366Lm(actM102324k0, jyb.m147507f0(this.f74766a.f56859id), num.intValue(), jyb.m147507f0(this.f74766a.f56859id)), CoreModule.m30933P().m143405a().mo34515hg(actM102324k0));
        act().m68056e2();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m102328q0(Counter counter) {
        if (CoreModule.m30933P().m143405a().mo34492e2()) {
            return;
        }
        this.f74767b = true;
        yie0.m216087t(act(), this.f74766a, new y20() { // from class: l.a3g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68289a.m102327p0((Integer) obj);
            }
        });
    }

    @MainThread
    /* JADX INFO: renamed from: r0 */
    public void m102329r0(String str) {
        o1j0.m165651y(str);
    }

    /* JADX INFO: renamed from: s0 */
    public void m102330s0() {
        m102329r0(String.format(act().getResources().getString(R$string.f21321F0), new Object[0]));
    }

    /* JADX INFO: renamed from: t0 */
    public void m102331t0(boolean z) {
        String strM96736c;
        CoreModule.m30933P().m143405a().mo34623wk(this.f74766a);
        if (z || !this.f74768c) {
            this.f74768c = true;
            CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
            Act act = act();
            x20 x20Var = new x20() { // from class: l.w2g
                @Override // p153l.x20
                public final void call() {
                    this.f186897a.m102326o0();
                }
            };
            if (TextUtils.isEmpty(this.f74769d)) {
                strM96736c = abb0.m96736c("p_navigation_see,card_button_pull", z ? 2 : 3);
            } else {
                strM96736c = this.f74769d;
            }
            coreBusinessServiceM143405a.showSeeDialog(act, x20Var, strM96736c);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m102332u0() {
        duringCreated(CoreModule.f18264c.m32486n3().distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.y2g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197213a.m102328q0((Counter) obj);
            }
        }, new y20() { // from class: l.z2g
            @Override // p153l.y20
            public final void call(Object obj) {
                b3g.m102321j0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
