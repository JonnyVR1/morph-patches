package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;

/* JADX INFO: loaded from: classes5.dex */
public class zt10 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public MultiPkTimerView f205908i;

    public zt10(dum dumVar, MultiPkTimerView multiPkTimerView) {
        super(dumVar);
        this.f205908i = multiPkTimerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public /* synthetic */ void m221382M3(vxj0 vxj0Var) {
        m221384N3();
    }

    /* JADX INFO: renamed from: L3 */
    public final void m221383L3() {
        Boolean bool = (Boolean) m138856F3(new ts10(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133182a();
        if (c12877bMo133182a == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            return;
        }
        p910 p910Var = (p910) c12877bMo133182a;
        p910Var.f151087q = bool.booleanValue() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVYQ1ZRSEJPNUtDTEw1STRDWjUzVjRCU1NINEFNNDEzIiwidyI6NzUwLCJoIjo3NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjIwODcxOTk3NjUzMTU1NDU0NH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlpUQVIzWDRFWFhLUTRXQVdaSDI3QldDS0JWVlhMUTEyIiwidyI6Mzc1LCJoIjozNzUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTg0ODg4NjEwMzA5NDc0MDU1fQ.png";
        p910Var.m171314K1();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m221384N3() {
        bnl0.m105524M(this.f205908i, false);
        m221383L3();
        m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(3));
    }

    /* JADX INFO: renamed from: O3 */
    public final void m221385O3(LongLinkLiveMultiPk.MultiPk multiPk) {
        bnl0.m105524M(this.f205908i, true);
        m221383L3();
        m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(4));
    }

    /* JADX INFO: renamed from: P3 */
    public void m221386P3(int i, boolean z) {
        this.f205908i.m77068l0(i, z);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().MultiPkEventGroup.multiPkOnStart().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.xt10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196178a.m221385O3((LongLinkLiveMultiPk.MultiPk) obj);
            }
        }));
        duringCreated(m213811F2().MultiPkEventGroup.multiPkOnPunishing().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.xt10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196178a.m221385O3((LongLinkLiveMultiPk.MultiPk) obj);
            }
        }));
        duringCreated(m213811F2().MultiPkEventGroup.multiPkOnEnd().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.yt10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201481a.m221382M3((vxj0) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        bnl0.m105524M(this.f205908i, false);
    }
}
