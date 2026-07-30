package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class qgu extends mhu {

    /* JADX INFO: renamed from: h */
    public BLiveVideoChatAnchorCall f157470h;

    /* JADX INFO: renamed from: i */
    public kcg0 f157471i;

    public qgu(knu knuVar, LiveVChatCallingView liveVChatCallingView) {
        super(knuVar, liveVChatCallingView);
    }

    @Override // p153l.mhu, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m97927I2(m97928K2().LiveVideoChatEvent.m70378e(), new y20() { // from class: l.ngu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141859a.m176513a3((BLiveVideoChatAnchorCall) obj);
            }
        });
        m113231o2(m97926H2().f195472c.m120391l().m98311o0(), false).subscribe(dhw.m115825d(new y20() { // from class: l.ogu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147310a.m176515c3((LongLinkVideoChat.LiveVideoChatAnchorCallResult) obj);
            }
        }));
    }

    @Override // p153l.mhu
    /* JADX INFO: renamed from: U2 */
    public void mo151122U2() {
        if (yuk0.m217440f(m97926H2().m212308A()) || yuk0.m217436b(m97926H2().m212308A())) {
            o1j0.m165636j("正在接通中");
        } else {
            m176511Y2();
            i4g0.m138520r(btu.f78403d, btu.f78407h);
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public void m176511Y2() {
        psd0.m173633z(this.f157471i);
        this.f136880g.m139449f();
        ((LiveVChatCallingView) this.viewModel).m70906e();
        this.f157470h = null;
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m176512Z2(String str) {
        if (this.f157470h == null) {
            return;
        }
        o1j0.m165636j(str);
        m176511Y2();
    }

    /* JADX INFO: renamed from: a3 */
    public void m176513a3(BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall) {
        this.f157470h = bLiveVideoChatAnchorCall;
        this.f136880g.m139447d();
        ((LiveVChatCallingView) this.viewModel).m70911n(bLiveVideoChatAnchorCall);
        m176518f3(bLiveVideoChatAnchorCall.anchorId, bLiveVideoChatAnchorCall.userId);
        this.f157471i = m113231o2(C22421c.interval(tbs.f172989b.m203484O5(), TimeUnit.SECONDS), false).take(1).compose(psd0.m173592C()).subscribe(dhw.m115825d(new y20() { // from class: l.pgu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152338a.m176516d3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b3 */
    public void m176514b3(String str) {
        if (this.f157470h == null) {
            return;
        }
        if (yuk0.m217440f(m97926H2().m212308A())) {
            m97926H2().m212326S(yuk0.f201632a);
            ((LiveVChatCallingView) this.viewModel).setTitle("接通中，请稍候");
            psd0.m173633z(this.f157471i);
        }
        if (yuk0.m217435a(m97926H2().m212308A()) || yuk0.m217441g(m97926H2().m212308A())) {
            m176511Y2();
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m176515c3(LongLinkVideoChat.LiveVideoChatAnchorCallResult liveVideoChatAnchorCallResult) {
        m176512Z2("对方忙线中");
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m176516d3(Long l2) {
        m176512Z2("对方无应答");
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m176517e3(BLiveVideoChat bLiveVideoChat) {
        BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall = this.f157470h;
        if (bLiveVideoChatAnchorCall == null) {
            return false;
        }
        if (TextUtils.equals(bLiveVideoChatAnchorCall.f45323id, bLiveVideoChat.anchorCallId)) {
            return true;
        }
        m176511Y2();
        return false;
    }

    /* JADX INFO: renamed from: f3 */
    public void m176518f3(String str, String str2) {
        if (this.f136879f != null) {
            return;
        }
        l4g0 l4g0Var = new l4g0(btu.f78407h, "LiveVChatAnchorRecallModule");
        this.f136879f = l4g0Var;
        l4g0Var.m152781p(pf60.m172085a("sender_id", str), pf60.m172085a("receiver_id", str2));
        this.f136879f.m152774i();
        this.f136879f.m152777l();
    }
}
