package p002l;

import android.os.Bundle;
import android.util.Pair;
import com.p1.mobile.putong.core.CoreModule;
import java.util.List;
import l.c6a;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cr50 extends jq2<dr50> {
    public cr50(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m11338g0(Bundle bundle) {
        ((dr50) ((jq2) this).viewModel).m12006r();
    }

    /* JADX INFO: renamed from: a0 */
    public void m11339a0() {
        super.a0();
        creates(new e30() { // from class: l.zq50
            public final void call(Object obj) {
                this.f23563a.m11338g0((Bundle) obj);
            }
        });
        c6a c6aVar = CoreModule.c.h1;
        duringCreated(mkd0.r(c6aVar.U, c6aVar.W, new x9j() { // from class: l.ar50
            public final Object call(Object obj, Object obj2) {
                return Pair.create((List) obj, (List) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.br50
            public final void call(Object obj) {
                this.f8313a.m11340h0((Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m11340h0(Pair pair) {
        ((dr50) ((jq2) this).viewModel).m12004c((List) pair.first, (List) pair.second);
    }

    public void destroy() {
    }
}
