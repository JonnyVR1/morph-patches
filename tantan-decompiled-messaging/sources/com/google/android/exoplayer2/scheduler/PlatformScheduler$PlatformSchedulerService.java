package com.google.android.exoplayer2.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.offline.DownloadService;
import p149l.jwv;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iM10901b = new Requirements(extras.getInt(DownloadService.KEY_REQUIREMENTS)).m10901b(this);
        if (iM10901b == 0) {
            vck0.m197850d1(this, new Intent((String) p11.m167011e(extras.getString("service_action"))).setPackage((String) p11.m167011e(extras.getString("service_package"))));
            return false;
        }
        jwv.m143689i("PlatformScheduler", "Requirements not met: " + iM10901b);
        jobFinished(jobParameters, true);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
