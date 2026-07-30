package p149l;

import androidx.work.impl.WorkDatabase;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/abm;", "", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "", "minInclusive", "maxInclusive", Constants.INAPP_DATA_TAG, "(II)I", "c", "()I", "a", "Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class abm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkDatabase workDatabase;

    public abm(@NotNull WorkDatabase workDatabase) {
        workDatabase.getClass();
        this.workDatabase = workDatabase;
    }

    /* JADX INFO: renamed from: a */
    public static Integer m95689a(abm abmVar, int i, int i2) {
        int iM100987d = bbm.m100987d(abmVar.workDatabase, "next_job_scheduler_id");
        if (i > iM100987d || iM100987d > i2) {
            bbm.m100988e(abmVar.workDatabase, "next_job_scheduler_id", i + 1);
        } else {
            i = iM100987d;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: b */
    public static Integer m95690b(abm abmVar) {
        return Integer.valueOf(bbm.m100987d(abmVar.workDatabase, "next_alarm_manager_id"));
    }

    /* JADX INFO: renamed from: c */
    public final int m95691c() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: l.yam
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return abm.m95690b(this.f197223a);
            }
        });
        objRunInTransaction.getClass();
        return ((Number) objRunInTransaction).intValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m95692d(final int minInclusive, final int maxInclusive) {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: l.zam
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return abm.m95689a(this.f202377a, minInclusive, maxInclusive);
            }
        });
        objRunInTransaction.getClass();
        return ((Number) objRunInTransaction).intValue();
    }
}
