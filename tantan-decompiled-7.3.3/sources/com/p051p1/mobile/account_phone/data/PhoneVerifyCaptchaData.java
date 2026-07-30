package com.p051p1.mobile.account_phone.data;

import p153l.wg3;

/* JADX INFO: loaded from: classes8.dex */
public class PhoneVerifyCaptchaData extends PhoneData {
    public CaptchaAction action;
    public int code;

    @Override // com.p051p1.mobile.account_phone.data.PhoneData, com.p051p1.mobile.account_core.request_data.RequestData, com.p051p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (this.action != null) {
            return;
        }
        wg3.m206174a("parameter should not empty! ");
    }
}
