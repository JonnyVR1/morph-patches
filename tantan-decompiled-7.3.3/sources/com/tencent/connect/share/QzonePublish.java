package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.C13965a;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.p082a.C13966a;
import com.tencent.open.TDialog;
import com.tencent.open.log.SLog;
import com.tencent.open.p110b.C14526e;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14559n;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class QzonePublish extends BaseApi {
    public static final String HULIAN_CALL_BACK = "hulian_call_back";
    public static final String HULIAN_EXTRA_SCENE = "hulian_extra_scene";
    public static final String PUBLISH_TO_QZONE_APP_NAME = "appName";
    public static final String PUBLISH_TO_QZONE_EXTMAP = "extMap";
    public static final String PUBLISH_TO_QZONE_IMAGE_URL = "imageUrl";
    public static final String PUBLISH_TO_QZONE_KEY_TYPE = "req_type";
    public static final String PUBLISH_TO_QZONE_SUMMARY = "summary";
    public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHMOOD = 3;
    public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO = 4;
    public static final String PUBLISH_TO_QZONE_VIDEO_DURATION = "videoDuration";
    public static final String PUBLISH_TO_QZONE_VIDEO_PATH = "videoPath";
    public static final String PUBLISH_TO_QZONE_VIDEO_SIZE = "videoSize";

    public QzonePublish(Context context, QQToken qQToken) {
        super(qQToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x015e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0163  */
    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x0204  */
    /* JADX WARN: Code duplicated, block: B:60:0x021b  */
    /* JADX WARN: Code duplicated, block: B:63:0x023b  */
    /* JADX WARN: Code duplicated, block: B:66:0x025b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0276  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0163, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0187, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x01e4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0204, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x021b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x023b, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public void m83356b(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        String str2;
        String string;
        String appId;
        String openId;
        String str3;
        int i;
        String strM85655a;
        SLog.m85492i("openSDK_LOG.QzonePublish", "doPublishToQzone() --start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://qzone/publish?src_type=app&version=1&file_type=news");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String string2 = bundle.getString("summary");
        int i2 = bundle.getInt("req_type", 3);
        String string3 = bundle.getString("appName");
        String string4 = bundle.getString(PUBLISH_TO_QZONE_VIDEO_PATH);
        int i3 = bundle.getInt(PUBLISH_TO_QZONE_VIDEO_DURATION);
        long j = bundle.getLong(PUBLISH_TO_QZONE_VIDEO_SIZE);
        String str4 = "";
        try {
            Bundle bundle2 = bundle.getBundle("extMap");
            if (bundle2 != null) {
                Set<String> setKeySet = bundle2.keySet();
                str = string2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    Iterator<String> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        Iterator<String> it2 = it;
                        String next = it.next();
                        if (TextUtils.isEmpty(bundle2.getString(next))) {
                            str2 = string3;
                        } else {
                            str2 = string3;
                            try {
                                jSONObject.put(next, bundle2.getString(next));
                            } catch (Exception e) {
                                e = e;
                                SLog.m85491e("openSDK_LOG.QzonePublish", "publishToQzone()  --error parse extmap", e);
                                appId = this.f58031c.getAppId();
                                openId = this.f58031c.getOpenId();
                                str3 = string;
                                SLog.m85496v("openSDK_LOG.QzonePublish", "openId:" + openId);
                                if (3 != i2) {
                                }
                                if (4 == i2) {
                                    stringBuffer.append("&videoPath=" + Base64.encodeToString(C14559n.m85693j(string4), 2));
                                    strM85655a = C14559n.m85655a(appId, activity, string4, iUiListener);
                                    if (!TextUtils.isEmpty(strM85655a)) {
                                        stringBuffer.append("&videoUri=" + Base64.encodeToString(C14559n.m85693j(strM85655a), 2));
                                    }
                                    stringBuffer.append("&videoDuration=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i3)), 2));
                                    stringBuffer.append("&videoSize=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(j)), 2));
                                    str4 = Constants.VIA_SHARE_TYPE_PUBLISHVIDEO;
                                }
                                String str5 = str4;
                                if (!TextUtils.isEmpty(str)) {
                                    stringBuffer.append("&description=" + Base64.encodeToString(C14559n.m85693j(str), 2));
                                }
                                if (!TextUtils.isEmpty(appId)) {
                                    stringBuffer.append("&share_id=" + appId);
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(str2), 2));
                                }
                                if (!C14559n.m85682e(openId)) {
                                    stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(openId), 2));
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    i = 2;
                                } else {
                                    StringBuilder sb = new StringBuilder("&share_qzone_ext_str=");
                                    i = 2;
                                    sb.append(Base64.encodeToString(C14559n.m85693j(str3), 2));
                                    stringBuffer.append(sb.toString());
                                }
                                stringBuffer.append("&req_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i2)), i));
                                SLog.m85496v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
                                C13966a.m83169a(C14553h.m85587a(), this.f58031c, "requireApi", "shareToNativeQQ");
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setPackage("com.tencent.mobileqq");
                                intent.setData(Uri.parse(stringBuffer.toString()));
                                intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                                intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, C14559n.m85650a(this.f58031c.getOpenId(), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, "3", Constants.VIA_SHARE_TO_QZONE, this.f58031c.getAppId(), str5, "", "", "0", "1", "0"));
                                m83330a(activity, Constants.REQUEST_QZONE_SHARE, intent, false);
                                SLog.m85492i(SLog.TAG, "doPublishToQzone() --end");
                            }
                        }
                        it = it2;
                        string3 = str2;
                    }
                    str2 = string3;
                    string = jSONObject.length() > 0 ? jSONObject.toString() : "";
                } catch (Exception e2) {
                    e = e2;
                    str2 = string3;
                    SLog.m85491e("openSDK_LOG.QzonePublish", "publishToQzone()  --error parse extmap", e);
                    appId = this.f58031c.getAppId();
                    openId = this.f58031c.getOpenId();
                    str3 = string;
                    SLog.m85496v("openSDK_LOG.QzonePublish", "openId:" + openId);
                    if (3 != i2) {
                    }
                    if (4 == i2) {
                        stringBuffer.append("&videoPath=" + Base64.encodeToString(C14559n.m85693j(string4), 2));
                        strM85655a = C14559n.m85655a(appId, activity, string4, iUiListener);
                        if (!TextUtils.isEmpty(strM85655a)) {
                            stringBuffer.append("&videoUri=" + Base64.encodeToString(C14559n.m85693j(strM85655a), 2));
                        }
                        stringBuffer.append("&videoDuration=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i3)), 2));
                        stringBuffer.append("&videoSize=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(j)), 2));
                        str4 = Constants.VIA_SHARE_TYPE_PUBLISHVIDEO;
                    }
                    String str6 = str4;
                    if (!TextUtils.isEmpty(str)) {
                        stringBuffer.append("&description=" + Base64.encodeToString(C14559n.m85693j(str), 2));
                    }
                    if (!TextUtils.isEmpty(appId)) {
                        stringBuffer.append("&share_id=" + appId);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(str2), 2));
                    }
                    if (!C14559n.m85682e(openId)) {
                        stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(openId), 2));
                    }
                    if (TextUtils.isEmpty(str3)) {
                        StringBuilder sb2 = new StringBuilder("&share_qzone_ext_str=");
                        i = 2;
                        sb2.append(Base64.encodeToString(C14559n.m85693j(str3), 2));
                        stringBuffer.append(sb2.toString());
                    } else {
                        i = 2;
                    }
                    stringBuffer.append("&req_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i2)), i));
                    SLog.m85496v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
                    C13966a.m83169a(C14553h.m85587a(), this.f58031c, "requireApi", "shareToNativeQQ");
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setPackage("com.tencent.mobileqq");
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                    intent2.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                    intent2.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, C14559n.m85650a(this.f58031c.getOpenId(), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, "3", Constants.VIA_SHARE_TO_QZONE, this.f58031c.getAppId(), str6, "", "", "0", "1", "0"));
                    m83330a(activity, Constants.REQUEST_QZONE_SHARE, intent2, false);
                    SLog.m85492i(SLog.TAG, "doPublishToQzone() --end");
                }
                appId = this.f58031c.getAppId();
                openId = this.f58031c.getOpenId();
                str3 = string;
                SLog.m85496v("openSDK_LOG.QzonePublish", "openId:" + openId);
                if (3 != i2 && stringArrayList != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    StringBuffer stringBuffer3 = new StringBuffer();
                    int size = stringArrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        int i5 = size;
                        stringBuffer2.append(URLEncoder.encode(stringArrayList.get(i4)));
                        String strM85655a2 = C14559n.m85655a(appId, activity, stringArrayList.get(i4), iUiListener);
                        if (!TextUtils.isEmpty(strM85655a2)) {
                            stringBuffer3.append(URLEncoder.encode(strM85655a2));
                        }
                        if (i4 != i5 - 1) {
                            stringBuffer2.append(com.meituan.robust.Constants.PACKNAME_END);
                            stringBuffer3.append(com.meituan.robust.Constants.PACKNAME_END);
                        }
                        i4++;
                        size = i5;
                    }
                    stringBuffer.append("&image_url=" + Base64.encodeToString(C14559n.m85693j(stringBuffer2.toString()), 2));
                    if (!TextUtils.isEmpty(stringBuffer3.toString())) {
                        stringBuffer.append("&image_uri=" + Base64.encodeToString(C14559n.m85693j(stringBuffer3.toString()), 2));
                    }
                    str4 = "7";
                }
                if (4 == i2) {
                    stringBuffer.append("&videoPath=" + Base64.encodeToString(C14559n.m85693j(string4), 2));
                    strM85655a = C14559n.m85655a(appId, activity, string4, iUiListener);
                    if (!TextUtils.isEmpty(strM85655a)) {
                        stringBuffer.append("&videoUri=" + Base64.encodeToString(C14559n.m85693j(strM85655a), 2));
                    }
                    stringBuffer.append("&videoDuration=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i3)), 2));
                    stringBuffer.append("&videoSize=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(j)), 2));
                    str4 = Constants.VIA_SHARE_TYPE_PUBLISHVIDEO;
                }
                String str7 = str4;
                if (!TextUtils.isEmpty(str)) {
                    stringBuffer.append("&description=" + Base64.encodeToString(C14559n.m85693j(str), 2));
                }
                if (!TextUtils.isEmpty(appId)) {
                    stringBuffer.append("&share_id=" + appId);
                }
                if (!TextUtils.isEmpty(str2)) {
                    stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(str2), 2));
                }
                if (!C14559n.m85682e(openId)) {
                    stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(openId), 2));
                }
                if (TextUtils.isEmpty(str3)) {
                    StringBuilder sb3 = new StringBuilder("&share_qzone_ext_str=");
                    i = 2;
                    sb3.append(Base64.encodeToString(C14559n.m85693j(str3), 2));
                    stringBuffer.append(sb3.toString());
                } else {
                    i = 2;
                }
                stringBuffer.append("&req_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i2)), i));
                SLog.m85496v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
                C13966a.m83169a(C14553h.m85587a(), this.f58031c, "requireApi", "shareToNativeQQ");
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setPackage("com.tencent.mobileqq");
                intent3.setData(Uri.parse(stringBuffer.toString()));
                intent3.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                intent3.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, C14559n.m85650a(this.f58031c.getOpenId(), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, "3", Constants.VIA_SHARE_TO_QZONE, this.f58031c.getAppId(), str7, "", "", "0", "1", "0"));
                m83330a(activity, Constants.REQUEST_QZONE_SHARE, intent3, false);
                SLog.m85492i(SLog.TAG, "doPublishToQzone() --end");
            }
            str = string2;
            str2 = string3;
        } catch (Exception e3) {
            e = e3;
            str = string2;
        }
        appId = this.f58031c.getAppId();
        openId = this.f58031c.getOpenId();
        str3 = string;
        SLog.m85496v("openSDK_LOG.QzonePublish", "openId:" + openId);
        if (3 != i2) {
        }
        if (4 == i2) {
            stringBuffer.append("&videoPath=" + Base64.encodeToString(C14559n.m85693j(string4), 2));
            strM85655a = C14559n.m85655a(appId, activity, string4, iUiListener);
            if (!TextUtils.isEmpty(strM85655a)) {
                stringBuffer.append("&videoUri=" + Base64.encodeToString(C14559n.m85693j(strM85655a), 2));
            }
            stringBuffer.append("&videoDuration=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i3)), 2));
            stringBuffer.append("&videoSize=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(j)), 2));
            str4 = Constants.VIA_SHARE_TYPE_PUBLISHVIDEO;
        }
        String str8 = str4;
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append("&description=" + Base64.encodeToString(C14559n.m85693j(str), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(str2)) {
            stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(str2), 2));
        }
        if (!C14559n.m85682e(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(openId), 2));
        }
        if (TextUtils.isEmpty(str3)) {
            StringBuilder sb4 = new StringBuilder("&share_qzone_ext_str=");
            i = 2;
            sb4.append(Base64.encodeToString(C14559n.m85693j(str3), 2));
            stringBuffer.append(sb4.toString());
        } else {
            i = 2;
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(C14559n.m85693j(String.valueOf(i2)), i));
        SLog.m85496v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
        C13966a.m83169a(C14553h.m85587a(), this.f58031c, "requireApi", "shareToNativeQQ");
        Intent intent4 = new Intent("android.intent.action.VIEW");
        intent4.setPackage("com.tencent.mobileqq");
        intent4.setData(Uri.parse(stringBuffer.toString()));
        intent4.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent4.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, C14559n.m85650a(this.f58031c.getOpenId(), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, "3", Constants.VIA_SHARE_TO_QZONE, this.f58031c.getAppId(), str8, "", "", "0", "1", "0"));
        m83330a(activity, Constants.REQUEST_QZONE_SHARE, intent4, false);
        SLog.m85492i(SLog.TAG, "doPublishToQzone() --end");
    }

    public void publishToQzone(final Activity activity, final Bundle bundle, final IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.QzonePublish", "publishToQzone() -- start");
        if (C13965a.m83167a("openSDK_LOG.QzonePublish", iUiListener)) {
            return;
        }
        if (bundle == null) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_NULL_ERROR, null));
            SLog.m85490e("openSDK_LOG.QzonePublish", "-->publishToQzone, params is null");
            C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_NULL_ERROR);
            return;
        }
        if (!C14559n.m85684f(activity)) {
            iUiListener.onError(new UiError(-15, Constants.MSG_PARAM_VERSION_TOO_LOW, null));
            SLog.m85490e("openSDK_LOG.QzonePublish", "-->publishToQzone, this is not support below qq 5.9.5");
            C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publicToQzone, this is not support below qq 5.9.5");
            new TDialog(activity, "", m83329a(""), null, this.f58031c).show();
            return;
        }
        String strM85652a = C14559n.m85652a(activity);
        int i = 0;
        if (strM85652a == null) {
            strM85652a = bundle.getString("appName");
        } else if (strM85652a.length() > 20) {
            strM85652a = strM85652a.substring(0, 20).concat("...");
        }
        if (!TextUtils.isEmpty(strM85652a)) {
            bundle.putString("appName", strM85652a);
        }
        int i2 = bundle.getInt("req_type");
        if (i2 == 3) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
            if (stringArrayList != null && stringArrayList.size() > 0) {
                while (i < stringArrayList.size()) {
                    if (!C14559n.m85692i(stringArrayList.get(i))) {
                        stringArrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                bundle.putStringArrayList("imageUrl", stringArrayList);
            }
            m83356b(activity, bundle, iUiListener);
            SLog.m85492i("openSDK_LOG.QzonePublish", "publishToQzone() --end");
            return;
        }
        if (i2 != 4) {
            iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
            SLog.m85490e("openSDK_LOG.QzonePublish", "publishToQzone() error--end请选择支持的分享类型");
            C14526e.m85448a().m85449a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publishToQzone() 请选择支持的分享类型");
            return;
        }
        final String string = bundle.getString(PUBLISH_TO_QZONE_VIDEO_PATH);
        if (!C14559n.m85692i(string)) {
            SLog.m85490e("openSDK_LOG.QzonePublish", "publishToQzone() video url invalid");
            iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.tencent.connect.share.QzonePublish.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer2) {
                long length = new File(string).length();
                int duration = mediaPlayer2.getDuration();
                bundle.putString(QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH, string);
                bundle.putInt(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, duration);
                bundle.putLong(QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, length);
                QzonePublish.this.m83356b(activity, bundle, iUiListener);
                SLog.m85492i("openSDK_LOG.QzonePublish", "publishToQzone() --end");
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.tencent.connect.share.QzonePublish.2
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer2, int i3, int i4) {
                SLog.m85490e("openSDK_LOG.QzonePublish", "publishToQzone() mediaplayer onError()");
                iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
                return false;
            }
        });
        try {
            mediaPlayer.setDataSource(string);
            mediaPlayer.prepareAsync();
        } catch (Exception unused) {
            SLog.m85490e("openSDK_LOG.QzonePublish", "publishToQzone() exception(s) occurred when preparing mediaplayer");
            iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
        }
    }
}
