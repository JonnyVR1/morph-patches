package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p149l.haq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m87232d2 = {"<anonymous>", "", "Landroidx/work/WorkInfo;", "db", "Landroidx/work/impl/WorkDatabase;", "invoke"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
final class StatusRunnable$forStringIds$1 extends Lambda implements Function1<WorkDatabase, List<? extends WorkInfo>> {
    final /* synthetic */ List<String> $ids;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusRunnable$forStringIds$1(List<String> list) {
        super(1);
        this.$ids = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<WorkInfo> invoke(WorkDatabase workDatabase) {
        workDatabase.getClass();
        List<WorkInfo> listApply = haq0.f106767z.apply(workDatabase.workSpecDao().mo135168G(this.$ids));
        listApply.getClass();
        return listApply;
    }
}
