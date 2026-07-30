package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class a550 extends k8x<d550> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f68504d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f68505e;

    /* JADX INFO: renamed from: f */
    public C22507a<uxj0> f68506f;

    public a550(ner nerVar) {
        super(nerVar);
        this.f68506f = C22507a.m222759c(uxj0.f181467a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m96034G0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        toh0.m192059s();
        ((d550) this.viewModel).m114283r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m96035H0() {
        ((d550) this.viewModel).destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m96036I0(uxj0 uxj0Var) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userById = CoreModule.m30930K().getUserById(this.f124421b);
        this.f124422c = userById;
        ((d550) this.viewModel).m114281B(userM116600p9, userById);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m96037J0() {
        this.f68506f.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: L0 */
    public void m96038L0() {
        if (this.f68504d.size() <= 1) {
            act().m68056e2();
            return;
        }
        this.f124421b = this.f68504d.get(1);
        this.f68504d.remove(0);
        this.f68505e.remove(0);
        this.f68506f.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: N0 */
    public void m96039N0() {
        sfj0.m185596c("e_match_chat", "p_successful_match_view", new sfj0.C20032a[0]);
        if (this.f68504d.size() <= 1) {
            act().startActivity(MessagesAct.m50127l2(act(), this.f124421b, false, false, 2));
            act().finishWithoutCustomAnimation();
            return;
        }
        this.f124421b = this.f68504d.get(1);
        this.f68504d.remove(0);
        this.f68505e.remove(0);
        ((d550) this.viewModel).getAct().startActivity(MessagesAct.m50127l2(act(), this.f124421b, false, false, 2));
        l51.m152888H(act(), new Runnable() { // from class: l.z450
            @Override // java.lang.Runnable
            public final void run() {
                this.f202901a.m96037J0();
            }
        }, 600L);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        CoreModule.f18264c.f20384f0.m33653Fo();
        creates(new y20() { // from class: l.w450
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187349a.m96034G0((Bundle) obj);
            }
        }, new x20() { // from class: l.x450
            @Override // p153l.x20
            public final void call() {
                this.f192339a.m96035H0();
            }
        });
        duringCreated(this.f68506f).subscribe(psd0.m173596G(new y20() { // from class: l.y450
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197413a.m96036I0((uxj0) obj);
            }
        }));
    }

    @Override // p153l.k8x
    /* JADX INFO: renamed from: q0 */
    public void mo96040q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo96040q0(str, i, arrayList, arrayList2);
        this.f68504d = arrayList;
        this.f68505e = arrayList2;
    }

    @Override // p153l.k8x, p153l.k3m
    public void destroy() {
    }
}
