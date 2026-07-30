package p153l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveEncode;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;
import io.agora.rtc2.RtcEngine;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class p910 extends C12877b {

    /* JADX INFO: renamed from: h */
    public final h910 f151078h;

    /* JADX INFO: renamed from: i */
    public MMLiveTranscoding f151079i;

    /* JADX INFO: renamed from: j */
    public MMLiveMediaConfig f151080j;

    /* JADX INFO: renamed from: k */
    public final int[] f151081k;

    /* JADX INFO: renamed from: l */
    public int f151082l;

    /* JADX INFO: renamed from: m */
    public final HashSet<Long> f151083m;

    /* JADX INFO: renamed from: n */
    public lr10 f151084n;

    /* JADX INFO: renamed from: o */
    public final Gson f151085o;

    /* JADX INFO: renamed from: p */
    public tm10 f151086p;

    /* JADX INFO: renamed from: q */
    public String f151087q;

    public p910(h910 h910Var) {
        super(h910Var);
        this.f151081k = new int[]{540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM};
        this.f151082l = 1200000;
        this.f151083m = new HashSet<>();
        this.f151086p = new tm10("2x2");
        this.f151087q = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpUQVIzWDRFWFhLUTRXQVdaSDI3QldDS0JWVlhMUTEyIiwidyI6Mzc1LCJoIjozNzUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTg0ODg4NjEwMzA5NDc0MDU1fQ.png";
        this.f151078h = h910Var;
        this.f151085o = new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public /* synthetic */ void m171294A1() {
        int[] iArr = this.f151081k;
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: renamed from: F1 */
    private void m171295F1(SurfaceView surfaceView, long j) {
        this.f151084n.m155516g(Long.valueOf(j), surfaceView);
        m171316w1(j);
    }

    /* JADX INFO: renamed from: x1 */
    private MMLiveTranscoding m171303x1(int[] iArr) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = iArr[0];
        mMLiveTranscoding.canvasHeight = iArr[1];
        mMLiveTranscoding.videoBitrate = this.f151082l;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM73076V0 = m73076V0(zrv.f205799a.m207631D0(), 1.0f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM73076V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM73076V0);
        mMLiveTranscoding.userid = zrv.f205799a.m207631D0();
        mMLiveTranscoding.mid = zrv.f205799a.m207631D0();
        mMLiveTranscoding.inv = String.valueOf(System.currentTimeMillis());
        mMLiveTranscoding.ctyp = 3;
        return mMLiveTranscoding;
    }

    /* JADX INFO: renamed from: y1 */
    private MMLiveMediaConfig m171304y1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 20;
        this.f151082l = 1200000;
        l210.m152547a(new x20() { // from class: l.l910
            @Override // p153l.x20
            public final void call() {
                this.f130531a.m171294A1();
            }
        }, new x20() { // from class: l.m910
            @Override // p153l.x20
            public final void call() {
                this.f135327a.m171306B1();
            }
        });
        int[] iArr = this.f151081k;
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.m82486a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
            int i2 = bLiveEncode.bitRate;
            mMLiveMediaConfig.videoBitRate = i2;
            this.f151082l = i2;
            int[] iArr2 = this.f151081k;
            iArr2[0] = bLiveEncode.width;
            iArr2[1] = bLiveEncode.heigth;
            i = bLiveVideoQualityConf.videoCodecType;
        } else {
            BLiveVideoQuality bLiveVideoQualityM101583a1 = this.f48646e.f176994c.m101583a1();
            if (bLiveVideoQualityM101583a1 == null || !bLiveVideoQualityM101583a1.isValid()) {
                i = 0;
            } else {
                mMLiveMediaConfig.videoFPS = bLiveVideoQualityM101583a1.pushFps;
                int i3 = bLiveVideoQualityM101583a1.pushBitrate;
                mMLiveMediaConfig.videoBitRate = i3;
                this.f151082l = i3;
                int[] iArr3 = this.f151081k;
                iArr3[0] = bLiveVideoQualityM101583a1.pushWidth;
                iArr3[1] = bLiveVideoQualityM101583a1.pushHeight;
                i = bLiveVideoQualityM101583a1.videoCodecType;
            }
        }
        int[] iArr4 = this.f151081k;
        mMLiveMediaConfig.encodeWidth = iArr4[0];
        mMLiveMediaConfig.encodeHeight = iArr4[1];
        mMLiveMediaConfig.videoCodecType = i;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f151078h.f48635c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f151078h.f48634b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: z1 */
    public static C12877b m171305z1(MotionParams motionParams) {
        if (motionParams.mo73071a() != MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR) {
            return null;
        }
        return new p910((h910) motionParams);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: B0 */
    public void mo96681B0() {
        super.mo96681B0();
        ir10.m141746a("onRequestChannelKey");
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(1).m209681n(this.f151078h.f48636d));
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m171306B1() {
        int[] iArr = this.f151081k;
        iArr[0] = 480;
        iArr[1] = 640;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: C0 */
    public void mo96682C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96682C0(str, i, mMLivePushType);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(5));
        }
        fhw.m125605a(cd10.f81073a, "onLocalLeaveChannel" + str);
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ Integer m171307C1(Long l2) {
        if (NullChecker.m82486a(this.f48642a)) {
            return Integer.valueOf(this.f48642a.mo99054a(x84.m209668a(4).m209683p(l2)).m209675h());
        }
        return -1;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m171308D1(Long l2) {
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = String.valueOf(l2);
        x84 x84VarMo99054a = this.f48642a.mo99054a(x84.m209668a(4).m209683p(l2));
        mMLiveLinkMember.isMuteAudio = x84VarMo99054a.m209676i();
        this.f151086p.m191719e(x84VarMo99054a.m209675h(), mMLiveLinkMember);
        if (TextUtils.equals(zrv.f205799a.m207631D0(), x84VarMo99054a.m209674g())) {
            this.f48646e.f176994c.m101578C((int) (ynp0.m216939p() * mMLiveLinkMember.f14656w), (int) (ynp0.m216939p() * mMLiveLinkMember.f14655h));
        }
        if (mMLiveLinkMember.f14656w <= 0.0f || mMLiveLinkMember.f14655h <= 0.0f) {
            return;
        }
        this.f151079i.infoMembers.add(mMLiveLinkMember);
        this.f151079i.confMembers.add(mMLiveLinkMember);
    }

    /* JADX INFO: renamed from: E1 */
    public final void m171309E1(long j) {
        m171310G1(j);
        this.f151084n.m155520k(j);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m171310G1(long j) {
        this.f151083m.remove(Long.valueOf(j));
        this.f151084n.m155520k(j);
        m171314K1();
    }

    /* JADX INFO: renamed from: H1 */
    public void m171311H1(String str) {
        fhw.m125605a(cd10.f81073a, "anchor push setRestartWithURL:" + str);
        this.f48646e.f176995d.m170529h1(str);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: I */
    public void mo120101I(long j, boolean z) {
        super.mo120101I(j, z);
        ir10.m141746a("onMemberAudioMuted" + j);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: I0 */
    public void mo120102I0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo120102I0(mMLivePushType);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(11));
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m171312I1(String str) {
        tm10 tm10Var = new tm10(str);
        this.f151086p = tm10Var;
        this.f151084n.m155521l(tm10Var);
        m171314K1();
    }

    /* JADX INFO: renamed from: J1 */
    public void m171313J1(Integer num) {
        this.f48646e.f176995d.m170532j1(num.intValue());
    }

    /* JADX INFO: renamed from: K1 */
    public void m171314K1() {
        MMLiveTranscoding mMLiveTranscoding = this.f151079i;
        if (mMLiveTranscoding == null) {
            return;
        }
        mMLiveTranscoding.infoMembers.clear();
        this.f151079i.confMembers.clear();
        jyb.m147537z(this.f151083m, new y20() { // from class: l.i910
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113406a.m171308D1((Long) obj);
            }
        });
        MMLiveTranscoding mMLiveTranscoding2 = this.f151079i;
        mMLiveTranscoding2.canvasWidth = 1080;
        mMLiveTranscoding2.canvasHeight = 1080;
        MMLiveMediaConfig mMLiveMediaConfig = this.f151080j;
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = 540;
        mMLiveTranscoding2.extString = "{\"mode\": " + this.f151086p.m191717c() + "}";
        MMLiveTranscoding mMLiveTranscoding3 = this.f151079i;
        mMLiveTranscoding3.ctyp = 3;
        if (mMLiveTranscoding3.infoMembers.size() > 4) {
            this.f151079i.shortSei = 1;
        }
        this.f48646e.f176995d.m170528g1(this.f151080j);
        this.f48646e.f176995d.m170527f1(this.f151079i);
        this.f151084n.mo100754b();
        this.f48646e.f176995d.m170533k1(this.f151087q);
        ir10.m141746a("updateCanvasAndVideoResolution sei = " + this.f151085o.toJson(this.f151079i));
    }

    /* JADX INFO: renamed from: L1 */
    public void m171315L1(final String str, boolean z) {
        MMLiveTranscoding mMLiveTranscoding = this.f151079i;
        if (mMLiveTranscoding == null) {
            return;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = (MMLiveTranscoding.MMLiveLinkMember) jyb.m147529r(mMLiveTranscoding.confMembers, new qcj() { // from class: l.n910
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember != null) {
            mMLiveLinkMember.isMuteAudio = z;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember2 = (MMLiveTranscoding.MMLiveLinkMember) jyb.m147529r(this.f151079i.infoMembers, new qcj() { // from class: l.o910
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember2 != null) {
            mMLiveLinkMember2.isMuteAudio = z;
        }
        this.f48646e.f176995d.m170527f1(this.f151079i);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: S */
    public void mo96683S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo96683S(mMLivePushType, i, i2);
        if (i2 == 1011) {
            return;
        }
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (i2 == 109) {
            interfaceC21264a.mo99054a(x84.m209668a(1).m209681n(this.f151078h.f48636d));
        } else {
            interfaceC21264a.mo99054a(x84.m209668a(7));
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: X0 */
    public void mo73078X0() {
        super.mo73078X0();
        m73079Y0();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: a1 */
    public void mo73081a1() {
        super.mo73081a1();
        ir10.m141746a("goToEnd");
        if (wft.m206159b(2)) {
            this.f48646e.f176995d.mo170509N(true);
            this.f48646e.f176995d.mo170540p(true);
            return;
        }
        nsh0.m164608j("intl_rtc_up", "复用 rtc频道，VideoMute false ,audiomute false");
        this.f151079i = null;
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(5));
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: b */
    public void mo96685b(long j, int i) {
        super.mo96685b(j, i);
        ir10.m141746a("onVideoChannelRemove uid:" + j + ",reason:" + i);
        m171310G1(j);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: d0 */
    public void mo96686d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96686d0(str, j, mMLivePushType);
        m171316w1(j);
        ir10.m141746a("onLocalJoinChannel result channel = " + str + " uid = " + j);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(6).m209683p(Long.valueOf(j)));
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e */
    public void mo120111e(long j, boolean z) {
        super.mo120111e(j, z);
        ir10.m141746a("onMemberVideoMuted uid:" + j + ",muted:" + z);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e0 */
    public void mo96687e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        ir10.m141746a("onMemberJoinChannel" + j);
        super.mo96687e0(str, j, mMLivePushType);
        m171316w1(j);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(3).m209683p(Long.valueOf(j)));
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: e1 */
    public boolean mo73085e1() {
        return !wft.m206159b(2) && this.f151078h.f48637e && this.f48646e.f176995d.m170516W0();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo73088i1() {
        return MotionParams.MomoPushType.RTC;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: l0 */
    public void mo96688l0(td1[] td1VarArr) {
        super.mo96688l0(td1VarArr);
        if ((td1VarArr.length == 1 && td1VarArr[0].m190565a() == 0) || this.f151079i == null) {
            return;
        }
        final ConcurrentHashMap<String, Float> concurrentHashMap = new ConcurrentHashMap<>();
        jyb.m147470A(td1VarArr, new y20() { // from class: l.j910
            @Override // p153l.y20
            public final void call(Object obj) {
                td1 td1Var = (td1) obj;
                concurrentHashMap.put(String.valueOf(td1Var.m190565a()), Float.valueOf(td1Var.m190566b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.mode = this.f151086p.m191717c();
        bLiveCallVolume.volumes = concurrentHashMap;
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(8).m209686s(bLiveCallVolume));
        }
        this.f151079i.extString = this.f151085o.toJson(bLiveCallVolume);
        this.f48646e.f176995d.m170527f1(this.f151079i);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: o0 */
    public void mo96689o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96689o0(j, i, mMLivePushType);
        ir10.m141746a("onMemberLeaveChannel" + j);
        m171309E1(j);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(2).m209683p(Long.valueOf(j)));
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: o1 */
    public int mo73094o1() {
        super.mo73094o1();
        if (wft.m206159b(2)) {
            RtcEngine.destroy();
        }
        ir10.m141746a("start motionParams" + this.f151078h.toString());
        lr10 lr10Var = new lr10(true, this.f151086p, new qcj() { // from class: l.k910
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f124432a.m171307C1((Long) obj);
            }
        });
        this.f151084n = lr10Var;
        this.f48646e.f176999h.m179837d(lr10Var);
        h910 h910Var = this.f151078h;
        this.f151080j = m171304y1(h910Var.f143915l, h910Var.f143914k, h910Var.f143913j);
        this.f151079i = m171303x1(this.f151081k);
        this.f48646e.f176995d.m170531i1(m73077W0());
        this.f48646e.f176995d.mo170509N(!this.f151078h.f108295n);
        boolean zMo73085e1 = mo73085e1();
        u1f u1fVar = this.f48646e;
        if (zMo73085e1) {
            u1fVar.f176995d.m170527f1(this.f151079i);
            String strM207631D0 = zrv.f205799a.m207631D0();
            m171316w1(Long.parseLong(strM207631D0));
            x84.InterfaceC21264a interfaceC21264a = this.f48642a;
            if (interfaceC21264a != null) {
                interfaceC21264a.mo99054a(x84.m209668a(6).m209684q(strM207631D0));
            }
            nsh0.m164608j("intl_rtc_up", "多人连麦 ， 已经在rtc频道 ， 跳过 enterroom");
        } else {
            u1fVar.f176995d.m170514U0(this.f151080j, m73075U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f151079i);
        }
        this.f48646e.f176995d.m170513T0(1000, 3);
        int i = this.f151078h.f108296o;
        if (i == 0) {
            return 0;
        }
        this.f48646e.f176995d.m170532j1(i);
        return 0;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m171316w1(long j) {
        this.f151083m.add(Long.valueOf(j));
        m171314K1();
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: z0 */
    public void mo96694z0(long j, SurfaceView surfaceView) {
        super.mo96694z0(j, surfaceView);
        m171295F1(surfaceView, j);
        if (this.f151079i == null) {
            return;
        }
        ir10.m141746a("onVideoChannelAdded sei = " + this.f151085o.toJson(this.f151079i));
    }
}
