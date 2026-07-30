package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.mt5;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lkotlin/reflect/jvm/internal/CacheByClass;", "a", "(Lkotlin/jvm/functions/Function1;)Lkotlin/reflect/jvm/internal/CacheByClass;", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class CacheByClassKt {
    static {
        Object objM225066constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        if (Result.m225073isSuccessimpl(objM225066constructorimpl)) {
            objM225066constructorimpl = Boolean.TRUE;
        }
        Object objM225066constructorimpl2 = Result.m225066constructorimpl(objM225066constructorimpl);
        Boolean bool = Boolean.FALSE;
        if (Result.m225072isFailureimpl(objM225066constructorimpl2)) {
            objM225066constructorimpl2 = bool;
        }
        ((Boolean) objM225066constructorimpl2).getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <V> CacheByClass<V> m88546a(@NotNull Function1<? super Class<?>, ? extends V> function1) {
        function1.getClass();
        return new mt5(function1);
    }
}
