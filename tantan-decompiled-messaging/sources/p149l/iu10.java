package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public class iu10 extends jq2<qu10> {

    /* JADX INFO: renamed from: a */
    public User f114964a;

    public iu10(mcr mcrVar) {
        super(mcrVar);
        this.f114964a = new User();
        Profile profile = new Profile();
        profile.answers = CoreModule.f17545c.f19639e0.m169527p9().profile.answers;
        this.f114964a.profile = profile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m138345i0(Bundle bundle) {
        ((qu10) this.viewModel).m176509r();
        m138349m0(false);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.eu10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93207a.m138345i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m138346j0(roj0 roj0Var) {
        act().progressDismiss();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m138347k0() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m138348l0(Throwable th) {
        act().progressDismiss();
        if (yij0.m214930H(th)) {
            return;
        }
        osi0.m165778b("上传失败");
        act().dialog().m20500D(R$string.f18768nl).m20556t0(R$string.f18046Q, new Runnable() { // from class: l.hu10
            @Override // java.lang.Runnable
            public final void run() {
                this.f109469a.m138347k0();
            }
        }).m20541k0(R$string.f18408c).m20568z0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m138349m0(boolean z) {
        ((qu10) this.viewModel).m176514x(this.f114964a.profile.answers, z);
    }

    /* JADX INFO: renamed from: n0 */
    public void m138350n0() {
        act().progress(R$string.f17842J5);
        duringCreated(CoreModule.f17545c.f19639e0.m169547u9(this.f114964a)).subscribe(mkd0.m154956H(new e30() { // from class: l.fu10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99298a.m138346j0((roj0) obj);
            }
        }, new e30() { // from class: l.gu10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104373a.m138348l0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
