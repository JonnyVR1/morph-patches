package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;

/* JADX INFO: loaded from: classes9.dex */
public class pee0 extends lbl0 {

    /* JADX INFO: renamed from: a */
    public int f152065a;

    public pee0(int i) {
        this.f152065a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m171964m(Act act) {
        m153583e(act);
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(final Act act) {
        super.mo96996a(act);
        pn0.m172992p(act, AnchorStartData.getBuilder().m68743k(), this.f152065a, new x20() { // from class: l.nee0
            @Override // p153l.x20
            public final void call() {
                this.f141643a.m171964m(act);
            }
        }, new x20() { // from class: l.oee0
            @Override // p153l.x20
            public final void call() {
                this.f146984a.m171965n(act);
            }
        });
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "sdkRes";
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m171965n(Act act) {
        it0.m142010D(act);
        m153580b("cancel");
    }
}
