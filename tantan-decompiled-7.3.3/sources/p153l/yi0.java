package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes13.dex */
public class yi0 extends ar2<zi0> {

    /* JADX INFO: renamed from: a */
    public boolean f200003a;

    /* JADX INFO: renamed from: b */
    public PutongAct f200004b;

    public yi0(PutongAct putongAct) {
        super(putongAct);
        this.f200004b = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m215999g0(Bundle bundle) {
        ((zi0) this.viewModel).m219715r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.xi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194425a.m215999g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m216000f0() {
        this.f200003a = this.f200004b.getIntent().getBooleanExtra("has_my_group", false);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
