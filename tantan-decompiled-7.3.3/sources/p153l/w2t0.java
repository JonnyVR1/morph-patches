package p153l;

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
import com.p051p1.mobile.putong.data.Device;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public final class w2t0 implements y2t0 {

    /* JADX INFO: renamed from: f */
    public static final Object f186934f = new Object();

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public static y2t0 f186935g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public static y2t0 f186936h;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public static y2t0 f186937i;

    /* JADX INFO: renamed from: b */
    public final Context f186939b;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f186941d;

    /* JADX INFO: renamed from: e */
    public final zzcei f186942e;

    /* JADX INFO: renamed from: a */
    public final Object f186938a = new Object();

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f186940c = new WeakHashMap();

    public w2t0(Context context, zzcei zzceiVar) {
        tkw0.m191601a();
        this.f186941d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f186939b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f186942e = zzceiVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    /* JADX INFO: renamed from: c */
    public static y2t0 m204592c(Context context) {
        synchronized (f186934f) {
            try {
                if (f186935g == null) {
                    if (((Boolean) qjs0.f158044e.m149974e()).booleanValue()) {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167983F7)).booleanValue()) {
                            f186935g = new x2t0();
                        } else {
                            f186935g = new w2t0(context, zzcei.m13612F());
                        }
                    } else {
                        f186935g = new x2t0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f186935g;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[Catch: all -> 0x004e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0041, B:22:0x0052, B:23:0x0053, B:24:0x0062, B:25:0x0069, B:14:0x0039, B:15:0x0040), top: B:32:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: d */
    public static y2t0 m204593d(Context context, zzcei zzceiVar) {
        synchronized (f186934f) {
            if (f186937i == null) {
                if (((Boolean) qjs0.f158044e.m149974e()).booleanValue()) {
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f167983F7)).booleanValue()) {
                        f186937i = new x2t0();
                    } else {
                        w2t0 w2t0Var = new w2t0(context, zzceiVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (w2t0Var.f186938a) {
                                w2t0Var.f186940c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new v2t0(w2t0Var, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new u2t0(w2t0Var, Thread.getDefaultUncaughtExceptionHandler()));
                        f186937i = w2t0Var;
                    }
                } else {
                    f186937i = new x2t0();
                }
            }
        }
        return f186937i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0040), top: B:19:0x0003 }] */
    /* JADX INFO: renamed from: e */
    public static y2t0 m204594e(Context context) {
        synchronized (f186934f) {
            try {
                if (f186936h == null) {
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f167995G7)).booleanValue()) {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167983F7)).booleanValue()) {
                            f186936h = new x2t0();
                        } else {
                            f186936h = new w2t0(context, zzcei.m13612F());
                        }
                    } else {
                        f186936h = new x2t0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f186936h;
    }

    /* JADX INFO: renamed from: f */
    public static String m204595f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m204596g(Throwable th) {
        return epw0.m121874c(obt0.m167039h(m204595f(th)));
    }

    @Override // p153l.y2t0
    /* JADX INFO: renamed from: a */
    public final void mo204597a(Throwable th, String str, float f) {
        Throwable th2;
        String packageName;
        Handler handler = obt0.f146613b;
        boolean zIsCallerInstantApp = false;
        if (((Boolean) qjs0.f158045f.m149974e()).booleanValue()) {
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
                    if (obt0.m167040q(stackTraceElement.getClassName())) {
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
        String strM204595f = m204595f(th);
        String strM204596g = ((Boolean) jas0.m144075c().m176505a(sgs0.f168020I8)).booleanValue() ? m204596g(th) : "";
        double d = f;
        double dRandom = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (dRandom < d) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                zIsCallerInstantApp = Wrappers.packageManager(this.f186939b).isCallerInstantApp();
            } catch (Throwable th4) {
                dct0.m115296e("Error fetching instant app info", th4);
            }
            try {
                packageName = this.f186939b.getPackageName();
            } catch (Throwable unused) {
                dct0.m115298g("Cannot obtain package name, proceeding.");
                packageName = "unknown";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (!str3.startsWith(str2)) {
                str3 = str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str3;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter(Device.TYPE, str3).appendQueryParameter("js", this.f186942e.zza).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strM204595f).appendQueryParameter("eids", TextUtils.join(Constants.SEPARATOR_COMMA, jas0.m144073a().m120796a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "610756093").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(qjs0.f158042c.m149974e())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f186939b))).appendQueryParameter("lite", true != this.f186942e.zze ? "0" : "1");
            if (!TextUtils.isEmpty(strM204596g)) {
                builderAppendQueryParameter2.appendQueryParameter("hash", strM204596g);
            }
            arrayList2.add(builderAppendQueryParameter2.toString());
            for (final String str4 : arrayList2) {
                final hct0 hct0Var = new hct0(null);
                this.f186941d.execute(new Runnable() { // from class: l.t2t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        hct0Var.zza(str4);
                    }
                });
            }
        }
    }

    @Override // p153l.y2t0
    /* JADX INFO: renamed from: b */
    public final void mo204598b(Throwable th, String str) {
        mo204597a(th, str, 1.0f);
    }

    /* JADX INFO: renamed from: h */
    public final void m204599h(Thread thread, Throwable th) {
        if (th != null) {
            boolean zM167040q = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zM167040q |= obt0.m167040q(stackTraceElement.getClassName());
                    zEquals |= w2t0.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zM167040q || zEquals) {
                return;
            }
            mo204597a(th, "", 1.0f);
        }
    }
}
