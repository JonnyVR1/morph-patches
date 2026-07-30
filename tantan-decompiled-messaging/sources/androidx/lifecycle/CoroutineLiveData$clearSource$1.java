package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.npb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "androidx.lifecycle.CoroutineLiveData", m87374f = "CoroutineLiveData.kt", m87375l = {226}, m87376m = "clearSource$lifecycle_livedata_release")
final class CoroutineLiveData$clearSource$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ npb<Object> this$0;

    public CoroutineLiveData$clearSource$1(npb<Object> npbVar, Continuation<? super CoroutineLiveData$clearSource$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
