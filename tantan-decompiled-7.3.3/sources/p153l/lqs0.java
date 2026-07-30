package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class lqs0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Intent m155504a(Uri uri, Context context, v2s0 v2s0Var, View view, s7w0 s7w0Var) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static final Intent m155505b(Intent intent, ResolveInfo resolveInfo, Context context, v2s0 v2s0Var, View view, s7w0 s7w0Var) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final ResolveInfo m155506c(Intent intent, Context context, v2s0 v2s0Var, View view, s7w0 s7w0Var) {
        return m155507d(intent, new ArrayList(), context, v2s0Var, view, s7w0Var);
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static final ResolveInfo m155507d(Intent intent, ArrayList arrayList, Context context, v2s0 v2s0Var, View view, s7w0 s7w0Var) {
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
            bxy0.m106933q().m120275w(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
            return resolveInfo;
        }
    }
}
