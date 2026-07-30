package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentActivitiesAct;

/* JADX INFO: loaded from: classes13.dex */
public class vg00 extends ar2<fh00> {

    /* JADX INFO: renamed from: a */
    public vg60<MomentActivity> f183992a;

    /* JADX INFO: renamed from: b */
    public boolean f183993b;

    public vg00(MomentActivitiesAct momentActivitiesAct) {
        super(momentActivitiesAct);
        this.f183993b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m201203i0(Bundle bundle) {
        FeedModule.f39702c.m61882S2();
        ((fh00) this.viewModel).m125550r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m201204j0() {
        act().setResult(-1);
        FeedModule.f39702c.m61880R2(((fh00) this.viewModel).m125543e());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.rg00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162894a.m201203i0((Bundle) obj);
            }
        }, new x20() { // from class: l.sg00
            @Override // p153l.x20
            public final void call() {
                this.f167784a.m201204j0();
            }
        });
        duringCreated(FeedModule.f39702c.m61875O2()).subscribe(psd0.m173596G(new y20() { // from class: l.tg00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174033a.m201205k0((vg60) obj);
            }
        }));
        duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.ug00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178850a.m201206l0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m201205k0(vg60 vg60Var) {
        if (this.f183993b) {
            this.f183993b = false;
        } else {
            this.f183992a = vg60Var;
            ((fh00) this.viewModel).m125548l(vg60Var.f184001a.size() > 0, vg60Var);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m201206l0(pf60 pf60Var) {
        this.f183993b = true;
        ((fh00) this.viewModel).m125548l(this.f183992a.f184001a.size() > 0, this.f183992a);
        if (this.f183992a.m201221c()) {
            FeedModule.f39702c.m61882S2();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
