package com.p051p1.mobile.putong.account.data;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.account_phone.data.CaptchaCategory;
import com.p051p1.mobile.putong.data.Captcha;
import p153l.og4;
import p153l.wg3;

/* JADX INFO: loaded from: classes9.dex */
public class EmailSendCaptchaData extends EmailRequestData {
    public EmailCaptchaAction action;

    @SerializedName(Captcha.TYPE)
    public og4 captcha;
    public String captchaToken;
    public String captchaValue;
    public String language;
    public String mmuid;
    public String mmuidv2;
    public String mmuidv3;
    public int codeLength = 4;
    public CaptchaCategory category = CaptchaCategory.text;

    @Override // com.p051p1.mobile.account_core.request_data.RequestData, com.p051p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (TextUtils.isEmpty(this.language) || this.codeLength == 0 || this.action == null || this.category == null) {
            wg3.m206174a("parameter should not empty! ");
        }
    }
}
