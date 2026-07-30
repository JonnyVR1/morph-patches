package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.AbstractC0770h;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.CancelWorkRunnable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class m2f {

    /* JADX INFO: renamed from: a */
    public static final String f134570a = qzv.m178831i("EnqueueRunnable");

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static boolean m156828a(@NonNull aiq0 aiq0Var) {
        xiq0 xiq0VarM98021h = aiq0Var.m98021h();
        WorkDatabase workDatabaseM211163u = xiq0VarM98021h.m211163u();
        workDatabaseM211163u.beginTransaction();
        try {
            n2f.m161227a(workDatabaseM211163u, xiq0VarM98021h.m211158n(), aiq0Var);
            boolean zM156832e = m156832e(aiq0Var);
            workDatabaseM211163u.setTransactionSuccessful();
            return zM156832e;
        } finally {
            workDatabaseM211163u.endTransaction();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m156829b(@NonNull aiq0 aiq0Var) {
        if (aiq0Var.m98022i()) {
            wmw.m207134a("WorkContinuation has cycles (", aiq0Var, ")");
        } else if (m156828a(aiq0Var)) {
            m156833f(aiq0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m156830c(@NonNull aiq0 aiq0Var) {
        boolean zM156831d = m156831d(aiq0Var.m98021h(), aiq0Var.m98020g(), (String[]) aiq0.m98014m(aiq0Var).toArray(new String[0]), aiq0Var.m98018e(), aiq0Var.m98016c());
        aiq0Var.m98024l();
        return zM156831d;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0151  */
    /* JADX INFO: renamed from: d */
    public static boolean m156831d(xiq0 xiq0Var, @NonNull List<? extends AbstractC0770h> list, String[] strArr, String str, ExistingWorkPolicy existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        xiq0 xiq0Var2;
        WorkDatabase workDatabase;
        boolean z4;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = xiq0Var.m211158n().getClock().currentTimeMillis();
        WorkDatabase workDatabaseM211163u = xiq0Var.m211163u();
        boolean z5 = strArr2 != null && strArr2.length > 0;
        if (z5) {
            z = false;
            z2 = false;
            z3 = true;
            for (String str2 : strArr2) {
                mjq0 mjq0VarMo163457v = workDatabaseM211163u.workSpecDao().mo163457v(str2);
                if (mjq0VarMo163457v == null) {
                    qzv.m178829e().mo178834c(f134570a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                WorkInfo.State state = mjq0VarMo163457v.state;
                z3 &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z2 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z = true;
                }
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z5) {
            xiq0Var2 = xiq0Var;
            workDatabase = workDatabaseM211163u;
            z4 = false;
        } else {
            List<mjq0.C18626b> listMo163461z = workDatabaseM211163u.workSpecDao().mo163461z(str);
            if (listMo163461z.isEmpty()) {
                xiq0Var2 = xiq0Var;
                workDatabase = workDatabaseM211163u;
            } else if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                xiq0Var2 = xiq0Var;
                mvd mvdVarDependencyDao = workDatabaseM211163u.dependencyDao();
                List arrayList = new ArrayList();
                for (mjq0.C18626b c18626b : listMo163461z) {
                    if (!mvdVarDependencyDao.mo160264d(c18626b.id)) {
                        WorkInfo.State state2 = c18626b.state;
                        boolean z6 = (state2 == WorkInfo.State.SUCCEEDED) & z3;
                        if (state2 == WorkInfo.State.FAILED) {
                            z2 = true;
                        } else if (state2 == WorkInfo.State.CANCELLED) {
                            z = true;
                        }
                        arrayList.add(c18626b.id);
                        z3 = z6;
                    }
                    workDatabaseM211163u = workDatabaseM211163u;
                }
                workDatabase = workDatabaseM211163u;
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z || z2)) {
                    njq0 njq0VarWorkSpecDao = workDatabase.workSpecDao();
                    Iterator<mjq0.C18626b> it = njq0VarWorkSpecDao.mo163461z(str).iterator();
                    while (it.hasNext()) {
                        njq0VarWorkSpecDao.delete(it.next().id);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z = false;
                    z2 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z5 = strArr2.length > 0;
            } else {
                if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                    Iterator<mjq0.C18626b> it2 = listMo163461z.iterator();
                    while (it2.hasNext()) {
                        WorkInfo.State state3 = it2.next().state;
                        if (state3 == WorkInfo.State.ENQUEUED || state3 == WorkInfo.State.RUNNING) {
                            return false;
                        }
                    }
                }
                xiq0Var2 = xiq0Var;
                CancelWorkRunnable.m4616g(str, xiq0Var2);
                njq0 njq0VarWorkSpecDao2 = workDatabaseM211163u.workSpecDao();
                Iterator<mjq0.C18626b> it3 = listMo163461z.iterator();
                while (it3.hasNext()) {
                    njq0VarWorkSpecDao2.delete(it3.next().id);
                }
                workDatabase = workDatabaseM211163u;
                z4 = true;
            }
            z4 = false;
        }
        Iterator<? extends AbstractC0770h> it4 = list.iterator();
        while (it4.hasNext()) {
            AbstractC0770h next = it4.next();
            mjq0 workSpec = next.getWorkSpec();
            if (!z5 || z3) {
                workSpec.lastEnqueueTime = jCurrentTimeMillis;
            } else if (z2) {
                workSpec.state = WorkInfo.State.FAILED;
            } else if (z) {
                workSpec.state = WorkInfo.State.CANCELLED;
            } else {
                workSpec.state = WorkInfo.State.BLOCKED;
            }
            if (workSpec.state == WorkInfo.State.ENQUEUED) {
                z4 = true;
            }
            workDatabase.workSpecDao().mo163450o(n2f.m161230d(xiq0Var2.m211161s(), workSpec));
            if (z5) {
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    workDatabase.dependencyDao().mo160263c(new lvd(next.m4434b(), strArr2[i]));
                    i++;
                    it4 = it4;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            Iterator<? extends AbstractC0770h> it5 = it4;
            workDatabase.workTagDao().m201548b(next.m4434b(), next.m4435c());
            if (!zIsEmpty) {
                workDatabase.workNameDao().mo104642b(new ajq0(str, next.m4434b()));
            }
            it4 = it5;
            strArr2 = strArr3;
        }
        return z4;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m156832e(@NonNull aiq0 aiq0Var) {
        List<aiq0> listM98019f = aiq0Var.m98019f();
        boolean zM156832e = false;
        if (listM98019f != null) {
            for (aiq0 aiq0Var2 : listM98019f) {
                if (aiq0Var2.m98023k()) {
                    qzv.m178829e().mo178839k(f134570a, "Already enqueued work ids (" + TextUtils.join(", ", aiq0Var2.m98017d()) + ")");
                } else {
                    zM156832e |= m156832e(aiq0Var2);
                }
            }
        }
        return m156830c(aiq0Var) | zM156832e;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static void m156833f(@NonNull aiq0 aiq0Var) {
        xiq0 xiq0VarM98021h = aiq0Var.m98021h();
        n2e0.m161226f(xiq0VarM98021h.m211158n(), xiq0VarM98021h.m211163u(), xiq0VarM98021h.m211161s());
    }
}
