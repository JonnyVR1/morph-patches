package com.tencent.connect.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.tencent.connect.auth.C13812c;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.TDialog;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14389g;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14394l;
import com.tencent.open.utils.C14396n;
import com.tencent.open.utils.HttpUtils;
import com.tencent.tauth.IRequestListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseApi {
    public static String businessId = null;
    public static String installChannel = null;
    public static boolean isOEM = false;
    public static String registerChannel;

    /* JADX INFO: renamed from: b */
    protected C13812c f57182b;

    /* JADX INFO: renamed from: c */
    protected QQToken f57183c;

    public class TempRequestListener implements IRequestListener {

        /* JADX INFO: renamed from: b */
        private final IUiListener f57185b;

        /* JADX INFO: renamed from: c */
        private final Handler f57186c;

        public TempRequestListener(IUiListener iUiListener) {
            this.f57185b = iUiListener;
            this.f57186c = new Handler(C14390h.m84404a().getMainLooper()) { // from class: com.tencent.connect.common.BaseApi.TempRequestListener.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i = message.what;
                    TempRequestListener tempRequestListener = TempRequestListener.this;
                    if (i == 0) {
                        tempRequestListener.f57185b.onComplete(message.obj);
                    } else {
                        tempRequestListener.f57185b.onError(new UiError(message.what, (String) message.obj, null));
                    }
                }
            };
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onComplete(JSONObject jSONObject) {
            Message messageObtainMessage = this.f57186c.obtainMessage();
            messageObtainMessage.obj = jSONObject;
            messageObtainMessage.what = 0;
            this.f57186c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onHttpStatusException(HttpUtils.HttpStatusException httpStatusException) {
            Message messageObtainMessage = this.f57186c.obtainMessage();
            messageObtainMessage.obj = httpStatusException.getMessage();
            messageObtainMessage.what = -9;
            this.f57186c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onIOException(IOException iOException) {
            Message messageObtainMessage = this.f57186c.obtainMessage();
            messageObtainMessage.obj = iOException.getMessage();
            messageObtainMessage.what = -2;
            this.f57186c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onJSONException(JSONException jSONException) {
            Message messageObtainMessage = this.f57186c.obtainMessage();
            messageObtainMessage.obj = jSONException.getMessage();
            messageObtainMessage.what = -4;
            this.f57186c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onMalformedURLException(MalformedURLException malformedURLException) {
            Message messageObtainMessage = this.f57186c.obtainMessage();
            messageObtainMessage.obj = malformedURLException.getMessage();
            messageObtainMessage.what = -3;
            this.f57186c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onNetworkUnavailableException(HttpUtils.NetworkUnavailableException networkUnavailableException) {
            Message messageObtainMessage = this.f57186c.obtainMessage();
            messageObtainMessage.obj = networkUnavailableException.getMessage();
            messageObtainMessage.what = -10;
            this.f57186c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onSocketTimeoutException(SocketTimeoutException socketTimeoutException) {
            Message messageObtainMessage = this.f57186c.obtainMessage();
            messageObtainMessage.obj = socketTimeoutException.getMessage();
            messageObtainMessage.what = -8;
            this.f57186c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onUnknowException(Exception exc) {
            Message messageObtainMessage = this.f57186c.obtainMessage();
            messageObtainMessage.obj = exc.getMessage();
            messageObtainMessage.what = -6;
            this.f57186c.sendMessage(messageObtainMessage);
        }
    }

    public BaseApi(C13812c c13812c, QQToken qQToken) {
        this.f57182b = c13812c;
        this.f57183c = qQToken;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m82145a() {
        Bundle bundle = new Bundle();
        bundle.putString("format", "json");
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", C14389g.m84397a().m84402c());
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
        QQToken qQToken = this.f57183c;
        if (qQToken != null && qQToken.isSessionValid()) {
            bundle.putString("access_token", this.f57183c.getAccessToken());
            bundle.putString("oauth_consumer_key", this.f57183c.getAppId());
            bundle.putString("openid", this.f57183c.getOpenId());
        }
        SharedPreferences sharedPreferences = C14390h.m84404a().getSharedPreferences(Constants.PREFERENCE_PF, 0);
        if (!isOEM) {
            bundle.putString(Constants.PARAM_PLATFORM_ID, sharedPreferences.getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
            return bundle;
        }
        bundle.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + "-android-" + registerChannel + "-" + businessId);
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public Bundle m82155b() {
        Bundle bundle = new Bundle();
        bundle.putString("appid", this.f57183c.getAppId());
        if (this.f57183c.isSessionValid()) {
            bundle.putString(Constants.PARAM_KEY_STR, this.f57183c.getAccessToken());
            bundle.putString(Constants.PARAM_KEY_TYPE, "0x80");
        }
        String openId = this.f57183c.getOpenId();
        if (openId != null) {
            bundle.putString("hopenid", openId);
        }
        bundle.putString("platform", "androidqz");
        SharedPreferences sharedPreferences = C14390h.m84404a().getSharedPreferences(Constants.PREFERENCE_PF, 0);
        if (isOEM) {
            bundle.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + "-android-" + registerChannel + "-" + businessId);
        } else {
            bundle.putString(Constants.PARAM_PLATFORM_ID, sharedPreferences.getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
            bundle.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
        }
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: c */
    public Intent m82156c() {
        Intent intent = new Intent();
        if (C14396n.m84493c(C14390h.m84404a())) {
            intent.setClassName(Constants.PACKAGE_QQ_PAD, "com.tencent.open.agent.AgentActivity");
            if (!C14394l.m84444b(C14390h.m84404a(), intent)) {
                intent.setClassName("com.tencent.mobileqq", "com.tencent.open.agent.AgentActivity");
                if (!C14394l.m84444b(C14390h.m84404a(), intent)) {
                    intent.setClassName(Constants.PACKAGE_TIM, "com.tencent.open.agent.AgentActivity");
                    if (C14394l.m84444b(C14390h.m84404a(), intent)) {
                        return null;
                    }
                }
            }
        } else {
            intent.setClassName("com.tencent.mobileqq", "com.tencent.open.agent.AgentActivity");
            if (!C14394l.m84444b(C14390h.m84404a(), intent)) {
                intent.setClassName(Constants.PACKAGE_TIM, "com.tencent.open.agent.AgentActivity");
                if (C14394l.m84444b(C14390h.m84404a(), intent)) {
                    return null;
                }
            }
        }
        return intent;
    }

    public void releaseResource() {
    }

    public BaseApi(QQToken qQToken) {
        this(null, qQToken);
    }

    /* JADX INFO: renamed from: c */
    public Intent m82157c(String str) {
        Intent intent = new Intent();
        Intent intentMo82154b = mo82154b(str);
        if (intentMo82154b == null || intentMo82154b.getComponent() == null) {
            return null;
        }
        intent.setClassName(intentMo82154b.getComponent().getPackageName(), "com.tencent.open.agent.AgentActivity");
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: b */
    public Intent mo82154b(String str) {
        Intent intent = new Intent();
        if (C14396n.m84493c(C14390h.m84404a())) {
            intent.setClassName(Constants.PACKAGE_QQ_PAD, str);
            if (!C14394l.m84437a(C14390h.m84404a(), intent)) {
                intent.setClassName("com.tencent.mobileqq", str);
                if (!C14394l.m84437a(C14390h.m84404a(), intent)) {
                    intent.setClassName(Constants.PACKAGE_TIM, str);
                    if (C14394l.m84437a(C14390h.m84404a(), intent)) {
                        return null;
                    }
                }
            }
        } else {
            intent.setClassName("com.tencent.mobileqq", str);
            if (!C14394l.m84437a(C14390h.m84404a(), intent)) {
                intent.setClassName(Constants.PACKAGE_TIM, str);
                if (C14394l.m84437a(C14390h.m84404a(), intent)) {
                    return null;
                }
            }
        }
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public String m82146a(String str) {
        Bundle bundleM82145a = m82145a();
        StringBuilder sb = new StringBuilder("https://openmobile.qq.com/oauth2.0/m_jump_by_version?");
        if (!TextUtils.isEmpty(str)) {
            bundleM82145a.putString("need_version", str);
        }
        sb.append(HttpUtils.encodeUrl(bundleM82145a));
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m82152a(StringBuilder sb, Activity activity) {
        if (sb.indexOf("?") < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(Constants.JumpUrlConstants.URL_KEY_SRC);
        sb.append("=");
        sb.append("app");
        String appId = this.f57183c.getAppId();
        String openId = this.f57183c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            m82153a(sb, Constants.JumpUrlConstants.URL_KEY_APPID, appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            m82153a(sb, Constants.JumpUrlConstants.URL_KEY_OPENID, C14396n.m84511k(openId));
        }
        String strM84469a = C14396n.m84469a(activity);
        if (!TextUtils.isEmpty(strM84469a)) {
            if (strM84469a.length() > 20) {
                strM84469a = strM84469a.substring(0, 20).concat("...");
            }
            m82153a(sb, "app_name", C14396n.m84511k(strM84469a));
        }
        m82153a(sb, Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, C14396n.m84511k(Constants.SDK_VERSION));
    }

    /* JADX INFO: renamed from: a */
    public void m82153a(StringBuilder sb, String str, String str2) {
        sb.append("&");
        sb.append(str);
        sb.append("=");
        sb.append(C14396n.m84500f(str2));
    }

    /* JADX INFO: renamed from: a */
    private Intent m82143a(Activity activity, Intent intent, Map<String, Object> map, int i) {
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        intent2.putExtra("is_login", true);
        m82144a(activity, intent2, intent, i);
        if (map != null) {
            try {
                if (map.containsKey(Constants.KEY_RESTORE_LANDSCAPE)) {
                    intent2.putExtra(Constants.KEY_RESTORE_LANDSCAPE, ((Boolean) map.get(Constants.KEY_RESTORE_LANDSCAPE)).booleanValue());
                    return intent2;
                }
            } catch (Exception e) {
                SLog.m84308e("openSDK_LOG.BaseApi", "Exception", e);
                return intent2;
            }
        }
        return intent2;
    }

    /* JADX INFO: renamed from: a */
    public void m82147a(Activity activity, int i, Intent intent, boolean z) {
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        if (z) {
            intent2.putExtra("is_qq_mobile_share", true);
        }
        m82144a(activity, intent2, intent, i);
        try {
            activity.startActivityForResult(intent2, i);
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.BaseApi", "startAssistActivity exception", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82148a(Activity activity, Intent intent, int i) {
        m82149a(activity, intent, i, (Map<String, Object>) null);
    }

    /* JADX INFO: renamed from: a */
    public void m82149a(Activity activity, Intent intent, int i, Map<String, Object> map) {
        intent.putExtra(Constants.KEY_REQUEST_CODE, i);
        try {
            activity.startActivityForResult(m82143a(activity, intent, map, i), i);
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.BaseApi", "startAssitActivity exception", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82151a(Fragment fragment, Intent intent, int i, Map<String, Object> map) {
        intent.putExtra(Constants.KEY_REQUEST_CODE, i);
        try {
            fragment.startActivityForResult(m82143a(fragment.getActivity(), intent, map, i), i);
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.BaseApi", "startAssitActivity exception", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m82144a(Activity activity, Intent intent, Intent intent2, int i) {
        if (intent == null || intent2 == null) {
            return;
        }
        try {
            if (intent2.getClipData() == null) {
                intent2.setClipData(ClipData.newPlainText(null, null));
            }
            intent2.setFlags(intent2.getFlags() & (-196));
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.BaseApi", "setActivityIntent security catch exception", th);
        }
        intent.putExtra(AssistActivity.KEY_REQUEST_ORIENTATION, activity.getRequestedOrientation());
        intent.putExtra(AssistActivity.EXTRA_INTENT, intent2);
        try {
            SLog.m84309i("openSDK_LOG.BaseApi", "setActivityIntent requestCode: " + i);
            intent.putExtra(AssistActivity.KEY_EXTRA_PENDING_INTENT, PendingIntent.getActivity(activity, i, intent2, 1140850688));
        } catch (Throwable th2) {
            SLog.m84308e("openSDK_LOG.BaseApi", "setActivityIntent create pendingIntent exception", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82150a(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.BaseApi", "--handleDownloadLastestQQ");
        new TDialog(activity, "", "https://imgcache.qq.com/ptlogin/static/qzsjump.html?" + HttpUtils.encodeUrl(bundle), null, this.f57183c).show();
    }
}
