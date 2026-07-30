package com.p003p1.mobile.account_core.request_data;

import android.text.TextUtils;
import l.ig3;
import p007l.C0811zv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class RequestData extends JsonData {
    public final String clientId = C0811zv.f5544b;

    @Override // com.p003p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (TextUtils.isEmpty(this.clientId)) {
            ig3.a("clientId should not empty! ");
        }
    }
}
