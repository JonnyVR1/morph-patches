package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0770h;
import androidx.work.C0763a;
import androidx.work.ExistingWorkPolicy;
import androidx.work.InterfaceC0766d;
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
import p153l.aiq0;
import p153l.bkq0;
import p153l.h2e0;
import p153l.m2f;
import p153l.mjq0;
import p153l.n2e0;
import p153l.n2f;
import p153l.njq0;
import p153l.pr3;
import p153l.tej0;
import p153l.tqe0;
import p153l.v1d0;
import p153l.vjq0;
import p153l.xiq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Landroidx/work/impl/a;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "Ll/h2e0;", "schedulers", "Ll/mjq0;", "newWorkSpec", "", "", "tags", "Landroidx/work/WorkManager$UpdateResult;", Constants.INAPP_DATA_TAG, "(Landroidx/work/impl/a;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Ll/mjq0;Ljava/util/Set;)Landroidx/work/WorkManager$UpdateResult;", "Ll/xiq0;", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroidx/work/h;", "workRequest", "Landroidx/work/d;", "c", "(Ll/xiq0;Ljava/lang/String;Landroidx/work/h;)Landroidx/work/d;", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
@SourceDebugExtension
public final class WorkerUpdater {
    /* JADX INFO: renamed from: a */
    public static void m4459a(WorkDatabase workDatabase, mjq0 mjq0Var, mjq0 mjq0Var2, List list, String str, Set set, boolean z) {
        njq0 njq0VarWorkSpecDao = workDatabase.workSpecDao();
        vjq0 vjq0VarWorkTagDao = workDatabase.workTagDao();
        mjq0 mjq0VarM158598d = mjq0.m158598d(mjq0Var2, null, mjq0Var.state, null, null, null, null, 0L, 0L, 0L, null, mjq0Var.runAttemptCount, null, 0L, mjq0Var.lastEnqueueTime, 0L, 0L, false, null, mjq0Var.getPeriodCount(), mjq0Var.getGeneration() + 1, mjq0Var.getNextScheduleTimeOverride(), mjq0Var.getNextScheduleTimeOverrideGeneration(), 0, null, 12835837, null);
        if (mjq0Var2.getNextScheduleTimeOverrideGeneration() == 1) {
            mjq0VarM158598d.m158610n(mjq0Var2.getNextScheduleTimeOverride());
            mjq0VarM158598d.m158611o(mjq0VarM158598d.getNextScheduleTimeOverrideGeneration() + 1);
        }
        njq0VarWorkSpecDao.mo163459x(n2f.m161230d(list, mjq0VarM158598d));
        vjq0VarWorkTagDao.mo201547a(str);
        vjq0VarWorkTagDao.m201548b(str, set);
        if (z) {
            return;
        }
        njq0VarWorkSpecDao.mo163460y(str, -1L);
        workDatabase.workProgressDao().delete(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC0766d m4461c(@NotNull final xiq0 xiq0Var, @NotNull final String str, @NotNull final AbstractC0770h abstractC0770h) {
        xiq0Var.getClass();
        str.getClass();
        abstractC0770h.getClass();
        tej0 tracer = xiq0Var.m211158n().getTracer();
        String str2 = "enqueueUniquePeriodic_" + str;
        tqe0 tqe0VarMo216346d = xiq0Var.m211165w().mo216346d();
        tqe0VarMo216346d.getClass();
        return OperationKt.m4347d(tracer, str2, tqe0VarMo216346d, new Function0<Unit>() { // from class: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                final AbstractC0770h abstractC0770h2 = abstractC0770h;
                final xiq0 xiq0Var2 = xiq0Var;
                final String str3 = str;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        m2f.m156829b(new aiq0(xiq0Var2, str3, ExistingWorkPolicy.KEEP, CollectionsKt.listOf(abstractC0770h2)));
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
                njq0 njq0VarWorkSpecDao = xiq0Var.m211163u().workSpecDao();
                List<mjq0.C18626b> listMo163461z = njq0VarWorkSpecDao.mo163461z(str);
                if (listMo163461z.size() > 1) {
                    pr3.m173429a("Can't apply UPDATE policy to the chains of work.");
                    return;
                }
                mjq0.C18626b c18626b = (mjq0.C18626b) CollectionsKt.firstOrNull((List) listMo163461z);
                if (c18626b == null) {
                    function0.invoke();
                    return;
                }
                mjq0 mjq0VarMo163457v = njq0VarWorkSpecDao.mo163457v(c18626b.id);
                if (mjq0VarMo163457v == null) {
                    bkq0.m104842a("WorkSpec with ", c18626b.id, ", that matches a name \"", str, "\", wasn't found");
                    return;
                }
                if (!mjq0VarMo163457v.m158609m()) {
                    pr3.m173429a("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    return;
                }
                if (c18626b.state == WorkInfo.State.CANCELLED) {
                    njq0VarWorkSpecDao.delete(c18626b.id);
                    function0.invoke();
                    return;
                }
                mjq0 mjq0VarM158598d = mjq0.m158598d(abstractC0770h.getWorkSpec(), c18626b.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777214, null);
                C0775a c0775aM211160r = xiq0Var.m211160r();
                c0775aM211160r.getClass();
                WorkDatabase workDatabaseM211163u = xiq0Var.m211163u();
                workDatabaseM211163u.getClass();
                C0763a c0763aM211158n = xiq0Var.m211158n();
                c0763aM211158n.getClass();
                List<h2e0> listM211161s = xiq0Var.m211161s();
                listM211161s.getClass();
                WorkerUpdater.m4462d(c0775aM211160r, workDatabaseM211163u, c0763aM211158n, listM211161s, mjq0VarM158598d, abstractC0770h.m4435c());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final WorkManager.UpdateResult m4462d(C0775a c0775a, final WorkDatabase workDatabase, C0763a c0763a, final List<? extends h2e0> list, final mjq0 mjq0Var, final Set<String> set) {
        final String str = mjq0Var.id;
        final mjq0 mjq0VarMo163457v = workDatabase.workSpecDao().mo163457v(str);
        if (mjq0VarMo163457v == null) {
            v1d0.m199002a("Worker with ", str, " doesn't exist");
            return null;
        }
        if (mjq0VarMo163457v.state.isFinished()) {
            return WorkManager.UpdateResult.NOT_APPLIED;
        }
        if (mjq0VarMo163457v.m158609m() ^ mjq0Var.m158609m()) {
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = new Function1<mjq0, String>() { // from class: androidx.work.impl.WorkerUpdater$updateWorkImpl$type$1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(mjq0 mjq0Var2) {
                    mjq0Var2.getClass();
                    return mjq0Var2.m158609m() ? "Periodic" : "OneTime";
                }
            };
            throw new UnsupportedOperationException("Can't update " + workerUpdater$updateWorkImpl$type$1.invoke(mjq0VarMo163457v) + " Worker to " + workerUpdater$updateWorkImpl$type$1.invoke(mjq0Var) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zM4519k = c0775a.m4519k(str);
        if (!zM4519k) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((h2e0) it.next()).mo133387c(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: l.kkq0
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.m4459a(workDatabase, mjq0VarMo163457v, mjq0Var, list, str, set, zM4519k);
            }
        });
        if (!zM4519k) {
            n2e0.m161226f(c0763a, workDatabase, list);
        }
        return zM4519k ? WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
    }
}
