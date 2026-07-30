package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.camera.videorecord.VideoRecordFrag;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.j760;
import l.jo0;
import l.jq2;
import l.mkd0;
import l.roj0;
import l.s7m;
import l.wy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class t7l0 extends jq2<u9l0> {

    /* JADX INFO: renamed from: c */
    public static boolean f13217c;

    /* JADX INFO: renamed from: d */
    public static boolean f13218d;

    /* JADX INFO: renamed from: e */
    public static boolean f13219e;

    /* JADX INFO: renamed from: f */
    public static boolean f13220f;

    /* JADX INFO: renamed from: a */
    public VideoRecordFrag f13221a;

    /* JADX INFO: renamed from: b */
    public boolean f13222b;

    public t7l0(VideoRecordFrag videoRecordFrag) {
        super(videoRecordFrag);
        this.f13221a = videoRecordFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m14468n0(Bundle bundle) {
        ((u9l0) ((jq2) this).viewModel).m15019Q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m14469o0(c cVar) {
        if (cVar == c.i) {
            ((u9l0) ((jq2) this).viewModel).m15025T2();
        } else if (cVar == c.j) {
            ((u9l0) ((jq2) this).viewModel).m15023S2();
        } else if (cVar == c.m) {
            ((u9l0) ((jq2) this).viewModel).m15021R2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m14470p0(Boolean bool) {
        ((u9l0) ((jq2) this).viewModel).m15010G3(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m14471q0(roj0 roj0Var) {
        ((u9l0) ((jq2) this).viewModel).m15017P2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m14472r0(List list) {
        pb4.m12961O().m13014j0(list);
        if (NullChecker.b(((jq2) this).viewModel)) {
            ((u9l0) ((jq2) this).viewModel).m15035a3(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m14473s0(j760 j760Var) {
        if (NullChecker.b(((jq2) this).viewModel)) {
            ((u9l0) ((jq2) this).viewModel).m15027U2((List) j760Var.a, (List) j760Var.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m14474t0(List list) {
        int size = list.size();
        s7m s7mVar = ((jq2) this).viewModel;
        if (size > 0) {
            ((u9l0) s7mVar).m15066w3((Media) list.get(0));
        } else {
            ((u9l0) s7mVar).m15066w3(null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m14475m0(Bundle bundle) {
        creates(new e30() { // from class: l.l7l0
            public final void call(Object obj) {
                this.f9920a.m14468n0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.m7l0
            public final void call(Object obj) {
                this.f10251a.m14469o0((c) obj);
            }
        }));
        duringCreated(m84.m11844e().f10260f).observeOn(jo0.a()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.n7l0
            public final void call(Object obj) {
                this.f10695a.m14470p0((Boolean) obj);
            }
        }));
        hli.m10655j().m10658h();
        hli.m10654f();
        ((u9l0) ((jq2) this).viewModel).m15003C1(bundle);
    }

    /* JADX INFO: renamed from: u0 */
    public void m14476u0() {
        if (this.f13222b) {
            return;
        }
        FeedModule.f314b.m1424P2();
        duringCreated(FeedModule.f314b.m1447g2(false)).subscribe(mkd0.G(new e30() { // from class: l.p7l0
            public final void call(Object obj) {
                this.f11722a.m14471q0((roj0) obj);
            }
        }));
        duringCreated(FeedModule.f314b.m1432U1()).subscribe(mkd0.G(new e30() { // from class: l.q7l0
            public final void call(Object obj) {
                this.f12145a.m14472r0((List) obj);
            }
        }));
        rx.c.combineLatest(FeedModule.f314b.m1436W1(), FeedModule.f314b.m1430T1(), new wy()).subscribe(mkd0.H(new e30() { // from class: l.r7l0
            public final void call(Object obj) {
                this.f12513a.m14473s0((j760) obj);
            }
        }, new e30() { // from class: l.s7l0
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m14477x0(boolean z) {
        this.f13222b = z;
    }

    /* JADX INFO: renamed from: y0 */
    public void m14478y0() {
        dmx dmxVar = new dmx(act(), true, true);
        dmxVar.m9516t().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.o7l0
            public final void call(Object obj) {
                this.f11375a.m14474t0((List) obj);
            }
        }));
        act().getSupportLoaderManager().e(0, (Bundle) null, dmxVar);
    }

    public void destroy() {
    }
}
