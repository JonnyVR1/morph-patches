package p149l;

import android.database.sqlite.SQLiteStatement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Ll/t5j;", "Ll/s5j;", "Ll/jzg0;", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "", "execute", "()V", "", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "", "simpleQueryForString", "()Ljava/lang/String;", "b", "Landroid/database/sqlite/SQLiteStatement;", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class t5j extends s5j implements jzg0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SQLiteStatement delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5j(@NotNull SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sQLiteStatement.getClass();
        this.delegate = sQLiteStatement;
    }

    @Override // p149l.jzg0
    public void execute() {
        this.delegate.execute();
    }

    @Override // p149l.jzg0
    public long executeInsert() {
        return this.delegate.executeInsert();
    }

    @Override // p149l.jzg0
    public int executeUpdateDelete() {
        return this.delegate.executeUpdateDelete();
    }

    @Override // p149l.jzg0
    public long simpleQueryForLong() {
        return this.delegate.simpleQueryForLong();
    }

    @Override // p149l.jzg0
    @Nullable
    public String simpleQueryForString() {
        return this.delegate.simpleQueryForString();
    }
}
