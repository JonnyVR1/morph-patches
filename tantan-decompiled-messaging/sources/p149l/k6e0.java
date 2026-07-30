package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;

/* JADX INFO: loaded from: classes13.dex */
public class k6e0 extends g2l0 {

    /* JADX INFO: renamed from: a */
    public int f121454a;

    public k6e0(int i) {
        this.f121454a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m144585m(Act act) {
        m124169e(act);
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(final Act act) {
        super.mo94566a(act);
        tn0.m189748p(act, AnchorStartData.getBuilder().m67560k(), this.f121454a, new d30() { // from class: l.i6e0
            @Override // p149l.d30
            public final void call() {
                this.f111735a.m144585m(act);
            }
        }, new d30() { // from class: l.j6e0
            @Override // p149l.d30
            public final void call() {
                this.f116444a.m144586n(act);
            }
        });
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "sdkRes";
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m144586n(Act act) {
        dt0.m113504D(act);
        m124166b("cancel");
    }
}
