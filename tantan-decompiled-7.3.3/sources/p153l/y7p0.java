package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserLeaderBoard;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/y7p0;", "Ll/l6t;", "Lcom/p1/mobile/putong/live/livingroom/virtual/call/userleaderboard/page/VoiceUserLeaderBoardPage;", "leaderBoardView", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/ner;", "lifecycleProvider", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "userLeaderBoard", "<init>", "(Lcom/p1/mobile/putong/live/livingroom/virtual/call/userleaderboard/page/VoiceUserLeaderBoardPage;Ljava/lang/String;Ll/ner;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;)V", "", Constants.KEY_T, "()V", "n", "e", "Ljava/lang/String;", "D2", "()Ljava/lang/String;", "f", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "getUserLeaderBoard", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class y7p0 extends l6t<VoiceUserLeaderBoardPage> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceUserLeaderBoard userLeaderBoard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7p0(@NotNull VoiceUserLeaderBoardPage voiceUserLeaderBoardPage, @NotNull String str, @NotNull ner nerVar, @NotNull BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard) {
        super(nerVar);
        voiceUserLeaderBoardPage.getClass();
        str.getClass();
        nerVar.getClass();
        bLiveVoiceUserLeaderBoard.getClass();
        this.name = str;
        this.userLeaderBoard = bLiveVoiceUserLeaderBoard;
        mo52715C(voiceUserLeaderBoardPage);
    }

    @NotNull
    /* JADX INFO: renamed from: D2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        VoiceUserLeaderBoardPage voiceUserLeaderBoardPage = (VoiceUserLeaderBoardPage) this.viewModel;
        if (voiceUserLeaderBoardPage != null) {
            voiceUserLeaderBoardPage.m78061l0();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((VoiceUserLeaderBoardPage) this.viewModel).m78059j0(this.name, this.userLeaderBoard);
    }
}
