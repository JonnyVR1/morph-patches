package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.C13965a;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.connect.p082a.C13966a;
import com.tencent.open.TDialog;
import com.tencent.open.log.SLog;
import com.tencent.open.p110b.C14526e;
import com.tencent.open.utils.C14549d;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14559n;
import com.tencent.open.utils.InterfaceC14550e;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
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
    private void m83349b(final Activity activity, final Bundle bundle, final IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.QQShare", "shareToMobileQQ() -- start.");
        String string = bundle.getString("imageUrl");
        final String string2 = bundle.getString("title");
        final String string3 = bundle.getString("summary");
        SLog.m85496v("openSDK_LOG.QQShare", "shareToMobileQQ -- imageUrl: " + string);
        if (TextUtils.isEmpty(string)) {
            if (bundle.getInt("req_type", 1) == 5) {
                m83351c(activity, bundle, iUiListener);
            } else {
                m83352d(activity, bundle, iUiListener);
            }
        } else if (!C14559n.m85690h(string)) {
            bundle.putString("imageUrl", null);
            if (C14559n.m85685f(activity, "4.3.0")) {
                SLog.m85488d("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is < 4.3.0 ");
                m83352d(activity, bundle, iUiListener);
            } else {
                SLog.m85488d("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is > 4.3.0:isAppSpecificDir=" + C14559n.m85696m(string));
                C13994a.m83362a(activity, string, new InterfaceC14550e() { // from class: com.tencent.connect.share.QQShare.2
                    @Override // com.tencent.open.utils.InterfaceC14550e
                    /* JADX INFO: renamed from: a */
                    public void mo83353a(int i, String str) {
                        if (i == 0) {
                            bundle.putString("imageLocalUrl", str);
                        } else if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                            IUiListener iUiListener2 = iUiListener;
                            if (iUiListener2 != null) {
                                iUiListener2.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                                SLog.m85490e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                            }
                            C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, ((BaseApi) QQShare.this).f58031c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_GETIMG_ERROR);
                            return;
                        }
                        QQShare.this.m83352d(activity, bundle, iUiListener);
                    }

                    @Override // com.tencent.open.utils.InterfaceC14550e
                    /* JADX INFO: renamed from: a */
                    public void mo83354a(int i, ArrayList<String> arrayList) {
                        if (i == 0) {
                            bundle.putStringArrayList("imageLocalUrlArray", arrayList);
                        } else if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                            IUiListener iUiListener2 = iUiListener;
                            if (iUiListener2 != null) {
                                iUiListener2.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                                SLog.m85490e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                            }
                            C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, ((BaseApi) QQShare.this).f58031c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_GETIMG_ERROR);
                            return;
                        }
                        QQShare.this.m83352d(activity, bundle, iUiListener);
                    }
                });
            }
        } else if (C14559n.m85685f(activity, "4.3.0")) {
            new C14549d(activity).m85575a(string, new InterfaceC14550e() { // from class: com.tencent.connect.share.QQShare.1
                @Override // com.tencent.open.utils.InterfaceC14550e
                /* JADX INFO: renamed from: a */
                public void mo83353a(int i, String str) {
                    if (i == 0) {
                        bundle.putString("imageLocalUrl", str);
                    } else if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                        IUiListener iUiListener2 = iUiListener;
                        if (iUiListener2 != null) {
                            iUiListener2.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                            SLog.m85490e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                        }
                        C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, ((BaseApi) QQShare.this).f58031c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_GETIMG_ERROR);
                        return;
                    }
                    QQShare.this.m83352d(activity, bundle, iUiListener);
                }

                @Override // com.tencent.open.utils.InterfaceC14550e
                /* JADX INFO: renamed from: a */
                public void mo83354a(int i, ArrayList<String> arrayList) {
                }
            });
        } else {
            m83352d(activity, bundle, iUiListener);
        }
        SLog.m85492i("openSDK_LOG.QQShare", "shareToMobileQQ() -- end");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00c2  */
    /* JADX INFO: renamed from: c */
    private void m83351c(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        String string = bundle.getString("imageLocalUrl");
        String str2 = null;
        if (new File(string).length() >= 5242880) {
            if (iUiListener != null) {
                iUiListener.onError(new UiError(-16, Constants.MSG_SHARE_IMAGE_TOO_LARGE_ERROR, null));
            }
            SLog.m85490e("openSDK_LOG.QQShare", "doShareImageToQQ -- error: 图片太大，请压缩到5M内再分享!");
            return;
        }
        File fileM85588a = C14553h.m85588a("Images");
        if (fileM85588a != null) {
            str2 = fileM85588a.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
        } else {
            SLog.m85492i("openSDK_LOG.QQShare", "doShareImageToQQ() getExternalFilesDir return null");
        }
        File file = new File(string);
        String absolutePath = file.getAbsolutePath();
        String name = file.getName();
        boolean zM85696m = C14559n.m85696m(absolutePath);
        SLog.m85492i("openSDK_LOG.QQShare", "doShareImageToQQ() check file: isAppSpecificDir=" + zM85696m + ",fileDir=" + absolutePath);
        ArrayList<String> arrayList = new ArrayList<>(2);
        if (zM85696m || TextUtils.isEmpty(str2)) {
            str = absolutePath;
        } else {
            str = str2 + File.separator + name;
            boolean zM85662a = C14559n.m85662a((Context) activity, absolutePath, str);
            SLog.m85492i("openSDK_LOG.QQShare", "doShareImageToQQ() sd permission not denied. copy to app specific:" + str + ",isSuccess=" + zM85662a);
            if (!zM85662a) {
                str = absolutePath;
            }
        }
        arrayList.add(absolutePath);
        arrayList.add(str);
        SLog.m85492i("openSDK_LOG.QQShare", "doShareImageToQQ() destFilePaths=[" + arrayList.get(0) + com.clevertap.android.sdk.Constants.SEPARATOR_COMMA + arrayList.get(1) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        bundle.putStringArrayList("imageLocalUrlArray", arrayList);
        m83352d(activity, bundle, iUiListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m83352d(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.QQShare", "doShareToQQ() -- start");
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
        String strM85652a = C14559n.m85652a(activity);
        if (strM85652a == null) {
            strM85652a = bundle.getString("appName");
        }
        String strConcat = strM85652a;
        String string11 = bundle.getString("imageLocalUrl");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageLocalUrlArray");
        String appId = this.f58031c.getAppId();
        String openIdWithCache = this.f58031c.getOpenIdWithCache();
        SLog.m85492i("openSDK_LOG.QQShare", "doShareToQQ -- openid: " + openIdWithCache + ",appName=" + strConcat);
        if (stringArrayList != null && stringArrayList.size() >= 2) {
            String str = stringArrayList.get(0);
            if (str == null) {
                str = "";
            }
            stringBuffer.append("&file_data=" + Base64.encodeToString(C14559n.m85693j(str), 2));
            String str2 = stringArrayList.get(1);
            if (i == 7 && !TextUtils.isEmpty(str2) && C14557l.m85628c(activity, "8.3.3") < 0) {
                SLog.m85490e("openSDK_LOG.QQShare", "doShareToQQ() share to mini program set file uri empty");
                str2 = null;
            }
            Uri uriM85645a = C14559n.m85645a(activity, appId, str2);
            if (uriM85645a != null) {
                stringBuffer.append("&file_uri=");
                stringBuffer.append(Base64.encodeToString(C14559n.m85693j(uriM85645a.toString()), 2));
            }
        } else if (!TextUtils.isEmpty(string11)) {
            stringBuffer.append("&file_data=" + Base64.encodeToString(C14559n.m85693j(string11), 2));
        }
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&image_url=" + Base64.encodeToString(C14559n.m85693j(string), 2));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&title=" + Base64.encodeToString(C14559n.m85693j(string2), 2));
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&description=" + Base64.encodeToString(C14559n.m85693j(string3), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string4)) {
            stringBuffer.append("&url=" + Base64.encodeToString(C14559n.m85693j(string4), 2));
        }
        if (!TextUtils.isEmpty(strConcat)) {
            if (strConcat.length() > 20) {
                strConcat = strConcat.substring(0, 20).concat("...");
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(strConcat), 2));
        }
        if (!TextUtils.isEmpty(openIdWithCache)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(openIdWithCache), 2));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&audioUrl=" + Base64.encodeToString(C14559n.m85693j(string5), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i)), 2));
        if (!TextUtils.isEmpty(string7)) {
            stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string7)), 2));
        }
        if (!TextUtils.isEmpty(string8)) {
            stringBuffer.append("&mini_program_path=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string8)), 2));
        }
        if (!TextUtils.isEmpty(string9)) {
            stringBuffer.append("&mini_program_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string9)), 2));
        }
        if (!TextUtils.isEmpty(string6)) {
            stringBuffer.append("&share_to_qq_ark_info=" + Base64.encodeToString(C14559n.m85693j(string6), 2));
        }
        if (!TextUtils.isEmpty(string10)) {
            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(C14559n.m85693j(string10), 2));
        }
        stringBuffer.append("&cflag=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i2)), 2));
        stringBuffer.append("&third_sd=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(false)), 2));
        SLog.m85496v("openSDK_LOG.QQShare", "doShareToQQ -- url: " + stringBuffer.toString());
        C13966a.m83169a(C14553h.m85587a(), this.f58031c, "requireApi", "shareToNativeQQ");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, C14559n.m85650a(this.f58031c.getOpenId(), i2 == 1 ? Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE : Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, "3", Constants.VIA_SHARE_TO_QQ, this.f58031c.getAppId(), this.mViaShareQQType, "", "", "0", "1", "0"));
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        if (C14559n.m85685f(activity, "4.6.0")) {
            SLog.m85492i("openSDK_LOG.QQShare", "doShareToQQ, qqver below 4.6.");
            UIListenerManager.getInstance().setListenerWithRequestcode(11103, iUiListener);
            m83331a(activity, intent, 11103);
        } else {
            SLog.m85492i("openSDK_LOG.QQShare", "doShareToQQ, qqver greater than 4.6.");
            if (UIListenerManager.getInstance().setListnerWithAction("shareToQQ", iUiListener) != null) {
                SLog.m85492i("openSDK_LOG.QQShare", "doShareToQQ, last listener is not null, cancel it.");
            }
            m83330a(activity, Constants.REQUEST_QQ_SHARE, intent, true);
        }
        SLog.m85492i("openSDK_LOG.QQShare", "doShareToQQ() --end");
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
    }

    public void shareToQQ(Activity activity, Bundle bundle, IUiListener iUiListener) {
        int i;
        String str;
        SLog.m85492i("openSDK_LOG.QQShare", "shareToQQ() -- start.");
        if (C13965a.m83167a("openSDK_LOG.QQShare", iUiListener)) {
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
        SLog.m85492i("openSDK_LOG.QQShare", "shareToQQ -- type: " + i2);
        if (i2 == 1) {
            this.mViaShareQQType = "1";
        } else if (i2 == 2) {
            this.mViaShareQQType = "3";
        } else if (i2 == 5) {
            this.mViaShareQQType = "2";
        } else if (i2 == 7) {
            this.mViaShareQQType = Constants.VIA_SHARE_TYPE_MINI_PROGRAM;
        }
        if (!C14559n.m85660a() && C14559n.m85685f(activity, "4.5.0")) {
            iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
            SLog.m85490e("openSDK_LOG.QQShare", "shareToQQ sdcard is null--end");
            C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ sdcard is null");
            return;
        }
        if (i2 == 5) {
            if (C14559n.m85685f(activity, "4.3.0")) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_QQ_VERSION_ERROR, null));
                SLog.m85490e("openSDK_LOG.QQShare", "shareToQQ, version below 4.3 is not support.");
                C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, version below 4.3 is not support.");
                return;
            } else if (!C14559n.m85692i(string5)) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                SLog.m85490e("openSDK_LOG.QQShare", "shareToQQ -- error: 非法的图片地址!");
                C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR);
                return;
            }
        }
        if (i2 != 5) {
            i = 7;
            if (i2 != 7) {
                if (TextUtils.isEmpty(string4) || !(string4.startsWith("http://") || string4.startsWith("https://"))) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_ERROR, null));
                    SLog.m85490e("openSDK_LOG.QQShare", "shareToQQ, targetUrl is empty or illegal..");
                    C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, targetUrl is empty or illegal..");
                    return;
                } else {
                    if (TextUtils.isEmpty(string2)) {
                        iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_TITLE_NULL_ERROR, null));
                        SLog.m85490e("openSDK_LOG.QQShare", "shareToQQ, title is empty.");
                        C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, title is empty.");
                        return;
                    }
                    i = 7;
                }
            }
        } else {
            i = 7;
        }
        if (i2 == i) {
            if (TextUtils.isEmpty(string6) || TextUtils.isEmpty(string7) || TextUtils.isEmpty(string4) || TextUtils.isEmpty(this.f58031c.getAppId())) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid || path || url empty."));
                return;
            }
            if (C14557l.m85628c(activity, "8.0.8") < 0 && C14557l.m85631d(activity, "3.1") < 0) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_QQ_VERSION_ERROR, "版本过低，不支持分享小程序"));
                return;
            } else if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "title || summary empty."));
                return;
            }
        }
        if (!TextUtils.isEmpty(string) && !string.startsWith("http://") && !string.startsWith("https://") && !new File(string).exists()) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
            SLog.m85490e("openSDK_LOG.QQShare", "shareToQQ, image url is emprty or illegal.");
            C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, image url is emprty or illegal.");
            return;
        }
        if (TextUtils.isEmpty(string2) || string2.length() <= 128) {
            str = null;
        } else {
            str = null;
            bundle.putString("title", C14559n.m85654a(string2, 128, (String) null, (String) null));
        }
        if (!TextUtils.isEmpty(string3) && string3.length() > 512) {
            bundle.putString("summary", C14559n.m85654a(string3, 512, str, str));
        }
        if (C14559n.m85663a(activity, bundle.getInt("cflag", 0) == 1)) {
            SLog.m85492i("openSDK_LOG.QQShare", "shareToQQ, support share");
            m83349b(activity, bundle, iUiListener);
        } else {
            try {
                SLog.m85498w("openSDK_LOG.QQShare", "shareToQQ, don't support share, will show download dialog");
                new TDialog(activity, "", m83329a(""), null, this.f58031c).show();
            } catch (RuntimeException e) {
                SLog.m85491e("openSDK_LOG.QQShare", " shareToQQ, TDialog.show not in main thread", e);
                iUiListener.onError(new UiError(-6, Constants.MSG_NOT_CALL_ON_MAIN_THREAD, null));
            }
        }
        SLog.m85492i("openSDK_LOG.QQShare", "shareToQQ() -- end.");
    }
}
