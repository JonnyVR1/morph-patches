package com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import l.beu;
import l.d8s;
import l.e51;
import l.f30;
import l.gkh0;
import l.w8u;
import l.ypv;
import p002l.q0f;
import p002l.y74;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.sdk.motion.base.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0303b extends d8s {

    /* JADX INFO: renamed from: a */
    @Nullable
    public y74.InterfaceC0911a f3836a;

    /* JADX INFO: renamed from: b */
    public final MotionParams f3837b;

    /* JADX INFO: renamed from: e */
    public q0f f3840e;

    /* JADX INFO: renamed from: f */
    public Runnable f3841f;

    /* JADX INFO: renamed from: c */
    public boolean f3838c = false;

    /* JADX INFO: renamed from: d */
    public int f3839d = 0;

    /* JADX INFO: renamed from: g */
    public final Gson f3842g = new Gson();

    public C0303b(MotionParams motionParams) {
        this.f3837b = motionParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m5268f1() {
        if (this.f3838c) {
            gkh0.j("[live][motion]", " 执行延迟十秒的end 任务");
            mo5273X0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public <T extends C0303b> T m5269T0(Class<T> cls) {
        return this;
    }

    /* JADX INFO: renamed from: U0 */
    public MMLiveRoomParams m5270U0(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole, boolean z) {
        MMLiveRoomParams mMLiveRoomParams = new MMLiveRoomParams();
        mMLiveRoomParams.role = mMLiveClientRole;
        m5289n1(this.f3837b, mMLiveRoomParams);
        mMLiveRoomParams.userId = ypv.a.D0();
        MotionParams motionParams = this.f3837b;
        mMLiveRoomParams.channel = motionParams.f3834h;
        mMLiveRoomParams.confId = motionParams.f3832f;
        mMLiveRoomParams.channelKey = motionParams.f3833g;
        mMLiveRoomParams.userSig = motionParams.f3835i;
        mMLiveRoomParams.isHost = z;
        return mMLiveRoomParams;
    }

    @NonNull
    /* JADX INFO: renamed from: V0 */
    public MMLiveTranscoding.MMLiveLinkMember m5271V0(String str, float f, float f2, float f3, float f4) {
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = str;
        mMLiveLinkMember.w = f;
        mMLiveLinkMember.h = f2;
        mMLiveLinkMember.x = f3;
        mMLiveLinkMember.y = f4;
        return mMLiveLinkMember;
    }

    /* JADX INFO: renamed from: W0 */
    public beu m5272W0() {
        beu beuVar = new beu();
        beuVar.a = ypv.k().O4();
        MotionParams motionParams = this.f3837b;
        beuVar.e = motionParams.f3829c;
        beuVar.d = motionParams.f3828b;
        beuVar.c = motionParams.f3827a;
        beuVar.b = w8u.y(ypv.a.V());
        gkh0.j("LivePkConstant", "userConfig config.appid:" + beuVar.a + ",config.businessType:" + beuVar.e + ",config.provider:" + beuVar.d + "config.roomid:" + beuVar.c + "config.userid:" + beuVar.b);
        return beuVar;
    }

    /* JADX INFO: renamed from: X0 */
    public void mo5273X0() {
        if (this.f3839d == 3) {
            return;
        }
        this.f3839d = 3;
        this.f3840e.f17748g.m14931h(this);
        this.f3840e.f17747f.mo12700a(this);
        if (this.f3841f != null) {
            gkh0.j("[live][motion]", "end 完成 移除延迟10秒的任务");
            e51.J(this.f3841f);
        }
        this.f3838c = false;
        gkh0.j("[live][motion]", "goToEndFlag = false ");
    }

    /* JADX INFO: renamed from: Y0 */
    public void m5274Y0() {
        gkh0.j("[live][motion]", " 开始执行 endPushByType");
        if (!m5279d1()) {
            gkh0.j("[live][motion]", " leaveRoom or stopPush 失败");
            return;
        }
        if (mo5284i1() == MotionParams.MomoPushType.RTMP) {
            gkh0.j("[live][motion]", " stopPush ");
            this.f3840e.f17745d.m14881n1();
        } else if (mo5280e1()) {
            gkh0.j("intl_rtc_up", mo5284i1() + " ， 复用rtc频道 ， 跳过 leave room ");
        } else {
            gkh0.j("[live][motion]", " leaveRoom ");
            this.f3840e.f17745d.m14865X0();
        }
        gkh0.j("PusherMotionInstance", "PusherMotion end and pushEngine leaveRoom");
    }

    /* JADX INFO: renamed from: Z0 */
    public MotionParams.PusherMotionEnum m5275Z0() {
        return this.f3837b.mo5266a();
    }

    /* JADX INFO: renamed from: a1 */
    public void mo5276a1() {
        if (this.f3839d != 1) {
            return;
        }
        this.f3839d = 2;
        this.f3840e.f17748g.m14932i(this);
        this.f3838c = true;
        Runnable runnable = new Runnable() { // from class: l.lgb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14851a.m5268f1();
            }
        };
        this.f3841f = runnable;
        e51.H(this.f3840e.f17742a, runnable, 10000L);
    }

    /* JADX INFO: renamed from: b1 */
    public void m5277b1(q0f q0fVar) {
        this.f3840e = q0fVar;
        q0fVar.f17747f.mo12701b(this);
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m5278c1(MotionParams.PusherMotionEnum pusherMotionEnum) {
        return pusherMotionEnum == m5275Z0();
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m5279d1() {
        boolean zM5285j1 = this.f3840e.f17748g.mo14924a().m5285j1(mo5284i1());
        boolean z = this.f3840e.f17748g.mo14924a() == this;
        gkh0.j("[live][motion]", " is TYPE_START_PUSH " + zM5285j1 + "，isCurrentPusherMotionThis  " + z);
        return !zM5285j1 || z;
    }

    /* JADX INFO: renamed from: e1 */
    public boolean mo5280e1() {
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public void m5281g0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.g0(mMLivePushType);
        if (this.f3838c) {
            mo5273X0();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void mo5282g1() {
    }

    /* JADX INFO: renamed from: h1 */
    public void m5283h1() {
    }

    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo5284i1() {
        return MotionParams.MomoPushType.RTMP;
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m5285j1(MotionParams.MomoPushType momoPushType) {
        return momoPushType == mo5284i1();
    }

    /* JADX INFO: renamed from: k1 */
    public void m5286k1() {
        this.f3837b.f3831e = false;
    }

    /* JADX INFO: renamed from: l1 */
    public void m5287l1(@Nullable y74.InterfaceC0911a interfaceC0911a) {
        this.f3836a = interfaceC0911a;
    }

    /* JADX INFO: renamed from: n1 */
    public void m5289n1(MotionParams motionParams, MMLiveRoomParams mMLiveRoomParams) {
        if (motionParams.f3830d.contains("momo")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
            return;
        }
        if (motionParams.f3830d.contains("agora")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
        } else if (motionParams.f3830d.contains("tencent")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
        } else if (motionParams.f3830d.contains("volcengine")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc;
        }
    }

    /* JADX INFO: renamed from: o1 */
    public int mo5290o1() {
        if (this.f3839d != 0) {
            return -1;
        }
        this.f3839d = 1;
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    public void mo5288m1(f30<Integer, Object> f30Var) {
    }
}
