package p153l;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.C0763a;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class tph0 implements h2e0 {

    /* JADX INFO: renamed from: f */
    public static final String f175598f = qzv.m178831i("SystemJobScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f175599a;

    /* JADX INFO: renamed from: b */
    public final JobScheduler f175600b;

    /* JADX INFO: renamed from: c */
    public final rph0 f175601c;

    /* JADX INFO: renamed from: d */
    public final WorkDatabase f175602d;

    /* JADX INFO: renamed from: e */
    public final C0763a f175603e;

    public tph0(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull C0763a c0763a) {
        this(context, workDatabase, c0763a, lpq.m155294c(context), new rph0(context, c0763a.getClock(), c0763a.getIsMarkingJobsAsImportantWhileForeground()));
    }

    /* JADX INFO: renamed from: a */
    public static void m192132a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            lpq.m155294c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listM192135g = m192135g(context, jobScheduler);
        if (listM192135g == null || listM192135g.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listM192135g.iterator();
        while (it.hasNext()) {
            m192133e(jobScheduler, it.next().getId());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m192133e(@NonNull JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            qzv.m178829e().mo178835d(f175598f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static List<Integer> m192134f(@NonNull Context context, @NonNull JobScheduler jobScheduler, @NonNull String str) {
        List<JobInfo> listM192135g = m192135g(context, jobScheduler);
        if (listM192135g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listM192135g) {
            piq0 piq0VarM192136h = m192136h(jobInfo);
            if (piq0VarM192136h != null && str.equals(piq0VarM192136h.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static List<JobInfo> m192135g(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> listM155293b = lpq.m155293b(jobScheduler);
        if (listM155293b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listM155293b.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listM155293b) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static piq0 m192136h(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new piq0(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m192137i(@NonNull Context context, @NonNull WorkDatabase workDatabase) {
        JobScheduler jobSchedulerM155294c = lpq.m155294c(context);
        List<JobInfo> listM192135g = m192135g(context, jobSchedulerM155294c);
        List<String> listMo141466d = workDatabase.systemIdInfoDao().mo141466d();
        boolean z = false;
        HashSet hashSet = new HashSet(listM192135g != null ? listM192135g.size() : 0);
        if (listM192135g != null && !listM192135g.isEmpty()) {
            for (JobInfo jobInfo : listM192135g) {
                piq0 piq0VarM192136h = m192136h(jobInfo);
                if (piq0VarM192136h != null) {
                    hashSet.add(piq0VarM192136h.getWorkSpecId());
                } else {
                    m192133e(jobSchedulerM155294c, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listMo141466d.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                qzv.m178829e().mo178832a(f175598f, "Reconciling jobs");
                z = true;
                break;
            }
        }
        if (!z) {
            return z;
        }
        workDatabase.beginTransaction();
        try {
            njq0 njq0VarWorkSpecDao = workDatabase.workSpecDao();
            Iterator<String> it2 = listMo141466d.iterator();
            while (it2.hasNext()) {
                njq0VarWorkSpecDao.mo163460y(it2.next(), -1L);
            }
            workDatabase.setTransactionSuccessful();
            return z;
        } finally {
            workDatabase.endTransaction();
        }
    }

    @Override // p153l.h2e0
    /* JADX INFO: renamed from: b */
    public boolean mo133386b() {
        return true;
    }

    @Override // p153l.h2e0
    /* JADX INFO: renamed from: c */
    public void mo133387c(@NonNull String str) {
        List<Integer> listM192134f = m192134f(this.f175599a, this.f175600b, str);
        if (listM192134f == null || listM192134f.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listM192134f.iterator();
        while (it.hasNext()) {
            m192133e(this.f175600b, it.next().intValue());
        }
        this.f175602d.systemIdInfoDao().mo141469g(str);
    }

    @Override // p153l.h2e0
    /* JADX INFO: renamed from: d */
    public void mo133388d(@NonNull mjq0... mjq0VarArr) {
        qdm qdmVar = new qdm(this.f175602d);
        for (mjq0 mjq0Var : mjq0VarArr) {
            this.f175602d.beginTransaction();
            try {
                mjq0 mjq0VarMo163457v = this.f175602d.workSpecDao().mo163457v(mjq0Var.id);
                if (mjq0VarMo163457v == null) {
                    qzv.m178829e().mo178839k(f175598f, "Skipping scheduling " + mjq0Var.id + " because it's no longer in the DB");
                    this.f175602d.setTransactionSuccessful();
                } else if (mjq0VarMo163457v.state != WorkInfo.State.ENQUEUED) {
                    qzv.m178829e().mo178839k(f175598f, "Skipping scheduling " + mjq0Var.id + " because it is no longer enqueued");
                    this.f175602d.setTransactionSuccessful();
                } else {
                    piq0 piq0VarM191450a = tjq0.m191450a(mjq0Var);
                    hph0 hph0VarM141463a = this.f175602d.systemIdInfoDao().m141463a(piq0VarM191450a);
                    int iM176181d = hph0VarM141463a != null ? hph0VarM141463a.systemId : qdmVar.m176181d(this.f175603e.getMinJobSchedulerId(), this.f175603e.getMaxJobSchedulerId());
                    if (hph0VarM141463a == null) {
                        this.f175602d.systemIdInfoDao().mo141465c(kph0.m150728a(piq0VarM191450a, iM176181d));
                    }
                    m192138j(mjq0Var, iM176181d);
                    this.f175602d.setTransactionSuccessful();
                }
                this.f175602d.endTransaction();
            } catch (Throwable th) {
                this.f175602d.endTransaction();
                throw th;
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public void m192138j(@NonNull mjq0 mjq0Var, int i) {
        JobInfo jobInfoM182532a = this.f175601c.m182532a(mjq0Var, i);
        qzv qzvVarM178829e = qzv.m178829e();
        String str = f175598f;
        qzvVarM178829e.mo178832a(str, "Scheduling work ID " + mjq0Var.id + "Job ID " + i);
        try {
            if (this.f175600b.schedule(jobInfoM182532a) == 0) {
                qzv.m178829e().mo178839k(str, "Unable to schedule work ID " + mjq0Var.id);
                if (mjq0Var.expedited && mjq0Var.outOfQuotaPolicy == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    mjq0Var.expedited = false;
                    qzv.m178829e().mo178832a(str, String.format("Scheduling a non-expedited job (work ID %s)", mjq0Var.id));
                    m192138j(mjq0Var, i);
                }
            }
        } catch (IllegalStateException e) {
            String strM155292a = lpq.m155292a(this.f175599a, this.f175602d, this.f175603e);
            qzv.m178829e().mo178834c(f175598f, strM155292a);
            IllegalStateException illegalStateException = new IllegalStateException(strM155292a, e);
            b16<Throwable> b16VarM4385l = this.f175603e.m4385l();
            if (b16VarM4385l == null) {
                throw illegalStateException;
            }
            b16VarM4385l.accept(illegalStateException);
        } catch (Throwable th) {
            qzv.m178829e().mo178835d(f175598f, "Unable to schedule " + mjq0Var, th);
        }
    }

    @VisibleForTesting
    public tph0(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull C0763a c0763a, @NonNull JobScheduler jobScheduler, @NonNull rph0 rph0Var) {
        this.f175599a = context;
        this.f175600b = jobScheduler;
        this.f175601c = rph0Var;
        this.f175602d = workDatabase;
        this.f175603e = c0763a;
    }
}
