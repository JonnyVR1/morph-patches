package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseRankAwardInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseTaskInfos;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpLeaderBoards;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import l.cll;
import l.mt0;
import l.soj0;
import l.w9j;
import l.ytr;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bno0 {
    /* JADX INFO: renamed from: k */
    public static c<soj0> m12168k(String str, String str2, String str3, String str4) {
        String string;
        cll cllVarL = cll.l(ytr.b("/voice-cp/" + str + "/today-task-do"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("houseId", str2);
            jSONObject.put("otherUserId", str3);
            jSONObject.put("action", str4);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        return upv.m23148p(cllVarL, "todayTask", string).map(new w9j() { // from class: l.smo0
            public final Object call(Object obj) {
                return soj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static c<BLiveVoiceCpLeaderBoards> m12169l() {
        return upv.m23155w(LiveApiBuilder.u(ytr.b("/voice-cp/leaderboard"), new mt0[0]), "getCPList").map(new w9j() { // from class: l.xmo0
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpLeaderBoards;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static c<BLiveData> m12170m(String str) {
        return upv.m23155w(LiveApiBuilder.u(ytr.b("/voice-cp/" + str + "/cp-tab"), new mt0[0]), "getCpTab").map(new w9j() { // from class: l.ymo0
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static c<BLiveVoiceCpHouseRankAwardInfo> m12171n(String str, String str2) {
        return upv.m23155w(LiveApiBuilder.u(ytr.b("/voice-cp/houseInfo"), new mt0[]{mt0.a("houseId", str), mt0.a("otherUserId", str2)}), "getHouseInfo").map(new w9j() { // from class: l.tmo0
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpHouseInfo;
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static c<List<BLiveVoiceCpHouseInfo>> m12172o(String str) {
        return upv.m23155w(LiveApiBuilder.u(ytr.b("/voice-cp/housesList"), new mt0[]{mt0.a("otherUserId", str)}), "getHousesList").map(new w9j() { // from class: l.rmo0
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpHouseList;
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static c<List<BLiveVoiceSweetCpInviteRecord>> m12173p() {
        return upv.m23155w(LiveApiBuilder.u(ytr.b("/voice-cp/invite_records"), new mt0[0]), "getInviteRecords").map(new w9j() { // from class: l.zmo0
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.cpInviteRecords;
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static c<List<BLiveVoiceSweetLimitHouse>> m12174q(String str) {
        cll.a aVarP = cll.l(ytr.b("/voice-cp/limitSkin/skins")).p();
        if (!TextUtils.isEmpty(str)) {
            aVarP.c("otherUserId", str);
        }
        return upv.m23155w(aVarP.d(), "getLimitSkin").map(new w9j() { // from class: l.umo0
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.skinList;
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static c<BLiveVoiceCpHouseTaskInfos> m12175r(String str, String str2, String str3) {
        return upv.m23155w(LiveApiBuilder.u(ytr.b("/voice-cp/" + str + "/today-tasks"), new mt0[]{mt0.a("houseId", str2), mt0.a("otherUserId", str3)}), "getTodayTasks").map(new w9j() { // from class: l.vmo0
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpHouseTaskInfos;
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static c<BLiveEnvelope> m12176s(boolean z, String str, int i) {
        String string;
        cll cllVarL = cll.l(ytr.b("/voice-cp/limitSkin/wearOrRemove"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wear", z);
            jSONObject.put("otherUserId", str);
            jSONObject.put("id", i);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        return upv.m23148p(cllVarL, "limitHouseWearOrRemove", string);
    }

    /* JADX INFO: renamed from: t */
    public static c<soj0> m12177t(String str, String str2, String str3) {
        String string;
        cll cllVarL = cll.l(ytr.b("/voice-cp/" + str + "/bind"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str2);
            jSONObject.put("otherUserId", str3);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        return upv.m23148p(cllVarL, "sweetCpBind", string).map(new w9j() { // from class: l.ano0
            public final Object call(Object obj) {
                return soj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static c<soj0> m12178u(String str, String str2) {
        String string;
        cll cllVarL = cll.l(ytr.b("/voice-cp/" + str + "/unbind"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otherUserId", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        return upv.m23148p(cllVarL, "sweetCpUnbind", string).map(new w9j() { // from class: l.wmo0
            public final Object call(Object obj) {
                return soj0.a;
            }
        });
    }
}
