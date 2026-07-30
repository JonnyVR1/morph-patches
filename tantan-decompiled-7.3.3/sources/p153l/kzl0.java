package p153l;

import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCanJoinGame;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGame;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class kzl0 {
    /* JADX INFO: renamed from: d */
    public static C22421c<BLiveEnvelope> m152182d(String str) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/gamePlayer")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "cancelPrepare");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202552m(rnlVarM182301d, "cancelPrepare", jSONObject.toString());
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<BLiveVoiceCanJoinGame> m152183e(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/canJoinGame")).m182288p().m182301d(), "checkCanJoinGame").map(new qcj() { // from class: l.izl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.canJoinGame;
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<String> m152184f(String str) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/live/game/sub/login")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", str);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182301d, "getCode" + jSONObject.toString(), jSONObject.toString()).map(new qcj() { // from class: l.jzl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.code;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<BLiveVoiceGame> m152185g(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/game")).m182288p().m182301d(), "getGameDetail").map(new qcj() { // from class: l.hzl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.game;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<BLiveEnvelope> m152186h(String str) {
        return vrv.m202555p(rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/gamePlayer")).m182288p().m182301d(), "", "joinGame");
    }

    /* JADX INFO: renamed from: i */
    public static C22421c<BLiveEnvelope> m152187i(String str, String str2, String str3) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/gamePlayer")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str2);
            jSONObject.put(Reason.TYPE, str3);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202549j(rnlVarM182301d, "leaveGame", jSONObject.toString());
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<BLiveEnvelope> m152188j(String str) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/gamePlayer")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "prepare");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202552m(rnlVarM182301d, "joinGame", jSONObject.toString());
    }

    /* JADX INFO: renamed from: k */
    public static C22421c<BLiveEnvelope> m152189k(String str, String str2, String str3) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/game")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "end");
            jSONObject.put("providerRoundId", str2);
            jSONObject.put(Reason.TYPE, str3);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202552m(rnlVarM182301d, "cancelPrepare", jSONObject.toString());
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<BLiveEnvelope> m152190l(String str, String str2, List<String> list, String str3, String str4) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/game")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("providerRoundId", str2);
            jSONObject.put("playerUserIds", new JSONArray((Collection) list));
            jSONObject.put("gameType", str3);
            jSONObject.put("startUserId", str4);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182301d, "cancelPrepare", jSONObject.toString());
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<BLiveEnvelope> m152191m(String str, String str2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-lives/" + str)).m182288p().m182300c("type", "switchGameType").m182300c("gameType", str2).m182301d(), "switchGame", "");
    }
}
