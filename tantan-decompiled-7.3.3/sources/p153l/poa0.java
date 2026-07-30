package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class poa0 extends ar2<soa0> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f153384a;

    /* JADX INFO: renamed from: b */
    public String f153385b;

    /* JADX INFO: renamed from: c */
    public l4g0 f153386c;

    public poa0(ner nerVar) {
        super(nerVar);
        this.f153386c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m173100j0(Bundle bundle) {
        LoopInputType loopInputType = (LoopInputType) ((soa0) this.viewModel).m187169j().getSerializable("loop_input_type");
        this.f153384a = loopInputType;
        ((soa0) this.viewModel).m187175q(loopInputType, this.f153385b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m173101l0() {
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m173102m0(Throwable th) {
        if (NullChecker.m82486a(act())) {
            act().progressDismiss();
            if (bsj0.m106250H(th)) {
                return;
            }
            act().dialog().m21499D(R$string.f28679c3).m21555t0(R$string.f28711i, new Runnable() { // from class: l.ooa0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f148342a.m173101l0();
                }
            }).m21540k0(R$string.f28663a).m21567z0();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f153385b = act().getIntent().getExtras().getString("loop_edit_from", "");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.loa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132886a.m173100j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m173103i0(boolean z) {
        return ((soa0) this.viewModel).m187171l();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m173104k0(User user, User user2, String str, uxj0 uxj0Var) {
        act().progressDismiss();
        if (user.pictures.size() - user2.pictures.size() > 0) {
            i4g0.m138495D("e_upload_photos_success", str, jyb.m147494Y("upload_page_name", "upload_photos_page"), jyb.m147494Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size())));
        }
        CoreModule.f18264c.f20381e0.m116468H7();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: n0 */
    public void m173105n0(final User user, final User user2, final String str) {
        User userSubtract = user.subtract(user2);
        if (!NullChecker.m82486a(userSubtract)) {
            act().m68056e2();
        } else {
            act().progress(R$string.f28619R0);
            duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.moa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f137802a.m173104k0(user, user2, str, (uxj0) obj);
                }
            }, new y20() { // from class: l.noa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f142972a.m173102m0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
