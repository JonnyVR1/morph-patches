package androidx.datastore.core;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Landroidx/datastore/core/CorruptionException;", "Ljava/io/IOException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class CorruptionException extends IOException {
    public /* synthetic */ CorruptionException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(@NotNull String str, @Nullable Throwable th) {
        super(str, th);
        str.getClass();
    }
}
