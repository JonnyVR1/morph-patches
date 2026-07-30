package p149l;

import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p046p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12506b;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatWaitingOrderView;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class rru extends zeu<LiveVChatWaitingOrderView> {

    /* JADX INFO: renamed from: f */
    public BLiveVideoChatLive f160779f;

    /* JADX INFO: renamed from: g */
    public c4g0 f160780g;

    /* JADX INFO: renamed from: h */
    public cwf0 f160781h;

    /* JADX INFO: renamed from: i */
    public c4g0 f160782i;

    /* JADX INFO: renamed from: l.rru$a */
    public class C19763a implements z91 {
        public C19763a() {
        }
    }

    public rru(jlu jluVar, LiveVChatWaitingOrderView liveVChatWaitingOrderView) {
        super(jluVar);
        this.f160781h = new cwf0("p_live_anchor_video_quickchat_calling", "LiveVChatWaitingOrderModule");
        mo51532C(liveVChatWaitingOrderView);
        m144512z2(new wl0(jluVar));
        m144512z2(new vmu(jluVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public void m180585i3(String str) {
        ((LiveVChatWaitingOrderView) this.viewModel).m69802n(slk0.m184829e(m218409H2().m203901A()));
        if (slk0.m184829e(m218409H2().m203901A())) {
            mgh0.m154551g(PlaybackException.CUSTOM_ERROR_CODE_BASE);
            m180605x3();
        }
        if (!slk0.m184830f(m218409H2().m203901A()) || Act.isAppVisible()) {
            return;
        }
        umk0.m194373a(m218409H2().m203901A().getAttendee().userName);
    }

    /* JADX INFO: renamed from: w3 */
    private void m180586w3() {
        BLiveVideoChatLive bLiveVideoChatLive = this.f160779f;
        if (bLiveVideoChatLive == null || TextUtils.isEmpty(bLiveVideoChatLive.f44476id) || !slk0.m184829e(m218409H2().m203901A())) {
            return;
        }
        iuu.m138444E(this.f160779f.f44476id).filter(new w9j() { // from class: l.eru
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92969a.m180597o3((BLiveVideoChatLive) obj);
            }
        }).subscribe(ffw.m121197h(new oru(this)));
        gkh0.m126627j("videoChat", "refresh live:" + this.f160779f.f44476id + m180603u3(this.f160779f));
    }

    /* JADX INFO: renamed from: B3 */
    public final void m180587B3(final BLiveVideoChatLive bLiveVideoChatLive) {
        mkd0.m154992z(this.f160780g);
        this.f160780g = C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.fru
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99000a.m180601s3(bLiveVideoChatLive, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C3 */
    public final void m180588C3(BLiveVideoChatLive bLiveVideoChatLive) {
        this.f160779f = bLiveVideoChatLive;
        m218409H2().m203923W(bLiveVideoChatLive.autoAnswerConfig);
        m218409H2().m203924X(bLiveVideoChatLive.roomId);
        if (!m218409H2().f187009n) {
            m218409H2().m203930d0(bLiveVideoChatLive.f44476id, bLiveVideoChatLive.roomId);
        }
        m180607z3();
        m180605x3();
    }

    /* JADX INFO: renamed from: D3 */
    public void m180589D3() {
        gkh0.m126627j("videoChat", "stopWaitingOrder" + m180603u3(this.f160779f));
        aru.m98561j();
        BLiveVideoChatLive bLiveVideoChatLive = this.f160779f;
        if (bLiveVideoChatLive == null) {
            m180591g3(true);
        } else {
            m104250o2(iuu.m138464Y(bLiveVideoChatLive.f44476id), false).subscribe(ffw.m121194e(new oru(this), new e30() { // from class: l.pru
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150949a.m180602t3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ib1.m135233b().mo135238f(LiveVChatAct.f45046i, AudioBusinessType.VIDEO_CHAT, new C19763a());
        m218410I2(m218411K2().LiveVideoChatEvent.m69200j(), new e30() { // from class: l.dru
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87675a.m180588C3((BLiveVideoChatLive) obj);
            }
        });
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.iru
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114683a.m180585i3((String) obj);
            }
        }));
        m104250o2(m218409H2().f186998c.m216979l().m189138r0(), false).subscribe(ffw.m121193d(new e30() { // from class: l.jru
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119443a.m180593j3((LongLinkVideoChat.LiveVideoChatLiveChange) obj);
            }
        }));
        this.f160781h.m109033i();
        this.f160781h.m109036l();
        m104250o2(m218409H2().f186998c.m216979l().f170412V1, false).subscribe(ffw.m121197h(new e30() { // from class: l.kru
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124395a.m180594k3((liveAuthMessageNew.MultiDevice) obj);
            }
        }));
        if (!m218409H2().f187009n || m218409H2().m203902B() == null) {
            return;
        }
        m180588C3(m218409H2().m203902B());
    }

    /* JADX INFO: renamed from: f3 */
    public final void m180590f3(BLiveVideoChatLive bLiveVideoChatLive) {
        String strM180603u3 = m180603u3(bLiveVideoChatLive);
        gkh0.m126627j("videoChat", "checkEndWaitingOrder old" + m180603u3(this.f160779f) + ",new" + strM180603u3);
        if (bLiveVideoChatLive == null || this.f160779f == null) {
            m180591g3(true);
            return;
        }
        if ("stopped".equals(bLiveVideoChatLive.status)) {
            this.f160779f.status = bLiveVideoChatLive.status;
            if (TextUtils.isEmpty(bLiveVideoChatLive.punishMessage)) {
                m180591g3(true);
            } else {
                m180592h3(bLiveVideoChatLive.punishMessage, false);
            }
        }
    }

    /* JADX INFO: renamed from: g3 */
    public void m180591g3(boolean z) {
        m218409H2().f187008m = false;
        m218412L2(z);
    }

    /* JADX INFO: renamed from: h3 */
    public void m180592h3(String str, boolean z) {
        gkh0.m126627j("videoChat", "handleLiveStop:" + str + ",isMultiDevice:" + z + m180603u3(this.f160779f));
        mkd0.m154992z(this.f160782i);
        BLiveVideoChatLive bLiveVideoChatLive = this.f160779f;
        if (bLiveVideoChatLive != null) {
            bLiveVideoChatLive.status = "stopped";
        }
        if (!z) {
            m218409H2().m203927a0(act(), str, new d30() { // from class: l.nru
                @Override // p149l.d30
                public final void call() {
                    this.f140224a.m180596n3();
                }
            });
            return;
        }
        if (slk0.m184829e(m218409H2().m203901A())) {
            m218409H2().m203927a0(act(), "已在其他设备登录", new d30() { // from class: l.mru
                @Override // p149l.d30
                public final void call() {
                    this.f135413a.m180595m3();
                }
            });
            return;
        }
        m218409H2().m203919S(slk0.f165244j);
        m218409H2().m203901A().endType = LongLinkVideoChat.VideoChat.EndType.banAnchor.name();
        m218409H2().m203935i0("stopped", "已在其他设备登录");
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m180593j3(LongLinkVideoChat.LiveVideoChatLiveChange liveVideoChatLiveChange) {
        if ("stopped".equals(liveVideoChatLiveChange.getStatus())) {
            m180592h3(liveVideoChatLiveChange.getReason(), false);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m180594k3(liveAuthMessageNew.MultiDevice multiDevice) {
        m180592h3("", true);
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m180595m3() {
        m180591g3(true);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f160780g);
        if (!m218409H2().f187008m) {
            ib1.m135233b().mo135234a(LiveVChatAct.f45046i);
        }
        this.f160781h.m109035k();
        this.f160781h.m109034j();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m180596n3() {
        m180591g3(true);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ Boolean m180597o3(BLiveVideoChatLive bLiveVideoChatLive) {
        return Boolean.valueOf(!"stopped".equals(this.f160779f.status));
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m180598p3(BLiveEnvelope bLiveEnvelope) {
        ((LiveVChatWaitingOrderView) this.viewModel).m69801m(bLiveEnvelope.data.missedCallCount);
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m180599q3(BLiveEnvelope bLiveEnvelope) {
        m218411K2().LiveVideoChatEvent.m69197g().mo172463j(new C12506b.a(bLiveEnvelope.data.missedCalls, this.f160779f.f44476id));
        m180605x3();
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m180600r3(Long l2) {
        m180586w3();
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m180601s3(BLiveVideoChatLive bLiveVideoChatLive, Long l2) {
        ((LiveVChatWaitingOrderView) this.viewModel).m69799k(bLiveVideoChatLive);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m180602t3(Throwable th) {
        m180591g3(true);
    }

    /* JADX INFO: renamed from: u3 */
    public String m180603u3(BLiveVideoChatLive bLiveVideoChatLive) {
        StringBuilder sb = new StringBuilder(" liveStatus:");
        sb.append(bLiveVideoChatLive == null ? "null" : bLiveVideoChatLive.status);
        return sb.toString();
    }

    /* JADX INFO: renamed from: v3 */
    public void m180604v3() {
        if (!fnk0.m122316b().m122320e(m218409H2())) {
            m180589D3();
            return;
        }
        m218409H2().f187008m = true;
        m218409H2().m203926Z(this.f160779f);
        if (m218409H2().f187011p) {
            act().startActivity(l9s.m149098r(act(), NavigationIntent.get(NavigationIntent.menu)));
            m218409H2().f187011p = false;
        }
        m218412L2(false);
    }

    /* JADX INFO: renamed from: x3 */
    public void m180605x3() {
        BLiveVideoChatLive bLiveVideoChatLive = this.f160779f;
        if (bLiveVideoChatLive != null) {
            duringCreated(iuu.m138442C(bLiveVideoChatLive.f44476id)).subscribe(ffw.m121197h(new e30() { // from class: l.lru
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f129767a.m180598p3((BLiveEnvelope) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y3 */
    public void m180606y3() {
        BLiveVideoChatLive bLiveVideoChatLive = this.f160779f;
        if (bLiveVideoChatLive == null) {
            return;
        }
        duringCreated(iuu.m138443D(bLiveVideoChatLive.f44476id)).subscribe(ffw.m121194e(new e30() { // from class: l.gru
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104110a.m180599q3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.hru
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151580j(xtr.m211021a((Throwable) obj));
            }
        }));
        zvf0.m220396r(aru.f71348b, "p_live_anchor_video_quickchat_calling");
    }

    /* JADX INFO: renamed from: z3 */
    public final void m180607z3() {
        ((LiveVChatWaitingOrderView) this.viewModel).m69800l(this.f160779f);
        m180587B3(this.f160779f);
        this.f160782i = m104250o2(C22306c.interval(s9s.f163228b.m195705P5(), TimeUnit.SECONDS), false).onBackpressureLatest().compose(mkd0.m154951C()).subscribe(ffw.m121193d(new e30() { // from class: l.qru
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156046a.m180600r3((Long) obj);
            }
        }));
    }
}
