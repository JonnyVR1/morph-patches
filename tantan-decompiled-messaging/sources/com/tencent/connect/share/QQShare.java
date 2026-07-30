package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.C13802a;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.connect.p077a.C13803a;
import com.tencent.open.TDialog;
import com.tencent.open.log.SLog;
import com.tencent.open.p105b.C14363e;
import com.tencent.open.utils.C14386d;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14394l;
import com.tencent.open.utils.C14396n;
import com.tencent.open.utils.InterfaceC14387e;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class QQShare extends BaseApi {
    public static final int QQ_SHARE_SUMMARY_MAX_LENGTH = 512;
    public static final int QQ_SHARE_TITLE_MAX_LENGTH = 128;
    public static final String SHARE_TO_QQ_APP_NAME = "appName";
    public static final String SHARE_TO_QQ_ARK_INFO = "share_to_qq_ark_info";
    public static final String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final int SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN = 1;
    public static final int SHARE_TO_QQ_FLAG_QZONE_ITEM_HIDE = 2;
    public static final String SHARE_TO_QQ_GAME_MESSAGE_EXT = "game_message_ext";
    public static final String SHARE_TO_QQ_GAME_TAG_NAME = "game_tag_name";
    public static final String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final String SHARE_TO_QQ_KEY_TYPE = "req_type";
    public static final int SHARE_TO_QQ_MINI_PROGRAM = 7;
    public static final String SHARE_TO_QQ_MINI_PROGRAM_APPID = "mini_program_appid";
    public static final String SHARE_TO_QQ_MINI_PROGRAM_PATH = "mini_program_path";
    public static final String SHARE_TO_QQ_MINI_PROGRAM_TYPE = "mini_program_type";
    public static final String SHARE_TO_QQ_SITE = "site";
    public static final String SHARE_TO_QQ_SUMMARY = "summary";
    public static final String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final String SHARE_TO_QQ_TITLE = "title";
    public static final int SHARE_TO_QQ_TYPE_AUDIO = 2;
    public static final int SHARE_TO_QQ_TYPE_DEFAULT = 1;
    public static final int SHARE_TO_QQ_TYPE_IMAGE = 5;
    public String mViaShareQQType;

    public QQShare(Context context, QQToken qQToken) {
        super(qQToken);
        this.mViaShareQQType = "";
    }

    /* JADX INFO: renamed from: b */
    private void m82166b(final Activity activity, final Bundle bundle, final IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.QQShare", "shareToMobileQQ() -- start.");
        String string = bundle.getString("imageUrl");
        final String string2 = bundle.getString("title");
        final String string3 = bundle.getString("summary");
        SLog.m84313v("openSDK_LOG.QQShare", "shareToMobileQQ -- imageUrl: " + string);
        if (TextUtils.isEmpty(string)) {
            if (bundle.getInt("req_type", 1) == 5) {
                m82168c(activity, bundle, iUiListener);
            } else {
                m82169d(activity, bundle, iUiListener);
            }
        } else if (!C14396n.m84507h(string)) {
            bundle.putString("imageUrl", null);
            if (C14396n.m84502f(activity, "4.3.0")) {
                SLog.m84305d("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is < 4.3.0 ");
                m82169d(activity, bundle, iUiListener);
            } else {
                SLog.m84305d("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is > 4.3.0:isAppSpecificDir=" + C14396n.m84513m(string));
                C13831a.m82179a(activity, string, new InterfaceC14387e() { // from class: com.tencent.connect.share.QQShare.2
                    @Override // com.tencent.open.utils.InterfaceC14387e
                    /* JADX INFO: renamed from: a */
                    public void mo82170a(int i, String str) {
                        if (i == 0) {
                            bundle.putString("imageLocalUrl", str);
                        } else if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                            IUiListener iUiListener2 = iUiListener;
                            if (iUiListener2 != null) {
                                iUiListener2.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                                SLog.m84307e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                            }
                            C14363e.m84265a().m84266a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, ((BaseApi) QQShare.this).f57183c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_GETIMG_ERROR);
                            return;
                        }
                        QQShare.this.m82169d(activity, bundle, iUiListener);
                    }

                    @Override // com.tencent.open.utils.InterfaceC14387e
                    /* JADX INFO: renamed from: a */
                    public void mo82171a(int i, ArrayList<String> arrayList) {
                        if (i == 0) {
                            bundle.putStringArrayList("imageLocalUrlArray", arrayList);
                        } else if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                            IUiListener iUiListener2 = iUiListener;
                            if (iUiListener2 != null) {
                                iUiListener2.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                                SLog.m84307e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                            }
                            C14363e.m84265a().m84266a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, ((BaseApi) QQShare.this).f57183c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_GETIMG_ERROR);
                            return;
                        }
                        QQShare.this.m82169d(activity, bundle, iUiListener);
                    }
                });
            }
        } else if (C14396n.m84502f(activity, "4.3.0")) {
            new C14386d(activity).m84392a(string, new InterfaceC14387e() { // from class: com.tencent.connect.share.QQShare.1
                @Override // com.tencent.open.utils.InterfaceC14387e
                /* JADX INFO: renamed from: a */
                public void mo82170a(int i, String str) {
                    if (i == 0) {
                        bundle.putString("imageLocalUrl", str);
                    } else if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                        IUiListener iUiListener2 = iUiListener;
                        if (iUiListener2 != null) {
                            iUiListener2.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                            SLog.m84307e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                        }
                        C14363e.m84265a().m84266a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, ((BaseApi) QQShare.this).f57183c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_GETIMG_ERROR);
                        return;
                    }
                    QQShare.this.m82169d(activity, bundle, iUiListener);
                }

                @Override // com.tencent.open.utils.InterfaceC14387e
                /* JADX INFO: renamed from: a */
                public void mo82171a(int i, ArrayList<String> arrayList) {
                }
            });
        } else {
            m82169d(activity, bundle, iUiListener);
        }
        SLog.m84309i("openSDK_LOG.QQShare", "shareToMobileQQ() -- end");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00c2  */
    /* JADX INFO: renamed from: c */
    private void m82168c(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        String string = bundle.getString("imageLocalUrl");
        String str2 = null;
        if (new File(string).length() >= 5242880) {
            if (iUiListener != null) {
                iUiListener.onError(new UiError(-16, Constants.MSG_SHARE_IMAGE_TOO_LARGE_ERROR, null));
            }
            SLog.m84307e("openSDK_LOG.QQShare", "doShareImageToQQ -- error: 图片太大，请压缩到5M内再分享!");
            return;
        }
        File fileM84405a = C14390h.m84405a("Images");
        if (fileM84405a != null) {
            str2 = fileM84405a.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
        } else {
            SLog.m84309i("openSDK_LOG.QQShare", "doShareImageToQQ() getExternalFilesDir return null");
        }
        File file = new File(string);
        String absolutePath = file.getAbsolutePath();
        String name = file.getName();
        boolean zM84513m = C14396n.m84513m(absolutePath);
        SLog.m84309i("openSDK_LOG.QQShare", "doShareImageToQQ() check file: isAppSpecificDir=" + zM84513m + ",fileDir=" + absolutePath);
        ArrayList<String> arrayList = new ArrayList<>(2);
        if (zM84513m || TextUtils.isEmpty(str2)) {
            str = absolutePath;
        } else {
            str = str2 + File.separator + name;
            boolean zM84479a = C14396n.m84479a((Context) activity, absolutePath, str);
            SLog.m84309i("openSDK_LOG.QQShare", "doShareImageToQQ() sd permission not denied. copy to app specific:" + str + ",isSuccess=" + zM84479a);
            if (!zM84479a) {
                str = absolutePath;
            }
        }
        arrayList.add(absolutePath);
        arrayList.add(str);
        SLog.m84309i("openSDK_LOG.QQShare", "doShareImageToQQ() destFilePaths=[" + arrayList.get(0) + com.clevertap.android.sdk.Constants.SEPARATOR_COMMA + arrayList.get(1) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        bundle.putStringArrayList("imageLocalUrlArray", arrayList);
        m82169d(activity, bundle, iUiListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m82169d(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.QQShare", "doShareToQQ() -- start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_fri?src_type=app&version=1&file_type=news");
        String string = bundle.getString("imageUrl");
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("summary");
        String string4 = bundle.getString("targetUrl");
        String string5 = bundle.getString("audio_url");
        int i = bundle.getInt("req_type", 1);
        String string6 = bundle.getString(SHARE_TO_QQ_ARK_INFO);
        String string7 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string8 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_PATH);
        String string9 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_TYPE);
        int i2 = bundle.getInt("cflag", 0);
        String string10 = bundle.getString("share_qq_ext_str");
        String strM84469a = C14396n.m84469a(activity);
        if (strM84469a == null) {
            strM84469a = bundle.getString("appName");
        }
        String strConcat = strM84469a;
        String string11 = bundle.getString("imageLocalUrl");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageLocalUrlArray");
        String appId = this.f57183c.getAppId();
        String openIdWithCache = this.f57183c.getOpenIdWithCache();
        SLog.m84309i("openSDK_LOG.QQShare", "doShareToQQ -- openid: " + openIdWithCache + ",appName=" + strConcat);
        if (stringArrayList != null && stringArrayList.size() >= 2) {
            String str = stringArrayList.get(0);
            if (str == null) {
                str = "";
            }
            stringBuffer.append("&file_data=" + Base64.encodeToString(C14396n.m84510j(str), 2));
            String str2 = stringArrayList.get(1);
            if (i == 7 && !TextUtils.isEmpty(str2) && C14394l.m84445c(activity, "8.3.3") < 0) {
                SLog.m84307e("openSDK_LOG.QQShare", "doShareToQQ() share to mini program set file uri empty");
                str2 = null;
            }
            Uri uriM84462a = C14396n.m84462a(activity, appId, str2);
            if (uriM84462a != null) {
                stringBuffer.append("&file_uri=");
                stringBuffer.append(Base64.encodeToString(C14396n.m84510j(uriM84462a.toString()), 2));
            }
        } else if (!TextUtils.isEmpty(string11)) {
            stringBuffer.append("&file_data=" + Base64.encodeToString(C14396n.m84510j(string11), 2));
        }
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&image_url=" + Base64.encodeToString(C14396n.m84510j(string), 2));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&title=" + Base64.encodeToString(C14396n.m84510j(string2), 2));
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&description=" + Base64.encodeToString(C14396n.m84510j(string3), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string4)) {
            stringBuffer.append("&url=" + Base64.encodeToString(C14396n.m84510j(string4), 2));
        }
        if (!TextUtils.isEmpty(strConcat)) {
            if (strConcat.length() > 20) {
                strConcat = strConcat.substring(0, 20).concat("...");
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(C14396n.m84510j(strConcat), 2));
        }
        if (!TextUtils.isEmpty(openIdWithCache)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(C14396n.m84510j(openIdWithCache), 2));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&audioUrl=" + Base64.encodeToString(C14396n.m84510j(string5), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(C14396n.m84510j(String.valueOf(i)), 2));
        if (!TextUtils.isEmpty(string7)) {
            stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(C14396n.m84510j(String.valueOf(string7)), 2));
        }
        if (!TextUtils.isEmpty(string8)) {
            stringBuffer.append("&mini_program_path=" + Base64.encodeToString(C14396n.m84510j(String.valueOf(string8)), 2));
        }
        if (!TextUtils.isEmpty(string9)) {
            stringBuffer.append("&mini_program_type=" + Base64.encodeToString(C14396n.m84510j(String.valueOf(string9)), 2));
        }
        if (!TextUtils.isEmpty(string6)) {
            stringBuffer.append("&share_to_qq_ark_info=" + Base64.encodeToString(C14396n.m84510j(string6), 2));
        }
        if (!TextUtils.isEmpty(string10)) {
            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(C14396n.m84510j(string10), 2));
        }
        stringBuffer.append("&cflag=" + Base64.encodeToString(C14396n.m84510j(String.valueOf(i2)), 2));
        stringBuffer.append("&third_sd=" + Base64.encodeToString(C14396n.m84510j(String.valueOf(false)), 2));
        SLog.m84313v("openSDK_LOG.QQShare", "doShareToQQ -- url: " + stringBuffer.toString());
        C13803a.m81986a(C14390h.m84404a(), this.f57183c, "requireApi", "shareToNativeQQ");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, C14396n.m84467a(this.f57183c.getOpenId(), i2 == 1 ? Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE : Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, "3", Constants.VIA_SHARE_TO_QQ, this.f57183c.getAppId(), this.mViaShareQQType, "", "", "0", "1", "0"));
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        if (C14396n.m84502f(activity, "4.6.0")) {
            SLog.m84309i("openSDK_LOG.QQShare", "doShareToQQ, qqver below 4.6.");
            UIListenerManager.getInstance().setListenerWithRequestcode(11103, iUiListener);
            m82148a(activity, intent, 11103);
        } else {
            SLog.m84309i("openSDK_LOG.QQShare", "doShareToQQ, qqver greater than 4.6.");
            if (UIListenerManager.getInstance().setListnerWithAction("shareToQQ", iUiListener) != null) {
                SLog.m84309i("openSDK_LOG.QQShare", "doShareToQQ, last listener is not null, cancel it.");
            }
            m82147a(activity, Constants.REQUEST_QQ_SHARE, intent, true);
        }
        SLog.m84309i("openSDK_LOG.QQShare", "doShareToQQ() --end");
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
    }

    public void shareToQQ(Activity activity, Bundle bundle, IUiListener iUiListener) {
        int i;
        String str;
        SLog.m84309i("openSDK_LOG.QQShare", "shareToQQ() -- start.");
        if (C13802a.m81984a("openSDK_LOG.QQShare", iUiListener)) {
            return;
        }
        String string = bundle.getString("imageUrl");
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("summary");
        String string4 = bundle.getString("targetUrl");
        String string5 = bundle.getString("imageLocalUrl");
        String string6 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string7 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_PATH);
        int i2 = bundle.getInt("req_type", 1);
        SLog.m84309i("openSDK_LOG.QQShare", "shareToQQ -- type: " + i2);
        if (i2 == 1) {
            this.mViaShareQQType = "1";
        } else if (i2 == 2) {
            this.mViaShareQQType = "3";
        } else if (i2 == 5) {
            this.mViaShareQQType = "2";
        } else if (i2 == 7) {
            this.mViaShareQQType = Constants.VIA_SHARE_TYPE_MINI_PROGRAM;
        }
        if (!C14396n.m84477a() && C14396n.m84502f(activity, "4.5.0")) {
            iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
            SLog.m84307e("openSDK_LOG.QQShare", "shareToQQ sdcard is null--end");
            C14363e.m84265a().m84266a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f57183c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ sdcard is null");
            return;
        }
        if (i2 == 5) {
            if (C14396n.m84502f(activity, "4.3.0")) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_QQ_VERSION_ERROR, null));
                SLog.m84307e("openSDK_LOG.QQShare", "shareToQQ, version below 4.3 is not support.");
                C14363e.m84265a().m84266a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f57183c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, version below 4.3 is not support.");
                return;
            } else if (!C14396n.m84509i(string5)) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                SLog.m84307e("openSDK_LOG.QQShare", "shareToQQ -- error: 非法的图片地址!");
                C14363e.m84265a().m84266a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f57183c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR);
                return;
            }
        }
        if (i2 != 5) {
            i = 7;
            if (i2 != 7) {
                if (TextUtils.isEmpty(string4) || !(string4.startsWith("http://") || string4.startsWith("https://"))) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_ERROR, null));
                    SLog.m84307e("openSDK_LOG.QQShare", "shareToQQ, targetUrl is empty or illegal..");
                    C14363e.m84265a().m84266a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f57183c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, targetUrl is empty or illegal..");
                    return;
                } else {
                    if (TextUtils.isEmpty(string2)) {
                        iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_TITLE_NULL_ERROR, null));
                        SLog.m84307e("openSDK_LOG.QQShare", "shareToQQ, title is empty.");
                        C14363e.m84265a().m84266a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f57183c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, title is empty.");
                        return;
                    }
                    i = 7;
                }
            }
        } else {
            i = 7;
        }
        if (i2 == i) {
            if (TextUtils.isEmpty(string6) || TextUtils.isEmpty(string7) || TextUtils.isEmpty(string4) || TextUtils.isEmpty(this.f57183c.getAppId())) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid || path || url empty."));
                return;
            }
            if (C14394l.m84445c(activity, "8.0.8") < 0 && C14394l.m84448d(activity, "3.1") < 0) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_QQ_VERSION_ERROR, "版本过低，不支持分享小程序"));
                return;
            } else if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "title || summary empty."));
                return;
            }
        }
        if (!TextUtils.isEmpty(string) && !string.startsWith("http://") && !string.startsWith("https://") && !new File(string).exists()) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
            SLog.m84307e("openSDK_LOG.QQShare", "shareToQQ, image url is emprty or illegal.");
            C14363e.m84265a().m84266a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f57183c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, image url is emprty or illegal.");
            return;
        }
        if (TextUtils.isEmpty(string2) || string2.length() <= 128) {
            str = null;
        } else {
            str = null;
            bundle.putString("title", C14396n.m84471a(string2, 128, (String) null, (String) null));
        }
        if (!TextUtils.isEmpty(string3) && string3.length() > 512) {
            bundle.putString("summary", C14396n.m84471a(string3, 512, str, str));
        }
        if (C14396n.m84480a(activity, bundle.getInt("cflag", 0) == 1)) {
            SLog.m84309i("openSDK_LOG.QQShare", "shareToQQ, support share");
            m82166b(activity, bundle, iUiListener);
        } else {
            try {
                SLog.m84315w("openSDK_LOG.QQShare", "shareToQQ, don't support share, will show download dialog");
                new TDialog(activity, "", m82146a(""), null, this.f57183c).show();
            } catch (RuntimeException e) {
                SLog.m84308e("openSDK_LOG.QQShare", " shareToQQ, TDialog.show not in main thread", e);
                iUiListener.onError(new UiError(-6, Constants.MSG_NOT_CALL_ON_MAIN_THREAD, null));
            }
        }
        SLog.m84309i("openSDK_LOG.QQShare", "shareToQQ() -- end.");
    }
}
