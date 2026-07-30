package p153l;

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
public class zlq implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: d */
    private static final zlq f204990d = new zlq();

    /* JADX INFO: renamed from: a */
    private Thread.UncaughtExceptionHandler f204991a = null;

    /* JADX INFO: renamed from: b */
    private SimpleDateFormat f204992b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    /* JADX INFO: renamed from: c */
    Application f204993c;

    private zlq() {
    }

    /* JADX INFO: renamed from: b */
    public static zlq m220295b() {
        return f204990d;
    }

    /* JADX INFO: renamed from: c */
    private void m220296c(Thread thread, Throwable th) {
        String strM220297a = m220297a(th);
        if (strM220297a != null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "APP_CRASH", "crash", strM220297a);
            RecordService.getInstance().flush();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m220297a(Throwable th) {
        String str = String.format(Locale.getDefault(), "FATAL EXCEPTION: %s\nProcess: %s, PID: %d\n%s", Thread.currentThread().getName(), this.f204993c.getApplicationInfo().processName, Integer.valueOf(Process.myPid()), Log.getStackTraceString(th));
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
        sb.append(this.f204992b.format(new Date()));
        sb.append("\nthread=");
        sb.append(Thread.currentThread().getName());
        sb.append("\ncpu_arch=");
        sb.append(Build.CPU_ABI);
        sb.append(SignParameters.NEW_LINE);
        try {
            PackageInfo packageInfo = this.f204993c.getPackageManager().getPackageInfo(this.f204993c.getPackageName(), 0);
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
    public void m220298d(Context context) {
        this.f204993c = (Application) context.getApplicationContext();
        this.f204991a = Thread.getDefaultUncaughtExceptionHandler();
        try {
            Thread.setDefaultUncaughtExceptionHandler(this);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m220299e() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f204991a;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        } else {
            Thread.setDefaultUncaughtExceptionHandler(null);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f204991a;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        try {
            m220296c(thread, th);
        } catch (Exception unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f204991a;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        }
    }
}
