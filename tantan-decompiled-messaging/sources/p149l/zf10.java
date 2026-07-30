package p149l;

import android.util.Pair;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.presenter.MultiCallApplyDlgPresenter;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class zf10 extends qi10<am40> {

    /* JADX INFO: renamed from: n */
    public final HashSet<String> f202874n;

    /* JADX INFO: renamed from: o */
    public c4g0 f202875o;

    public zf10(bsm<am40> bsmVar, MultiCallTopView multiCallTopView, ze10 ze10Var) {
        super(bsmVar, multiCallTopView, ze10Var);
        this.f202874n = new HashSet<>();
        m144512z2(new MultiCallApplyDlgPresenter(bsmVar, ze10Var));
    }

    /* JADX INFO: renamed from: O4 */
    private void m218440O4() {
        rwb rwbVar;
        if (vg10.m198312d(this.f154638j.m139803e4()) || (rwbVar = (rwb) m129297F3(new swb(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))) == null) {
            return;
        }
        yi10.m214879a("checkCtypChanged newCtyp is  " + rwbVar.f161324a);
        int i = rwbVar.f161324a;
        C22392a<Boolean> c22392a = this.f154637i;
        if (i == 3) {
            c22392a.m132487l(Boolean.TRUE);
        } else {
            c22392a.m132487l(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m218441P4(iqv iqvVar) {
        int iM137794a = iqvVar.m137794a();
        if (iM137794a == 2) {
            ((MultiCallTopView) this.viewModel).m75842l();
        } else if (iM137794a == 3 && r610.m177981P(this)) {
            ((MultiCallTopView) this.viewModel).m75837A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m218442R4(Object obj) {
        m218440O4();
    }

    @Override // p149l.qi10
    /* JADX INFO: renamed from: B4 */
    public void mo174731B4(Pair<b610, Boolean> pair) {
        act().setSwipeBackEnable(!vwb.m200337m(((b610) pair.first).m100376v(), new w9j() { // from class: l.xf10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(r610.m177988W(((BLiveMultiCall) obj).userId));
            }
        }));
        Object obj = pair.first;
        if (((b610) obj).f73730d == 3 && r610.m177988W(((b610) obj).f73729c.userId)) {
            m218443N4();
        } else {
            super.mo174731B4(pair);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final void m218443N4() {
        mkd0.m154992z(this.f202875o);
        this.f202875o = m104250o2(m206028F2().PlayerEvent.onReceiveStreamMembers().m172460g(), false).subscribe(ffw.m121197h(new e30() { // from class: l.yf10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197974a.m218444Q4((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m218444Q4(List<String> list) {
        yi10.m214879a("handle stream members size : " + list.size());
        this.f202874n.clear();
        this.f202874n.addAll(list);
        if (this.f202874n.contains(ypv.f199493a.m199309D0())) {
            return;
        }
        m206028F2().MultiCallEvent.selfLeaveCall().mo172463j(Boolean.TRUE);
        super.mo174731B4(new Pair<>(this.f154638j.m139800b4(), this.f154637i.m221515e()));
        mkd0.m154992z(this.f202875o);
    }

    @Override // p149l.qi10, p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        act().setSwipeBackEnable(true);
        mkd0.m154992z(this.f202875o);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2, l.lh20] */
    @Override // p149l.qi10, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m218440O4();
        duringCreated(C22306c.merge(m206028F2().PlayerEvent.ctypChanged().m172460g(), m206028F2().PlayerEvent.videoSizeChanged().m172460g())).subscribe(ffw.m121193d(new e30() { // from class: l.vf10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181238a.m218442R4(obj);
            }
        }));
        duringCreated(m206027E2().m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.wf10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186003a.m218441P4((iqv) obj);
            }
        }));
    }
}
