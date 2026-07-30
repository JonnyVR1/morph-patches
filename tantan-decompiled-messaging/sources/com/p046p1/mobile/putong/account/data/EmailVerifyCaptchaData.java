package com.p046p1.mobile.putong.account.data;

import com.p046p1.mobile.account_phone.data.CaptchaAction;
import p149l.ig3;

/* JADX INFO: loaded from: classes9.dex */
public class EmailVerifyCaptchaData extends EmailRequestData {
    public CaptchaAction action;

    @Override // com.p046p1.mobile.account_core.request_data.RequestData, com.p046p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (this.action != null) {
            return;
        }
        ig3.m135964a("parameter should not empty! ");
    }
}
