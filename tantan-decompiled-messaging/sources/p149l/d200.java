package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/d200;", "Ll/x100;", "<init>", "()V", "Ll/fzg0;", "db", "", "a", "(Ll/fzg0;)V", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class d200 extends x100 {

    @NotNull
    public static final d200 INSTANCE = new d200();

    public d200() {
        super(3, 4);
    }

    @Override // p149l.x100
    /* JADX INFO: renamed from: a */
    public void mo94585a(@NotNull fzg0 db) {
        db.getClass();
        db.execSQL("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
