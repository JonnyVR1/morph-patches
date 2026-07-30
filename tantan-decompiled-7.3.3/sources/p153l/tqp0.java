package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.web.p056ab.WebABAct;
import com.p051p1.mobile.putong.data.AuthData;

/* JADX INFO: loaded from: classes9.dex */
public class tqp0 extends lup0<vqp0> {
    public tqp0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m192342h0(Bundle bundle) {
        ((vqp0) this.viewModel).m202451U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m192346p0(AuthData authData) {
        ((vqp0) this.viewModel).m202453X(authData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m192347q0(Throwable th) {
        ((vqp0) this.viewModel).m202452W();
    }

    @Override // p153l.lup0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.qqp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159024a.m192342h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m192348n0() {
        duringCreated(uqb0.f180397c0.accessOutterToken()).subscribe(psd0.m173597H(new y20() { // from class: l.rqp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164508a.m192346p0((AuthData) obj);
            }
        }, new y20() { // from class: l.sqp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170196a.m192347q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public String m192349o0() {
        Act act = act();
        return act != null ? ((WebABAct) act).m30700g2() : "";
    }
}
