package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.TagGuidePicAct;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.sth0;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vth0 extends jq2<duh0> {

    /* JADX INFO: renamed from: a */
    public TagGuidePicAct f21296a;

    public vth0(mcr mcrVar) {
        super(mcrVar);
        this.f21296a = (TagGuidePicAct) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m24129g0(Bundle bundle) {
        ((duh0) ((jq2) this).viewModel).m12043r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m24130h0(roj0 roj0Var) {
        ((duh0) ((jq2) this).viewModel).m12034A();
    }

    /* JADX INFO: renamed from: a0 */
    public void m24131a0() {
        if (sth0.b().c() == null) {
            sth0.b().e(CoreModule.c.e0.na());
        }
        creates(new e30() { // from class: l.tth0
            public final void call(Object obj) {
                this.f20373a.m24129g0((Bundle) obj);
            }
        });
        if ((upa.x2() || upa.y2()) && this.f21296a.m1223d2()) {
            duringCreated(CoreModule.c.e0.G1).subscribe(mkd0.G(new e30() { // from class: l.uth0
                public final void call(Object obj) {
                    this.f20791a.m24130h0((roj0) obj);
                }
            }));
        }
    }

    public void destroy() {
    }
}
