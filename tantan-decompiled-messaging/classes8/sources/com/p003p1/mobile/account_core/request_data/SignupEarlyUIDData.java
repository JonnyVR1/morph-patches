package com.p003p1.mobile.account_core.request_data;

import java.util.List;
import p007l.C0570j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class SignupEarlyUIDData extends SignupData {
    public List<String> currentStages;
    private String password;
    public String stage;

    @Override // com.p003p1.mobile.account_core.request_data.SignupData, com.p003p1.mobile.account_core.request_data.RequestData, com.p003p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
    }

    public void setPassword(String str) {
        this.password = C0570j.m9450b(str);
    }
}
