package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lga0 extends jq2<oga0> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f14848a;

    /* JADX INFO: renamed from: b */
    public String f14849b;

    /* JADX INFO: renamed from: c */
    public cwf0 f14850c;

    public lga0(mcr mcrVar) {
        super(mcrVar);
        this.f14850c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m17209j0(Bundle bundle) {
        LoopInputType loopInputType = (LoopInputType) ((oga0) ((jq2) this).viewModel).m19460j().getSerializable("loop_input_type");
        this.f14848a = loopInputType;
        ((oga0) ((jq2) this).viewModel).m19466q(loopInputType, this.f14849b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m17210l0() {
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m17211m0(Throwable th) {
        if (NullChecker.a(act())) {
            act().progressDismiss();
            if (yij0.H(th)) {
                return;
            }
            act().dialog().D(R.string.c3).t0(R.string.i, new Runnable() { // from class: l.kga0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14317a.m17210l0();
                }
            }).k0(R.string.a).z0();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m17212Z() {
        super.Z();
        this.f14849b = act().getIntent().getExtras().getString("loop_edit_from", "");
    }

    /* JADX INFO: renamed from: a0 */
    public void m17213a0() {
        super.a0();
        creates(new e30() { // from class: l.hga0
            public final void call(Object obj) {
                this.f12023a.m17209j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m17214i0(boolean z) {
        return ((oga0) ((jq2) this).viewModel).m19462l();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m17215k0(User user, User user2, String str, roj0 roj0Var) {
        act().progressDismiss();
        if (user.pictures.size() - user2.pictures.size() > 0) {
            zvf0.D("e_upload_photos_success", str, new j760[]{vwb.Y("upload_page_name", "upload_photos_page"), vwb.Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size()))});
        }
        CoreModule.c.e0.H7();
        act().finish();
    }

    /* JADX INFO: renamed from: n0 */
    public void m17216n0(final User user, final User user2, final String str) {
        User userSubtract = user.subtract(user2);
        if (!NullChecker.a(userSubtract)) {
            act().finish();
        } else {
            act().progress(R.string.R0);
            duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.iga0
                public final void call(Object obj) {
                    this.f13226a.m17215k0(user, user2, str, (roj0) obj);
                }
            }, new e30() { // from class: l.jga0
                public final void call(Object obj) {
                    this.f13761a.m17211m0((Throwable) obj);
                }
            }));
        }
    }

    public void destroy() {
    }
}
