package p149l;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class akq implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: d */
    private static final akq f70306d = new akq();

    /* JADX INFO: renamed from: a */
    private Thread.UncaughtExceptionHandler f70307a = null;

    /* JADX INFO: renamed from: b */
    private SimpleDateFormat f70308b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    /* JADX INFO: renamed from: c */
    Application f70309c;

    private akq() {
    }

    /* JADX INFO: renamed from: b */
    public static akq m97169b() {
        return f70306d;
    }

    /* JADX INFO: renamed from: c */
    private void m97170c(Thread thread, Throwable th) {
        String strM97171a = m97171a(th);
        if (strM97171a != null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "APP_CRASH", "crash", strM97171a);
            RecordService.getInstance().flush();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m97171a(Throwable th) {
        String str = String.format(Locale.getDefault(), "FATAL EXCEPTION: %s\nProcess: %s, PID: %d\n%s", Thread.currentThread().getName(), this.f70309c.getApplicationInfo().processName, Integer.valueOf(Process.myPid()), Log.getStackTraceString(th));
        if (!str.contains("com.idv.identity")) {
            return null;
        }
        StringBuilder sb = new StringBuilder("brand=");
        sb.append(Build.BRAND);
        sb.append("\nrom=");
        sb.append(Build.MODEL);
        sb.append("\nos=");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\nsdk=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("\ncrash_time=");
        sb.append(this.f70308b.format(new Date()));
        sb.append("\nthread=");
        sb.append(Thread.currentThread().getName());
        sb.append("\ncpu_arch=");
        sb.append(Build.CPU_ABI);
        sb.append(SignParameters.NEW_LINE);
        try {
            PackageInfo packageInfo = this.f70309c.getPackageManager().getPackageInfo(this.f70309c.getPackageName(), 0);
            sb.append("version_code=");
            sb.append(packageInfo.versionCode);
            sb.append(SignParameters.NEW_LINE);
            sb.append("version_name=");
            sb.append(packageInfo.versionName);
            sb.append(SignParameters.NEW_LINE);
            sb.append("package_name=");
            sb.append(packageInfo.packageName);
            sb.append(SignParameters.NEW_LINE);
            sb.append("requested_permission=");
            sb.append(Arrays.toString(packageInfo.requestedPermissions));
            sb.append(SignParameters.NEW_LINE);
        } catch (Exception e) {
            sb.append("Error retrieving package info: ");
            sb.append(e.getMessage());
            sb.append(SignParameters.NEW_LINE);
        }
        return str + SignParameters.NEW_LINE + ((Object) sb);
    }

    /* JADX INFO: renamed from: d */
    public void m97172d(Context context) {
        this.f70309c = (Application) context.getApplicationContext();
        this.f70307a = Thread.getDefaultUncaughtExceptionHandler();
        try {
            Thread.setDefaultUncaughtExceptionHandler(this);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m97173e() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f70307a;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        } else {
            Thread.setDefaultUncaughtExceptionHandler(null);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f70307a;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        try {
            m97170c(thread, th);
        } catch (Exception unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f70307a;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        }
    }
}
