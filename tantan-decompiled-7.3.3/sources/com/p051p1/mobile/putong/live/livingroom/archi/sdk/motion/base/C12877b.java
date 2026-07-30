package com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import p153l.cgu;
import p153l.eas;
import p153l.l51;
import p153l.nsh0;
import p153l.u1f;
import p153l.x84;
import p153l.xau;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.sdk.motion.base.b */
/* JADX INFO: loaded from: classes4.dex */
public class C12877b extends eas {

    /* JADX INFO: renamed from: a */
    @Nullable
    public x84.InterfaceC21264a f48642a;

    /* JADX INFO: renamed from: b */
    public final MotionParams f48643b;

    /* JADX INFO: renamed from: e */
    public u1f f48646e;

    /* JADX INFO: renamed from: f */
    public Runnable f48647f;

    /* JADX INFO: renamed from: c */
    public boolean f48644c = false;

    /* JADX INFO: renamed from: d */
    public int f48645d = 0;

    /* JADX INFO: renamed from: g */
    public final Gson f48648g = new Gson();

    public C12877b(MotionParams motionParams) {
        this.f48643b = motionParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m73073f1() {
        if (this.f48644c) {
            nsh0.m164608j("[live][motion]", " 执行延迟十秒的end 任务");
            mo73078X0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public <T extends C12877b> T m73074T0(Class<T> cls) {
        return this;
    }

    /* JADX INFO: renamed from: U0 */
    public MMLiveRoomParams m73075U0(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole, boolean z) {
        MMLiveRoomParams mMLiveRoomParams = new MMLiveRoomParams();
        mMLiveRoomParams.role = mMLiveClientRole;
        m73093n1(this.f48643b, mMLiveRoomParams);
        mMLiveRoomParams.userId = zrv.f205799a.m207631D0();
        MotionParams motionParams = this.f48643b;
        mMLiveRoomParams.channel = motionParams.f48640h;
        mMLiveRoomParams.confId = motionParams.f48638f;
        mMLiveRoomParams.channelKey = motionParams.f48639g;
        mMLiveRoomParams.userSig = motionParams.f48641i;
        mMLiveRoomParams.isHost = z;
        return mMLiveRoomParams;
    }

    @NonNull
    /* JADX INFO: renamed from: V0 */
    public MMLiveTranscoding.MMLiveLinkMember m73076V0(String str, float f, float f2, float f3, float f4) {
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = str;
        mMLiveLinkMember.f14656w = f;
        mMLiveLinkMember.f14655h = f2;
        mMLiveLinkMember.f14657x = f3;
        mMLiveLinkMember.f14658y = f4;
        return mMLiveLinkMember;
    }

    /* JADX INFO: renamed from: W0 */
    public cgu m73077W0() {
        cgu cguVar = new cgu();
        cguVar.f81730a = zrv.m221193k().m203483O4();
        MotionParams motionParams = this.f48643b;
        cguVar.f81734e = motionParams.f48635c;
        cguVar.f81733d = motionParams.f48634b;
        cguVar.f81732c = motionParams.f48633a;
        cguVar.f81731b = xau.m209915y(zrv.f205799a.m207651V());
        nsh0.m164608j("LivePkConstant", "userConfig config.appid:" + cguVar.f81730a + ",config.businessType:" + cguVar.f81734e + ",config.provider:" + cguVar.f81733d + "config.roomid:" + cguVar.f81732c + "config.userid:" + cguVar.f81731b);
        return cguVar;
    }

    /* JADX INFO: renamed from: X0 */
    public void mo73078X0() {
        if (this.f48645d == 3) {
            return;
        }
        this.f48645d = 3;
        this.f48646e.f176998g.m179984h(this);
        this.f48646e.f176997f.mo161148a(this);
        if (this.f48647f != null) {
            nsh0.m164608j("[live][motion]", "end 完成 移除延迟10秒的任务");
            l51.m152890J(this.f48647f);
        }
        this.f48644c = false;
        nsh0.m164608j("[live][motion]", "goToEndFlag = false ");
    }

    /* JADX INFO: renamed from: Y0 */
    public void m73079Y0() {
        nsh0.m164608j("[live][motion]", " 开始执行 endPushByType");
        if (!m73084d1()) {
            nsh0.m164608j("[live][motion]", " leaveRoom or stopPush 失败");
            return;
        }
        if (mo73088i1() == MotionParams.MomoPushType.RTMP) {
            nsh0.m164608j("[live][motion]", " stopPush ");
            this.f48646e.f176995d.m170537n1();
        } else if (mo73085e1()) {
            nsh0.m164608j("intl_rtc_up", mo73088i1() + " ， 复用rtc频道 ， 跳过 leave room ");
        } else {
            nsh0.m164608j("[live][motion]", " leaveRoom ");
            this.f48646e.f176995d.m170517X0();
        }
        nsh0.m164608j("PusherMotionInstance", "PusherMotion end and pushEngine leaveRoom");
    }

    /* JADX INFO: renamed from: Z0 */
    public MotionParams.PusherMotionEnum m73080Z0() {
        return this.f48643b.mo73071a();
    }

    /* JADX INFO: renamed from: a1 */
    public void mo73081a1() {
        if (this.f48645d != 1) {
            return;
        }
        this.f48645d = 2;
        this.f48646e.f176998g.m179985i(this);
        this.f48644c = true;
        Runnable runnable = new Runnable() { // from class: l.pob0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153388a.m73073f1();
            }
        };
        this.f48647f = runnable;
        l51.m152888H(this.f48646e.f176992a, runnable, 10000L);
    }

    /* JADX INFO: renamed from: b1 */
    public void m73082b1(u1f u1fVar) {
        this.f48646e = u1fVar;
        u1fVar.f176997f.mo161149b(this);
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m73083c1(MotionParams.PusherMotionEnum pusherMotionEnum) {
        return pusherMotionEnum == m73080Z0();
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m73084d1() {
        boolean zM73089j1 = this.f48646e.f176998g.mo133182a().m73089j1(mo73088i1());
        boolean z = this.f48646e.f176998g.mo133182a() == this;
        nsh0.m164608j("[live][motion]", " is TYPE_START_PUSH " + zM73089j1 + "，isCurrentPusherMotionThis  " + z);
        return !zM73089j1 || z;
    }

    /* JADX INFO: renamed from: e1 */
    public boolean mo73085e1() {
        return false;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: g0 */
    public void mo70881g0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo70881g0(mMLivePushType);
        if (this.f48644c) {
            mo73078X0();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void mo73086g1() {
    }

    /* JADX INFO: renamed from: h1 */
    public void m73087h1() {
    }

    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo73088i1() {
        return MotionParams.MomoPushType.RTMP;
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m73089j1(MotionParams.MomoPushType momoPushType) {
        return momoPushType == mo73088i1();
    }

    /* JADX INFO: renamed from: k1 */
    public void m73090k1() {
        this.f48643b.f48637e = false;
    }

    /* JADX INFO: renamed from: l1 */
    public void m73091l1(@Nullable x84.InterfaceC21264a interfaceC21264a) {
        this.f48642a = interfaceC21264a;
    }

    /* JADX INFO: renamed from: n1 */
    public void m73093n1(MotionParams motionParams, MMLiveRoomParams mMLiveRoomParams) {
        if (motionParams.f48636d.contains("momo")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
            return;
        }
        if (motionParams.f48636d.contains("agora")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
        } else if (motionParams.f48636d.contains("tencent")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
        } else if (motionParams.f48636d.contains("volcengine")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc;
        }
    }

    /* JADX INFO: renamed from: o1 */
    public int mo73094o1() {
        if (this.f48645d != 0) {
            return -1;
        }
        this.f48645d = 1;
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    public void mo73092m1(z20<Integer, Object> z20Var) {
    }
}
