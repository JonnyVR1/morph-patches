package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupSettingManagerAct;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class rnk extends ar2<tnk> {

    /* JADX INFO: renamed from: a */
    public final Act f164052a;

    /* JADX INFO: renamed from: b */
    public String f164053b;

    public rnk(Act act) {
        super(act);
        this.f164052a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m182239g0(Bundle bundle) {
        ((tnk) this.viewModel).m191923r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m182240h0(pf60 pf60Var) {
        ((tnk) this.viewModel).m191922m((ChatGroup) pf60Var.f152156a, (List) pf60Var.f152157b);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f164053b = this.f164052a.getIntent().getStringExtra(GroupSettingManagerAct.f32650f);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.onk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148095a.m182239g0((Bundle) obj);
            }
        });
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20387g0.m32911o6(this.f164053b), CoreModule.f18264c.f20387g0.m32856W6(this.f164053b), new rcj() { // from class: l.pnk
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((ChatGroup) obj, (List) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.qnk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158495a.m182240h0((pf60) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
