package androidx.work.impl;

import androidx.work.AbstractC0768h;
import androidx.work.C0761a;
import androidx.work.WorkManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p149l.dud0;
import p149l.s9q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "Landroidx/work/WorkManager$UpdateResult;", "invoke"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
final class WorkerUpdater$updateWorkImpl$3 extends Lambda implements Function0<WorkManager.UpdateResult> {
    final /* synthetic */ s9q0 $this_updateWorkImpl;
    final /* synthetic */ AbstractC0768h $workRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerUpdater$updateWorkImpl$3(s9q0 s9q0Var, AbstractC0768h abstractC0768h) {
        super(0);
        this.$this_updateWorkImpl = s9q0Var;
        this.$workRequest = abstractC0768h;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final WorkManager.UpdateResult invoke() {
        C0773a c0773aM182747r = this.$this_updateWorkImpl.m182747r();
        c0773aM182747r.getClass();
        WorkDatabase workDatabaseM182750u = this.$this_updateWorkImpl.m182750u();
        workDatabaseM182750u.getClass();
        C0761a c0761aM182745n = this.$this_updateWorkImpl.m182745n();
        c0761aM182745n.getClass();
        List<dud0> listM182748s = this.$this_updateWorkImpl.m182748s();
        listM182748s.getClass();
        return WorkerUpdater.m4460d(c0773aM182747r, workDatabaseM182750u, c0761aM182745n, listM182748s, this.$workRequest.getWorkSpec(), this.$workRequest.m4433c());
    }
}
