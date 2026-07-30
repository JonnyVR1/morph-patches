package com.p051p1.mobile.account_core.request_data;

import android.text.TextUtils;
import p153l.C20407tv;
import p153l.wg3;

/* JADX INFO: loaded from: classes8.dex */
public class RequestData extends JsonData {
    public final String clientId = C20407tv.f176233b;

    @Override // com.p051p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (TextUtils.isEmpty(this.clientId)) {
            wg3.m206174a("clientId should not empty! ");
        }
    }
}
