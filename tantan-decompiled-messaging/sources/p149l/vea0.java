package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.C8683b;

/* JADX INFO: loaded from: classes4.dex */
public class vea0 extends jq2<C8683b> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f181165a;

    /* JADX INFO: renamed from: b */
    public boolean f181166b;

    public vea0(mcr mcrVar) {
        super(mcrVar);
        this.f181166b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m198161n0(Bundle bundle) {
        m198163j0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.rea0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159041a.m198161n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m198162i0() {
        V v2 = this.viewModel;
        ((C8683b) v2).f33562k.duringCreated(CoreModule.f17545c.f19552B0.m31592P3(((C8683b) v2).m51725n().getTimeInMillis())).subscribe(mkd0.m154956H(new e30() { // from class: l.sea0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163938a.m198164k0((roj0) obj);
            }
        }, new e30() { // from class: l.tea0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169808a.m198166m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m198163j0() {
        LoopInputType loopInputType = (LoopInputType) ((C8683b) this.viewModel).m51726p().getSerializable("loop_input_type");
        this.f181165a = loopInputType;
        ((C8683b) this.viewModel).m51730v(loopInputType);
        ((C8683b) this.viewModel).f33562k.m51607f5();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m198164k0(roj0 roj0Var) {
        this.f181166b = true;
        ((C8683b) this.viewModel).m51724m();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m198165l0() {
        this.f181166b = true;
        ((C8683b) this.viewModel).m51724m();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m198166m0(Throwable th) {
        ((C8683b) this.viewModel).m51728s();
        if (act().isFinishing()) {
            return;
        }
        ura.m195053e().m195057d().mo33786Xs(act(), th, new d30() { // from class: l.uea0
            @Override // p149l.d30
            public final void call() {
                this.f176020a.m198165l0();
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: o0 */
    public void m198167o0(int i, int i2, Intent intent) {
    }
}
