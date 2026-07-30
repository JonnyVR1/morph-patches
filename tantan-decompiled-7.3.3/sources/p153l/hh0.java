package p153l;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0778a;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class hh0 {

    /* JADX INFO: renamed from: a */
    public static final String f109469a = qzv.m178831i("Alarms");

    /* JADX INFO: renamed from: a */
    public static void m135006a(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull piq0 piq0Var) {
        iph0 iph0VarSystemIdInfoDao = workDatabase.systemIdInfoDao();
        hph0 hph0VarM141463a = iph0VarSystemIdInfoDao.m141463a(piq0Var);
        if (hph0VarM141463a != null) {
            m135007b(context, piq0Var, hph0VarM141463a.systemId);
            qzv.m178829e().mo178832a(f109469a, "Removing SystemIdInfo for workSpecId (" + piq0Var + ")");
            iph0VarSystemIdInfoDao.m141468f(piq0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m135007b(@NonNull Context context, @NonNull piq0 piq0Var, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i, C0778a.m4530b(context, piq0Var), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        qzv.m178829e().mo178832a(f109469a, "Cancelling existing alarm with (workSpecId, systemId) (" + piq0Var + ", " + i + ")");
        alarmManager.cancel(service);
    }

    /* JADX INFO: renamed from: c */
    public static void m135008c(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull piq0 piq0Var, long j) {
        iph0 iph0VarSystemIdInfoDao = workDatabase.systemIdInfoDao();
        hph0 hph0VarM141463a = iph0VarSystemIdInfoDao.m141463a(piq0Var);
        if (hph0VarM141463a != null) {
            m135007b(context, piq0Var, hph0VarM141463a.systemId);
            m135009d(context, piq0Var, hph0VarM141463a.systemId, j);
        } else {
            int iM176180c = new qdm(workDatabase).m176180c();
            iph0VarSystemIdInfoDao.mo141465c(kph0.m150728a(piq0Var, iM176180c));
            m135009d(context, piq0Var, iM176180c, j);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m135009d(@NonNull Context context, @NonNull piq0 piq0Var, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i, C0778a.m4530b(context, piq0Var), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
