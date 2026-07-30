package com.p046p1.mobile.account_phone.data;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.data.Captcha;
import p149l.ig3;
import p149l.pf4;

/* JADX INFO: loaded from: classes8.dex */
public class PhoneSendCaptchaData extends PhoneData {
    public CaptchaAction action;

    @SerializedName(Captcha.TYPE)
    public pf4 captcha;
    public String captchaToken;
    public String captchaValue;
    public String language;
    public String mmuid;
    public String mmuidv2;
    public String mmuidv3;
    public int codeLength = 4;
    public CaptchaCategory category = CaptchaCategory.text;

    @Override // com.p046p1.mobile.account_phone.data.PhoneData, com.p046p1.mobile.account_core.request_data.RequestData, com.p046p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (TextUtils.isEmpty(this.language) || this.codeLength == 0 || this.action == null || this.category == null) {
            ig3.m135964a("parameter should not empty! ");
        }
    }
}
