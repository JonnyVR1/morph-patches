package com.sina.weibo.sdk.web.param;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.api.BaseMediaObject;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.net.WeiboParameters;
import com.sina.weibo.sdk.network.IRequestService;
import com.sina.weibo.sdk.network.impl.RequestParam;
import com.sina.weibo.sdk.network.impl.RequestService;
import com.sina.weibo.sdk.network.target.SimpleTarget;
import com.sina.weibo.sdk.utils.Base64;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.Utility;
import com.sina.weibo.sdk.utils.WbSdkVersion;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.sina.weibo.sdk.web.WebRequestType;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ShareWebViewRequestParam extends BaseWebViewRequestParam {
    public static final String SHARE_URL = "https://service.weibo.com/share/mobilesdk.php";
    private static final String UPLOAD_PIC_URL = "https://service.weibo.com/share/mobilesdk_uppic.php";
    private String hashKey;
    private byte[] mBase64ImgData;
    private String mShareContent;
    private WeiboMultiMessage multiMessage;
    private String packageName;
    private String picId;
    private String token;

    public ShareWebViewRequestParam(AuthInfo authInfo, WebRequestType webRequestType, String str, String str2, String str3, Context context) {
        this(authInfo, webRequestType, str, 0, str2, str3, context);
    }

    private void getBaseUrl() throws IOException {
        StringBuilder sb = new StringBuilder();
        if (this.multiMessage.textObject != null) {
            sb.append(this.multiMessage.textObject.text + " ");
        }
        BaseMediaObject baseMediaObject = this.multiMessage.mediaObject;
        if (baseMediaObject != null && (baseMediaObject instanceof WebpageObject) && !TextUtils.isEmpty(baseMediaObject.actionUrl)) {
            sb.append(this.multiMessage.mediaObject.actionUrl);
        }
        if (this.multiMessage.imageObject != null) {
            ImageObject imageObject = this.multiMessage.imageObject;
            handleMblogPic(imageObject.imagePath, imageObject.imageData);
        }
        this.mShareContent = sb.toString();
    }

    private void handleMblogPic(String str, byte[] bArr) throws IOException {
        try {
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.canRead() && file.length() > 0) {
                    byte[] bArr2 = new byte[(int) file.length()];
                    FileInputStream fileInputStream = null;
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            fileInputStream2.read(bArr2);
                            this.mBase64ImgData = Base64.encodebyte(bArr2);
                            try {
                                fileInputStream2.close();
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        } catch (IOException unused2) {
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (bArr != null) {
                                return;
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused4) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (SecurityException | Exception unused5) {
        }
        if (bArr != null || bArr.length <= 0) {
            return;
        }
        this.mBase64ImgData = Base64.encodebyte(bArr);
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public void childFillBundle(Bundle bundle) {
        WeiboMultiMessage weiboMultiMessage = this.multiMessage;
        if (weiboMultiMessage != null) {
            weiboMultiMessage.toBundle(bundle);
        }
        bundle.putString("token", this.token);
        bundle.putString("packageName", this.packageName);
        bundle.putString("hashKey", this.hashKey);
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public void doExtraTask(final BaseWebViewRequestParam.ExtraTaskCallback extraTaskCallback) {
        super.doExtraTask(extraTaskCallback);
        LogUtil.m10831i("Share", "ShareWebViewRequestParam.doExtraTask()");
        new WeiboParameters(getBaseData().getAuthInfo().getAppKey());
        String str = new String(this.mBase64ImgData);
        IRequestService requestService = RequestService.getInstance();
        RequestParam.Builder builder = new RequestParam.Builder(this.context);
        builder.setShortUrl(UPLOAD_PIC_URL);
        builder.addPostParam("img", str);
        builder.addPostParam(WBConstants.SSO_APP_KEY, getBaseData().getAuthInfo().getAppKey());
        requestService.asyncRequest(builder.build(), new SimpleTarget() { // from class: com.sina.weibo.sdk.web.param.ShareWebViewRequestParam.1
            @Override // com.sina.weibo.sdk.network.target.Target
            public void onFailure(Exception exc) {
                LogUtil.m10831i("Share", "ShareWebViewRequestParam.doExtraTask().onFailure(),e =" + exc.getMessage());
                BaseWebViewRequestParam.ExtraTaskCallback extraTaskCallback2 = extraTaskCallback;
                if (extraTaskCallback2 != null) {
                    extraTaskCallback2.onException("upload pic fail");
                }
            }

            @Override // com.sina.weibo.sdk.network.target.SimpleTarget
            public void onSuccess(String str2) {
                LogUtil.m10831i("Share", "ShareWebViewRequestParam.doExtraTask().onSuccess(),response = " + str2);
                WebPicUploadResult webPicUploadResult = WebPicUploadResult.parse(str2);
                if (webPicUploadResult == null || webPicUploadResult.getCode() != 1 || TextUtils.isEmpty(webPicUploadResult.getPicId())) {
                    BaseWebViewRequestParam.ExtraTaskCallback extraTaskCallback2 = extraTaskCallback;
                    if (extraTaskCallback2 != null) {
                        extraTaskCallback2.onException("upload pic fail");
                        return;
                    }
                    return;
                }
                ShareWebViewRequestParam.this.picId = webPicUploadResult.getPicId();
                BaseWebViewRequestParam.ExtraTaskCallback extraTaskCallback3 = extraTaskCallback;
                if (extraTaskCallback3 != null) {
                    extraTaskCallback3.onComplete(ShareWebViewRequestParam.this.picId);
                }
            }
        });
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public String getRequestUrl() {
        String appKey = getBaseData().getAuthInfo().getAppKey();
        Uri.Builder builderBuildUpon = Uri.parse(SHARE_URL).buildUpon();
        builderBuildUpon.appendQueryParameter("title", this.mShareContent);
        builderBuildUpon.appendQueryParameter(WBConstants.AUTH_PARAMS_VERSION, WbSdkVersion.WEIBO_SDK_VERSION_CODE);
        if (!TextUtils.isEmpty(appKey)) {
            builderBuildUpon.appendQueryParameter("source", appKey);
        }
        if (!TextUtils.isEmpty(this.token)) {
            builderBuildUpon.appendQueryParameter(Oauth2AccessToken.KEY_ACCESS_TOKEN, this.token);
        }
        Context context = this.context;
        if (context != null) {
            String aid = Utility.getAid(context, appKey);
            if (!TextUtils.isEmpty(aid)) {
                builderBuildUpon.appendQueryParameter("aid", aid);
            }
        }
        if (!TextUtils.isEmpty(this.packageName)) {
            builderBuildUpon.appendQueryParameter("packagename", this.packageName);
        }
        if (!TextUtils.isEmpty(this.hashKey)) {
            builderBuildUpon.appendQueryParameter("key_hash", this.hashKey);
        }
        if (!TextUtils.isEmpty(this.picId)) {
            builderBuildUpon.appendQueryParameter("picinfo", this.picId);
        }
        builderBuildUpon.appendQueryParameter("luicode", "10000360");
        builderBuildUpon.appendQueryParameter("lfid", "OP_" + appKey);
        return builderBuildUpon.build().toString();
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public boolean hasExtraTask() {
        byte[] bArr = this.mBase64ImgData;
        if (bArr == null || bArr.length <= 0) {
            return super.hasExtraTask();
        }
        return true;
    }

    public void setHashKey(String str) {
        this.hashKey = str;
    }

    public void setMultiMessage(WeiboMultiMessage weiboMultiMessage) {
        this.multiMessage = weiboMultiMessage;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public void transformChildBundle(Bundle bundle) throws IOException {
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        this.multiMessage = weiboMultiMessage;
        weiboMultiMessage.toObject(bundle);
        this.token = bundle.getString("token");
        this.packageName = bundle.getString("packageName");
        this.hashKey = bundle.getString("hashKey");
        getBaseUrl();
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public void updateRequestUrl(String str) {
        this.picId = str;
    }

    public ShareWebViewRequestParam(Context context) {
        this.context = context;
    }

    public ShareWebViewRequestParam() {
    }

    public ShareWebViewRequestParam(AuthInfo authInfo, WebRequestType webRequestType, String str, int i, String str2, String str3, Context context) {
        super(authInfo, webRequestType, str, i, str2, str3, context);
    }
}
