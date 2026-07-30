package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p149l.haq0;
import p149l.iaq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m87232d2 = {"<anonymous>", "Landroidx/work/WorkInfo;", "db", "Landroidx/work/impl/WorkDatabase;", "invoke"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
final class StatusRunnable$forUUID$1 extends Lambda implements Function1<WorkDatabase, WorkInfo> {
    final /* synthetic */ UUID $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusRunnable$forUUID$1(UUID uuid) {
        super(1);
        this.$id = uuid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final WorkInfo invoke(WorkDatabase workDatabase) {
        workDatabase.getClass();
        iaq0 iaq0VarWorkSpecDao = workDatabase.workSpecDao();
        String string = this.$id.toString();
        string.getClass();
        haq0.C17256c c17256cMo135189u = iaq0VarWorkSpecDao.mo135189u(string);
        if (c17256cMo135189u != null) {
            return c17256cMo135189u.m130177e();
        }
        return null;
    }
}
