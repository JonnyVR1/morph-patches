package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ye5 extends jq2<sf5> {

    /* JADX INFO: renamed from: a */
    public boolean f15407a;

    public ye5(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m17122h0(Bundle bundle) {
        ((sf5) ((jq2) this).viewModel).m14192E0();
        ((sf5) ((jq2) this).viewModel).m14206i0(bundle);
    }

    /* JADX INFO: renamed from: Z */
    public void m17123Z() {
        super.Z();
        creates(new e30() { // from class: l.ve5
            public final void call(Object obj) {
                this.f14153a.m17122h0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.we5
            public final void call(Object obj) {
                this.f14514a.m17124i0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m17124i0(c cVar) {
        if (cVar == c.i) {
            ((sf5) ((jq2) this).viewModel).m14195I0();
        } else if (cVar == c.j) {
            ((sf5) ((jq2) this).viewModel).m14194H0();
        } else if (cVar == c.m) {
            ((sf5) ((jq2) this).viewModel).m14193G0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m17125j0(List list) {
        pb4.m12961O().m13014j0(list);
        if (NullChecker.b(((jq2) this).viewModel)) {
            ((sf5) ((jq2) this).viewModel).m14205h0(list);
            this.f15407a = true;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m17126k0() {
        if (this.f15407a) {
            return;
        }
        FeedModule.f314b.m1424P2();
        duringCreated(FeedModule.f314b.m1434V1()).subscribe(mkd0.G(new e30() { // from class: l.xe5
            public final void call(Object obj) {
                this.f14875a.m17125j0((List) obj);
            }
        }));
    }

    public void destroy() {
    }
}
