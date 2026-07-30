package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class bi80 {

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f75710a;

    public bi80(@NonNull WorkDatabase workDatabase) {
        this.f75710a = workDatabase;
    }

    /* JADX INFO: renamed from: c */
    public static void m101988c(@NonNull Context context, @NonNull fzg0 fzg0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            fzg0Var.beginTransaction();
            try {
                fzg0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                fzg0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                fzg0Var.setTransactionSuccessful();
            } finally {
                fzg0Var.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public long m101989a() {
        Long lMo188877b = this.f75710a.preferenceDao().mo188877b("last_force_stop_ms");
        if (lMo188877b != null) {
            return lMo188877b.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public boolean m101990b() {
        Long lMo188877b = this.f75710a.preferenceDao().mo188877b("reschedule_needed");
        return lMo188877b != null && lMo188877b.longValue() == 1;
    }

    /* JADX INFO: renamed from: d */
    public void m101991d(long j) {
        this.f75710a.preferenceDao().mo188876a(new sh80("last_cancel_all_time_ms", Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: e */
    public void m101992e(long j) {
        this.f75710a.preferenceDao().mo188876a(new sh80("last_force_stop_ms", Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: f */
    public void m101993f(boolean z) {
        this.f75710a.preferenceDao().mo188876a(new sh80("reschedule_needed", z));
    }
}
