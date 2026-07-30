package com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import p149l.beu;
import p149l.d8s;
import p149l.e51;
import p149l.f30;
import p149l.gkh0;
import p149l.q0f;
import p149l.w8u;
import p149l.y74;
import p149l.ypv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.sdk.motion.base.b */
/* JADX INFO: loaded from: classes4.dex */
public class C12714b extends d8s {

    /* JADX INFO: renamed from: a */
    @Nullable
    public y74.InterfaceC21330a f47794a;

    /* JADX INFO: renamed from: b */
    public final MotionParams f47795b;

    /* JADX INFO: renamed from: e */
    public q0f f47798e;

    /* JADX INFO: renamed from: f */
    public Runnable f47799f;

    /* JADX INFO: renamed from: c */
    public boolean f47796c = false;

    /* JADX INFO: renamed from: d */
    public int f47797d = 0;

    /* JADX INFO: renamed from: g */
    public final Gson f47800g = new Gson();

    public C12714b(MotionParams motionParams) {
        this.f47795b = motionParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m71890f1() {
        if (this.f47796c) {
            gkh0.m126627j("[live][motion]", " 执行延迟十秒的end 任务");
            mo71895X0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public <T extends C12714b> T m71891T0(Class<T> cls) {
        return this;
    }

    /* JADX INFO: renamed from: U0 */
    public MMLiveRoomParams m71892U0(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole, boolean z) {
        MMLiveRoomParams mMLiveRoomParams = new MMLiveRoomParams();
        mMLiveRoomParams.role = mMLiveClientRole;
        m71910n1(this.f47795b, mMLiveRoomParams);
        mMLiveRoomParams.userId = ypv.f199493a.m199309D0();
        MotionParams motionParams = this.f47795b;
        mMLiveRoomParams.channel = motionParams.f47792h;
        mMLiveRoomParams.confId = motionParams.f47790f;
        mMLiveRoomParams.channelKey = motionParams.f47791g;
        mMLiveRoomParams.userSig = motionParams.f47793i;
        mMLiveRoomParams.isHost = z;
        return mMLiveRoomParams;
    }

    @NonNull
    /* JADX INFO: renamed from: V0 */
    public MMLiveTranscoding.MMLiveLinkMember m71893V0(String str, float f, float f2, float f3, float f4) {
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = str;
        mMLiveLinkMember.f13962w = f;
        mMLiveLinkMember.f13961h = f2;
        mMLiveLinkMember.f13963x = f3;
        mMLiveLinkMember.f13964y = f4;
        return mMLiveLinkMember;
    }

    /* JADX INFO: renamed from: W0 */
    public beu m71894W0() {
        beu beuVar = new beu();
        beuVar.f75241a = ypv.m215672k().m195696O4();
        MotionParams motionParams = this.f47795b;
        beuVar.f75245e = motionParams.f47787c;
        beuVar.f75244d = motionParams.f47786b;
        beuVar.f75243c = motionParams.f47785a;
        beuVar.f75242b = w8u.m202222y(ypv.f199493a.m199329V());
        gkh0.m126627j("LivePkConstant", "userConfig config.appid:" + beuVar.f75241a + ",config.businessType:" + beuVar.f75245e + ",config.provider:" + beuVar.f75244d + "config.roomid:" + beuVar.f75243c + "config.userid:" + beuVar.f75242b);
        return beuVar;
    }

    /* JADX INFO: renamed from: X0 */
    public void mo71895X0() {
        if (this.f47797d == 3) {
            return;
        }
        this.f47797d = 3;
        this.f47798e.f152055g.m133478h(this);
        this.f47798e.f152054f.mo118143a(this);
        if (this.f47799f != null) {
            gkh0.m126627j("[live][motion]", "end 完成 移除延迟10秒的任务");
            e51.m114745J(this.f47799f);
        }
        this.f47796c = false;
        gkh0.m126627j("[live][motion]", "goToEndFlag = false ");
    }

    /* JADX INFO: renamed from: Y0 */
    public void m71896Y0() {
        gkh0.m126627j("[live][motion]", " 开始执行 endPushByType");
        if (!m71901d1()) {
            gkh0.m126627j("[live][motion]", " leaveRoom or stopPush 失败");
            return;
        }
        if (mo71905i1() == MotionParams.MomoPushType.RTMP) {
            gkh0.m126627j("[live][motion]", " stopPush ");
            this.f47798e.f152052d.m133230n1();
        } else if (mo71902e1()) {
            gkh0.m126627j("intl_rtc_up", mo71905i1() + " ， 复用rtc频道 ， 跳过 leave room ");
        } else {
            gkh0.m126627j("[live][motion]", " leaveRoom ");
            this.f47798e.f152052d.m133214X0();
        }
        gkh0.m126627j("PusherMotionInstance", "PusherMotion end and pushEngine leaveRoom");
    }

    /* JADX INFO: renamed from: Z0 */
    public MotionParams.PusherMotionEnum m71897Z0() {
        return this.f47795b.mo71888a();
    }

    /* JADX INFO: renamed from: a1 */
    public void mo71898a1() {
        if (this.f47797d != 1) {
            return;
        }
        this.f47797d = 2;
        this.f47798e.f152055g.m133479i(this);
        this.f47796c = true;
        Runnable runnable = new Runnable() { // from class: l.lgb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127972a.m71890f1();
            }
        };
        this.f47799f = runnable;
        e51.m114743H(this.f47798e.f152049a, runnable, 10000L);
    }

    /* JADX INFO: renamed from: b1 */
    public void m71899b1(q0f q0fVar) {
        this.f47798e = q0fVar;
        q0fVar.f152054f.mo118144b(this);
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m71900c1(MotionParams.PusherMotionEnum pusherMotionEnum) {
        return pusherMotionEnum == m71897Z0();
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m71901d1() {
        boolean zM71906j1 = this.f47798e.f152055g.mo133471a().m71906j1(mo71905i1());
        boolean z = this.f47798e.f152055g.mo133471a() == this;
        gkh0.m126627j("[live][motion]", " is TYPE_START_PUSH " + zM71906j1 + "，isCurrentPusherMotionThis  " + z);
        return !zM71906j1 || z;
    }

    /* JADX INFO: renamed from: e1 */
    public boolean mo71902e1() {
        return false;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: g0 */
    public void mo69698g0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo69698g0(mMLivePushType);
        if (this.f47796c) {
            mo71895X0();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void mo71903g1() {
    }

    /* JADX INFO: renamed from: h1 */
    public void m71904h1() {
    }

    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo71905i1() {
        return MotionParams.MomoPushType.RTMP;
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m71906j1(MotionParams.MomoPushType momoPushType) {
        return momoPushType == mo71905i1();
    }

    /* JADX INFO: renamed from: k1 */
    public void m71907k1() {
        this.f47795b.f47789e = false;
    }

    /* JADX INFO: renamed from: l1 */
    public void m71908l1(@Nullable y74.InterfaceC21330a interfaceC21330a) {
        this.f47794a = interfaceC21330a;
    }

    /* JADX INFO: renamed from: n1 */
    public void m71910n1(MotionParams motionParams, MMLiveRoomParams mMLiveRoomParams) {
        if (motionParams.f47788d.contains("momo")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
            return;
        }
        if (motionParams.f47788d.contains("agora")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
        } else if (motionParams.f47788d.contains("tencent")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
        } else if (motionParams.f47788d.contains("volcengine")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc;
        }
    }

    /* JADX INFO: renamed from: o1 */
    public int mo71911o1() {
        if (this.f47797d != 0) {
            return -1;
        }
        this.f47797d = 1;
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    public void mo71909m1(f30<Integer, Object> f30Var) {
    }
}
