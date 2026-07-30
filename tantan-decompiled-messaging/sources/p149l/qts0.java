package p149l;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzcei;
import com.p046p1.mobile.putong.data.Device;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public final class qts0 implements sts0 {

    /* JADX INFO: renamed from: f */
    public static final Object f156385f = new Object();

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public static sts0 f156386g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public static sts0 f156387h;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public static sts0 f156388i;

    /* JADX INFO: renamed from: b */
    public final Context f156390b;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f156392d;

    /* JADX INFO: renamed from: e */
    public final zzcei f156393e;

    /* JADX INFO: renamed from: a */
    public final Object f156389a = new Object();

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f156391c = new WeakHashMap();

    public qts0(Context context, zzcei zzceiVar) {
        nbw0.m158842a();
        this.f156392d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f156390b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f156393e = zzceiVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    /* JADX INFO: renamed from: c */
    public static sts0 m176477c(Context context) {
        synchronized (f156385f) {
            try {
                if (f156386g == null) {
                    if (((Boolean) kas0.f122149e.m115379e()).booleanValue()) {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131912F7)).booleanValue()) {
                            f156386g = new rts0();
                        } else {
                            f156386g = new qts0(context, zzcei.m13558F());
                        }
                    } else {
                        f156386g = new rts0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f156386g;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[Catch: all -> 0x004e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0041, B:22:0x0052, B:23:0x0053, B:24:0x0062, B:25:0x0069, B:14:0x0039, B:15:0x0040), top: B:32:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: d */
    public static sts0 m176478d(Context context, zzcei zzceiVar) {
        synchronized (f156385f) {
            if (f156388i == null) {
                if (((Boolean) kas0.f122149e.m115379e()).booleanValue()) {
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131912F7)).booleanValue()) {
                        f156388i = new rts0();
                    } else {
                        qts0 qts0Var = new qts0(context, zzceiVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (qts0Var.f156389a) {
                                qts0Var.f156391c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new pts0(qts0Var, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new ots0(qts0Var, Thread.getDefaultUncaughtExceptionHandler()));
                        f156388i = qts0Var;
                    }
                } else {
                    f156388i = new rts0();
                }
            }
        }
        return f156388i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0040), top: B:19:0x0003 }] */
    /* JADX INFO: renamed from: e */
    public static sts0 m176479e(Context context) {
        synchronized (f156385f) {
            try {
                if (f156387h == null) {
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131924G7)).booleanValue()) {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131912F7)).booleanValue()) {
                            f156387h = new rts0();
                        } else {
                            f156387h = new qts0(context, zzcei.m13558F());
                        }
                    } else {
                        f156387h = new rts0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f156387h;
    }

    /* JADX INFO: renamed from: f */
    public static String m176480f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m176481g(Throwable th) {
        return yfw0.m214595c(i2t0.m134086h(m176480f(th)));
    }

    @Override // p149l.sts0
    /* JADX INFO: renamed from: a */
    public final void mo176482a(Throwable th, String str, float f) {
        Throwable th2;
        String packageName;
        Handler handler = i2t0.f110583b;
        boolean zIsCallerInstantApp = false;
        if (((Boolean) kas0.f122150f.m115379e()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (i2t0.m134087q(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String strM176480f = m176480f(th);
        String strM176481g = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131949I8)).booleanValue() ? m176481g(th) : "";
        double d = f;
        double dRandom = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (dRandom < d) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                zIsCallerInstantApp = Wrappers.packageManager(this.f156390b).isCallerInstantApp();
            } catch (Throwable th4) {
                x2t0.m206867e("Error fetching instant app info", th4);
            }
            try {
                packageName = this.f156390b.getPackageName();
            } catch (Throwable unused) {
                x2t0.m206869g("Cannot obtain package name, proceeding.");
                packageName = "unknown";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (!str3.startsWith(str2)) {
                str3 = str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str3;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter(Device.TYPE, str3).appendQueryParameter("js", this.f156393e.zza).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strM176480f).appendQueryParameter("eids", TextUtils.join(Constants.SEPARATOR_COMMA, d1s0.m109675a().m213241a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "610756093").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(kas0.f122147c.m115379e())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f156390b))).appendQueryParameter("lite", true != this.f156393e.zze ? "0" : "1");
            if (!TextUtils.isEmpty(strM176481g)) {
                builderAppendQueryParameter2.appendQueryParameter("hash", strM176481g);
            }
            arrayList2.add(builderAppendQueryParameter2.toString());
            for (final String str4 : arrayList2) {
                final b3t0 b3t0Var = new b3t0(null);
                this.f156392d.execute(new Runnable() { // from class: l.nts0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b3t0Var.zza(str4);
                    }
                });
            }
        }
    }

    @Override // p149l.sts0
    /* JADX INFO: renamed from: b */
    public final void mo176483b(Throwable th, String str) {
        mo176482a(th, str, 1.0f);
    }

    /* JADX INFO: renamed from: h */
    public final void m176484h(Thread thread, Throwable th) {
        if (th != null) {
            boolean zM134087q = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zM134087q |= i2t0.m134087q(stackTraceElement.getClassName());
                    zEquals |= qts0.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zM134087q || zEquals) {
                return;
            }
            mo176482a(th, "", 1.0f);
        }
    }
}
