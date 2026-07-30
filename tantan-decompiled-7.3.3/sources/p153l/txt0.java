package p153l;

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
public final class txt0 {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static final Method f176604b = m193536e();

    /* JADX INFO: renamed from: c */
    @Nullable
    public static final Method f176605c = m193535d();

    /* JADX INFO: renamed from: a */
    public final JobScheduler f176606a;

    public txt0(JobScheduler jobScheduler) {
        this.f176606a = jobScheduler;
    }

    /* JADX INFO: renamed from: a */
    public static int m193533a() {
        Method method = f176605c;
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
    public static int m193534c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) xn80.m212111p((JobScheduler) context.getSystemService("jobscheduler"));
        return (f176604b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new txt0(jobScheduler).m193537b(jobInfo, str, m193533a(), str2);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Method m193535d() {
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
    public static Method m193536e() {
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
    public final int m193537b(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f176604b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f176606a, jobInfo, str, Integer.valueOf(i), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f176606a.schedule(jobInfo);
    }
}
