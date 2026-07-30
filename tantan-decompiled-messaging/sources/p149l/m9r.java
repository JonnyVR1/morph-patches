package p149l;

import kotlin.InitializedLazyImpl;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "value", "Lkotlin/Lazy;", "c", "(Ljava/lang/Object;)Lkotlin/Lazy;", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/LazyKt")
public class m9r extends LazyKt__LazyJVMKt {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static <T> Lazy<T> m153617c(T t) {
        return new InitializedLazyImpl(t);
    }
}
