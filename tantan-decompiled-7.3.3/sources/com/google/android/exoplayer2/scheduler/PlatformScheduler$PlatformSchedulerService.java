package com.google.android.exoplayer2.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.offline.DownloadService;
import p153l.bmk0;
import p153l.kyv;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iM10955b = new Requirements(extras.getInt(DownloadService.KEY_REQUIREMENTS)).m10955b(this);
        if (iM10955b == 0) {
            bmk0.m105128d1(this, new Intent((String) w11.m204369e(extras.getString("service_action"))).setPackage((String) w11.m204369e(extras.getString("service_package"))));
            return false;
        }
        kyv.m152151i("PlatformScheduler", "Requirements not met: " + iM10955b);
        jobFinished(jobParameters, true);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
