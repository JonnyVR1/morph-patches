package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.C0761a;
import androidx.work.impl.C0773a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class jud0 {

    /* JADX INFO: renamed from: a */
    public static final String f119775a = txv.m190978i("Schedulers");

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m143284b(List list, k9q0 k9q0Var, C0761a c0761a, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((dud0) it.next()).mo113683c(k9q0Var.getWorkSpecId());
        }
        m143288f(c0761a, workDatabase, list);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static dud0 m143285c(@NonNull Context context, @NonNull WorkDatabase workDatabase, C0761a c0761a) {
        mhh0 mhh0Var = new mhh0(context, workDatabase, c0761a);
        l460.m148427c(context, SystemJobService.class, true);
        txv.m190976e().mo190979a(f119775a, "Created SystemJobScheduler and enabled SystemJobService");
        return mhh0Var;
    }

    /* JADX INFO: renamed from: d */
    public static void m143286d(iaq0 iaq0Var, r95 r95Var, List<haq0> list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = r95Var.currentTimeMillis();
            Iterator<haq0> it = list.iterator();
            while (it.hasNext()) {
                iaq0Var.mo135193y(it.next().id, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m143287e(@NonNull final List<dud0> list, @NonNull C0773a c0773a, @NonNull final Executor executor, @NonNull final WorkDatabase workDatabase, @NonNull final C0761a c0761a) {
        c0773a.m4512e(new r5f() { // from class: l.hud0
            @Override // p149l.r5f
            public final void onExecuted(k9q0 k9q0Var, boolean z) {
                executor.execute(new Runnable() { // from class: l.iud0
                    @Override // java.lang.Runnable
                    public final void run() {
                        jud0.m143284b(list, k9q0Var, c0761a, workDatabase);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m143288f(@NonNull C0761a c0761a, @NonNull WorkDatabase workDatabase, @Nullable List<dud0> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        iaq0 iaq0VarWorkSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List<haq0> listMo135181m = iaq0VarWorkSpecDao.mo135181m();
            m143286d(iaq0VarWorkSpecDao, c0761a.getClock(), listMo135181m);
            List<haq0> listMo135163B = iaq0VarWorkSpecDao.mo135163B(c0761a.getMaxSchedulerLimit());
            m143286d(iaq0VarWorkSpecDao, c0761a.getClock(), listMo135163B);
            if (listMo135181m != null) {
                listMo135163B.addAll(listMo135181m);
            }
            List<haq0> listMo135177i = iaq0VarWorkSpecDao.mo135177i(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (listMo135163B.size() > 0) {
                haq0[] haq0VarArr = (haq0[]) listMo135163B.toArray(new haq0[listMo135163B.size()]);
                for (dud0 dud0Var : list) {
                    if (dud0Var.mo113682b()) {
                        dud0Var.mo113684d(haq0VarArr);
                    }
                }
            }
            if (listMo135177i.size() > 0) {
                haq0[] haq0VarArr2 = (haq0[]) listMo135177i.toArray(new haq0[listMo135177i.size()]);
                for (dud0 dud0Var2 : list) {
                    if (!dud0Var2.mo113682b()) {
                        dud0Var2.mo113684d(haq0VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
