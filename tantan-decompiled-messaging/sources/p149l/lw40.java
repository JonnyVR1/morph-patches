package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class lw40 extends l5x<ow40> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f130238d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f130239e;

    /* JADX INFO: renamed from: f */
    public C22392a<roj0> f130240f;

    public lw40(mcr mcrVar) {
        super(mcrVar);
        this.f130240f = C22392a.m221513c(roj0.f160388a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m151960G0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.m154563s();
        ((ow40) this.viewModel).m166279r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m151961H0() {
        ((ow40) this.viewModel).destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m151962I0(roj0 roj0Var) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userById = CoreModule.m29932K().getUserById(this.f126211b);
        this.f126212c = userById;
        ((ow40) this.viewModel).m166278B(userM169527p9, userById);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m151963J0() {
        this.f130240f.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: L0 */
    public void m151964L0() {
        if (this.f130238d.size() <= 1) {
            act().m66873d2();
            return;
        }
        this.f126211b = this.f130238d.get(1);
        this.f130238d.remove(0);
        this.f130239e.remove(0);
        this.f130240f.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: N0 */
    public void m151965N0() {
        o6j0.m162859c("e_match_chat", "p_successful_match_view", new o6j0.C18854a[0]);
        if (this.f130238d.size() <= 1) {
            act().startActivity(MessagesAct.m48944k2(act(), this.f126211b, false, false, 2));
            act().finishWithoutCustomAnimation();
            return;
        }
        this.f126211b = this.f130238d.get(1);
        this.f130238d.remove(0);
        this.f130239e.remove(0);
        ((ow40) this.viewModel).getAct().startActivity(MessagesAct.m48944k2(act(), this.f126211b, false, false, 2));
        e51.m114743H(act(), new Runnable() { // from class: l.kw40
            @Override // java.lang.Runnable
            public final void run() {
                this.f124920a.m151963J0();
            }
        }, 600L);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        CoreModule.f17545c.f19642f0.m32650Fo();
        creates(new e30() { // from class: l.hw40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109721a.m151960G0((Bundle) obj);
            }
        }, new d30() { // from class: l.iw40
            @Override // p149l.d30
            public final void call() {
                this.f115224a.m151961H0();
            }
        });
        duringCreated(this.f130240f).subscribe(mkd0.m154955G(new e30() { // from class: l.jw40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120045a.m151962I0((roj0) obj);
            }
        }));
    }

    @Override // p149l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo134431q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo134431q0(str, i, arrayList, arrayList2);
        this.f130238d = arrayList;
        this.f130239e = arrayList2;
    }

    @Override // p149l.l5x, p149l.q0m
    public void destroy() {
    }
}
