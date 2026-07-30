package com.p051p1.mobile.putong.wxapi;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.p051p1.mobile.share_sdk.ShareEventActivity;
import com.tencent.p106mm.opensdk.modelbase.BaseReq;
import com.tencent.p106mm.opensdk.modelbase.BaseResp;
import com.tencent.p106mm.opensdk.modelmsg.SendAuth;
import com.tencent.p106mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.p106mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p106mm.opensdk.openapi.IWXAPI;
import com.tencent.p106mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.p106mm.opensdk.openapi.WXAPIFactory;
import p153l.bn5;
import p153l.fo0;
import p153l.i4g0;
import p153l.l51;
import p153l.pf60;
import p153l.psd0;
import p153l.tu2;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class WXEntryActivity extends ShareEventActivity implements IWXAPIEventHandler {
    public static final String APPID = "wx67f59443a9c801bb";
    public static final String PID = "p_sign_in_type_selection_view";
    public static final String TAG = "WXEntryActivity";
    IWXAPI api = null;

    private void sendResult(final int i, final String str) {
        uqb0.f180404j0.m115601y(SchemeKey.account).take(1).compose(psd0.m173606Q()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20<uxj0>() { // from class: com.p1.mobile.putong.wxapi.WXEntryActivity.1
            @Override // p153l.y20
            public void call(uxj0 uxj0Var) {
                uqb0.f180397c0.sendThirdPartLoginResult(i, str);
            }
        }));
    }

    @Override // com.p051p1.mobile.share_sdk.ShareEventActivity, android.app.Activity
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

    @Override // com.tencent.p106mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        Intent intent;
        if (baseReq.getType() == 4 && (baseReq instanceof ShowMessageFromWX.Req)) {
            WXMediaMessage wXMediaMessage = ((ShowMessageFromWX.Req) baseReq).message;
            Uri uri = wXMediaMessage != null ? Uri.parse(wXMediaMessage.messageExt) : null;
            bn5 bn5Var = uqb0.f180397c0;
            if (bn5Var == null || !bn5Var.signedIn_() || !uqb0.m197233J0()) {
                intent = new Intent(this, (Class<?>) SplashProxyAct.class);
            } else if (uri == null || uri.getScheme() == null || !uri.getScheme().startsWith("tantan")) {
                intent = uqb0.f180397c0.getMainActIntent(this);
            } else {
                intent = new Intent(this, (Class<?>) SplashProxyAct.class);
                intent.setData(uri);
            }
            startActivity(intent);
            finish();
        }
    }

    @Override // com.tencent.p106mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        tu2.m192703a("[putong-common][wx]", "wx login response code = " + baseResp.errCode);
        int i = baseResp.errCode;
        if (i == -2) {
            if (baseResp.getType() == 1) {
                sendResult(-2, "");
                i4g0.m138495D("e_wechat_cancel_request", PID, new pf60[0]);
                return;
            }
            return;
        }
        if (i != 0) {
            if (baseResp.getType() == 1) {
                sendResult(-1, "");
                i4g0.m138495D("e_wechat_request_error", PID, new pf60[0]);
                return;
            }
            return;
        }
        if (baseResp.getType() == 1) {
            sendResult(0, ((SendAuth.Resp) baseResp).code);
            i4g0.m138495D("e_wechat_request_success", PID, new pf60[0]);
        }
        if (TextUtils.equals(baseResp.transaction, "ab_share_profile")) {
            l51.m152888H(this, new Runnable() { // from class: l.eop0
                @Override // java.lang.Runnable
                public final void run() {
                    o1j0.m165651y("您已成功分享该用户");
                }
            }, 1000L);
        }
    }
}
