package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.j01;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "", "array", "", "a", "([Ljava/lang/Object;)Ljava/util/Iterator;", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ArrayIteratorKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> Iterator<T> m88345a(@NotNull T[] tArr) {
        tArr.getClass();
        return new j01(tArr);
    }
}
