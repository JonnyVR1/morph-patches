package com.p051p1.mobile.putong.account.data;

import com.p051p1.mobile.account_phone.data.CaptchaAction;
import p153l.wg3;

/* JADX INFO: loaded from: classes9.dex */
public class EmailVerifyCaptchaData extends EmailRequestData {
    public CaptchaAction action;

    @Override // com.p051p1.mobile.account_core.request_data.RequestData, com.p051p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (this.action != null) {
            return;
        }
        wg3.m206174a("parameter should not empty! ");
    }
}
