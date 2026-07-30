package com.tencent.connect.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieSyncManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.data.Mobile;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.connect.C13965a;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.connect.p082a.C13966a;
import com.tencent.open.TDialog;
import com.tencent.open.log.SLog;
import com.tencent.open.p110b.C14526e;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14555j;
import com.tencent.open.utils.C14556k;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14558m;
import com.tencent.open.utils.C14559n;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.web.security.JniInterface;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AuthAgent extends BaseApi {
    public static final String KEY_FORCE_QR_LOGIN = "KEY_FORCE_QR_LOGIN";
    public static final String SECURE_LIB_ARM64_FILE_NAME = "libwbsafeedit_64";
    public static final String SECURE_LIB_ARM_FILE_NAME = "libwbsafeedit";
    public static String SECURE_LIB_FILE_NAME = "libwbsafeedit";
    public static String SECURE_LIB_NAME = null;
    public static final int SECURE_LIB_VERSION = 5;
    public static final String SECURE_LIB_X86_64_FILE_NAME = "libwbsafeedit_x86_64";
    public static final String SECURE_LIB_X86_FILE_NAME = "libwbsafeedit_x86";

    /* JADX INFO: renamed from: a */
    private IUiListener f57882a;

    /* JADX INFO: renamed from: d */
    private String f57883d;

    /* JADX INFO: renamed from: e */
    private WeakReference<Activity> f57884e;

    /* JADX INFO: renamed from: com.tencent.connect.auth.AuthAgent$a */
    public class C13969a extends DefaultUiListener {

        /* JADX INFO: renamed from: a */
        IUiListener f57890a;

        public C13969a(IUiListener iUiListener) {
            this.f57890a = iUiListener;
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f57890a;
            if (iUiListener != null) {
                iUiListener.onCancel();
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            if (obj == null) {
                SLog.m85490e("openSDK_LOG.AuthAgent", "CheckLoginListener response data is null");
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            try {
                int i = jSONObject.getInt("ret");
                String string = i == 0 ? "success" : jSONObject.getString("msg");
                IUiListener iUiListener = this.f57890a;
                if (iUiListener != null) {
                    iUiListener.onComplete(new JSONObject().put("ret", i).put("msg", string));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                SLog.m85490e("openSDK_LOG.AuthAgent", "CheckLoginListener response data format error");
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            IUiListener iUiListener = this.f57890a;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.connect.auth.AuthAgent$c */
    public class C13971c extends DefaultUiListener {

        /* JADX INFO: renamed from: b */
        private final IUiListener f57909b;

        /* JADX INFO: renamed from: c */
        private final boolean f57910c;

        /* JADX INFO: renamed from: d */
        private final Context f57911d;

        public C13971c(Context context, IUiListener iUiListener, boolean z, boolean z2) {
            this.f57911d = context;
            this.f57909b = iUiListener;
            this.f57910c = z;
            SLog.m85488d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener()");
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            SLog.m85488d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onCancel");
            this.f57909b.onCancel();
            SLog.release();
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0071 A[Catch: JSONException -> 0x0049, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0049, blocks: (B:3:0x000d, B:5:0x0021, B:8:0x002b, B:11:0x004b, B:17:0x006d, B:19:0x0071, B:16:0x0067, B:13:0x0051), top: B:24:0x000d, inners: #1 }] */
        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            SLog.m85488d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete");
            JSONObject jSONObject = (JSONObject) obj;
            try {
                String string = jSONObject.getString("access_token");
                String string2 = jSONObject.getString("expires_in");
                String string3 = jSONObject.getString("openid");
                if (string != null && ((BaseApi) AuthAgent.this).f58031c != null && string3 != null) {
                    ((BaseApi) AuthAgent.this).f58031c.setAccessToken(string, string2);
                    ((BaseApi) AuthAgent.this).f58031c.setOpenId(string3);
                    C13966a.m83173d(this.f57911d, ((BaseApi) AuthAgent.this).f58031c);
                }
                String string4 = jSONObject.getString(Constants.PARAM_PLATFORM_ID);
                if (string4 != null) {
                    try {
                        this.f57911d.getSharedPreferences(Constants.PREFERENCE_PF, 0).edit().putString(Constants.PARAM_PLATFORM_ID, string4).commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                        SLog.m85491e("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e);
                    }
                    if (this.f57910c) {
                        CookieSyncManager.getInstance().sync();
                    }
                } else if (this.f57910c) {
                    CookieSyncManager.getInstance().sync();
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                SLog.m85491e("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e2);
            }
            this.f57909b.onComplete(jSONObject);
            AuthAgent.this.releaseResource();
            SLog.release();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            SLog.m85488d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onError");
            this.f57909b.onError(uiError);
            SLog.release();
        }
    }

    static {
        SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
        String str = Build.CPU_ABI;
        if (str == null || str.equals("")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_ARM_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            SLog.m85492i("openSDK_LOG.AuthAgent", "is arm(default) architecture");
            return;
        }
        if (str.equalsIgnoreCase("arm64-v8a")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_ARM64_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            SLog.m85492i("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
            return;
        }
        if (str.equalsIgnoreCase("x86")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_X86_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            SLog.m85492i("openSDK_LOG.AuthAgent", "is x86 architecture");
            return;
        }
        if (str.equalsIgnoreCase("x86_64")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_X86_64_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            SLog.m85492i("openSDK_LOG.AuthAgent", "is x86_64 architecture");
            return;
        }
        SECURE_LIB_FILE_NAME = SECURE_LIB_ARM_FILE_NAME;
        SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
        SLog.m85492i("openSDK_LOG.AuthAgent", "is arm(default) architecture");
    }

    public AuthAgent(QQToken qQToken) {
        super(qQToken);
    }

    /* JADX INFO: renamed from: a */
    private int m83177a(boolean z, IUiListener iUiListener, boolean z2, Map<String, Object> map) {
        CookieSyncManager.createInstance(C14553h.m85587a());
        Bundle bundleM83328a = m83328a();
        if (z) {
            bundleM83328a.putString("isadd", "1");
        }
        bundleM83328a.putString("scope", this.f57883d);
        bundleM83328a.putString("client_id", this.f58031c.getAppId());
        if (BaseApi.isOEM) {
            bundleM83328a.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + BaseApi.installChannel + "-android-" + BaseApi.registerChannel + "-" + BaseApi.businessId);
        } else {
            bundleM83328a.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
        }
        String str = (System.currentTimeMillis() / 1000) + "";
        bundleM83328a.putString("sign", C14557l.m85624b(C14553h.m85587a(), str));
        bundleM83328a.putString("time", str);
        bundleM83328a.putString(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, Mobile.TYPE);
        bundleM83328a.putString(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, "token");
        bundleM83328a.putString(WBConstants.AUTH_PARAMS_REDIRECT_URL, "auth://tauth.qq.com/");
        bundleM83328a.putString("cancel_display", "1");
        bundleM83328a.putString("switch", "1");
        bundleM83328a.putString("compat_v", "1");
        if (z2) {
            bundleM83328a.putString("style", "qr");
        }
        String strM83185b = m83185b(map);
        SLog.m85492i("openSDK_LOG.AuthAgent", "OpenUI, showDialog addLoginAccount: " + strM83185b);
        if (strM83185b != null && !strM83185b.isEmpty()) {
            bundleM83328a.putString("uin", strM83185b);
        }
        boolean zM83183a = m83183a(map);
        bundleM83328a.putString("show_download_ui", Boolean.toString(zM83183a));
        SLog.m85492i("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- start, isShowDownloadUi=" + zM83183a);
        final String str2 = C14556k.m85609a().m85610a(C14553h.m85587a(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + HttpUtils.encodeUrl(bundleM83328a);
        final C13971c c13971c = new C13971c(C14553h.m85587a(), iUiListener, true, false);
        SLog.m85488d("openSDK_LOG.AuthAgent", "OpenUi, showDialog TDialog");
        C14558m.m85639b(new Runnable() { // from class: com.tencent.connect.auth.AuthAgent.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                final Activity activity;
                C14557l.m85622a(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 5);
                JniInterface.loadSo();
                if (AuthAgent.this.f57884e == null || (activity = (Activity) AuthAgent.this.f57884e.get()) == null) {
                    return;
                }
                activity.runOnUiThread(new Runnable() { // from class: com.tencent.connect.auth.AuthAgent.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (JniInterface.isJniOk) {
                            Activity activity2 = activity;
                            RunnableC139681 runnableC139681 = RunnableC139681.this;
                            DialogC13973a dialogC13973a = new DialogC13973a(activity2, "action_login", str2, c13971c, ((BaseApi) AuthAgent.this).f58031c);
                            if (activity.isFinishing()) {
                                return;
                            }
                            dialogC13973a.show();
                            return;
                        }
                        SLog.m85498w("openSDK_LOG.AuthAgent", "OpenUi, secure so load failed, goto download QQ.");
                        Activity activity3 = activity;
                        String strM83329a = AuthAgent.this.m83329a("");
                        RunnableC139681 runnableC139682 = RunnableC139681.this;
                        TDialog tDialog = new TDialog(activity3, "", strM83329a, c13971c, ((BaseApi) AuthAgent.this).f58031c);
                        if (activity.isFinishing()) {
                            return;
                        }
                        tDialog.show();
                    }
                });
            }
        });
        SLog.m85492i("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- end");
        return 2;
    }

    /* JADX INFO: renamed from: b */
    private void m83186b(Bundle bundle, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (!bundle.containsKey(entry.getKey())) {
                    if (value instanceof String) {
                        bundle.putString(entry.getKey(), C14559n.m85694k((String) value));
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        bundle.putInt(entry.getKey(), ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        bundle.putString(entry.getKey(), (String) value);
                    }
                }
            }
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.AuthAgent", "putOutMap", e);
        }
    }

    public int doLogin(Activity activity, String str, IUiListener iUiListener, boolean z, Fragment fragment, boolean z2, Map<String, Object> map) {
        if (C13965a.m83167a("openSDK_LOG.AuthAgent", iUiListener)) {
            return -1;
        }
        this.f57883d = str;
        this.f57884e = new WeakReference<>(activity);
        this.f57882a = iUiListener;
        Object[] objArr = new Object[2];
        Intent intent = activity.getIntent();
        boolean z3 = intent != null && intent.getBooleanExtra(KEY_FORCE_QR_LOGIN, false);
        boolean zM85608b = C14555j.m85598a(activity, this.f58031c.getAppId()).m85608b("C_LoginWeb");
        SLog.m85492i("openSDK_LOG.AuthAgent", "doLogin needForceQrLogin=" + z3 + ", toWebLogin=" + zM85608b);
        if (!z3 && !zM85608b && m83182a(activity, fragment, map, z, objArr)) {
            SLog.m85492i("openSDK_LOG.AuthAgent", "OpenUi, showUi, return Constants.UI_ACTIVITY");
            C14526e.m85448a().m85451a(this.f58031c.getOpenId(), this.f58031c.getAppId(), "2", "1", "5", (String) objArr[0], "0", "0");
            return ((Integer) objArr[1]).intValue();
        }
        C14526e.m85448a().m85451a(this.f58031c.getOpenId(), this.f58031c.getAppId(), "2", "1", "5", "1", "0", "0");
        SLog.m85498w("openSDK_LOG.AuthAgent", "doLogin startActivity fail show dialog.");
        C13970b c13970b = new C13970b(this.f57882a);
        this.f57882a = c13970b;
        return m83177a(z, c13970b, z2, map);
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
        this.f57882a = null;
    }

    /* JADX INFO: renamed from: b */
    private String m83185b(Map<String, Object> map) {
        if (map == null) {
            return "";
        }
        Object obj = map.get(Constants.KEY_ADD_LOGIN_ACCOUNT);
        if (!(obj instanceof String)) {
            return "";
        }
        return ((String) obj).trim();
    }

    /* JADX INFO: renamed from: b */
    public void m83198b(IUiListener iUiListener) {
        Bundle bundleM83328a = m83328a();
        bundleM83328a.putString("reqType", "checkLogin");
        HttpUtils.requestAsync(this.f58031c, C14553h.m85587a(), "https://openmobile.qq.com/v3/user/get_info", bundleM83328a, "GET", new BaseApi.TempRequestListener(new C13969a(iUiListener)));
    }

    /* JADX INFO: renamed from: a */
    public int m83196a(Activity activity, String str, IUiListener iUiListener, boolean z, Fragment fragment, boolean z2) {
        return doLogin(activity, str, iUiListener, z, fragment, z2, null);
    }

    /* JADX INFO: renamed from: a */
    private boolean m83183a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        Object obj = map.get(Constants.KEY_ENABLE_SHOW_DOWNLOAD_URL);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m83182a(Activity activity, Fragment fragment, Map<String, Object> map, boolean z, Object[] objArr) {
        SLog.m85492i("openSDK_LOG.AuthAgent", "startActionActivity() -- start");
        Intent intentM83339c = m83339c();
        if (intentM83339c != null) {
            Bundle bundleM83328a = m83328a();
            if (z) {
                bundleM83328a.putString("isadd", "1");
            }
            bundleM83328a.putString("scope", this.f57883d);
            bundleM83328a.putString("client_id", this.f58031c.getAppId());
            if (BaseApi.isOEM) {
                bundleM83328a.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + BaseApi.installChannel + "-android-" + BaseApi.registerChannel + "-" + BaseApi.businessId);
            } else {
                bundleM83328a.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
            }
            bundleM83328a.putString("need_pay", "1");
            m83181a(bundleM83328a, map);
            bundleM83328a.putString(Constants.KEY_APP_NAME, C14557l.m85616a(C14553h.m85587a()));
            intentM83339c.putExtra(Constants.KEY_ACTION, "action_login");
            intentM83339c.putExtra(Constants.KEY_PARAMS, bundleM83328a);
            intentM83339c.putExtra("appid", this.f58031c.getAppId());
            bundleM83328a.putString(Constants.KEY_PPSTS, C14557l.m85615a(activity, m83179a(bundleM83328a)));
            try {
                this.f57882a = new C13970b(this.f57882a);
                UIListenerManager.getInstance().setListenerWithRequestcode(11101, this.f57882a);
                if (fragment != null) {
                    SLog.m85488d("openSDK_LOG.AuthAgent", "startAssitActivity fragment");
                    m83334a(fragment, intentM83339c, 11101, map);
                } else {
                    SLog.m85488d("openSDK_LOG.AuthAgent", "startAssitActivity activity");
                    m83332a(activity, intentM83339c, 11101, map);
                }
                SLog.m85492i("openSDK_LOG.AuthAgent", "startActionActivity() -- end, found activity for loginIntent");
                C14526e.m85448a().m85449a(0, "LOGIN_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
                objArr[0] = "0";
                objArr[1] = 1;
                return true;
            } catch (Exception e) {
                SLog.m85491e("openSDK_LOG.AuthAgent", "startActionActivity() exception", e);
            }
        }
        C14526e.m85448a().m85449a(1, "LOGIN_CHECK_SDK", Constants.DEFAULT_UIN, this.f58031c.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "startActionActivity fail");
        SLog.m85492i("openSDK_LOG.AuthAgent", "startActionActivity() -- end, no target activity for loginIntent");
        return false;
    }

    /* JADX INFO: renamed from: a */
    private void m83181a(Bundle bundle, Map<String, Object> map) {
        m83186b(bundle, map);
        String strM83185b = m83185b(map);
        if (strM83185b == null || strM83185b.isEmpty()) {
            return;
        }
        bundle.putString(Constants.KEY_ADD_LOGIN_ACCOUNT, strM83185b);
    }

    /* JADX INFO: renamed from: a */
    private String m83179a(Bundle bundle) {
        String string = bundle.getString("status_os");
        String string2 = bundle.getString("status_machine");
        String string3 = bundle.getString("status_version");
        String string4 = bundle.getString("sdkv");
        String string5 = bundle.getString("client_id");
        String string6 = bundle.getString("need_pay");
        String string7 = bundle.getString(Constants.PARAM_PLATFORM_ID);
        SLog.m85488d("openSDK_LOG.AuthAgent", "os=" + string + ", machine=" + string2 + ", version=" + string3 + ", sdkv=" + string4 + ", appId=" + string5 + ", needPay=" + string6 + ", pf=" + string7);
        StringBuilder sb = new StringBuilder();
        if (string == null) {
            string = "";
        }
        sb.append(string);
        if (string2 == null) {
            string2 = "";
        }
        sb.append(string2);
        if (string3 == null) {
            string3 = "";
        }
        sb.append(string3);
        if (string4 == null) {
            string4 = "";
        }
        sb.append(string4);
        if (string5 == null) {
            string5 = "";
        }
        sb.append(string5);
        if (string6 == null) {
            string6 = "";
        }
        sb.append(string6);
        if (string7 == null) {
            string7 = "";
        }
        sb.append(string7);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m83197a(IUiListener iUiListener) {
        String strM85686g;
        SLog.m85492i("openSDK_LOG.AuthAgent", "reportDAU() -- start");
        String accessToken = this.f58031c.getAccessToken();
        String openId = this.f58031c.getOpenId();
        String appId = this.f58031c.getAppId();
        if (!TextUtils.isEmpty(accessToken) && !TextUtils.isEmpty(openId) && !TextUtils.isEmpty(appId)) {
            strM85686g = C14559n.m85686g("tencent&sdk&qazxc***14969%%" + accessToken + appId + openId + "qzone3.4");
        } else {
            strM85686g = "";
        }
        if (TextUtils.isEmpty(strM85686g)) {
            SLog.m85490e("openSDK_LOG.AuthAgent", "reportDAU -- encrytoken is null");
            return;
        }
        Bundle bundleM83328a = m83328a();
        bundleM83328a.putString("encrytoken", strM85686g);
        HttpUtils.requestAsync(this.f58031c, C14553h.m85587a(), "https://openmobile.qq.com/user/user_login_statis", bundleM83328a, "POST", null);
        SLog.m85492i("openSDK_LOG.AuthAgent", "reportDAU() -- end");
    }

    /* JADX INFO: renamed from: com.tencent.connect.auth.AuthAgent$b */
    public class C13970b extends DefaultUiListener {

        /* JADX INFO: renamed from: a */
        WeakReference<IUiListener> f57892a;

        /* JADX INFO: renamed from: c */
        private final String f57894c = "sendinstall";

        /* JADX INFO: renamed from: d */
        private final String f57895d = "installwording";

        /* JADX INFO: renamed from: e */
        private final String f57896e = "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";

        /* JADX INFO: renamed from: com.tencent.connect.auth.AuthAgent$b$a */
        public abstract class a implements View.OnClickListener {

            /* JADX INFO: renamed from: d */
            Dialog f57906d;

            public a(Dialog dialog) {
                this.f57906d = dialog;
            }
        }

        public C13970b(IUiListener iUiListener) {
            this.f57892a = new WeakReference<>(iUiListener);
        }

        /* JADX INFO: renamed from: a */
        private View m83200a(Context context, Drawable drawable, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.density;
            RelativeLayout relativeLayout = new RelativeLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setId(1);
            int i = (int) (60.0f * f);
            int i2 = (int) (f * 14.0f);
            int i3 = (int) (18.0f * f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
            layoutParams.addRule(9);
            layoutParams.setMargins(0, i3, (int) (6.0f * f), i3);
            relativeLayout.addView(imageView, layoutParams);
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(14.0f);
            textView.setGravity(3);
            textView.setIncludeFontPadding(false);
            textView.setPadding(0, 0, 0, 0);
            textView.setLines(2);
            textView.setId(5);
            textView.setMinWidth((int) (185.0f * f));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(1, 1);
            layoutParams2.addRule(6, 1);
            float f2 = 5.0f * f;
            layoutParams2.setMargins(0, 0, (int) f2, 0);
            relativeLayout.addView(textView, layoutParams2);
            View view = new View(context);
            view.setBackgroundColor(Color.rgb(214, 214, 214));
            view.setId(3);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, 2);
            layoutParams3.addRule(3, 1);
            layoutParams3.addRule(5, 1);
            layoutParams3.addRule(7, 5);
            int i4 = (int) (12.0f * f);
            layoutParams3.setMargins(0, 0, 0, i4);
            relativeLayout.addView(view, layoutParams3);
            LinearLayout linearLayout = new LinearLayout(context);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(5, 1);
            layoutParams4.addRule(7, 5);
            layoutParams4.addRule(3, 3);
            Button button = new Button(context);
            button.setText("跳过");
            button.setBackgroundDrawable(m83199a("buttonNegt.png", context));
            button.setTextColor(Color.rgb(36, 97, 131));
            button.setTextSize(20.0f);
            button.setOnClickListener(onClickListener2);
            button.setId(4);
            int i5 = (int) (45.0f * f);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, i5);
            layoutParams5.rightMargin = i2;
            int i6 = (int) (4.0f * f);
            layoutParams5.leftMargin = i6;
            layoutParams5.weight = 1.0f;
            linearLayout.addView(button, layoutParams5);
            Button button2 = new Button(context);
            button2.setText("确定");
            button2.setTextSize(20.0f);
            button2.setTextColor(Color.rgb(255, 255, 255));
            button2.setBackgroundDrawable(m83199a("buttonPost.png", context));
            button2.setOnClickListener(onClickListener);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, i5);
            layoutParams6.weight = 1.0f;
            layoutParams6.rightMargin = i6;
            linearLayout.addView(button2, layoutParams6);
            relativeLayout.addView(linearLayout, layoutParams4);
            ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) (279.0f * f), (int) (f * 163.0f));
            relativeLayout.setPadding(i2, 0, i4, i4);
            relativeLayout.setLayoutParams(layoutParams7);
            relativeLayout.setBackgroundColor(Color.rgb(247, 251, 247));
            PaintDrawable paintDrawable = new PaintDrawable(Color.rgb(247, 251, 247));
            paintDrawable.setCornerRadius(f2);
            relativeLayout.setBackgroundDrawable(paintDrawable);
            return relativeLayout;
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            if (this.f57892a.get() != null) {
                this.f57892a.get().onCancel();
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            boolean z;
            String string;
            if (obj != null) {
                JSONObject jSONObject = (JSONObject) obj;
                boolean zSaveSession = false;
                try {
                    z = jSONObject.getInt("sendinstall") == 1;
                    try {
                        string = jSONObject.getString("installwording");
                    } catch (JSONException unused) {
                        SLog.m85498w("openSDK_LOG.AuthAgent", "FeedConfirmListener onComplete There is no value for sendinstall.");
                        string = "";
                    }
                } catch (JSONException unused2) {
                    z = false;
                }
                String strDecode = URLDecoder.decode(string);
                SLog.m85492i("openSDK_LOG.AuthAgent", " WORDING = " + strDecode + "xx,showConfirmDialog=" + z);
                if (z && !TextUtils.isEmpty(strDecode)) {
                    m83201a(strDecode, this.f57892a.get(), obj);
                    SLog.m85492i("openSDK_LOG.AuthAgent", " WORDING is not empty and return");
                    return;
                }
                IUiListener iUiListener = this.f57892a.get();
                if (iUiListener == null) {
                    SLog.m85492i("openSDK_LOG.AuthAgent", " userListener is null");
                    return;
                }
                if (((BaseApi) AuthAgent.this).f58031c != null) {
                    zSaveSession = ((BaseApi) AuthAgent.this).f58031c.saveSession(jSONObject);
                    SLog.m85492i("openSDK_LOG.AuthAgent", " saveSession saveSuccess=" + zSaveSession);
                }
                if (zSaveSession) {
                    iUiListener.onComplete(obj);
                } else {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PERSISTENCE_FAIL, null));
                }
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            if (this.f57892a.get() != null) {
                this.f57892a.get().onError(uiError);
            }
        }

        /* JADX INFO: renamed from: a */
        private Drawable m83199a(String str, Context context) {
            Bitmap bitmapDecodeStream;
            AssetManager assets = context.getApplicationContext().getAssets();
            Drawable drawableCreateFromStream = null;
            try {
                InputStream inputStreamOpen = assets.open(str);
                if (inputStreamOpen == null) {
                    return null;
                }
                if (str.endsWith(".9.png")) {
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                    } catch (OutOfMemoryError e) {
                        e.printStackTrace();
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    byte[] ninePatchChunk = bitmapDecodeStream.getNinePatchChunk();
                    NinePatch.isNinePatchChunk(ninePatchChunk);
                    return new NinePatchDrawable(bitmapDecodeStream, ninePatchChunk, new Rect(), null);
                }
                drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, str);
                inputStreamOpen.close();
                return drawableCreateFromStream;
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: a */
        private void m83201a(String str, final IUiListener iUiListener, final Object obj) {
            PackageInfo packageInfo;
            if (AuthAgent.this.f57884e != null) {
                Activity activity = (Activity) AuthAgent.this.f57884e.get();
                if (activity == null) {
                    SLog.m85492i("openSDK_LOG.AuthAgent", "showFeedConfrimDialog mActivity.get() null and return");
                    return;
                }
                Dialog dialog = new Dialog(activity);
                dialog.requestWindowFeature(1);
                PackageManager packageManager = activity.getPackageManager();
                try {
                    packageInfo = packageManager.getPackageInfo(activity.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException e) {
                    SLog.m85490e("openSDK_LOG.AuthAgent", "showFeedConfrimDialog exception:" + e.getStackTrace().toString());
                    packageInfo = null;
                }
                Drawable drawableLoadIcon = packageInfo != null ? packageInfo.applicationInfo.loadIcon(packageManager) : null;
                View.OnClickListener onClickListener = new a(dialog) { // from class: com.tencent.connect.auth.AuthAgent.b.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C13970b.this.m83202a();
                        Dialog dialog2 = this.f57906d;
                        if (dialog2 != null && dialog2.isShowing()) {
                            this.f57906d.dismiss();
                        }
                        IUiListener iUiListener2 = iUiListener;
                        if (iUiListener2 != null) {
                            iUiListener2.onComplete(obj);
                        }
                    }
                };
                View.OnClickListener onClickListener2 = new a(dialog) { // from class: com.tencent.connect.auth.AuthAgent.b.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Dialog dialog2 = this.f57906d;
                        if (dialog2 != null && dialog2.isShowing()) {
                            this.f57906d.dismiss();
                        }
                        IUiListener iUiListener2 = iUiListener;
                        if (iUiListener2 != null) {
                            iUiListener2.onComplete(obj);
                        }
                    }
                };
                ColorDrawable colorDrawable = new ColorDrawable();
                colorDrawable.setAlpha(0);
                dialog.getWindow().setBackgroundDrawable(colorDrawable);
                dialog.setContentView(m83200a(activity, drawableLoadIcon, str, onClickListener, onClickListener2));
                dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tencent.connect.auth.AuthAgent.b.3
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IUiListener iUiListener2 = iUiListener;
                        if (iUiListener2 != null) {
                            iUiListener2.onComplete(obj);
                        }
                    }
                });
                if (activity.isFinishing()) {
                    return;
                }
                dialog.show();
                return;
            }
            SLog.m85492i("openSDK_LOG.AuthAgent", "showFeedConfrimDialog mActivity null and return");
        }

        /* JADX INFO: renamed from: a */
        public void m83202a() {
            Activity activity;
            Bundle bundleM83338b = AuthAgent.this.m83338b();
            if (AuthAgent.this.f57884e == null || (activity = (Activity) AuthAgent.this.f57884e.get()) == null) {
                return;
            }
            HttpUtils.requestAsync(((BaseApi) AuthAgent.this).f58031c, activity, "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi", bundleM83338b, "POST", null);
        }
    }
}
