package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.tencent.connect.C13965a;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14559n;
import com.tencent.tauth.IUiListener;

/* JADX INFO: loaded from: classes12.dex */
public class QQAvatar extends BaseApi {
    public static final String FROM_SDK_AVATAR_SET_IMAGE = "FROM_SDK_AVATAR_SET_IMAGE";

    /* JADX INFO: renamed from: a */
    private IUiListener f58000a;

    public QQAvatar(QQToken qQToken) {
        super(qQToken);
    }

    /* JADX INFO: renamed from: a */
    private void m83310a(Bundle bundle) {
        QQToken qQToken = this.f58031c;
        if (qQToken != null) {
            bundle.putString("appid", qQToken.getAppId());
            if (this.f58031c.isSessionValid()) {
                bundle.putString(Constants.PARAM_KEY_STR, this.f58031c.getAccessToken());
                bundle.putString(Constants.PARAM_KEY_TYPE, "0x80");
            }
            String openId = this.f58031c.getOpenId();
            if (openId != null) {
                bundle.putString("hopenid", openId);
            }
            bundle.putString("platform", "androidqz");
            try {
                bundle.putString(Constants.PARAM_PLATFORM_ID, C14553h.m85587a().getSharedPreferences(Constants.PREFERENCE_PF, 0).getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
            } catch (Exception e) {
                e.printStackTrace();
                bundle.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
            }
        }
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
    }

    public void setAvatar(Activity activity, Uri uri, IUiListener iUiListener, int i) {
        if (C13965a.m83167a("QQAvatar", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f58000a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f58000a = iUiListener;
        Bundle bundle = new Bundle();
        bundle.putString("picture", uri.toString());
        bundle.putInt("exitAnim", i);
        bundle.putString("appid", this.f58031c.getAppId());
        bundle.putString("access_token", this.f58031c.getAccessToken());
        bundle.putLong("expires_in", this.f58031c.getExpireTimeInSecond());
        bundle.putString("openid", this.f58031c.getOpenId());
        Intent intentM83308a = m83308a(activity);
        Bundle bundleM85648a = C14559n.m85648a(this.f58031c.getOpenId(), Constants.VIA_SET_AVATAR, Constants.VIA_REPORT_TYPE_SET_AVATAR, "18", this.f58031c.getAppId());
        intentM83308a.putExtra(Constants.KEY_PASS_REPORT_VIA_TIMELY, true);
        intentM83308a.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, bundleM85648a);
        m83309a(activity, bundle, intentM83308a);
    }

    public void setAvatarByQQ(Activity activity, Uri uri, IUiListener iUiListener) {
        if (C13965a.m83167a("QQAvatar", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f58000a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f58000a = iUiListener;
        if (!C14557l.m85626b(activity)) {
            Toast.makeText(activity.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", 1).show();
            return;
        }
        if (C14557l.m85628c(activity, "8.0.0") < 0) {
            Toast.makeText(activity.getApplicationContext(), "当前手机QQ版本过低，不支持设置头像功能。", 1).show();
            return;
        }
        String strM85652a = C14559n.m85652a(activity);
        StringBuffer stringBuffer = new StringBuffer("mqqapi://profile/sdk_avatar_edit?");
        if (!TextUtils.isEmpty(strM85652a)) {
            if (strM85652a.length() > 20) {
                strM85652a = strM85652a.substring(0, 20).concat("...");
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(strM85652a), 2));
        }
        String appId = this.f58031c.getAppId();
        String openId = this.f58031c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(openId), 2));
        }
        String strM85669b = C14559n.m85669b(activity, uri);
        if (!TextUtils.isEmpty(strM85669b)) {
            try {
                activity.grantUriPermission("com.tencent.mobileqq", uri, 3);
                stringBuffer.append("&set_uri=" + Base64.encodeToString(C14559n.m85693j(uri.toString()), 2));
            } catch (Exception e) {
                SLog.m85491e("QQAvatar", "Exception", e);
            }
        }
        if (!TextUtils.isEmpty(strM85669b)) {
            stringBuffer.append("&set_path=" + Base64.encodeToString(C14559n.m85693j(strM85669b), 2));
        }
        stringBuffer.append("&sdk_version=" + Base64.encodeToString(C14559n.m85693j(Constants.SDK_VERSION), 2));
        SLog.m85496v("QQAVATAR", "-->set avatar, url: " + stringBuffer.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.tencent.mobileqq");
        intent.putExtra("FROM_WHERE", FROM_SDK_AVATAR_SET_IMAGE);
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.setData(Uri.parse(stringBuffer.toString()));
        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_EDIT_AVATAR, iUiListener);
        m83330a(activity, Constants.REQUEST_EDIT_AVATAR, intent, false);
    }

    public void setDynamicAvatar(Activity activity, Uri uri, IUiListener iUiListener) {
        if (C13965a.m83167a("QQAvatar", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f58000a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f58000a = iUiListener;
        if (!C14557l.m85626b(activity)) {
            Toast.makeText(activity.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", 1).show();
            return;
        }
        if (C14557l.m85628c(activity, "8.0.5") < 0) {
            Toast.makeText(activity.getApplicationContext(), "当前手机QQ版本过低，不支持设置头像功能。", 1).show();
            return;
        }
        String strM85652a = C14559n.m85652a(activity);
        StringBuffer stringBuffer = new StringBuffer("mqqapi://profile/sdk_dynamic_avatar_edit?");
        if (!TextUtils.isEmpty(strM85652a)) {
            if (strM85652a.length() > 20) {
                strM85652a = strM85652a.substring(0, 20).concat("...");
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(strM85652a), 2));
        }
        String appId = this.f58031c.getAppId();
        String openId = this.f58031c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(openId), 2));
        }
        String strM85669b = C14559n.m85669b(activity, uri);
        if (!TextUtils.isEmpty(strM85669b)) {
            try {
                activity.grantUriPermission("com.tencent.mobileqq", uri, 3);
                stringBuffer.append("&video_uri=");
                stringBuffer.append(Base64.encodeToString(C14559n.m85693j(uri.toString()), 2));
            } catch (Exception e) {
                SLog.m85491e("QQAvatar", "Exception", e);
            }
        }
        if (!TextUtils.isEmpty(strM85669b)) {
            stringBuffer.append("&video_path=" + Base64.encodeToString(C14559n.m85693j(strM85669b), 2));
        }
        stringBuffer.append("&sdk_version=" + Base64.encodeToString(C14559n.m85693j(Constants.SDK_VERSION), 2));
        SLog.m85496v("QQAVATAR", "-->set dynamic avatar, url: " + stringBuffer.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.tencent.mobileqq");
        intent.putExtra("FROM_WHERE", FROM_SDK_AVATAR_SET_IMAGE);
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.setData(Uri.parse(stringBuffer.toString()));
        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_EDIT_DYNAMIC_AVATAR, iUiListener);
        m83330a(activity, Constants.REQUEST_EDIT_DYNAMIC_AVATAR, intent, false);
    }

    /* JADX INFO: renamed from: a */
    private void m83309a(Activity activity, Bundle bundle, Intent intent) {
        m83310a(bundle);
        intent.putExtra(Constants.KEY_ACTION, "action_avatar");
        intent.putExtra(Constants.KEY_PARAMS, bundle);
        UIListenerManager.getInstance().setListenerWithRequestcode(11102, this.f58000a);
        m83331a(activity, intent, 11102);
    }

    /* JADX INFO: renamed from: a */
    private Intent m83308a(Activity activity) {
        Intent intent = new Intent();
        intent.setClass(activity, ImageActivity.class);
        return intent;
    }
}
