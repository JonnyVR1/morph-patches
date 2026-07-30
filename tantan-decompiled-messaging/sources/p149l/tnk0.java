package p149l;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p046p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartAct;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class tnk0 implements q0m<unk0> {

    /* JADX INFO: renamed from: a */
    public c4g0 f171251a;

    /* JADX INFO: renamed from: b */
    public wlu f171252b;

    /* JADX INFO: renamed from: c */
    public C22392a<Pair<Boolean, Boolean>> f171253c = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public unk0 f171254d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m189777G(View view) {
        m189803t();
    }

    /* JADX INFO: renamed from: I */
    private void m189778I() {
        wlu wluVar = this.f171252b;
        if (wluVar == null || wluVar.m203902B() == null || TextUtils.isEmpty(this.f171252b.m203902B().f44476id)) {
            gkh0.m126627j("video_chat_window", "return because live");
        } else if (!slk0.m184829e(this.f171252b.m203901A())) {
            gkh0.m126627j("video_chat_window", "return because video chat data");
        } else {
            gkh0.m126627j("video_chat_window", "start refresh");
            iuu.m138444E(this.f171252b.m203902B().f44476id).filter(new w9j() { // from class: l.ink0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f114024a.m189799F((BLiveVideoChatLive) obj);
                }
            }).subscribe(ffw.m121197h(new e30() { // from class: l.jnk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f118870a.m189792s((BLiveVideoChatLive) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: K */
    private void m189779K() {
        this.f171251a = m189805v(C22306c.interval(s9s.f163228b.m195705P5(), TimeUnit.SECONDS)).onBackpressureLatest().compose(mkd0.m154951C()).subscribe(ffw.m121193d(new e30() { // from class: l.rnk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160273a.m189800H((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m189784f(BLiveVideoChatLive bLiveVideoChatLive) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C22306c m189790n(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m189792s(BLiveVideoChatLive bLiveVideoChatLive) {
        if (bLiveVideoChatLive == null || "stopped".equals(bLiveVideoChatLive.status)) {
            m189804u(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m189793x(String str) {
        BLiveVideoChat bLiveVideoChatM203901A = this.f171252b.m203901A();
        if (!slk0.m184830f(bLiveVideoChatM203901A)) {
            mgh0.m154551g(PlaybackException.CUSTOM_ERROR_CODE_BASE);
        } else if (Act.isAppVisible()) {
            m189803t();
        } else {
            umk0.m194373a(bLiveVideoChatM203901A.getAttendee().userName);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m189794y() {
        C22392a<Pair<Boolean, Boolean>> c22392aM221512b = C22392a.m221512b();
        this.f171253c = c22392aM221512b;
        c22392aM221512b.onNext(Pair.create(Boolean.FALSE, Boolean.TRUE));
        this.f171252b.m203922V();
        m189805v(this.f171252b.f186998c.m216979l().f170403S1).subscribe(ffw.m121193d(new e30() { // from class: l.lnk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128997a.m189796B((BLiveVideoChat) obj);
            }
        }));
        m189805v(this.f171252b.m203948z()).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.mnk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134761a.m189793x((String) obj);
            }
        }));
        m189805v(this.f171252b.f186998c.m216979l().m189138r0()).subscribe(ffw.m121193d(new e30() { // from class: l.nnk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139733a.m189797D((LongLinkVideoChat.LiveVideoChatLiveChange) obj);
            }
        }));
        m189805v(this.f171252b.f186998c.m216979l().f170412V1).subscribe(ffw.m121197h(new e30() { // from class: l.onk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144799a.m189798E((liveAuthMessageNew.MultiDevice) obj);
            }
        }));
        m189779K();
        m189778I();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m189795A() {
        m189804u(true);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m189796B(BLiveVideoChat bLiveVideoChat) {
        this.f171252b.m203934h0(bLiveVideoChat, true);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m189797D(LongLinkVideoChat.LiveVideoChatLiveChange liveVideoChatLiveChange) {
        if ("stopped".equals(liveVideoChatLiveChange.getStatus())) {
            m189806w(liveVideoChatLiveChange.getReason(), false);
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m189798E(liveAuthMessageNew.MultiDevice multiDevice) {
        m189806w("", true);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Boolean m189799F(BLiveVideoChatLive bLiveVideoChatLive) {
        return Boolean.valueOf(!"stopped".equals(this.f171252b.m203902B().status));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m189800H(Long l2) {
        m189778I();
    }

    /* JADX INFO: renamed from: J */
    public boolean m189801J(wlu wluVar) {
        this.f171252b = wluVar;
        m189794y();
        return this.f171254d.m194456c(new View.OnClickListener() { // from class: l.knk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123892a.m189777G(view);
            }
        }, l9s.m149047J().m60124fp().url);
    }

    public boolean isShowing() {
        unk0 unk0Var = this.f171254d;
        return unk0Var != null && unk0Var.isShowing();
    }

    /* JADX INFO: renamed from: r */
    public void m189802r(unk0 unk0Var) {
        unk0Var.mo21065i1(this);
        this.f171254d = unk0Var;
    }

    /* JADX INFO: renamed from: t */
    public void m189803t() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return;
        }
        ArrayList<Act.C4299r> next = Act.globalLifeCycle_().values().iterator().next();
        if (vwb.m200296J(next)) {
            m189804u(true);
            return;
        }
        Activity activity = next.get(next.size() - 1).f15343a.get();
        if (!(activity instanceof Act)) {
            m189804u(true);
        } else {
            VChatStartAct.m69218e2((Act) activity, this.f171252b);
            m189804u(false);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m189804u(boolean z) {
        this.f171253c.onCompleted();
        this.f171254d.m194455b();
        if (z) {
            ib1.m135233b().mo135234a(LiveVChatAct.f45046i);
            wlu wluVar = this.f171252b;
            if (wluVar != null) {
                wluVar.m203936m(true);
                iuu.m138464Y(this.f171252b.m203902B().f44476id).subscribe(ffw.m121197h(new e30() { // from class: l.hnk0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        tnk0.m189784f((BLiveVideoChatLive) obj);
                    }
                }));
            }
        }
        this.f171252b = null;
    }

    /* JADX INFO: renamed from: v */
    public <T> C22306c<T> m189805v(final C22306c<T> c22306c) {
        return mkd0.m154952D(new v9j() { // from class: l.snk0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return tnk0.m189790n(c22306c);
            }
        }, this.f171253c, false);
    }

    /* JADX INFO: renamed from: w */
    public void m189806w(String str, boolean z) {
        mkd0.m154992z(this.f171251a);
        wlu wluVar = this.f171252b;
        if (wluVar != null && wluVar.m203902B() != null) {
            this.f171252b.m203902B().status = "stopped";
        }
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
        if (activity == null) {
            m189804u(true);
            return;
        }
        wlu wluVar2 = this.f171252b;
        if (z) {
            wluVar2.m203927a0(activity, "已在其他设备登录", new d30() { // from class: l.pnk0
                @Override // p149l.d30
                public final void call() {
                    this.f150398a.m189807z();
                }
            });
        } else {
            wluVar2.m203927a0(activity, str, new d30() { // from class: l.qnk0
                @Override // p149l.d30
                public final void call() {
                    this.f155480a.m189795A();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m189807z() {
        m189804u(true);
    }
}
