package p149l;

import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.FeedFlower;
import com.p046p1.mobile.putong.feed.FeedModule;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class klh extends flh implements zkg {

    /* JADX INFO: renamed from: m */
    public slh f123668m;

    public klh(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m146397e2() {
        super.m122050V1();
    }

    @Override // p149l.flh, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        this.f123668m = (slh) this.viewModel;
        duringCreated(FeedModule.f38855d.f193024W0).subscribe(mkd0.m154955G(new e30() { // from class: l.glh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103320a.m146399c2((xaj0) obj);
            }
        }));
        if (nkg.m159900q() && nkg.m159849F(vqg.m199540d0())) {
            duringCreated((C22306c) FeedModule.m60222H().counter().map(new w9j() { // from class: l.hlh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Counter) obj).flower;
                }
            })).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ilh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f113839a.m146400d2((FeedFlower) obj);
                }
            }));
        }
        e51.m114743H(m146398b2().getAct(), new Runnable() { // from class: l.jlh
            @Override // java.lang.Runnable
            public final void run() {
                this.f118544a.m146397e2();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: b2 */
    public slh m146398b2() {
        return this.f123668m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m146399c2(xaj0 xaj0Var) {
        boolean zBooleanValue = ((Boolean) xaj0Var.f191753c).booleanValue();
        slh slhVar = this.f123668m;
        if (zBooleanValue) {
            slhVar.mo107468y((List) xaj0Var.f191751a, ((Integer) xaj0Var.f191752b).intValue());
        } else {
            slhVar.mo107467n();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m146400d2(FeedFlower feedFlower) {
        this.f123668m.m184822a0(feedFlower);
    }
}
