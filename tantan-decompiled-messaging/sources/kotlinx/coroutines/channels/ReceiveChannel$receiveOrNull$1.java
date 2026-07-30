package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", m87374f = "Channel.kt", m87375l = {380}, m87376m = "receiveOrNull")
public final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ReceiveChannel$receiveOrNull$1(Continuation<? super ReceiveChannel$receiveOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ReceiveChannel.DefaultImpls.m93985b(null, this);
    }
}
