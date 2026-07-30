package p149l;

import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import org.json.JSONArray;
import org.json.JSONObject;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class wjg0 implements frg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jgg0 f186652a;

    public wjg0(jgg0 jgg0Var) {
        this.f186652a = jgg0Var;
    }

    @Override // p149l.frg0
    /* JADX INFO: renamed from: a */
    public final void mo101632a() {
        SudLogger.m221565d(this.f186652a.f117776a, "onRecognizeSuccess:");
        LogUtils.file("AiAgentImpl", "onRecognizeSuccess:");
    }

    @Override // p149l.frg0
    /* JADX INFO: renamed from: b */
    public final void mo101633b() {
        LogUtils.file("AiAgentImpl", "db asr client onClosed");
        SudLogger.m221565d(this.f186652a.f117776a, "db asr client onClosed");
        this.f186652a.m141290a();
    }

    @Override // p149l.frg0
    /* JADX INFO: renamed from: c */
    public final void mo101634c(Throwable th) {
        LogUtils.file("AiAgentImpl", "db asr onFailure:" + LogUtils.getErrorInfo(th));
        SudLogger.m221565d(this.f186652a.f117776a, "db asr onFailure:" + LogUtils.getErrorInfo(th));
        jgg0 jgg0Var = this.f186652a;
        jgg0Var.f117786k = true;
        jgg0Var.m141290a();
    }

    @Override // p149l.frg0
    /* JADX INFO: renamed from: d */
    public final void mo101635d(boolean z, String str, String str2, long j, long j2) {
        pkg0 pkg0Var;
        String str3 = "onText: definite:" + z + " text:" + str + " audioStartTime:" + j + " audioEndTime:" + j2;
        LogUtils.file("AiAgentImpl", str3);
        SudLogger.m221565d(this.f186652a.f117776a, str3);
        jgg0 jgg0Var = this.f186652a;
        if (z) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject(LovePlanetStage.result);
                if (jSONObjectOptJSONObject == null) {
                    pkg0Var = null;
                } else {
                    pkg0Var = new pkg0();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("additions");
                    if (jSONObjectOptJSONObject2 != null) {
                        pkg0Var.f149991c = jSONObjectOptJSONObject2.optString("log_id");
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("utterances");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(0);
                        pkg0Var.f149990b = jSONObject.optLong("end_time");
                        long jOptLong = jSONObject.optLong("start_time");
                        pkg0Var.f149992d = jOptLong;
                        pkg0Var.f149989a = pkg0Var.f149990b - jOptLong;
                    }
                    pkg0Var.f149993e = j;
                    pkg0Var.f149994f = j2;
                }
            } catch (Exception e) {
                LogUtils.file("AiAgentImpl", "parserResponse json:" + str2 + " error:" + LogUtils.getErrorInfo(e));
            }
            if (jgg0Var.f117789n) {
                long j3 = jgg0Var.f117777b;
                String str4 = jgg0Var.f117778c;
                String str5 = jgg0Var.f117779d;
                String str6 = jgg0Var.f117780e;
                String str7 = mlg0.f134426a;
                vgg0 vgg0Var = new vgg0();
                vgg0Var.f181366a = j3;
                vgg0Var.f181367b = str4;
                vgg0Var.f181368c = str5;
                vgg0Var.f181369d = str6;
                vgg0Var.f181370e = str;
                vgg0Var.f181371f = pkg0Var;
                mlg0.f134427b.m155916u(vgg0Var, new ufg0());
            }
            zbg0 zbg0Var = jgg0Var.f117790o;
            if (zbg0Var != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("content", str);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                zbg0Var.f202441a.notifyStateChange("app_common_game_llm_asr_content", jSONObject2.toString(), null);
            }
        }
    }
}
