package com.p046p1.mobile.account_core.reponse_data;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.data.SignInGrantType;

/* JADX INFO: loaded from: classes8.dex */
public class OneClickStatus {

    @SerializedName("china-mobile")
    public boolean chinaMobile = true;

    @SerializedName(SignInGrantType.china_unicom)
    public boolean chinaUnicom = true;
}
