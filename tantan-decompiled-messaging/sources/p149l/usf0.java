package p149l;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001c\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b*\f\b\u0000\u0010\u0010\"\u00020\u000f2\u00020\u000f*\f\b\u0000\u0010\u0011\"\u00020\u00052\u00020\u0005¨\u0006\u0012"}, m87232d2 = {"", "E", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/StackTraceElement;", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "baseContinuationImplClassName", "c", "stackTraceRecoveryClassName", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class usf0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final StackTraceElement f177967a = new z01().m216713a();

    /* JADX INFO: renamed from: b */
    public static final String f177968b;

    /* JADX INFO: renamed from: c */
    public static final String f177969c;

    static {
        Object objM223820constructorimpl;
        Object objM223820constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        if (Result.m223823exceptionOrNullimpl(objM223820constructorimpl) != null) {
            objM223820constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f177968b = (String) objM223820constructorimpl;
        try {
            objM223820constructorimpl2 = Result.m223820constructorimpl(usf0.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM223820constructorimpl2 = Result.m223820constructorimpl(ResultKt.m87238a(th2));
        }
        if (Result.m223823exceptionOrNullimpl(objM223820constructorimpl2) != null) {
            objM223820constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f177969c = (String) objM223820constructorimpl2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <E extends Throwable> E m195195a(@NotNull E e) {
        return e;
    }
}
