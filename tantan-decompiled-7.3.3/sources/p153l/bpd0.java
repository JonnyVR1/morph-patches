package p153l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLivePkInfo;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class bpd0 extends C12877b {

    /* JADX INFO: renamed from: h */
    public final cpd0 f77752h;

    /* JADX INFO: renamed from: i */
    public epd0 f77753i;

    /* JADX INFO: renamed from: j */
    public int f77754j;

    public bpd0(cpd0 cpd0Var) {
        super(cpd0Var);
        this.f77754j = -1;
        this.f77752h = cpd0Var;
    }

    /* JADX INFO: renamed from: q1 */
    private MMLiveMediaConfig m105802q1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f77752h.f48635c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f77752h.f48634b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: r1 */
    public static C12877b m105803r1(MotionParams motionParams) {
        if (motionParams.mo73071a() != MotionParams.PusherMotionEnum.MOTION_AUDIENCE_RTC) {
            return null;
        }
        return new bpd0((cpd0) motionParams);
    }

    /* JADX INFO: renamed from: s1 */
    private void m105804s1() {
        this.f48646e.f176995d.m170514U0(m105802q1(), m73075U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleAudience, false), new MMLiveTranscoding());
        this.f48646e.f176995d.m170513T0(1000, 3);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: A0 */
    public void mo105805A0(MMLiveTranscoding mMLiveTranscoding) {
        super.mo105805A0(mMLiveTranscoding);
        if (TextUtils.isEmpty(mMLiveTranscoding.mid) || !mMLiveTranscoding.mid.equals(this.f77752h.f82993l)) {
            return;
        }
        int i = mMLiveTranscoding.ctyp;
        if (i != this.f77754j) {
            iod0.m141294a("onRecvUserInfo seiInfo=" + mMLiveTranscoding.toString());
            this.f77754j = i;
            this.f77753i.m121854h(i);
        }
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(14).m209679l(mMLiveTranscoding));
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: B0 */
    public void mo96681B0() {
        super.mo96681B0();
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(1).m209682o(true));
        }
        iod0.m141294a("onTokenPrivilegeWillExpire");
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: C0 */
    public void mo96682C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96682C0(str, i, mMLivePushType);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: S */
    public void mo96683S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo96683S(mMLivePushType, i, i2);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(16).m209687t(i).m209678k(i2));
        }
        iod0.m141294a("onEngineError : rtcType:" + mMLivePushType + ",what:" + i + ",extra:" + i2);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: X0 */
    public void mo73078X0() {
        super.mo73078X0();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: a1 */
    public void mo73081a1() {
        if (NullChecker.m82486a(this.f77753i)) {
            this.f77753i.mo100755c();
        }
        super.mo73081a1();
        m73079Y0();
        this.f77754j = -1;
        iod0.m141294a("goToEnd");
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: b */
    public void mo96685b(long j, int i) {
        super.mo96685b(j, i);
        this.f77753i.m121857m(j);
        this.f77753i.mo100754b();
        iod0.m141294a("onVideoChannelRemove,uid:" + j);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: d0 */
    public void mo96686d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96686d0(str, j, mMLivePushType);
        iod0.m141294a("onLocalJoinChannel " + j);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(6));
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e0 */
    public void mo96687e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96687e0(str, j, mMLivePushType);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo73088i1() {
        return MotionParams.MomoPushType.RTC;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: o0 */
    public void mo96689o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96689o0(j, i, mMLivePushType);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: o1 */
    public int mo73094o1() {
        super.mo73094o1();
        this.f48646e.f176999h.mo113412b(this.f77752h.f82991j);
        this.f48646e.f176999h.mo113413c(this.f77752h.f82992k);
        this.f77753i = new epd0(this.f77752h.f82993l);
        BLivePkInfo bLivePkInfo = this.f77752h.f82994m;
        if (bLivePkInfo != null && !TextUtils.isEmpty(bLivePkInfo.ongoingId)) {
            this.f77754j = 1;
            this.f77753i.m121854h(1);
        }
        this.f48646e.f176999h.m179837d(this.f77753i);
        this.f48646e.f176995d.m170531i1(m73077W0());
        this.f48646e.f176995d.mo170509N(true);
        this.f48646e.f176995d.m170526e1(true);
        m105804s1();
        return 0;
    }

    @Override // p153l.eas, p153l.w6m
    public void onRequestChannelKey() {
        super.onRequestChannelKey();
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(1).m209682o(false));
        }
        iod0.m141294a("onRequestChannelKey");
    }

    /* JADX INFO: renamed from: p1 */
    public void m105806p1() {
        epd0 epd0Var = this.f77753i;
        if (epd0Var != null) {
            epd0Var.m121855i();
        }
        this.f77754j = -1;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: x0 */
    public void mo105807x0(long j, int i, int i2) {
        super.mo105807x0(j, i, i2);
        iod0.m141294a("onReceivedFirstVideoFrame ");
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(13));
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: z0 */
    public void mo96694z0(long j, SurfaceView surfaceView) {
        super.mo96694z0(j, surfaceView);
        this.f77753i.m121853g(j, surfaceView);
        this.f77753i.mo100754b();
        iod0.m141294a("onVideoChannelAdded,uid:" + j);
    }
}
