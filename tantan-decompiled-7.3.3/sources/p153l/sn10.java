package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class sn10 extends qct<ou40> implements c6m {

    /* JADX INFO: renamed from: i */
    public final MultiCallTopView f169637i;

    /* JADX INFO: renamed from: j */
    public final RoomPusherView f169638j;

    /* JADX INFO: renamed from: k */
    public final Runnable f169639k;

    public sn10(dum<ou40> dumVar, MultiCallTopView multiCallTopView, RoomPusherView roomPusherView) {
        super(dumVar);
        this.f169639k = new Runnable() { // from class: l.on10
            @Override // java.lang.Runnable
            public final void run() {
                this.f148046a.m186866W3();
            }
        };
        this.f169637i = multiCallTopView;
        this.f169638j = roomPusherView;
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m186860L3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m186866W3() {
        if (((ou40) m213810E2()).m202195r() && fn10.m126341i(this.f196918e) && !bf10.m103808N(this)) {
            o1j0.m165649w(R$string.f48343r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m186867X3(vxj0 vxj0Var) {
        m186873Z3(false, null);
    }

    /* JADX INFO: renamed from: S3 */
    public final C22421c<fyb> m186868S3() {
        return C22421c.merge(C22421c.just(m186871V3()), m213811F2().PlayerEvent.ctypChanged().m199270g().doOnNext(new y20() { // from class: l.pn10
            @Override // p153l.y20
            public final void call(Object obj) {
                ir10.m141746a("ctyp signal:" + ((fyb) obj).f101357a);
            }
        }).distinctUntilChanged(new qcj() { // from class: l.qn10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((fyb) obj).f101357a == 3);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m186869T3() {
        m138855E3(this.f169639k);
        m138879z3(2500L, this.f169639k);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m186870U3(fyb fybVar) {
        m186873Z3(fybVar.f101357a == 3, fybVar);
    }

    /* JADX INFO: renamed from: V3 */
    public final fyb m186871V3() {
        return (fyb) m138856F3(new iu70(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m186872Y3(jsv jsvVar) {
        if (jsvVar.m146877c()) {
            m213811F2().MultiCallEvent.selfLeaveCall().mo199273j(Boolean.TRUE);
            m186873Z3(false, null);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m186873Z3(boolean z, fyb fybVar) {
        ir10.m141746a("audience setCallSwitch enable:" + z);
        t610 t610VarM189491a = new t610(z, MotionType.multi_call).m189491a(new z20() { // from class: l.rn10
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                sn10.m186860L3((Integer) obj, (MotionType) obj2);
            }
        });
        if (z && bf10.m103808N(this)) {
            return;
        }
        if (z) {
            t610VarM189491a.m189492b(new dj10(this.f169637i, this.f169638j, tm10.m191715a(fybVar.f101360d)));
        } else {
            m213811F2().MultiCallEvent.prepareCloseMultiCall().mo199273j(Boolean.FALSE);
        }
        m213811F2().MotionEvent.motionSwitch().mo199273j(t610VarM189491a);
        m186869T3();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m138855E3(this.f169639k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((ou40) m213810E2()).m202192l()).subscribe(dhw.m115829h(new y20() { // from class: l.kn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127548a.m186872Y3((jsv) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.ln10
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f132735a.m186868S3();
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.mn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137646a.m186870U3((fyb) obj);
            }
        }));
        duringCreated(m213811F2().MultiCallEvent.closeMultiCallMotion().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.nn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142755a.m186867X3((vxj0) obj);
            }
        }));
    }
}
