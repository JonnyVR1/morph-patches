package com.tencent.open.miniapp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.connect.C13802a;
import com.tencent.connect.auth.C13812c;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.TDialog;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14394l;
import com.tencent.open.utils.C14396n;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MiniApp extends BaseApi {
    public static final int MINIAPP_CONTEXT_NULL = -6;
    public static final int MINIAPP_ID_EMPTY = -1;
    public static final int MINIAPP_ID_NOT_DIGIT = -4;
    public static final int MINIAPP_SHOULD_DOWNLOAD = -2;
    public static final String MINIAPP_SRC_ID = "21";
    public static final int MINIAPP_SRC_ID_NOT_DIGIT = -3;
    public static final int MINIAPP_SUCCESS = 0;
    public static final String MINIAPP_TYPE_NORMAL = "mini_program_or_game";
    public static final int MINIAPP_UNKNOWN_TYPE = -5;
    public static final String MINIAPP_VERSION_DEVELOP = "develop";
    public static final String MINIAPP_VERSION_RELEASE = "release";
    public static final int MINIAPP_VERSION_WRONG = -7;
    public static final String MINIAPP_VERSION_TRIAL = "trial";
    public static final List<String> OPEN_CONNECT_DEMO_MINI_APP_VERSIONS = Arrays.asList("develop", MINIAPP_VERSION_TRIAL, "release");

    public MiniApp(Context context, C13812c c13812c, QQToken qQToken) {
        super(c13812c, qQToken);
    }

    public int startMiniApp(Activity activity, String str, String str2, String str3, String str4, String str5) {
        if (C13802a.m81984a("openSDK_LOG.MiniApp", null)) {
            return -5;
        }
        if (activity == null) {
            SLog.m84309i("openSDK_LOG.MiniApp", "Result is MINIAPP_CONTEXT_NULL : -6");
            return -6;
        }
        if (!MINIAPP_TYPE_NORMAL.equals(str)) {
            SLog.m84309i("openSDK_LOG.MiniApp", "Result is MINIAPP_UNKNOWN_TYPE : -5");
            return -5;
        }
        if (TextUtils.isEmpty(str2)) {
            SLog.m84309i("openSDK_LOG.MiniApp", "Result is MINIAPP_ID_EMPTY : -1");
            return -1;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!Character.isDigit(str2.charAt(i))) {
                SLog.m84309i("openSDK_LOG.MiniApp", "Result is MINIAPP_ID_NOT_DIGIT : -4");
                return -4;
            }
        }
        String str6 = str4 == null ? "" : str4;
        if (!OPEN_CONNECT_DEMO_MINI_APP_VERSIONS.contains(str5)) {
            SLog.m84309i("openSDK_LOG.MiniApp", "Result is MINIAPP_VERSION_WRONG : -7");
            return -7;
        }
        if (!C14396n.m84498e(activity)) {
            try {
                new TDialog(activity, "", m82146a(""), null, this.f57183c).show();
            } catch (RuntimeException e) {
                SLog.m84307e("openSDK_LOG.MiniApp", "Show download dialog exception:" + e.getMessage());
            }
            SLog.m84309i("openSDK_LOG.MiniApp", "Result is MINIAPP_SHOULD_DOWNLOAD : -2");
            return -2;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.tencent.mobileqq");
        intent.setData(Uri.parse(String.format("mqqapi://connect_miniapp/launch?app_type=%1$s&mini_app_id=%2$s&version=1&src_type=app&app_name=%3$s&app_id=%4$s&src_id=%5$s&mini_app_path=%6$s&mini_app_type=%7$s&open_id=%8$s", str, str2, C14396n.m84511k(C14394l.m84433a((Context) activity)), C14396n.m84511k(this.f57183c.getAppId()), str3, C14396n.m84511k(str6), C14396n.m84511k(str5), C14396n.m84511k(this.f57183c.getOpenId()))));
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        try {
            try {
                activity.startActivity(intent);
                SLog.m84309i("openSDK_LOG.MiniApp", "Result is MINIAPP_SUCCESS : 0");
                return 0;
            } catch (RuntimeException e2) {
                e = e2;
                SLog.m84307e("openSDK_LOG.MiniApp", "Show download dialog exception:" + e.getMessage());
                SLog.m84309i("openSDK_LOG.MiniApp", "QQ is not installed, Result is MINIAPP_SHOULD_DOWNLOAD : -2");
                return -2;
            }
        } catch (ActivityNotFoundException unused) {
            try {
                new TDialog(activity, "", m82146a(""), null, this.f57183c).show();
            } catch (RuntimeException e3) {
                e = e3;
                SLog.m84307e("openSDK_LOG.MiniApp", "Show download dialog exception:" + e.getMessage());
                SLog.m84309i("openSDK_LOG.MiniApp", "QQ is not installed, Result is MINIAPP_SHOULD_DOWNLOAD : -2");
                return -2;
            }
            SLog.m84309i("openSDK_LOG.MiniApp", "QQ is not installed, Result is MINIAPP_SHOULD_DOWNLOAD : -2");
            return -2;
        }
    }

    public MiniApp(Context context, QQToken qQToken) {
        super(qQToken);
    }

    public MiniApp(QQToken qQToken) {
        super(qQToken);
    }
}
