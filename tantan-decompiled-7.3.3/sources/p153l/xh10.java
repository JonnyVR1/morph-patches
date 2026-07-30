package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;

/* JADX INFO: loaded from: classes5.dex */
public class xh10 extends ar10<mu40> {
    public xh10(dum<mu40> dumVar, MultiCallTopView multiCallTopView, td10<mu40> td10Var) {
        super(dumVar, multiCallTopView, td10Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public /* synthetic */ void m210976K4(Boolean bool) {
        this.f72898i.m137019l(bool);
    }

    @Override // p153l.ar10, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(this.f72899j.m190588f4()).map(new qcj() { // from class: l.vh10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(fp10.m126517d((BLiveMultiCall) obj));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.wh10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189078a.m210976K4((Boolean) obj);
            }
        }));
    }
}
