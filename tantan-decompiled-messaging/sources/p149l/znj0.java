package p149l;

import android.app.Activity;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class znj0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m219451a(Throwable th) {
        CrashHelper.m81296c(th);
        m219455e();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX INFO: renamed from: b */
    public static String m219452b() throws Throwable {
        Process processExec;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            processExec = Runtime.getRuntime().exec("ls -a -l /proc/" + Process.myPid() + "/fd");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                try {
                    HashMap map = new HashMap();
                    for (String line = bufferedReader2.readLine(); line != null; line = bufferedReader2.readLine()) {
                        String[] strArrSplit = line.split("->");
                        if (strArrSplit.length == 2) {
                            String str = strArrSplit[1];
                            if (!TextUtils.isEmpty(str)) {
                                String strTrim = str.trim();
                                if (strTrim.startsWith("socket")) {
                                    strTrim = "socket";
                                } else if (strTrim.startsWith("anon_inode")) {
                                    strTrim = "anon_inode";
                                } else if (strTrim.startsWith("pipe")) {
                                    strTrim = "pipe";
                                }
                                Integer num = (Integer) map.get(strTrim);
                                map.put(strTrim, num != null ? Integer.valueOf(num.intValue() + 1) : 1);
                            }
                        }
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        sb.append((String) entry.getKey());
                        sb.append(":");
                        sb.append(entry.getValue());
                        sb.append(SignParameters.NEW_LINE);
                    }
                    processExec.waitFor();
                    t95.m187604b(bufferedReader2);
                } catch (Exception unused) {
                    bufferedReader = bufferedReader2;
                    t95.m187604b(bufferedReader);
                    if (processExec != null) {
                    }
                    if (sb.length() == 0) {
                        return "can not get fd list";
                    }
                    return sb.toString();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    t95.m187604b(bufferedReader);
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
            processExec = null;
        } catch (Throwable th3) {
            th = th3;
            processExec = null;
        }
        processExec.destroy();
        if (sb.length() == 0) {
            return "can not get fd list";
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m219453c(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th == null || thread != Looper.getMainLooper().getThread() || (stackTrace = th.getStackTrace()) == null) {
            return false;
        }
        for (int length = stackTrace.length - 1; length > -1 && stackTrace.length - length <= 25; length--) {
            StackTraceElement stackTraceElement = stackTrace[length];
            if (("android.view.View".equals(stackTraceElement.getClassName()) && "View.java".equals(stackTraceElement.getFileName()) && "performClickInternal".equals(stackTraceElement.getMethodName())) || "performItemClick".equals(stackTraceElement.getMethodName()) || "performLongClickInternal".equals(stackTraceElement.getMethodName()) || ("android.view.View$PerformClick".equals(stackTraceElement.getClassName()) && "View.java".equals(stackTraceElement.getFileName()) && "run".equals(stackTraceElement.getMethodName()))) {
                lsi0.m151578h(R$string.f17325G);
                CrashHelper.m81296c(th);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m219454d(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th == null || thread != Looper.getMainLooper().getThread() || (stackTrace = th.getStackTrace()) == null) {
            return false;
        }
        for (int i = 0; i < stackTrace.length && i <= 20; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if ("android.widget.PopupWindow".equals(stackTraceElement.getClassName()) && "PopupWindow.java".equals(stackTraceElement.getFileName()) && "invokePopup".equals(stackTraceElement.getMethodName())) {
                CrashHelper.m81296c(th);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m219455e() {
        try {
            Class<?> cls = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon");
            Field declaredField = cls.getDeclaredField("INSTANCE");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getSuperclass().getDeclaredMethod("stop", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(declaredField.get(null), null);
            Method declaredMethod2 = cls.getSuperclass().getDeclaredMethod("start", null);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(declaredField.get(null), null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m219456f(Thread thread, final Throwable th, boolean z) throws Throwable {
        if (th != null && "java.util.concurrent.TimeoutException".equals(th.getClass().getName()) && thread.getName().equals("FinalizerWatchdogDaemon")) {
            e51.m114742G(new Runnable() { // from class: l.ynj0
                @Override // java.lang.Runnable
                public final void run() {
                    znj0.m219451a(th);
                }
            });
            return true;
        }
        if (xck0.m208122c(th, SQLiteFullException.class) || xck0.m208122c(th, SQLiteDiskIOException.class)) {
            if (!g3e.m124249e()) {
                CrashHelper.m81296c(new RuntimeException("has more than 200mb size but has Exception", th));
                return true;
            }
            Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
            g3e g3eVar = new g3e();
            if (activity == null) {
                g3eVar.m124255k();
            } else {
                g3eVar.m124253i(activity);
            }
            CrashHelper.m81296c(th);
            zvf0.m220371D("e_crash_diskfull_exception", "", vwb.m200311Y("phone_spare_space", Long.valueOf(g3e.m124250f())), vwb.m200311Y("sdcard_spare_space", Long.valueOf(g3e.m124251g())));
            return true;
        }
        if (z && (m219453c(thread, th) || m219454d(thread, th))) {
            return true;
        }
        if ((!(th instanceof RuntimeException) || th.getMessage() == null || !th.getMessage().contains("Could not read input channel file descriptors from parcel.")) && (!(th instanceof OutOfMemoryError) || th.getMessage() == null || !th.getMessage().contains("Could not allocate JNI Env"))) {
            return false;
        }
        CrashHelper.m81296c(new RuntimeException("this is fd list when \"" + th.getMessage() + "\" happend \n" + m219452b()));
        return false;
    }
}
