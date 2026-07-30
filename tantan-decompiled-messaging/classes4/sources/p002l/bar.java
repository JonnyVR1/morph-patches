package p002l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardEntranceItem;
import com.p1.mobile.putong.live.base.data.BLiveVoiceUserLeaderBoard;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.cll;
import l.upv;
import l.w9j;
import l.ytr;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bar {
    /* JADX INFO: renamed from: d */
    public static c<BLiveVoiceHourLeaderBoard> m10207d(String str, String str2, long j, String str3, String str4, String str5, @Nullable ho2 ho2Var) {
        cll.a aVarP = cll.l(ytr.b("/voice/leaderboards")).p();
        aVarP.c("name", str);
        aVarP.c("type", str2);
        aVarP.c("period", str3);
        aVarP.c("timestamp", String.valueOf(j));
        if (NullChecker.a(ho2Var)) {
            aVarP.c("anchorId", ho2Var.m14576j0());
            aVarP.c("roomId", ho2Var.m17239o());
        }
        if (!TextUtils.isEmpty(str4)) {
            aVarP.c("regionId", str4);
        }
        if (NullChecker.a(str5)) {
            aVarP.c("otherId", str5);
        }
        return upv.w(aVarP.d(), "pollVoiceHourLeaderBoards_" + str + str2 + j).map(new w9j() { // from class: l.aar
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceWeekLeaderboards;
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static c<List<BLiveVoiceLeaderBoardEntranceItem>> m10208e(String str, String str2, String str3, String str4, boolean z) {
        cll.a aVarP = cll.l(ytr.b("/live/voice-leaderboard-entrances")).p();
        aVarP.c("roomId", str);
        aVarP.c("liveId", str2);
        aVarP.c("anchorId", str3);
        aVarP.c("template", str4);
        aVarP.c("isPersonal", String.valueOf(z));
        return upv.w(aVarP.d(), "pollVoiceLeaderBoardEntrances_" + str + str2 + str3).map(new w9j() { // from class: l.z9r
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLeaderboardEntrances;
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static c<BLiveVoiceUserLeaderBoard> m10209f(String str, String str2) {
        return upv.w(cll.l(ytr.b("/live/voice-lives/" + str + "/call-users/" + str2 + "/leaderboards")).p().d(), "pollVoiceUserLeaderBoards").map(new w9j() { // from class: l.y9r
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceUserLeaderboards;
            }
        });
    }
}
