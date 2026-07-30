package com.sina.weibo.sdk.web;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WebPicUploadResult {
    public static final String RESP_UPLOAD_PIC_PARAM_CODE = "code";
    public static final String RESP_UPLOAD_PIC_PARAM_DATA = "data";
    public static final int RESP_UPLOAD_PIC_SUCC_CODE = 1;
    private int code = -2;
    private String picId;

    private WebPicUploadResult() {
    }

    public static WebPicUploadResult parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        WebPicUploadResult webPicUploadResult = new WebPicUploadResult();
        try {
            JSONObject jSONObject = new JSONObject(str);
            webPicUploadResult.code = jSONObject.optInt(RESP_UPLOAD_PIC_PARAM_CODE, -2);
            webPicUploadResult.picId = jSONObject.optString(RESP_UPLOAD_PIC_PARAM_DATA, "");
        } catch (JSONException unused) {
        }
        return webPicUploadResult;
    }

    public int getCode() {
        return this.code;
    }

    public String getPicId() {
        return this.picId;
    }
}
