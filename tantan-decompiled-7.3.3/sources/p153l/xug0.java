package p153l;

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
public final class xug0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f196278a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f196279b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f196280c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f196281d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f196282e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ uyg0 f196283f;

    public xug0(uyg0 uyg0Var, String str, String str2, String str3, boolean z, String str4) {
        this.f196283f = uyg0Var;
        this.f196278a = str;
        this.f196279b = str2;
        this.f196280c = str3;
        this.f196281d = z;
        this.f196282e = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ukg0 ukg0Var;
        ukg0 ukg0Var2;
        HashMap map;
        Iterator<String> itKeys;
        i0h0 i0h0Var = new i0h0();
        ukg0 ukg0Var3 = new ukg0("getSDKToken");
        bxg0 bxg0Var = new bxg0();
        ukg0Var3.f179405n = bxg0Var;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_APPID, this.f196278a);
            jSONObject.put("app_key", this.f196279b);
            jSONObject.put("bundle_id", this.f196280c);
            String str = utg0.f180946a;
            jSONObject.put("platform", 2);
            jSONObject.put("is_test_env", this.f196281d);
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "1.6.7.1286");
            jSONObject.put("unity_dynamic_lib_type", "ilruntime-2022.3.62f2c1-1.0.7");
            JSONObject jSONObject2 = new JSONObject(uyg0.m198627b(this.f196282e, jSONObject.toString(), ukg0Var3.f179394c, bxg0Var, this.f196283f.f181613m, null));
            i0h0Var.f112368a = jSONObject2.getInt("ret_code");
            i0h0Var.f112369b = jSONObject2.getString("ret_msg");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
            gvg0 gvg0Var = new gvg0();
            i0h0Var.f112370c = gvg0Var;
            gvg0Var.f106630a = jSONObject3.getString("sdk_token");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("sdk_rt_cfg");
            jSONObject4.getString(WBConstants.AUTH_PARAMS_VERSION);
            jSONObject4.getString("sign");
            jSONObject4.getString("sdk_min");
            jSONObject4.getString(com.clevertap.android.sdk.Constants.KEY_KEY);
            jSONObject4.getString("url");
            jSONObject4.getString(SocialConstants.PARAM_APP_DESC);
            i0h0Var.f112370c.getClass();
            JSONObject jSONObject5 = jSONObject3.getJSONObject("sdk_sud_cfg");
            vyg0 vyg0Var = new vyg0();
            ukg0Var = ukg0Var3;
            try {
                vyg0Var.f186372a = jSONObject5.getString(WBConstants.AUTH_PARAMS_VERSION);
                jSONObject5.getString("sign");
                jSONObject5.getString("sdk_min");
                vyg0Var.f186373b = jSONObject5.getString(com.clevertap.android.sdk.Constants.KEY_KEY);
                vyg0Var.f186374c = jSONObject5.getString("url_arm64_v8a");
                jSONObject5.getString("url_armeabi_v7a");
                jSONObject5.getString("url_x86");
                jSONObject5.getString("url_x86_64");
                jSONObject5.getString(SocialConstants.PARAM_APP_DESC);
                i0h0Var.f112370c.f106631b = vyg0Var;
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
                i0h0Var.f112370c.getClass();
                JSONObject jSONObject7 = jSONObject3.getJSONObject("sdk_unity_cfg");
                vyg0 vyg0Var2 = new vyg0();
                vyg0Var2.f186372a = jSONObject7.getString(WBConstants.AUTH_PARAMS_VERSION);
                jSONObject7.getString("sign");
                jSONObject7.getString("sdk_min");
                vyg0Var2.f186373b = jSONObject7.getString(com.clevertap.android.sdk.Constants.KEY_KEY);
                vyg0Var2.f186374c = jSONObject7.getString("url_arm64_v8a");
                jSONObject7.getString("url_armeabi_v7a");
                jSONObject7.getString("url_x86");
                jSONObject7.getString("url_x86_64");
                jSONObject7.getString(SocialConstants.PARAM_APP_DESC);
                i0h0Var.f112370c.f106632c = vyg0Var2;
                JSONObject jSONObject8 = jSONObject3.getJSONObject("mg_api_cfg");
                a0h0 a0h0Var = new a0h0();
                a0h0Var.f67720b = jSONObject8.getString("app_server_info_url");
                a0h0Var.f67719a = jSONObject8.getString("game_login_url");
                gvg0 gvg0Var2 = i0h0Var.f112370c;
                gvg0Var2.f106635f = a0h0Var;
                gvg0Var2.f106637h = jSONObject8.toString();
                ctg0 ctg0Var = new ctg0();
                if (jSONObject3.has("app_online_route_cfg")) {
                    JSONObject jSONObject9 = jSONObject3.getJSONObject("app_online_route_cfg");
                    if (jSONObject9.has("online_route")) {
                        ctg0Var.f83696a = jSONObject9.getBoolean("online_route");
                    }
                }
                i0h0Var.f112370c.f106636g = ctg0Var;
                JSONObject jSONObject10 = jSONObject3.getJSONObject("sdk_api_cfg");
                rhg0 rhg0Var = new rhg0();
                rhg0Var.f163163a = jSONObject10.getString("mg_list_url");
                rhg0Var.f163164b = jSONObject10.getString("mg_info_url");
                if (jSONObject10.has("report_url")) {
                    rhg0Var.f163165c = jSONObject10.getString("report_url");
                }
                if (jSONObject10.has("auth_mg_info_url")) {
                    rhg0Var.f163166d = jSONObject10.getString("auth_mg_info_url");
                }
                rhg0Var.f163167e = jSONObject10.optString("upload_url");
                i0h0Var.f112370c.f106633d = rhg0Var;
                this.f196283f.f181606f = jSONObject10.optString("gate_token_url");
                rhg0Var.f163168f = jSONObject10.optString("gate_ws_url");
                svg0 svg0Var = new svg0();
                if (!jSONObject3.isNull("sdk_rtss_cfg")) {
                    JSONObject jSONObject11 = jSONObject3.getJSONObject("sdk_rtss_cfg");
                    JSONObject jSONObjectOptJSONObject = jSONObject11.optJSONObject("microsoft_rtss_cfg");
                    if (jSONObjectOptJSONObject != null) {
                        vpg0 vpg0Var = new vpg0();
                        vpg0Var.f185250a = jSONObjectOptJSONObject.optString("speech_subscription_key");
                        vpg0Var.f185251b = jSONObjectOptJSONObject.optString("speech_region");
                        vpg0Var.f185252c = jSONObjectOptJSONObject.optJSONArray("asr_text_language_list");
                        vpg0Var.f185253d = jSONObjectOptJSONObject.optJSONArray("asr_number_language_list");
                        svg0Var.f170838a = vpg0Var;
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObject11.optJSONArray(ISudCfg.ASR_LOAD_LIST);
                    if (jSONArrayOptJSONArray != null) {
                        svg0Var.f170839b = new ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            svg0Var.f170839b.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i)));
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
                        svg0Var.f170840c = tccRtssCfg;
                    }
                }
                i0h0Var.f112370c.f106634e = svg0Var;
                JSONObject jSONObject12 = jSONObject3.getJSONObject("sdk_localization_cfg");
                gvg0 gvg0Var3 = i0h0Var.f112370c;
                smg0 smg0Var = new smg0();
                gvg0Var3.f106638i = smg0Var;
                smg0Var.f169575a = uyg0.m198626a(jSONObject12.getJSONObject("load_tip_loading"));
                i0h0Var.f112370c.f106638i.f169576b = uyg0.m198626a(jSONObject12.getJSONObject("load_tip_fail"));
                if (jSONObject12.has("load_tip_fail_upgrade")) {
                    i0h0Var.f112370c.f106638i.f169577c = uyg0.m198626a(jSONObject12.getJSONObject("load_tip_fail_upgrade"));
                }
                i0h0Var.f112370c.f106638i.f169578d = uyg0.m198626a(jSONObject12.getJSONObject("load_reload"));
                i0h0Var.f112370c.f106638i.f169579e = uyg0.m198626a(jSONObject12.getJSONObject("load_tip_timeout"));
                i0h0Var.f112370c.f106638i.f169580f = uyg0.m198626a(jSONObject12.getJSONObject("load_tip_continue_wait"));
                i0h0Var.f112370c.f106639j = jSONObject3.getInt("load_mg_pkg_time_out");
                i0h0Var.f112370c.f106640k = jSONObject3.optBoolean("unity_multi_process");
                JSONObject jSONObjectOptJSONObject4 = jSONObject3.optJSONObject("console_log_cfg");
                if (jSONObjectOptJSONObject4 != null) {
                    gvg0 gvg0Var4 = i0h0Var.f112370c;
                    rng0 rng0Var = new rng0();
                    gvg0Var4.f106641l = rng0Var;
                    rng0Var.f164039a = jSONObjectOptJSONObject4.optBoolean("is_open");
                    i0h0Var.f112370c.f106641l.f164040b = jSONObjectOptJSONObject4.optLong("max_size");
                }
                JSONObject jSONObjectOptJSONObject5 = jSONObject3.optJSONObject("model_api_cfg");
                if (jSONObjectOptJSONObject5 != null) {
                    gvg0 gvg0Var5 = i0h0Var.f112370c;
                    tfg0 tfg0Var = new tfg0();
                    gvg0Var5.f106642m = tfg0Var;
                    tfg0Var.f173958a = jSONObjectOptJSONObject5.optString("ip_interaction_url");
                    i0h0Var.f112370c.f106642m.f173959b = jSONObjectOptJSONObject5.optString("ip_interaction_sse_url");
                    i0h0Var.f112370c.f106642m.f173960c = jSONObjectOptJSONObject5.optString("model_config_url");
                    i0h0Var.f112370c.f106642m.f173961d = jSONObjectOptJSONObject5.optString("room_message_url");
                }
                JSONObject jSONObjectOptJSONObject6 = jSONObject3.optJSONObject("large_model_cfg");
                if (jSONObjectOptJSONObject6 != null) {
                    i0h0Var.f112370c.f106643n = new jxg0();
                    jSONObjectOptJSONObject6.optBoolean("enable");
                    JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject6.optJSONObject("volc");
                    if (jSONObjectOptJSONObject7 != null) {
                        i0h0Var.f112370c.f106643n.f123032a = new VolcCfg();
                        i0h0Var.f112370c.f106643n.f123032a.url = jSONObjectOptJSONObject7.optString("url");
                        i0h0Var.f112370c.f106643n.f123032a.async_url = jSONObjectOptJSONObject7.optString("async_url");
                        i0h0Var.f112370c.f106643n.f123032a.app_key = jSONObjectOptJSONObject7.optString("app_key");
                        i0h0Var.f112370c.f106643n.f123032a.access_key = lwg0.m156043a(jSONObjectOptJSONObject7.optString("access_key"));
                        i0h0Var.f112370c.f106643n.f123032a.resource_id = jSONObjectOptJSONObject7.optString("resource_id");
                        i0h0Var.f112370c.f106643n.f123032a.model_name = jSONObjectOptJSONObject7.optString("model_name");
                        i0h0Var.f112370c.f106643n.f123032a.languages = jSONObjectOptJSONObject7.optJSONArray("languages");
                        i0h0Var.f112370c.f106643n.f123032a.request_config = jSONObjectOptJSONObject7.optJSONObject("request_config");
                    }
                }
                JSONObject jSONObjectOptJSONObject8 = jSONObject3.optJSONObject("report_api_cfg");
                if (jSONObjectOptJSONObject8 != null) {
                    gvg0 gvg0Var6 = i0h0Var.f112370c;
                    ogg0 ogg0Var = new ogg0();
                    gvg0Var6.f106645p = ogg0Var;
                    ogg0Var.f147256a = jSONObjectOptJSONObject8.optString("report_llm_asr_url");
                }
                i0h0Var.f112370c.f106644o = jSONObject3.optString("log_id");
                tug0.m192750b(0L, 0, i0h0Var.f112370c.f106644o);
                tug0.m192749a();
                ukg0Var2 = ukg0Var;
            } catch (Exception e) {
                e = e;
                if (i0h0Var.f112368a == 0) {
                    i0h0Var.f112368a = oeg0.m167366a(e);
                    i0h0Var.f112369b = e.toString();
                } else {
                    SudLogger.m222813e(uyg0.f181596p, "sdkToken error :" + i0h0Var.f112369b + "(" + i0h0Var.f112368a + ")");
                }
                ukg0Var2 = ukg0Var;
                ukg0Var2.f179396e = i0h0Var.f112368a;
                String str2 = i0h0Var.f112369b;
                if (str2 != null) {
                    ukg0Var2.f179397f = str2;
                }
                String str3 = "sdkToken error :" + LogUtils.getErrorInfo(e);
                SudLogger.m222813e(uyg0.f181596p, str3);
                LogUtils.file("HttpService", str3);
            }
        } catch (Exception e2) {
            e = e2;
            ukg0Var = ukg0Var3;
        }
        ThreadUtils.postUITask(new zog0(this, i0h0Var, ukg0Var2));
    }
}
