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
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14559n;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class QzoneShare extends BaseApi {
    public static final String SHARE_TO_QQ_APP_NAME = "appName";
    public static final String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final String SHARE_TO_QQ_SITE = "site";
    public static final String SHARE_TO_QQ_SUMMARY = "summary";
    public static final String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final String SHARE_TO_QQ_TITLE = "title";
    public static final String SHARE_TO_QZONE_EXTMAP = "extMap";
    public static final String SHARE_TO_QZONE_KEY_TYPE = "req_type";
    public static final int SHARE_TO_QZONE_TYPE_IMAGE = 5;
    public static final int SHARE_TO_QZONE_TYPE_IMAGE_TEXT = 1;
    public static final int SHARE_TO_QZONE_TYPE_MINI_PROGRAM = 7;
    public static final int SHARE_TO_QZONE_TYPE_NO_TYPE = 0;

    /* JADX INFO: renamed from: a */
    private boolean f58061a;

    /* JADX INFO: renamed from: d */
    private boolean f58062d;

    /* JADX INFO: renamed from: e */
    private boolean f58063e;

    /* JADX INFO: renamed from: f */
    private boolean f58064f;
    public String mViaShareQzoneType;

    public QzoneShare(Context context, QQToken qQToken) {
        super(qQToken);
        this.mViaShareQzoneType = "";
        this.f58061a = true;
        this.f58062d = false;
        this.f58063e = false;
        this.f58064f = false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00df  */
    /* JADX WARN: Code duplicated, block: B:34:0x013b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0143  */
    /* JADX WARN: Code duplicated, block: B:40:0x0163  */
    /* JADX WARN: Code duplicated, block: B:43:0x0183  */
    /* JADX WARN: Code duplicated, block: B:46:0x019a  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x01da  */
    /* JADX WARN: Code duplicated, block: B:55:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0215  */
    /* JADX WARN: Code duplicated, block: B:59:0x0239  */
    /* JADX WARN: Code duplicated, block: B:62:0x025c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0280  */
    /* JADX WARN: Code duplicated, block: B:68:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:71:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x02df  */
    /* JADX WARN: Code duplicated, block: B:75:0x036d  */
    /* JADX WARN: Code duplicated, block: B:76:0x037f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0390  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0143, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x0163, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x0183, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x019a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x01ba, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x01da, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0239, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x025c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0280, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x02a4, please report this as an issue */
    /* JADX INFO: renamed from: b */
    private void m83357b(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        String str2;
        String appId;
        String openIdWithCache;
        String str3;
        int i;
        int i2;
        Intent intent;
        SLog.m85492i("openSDK_LOG.QzoneShare", "doshareToQzone() --start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_qzone?src_type=app&version=1&file_type=news");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String string = bundle.getString("title");
        String string2 = bundle.getString("summary");
        String string3 = bundle.getString("targetUrl");
        String string4 = bundle.getString("audio_url");
        int i3 = bundle.getInt("req_type", 1);
        String string5 = bundle.getString("appName");
        String string6 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string7 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH);
        String string8 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_TYPE);
        int i4 = bundle.getInt("cflag", 0);
        String string9 = bundle.getString("share_qq_ext_str");
        String string10 = "";
        try {
            Bundle bundle2 = bundle.getBundle("extMap");
            if (bundle2 != null) {
                Set<String> setKeySet = bundle2.keySet();
                JSONObject jSONObject = new JSONObject();
                for (String str4 : setKeySet) {
                    str = string9;
                    try {
                        str2 = string3;
                        try {
                            jSONObject.put(str4, bundle2.get(str4));
                            string3 = str2;
                            string9 = str;
                        } catch (Exception e) {
                            e = e;
                            SLog.m85491e("openSDK_LOG.QzoneShare", "ShareToQzone()  --error parse extmap", e);
                            appId = this.f58031c.getAppId();
                            openIdWithCache = this.f58031c.getOpenIdWithCache();
                            SLog.m85496v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
                            if (stringArrayList != null) {
                                str3 = openIdWithCache;
                            } else {
                                str3 = openIdWithCache;
                            }
                            if (!TextUtils.isEmpty(string)) {
                                stringBuffer.append("&title=" + Base64.encodeToString(C14559n.m85693j(string), 2));
                            }
                            if (!TextUtils.isEmpty(string2)) {
                                stringBuffer.append("&description=" + Base64.encodeToString(C14559n.m85693j(string2), 2));
                            }
                            if (!TextUtils.isEmpty(appId)) {
                                stringBuffer.append("&share_id=" + appId);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                stringBuffer.append("&url=" + Base64.encodeToString(C14559n.m85693j(str2), 2));
                            }
                            if (!TextUtils.isEmpty(string5)) {
                                stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(string5), 2));
                            }
                            if (!C14559n.m85682e(str3)) {
                                stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(str3), 2));
                            }
                            if (C14559n.m85682e(string4)) {
                                i = 2;
                            } else {
                                StringBuilder sb = new StringBuilder("&audioUrl=");
                                i = 2;
                                sb.append(Base64.encodeToString(C14559n.m85693j(string4), 2));
                                stringBuffer.append(sb.toString());
                            }
                            stringBuffer.append("&req_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i3)), i));
                            if (!TextUtils.isEmpty(string6)) {
                                stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string6)), i));
                            }
                            if (!TextUtils.isEmpty(string7)) {
                                stringBuffer.append("&mini_program_path=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string7)), 2));
                            }
                            if (!TextUtils.isEmpty(string8)) {
                                stringBuffer.append("&mini_program_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string8)), 2));
                            }
                            if (!C14559n.m85682e(str)) {
                                stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(C14559n.m85693j(str), 2));
                            }
                            if (TextUtils.isEmpty(string10)) {
                                i2 = 2;
                            } else {
                                StringBuilder sb2 = new StringBuilder("&share_qzone_ext_str=");
                                i2 = 2;
                                sb2.append(Base64.encodeToString(C14559n.m85693j(string10), 2));
                                stringBuffer.append(sb2.toString());
                            }
                            stringBuffer.append("&cflag=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i4)), i2));
                            SLog.m85496v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
                            C13966a.m83169a(C14553h.m85587a(), this.f58031c, "requireApi", "shareToNativeQQ");
                            intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(stringBuffer.toString()));
                            intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                            intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, C14559n.m85650a(this.f58031c.getOpenId(), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, "3", Constants.VIA_SHARE_TO_QZONE, this.f58031c.getAppId(), this.mViaShareQzoneType, "", "", "0", "1", "0"));
                            if (C14559n.m85688g(activity, "4.6.0")) {
                                UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_QZSHARE, iUiListener);
                                m83331a(activity, intent, Constants.REQUEST_OLD_QZSHARE);
                                SLog.m85492i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
                            } else {
                                SLog.m85492i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
                                if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                                    SLog.m85492i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
                                }
                                m83330a(activity, Constants.REQUEST_QZONE_SHARE, intent, false);
                            }
                            SLog.m85492i(SLog.TAG, "doShareToQzone() --end");
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = string3;
                        SLog.m85491e("openSDK_LOG.QzoneShare", "ShareToQzone()  --error parse extmap", e);
                        appId = this.f58031c.getAppId();
                        openIdWithCache = this.f58031c.getOpenIdWithCache();
                        SLog.m85496v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
                        if (stringArrayList != null) {
                            str3 = openIdWithCache;
                        } else {
                            str3 = openIdWithCache;
                        }
                        if (!TextUtils.isEmpty(string)) {
                            stringBuffer.append("&title=" + Base64.encodeToString(C14559n.m85693j(string), 2));
                        }
                        if (!TextUtils.isEmpty(string2)) {
                            stringBuffer.append("&description=" + Base64.encodeToString(C14559n.m85693j(string2), 2));
                        }
                        if (!TextUtils.isEmpty(appId)) {
                            stringBuffer.append("&share_id=" + appId);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            stringBuffer.append("&url=" + Base64.encodeToString(C14559n.m85693j(str2), 2));
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(string5), 2));
                        }
                        if (!C14559n.m85682e(str3)) {
                            stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(str3), 2));
                        }
                        if (C14559n.m85682e(string4)) {
                            StringBuilder sb3 = new StringBuilder("&audioUrl=");
                            i = 2;
                            sb3.append(Base64.encodeToString(C14559n.m85693j(string4), 2));
                            stringBuffer.append(sb3.toString());
                        } else {
                            i = 2;
                        }
                        stringBuffer.append("&req_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i3)), i));
                        if (!TextUtils.isEmpty(string6)) {
                            stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string6)), i));
                        }
                        if (!TextUtils.isEmpty(string7)) {
                            stringBuffer.append("&mini_program_path=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string7)), 2));
                        }
                        if (!TextUtils.isEmpty(string8)) {
                            stringBuffer.append("&mini_program_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string8)), 2));
                        }
                        if (!C14559n.m85682e(str)) {
                            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(C14559n.m85693j(str), 2));
                        }
                        if (TextUtils.isEmpty(string10)) {
                            StringBuilder sb4 = new StringBuilder("&share_qzone_ext_str=");
                            i2 = 2;
                            sb4.append(Base64.encodeToString(C14559n.m85693j(string10), 2));
                            stringBuffer.append(sb4.toString());
                        } else {
                            i2 = 2;
                        }
                        stringBuffer.append("&cflag=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i4)), i2));
                        SLog.m85496v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
                        C13966a.m83169a(C14553h.m85587a(), this.f58031c, "requireApi", "shareToNativeQQ");
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(stringBuffer.toString()));
                        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                        intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, C14559n.m85650a(this.f58031c.getOpenId(), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, "3", Constants.VIA_SHARE_TO_QZONE, this.f58031c.getAppId(), this.mViaShareQzoneType, "", "", "0", "1", "0"));
                        if (C14559n.m85688g(activity, "4.6.0")) {
                            UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_QZSHARE, iUiListener);
                            m83331a(activity, intent, Constants.REQUEST_OLD_QZSHARE);
                            SLog.m85492i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
                        } else {
                            SLog.m85492i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
                            if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                                SLog.m85492i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
                            }
                            m83330a(activity, Constants.REQUEST_QZONE_SHARE, intent, false);
                        }
                        SLog.m85492i(SLog.TAG, "doShareToQzone() --end");
                    }
                }
                str = string9;
                str2 = string3;
                if (setKeySet.size() > 0) {
                    string10 = jSONObject.toString();
                }
            } else {
                str = string9;
                str2 = string3;
            }
        } catch (Exception e3) {
            e = e3;
            str = string9;
        }
        appId = this.f58031c.getAppId();
        openIdWithCache = this.f58031c.getOpenIdWithCache();
        SLog.m85496v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
        if (stringArrayList != null || stringArrayList.size() <= 0) {
            str3 = openIdWithCache;
        } else {
            String str5 = stringArrayList.get(0);
            StringBuilder sb5 = new StringBuilder("&image_url=");
            str3 = openIdWithCache;
            sb5.append(Base64.encodeToString(C14559n.m85693j(URLEncoder.encode(str5)), 2));
            stringBuffer.append(sb5.toString());
            if (!C14559n.m85690h(str5)) {
                String strM85655a = C14559n.m85655a(appId, activity, str5, iUiListener);
                if (!TextUtils.isEmpty(strM85655a)) {
                    stringBuffer.append("&image_uri=" + Base64.encodeToString(C14559n.m85693j(URLEncoder.encode(strM85655a)), 2));
                }
            }
        }
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&title=" + Base64.encodeToString(C14559n.m85693j(string), 2));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&description=" + Base64.encodeToString(C14559n.m85693j(string2), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(str2)) {
            stringBuffer.append("&url=" + Base64.encodeToString(C14559n.m85693j(str2), 2));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(string5), 2));
        }
        if (!C14559n.m85682e(str3)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(str3), 2));
        }
        if (C14559n.m85682e(string4)) {
            StringBuilder sb6 = new StringBuilder("&audioUrl=");
            i = 2;
            sb6.append(Base64.encodeToString(C14559n.m85693j(string4), 2));
            stringBuffer.append(sb6.toString());
        } else {
            i = 2;
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i3)), i));
        if (!TextUtils.isEmpty(string6)) {
            stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string6)), i));
        }
        if (!TextUtils.isEmpty(string7)) {
            stringBuffer.append("&mini_program_path=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string7)), 2));
        }
        if (!TextUtils.isEmpty(string8)) {
            stringBuffer.append("&mini_program_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(string8)), 2));
        }
        if (!C14559n.m85682e(str)) {
            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(C14559n.m85693j(str), 2));
        }
        if (TextUtils.isEmpty(string10)) {
            StringBuilder sb7 = new StringBuilder("&share_qzone_ext_str=");
            i2 = 2;
            sb7.append(Base64.encodeToString(C14559n.m85693j(string10), 2));
            stringBuffer.append(sb7.toString());
        } else {
            i2 = 2;
        }
        stringBuffer.append("&cflag=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i4)), i2));
        SLog.m85496v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
        C13966a.m83169a(C14553h.m85587a(), this.f58031c, "requireApi", "shareToNativeQQ");
        intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, C14559n.m85650a(this.f58031c.getOpenId(), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, "3", Constants.VIA_SHARE_TO_QZONE, this.f58031c.getAppId(), this.mViaShareQzoneType, "", "", "0", "1", "0"));
        if (C14559n.m85688g(activity, "4.6.0")) {
            UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_QZSHARE, iUiListener);
            m83331a(activity, intent, Constants.REQUEST_OLD_QZSHARE);
            SLog.m85492i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
        } else {
            SLog.m85492i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
            if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                SLog.m85492i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
            }
            m83330a(activity, Constants.REQUEST_QZONE_SHARE, intent, false);
        }
        SLog.m85492i(SLog.TAG, "doShareToQzone() --end");
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
    }

    /* JADX WARN: Code duplicated, block: B:109:0x034f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0353  */
    /* JADX WARN: Code duplicated, block: B:115:0x0392  */
    /* JADX WARN: Code duplicated, block: B:116:0x039c  */
    /* JADX WARN: Code duplicated, block: B:135:0x041c  */
    /* JADX WARN: Code duplicated, block: B:59:0x01db  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0218  */
    /* JADX WARN: Code duplicated, block: B:65:0x021e  */
    /* JADX WARN: Code duplicated, block: B:69:0x025b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0265  */
    /* JADX WARN: Code duplicated, block: B:78:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:80:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x02df  */
    public void shareToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        SLog.m85492i("openSDK_LOG.QzoneShare", "shareToQzone() -- start");
        if (C13965a.m83167a("openSDK_LOG.QzoneShare", iUiListener)) {
            return;
        }
        if (bundle == null) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_NULL_ERROR, null));
            SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() params is null");
            C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_NULL_ERROR);
            return;
        }
        String string = bundle.getString("title");
        String string2 = bundle.getString("summary");
        String string3 = bundle.getString("targetUrl");
        String string4 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string5 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String strM85652a = C14559n.m85652a(activity);
        if (strM85652a == null) {
            strM85652a = bundle.getString("appName");
            str = string3;
        } else {
            str = string3;
            if (strM85652a.length() > 20) {
                strM85652a = strM85652a.substring(0, 20).concat("...");
            }
        }
        int i = bundle.getInt("req_type");
        SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() get SHARE_TO_QZONE_KEY_TYPE: " + i);
        if (i == 1 || i != 5) {
            this.mViaShareQzoneType = "1";
        } else {
            this.mViaShareQzoneType = "2";
        }
        if (i != 1) {
            if (i == 5) {
                iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
                SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() error--end请选择支持的分享类型");
                C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 请选择支持的分享类型");
                return;
            }
            if (i != 7) {
                if (C14559n.m85682e(string) && C14559n.m85682e(string2)) {
                    if (stringArrayList == null || stringArrayList.size() == 0) {
                        str5 = "来自" + strM85652a + "的分享";
                        this.f58061a = true;
                    } else {
                        this.f58061a = false;
                    }
                    this.f58062d = false;
                    SLog.m85490e("openSDK_LOG.QzoneShare", "-->shareToQzone, default needTitle = true, shareType = " + i);
                    this.f58063e = true;
                    this.f58064f = false;
                    i = i;
                    str2 = str5;
                } else {
                    this.f58061a = true;
                }
                str5 = string;
                this.f58062d = false;
                SLog.m85490e("openSDK_LOG.QzoneShare", "-->shareToQzone, default needTitle = true, shareType = " + i);
                this.f58063e = true;
                this.f58064f = false;
                i = i;
                str2 = str5;
            } else {
                if (TextUtils.isEmpty(string4) || TextUtils.isEmpty(string5)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid or path empty."));
                }
                this.f58063e = false;
                this.f58064f = false;
                this.f58061a = false;
            }
            if (C14559n.m85660a() && C14559n.m85688g(activity, "4.5.0")) {
                iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
                SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() sdcard is null--end");
                C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_NOSD_ERROR);
                return;
            }
            if (this.f58061a) {
                if (TextUtils.isEmpty(str)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_NULL_ERROR, null));
                    SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
                    C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_NULL_ERROR);
                    return;
                } else if (!C14559n.m85690h(str)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_ERROR, null));
                    SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
                    C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_ERROR);
                    return;
                }
            }
            if (this.f58062d) {
                bundle.putString("title", "");
                bundle.putString("summary", "");
                str3 = "";
            } else {
                if (!this.f58063e && C14559n.m85682e(str2)) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_TITLE_NULL_ERROR, null));
                    SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() title is null--end");
                    C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() title is null");
                    return;
                }
                if (C14559n.m85682e(str2)) {
                    str3 = "";
                } else {
                    str3 = "";
                    if (str2.length() > 200) {
                        str4 = null;
                        bundle.putString("title", C14559n.m85654a(str2, 200, (String) null, (String) null));
                    }
                    if (!C14559n.m85682e(string2) && string2.length() > 600) {
                        bundle.putString("summary", C14559n.m85654a(string2, 600, str4, str4));
                    }
                }
                str4 = null;
                if (!C14559n.m85682e(string2)) {
                    bundle.putString("summary", C14559n.m85654a(string2, 600, str4, str4));
                }
            }
            if (!TextUtils.isEmpty(strM85652a)) {
                bundle.putString("appName", strM85652a);
            }
            if (stringArrayList == null && stringArrayList.size() != 0) {
                int i2 = 0;
                while (i2 < stringArrayList.size()) {
                    String str6 = stringArrayList.get(i2);
                    if (!C14559n.m85690h(str6) && !C14559n.m85692i(str6)) {
                        stringArrayList.remove(i2);
                        i2--;
                    }
                    i2++;
                }
                if (stringArrayList.size() == 0) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                    SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end");
                    C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 非法的图片地址!");
                    return;
                }
                bundle.putStringArrayList("imageUrl", stringArrayList);
            } else if (this.f58064f) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
                SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
                C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
                return;
            }
            if (!C14559n.m85688g(activity, "4.6.0")) {
                SLog.m85492i("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
                m83357b(activity, bundle, iUiListener);
            } else if (C14557l.m85628c(activity, "4.2.0") >= 0 || C14557l.m85628c(activity, "4.6.0") >= 0) {
                SLog.m85498w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
                new TDialog(activity, "", m83329a(str3), null, this.f58031c).show();
            } else {
                SLog.m85498w("openSDK_LOG.QzoneShare", "shareToQzone() qqver between 4.2.0 and 4.6.0, will use qqshare");
                QQShare qQShare = new QQShare(activity, this.f58031c);
                if (stringArrayList != null && stringArrayList.size() > 0) {
                    String str7 = stringArrayList.get(0);
                    if (i == 5 && !C14559n.m85692i(str7)) {
                        iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_MUST_BE_LOCAL, null));
                        SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
                        C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
                        return;
                    }
                    bundle.putString("imageLocalUrl", str7);
                }
                if (!C14559n.m85688g(activity, "4.5.0")) {
                    bundle.putInt("cflag", 1);
                }
                qQShare.shareToQQ(activity, bundle, iUiListener);
            }
            SLog.m85492i("openSDK_LOG.QzoneShare", "shareToQzone() --end");
        }
        i = i;
        SLog.m85490e("openSDK_LOG.QzoneShare", "-->shareToQzone, SHARE_TO_QZONE_TYPE_IMAGE_TEXT needTitle = true");
        this.f58061a = true;
        this.f58062d = false;
        this.f58063e = true;
        this.f58064f = false;
        str2 = string;
        if (C14559n.m85660a()) {
        }
        if (this.f58061a) {
            if (TextUtils.isEmpty(str)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_NULL_ERROR, null));
                SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
                C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_NULL_ERROR);
                return;
            } else if (!C14559n.m85690h(str)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_ERROR, null));
                SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
                C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_ERROR);
                return;
            }
        }
        if (this.f58062d) {
            bundle.putString("title", "");
            bundle.putString("summary", "");
            str3 = "";
        } else {
            if (!this.f58063e) {
            }
            if (C14559n.m85682e(str2)) {
                str3 = "";
                if (str2.length() > 200) {
                    str4 = null;
                    bundle.putString("title", C14559n.m85654a(str2, 200, (String) null, (String) null));
                }
                if (!C14559n.m85682e(string2)) {
                    bundle.putString("summary", C14559n.m85654a(string2, 600, str4, str4));
                }
            } else {
                str3 = "";
            }
            str4 = null;
            if (!C14559n.m85682e(string2)) {
                bundle.putString("summary", C14559n.m85654a(string2, 600, str4, str4));
            }
        }
        if (!TextUtils.isEmpty(strM85652a)) {
            bundle.putString("appName", strM85652a);
        }
        if (stringArrayList == null) {
            if (this.f58064f) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
                SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
                C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
                return;
            }
        } else if (this.f58064f) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
            SLog.m85490e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
            C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
            return;
        }
        if (!C14559n.m85688g(activity, "4.6.0")) {
            SLog.m85492i("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
            m83357b(activity, bundle, iUiListener);
        } else if (C14557l.m85628c(activity, "4.2.0") >= 0) {
            SLog.m85498w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
            new TDialog(activity, "", m83329a(str3), null, this.f58031c).show();
        } else {
            SLog.m85498w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
            new TDialog(activity, "", m83329a(str3), null, this.f58031c).show();
        }
        SLog.m85492i("openSDK_LOG.QzoneShare", "shareToQzone() --end");
    }
}
