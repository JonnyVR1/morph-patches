package p149l;

import androidx.room.RoomDatabase;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/n75;", "Landroidx/room/RoomDatabase$b;", "Ll/r95;", "clock", "<init>", "(Ll/r95;)V", "Ll/fzg0;", "db", "", "c", "(Ll/fzg0;)V", "a", "Ll/r95;", "getClock", "()Ll/r95;", "", "e", "()Ljava/lang/String;", "pruneSQL", "", Constants.INAPP_DATA_TAG, "()J", "pruneDate", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class n75 extends RoomDatabase.AbstractC0656b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final r95 clock;

    public n75(@NotNull r95 r95Var) {
        r95Var.getClass();
        this.clock = r95Var;
    }

    @Override // androidx.room.RoomDatabase.AbstractC0656b
    /* JADX INFO: renamed from: c */
    public void mo3920c(@NotNull fzg0 db) {
        db.getClass();
        super.mo3920c(db);
        db.beginTransaction();
        try {
            db.execSQL(m158108e());
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m158107d() {
        return this.clock.currentTimeMillis() - x8q0.f191539a;
    }

    /* JADX INFO: renamed from: e */
    public final String m158108e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + m158107d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
