package p007l;

import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.FeedFlower;
import com.p000p1.mobile.putong.feed.FeedModule;
import java.util.List;
import l.e30;
import l.e51;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.w9j;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class klh extends flh implements zkg {

    /* JADX INFO: renamed from: m */
    public slh f9744m;

    public klh(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m11497e2() {
        super.m10193V1();
    }

    @Override // p007l.flh
    /* JADX INFO: renamed from: a0 */
    public void mo8909a0() {
        this.f9744m = (slh) ((jq2) this).viewModel;
        duringCreated(FeedModule.f316d.f14959W0).subscribe(mkd0.G(new e30() { // from class: l.glh
            public final void call(Object obj) {
                this.f8478a.m11499c2((xaj0) obj);
            }
        }));
        if (nkg.m12259q() && nkg.m12208F(vqg.m15510d0())) {
            duringCreated(FeedModule.m1140H().counter().map(new w9j() { // from class: l.hlh
                public final Object call(Object obj) {
                    return ((Counter) obj).flower;
                }
            })).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ilh
                public final void call(Object obj) {
                    this.f9088a.m11500d2((FeedFlower) obj);
                }
            }));
        }
        e51.H(m11498b2().act(), new Runnable() { // from class: l.jlh
            @Override // java.lang.Runnable
            public final void run() {
                this.f9389a.m11497e2();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: b2 */
    public slh m11498b2() {
        return this.f9744m;
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m11499c2(xaj0 xaj0Var) {
        boolean zBooleanValue = ((Boolean) xaj0Var.c).booleanValue();
        slh slhVar = this.f9744m;
        if (zBooleanValue) {
            slhVar.mo9206y((List) xaj0Var.a, ((Integer) xaj0Var.b).intValue());
        } else {
            slhVar.mo9204n();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m11500d2(FeedFlower feedFlower) {
        this.f9744m.m14244a0(feedFlower);
    }
}
