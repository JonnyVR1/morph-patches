package com.p046p1.mobile.putong.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.p046p1.mobile.putong.data.Order;
import com.tencent.p101mm.opensdk.modelbase.BaseReq;
import com.tencent.p101mm.opensdk.modelbase.BaseResp;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
import p149l.du2;
import p149l.qib0;

/* JADX INFO: loaded from: classes11.dex */
public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {
    public static final String APPID = "wxd5aa78216c5e54bc";
    private static final String TAG = "WXPayEntryActivity";
    private IWXAPI api;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, null);
        this.api = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(APPID);
        this.api.handleIntent(getIntent(), this);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.api.handleIntent(intent, this);
    }

    @Override // com.tencent.p101mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // com.tencent.p101mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        du2.m113670a("[putong-common][wx]", "wx pay response type = " + baseResp.getType() + ", code = " + baseResp.errCode);
        if (baseResp.getType() == 5) {
            Order order = new Order();
            if (baseResp.errCode == 0) {
                order.orderStatus = BundleStatus.get(BundleStatus.purchased);
            } else {
                order.orderStatus = BundleStatus.get("failed");
            }
            qib0.f154705T.m29590Z(order);
            finish();
        }
    }
}
