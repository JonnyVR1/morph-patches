package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;

/* JADX INFO: loaded from: classes13.dex */
public class seu extends lfu {
    public seu(jlu jluVar, LiveVChatCallingView liveVChatCallingView) {
        super(jluVar, liveVChatCallingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public void m183718Y2(String str) {
        if (slk0.m184830f(m218409H2().m203901A())) {
            ((LiveVChatCallingView) this.viewModel).m69727m();
            this.f127931g.m109938d();
            m183720a3(m218409H2().m203901A().userId, m218409H2().m203938o());
        }
        if (slk0.m184826b(m218409H2().m203901A())) {
            ((LiveVChatCallingView) this.viewModel).m69726l();
        }
        if (slk0.m184825a(m218409H2().m203901A())) {
            ((LiveVChatCallingView) this.viewModel).m69723e();
            this.f127931g.m109940f();
        }
        if (slk0.m184831g(m218409H2().m203901A())) {
            this.f127931g.m109940f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m183719Z2(BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveVChatCallingView) v2).m69729p(bLiveVideoChatAttendeeCallInfo);
        }
    }

    @Override // p149l.lfu, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((LiveVChatCallingView) this.viewModel).m69727m();
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(new e30() { // from class: l.qeu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154061a.m183718Y2((String) obj);
            }
        });
        m104250o2(iuu.m138447H(m218409H2().m203946w().chat.liveId), false).subscribe(ffw.m121193d(new e30() { // from class: l.reu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159087a.m183719Z2((BLiveVideoChatAttendeeCallInfo) obj);
            }
        }));
    }

    @Override // p149l.lfu
    /* JADX INFO: renamed from: U2 */
    public void mo142754U2() {
        String str;
        this.f127931g.m109940f();
        if (slk0.m184830f(m218409H2().m203901A())) {
            str = slk0.f165242h;
            aru.m98558g();
        } else {
            str = slk0.f165239e;
        }
        m218409H2().m203919S(str);
    }

    /* JADX INFO: renamed from: a3 */
    public void m183720a3(String str, String str2) {
        if (this.f127930f != null) {
            return;
        }
        cwf0 cwf0Var = new cwf0(aru.f71357k, "LiveVChatDialingModule");
        this.f127930f = cwf0Var;
        cwf0Var.m109040p(j760.m140076a("sender_id", str), j760.m140076a("receiver_id", str2));
        this.f127930f.m109033i();
        this.f127930f.m109036l();
    }
}
