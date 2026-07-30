package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Landroidx/work/impl/WorkDatabase;", "", Constants.KEY_KEY, "", Constants.INAPP_DATA_TAG, "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)I", "value", "", "e", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;I)V", "Landroid/content/Context;", "context", "Ll/fzg0;", "sqLiteDatabase", "c", "(Landroid/content/Context;Ll/fzg0;)V", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class bbm {
    /* JADX INFO: renamed from: c */
    public static final void m100986c(@NotNull Context context, @NotNull fzg0 fzg0Var) {
        context.getClass();
        fzg0Var.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            fzg0Var.beginTransaction();
            try {
                fzg0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                fzg0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                fzg0Var.setTransactionSuccessful();
            } finally {
                fzg0Var.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m100987d(WorkDatabase workDatabase, String str) {
        Long lMo188877b = workDatabase.preferenceDao().mo188877b(str);
        int iLongValue = lMo188877b != null ? (int) lMo188877b.longValue() : 0;
        m100988e(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    /* JADX INFO: renamed from: e */
    public static final void m100988e(WorkDatabase workDatabase, String str, int i) {
        workDatabase.preferenceDao().mo188876a(new sh80(str, Long.valueOf(i)));
    }
}
