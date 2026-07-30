package p149l;

import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudCfg;
import tech.sud.gip.core.TccRtssCfg;
import tech.sud.gip.core.model.VolcCfg;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class pmg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f150220a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f150221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f150222c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f150223d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f150224e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mqg0 f150225f;

    public pmg0(mqg0 mqg0Var, String str, String str2, String str3, boolean z, String str4) {
        this.f150225f = mqg0Var;
        this.f150220a = str;
        this.f150221b = str2;
        this.f150222c = str3;
        this.f150223d = z;
        this.f150224e = str4;
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
        mcg0Var3.f133124n = tog0Var;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_APPID, this.f150220a);
            jSONObject.put("app_key", this.f150221b);
            jSONObject.put("bundle_id", this.f150222c);
            String str = mlg0.f134426a;
            jSONObject.put("platform", 2);
            jSONObject.put("is_test_env", this.f150223d);
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "1.6.7.1286");
            jSONObject.put("unity_dynamic_lib_type", "ilruntime-2022.3.62f2c1-1.0.7");
            JSONObject jSONObject2 = new JSONObject(mqg0.m155894b(this.f150224e, jSONObject.toString(), mcg0Var3.f133113c, tog0Var, this.f150225f.f135236m, null));
            asg0Var.f71449a = jSONObject2.getInt("ret_code");
            asg0Var.f71450b = jSONObject2.getString("ret_msg");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
            ymg0 ymg0Var = new ymg0();
            asg0Var.f71451c = ymg0Var;
            ymg0Var.f198999a = jSONObject3.getString("sdk_token");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("sdk_rt_cfg");
            jSONObject4.getString(WBConstants.AUTH_PARAMS_VERSION);
            jSONObject4.getString("sign");
            jSONObject4.getString("sdk_min");
            jSONObject4.getString(com.clevertap.android.sdk.Constants.KEY_KEY);
            jSONObject4.getString("url");
            jSONObject4.getString(SocialConstants.PARAM_APP_DESC);
            asg0Var.f71451c.getClass();
            JSONObject jSONObject5 = jSONObject3.getJSONObject("sdk_sud_cfg");
            nqg0 nqg0Var = new nqg0();
            mcg0Var = mcg0Var3;
            try {
                nqg0Var.f140063a = jSONObject5.getString(WBConstants.AUTH_PARAMS_VERSION);
                jSONObject5.getString("sign");
                jSONObject5.getString("sdk_min");
                nqg0Var.f140064b = jSONObject5.getString(com.clevertap.android.sdk.Constants.KEY_KEY);
                nqg0Var.f140065c = jSONObject5.getString("url_arm64_v8a");
                jSONObject5.getString("url_armeabi_v7a");
                jSONObject5.getString("url_x86");
                jSONObject5.getString("url_x86_64");
                jSONObject5.getString(SocialConstants.PARAM_APP_DESC);
                asg0Var.f71451c.f199000b = nqg0Var;
                JSONObject jSONObject6 = jSONObject3.getJSONObject("sdk_et_cfg");
                jSONObject6.getString(WBConstants.AUTH_PARAMS_VERSION);
                jSONObject6.getString("sign");
                jSONObject6.getString("sdk_min");
                jSONObject6.getString(com.clevertap.android.sdk.Constants.KEY_KEY);
                jSONObject6.getString("url_arm64_v8a");
                jSONObject6.getString("url_armeabi_v7a");
                jSONObject6.getString("url_x86");
                jSONObject6.getString("url_x86_64");
                jSONObject6.getString(SocialConstants.PARAM_APP_DESC);
                asg0Var.f71451c.getClass();
                JSONObject jSONObject7 = jSONObject3.getJSONObject("sdk_unity_cfg");
                nqg0 nqg0Var2 = new nqg0();
                nqg0Var2.f140063a = jSONObject7.getString(WBConstants.AUTH_PARAMS_VERSION);
                jSONObject7.getString("sign");
                jSONObject7.getString("sdk_min");
                nqg0Var2.f140064b = jSONObject7.getString(com.clevertap.android.sdk.Constants.KEY_KEY);
                nqg0Var2.f140065c = jSONObject7.getString("url_arm64_v8a");
                jSONObject7.getString("url_armeabi_v7a");
                jSONObject7.getString("url_x86");
                jSONObject7.getString("url_x86_64");
                jSONObject7.getString(SocialConstants.PARAM_APP_DESC);
                asg0Var.f71451c.f199001c = nqg0Var2;
                JSONObject jSONObject8 = jSONObject3.getJSONObject("mg_api_cfg");
                srg0 srg0Var = new srg0();
                srg0Var.f166095b = jSONObject8.getString("app_server_info_url");
                srg0Var.f166094a = jSONObject8.getString("game_login_url");
                ymg0 ymg0Var2 = asg0Var.f71451c;
                ymg0Var2.f199004f = srg0Var;
                ymg0Var2.f199006h = jSONObject8.toString();
                ukg0 ukg0Var = new ukg0();
                if (jSONObject3.has("app_online_route_cfg")) {
                    JSONObject jSONObject9 = jSONObject3.getJSONObject("app_online_route_cfg");
                    if (jSONObject9.has("online_route")) {
                        ukg0Var.f176923a = jSONObject9.getBoolean("online_route");
                    }
                }
                asg0Var.f71451c.f199005g = ukg0Var;
                JSONObject jSONObject10 = jSONObject3.getJSONObject("sdk_api_cfg");
                j9g0 j9g0Var = new j9g0();
                j9g0Var.f116898a = jSONObject10.getString("mg_list_url");
                j9g0Var.f116899b = jSONObject10.getString("mg_info_url");
                if (jSONObject10.has("report_url")) {
                    j9g0Var.f116900c = jSONObject10.getString("report_url");
                }
                if (jSONObject10.has("auth_mg_info_url")) {
                    j9g0Var.f116901d = jSONObject10.getString("auth_mg_info_url");
                }
                j9g0Var.f116902e = jSONObject10.optString("upload_url");
                asg0Var.f71451c.f199002d = j9g0Var;
                this.f150225f.f135229f = jSONObject10.optString("gate_token_url");
                j9g0Var.f116903f = jSONObject10.optString("gate_ws_url");
                kng0 kng0Var = new kng0();
                if (!jSONObject3.isNull("sdk_rtss_cfg")) {
                    JSONObject jSONObject11 = jSONObject3.getJSONObject("sdk_rtss_cfg");
                    JSONObject jSONObjectOptJSONObject = jSONObject11.optJSONObject("microsoft_rtss_cfg");
                    if (jSONObjectOptJSONObject != null) {
                        nhg0 nhg0Var = new nhg0();
                        nhg0Var.f138978a = jSONObjectOptJSONObject.optString("speech_subscription_key");
                        nhg0Var.f138979b = jSONObjectOptJSONObject.optString("speech_region");
                        nhg0Var.f138980c = jSONObjectOptJSONObject.optJSONArray("asr_text_language_list");
                        nhg0Var.f138981d = jSONObjectOptJSONObject.optJSONArray("asr_number_language_list");
                        kng0Var.f123886a = nhg0Var;
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObject11.optJSONArray(ISudCfg.ASR_LOAD_LIST);
                    if (jSONArrayOptJSONArray != null) {
                        kng0Var.f123887b = new ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            kng0Var.f123887b.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i)));
                        }
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject11.optJSONObject("tcc_rtss_cfg");
                    if (jSONObjectOptJSONObject2 != null) {
                        TccRtssCfg tccRtssCfg = new TccRtssCfg();
                        tccRtssCfg.app_id = jSONObjectOptJSONObject2.optInt(Constants.JumpUrlConstants.URL_KEY_APPID);
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
                        kng0Var.f123888c = tccRtssCfg;
                    }
                }
                asg0Var.f71451c.f199003e = kng0Var;
                JSONObject jSONObject12 = jSONObject3.getJSONObject("sdk_localization_cfg");
                ymg0 ymg0Var3 = asg0Var.f71451c;
                keg0 keg0Var = new keg0();
                ymg0Var3.f199007i = keg0Var;
                keg0Var.f122705a = mqg0.m155893a(jSONObject12.getJSONObject("load_tip_loading"));
                asg0Var.f71451c.f199007i.f122706b = mqg0.m155893a(jSONObject12.getJSONObject("load_tip_fail"));
                if (jSONObject12.has("load_tip_fail_upgrade")) {
                    asg0Var.f71451c.f199007i.f122707c = mqg0.m155893a(jSONObject12.getJSONObject("load_tip_fail_upgrade"));
                }
                asg0Var.f71451c.f199007i.f122708d = mqg0.m155893a(jSONObject12.getJSONObject("load_reload"));
                asg0Var.f71451c.f199007i.f122709e = mqg0.m155893a(jSONObject12.getJSONObject("load_tip_timeout"));
                asg0Var.f71451c.f199007i.f122710f = mqg0.m155893a(jSONObject12.getJSONObject("load_tip_continue_wait"));
                asg0Var.f71451c.f199008j = jSONObject3.getInt("load_mg_pkg_time_out");
                asg0Var.f71451c.f199009k = jSONObject3.optBoolean("unity_multi_process");
                JSONObject jSONObjectOptJSONObject4 = jSONObject3.optJSONObject("console_log_cfg");
                if (jSONObjectOptJSONObject4 != null) {
                    ymg0 ymg0Var4 = asg0Var.f71451c;
                    jfg0 jfg0Var = new jfg0();
                    ymg0Var4.f199010l = jfg0Var;
                    jfg0Var.f117657a = jSONObjectOptJSONObject4.optBoolean("is_open");
                    asg0Var.f71451c.f199010l.f117658b = jSONObjectOptJSONObject4.optLong("max_size");
                }
                JSONObject jSONObjectOptJSONObject5 = jSONObject3.optJSONObject("model_api_cfg");
                if (jSONObjectOptJSONObject5 != null) {
                    ymg0 ymg0Var5 = asg0Var.f71451c;
                    l7g0 l7g0Var = new l7g0();
                    ymg0Var5.f199011m = l7g0Var;
                    l7g0Var.f126719a = jSONObjectOptJSONObject5.optString("ip_interaction_url");
                    asg0Var.f71451c.f199011m.f126720b = jSONObjectOptJSONObject5.optString("ip_interaction_sse_url");
                    asg0Var.f71451c.f199011m.f126721c = jSONObjectOptJSONObject5.optString("model_config_url");
                    asg0Var.f71451c.f199011m.f126722d = jSONObjectOptJSONObject5.optString("room_message_url");
                }
                JSONObject jSONObjectOptJSONObject6 = jSONObject3.optJSONObject("large_model_cfg");
                if (jSONObjectOptJSONObject6 != null) {
                    asg0Var.f71451c.f199012n = new bpg0();
                    jSONObjectOptJSONObject6.optBoolean("enable");
                    JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject6.optJSONObject("volc");
                    if (jSONObjectOptJSONObject7 != null) {
                        asg0Var.f71451c.f199012n.f76625a = new VolcCfg();
                        asg0Var.f71451c.f199012n.f76625a.url = jSONObjectOptJSONObject7.optString("url");
                        asg0Var.f71451c.f199012n.f76625a.async_url = jSONObjectOptJSONObject7.optString("async_url");
                        asg0Var.f71451c.f199012n.f76625a.app_key = jSONObjectOptJSONObject7.optString("app_key");
                        asg0Var.f71451c.f199012n.f76625a.access_key = dog0.m112805a(jSONObjectOptJSONObject7.optString("access_key"));
                        asg0Var.f71451c.f199012n.f76625a.resource_id = jSONObjectOptJSONObject7.optString("resource_id");
                        asg0Var.f71451c.f199012n.f76625a.model_name = jSONObjectOptJSONObject7.optString("model_name");
                        asg0Var.f71451c.f199012n.f76625a.languages = jSONObjectOptJSONObject7.optJSONArray("languages");
                        asg0Var.f71451c.f199012n.f76625a.request_config = jSONObjectOptJSONObject7.optJSONObject("request_config");
                    }
                }
                JSONObject jSONObjectOptJSONObject8 = jSONObject3.optJSONObject("report_api_cfg");
                if (jSONObjectOptJSONObject8 != null) {
                    ymg0 ymg0Var6 = asg0Var.f71451c;
                    g8g0 g8g0Var = new g8g0();
                    ymg0Var6.f199014p = g8g0Var;
                    g8g0Var.f101495a = jSONObjectOptJSONObject8.optString("report_llm_asr_url");
                }
                asg0Var.f71451c.f199013o = jSONObject3.optString("log_id");
                lmg0.m150589b(0L, 0, asg0Var.f71451c.f199013o);
                lmg0.m150588a();
                mcg0Var2 = mcg0Var;
            } catch (Exception e) {
                e = e;
                if (asg0Var.f71449a == 0) {
                    asg0Var.f71449a = g6g0.m124589a(e);
                    asg0Var.f71450b = e.toString();
                } else {
                    SudLogger.m221567e(mqg0.f135219p, "sdkToken error :" + asg0Var.f71450b + "(" + asg0Var.f71449a + ")");
                }
                mcg0Var2 = mcg0Var;
                mcg0Var2.f133115e = asg0Var.f71449a;
                String str2 = asg0Var.f71450b;
                if (str2 != null) {
                    mcg0Var2.f133116f = str2;
                }
                String str3 = "sdkToken error :" + LogUtils.getErrorInfo(e);
                SudLogger.m221567e(mqg0.f135219p, str3);
                LogUtils.file("HttpService", str3);
            }
        } catch (Exception e2) {
            e = e2;
            mcg0Var = mcg0Var3;
        }
        ThreadUtils.postUITask(new rgg0(this, asg0Var, mcg0Var2));
    }
}
