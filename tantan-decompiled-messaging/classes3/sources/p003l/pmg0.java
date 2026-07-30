package p003l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l.asg0;
import l.bpg0;
import l.dog0;
import l.g6g0;
import l.g8g0;
import l.j9g0;
import l.jfg0;
import l.keg0;
import l.kng0;
import l.l7g0;
import l.lmg0;
import l.mcg0;
import l.mlg0;
import l.nhg0;
import l.nqg0;
import l.srg0;
import l.ukg0;
import l.ymg0;
import org.json.JSONArray;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudCfg;
import tech.sud.gip.core.TccRtssCfg;
import tech.sud.gip.core.model.VolcCfg;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class pmg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f6459a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f6460b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f6461c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f6462d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f6463e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mqg0 f6464f;

    public pmg0(mqg0 mqg0Var, String str, String str2, String str3, boolean z, String str4) {
        this.f6464f = mqg0Var;
        this.f6459a = str;
        this.f6460b = str2;
        this.f6461c = str3;
        this.f6462d = z;
        this.f6463e = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mcg0 mcg0Var;
        mcg0 mcg0Var2;
        HashMap map;
        Iterator<String> itKeys;
        asg0 asg0Var = new asg0();
        mcg0 mcg0Var3 = new mcg0("getSDKToken");
        tog0 tog0Var = new tog0();
        mcg0Var3.n = tog0Var;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", this.f6459a);
            jSONObject.put("app_key", this.f6460b);
            jSONObject.put("bundle_id", this.f6461c);
            String str = mlg0.a;
            jSONObject.put("platform", 2);
            jSONObject.put("is_test_env", this.f6462d);
            jSONObject.put("sdk_version", "1.6.7.1286");
            jSONObject.put("unity_dynamic_lib_type", "ilruntime-2022.3.62f2c1-1.0.7");
            JSONObject jSONObject2 = new JSONObject(mqg0.m6423b(this.f6463e, jSONObject.toString(), mcg0Var3.c, tog0Var, this.f6464f.f5738m, null));
            asg0Var.a = jSONObject2.getInt("ret_code");
            asg0Var.b = jSONObject2.getString("ret_msg");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
            ymg0 ymg0Var = new ymg0();
            asg0Var.c = ymg0Var;
            ymg0Var.a = jSONObject3.getString("sdk_token");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("sdk_rt_cfg");
            jSONObject4.getString("version");
            jSONObject4.getString("sign");
            jSONObject4.getString("sdk_min");
            jSONObject4.getString("key");
            jSONObject4.getString("url");
            jSONObject4.getString("desc");
            asg0Var.c.getClass();
            JSONObject jSONObject5 = jSONObject3.getJSONObject("sdk_sud_cfg");
            nqg0 nqg0Var = new nqg0();
            mcg0Var = mcg0Var3;
            try {
                nqg0Var.a = jSONObject5.getString("version");
                jSONObject5.getString("sign");
                jSONObject5.getString("sdk_min");
                nqg0Var.b = jSONObject5.getString("key");
                nqg0Var.c = jSONObject5.getString("url_arm64_v8a");
                jSONObject5.getString("url_armeabi_v7a");
                jSONObject5.getString("url_x86");
                jSONObject5.getString("url_x86_64");
                jSONObject5.getString("desc");
                asg0Var.c.b = nqg0Var;
                JSONObject jSONObject6 = jSONObject3.getJSONObject("sdk_et_cfg");
                jSONObject6.getString("version");
                jSONObject6.getString("sign");
                jSONObject6.getString("sdk_min");
                jSONObject6.getString("key");
                jSONObject6.getString("url_arm64_v8a");
                jSONObject6.getString("url_armeabi_v7a");
                jSONObject6.getString("url_x86");
                jSONObject6.getString("url_x86_64");
                jSONObject6.getString("desc");
                asg0Var.c.getClass();
                JSONObject jSONObject7 = jSONObject3.getJSONObject("sdk_unity_cfg");
                nqg0 nqg0Var2 = new nqg0();
                nqg0Var2.a = jSONObject7.getString("version");
                jSONObject7.getString("sign");
                jSONObject7.getString("sdk_min");
                nqg0Var2.b = jSONObject7.getString("key");
                nqg0Var2.c = jSONObject7.getString("url_arm64_v8a");
                jSONObject7.getString("url_armeabi_v7a");
                jSONObject7.getString("url_x86");
                jSONObject7.getString("url_x86_64");
                jSONObject7.getString("desc");
                asg0Var.c.c = nqg0Var2;
                JSONObject jSONObject8 = jSONObject3.getJSONObject("mg_api_cfg");
                srg0 srg0Var = new srg0();
                srg0Var.b = jSONObject8.getString("app_server_info_url");
                srg0Var.a = jSONObject8.getString("game_login_url");
                ymg0 ymg0Var2 = asg0Var.c;
                ymg0Var2.f = srg0Var;
                ymg0Var2.h = jSONObject8.toString();
                ukg0 ukg0Var = new ukg0();
                if (jSONObject3.has("app_online_route_cfg")) {
                    JSONObject jSONObject9 = jSONObject3.getJSONObject("app_online_route_cfg");
                    if (jSONObject9.has("online_route")) {
                        ukg0Var.a = jSONObject9.getBoolean("online_route");
                    }
                }
                asg0Var.c.g = ukg0Var;
                JSONObject jSONObject10 = jSONObject3.getJSONObject("sdk_api_cfg");
                j9g0 j9g0Var = new j9g0();
                j9g0Var.a = jSONObject10.getString("mg_list_url");
                j9g0Var.b = jSONObject10.getString("mg_info_url");
                if (jSONObject10.has("report_url")) {
                    j9g0Var.c = jSONObject10.getString("report_url");
                }
                if (jSONObject10.has("auth_mg_info_url")) {
                    j9g0Var.d = jSONObject10.getString("auth_mg_info_url");
                }
                j9g0Var.e = jSONObject10.optString("upload_url");
                asg0Var.c.d = j9g0Var;
                this.f6464f.f5731f = jSONObject10.optString("gate_token_url");
                j9g0Var.f = jSONObject10.optString("gate_ws_url");
                kng0 kng0Var = new kng0();
                if (!jSONObject3.isNull("sdk_rtss_cfg")) {
                    JSONObject jSONObject11 = jSONObject3.getJSONObject("sdk_rtss_cfg");
                    JSONObject jSONObjectOptJSONObject = jSONObject11.optJSONObject("microsoft_rtss_cfg");
                    if (jSONObjectOptJSONObject != null) {
                        nhg0 nhg0Var = new nhg0();
                        nhg0Var.a = jSONObjectOptJSONObject.optString("speech_subscription_key");
                        nhg0Var.b = jSONObjectOptJSONObject.optString("speech_region");
                        nhg0Var.c = jSONObjectOptJSONObject.optJSONArray("asr_text_language_list");
                        nhg0Var.d = jSONObjectOptJSONObject.optJSONArray("asr_number_language_list");
                        kng0Var.a = nhg0Var;
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObject11.optJSONArray(ISudCfg.ASR_LOAD_LIST);
                    if (jSONArrayOptJSONArray != null) {
                        kng0Var.b = new ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            kng0Var.b.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i)));
                        }
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject11.optJSONObject("tcc_rtss_cfg");
                    if (jSONObjectOptJSONObject2 != null) {
                        TccRtssCfg tccRtssCfg = new TccRtssCfg();
                        tccRtssCfg.app_id = jSONObjectOptJSONObject2.optInt("app_id");
                        tccRtssCfg.secret_id = jSONObjectOptJSONObject2.optString("secret_id");
                        tccRtssCfg.secret_key = jSONObjectOptJSONObject2.optString("secret_key");
                        tccRtssCfg.hotword_list = jSONObjectOptJSONObject2.optString("hotword_list");
                        tccRtssCfg.hotword_id = jSONObjectOptJSONObject2.optString("hotword_id");
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("engine_model_type");
                        if (jSONObjectOptJSONObject3 == null || (itKeys = jSONObjectOptJSONObject3.keys()) == null) {
                            map = null;
                        } else {
                            map = new HashMap();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                map.put(next, jSONObjectOptJSONObject3.optString(next));
                            }
                        }
                        tccRtssCfg.engine_model_type = map;
                        tccRtssCfg.asr_text_language_list = jSONObjectOptJSONObject2.optJSONArray("asr_text_language_list");
                        tccRtssCfg.asr_number_language_list = jSONObjectOptJSONObject2.optJSONArray("asr_number_language_list");
                        kng0Var.c = tccRtssCfg;
                    }
                }
                asg0Var.c.e = kng0Var;
                JSONObject jSONObject12 = jSONObject3.getJSONObject("sdk_localization_cfg");
                ymg0 ymg0Var3 = asg0Var.c;
                keg0 keg0Var = new keg0();
                ymg0Var3.i = keg0Var;
                keg0Var.a = mqg0.m6422a(jSONObject12.getJSONObject("load_tip_loading"));
                asg0Var.c.i.b = mqg0.m6422a(jSONObject12.getJSONObject("load_tip_fail"));
                if (jSONObject12.has("load_tip_fail_upgrade")) {
                    asg0Var.c.i.c = mqg0.m6422a(jSONObject12.getJSONObject("load_tip_fail_upgrade"));
                }
                asg0Var.c.i.d = mqg0.m6422a(jSONObject12.getJSONObject("load_reload"));
                asg0Var.c.i.e = mqg0.m6422a(jSONObject12.getJSONObject("load_tip_timeout"));
                asg0Var.c.i.f = mqg0.m6422a(jSONObject12.getJSONObject("load_tip_continue_wait"));
                asg0Var.c.j = jSONObject3.getInt("load_mg_pkg_time_out");
                asg0Var.c.k = jSONObject3.optBoolean("unity_multi_process");
                JSONObject jSONObjectOptJSONObject4 = jSONObject3.optJSONObject("console_log_cfg");
                if (jSONObjectOptJSONObject4 != null) {
                    ymg0 ymg0Var4 = asg0Var.c;
                    jfg0 jfg0Var = new jfg0();
                    ymg0Var4.l = jfg0Var;
                    jfg0Var.a = jSONObjectOptJSONObject4.optBoolean("is_open");
                    asg0Var.c.l.b = jSONObjectOptJSONObject4.optLong("max_size");
                }
                JSONObject jSONObjectOptJSONObject5 = jSONObject3.optJSONObject("model_api_cfg");
                if (jSONObjectOptJSONObject5 != null) {
                    ymg0 ymg0Var5 = asg0Var.c;
                    l7g0 l7g0Var = new l7g0();
                    ymg0Var5.m = l7g0Var;
                    l7g0Var.a = jSONObjectOptJSONObject5.optString("ip_interaction_url");
                    asg0Var.c.m.b = jSONObjectOptJSONObject5.optString("ip_interaction_sse_url");
                    asg0Var.c.m.c = jSONObjectOptJSONObject5.optString("model_config_url");
                    asg0Var.c.m.d = jSONObjectOptJSONObject5.optString("room_message_url");
                }
                JSONObject jSONObjectOptJSONObject6 = jSONObject3.optJSONObject("large_model_cfg");
                if (jSONObjectOptJSONObject6 != null) {
                    asg0Var.c.n = new bpg0();
                    jSONObjectOptJSONObject6.optBoolean("enable");
                    JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject6.optJSONObject("volc");
                    if (jSONObjectOptJSONObject7 != null) {
                        asg0Var.c.n.a = new VolcCfg();
                        asg0Var.c.n.a.url = jSONObjectOptJSONObject7.optString("url");
                        asg0Var.c.n.a.async_url = jSONObjectOptJSONObject7.optString("async_url");
                        asg0Var.c.n.a.app_key = jSONObjectOptJSONObject7.optString("app_key");
                        asg0Var.c.n.a.access_key = dog0.a(jSONObjectOptJSONObject7.optString("access_key"));
                        asg0Var.c.n.a.resource_id = jSONObjectOptJSONObject7.optString("resource_id");
                        asg0Var.c.n.a.model_name = jSONObjectOptJSONObject7.optString("model_name");
                        asg0Var.c.n.a.languages = jSONObjectOptJSONObject7.optJSONArray("languages");
                        asg0Var.c.n.a.request_config = jSONObjectOptJSONObject7.optJSONObject("request_config");
                    }
                }
                JSONObject jSONObjectOptJSONObject8 = jSONObject3.optJSONObject("report_api_cfg");
                if (jSONObjectOptJSONObject8 != null) {
                    ymg0 ymg0Var6 = asg0Var.c;
                    g8g0 g8g0Var = new g8g0();
                    ymg0Var6.p = g8g0Var;
                    g8g0Var.a = jSONObjectOptJSONObject8.optString("report_llm_asr_url");
                }
                asg0Var.c.o = jSONObject3.optString("log_id");
                lmg0.b(0L, 0, asg0Var.c.o);
                lmg0.a();
                mcg0Var2 = mcg0Var;
            } catch (Exception e) {
                e = e;
                if (asg0Var.a == 0) {
                    asg0Var.a = g6g0.a(e);
                    asg0Var.b = e.toString();
                } else {
                    SudLogger.m10034e(mqg0.f5721p, "sdkToken error :" + asg0Var.b + "(" + asg0Var.a + ")");
                }
                mcg0Var2 = mcg0Var;
                mcg0Var2.e = asg0Var.a;
                String str2 = asg0Var.b;
                if (str2 != null) {
                    mcg0Var2.f = str2;
                }
                String str3 = "sdkToken error :" + LogUtils.getErrorInfo(e);
                SudLogger.m10034e(mqg0.f5721p, str3);
                LogUtils.file("HttpService", str3);
            }
        } catch (Exception e2) {
            e = e2;
            mcg0Var = mcg0Var3;
        }
        ThreadUtils.postUITask(new rgg0(this, asg0Var, mcg0Var2));
    }
}
