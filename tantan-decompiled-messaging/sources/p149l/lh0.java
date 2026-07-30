package p149l;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0776a;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class lh0 {

    /* JADX INFO: renamed from: a */
    public static final String f128027a = txv.m190978i("Alarms");

    /* JADX INFO: renamed from: a */
    public static void m149803a(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull k9q0 k9q0Var) {
        bhh0 bhh0VarSystemIdInfoDao = workDatabase.systemIdInfoDao();
        ahh0 ahh0VarM101837a = bhh0VarSystemIdInfoDao.m101837a(k9q0Var);
        if (ahh0VarM101837a != null) {
            m149804b(context, k9q0Var, ahh0VarM101837a.systemId);
            txv.m190976e().mo190979a(f128027a, "Removing SystemIdInfo for workSpecId (" + k9q0Var + ")");
            bhh0VarSystemIdInfoDao.m101842f(k9q0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m149804b(@NonNull Context context, @NonNull k9q0 k9q0Var, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i, C0776a.m4528b(context, k9q0Var), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        txv.m190976e().mo190979a(f128027a, "Cancelling existing alarm with (workSpecId, systemId) (" + k9q0Var + ", " + i + ")");
        alarmManager.cancel(service);
    }

    /* JADX INFO: renamed from: c */
    public static void m149805c(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull k9q0 k9q0Var, long j) {
        bhh0 bhh0VarSystemIdInfoDao = workDatabase.systemIdInfoDao();
        ahh0 ahh0VarM101837a = bhh0VarSystemIdInfoDao.m101837a(k9q0Var);
        if (ahh0VarM101837a != null) {
            m149804b(context, k9q0Var, ahh0VarM101837a.systemId);
            m149806d(context, k9q0Var, ahh0VarM101837a.systemId, j);
        } else {
            int iM95691c = new abm(workDatabase).m95691c();
            bhh0VarSystemIdInfoDao.mo101839c(dhh0.m111820a(k9q0Var, iM95691c));
            m149806d(context, k9q0Var, iM95691c, j);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m149806d(@NonNull Context context, @NonNull k9q0 k9q0Var, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i, C0776a.m4528b(context, k9q0Var), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
