package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatRandomMatch;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;

/* JADX INFO: loaded from: classes9.dex */
public class kru extends mhu {
    public kru(knu knuVar, LiveVChatCallingView liveVChatCallingView) {
        super(knuVar, liveVChatCallingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public void m151121Z2(String str) {
        if (yuk0.m217436b(m97926H2().m212308A())) {
            ((LiveVChatCallingView) this.viewModel).m70909l();
        }
        if (yuk0.m217435a(m97926H2().m212308A())) {
            this.f136880g.m139449f();
            ((LiveVChatCallingView) this.viewModel).m70906e();
        }
    }

    @Override // p153l.mhu, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((LiveVChatCallingView) this.viewModel).m70910m();
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(new y20() { // from class: l.jru
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122409a.m151121Z2((String) obj);
            }
        });
        ((LiveVChatCallingView) this.viewModel).m70913q(m97926H2().m212353w().randomMatch);
        this.f136880g.m139447d();
        m151125c3();
    }

    @Override // p153l.mhu
    /* JADX INFO: renamed from: U2 */
    public void mo151122U2() {
        String str;
        this.f136880g.m139449f();
        i4g0.m138520r(btu.f78405f, btu.f78411l);
        if (m97926H2().m212308A() == null) {
            if (TextUtils.isEmpty(m97926H2().m212353w().randomMatch.f45325id)) {
                m97929L2(true);
                return;
            } else {
                jwu.m147249X(m97926H2().m212353w().randomMatch.f45325id).subscribe(dhw.m115826e(new y20() { // from class: l.hru
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f111387a.m151123a3((BLiveVideoChatRandomMatch) obj);
                    }
                }, new y20() { // from class: l.iru
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f116602a.m151124b3((Throwable) obj);
                    }
                }));
                return;
            }
        }
        if (yuk0.m217440f(m97926H2().m212308A())) {
            str = yuk0.f201639h;
            btu.m106391g();
        } else {
            str = yuk0.f201636e;
        }
        m97926H2().m212326S(str);
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m151123a3(BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch) {
        m97929L2(true);
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m151124b3(Throwable th) {
        m97929L2(true);
    }

    /* JADX INFO: renamed from: c3 */
    public void m151125c3() {
        if (this.f136879f != null) {
            return;
        }
        l4g0 l4g0Var = new l4g0(btu.f78411l, "LiveVChatRandomMatchModule");
        this.f136879f = l4g0Var;
        l4g0Var.m152774i();
        this.f136879f.m152777l();
    }
}
