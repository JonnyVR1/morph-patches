package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12669b;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatOptView;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class iqu extends ahu<LiveVChatOptView> {

    /* JADX INFO: renamed from: f */
    public long f116469f;

    /* JADX INFO: renamed from: g */
    public View f116470g;

    /* JADX INFO: renamed from: h */
    public String f116471h;

    public iqu(knu knuVar, LiveVChatOptView liveVChatOptView, VImage vImage) {
        super(knuVar);
        mo52715C(liveVChatOptView);
        this.f116470g = vImage;
        m141718c3();
    }

    /* JADX INFO: renamed from: a3 */
    private void m141713a3() {
        ((LiveVChatOptView) this.viewModel).m70946q0();
        if (m97931N2()) {
            m141717Z2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public void m141714b3(String str) {
        boolean zEquals = VoiceCallStatus.calling.equals(str);
        ((LiveVChatOptView) this.viewModel).m70948s0(zEquals, m97931N2());
        m141723j3(zEquals && m97931N2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public /* synthetic */ void m141715d3(String str) {
        ((LiveVChatOptView) this.viewModel).m70941D0(str, 10L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ void m141716e3(vxj0 vxj0Var) {
        m141713a3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((LiveVChatOptView) this.viewModel).setGiftButtonVisible(!m97930M2().f127643f);
        m97927I2(m97928K2().LiveVideoChatEvent.m70382i(), new y20() { // from class: l.aqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72879a.m141725m3((C12669b) obj);
            }
        });
        m97927I2(m97928K2().LiveVideoChatEvent.m70381h(), new y20() { // from class: l.bqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77952a.m141715d3((String) obj);
            }
        });
        m97927I2(m97928K2().LiveVideoChatEvent.m70375b(), new y20() { // from class: l.cqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83243a.m141716e3((vxj0) obj);
            }
        });
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.dqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90295a.m141714b3((String) obj);
            }
        }));
        m113231o2(m97926H2().f195472c.m120391l().m98314p0(), false).subscribe(dhw.m115825d(new y20() { // from class: l.equ
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95398a.m141719f3((LongLinkVideoChat.LiveVideoChatBubble) obj);
            }
        }));
        m113231o2(m97926H2().f195472c.m120391l().m98317q0(), false).subscribe(dhw.m115825d(new y20() { // from class: l.fqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100338a.m141720g3((LongLinkGiftMessage.VideoChatDuration) obj);
            }
        }));
        m97926H2().m212325R(new y20() { // from class: l.gqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105952a.m141721h3((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z2 */
    public void m141717Z2() {
        View view = this.f116470g;
        bnl0.m105524M(view, !bnl0.m105529O0(view));
    }

    /* JADX INFO: renamed from: c3 */
    public final void m141718c3() {
        bnl0.m105509E0(this.f116470g, new View.OnClickListener() { // from class: l.hqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111180a.m141722i3(view);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m141719f3(LongLinkVideoChat.LiveVideoChatBubble liveVideoChatBubble) {
        String text = liveVideoChatBubble.getText();
        long duration = liveVideoChatBubble.getDuration();
        if (TextUtils.isEmpty(text) || duration == 0) {
            return;
        }
        ((LiveVChatOptView) this.viewModel).m70941D0(text, duration / 1000);
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m141720g3(LongLinkGiftMessage.VideoChatDuration videoChatDuration) {
        if (m97926H2().m212308A() == null || !TextUtils.equals(m97926H2().m212308A().f45322id, videoChatDuration.getChatId())) {
            return;
        }
        C12669b c12669b = new C12669b();
        c12669b.f45914b = videoChatDuration.getRemainingDurationSec();
        m141725m3(c12669b);
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m141721h3(Long l2) {
        long j = this.f116469f;
        if (j <= 0) {
            ((LiveVChatOptView) this.viewModel).m70940B0(false, this.f116471h, j);
            return;
        }
        long j2 = j - 1;
        this.f116469f = j2;
        ((LiveVChatOptView) this.viewModel).m70940B0(true, this.f116471h, j2);
        if (this.f116469f == 5) {
            ((LiveVChatOptView) this.viewModel).m70941D0("随机匹配时间将耗尽，下一分钟\n将按照" + (m97926H2().m212308A().ttc / 1000000) + "探币/min进行扣费", 5L);
        }
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m141722i3(View view) {
        m97928K2().LiveVideoChatEvent.m70379f().m199277p();
    }

    /* JADX INFO: renamed from: j3 */
    public void m141723j3(boolean z) {
        bnl0.m105524M(this.f116470g, z);
    }

    /* JADX INFO: renamed from: k3 */
    public void m141724k3() {
        btu.m106397m(m97926H2().m212346p(), m97926H2().m212345o(), m97926H2().m212349s());
        m97928K2().SchemeHandleEvent.m70385a().mo199273j(new aae0.C15676a(1).m96628e("tantanapp://live/room/showGiftDialog?tabIdList=10").m96626c());
    }

    /* JADX INFO: renamed from: m3 */
    public final void m141725m3(C12669b c12669b) {
        this.f116469f = -1L;
        ((LiveVChatOptView) this.viewModel).m70940B0(false, this.f116471h, -1L);
        if (TextUtils.equals("randomCoupon", c12669b.f45913a)) {
            String str = c12669b.f45913a;
            this.f116471h = str;
            long j = c12669b.f45914b;
            this.f116469f = j;
            ((LiveVChatOptView) this.viewModel).m70940B0(true, str, j);
            m97926H2().m212350t();
            return;
        }
        long j2 = c12669b.f45914b;
        if (j2 > 300 || j2 <= 0) {
            return;
        }
        String str2 = c12669b.f45913a;
        this.f116471h = str2;
        this.f116469f = j2;
        ((LiveVChatOptView) this.viewModel).m70940B0(true, str2, j2);
        m97926H2().m212350t();
    }
}
