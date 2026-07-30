package p002l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLivePkInfo;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ygd0 extends C0303b {

    /* JADX INFO: renamed from: h */
    public final zgd0 f22872h;

    /* JADX INFO: renamed from: i */
    public bhd0 f22873i;

    /* JADX INFO: renamed from: j */
    public int f22874j;

    public ygd0(zgd0 zgd0Var) {
        super(zgd0Var);
        this.f22874j = -1;
        this.f22872h = zgd0Var;
    }

    /* JADX INFO: renamed from: q1 */
    private MMLiveMediaConfig m26702q1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f22872h.f3829c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f22872h.f3828b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: r1 */
    public static C0303b m26703r1(MotionParams motionParams) {
        if (motionParams.mo5266a() != MotionParams.PusherMotionEnum.MOTION_AUDIENCE_RTC) {
            return null;
        }
        return new ygd0((zgd0) motionParams);
    }

    /* JADX INFO: renamed from: s1 */
    private void m26704s1() {
        this.f3840e.f17745d.m14862U0(m26702q1(), m5270U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleAudience, false), new MMLiveTranscoding());
        this.f3840e.f17745d.m14861T0(1000, 3);
    }

    /* JADX INFO: renamed from: A0 */
    public void m26705A0(MMLiveTranscoding mMLiveTranscoding) {
        super.A0(mMLiveTranscoding);
        if (TextUtils.isEmpty(mMLiveTranscoding.mid) || !mMLiveTranscoding.mid.equals(this.f22872h.f23398l)) {
            return;
        }
        int i = mMLiveTranscoding.ctyp;
        if (i != this.f22874j) {
            fgd0.m13158a("onRecvUserInfo seiInfo=" + mMLiveTranscoding.toString());
            this.f22874j = i;
            this.f22873i.m10330h(i);
        }
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(14).m26424l(mMLiveTranscoding));
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m26706B0() {
        super.B0();
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(1).m26427o(true));
        }
        fgd0.m13158a("onTokenPrivilegeWillExpire");
    }

    /* JADX INFO: renamed from: C0 */
    public void m26707C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.C0(str, i, mMLivePushType);
    }

    /* JADX INFO: renamed from: S */
    public void m26708S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.S(mMLivePushType, i, i2);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(16).m26432t(i).m26423k(i2));
        }
        fgd0.m13158a("onEngineError : rtcType:" + mMLivePushType + ",what:" + i + ",extra:" + i2);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: X0 */
    public void mo5273X0() {
        super.mo5273X0();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: a1 */
    public void mo5276a1() {
        if (NullChecker.a(this.f22873i)) {
            this.f22873i.mo10327c();
        }
        super.mo5276a1();
        m5274Y0();
        this.f22874j = -1;
        fgd0.m13158a("goToEnd");
    }

    /* JADX INFO: renamed from: b */
    public void m26709b(long j, int i) {
        super.b(j, i);
        this.f22873i.m10333m(j);
        this.f22873i.mo10326b();
        fgd0.m13158a("onVideoChannelRemove,uid:" + j);
    }

    /* JADX INFO: renamed from: d0 */
    public void m26710d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.d0(str, j, mMLivePushType);
        fgd0.m13158a("onLocalJoinChannel " + j);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(6));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m26711e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.e0(str, j, mMLivePushType);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo5284i1() {
        return MotionParams.MomoPushType.RTC;
    }

    /* JADX INFO: renamed from: o0 */
    public void m26712o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.o0(j, i, mMLivePushType);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: o1 */
    public int mo5290o1() {
        super.mo5290o1();
        this.f3840e.f17749h.mo14890b(this.f22872h.f23396j);
        this.f3840e.f17749h.mo14891c(this.f22872h.f23397k);
        this.f22873i = new bhd0(this.f22872h.f23398l);
        BLivePkInfo bLivePkInfo = this.f22872h.f23399m;
        if (bLivePkInfo != null && !TextUtils.isEmpty(bLivePkInfo.ongoingId)) {
            this.f22874j = 1;
            this.f22873i.m10330h(1);
        }
        this.f3840e.f17749h.m14892d(this.f22873i);
        this.f3840e.f17745d.m14876i1(m5272W0());
        this.f3840e.f17745d.mo12833N(true);
        this.f3840e.f17745d.m14872e1(true);
        m26704s1();
        return 0;
    }

    public void onRequestChannelKey() {
        super.onRequestChannelKey();
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(1).m26427o(false));
        }
        fgd0.m13158a("onRequestChannelKey");
    }

    /* JADX INFO: renamed from: p1 */
    public void m26713p1() {
        bhd0 bhd0Var = this.f22873i;
        if (bhd0Var != null) {
            bhd0Var.m10331i();
        }
        this.f22874j = -1;
    }

    /* JADX INFO: renamed from: x0 */
    public void m26714x0(long j, int i, int i2) {
        super.x0(j, i, i2);
        fgd0.m13158a("onReceivedFirstVideoFrame ");
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(13));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m26715z0(long j, SurfaceView surfaceView) {
        super.z0(j, surfaceView);
        this.f22873i.m10329g(j, surfaceView);
        this.f22873i.mo10326b();
        fgd0.m13158a("onVideoChannelAdded,uid:" + j);
    }
}
