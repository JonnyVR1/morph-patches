package com.clevertap.android.sdk.inapp.delay;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "com.clevertap.android.sdk.inapp.delay.InAppTimerManager", m87374f = "InAppTimerManager.kt", m87375l = {CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA}, m87376m = "cleanup$clevertap_core_release")
public final class InAppTimerManager$cleanup$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppTimerManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppTimerManager$cleanup$1(InAppTimerManager inAppTimerManager, Continuation<? super InAppTimerManager$cleanup$1> continuation) {
        super(continuation);
        this.this$0 = inAppTimerManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m6344k(this);
    }
}
