package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class lga0 extends jq2<oga0> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f127969a;

    /* JADX INFO: renamed from: b */
    public String f127970b;

    /* JADX INFO: renamed from: c */
    public cwf0 f127971c;

    public lga0(mcr mcrVar) {
        super(mcrVar);
        this.f127971c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m149757j0(Bundle bundle) {
        LoopInputType loopInputType = (LoopInputType) ((oga0) this.viewModel).m164187j().getSerializable("loop_input_type");
        this.f127969a = loopInputType;
        ((oga0) this.viewModel).m164193q(loopInputType, this.f127970b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m149758l0() {
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m149759m0(Throwable th) {
        if (NullChecker.m81303a(act())) {
            act().progressDismiss();
            if (yij0.m214930H(th)) {
                return;
            }
            act().dialog().m20500D(R$string.f27831c3).m20556t0(R$string.f27863i, new Runnable() { // from class: l.kga0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123018a.m149758l0();
                }
            }).m20541k0(R$string.f27815a).m20568z0();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f127970b = act().getIntent().getExtras().getString("loop_edit_from", "");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.hga0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107586a.m149757j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m149760i0(boolean z) {
        return ((oga0) this.viewModel).m164189l();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m149761k0(User user, User user2, String str, roj0 roj0Var) {
        act().progressDismiss();
        if (user.pictures.size() - user2.pictures.size() > 0) {
            zvf0.m220371D("e_upload_photos_success", str, vwb.m200311Y("upload_page_name", "upload_photos_page"), vwb.m200311Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size())));
        }
        CoreModule.f17545c.f19639e0.m169395H7();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: n0 */
    public void m149762n0(final User user, final User user2, final String str) {
        User userSubtract = user.subtract(user2);
        if (!NullChecker.m81303a(userSubtract)) {
            act().m66873d2();
        } else {
            act().progress(R$string.f27771R0);
            duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.iga0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f113090a.m149761k0(user, user2, str, (roj0) obj);
                }
            }, new e30() { // from class: l.jga0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f117765a.m149759m0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
