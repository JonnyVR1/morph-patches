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
import androidx.work.C0763a;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import p153l.b16;
import p153l.c1j;
import p153l.diq0;
import p153l.ejq0;
import p153l.gq80;
import p153l.mjq0;
import p153l.n2e0;
import p153l.nfk0;
import p153l.njq0;
import p153l.qzv;
import p153l.rk90;
import p153l.tph0;
import p153l.xiq0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final String f3607e = qzv.m178831i("ForceStopRunnable");

    /* JADX INFO: renamed from: f */
    public static final long f3608f = 315360000000L;

    /* JADX INFO: renamed from: a */
    public final Context f3609a;

    /* JADX INFO: renamed from: b */
    public final xiq0 f3610b;

    /* JADX INFO: renamed from: c */
    public final gq80 f3611c;

    /* JADX INFO: renamed from: d */
    public int f3612d = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String TAG = qzv.m178831i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            qzv.m178829e().mo178838j(TAG, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.m4625g(context);
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull xiq0 xiq0Var) {
        this.f3609a = context.getApplicationContext();
        this.f3610b = xiq0Var;
        this.f3611c = xiq0Var.m211159q();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static Intent m4623c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* JADX INFO: renamed from: d */
    public static PendingIntent m4624d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m4623c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: g */
    public static void m4625g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntentM4624d = m4624d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f3608f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentM4624d);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public boolean m4626a() {
        boolean zM192137i = tph0.m192137i(this.f3609a, this.f3610b.m211163u());
        WorkDatabase workDatabaseM211163u = this.f3610b.m211163u();
        njq0 njq0VarWorkSpecDao = workDatabaseM211163u.workSpecDao();
        ejq0 ejq0VarWorkProgressDao = workDatabaseM211163u.workProgressDao();
        workDatabaseM211163u.beginTransaction();
        try {
            List<mjq0> listMo163432D = njq0VarWorkSpecDao.mo163432D();
            boolean z = (listMo163432D == null || listMo163432D.isEmpty()) ? false : true;
            if (z) {
                for (mjq0 mjq0Var : listMo163432D) {
                    njq0VarWorkSpecDao.mo163445j(WorkInfo.State.ENQUEUED, mjq0Var.id);
                    njq0VarWorkSpecDao.mo163437b(mjq0Var.id, -512);
                    njq0VarWorkSpecDao.mo163460y(mjq0Var.id, -1L);
                }
            }
            ejq0VarWorkProgressDao.mo120986b();
            workDatabaseM211163u.setTransactionSuccessful();
            workDatabaseM211163u.endTransaction();
            return z || zM192137i;
        } catch (Throwable th) {
            workDatabaseM211163u.endTransaction();
            throw th;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public void m4627b() {
        boolean zM4626a = m4626a();
        if (m4630h()) {
            qzv.m178829e().mo178832a(f3607e, "Rescheduling Workers.");
            this.f3610b.m211167y();
            this.f3610b.m211159q().m131364f(false);
        } else if (m4628e()) {
            qzv.m178829e().mo178832a(f3607e, "Application was force-stopped, rescheduling.");
            this.f3610b.m211167y();
            this.f3611c.m131363e(this.f3610b.m211158n().getClock().currentTimeMillis());
        } else if (zM4626a) {
            qzv.m178829e().mo178832a(f3607e, "Found unfinished work, scheduling it.");
            n2e0.m161226f(this.f3610b.m211158n(), this.f3610b.m211163u(), this.f3610b.m211161s());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public boolean m4628e() {
        try {
            int i = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentM4624d = m4624d(this.f3609a, i >= 31 ? 570425344 : 536870912);
            if (i >= 30) {
                if (pendingIntentM4624d != null) {
                    pendingIntentM4624d.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f3609a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jM131360a = this.f3611c.m131360a();
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        ApplicationExitInfo applicationExitInfoM107616a = c1j.m107616a(historicalProcessExitReasons.get(i2));
                        if (applicationExitInfoM107616a.getReason() == 10 && applicationExitInfoM107616a.getTimestamp() >= jM131360a) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentM4624d == null) {
                m4625g(this.f3609a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            e = e;
            qzv.m178829e().mo178840l(f3607e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e2) {
            e = e2;
            qzv.m178829e().mo178840l(f3607e, "Ignoring exception", e);
            return true;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public boolean m4629f() {
        C0763a c0763aM211158n = this.f3610b.m211158n();
        if (TextUtils.isEmpty(c0763aM211158n.getDefaultProcessName())) {
            qzv.m178829e().mo178832a(f3607e, "The default process name was not specified.");
            return true;
        }
        boolean zM181782b = rk90.m181782b(this.f3609a, c0763aM211158n);
        qzv.m178829e().mo178832a(f3607e, "Is default app process = " + zM181782b);
        return zM181782b;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public boolean m4630h() {
        return this.f3610b.m211159q().m131361b();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public void m4631i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (m4629f()) {
                while (true) {
                    try {
                        diq0.m115952d(this.f3609a);
                        qzv.m178829e().mo178832a(f3607e, "Performing cleanup operations.");
                        try {
                            m4627b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                            i = this.f3612d + 1;
                            this.f3612d = i;
                            if (i >= 3) {
                                String str = nfk0.m162929a(this.f3609a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                qzv qzvVarM178829e = qzv.m178829e();
                                String str2 = f3607e;
                                qzvVarM178829e.mo178835d(str2, str, e);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e);
                                b16<Throwable> b16VarM4378e = this.f3610b.m211158n().m4378e();
                                if (b16VarM4378e == null) {
                                    throw illegalStateException;
                                }
                                qzv.m178829e().mo178833b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                b16VarM4378e.accept(illegalStateException);
                                break;
                            }
                            qzv.m178829e().mo178833b(f3607e, "Retrying after " + (((long) i) * 300), e);
                            m4631i(((long) this.f3612d) * 300);
                        }
                        qzv.m178829e().mo178833b(f3607e, "Retrying after " + (((long) i) * 300), e);
                        m4631i(((long) this.f3612d) * 300);
                    } catch (SQLiteException e2) {
                        qzv.m178829e().mo178834c(f3607e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                        b16<Throwable> b16VarM4378e2 = this.f3610b.m211158n().m4378e();
                        if (b16VarM4378e2 == null) {
                            throw illegalStateException2;
                        }
                        b16VarM4378e2.accept(illegalStateException2);
                    }
                }
            }
            this.f3610b.m211166x();
        } catch (Throwable th) {
            this.f3610b.m211166x();
            throw th;
        }
    }
}
