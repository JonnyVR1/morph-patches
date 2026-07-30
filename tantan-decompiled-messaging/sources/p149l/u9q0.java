package p149l;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/u9q0;", "Ll/x100;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/fzg0;", "db", "", "a", "(Ll/fzg0;)V", "c", "Landroid/content/Context;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class u9q0 extends x100 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9q0(@NotNull Context context) {
        super(9, 10);
        context.getClass();
        this.context = context;
    }

    @Override // p149l.x100
    /* JADX INFO: renamed from: a */
    public void mo94585a(@NotNull fzg0 db) {
        db.getClass();
        db.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bi80.m101988c(this.context, db);
        bbm.m100986c(this.context, db);
    }
}
