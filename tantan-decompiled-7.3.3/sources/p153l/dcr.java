package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardEntranceItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserLeaderBoard;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class dcr {
    /* JADX INFO: renamed from: d */
    public static C22421c<BLiveVoiceHourLeaderBoard> m115280d(String str, String str2, long j, String str3, String str4, String str5, @Nullable oo2 oo2Var) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/voice/leaderboards")).m182288p();
        c19886aM182288p.m182300c(AuthenticationTokenClaims.JSON_KEY_NAME, str);
        c19886aM182288p.m182300c("type", str2);
        c19886aM182288p.m182300c("period", str3);
        c19886aM182288p.m182300c("timestamp", String.valueOf(j));
        if (NullChecker.m82486a(oo2Var)) {
            c19886aM182288p.m182300c("anchorId", oo2Var.m168526j0());
            c19886aM182288p.m182300c("roomId", oo2Var.m202194o());
        }
        if (!TextUtils.isEmpty(str4)) {
            c19886aM182288p.m182300c("regionId", str4);
        }
        if (NullChecker.m82486a(str5)) {
            c19886aM182288p.m182300c("otherId", str5);
        }
        return vrv.m202562w(c19886aM182288p.m182301d(), "pollVoiceHourLeaderBoards_" + str + str2 + j).map(new qcj() { // from class: l.ccr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceWeekLeaderboards;
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<List<BLiveVoiceLeaderBoardEntranceItem>> m115281e(String str, String str2, String str3, String str4, boolean z) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live/voice-leaderboard-entrances")).m182288p();
        c19886aM182288p.m182300c("roomId", str);
        c19886aM182288p.m182300c("liveId", str2);
        c19886aM182288p.m182300c("anchorId", str3);
        c19886aM182288p.m182300c("template", str4);
        c19886aM182288p.m182300c("isPersonal", String.valueOf(z));
        return vrv.m202562w(c19886aM182288p.m182301d(), "pollVoiceLeaderBoardEntrances_" + str + str2 + str3).map(new qcj() { // from class: l.bcr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLeaderboardEntrances;
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<BLiveVoiceUserLeaderBoard> m115282f(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-lives/" + str + "/call-users/" + str2 + "/leaderboards")).m182288p().m182301d(), "pollVoiceUserLeaderBoards").map(new qcj() { // from class: l.acr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceUserLeaderboards;
            }
        });
    }
}
