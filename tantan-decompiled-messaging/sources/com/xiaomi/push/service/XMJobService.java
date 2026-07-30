package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import p149l.fvq0;
import p149l.ikq0;
import p149l.ilq0;
import p149l.uqq0;

/* JADX INFO: loaded from: classes2.dex */
public class XMJobService extends Service {

    /* JADX INFO: renamed from: a */
    static Service f62750a;

    /* JADX INFO: renamed from: a */
    private IBinder f62751a = null;

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMJobService$a */
    @TargetApi(21)
    public static class JobServiceC14794a extends JobService {

        /* JADX INFO: renamed from: a */
        Binder f62752a;

        /* JADX INFO: renamed from: a */
        private Handler f62753a;

        /* JADX INFO: renamed from: com.xiaomi.push.service.XMJobService$a$a */
        public static class a extends Handler {

            /* JADX INFO: renamed from: a */
            JobService f62754a;

            public a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f62754a = jobService;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                JobParameters jobParameters = (JobParameters) message.obj;
                ilq0.m137040m("Job finished " + jobParameters.getJobId());
                this.f62754a.jobFinished(jobParameters, false);
                if (jobParameters.getJobId() == 1) {
                    uqq0.m194997d(false);
                }
            }
        }

        public JobServiceC14794a(Service service) {
            this.f62752a = null;
            this.f62752a = (Binder) ikq0.m136882e(this, "onBind", new Intent());
            ikq0.m136882e(this, "attachBaseContext", service);
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            ilq0.m137040m("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, (Class<?>) XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f62753a == null) {
                this.f62753a = new a(this);
            }
            Handler handler = this.f62753a;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            ilq0.m137040m("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f62751a;
        return iBinder != null ? iBinder : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f62751a = new JobServiceC14794a(this).f62752a;
        f62750a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f62750a = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int iOnStartCommand = super.onStartCommand(intent, i, i2);
        if (fvq0.m123356j(this)) {
            return iOnStartCommand;
        }
        return 2;
    }
}
