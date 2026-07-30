package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class peu extends lfu {

    /* JADX INFO: renamed from: h */
    public BLiveVideoChatAnchorCall f148484h;

    /* JADX INFO: renamed from: i */
    public c4g0 f148485i;

    public peu(jlu jluVar, LiveVChatCallingView liveVChatCallingView) {
        super(jluVar, liveVChatCallingView);
    }

    @Override // p149l.lfu, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m218410I2(m218411K2().LiveVideoChatEvent.m69195e(), new e30() { // from class: l.meu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133494a.m168553a3((BLiveVideoChatAnchorCall) obj);
            }
        });
        m104250o2(m218409H2().f186998c.m216979l().m189129o0(), false).subscribe(ffw.m121193d(new e30() { // from class: l.neu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138653a.m168555c3((LongLinkVideoChat.LiveVideoChatAnchorCallResult) obj);
            }
        }));
    }

    @Override // p149l.lfu
    /* JADX INFO: renamed from: U2 */
    public void mo142754U2() {
        if (slk0.m184830f(m218409H2().m203901A()) || slk0.m184826b(m218409H2().m203901A())) {
            lsi0.m151580j("正在接通中");
        } else {
            m168551Y2();
            zvf0.m220396r(aru.f71350d, aru.f71354h);
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public void m168551Y2() {
        mkd0.m154992z(this.f148485i);
        this.f127931g.m109940f();
        ((LiveVChatCallingView) this.viewModel).m69723e();
        this.f148484h = null;
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m168552Z2(String str) {
        if (this.f148484h == null) {
            return;
        }
        lsi0.m151580j(str);
        m168551Y2();
    }

    /* JADX INFO: renamed from: a3 */
    public void m168553a3(BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall) {
        this.f148484h = bLiveVideoChatAnchorCall;
        this.f127931g.m109938d();
        ((LiveVChatCallingView) this.viewModel).m69728n(bLiveVideoChatAnchorCall);
        m168558f3(bLiveVideoChatAnchorCall.anchorId, bLiveVideoChatAnchorCall.userId);
        this.f148485i = m104250o2(C22306c.interval(s9s.f163228b.m195697O5(), TimeUnit.SECONDS), false).take(1).compose(mkd0.m154951C()).subscribe(ffw.m121193d(new e30() { // from class: l.oeu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143580a.m168556d3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b3 */
    public void m168554b3(String str) {
        if (this.f148484h == null) {
            return;
        }
        if (slk0.m184830f(m218409H2().m203901A())) {
            m218409H2().m203919S(slk0.f165235a);
            ((LiveVChatCallingView) this.viewModel).setTitle("接通中，请稍候");
            mkd0.m154992z(this.f148485i);
        }
        if (slk0.m184825a(m218409H2().m203901A()) || slk0.m184831g(m218409H2().m203901A())) {
            m168551Y2();
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m168555c3(LongLinkVideoChat.LiveVideoChatAnchorCallResult liveVideoChatAnchorCallResult) {
        m168552Z2("对方忙线中");
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m168556d3(Long l2) {
        m168552Z2("对方无应答");
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m168557e3(BLiveVideoChat bLiveVideoChat) {
        BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall = this.f148484h;
        if (bLiveVideoChatAnchorCall == null) {
            return false;
        }
        if (TextUtils.equals(bLiveVideoChatAnchorCall.f44475id, bLiveVideoChat.anchorCallId)) {
            return true;
        }
        m168551Y2();
        return false;
    }

    /* JADX INFO: renamed from: f3 */
    public void m168558f3(String str, String str2) {
        if (this.f127930f != null) {
            return;
        }
        cwf0 cwf0Var = new cwf0(aru.f71354h, "LiveVChatAnchorRecallModule");
        this.f127930f = cwf0Var;
        cwf0Var.m109040p(j760.m140076a("sender_id", str), j760.m140076a("receiver_id", str2));
        this.f127930f.m109033i();
        this.f127930f.m109036l();
    }
}
