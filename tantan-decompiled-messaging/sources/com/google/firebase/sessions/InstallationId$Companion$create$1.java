package com.google.firebase.sessions;

import com.cosmos.photon.push.service.PushService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "com.google.firebase.sessions.InstallationId$Companion", m87374f = "InstallationId.kt", m87375l = {32, 40}, m87376m = PushService.COMMAND_CREATE)
public final class InstallationId$Companion$create$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InstallationId.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallationId$Companion$create$1(InstallationId.Companion companion, Continuation<? super InstallationId$Companion$create$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, this);
    }
}
