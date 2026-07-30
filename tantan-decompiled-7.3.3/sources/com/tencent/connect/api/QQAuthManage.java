package com.tencent.connect.api;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tencent.connect.C13965a;
import com.tencent.connect.auth.C13975c;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.apireq.BaseResp;
import com.tencent.open.apireq.IApiCallback;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14557l;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class QQAuthManage extends BaseApi {

    public static class Resp extends BaseResp {
    }

    public QQAuthManage(C13975c c13975c, QQToken qQToken) {
        super(c13975c, qQToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83175a(Activity activity, IApiCallback iApiCallback) {
        SLog.m85492i("QQAuthManage", "doGotoMangePage");
        StringBuilder sb = new StringBuilder("mqqapi://opensdk/open_auth_manage");
        m83335a(sb, activity);
        Intent intent = new Intent();
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.setPackage("com.tencent.mobileqq");
        intent.setFlags(335544320);
        activity.startActivity(intent);
        iApiCallback.onResp(new Resp());
    }

    public void gotoManagePage(final Activity activity, final IApiCallback iApiCallback) {
        SLog.m85492i("QQAuthManage", "gotoManagePage");
        final Resp resp = new Resp();
        if (C13965a.m83167a("QQAuthManage", null)) {
            resp.setCode(-1003);
            iApiCallback.onResp(resp);
            return;
        }
        int iM83174a = m83174a(activity);
        if (iM83174a != 0) {
            resp.setCode(iM83174a);
            iApiCallback.onResp(resp);
        } else {
            if (this.f58031c.isSessionValid() && this.f58031c.getOpenId() != null) {
                this.f58030b.m83262a(new IUiListener() { // from class: com.tencent.connect.api.QQAuthManage.1
                    @Override // com.tencent.tauth.IUiListener
                    public void onCancel() {
                    }

                    @Override // com.tencent.tauth.IUiListener
                    public void onComplete(Object obj) {
                        if (obj instanceof JSONObject) {
                            if (((JSONObject) obj).optInt("ret", -1) == 0) {
                                QQAuthManage.this.m83175a(activity, iApiCallback);
                                return;
                            }
                            SLog.m85492i("QQAuthManage", "gotoManagePage: checkLogin not login");
                            resp.setCode(BaseResp.CODE_NOT_LOGIN);
                            iApiCallback.onResp(resp);
                        }
                    }

                    @Override // com.tencent.tauth.IUiListener
                    public void onError(UiError uiError) {
                        resp.setCode(uiError.errorCode);
                        resp.setErrorMsg(uiError.errorMessage);
                        SLog.m85490e("QQAuthManage", "gotoManagePage: checkLogin error. " + resp);
                        iApiCallback.onResp(resp);
                    }

                    @Override // com.tencent.tauth.IUiListener
                    public void onWarning(int i) {
                    }
                });
                return;
            }
            SLog.m85492i("QQAuthManage", "gotoManagePage: not login");
            resp.setCode(BaseResp.CODE_NOT_LOGIN);
            iApiCallback.onResp(resp);
        }
    }

    /* JADX INFO: renamed from: a */
    private int m83174a(Activity activity) {
        if (!C14557l.m85630c(activity)) {
            SLog.m85492i("QQAuthManage", "gotoManagePage: not installed all qq");
            return -1000;
        }
        if (!C14557l.m85626b(activity)) {
            SLog.m85492i("QQAuthManage", "gotoManagePage: only support mobile qq");
            return -1002;
        }
        if (C14557l.m85628c(activity, "8.6.0") >= 0) {
            return 0;
        }
        SLog.m85492i("QQAuthManage", "gotoManagePage: low version");
        return -1001;
    }
}
