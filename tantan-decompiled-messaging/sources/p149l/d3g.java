package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes10.dex */
public class d3g extends jq2<k3g> {
    public d3g(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m109913j0(Bundle bundle) {
        ((k3g) this.viewModel).m144404r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.z2g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201232a.m109913j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m109914i0() {
        return ((k3g) this.viewModel).m144400l();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m109915k0(int i, roj0 roj0Var) {
        zvf0.m220371D("e_upload_photos_success", act().pageId(), vwb.m200311Y("upload_page_name", "confirm_upload_photo_page"), vwb.m200311Y("upload_photos_count", Integer.valueOf(i)));
        act().progressDismiss();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m109916l0() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m109917m0(Throwable th) {
        act().progressDismiss();
        if (yij0.m214930H(th)) {
            return;
        }
        osi0.m165778b("上传失败");
        act().dialog().m20500D(R$string.f18768nl).m20556t0(R$string.f18046Q, new Runnable() { // from class: l.c3g
            @Override // java.lang.Runnable
            public final void run() {
                this.f78943a.m109916l0();
            }
        }).m20541k0(R$string.f18408c).m20568z0();
    }

    /* JADX INFO: renamed from: n0 */
    public void m109918n0(User user, final int i) {
        act().progress(R$string.f17842J5);
        duringCreated(CoreModule.f17545c.f19639e0.m169547u9(user)).subscribe(mkd0.m154956H(new e30() { // from class: l.a3g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67364a.m109915k0(i, (roj0) obj);
            }
        }, new e30() { // from class: l.b3g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73215a.m109917m0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
