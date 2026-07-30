package com.tencent.connect.api;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tencent.connect.C13802a;
import com.tencent.connect.auth.C13812c;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.apireq.BaseResp;
import com.tencent.open.apireq.IApiCallback;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14394l;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class QQAuthManage extends BaseApi {

    public static class Resp extends BaseResp {
    }

    public QQAuthManage(C13812c c13812c, QQToken qQToken) {
        super(c13812c, qQToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m81992a(Activity activity, IApiCallback iApiCallback) {
        SLog.m84309i("QQAuthManage", "doGotoMangePage");
        StringBuilder sb = new StringBuilder("mqqapi://opensdk/open_auth_manage");
        m82152a(sb, activity);
        Intent intent = new Intent();
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.setPackage("com.tencent.mobileqq");
        intent.setFlags(335544320);
        activity.startActivity(intent);
        iApiCallback.onResp(new Resp());
    }

    public void gotoManagePage(final Activity activity, final IApiCallback iApiCallback) {
        SLog.m84309i("QQAuthManage", "gotoManagePage");
        final Resp resp = new Resp();
        if (C13802a.m81984a("QQAuthManage", null)) {
            resp.setCode(-1003);
            iApiCallback.onResp(resp);
            return;
        }
        int iM81991a = m81991a(activity);
        if (iM81991a != 0) {
            resp.setCode(iM81991a);
            iApiCallback.onResp(resp);
        } else {
            if (this.f57183c.isSessionValid() && this.f57183c.getOpenId() != null) {
                this.f57182b.m82079a(new IUiListener() { // from class: com.tencent.connect.api.QQAuthManage.1
                    @Override // com.tencent.tauth.IUiListener
                    public void onCancel() {
                    }

                    @Override // com.tencent.tauth.IUiListener
                    public void onComplete(Object obj) {
                        if (obj instanceof JSONObject) {
                            if (((JSONObject) obj).optInt("ret", -1) == 0) {
                                QQAuthManage.this.m81992a(activity, iApiCallback);
                                return;
                            }
                            SLog.m84309i("QQAuthManage", "gotoManagePage: checkLogin not login");
                            resp.setCode(BaseResp.CODE_NOT_LOGIN);
                            iApiCallback.onResp(resp);
                        }
                    }

                    @Override // com.tencent.tauth.IUiListener
                    public void onError(UiError uiError) {
                        resp.setCode(uiError.errorCode);
                        resp.setErrorMsg(uiError.errorMessage);
                        SLog.m84307e("QQAuthManage", "gotoManagePage: checkLogin error. " + resp);
                        iApiCallback.onResp(resp);
                    }

                    @Override // com.tencent.tauth.IUiListener
                    public void onWarning(int i) {
                    }
                });
                return;
            }
            SLog.m84309i("QQAuthManage", "gotoManagePage: not login");
            resp.setCode(BaseResp.CODE_NOT_LOGIN);
            iApiCallback.onResp(resp);
        }
    }

    /* JADX INFO: renamed from: a */
    private int m81991a(Activity activity) {
        if (!C14394l.m84447c(activity)) {
            SLog.m84309i("QQAuthManage", "gotoManagePage: not installed all qq");
            return -1000;
        }
        if (!C14394l.m84443b(activity)) {
            SLog.m84309i("QQAuthManage", "gotoManagePage: only support mobile qq");
            return -1002;
        }
        if (C14394l.m84445c(activity, "8.6.0") >= 0) {
            return 0;
        }
        SLog.m84309i("QQAuthManage", "gotoManagePage: low version");
        return -1001;
    }
}
