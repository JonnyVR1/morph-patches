package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.C0763a;
import androidx.work.impl.C0775a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class n2e0 {

    /* JADX INFO: renamed from: a */
    public static final String f139858a = qzv.m178831i("Schedulers");

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m161222b(List list, piq0 piq0Var, C0763a c0763a, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((h2e0) it.next()).mo133387c(piq0Var.getWorkSpecId());
        }
        m161226f(c0763a, workDatabase, list);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static h2e0 m161223c(@NonNull Context context, @NonNull WorkDatabase workDatabase, C0763a c0763a) {
        tph0 tph0Var = new tph0(context, workDatabase, c0763a);
        rc60.m180781c(context, SystemJobService.class, true);
        qzv.m178829e().mo178832a(f139858a, "Created SystemJobScheduler and enabled SystemJobService");
        return tph0Var;
    }

    /* JADX INFO: renamed from: d */
    public static void m161224d(njq0 njq0Var, sa5 sa5Var, List<mjq0> list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = sa5Var.currentTimeMillis();
            Iterator<mjq0> it = list.iterator();
            while (it.hasNext()) {
                njq0Var.mo163460y(it.next().id, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m161225e(@NonNull final List<h2e0> list, @NonNull C0775a c0775a, @NonNull final Executor executor, @NonNull final WorkDatabase workDatabase, @NonNull final C0763a c0763a) {
        c0775a.m4514e(new v6f() { // from class: l.l2e0
            @Override // p153l.v6f
            public final void onExecuted(piq0 piq0Var, boolean z) {
                executor.execute(new Runnable() { // from class: l.m2e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        n2e0.m161222b(list, piq0Var, c0763a, workDatabase);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m161226f(@NonNull C0763a c0763a, @NonNull WorkDatabase workDatabase, @Nullable List<h2e0> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        njq0 njq0VarWorkSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List<mjq0> listMo163448m = njq0VarWorkSpecDao.mo163448m();
            m161224d(njq0VarWorkSpecDao, c0763a.getClock(), listMo163448m);
            List<mjq0> listMo163430B = njq0VarWorkSpecDao.mo163430B(c0763a.getMaxSchedulerLimit());
            m161224d(njq0VarWorkSpecDao, c0763a.getClock(), listMo163430B);
            if (listMo163448m != null) {
                listMo163430B.addAll(listMo163448m);
            }
            List<mjq0> listMo163444i = njq0VarWorkSpecDao.mo163444i(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (listMo163430B.size() > 0) {
                mjq0[] mjq0VarArr = (mjq0[]) listMo163430B.toArray(new mjq0[listMo163430B.size()]);
                for (h2e0 h2e0Var : list) {
                    if (h2e0Var.mo133386b()) {
                        h2e0Var.mo133388d(mjq0VarArr);
                    }
                }
            }
            if (listMo163444i.size() > 0) {
                mjq0[] mjq0VarArr2 = (mjq0[]) listMo163444i.toArray(new mjq0[listMo163444i.size()]);
                for (h2e0 h2e0Var2 : list) {
                    if (!h2e0Var2.mo133386b()) {
                        h2e0Var2.mo133388d(mjq0VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
