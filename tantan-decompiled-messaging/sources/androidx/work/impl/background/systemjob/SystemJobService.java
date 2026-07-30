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
import androidx.work.impl.C0773a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p149l.byv;
import p149l.k9q0;
import p149l.n9q0;
import p149l.p9q0;
import p149l.r5f;
import p149l.s9q0;
import p149l.txv;
import p149l.vuf0;
import p149l.wuf0;
import p149l.xjw;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements r5f {
    private static final String TAG = txv.m190978i("SystemJobService");
    private final Map<k9q0, JobParameters> mJobParameters = new HashMap();
    private final wuf0 mStartStopTokens = wuf0.m205622c(false);
    private n9q0 mWorkLauncher;
    private s9q0 mWorkManagerImpl;

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$a */
    @RequiresApi(24)
    public static class C0780a {
        /* JADX INFO: renamed from: a */
        public static String[] m4565a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        /* JADX INFO: renamed from: b */
        public static Uri[] m4566b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$b */
    @RequiresApi(28)
    public static class C0781b {
        /* JADX INFO: renamed from: a */
        public static Network m4567a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$c */
    @RequiresApi(31)
    public static class C0782c {
        /* JADX INFO: renamed from: a */
        public static int m4568a(JobParameters jobParameters) {
            return SystemJobService.stopReason(jobParameters.getStopReason());
        }
    }

    private static void assertMainThread(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        xjw.m209754a("Cannot invoke ", str, " on a background thread");
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
    private static k9q0 workGenerationalIdFromJobParameters(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new k9q0(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            s9q0 s9q0VarM182740p = s9q0.m182740p(getApplicationContext());
            this.mWorkManagerImpl = s9q0VarM182740p;
            C0773a c0773aM182747r = s9q0VarM182740p.m182747r();
            this.mWorkLauncher = new p9q0(c0773aM182747r, this.mWorkManagerImpl.m182752w());
            c0773aM182747r.m4512e(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                txv.m190976e().mo190986k(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                byv.m104511a("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        s9q0 s9q0Var = this.mWorkManagerImpl;
        if (s9q0Var != null) {
            s9q0Var.m182747r().m4519m(this);
        }
    }

    @Override // p149l.r5f
    @MainThread
    public void onExecuted(@NonNull k9q0 k9q0Var, boolean z) {
        assertMainThread("onExecuted");
        txv.m190976e().mo190979a(TAG, k9q0Var.getWorkSpecId() + " executed on JobScheduler");
        JobParameters jobParametersRemove = this.mJobParameters.remove(k9q0Var);
        this.mStartStopTokens.mo141294e(k9q0Var);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        assertMainThread("onStartJob");
        if (this.mWorkManagerImpl == null) {
            txv.m190976e().mo190979a(TAG, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        k9q0 k9q0VarWorkGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(jobParameters);
        if (k9q0VarWorkGenerationalIdFromJobParameters == null) {
            txv.m190976e().mo190981c(TAG, "WorkSpec id not found!");
            return false;
        }
        if (this.mJobParameters.containsKey(k9q0VarWorkGenerationalIdFromJobParameters)) {
            txv.m190976e().mo190979a(TAG, "Job is already being executed by SystemJobService: " + k9q0VarWorkGenerationalIdFromJobParameters);
            return false;
        }
        txv.m190976e().mo190979a(TAG, "onStartJob for " + k9q0VarWorkGenerationalIdFromJobParameters);
        this.mJobParameters.put(k9q0VarWorkGenerationalIdFromJobParameters, jobParameters);
        WorkerParameters.C0760a c0760a = new WorkerParameters.C0760a();
        if (C0780a.m4566b(jobParameters) != null) {
            c0760a.f3422b = Arrays.asList(C0780a.m4566b(jobParameters));
        }
        if (C0780a.m4565a(jobParameters) != null) {
            c0760a.f3421a = Arrays.asList(C0780a.m4565a(jobParameters));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            c0760a.f3423c = C0781b.m4567a(jobParameters);
        }
        this.mWorkLauncher.mo158563e(this.mStartStopTokens.mo141292a(k9q0VarWorkGenerationalIdFromJobParameters), c0760a);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        assertMainThread("onStopJob");
        if (this.mWorkManagerImpl == null) {
            txv.m190976e().mo190979a(TAG, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        k9q0 k9q0VarWorkGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(jobParameters);
        if (k9q0VarWorkGenerationalIdFromJobParameters == null) {
            txv.m190976e().mo190981c(TAG, "WorkSpec id not found!");
            return false;
        }
        txv.m190976e().mo190979a(TAG, "onStopJob for " + k9q0VarWorkGenerationalIdFromJobParameters);
        this.mJobParameters.remove(k9q0VarWorkGenerationalIdFromJobParameters);
        vuf0 vuf0VarMo141294e = this.mStartStopTokens.mo141294e(k9q0VarWorkGenerationalIdFromJobParameters);
        if (vuf0VarMo141294e != null) {
            this.mWorkLauncher.m158559a(vuf0VarMo141294e, Build.VERSION.SDK_INT >= 31 ? C0782c.m4568a(jobParameters) : -512);
        }
        return !this.mWorkManagerImpl.m182747r().m4516j(k9q0VarWorkGenerationalIdFromJobParameters.getWorkSpecId());
    }
}
