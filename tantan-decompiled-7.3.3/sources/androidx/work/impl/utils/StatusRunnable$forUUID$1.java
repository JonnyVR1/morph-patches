package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p153l.mjq0;
import p153l.njq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m88121d2 = {"<anonymous>", "Landroidx/work/WorkInfo;", "db", "Landroidx/work/impl/WorkDatabase;", "invoke"}, m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
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
        njq0 njq0VarWorkSpecDao = workDatabase.workSpecDao();
        String string = this.$id.toString();
        string.getClass();
        mjq0.C18627c c18627cMo163456u = njq0VarWorkSpecDao.mo163456u(string);
        if (c18627cMo163456u != null) {
            return c18627cMo163456u.m158619e();
        }
        return null;
    }
}
