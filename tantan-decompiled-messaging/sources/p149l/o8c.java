package p149l;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, m87232d2 = {"Lkotlin/coroutines/Continuation;", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/String;", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class o8c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m163111a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m163112b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m163113c(@NotNull Continuation<?> continuation) {
        Object objM223820constructorimpl;
        if (continuation instanceof x3e) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(continuation + '@' + m163112b(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        if (Result.m223823exceptionOrNullimpl(objM223820constructorimpl) != null) {
            objM223820constructorimpl = continuation.getClass().getName() + '@' + m163112b(continuation);
        }
        return (String) objM223820constructorimpl;
    }
}
