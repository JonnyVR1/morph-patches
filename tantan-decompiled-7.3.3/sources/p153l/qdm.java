package p153l;

import androidx.work.impl.WorkDatabase;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/qdm;", "", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "", "minInclusive", "maxInclusive", Constants.INAPP_DATA_TAG, "(II)I", "c", "()I", "a", "Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class qdm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkDatabase workDatabase;

    public qdm(@NotNull WorkDatabase workDatabase) {
        workDatabase.getClass();
        this.workDatabase = workDatabase;
    }

    /* JADX INFO: renamed from: a */
    public static Integer m176178a(qdm qdmVar, int i, int i2) {
        int iM180866d = rdm.m180866d(qdmVar.workDatabase, "next_job_scheduler_id");
        if (i > iM180866d || iM180866d > i2) {
            rdm.m180867e(qdmVar.workDatabase, "next_job_scheduler_id", i + 1);
        } else {
            i = iM180866d;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: b */
    public static Integer m176179b(qdm qdmVar) {
        return Integer.valueOf(rdm.m180866d(qdmVar.workDatabase, "next_alarm_manager_id"));
    }

    /* JADX INFO: renamed from: c */
    public final int m176180c() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: l.odm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qdm.m176179b(this.f146924a);
            }
        });
        objRunInTransaction.getClass();
        return ((Number) objRunInTransaction).intValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m176181d(final int minInclusive, final int maxInclusive) {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: l.pdm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qdm.m176178a(this.f151811a, minInclusive, maxInclusive);
            }
        });
        objRunInTransaction.getClass();
        return ((Number) objRunInTransaction).intValue();
    }
}
