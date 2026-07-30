package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.AbstractC0768h;
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
public class h1f {

    /* JADX INFO: renamed from: a */
    public static final String f105426a = txv.m190978i("EnqueueRunnable");

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static boolean m129024a(@NonNull v8q0 v8q0Var) {
        s9q0 s9q0VarM197489h = v8q0Var.m197489h();
        WorkDatabase workDatabaseM182750u = s9q0VarM197489h.m182750u();
        workDatabaseM182750u.beginTransaction();
        try {
            i1f.m133969a(workDatabaseM182750u, s9q0VarM197489h.m182745n(), v8q0Var);
            boolean zM129028e = m129028e(v8q0Var);
            workDatabaseM182750u.setTransactionSuccessful();
            return zM129028e;
        } finally {
            workDatabaseM182750u.endTransaction();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m129025b(@NonNull v8q0 v8q0Var) {
        if (v8q0Var.m197490i()) {
            xjw.m209754a("WorkContinuation has cycles (", v8q0Var, ")");
        } else if (m129024a(v8q0Var)) {
            m129029f(v8q0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m129026c(@NonNull v8q0 v8q0Var) {
        boolean zM129027d = m129027d(v8q0Var.m197489h(), v8q0Var.m197488g(), (String[]) v8q0.m197482m(v8q0Var).toArray(new String[0]), v8q0Var.m197486e(), v8q0Var.m197484c());
        v8q0Var.m197492l();
        return zM129027d;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0151  */
    /* JADX INFO: renamed from: d */
    public static boolean m129027d(s9q0 s9q0Var, @NonNull List<? extends AbstractC0768h> list, String[] strArr, String str, ExistingWorkPolicy existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        s9q0 s9q0Var2;
        WorkDatabase workDatabase;
        boolean z4;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = s9q0Var.m182745n().getClock().currentTimeMillis();
        WorkDatabase workDatabaseM182750u = s9q0Var.m182750u();
        boolean z5 = strArr2 != null && strArr2.length > 0;
        if (z5) {
            z = false;
            z2 = false;
            z3 = true;
            for (String str2 : strArr2) {
                haq0 haq0VarMo135190v = workDatabaseM182750u.workSpecDao().mo135190v(str2);
                if (haq0VarMo135190v == null) {
                    txv.m190976e().mo190981c(f105426a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                WorkInfo.State state = haq0VarMo135190v.state;
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
            s9q0Var2 = s9q0Var;
            workDatabase = workDatabaseM182750u;
            z4 = false;
        } else {
            List<haq0.C17255b> listMo135194z = workDatabaseM182750u.workSpecDao().mo135194z(str);
            if (listMo135194z.isEmpty()) {
                s9q0Var2 = s9q0Var;
                workDatabase = workDatabaseM182750u;
            } else if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                s9q0Var2 = s9q0Var;
                ytd ytdVarDependencyDao = workDatabaseM182750u.dependencyDao();
                List arrayList = new ArrayList();
                for (haq0.C17255b c17255b : listMo135194z) {
                    if (!ytdVarDependencyDao.mo216004d(c17255b.id)) {
                        WorkInfo.State state2 = c17255b.state;
                        boolean z6 = (state2 == WorkInfo.State.SUCCEEDED) & z3;
                        if (state2 == WorkInfo.State.FAILED) {
                            z2 = true;
                        } else if (state2 == WorkInfo.State.CANCELLED) {
                            z = true;
                        }
                        arrayList.add(c17255b.id);
                        z3 = z6;
                    }
                    workDatabaseM182750u = workDatabaseM182750u;
                }
                workDatabase = workDatabaseM182750u;
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z || z2)) {
                    iaq0 iaq0VarWorkSpecDao = workDatabase.workSpecDao();
                    Iterator<haq0.C17255b> it = iaq0VarWorkSpecDao.mo135194z(str).iterator();
                    while (it.hasNext()) {
                        iaq0VarWorkSpecDao.delete(it.next().id);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z = false;
                    z2 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z5 = strArr2.length > 0;
            } else {
                if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                    Iterator<haq0.C17255b> it2 = listMo135194z.iterator();
                    while (it2.hasNext()) {
                        WorkInfo.State state3 = it2.next().state;
                        if (state3 == WorkInfo.State.ENQUEUED || state3 == WorkInfo.State.RUNNING) {
                            return false;
                        }
                    }
                }
                s9q0Var2 = s9q0Var;
                CancelWorkRunnable.m4614g(str, s9q0Var2);
                iaq0 iaq0VarWorkSpecDao2 = workDatabaseM182750u.workSpecDao();
                Iterator<haq0.C17255b> it3 = listMo135194z.iterator();
                while (it3.hasNext()) {
                    iaq0VarWorkSpecDao2.delete(it3.next().id);
                }
                workDatabase = workDatabaseM182750u;
                z4 = true;
            }
            z4 = false;
        }
        Iterator<? extends AbstractC0768h> it4 = list.iterator();
        while (it4.hasNext()) {
            AbstractC0768h next = it4.next();
            haq0 workSpec = next.getWorkSpec();
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
            workDatabase.workSpecDao().mo135183o(i1f.m133972d(s9q0Var2.m182748s(), workSpec));
            if (z5) {
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    workDatabase.dependencyDao().mo216003c(new xtd(next.m4432b(), strArr2[i]));
                    i++;
                    it4 = it4;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            Iterator<? extends AbstractC0768h> it5 = it4;
            workDatabase.workTagDao().m173771b(next.m4432b(), next.m4433c());
            if (!zIsEmpty) {
                workDatabase.workNameDao().mo202342b(new v9q0(str, next.m4432b()));
            }
            it4 = it5;
            strArr2 = strArr3;
        }
        return z4;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m129028e(@NonNull v8q0 v8q0Var) {
        List<v8q0> listM197487f = v8q0Var.m197487f();
        boolean zM129028e = false;
        if (listM197487f != null) {
            for (v8q0 v8q0Var2 : listM197487f) {
                if (v8q0Var2.m197491k()) {
                    txv.m190976e().mo190986k(f105426a, "Already enqueued work ids (" + TextUtils.join(", ", v8q0Var2.m197485d()) + ")");
                } else {
                    zM129028e |= m129028e(v8q0Var2);
                }
            }
        }
        return m129026c(v8q0Var) | zM129028e;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static void m129029f(@NonNull v8q0 v8q0Var) {
        s9q0 s9q0VarM197489h = v8q0Var.m197489h();
        jud0.m143288f(s9q0VarM197489h.m182745n(), s9q0VarM197489h.m182750u(), s9q0VarM197489h.m182748s());
    }
}
