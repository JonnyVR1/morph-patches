package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class yf5 extends ar2<sg5> {

    /* JADX INFO: renamed from: a */
    public boolean f199450a;

    public yf5(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m215520h0(Bundle bundle) {
        ((sg5) this.viewModel).m185737E0();
        ((sg5) this.viewModel).m185751i0(bundle);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.vf5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183880a.m215520h0((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.wf5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188742a.m215521i0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m215521i0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            ((sg5) this.viewModel).m185740I0();
        } else if (c4470c == C4470c.f16268j) {
            ((sg5) this.viewModel).m185739H0();
        } else if (c4470c == C4470c.f16271m) {
            ((sg5) this.viewModel).m185738G0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m215522j0(List list) {
        oc4.m167081O().m167134j0(list);
        if (NullChecker.m82487b(this.viewModel)) {
            ((sg5) this.viewModel).m185750h0(list);
            this.f199450a = true;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m215523k0() {
        if (this.f199450a) {
            return;
        }
        FeedModule.f39701b.m61682P2();
        duringCreated(FeedModule.f39701b.m61692V1()).subscribe(psd0.m173596G(new y20() { // from class: l.xf5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194003a.m215522j0((List) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
