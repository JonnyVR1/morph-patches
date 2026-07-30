package p153l;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.C0763a;
import androidx.work.WorkManager;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\f"}, m88121d2 = {"Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "", "b", "(Landroid/content/Context;Landroidx/work/a;)Z", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
@SourceDebugExtension
public final class rk90 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f163549a;

    static {
        String strM178831i = qzv.m178831i("ProcessUtils");
        strM178831i.getClass();
        f163549a = strM178831i;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    /* JADX INFO: renamed from: a */
    public static final String m181781a(Context context) {
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            return ot0.INSTANCE.m169066a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, WorkManager.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            objInvoke.getClass();
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            qzv.m178829e().mo178833b(f163549a, "Unable to check ActivityThread for processName", th);
        }
        int iMyPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m181782b(@NotNull Context context, @NotNull C0763a c0763a) {
        context.getClass();
        c0763a.getClass();
        String strM181781a = m181781a(context);
        String defaultProcessName = c0763a.getDefaultProcessName();
        return (defaultProcessName == null || defaultProcessName.length() == 0) ? Intrinsics.m88377d(strM181781a, context.getApplicationInfo().processName) : Intrinsics.m88377d(strM181781a, c0763a.getDefaultProcessName());
    }
}
