package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import java.util.LinkedList;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wh3 extends h4t<ho2, BulletView> {

    /* JADX INFO: renamed from: i */
    public LinkedList<if2> f21766i;

    /* JADX INFO: renamed from: j */
    public d30 f21767j;

    public wh3(bsm bsmVar, BulletView bulletView) {
        super(bsmVar);
        this.f21766i = new LinkedList<>();
        this.f21767j = new d30() { // from class: l.vh3
            public final void call() {
                this.f21124a.m24610T3();
            }
        };
        C(bulletView);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m24601K3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m24604N3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m24606S3(iqv iqvVar) {
        m24607P3();
    }

    /* JADX INFO: renamed from: P3 */
    public void m24607P3() {
        this.f21766i.clear();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX INFO: renamed from: R3 */
    public final void m24608R3(if2 if2Var) {
        if2Var.m15115f(this);
        xh3.m25931a(if2Var);
        if (if2Var instanceof rgh0) {
            rgh0 rgh0Var = (rgh0) if2Var;
            if (rgh0Var.m21922t() == null || !rgh0Var.m21922t().m22463k()) {
                this.f21766i.add(if2Var);
                xh3.m25938h(if2Var, false, this.f21766i);
            } else {
                this.f21766i.addFirst(if2Var);
                xh3.m25938h(if2Var, true, this.f21766i);
            }
        } else {
            this.f21766i.add(if2Var);
            xh3.m25938h(if2Var, false, this.f21766i);
        }
        m24610T3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: T */
    public void m24609T() {
        super.T();
        duringCreated(m25547E2().m17236l().filter(new w9j() { // from class: l.sh3
            public final Object call(Object obj) {
                return Boolean.valueOf(((iqv) obj).m15298a() == 4);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.th3
            public final void call(Object obj) {
                this.f20235a.m24606S3((iqv) obj);
            }
        }, new e30() { // from class: l.uh3
            public final void call(Object obj) {
                wh3.m24604N3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m24610T3() {
        if (((BulletView) ((bwr) this).viewModel).m6908s() || this.f21766i.isEmpty()) {
            return;
        }
        ((BulletView) ((bwr) this).viewModel).m6912x(this.f21766i.poll(), this.f21767j);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f21766i.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m24611t() {
        super.t();
        duringCreated(m25547E2().m14596q1().e()).subscribe(ffw.e(new e30() { // from class: l.qh3
            public final void call(Object obj) {
                this.f17989a.m24608R3((if2) obj);
            }
        }, new e30() { // from class: l.rh3
            public final void call(Object obj) {
                wh3.m24601K3((Throwable) obj);
            }
        }));
    }
}
