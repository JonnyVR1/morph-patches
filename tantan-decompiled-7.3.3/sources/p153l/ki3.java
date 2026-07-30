package p153l;

import com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class ki3 extends i6t<oo2, BulletView> {

    /* JADX INFO: renamed from: i */
    public LinkedList<pf2> f126959i;

    /* JADX INFO: renamed from: j */
    public x20 f126960j;

    public ki3(dum dumVar, BulletView bulletView) {
        super(dumVar);
        this.f126959i = new LinkedList<>();
        this.f126960j = new x20() { // from class: l.ji3
            @Override // p153l.x20
            public final void call() {
                this.f121035a.m149857T3();
            }
        };
        mo52715C(bulletView);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m149849K3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m149852N3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m149854S3(jsv jsvVar) {
        m149855P3();
    }

    /* JADX INFO: renamed from: P3 */
    public void m149855P3() {
        this.f126959i.clear();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX INFO: renamed from: R3 */
    public final void m149856R3(pf2 pf2Var) {
        pf2Var.m172072f(this);
        li3.m154286a(pf2Var);
        if (pf2Var instanceof yoh0) {
            yoh0 yoh0Var = (yoh0) pf2Var;
            if (yoh0Var.m216977t() == null || !yoh0Var.m216977t().m220775k()) {
                this.f126959i.add(pf2Var);
                li3.m154293h(pf2Var, false, this.f126959i);
            } else {
                this.f126959i.addFirst(pf2Var);
                li3.m154293h(pf2Var, true, this.f126959i);
            }
        } else {
            this.f126959i.add(pf2Var);
            li3.m154293h(pf2Var, false, this.f126959i);
        }
        m149857T3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m202192l().filter(new qcj() { // from class: l.gi3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((jsv) obj).m146875a() == 4);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.hi3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109978a.m149854S3((jsv) obj);
            }
        }, new y20() { // from class: l.ii3
            @Override // p153l.y20
            public final void call(Object obj) {
                ki3.m149852N3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m149857T3() {
        if (((BulletView) this.viewModel).m74553s() || this.f126959i.isEmpty()) {
            return;
        }
        ((BulletView) this.viewModel).m74557x(this.f126959i.poll(), this.f126960j);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f126959i.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98280e()).subscribe(dhw.m115826e(new y20() { // from class: l.ei3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94102a.m149856R3((pf2) obj);
            }
        }, new y20() { // from class: l.fi3
            @Override // p153l.y20
            public final void call(Object obj) {
                ki3.m149849K3((Throwable) obj);
            }
        }));
    }
}
