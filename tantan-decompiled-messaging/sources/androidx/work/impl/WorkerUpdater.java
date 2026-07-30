package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0768h;
import androidx.work.C0761a;
import androidx.work.ExistingWorkPolicy;
import androidx.work.InterfaceC0764d;
import androidx.work.OperationKt;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.impl.WorkerUpdater;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.dud0;
import p149l.h1f;
import p149l.haq0;
import p149l.i1f;
import p149l.iaq0;
import p149l.jud0;
import p149l.oie0;
import p149l.p5j0;
import p149l.qaq0;
import p149l.qq3;
import p149l.qtc0;
import p149l.s9q0;
import p149l.v8q0;
import p149l.waq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Landroidx/work/impl/a;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "Ll/dud0;", "schedulers", "Ll/haq0;", "newWorkSpec", "", "", "tags", "Landroidx/work/WorkManager$UpdateResult;", Constants.INAPP_DATA_TAG, "(Landroidx/work/impl/a;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Ll/haq0;Ljava/util/Set;)Landroidx/work/WorkManager$UpdateResult;", "Ll/s9q0;", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroidx/work/h;", "workRequest", "Landroidx/work/d;", "c", "(Ll/s9q0;Ljava/lang/String;Landroidx/work/h;)Landroidx/work/d;", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@JvmName
@SourceDebugExtension
public final class WorkerUpdater {
    /* JADX INFO: renamed from: a */
    public static void m4457a(WorkDatabase workDatabase, haq0 haq0Var, haq0 haq0Var2, List list, String str, Set set, boolean z) {
        iaq0 iaq0VarWorkSpecDao = workDatabase.workSpecDao();
        qaq0 qaq0VarWorkTagDao = workDatabase.workTagDao();
        haq0 haq0VarM130156d = haq0.m130156d(haq0Var2, null, haq0Var.state, null, null, null, null, 0L, 0L, 0L, null, haq0Var.runAttemptCount, null, 0L, haq0Var.lastEnqueueTime, 0L, 0L, false, null, haq0Var.getPeriodCount(), haq0Var.getGeneration() + 1, haq0Var.getNextScheduleTimeOverride(), haq0Var.getNextScheduleTimeOverrideGeneration(), 0, null, 12835837, null);
        if (haq0Var2.getNextScheduleTimeOverrideGeneration() == 1) {
            haq0VarM130156d.m130168n(haq0Var2.getNextScheduleTimeOverride());
            haq0VarM130156d.m130169o(haq0VarM130156d.getNextScheduleTimeOverrideGeneration() + 1);
        }
        iaq0VarWorkSpecDao.mo135192x(i1f.m133972d(list, haq0VarM130156d));
        qaq0VarWorkTagDao.mo173770a(str);
        qaq0VarWorkTagDao.m173771b(str, set);
        if (z) {
            return;
        }
        iaq0VarWorkSpecDao.mo135193y(str, -1L);
        workDatabase.workProgressDao().delete(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC0764d m4459c(@NotNull final s9q0 s9q0Var, @NotNull final String str, @NotNull final AbstractC0768h abstractC0768h) {
        s9q0Var.getClass();
        str.getClass();
        abstractC0768h.getClass();
        p5j0 tracer = s9q0Var.m182745n().getTracer();
        String str2 = "enqueueUniquePeriodic_" + str;
        oie0 oie0VarMo187638d = s9q0Var.m182752w().mo187638d();
        oie0VarMo187638d.getClass();
        return OperationKt.m4345d(tracer, str2, oie0VarMo187638d, new Function0<Unit>() { // from class: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                final AbstractC0768h abstractC0768h2 = abstractC0768h;
                final s9q0 s9q0Var2 = s9q0Var;
                final String str3 = str;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        h1f.m129025b(new v8q0(s9q0Var2, str3, ExistingWorkPolicy.KEEP, CollectionsKt.listOf(abstractC0768h2)));
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
                iaq0 iaq0VarWorkSpecDao = s9q0Var.m182750u().workSpecDao();
                List<haq0.C17255b> listMo135194z = iaq0VarWorkSpecDao.mo135194z(str);
                if (listMo135194z.size() > 1) {
                    qq3.m175877a("Can't apply UPDATE policy to the chains of work.");
                    return;
                }
                haq0.C17255b c17255b = (haq0.C17255b) CollectionsKt.firstOrNull((List) listMo135194z);
                if (c17255b == null) {
                    function0.invoke();
                    return;
                }
                haq0 haq0VarMo135190v = iaq0VarWorkSpecDao.mo135190v(c17255b.id);
                if (haq0VarMo135190v == null) {
                    waq0.m202461a("WorkSpec with ", c17255b.id, ", that matches a name \"", str, "\", wasn't found");
                    return;
                }
                if (!haq0VarMo135190v.m130167m()) {
                    qq3.m175877a("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    return;
                }
                if (c17255b.state == WorkInfo.State.CANCELLED) {
                    iaq0VarWorkSpecDao.delete(c17255b.id);
                    function0.invoke();
                    return;
                }
                haq0 haq0VarM130156d = haq0.m130156d(abstractC0768h.getWorkSpec(), c17255b.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777214, null);
                C0773a c0773aM182747r = s9q0Var.m182747r();
                c0773aM182747r.getClass();
                WorkDatabase workDatabaseM182750u = s9q0Var.m182750u();
                workDatabaseM182750u.getClass();
                C0761a c0761aM182745n = s9q0Var.m182745n();
                c0761aM182745n.getClass();
                List<dud0> listM182748s = s9q0Var.m182748s();
                listM182748s.getClass();
                WorkerUpdater.m4460d(c0773aM182747r, workDatabaseM182750u, c0761aM182745n, listM182748s, haq0VarM130156d, abstractC0768h.m4433c());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final WorkManager.UpdateResult m4460d(C0773a c0773a, final WorkDatabase workDatabase, C0761a c0761a, final List<? extends dud0> list, final haq0 haq0Var, final Set<String> set) {
        final String str = haq0Var.id;
        final haq0 haq0VarMo135190v = workDatabase.workSpecDao().mo135190v(str);
        if (haq0VarMo135190v == null) {
            qtc0.m176411a("Worker with ", str, " doesn't exist");
            return null;
        }
        if (haq0VarMo135190v.state.isFinished()) {
            return WorkManager.UpdateResult.NOT_APPLIED;
        }
        if (haq0VarMo135190v.m130167m() ^ haq0Var.m130167m()) {
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = new Function1<haq0, String>() { // from class: androidx.work.impl.WorkerUpdater$updateWorkImpl$type$1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(haq0 haq0Var2) {
                    haq0Var2.getClass();
                    return haq0Var2.m130167m() ? "Periodic" : "OneTime";
                }
            };
            throw new UnsupportedOperationException("Can't update " + workerUpdater$updateWorkImpl$type$1.invoke(haq0VarMo135190v) + " Worker to " + workerUpdater$updateWorkImpl$type$1.invoke(haq0Var) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zM4517k = c0773a.m4517k(str);
        if (!zM4517k) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((dud0) it.next()).mo113683c(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: l.fbq0
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.m4457a(workDatabase, haq0VarMo135190v, haq0Var, list, str, set, zM4517k);
            }
        });
        if (!zM4517k) {
            jud0.m143288f(c0761a, workDatabase, list);
        }
        return zM4517k ? WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
    }
}
