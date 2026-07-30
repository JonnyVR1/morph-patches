package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.e51;
import l.jq2;
import l.mcr;
import l.mgh0;
import l.mkd0;
import l.o6j0;
import l.roj0;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class lw40 extends l5x<ow40> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f5435d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f5436e;

    /* JADX INFO: renamed from: f */
    public C1185a<roj0> f5437f;

    public lw40(mcr mcrVar) {
        super(mcrVar);
        this.f5437f = C1185a.m9970c(roj0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m6157G0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.s();
        ((ow40) ((jq2) this).viewModel).m6757r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m6158H0() {
        ((ow40) ((jq2) this).viewModel).destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m6159I0(roj0 roj0Var) {
        User userP9 = CoreModule.c.e0.p9();
        User userById = CoreModule.K().getUserById(this.f5220b);
        this.f5221c = userById;
        ((ow40) ((jq2) this).viewModel).m6754B(userP9, userById);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m6160J0() {
        this.f5437f.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: L0 */
    public void m6161L0() {
        if (this.f5435d.size() <= 1) {
            act().finish();
            return;
        }
        this.f5220b = this.f5435d.get(1);
        this.f5435d.remove(0);
        this.f5436e.remove(0);
        this.f5437f.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: N0 */
    public void m6162N0() {
        o6j0.c("e_match_chat", "p_successful_match_view", new o6j0.a[0]);
        if (this.f5435d.size() <= 1) {
            act().startActivity(MessagesAct.m2036k2(act(), this.f5220b, false, false, 2));
            act().finishWithoutCustomAnimation();
            return;
        }
        this.f5220b = this.f5435d.get(1);
        this.f5435d.remove(0);
        this.f5436e.remove(0);
        ((ow40) ((jq2) this).viewModel).act().startActivity(MessagesAct.m2036k2(act(), this.f5220b, false, false, 2));
        e51.H(act(), new Runnable() { // from class: l.kw40
            @Override // java.lang.Runnable
            public final void run() {
                this.f5088a.m6160J0();
            }
        }, 600L);
    }

    /* JADX INFO: renamed from: a0 */
    public void m6163a0() {
        CoreModule.c.f0.Fo();
        creates(new e30() { // from class: l.hw40
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4292a.m6157G0((Bundle) obj);
            }
        }, new d30() { // from class: l.iw40
            @Override // p003l.d30
            public final void call() {
                this.f4508a.m6158H0();
            }
        });
        duringCreated(this.f5437f).subscribe((m250) mkd0.G(new e30() { // from class: l.jw40
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4745a.m6159I0((roj0) obj);
            }
        }));
    }

    @Override // p003l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo5067q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo5067q0(str, i, arrayList, arrayList2);
        this.f5435d = arrayList;
        this.f5436e = arrayList2;
    }

    @Override // p003l.l5x
    public void destroy() {
    }
}
