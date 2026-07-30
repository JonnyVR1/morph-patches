package com.tencent.connect.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.connect.p078b.C13823a;
import com.tencent.open.log.SLog;
import com.tencent.open.p105b.C14363e;
import com.tencent.open.p105b.C14366h;
import com.tencent.open.utils.C14384b;
import com.tencent.open.utils.C14396n;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import io.agora.rtc2.internal.AudioRoutingController;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AssistActivity extends Activity {
    public static final String EXTRA_INTENT = "openSDK_LOG.AssistActivity.ExtraIntent";
    public static final String KEY_EXTRA_PENDING_INTENT = "key_extra_pending_intent";
    public static final String KEY_REQUEST_ORIENTATION = "key_request_orientation";

    /* JADX INFO: renamed from: d */
    private String f57176d;

    /* JADX INFO: renamed from: e */
    private QQStayReceiver f57177e;

    /* JADX INFO: renamed from: f */
    private boolean f57178f;

    /* JADX INFO: renamed from: c */
    private boolean f57175c = false;

    /* JADX INFO: renamed from: a */
    protected boolean f57173a = false;

    /* JADX INFO: renamed from: b */
    protected Handler f57174b = new Handler() { // from class: com.tencent.connect.common.AssistActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0 && !AssistActivity.this.isFinishing()) {
                SLog.m84315w("openSDK_LOG.AssistActivity", "-->finish by timeout");
                AssistActivity.this.finish();
            }
        }
    };

    public class QQStayReceiver extends BroadcastReceiver {
        private QQStayReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str = "#";
            Intent intent2 = new Intent();
            String stringExtra = intent.getStringExtra(Constants.KEY_ACTION);
            if (stringExtra == null || stringExtra.isEmpty()) {
                intent2.putExtra(Constants.KEY_ACTION, "action_share");
            } else {
                SLog.m84309i("openSDK_LOG.AssistActivity", "QQStayReceiver action: ".concat(stringExtra));
                intent2.putExtra(Constants.KEY_ACTION, stringExtra);
            }
            try {
                Uri uri = (Uri) intent.getParcelableExtra("uriData");
                String string = uri.toString();
                if (!string.contains("#")) {
                    str = "?";
                }
                for (String str2 : string.substring(string.indexOf(str) + 1).split("&")) {
                    String[] strArrSplit = str2.split("=");
                    intent2.putExtra(strArrSplit[0], strArrSplit[1]);
                }
                intent2.setData(uri);
            } catch (Exception e) {
                SLog.m84309i("openSDK_LOG.AssistActivity", "QQStayReceiver parse uri error : " + e.getMessage());
                intent2.putExtra(LovePlanetStage.result, "error");
                intent2.putExtra("response", "parse error.");
            }
            AssistActivity.this.setResult(-1, intent2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX INFO: renamed from: a */
    private void m82142a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        IUiListener listnerWithAction;
        String string = bundle.getString("viaShareType");
        String string2 = bundle.getString("callbackAction");
        String string3 = bundle.getString("url");
        String string4 = bundle.getString("openId");
        String string5 = bundle.getString(RemoteConfigConstants.RequestFieldKey.APP_ID);
        if (!"shareToQQ".equals(string2)) {
            if ("shareToQzone".equals(string2)) {
                str3 = Constants.VIA_SHARE_TO_QZONE;
                str4 = Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE;
            } else {
                str = "";
                str2 = str;
            }
            if (C14396n.m84478a(this, string3)) {
                C14363e.m84265a().m84269a(string4, string5, str, str2, "3", "0", string, "0", "2", "0");
            } else {
                listnerWithAction = UIListenerManager.getInstance().getListnerWithAction(string2);
                if (listnerWithAction != null) {
                    listnerWithAction.onError(new UiError(-6, Constants.MSG_OPEN_BROWSER_ERROR, null));
                }
                C14363e.m84265a().m84269a(string4, string5, str, str2, "3", "1", string, "0", "2", "0");
                finish();
            }
            getIntent().removeExtra("shareH5");
        }
        str3 = Constants.VIA_SHARE_TO_QQ;
        str4 = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        str2 = str4;
        str = str3;
        if (C14396n.m84478a(this, string3)) {
            listnerWithAction = UIListenerManager.getInstance().getListnerWithAction(string2);
            if (listnerWithAction != null) {
                listnerWithAction.onError(new UiError(-6, Constants.MSG_OPEN_BROWSER_ERROR, null));
            }
            C14363e.m84265a().m84269a(string4, string5, str, str2, "3", "1", string, "0", "2", "0");
            finish();
        } else {
            C14363e.m84265a().m84269a(string4, string5, str, str2, "3", "0", string, "0", "2", "0");
        }
        getIntent().removeExtra("shareH5");
    }

    public static Intent getAssistActivityIntent(Context context) {
        return new Intent(context, (Class<?>) AssistActivity.class);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder("--onActivityResult--requestCode: ");
        sb.append(i);
        sb.append(" | resultCode: ");
        sb.append(i2);
        sb.append("data = null ? ");
        sb.append(intent == null);
        SLog.m84309i("openSDK_LOG.AssistActivity", sb.toString());
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            return;
        }
        if (C13823a.m82140a(this)) {
            SLog.m84307e("openSDK_LOG.AssistActivity", "onActivityResult callPack: " + getCallingPackage());
            return;
        }
        if (intent != null) {
            intent.putExtra(Constants.KEY_ACTION, "action_login");
        }
        setResultData(i, intent);
        if (this.f57178f) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.tencent.connect.common.AssistActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    SLog.m84309i("openSDK_LOG.AssistActivity", "onActivityResult finish delay");
                    AssistActivity.this.finish();
                }
            }, 200L);
        } else {
            SLog.m84309i("openSDK_LOG.AssistActivity", "onActivityResult finish immediate");
            finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x018f A[Catch: all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:35:0x011c, B:49:0x014c, B:63:0x0176, B:65:0x018f, B:66:0x019b, B:48:0x0149), top: B:85:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a1  */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        int i;
        IUiListener listnerWithRequestCode;
        AssistActivity assistActivity = this;
        assistActivity.getWindow().addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        boolean z = true;
        assistActivity.requestWindowFeature(1);
        C14384b.m84377a(assistActivity);
        super.onCreate(bundle);
        if (C13823a.m82140a(assistActivity)) {
            SLog.m84307e("openSDK_LOG.AssistActivity", "--onCreate-- callPack: " + assistActivity.getCallingPackage());
            assistActivity.finish();
            return;
        }
        assistActivity.f57178f = assistActivity.getIntent().getBooleanExtra(Constants.KEY_RESTORE_LANDSCAPE, false);
        SLog.m84309i("openSDK_LOG.AssistActivity", "--onCreate-- mRestoreLandscape=" + assistActivity.f57178f);
        if (assistActivity.getIntent() == null) {
            SLog.m84307e("openSDK_LOG.AssistActivity", "-->onCreate--getIntent() returns null");
            assistActivity.finish();
        }
        Intent intent = (Intent) assistActivity.getIntent().getParcelableExtra(EXTRA_INTENT);
        int intExtra = intent == null ? 0 : intent.getIntExtra(Constants.KEY_REQUEST_CODE, 0);
        assistActivity.f57176d = intent == null ? "" : intent.getStringExtra("appid");
        Bundle bundleExtra = assistActivity.getIntent().getBundleExtra("h5_share_data");
        if (bundle != null) {
            assistActivity.f57175c = bundle.getBoolean("RESTART_FLAG");
            assistActivity.f57173a = bundle.getBoolean("RESUME_FLAG", false);
        }
        if (assistActivity.f57175c) {
            SLog.m84305d("openSDK_LOG.AssistActivity", "is restart");
            return;
        }
        if (bundleExtra != null) {
            SLog.m84315w("openSDK_LOG.AssistActivity", "--onCreate--h5 bundle not null, will open browser");
            assistActivity.m82142a(bundleExtra);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) assistActivity.getIntent().getParcelableExtra(KEY_EXTRA_PENDING_INTENT);
        if (intent == null || pendingIntent == null) {
            StringBuilder sb = new StringBuilder("--onCreate--activityIntent or pendingIntent is null. activityIntent is null? ");
            sb.append(intent == null);
            sb.append(", pendingIntent is null? ");
            sb.append(pendingIntent == null);
            SLog.m84307e("openSDK_LOG.AssistActivity", sb.toString());
            assistActivity.finish();
            return;
        }
        SLog.m84309i("openSDK_LOG.AssistActivity", "--onCreate--activityIntent not null, will start activity, reqcode = " + intExtra);
        try {
            IntentFilter intentFilter = new IntentFilter(Constants.SHARE_QQ_AND_STAY + intent.getData().getQueryParameter("share_id"));
            if (assistActivity.f57177e == null) {
                assistActivity.f57177e = new QQStayReceiver();
            }
            assistActivity.registerReceiver(assistActivity.f57177e, intentFilter);
        } catch (Exception e) {
            SLog.m84309i("openSDK_LOG.AssistActivity", "registerReceiver exception : " + e.getMessage());
        }
        try {
            try {
                try {
                    IntentSender intentSender = pendingIntent.getIntentSender();
                    if (intent.getBooleanExtra(Constants.FOR_RESULT, true)) {
                        try {
                            assistActivity.startIntentSenderForResult(intentSender, intExtra, null, 0, 0, 0);
                            i = intExtra;
                            assistActivity = this;
                        } catch (ActivityNotFoundException e2) {
                            e = e2;
                            i = intExtra;
                            assistActivity = this;
                            SLog.m84307e("openSDK_LOG.AssistActivity", "--onCreate--startActivity exception, ActivityNotFoundException : " + e);
                            listnerWithRequestCode = UIListenerManager.getInstance().getListnerWithRequestCode(i);
                            if (listnerWithRequestCode != null) {
                                listnerWithRequestCode.onError(new UiError(-20, Constants.MSG_PARAM_VERSION_TOO_LOW, ""));
                            }
                            assistActivity.m82141a(intent, false);
                            return;
                        } catch (Exception e3) {
                            e = e3;
                            assistActivity = this;
                            try {
                                SLog.m84307e("openSDK_LOG.AssistActivity", "--onCreate--startActivity exception: " + e.getMessage());
                                SLog.m84307e("openSDK_LOG.AssistActivity", "--onCreate--startActException");
                                assistActivity.finish();
                                return;
                            } catch (Throwable th) {
                                th = th;
                                if (z) {
                                    SLog.m84307e("openSDK_LOG.AssistActivity", "--onCreate--startActException");
                                    assistActivity.finish();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            assistActivity = this;
                            z = false;
                            if (z) {
                                SLog.m84307e("openSDK_LOG.AssistActivity", "--onCreate--startActException");
                                assistActivity.finish();
                            }
                            throw th;
                        }
                    } else {
                        i = intExtra;
                        assistActivity = this;
                        try {
                            assistActivity.startIntentSender(intentSender, null, 0, 0, 0);
                        } catch (ActivityNotFoundException e4) {
                            e = e4;
                            SLog.m84307e("openSDK_LOG.AssistActivity", "--onCreate--startActivity exception, ActivityNotFoundException : " + e);
                            listnerWithRequestCode = UIListenerManager.getInstance().getListnerWithRequestCode(i);
                            if (listnerWithRequestCode != null) {
                                listnerWithRequestCode.onError(new UiError(-20, Constants.MSG_PARAM_VERSION_TOO_LOW, ""));
                            }
                            assistActivity.m82141a(intent, false);
                            return;
                        }
                    }
                    assistActivity.m82141a(intent, true);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (ActivityNotFoundException e5) {
                e = e5;
                i = intExtra;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        SLog.m84309i("openSDK_LOG.AssistActivity", "-->onDestroy");
        super.onDestroy();
        QQStayReceiver qQStayReceiver = this.f57177e;
        if (qQStayReceiver != null) {
            unregisterReceiver(qQStayReceiver);
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        SLog.m84309i("openSDK_LOG.AssistActivity", "--onNewIntent");
        super.onNewIntent(intent);
        C13823a.m82139a(intent);
        int intExtra = intent.getIntExtra(Constants.KEY_REQUEST_CODE, -1);
        SLog.m84309i("openSDK_LOG.AssistActivity", "--onNewIntent callbackRequestCode= " + intExtra);
        if (intExtra == 10108) {
            intent.putExtra(Constants.KEY_ACTION, "action_request_avatar");
            if (intent.getBooleanExtra(Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10109) {
            intent.putExtra(Constants.KEY_ACTION, "action_request_set_emotion");
            if (intent.getBooleanExtra(Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10110) {
            intent.putExtra(Constants.KEY_ACTION, "action_request_dynamic_avatar");
            if (intent.getBooleanExtra(Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10111) {
            intent.putExtra(Constants.KEY_ACTION, "joinGroup");
            if (intent.getBooleanExtra(Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10112) {
            intent.putExtra(Constants.KEY_ACTION, "bindGroup");
            if (intent.getBooleanExtra(Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10113) {
            intent.putExtra(Constants.KEY_ACTION, intent.getStringExtra("action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            SLog.m84309i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        if (intExtra != 10114) {
            intent.putExtra(Constants.KEY_ACTION, "action_share");
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            SLog.m84309i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        intent.putExtra(Constants.KEY_ACTION, intent.getStringExtra("action"));
        setResult(-1, intent);
        if (isFinishing()) {
            return;
        }
        SLog.m84309i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
        finish();
    }

    @Override // android.app.Activity
    public void onPause() {
        SLog.m84309i("openSDK_LOG.AssistActivity", "-->onPause");
        this.f57174b.removeMessages(0);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        SLog.m84309i("openSDK_LOG.AssistActivity", "-->onResume");
        super.onResume();
        Intent intent = getIntent();
        if (intent.getBooleanExtra("is_login", false)) {
            return;
        }
        if (!intent.getBooleanExtra("is_qq_mobile_share", false) && this.f57175c && !isFinishing()) {
            finish();
        }
        if (!this.f57173a) {
            this.f57173a = true;
        } else {
            this.f57174b.sendMessage(this.f57174b.obtainMessage(0));
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        SLog.m84309i("openSDK_LOG.AssistActivity", "--onSaveInstanceState--");
        bundle.putBoolean("RESTART_FLAG", true);
        bundle.putBoolean("RESUME_FLAG", this.f57173a);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        SLog.m84309i("openSDK_LOG.AssistActivity", "-->onStart");
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        SLog.m84309i("openSDK_LOG.AssistActivity", "-->onStop");
        super.onStop();
        if (Tencent.disableResetOrientation) {
            return;
        }
        try {
            int intExtra = getIntent().getIntExtra(KEY_REQUEST_ORIENTATION, -1);
            SLog.m84309i("openSDK_LOG.AssistActivity", "getRequestedOrientation= " + intExtra);
            if (intExtra != -1) {
                setRequestedOrientation(intExtra);
            }
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.AssistActivity", "reset requestedOrientation catch exception", th);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (C14384b.m84378b(this)) {
            return;
        }
        super.setRequestedOrientation(i);
    }

    public void setResultData(int i, Intent intent) {
        if (intent == null) {
            SLog.m84315w("openSDK_LOG.AssistActivity", "--setResultData--intent is null, setResult ACTIVITY_CANCEL");
            setResult(0);
            if (i == 11101) {
                C14363e.m84265a().m84267a("", this.f57176d, "2", "1", "7", "2");
                return;
            }
            return;
        }
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_RESPONSE);
            SLog.m84305d("openSDK_LOG.AssistActivity", "--setResultDataForLogin-- ");
            if (TextUtils.isEmpty(stringExtra)) {
                SLog.m84315w("openSDK_LOG.AssistActivity", "--setResultData--response is empty, setResult ACTIVITY_OK");
                setResult(-1, intent);
                return;
            }
            JSONObject jSONObject = new JSONObject(stringExtra);
            String strOptString = jSONObject.optString("openid");
            String strOptString2 = jSONObject.optString("access_token");
            String strOptString3 = jSONObject.optString("proxy_code");
            long jOptLong = jSONObject.optLong("proxy_expires_in");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                SLog.m84309i("openSDK_LOG.AssistActivity", "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                setResult(-1, intent);
                C14363e.m84265a().m84267a(strOptString, this.f57176d, "2", "1", "7", "0");
            } else if (!TextUtils.isEmpty(strOptString3) && jOptLong != 0) {
                SLog.m84309i("openSDK_LOG.AssistActivity", "--setResultData--proxy_code and proxy_expires_in are valid");
                setResult(-1, intent);
            } else {
                SLog.m84315w("openSDK_LOG.AssistActivity", "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                setResult(0, intent);
                C14363e.m84265a().m84267a("", this.f57176d, "2", "1", "7", "1");
            }
        } catch (Exception e) {
            SLog.m84307e("openSDK_LOG.AssistActivity", "--setResultData--parse response failed");
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m82141a(Intent intent, boolean z) {
        if (intent == null) {
            SLog.m84305d("openSDK_LOG.AssistActivity", "reportStartActivitySuccess, but intent is null.");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra(Constants.KEY_PASS_REPORT_VIA_PARAM);
        if (bundleExtra != null) {
            C14396n.m84463a(bundleExtra, z ? "0" : "1");
            C14366h.m84276a().m84278a(bundleExtra, this.f57176d, intent.getBooleanExtra(Constants.KEY_PASS_REPORT_VIA_TIMELY, false));
        }
    }
}
