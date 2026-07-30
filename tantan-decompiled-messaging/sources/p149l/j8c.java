package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010*\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010-\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188G¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u001d¨\u00060"}, m87232d2 = {"Ll/j8c;", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "source", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "b", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCreationStackBottom$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "creationStackBottom", "", "c", "J", "getSequenceNumber", "()J", "sequenceNumber", "", "Ljava/lang/StackTraceElement;", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "getCreationStackTrace", "()Ljava/util/List;", "creationStackTrace", "", "e", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "state", "Ljava/lang/Thread;", "f", "Ljava/lang/Thread;", "getLastObservedThread", "()Ljava/lang/Thread;", "lastObservedThread", "g", "getLastObservedFrame", "lastObservedFrame", "h", "lastObservedStackTrace", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
public final class j8c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final CoroutineStackFrame creationStackBottom;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long sequenceNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<StackTraceElement> creationStackTrace;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final Thread lastObservedThread;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final CoroutineStackFrame lastObservedFrame;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final List<StackTraceElement> lastObservedStackTrace;

    public j8c(@NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl, @NotNull CoroutineContext coroutineContext) {
        this.context = coroutineContext;
        debugCoroutineInfoImpl.m94041d();
        this.creationStackBottom = null;
        this.sequenceNumber = debugCoroutineInfoImpl.sequenceNumber;
        this.creationStackTrace = debugCoroutineInfoImpl.m94042e();
        this.state = debugCoroutineInfoImpl.get_state();
        this.lastObservedThread = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedFrame = debugCoroutineInfoImpl.m94043f();
        this.lastObservedStackTrace = debugCoroutineInfoImpl.m94045h();
    }
}
