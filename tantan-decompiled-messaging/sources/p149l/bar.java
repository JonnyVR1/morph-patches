package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardEntranceItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserLeaderBoard;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class bar {
    /* JADX INFO: renamed from: d */
    public static C22306c<BLiveVoiceHourLeaderBoard> m100924d(String str, String str2, long j, String str3, String str4, String str5, @Nullable ho2 ho2Var) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/voice/leaderboards")).m107524p();
        c16188aM107524p.m107536c(AuthenticationTokenClaims.JSON_KEY_NAME, str);
        c16188aM107524p.m107536c("type", str2);
        c16188aM107524p.m107536c("period", str3);
        c16188aM107524p.m107536c("timestamp", String.valueOf(j));
        if (NullChecker.m81303a(ho2Var)) {
            c16188aM107524p.m107536c("anchorId", ho2Var.m132140j0());
            c16188aM107524p.m107536c("roomId", ho2Var.m149818o());
        }
        if (!TextUtils.isEmpty(str4)) {
            c16188aM107524p.m107536c("regionId", str4);
        }
        if (NullChecker.m81303a(str5)) {
            c16188aM107524p.m107536c("otherId", str5);
        }
        return upv.m194935w(c16188aM107524p.m107537d(), "pollVoiceHourLeaderBoards_" + str + str2 + j).map(new w9j() { // from class: l.aar
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceWeekLeaderboards;
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<List<BLiveVoiceLeaderBoardEntranceItem>> m100925e(String str, String str2, String str3, String str4, boolean z) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live/voice-leaderboard-entrances")).m107524p();
        c16188aM107524p.m107536c("roomId", str);
        c16188aM107524p.m107536c("liveId", str2);
        c16188aM107524p.m107536c("anchorId", str3);
        c16188aM107524p.m107536c("template", str4);
        c16188aM107524p.m107536c("isPersonal", String.valueOf(z));
        return upv.m194935w(c16188aM107524p.m107537d(), "pollVoiceLeaderBoardEntrances_" + str + str2 + str3).map(new w9j() { // from class: l.z9r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLeaderboardEntrances;
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<BLiveVoiceUserLeaderBoard> m100926f(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-lives/" + str + "/call-users/" + str2 + "/leaderboards")).m107524p().m107537d(), "pollVoiceUserLeaderBoards").map(new w9j() { // from class: l.y9r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceUserLeaderboards;
            }
        });
    }
}
