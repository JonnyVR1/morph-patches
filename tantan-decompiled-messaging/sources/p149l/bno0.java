package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseRankAwardInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseTaskInfos;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpLeaderBoards;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class bno0 {
    /* JADX INFO: renamed from: k */
    public static C22306c<soj0> m102808k(String str, String str2, String str3, String str4) {
        String string;
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/voice-cp/" + str + "/today-task-do"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("houseId", str2);
            jSONObject.put("otherUserId", str3);
            jSONObject.put("action", str4);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        return upv.m194928p(cllVarM107499l, "todayTask", string).map(new w9j() { // from class: l.smo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return soj0.f165695a;
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<BLiveVoiceCpLeaderBoards> m102809l() {
        return upv.m194935w(LiveApiBuilder.m67315u(ytr.m216073b("/voice-cp/leaderboard"), new mt0[0]), "getCPList").map(new w9j() { // from class: l.xmo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpLeaderBoards;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<BLiveData> m102810m(String str) {
        return upv.m194935w(LiveApiBuilder.m67315u(ytr.m216073b("/voice-cp/" + str + "/cp-tab"), new mt0[0]), "getCpTab").map(new w9j() { // from class: l.ymo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static C22306c<BLiveVoiceCpHouseRankAwardInfo> m102811n(String str, String str2) {
        return upv.m194935w(LiveApiBuilder.m67315u(ytr.m216073b("/voice-cp/houseInfo"), mt0.m156174a("houseId", str), mt0.m156174a("otherUserId", str2)), "getHouseInfo").map(new w9j() { // from class: l.tmo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpHouseInfo;
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static C22306c<List<BLiveVoiceCpHouseInfo>> m102812o(String str) {
        return upv.m194935w(LiveApiBuilder.m67315u(ytr.m216073b("/voice-cp/housesList"), mt0.m156174a("otherUserId", str)), "getHousesList").map(new w9j() { // from class: l.rmo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpHouseList;
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static C22306c<List<BLiveVoiceSweetCpInviteRecord>> m102813p() {
        return upv.m194935w(LiveApiBuilder.m67315u(ytr.m216073b("/voice-cp/invite_records"), new mt0[0]), "getInviteRecords").map(new w9j() { // from class: l.zmo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.cpInviteRecords;
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static C22306c<List<BLiveVoiceSweetLimitHouse>> m102814q(String str) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/voice-cp/limitSkin/skins")).m107524p();
        if (!TextUtils.isEmpty(str)) {
            c16188aM107524p.m107536c("otherUserId", str);
        }
        return upv.m194935w(c16188aM107524p.m107537d(), "getLimitSkin").map(new w9j() { // from class: l.umo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.skinList;
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static C22306c<BLiveVoiceCpHouseTaskInfos> m102815r(String str, String str2, String str3) {
        return upv.m194935w(LiveApiBuilder.m67315u(ytr.m216073b("/voice-cp/" + str + "/today-tasks"), mt0.m156174a("houseId", str2), mt0.m156174a("otherUserId", str3)), "getTodayTasks").map(new w9j() { // from class: l.vmo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpHouseTaskInfos;
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static C22306c<BLiveEnvelope> m102816s(boolean z, String str, int i) {
        String string;
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/voice-cp/limitSkin/wearOrRemove"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wear", z);
            jSONObject.put("otherUserId", str);
            jSONObject.put("id", i);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        return upv.m194928p(cllVarM107499l, "limitHouseWearOrRemove", string);
    }

    /* JADX INFO: renamed from: t */
    public static C22306c<soj0> m102817t(String str, String str2, String str3) {
        String string;
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/voice-cp/" + str + "/bind"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str2);
            jSONObject.put("otherUserId", str3);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        return upv.m194928p(cllVarM107499l, "sweetCpBind", string).map(new w9j() { // from class: l.ano0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return soj0.f165695a;
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static C22306c<soj0> m102818u(String str, String str2) {
        String string;
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/voice-cp/" + str + "/unbind"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otherUserId", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        return upv.m194928p(cllVarM107499l, "sweetCpUnbind", string).map(new w9j() { // from class: l.wmo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return soj0.f165695a;
            }
        });
    }
}
