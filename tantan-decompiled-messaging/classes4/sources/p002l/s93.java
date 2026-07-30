package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.operation.BoostStartView;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s93 extends h4t<ho2, BoostStartView> {

    /* JADX INFO: renamed from: i */
    public c4g0 f18849i;

    public s93(bsm bsmVar, BoostStartView boostStartView) {
        super(bsmVar);
        C(boostStartView);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: K3 */
    public void m22256K3(final long j, final d30 d30Var) {
        mkd0.z(this.f18849i);
        this.f18849i = m14186H3(m25547E2().m14575i2(TimeUnit.SECONDS).take((int) j)).subscribe(ffw.h(new e30() { // from class: l.r93
            public final void call(Object obj) {
                this.f18416a.m22257L3(j, d30Var, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m22257L3(long j, d30 d30Var, Long l2) {
        if (l2.longValue() < j) {
            ((BoostStartView) ((bwr) this).viewModel).f6842k.setText(String.valueOf(60 - l2.longValue()));
        } else {
            d30Var.call();
        }
    }
}
