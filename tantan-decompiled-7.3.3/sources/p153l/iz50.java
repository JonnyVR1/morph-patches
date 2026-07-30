package p153l;

import android.os.Bundle;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class iz50 extends ar2<jz50> {
    public iz50(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m142792g0(Bundle bundle) {
        ((jz50) this.viewModel).m147641r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.fz50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101444a.m142792g0((Bundle) obj);
            }
        });
        o7a o7aVar = CoreModule.f18264c.f20391h1;
        duringCreated(psd0.m173625r(o7aVar.f145250U, o7aVar.f145252W, new gz50())).subscribe(psd0.m173596G(new y20() { // from class: l.hz50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112196a.m142793h0((Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m142793h0(Pair pair) {
        ((jz50) this.viewModel).m147640c((List) pair.first, (List) pair.second);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
