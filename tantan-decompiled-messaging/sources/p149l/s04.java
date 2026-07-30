package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;

/* JADX INFO: loaded from: classes5.dex */
public class s04 extends pat<pn40> implements l3m {

    /* JADX INFO: renamed from: i */
    public final CallWidgetView f161719i;

    /* JADX INFO: renamed from: j */
    public final LiveCallView f161720j;

    /* JADX INFO: renamed from: k */
    public final RoomPusherView f161721k;

    public s04(bsm bsmVar, CallWidgetView callWidgetView, LiveCallView liveCallView, RoomPusherView roomPusherView) {
        super(bsmVar);
        this.f161719i = callWidgetView;
        this.f161720j = liveCallView;
        this.f161721k = roomPusherView;
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m181817J3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public void m181821O3(iqv iqvVar) {
        if (iqvVar.m137796c()) {
            m181824R3(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final void m181822N3(BLiveRoom bLiveRoom) {
        m181824R3(bLiveRoom.callSwitch.f44346on & (!"obs".equals(((pn40) m206027E2()).mo149813j().liveMode)));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m181823P3(LiveCallMessage liveCallMessage) {
        if (liveCallMessage.m71823is(0)) {
            m181824R3(true);
        } else if (liveCallMessage.m71823is(1)) {
            m181824R3(false);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m181824R3(boolean z) {
        h54.m129377d("audience setCallSwitch enable:" + z);
        jy00 jy00Var = new jy00(z, MotionType.multi_connect);
        if (z) {
            jy00Var.m143840b(new a34(this.f161719i, this.f161720j, this.f161721k)).m143839a(new f30() { // from class: l.r04
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    s04.m181817J3((Integer) obj, (MotionType) obj2);
                }
            });
        } else {
            m206028F2().CallEvent.roomCall().mo172464m(Boolean.FALSE);
        }
        m206028F2().MotionEvent.motionSwitch().mo172463j(jy00Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((pn40) m206027E2()).m132160q1().m189101f()).subscribe(ffw.m121193d(new e30() { // from class: l.o04
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141285a.m181823P3((LiveCallMessage) obj);
            }
        }));
        duringCreated(((pn40) m206027E2()).m170393A2().m175588f()).subscribe(ffw.m121193d(new e30() { // from class: l.p04
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146540a.m181822N3((BLiveRoom) obj);
            }
        }));
        duringCreated(((pn40) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.q04
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152000a.m181821O3((iqv) obj);
            }
        }));
    }
}
