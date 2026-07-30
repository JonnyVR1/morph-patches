package p149l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(14)
public class uiq0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private Set<String> f176683a = new HashSet();

    /* JADX INFO: renamed from: a */
    private static void m193957a(Application application) {
        application.registerActivityLifecycleCallbacks(new uiq0());
    }

    /* JADX INFO: renamed from: b */
    public static void m193958b(Context context) {
        m193957a((Application) context.getApplicationContext());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        try {
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            String stringExtra = intent.getStringExtra("messageId");
            int intExtra = intent.getIntExtra("eventMessageType", -1);
            if (TextUtils.isEmpty(stringExtra) || intExtra <= 0 || this.f176683a.contains(stringExtra)) {
                return;
            }
            this.f176683a.add(stringExtra);
            if (intExtra == 3000) {
                nqq0.m160662a(activity.getApplicationContext()).m160668f(activity.getPackageName(), mqq0.m155982e(intExtra), stringExtra, 3008, null);
            } else if (intExtra == 1000) {
                nqq0.m160662a(activity.getApplicationContext()).m160668f(activity.getPackageName(), mqq0.m155982e(intExtra), stringExtra, 1008, null);
            }
        } catch (Throwable th) {
            ilq0.m137025B("An error occurred in onActivityResumed method: " + th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
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
