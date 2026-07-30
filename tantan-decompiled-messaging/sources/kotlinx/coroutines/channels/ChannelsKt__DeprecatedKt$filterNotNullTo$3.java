package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.nee0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m87374f = "Deprecated.kt", m87375l = {517, 272}, m87376m = "filterNotNullTo")
public final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends nee0<? super E>> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$filterNotNullTo$3(Continuation<? super ChannelsKt__DeprecatedKt$filterNotNullTo$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.m93962g(null, null, this);
    }
}
