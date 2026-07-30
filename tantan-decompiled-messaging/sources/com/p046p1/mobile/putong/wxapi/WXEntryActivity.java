package com.p046p1.mobile.putong.wxapi;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.p046p1.mobile.share_sdk.ShareEventActivity;
import com.tencent.p101mm.opensdk.modelbase.BaseReq;
import com.tencent.p101mm.opensdk.modelbase.BaseResp;
import com.tencent.p101mm.opensdk.modelmsg.SendAuth;
import com.tencent.p101mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.p101mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.qib0;
import p149l.roj0;
import p149l.yl5;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class WXEntryActivity extends ShareEventActivity implements IWXAPIEventHandler {
    public static final String APPID = "wx67f59443a9c801bb";
    public static final String PID = "p_sign_in_type_selection_view";
    public static final String TAG = "WXEntryActivity";
    IWXAPI api = null;

    private void sendResult(final int i, final String str) {
        qib0.f154721j0.m192071y(SchemeKey.account).take(1).compose(mkd0.m154965Q()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30<roj0>() { // from class: com.p1.mobile.putong.wxapi.WXEntryActivity.1
            @Override // p149l.e30
            public void call(roj0 roj0Var) {
                qib0.f154714c0.sendThirdPartLoginResult(i, str);
            }
        }));
    }

    @Override // com.p046p1.mobile.share_sdk.ShareEventActivity, android.app.Activity
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
        Intent intent;
        if (baseReq.getType() == 4 && (baseReq instanceof ShowMessageFromWX.Req)) {
            WXMediaMessage wXMediaMessage = ((ShowMessageFromWX.Req) baseReq).message;
            Uri uri = wXMediaMessage != null ? Uri.parse(wXMediaMessage.messageExt) : null;
            yl5 yl5Var = qib0.f154714c0;
            if (yl5Var == null || !yl5Var.signedIn_() || !qib0.m174779J0()) {
                intent = new Intent(this, (Class<?>) SplashProxyAct.class);
            } else if (uri == null || uri.getScheme() == null || !uri.getScheme().startsWith("tantan")) {
                intent = qib0.f154714c0.getMainActIntent(this);
            } else {
                intent = new Intent(this, (Class<?>) SplashProxyAct.class);
                intent.setData(uri);
            }
            startActivity(intent);
            finish();
        }
    }

    @Override // com.tencent.p101mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        du2.m113670a("[putong-common][wx]", "wx login response code = " + baseResp.errCode);
        int i = baseResp.errCode;
        if (i == -2) {
            if (baseResp.getType() == 1) {
                sendResult(-2, "");
                zvf0.m220371D("e_wechat_cancel_request", PID, new j760[0]);
                return;
            }
            return;
        }
        if (i != 0) {
            if (baseResp.getType() == 1) {
                sendResult(-1, "");
                zvf0.m220371D("e_wechat_request_error", PID, new j760[0]);
                return;
            }
            return;
        }
        if (baseResp.getType() == 1) {
            sendResult(0, ((SendAuth.Resp) baseResp).code);
            zvf0.m220371D("e_wechat_request_success", PID, new j760[0]);
        }
        if (TextUtils.equals(baseResp.transaction, "ab_share_profile")) {
            e51.m114743H(this, new Runnable() { // from class: l.afp0
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.m151595y("您已成功分享该用户");
                }
            }, 1000L);
        }
    }
}
