package p003l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.vwb;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d3g extends jq2<k3g> {
    public d3g(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m6049j0(Bundle bundle) {
        ((k3g) ((jq2) this).viewModel).m7517r();
    }

    /* JADX INFO: renamed from: a0 */
    public void m6050a0() {
        super.a0();
        creates(new e30() { // from class: l.z2g
            public final void call(Object obj) {
                this.f9179a.m6049j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m6051i0() {
        return ((k3g) ((jq2) this).viewModel).m7513l();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m6052k0(int i, roj0 roj0Var) {
        zvf0.D("e_upload_photos_success", act().pageId(), new j760[]{vwb.Y("upload_page_name", "confirm_upload_photo_page"), vwb.Y("upload_photos_count", Integer.valueOf(i))});
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m6053l0() {
        act().finish();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m6054m0(Throwable th) {
        act().progressDismiss();
        if (yij0.H(th)) {
            return;
        }
        osi0.b("上传失败");
        act().dialog().D(R.string.nl).t0(R.string.Q, new Runnable() { // from class: l.c3g
            @Override // java.lang.Runnable
            public final void run() {
                this.f3970a.m6053l0();
            }
        }).k0(R.string.c).z0();
    }

    /* JADX INFO: renamed from: n0 */
    public void m6055n0(User user, final int i) {
        act().progress(R.string.J5);
        duringCreated(CoreModule.c.e0.u9(user)).subscribe(mkd0.H(new e30() { // from class: l.a3g
            public final void call(Object obj) {
                this.f2722a.m6052k0(i, (roj0) obj);
            }
        }, new e30() { // from class: l.b3g
            public final void call(Object obj) {
                this.f3308a.m6054m0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
