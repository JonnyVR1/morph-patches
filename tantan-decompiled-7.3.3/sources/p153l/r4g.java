package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes3.dex */
public class r4g extends ar2<y4g> {
    public r4g(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m179754j0(Bundle bundle) {
        ((y4g) this.viewModel).m214228r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.n4g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140229a.m179754j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m179755i0() {
        return ((y4g) this.viewModel).m214224l();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m179756k0(int i, uxj0 uxj0Var) {
        i4g0.m138495D("e_upload_photos_success", act().pageId(), jyb.m147494Y("upload_page_name", "confirm_upload_photo_page"), jyb.m147494Y("upload_photos_count", Integer.valueOf(i)));
        act().progressDismiss();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m179757l0() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m179758m0(Throwable th) {
        act().progressDismiss();
        if (bsj0.m106250H(th)) {
            return;
        }
        r1j0.m179415b("上传失败");
        act().dialog().m21499D(R$string.f18586Jl).m21555t0(R$string.f18776Q, new Runnable() { // from class: l.q4g
            @Override // java.lang.Runnable
            public final void run() {
                this.f155589a.m179757l0();
            }
        }).m21540k0(R$string.f19138c).m21567z0();
    }

    /* JADX INFO: renamed from: n0 */
    public void m179759n0(User user, final int i) {
        act().progress(R$string.f18632L5);
        duringCreated(CoreModule.f18264c.f20381e0.m116620u9(user)).subscribe(psd0.m173597H(new y20() { // from class: l.o4g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144975a.m179756k0(i, (uxj0) obj);
            }
        }, new y20() { // from class: l.p4g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150532a.m179758m0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
