package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCalledView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class yju extends dhu {
    public yju(knu knuVar, LiveVChatCalledView liveVChatCalledView) {
        super(knuVar, liveVChatCalledView);
    }

    @Override // p153l.dhu, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(new y20() { // from class: l.uju
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179335a.m216440a3((String) obj);
            }
        });
        m113231o2(jwu.m147233H(m97926H2().m212353w().live.f45324id), false).subscribe(dhw.m115825d(new y20() { // from class: l.vju
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184444a.m216443d3((BLiveVideoChatAttendeeCallInfo) obj);
            }
        }));
        BLiveVideoChatLive bLiveVideoChatLive = m97926H2().m212353w().live;
        m97926H2().m212331X(bLiveVideoChatLive.roomId);
        m216444e3(bLiveVideoChatLive.anchorId, mbs.m157870o0());
        this.f88553g.m139447d();
    }

    @Override // p153l.dhu
    /* JADX INFO: renamed from: T2 */
    public void mo115819T2() {
        this.f88553g.m139449f();
        VChatStartAct.m70410u2("fakeCall", "fakeAccept");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new rr60().m153585h(new x20() { // from class: l.wju
            @Override // p153l.x20
            public final void call() {
                this.f189498a.m216441b3();
            }
        }).m153587j("fakeCall"));
        arrayList.add(new hbl0(new x20() { // from class: l.xju
            @Override // p153l.x20
            public final void call() {
                this.f194650a.m216442c3();
            }
        }));
        VChatStartAct.m70407q2(act(), arrayList);
        btu.m106389e();
    }

    @Override // p153l.dhu
    /* JADX INFO: renamed from: V2 */
    public void mo115820V2() {
        String str;
        this.f88553g.m139449f();
        if (m97926H2().m212308A() == null) {
            if (!TextUtils.isEmpty(m97926H2().m212353w().recallId)) {
                jwu.m147240O(m97926H2().m212353w().recallId, "reject");
            }
            btu.m106390f();
            m115821W2();
            m97929L2(true);
            return;
        }
        if (yuk0.m217440f(m97926H2().m212308A())) {
            str = yuk0.f201639h;
            btu.m106390f();
        } else {
            str = yuk0.f201636e;
        }
        m97926H2().m212326S(str);
    }

    /* JADX INFO: renamed from: a3 */
    public void m216440a3(String str) {
        if (yuk0.m217435a(m97926H2().m212308A())) {
            ((LiveVChatCalledView) this.viewModel).m70889j(false);
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m216441b3() {
        m97929L2(true);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m216442c3() {
        m97926H2().m212344n(this);
        ((LiveVChatCalledView) this.viewModel).m70897u(true);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m216443d3(BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveVChatCalledView) v2).m70899w(bLiveVideoChatAttendeeCallInfo);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public void m216444e3(String str, String str2) {
        if (this.f88552f != null) {
            return;
        }
        l4g0 l4g0Var = new l4g0(btu.f78409j, "LiveVChatDialingModule");
        this.f88552f = l4g0Var;
        l4g0Var.m152781p(pf60.m172085a("sender_id", str), pf60.m172085a("receiver_id", str2), pf60.m172085a("source", m97926H2().m212353w().source));
        this.f88552f.m152774i();
        this.f88552f.m152777l();
    }
}
