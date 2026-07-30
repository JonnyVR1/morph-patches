package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import java.util.Objects;
import l.bwr;
import l.e30;
import l.ffw;
import l.jo0;
import l.rwb;
import l.t100;
import l.w9j;
import l.x9j;
import l.xdl0;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x15<D extends ho2> extends h4t<D, ChatView> {

    /* JADX INFO: renamed from: i */
    public final ChatInputEntryView f22070i;

    public x15(bsm<D> bsmVar, ChatView chatView, ChatInputEntryView chatInputEntryView) {
        super(bsmVar);
        this.f22070i = chatInputEntryView;
        C(chatView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m25587Z3(Boolean bool) {
        ((ChatView) ((bwr) this).viewModel).setLiveMode(bool.booleanValue());
    }

    /* JADX INFO: renamed from: g4 */
    private void m25588g4(boolean z) {
        ((ChatView) ((bwr) this).viewModel).m5980l(z);
        this.f22070i.m6137o(z);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m25589S3(boolean z) {
        this.f22070i.m6138p(z);
    }

    /* JADX INFO: renamed from: T */
    public void m25590T() {
        super.T();
        duringCreated((c) m25548F2().BottomEvent.setApplyLineVisibility().g()).subscribe(ffw.d(new e30() { // from class: l.o15
            public final void call(Object obj) {
                this.f16328a.m25589S3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((c) m25548F2().CampaignVisibleChangeEvent.VISIBLE().g()).subscribe(ffw.d(new e30() { // from class: l.p15
            public final void call(Object obj) {
                this.f16951a.m25591T3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.keyboardDetectorChange().g()).subscribe(ffw.d(new e30() { // from class: l.q15
            public final void call(Object obj) {
                this.f17752a.m25595X3((cyq) obj);
            }
        }));
        c cVarObserveOn = duringCreated((c) m25548F2().ChatEvent.customChatInputStyle().g()).observeOn(jo0.a());
        final ChatInputEntryView chatInputEntryView = this.f22070i;
        Objects.requireNonNull(chatInputEntryView);
        cVarObserveOn.subscribe(ffw.h(new e30() { // from class: l.r15
            public final void call(Object obj) {
                chatInputEntryView.setCustomStyle((BLiveChatBox) obj);
            }
        }));
        duringCreated(c.combineLatest((c) m25548F2().PlayerEvent.ctypChanged().g(), (c) m25548F2().PlayerEvent.videoSizeChanged().g(), new x9j() { // from class: l.s15
            public final Object call(Object obj, Object obj2) {
                return this.f18753a.m25596Y3((rwb) obj, (Float) obj2);
            }
        })).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.t15
            public final void call(Object obj) {
                this.f19356a.m25587Z3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m25591T3(boolean z) {
        int iM16465a = k25.m16465a(((bwr) this).viewModel, z);
        m25548F2().ChatEvent.refreshChatList().p();
        m25602f4(iM16465a + t100.d(10.0f));
    }

    /* JADX INFO: renamed from: U3 */
    public void m25592U3(int i) {
        ((ChatView) ((bwr) this).viewModel).m5974d(i);
        this.f22070i.m6128f(i);
    }

    /* JADX INFO: renamed from: V3 */
    public void m25593V3() {
        m25548F2().BootBubbleEvent.dismissBubble().j("chatButtonBubble");
    }

    /* JADX INFO: renamed from: W3 */
    public AbstractC0583g4.a m25594W3(String str) {
        if (xdl0.O0(this.f22070i.m6130h(str))) {
            return new AbstractC0583g4.a(this.f22070i.m6130h(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m25595X3(cyq cyqVar) {
        ((ChatView) ((bwr) this).viewModel).m5979k(Boolean.valueOf(cyqVar.f8986a), cyqVar.f8987b, cyqVar.f8988c);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ Boolean m25596Y3(rwb rwbVar, Float f) {
        return (rwbVar.a != 0 || f.floatValue() <= 1.0f || m25547E2().m17234j() == null || !"obs".equals(m25547E2().m17234j().liveMode)) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m25597a4(tzd tzdVar) {
        m25588g4(!tzdVar.f20438c);
    }

    /* JADX INFO: renamed from: b4 */
    public void m25598b4(int i, boolean z) {
        m25548F2().ChatEvent.scrollToEnd().p();
        if (z) {
            return;
        }
        ((ChatView) ((bwr) this).viewModel).setDefaultHeight(i);
    }

    /* JADX INFO: renamed from: c4 */
    public void m25599c4(boolean z, String str) {
        m25548F2().ChatEvent.chatInputClick().j(new wu4(z, str));
    }

    /* JADX INFO: renamed from: d4 */
    public void m25600d4() {
        ((ChatView) ((bwr) this).viewModel).m5975f();
        this.f22070i.m6135m();
    }

    /* JADX INFO: renamed from: e4 */
    public void m25601e4(BLiveChatTip bLiveChatTip) {
        this.f22070i.m6136n(bLiveChatTip);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m25602f4(int i) {
        m25548F2().ChatViewRightChangeEvent.chatRightChange().j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h4 */
    public void m25603h4(boolean z) {
        ((ChatView) ((bwr) this).viewModel).m5981m(z);
        this.f22070i.m6139q(z);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f22070i.m6129g();
    }

    /* JADX INFO: renamed from: t */
    public void m25604t() {
        super.t();
        ((ChatView) ((bwr) this).viewModel).m5980l(true);
        this.f22070i.m6137o(true);
        if (!LiveWatchCounter.h().m()) {
            m25548F2().BootBubbleEvent.showBubbleByType().j("chatButtonBubble");
        }
        duringCreated((c) m25548F2().DialogCenterEvent.changeVisibility().g()).filter(new w9j() { // from class: l.u15
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f20437b == 80);
            }
        }).filter(new w9j() { // from class: l.v15
            public final Object call(Object obj) {
                tzd tzdVar = (tzd) obj;
                return Boolean.valueOf((tzdVar == null || tzdVar.f20436a == LiveDialogEnum.CHAT_INPUT) ? false : true);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.w15
            public final void call(Object obj) {
                this.f21408a.m25597a4((tzd) obj);
            }
        }));
    }
}
