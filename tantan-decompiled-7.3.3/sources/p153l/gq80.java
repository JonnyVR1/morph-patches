package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class gq80 {

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f105665a;

    public gq80(@NonNull WorkDatabase workDatabase) {
        this.f105665a = workDatabase;
    }

    /* JADX INFO: renamed from: c */
    public static void m131359c(@NonNull Context context, @NonNull n7h0 n7h0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            n7h0Var.beginTransaction();
            try {
                n7h0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                n7h0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                n7h0Var.setTransactionSuccessful();
            } finally {
                n7h0Var.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public long m131360a() {
        Long lMo217006b = this.f105665a.preferenceDao().mo217006b("last_force_stop_ms");
        if (lMo217006b != null) {
            return lMo217006b.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public boolean m131361b() {
        Long lMo217006b = this.f105665a.preferenceDao().mo217006b("reschedule_needed");
        return lMo217006b != null && lMo217006b.longValue() == 1;
    }

    /* JADX INFO: renamed from: d */
    public void m131362d(long j) {
        this.f105665a.preferenceDao().mo217005a(new xp80("last_cancel_all_time_ms", Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: e */
    public void m131363e(long j) {
        this.f105665a.preferenceDao().mo217005a(new xp80("last_force_stop_ms", Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: f */
    public void m131364f(boolean z) {
        this.f105665a.preferenceDao().mo217005a(new xp80("reschedule_needed", z));
    }
}
