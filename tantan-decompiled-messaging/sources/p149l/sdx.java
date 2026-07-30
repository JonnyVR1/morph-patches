package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class sdx extends l5x<vdx> {

    /* JADX INFO: renamed from: d */
    public final C22392a<roj0> f163912d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f163913e;

    public sdx(mcr mcrVar) {
        super(mcrVar);
        this.f163912d = C22392a.m221513c(roj0.f160388a);
        this.f163913e = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m183577F0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            V v2 = this.viewModel;
            ((vdx) v2).f181135b.m123794g(((vdx) v2).getAct());
            ((vdx) this.viewModel).m198112j();
        } else if (c4319c == C4319c.f15549j) {
            ((vdx) this.viewModel).f181135b.m123794g(null);
        } else if (c4319c == C4319c.f15552m) {
            ((vdx) this.viewModel).f181135b.m123789b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m183578G0(roj0 roj0Var) {
        this.f126212c = CoreModule.m29932K().getUserById(this.f126211b);
        ((vdx) this.viewModel).m198113r();
    }

    /* JADX INFO: renamed from: E0 */
    public Boolean m183579E0() {
        if (this.f163913e.size() <= 1) {
            return Boolean.TRUE;
        }
        this.f126211b = this.f163913e.get(1);
        this.f163913e.remove(0);
        this.f163912d.m132487l(roj0.f160388a);
        return Boolean.FALSE;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.qdx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153977a.m183577F0((C4319c) obj);
            }
        }));
        duringCreated(this.f163912d).subscribe(mkd0.m154955G(new e30() { // from class: l.rdx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159016a.m183578G0((roj0) obj);
            }
        }));
    }

    @Override // p149l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo134431q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo134431q0(str, i, arrayList, arrayList2);
        if (vwb.m200296J(arrayList)) {
            return;
        }
        this.f163913e = arrayList;
    }
}
