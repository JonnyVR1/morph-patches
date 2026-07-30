package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.TagGuidePicAct;

/* JADX INFO: loaded from: classes4.dex */
public class d2i0 extends ar2<l2i0> {

    /* JADX INFO: renamed from: a */
    public TagGuidePicAct f84793a;

    public d2i0(ner nerVar) {
        super(nerVar);
        this.f84793a = (TagGuidePicAct) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m113700g0(Bundle bundle) {
        ((l2i0) this.viewModel).m152616r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m113701h0(uxj0 uxj0Var) {
        ((l2i0) this.viewModel).m152609A();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        if (a2i0.m95674b().m95676c() == null) {
            a2i0.m95674b().m95678e(CoreModule.f18264c.f20381e0.m116593na());
        }
        creates(new y20() { // from class: l.b2i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74620a.m113700g0((Bundle) obj);
            }
        });
        if ((gra.m131771x2() || gra.m131776y2()) && this.f84793a.m51960e2()) {
            duringCreated(CoreModule.f18264c.f20381e0.f89034G1).subscribe(psd0.m173596G(new y20() { // from class: l.c2i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79485a.m113701h0((uxj0) obj);
                }
            }));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
