package p153l;

import com.p051p1.mobile.putong.live.livingroom.increment.operation.BoostStartView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ha3 extends i6t<oo2, BoostStartView> {

    /* JADX INFO: renamed from: i */
    public kcg0 f108464i;

    public ha3(dum dumVar, BoostStartView boostStartView) {
        super(dumVar);
        mo52715C(boostStartView);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: K3 */
    public void m134125K3(final long j, final x20 x20Var) {
        psd0.m173633z(this.f108464i);
        this.f108464i = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS).take((int) j)).subscribe(dhw.m115829h(new y20() { // from class: l.ga3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102951a.m134126L3(j, x20Var, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m134126L3(long j, x20 x20Var, Long l2) {
        if (l2.longValue() < j) {
            ((BoostStartView) this.viewModel).f51648k.setText(String.valueOf(60 - l2.longValue()));
        } else {
            x20Var.call();
        }
    }
}
