package p153l;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, m88121d2 = {"Lkotlin/coroutines/Continuation;", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/String;", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class u9c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m195086a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m195087b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m195088c(@NotNull Continuation<?> continuation) {
        Object objM225066constructorimpl;
        if (continuation instanceof l5e) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(continuation + '@' + m195087b(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        if (Result.m225069exceptionOrNullimpl(objM225066constructorimpl) != null) {
            objM225066constructorimpl = continuation.getClass().getName() + '@' + m195087b(continuation);
        }
        return (String) objM225066constructorimpl;
    }
}
