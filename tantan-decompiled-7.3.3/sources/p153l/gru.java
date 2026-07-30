package p153l;

import android.media.AudioManager;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.C12695b;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVideoChatPushView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class gru extends ahu<LiveVideoChatPushView> implements aam {

    /* JADX INFO: renamed from: f */
    public gcl0 f106146f;

    public gru(knu knuVar, LiveVideoChatPushView liveVideoChatPushView) {
        super(knuVar);
        mo52715C(liveVideoChatPushView);
        gcl0 gcl0VarM212351u = m97926H2().m212351u();
        this.f106146f = gcl0VarM212351u;
        m153103z2(new grk0(knuVar, gcl0VarM212351u.m129894b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public /* synthetic */ void m131879d3(String str) {
        m131883c3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ void m131880e3(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f106146f.m129899g();
        } else if (c4470c == C4470c.f16269k) {
            this.f106146f.m129898f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public void m131881m3(BLiveRtcToken bLiveRtcToken) {
        nsh0.m164608j("videoChat", "updateRtcToken:" + bLiveRtcToken);
        this.f106146f.m129896d().mo175191o(bLiveRtcToken.channelKey);
    }

    @Override // p153l.aam
    /* JADX INFO: renamed from: H */
    public void mo96645H(long j, int i) {
        nsh0.m164608j("videoChat", "onMemberLeaveChannel:" + j + ",reason:" + i);
        BLiveVideoChat bLiveVideoChatM212308A = m97926H2().m212308A();
        if (bLiveVideoChatM212308A == null) {
            return;
        }
        if (m97931N2() && TextUtils.equals(String.valueOf(j), bLiveVideoChatM212308A.userId)) {
            m97926H2().m212326S(yuk0.f201637f);
        }
        if (m97931N2() || !TextUtils.equals(String.valueOf(j), bLiveVideoChatM212308A.anchorId)) {
            return;
        }
        m97926H2().m212326S(yuk0.f201637f);
    }

    @Override // p153l.aam
    /* JADX INFO: renamed from: I */
    public void mo96646I(long j, boolean z) {
        nsh0.m164608j("videoChat", "onMemberAudioMuted:" + j + ",muted:" + z);
    }

    @Override // p153l.aam
    /* JADX INFO: renamed from: Q1 */
    public void mo96647Q1(int i) {
        m97926H2().m212327T(yuk0.f201634c, "engineError " + i);
    }

    @Override // p153l.aam
    /* JADX INFO: renamed from: S1 */
    public void mo96648S1(String str, long j) {
        nsh0.m164608j("videoChat", "onLocalJoinChannel:" + j + ",uid:" + j);
        m97926H2().m212326S(yuk0.f201633b);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m97927I2(m97928K2().LiveVideoChatEvent.m70384k(), new y20() { // from class: l.wqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190432a.m131889k3((Boolean) obj);
            }
        });
        m97927I2(m97928K2().LiveVideoChatEvent.m70374a(), new y20() { // from class: l.xqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195842a.m131888j3((Boolean) obj);
            }
        });
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.yqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201255a.m131879d3((String) obj);
            }
        }));
        act().lifecycle().filter(new qcj() { // from class: l.zqu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                C4470c c4470c = (C4470c) obj;
                return Boolean.valueOf(c4470c == C4470c.f16267i || c4470c == C4470c.f16269k);
            }
        }).skip(1).subscribe(dhw.m115825d(new y20() { // from class: l.aru
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72985a.m131880e3((C4470c) obj);
            }
        }));
    }

    @Override // p153l.aam
    /* JADX INFO: renamed from: U */
    public void mo96649U(String str, int i) {
        nsh0.m164608j("videoChat", "onLocalLeaveChannel:" + str + ",reason:" + i);
        if (m97926H2().m212308A() == null) {
            return;
        }
        m97926H2().m212326S(yuk0.f201636e);
    }

    @Override // p153l.aam
    /* JADX INFO: renamed from: a1 */
    public void mo96650a1(long j) {
        nsh0.m164608j("videoChat", "onVideoChannelAdded:" + j);
        if (m97931N2()) {
            ((LiveVideoChatPushView) this.viewModel).m71001u(false, m97926H2().m212308A());
        }
        ((LiveVideoChatPushView) this.viewModel).m70999q();
    }

    @Override // p153l.aam
    /* JADX INFO: renamed from: b */
    public void mo96651b(long j, int i) {
        nsh0.m164608j("videoChat", "onVideoChannelRemove:" + j + ",reason:" + i);
    }

    /* JADX INFO: renamed from: b3 */
    public void m131882b3(String str, String str2, BLiveRtcToken bLiveRtcToken) {
        VFrame vFrame;
        VFrame vFrame2;
        ((LiveVideoChatPushView) this.viewModel).m71000s(true);
        boolean z = m97930M2().f127643f;
        ((LiveVideoChatPushView) this.viewModel).m70997l(true);
        V v2 = this.viewModel;
        if (z) {
            vFrame = ((LiveVideoChatPushView) v2).f46307f;
            vFrame2 = ((LiveVideoChatPushView) v2).f46302a;
        } else {
            vFrame = ((LiveVideoChatPushView) v2).f46302a;
            vFrame2 = ((LiveVideoChatPushView) v2).f46307f;
        }
        VFrame vFrame3 = vFrame2;
        VFrame vFrame4 = vFrame;
        ((LiveVideoChatPushView) this.viewModel).m71001u(true, m97926H2().m212308A());
        this.f106146f.m129895c().mo138019c(new fcl0(str, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.rtcProvider, bLiveRtcToken.userSig, m97926H2().m212308A().media, vFrame4, vFrame3, z, str2, this));
    }

    /* JADX INFO: renamed from: c3 */
    public final void m131883c3() {
        final BLiveVideoChat bLiveVideoChatM212308A = m97926H2().m212308A();
        if (bLiveVideoChatM212308A == null || yuk0.m217441g(bLiveVideoChatM212308A)) {
            this.f106146f.m129895c().mo138018b();
            ((LiveVideoChatPushView) this.viewModel).m71000s(false);
            ((LiveVideoChatPushView) this.viewModel).m70997l(true);
            return;
        }
        if (yuk0.m217436b(bLiveVideoChatM212308A)) {
            m113231o2(jwu.m147242Q(bLiveVideoChatM212308A.roomId, bLiveVideoChatM212308A.media.rtcProvider, m97931N2() ? "anchor" : "attendee"), false).filter(new qcj() { // from class: l.bru
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f78054a.m131884f3((BLiveRtcToken) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.cru
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f83361a.m131885g3(bLiveVideoChatM212308A, (BLiveRtcToken) obj);
                }
            }, new y20() { // from class: l.dru
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90425a.m131886h3((Throwable) obj);
                }
            }));
            AudioManager audioManager = (AudioManager) act().getSystemService("audio");
            if (audioManager.getStreamVolume(3) < audioManager.getStreamMaxVolume(3) * 0.2f) {
                r1j0.m179420g("当前音量较低，请进行调节");
            }
        }
        if (!yuk0.m217435a(m97926H2().m212308A())) {
            ((LiveVideoChatPushView) this.viewModel).m71000s(false);
            return;
        }
        btu.m106400p(m97931N2(), m97926H2().m212345o(), m97926H2().m212346p());
        ((LiveVideoChatPushView) this.viewModel).m71000s(true);
        ((LiveVideoChatPushView) this.viewModel).m70998p();
    }

    @Override // p153l.aam
    /* JADX INFO: renamed from: e */
    public void mo96652e(long j, boolean z) {
        nsh0.m164608j("videoChat", "onMemberVideoMuted:" + j + ",muted:" + z);
        if (m97931N2() && !TextUtils.equals(String.valueOf(j), mbs.m157870o0()) && z) {
            ((LiveVideoChatPushView) this.viewModel).m71001u(true, m97926H2().m212308A());
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ Boolean m131884f3(BLiveRtcToken bLiveRtcToken) {
        return Boolean.valueOf(!yuk0.m217439e(m97926H2().m212308A()));
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m131885g3(BLiveVideoChat bLiveVideoChat, BLiveRtcToken bLiveRtcToken) {
        m131882b3(bLiveVideoChat.roomId, bLiveVideoChat.userId, bLiveRtcToken);
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m131886h3(Throwable th) {
        m97926H2().m212327T(yuk0.f201634c, "rtcToken error");
    }

    /* JADX INFO: renamed from: i3 */
    public void m131887i3() {
        m97928K2().LiveVideoChatEvent.m70375b().m199277p();
    }

    /* JADX INFO: renamed from: j3 */
    public final void m131888j3(Boolean bool) {
        if (m97931N2()) {
            return;
        }
        this.f106146f.m129896d().mo175190n(bool.booleanValue());
    }

    /* JADX INFO: renamed from: k3 */
    public final void m131889k3(Boolean bool) {
        if (m97931N2()) {
            return;
        }
        nsh0.m164608j("videoChat", "set video mute:" + bool);
        C12695b c12695bMo138017a = this.f106146f.m129895c().mo138017a();
        if (c12695bMo138017a instanceof pbl0) {
            ((pbl0) c12695bMo138017a).m171524o1(bool);
        }
        ((LiveVideoChatPushView) this.viewModel).m71001u(bool.booleanValue(), m97926H2().m212308A());
        jwu.m147251Z(m97926H2().m212346p(), bool.booleanValue() ? yuk0.f201642k : yuk0.f201643l, "").subscribe(dhw.m115824c());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f106146f = null;
    }

    @Override // p153l.aam
    public void onTokenPrivilegeWillExpire(String str) {
        nsh0.m164608j("videoChat", "onTokenPrivilegeWillExpire:" + str);
        if (m97926H2().m212308A() == null) {
            return;
        }
        m113231o2(jwu.m147242Q(m97926H2().m212352v(), str, m97931N2() ? "anchor" : "attendee"), false).subscribe(dhw.m115826e(new y20() { // from class: l.eru
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95541a.m131881m3((BLiveRtcToken) obj);
            }
        }, new y20() { // from class: l.fru
            @Override // p153l.y20
            public final void call(Object obj) {
                nsh0.m164608j("videoChat", "tokenError:" + ((Throwable) obj).getMessage());
            }
        }));
    }
}
