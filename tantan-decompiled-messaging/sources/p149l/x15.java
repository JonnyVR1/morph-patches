package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p046p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import java.util.Objects;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class x15<D extends ho2> extends h4t<D, ChatView> {

    /* JADX INFO: renamed from: i */
    public final ChatInputEntryView f189016i;

    public x15(bsm<D> bsmVar, ChatView chatView, ChatInputEntryView chatInputEntryView) {
        super(bsmVar);
        this.f189016i = chatInputEntryView;
        mo51532C(chatView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m206670Z3(Boolean bool) {
        ((ChatView) this.viewModel).setLiveMode(bool.booleanValue());
    }

    /* JADX INFO: renamed from: g4 */
    private void m206671g4(boolean z) {
        ((ChatView) this.viewModel).m72488l(z);
        this.f189016i.m72635o(z);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m206672S3(boolean z) {
        this.f189016i.m72636p(z);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().BottomEvent.setApplyLineVisibility().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.o15
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141404a.m206672S3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((C22306c) m206028F2().CampaignVisibleChangeEvent.VISIBLE().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.p15
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146651a.m206673T3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((C22306c) m206028F2().ChatEvent.keyboardDetectorChange().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.q15
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152104a.m206677X3((cyq) obj);
            }
        }));
        C22306c c22306cObserveOn = duringCreated((C22306c) m206028F2().ChatEvent.customChatInputStyle().m172460g()).observeOn(jo0.m142408a());
        final ChatInputEntryView chatInputEntryView = this.f189016i;
        Objects.requireNonNull(chatInputEntryView);
        c22306cObserveOn.subscribe(ffw.m121197h(new e30() { // from class: l.r15
            @Override // p149l.e30
            public final void call(Object obj) {
                chatInputEntryView.setCustomStyle((BLiveChatBox) obj);
            }
        }));
        duringCreated(C22306c.combineLatest(m206028F2().PlayerEvent.ctypChanged().m172460g(), m206028F2().PlayerEvent.videoSizeChanged().m172460g(), new x9j() { // from class: l.s15
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f161863a.m206678Y3((rwb) obj, (Float) obj2);
            }
        })).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.t15
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167287a.m206670Z3((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final void m206673T3(boolean z) {
        int iM144260a = k25.m144260a((View) this.viewModel, z);
        m206028F2().ChatEvent.refreshChatList().m172467p();
        m206684f4(iM144260a + t100.m186890d(10.0f));
    }

    /* JADX INFO: renamed from: U3 */
    public void m206674U3(int i) {
        ((ChatView) this.viewModel).m72483d(i);
        this.f189016i.m72626f(i);
    }

    /* JADX INFO: renamed from: V3 */
    public void m206675V3() {
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("chatButtonBubble");
    }

    /* JADX INFO: renamed from: W3 */
    public AbstractC16991g4.a m206676W3(String str) {
        if (xdl0.m208349O0(this.f189016i.m72628h(str))) {
            return new AbstractC16991g4.a(this.f189016i.m72628h(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m206677X3(cyq cyqVar) {
        ((ChatView) this.viewModel).m72487k(Boolean.valueOf(cyqVar.f83023a), cyqVar.f83024b, cyqVar.f83025c);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ Boolean m206678Y3(rwb rwbVar, Float f) {
        return (rwbVar.f161324a != 0 || f.floatValue() <= 1.0f || m206027E2().mo149813j() == null || !"obs".equals(m206027E2().mo149813j().liveMode)) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m206679a4(tzd tzdVar) {
        m206671g4(!tzdVar.f172731c);
    }

    /* JADX INFO: renamed from: b4 */
    public void m206680b4(int i, boolean z) {
        m206028F2().ChatEvent.scrollToEnd().m172467p();
        if (z) {
            return;
        }
        ((ChatView) this.viewModel).setDefaultHeight(i);
    }

    /* JADX INFO: renamed from: c4 */
    public void m206681c4(boolean z, String str) {
        m206028F2().ChatEvent.chatInputClick().mo172463j(new wu4(z, str));
    }

    /* JADX INFO: renamed from: d4 */
    public void m206682d4() {
        ((ChatView) this.viewModel).m72484f();
        this.f189016i.m72633m();
    }

    /* JADX INFO: renamed from: e4 */
    public void m206683e4(BLiveChatTip bLiveChatTip) {
        this.f189016i.m72634n(bLiveChatTip);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m206684f4(int i) {
        m206028F2().ChatViewRightChangeEvent.chatRightChange().mo172463j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h4 */
    public void m206685h4(boolean z) {
        ((ChatView) this.viewModel).m72489m(z);
        this.f189016i.m72637q(z);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f189016i.m72627g();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((ChatView) this.viewModel).m72488l(true);
        this.f189016i.m72635o(true);
        if (!LiveWatchCounter.m76330h().m76338m()) {
            m206028F2().BootBubbleEvent.showBubbleByType().mo172463j("chatButtonBubble");
        }
        duringCreated((C22306c) m206028F2().DialogCenterEvent.changeVisibility().m172460g()).filter(new w9j() { // from class: l.u15
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f172730b == 80);
            }
        }).filter(new w9j() { // from class: l.v15
            @Override // p149l.w9j
            public final Object call(Object obj) {
                tzd tzdVar = (tzd) obj;
                return Boolean.valueOf((tzdVar == null || tzdVar.f172729a == LiveDialogEnum.CHAT_INPUT) ? false : true);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.w15
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183972a.m206679a4((tzd) obj);
            }
        }));
    }
}
