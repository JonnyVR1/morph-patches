package p153l;

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

/* JADX INFO: loaded from: classes3.dex */
public class dc2 {

    /* JADX INFO: renamed from: a */
    public static boolean f87735a = false;

    /* JADX INFO: renamed from: a */
    public static String m115209a(String str, int i, boolean z) {
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
    public static boolean m115210b(Context context, Class<?> cls) {
        List<ActivityManager.AppTask> appTasks;
        ComponentName componentNameResolveActivity = new Intent(context, cls).resolveActivity(context.getPackageManager());
        if (NullChecker.m82486a(componentNameResolveActivity)) {
            try {
                appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                appTasks = null;
            }
            if (!jyb.m147479J(appTasks)) {
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
    public static boolean m115211c() {
        return f87735a;
    }

    /* JADX INFO: renamed from: d */
    public static void m115212d(boolean z) {
        f87735a = z;
    }
}
