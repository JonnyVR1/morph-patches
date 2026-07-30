package p149l;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(24)
public final class not0 {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static final Method f139875b = m160425e();

    /* JADX INFO: renamed from: c */
    @Nullable
    public static final Method f139876c = m160424d();

    /* JADX INFO: renamed from: a */
    public final JobScheduler f139877a;

    public not0(JobScheduler jobScheduler) {
        this.f139877a = jobScheduler;
    }

    /* JADX INFO: renamed from: a */
    public static int m160422a() {
        Method method = f139876c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, null);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m160423c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) sf80.m183894p((JobScheduler) context.getSystemService("jobscheduler"));
        return (f139875b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new not0(jobScheduler).m160426b(jobInfo, str, m160422a(), str2);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Method m160424d() {
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Method m160425e() {
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m160426b(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f139875b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f139877a, jobInfo, str, Integer.valueOf(i), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f139877a.schedule(jobInfo);
    }
}
