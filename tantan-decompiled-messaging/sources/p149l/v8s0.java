package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class v8s0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public kyb f180585a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public gyb f180586b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public jyb f180587c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public t8s0 f180588d;

    /* JADX INFO: renamed from: g */
    public static boolean m197514g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(fhx0.m121470a(context));
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final kyb m197515a() {
        gyb gybVar = this.f180586b;
        if (gybVar == null) {
            this.f180585a = null;
        } else if (this.f180585a == null) {
            this.f180585a = gybVar.m128690d(null);
        }
        return this.f180585a;
    }

    /* JADX INFO: renamed from: b */
    public final void m197516b(Activity activity) {
        String strM121470a;
        if (this.f180586b == null && (strM121470a = fhx0.m121470a(activity)) != null) {
            ghx0 ghx0Var = new ghx0(this);
            this.f180587c = ghx0Var;
            gyb.m128687a(activity, strM121470a, ghx0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m197517c(gyb gybVar) {
        this.f180586b = gybVar;
        gybVar.m128692f(0L);
        t8s0 t8s0Var = this.f180588d;
        if (t8s0Var != null) {
            t8s0Var.zza();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m197518d() {
        this.f180586b = null;
        this.f180585a = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m197519e(t8s0 t8s0Var) {
        this.f180588d = t8s0Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m197520f(Activity activity) {
        jyb jybVar = this.f180587c;
        if (jybVar == null) {
            return;
        }
        activity.unbindService(jybVar);
        this.f180586b = null;
        this.f180585a = null;
        this.f180587c = null;
    }
}
