package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatRandomMatch;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;

/* JADX INFO: loaded from: classes13.dex */
public class jpu extends lfu {
    public jpu(jlu jluVar, LiveVChatCallingView liveVChatCallingView) {
        super(jluVar, liveVChatCallingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public void m142753Z2(String str) {
        if (slk0.m184826b(m218409H2().m203901A())) {
            ((LiveVChatCallingView) this.viewModel).m69726l();
        }
        if (slk0.m184825a(m218409H2().m203901A())) {
            this.f127931g.m109940f();
            ((LiveVChatCallingView) this.viewModel).m69723e();
        }
    }

    @Override // p149l.lfu, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((LiveVChatCallingView) this.viewModel).m69727m();
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(new e30() { // from class: l.ipu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114349a.m142753Z2((String) obj);
            }
        });
        ((LiveVChatCallingView) this.viewModel).m69730q(m218409H2().m203946w().randomMatch);
        this.f127931g.m109938d();
        m142757c3();
    }

    @Override // p149l.lfu
    /* JADX INFO: renamed from: U2 */
    public void mo142754U2() {
        String str;
        this.f127931g.m109940f();
        zvf0.m220396r(aru.f71352f, aru.f71358l);
        if (m218409H2().m203901A() == null) {
            if (TextUtils.isEmpty(m218409H2().m203946w().randomMatch.f44477id)) {
                m218412L2(true);
                return;
            } else {
                iuu.m138463X(m218409H2().m203946w().randomMatch.f44477id).subscribe(ffw.m121194e(new e30() { // from class: l.gpu
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f103840a.m142755a3((BLiveVideoChatRandomMatch) obj);
                    }
                }, new e30() { // from class: l.hpu
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f108966a.m142756b3((Throwable) obj);
                    }
                }));
                return;
            }
        }
        if (slk0.m184830f(m218409H2().m203901A())) {
            str = slk0.f165242h;
            aru.m98558g();
        } else {
            str = slk0.f165239e;
        }
        m218409H2().m203919S(str);
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m142755a3(BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch) {
        m218412L2(true);
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m142756b3(Throwable th) {
        m218412L2(true);
    }

    /* JADX INFO: renamed from: c3 */
    public void m142757c3() {
        if (this.f127930f != null) {
            return;
        }
        cwf0 cwf0Var = new cwf0(aru.f71358l, "LiveVChatRandomMatchModule");
        this.f127930f = cwf0Var;
        cwf0Var.m109033i();
        this.f127930f.m109036l();
    }
}
