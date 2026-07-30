package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.C8846b;

/* JADX INFO: loaded from: classes4.dex */
public class zma0 extends ar2<C8846b> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f205052a;

    /* JADX INFO: renamed from: b */
    public boolean f205053b;

    public zma0(ner nerVar) {
        super(nerVar);
        this.f205053b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m220374n0(Bundle bundle) {
        m220376j0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.vma0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184682a.m220374n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m220375i0() {
        V v2 = this.viewModel;
        ((C8846b) v2).f34410k.duringCreated(CoreModule.f18264c.f20294B0.m32595P3(((C8846b) v2).m52908n().getTimeInMillis())).subscribe(psd0.m173597H(new y20() { // from class: l.wma0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189786a.m220377k0((uxj0) obj);
            }
        }, new y20() { // from class: l.xma0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195060a.m220379m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m220376j0() {
        LoopInputType loopInputType = (LoopInputType) ((C8846b) this.viewModel).m52909p().getSerializable("loop_input_type");
        this.f205052a = loopInputType;
        ((C8846b) this.viewModel).m52913v(loopInputType);
        ((C8846b) this.viewModel).f34410k.m52790f5();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m220377k0(uxj0 uxj0Var) {
        this.f205053b = true;
        ((C8846b) this.viewModel).m52907m();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m220378l0() {
        this.f205053b = true;
        ((C8846b) this.viewModel).m52907m();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m220379m0(Throwable th) {
        ((C8846b) this.viewModel).m52911s();
        if (act().isFinishing()) {
            return;
        }
        gta.m132210e().m132214d().mo34789Xs(act(), th, new x20() { // from class: l.yma0
            @Override // p153l.x20
            public final void call() {
                this.f200649a.m220378l0();
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: o0 */
    public void m220380o0(int i, int i2, Intent intent) {
    }
}
