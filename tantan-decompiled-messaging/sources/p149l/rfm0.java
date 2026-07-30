package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListPage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.d1q;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005B%\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m87232d2 = {"Ll/rfm0;", "Ll/d1q;", "I", "Ll/nnn0;", "D", "Ll/h4t;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/bsm;", BaseSei.INFO, OMSTemplateModeType.view, "<init>", "(Ljava/lang/String;Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;)V", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "", "L3", "(I)V", "c", "()V", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "J3", "()Ljava/lang/String;", "j", "Ll/bsm;", "getInfo", "()Ll/bsm;", "k", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "K3", "()Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class rfm0<I extends d1q<?>, D extends nnn0> extends h4t<D, LiveVoiceAuctionLeaderboardListPage> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> info;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final LiveVoiceAuctionLeaderboardListPage view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfm0(@NotNull String str, @NotNull bsm<D> bsmVar, @NotNull LiveVoiceAuctionLeaderboardListPage liveVoiceAuctionLeaderboardListPage) {
        super(bsmVar);
        str.getClass();
        bsmVar.getClass();
        liveVoiceAuctionLeaderboardListPage.getClass();
        this.name = str;
        this.info = bsmVar;
        this.view = liveVoiceAuctionLeaderboardListPage;
        mo51532C(liveVoiceAuctionLeaderboardListPage);
    }

    @NotNull
    /* JADX INFO: renamed from: J3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: K3, reason: from getter */
    public final LiveVoiceAuctionLeaderboardListPage getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: L3 */
    public abstract void mo179135L3(int offset);

    /* JADX INFO: renamed from: c */
    public abstract void mo179136c();
}
