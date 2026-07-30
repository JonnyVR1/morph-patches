package androidx.work.impl;

import androidx.work.AbstractC0770h;
import androidx.work.C0763a;
import androidx.work.WorkManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p153l.h2e0;
import p153l.xiq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "Landroidx/work/WorkManager$UpdateResult;", "invoke"}, m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
final class WorkerUpdater$updateWorkImpl$3 extends Lambda implements Function0<WorkManager.UpdateResult> {
    final /* synthetic */ xiq0 $this_updateWorkImpl;
    final /* synthetic */ AbstractC0770h $workRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerUpdater$updateWorkImpl$3(xiq0 xiq0Var, AbstractC0770h abstractC0770h) {
        super(0);
        this.$this_updateWorkImpl = xiq0Var;
        this.$workRequest = abstractC0770h;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final WorkManager.UpdateResult invoke() {
        C0775a c0775aM211160r = this.$this_updateWorkImpl.m211160r();
        c0775aM211160r.getClass();
        WorkDatabase workDatabaseM211163u = this.$this_updateWorkImpl.m211163u();
        workDatabaseM211163u.getClass();
        C0763a c0763aM211158n = this.$this_updateWorkImpl.m211158n();
        c0763aM211158n.getClass();
        List<h2e0> listM211161s = this.$this_updateWorkImpl.m211161s();
        listM211161s.getClass();
        return WorkerUpdater.m4462d(c0775aM211160r, workDatabaseM211163u, c0763aM211158n, listM211161s, this.$workRequest.getWorkSpec(), this.$workRequest.m4435c());
    }
}
