package p149l;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/jnq;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "jobScheduler", "", "Landroid/app/job/JobInfo;", "a", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class jnq {

    @NotNull
    public static final jnq INSTANCE = new jnq();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<JobInfo> m142382a(@NotNull JobScheduler jobScheduler) {
        jobScheduler.getClass();
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        allPendingJobs.getClass();
        return allPendingJobs;
    }
}
