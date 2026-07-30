package p153l;

import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import org.json.JSONArray;
import org.json.JSONObject;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class esg0 implements nzg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rog0 f95611a;

    public esg0(rog0 rog0Var) {
        this.f95611a = rog0Var;
    }

    @Override // p153l.nzg0
    /* JADX INFO: renamed from: a */
    public final void mo122353a() {
        SudLogger.m222811d(this.f95611a.f164194a, "onRecognizeSuccess:");
        LogUtils.file("AiAgentImpl", "onRecognizeSuccess:");
    }

    @Override // p153l.nzg0
    /* JADX INFO: renamed from: b */
    public final void mo122354b() {
        LogUtils.file("AiAgentImpl", "db asr client onClosed");
        SudLogger.m222811d(this.f95611a.f164194a, "db asr client onClosed");
        this.f95611a.m182410a();
    }

    @Override // p153l.nzg0
    /* JADX INFO: renamed from: c */
    public final void mo122355c(Throwable th) {
        LogUtils.file("AiAgentImpl", "db asr onFailure:" + LogUtils.getErrorInfo(th));
        SudLogger.m222811d(this.f95611a.f164194a, "db asr onFailure:" + LogUtils.getErrorInfo(th));
        rog0 rog0Var = this.f95611a;
        rog0Var.f164204k = true;
        rog0Var.m182410a();
    }

    @Override // p153l.nzg0
    /* JADX INFO: renamed from: d */
    public final void mo122356d(boolean z, String str, String str2, long j, long j2) {
        xsg0 xsg0Var;
        String str3 = "onText: definite:" + z + " text:" + str + " audioStartTime:" + j + " audioEndTime:" + j2;
        LogUtils.file("AiAgentImpl", str3);
        SudLogger.m222811d(this.f95611a.f164194a, str3);
        rog0 rog0Var = this.f95611a;
        if (z) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject(LovePlanetStage.result);
                if (jSONObjectOptJSONObject == null) {
                    xsg0Var = null;
                } else {
                    xsg0Var = new xsg0();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("additions");
                    if (jSONObjectOptJSONObject2 != null) {
                        xsg0Var.f196102c = jSONObjectOptJSONObject2.optString("log_id");
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("utterances");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(0);
                        xsg0Var.f196101b = jSONObject.optLong("end_time");
                        long jOptLong = jSONObject.optLong("start_time");
                        xsg0Var.f196103d = jOptLong;
                        xsg0Var.f196100a = xsg0Var.f196101b - jOptLong;
                    }
                    xsg0Var.f196104e = j;
                    xsg0Var.f196105f = j2;
                }
            } catch (Exception e) {
                LogUtils.file("AiAgentImpl", "parserResponse json:" + str2 + " error:" + LogUtils.getErrorInfo(e));
            }
            if (rog0Var.f164207n) {
                long j3 = rog0Var.f164195b;
                String str4 = rog0Var.f164196c;
                String str5 = rog0Var.f164197d;
                String str6 = rog0Var.f164198e;
                String str7 = utg0.f180946a;
                dpg0 dpg0Var = new dpg0();
                dpg0Var.f90051a = j3;
                dpg0Var.f90052b = str4;
                dpg0Var.f90053c = str5;
                dpg0Var.f90054d = str6;
                dpg0Var.f90055e = str;
                dpg0Var.f90056f = xsg0Var;
                utg0.f180947b.m198649u(dpg0Var, new cog0());
            }
            hkg0 hkg0Var = rog0Var.f164208o;
            if (hkg0Var != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("content", str);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                hkg0Var.f110414a.notifyStateChange("app_common_game_llm_asr_content", jSONObject2.toString(), null);
            }
        }
    }
}
