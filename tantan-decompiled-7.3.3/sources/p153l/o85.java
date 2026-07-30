package p153l;

import androidx.room.RoomDatabase;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/o85;", "Landroidx/room/RoomDatabase$b;", "Ll/sa5;", "clock", "<init>", "(Ll/sa5;)V", "Ll/n7h0;", "db", "", "c", "(Ll/n7h0;)V", "a", "Ll/sa5;", "getClock", "()Ll/sa5;", "", "e", "()Ljava/lang/String;", "pruneSQL", "", Constants.INAPP_DATA_TAG, "()J", "pruneDate", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class o85 extends RoomDatabase.AbstractC0658b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final sa5 clock;

    public o85(@NotNull sa5 sa5Var) {
        sa5Var.getClass();
        this.clock = sa5Var;
    }

    @Override // androidx.room.RoomDatabase.AbstractC0658b
    /* JADX INFO: renamed from: c */
    public void mo3922c(@NotNull n7h0 db) {
        db.getClass();
        super.mo3922c(db);
        db.beginTransaction();
        try {
            db.execSQL(m166448e());
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m166447d() {
        return this.clock.currentTimeMillis() - ciq0.f81973a;
    }

    /* JADX INFO: renamed from: e */
    public final String m166448e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + m166447d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
