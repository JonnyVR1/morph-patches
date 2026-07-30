package p003l;

import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import l.dyq;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.s7m;
import l.vwb;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class sdx extends l5x<vdx> {

    /* JADX INFO: renamed from: d */
    public final C1185a<roj0> f7221d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f7222e;

    public sdx(mcr mcrVar) {
        super(mcrVar);
        this.f7221d = C1185a.m9970c(roj0.a);
        this.f7222e = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m7556F0(c cVar) {
        if (cVar == c.i) {
            s7m s7mVar = ((jq2) this).viewModel;
            ((vdx) s7mVar).f8318b.g(((vdx) s7mVar).act());
            ((vdx) ((jq2) this).viewModel).m8380j();
        } else if (cVar == c.j) {
            ((vdx) ((jq2) this).viewModel).f8318b.g((dyq) null);
        } else if (cVar == c.m) {
            ((vdx) ((jq2) this).viewModel).f8318b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m7557G0(roj0 roj0Var) {
        this.f5221c = CoreModule.K().getUserById(this.f5220b);
        ((vdx) ((jq2) this).viewModel).m8381r();
    }

    /* JADX INFO: renamed from: E0 */
    public Boolean m7558E0() {
        if (this.f7222e.size() <= 1) {
            return Boolean.TRUE;
        }
        this.f5220b = this.f7222e.get(1);
        this.f7222e.remove(0);
        this.f7221d.onNext(roj0.a);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: a0 */
    public void m7559a0() {
        super.a0();
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.qdx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6629a.m7556F0((c) obj);
            }
        }));
        duringCreated(this.f7221d).subscribe((m250) mkd0.G(new e30() { // from class: l.rdx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6892a.m7557G0((roj0) obj);
            }
        }));
    }

    @Override // p003l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo5067q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo5067q0(str, i, arrayList, arrayList2);
        if (vwb.J(arrayList)) {
            return;
        }
        this.f7222e = arrayList;
    }
}
