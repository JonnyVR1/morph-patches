package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.camera.videorecord.VideoRecordFrag;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class t7l0 extends jq2<u9l0> {

    /* JADX INFO: renamed from: c */
    public static boolean f168749c;

    /* JADX INFO: renamed from: d */
    public static boolean f168750d;

    /* JADX INFO: renamed from: e */
    public static boolean f168751e;

    /* JADX INFO: renamed from: f */
    public static boolean f168752f;

    /* JADX INFO: renamed from: a */
    public VideoRecordFrag f168753a;

    /* JADX INFO: renamed from: b */
    public boolean f168754b;

    public t7l0(VideoRecordFrag videoRecordFrag) {
        super(videoRecordFrag);
        this.f168753a = videoRecordFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m187476n0(Bundle bundle) {
        ((u9l0) this.viewModel).m192513Q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m187477o0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            ((u9l0) this.viewModel).m192519T2();
        } else if (c4319c == C4319c.f15549j) {
            ((u9l0) this.viewModel).m192517S2();
        } else if (c4319c == C4319c.f15552m) {
            ((u9l0) this.viewModel).m192515R2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m187478p0(Boolean bool) {
        ((u9l0) this.viewModel).m192504G3(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m187479q0(roj0 roj0Var) {
        ((u9l0) this.viewModel).m192511P2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m187480r0(List list) {
        pb4.m168142O().m168195j0(list);
        if (NullChecker.m81304b(this.viewModel)) {
            ((u9l0) this.viewModel).m192529a3(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m187481s0(j760 j760Var) {
        if (NullChecker.m81304b(this.viewModel)) {
            ((u9l0) this.viewModel).m192521U2((List) j760Var.f116564a, (List) j760Var.f116565b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m187482t0(List list) {
        int size = list.size();
        V v2 = this.viewModel;
        if (size > 0) {
            ((u9l0) v2).m192559w3((Media) list.get(0));
        } else {
            ((u9l0) v2).m192559w3(null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m187483m0(Bundle bundle) {
        creates(new e30() { // from class: l.l7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126732a.m187476n0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.m7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131833a.m187477o0((C4319c) obj);
            }
        }));
        duringCreated(m84.m153429e().f132515f).observeOn(jo0.m142408a()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.n7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137537a.m187478p0((Boolean) obj);
            }
        }));
        hli.m131661j().m131664h();
        hli.m131660f();
        ((u9l0) this.viewModel).m192497C1(bundle);
    }

    /* JADX INFO: renamed from: u0 */
    public void m187484u0() {
        if (this.f168754b) {
            return;
        }
        FeedModule.f38853b.m60498P2();
        duringCreated(FeedModule.f38853b.m60521g2(false)).subscribe(mkd0.m154955G(new e30() { // from class: l.p7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147522a.m187479q0((roj0) obj);
            }
        }));
        duringCreated(FeedModule.f38853b.m60506U1()).subscribe(mkd0.m154955G(new e30() { // from class: l.q7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153058a.m187480r0((List) obj);
            }
        }));
        C22306c.combineLatest(FeedModule.f38853b.m60510W1(), FeedModule.f38853b.m60504T1(), new C20992wy()).subscribe(mkd0.m154956H(new e30() { // from class: l.r7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158048a.m187481s0((j760) obj);
            }
        }, new e30() { // from class: l.s7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m187485x0(boolean z) {
        this.f168754b = z;
    }

    /* JADX INFO: renamed from: y0 */
    public void m187486y0() {
        dmx dmxVar = new dmx(act(), true, true);
        dmxVar.m112546t().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.o7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142514a.m187482t0((List) obj);
            }
        }));
        act().getSupportLoaderManager().mo3088e(0, null, dmxVar);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
