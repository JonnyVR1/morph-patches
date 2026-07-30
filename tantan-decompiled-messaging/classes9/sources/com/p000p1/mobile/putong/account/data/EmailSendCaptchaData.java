package com.p000p1.mobile.putong.account.data;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.p1.mobile.account_phone.data.CaptchaCategory;
import l.ig3;
import l.pf4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class EmailSendCaptchaData extends EmailRequestData {
    public EmailCaptchaAction action;

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

    public void checkNull() {
        super.checkNull();
        if (TextUtils.isEmpty(this.language) || this.codeLength == 0 || this.action == null || this.category == null) {
            ig3.a("parameter should not empty! ");
        }
    }
}
