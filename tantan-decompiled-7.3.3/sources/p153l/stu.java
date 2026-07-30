package p153l;

import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p051p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12669b;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatWaitingOrderView;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class stu extends ahu<LiveVChatWaitingOrderView> {

    /* JADX INFO: renamed from: f */
    public BLiveVideoChatLive f170606f;

    /* JADX INFO: renamed from: g */
    public kcg0 f170607g;

    /* JADX INFO: renamed from: h */
    public l4g0 f170608h;

    /* JADX INFO: renamed from: i */
    public kcg0 f170609i;

    /* JADX INFO: renamed from: l.stu$a */
    public class C20147a implements ga1 {
        public C20147a() {
        }
    }

    public stu(knu knuVar, LiveVChatWaitingOrderView liveVChatWaitingOrderView) {
        super(knuVar);
        this.f170608h = new l4g0("p_live_anchor_video_quickchat_calling", "LiveVChatWaitingOrderModule");
        mo52715C(liveVChatWaitingOrderView);
        m153103z2(new sl0(knuVar));
        m153103z2(new wou(knuVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public void m187910i3(String str) {
        ((LiveVChatWaitingOrderView) this.viewModel).m70985n(yuk0.m217439e(m97926H2().m212308A()));
        if (yuk0.m217439e(m97926H2().m212308A())) {
            toh0.m192047g(PlaybackException.CUSTOM_ERROR_CODE_BASE);
            m187930x3();
        }
        if (!yuk0.m217440f(m97926H2().m212308A()) || Act.isAppVisible()) {
            return;
        }
        awk0.m100674a(m97926H2().m212308A().getAttendee().userName);
    }

    /* JADX INFO: renamed from: w3 */
    private void m187911w3() {
        BLiveVideoChatLive bLiveVideoChatLive = this.f170606f;
        if (bLiveVideoChatLive == null || TextUtils.isEmpty(bLiveVideoChatLive.f45324id) || !yuk0.m217439e(m97926H2().m212308A())) {
            return;
        }
        jwu.m147230E(this.f170606f.f45324id).filter(new qcj() { // from class: l.ftu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f100808a.m187922o3((BLiveVideoChatLive) obj);
            }
        }).subscribe(dhw.m115829h(new ptu(this)));
        nsh0.m164608j("videoChat", "refresh live:" + this.f170606f.f45324id + m187928u3(this.f170606f));
    }

    /* JADX INFO: renamed from: B3 */
    public final void m187912B3(final BLiveVideoChatLive bLiveVideoChatLive) {
        psd0.m173633z(this.f170607g);
        this.f170607g = C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.gtu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106448a.m187926s3(bLiveVideoChatLive, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C3 */
    public final void m187913C3(BLiveVideoChatLive bLiveVideoChatLive) {
        this.f170606f = bLiveVideoChatLive;
        m97926H2().m212330W(bLiveVideoChatLive.autoAnswerConfig);
        m97926H2().m212331X(bLiveVideoChatLive.roomId);
        if (!m97926H2().f195483n) {
            m97926H2().m212337d0(bLiveVideoChatLive.f45324id, bLiveVideoChatLive.roomId);
        }
        m187932z3();
        m187930x3();
    }

    /* JADX INFO: renamed from: D3 */
    public void m187914D3() {
        nsh0.m164608j("videoChat", "stopWaitingOrder" + m187928u3(this.f170606f));
        btu.m106394j();
        BLiveVideoChatLive bLiveVideoChatLive = this.f170606f;
        if (bLiveVideoChatLive == null) {
            m187916g3(true);
        } else {
            m113231o2(jwu.m147250Y(bLiveVideoChatLive.f45324id), false).subscribe(dhw.m115826e(new ptu(this), new y20() { // from class: l.qtu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f159489a.m187927t3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        pb1.m171472b().mo171477f(LiveVChatAct.f45894i, AudioBusinessType.VIDEO_CHAT, new C20147a());
        m97927I2(m97928K2().LiveVideoChatEvent.m70383j(), new y20() { // from class: l.etu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95816a.m187913C3((BLiveVideoChatLive) obj);
            }
        });
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.jtu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122624a.m187910i3((String) obj);
            }
        }));
        m113231o2(m97926H2().f195472c.m120391l().m98320r0(), false).subscribe(dhw.m115825d(new y20() { // from class: l.ktu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128735a.m187918j3((LongLinkVideoChat.LiveVideoChatLiveChange) obj);
            }
        }));
        this.f170608h.m152774i();
        this.f170608h.m152777l();
        m113231o2(m97926H2().f195472c.m120391l().f71679V1, false).subscribe(dhw.m115829h(new y20() { // from class: l.ltu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133566a.m187919k3((liveAuthMessageNew.MultiDevice) obj);
            }
        }));
        if (!m97926H2().f195483n || m97926H2().m212309B() == null) {
            return;
        }
        m187913C3(m97926H2().m212309B());
    }

    /* JADX INFO: renamed from: f3 */
    public final void m187915f3(BLiveVideoChatLive bLiveVideoChatLive) {
        String strM187928u3 = m187928u3(bLiveVideoChatLive);
        nsh0.m164608j("videoChat", "checkEndWaitingOrder old" + m187928u3(this.f170606f) + ",new" + strM187928u3);
        if (bLiveVideoChatLive == null || this.f170606f == null) {
            m187916g3(true);
            return;
        }
        if ("stopped".equals(bLiveVideoChatLive.status)) {
            this.f170606f.status = bLiveVideoChatLive.status;
            if (TextUtils.isEmpty(bLiveVideoChatLive.punishMessage)) {
                m187916g3(true);
            } else {
                m187917h3(bLiveVideoChatLive.punishMessage, false);
            }
        }
    }

    /* JADX INFO: renamed from: g3 */
    public void m187916g3(boolean z) {
        m97926H2().f195482m = false;
        m97929L2(z);
    }

    /* JADX INFO: renamed from: h3 */
    public void m187917h3(String str, boolean z) {
        nsh0.m164608j("videoChat", "handleLiveStop:" + str + ",isMultiDevice:" + z + m187928u3(this.f170606f));
        psd0.m173633z(this.f170609i);
        BLiveVideoChatLive bLiveVideoChatLive = this.f170606f;
        if (bLiveVideoChatLive != null) {
            bLiveVideoChatLive.status = "stopped";
        }
        if (!z) {
            m97926H2().m212334a0(act(), str, new x20() { // from class: l.otu
                @Override // p153l.x20
                public final void call() {
                    this.f149009a.m187921n3();
                }
            });
            return;
        }
        if (yuk0.m217439e(m97926H2().m212308A())) {
            m97926H2().m212334a0(act(), "已在其他设备登录", new x20() { // from class: l.ntu
                @Override // p153l.x20
                public final void call() {
                    this.f143635a.m187920m3();
                }
            });
            return;
        }
        m97926H2().m212326S(yuk0.f201641j);
        m97926H2().m212308A().endType = LongLinkVideoChat.VideoChat.EndType.banAnchor.name();
        m97926H2().m212342i0("stopped", "已在其他设备登录");
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m187918j3(LongLinkVideoChat.LiveVideoChatLiveChange liveVideoChatLiveChange) {
        if ("stopped".equals(liveVideoChatLiveChange.getStatus())) {
            m187917h3(liveVideoChatLiveChange.getReason(), false);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m187919k3(liveAuthMessageNew.MultiDevice multiDevice) {
        m187917h3("", true);
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m187920m3() {
        m187916g3(true);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f170607g);
        if (!m97926H2().f195482m) {
            pb1.m171472b().mo171473a(LiveVChatAct.f45894i);
        }
        this.f170608h.m152776k();
        this.f170608h.m152775j();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m187921n3() {
        m187916g3(true);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ Boolean m187922o3(BLiveVideoChatLive bLiveVideoChatLive) {
        return Boolean.valueOf(!"stopped".equals(this.f170606f.status));
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m187923p3(BLiveEnvelope bLiveEnvelope) {
        ((LiveVChatWaitingOrderView) this.viewModel).m70984m(bLiveEnvelope.data.missedCallCount);
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m187924q3(BLiveEnvelope bLiveEnvelope) {
        m97928K2().LiveVideoChatEvent.m70380g().mo199273j(new C12669b.a(bLiveEnvelope.data.missedCalls, this.f170606f.f45324id));
        m187930x3();
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m187925r3(Long l2) {
        m187911w3();
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m187926s3(BLiveVideoChatLive bLiveVideoChatLive, Long l2) {
        ((LiveVChatWaitingOrderView) this.viewModel).m70982k(bLiveVideoChatLive);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m187927t3(Throwable th) {
        m187916g3(true);
    }

    /* JADX INFO: renamed from: u3 */
    public String m187928u3(BLiveVideoChatLive bLiveVideoChatLive) {
        StringBuilder sb = new StringBuilder(" liveStatus:");
        sb.append(bLiveVideoChatLive == null ? "null" : bLiveVideoChatLive.status);
        return sb.toString();
    }

    /* JADX INFO: renamed from: v3 */
    public void m187929v3() {
        if (!lwk0.m156066b().m156070e(m97926H2())) {
            m187914D3();
            return;
        }
        m97926H2().f195482m = true;
        m97926H2().m212333Z(this.f170606f);
        if (m97926H2().f195485p) {
            act().startActivity(mbs.m157875r(act(), NavigationIntent.get(NavigationIntent.menu)));
            m97926H2().f195485p = false;
        }
        m97929L2(false);
    }

    /* JADX INFO: renamed from: x3 */
    public void m187930x3() {
        BLiveVideoChatLive bLiveVideoChatLive = this.f170606f;
        if (bLiveVideoChatLive != null) {
            duringCreated(jwu.m147228C(bLiveVideoChatLive.f45324id)).subscribe(dhw.m115829h(new y20() { // from class: l.mtu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f138668a.m187923p3((BLiveEnvelope) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y3 */
    public void m187931y3() {
        BLiveVideoChatLive bLiveVideoChatLive = this.f170606f;
        if (bLiveVideoChatLive == null) {
            return;
        }
        duringCreated(jwu.m147229D(bLiveVideoChatLive.f45324id)).subscribe(dhw.m115826e(new y20() { // from class: l.htu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111597a.m187924q3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.itu
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165636j(yvr.m217555a((Throwable) obj));
            }
        }));
        i4g0.m138520r(btu.f78401b, "p_live_anchor_video_quickchat_calling");
    }

    /* JADX INFO: renamed from: z3 */
    public final void m187932z3() {
        ((LiveVChatWaitingOrderView) this.viewModel).m70983l(this.f170606f);
        m187912B3(this.f170606f);
        this.f170609i = m113231o2(C22421c.interval(tbs.f172989b.m203492P5(), TimeUnit.SECONDS), false).onBackpressureLatest().compose(psd0.m173592C()).subscribe(dhw.m115825d(new y20() { // from class: l.rtu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164863a.m187925r3((Long) obj);
            }
        }));
    }
}
