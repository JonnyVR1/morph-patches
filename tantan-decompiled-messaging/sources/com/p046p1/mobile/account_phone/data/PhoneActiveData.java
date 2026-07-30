package com.p046p1.mobile.account_phone.data;

import com.p046p1.mobile.account_core.request_data.ThirdPartyAccount;
import p149l.C17657j;

/* JADX INFO: loaded from: classes8.dex */
public class PhoneActiveData extends PhoneData {
    public PhoneSigninType activateType;
    public int code;
    private String password;
    public ThirdPartyAccount thirdPartyAccount;

    @Override // com.p046p1.mobile.account_phone.data.PhoneData, com.p046p1.mobile.account_core.request_data.RequestData, com.p046p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
    }

    public void setPassword(String str) {
        this.password = C17657j.m139081b(str);
    }
}
