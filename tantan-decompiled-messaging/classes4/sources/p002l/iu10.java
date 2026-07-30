package p002l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iu10 extends jq2<qu10> {

    /* JADX INFO: renamed from: a */
    public User f13409a;

    public iu10(mcr mcrVar) {
        super(mcrVar);
        this.f13409a = new User();
        Profile profile = new Profile();
        profile.answers = CoreModule.c.e0.p9().profile.answers;
        this.f13409a.profile = profile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m15389i0(Bundle bundle) {
        ((qu10) ((jq2) this).viewModel).m21574r();
        m15394m0(false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m15390a0() {
        super.a0();
        creates(new e30() { // from class: l.eu10
            public final void call(Object obj) {
                this.f9965a.m15389i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m15391j0(roj0 roj0Var) {
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m15392k0() {
        act().finish();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m15393l0(Throwable th) {
        act().progressDismiss();
        if (yij0.H(th)) {
            return;
        }
        osi0.b("上传失败");
        act().dialog().D(R.string.nl).t0(R.string.Q, new Runnable() { // from class: l.hu10
            @Override // java.lang.Runnable
            public final void run() {
                this.f12267a.m15392k0();
            }
        }).k0(R.string.c).z0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m15394m0(boolean z) {
        ((qu10) ((jq2) this).viewModel).m21579x(this.f13409a.profile.answers, z);
    }

    /* JADX INFO: renamed from: n0 */
    public void m15395n0() {
        act().progress(R.string.J5);
        duringCreated(CoreModule.c.e0.u9(this.f13409a)).subscribe(mkd0.H(new e30() { // from class: l.fu10
            public final void call(Object obj) {
                this.f10635a.m15391j0((roj0) obj);
            }
        }, new e30() { // from class: l.gu10
            public final void call(Object obj) {
                this.f11627a.m15393l0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
