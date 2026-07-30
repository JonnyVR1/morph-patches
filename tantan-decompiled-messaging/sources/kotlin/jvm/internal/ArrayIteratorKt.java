package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.c01;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "", "array", "", "a", "([Ljava/lang/Object;)Ljava/util/Iterator;", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ArrayIteratorKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> Iterator<T> m87456a(@NotNull T[] tArr) {
        tArr.getClass();
        return new c01(tArr);
    }
}
