package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.impl.C0775a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p153l.e3g0;
import p153l.f3g0;
import p153l.piq0;
import p153l.qzv;
import p153l.siq0;
import p153l.uiq0;
import p153l.v6f;
import p153l.wmw;
import p153l.xiq0;
import p153l.yzv;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements v6f {
    private static final String TAG = qzv.m178831i("SystemJobService");
    private final Map<piq0, JobParameters> mJobParameters = new HashMap();
    private final f3g0 mStartStopTokens = f3g0.m123732c(false);
    private siq0 mWorkLauncher;
    private xiq0 mWorkManagerImpl;

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$a */
    @RequiresApi(24)
    public static class C0782a {
        /* JADX INFO: renamed from: a */
        public static String[] m4567a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        /* JADX INFO: renamed from: b */
        public static Uri[] m4568b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$b */
    @RequiresApi(28)
    public static class C0783b {
        /* JADX INFO: renamed from: a */
        public static Network m4569a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$c */
    @RequiresApi(31)
    public static class C0784c {
        /* JADX INFO: renamed from: a */
        public static int m4570a(JobParameters jobParameters) {
            return SystemJobService.stopReason(jobParameters.getStopReason());
        }
    }

    private static void assertMainThread(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        wmw.m207134a("Cannot invoke ", str, " on a background thread");
    }

    public static int stopReason(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i;
            default:
                return -512;
        }
    }

    @Nullable
    private static piq0 workGenerationalIdFromJobParameters(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new piq0(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            xiq0 xiq0VarM211153p = xiq0.m211153p(getApplicationContext());
            this.mWorkManagerImpl = xiq0VarM211153p;
            C0775a c0775aM211160r = xiq0VarM211153p.m211160r();
            this.mWorkLauncher = new uiq0(c0775aM211160r, this.mWorkManagerImpl.m211165w());
            c0775aM211160r.m4514e(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                qzv.m178829e().mo178839k(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                yzv.m218057a("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        xiq0 xiq0Var = this.mWorkManagerImpl;
        if (xiq0Var != null) {
            xiq0Var.m211160r().m4521m(this);
        }
    }

    @Override // p153l.v6f
    @MainThread
    public void onExecuted(@NonNull piq0 piq0Var, boolean z) {
        assertMainThread("onExecuted");
        qzv.m178829e().mo178832a(TAG, piq0Var.getWorkSpecId() + " executed on JobScheduler");
        JobParameters jobParametersRemove = this.mJobParameters.remove(piq0Var);
        this.mStartStopTokens.mo123736e(piq0Var);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        assertMainThread("onStartJob");
        if (this.mWorkManagerImpl == null) {
            qzv.m178829e().mo178832a(TAG, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        piq0 piq0VarWorkGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(jobParameters);
        if (piq0VarWorkGenerationalIdFromJobParameters == null) {
            qzv.m178829e().mo178834c(TAG, "WorkSpec id not found!");
            return false;
        }
        if (this.mJobParameters.containsKey(piq0VarWorkGenerationalIdFromJobParameters)) {
            qzv.m178829e().mo178832a(TAG, "Job is already being executed by SystemJobService: " + piq0VarWorkGenerationalIdFromJobParameters);
            return false;
        }
        qzv.m178829e().mo178832a(TAG, "onStartJob for " + piq0VarWorkGenerationalIdFromJobParameters);
        this.mJobParameters.put(piq0VarWorkGenerationalIdFromJobParameters, jobParameters);
        WorkerParameters.C0762a c0762a = new WorkerParameters.C0762a();
        if (C0782a.m4568b(jobParameters) != null) {
            c0762a.f3422b = Arrays.asList(C0782a.m4568b(jobParameters));
        }
        if (C0782a.m4567a(jobParameters) != null) {
            c0762a.f3421a = Arrays.asList(C0782a.m4567a(jobParameters));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            c0762a.f3423c = C0783b.m4569a(jobParameters);
        }
        this.mWorkLauncher.mo186034e(this.mStartStopTokens.mo123733a(piq0VarWorkGenerationalIdFromJobParameters), c0762a);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        assertMainThread("onStopJob");
        if (this.mWorkManagerImpl == null) {
            qzv.m178829e().mo178832a(TAG, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        piq0 piq0VarWorkGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(jobParameters);
        if (piq0VarWorkGenerationalIdFromJobParameters == null) {
            qzv.m178829e().mo178834c(TAG, "WorkSpec id not found!");
            return false;
        }
        qzv.m178829e().mo178832a(TAG, "onStopJob for " + piq0VarWorkGenerationalIdFromJobParameters);
        this.mJobParameters.remove(piq0VarWorkGenerationalIdFromJobParameters);
        e3g0 e3g0VarMo123736e = this.mStartStopTokens.mo123736e(piq0VarWorkGenerationalIdFromJobParameters);
        if (e3g0VarMo123736e != null) {
            this.mWorkLauncher.m186030a(e3g0VarMo123736e, Build.VERSION.SDK_INT >= 31 ? C0784c.m4570a(jobParameters) : -512);
        }
        return !this.mWorkManagerImpl.m211160r().m4518j(piq0VarWorkGenerationalIdFromJobParameters.getWorkSpecId());
    }
}
