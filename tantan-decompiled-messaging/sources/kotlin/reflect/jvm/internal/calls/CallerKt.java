package kotlin.reflect.jvm.internal.calls;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u001c\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/calls/Caller;", "", "a", "(Lkotlin/reflect/jvm/internal/calls/Caller;)I", "arity", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class CallerKt {
    /* JADX INFO: renamed from: a */
    public static final int m88091a(@NotNull Caller<?> caller) {
        caller.getClass();
        return caller.getParameterTypes().size();
    }
}
