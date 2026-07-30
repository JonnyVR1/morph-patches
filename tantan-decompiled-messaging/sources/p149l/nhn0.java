package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class nhn0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveEnvelope m159418b(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope;
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<BLiveEnvelope> m159422f(String str, String str2, String str3) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/live/voice-lives/" + str + "/voice-ktv-orders")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("songCode", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("provider", str3);
            }
        } catch (JSONException unused) {
        }
        return upv.m194928p(cllVarM107537d, "chooseSong" + str + str2, jSONObject.toString());
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<BLiveEnvelope> m159423g(String str, String str2) {
        return upv.m194922j(cll.m107499l(ytr.m216073b("/live/voice-lives/" + str + "/voice-ktv-orders/" + str2)).m107524p().m107537d(), "deleteSong" + str + str2, new JSONObject().toString());
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<BLiveVoiceKtvGameInfo> m159424h(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/voice-ktvs")), "getKtvGameInfo").map(new w9j() { // from class: l.ihn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceKTVGame;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static C22306c<List<BLiveVoiceKTVSong>> m159425i(String str, String str2, String str3) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/voice-ktv-songs")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, str2);
        if (!str3.isEmpty()) {
            c16188aM107536c.m107536c(BLivePkInviteSource.query, str3);
        }
        return upv.m194935w(c16188aM107536c.m107537d(), "getMusicList").map(new w9j() { // from class: l.lhn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceKTVSongs;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<List<BLiveVoiceKTVOrder>> m159426j(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/voice-ktv-orders")).m107524p().m107537d(), "getMusicOrderList").map(new w9j() { // from class: l.mhn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceKTVOrders;
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<BLiveEnvelope> m159427k(String str, String str2) {
        String strM216076e = ytr.m216076e("/voice-lives/" + str + "/voice-ktv-songs");
        if (!TextUtils.isEmpty(str2)) {
            strM216076e = strM216076e + "?" + str2;
        }
        return upv.m194935w(cll.m107499l(strM216076e).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, "trySing").m107537d(), "getMusicList").map(new w9j() { // from class: l.jhn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return nhn0.m159418b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<BLiveEnvelope> m159428l(String str, String str2, String str3) {
        gkh0.m126627j("[voice][ktv]", "reportKtvAction:" + str3);
        return upv.m194925m(cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/voice-ktv-orders/" + str2)).m107524p().m107536c("action", str3).m107537d(), "reportKtvAction", "");
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<BLiveEnvelope> m159429m(String str, String str2, String str3) {
        gkh0.m126627j("[voice][ktv]", "reportSongPlayFailed：" + str3);
        return upv.m194925m(cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/voice-ktv-orders/" + str2)).m107524p().m107536c("action", k580.f121166l).m107536c(Reason.TYPE, str3).m107537d(), "reportKtvAction", "");
    }

    /* JADX INFO: renamed from: n */
    public static C22306c<BLiveVoiceKtvGameInfo> m159430n(String str) {
        return upv.m194928p(cll.m107499l(ytr.m216076e("/voice-lives/" + str + "/voice-ktvs")).m107524p().m107537d(), "startKtv", "").map(new w9j() { // from class: l.khn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceKTVGame;
            }
        });
    }
}
