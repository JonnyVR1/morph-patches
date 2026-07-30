package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCalledView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;

/* JADX INFO: loaded from: classes9.dex */
public class mgu extends dhu {

    /* JADX INFO: renamed from: h */
    public final qgu f136785h;

    /* JADX INFO: renamed from: i */
    public Runnable f136786i;

    public mgu(knu knuVar, LiveVChatCalledView liveVChatCalledView, LiveVChatCallingView liveVChatCallingView) {
        super(knuVar, liveVChatCalledView);
        this.f136786i = new Runnable() { // from class: l.lgu
            @Override // java.lang.Runnable
            public final void run() {
                this.f132008a.m158383a3();
            }
        };
        this.f136785h = (qgu) m153103z2(new qgu(knuVar, liveVChatCallingView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public void m158382Z2(String str) {
        if (this.f136785h.m176517e3(m97926H2().m212308A())) {
            this.f136785h.m176514b3(str);
            return;
        }
        if (yuk0.m217440f(m97926H2().m212308A())) {
            ((LiveVChatCalledView) this.viewModel).m70898v(m97926H2().m212308A());
            m158386d3(m97926H2().m212308A().userId, m97926H2().m212308A().anchorId);
            this.f88553g.m139447d();
            m158384b3();
        } else {
            this.f88553g.m139449f();
            m158385c3();
        }
        if (yuk0.m217436b(m97926H2().m212308A())) {
            ((LiveVChatCalledView) this.viewModel).m70897u(false);
        }
        if (yuk0.m217435a(m97926H2().m212308A()) || yuk0.m217441g(m97926H2().m212308A())) {
            ((LiveVChatCalledView) this.viewModel).m70889j(yuk0.m217441g(m97926H2().m212308A()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m158383a3() {
        if (Act.isAppVisible()) {
            m97926H2().m212326S(yuk0.f201644m);
        }
    }

    @Override // p153l.dhu, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(new y20() { // from class: l.kgu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126649a.m158382Z2((String) obj);
            }
        });
    }

    @Override // p153l.dhu
    /* JADX INFO: renamed from: T2 */
    public void mo115819T2() {
        this.f88553g.m139449f();
        if (TextUtils.isEmpty(m97926H2().m212346p())) {
            return;
        }
        btu.m106386b();
        m97926H2().m212326S(yuk0.f201632a);
    }

    @Override // p153l.dhu
    /* JADX INFO: renamed from: V2 */
    public void mo115820V2() {
        String str;
        this.f88553g.m139449f();
        if (yuk0.m217440f(m97926H2().m212308A())) {
            str = yuk0.f201640i;
            btu.m106387c();
        } else {
            str = yuk0.f201636e;
        }
        m97926H2().m212326S(str);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m158384b3() {
        m158385c3();
        BLiveCommonConfig bLiveCommonConfig = m97926H2().f195479j;
        nsh0.m164608j("videoChat", "prepareAutoAnswer:" + bLiveCommonConfig.toJson());
        if (!bLiveCommonConfig.f45198on || bLiveCommonConfig.autoAnswerSeconds <= 0) {
            return;
        }
        l51.m152888H(act(), this.f136786i, bLiveCommonConfig.autoAnswerSeconds * 1000);
    }

    /* JADX INFO: renamed from: c3 */
    public final void m158385c3() {
        l51.m152890J(this.f136786i);
    }

    /* JADX INFO: renamed from: d3 */
    public void m158386d3(String str, String str2) {
        if (this.f88552f != null) {
            return;
        }
        l4g0 l4g0Var = new l4g0(btu.f78406g, "LiveVChatDialingModule");
        this.f88552f = l4g0Var;
        l4g0Var.m152781p(pf60.m172085a("sender_id", str), pf60.m172085a("receiver_id", str2));
        this.f88552f.m152774i();
        this.f88552f.m152777l();
    }
}
