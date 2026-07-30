package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Landroidx/work/impl/WorkDatabase;", "", Constants.KEY_KEY, "", Constants.INAPP_DATA_TAG, "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)I", "value", "", "e", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;I)V", "Landroid/content/Context;", "context", "Ll/n7h0;", "sqLiteDatabase", "c", "(Landroid/content/Context;Ll/n7h0;)V", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class rdm {
    /* JADX INFO: renamed from: c */
    public static final void m180865c(@NotNull Context context, @NotNull n7h0 n7h0Var) {
        context.getClass();
        n7h0Var.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            n7h0Var.beginTransaction();
            try {
                n7h0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                n7h0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                n7h0Var.setTransactionSuccessful();
            } finally {
                n7h0Var.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m180866d(WorkDatabase workDatabase, String str) {
        Long lMo217006b = workDatabase.preferenceDao().mo217006b(str);
        int iLongValue = lMo217006b != null ? (int) lMo217006b.longValue() : 0;
        m180867e(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    /* JADX INFO: renamed from: e */
    public static final void m180867e(WorkDatabase workDatabase, String str, int i) {
        workDatabase.preferenceDao().mo217005a(new xp80(str, Long.valueOf(i)));
    }
}
