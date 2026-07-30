package p149l;

import android.os.Bundle;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cr50 extends jq2<dr50> {
    public cr50(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m108347g0(Bundle bundle) {
        ((dr50) this.viewModel).m113289r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.zq50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204344a.m108347g0((Bundle) obj);
            }
        });
        c6a c6aVar = CoreModule.f17545c.f19649h1;
        duringCreated(mkd0.m154984r(c6aVar.f79451U, c6aVar.f79453W, new ar50())).subscribe(mkd0.m154955G(new e30() { // from class: l.br50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76861a.m108348h0((Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m108348h0(Pair pair) {
        ((dr50) this.viewModel).m113288c((List) pair.first, (List) pair.second);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
