package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.AuthData;

/* JADX INFO: loaded from: classes12.dex */
public class h2c extends lup0<i2c> {
    public h2c(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m133374h0(Bundle bundle) {
        ((i2c) this.viewModel).m138177R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m133378o0(AuthData authData) {
        ((i2c) this.viewModel).m138183X(authData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m133379p0(Throwable th) {
        ((i2c) this.viewModel).m138182W();
    }

    @Override // p153l.lup0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.g2c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101823a.m133374h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m133380n0() {
        duringCreated(CoreModule.m30929H().accessOutterToken()).subscribe(psd0.m173597H(new y20() { // from class: l.e2c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91734a.m133378o0((AuthData) obj);
            }
        }, new y20() { // from class: l.f2c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96865a.m133379p0((Throwable) obj);
            }
        }));
    }
}
