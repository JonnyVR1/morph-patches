package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.d3q;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005B%\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m88121d2 = {"Ll/bpm0;", "Ll/d3q;", "I", "Ll/rwn0;", "D", "Ll/i6t;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/dum;", BaseSei.INFO, OMSTemplateModeType.view, "<init>", "(Ljava/lang/String;Ll/dum;Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;)V", "", "K3", "()V", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "J3", "()Ljava/lang/String;", "j", "Ll/dum;", "getInfo", "()Ll/dum;", "k", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "getView", "()Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class bpm0<I extends d3q<?>, D extends rwn0> extends i6t<D, LiveVoiceAuctionListPage> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final dum<D> info;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final LiveVoiceAuctionListPage view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpm0(@NotNull String str, @NotNull dum<D> dumVar, @NotNull LiveVoiceAuctionListPage liveVoiceAuctionListPage) {
        super(dumVar);
        str.getClass();
        dumVar.getClass();
        liveVoiceAuctionListPage.getClass();
        this.name = str;
        this.info = dumVar;
        this.view = liveVoiceAuctionListPage;
        mo52715C(liveVoiceAuctionListPage);
    }

    @NotNull
    /* JADX INFO: renamed from: J3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: K3 */
    public abstract void mo99534K3();
}
