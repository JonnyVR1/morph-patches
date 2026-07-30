package com.p046p1.mobile.account_core.request_data;

import java.util.List;
import p149l.C17657j;

/* JADX INFO: loaded from: classes8.dex */
public class SignupEarlyUIDData extends SignupData {
    public List<String> currentStages;
    private String password;
    public String stage;

    @Override // com.p046p1.mobile.account_core.request_data.SignupData, com.p046p1.mobile.account_core.request_data.RequestData, com.p046p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
    }

    public void setPassword(String str) {
        this.password = C17657j.m139081b(str);
    }
}
