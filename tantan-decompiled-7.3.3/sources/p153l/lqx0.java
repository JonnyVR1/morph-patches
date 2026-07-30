package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lqx0 {

    /* JADX INFO: renamed from: a */
    public static String f133254a;

    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX INFO: renamed from: a */
    public static String m155512a(Context context) {
        String str = f133254a;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f133254a = null;
        } else if (arrayList.size() == 1) {
            f133254a = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                if (listQueryIntentActivities2 != null && listQueryIntentActivities2.size() != 0) {
                    Iterator<ResolveInfo> it = listQueryIntentActivities2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ResolveInfo next = it.next();
                            IntentFilter intentFilter = next.filter;
                            if (intentFilter == null || intentFilter.countDataAuthorities() == 0 || intentFilter.countDataPaths() == 0 || next.activityInfo == null) {
                            }
                        } else if (arrayList.contains(str2)) {
                            f133254a = str2;
                        }
                        if (arrayList.contains("com.android.chrome")) {
                            f133254a = "com.android.chrome";
                        } else if (arrayList.contains("com.chrome.beta")) {
                            f133254a = "com.chrome.beta";
                        } else if (arrayList.contains("com.chrome.dev")) {
                            f133254a = "com.chrome.dev";
                        } else if (arrayList.contains("com.google.android.apps.chrome")) {
                            f133254a = "com.google.android.apps.chrome";
                        }
                    }
                } else if (arrayList.contains(str2)) {
                    f133254a = str2;
                } else if (arrayList.contains("com.android.chrome")) {
                    f133254a = "com.android.chrome";
                } else if (arrayList.contains("com.chrome.beta")) {
                    f133254a = "com.chrome.beta";
                } else if (arrayList.contains("com.chrome.dev")) {
                    f133254a = "com.chrome.dev";
                } else if (arrayList.contains("com.google.android.apps.chrome")) {
                    f133254a = "com.google.android.apps.chrome";
                }
            } catch (RuntimeException unused) {
                Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
            }
        } else if (arrayList.contains("com.android.chrome")) {
            f133254a = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f133254a = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f133254a = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f133254a = "com.google.android.apps.chrome";
        }
        return f133254a;
    }
}
