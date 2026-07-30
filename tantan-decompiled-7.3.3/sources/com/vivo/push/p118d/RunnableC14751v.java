package com.vivo.push.p118d;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.vivo.push.util.C14795p;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.vivo.push.d.v */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14751v implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f61851a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f61852b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C14750u f61853c;

    public RunnableC14751v(C14750u c14750u, Context context, Map map) {
        this.f61853c = c14750u;
        this.f61851a = context;
        this.f61852b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String packageName = this.f61851a.getPackageName();
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f61851a.getSystemService("activity")).getRunningTasks(100);
            if (runningTasks != null) {
                Iterator<ActivityManager.RunningTaskInfo> it = runningTasks.iterator();
                while (it.hasNext()) {
                    ComponentName componentName = it.next().topActivity;
                    if (componentName.getPackageName().equals(packageName)) {
                        C14795p.m86192d("OnNotificationClickTask", "topClassName=" + componentName.getClassName());
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        intent.setFlags(335544320);
                        C14750u.m86025b(intent, this.f61852b);
                        this.f61851a.startActivity(intent);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            C14795p.m86180a("OnNotificationClickTask", "start recentIntent is error", e);
        }
        Intent launchIntentForPackage = this.f61851a.getPackageManager().getLaunchIntentForPackage(this.f61851a.getPackageName());
        if (launchIntentForPackage == null) {
            C14795p.m86179a("OnNotificationClickTask", "LaunchIntent is null");
            return;
        }
        launchIntentForPackage.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        C14750u.m86025b(launchIntentForPackage, this.f61852b);
        this.f61851a.startActivity(launchIntentForPackage);
    }
}
