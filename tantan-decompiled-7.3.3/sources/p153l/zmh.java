package p153l;

import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.FeedFlower;
import com.p051p1.mobile.putong.feed.FeedModule;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class zmh extends umh implements omg {

    /* JADX INFO: renamed from: m */
    public hnh f205065m;

    public zmh(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m220388e2() {
        super.m196738V1();
    }

    @Override // p153l.umh, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        this.f205065m = (hnh) this.viewModel;
        duringCreated(FeedModule.f39703d.f121334W0).subscribe(psd0.m173596G(new y20() { // from class: l.vmh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184715a.m220390c2((bkj0) obj);
            }
        }));
        if (cmg.m111229q() && cmg.m111178F(ksg.m151199d0())) {
            duringCreated((C22421c) FeedModule.m61406H().counter().map(new qcj() { // from class: l.wmh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Counter) obj).flower;
                }
            })).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.xmh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f195083a.m220391d2((FeedFlower) obj);
                }
            }));
        }
        l51.m152888H(m220389b2().getAct(), new Runnable() { // from class: l.ymh
            @Override // java.lang.Runnable
            public final void run() {
                this.f200666a.m220388e2();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: b2 */
    public hnh m220389b2() {
        return this.f205065m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m220390c2(bkj0 bkj0Var) {
        boolean zBooleanValue = ((Boolean) bkj0Var.f77083c).booleanValue();
        hnh hnhVar = this.f205065m;
        if (zBooleanValue) {
            hnhVar.mo121174y((List) bkj0Var.f77081a, ((Integer) bkj0Var.f77082b).intValue());
        } else {
            hnhVar.mo121166n();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m220391d2(FeedFlower feedFlower) {
        this.f205065m.m136113a0(feedFlower);
    }
}
