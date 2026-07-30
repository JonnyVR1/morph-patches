package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import com.tencent.connect.auth.C13975c;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.p111c.C14532b;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14555j;
import com.tencent.open.utils.C14556k;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14559n;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.web.C14562a;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.eclipse.jetty.http.MimeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SocialApiIml extends BaseApi {

    /* JADX INFO: renamed from: a */
    private Activity f60977a;

    /* JADX INFO: renamed from: com.tencent.open.SocialApiIml$a */
    public class C14507a extends DefaultUiListener {

        /* JADX INFO: renamed from: b */
        private IUiListener f60979b;

        /* JADX INFO: renamed from: c */
        private String f60980c;

        /* JADX INFO: renamed from: d */
        private String f60981d;

        /* JADX INFO: renamed from: e */
        private Bundle f60982e;

        /* JADX INFO: renamed from: f */
        private Activity f60983f;

        public C14507a(Activity activity, IUiListener iUiListener, String str, String str2, Bundle bundle) {
            this.f60979b = iUiListener;
            this.f60980c = str;
            this.f60981d = str2;
            this.f60982e = bundle;
            this.f60983f = activity;
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            this.f60979b.onCancel();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            String string;
            try {
                string = ((JSONObject) obj).getString(SocialConstants.PARAM_ENCRY_EOKEN);
            } catch (JSONException e) {
                e.printStackTrace();
                SLog.m85491e("openSDK_LOG.SocialApiIml", "OpenApi, EncrytokenListener() onComplete error", e);
                string = null;
            }
            this.f60982e.putString("encrytoken", string);
            SocialApiIml socialApiIml = SocialApiIml.this;
            socialApiIml.m85372a((Context) socialApiIml.f60977a, this.f60980c, this.f60982e, this.f60981d, this.f60979b);
            if (TextUtils.isEmpty(string)) {
                SLog.m85488d("openSDK_LOG.SocialApiIml", "The token get from qq or qzone is empty. Write temp token to localstorage.");
                SocialApiIml.this.writeEncryToken(this.f60983f);
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            SLog.m85488d("openSDK_LOG.SocialApiIml", "OpenApi, EncryptTokenListener() onError" + uiError.errorMessage);
            this.f60979b.onError(uiError);
        }
    }

    public SocialApiIml(QQToken qQToken) {
        super(qQToken);
    }

    /* JADX INFO: renamed from: a */
    private void m85371a(Activity activity, String str, Bundle bundle, String str2, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5 action = " + str);
        Intent intentM83339c = m83339c();
        IUiListener c14507a = new C14507a(activity, iUiListener, str, str2, bundle);
        Intent intentMo83337b = mo83337b("com.tencent.open.agent.EncryTokenActivity");
        if (intentMo83337b != null && intentM83339c != null && intentM83339c.getComponent() != null && intentMo83337b.getComponent() != null && intentM83339c.getComponent().getPackageName().equals(intentMo83337b.getComponent().getPackageName())) {
            intentMo83337b.putExtra("oauth_consumer_key", this.f58031c.getAppId());
            intentMo83337b.putExtra("openid", this.f58031c.getOpenId());
            intentMo83337b.putExtra("access_token", this.f58031c.getAccessToken());
            intentMo83337b.putExtra(Constants.KEY_ACTION, SocialConstants.ACTION_CHECK_TOKEN);
            SLog.m85492i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5--found token activity");
            UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_SOCIAL_H5, c14507a);
            m83331a(activity, intentMo83337b, Constants.REQUEST_SOCIAL_H5);
            return;
        }
        SLog.m85492i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5--token activity not found");
        String strM85686g = C14559n.m85686g("tencent&sdk&qazxc***14969%%" + this.f58031c.getAccessToken() + this.f58031c.getAppId() + this.f58031c.getOpenId() + "qzone3.4");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SocialConstants.PARAM_ENCRY_EOKEN, strM85686g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        c14507a.onComplete(jSONObject);
    }

    public void ask(Activity activity, Bundle bundle, IUiListener iUiListener) {
        m85370a(activity, SocialConstants.ACTION_ASK, bundle, iUiListener);
    }

    @Override // com.tencent.connect.common.BaseApi
    /* JADX INFO: renamed from: b */
    public Intent mo83337b(String str) {
        Intent intent = new Intent();
        intent.setClassName(Constants.PACKAGE_QQ_PAD, str);
        if (C14559n.m85676c(C14553h.m85587a()) && C14557l.m85620a(C14553h.m85587a(), intent)) {
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setClassName("com.tencent.mobileqq", str);
        if (C14557l.m85620a(C14553h.m85587a(), intent2) && C14557l.m85628c(C14553h.m85587a(), "4.7") >= 0) {
            return intent2;
        }
        Intent intent3 = new Intent();
        intent3.setClassName(Constants.PACKAGE_QZONE, str);
        if (C14557l.m85620a(C14553h.m85587a(), intent3) && C14557l.m85611a(C14557l.m85617a(C14553h.m85587a(), Constants.PACKAGE_QZONE), "4.2") >= 0 && C14557l.m85621a(C14553h.m85587a(), intent3.getComponent().getPackageName(), Constants.SIGNATRUE_QZONE)) {
            return intent3;
        }
        return null;
    }

    public void gift(Activity activity, Bundle bundle, IUiListener iUiListener) {
        m85370a(activity, SocialConstants.ACTION_GIFT, bundle, iUiListener);
    }

    public void invite(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f60977a = activity;
        Intent intentM83340c = m83340c(SocialConstants.ACTIVITY_FRIEND_CHOOSER);
        if (intentM83340c == null) {
            SLog.m85492i("openSDK_LOG.SocialApiIml", "--invite--friend chooser not found");
            intentM83340c = m83340c(SocialConstants.ACTIVITY_INVITE);
        }
        bundle.putAll(m83338b());
        m85369a(activity, intentM83340c, SocialConstants.ACTION_INVITE, bundle, C14556k.m85609a().m85610a(C14553h.m85587a(), "https://imgcache.qq.com/open/mobile/invite/sdk_invite.html?"), iUiListener, false);
    }

    public void story(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f60977a = activity;
        Intent intentM83340c = m83340c(SocialConstants.ACTIVITY_STORY);
        bundle.putAll(m83338b());
        m85369a(activity, intentM83340c, SocialConstants.ACTION_STORY, bundle, C14556k.m85609a().m85610a(C14553h.m85587a(), "https://imgcache.qq.com/open/mobile/sendstory/sdk_sendstory_v1.3.html?"), iUiListener, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void writeEncryToken(Context context) {
        String strM85686g;
        String accessToken = this.f58031c.getAccessToken();
        String appId = this.f58031c.getAppId();
        String openId = this.f58031c.getOpenId();
        if (accessToken == null || accessToken.length() <= 0 || appId == null || appId.length() <= 0 || openId == null || openId.length() <= 0) {
            strM85686g = null;
        } else {
            strM85686g = C14559n.m85686g("tencent&sdk&qazxc***14969%%" + accessToken + appId + openId + "qzone3.4");
        }
        C14532b c14532b = new C14532b(context);
        WebSettings settings = c14532b.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        C14562a.m85702a(c14532b);
        String str = "<!DOCTYPE HTML><html lang=\"en-US\"><head><meta charset=\"UTF-8\"><title>localStorage Test</title><script type=\"text/javascript\">document.domain = 'qq.com';localStorage[\"" + this.f58031c.getOpenId() + "_" + this.f58031c.getAppId() + "\"]=\"" + strM85686g + "\";</script></head><body></body></html>";
        String strM85610a = C14556k.m85609a().m85610a(context, "https://imgcache.qq.com");
        c14532b.loadDataWithBaseURL(strM85610a, str, MimeTypes.TEXT_HTML, "utf-8", strM85610a);
    }

    public SocialApiIml(C13975c c13975c, QQToken qQToken) {
        super(c13975c, qQToken);
    }

    /* JADX INFO: renamed from: a */
    private void m85370a(Activity activity, String str, Bundle bundle, IUiListener iUiListener) {
        this.f60977a = activity;
        Intent intentM83340c = m83340c(SocialConstants.ACTIVITY_FRIEND_CHOOSER);
        if (intentM83340c == null) {
            SLog.m85492i("openSDK_LOG.SocialApiIml", "--askgift--friend chooser not found");
            intentM83340c = m83340c(SocialConstants.ACTIVITY_ASK_GIFT);
        }
        Intent intent = intentM83340c;
        bundle.putAll(m83338b());
        if (SocialConstants.ACTION_ASK.equals(str)) {
            bundle.putString("type", SocialConstants.TYPE_REQUEST);
        } else if (SocialConstants.ACTION_GIFT.equals(str)) {
            bundle.putString("type", SocialConstants.TYPE_FREEGIFT);
        }
        m85369a(activity, intent, str, bundle, C14556k.m85609a().m85610a(C14553h.m85587a(), "https://imgcache.qq.com/open/mobile/request/sdk_request.html?"), iUiListener, false);
    }

    /* JADX INFO: renamed from: a */
    private void m85369a(Activity activity, Intent intent, String str, Bundle bundle, String str2, IUiListener iUiListener, boolean z) {
        StringBuilder sb = new StringBuilder("-->handleIntent action = ");
        sb.append(str);
        sb.append(", activityIntent = null ? ");
        sb.append(intent == null);
        SLog.m85492i("openSDK_LOG.SocialApiIml", sb.toString());
        if (intent != null) {
            m85368a(activity, intent, str, bundle, iUiListener);
            return;
        }
        C14555j c14555jM85598a = C14555j.m85598a(C14553h.m85587a(), this.f58031c.getAppId());
        if (!z && !c14555jM85598a.m85608b("C_LoginH5")) {
            m83333a(activity, bundle, iUiListener);
        } else {
            m85371a(activity, str, bundle, str2, iUiListener);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m85368a(Activity activity, Intent intent, String str, Bundle bundle, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.SocialApiIml", "-->handleIntentWithAgent action = " + str);
        intent.putExtra(Constants.KEY_ACTION, str);
        intent.putExtra(Constants.KEY_PARAMS, bundle);
        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_SOCIAL_API, iUiListener);
        m83331a(activity, intent, Constants.REQUEST_SOCIAL_API);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m85372a(Context context, String str, Bundle bundle, String str2, IUiListener iUiListener) {
        SLog.m85496v("openSDK_LOG.SocialApiIml", "OpenUi, showDialog --start");
        CookieSyncManager.createInstance(context);
        bundle.putString("oauth_consumer_key", this.f58031c.getAppId());
        if (this.f58031c.isSessionValid()) {
            bundle.putString("access_token", this.f58031c.getAccessToken());
        }
        String openId = this.f58031c.getOpenId();
        if (openId != null) {
            bundle.putString("openid", openId);
        }
        try {
            bundle.putString(Constants.PARAM_PLATFORM_ID, C14553h.m85587a().getSharedPreferences(Constants.PREFERENCE_PF, 0).getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
        } catch (Exception e) {
            e.printStackTrace();
            bundle.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
        }
        String str3 = str2 + HttpUtils.encodeUrl(bundle);
        SLog.m85488d("openSDK_LOG.SocialApiIml", "OpenUi, showDialog TDialog");
        if (!SocialConstants.ACTION_CHALLENGE.equals(str) && !SocialConstants.ACTION_BRAG.equals(str)) {
            new TDialog(this.f60977a, str, str3, iUiListener, this.f58031c).show();
        } else {
            SLog.m85488d("openSDK_LOG.SocialApiIml", "OpenUi, showDialog PKDialog");
            new DialogC14535d(this.f60977a, str, str3, iUiListener, this.f58031c).show();
        }
    }
}
