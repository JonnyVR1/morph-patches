package com.p000p1.mobile.putong.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.p1.mobile.putong.data.BundleStatus;
import com.p1.mobile.putong.data.Order;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import l.du2;
import l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
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
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, (String) null);
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

    public void onReq(BaseReq baseReq) {
    }

    public void onResp(BaseResp baseResp) {
        du2.a("[putong-common][wx]", "wx pay response type = " + baseResp.getType() + ", code = " + baseResp.errCode);
        if (baseResp.getType() == 5) {
            Order order = new Order();
            if (baseResp.errCode == 0) {
                order.orderStatus = BundleStatus.get("purchased");
            } else {
                order.orderStatus = BundleStatus.get("failed");
            }
            qib0.T.Z(order);
            finish();
        }
    }
}
