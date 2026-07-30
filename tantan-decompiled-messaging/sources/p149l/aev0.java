package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class aev0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final Context f69102a;

    /* JADX INFO: renamed from: b */
    public final zzq f69103b;

    /* JADX INFO: renamed from: c */
    public final List f69104c;

    public aev0(Context context, zzq zzqVar, List list) {
        this.f69102a = context;
        this.f69103b = zzqVar;
        this.f69104c = list;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) fas0.f96657a.m115379e()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            vny0.m199080r();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f69102a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", className);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f69103b.zze);
            bundle3.putInt("height", this.f69103b.zzb);
            bundle2.putBundle("size", bundle3);
            if (!this.f69104c.isEmpty()) {
                List list = this.f69104c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
