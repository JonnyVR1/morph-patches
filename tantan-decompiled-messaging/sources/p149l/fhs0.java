package p149l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class fhs0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Intent m121446a(Uri uri, Context context, ptr0 ptr0Var, View view, myv0 myv0Var) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static final Intent m121447b(Intent intent, ResolveInfo resolveInfo, Context context, ptr0 ptr0Var, View view, myv0 myv0Var) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final ResolveInfo m121448c(Intent intent, Context context, ptr0 ptr0Var, View view, myv0 myv0Var) {
        return m121449d(intent, new ArrayList(), context, ptr0Var, view, myv0Var);
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static final ResolveInfo m121449d(Intent intent, ArrayList arrayList, Context context, ptr0 ptr0Var, View view, myv0 myv0Var) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            vny0.m199079q().m212290w(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
            return resolveInfo;
        }
    }
}
