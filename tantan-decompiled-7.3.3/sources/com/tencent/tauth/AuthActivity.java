package com.tencent.tauth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14559n;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AuthActivity extends Activity {
    public static final String ACTION_SHARE_PRIZE = "sharePrize";

    /* JADX INFO: renamed from: a */
    private static int f61303a;

    /* JADX INFO: renamed from: b */
    private Map<String, ActionHandler> f61304b = new HashMap();

    public interface ActionHandler {
        void handleAction(Activity activity, Bundle bundle);
    }

    /* JADX INFO: renamed from: a */
    private void m85794a(Uri uri) {
        SLog.m85492i("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
        if (uri != null && uri.toString() != null) {
            String string = "";
            if (!uri.toString().equals("")) {
                String string2 = uri.toString();
                Bundle bundleM85647a = C14559n.m85647a(string2.substring(string2.indexOf("#") + 1));
                if (bundleM85647a == null) {
                    SLog.m85498w("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
                    finish();
                    return;
                }
                String string3 = bundleM85647a.getString("action");
                SLog.m85492i("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + string3);
                if (string3 == null) {
                    finish();
                    return;
                }
                if (string3.equals("shareToQQ") || string3.equals("shareToQzone") || string3.equals("sendToMyComputer") || string3.equals("shareToTroopBar")) {
                    if (string3.equals("shareToQzone") && C14557l.m85617a((Context) this, "com.tencent.mobileqq") != null && C14557l.m85628c(this, "5.2.0") < 0) {
                        int i = f61303a + 1;
                        f61303a = i;
                        if (i == 2) {
                            f61303a = 0;
                            finish();
                            return;
                        }
                    }
                    SLog.m85492i("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
                    Intent intent = new Intent(this, (Class<?>) AssistActivity.class);
                    intent.putExtras(bundleM85647a);
                    intent.setFlags(603979776);
                    startActivity(intent);
                    finish();
                    return;
                }
                if (string3.equals("addToQQFavorites")) {
                    Intent intent2 = getIntent();
                    intent2.putExtras(bundleM85647a);
                    intent2.putExtra(Constants.KEY_ACTION, "action_share");
                    IUiListener listnerWithAction = UIListenerManager.getInstance().getListnerWithAction(string3);
                    if (listnerWithAction != null) {
                        UIListenerManager.getInstance().handleDataToListener(intent2, listnerWithAction);
                    }
                    finish();
                    return;
                }
                if (string3.equals(ACTION_SHARE_PRIZE)) {
                    Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                    try {
                        string = C14559n.m85678d(bundleM85647a.getString("response")).getString("activityid");
                    } catch (Exception e) {
                        SLog.m85491e("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", e);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        launchIntentForPackage.putExtra(ACTION_SHARE_PRIZE, true);
                        Bundle bundle = new Bundle();
                        bundle.putString("activityid", string);
                        launchIntentForPackage.putExtras(bundle);
                    }
                    startActivity(launchIntentForPackage);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetAvatar")) {
                    boolean booleanExtra = getIntent().getBooleanExtra(Constants.KEY_STAY, false);
                    Intent intent3 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent3.putExtra(Constants.KEY_REQUEST_CODE, Constants.REQUEST_EDIT_AVATAR);
                    intent3.putExtra(Constants.KEY_STAY, booleanExtra);
                    intent3.putExtras(bundleM85647a);
                    intent3.setFlags(603979776);
                    startActivity(intent3);
                    finish();
                    return;
                }
                if ("sdkSetDynamicAvatar".equals(string3)) {
                    boolean booleanExtra2 = getIntent().getBooleanExtra(Constants.KEY_STAY, false);
                    Intent intent4 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent4.putExtra(Constants.KEY_REQUEST_CODE, Constants.REQUEST_EDIT_DYNAMIC_AVATAR);
                    intent4.putExtra(Constants.KEY_STAY, booleanExtra2);
                    intent4.putExtras(bundleM85647a);
                    intent4.setFlags(603979776);
                    startActivity(intent4);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetEmotion")) {
                    boolean booleanExtra3 = getIntent().getBooleanExtra(Constants.KEY_STAY, false);
                    Intent intent5 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent5.putExtra(Constants.KEY_REQUEST_CODE, Constants.REQUEST_EDIT_EMOTION);
                    intent5.putExtra(Constants.KEY_STAY, booleanExtra3);
                    intent5.putExtras(bundleM85647a);
                    intent5.setFlags(603979776);
                    startActivity(intent5);
                    finish();
                    return;
                }
                if (string3.equals("bindGroup")) {
                    SLog.m85492i("openSDK_LOG.AuthActivity", "-->handleActionUri--bind group callback.");
                    boolean booleanExtra4 = getIntent().getBooleanExtra(Constants.KEY_STAY, false);
                    Intent intent6 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent6.putExtra(Constants.KEY_REQUEST_CODE, Constants.REQUEST_BIND_GROUP);
                    intent6.putExtra(Constants.KEY_STAY, booleanExtra4);
                    intent6.putExtras(bundleM85647a);
                    intent6.setFlags(603979776);
                    startActivity(intent6);
                    finish();
                    return;
                }
                if (string3.equals("joinGroup")) {
                    SLog.m85492i("openSDK_LOG.AuthActivity", "-->handleActionUri--join group callback. ");
                    boolean booleanExtra5 = getIntent().getBooleanExtra(Constants.KEY_STAY, false);
                    Intent intent7 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent7.putExtra(Constants.KEY_REQUEST_CODE, Constants.REQUEST_JOIN_GROUP);
                    intent7.putExtra(Constants.KEY_STAY, booleanExtra5);
                    intent7.putExtras(bundleM85647a);
                    intent7.setFlags(603979776);
                    startActivity(intent7);
                    finish();
                    return;
                }
                if (!"guildOpen".equals(string3)) {
                    ActionHandler actionHandler = this.f61304b.get(string3);
                    if (actionHandler != null) {
                        actionHandler.handleAction(this, bundleM85647a);
                        return;
                    } else {
                        finish();
                        return;
                    }
                }
                Intent intent8 = new Intent(this, (Class<?>) AssistActivity.class);
                intent8.putExtras(bundleM85647a);
                intent8.putExtra(Constants.KEY_REQUEST_CODE, Constants.REQUEST_GUILD);
                intent8.setFlags(603979776);
                startActivity(intent8);
                finish();
                return;
            }
        }
        SLog.m85498w("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.AuthActivity", "activity finish exception: ", e);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        if (getIntent() == null) {
            SLog.m85498w("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
            finish();
            return;
        }
        try {
            data = getIntent().getData();
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.AuthActivity", "onCreate exception: ", e);
            data = null;
        }
        SLog.m85496v("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + data);
        m85793a();
        try {
            m85794a(data);
        } catch (Exception e2) {
            SLog.m85491e("openSDK_LOG.AuthActivity", "onCreate exception: ", e2);
            finish();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m85793a() {
        this.f61304b.put("action_common_channel", new ActionHandler() { // from class: com.tencent.tauth.AuthActivity.1
            @Override // com.tencent.tauth.AuthActivity.ActionHandler
            public void handleAction(Activity activity, Bundle bundle) {
                SLog.m85492i("openSDK_LOG.AuthActivity", "-->handleActionUri--common channel. ");
                Intent intent = new Intent(activity, (Class<?>) AssistActivity.class);
                intent.putExtras(bundle);
                intent.putExtra(Constants.KEY_REQUEST_CODE, Constants.REQUEST_COMMON_CHANNEL);
                intent.setFlags(603979776);
                AuthActivity.this.startActivity(intent);
                AuthActivity.this.finish();
            }
        });
    }
}
