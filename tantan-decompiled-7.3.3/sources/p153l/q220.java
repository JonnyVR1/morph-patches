package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public class q220 extends ar2<y220> {

    /* JADX INFO: renamed from: a */
    public User f155267a;

    public q220(ner nerVar) {
        super(nerVar);
        this.f155267a = new User();
        Profile profile = new Profile();
        profile.answers = CoreModule.f18264c.f20381e0.m116600p9().profile.answers;
        this.f155267a.profile = profile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m174981i0(Bundle bundle) {
        ((y220) this.viewModel).m214027r();
        m174985m0(false);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.m220
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134496a.m174981i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m174982j0(uxj0 uxj0Var) {
        act().progressDismiss();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m174983k0() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m174984l0(Throwable th) {
        act().progressDismiss();
        if (bsj0.m106250H(th)) {
            return;
        }
        r1j0.m179415b("上传失败");
        act().dialog().m21499D(R$string.f18586Jl).m21555t0(R$string.f18776Q, new Runnable() { // from class: l.p220
            @Override // java.lang.Runnable
            public final void run() {
                this.f150234a.m174983k0();
            }
        }).m21540k0(R$string.f19138c).m21567z0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m174985m0(boolean z) {
        ((y220) this.viewModel).m214032x(this.f155267a.profile.answers, z);
    }

    /* JADX INFO: renamed from: n0 */
    public void m174986n0() {
        act().progress(R$string.f18632L5);
        duringCreated(CoreModule.f18264c.f20381e0.m116620u9(this.f155267a)).subscribe(psd0.m173597H(new y20() { // from class: l.n220
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139806a.m174982j0((uxj0) obj);
            }
        }, new y20() { // from class: l.o220
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144705a.m174984l0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
