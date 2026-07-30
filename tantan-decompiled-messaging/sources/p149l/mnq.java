package p149l;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.C0761a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f*\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "a", "(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)Ljava/lang/String;", "Ljava/lang/String;", "TAG", "Landroid/app/job/JobScheduler;", "c", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "wmJobScheduler", "", "Landroid/app/job/JobInfo;", "b", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "safePendingJobs", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class mnq {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f134770a;

    static {
        String strM190978i = txv.m190978i("SystemJobScheduler");
        strM190978i.getClass();
        f134770a = strM190978i;
    }

    @RequiresApi(23)
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m155530a(@NotNull Context context, @NotNull WorkDatabase workDatabase, @NotNull C0761a c0761a) {
        String str;
        context.getClass();
        workDatabase.getClass();
        c0761a.getClass();
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 31 ? 150 : 100;
        int size = workDatabase.workSpecDao().mo135188t().size();
        String strJoinToString$default = "<faulty JobScheduler failed to getPendingJobs>";
        if (i >= 34) {
            JobScheduler jobSchedulerM155532c = m155532c(context);
            List<JobInfo> listM155531b = m155531b(jobSchedulerM155532c);
            if (listM155531b != null) {
                List<JobInfo> listM154625g = mhh0.m154625g(context, jobSchedulerM155532c);
                int size2 = listM154625g != null ? listM155531b.size() - listM154625g.size() : 0;
                String str2 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                systemService.getClass();
                List<JobInfo> listM154625g2 = mhh0.m154625g(context, (JobScheduler) systemService);
                int size3 = listM154625g2 != null ? listM154625g2.size() : 0;
                if (size3 != 0) {
                    str2 = size3 + " from WorkManager in the default namespace";
                }
                strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{listM155531b.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2}), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List<JobInfo> listM154625g3 = mhh0.m154625g(context, m155532c(context));
            if (listM154625g3 != null) {
                strJoinToString$default = listM154625g3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i2 + " job limit exceeded.\nIn JobScheduler there are " + strJoinToString$default + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + c0761a.getMaxSchedulerLimit() + '.';
    }

    @RequiresApi(21)
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final List<JobInfo> m155531b(@NotNull JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            return jnq.INSTANCE.m142382a(jobScheduler);
        } catch (Throwable th) {
            txv.m190976e().mo190982d(f134770a, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    @RequiresApi(21)
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final JobScheduler m155532c(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? lnq.INSTANCE.m150706a(jobScheduler) : jobScheduler;
    }
}
