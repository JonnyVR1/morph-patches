package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;

/* JADX INFO: loaded from: classes5.dex */
public class pl10 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public MultiPkTimerView f150052i;

    public pl10(bsm bsmVar, MultiPkTimerView multiPkTimerView) {
        super(bsmVar);
        this.f150052i = multiPkTimerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public /* synthetic */ void m170074M3(soj0 soj0Var) {
        m170076N3();
    }

    /* JADX INFO: renamed from: L3 */
    public final void m170075L3() {
        Boolean bool = (Boolean) m129297F3(new jk10(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133471a();
        if (c12714bMo133471a == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            return;
        }
        f110 f110Var = (f110) c12714bMo133471a;
        f110Var.f94035q = bool.booleanValue() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVYQ1ZRSEJPNUtDTEw1STRDWjUzVjRCU1NINEFNNDEzIiwidyI6NzUwLCJoIjo3NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjIwODcxOTk3NjUzMTU1NDU0NH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlpUQVIzWDRFWFhLUTRXQVdaSDI3QldDS0JWVlhMUTEyIiwidyI6Mzc1LCJoIjozNzUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTg0ODg4NjEwMzA5NDc0MDU1fQ.png";
        f110Var.m119089K1();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m170076N3() {
        xdl0.m208344M(this.f150052i, false);
        m170075L3();
        m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(3));
    }

    /* JADX INFO: renamed from: O3 */
    public final void m170077O3(LongLinkLiveMultiPk.MultiPk multiPk) {
        xdl0.m208344M(this.f150052i, true);
        m170075L3();
        m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(4));
    }

    /* JADX INFO: renamed from: P3 */
    public void m170078P3(int i, boolean z) {
        this.f150052i.m75885l0(i, z);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().MultiPkEventGroup.multiPkOnStart().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.nl10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139501a.m170077O3((LongLinkLiveMultiPk.MultiPk) obj);
            }
        }));
        duringCreated(m206028F2().MultiPkEventGroup.multiPkOnPunishing().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.nl10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139501a.m170077O3((LongLinkLiveMultiPk.MultiPk) obj);
            }
        }));
        duringCreated(m206028F2().MultiPkEventGroup.multiPkOnEnd().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ol10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144473a.m170074M3((soj0) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        xdl0.m208344M(this.f150052i, false);
    }
}
