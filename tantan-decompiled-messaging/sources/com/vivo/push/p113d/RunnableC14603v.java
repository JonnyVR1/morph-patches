package com.vivo.push.p113d;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.vivo.push.util.C14647p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.vivo.push.d.v */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14603v implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f61004a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f61005b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C14602u f61006c;

    public RunnableC14603v(C14602u c14602u, Context context, Map map) {
        this.f61006c = c14602u;
        this.f61004a = context;
        this.f61005b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String packageName = this.f61004a.getPackageName();
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f61004a.getSystemService("activity")).getRunningTasks(100);
            if (runningTasks != null) {
                Iterator<ActivityManager.RunningTaskInfo> it = runningTasks.iterator();
                while (it.hasNext()) {
                    ComponentName componentName = it.next().topActivity;
                    if (componentName.getPackageName().equals(packageName)) {
                        C14647p.m85021d("OnNotificationClickTask", "topClassName=" + componentName.getClassName());
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        intent.setFlags(335544320);
                        C14602u.m84854b(intent, this.f61005b);
                        this.f61004a.startActivity(intent);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            C14647p.m85009a("OnNotificationClickTask", "start recentIntent is error", e);
        }
        Intent launchIntentForPackage = this.f61004a.getPackageManager().getLaunchIntentForPackage(this.f61004a.getPackageName());
        if (launchIntentForPackage == null) {
            C14647p.m85008a("OnNotificationClickTask", "LaunchIntent is null");
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        C14602u.m84854b(launchIntentForPackage, this.f61005b);
        this.f61004a.startActivity(launchIntentForPackage);
    }
}
