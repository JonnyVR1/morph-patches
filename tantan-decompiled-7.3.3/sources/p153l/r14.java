package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;

/* JADX INFO: loaded from: classes5.dex */
public class r14 extends qct<dw40> implements c6m {

    /* JADX INFO: renamed from: i */
    public final CallWidgetView f160754i;

    /* JADX INFO: renamed from: j */
    public final LiveCallView f160755j;

    /* JADX INFO: renamed from: k */
    public final RoomPusherView f160756k;

    public r14(dum dumVar, CallWidgetView callWidgetView, LiveCallView liveCallView, RoomPusherView roomPusherView) {
        super(dumVar);
        this.f160754i = callWidgetView;
        this.f160755j = liveCallView;
        this.f160756k = roomPusherView;
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m179357J3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public void m179361O3(jsv jsvVar) {
        if (jsvVar.m146877c()) {
            m179364R3(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final void m179362N3(BLiveRoom bLiveRoom) {
        m179364R3(bLiveRoom.callSwitch.f45194on & (!"obs".equals(((dw40) m213810E2()).mo183435j().liveMode)));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m179363P3(LiveCallMessage liveCallMessage) {
        if (liveCallMessage.m73006is(0)) {
            m179364R3(true);
        } else if (liveCallMessage.m73006is(1)) {
            m179364R3(false);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m179364R3(boolean z) {
        g64.m129083d("audience setCallSwitch enable:" + z);
        t610 t610Var = new t610(z, MotionType.multi_connect);
        if (z) {
            t610Var.m189492b(new z34(this.f160754i, this.f160755j, this.f160756k)).m189491a(new z20() { // from class: l.q14
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    r14.m179357J3((Integer) obj, (MotionType) obj2);
                }
            });
        } else {
            m213811F2().CallEvent.roomCall().mo199274m(Boolean.FALSE);
        }
        m213811F2().MotionEvent.motionSwitch().mo199273j(t610Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((dw40) m213810E2()).m168545q1().m98283f()).subscribe(dhw.m115825d(new y20() { // from class: l.n14
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139722a.m179363P3((LiveCallMessage) obj);
            }
        }));
        duringCreated(((dw40) m213810E2()).m118363A2().m122890f()).subscribe(dhw.m115825d(new y20() { // from class: l.o14
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144623a.m179362N3((BLiveRoom) obj);
            }
        }));
        duringCreated(((dw40) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.p14
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150131a.m179361O3((jsv) obj);
            }
        }));
    }
}
