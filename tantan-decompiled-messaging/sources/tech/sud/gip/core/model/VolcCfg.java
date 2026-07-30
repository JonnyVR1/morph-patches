package tech.sud.gip.core.model;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class VolcCfg {
    public String access_key;
    public String app_key;
    public String async_url;
    public JSONArray languages;
    public String model_name;
    public JSONObject request_config;
    public String resource_id;
    public String url;

    public boolean canRecognitionLanguage(String str) {
        JSONArray jSONArray;
        if (!TextUtils.isEmpty(str) && (jSONArray = this.languages) != null && jSONArray.length() != 0) {
            for (int i = 0; i < this.languages.length(); i++) {
                if (str.equals(this.languages.optString(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
