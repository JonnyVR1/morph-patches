package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.work.C0761a;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import p149l.bi80;
import p149l.gyi;
import p149l.h6k0;
import p149l.haq0;
import p149l.iaq0;
import p149l.jud0;
import p149l.mhh0;
import p149l.nc90;
import p149l.s9q0;
import p149l.txv;
import p149l.wz5;
import p149l.y8q0;
import p149l.z9q0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final String f3607e = txv.m190978i("ForceStopRunnable");

    /* JADX INFO: renamed from: f */
    public static final long f3608f = 315360000000L;

    /* JADX INFO: renamed from: a */
    public final Context f3609a;

    /* JADX INFO: renamed from: b */
    public final s9q0 f3610b;

    /* JADX INFO: renamed from: c */
    public final bi80 f3611c;

    /* JADX INFO: renamed from: d */
    public int f3612d = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String TAG = txv.m190978i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            txv.m190976e().mo190985j(TAG, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.m4623g(context);
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull s9q0 s9q0Var) {
        this.f3609a = context.getApplicationContext();
        this.f3610b = s9q0Var;
        this.f3611c = s9q0Var.m182746q();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static Intent m4621c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* JADX INFO: renamed from: d */
    public static PendingIntent m4622d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m4621c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: g */
    public static void m4623g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntentM4622d = m4622d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f3608f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentM4622d);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public boolean m4624a() {
        boolean zM154627i = mhh0.m154627i(this.f3609a, this.f3610b.m182750u());
        WorkDatabase workDatabaseM182750u = this.f3610b.m182750u();
        iaq0 iaq0VarWorkSpecDao = workDatabaseM182750u.workSpecDao();
        z9q0 z9q0VarWorkProgressDao = workDatabaseM182750u.workProgressDao();
        workDatabaseM182750u.beginTransaction();
        try {
            List<haq0> listMo135165D = iaq0VarWorkSpecDao.mo135165D();
            boolean z = (listMo135165D == null || listMo135165D.isEmpty()) ? false : true;
            if (z) {
                for (haq0 haq0Var : listMo135165D) {
                    iaq0VarWorkSpecDao.mo135178j(WorkInfo.State.ENQUEUED, haq0Var.id);
                    iaq0VarWorkSpecDao.mo135170b(haq0Var.id, -512);
                    iaq0VarWorkSpecDao.mo135193y(haq0Var.id, -1L);
                }
            }
            z9q0VarWorkProgressDao.mo95568b();
            workDatabaseM182750u.setTransactionSuccessful();
            workDatabaseM182750u.endTransaction();
            return z || zM154627i;
        } catch (Throwable th) {
            workDatabaseM182750u.endTransaction();
            throw th;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public void m4625b() {
        boolean zM4624a = m4624a();
        if (m4628h()) {
            txv.m190976e().mo190979a(f3607e, "Rescheduling Workers.");
            this.f3610b.m182754y();
            this.f3610b.m182746q().m101993f(false);
        } else if (m4626e()) {
            txv.m190976e().mo190979a(f3607e, "Application was force-stopped, rescheduling.");
            this.f3610b.m182754y();
            this.f3611c.m101992e(this.f3610b.m182745n().getClock().currentTimeMillis());
        } else if (zM4624a) {
            txv.m190976e().mo190979a(f3607e, "Found unfinished work, scheduling it.");
            jud0.m143288f(this.f3610b.m182745n(), this.f3610b.m182750u(), this.f3610b.m182748s());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public boolean m4626e() {
        try {
            int i = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentM4622d = m4622d(this.f3609a, i >= 31 ? 570425344 : 536870912);
            if (i >= 30) {
                if (pendingIntentM4622d != null) {
                    pendingIntentM4622d.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f3609a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jM101989a = this.f3611c.m101989a();
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        ApplicationExitInfo applicationExitInfoM128711a = gyi.m128711a(historicalProcessExitReasons.get(i2));
                        if (applicationExitInfoM128711a.getReason() == 10 && applicationExitInfoM128711a.getTimestamp() >= jM101989a) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentM4622d == null) {
                m4623g(this.f3609a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            e = e;
            txv.m190976e().mo190987l(f3607e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e2) {
            e = e2;
            txv.m190976e().mo190987l(f3607e, "Ignoring exception", e);
            return true;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public boolean m4627f() {
        C0761a c0761aM182745n = this.f3610b.m182745n();
        if (TextUtils.isEmpty(c0761aM182745n.getDefaultProcessName())) {
            txv.m190976e().mo190979a(f3607e, "The default process name was not specified.");
            return true;
        }
        boolean zM158928b = nc90.m158928b(this.f3609a, c0761aM182745n);
        txv.m190976e().mo190979a(f3607e, "Is default app process = " + zM158928b);
        return zM158928b;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public boolean m4628h() {
        return this.f3610b.m182746q().m101990b();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public void m4629i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (m4627f()) {
                while (true) {
                    try {
                        y8q0.m213427d(this.f3609a);
                        txv.m190976e().mo190979a(f3607e, "Performing cleanup operations.");
                        try {
                            m4625b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                            i = this.f3612d + 1;
                            this.f3612d = i;
                            if (i >= 3) {
                                String str = h6k0.m129483a(this.f3609a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                txv txvVarM190976e = txv.m190976e();
                                String str2 = f3607e;
                                txvVarM190976e.mo190982d(str2, str, e);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e);
                                wz5<Throwable> wz5VarM4376e = this.f3610b.m182745n().m4376e();
                                if (wz5VarM4376e == null) {
                                    throw illegalStateException;
                                }
                                txv.m190976e().mo190980b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                wz5VarM4376e.accept(illegalStateException);
                                break;
                            }
                            txv.m190976e().mo190980b(f3607e, "Retrying after " + (((long) i) * 300), e);
                            m4629i(((long) this.f3612d) * 300);
                        }
                        txv.m190976e().mo190980b(f3607e, "Retrying after " + (((long) i) * 300), e);
                        m4629i(((long) this.f3612d) * 300);
                    } catch (SQLiteException e2) {
                        txv.m190976e().mo190981c(f3607e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                        wz5<Throwable> wz5VarM4376e2 = this.f3610b.m182745n().m4376e();
                        if (wz5VarM4376e2 == null) {
                            throw illegalStateException2;
                        }
                        wz5VarM4376e2.accept(illegalStateException2);
                    }
                }
            }
            this.f3610b.m182753x();
        } catch (Throwable th) {
            this.f3610b.m182753x();
            throw th;
        }
    }
}
