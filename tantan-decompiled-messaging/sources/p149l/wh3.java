package p149l;

import com.p046p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class wh3 extends h4t<ho2, BulletView> {

    /* JADX INFO: renamed from: i */
    public LinkedList<if2> f186357i;

    /* JADX INFO: renamed from: j */
    public d30 f186358j;

    public wh3(bsm bsmVar, BulletView bulletView) {
        super(bsmVar);
        this.f186357i = new LinkedList<>();
        this.f186358j = new d30() { // from class: l.vh3
            @Override // p149l.d30
            public final void call() {
                this.f181467a.m203103T3();
            }
        };
        mo51532C(bulletView);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m203095K3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m203098N3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m203100S3(iqv iqvVar) {
        m203101P3();
    }

    /* JADX INFO: renamed from: P3 */
    public void m203101P3() {
        this.f186357i.clear();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX INFO: renamed from: R3 */
    public final void m203102R3(if2 if2Var) {
        if2Var.m135867f(this);
        xh3.m208742a(if2Var);
        if (if2Var instanceof rgh0) {
            rgh0 rgh0Var = (rgh0) if2Var;
            if (rgh0Var.m179166t() == null || !rgh0Var.m179166t().m184080k()) {
                this.f186357i.add(if2Var);
                xh3.m208749h(if2Var, false, this.f186357i);
            } else {
                this.f186357i.addFirst(if2Var);
                xh3.m208749h(if2Var, true, this.f186357i);
            }
        } else {
            this.f186357i.add(if2Var);
            xh3.m208749h(if2Var, false, this.f186357i);
        }
        m203103T3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m149815l().filter(new w9j() { // from class: l.sh3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((iqv) obj).m137794a() == 4);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.th3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170184a.m203100S3((iqv) obj);
            }
        }, new e30() { // from class: l.uh3
            @Override // p149l.e30
            public final void call(Object obj) {
                wh3.m203098N3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m203103T3() {
        if (((BulletView) this.viewModel).m73370s() || this.f186357i.isEmpty()) {
            return;
        }
        ((BulletView) this.viewModel).m73374x(this.f186357i.poll(), this.f186358j);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f186357i.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189098e()).subscribe(ffw.m121194e(new e30() { // from class: l.qh3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154424a.m203102R3((if2) obj);
            }
        }, new e30() { // from class: l.rh3
            @Override // p149l.e30
            public final void call(Object obj) {
                wh3.m203095K3((Throwable) obj);
            }
        }));
    }
}
