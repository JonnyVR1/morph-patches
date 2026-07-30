package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import com.tencent.connect.auth.C13812c;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.p106c.C14369b;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14392j;
import com.tencent.open.utils.C14393k;
import com.tencent.open.utils.C14394l;
import com.tencent.open.utils.C14396n;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.web.C14399a;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.eclipse.jetty.http.MimeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SocialApiIml extends BaseApi {

    /* JADX INFO: renamed from: a */
    private Activity f60129a;

    /* JADX INFO: renamed from: com.tencent.open.SocialApiIml$a */
    public class C14344a extends DefaultUiListener {

        /* JADX INFO: renamed from: b */
        private IUiListener f60131b;

        /* JADX INFO: renamed from: c */
        private String f60132c;

        /* JADX INFO: renamed from: d */
        private String f60133d;

        /* JADX INFO: renamed from: e */
        private Bundle f60134e;

        /* JADX INFO: renamed from: f */
        private Activity f60135f;

        public C14344a(Activity activity, IUiListener iUiListener, String str, String str2, Bundle bundle) {
            this.f60131b = iUiListener;
            this.f60132c = str;
            this.f60133d = str2;
            this.f60134e = bundle;
            this.f60135f = activity;
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            this.f60131b.onCancel();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            String string;
            try {
                string = ((JSONObject) obj).getString(SocialConstants.PARAM_ENCRY_EOKEN);
            } catch (JSONException e) {
                e.printStackTrace();
                SLog.m84308e("openSDK_LOG.SocialApiIml", "OpenApi, EncrytokenListener() onComplete error", e);
                string = null;
            }
            this.f60134e.putString("encrytoken", string);
            SocialApiIml socialApiIml = SocialApiIml.this;
            socialApiIml.m84189a((Context) socialApiIml.f60129a, this.f60132c, this.f60134e, this.f60133d, this.f60131b);
            if (TextUtils.isEmpty(string)) {
                SLog.m84305d("openSDK_LOG.SocialApiIml", "The token get from qq or qzone is empty. Write temp token to localstorage.");
                SocialApiIml.this.writeEncryToken(this.f60135f);
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            SLog.m84305d("openSDK_LOG.SocialApiIml", "OpenApi, EncryptTokenListener() onError" + uiError.errorMessage);
            this.f60131b.onError(uiError);
        }
    }

    public SocialApiIml(QQToken qQToken) {
        super(qQToken);
    }

    /* JADX INFO: renamed from: a */
    private void m84188a(Activity activity, String str, Bundle bundle, String str2, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5 action = " + str);
        Intent intentM82156c = m82156c();
        IUiListener c14344a = new C14344a(activity, iUiListener, str, str2, bundle);
        Intent intentMo82154b = mo82154b("com.tencent.open.agent.EncryTokenActivity");
        if (intentMo82154b != null && intentM82156c != null && intentM82156c.getComponent() != null && intentMo82154b.getComponent() != null && intentM82156c.getComponent().getPackageName().equals(intentMo82154b.getComponent().getPackageName())) {
            intentMo82154b.putExtra("oauth_consumer_key", this.f57183c.getAppId());
            intentMo82154b.putExtra("openid", this.f57183c.getOpenId());
            intentMo82154b.putExtra("access_token", this.f57183c.getAccessToken());
            intentMo82154b.putExtra(Constants.KEY_ACTION, SocialConstants.ACTION_CHECK_TOKEN);
            SLog.m84309i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5--found token activity");
            UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_SOCIAL_H5, c14344a);
            m82148a(activity, intentMo82154b, Constants.REQUEST_SOCIAL_H5);
            return;
        }
        SLog.m84309i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5--token activity not found");
        String strM84503g = C14396n.m84503g("tencent&sdk&qazxc***14969%%" + this.f57183c.getAccessToken() + this.f57183c.getAppId() + this.f57183c.getOpenId() + "qzone3.4");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SocialConstants.PARAM_ENCRY_EOKEN, strM84503g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        c14344a.onComplete(jSONObject);
    }

    public void ask(Activity activity, Bundle bundle, IUiListener iUiListener) {
        m84187a(activity, SocialConstants.ACTION_ASK, bundle, iUiListener);
    }

    @Override // com.tencent.connect.common.BaseApi
    /* JADX INFO: renamed from: b */
    public Intent mo82154b(String str) {
        Intent intent = new Intent();
        intent.setClassName(Constants.PACKAGE_QQ_PAD, str);
        if (C14396n.m84493c(C14390h.m84404a()) && C14394l.m84437a(C14390h.m84404a(), intent)) {
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setClassName("com.tencent.mobileqq", str);
        if (C14394l.m84437a(C14390h.m84404a(), intent2) && C14394l.m84445c(C14390h.m84404a(), "4.7") >= 0) {
            return intent2;
        }
        Intent intent3 = new Intent();
        intent3.setClassName(Constants.PACKAGE_QZONE, str);
        if (C14394l.m84437a(C14390h.m84404a(), intent3) && C14394l.m84428a(C14394l.m84434a(C14390h.m84404a(), Constants.PACKAGE_QZONE), "4.2") >= 0 && C14394l.m84438a(C14390h.m84404a(), intent3.getComponent().getPackageName(), Constants.SIGNATRUE_QZONE)) {
            return intent3;
        }
        return null;
    }

    public void gift(Activity activity, Bundle bundle, IUiListener iUiListener) {
        m84187a(activity, SocialConstants.ACTION_GIFT, bundle, iUiListener);
    }

    public void invite(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f60129a = activity;
        Intent intentM82157c = m82157c(SocialConstants.ACTIVITY_FRIEND_CHOOSER);
        if (intentM82157c == null) {
            SLog.m84309i("openSDK_LOG.SocialApiIml", "--invite--friend chooser not found");
            intentM82157c = m82157c(SocialConstants.ACTIVITY_INVITE);
        }
        bundle.putAll(m82155b());
        m84186a(activity, intentM82157c, SocialConstants.ACTION_INVITE, bundle, C14393k.m84426a().m84427a(C14390h.m84404a(), "https://imgcache.qq.com/open/mobile/invite/sdk_invite.html?"), iUiListener, false);
    }

    public void story(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f60129a = activity;
        Intent intentM82157c = m82157c(SocialConstants.ACTIVITY_STORY);
        bundle.putAll(m82155b());
        m84186a(activity, intentM82157c, SocialConstants.ACTION_STORY, bundle, C14393k.m84426a().m84427a(C14390h.m84404a(), "https://imgcache.qq.com/open/mobile/sendstory/sdk_sendstory_v1.3.html?"), iUiListener, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void writeEncryToken(Context context) {
        String strM84503g;
        String accessToken = this.f57183c.getAccessToken();
        String appId = this.f57183c.getAppId();
        String openId = this.f57183c.getOpenId();
        if (accessToken == null || accessToken.length() <= 0 || appId == null || appId.length() <= 0 || openId == null || openId.length() <= 0) {
            strM84503g = null;
        } else {
            strM84503g = C14396n.m84503g("tencent&sdk&qazxc***14969%%" + accessToken + appId + openId + "qzone3.4");
        }
        C14369b c14369b = new C14369b(context);
        WebSettings settings = c14369b.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        C14399a.m84519a(c14369b);
        String str = "<!DOCTYPE HTML><html lang=\"en-US\"><head><meta charset=\"UTF-8\"><title>localStorage Test</title><script type=\"text/javascript\">document.domain = 'qq.com';localStorage[\"" + this.f57183c.getOpenId() + "_" + this.f57183c.getAppId() + "\"]=\"" + strM84503g + "\";</script></head><body></body></html>";
        String strM84427a = C14393k.m84426a().m84427a(context, "https://imgcache.qq.com");
        c14369b.loadDataWithBaseURL(strM84427a, str, MimeTypes.TEXT_HTML, "utf-8", strM84427a);
    }

    public SocialApiIml(C13812c c13812c, QQToken qQToken) {
        super(c13812c, qQToken);
    }

    /* JADX INFO: renamed from: a */
    private void m84187a(Activity activity, String str, Bundle bundle, IUiListener iUiListener) {
        this.f60129a = activity;
        Intent intentM82157c = m82157c(SocialConstants.ACTIVITY_FRIEND_CHOOSER);
        if (intentM82157c == null) {
            SLog.m84309i("openSDK_LOG.SocialApiIml", "--askgift--friend chooser not found");
            intentM82157c = m82157c(SocialConstants.ACTIVITY_ASK_GIFT);
        }
        Intent intent = intentM82157c;
        bundle.putAll(m82155b());
        if (SocialConstants.ACTION_ASK.equals(str)) {
            bundle.putString("type", SocialConstants.TYPE_REQUEST);
        } else if (SocialConstants.ACTION_GIFT.equals(str)) {
            bundle.putString("type", SocialConstants.TYPE_FREEGIFT);
        }
        m84186a(activity, intent, str, bundle, C14393k.m84426a().m84427a(C14390h.m84404a(), "https://imgcache.qq.com/open/mobile/request/sdk_request.html?"), iUiListener, false);
    }

    /* JADX INFO: renamed from: a */
    private void m84186a(Activity activity, Intent intent, String str, Bundle bundle, String str2, IUiListener iUiListener, boolean z) {
        StringBuilder sb = new StringBuilder("-->handleIntent action = ");
        sb.append(str);
        sb.append(", activityIntent = null ? ");
        sb.append(intent == null);
        SLog.m84309i("openSDK_LOG.SocialApiIml", sb.toString());
        if (intent != null) {
            m84185a(activity, intent, str, bundle, iUiListener);
            return;
        }
        C14392j c14392jM84415a = C14392j.m84415a(C14390h.m84404a(), this.f57183c.getAppId());
        if (!z && !c14392jM84415a.m84425b("C_LoginH5")) {
            m82150a(activity, bundle, iUiListener);
        } else {
            m84188a(activity, str, bundle, str2, iUiListener);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84185a(Activity activity, Intent intent, String str, Bundle bundle, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.SocialApiIml", "-->handleIntentWithAgent action = " + str);
        intent.putExtra(Constants.KEY_ACTION, str);
        intent.putExtra(Constants.KEY_PARAMS, bundle);
        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_SOCIAL_API, iUiListener);
        m82148a(activity, intent, Constants.REQUEST_SOCIAL_API);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84189a(Context context, String str, Bundle bundle, String str2, IUiListener iUiListener) {
        SLog.m84313v("openSDK_LOG.SocialApiIml", "OpenUi, showDialog --start");
        CookieSyncManager.createInstance(context);
        bundle.putString("oauth_consumer_key", this.f57183c.getAppId());
        if (this.f57183c.isSessionValid()) {
            bundle.putString("access_token", this.f57183c.getAccessToken());
        }
        String openId = this.f57183c.getOpenId();
        if (openId != null) {
            bundle.putString("openid", openId);
        }
        try {
            bundle.putString(Constants.PARAM_PLATFORM_ID, C14390h.m84404a().getSharedPreferences(Constants.PREFERENCE_PF, 0).getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
        } catch (Exception e) {
            e.printStackTrace();
            bundle.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
        }
        String str3 = str2 + HttpUtils.encodeUrl(bundle);
        SLog.m84305d("openSDK_LOG.SocialApiIml", "OpenUi, showDialog TDialog");
        if (!SocialConstants.ACTION_CHALLENGE.equals(str) && !SocialConstants.ACTION_BRAG.equals(str)) {
            new TDialog(this.f60129a, str, str3, iUiListener, this.f57183c).show();
        } else {
            SLog.m84305d("openSDK_LOG.SocialApiIml", "OpenUi, showDialog PKDialog");
            new DialogC14372d(this.f60129a, str, str3, iUiListener, this.f57183c).show();
        }
    }
}
