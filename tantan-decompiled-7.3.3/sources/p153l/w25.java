package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p051p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import java.util.Objects;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class w25<D extends oo2> extends i6t<D, ChatView> {

    /* JADX INFO: renamed from: i */
    public final ChatInputEntryView f186871i;

    public w25(dum<D> dumVar, ChatView chatView, ChatInputEntryView chatInputEntryView) {
        super(dumVar);
        this.f186871i = chatInputEntryView;
        mo52715C(chatView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m204515Z3(Boolean bool) {
        ((ChatView) this.viewModel).setLiveMode(bool.booleanValue());
    }

    /* JADX INFO: renamed from: g4 */
    private void m204516g4(boolean z) {
        ((ChatView) this.viewModel).m73671l(z);
        this.f186871i.m73818o(z);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m204517S3(boolean z) {
        this.f186871i.m73819p(z);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().BottomEvent.setApplyLineVisibility().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.n25
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139812a.m204517S3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((C22421c) m213811F2().CampaignVisibleChangeEvent.VISIBLE().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.o25
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144722a.m204518T3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((C22421c) m213811F2().ChatEvent.keyboardDetectorChange().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.p25
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150241a.m204522X3((c0r) obj);
            }
        }));
        C22421c c22421cObserveOn = duringCreated((C22421c) m213811F2().ChatEvent.customChatInputStyle().m199270g()).observeOn(fo0.m126432a());
        final ChatInputEntryView chatInputEntryView = this.f186871i;
        Objects.requireNonNull(chatInputEntryView);
        c22421cObserveOn.subscribe(dhw.m115829h(new y20() { // from class: l.q25
            @Override // p153l.y20
            public final void call(Object obj) {
                chatInputEntryView.setCustomStyle((BLiveChatBox) obj);
            }
        }));
        duringCreated(C22421c.combineLatest(m213811F2().PlayerEvent.ctypChanged().m199270g(), m213811F2().PlayerEvent.videoSizeChanged().m199270g(), new rcj() { // from class: l.r25
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f160914a.m204523Y3((fyb) obj, (Float) obj2);
            }
        })).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.s25
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165863a.m204515Z3((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final void m204518T3(boolean z) {
        int iM143316a = j35.m143316a((View) this.viewModel, z);
        m213811F2().ChatEvent.refreshChatList().m199277p();
        m204529f4(iM143316a + qa00.m175859d(10.0f));
    }

    /* JADX INFO: renamed from: U3 */
    public void m204519U3(int i) {
        ((ChatView) this.viewModel).m73666d(i);
        this.f186871i.m73809f(i);
    }

    /* JADX INFO: renamed from: V3 */
    public void m204520V3() {
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("chatButtonBubble");
    }

    /* JADX INFO: renamed from: W3 */
    public AbstractC17128g4.a m204521W3(String str) {
        if (bnl0.m105529O0(this.f186871i.m73811h(str))) {
            return new AbstractC17128g4.a(this.f186871i.m73811h(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m204522X3(c0r c0rVar) {
        ((ChatView) this.viewModel).m73670k(Boolean.valueOf(c0rVar.f79291a), c0rVar.f79292b, c0rVar.f79293c);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ Boolean m204523Y3(fyb fybVar, Float f) {
        return (fybVar.f101357a != 0 || f.floatValue() <= 1.0f || m213810E2().mo183435j() == null || !"obs".equals(m213810E2().mo183435j().liveMode)) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m204524a4(h1e h1eVar) {
        m204516g4(!h1eVar.f107443c);
    }

    /* JADX INFO: renamed from: b4 */
    public void m204525b4(int i, boolean z) {
        m213811F2().ChatEvent.scrollToEnd().m199277p();
        if (z) {
            return;
        }
        ((ChatView) this.viewModel).setDefaultHeight(i);
    }

    /* JADX INFO: renamed from: c4 */
    public void m204526c4(boolean z, String str) {
        m213811F2().ChatEvent.chatInputClick().mo199273j(new vv4(z, str));
    }

    /* JADX INFO: renamed from: d4 */
    public void m204527d4() {
        ((ChatView) this.viewModel).m73667f();
        this.f186871i.m73816m();
    }

    /* JADX INFO: renamed from: e4 */
    public void m204528e4(BLiveChatTip bLiveChatTip) {
        this.f186871i.m73817n(bLiveChatTip);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m204529f4(int i) {
        m213811F2().ChatViewRightChangeEvent.chatRightChange().mo199273j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h4 */
    public void m204530h4(boolean z) {
        ((ChatView) this.viewModel).m73672m(z);
        this.f186871i.m73820q(z);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f186871i.m73810g();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((ChatView) this.viewModel).m73671l(true);
        this.f186871i.m73818o(true);
        if (!LiveWatchCounter.m77513h().m77521m()) {
            m213811F2().BootBubbleEvent.showBubbleByType().mo199273j("chatButtonBubble");
        }
        duringCreated((C22421c) m213811F2().DialogCenterEvent.changeVisibility().m199270g()).filter(new qcj() { // from class: l.t25
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((h1e) obj).f107442b == 80);
            }
        }).filter(new qcj() { // from class: l.u25
            @Override // p153l.qcj
            public final Object call(Object obj) {
                h1e h1eVar = (h1e) obj;
                return Boolean.valueOf((h1eVar == null || h1eVar.f107441a == LiveDialogEnum.CHAT_INPUT) ? false : true);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.v25
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182069a.m204524a4((h1e) obj);
            }
        }));
    }
}
