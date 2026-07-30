package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12506b;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatOptView;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class hou extends zeu<LiveVChatOptView> {

    /* JADX INFO: renamed from: f */
    public long f108857f;

    /* JADX INFO: renamed from: g */
    public View f108858g;

    /* JADX INFO: renamed from: h */
    public String f108859h;

    public hou(jlu jluVar, LiveVChatOptView liveVChatOptView, VImage vImage) {
        super(jluVar);
        mo51532C(liveVChatOptView);
        this.f108858g = vImage;
        m132275c3();
    }

    /* JADX INFO: renamed from: a3 */
    private void m132270a3() {
        ((LiveVChatOptView) this.viewModel).m69763q0();
        if (m218414N2()) {
            m132274Z2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public void m132271b3(String str) {
        boolean zEquals = VoiceCallStatus.calling.equals(str);
        ((LiveVChatOptView) this.viewModel).m69765s0(zEquals, m218414N2());
        m132280j3(zEquals && m218414N2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public /* synthetic */ void m132272d3(String str) {
        ((LiveVChatOptView) this.viewModel).m69758D0(str, 10L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ void m132273e3(soj0 soj0Var) {
        m132270a3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((LiveVChatOptView) this.viewModel).setGiftButtonVisible(!m218413M2().f118589f);
        m218410I2(m218411K2().LiveVideoChatEvent.m69199i(), new e30() { // from class: l.znu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204010a.m132282m3((C12506b) obj);
            }
        });
        m218410I2(m218411K2().LiveVideoChatEvent.m69198h(), new e30() { // from class: l.aou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70940a.m132272d3((String) obj);
            }
        });
        m218410I2(m218411K2().LiveVideoChatEvent.m69192b(), new e30() { // from class: l.bou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76560a.m132273e3((soj0) obj);
            }
        });
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.cou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81866a.m132271b3((String) obj);
            }
        }));
        m104250o2(m218409H2().f186998c.m216979l().m189132p0(), false).subscribe(ffw.m121193d(new e30() { // from class: l.dou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87200a.m132276f3((LongLinkVideoChat.LiveVideoChatBubble) obj);
            }
        }));
        m104250o2(m218409H2().f186998c.m216979l().m189135q0(), false).subscribe(ffw.m121193d(new e30() { // from class: l.eou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92497a.m132277g3((LongLinkGiftMessage.VideoChatDuration) obj);
            }
        }));
        m218409H2().m203918R(new e30() { // from class: l.fou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98633a.m132278h3((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z2 */
    public void m132274Z2() {
        View view = this.f108858g;
        xdl0.m208344M(view, !xdl0.m208349O0(view));
    }

    /* JADX INFO: renamed from: c3 */
    public final void m132275c3() {
        xdl0.m208329E0(this.f108858g, new View.OnClickListener() { // from class: l.gou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103726a.m132279i3(view);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m132276f3(LongLinkVideoChat.LiveVideoChatBubble liveVideoChatBubble) {
        String text = liveVideoChatBubble.getText();
        long duration = liveVideoChatBubble.getDuration();
        if (TextUtils.isEmpty(text) || duration == 0) {
            return;
        }
        ((LiveVChatOptView) this.viewModel).m69758D0(text, duration / 1000);
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m132277g3(LongLinkGiftMessage.VideoChatDuration videoChatDuration) {
        if (m218409H2().m203901A() == null || !TextUtils.equals(m218409H2().m203901A().f44474id, videoChatDuration.getChatId())) {
            return;
        }
        C12506b c12506b = new C12506b();
        c12506b.f45066b = videoChatDuration.getRemainingDurationSec();
        m132282m3(c12506b);
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m132278h3(Long l2) {
        long j = this.f108857f;
        if (j <= 0) {
            ((LiveVChatOptView) this.viewModel).m69757B0(false, this.f108859h, j);
            return;
        }
        long j2 = j - 1;
        this.f108857f = j2;
        ((LiveVChatOptView) this.viewModel).m69757B0(true, this.f108859h, j2);
        if (this.f108857f == 5) {
            ((LiveVChatOptView) this.viewModel).m69758D0("随机匹配时间将耗尽，下一分钟\n将按照" + (m218409H2().m203901A().ttc / 1000000) + "探币/min进行扣费", 5L);
        }
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m132279i3(View view) {
        m218411K2().LiveVideoChatEvent.m69196f().m172467p();
    }

    /* JADX INFO: renamed from: j3 */
    public void m132280j3(boolean z) {
        xdl0.m208344M(this.f108858g, z);
    }

    /* JADX INFO: renamed from: k3 */
    public void m132281k3() {
        aru.m98564m(m218409H2().m203939p(), m218409H2().m203938o(), m218409H2().m203942s());
        m218411K2().SchemeHandleEvent.m69202a().mo172463j(new w1e0.C20784a(1).m200924e("tantanapp://live/room/showGiftDialog?tabIdList=10").m200922c());
    }

    /* JADX INFO: renamed from: m3 */
    public final void m132282m3(C12506b c12506b) {
        this.f108857f = -1L;
        ((LiveVChatOptView) this.viewModel).m69757B0(false, this.f108859h, -1L);
        if (TextUtils.equals("randomCoupon", c12506b.f45065a)) {
            String str = c12506b.f45065a;
            this.f108859h = str;
            long j = c12506b.f45066b;
            this.f108857f = j;
            ((LiveVChatOptView) this.viewModel).m69757B0(true, str, j);
            m218409H2().m203943t();
            return;
        }
        long j2 = c12506b.f45066b;
        if (j2 > 300 || j2 <= 0) {
            return;
        }
        String str2 = c12506b.f45065a;
        this.f108859h = str2;
        this.f108857f = j2;
        ((LiveVChatOptView) this.viewModel).m69757B0(true, str2, j2);
        m218409H2().m203943t();
    }
}
