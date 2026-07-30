package p153l;

import android.util.Pair;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.presenter.MultiCallApplyDlgPresenter;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class jo10 extends ar10<ou40> {

    /* JADX INFO: renamed from: n */
    public final HashSet<String> f121932n;

    /* JADX INFO: renamed from: o */
    public kcg0 f121933o;

    public jo10(dum<ou40> dumVar, MultiCallTopView multiCallTopView, jn10 jn10Var) {
        super(dumVar, multiCallTopView, jn10Var);
        this.f121932n = new HashSet<>();
        m153103z2(new MultiCallApplyDlgPresenter(dumVar, jn10Var));
    }

    /* JADX INFO: renamed from: O4 */
    private void m146324O4() {
        fyb fybVar;
        if (fp10.m126517d(this.f72899j.m190587e4()) || (fybVar = (fyb) m138856F3(new gyb(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))) == null) {
            return;
        }
        ir10.m141746a("checkCtypChanged newCtyp is  " + fybVar.f101357a);
        int i = fybVar.f101357a;
        C22507a<Boolean> c22507a = this.f72898i;
        if (i == 3) {
            c22507a.m137019l(Boolean.TRUE);
        } else {
            c22507a.m137019l(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m146325P4(jsv jsvVar) {
        int iM146875a = jsvVar.m146875a();
        if (iM146875a == 2) {
            ((MultiCallTopView) this.viewModel).m77025l();
        } else if (iM146875a == 3 && bf10.m103810P(this)) {
            ((MultiCallTopView) this.viewModel).m77020A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m146326R4(Object obj) {
        m146324O4();
    }

    @Override // p153l.ar10
    /* JADX INFO: renamed from: B4 */
    public void mo99604B4(Pair<le10, Boolean> pair) {
        act().setSwipeBackEnable(!jyb.m147520m(((le10) pair.first).m153854v(), new qcj() { // from class: l.ho10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(bf10.m103817W(((BLiveMultiCall) obj).userId));
            }
        }));
        Object obj = pair.first;
        if (((le10) obj).f131693d == 3 && bf10.m103817W(((le10) obj).f131692c.userId)) {
            m146327N4();
        } else {
            super.mo99604B4(pair);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final void m146327N4() {
        psd0.m173633z(this.f121933o);
        this.f121933o = m113231o2(m213811F2().PlayerEvent.onReceiveStreamMembers().m199270g(), false).subscribe(dhw.m115829h(new y20() { // from class: l.io10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116067a.m146328Q4((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m146328Q4(List<String> list) {
        ir10.m141746a("handle stream members size : " + list.size());
        this.f121932n.clear();
        this.f121932n.addAll(list);
        if (this.f121932n.contains(zrv.f205799a.m207631D0())) {
            return;
        }
        m213811F2().MultiCallEvent.selfLeaveCall().mo199273j(Boolean.TRUE);
        super.mo99604B4(new Pair<>(this.f72899j.m190584b4(), this.f72898i.m222761e()));
        psd0.m173633z(this.f121933o);
    }

    @Override // p153l.ar10, p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        act().setSwipeBackEnable(true);
        psd0.m173633z(this.f121933o);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2, l.vp20] */
    @Override // p153l.ar10, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m146324O4();
        duringCreated(C22421c.merge(m213811F2().PlayerEvent.ctypChanged().m199270g(), m213811F2().PlayerEvent.videoSizeChanged().m199270g())).subscribe(dhw.m115825d(new y20() { // from class: l.fo10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100002a.m146326R4(obj);
            }
        }));
        duringCreated(m213810E2().m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.go10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105199a.m146325P4((jsv) obj);
            }
        }));
    }
}
