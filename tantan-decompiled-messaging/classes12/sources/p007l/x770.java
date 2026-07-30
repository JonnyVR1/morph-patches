package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.preview.act.C2159a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.ag3;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class x770 extends jq2<C2159a> {

    /* JADX INFO: renamed from: a */
    public User f14784a;

    /* JADX INFO: renamed from: b */
    public Act f14785b;

    /* JADX INFO: renamed from: c */
    public int f14786c;

    /* JADX INFO: renamed from: d */
    public boolean f14787d;

    /* JADX INFO: renamed from: e */
    public Moment f14788e;

    public x770(Act act) {
        super(act);
        this.f14785b = act;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m16020f0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Boolean m16022h0(c cVar) {
        boolean z = false;
        if (!nkg.m12218P() ? cVar == c.j : cVar == c.k) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m16025l0(Bundle bundle) {
        C2159a c2159a = (C2159a) ((jq2) this).viewModel;
        Moment moment = this.f14788e;
        c2159a.m6436v(moment == null ? new ArrayList<>() : (ArrayList) moment.media);
        ((C2159a) ((jq2) this).viewModel).m6428k(this.f14786c, this.f14787d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m16026m0() {
        if (NullChecker.a(((C2159a) ((jq2) this).viewModel).f4076g)) {
            ((C2159a) ((jq2) this).viewModel).f4076g.m13469e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m16027n0(c cVar) {
        if (NullChecker.a(((jq2) this).viewModel) && NullChecker.a(((C2159a) ((jq2) this).viewModel).f4076g)) {
            ((C2159a) ((jq2) this).viewModel).f4076g.m13478o0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m16028a0() {
        creates(new e30() { // from class: l.r770
            public final void call(Object obj) {
                this.f12502a.m16025l0((Bundle) obj);
            }
        }, new d30() { // from class: l.s770
            public final void call() {
                this.f12814a.m16026m0();
            }
        });
        lifecycle().filter(new w9j() { // from class: l.t770
            public final Object call(Object obj) {
                return x770.m16022h0((c) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.u770
            public final void call(Object obj) {
                this.f13573a.m16027n0((c) obj);
            }
        }));
        if (NullChecker.a(this.f14788e)) {
            Act act = this.f14785b;
            xia xiaVar = FeedModule.f316d;
            Moment moment = this.f14788e;
            act.duringCreated(xiaVar.m16548Sb(moment.owner, ((DbObject) moment).id, "preview")).subscribe(mkd0.H(new e30() { // from class: l.v770
                public final void call(Object obj) {
                    this.f14081a.m16030o0((xaj0) obj);
                }
            }, new e30() { // from class: l.w770
                public final void call(Object obj) {
                    x770.m16020f0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public String m16029k0() {
        Moment moment = this.f14788e;
        return moment == null ? "" : ((DbObject) moment).id;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m16030o0(xaj0 xaj0Var) {
        if (NullChecker.a(((jq2) this).viewModel) && NullChecker.a(((C2159a) ((jq2) this).viewModel).f4077h)) {
            vvh<tvh> vvhVar = ((C2159a) ((jq2) this).viewModel).f4077h;
            Moment moment = (Moment) xaj0Var.a;
            Object obj = xaj0Var.c;
            vvhVar.mo11232m(moment, (RawFeed) ((j760) obj).b, (Music) ((j760) obj).a);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m16031p0(int i, boolean z) {
        this.f14786c = i;
        this.f14787d = z;
    }

    /* JADX INFO: renamed from: q0 */
    public List<Object> m16032q0() {
        return vwb.f0(new Object[]{"moment id", m16029k0(), ag3.c});
    }

    public void destroy() {
    }
}
