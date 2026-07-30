package p149l;

import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCanJoinGame;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGame;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class gql0 {
    /* JADX INFO: renamed from: d */
    public static C22306c<BLiveEnvelope> m127597d(String str) {
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/gamePlayer")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "cancelPrepare");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194925m(cllVarM107537d, "cancelPrepare", jSONObject.toString());
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<BLiveVoiceCanJoinGame> m127598e(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/canJoinGame")).m107524p().m107537d(), "checkCanJoinGame").map(new w9j() { // from class: l.eql0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.canJoinGame;
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<String> m127599f(String str) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/live/game/sub/login")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", str);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107537d, "getCode" + jSONObject.toString(), jSONObject.toString()).map(new w9j() { // from class: l.fql0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.code;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<BLiveVoiceGame> m127600g(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/game")).m107524p().m107537d(), "getGameDetail").map(new w9j() { // from class: l.dql0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.game;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<BLiveEnvelope> m127601h(String str) {
        return upv.m194928p(cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/gamePlayer")).m107524p().m107537d(), "", "joinGame");
    }

    /* JADX INFO: renamed from: i */
    public static C22306c<BLiveEnvelope> m127602i(String str, String str2, String str3) {
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/gamePlayer")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str2);
            jSONObject.put(Reason.TYPE, str3);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194922j(cllVarM107537d, "leaveGame", jSONObject.toString());
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<BLiveEnvelope> m127603j(String str) {
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/gamePlayer")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "prepare");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194925m(cllVarM107537d, "joinGame", jSONObject.toString());
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<BLiveEnvelope> m127604k(String str, String str2, String str3) {
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/game")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "end");
            jSONObject.put("providerRoundId", str2);
            jSONObject.put(Reason.TYPE, str3);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194925m(cllVarM107537d, "cancelPrepare", jSONObject.toString());
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<BLiveEnvelope> m127605l(String str, String str2, List<String> list, String str3, String str4) {
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/game")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("providerRoundId", str2);
            jSONObject.put("playerUserIds", new JSONArray((Collection) list));
            jSONObject.put("gameType", str3);
            jSONObject.put("startUserId", str4);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107537d, "cancelPrepare", jSONObject.toString());
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<BLiveEnvelope> m127606m(String str, String str2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-lives/" + str)).m107524p().m107536c("type", "switchGameType").m107536c("gameType", str2).m107537d(), "switchGame", "");
    }
}
