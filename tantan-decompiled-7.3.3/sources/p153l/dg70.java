package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.preview.act.C11478a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class dg70 extends ar2<C11478a> {

    /* JADX INFO: renamed from: a */
    public User f88266a;

    /* JADX INFO: renamed from: b */
    public Act f88267b;

    /* JADX INFO: renamed from: c */
    public int f88268c;

    /* JADX INFO: renamed from: d */
    public boolean f88269d;

    /* JADX INFO: renamed from: e */
    public Moment f88270e;

    public dg70(Act act) {
        super(act);
        this.f88267b = act;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m115632f0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Boolean m115634h0(C4470c c4470c) {
        boolean z = false;
        if (!cmg.m111188P() ? c4470c == C4470c.f16268j : c4470c == C4470c.f16269k) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m115637l0(Bundle bundle) {
        C11478a c11478a = (C11478a) this.viewModel;
        Moment moment = this.f88270e;
        c11478a.m66516v(moment == null ? new ArrayList<>() : (ArrayList) moment.media);
        ((C11478a) this.viewModel).m66508k(this.f88268c, this.f88269d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m115638m0() {
        if (NullChecker.m82486a(((C11478a) this.viewModel).f43463g)) {
            ((C11478a) this.viewModel).f43463g.m206088e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m115639n0(C4470c c4470c) {
        if (NullChecker.m82486a(this.viewModel) && NullChecker.m82486a(((C11478a) this.viewModel).f43463g)) {
            ((C11478a) this.viewModel).f43463g.m206096o0();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.xf70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194009a.m115637l0((Bundle) obj);
            }
        }, new x20() { // from class: l.yf70
            @Override // p153l.x20
            public final void call() {
                this.f199452a.m115638m0();
            }
        });
        lifecycle().filter(new qcj() { // from class: l.zf70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dg70.m115634h0((C4470c) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ag70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71100a.m115639n0((C4470c) obj);
            }
        }));
        if (NullChecker.m82486a(this.f88270e)) {
            Act act = this.f88267b;
            jka jkaVar = FeedModule.f39703d;
            Moment moment = this.f88270e;
            act.duringCreated(jkaVar.m145608Sb(moment.owner, moment.f56859id, "preview")).subscribe(psd0.m173597H(new y20() { // from class: l.bg70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76571a.m115641o0((bkj0) obj);
                }
            }, new y20() { // from class: l.cg70
                @Override // p153l.y20
                public final void call(Object obj) {
                    dg70.m115632f0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public String m115640k0() {
        Moment moment = this.f88270e;
        return moment == null ? "" : moment.f56859id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m115641o0(bkj0 bkj0Var) {
        if (NullChecker.m82486a(this.viewModel) && NullChecker.m82486a(((C11478a) this.viewModel).f43464h)) {
            kxh<ixh> kxhVar = ((C11478a) this.viewModel).f43464h;
            Moment moment = (Moment) bkj0Var.f77081a;
            C c = bkj0Var.f77083c;
            kxhVar.mo107419m(moment, (RawFeed) ((pf60) c).f152157b, (Music) ((pf60) c).f152156a);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m115642p0(int i, boolean z) {
        this.f88268c = i;
        this.f88269d = z;
    }

    /* JADX INFO: renamed from: q0 */
    public List<Object> m115643q0() {
        return jyb.m147507f0("moment id", m115640k0(), og3.f147188c);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
