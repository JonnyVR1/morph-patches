package p153l;

import com.p051p1.mobile.putong.data.AuthData;

/* JADX INFO: renamed from: l.xa */
/* JADX INFO: loaded from: classes10.dex */
public class C21270xa extends lup0<C16494db> {
    public C21270xa(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: m0 */
    public void m209826m0() {
        duringCreated(uqb0.f180397c0.accessOutterToken()).subscribe(psd0.m173597H(new y20() { // from class: l.va
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183059a.m209827n0((AuthData) obj);
            }
        }, new y20() { // from class: l.wa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188076a.m209828o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m209827n0(AuthData authData) {
        ((C16494db) this.viewModel).m115153c0(authData);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m209828o0(Throwable th) {
        ((C16494db) this.viewModel).m115152b0(th);
    }
}
