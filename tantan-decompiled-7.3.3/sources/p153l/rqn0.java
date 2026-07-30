package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class rqn0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveEnvelope m182659b(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope;
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<BLiveEnvelope> m182663f(String str, String str2, String str3) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/live/voice-lives/" + str + "/voice-ktv-orders")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("songCode", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("provider", str3);
            }
        } catch (JSONException unused) {
        }
        return vrv.m202555p(rnlVarM182301d, "chooseSong" + str + str2, jSONObject.toString());
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<BLiveEnvelope> m182664g(String str, String str2) {
        return vrv.m202549j(rnl.m182263l(zvr.m221802b("/live/voice-lives/" + str + "/voice-ktv-orders/" + str2)).m182288p().m182301d(), "deleteSong" + str + str2, new JSONObject().toString());
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<BLiveVoiceKtvGameInfo> m182665h(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/voice-ktvs")), "getKtvGameInfo").map(new qcj() { // from class: l.mqn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceKTVGame;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static C22421c<List<BLiveVoiceKTVSong>> m182666i(String str, String str2, String str3) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/voice-ktv-songs")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, str2);
        if (!str3.isEmpty()) {
            c19886aM182300c.m182300c(BLivePkInviteSource.query, str3);
        }
        return vrv.m202562w(c19886aM182300c.m182301d(), "getMusicList").map(new qcj() { // from class: l.pqn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceKTVSongs;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<List<BLiveVoiceKTVOrder>> m182667j(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/voice-ktv-orders")).m182288p().m182301d(), "getMusicOrderList").map(new qcj() { // from class: l.qqn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceKTVOrders;
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static C22421c<BLiveEnvelope> m182668k(String str, String str2) {
        String strM221805e = zvr.m221805e("/voice-lives/" + str + "/voice-ktv-songs");
        if (!TextUtils.isEmpty(str2)) {
            strM221805e = strM221805e + "?" + str2;
        }
        return vrv.m202562w(rnl.m182263l(strM221805e).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, "trySing").m182301d(), "getMusicList").map(new qcj() { // from class: l.nqn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rqn0.m182659b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<BLiveEnvelope> m182669l(String str, String str2, String str3) {
        nsh0.m164608j("[voice][ktv]", "reportKtvAction:" + str3);
        return vrv.m202552m(rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/voice-ktv-orders/" + str2)).m182288p().m182300c("action", str3).m182301d(), "reportKtvAction", "");
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<BLiveEnvelope> m182670m(String str, String str2, String str3) {
        nsh0.m164608j("[voice][ktv]", "reportSongPlayFailed：" + str3);
        return vrv.m202552m(rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/voice-ktv-orders/" + str2)).m182288p().m182300c("action", qd80.f156677l).m182300c(Reason.TYPE, str3).m182301d(), "reportKtvAction", "");
    }

    /* JADX INFO: renamed from: n */
    public static C22421c<BLiveVoiceKtvGameInfo> m182671n(String str) {
        return vrv.m202555p(rnl.m182263l(zvr.m221805e("/voice-lives/" + str + "/voice-ktvs")).m182288p().m182301d(), "startKtv", "").map(new qcj() { // from class: l.oqn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceKTVGame;
            }
        });
    }
}
