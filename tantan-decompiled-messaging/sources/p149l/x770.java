package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.preview.act.C11315a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class x770 extends jq2<C11315a> {

    /* JADX INFO: renamed from: a */
    public User f191320a;

    /* JADX INFO: renamed from: b */
    public Act f191321b;

    /* JADX INFO: renamed from: c */
    public int f191322c;

    /* JADX INFO: renamed from: d */
    public boolean f191323d;

    /* JADX INFO: renamed from: e */
    public Moment f191324e;

    public x770(Act act) {
        super(act);
        this.f191321b = act;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m207243f0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Boolean m207245h0(C4319c c4319c) {
        boolean z = false;
        if (!nkg.m159859P() ? c4319c == C4319c.f15549j : c4319c == C4319c.f15550k) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m207248l0(Bundle bundle) {
        C11315a c11315a = (C11315a) this.viewModel;
        Moment moment = this.f191324e;
        c11315a.m65333v(moment == null ? new ArrayList<>() : (ArrayList) moment.media);
        ((C11315a) this.viewModel).m65325k(this.f191322c, this.f191323d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m207249m0() {
        if (NullChecker.m81303a(((C11315a) this.viewModel).f42615g)) {
            ((C11315a) this.viewModel).f42615g.m173225e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m207250n0(C4319c c4319c) {
        if (NullChecker.m81303a(this.viewModel) && NullChecker.m81303a(((C11315a) this.viewModel).f42615g)) {
            ((C11315a) this.viewModel).f42615g.m173233o0();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.r770
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158014a.m207248l0((Bundle) obj);
            }
        }, new d30() { // from class: l.s770
            @Override // p149l.d30
            public final void call() {
                this.f162897a.m207249m0();
            }
        });
        lifecycle().filter(new w9j() { // from class: l.t770
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return x770.m207245h0((C4319c) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.u770
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174944a.m207250n0((C4319c) obj);
            }
        }));
        if (NullChecker.m81303a(this.f191324e)) {
            Act act = this.f191321b;
            xia xiaVar = FeedModule.f38855d;
            Moment moment = this.f191324e;
            act.duringCreated(xiaVar.m209367Sb(moment.owner, moment.f56011id, "preview")).subscribe(mkd0.m154956H(new e30() { // from class: l.v770
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f180313a.m207252o0((xaj0) obj);
                }
            }, new e30() { // from class: l.w770
                @Override // p149l.e30
                public final void call(Object obj) {
                    x770.m207243f0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public String m207251k0() {
        Moment moment = this.f191324e;
        return moment == null ? "" : moment.f56011id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m207252o0(xaj0 xaj0Var) {
        if (NullChecker.m81303a(this.viewModel) && NullChecker.m81303a(((C11315a) this.viewModel).f42616h)) {
            vvh<tvh> vvhVar = ((C11315a) this.viewModel).f42616h;
            Moment moment = (Moment) xaj0Var.f191751a;
            C c = xaj0Var.f191753c;
            vvhVar.mo142214m(moment, (RawFeed) ((j760) c).f116565b, (Music) ((j760) c).f116564a);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m207253p0(int i, boolean z) {
        this.f191322c = i;
        this.f191323d = z;
    }

    /* JADX INFO: renamed from: q0 */
    public List<Object> m207254q0() {
        return vwb.m200324f0("moment id", m207251k0(), ag3.f69254c);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
