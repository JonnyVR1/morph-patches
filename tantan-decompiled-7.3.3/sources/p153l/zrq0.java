package p153l;

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
public class zrq0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private Set<String> f205787a = new HashSet();

    /* JADX INFO: renamed from: a */
    private static void m221182a(Application application) {
        application.registerActivityLifecycleCallbacks(new zrq0());
    }

    /* JADX INFO: renamed from: b */
    public static void m221183b(Context context) {
        m221182a((Application) context.getApplicationContext());
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
            if (TextUtils.isEmpty(stringExtra) || intExtra <= 0 || this.f205787a.contains(stringExtra)) {
                return;
            }
            this.f205787a.add(stringExtra);
            if (intExtra == 3000) {
                tzq0.m193695a(activity.getApplicationContext()).m193701f(activity.getPackageName(), szq0.m188668e(intExtra), stringExtra, 3008, null);
            } else if (intExtra == 1000) {
                tzq0.m193695a(activity.getApplicationContext()).m193701f(activity.getPackageName(), szq0.m188668e(intExtra), stringExtra, 1008, null);
            }
        } catch (Throwable th) {
            ouq0.m169378B("An error occurred in onActivityResumed method: " + th);
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
