package p153l;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p051p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartAct;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class zwk0 implements k3m<axk0> {

    /* JADX INFO: renamed from: a */
    public kcg0 f206355a;

    /* JADX INFO: renamed from: b */
    public xnu f206356b;

    /* JADX INFO: renamed from: c */
    public C22507a<Pair<Boolean, Boolean>> f206357c = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public axk0 f206358d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m221912G(View view) {
        m221938t();
    }

    /* JADX INFO: renamed from: I */
    private void m221913I() {
        xnu xnuVar = this.f206356b;
        if (xnuVar == null || xnuVar.m212309B() == null || TextUtils.isEmpty(this.f206356b.m212309B().f45324id)) {
            nsh0.m164608j("video_chat_window", "return because live");
        } else if (!yuk0.m217439e(this.f206356b.m212308A())) {
            nsh0.m164608j("video_chat_window", "return because video chat data");
        } else {
            nsh0.m164608j("video_chat_window", "start refresh");
            jwu.m147230E(this.f206356b.m212309B().f45324id).filter(new qcj() { // from class: l.owk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f149542a.m221934F((BLiveVideoChatLive) obj);
                }
            }).subscribe(dhw.m115829h(new y20() { // from class: l.pwk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f154414a.m221927s((BLiveVideoChatLive) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: K */
    private void m221914K() {
        this.f206355a = m221940v(C22421c.interval(tbs.f172989b.m203492P5(), TimeUnit.SECONDS)).onBackpressureLatest().compose(psd0.m173592C()).subscribe(dhw.m115825d(new y20() { // from class: l.xwk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196505a.m221935H((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m221919f(BLiveVideoChatLive bLiveVideoChatLive) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C22421c m221925n(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m221927s(BLiveVideoChatLive bLiveVideoChatLive) {
        if (bLiveVideoChatLive == null || "stopped".equals(bLiveVideoChatLive.status)) {
            m221939u(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m221928x(String str) {
        BLiveVideoChat bLiveVideoChatM212308A = this.f206356b.m212308A();
        if (!yuk0.m217440f(bLiveVideoChatM212308A)) {
            toh0.m192047g(PlaybackException.CUSTOM_ERROR_CODE_BASE);
        } else if (Act.isAppVisible()) {
            m221938t();
        } else {
            awk0.m100674a(bLiveVideoChatM212308A.getAttendee().userName);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m221929y() {
        C22507a<Pair<Boolean, Boolean>> c22507aM222758b = C22507a.m222758b();
        this.f206357c = c22507aM222758b;
        c22507aM222758b.onNext(Pair.create(Boolean.FALSE, Boolean.TRUE));
        this.f206356b.m212329V();
        m221940v(this.f206356b.f195472c.m120391l().f71670S1).subscribe(dhw.m115825d(new y20() { // from class: l.rwk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165182a.m221931B((BLiveVideoChat) obj);
            }
        }));
        m221940v(this.f206356b.m212355z()).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.swk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170980a.m221928x((String) obj);
            }
        }));
        m221940v(this.f206356b.f195472c.m120391l().m98320r0()).subscribe(dhw.m115825d(new y20() { // from class: l.twk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176403a.m221932D((LongLinkVideoChat.LiveVideoChatLiveChange) obj);
            }
        }));
        m221940v(this.f206356b.f195472c.m120391l().f71679V1).subscribe(dhw.m115829h(new y20() { // from class: l.uwk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181306a.m221933E((liveAuthMessageNew.MultiDevice) obj);
            }
        }));
        m221914K();
        m221913I();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m221930A() {
        m221939u(true);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m221931B(BLiveVideoChat bLiveVideoChat) {
        this.f206356b.m212341h0(bLiveVideoChat, true);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m221932D(LongLinkVideoChat.LiveVideoChatLiveChange liveVideoChatLiveChange) {
        if ("stopped".equals(liveVideoChatLiveChange.getStatus())) {
            m221941w(liveVideoChatLiveChange.getReason(), false);
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m221933E(liveAuthMessageNew.MultiDevice multiDevice) {
        m221941w("", true);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Boolean m221934F(BLiveVideoChatLive bLiveVideoChatLive) {
        return Boolean.valueOf(!"stopped".equals(this.f206356b.m212309B().status));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m221935H(Long l2) {
        m221913I();
    }

    /* JADX INFO: renamed from: J */
    public boolean m221936J(xnu xnuVar) {
        this.f206356b = xnuVar;
        m221929y();
        return this.f206358d.m100776c(new View.OnClickListener() { // from class: l.qwk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159945a.m221912G(view);
            }
        }, mbs.m157824J().m61308fp().url);
    }

    public boolean isShowing() {
        axk0 axk0Var = this.f206358d;
        return axk0Var != null && axk0Var.isShowing();
    }

    /* JADX INFO: renamed from: r */
    public void m221937r(axk0 axk0Var) {
        axk0Var.mo22064i1(this);
        this.f206358d = axk0Var;
    }

    /* JADX INFO: renamed from: t */
    public void m221938t() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return;
        }
        ArrayList<Act.C4450r> next = Act.globalLifeCycle_().values().iterator().next();
        if (jyb.m147479J(next)) {
            m221939u(true);
            return;
        }
        Activity activity = next.get(next.size() - 1).f16062a.get();
        if (!(activity instanceof Act)) {
            m221939u(true);
        } else {
            VChatStartAct.m70401g2((Act) activity, this.f206356b);
            m221939u(false);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m221939u(boolean z) {
        this.f206357c.onCompleted();
        this.f206358d.m100775b();
        if (z) {
            pb1.m171472b().mo171473a(LiveVChatAct.f45894i);
            xnu xnuVar = this.f206356b;
            if (xnuVar != null) {
                xnuVar.m212343m(true);
                jwu.m147250Y(this.f206356b.m212309B().f45324id).subscribe(dhw.m115829h(new y20() { // from class: l.nwk0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        zwk0.m221919f((BLiveVideoChatLive) obj);
                    }
                }));
            }
        }
        this.f206356b = null;
    }

    /* JADX INFO: renamed from: v */
    public <T> C22421c<T> m221940v(final C22421c<T> c22421c) {
        return psd0.m173593D(new pcj() { // from class: l.ywk0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return zwk0.m221925n(c22421c);
            }
        }, this.f206357c, false);
    }

    /* JADX INFO: renamed from: w */
    public void m221941w(String str, boolean z) {
        psd0.m173633z(this.f206355a);
        xnu xnuVar = this.f206356b;
        if (xnuVar != null && xnuVar.m212309B() != null) {
            this.f206356b.m212309B().status = "stopped";
        }
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
        if (activity == null) {
            m221939u(true);
            return;
        }
        xnu xnuVar2 = this.f206356b;
        if (z) {
            xnuVar2.m212334a0(activity, "已在其他设备登录", new x20() { // from class: l.vwk0
                @Override // p153l.x20
                public final void call() {
                    this.f186146a.m221942z();
                }
            });
        } else {
            xnuVar2.m212334a0(activity, str, new x20() { // from class: l.wwk0
                @Override // p153l.x20
                public final void call() {
                    this.f191305a.m221930A();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m221942z() {
        m221939u(true);
    }
}
