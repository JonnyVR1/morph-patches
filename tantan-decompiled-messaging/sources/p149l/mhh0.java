package p149l;

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
import androidx.work.C0761a;
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
public class mhh0 implements dud0 {

    /* JADX INFO: renamed from: f */
    public static final String f133817f = txv.m190978i("SystemJobScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f133818a;

    /* JADX INFO: renamed from: b */
    public final JobScheduler f133819b;

    /* JADX INFO: renamed from: c */
    public final khh0 f133820c;

    /* JADX INFO: renamed from: d */
    public final WorkDatabase f133821d;

    /* JADX INFO: renamed from: e */
    public final C0761a f133822e;

    public mhh0(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull C0761a c0761a) {
        this(context, workDatabase, c0761a, mnq.m155532c(context), new khh0(context, c0761a.getClock(), c0761a.getIsMarkingJobsAsImportantWhileForeground()));
    }

    /* JADX INFO: renamed from: a */
    public static void m154622a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            mnq.m155532c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listM154625g = m154625g(context, jobScheduler);
        if (listM154625g == null || listM154625g.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listM154625g.iterator();
        while (it.hasNext()) {
            m154623e(jobScheduler, it.next().getId());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m154623e(@NonNull JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            txv.m190976e().mo190982d(f133817f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static List<Integer> m154624f(@NonNull Context context, @NonNull JobScheduler jobScheduler, @NonNull String str) {
        List<JobInfo> listM154625g = m154625g(context, jobScheduler);
        if (listM154625g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listM154625g) {
            k9q0 k9q0VarM154626h = m154626h(jobInfo);
            if (k9q0VarM154626h != null && str.equals(k9q0VarM154626h.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static List<JobInfo> m154625g(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> listM155531b = mnq.m155531b(jobScheduler);
        if (listM155531b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listM155531b.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listM155531b) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static k9q0 m154626h(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new k9q0(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m154627i(@NonNull Context context, @NonNull WorkDatabase workDatabase) {
        JobScheduler jobSchedulerM155532c = mnq.m155532c(context);
        List<JobInfo> listM154625g = m154625g(context, jobSchedulerM155532c);
        List<String> listMo101840d = workDatabase.systemIdInfoDao().mo101840d();
        boolean z = false;
        HashSet hashSet = new HashSet(listM154625g != null ? listM154625g.size() : 0);
        if (listM154625g != null && !listM154625g.isEmpty()) {
            for (JobInfo jobInfo : listM154625g) {
                k9q0 k9q0VarM154626h = m154626h(jobInfo);
                if (k9q0VarM154626h != null) {
                    hashSet.add(k9q0VarM154626h.getWorkSpecId());
                } else {
                    m154623e(jobSchedulerM155532c, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listMo101840d.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                txv.m190976e().mo190979a(f133817f, "Reconciling jobs");
                z = true;
                break;
            }
        }
        if (!z) {
            return z;
        }
        workDatabase.beginTransaction();
        try {
            iaq0 iaq0VarWorkSpecDao = workDatabase.workSpecDao();
            Iterator<String> it2 = listMo101840d.iterator();
            while (it2.hasNext()) {
                iaq0VarWorkSpecDao.mo135193y(it2.next(), -1L);
            }
            workDatabase.setTransactionSuccessful();
            return z;
        } finally {
            workDatabase.endTransaction();
        }
    }

    @Override // p149l.dud0
    /* JADX INFO: renamed from: b */
    public boolean mo113682b() {
        return true;
    }

    @Override // p149l.dud0
    /* JADX INFO: renamed from: c */
    public void mo113683c(@NonNull String str) {
        List<Integer> listM154624f = m154624f(this.f133818a, this.f133819b, str);
        if (listM154624f == null || listM154624f.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listM154624f.iterator();
        while (it.hasNext()) {
            m154623e(this.f133819b, it.next().intValue());
        }
        this.f133821d.systemIdInfoDao().mo101843g(str);
    }

    @Override // p149l.dud0
    /* JADX INFO: renamed from: d */
    public void mo113684d(@NonNull haq0... haq0VarArr) {
        abm abmVar = new abm(this.f133821d);
        for (haq0 haq0Var : haq0VarArr) {
            this.f133821d.beginTransaction();
            try {
                haq0 haq0VarMo135190v = this.f133821d.workSpecDao().mo135190v(haq0Var.id);
                if (haq0VarMo135190v == null) {
                    txv.m190976e().mo190986k(f133817f, "Skipping scheduling " + haq0Var.id + " because it's no longer in the DB");
                    this.f133821d.setTransactionSuccessful();
                } else if (haq0VarMo135190v.state != WorkInfo.State.ENQUEUED) {
                    txv.m190976e().mo190986k(f133817f, "Skipping scheduling " + haq0Var.id + " because it is no longer enqueued");
                    this.f133821d.setTransactionSuccessful();
                } else {
                    k9q0 k9q0VarM163363a = oaq0.m163363a(haq0Var);
                    ahh0 ahh0VarM101837a = this.f133821d.systemIdInfoDao().m101837a(k9q0VarM163363a);
                    int iM95692d = ahh0VarM101837a != null ? ahh0VarM101837a.systemId : abmVar.m95692d(this.f133822e.getMinJobSchedulerId(), this.f133822e.getMaxJobSchedulerId());
                    if (ahh0VarM101837a == null) {
                        this.f133821d.systemIdInfoDao().mo101839c(dhh0.m111820a(k9q0VarM163363a, iM95692d));
                    }
                    m154628j(haq0Var, iM95692d);
                    this.f133821d.setTransactionSuccessful();
                }
                this.f133821d.endTransaction();
            } catch (Throwable th) {
                this.f133821d.endTransaction();
                throw th;
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public void m154628j(@NonNull haq0 haq0Var, int i) {
        JobInfo jobInfoM145960a = this.f133820c.m145960a(haq0Var, i);
        txv txvVarM190976e = txv.m190976e();
        String str = f133817f;
        txvVarM190976e.mo190979a(str, "Scheduling work ID " + haq0Var.id + "Job ID " + i);
        try {
            if (this.f133819b.schedule(jobInfoM145960a) == 0) {
                txv.m190976e().mo190986k(str, "Unable to schedule work ID " + haq0Var.id);
                if (haq0Var.expedited && haq0Var.outOfQuotaPolicy == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    haq0Var.expedited = false;
                    txv.m190976e().mo190979a(str, String.format("Scheduling a non-expedited job (work ID %s)", haq0Var.id));
                    m154628j(haq0Var, i);
                }
            }
        } catch (IllegalStateException e) {
            String strM155530a = mnq.m155530a(this.f133818a, this.f133821d, this.f133822e);
            txv.m190976e().mo190981c(f133817f, strM155530a);
            IllegalStateException illegalStateException = new IllegalStateException(strM155530a, e);
            wz5<Throwable> wz5VarM4383l = this.f133822e.m4383l();
            if (wz5VarM4383l == null) {
                throw illegalStateException;
            }
            wz5VarM4383l.accept(illegalStateException);
        } catch (Throwable th) {
            txv.m190976e().mo190982d(f133817f, "Unable to schedule " + haq0Var, th);
        }
    }

    @VisibleForTesting
    public mhh0(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull C0761a c0761a, @NonNull JobScheduler jobScheduler, @NonNull khh0 khh0Var) {
        this.f133818a = context;
        this.f133819b = jobScheduler;
        this.f133820c = khh0Var;
        this.f133821d = workDatabase;
        this.f133822e = c0761a;
    }
}
