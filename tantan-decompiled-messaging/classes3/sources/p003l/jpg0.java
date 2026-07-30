package p003l;

import l.asg0;
import l.ecg0;
import l.mlg0;
import l.njg0;
import l.srg0;
import l.tjg0;
import l.y6g0;
import l.ymg0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class jpg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f4700a;

    public jpg0(oqg0 oqg0Var) {
        this.f4700a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5415a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        String str5;
        ymg0 ymg0Var;
        ymg0 ymg0Var2;
        tjg0 tjg0Var = new tjg0();
        tjg0Var.a = "getSdkInfo";
        tjg0Var.b = System.currentTimeMillis();
        this.f4700a.m6727b(tjg0Var);
        oqg0 oqg0Var = this.f4700a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("env_type", mlg0.f);
            jSONObject.put("language", mlg0.d);
            jSONObject.put("wordLanguage", "");
            jSONObject.put("asr_text_language_list", ecg0.c());
            jSONObject.put("asr_number_language_list", ecg0.a());
            jSONObject.put("sdk_version", "1.6.7.1286");
            jSONObject.put("app_id", mlg0.g);
            jSONObject.put("platform", 2);
            jSONObject.put("bundle_id", mlg0.d());
            jSONObject.put("sud_sdk_trace_id", mlg0.j);
            jSONObject.put("mg_id", oqg0Var.f6210g);
            jSONObject.put("mg_id_str", String.valueOf(oqg0Var.f6210g));
            asg0 asg0Var = mlg0.e;
            if (asg0Var == null || (ymg0Var2 = asg0Var.c) == null || (str5 = ymg0Var2.h) == null) {
                str5 = "";
            }
            jSONObject.put("mg_api_cfg", new JSONObject(str5));
            jSONObject.put("dynamic_config", new JSONObject(oqg0Var.f6211h));
            jSONObject.put("app_auth", new JSONObject(oqg0Var.f6212i));
            asg0 asg0Var2 = mlg0.e;
            srg0 srg0Var = (asg0Var2 == null || (ymg0Var = asg0Var2.c) == null) ? null : ymg0Var.f;
            if (srg0Var != null) {
                jSONObject.put("app_server_info_url", srg0Var.b);
                jSONObject.put("game_login_url", srg0Var.a);
            } else {
                jSONObject.put("app_server_info_url", "");
                jSONObject.put("game_login_url", "");
            }
            y6g0Var.success(jSONObject.toString());
            long jCurrentTimeMillis = System.currentTimeMillis();
            tjg0Var.c = jCurrentTimeMillis;
            tjg0Var.d = jCurrentTimeMillis - tjg0Var.b;
            oqg0Var.m6727b(tjg0Var);
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            tjg0Var.c = jCurrentTimeMillis2;
            tjg0Var.d = jCurrentTimeMillis2 - tjg0Var.b;
            oqg0Var.m6727b(tjg0Var);
        }
    }
}
