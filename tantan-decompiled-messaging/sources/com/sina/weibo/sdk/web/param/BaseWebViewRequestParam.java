package com.sina.weibo.sdk.web.param;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.web.BaseWebViewRequestData;
import com.sina.weibo.sdk.web.WebRequestType;
import p149l.jfd0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseWebViewRequestParam {
    private BaseWebViewRequestData baseData;
    protected Context context;
    private String transaction;

    /* JADX INFO: renamed from: com.sina.weibo.sdk.web.param.BaseWebViewRequestParam$1 */
    public static /* synthetic */ class C132201 {
        static final /* synthetic */ int[] $SwitchMap$com$sina$weibo$sdk$web$WebRequestType;

        static {
            int[] iArr = new int[WebRequestType.values().length];
            $SwitchMap$com$sina$weibo$sdk$web$WebRequestType = iArr;
            try {
                iArr[WebRequestType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$sina$weibo$sdk$web$WebRequestType[WebRequestType.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$sina$weibo$sdk$web$WebRequestType[WebRequestType.AUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface ExtraTaskCallback {
        void onComplete(String str);

        void onException(String str);
    }

    public BaseWebViewRequestParam(AuthInfo authInfo, WebRequestType webRequestType, String str, int i, String str2, String str3, Context context) {
        this.baseData = new BaseWebViewRequestData(authInfo, webRequestType, str, i, str2, str3);
        this.context = context;
        this.transaction = String.valueOf(System.currentTimeMillis());
    }

    public abstract void childFillBundle(Bundle bundle);

    public void doExtraTask(ExtraTaskCallback extraTaskCallback) {
    }

    public Bundle fillBundle(Bundle bundle) {
        BaseWebViewRequestData baseWebViewRequestData = this.baseData;
        if (baseWebViewRequestData == null) {
            jfd0.m141176a("构造方法错误，请使用全参数的构造方法构建");
            return null;
        }
        bundle.putSerializable("base", baseWebViewRequestData);
        int i = C132201.$SwitchMap$com$sina$weibo$sdk$web$WebRequestType[this.baseData.getType().ordinal()];
        if (i == 1) {
            bundle.putInt("type", 0);
        } else if (i == 2) {
            bundle.putInt("type", 1);
        } else if (i == 3) {
            bundle.putInt("type", 2);
        }
        bundle.putString(WBConstants.TRAN, this.transaction);
        childFillBundle(bundle);
        return bundle;
    }

    public BaseWebViewRequestData getBaseData() {
        return this.baseData;
    }

    public Context getContext() {
        return this.context;
    }

    public abstract String getRequestUrl();

    public boolean hasExtraTask() {
        return false;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void transformBundle(Bundle bundle) {
        this.baseData = (BaseWebViewRequestData) bundle.getSerializable("base");
        this.transaction = bundle.getString(WBConstants.TRAN);
        transformChildBundle(bundle);
    }

    public abstract void transformChildBundle(Bundle bundle);

    public abstract void updateRequestUrl(String str);

    public BaseWebViewRequestParam(AuthInfo authInfo, WebRequestType webRequestType, String str, String str2, String str3, Context context) {
        this(authInfo, webRequestType, str, 0, str2, str3, context);
    }

    public BaseWebViewRequestParam() {
    }
}
