package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gnv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final Context f105159a;

    /* JADX INFO: renamed from: b */
    public final zzq f105160b;

    /* JADX INFO: renamed from: c */
    public final List f105161c;

    public gnv0(Context context, zzq zzqVar, List list) {
        this.f105159a = context;
        this.f105160b = zzqVar;
        this.f105161c = list;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) ljs0.f132388a.m149974e()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            bxy0.m106934r();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f105159a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", className);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f105160b.zze);
            bundle3.putInt("height", this.f105160b.zzb);
            bundle2.putBundle("size", bundle3);
            if (!this.f105161c.isEmpty()) {
                List list = this.f105161c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
