package p153l;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/o3d0;", "Ll/ua00;", "Landroid/content/Context;", "mContext", "", "startVersion", "endVersion", "<init>", "(Landroid/content/Context;II)V", "Ll/n7h0;", "db", "", "a", "(Ll/n7h0;)V", "c", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class o3d0 extends ua00 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context mContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3d0(@NotNull Context context, int i, int i2) {
        super(i, i2);
        context.getClass();
        this.mContext = context;
    }

    @Override // p153l.ua00
    /* JADX INFO: renamed from: a */
    public void mo96672a(@NotNull n7h0 db) {
        db.getClass();
        if (this.endVersion >= 10) {
            db.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.mContext.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
