package com.p051p1.mobile.account_phone.data;

import android.text.TextUtils;
import com.p051p1.mobile.account_core.request_data.RequestData;
import p153l.wg3;

/* JADX INFO: loaded from: classes8.dex */
public class PhoneData extends RequestData {
    public int countryCode;
    public String mobileNumber;

    @Override // com.p051p1.mobile.account_core.request_data.RequestData, com.p051p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (TextUtils.isEmpty(this.mobileNumber) || this.countryCode == 0) {
            wg3.m206174a("mobileNumber or countryCode should not empty! ");
        }
    }
}
