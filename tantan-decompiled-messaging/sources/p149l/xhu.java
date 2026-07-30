package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCalledView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class xhu extends cfu {
    public xhu(jlu jluVar, LiveVChatCalledView liveVChatCalledView) {
        super(jluVar, liveVChatCalledView);
    }

    @Override // p149l.cfu, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(new e30() { // from class: l.thu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170283a.m208825a3((String) obj);
            }
        });
        m104250o2(iuu.m138447H(m218409H2().m203946w().live.f44476id), false).subscribe(ffw.m121193d(new e30() { // from class: l.uhu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176594a.m208828d3((BLiveVideoChatAttendeeCallInfo) obj);
            }
        }));
        BLiveVideoChatLive bLiveVideoChatLive = m218409H2().m203946w().live;
        m218409H2().m203924X(bLiveVideoChatLive.roomId);
        m208829e3(bLiveVideoChatLive.anchorId, l9s.m149093o0());
        this.f80664g.m109938d();
    }

    @Override // p149l.cfu
    /* JADX INFO: renamed from: T2 */
    public void mo106601T2() {
        this.f80664g.m109940f();
        VChatStartAct.m69227s2("fakeCall", "fakeAccept");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new mj60().m124171h(new d30() { // from class: l.vhu
            @Override // p149l.d30
            public final void call() {
                this.f181529a.m208826b3();
            }
        }).m124173j("fakeCall"));
        arrayList.add(new c2l0(new d30() { // from class: l.whu
            @Override // p149l.d30
            public final void call() {
                this.f186465a.m208827c3();
            }
        }));
        VChatStartAct.m69224p2(act(), arrayList);
        aru.m98556e();
    }

    @Override // p149l.cfu
    /* JADX INFO: renamed from: V2 */
    public void mo106602V2() {
        String str;
        this.f80664g.m109940f();
        if (m218409H2().m203901A() == null) {
            if (!TextUtils.isEmpty(m218409H2().m203946w().recallId)) {
                iuu.m138454O(m218409H2().m203946w().recallId, "reject");
            }
            aru.m98557f();
            m106603W2();
            m218412L2(true);
            return;
        }
        if (slk0.m184830f(m218409H2().m203901A())) {
            str = slk0.f165242h;
            aru.m98557f();
        } else {
            str = slk0.f165239e;
        }
        m218409H2().m203919S(str);
    }

    /* JADX INFO: renamed from: a3 */
    public void m208825a3(String str) {
        if (slk0.m184825a(m218409H2().m203901A())) {
            ((LiveVChatCalledView) this.viewModel).m69706j(false);
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m208826b3() {
        m218412L2(true);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m208827c3() {
        m218409H2().m203937n(this);
        ((LiveVChatCalledView) this.viewModel).m69714u(true);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m208828d3(BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveVChatCalledView) v2).m69716w(bLiveVideoChatAttendeeCallInfo);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public void m208829e3(String str, String str2) {
        if (this.f80663f != null) {
            return;
        }
        cwf0 cwf0Var = new cwf0(aru.f71356j, "LiveVChatDialingModule");
        this.f80663f = cwf0Var;
        cwf0Var.m109040p(j760.m140076a("sender_id", str), j760.m140076a("receiver_id", str2), j760.m140076a("source", m218409H2().m203946w().source));
        this.f80663f.m109033i();
        this.f80663f.m109036l();
    }
}
