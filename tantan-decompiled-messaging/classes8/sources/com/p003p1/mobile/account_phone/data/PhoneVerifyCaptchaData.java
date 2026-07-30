package com.p003p1.mobile.account_phone.data;

import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class PhoneVerifyCaptchaData extends PhoneData {
    public CaptchaAction action;
    public int code;

    @Override // com.p003p1.mobile.account_phone.data.PhoneData, com.p003p1.mobile.account_core.request_data.RequestData, com.p003p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (this.action != null) {
            return;
        }
        ig3.a("parameter should not empty! ");
    }
}
