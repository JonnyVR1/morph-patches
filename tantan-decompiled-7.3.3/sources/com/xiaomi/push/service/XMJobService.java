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
import p153l.a0r0;
import p153l.l4r0;
import p153l.otq0;
import p153l.ouq0;

/* JADX INFO: loaded from: classes2.dex */
public class XMJobService extends Service {

    /* JADX INFO: renamed from: a */
    static Service f63597a;

    /* JADX INFO: renamed from: a */
    private IBinder f63598a = null;

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMJobService$a */
    @TargetApi(21)
    public static class JobServiceC14942a extends JobService {

        /* JADX INFO: renamed from: a */
        Binder f63599a;

        /* JADX INFO: renamed from: a */
        private Handler f63600a;

        /* JADX INFO: renamed from: com.xiaomi.push.service.XMJobService$a$a */
        public static class a extends Handler {

            /* JADX INFO: renamed from: a */
            JobService f63601a;

            public a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f63601a = jobService;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                JobParameters jobParameters = (JobParameters) message.obj;
                ouq0.m169393m("Job finished " + jobParameters.getJobId());
                this.f63601a.jobFinished(jobParameters, false);
                if (jobParameters.getJobId() == 1) {
                    a0r0.m95412d(false);
                }
            }
        }

        public JobServiceC14942a(Service service) {
            this.f63599a = null;
            this.f63599a = (Binder) otq0.m169167e(this, "onBind", new Intent());
            otq0.m169167e(this, "attachBaseContext", service);
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            ouq0.m169393m("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, (Class<?>) XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f63600a == null) {
                this.f63600a = new a(this);
            }
            Handler handler = this.f63600a;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            ouq0.m169393m("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f63598a;
        return iBinder != null ? iBinder : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f63598a = new JobServiceC14942a(this).f63599a;
        f63597a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f63597a = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int iOnStartCommand = super.onStartCommand(intent, i, i2);
        if (l4r0.m152825j(this)) {
            return iOnStartCommand;
        }
        return 2;
    }
}
