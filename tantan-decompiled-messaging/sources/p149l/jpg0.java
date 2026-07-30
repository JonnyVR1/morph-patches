package p149l;

import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class jpg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f119186a;

    public jpg0(oqg0 oqg0Var) {
        this.f119186a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        String str5;
        ymg0 ymg0Var;
        ymg0 ymg0Var2;
        tjg0 tjg0Var = new tjg0();
        tjg0Var.f170720a = "getSdkInfo";
        tjg0Var.f170721b = System.currentTimeMillis();
        this.f119186a.m165428b(tjg0Var);
        oqg0 oqg0Var = this.f119186a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("env_type", mlg0.f134431f);
            jSONObject.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, mlg0.f134429d);
            jSONObject.put("wordLanguage", "");
            jSONObject.put("asr_text_language_list", ecg0.m115688c());
            jSONObject.put("asr_number_language_list", ecg0.m115686a());
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "1.6.7.1286");
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_APPID, mlg0.f134432g);
            jSONObject.put("platform", 2);
            jSONObject.put("bundle_id", mlg0.m155145d());
            jSONObject.put("sud_sdk_trace_id", mlg0.f134435j);
            jSONObject.put("mg_id", oqg0Var.f145144g);
            jSONObject.put("mg_id_str", String.valueOf(oqg0Var.f145144g));
            asg0 asg0Var = mlg0.f134430e;
            if (asg0Var == null || (ymg0Var2 = asg0Var.f71451c) == null || (str5 = ymg0Var2.f199006h) == null) {
                str5 = "";
            }
            jSONObject.put("mg_api_cfg", new JSONObject(str5));
            jSONObject.put("dynamic_config", new JSONObject(oqg0Var.f145145h));
            jSONObject.put("app_auth", new JSONObject(oqg0Var.f145146i));
            asg0 asg0Var2 = mlg0.f134430e;
            srg0 srg0Var = (asg0Var2 == null || (ymg0Var = asg0Var2.f71451c) == null) ? null : ymg0Var.f199004f;
            if (srg0Var != null) {
                jSONObject.put("app_server_info_url", srg0Var.f166095b);
                jSONObject.put("game_login_url", srg0Var.f166094a);
            } else {
                jSONObject.put("app_server_info_url", "");
                jSONObject.put("game_login_url", "");
            }
            y6g0Var.success(jSONObject.toString());
            long jCurrentTimeMillis = System.currentTimeMillis();
            tjg0Var.f170722c = jCurrentTimeMillis;
            tjg0Var.f170723d = jCurrentTimeMillis - tjg0Var.f170721b;
            oqg0Var.m165428b(tjg0Var);
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            tjg0Var.f170722c = jCurrentTimeMillis2;
            tjg0Var.f170723d = jCurrentTimeMillis2 - tjg0Var.f170721b;
            oqg0Var.m165428b(tjg0Var);
        }
    }
}
