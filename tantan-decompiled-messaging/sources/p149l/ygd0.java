package p149l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLivePkInfo;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ygd0 extends C12714b {

    /* JADX INFO: renamed from: h */
    public final zgd0 f198156h;

    /* JADX INFO: renamed from: i */
    public bhd0 f198157i;

    /* JADX INFO: renamed from: j */
    public int f198158j;

    public ygd0(zgd0 zgd0Var) {
        super(zgd0Var);
        this.f198158j = -1;
        this.f198156h = zgd0Var;
    }

    /* JADX INFO: renamed from: q1 */
    private MMLiveMediaConfig m214636q1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f198156h.f47787c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f198156h.f47786b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: r1 */
    public static C12714b m214637r1(MotionParams motionParams) {
        if (motionParams.mo71888a() != MotionParams.PusherMotionEnum.MOTION_AUDIENCE_RTC) {
            return null;
        }
        return new ygd0((zgd0) motionParams);
    }

    /* JADX INFO: renamed from: s1 */
    private void m214638s1() {
        this.f47798e.f152052d.m133211U0(m214636q1(), m71892U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleAudience, false), new MMLiveTranscoding());
        this.f47798e.f152052d.m133210T0(1000, 3);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: A0 */
    public void mo110340A0(MMLiveTranscoding mMLiveTranscoding) {
        super.mo110340A0(mMLiveTranscoding);
        if (TextUtils.isEmpty(mMLiveTranscoding.mid) || !mMLiveTranscoding.mid.equals(this.f198156h.f203037l)) {
            return;
        }
        int i = mMLiveTranscoding.ctyp;
        if (i != this.f198158j) {
            fgd0.m121206a("onRecvUserInfo seiInfo=" + mMLiveTranscoding.toString());
            this.f198158j = i;
            this.f198157i.m101821h(i);
        }
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(14).m213295l(mMLiveTranscoding));
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: B0 */
    public void mo110341B0() {
        super.mo110341B0();
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(1).m213298o(true));
        }
        fgd0.m121206a("onTokenPrivilegeWillExpire");
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: C0 */
    public void mo110342C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110342C0(str, i, mMLivePushType);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: S */
    public void mo110350S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo110350S(mMLivePushType, i, i2);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(16).m213303t(i).m213294k(i2));
        }
        fgd0.m121206a("onEngineError : rtcType:" + mMLivePushType + ",what:" + i + ",extra:" + i2);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: X0 */
    public void mo71895X0() {
        super.mo71895X0();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: a1 */
    public void mo71898a1() {
        if (NullChecker.m81303a(this.f198157i)) {
            this.f198157i.mo101818c();
        }
        super.mo71898a1();
        m71896Y0();
        this.f198158j = -1;
        fgd0.m121206a("goToEnd");
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: b */
    public void mo110355b(long j, int i) {
        super.mo110355b(j, i);
        this.f198157i.m101824m(j);
        this.f198157i.mo101817b();
        fgd0.m121206a("onVideoChannelRemove,uid:" + j);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: d0 */
    public void mo110356d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110356d0(str, j, mMLivePushType);
        fgd0.m121206a("onLocalJoinChannel " + j);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(6));
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e0 */
    public void mo110358e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110358e0(str, j, mMLivePushType);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo71905i1() {
        return MotionParams.MomoPushType.RTC;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: o0 */
    public void mo110360o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110360o0(j, i, mMLivePushType);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: o1 */
    public int mo71911o1() {
        super.mo71911o1();
        this.f47798e.f152056h.mo133283b(this.f198156h.f203035j);
        this.f47798e.f152056h.mo133284c(this.f198156h.f203036k);
        this.f198157i = new bhd0(this.f198156h.f203037l);
        BLivePkInfo bLivePkInfo = this.f198156h.f203038m;
        if (bLivePkInfo != null && !TextUtils.isEmpty(bLivePkInfo.ongoingId)) {
            this.f198158j = 1;
            this.f198157i.m101821h(1);
        }
        this.f47798e.f152056h.m133285d(this.f198157i);
        this.f47798e.f152052d.m133225i1(m71894W0());
        this.f47798e.f152052d.mo118673N(true);
        this.f47798e.f152052d.m133221e1(true);
        m214638s1();
        return 0;
    }

    @Override // p149l.d8s, p149l.g4m
    public void onRequestChannelKey() {
        super.onRequestChannelKey();
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(1).m213298o(false));
        }
        fgd0.m121206a("onRequestChannelKey");
    }

    /* JADX INFO: renamed from: p1 */
    public void m214639p1() {
        bhd0 bhd0Var = this.f198157i;
        if (bhd0Var != null) {
            bhd0Var.m101822i();
        }
        this.f198158j = -1;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: x0 */
    public void mo110365x0(long j, int i, int i2) {
        super.mo110365x0(j, i, i2);
        fgd0.m121206a("onReceivedFirstVideoFrame ");
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(13));
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: z0 */
    public void mo110366z0(long j, SurfaceView surfaceView) {
        super.mo110366z0(j, surfaceView);
        this.f198157i.m101820g(j, surfaceView);
        this.f198157i.mo101817b();
        fgd0.m121206a("onVideoChannelAdded,uid:" + j);
    }
}
