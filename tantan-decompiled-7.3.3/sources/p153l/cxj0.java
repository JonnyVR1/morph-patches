package p153l;

import android.app.Activity;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class cxj0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m113036a(Throwable th) {
        CrashHelper.m82479c(th);
        m113040e();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX INFO: renamed from: b */
    public static String m113037b() throws Throwable {
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
                    ua5.m195158b(bufferedReader2);
                } catch (Exception unused) {
                    bufferedReader = bufferedReader2;
                    ua5.m195158b(bufferedReader);
                    if (processExec != null) {
                    }
                    if (sb.length() == 0) {
                        return "can not get fd list";
                    }
                    return sb.toString();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    ua5.m195158b(bufferedReader);
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
    public static boolean m113038c(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th == null || thread != Looper.getMainLooper().getThread() || (stackTrace = th.getStackTrace()) == null) {
            return false;
        }
        for (int length = stackTrace.length - 1; length > -1 && stackTrace.length - length <= 25; length--) {
            StackTraceElement stackTraceElement = stackTrace[length];
            if (("android.view.View".equals(stackTraceElement.getClassName()) && "View.java".equals(stackTraceElement.getFileName()) && "performClickInternal".equals(stackTraceElement.getMethodName())) || "performItemClick".equals(stackTraceElement.getMethodName()) || "performLongClickInternal".equals(stackTraceElement.getMethodName()) || ("android.view.View$PerformClick".equals(stackTraceElement.getClassName()) && "View.java".equals(stackTraceElement.getFileName()) && "run".equals(stackTraceElement.getMethodName()))) {
                o1j0.m165634h(R$string.f18044G);
                CrashHelper.m82479c(th);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m113039d(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th == null || thread != Looper.getMainLooper().getThread() || (stackTrace = th.getStackTrace()) == null) {
            return false;
        }
        for (int i = 0; i < stackTrace.length && i <= 20; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if ("android.widget.PopupWindow".equals(stackTraceElement.getClassName()) && "PopupWindow.java".equals(stackTraceElement.getFileName()) && "invokePopup".equals(stackTraceElement.getMethodName())) {
                CrashHelper.m82479c(th);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m113040e() {
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
    public static boolean m113041f(Thread thread, final Throwable th, boolean z) throws Throwable {
        if (th != null && "java.util.concurrent.TimeoutException".equals(th.getClass().getName()) && thread.getName().equals("FinalizerWatchdogDaemon")) {
            l51.m152887G(new Runnable() { // from class: l.bxj0
                @Override // java.lang.Runnable
                public final void run() {
                    cxj0.m113036a(th);
                }
            });
            return true;
        }
        if (dmk0.m116964c(th, SQLiteFullException.class) || dmk0.m116964c(th, SQLiteDiskIOException.class)) {
            if (!u4e.m194480e()) {
                CrashHelper.m82479c(new RuntimeException("has more than 200mb size but has Exception", th));
                return true;
            }
            Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
            u4e u4eVar = new u4e();
            if (activity == null) {
                u4eVar.m194486k();
            } else {
                u4eVar.m194484i(activity);
            }
            CrashHelper.m82479c(th);
            i4g0.m138495D("e_crash_diskfull_exception", "", jyb.m147494Y("phone_spare_space", Long.valueOf(u4e.m194481f())), jyb.m147494Y("sdcard_spare_space", Long.valueOf(u4e.m194482g())));
            return true;
        }
        if (z && (m113038c(thread, th) || m113039d(thread, th))) {
            return true;
        }
        if ((!(th instanceof RuntimeException) || th.getMessage() == null || !th.getMessage().contains("Could not read input channel file descriptors from parcel.")) && (!(th instanceof OutOfMemoryError) || th.getMessage() == null || !th.getMessage().contains("Could not allocate JNI Env"))) {
            return false;
        }
        CrashHelper.m82479c(new RuntimeException("this is fd list when \"" + th.getMessage() + "\" happend \n" + m113037b()));
        return false;
    }
}
