package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseRankAwardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseTaskInfos;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpLeaderBoards;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class fwo0 {
    /* JADX INFO: renamed from: k */
    public static C22421c<vxj0> m127818k(String str, String str2, String str3, String str4) {
        String string;
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/voice-cp/" + str + "/today-task-do"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("houseId", str2);
            jSONObject.put("otherUserId", str3);
            jSONObject.put("action", str4);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        return vrv.m202555p(rnlVarM182263l, "todayTask", string).map(new qcj() { // from class: l.wvo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vxj0.f186265a;
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<BLiveVoiceCpLeaderBoards> m127819l() {
        return vrv.m202562w(LiveApiBuilder.m68498u(zvr.m221802b("/voice-cp/leaderboard"), new st0[0]), "getCPList").map(new qcj() { // from class: l.bwo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpLeaderBoards;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<BLiveData> m127820m(String str) {
        return vrv.m202562w(LiveApiBuilder.m68498u(zvr.m221802b("/voice-cp/" + str + "/cp-tab"), new st0[0]), "getCpTab").map(new qcj() { // from class: l.cwo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static C22421c<BLiveVoiceCpHouseRankAwardInfo> m127821n(String str, String str2) {
        return vrv.m202562w(LiveApiBuilder.m68498u(zvr.m221802b("/voice-cp/houseInfo"), st0.m187803a("houseId", str), st0.m187803a("otherUserId", str2)), "getHouseInfo").map(new qcj() { // from class: l.xvo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpHouseInfo;
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static C22421c<List<BLiveVoiceCpHouseInfo>> m127822o(String str) {
        return vrv.m202562w(LiveApiBuilder.m68498u(zvr.m221802b("/voice-cp/housesList"), st0.m187803a("otherUserId", str)), "getHousesList").map(new qcj() { // from class: l.vvo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpHouseList;
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static C22421c<List<BLiveVoiceSweetCpInviteRecord>> m127823p() {
        return vrv.m202562w(LiveApiBuilder.m68498u(zvr.m221802b("/voice-cp/invite_records"), new st0[0]), "getInviteRecords").map(new qcj() { // from class: l.dwo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.cpInviteRecords;
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static C22421c<List<BLiveVoiceSweetLimitHouse>> m127824q(String str) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/voice-cp/limitSkin/skins")).m182288p();
        if (!TextUtils.isEmpty(str)) {
            c19886aM182288p.m182300c("otherUserId", str);
        }
        return vrv.m202562w(c19886aM182288p.m182301d(), "getLimitSkin").map(new qcj() { // from class: l.yvo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.skinList;
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static C22421c<BLiveVoiceCpHouseTaskInfos> m127825r(String str, String str2, String str3) {
        return vrv.m202562w(LiveApiBuilder.m68498u(zvr.m221802b("/voice-cp/" + str + "/today-tasks"), st0.m187803a("houseId", str2), st0.m187803a("otherUserId", str3)), "getTodayTasks").map(new qcj() { // from class: l.zvo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceCpHouseTaskInfos;
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static C22421c<BLiveEnvelope> m127826s(boolean z, String str, int i) {
        String string;
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/voice-cp/limitSkin/wearOrRemove"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wear", z);
            jSONObject.put("otherUserId", str);
            jSONObject.put("id", i);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        return vrv.m202555p(rnlVarM182263l, "limitHouseWearOrRemove", string);
    }

    /* JADX INFO: renamed from: t */
    public static C22421c<vxj0> m127827t(String str, String str2, String str3) {
        String string;
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/voice-cp/" + str + "/bind"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str2);
            jSONObject.put("otherUserId", str3);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        return vrv.m202555p(rnlVarM182263l, "sweetCpBind", string).map(new qcj() { // from class: l.ewo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vxj0.f186265a;
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static C22421c<vxj0> m127828u(String str, String str2) {
        String string;
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/voice-cp/" + str + "/unbind"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otherUserId", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        return vrv.m202555p(rnlVarM182263l, "sweetCpUnbind", string).map(new qcj() { // from class: l.awo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vxj0.f186265a;
            }
        });
    }
}
