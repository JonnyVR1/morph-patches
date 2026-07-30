package com.p046p1.mobile.account_phone.data;

import p149l.ig3;

/* JADX INFO: loaded from: classes8.dex */
public class PhoneVerifyCaptchaData extends PhoneData {
    public CaptchaAction action;
    public int code;

    @Override // com.p046p1.mobile.account_phone.data.PhoneData, com.p046p1.mobile.account_core.request_data.RequestData, com.p046p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (this.action != null) {
            return;
        }
        ig3.m135964a("parameter should not empty! ");
    }
}
