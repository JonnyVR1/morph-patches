package p149l;

import com.p046p1.mobile.putong.live.livingroom.increment.operation.BoostStartView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class s93 extends h4t<ho2, BoostStartView> {

    /* JADX INFO: renamed from: i */
    public c4g0 f163135i;

    public s93(bsm bsmVar, BoostStartView boostStartView) {
        super(bsmVar);
        mo51532C(boostStartView);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: K3 */
    public void m182692K3(final long j, final d30 d30Var) {
        mkd0.m154992z(this.f163135i);
        this.f163135i = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS).take((int) j)).subscribe(ffw.m121197h(new e30() { // from class: l.r93
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158272a.m182693L3(j, d30Var, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m182693L3(long j, d30 d30Var, Long l2) {
        if (l2.longValue() < j) {
            ((BoostStartView) this.viewModel).f50800k.setText(String.valueOf(60 - l2.longValue()));
        } else {
            d30Var.call();
        }
    }
}
