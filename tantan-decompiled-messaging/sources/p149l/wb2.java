package p149l;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class wb2 {

    /* JADX INFO: renamed from: a */
    public static boolean f185544a = false;

    /* JADX INFO: renamed from: a */
    public static String m202498a(String str, int i, boolean z) {
        StringBuilder sb = new StringBuilder("tantanapp://local_message?");
        if (!TextUtils.isEmpty(str)) {
            sb.append("userId=" + str);
        }
        sb.append("&from=" + i);
        sb.append("&showKeyboard=" + z);
        return sb.toString();
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public static boolean m202499b(Context context, Class<?> cls) {
        List<ActivityManager.AppTask> appTasks;
        ComponentName componentNameResolveActivity = new Intent(context, cls).resolveActivity(context.getPackageManager());
        if (NullChecker.m81303a(componentNameResolveActivity)) {
            try {
                appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                appTasks = null;
            }
            if (!vwb.m200296J(appTasks)) {
                Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                while (it.hasNext()) {
                    if (componentNameResolveActivity.equals(it.next().getTaskInfo().baseActivity)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m202500c() {
        return f185544a;
    }

    /* JADX INFO: renamed from: d */
    public static void m202501d(boolean z) {
        f185544a = z;
    }
}
