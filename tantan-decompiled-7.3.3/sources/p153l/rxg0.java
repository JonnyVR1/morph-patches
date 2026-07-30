package p153l;

import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class rxg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f165334a;

    public rxg0(wyg0 wyg0Var) {
        this.f165334a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        String str5;
        gvg0 gvg0Var;
        gvg0 gvg0Var2;
        bsg0 bsg0Var = new bsg0();
        bsg0Var.f78154a = "getSdkInfo";
        bsg0Var.f78155b = System.currentTimeMillis();
        this.f165334a.m208617b(bsg0Var);
        wyg0 wyg0Var = this.f165334a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("env_type", utg0.f180951f);
            jSONObject.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, utg0.f180949d);
            jSONObject.put("wordLanguage", "");
            jSONObject.put("asr_text_language_list", mkg0.m158786c());
            jSONObject.put("asr_number_language_list", mkg0.m158784a());
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "1.6.7.1286");
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_APPID, utg0.f180952g);
            jSONObject.put("platform", 2);
            jSONObject.put("bundle_id", utg0.m198036d());
            jSONObject.put("sud_sdk_trace_id", utg0.f180955j);
            jSONObject.put("mg_id", wyg0Var.f191646g);
            jSONObject.put("mg_id_str", String.valueOf(wyg0Var.f191646g));
            i0h0 i0h0Var = utg0.f180950e;
            if (i0h0Var == null || (gvg0Var2 = i0h0Var.f112370c) == null || (str5 = gvg0Var2.f106637h) == null) {
                str5 = "";
            }
            jSONObject.put("mg_api_cfg", new JSONObject(str5));
            jSONObject.put("dynamic_config", new JSONObject(wyg0Var.f191647h));
            jSONObject.put("app_auth", new JSONObject(wyg0Var.f191648i));
            i0h0 i0h0Var2 = utg0.f180950e;
            a0h0 a0h0Var = (i0h0Var2 == null || (gvg0Var = i0h0Var2.f112370c) == null) ? null : gvg0Var.f106635f;
            if (a0h0Var != null) {
                jSONObject.put("app_server_info_url", a0h0Var.f67720b);
                jSONObject.put("game_login_url", a0h0Var.f67719a);
            } else {
                jSONObject.put("app_server_info_url", "");
                jSONObject.put("game_login_url", "");
            }
            gfg0Var.success(jSONObject.toString());
            long jCurrentTimeMillis = System.currentTimeMillis();
            bsg0Var.f78156c = jCurrentTimeMillis;
            bsg0Var.f78157d = jCurrentTimeMillis - bsg0Var.f78155b;
            wyg0Var.m208617b(bsg0Var);
        } catch (Exception unused) {
            gfg0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            bsg0Var.f78156c = jCurrentTimeMillis2;
            bsg0Var.f78157d = jCurrentTimeMillis2 - bsg0Var.f78155b;
            wyg0Var.m208617b(bsg0Var);
        }
    }
}
