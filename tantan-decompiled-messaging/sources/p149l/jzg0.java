package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m87232d2 = {"Ll/jzg0;", "Ll/hzg0;", "", "execute", "()V", "", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "", "simpleQueryForString", "()Ljava/lang/String;", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public interface jzg0 extends hzg0 {
    void execute();

    long executeInsert();

    int executeUpdateDelete();

    long simpleQueryForLong();

    @Nullable
    String simpleQueryForString();
}
