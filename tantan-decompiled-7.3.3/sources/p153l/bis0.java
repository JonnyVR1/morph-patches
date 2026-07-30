package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bis0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public yzb f76910a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public uzb f76911b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public xzb f76912c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public zhs0 f76913d;

    /* JADX INFO: renamed from: g */
    public static boolean m104509g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(lqx0.m155512a(context));
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final yzb m104510a() {
        uzb uzbVar = this.f76911b;
        if (uzbVar == null) {
            this.f76910a = null;
        } else if (this.f76910a == null) {
            this.f76910a = uzbVar.m198722d(null);
        }
        return this.f76910a;
    }

    /* JADX INFO: renamed from: b */
    public final void m104511b(Activity activity) {
        String strM155512a;
        if (this.f76911b == null && (strM155512a = lqx0.m155512a(activity)) != null) {
            mqx0 mqx0Var = new mqx0(this);
            this.f76912c = mqx0Var;
            uzb.m198719a(activity, strM155512a, mqx0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m104512c(uzb uzbVar) {
        this.f76911b = uzbVar;
        uzbVar.m198724f(0L);
        zhs0 zhs0Var = this.f76913d;
        if (zhs0Var != null) {
            zhs0Var.zza();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m104513d() {
        this.f76911b = null;
        this.f76910a = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m104514e(zhs0 zhs0Var) {
        this.f76913d = zhs0Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m104515f(Activity activity) {
        xzb xzbVar = this.f76912c;
        if (xzbVar == null) {
            return;
        }
        activity.unbindService(xzbVar);
        this.f76911b = null;
        this.f76910a = null;
        this.f76912c = null;
    }
}
