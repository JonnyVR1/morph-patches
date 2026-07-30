package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"", "primitive", "Ljava/lang/Boolean;", "a", "(Z)Ljava/lang/Boolean;", "", "Ljava/lang/Integer;", "b", "(I)Ljava/lang/Integer;", "", "Ljava/lang/Long;", "c", "(J)Ljava/lang/Long;", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmName
public final class Boxing {
    @SinceKotlin
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Boolean m87370a(boolean z) {
        return Boolean.valueOf(z);
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Integer m87371b(int i) {
        return new Integer(i);
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Long m87372c(long j) {
        return new Long(j);
    }
}
