package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;

/* JADX INFO: loaded from: classes9.dex */
public class vcf0 extends ibf0<jdf0> {
    public vcf0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m200805S0(Bundle bundle) {
        ((jdf0) this.viewModel).m144415r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m200806A0(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            ((jdf0) this.viewModel).m144422z();
        }
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ecf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93056a.m200805S0((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.mcf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135809a.m200806A0((C4470c) obj);
            }
        }));
    }
}
