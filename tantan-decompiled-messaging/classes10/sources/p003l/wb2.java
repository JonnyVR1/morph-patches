package p003l;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.FriendSuggestReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wb2 {

    /* JADX INFO: renamed from: a */
    public static boolean f8152a = false;

    /* JADX INFO: renamed from: a */
    public static String m10458a(String str, int i, boolean z) {
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
    public static boolean m10459b(Context context, Class<?> cls) {
        List<ActivityManager.AppTask> appTasks;
        ComponentName componentNameResolveActivity = new Intent(context, cls).resolveActivity(context.getPackageManager());
        if (NullChecker.a(componentNameResolveActivity)) {
            try {
                appTasks = ((ActivityManager) context.getSystemService(FriendSuggestReason.activity)).getAppTasks();
            } catch (Exception e) {
                CrashHelper.c(e);
                appTasks = null;
            }
            if (!vwb.J(appTasks)) {
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
    public static boolean m10460c() {
        return f8152a;
    }

    /* JADX INFO: renamed from: d */
    public static void m10461d(boolean z) {
        f8152a = z;
    }
}
