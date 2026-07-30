package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.push.C14748gn;
import com.xiaomi.push.EnumC14742gh;

/* JADX INFO: loaded from: classes2.dex */
public class bpq0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private String f76667a;

    /* JADX INFO: renamed from: b */
    private String f76668b;

    /* JADX INFO: renamed from: c */
    private Context f76669c;

    public bpq0(Context context, String str) {
        this.f76669c = context;
        this.f76667a = str;
    }

    /* JADX INFO: renamed from: a */
    private void m103086a(String str) {
        C14748gn c14748gn = new C14748gn();
        c14748gn.m85653a(str);
        c14748gn.m85651a(System.currentTimeMillis());
        c14748gn.m85652a(EnumC14742gh.ActivityActiveTimeStamp);
        vpq0.m199291c(this.f76669c, c14748gn);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (TextUtils.isEmpty(this.f76667a) || TextUtils.isEmpty(localClassName)) {
            return;
        }
        this.f76668b = "";
        if (!TextUtils.isEmpty("") && !TextUtils.equals(this.f76668b, localClassName)) {
            this.f76667a = "";
            return;
        }
        m103086a(this.f76669c.getPackageName() + "|" + localClassName + ":" + this.f76667a + Constants.SEPARATOR_COMMA + String.valueOf(System.currentTimeMillis() / 1000));
        this.f76667a = "";
        this.f76668b = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.f76668b)) {
            this.f76668b = activity.getLocalClassName();
        }
        this.f76667a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
