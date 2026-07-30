package com.p003p1.mobile.account_phone.data;

import android.text.TextUtils;
import com.p003p1.mobile.account_core.request_data.RequestData;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class PhoneData extends RequestData {
    public int countryCode;
    public String mobileNumber;

    @Override // com.p003p1.mobile.account_core.request_data.RequestData, com.p003p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
        if (TextUtils.isEmpty(this.mobileNumber) || this.countryCode == 0) {
            ig3.a("mobileNumber or countryCode should not empty! ");
        }
    }
}
