package p149l;

import android.media.AudioManager;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.C12532b;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVideoChatPushView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class fpu extends zeu<LiveVideoChatPushView> implements k7m {

    /* JADX INFO: renamed from: f */
    public b3l0 f98735f;

    public fpu(jlu jluVar, LiveVideoChatPushView liveVideoChatPushView) {
        super(jluVar);
        mo51532C(liveVideoChatPushView);
        b3l0 b3l0VarM203944u = m218409H2().m203944u();
        this.f98735f = b3l0VarM203944u;
        m144512z2(new aik0(jluVar, b3l0VarM203944u.m100103b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public /* synthetic */ void m122656d3(String str) {
        m122667c3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ void m122657e3(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f98735f.m100108g();
        } else if (c4319c == C4319c.f15550k) {
            this.f98735f.m100107f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public void m122658m3(BLiveRtcToken bLiveRtcToken) {
        gkh0.m126627j("videoChat", "updateRtcToken:" + bLiveRtcToken);
        this.f98735f.m100105d().mo123636o(bLiveRtcToken.channelKey);
    }

    @Override // p149l.k7m
    /* JADX INFO: renamed from: H */
    public void mo122659H(long j, int i) {
        gkh0.m126627j("videoChat", "onMemberLeaveChannel:" + j + ",reason:" + i);
        BLiveVideoChat bLiveVideoChatM203901A = m218409H2().m203901A();
        if (bLiveVideoChatM203901A == null) {
            return;
        }
        if (m218414N2() && TextUtils.equals(String.valueOf(j), bLiveVideoChatM203901A.userId)) {
            m218409H2().m203919S(slk0.f165240f);
        }
        if (m218414N2() || !TextUtils.equals(String.valueOf(j), bLiveVideoChatM203901A.anchorId)) {
            return;
        }
        m218409H2().m203919S(slk0.f165240f);
    }

    @Override // p149l.k7m
    /* JADX INFO: renamed from: I */
    public void mo122660I(long j, boolean z) {
        gkh0.m126627j("videoChat", "onMemberAudioMuted:" + j + ",muted:" + z);
    }

    @Override // p149l.k7m
    /* JADX INFO: renamed from: Q1 */
    public void mo122661Q1(int i) {
        m218409H2().m203920T(slk0.f165237c, "engineError " + i);
    }

    @Override // p149l.k7m
    /* JADX INFO: renamed from: S1 */
    public void mo122662S1(String str, long j) {
        gkh0.m126627j("videoChat", "onLocalJoinChannel:" + j + ",uid:" + j);
        m218409H2().m203919S(slk0.f165236b);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m218410I2(m218411K2().LiveVideoChatEvent.m69201k(), new e30() { // from class: l.vou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182427a.m122674k3((Boolean) obj);
            }
        });
        m218410I2(m218411K2().LiveVideoChatEvent.m69191a(), new e30() { // from class: l.wou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187470a.m122673j3((Boolean) obj);
            }
        });
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.xou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193883a.m122656d3((String) obj);
            }
        }));
        act().lifecycle().filter(new w9j() { // from class: l.you
            @Override // p149l.w9j
            public final Object call(Object obj) {
                C4319c c4319c = (C4319c) obj;
                return Boolean.valueOf(c4319c == C4319c.f15548i || c4319c == C4319c.f15550k);
            }
        }).skip(1).subscribe(ffw.m121193d(new e30() { // from class: l.zou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204157a.m122657e3((C4319c) obj);
            }
        }));
    }

    @Override // p149l.k7m
    /* JADX INFO: renamed from: U */
    public void mo122663U(String str, int i) {
        gkh0.m126627j("videoChat", "onLocalLeaveChannel:" + str + ",reason:" + i);
        if (m218409H2().m203901A() == null) {
            return;
        }
        m218409H2().m203919S(slk0.f165239e);
    }

    @Override // p149l.k7m
    /* JADX INFO: renamed from: a1 */
    public void mo122664a1(long j) {
        gkh0.m126627j("videoChat", "onVideoChannelAdded:" + j);
        if (m218414N2()) {
            ((LiveVideoChatPushView) this.viewModel).m69818u(false, m218409H2().m203901A());
        }
        ((LiveVideoChatPushView) this.viewModel).m69816q();
    }

    @Override // p149l.k7m
    /* JADX INFO: renamed from: b */
    public void mo122665b(long j, int i) {
        gkh0.m126627j("videoChat", "onVideoChannelRemove:" + j + ",reason:" + i);
    }

    /* JADX INFO: renamed from: b3 */
    public void m122666b3(String str, String str2, BLiveRtcToken bLiveRtcToken) {
        VFrame vFrame;
        VFrame vFrame2;
        ((LiveVideoChatPushView) this.viewModel).m69817s(true);
        boolean z = m218413M2().f118589f;
        ((LiveVideoChatPushView) this.viewModel).m69814l(true);
        V v2 = this.viewModel;
        if (z) {
            vFrame = ((LiveVideoChatPushView) v2).f45459f;
            vFrame2 = ((LiveVideoChatPushView) v2).f45454a;
        } else {
            vFrame = ((LiveVideoChatPushView) v2).f45454a;
            vFrame2 = ((LiveVideoChatPushView) v2).f45459f;
        }
        VFrame vFrame3 = vFrame2;
        VFrame vFrame4 = vFrame;
        ((LiveVideoChatPushView) this.viewModel).m69818u(true, m218409H2().m203901A());
        this.f98735f.m100104c().mo138915c(new a3l0(str, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.rtcProvider, bLiveRtcToken.userSig, m218409H2().m203901A().media, vFrame4, vFrame3, z, str2, this));
    }

    /* JADX INFO: renamed from: c3 */
    public final void m122667c3() {
        final BLiveVideoChat bLiveVideoChatM203901A = m218409H2().m203901A();
        if (bLiveVideoChatM203901A == null || slk0.m184831g(bLiveVideoChatM203901A)) {
            this.f98735f.m100104c().mo138914b();
            ((LiveVideoChatPushView) this.viewModel).m69817s(false);
            ((LiveVideoChatPushView) this.viewModel).m69814l(true);
            return;
        }
        if (slk0.m184826b(bLiveVideoChatM203901A)) {
            m104250o2(iuu.m138456Q(bLiveVideoChatM203901A.roomId, bLiveVideoChatM203901A.media.rtcProvider, m218414N2() ? "anchor" : "attendee"), false).filter(new w9j() { // from class: l.apu
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f71085a.m122669f3((BLiveRtcToken) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.bpu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f76674a.m122670g3(bLiveVideoChatM203901A, (BLiveRtcToken) obj);
                }
            }, new e30() { // from class: l.cpu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81997a.m122671h3((Throwable) obj);
                }
            }));
            AudioManager audioManager = (AudioManager) act().getSystemService("audio");
            if (audioManager.getStreamVolume(3) < audioManager.getStreamMaxVolume(3) * 0.2f) {
                osi0.m165783g("当前音量较低，请进行调节");
            }
        }
        if (!slk0.m184825a(m218409H2().m203901A())) {
            ((LiveVideoChatPushView) this.viewModel).m69817s(false);
            return;
        }
        aru.m98567p(m218414N2(), m218409H2().m203938o(), m218409H2().m203939p());
        ((LiveVideoChatPushView) this.viewModel).m69817s(true);
        ((LiveVideoChatPushView) this.viewModel).m69815p();
    }

    @Override // p149l.k7m
    /* JADX INFO: renamed from: e */
    public void mo122668e(long j, boolean z) {
        gkh0.m126627j("videoChat", "onMemberVideoMuted:" + j + ",muted:" + z);
        if (m218414N2() && !TextUtils.equals(String.valueOf(j), l9s.m149093o0()) && z) {
            ((LiveVideoChatPushView) this.viewModel).m69818u(true, m218409H2().m203901A());
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ Boolean m122669f3(BLiveRtcToken bLiveRtcToken) {
        return Boolean.valueOf(!slk0.m184829e(m218409H2().m203901A()));
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m122670g3(BLiveVideoChat bLiveVideoChat, BLiveRtcToken bLiveRtcToken) {
        m122666b3(bLiveVideoChat.roomId, bLiveVideoChat.userId, bLiveRtcToken);
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m122671h3(Throwable th) {
        m218409H2().m203920T(slk0.f165237c, "rtcToken error");
    }

    /* JADX INFO: renamed from: i3 */
    public void m122672i3() {
        m218411K2().LiveVideoChatEvent.m69192b().m172467p();
    }

    /* JADX INFO: renamed from: j3 */
    public final void m122673j3(Boolean bool) {
        if (m218414N2()) {
            return;
        }
        this.f98735f.m100105d().mo123635n(bool.booleanValue());
    }

    /* JADX INFO: renamed from: k3 */
    public final void m122674k3(Boolean bool) {
        if (m218414N2()) {
            return;
        }
        gkh0.m126627j("videoChat", "set video mute:" + bool);
        C12532b c12532bMo138913a = this.f98735f.m100104c().mo138913a();
        if (c12532bMo138913a instanceof k2l0) {
            ((k2l0) c12532bMo138913a).m144320o1(bool);
        }
        ((LiveVideoChatPushView) this.viewModel).m69818u(bool.booleanValue(), m218409H2().m203901A());
        iuu.m138465Z(m218409H2().m203939p(), bool.booleanValue() ? slk0.f165245k : slk0.f165246l, "").subscribe(ffw.m121192c());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f98735f = null;
    }

    @Override // p149l.k7m
    public void onTokenPrivilegeWillExpire(String str) {
        gkh0.m126627j("videoChat", "onTokenPrivilegeWillExpire:" + str);
        if (m218409H2().m203901A() == null) {
            return;
        }
        m104250o2(iuu.m138456Q(m218409H2().m203945v(), str, m218414N2() ? "anchor" : "attendee"), false).subscribe(ffw.m121194e(new e30() { // from class: l.dpu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87323a.m122658m3((BLiveRtcToken) obj);
            }
        }, new e30() { // from class: l.epu
            @Override // p149l.e30
            public final void call(Object obj) {
                gkh0.m126627j("videoChat", "tokenError:" + ((Throwable) obj).getMessage());
            }
        }));
    }
}
