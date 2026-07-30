package p149l;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.C0761a;
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
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\f"}, m87232d2 = {"Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "", "b", "(Landroid/content/Context;Landroidx/work/a;)Z", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@JvmName
@SourceDebugExtension
public final class nc90 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f138139a;

    static {
        String strM190978i = txv.m190978i("ProcessUtils");
        strM190978i.getClass();
        f138139a = strM190978i;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    /* JADX INFO: renamed from: a */
    public static final String m158927a(Context context) {
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            return it0.INSTANCE.m138096a();
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
            txv.m190976e().mo190980b(f138139a, "Unable to check ActivityThread for processName", th);
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
    public static final boolean m158928b(@NotNull Context context, @NotNull C0761a c0761a) {
        context.getClass();
        c0761a.getClass();
        String strM158927a = m158927a(context);
        String defaultProcessName = c0761a.getDefaultProcessName();
        return (defaultProcessName == null || defaultProcessName.length() == 0) ? Intrinsics.m87488d(strM158927a, context.getApplicationInfo().processName) : Intrinsics.m87488d(strM158927a, c0761a.getDefaultProcessName());
    }
}
