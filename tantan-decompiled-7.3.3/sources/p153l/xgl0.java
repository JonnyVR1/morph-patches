package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.camera.videorecord.VideoRecordFrag;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class xgl0 extends ar2<yil0> {

    /* JADX INFO: renamed from: c */
    public static boolean f194204c;

    /* JADX INFO: renamed from: d */
    public static boolean f194205d;

    /* JADX INFO: renamed from: e */
    public static boolean f194206e;

    /* JADX INFO: renamed from: f */
    public static boolean f194207f;

    /* JADX INFO: renamed from: a */
    public VideoRecordFrag f194208a;

    /* JADX INFO: renamed from: b */
    public boolean f194209b;

    public xgl0(VideoRecordFrag videoRecordFrag) {
        super(videoRecordFrag);
        this.f194208a = videoRecordFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m210915n0(Bundle bundle) {
        ((yil0) this.viewModel).m216285Q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m210916o0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            ((yil0) this.viewModel).m216291T2();
        } else if (c4470c == C4470c.f16268j) {
            ((yil0) this.viewModel).m216289S2();
        } else if (c4470c == C4470c.f16271m) {
            ((yil0) this.viewModel).m216287R2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m210917p0(Boolean bool) {
        ((yil0) this.viewModel).m216276G3(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m210918q0(uxj0 uxj0Var) {
        ((yil0) this.viewModel).m216283P2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m210919r0(List list) {
        oc4.m167081O().m167134j0(list);
        if (NullChecker.m82487b(this.viewModel)) {
            ((yil0) this.viewModel).m216301a3(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m210920s0(pf60 pf60Var) {
        if (NullChecker.m82487b(this.viewModel)) {
            ((yil0) this.viewModel).m216293U2((List) pf60Var.f152156a, (List) pf60Var.f152157b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m210921t0(List list) {
        int size = list.size();
        V v2 = this.viewModel;
        if (size > 0) {
            ((yil0) v2).m216330w3((Media) list.get(0));
        } else {
            ((yil0) v2).m216330w3(null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m210922m0(Bundle bundle) {
        creates(new y20() { // from class: l.pgl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152307a.m210915n0((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.qgl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157427a.m210916o0((C4470c) obj);
            }
        }));
        duringCreated(l94.m153309e().f130546f).observeOn(fo0.m126432a()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.rgl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163021a.m210917p0((Boolean) obj);
            }
        }));
        doi.m117277j().m117280h();
        doi.m117276f();
        ((yil0) this.viewModel).m216269C1(bundle);
    }

    /* JADX INFO: renamed from: u0 */
    public void m210923u0() {
        if (this.f194209b) {
            return;
        }
        FeedModule.f39701b.m61682P2();
        duringCreated(FeedModule.f39701b.m61705g2(false)).subscribe(psd0.m173596G(new y20() { // from class: l.tgl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174101a.m210918q0((uxj0) obj);
            }
        }));
        duringCreated(FeedModule.f39701b.m61690U1()).subscribe(psd0.m173596G(new y20() { // from class: l.ugl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178915a.m210919r0((List) obj);
            }
        }));
        C22421c.combineLatest(FeedModule.f39701b.m61694W1(), FeedModule.f39701b.m61688T1(), new C19690qy()).subscribe(psd0.m173597H(new y20() { // from class: l.vgl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184044a.m210920s0((pf60) obj);
            }
        }, new y20() { // from class: l.wgl0
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m210924x0(boolean z) {
        this.f194209b = z;
    }

    /* JADX INFO: renamed from: y0 */
    public void m210925y0() {
        avx avxVar = new avx(act(), true, true);
        avxVar.m100542t().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.sgl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167890a.m210921t0((List) obj);
            }
        }));
        act().getSupportLoaderManager().mo3089e(0, null, avxVar);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
