package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;

/* JADX INFO: loaded from: classes5.dex */
public class oh10 extends qct<mu40> {

    /* JADX INFO: renamed from: i */
    public MultiCallTopView f147332i;

    public oh10(dum<mu40> dumVar, MultiCallTopView multiCallTopView) {
        super(dumVar);
        this.f147332i = multiCallTopView;
        m153103z2(new dm10(dumVar));
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m167678K3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m167681N3(vxj0 vxj0Var) {
        m167684R3();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m167682O3(Integer num) {
        bf10.m103822a0(this, this.f196918e, num.intValue(), 5);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m167683P3(ep10 ep10Var) {
        x6t x6tVar = this.f196918e.f90824j;
        MotionType motionType = MotionType.multi_call;
        if (x6tVar.m209548L3(motionType)) {
            return;
        }
        ir10.m141746a("startMultiCallMode role:" + ep10Var.getRole() + " orderId = " + ep10Var.getOrderId());
        m213811F2().MotionEvent.motionSwitch().mo199273j(new t610(true, motionType).m189492b(new dj10(this.f147332i, ep10Var)).m189491a(new z20() { // from class: l.nh10
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                oh10.m167678K3((Integer) obj, (MotionType) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public final void m167684R3() {
        ir10.m141746a("stopMultiCallMode");
        m213811F2().MotionEvent.motionSwitch().mo199273j(new t610(false, MotionType.multi_call));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().MultiCallEvent.startLiveMultiCall(), new y20() { // from class: l.kh10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126683a.m167683P3((ep10) obj);
            }
        });
        m138863h3(m213811F2().MultiCallEvent.closeMultiCallMotion(), new y20() { // from class: l.lh10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132063a.m167681N3((vxj0) obj);
            }
        });
        m138863h3(m213811F2().MultiCallEvent.openMultiCallWithTab(), new y20() { // from class: l.mh10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136816a.m167682O3((Integer) obj);
            }
        });
    }
}
