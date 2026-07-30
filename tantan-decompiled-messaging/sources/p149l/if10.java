package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class if10 extends pat<am40> implements l3m {

    /* JADX INFO: renamed from: i */
    public final MultiCallTopView f112951i;

    /* JADX INFO: renamed from: j */
    public final RoomPusherView f112952j;

    /* JADX INFO: renamed from: k */
    public final Runnable f112953k;

    public if10(bsm<am40> bsmVar, MultiCallTopView multiCallTopView, RoomPusherView roomPusherView) {
        super(bsmVar);
        this.f112953k = new Runnable() { // from class: l.ef10
            @Override // java.lang.Runnable
            public final void run() {
                this.f90795a.m135854W3();
            }
        };
        this.f112951i = multiCallTopView;
        this.f112952j = roomPusherView;
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m135848L3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m135854W3() {
        if (((am40) m206027E2()).m149820r() && ve10.m198135i(this.f188512e) && !r610.m177979N(this)) {
            lsi0.m151593w(R$string.f47495r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m135855X3(soj0 soj0Var) {
        m135861Z3(false, null);
    }

    /* JADX INFO: renamed from: S3 */
    public final C22306c<rwb> m135856S3() {
        return C22306c.merge(C22306c.just(m135859V3()), m206028F2().PlayerEvent.ctypChanged().m172460g().doOnNext(new e30() { // from class: l.ff10
            @Override // p149l.e30
            public final void call(Object obj) {
                yi10.m214879a("ctyp signal:" + ((rwb) obj).f161324a);
            }
        }).distinctUntilChanged(new w9j() { // from class: l.gf10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((rwb) obj).f161324a == 3);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m135857T3() {
        m129296E3(this.f112953k);
        m129320z3(2500L, this.f112953k);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m135858U3(rwb rwbVar) {
        m135861Z3(rwbVar.f161324a == 3, rwbVar);
    }

    /* JADX INFO: renamed from: V3 */
    public final rwb m135859V3() {
        return (rwb) m129297F3(new cm70(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m135860Y3(iqv iqvVar) {
        if (iqvVar.m137796c()) {
            m206028F2().MultiCallEvent.selfLeaveCall().mo172463j(Boolean.TRUE);
            m135861Z3(false, null);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m135861Z3(boolean z, rwb rwbVar) {
        yi10.m214879a("audience setCallSwitch enable:" + z);
        jy00 jy00VarM143839a = new jy00(z, MotionType.multi_call).m143839a(new f30() { // from class: l.hf10
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                if10.m135848L3((Integer) obj, (MotionType) obj2);
            }
        });
        if (z && r610.m177979N(this)) {
            return;
        }
        if (z) {
            jy00VarM143839a.m143840b(new ta10(this.f112951i, this.f112952j, je10.m141092a(rwbVar.f161327d)));
        } else {
            m206028F2().MultiCallEvent.prepareCloseMultiCall().mo172463j(Boolean.FALSE);
        }
        m206028F2().MotionEvent.motionSwitch().mo172463j(jy00VarM143839a);
        m135857T3();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m129296E3(this.f112953k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((am40) m206027E2()).m149815l()).subscribe(ffw.m121197h(new e30() { // from class: l.af10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69146a.m135860Y3((iqv) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.bf10
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f75267a.m135856S3();
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.cf10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80533a.m135858U3((rwb) obj);
            }
        }));
        duringCreated(m206028F2().MultiCallEvent.closeMultiCallMotion().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.df10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85883a.m135855X3((soj0) obj);
            }
        }));
    }
}
