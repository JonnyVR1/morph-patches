package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.tencent.connect.C13802a;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14394l;
import com.tencent.open.utils.C14396n;
import com.tencent.tauth.IUiListener;

/* JADX INFO: loaded from: classes13.dex */
public class QQAvatar extends BaseApi {
    public static final String FROM_SDK_AVATAR_SET_IMAGE = "FROM_SDK_AVATAR_SET_IMAGE";

    /* JADX INFO: renamed from: a */
    private IUiListener f57152a;

    public QQAvatar(QQToken qQToken) {
        super(qQToken);
    }

    /* JADX INFO: renamed from: a */
    private void m82127a(Bundle bundle) {
        QQToken qQToken = this.f57183c;
        if (qQToken != null) {
            bundle.putString("appid", qQToken.getAppId());
            if (this.f57183c.isSessionValid()) {
                bundle.putString(Constants.PARAM_KEY_STR, this.f57183c.getAccessToken());
                bundle.putString(Constants.PARAM_KEY_TYPE, "0x80");
            }
            String openId = this.f57183c.getOpenId();
            if (openId != null) {
                bundle.putString("hopenid", openId);
            }
            bundle.putString("platform", "androidqz");
            try {
                bundle.putString(Constants.PARAM_PLATFORM_ID, C14390h.m84404a().getSharedPreferences(Constants.PREFERENCE_PF, 0).getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
            } catch (Exception e) {
                e.printStackTrace();
                bundle.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
            }
        }
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
    }

    public void setAvatar(Activity activity, Uri uri, IUiListener iUiListener, int i) {
        if (C13802a.m81984a("QQAvatar", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f57152a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f57152a = iUiListener;
        Bundle bundle = new Bundle();
        bundle.putString("picture", uri.toString());
        bundle.putInt("exitAnim", i);
        bundle.putString("appid", this.f57183c.getAppId());
        bundle.putString("access_token", this.f57183c.getAccessToken());
        bundle.putLong("expires_in", this.f57183c.getExpireTimeInSecond());
        bundle.putString("openid", this.f57183c.getOpenId());
        Intent intentM82125a = m82125a(activity);
        Bundle bundleM84465a = C14396n.m84465a(this.f57183c.getOpenId(), Constants.VIA_SET_AVATAR, Constants.VIA_REPORT_TYPE_SET_AVATAR, "18", this.f57183c.getAppId());
        intentM82125a.putExtra(Constants.KEY_PASS_REPORT_VIA_TIMELY, true);
        intentM82125a.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, bundleM84465a);
        m82126a(activity, bundle, intentM82125a);
    }

    public void setAvatarByQQ(Activity activity, Uri uri, IUiListener iUiListener) {
        if (C13802a.m81984a("QQAvatar", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f57152a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f57152a = iUiListener;
        if (!C14394l.m84443b(activity)) {
            Toast.makeText(activity.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", 1).show();
            return;
        }
        if (C14394l.m84445c(activity, "8.0.0") < 0) {
            Toast.makeText(activity.getApplicationContext(), "当前手机QQ版本过低，不支持设置头像功能。", 1).show();
            return;
        }
        String strM84469a = C14396n.m84469a(activity);
        StringBuffer stringBuffer = new StringBuffer("mqqapi://profile/sdk_avatar_edit?");
        if (!TextUtils.isEmpty(strM84469a)) {
            if (strM84469a.length() > 20) {
                strM84469a = strM84469a.substring(0, 20).concat("...");
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(C14396n.m84510j(strM84469a), 2));
        }
        String appId = this.f57183c.getAppId();
        String openId = this.f57183c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(C14396n.m84510j(openId), 2));
        }
        String strM84486b = C14396n.m84486b(activity, uri);
        if (!TextUtils.isEmpty(strM84486b)) {
            try {
                activity.grantUriPermission("com.tencent.mobileqq", uri, 3);
                stringBuffer.append("&set_uri=" + Base64.encodeToString(C14396n.m84510j(uri.toString()), 2));
            } catch (Exception e) {
                SLog.m84308e("QQAvatar", "Exception", e);
            }
        }
        if (!TextUtils.isEmpty(strM84486b)) {
            stringBuffer.append("&set_path=" + Base64.encodeToString(C14396n.m84510j(strM84486b), 2));
        }
        stringBuffer.append("&sdk_version=" + Base64.encodeToString(C14396n.m84510j(Constants.SDK_VERSION), 2));
        SLog.m84313v("QQAVATAR", "-->set avatar, url: " + stringBuffer.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.tencent.mobileqq");
        intent.putExtra("FROM_WHERE", FROM_SDK_AVATAR_SET_IMAGE);
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.setData(Uri.parse(stringBuffer.toString()));
        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_EDIT_AVATAR, iUiListener);
        m82147a(activity, Constants.REQUEST_EDIT_AVATAR, intent, false);
    }

    public void setDynamicAvatar(Activity activity, Uri uri, IUiListener iUiListener) {
        if (C13802a.m81984a("QQAvatar", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f57152a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f57152a = iUiListener;
        if (!C14394l.m84443b(activity)) {
            Toast.makeText(activity.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", 1).show();
            return;
        }
        if (C14394l.m84445c(activity, "8.0.5") < 0) {
            Toast.makeText(activity.getApplicationContext(), "当前手机QQ版本过低，不支持设置头像功能。", 1).show();
            return;
        }
        String strM84469a = C14396n.m84469a(activity);
        StringBuffer stringBuffer = new StringBuffer("mqqapi://profile/sdk_dynamic_avatar_edit?");
        if (!TextUtils.isEmpty(strM84469a)) {
            if (strM84469a.length() > 20) {
                strM84469a = strM84469a.substring(0, 20).concat("...");
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(C14396n.m84510j(strM84469a), 2));
        }
        String appId = this.f57183c.getAppId();
        String openId = this.f57183c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(C14396n.m84510j(openId), 2));
        }
        String strM84486b = C14396n.m84486b(activity, uri);
        if (!TextUtils.isEmpty(strM84486b)) {
            try {
                activity.grantUriPermission("com.tencent.mobileqq", uri, 3);
                stringBuffer.append("&video_uri=");
                stringBuffer.append(Base64.encodeToString(C14396n.m84510j(uri.toString()), 2));
            } catch (Exception e) {
                SLog.m84308e("QQAvatar", "Exception", e);
            }
        }
        if (!TextUtils.isEmpty(strM84486b)) {
            stringBuffer.append("&video_path=" + Base64.encodeToString(C14396n.m84510j(strM84486b), 2));
        }
        stringBuffer.append("&sdk_version=" + Base64.encodeToString(C14396n.m84510j(Constants.SDK_VERSION), 2));
        SLog.m84313v("QQAVATAR", "-->set dynamic avatar, url: " + stringBuffer.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.tencent.mobileqq");
        intent.putExtra("FROM_WHERE", FROM_SDK_AVATAR_SET_IMAGE);
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.setData(Uri.parse(stringBuffer.toString()));
        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_EDIT_DYNAMIC_AVATAR, iUiListener);
        m82147a(activity, Constants.REQUEST_EDIT_DYNAMIC_AVATAR, intent, false);
    }

    /* JADX INFO: renamed from: a */
    private void m82126a(Activity activity, Bundle bundle, Intent intent) {
        m82127a(bundle);
        intent.putExtra(Constants.KEY_ACTION, "action_avatar");
        intent.putExtra(Constants.KEY_PARAMS, bundle);
        UIListenerManager.getInstance().setListenerWithRequestcode(11102, this.f57152a);
        m82148a(activity, intent, 11102);
    }

    /* JADX INFO: renamed from: a */
    private Intent m82125a(Activity activity) {
        Intent intent = new Intent();
        intent.setClass(activity, ImageActivity.class);
        return intent;
    }
}
