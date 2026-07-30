package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.data.AuthData;

/* JADX INFO: loaded from: classes13.dex */
public class xbi extends ar2<bci> {
    public xbi(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m209955k0(Bundle bundle) {
        ((bci) this.viewModel).m103540x();
        ((bci) this.viewModel).m103525J();
        ((bci) this.viewModel).m103542z(null);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ubi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178310a.m209955k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m209956h0() {
        duringCreated(uqb0.f180397c0.accessOutterToken()).subscribe(psd0.m173597H(new y20() { // from class: l.vbi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183253a.m209957i0((AuthData) obj);
            }
        }, new y20() { // from class: l.wbi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188249a.m209958j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m209957i0(AuthData authData) {
        ((bci) this.viewModel).m103524I(authData);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m209958j0(Throwable th) {
        ((bci) this.viewModel).m103523H(th);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
