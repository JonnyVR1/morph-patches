package com.p046p1.mobile.account_core.request_data;

import android.text.TextUtils;
import p149l.C21777zv;
import p149l.ig3;

/* JADX INFO: loaded from: classes8.dex */
public class RequestData extends JsonData {
    public final String clientId = C21777zv.f204926b;

    @Override // com.p046p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (TextUtils.isEmpty(this.clientId)) {
            ig3.m135964a("clientId should not empty! ");
        }
    }
}
