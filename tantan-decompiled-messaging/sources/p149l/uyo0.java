package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserLeaderBoard;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/uyo0;", "Ll/k4t;", "Lcom/p1/mobile/putong/live/livingroom/virtual/call/userleaderboard/page/VoiceUserLeaderBoardPage;", "leaderBoardView", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/mcr;", "lifecycleProvider", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "userLeaderBoard", "<init>", "(Lcom/p1/mobile/putong/live/livingroom/virtual/call/userleaderboard/page/VoiceUserLeaderBoardPage;Ljava/lang/String;Ll/mcr;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;)V", "", Constants.KEY_T, "()V", "n", "e", "Ljava/lang/String;", "D2", "()Ljava/lang/String;", "f", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "getUserLeaderBoard", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class uyo0 extends k4t<VoiceUserLeaderBoardPage> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceUserLeaderBoard userLeaderBoard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyo0(@NotNull VoiceUserLeaderBoardPage voiceUserLeaderBoardPage, @NotNull String str, @NotNull mcr mcrVar, @NotNull BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard) {
        super(mcrVar);
        voiceUserLeaderBoardPage.getClass();
        str.getClass();
        mcrVar.getClass();
        bLiveVoiceUserLeaderBoard.getClass();
        this.name = str;
        this.userLeaderBoard = bLiveVoiceUserLeaderBoard;
        mo51532C(voiceUserLeaderBoardPage);
    }

    @NotNull
    /* JADX INFO: renamed from: D2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        VoiceUserLeaderBoardPage voiceUserLeaderBoardPage = (VoiceUserLeaderBoardPage) this.viewModel;
        if (voiceUserLeaderBoardPage != null) {
            voiceUserLeaderBoardPage.m76878l0();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((VoiceUserLeaderBoardPage) this.viewModel).m76876j0(this.name, this.userLeaderBoard);
    }
}
