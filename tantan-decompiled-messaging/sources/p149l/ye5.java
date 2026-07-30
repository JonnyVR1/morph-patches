package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ye5 extends jq2<sf5> {

    /* JADX INFO: renamed from: a */
    public boolean f197660a;

    public ye5(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m214338h0(Bundle bundle) {
        ((sf5) this.viewModel).m183840E0();
        ((sf5) this.viewModel).m183854i0(bundle);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.ve5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181156a.m214338h0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.we5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185905a.m214339i0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m214339i0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            ((sf5) this.viewModel).m183843I0();
        } else if (c4319c == C4319c.f15549j) {
            ((sf5) this.viewModel).m183842H0();
        } else if (c4319c == C4319c.f15552m) {
            ((sf5) this.viewModel).m183841G0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m214340j0(List list) {
        pb4.m168142O().m168195j0(list);
        if (NullChecker.m81304b(this.viewModel)) {
            ((sf5) this.viewModel).m183853h0(list);
            this.f197660a = true;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m214341k0() {
        if (this.f197660a) {
            return;
        }
        FeedModule.f38853b.m60498P2();
        duringCreated(FeedModule.f38853b.m60508V1()).subscribe(mkd0.m154955G(new e30() { // from class: l.xe5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192529a.m214340j0((List) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
