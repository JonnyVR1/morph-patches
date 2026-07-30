package com.p003p1.mobile.account_phone.data;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import l.ig3;
import p007l.pf4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class PhoneSendCaptchaData extends PhoneData {
    public CaptchaAction action;

    @SerializedName("captcha")
    public pf4 captcha;
    public String captchaToken;
    public String captchaValue;
    public String language;
    public String mmuid;
    public String mmuidv2;
    public String mmuidv3;
    public int codeLength = 4;
    public CaptchaCategory category = CaptchaCategory.text;

    @Override // com.p003p1.mobile.account_phone.data.PhoneData, com.p003p1.mobile.account_core.request_data.RequestData, com.p003p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (TextUtils.isEmpty(this.language) || this.codeLength == 0 || this.action == null || this.category == null) {
            ig3.a("parameter should not empty! ");
        }
    }
}
