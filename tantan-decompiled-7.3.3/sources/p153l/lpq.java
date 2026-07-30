package p153l;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.C0763a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f*\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "a", "(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)Ljava/lang/String;", "Ljava/lang/String;", "TAG", "Landroid/app/job/JobScheduler;", "c", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "wmJobScheduler", "", "Landroid/app/job/JobInfo;", "b", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "safePendingJobs", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class lpq {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f133113a;

    static {
        String strM178831i = qzv.m178831i("SystemJobScheduler");
        strM178831i.getClass();
        f133113a = strM178831i;
    }

    @RequiresApi(23)
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m155292a(@NotNull Context context, @NotNull WorkDatabase workDatabase, @NotNull C0763a c0763a) {
        String str;
        context.getClass();
        workDatabase.getClass();
        c0763a.getClass();
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 31 ? 150 : 100;
        int size = workDatabase.workSpecDao().mo163455t().size();
        String strJoinToString$default = "<faulty JobScheduler failed to getPendingJobs>";
        if (i >= 34) {
            JobScheduler jobSchedulerM155294c = m155294c(context);
            List<JobInfo> listM155293b = m155293b(jobSchedulerM155294c);
            if (listM155293b != null) {
                List<JobInfo> listM192135g = tph0.m192135g(context, jobSchedulerM155294c);
                int size2 = listM192135g != null ? listM155293b.size() - listM192135g.size() : 0;
                String str2 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                systemService.getClass();
                List<JobInfo> listM192135g2 = tph0.m192135g(context, (JobScheduler) systemService);
                int size3 = listM192135g2 != null ? listM192135g2.size() : 0;
                if (size3 != 0) {
                    str2 = size3 + " from WorkManager in the default namespace";
                }
                strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{listM155293b.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2}), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List<JobInfo> listM192135g3 = tph0.m192135g(context, m155294c(context));
            if (listM192135g3 != null) {
                strJoinToString$default = listM192135g3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i2 + " job limit exceeded.\nIn JobScheduler there are " + strJoinToString$default + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + c0763a.getMaxSchedulerLimit() + '.';
    }

    @RequiresApi(21)
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final List<JobInfo> m155293b(@NotNull JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            return ipq.INSTANCE.m141534a(jobScheduler);
        } catch (Throwable th) {
            qzv.m178829e().mo178835d(f133113a, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    @RequiresApi(21)
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final JobScheduler m155294c(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? kpq.INSTANCE.m150746a(jobScheduler) : jobScheduler;
    }
}
