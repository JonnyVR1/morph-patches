package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class ry0 extends ar2<ty0> {
    public ry0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m183582f0(Bundle bundle) {
        ((ty0) this.viewModel).m193557r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.qy0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160087a.m183582f0((Bundle) obj);
            }
        });
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
