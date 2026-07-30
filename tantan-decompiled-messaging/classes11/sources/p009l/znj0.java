package p009l;

import android.app.Activity;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import l.e51;
import l.j760;
import l.lsi0;
import l.t95;
import l.vwb;
import l.xck0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class znj0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25871a(Throwable th) {
        CrashHelper.c(th);
        m25875e();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX INFO: renamed from: b */
    public static String m25872b() throws Throwable {
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
                        sb.append("\n");
                    }
                    processExec.waitFor();
                    t95.b(bufferedReader2);
                } catch (Exception unused) {
                    bufferedReader = bufferedReader2;
                    t95.b(bufferedReader);
                    if (processExec != null) {
                    }
                    if (sb.length() == 0) {
                        return "can not get fd list";
                    }
                    return sb.toString();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    t95.b(bufferedReader);
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
    public static boolean m25873c(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th == null || thread != Looper.getMainLooper().getThread() || (stackTrace = th.getStackTrace()) == null) {
            return false;
        }
        for (int length = stackTrace.length - 1; length > -1 && stackTrace.length - length <= 25; length--) {
            StackTraceElement stackTraceElement = stackTrace[length];
            if (("android.view.View".equals(stackTraceElement.getClassName()) && "View.java".equals(stackTraceElement.getFileName()) && "performClickInternal".equals(stackTraceElement.getMethodName())) || "performItemClick".equals(stackTraceElement.getMethodName()) || "performLongClickInternal".equals(stackTraceElement.getMethodName()) || ("android.view.View$PerformClick".equals(stackTraceElement.getClassName()) && "View.java".equals(stackTraceElement.getFileName()) && "run".equals(stackTraceElement.getMethodName()))) {
                lsi0.h(R.string.G);
                CrashHelper.c(th);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m25874d(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th == null || thread != Looper.getMainLooper().getThread() || (stackTrace = th.getStackTrace()) == null) {
            return false;
        }
        for (int i = 0; i < stackTrace.length && i <= 20; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if ("android.widget.PopupWindow".equals(stackTraceElement.getClassName()) && "PopupWindow.java".equals(stackTraceElement.getFileName()) && "invokePopup".equals(stackTraceElement.getMethodName())) {
                CrashHelper.c(th);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m25875e() {
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
    public static boolean m25876f(Thread thread, final Throwable th, boolean z) throws Throwable {
        if (th != null && "java.util.concurrent.TimeoutException".equals(th.getClass().getName()) && thread.getName().equals("FinalizerWatchdogDaemon")) {
            e51.G(new Runnable() { // from class: l.ynj0
                @Override // java.lang.Runnable
                public final void run() {
                    znj0.m25871a(th);
                }
            });
            return true;
        }
        if (xck0.c(th, SQLiteFullException.class) || xck0.c(th, SQLiteDiskIOException.class)) {
            if (!g3e.m14781e()) {
                CrashHelper.c(new RuntimeException("has more than 200mb size but has Exception", th));
                return true;
            }
            Activity activity = Act.foreground_() == null ? null : (Activity) Act.foreground_().a.get();
            g3e g3eVar = new g3e();
            if (activity == null) {
                g3eVar.m14787k();
            } else {
                g3eVar.m14785i(activity);
            }
            CrashHelper.c(th);
            zvf0.D("e_crash_diskfull_exception", "", new j760[]{vwb.Y("phone_spare_space", Long.valueOf(g3e.m14782f())), vwb.Y("sdcard_spare_space", Long.valueOf(g3e.m14783g()))});
            return true;
        }
        if (z && (m25873c(thread, th) || m25874d(thread, th))) {
            return true;
        }
        if ((!(th instanceof RuntimeException) || th.getMessage() == null || !th.getMessage().contains("Could not read input channel file descriptors from parcel.")) && (!(th instanceof OutOfMemoryError) || th.getMessage() == null || !th.getMessage().contains("Could not allocate JNI Env"))) {
            return false;
        }
        CrashHelper.c(new RuntimeException("this is fd list when \"" + th.getMessage() + "\" happend \n" + m25872b()));
        return false;
    }
}
