package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.push.C14896gn;
import com.xiaomi.push.EnumC14890gh;

/* JADX INFO: loaded from: classes2.dex */
public class hyq0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private String f112151a;

    /* JADX INFO: renamed from: b */
    private String f112152b;

    /* JADX INFO: renamed from: c */
    private Context f112153c;

    public hyq0(Context context, String str) {
        this.f112153c = context;
        this.f112151a = str;
    }

    /* JADX INFO: renamed from: a */
    private void m137765a(String str) {
        C14896gn c14896gn = new C14896gn();
        c14896gn.m86824a(str);
        c14896gn.m86822a(System.currentTimeMillis());
        c14896gn.m86823a(EnumC14890gh.ActivityActiveTimeStamp);
        bzq0.m107245c(this.f112153c, c14896gn);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (TextUtils.isEmpty(this.f112151a) || TextUtils.isEmpty(localClassName)) {
            return;
        }
        this.f112152b = "";
        if (!TextUtils.isEmpty("") && !TextUtils.equals(this.f112152b, localClassName)) {
            this.f112151a = "";
            return;
        }
        m137765a(this.f112153c.getPackageName() + "|" + localClassName + ":" + this.f112151a + Constants.SEPARATOR_COMMA + String.valueOf(System.currentTimeMillis() / 1000));
        this.f112151a = "";
        this.f112152b = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.f112152b)) {
            this.f112152b = activity.getLocalClassName();
        }
        this.f112151a = String.valueOf(System.currentTimeMillis() / 1000);
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
