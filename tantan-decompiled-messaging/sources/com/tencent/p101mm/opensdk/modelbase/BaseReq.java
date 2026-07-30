package com.tencent.p101mm.opensdk.modelbase;

import android.os.Bundle;
import com.tencent.p101mm.opensdk.channel.p102a.C14332a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseReq {
    public String openId;
    public String transaction;

    public abstract boolean checkArgs();

    public void fromBundle(Bundle bundle) {
        this.transaction = C14332a.m84159a(bundle, "_wxapi_basereq_transaction");
        this.openId = C14332a.m84159a(bundle, "_wxapi_basereq_openid");
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", getType());
        bundle.putString("_wxapi_basereq_transaction", this.transaction);
        bundle.putString("_wxapi_basereq_openid", this.openId);
    }
}
