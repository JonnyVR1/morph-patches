package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;

/* JADX INFO: loaded from: classes9.dex */
public class tgu extends mhu {
    public tgu(knu knuVar, LiveVChatCallingView liveVChatCallingView) {
        super(knuVar, liveVChatCallingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public void m191110Y2(String str) {
        if (yuk0.m217440f(m97926H2().m212308A())) {
            ((LiveVChatCallingView) this.viewModel).m70910m();
            this.f136880g.m139447d();
            m191112a3(m97926H2().m212308A().userId, m97926H2().m212345o());
        }
        if (yuk0.m217436b(m97926H2().m212308A())) {
            ((LiveVChatCallingView) this.viewModel).m70909l();
        }
        if (yuk0.m217435a(m97926H2().m212308A())) {
            ((LiveVChatCallingView) this.viewModel).m70906e();
            this.f136880g.m139449f();
        }
        if (yuk0.m217441g(m97926H2().m212308A())) {
            this.f136880g.m139449f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m191111Z2(BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveVChatCallingView) v2).m70912p(bLiveVideoChatAttendeeCallInfo);
        }
    }

    @Override // p153l.mhu, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((LiveVChatCallingView) this.viewModel).m70910m();
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(new y20() { // from class: l.rgu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163047a.m191110Y2((String) obj);
            }
        });
        m113231o2(jwu.m147233H(m97926H2().m212353w().chat.liveId), false).subscribe(dhw.m115825d(new y20() { // from class: l.sgu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168562a.m191111Z2((BLiveVideoChatAttendeeCallInfo) obj);
            }
        }));
    }

    @Override // p153l.mhu
    /* JADX INFO: renamed from: U2 */
    public void mo151122U2() {
        String str;
        this.f136880g.m139449f();
        if (yuk0.m217440f(m97926H2().m212308A())) {
            str = yuk0.f201639h;
            btu.m106391g();
        } else {
            str = yuk0.f201636e;
        }
        m97926H2().m212326S(str);
    }

    /* JADX INFO: renamed from: a3 */
    public void m191112a3(String str, String str2) {
        if (this.f136879f != null) {
            return;
        }
        l4g0 l4g0Var = new l4g0(btu.f78410k, "LiveVChatDialingModule");
        this.f136879f = l4g0Var;
        l4g0Var.m152781p(pf60.m172085a("sender_id", str), pf60.m172085a("receiver_id", str2));
        this.f136879f.m152774i();
        this.f136879f.m152777l();
    }
}
