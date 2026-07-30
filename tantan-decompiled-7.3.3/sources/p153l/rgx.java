package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class rgx extends k8x<ugx> {

    /* JADX INFO: renamed from: d */
    public final C22507a<uxj0> f163061d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f163062e;

    public rgx(ner nerVar) {
        super(nerVar);
        this.f163061d = C22507a.m222759c(uxj0.f181467a);
        this.f163062e = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m181510F0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            V v2 = this.viewModel;
            ((ugx) v2).f178942b.m123509g(((ugx) v2).getAct());
            ((ugx) this.viewModel).m195959j();
        } else if (c4470c == C4470c.f16268j) {
            ((ugx) this.viewModel).f178942b.m123509g(null);
        } else if (c4470c == C4470c.f16271m) {
            ((ugx) this.viewModel).f178942b.m123504b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m181511G0(uxj0 uxj0Var) {
        this.f124422c = CoreModule.m30930K().getUserById(this.f124421b);
        ((ugx) this.viewModel).m195960r();
    }

    /* JADX INFO: renamed from: E0 */
    public Boolean m181512E0() {
        if (this.f163062e.size() <= 1) {
            return Boolean.TRUE;
        }
        this.f124421b = this.f163062e.get(1);
        this.f163062e.remove(0);
        this.f163061d.m137019l(uxj0.f181467a);
        return Boolean.FALSE;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.pgx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152351a.m181510F0((C4470c) obj);
            }
        }));
        duringCreated(this.f163061d).subscribe(psd0.m173596G(new y20() { // from class: l.qgx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157490a.m181511G0((uxj0) obj);
            }
        }));
    }

    @Override // p153l.k8x
    /* JADX INFO: renamed from: q0 */
    public void mo96040q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo96040q0(str, i, arrayList, arrayList2);
        if (jyb.m147479J(arrayList)) {
            return;
        }
        this.f163062e = arrayList;
    }
}
