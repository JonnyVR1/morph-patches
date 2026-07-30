package p153l;

import android.app.job.JobScheduler;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(34)
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Ll/kpq;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "jobScheduler", "a", "(Landroid/app/job/JobScheduler;)Landroid/app/job/JobScheduler;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class kpq {

    @NotNull
    public static final kpq INSTANCE = new kpq();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final JobScheduler m150746a(@NotNull JobScheduler jobScheduler) {
        jobScheduler.getClass();
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }
}
