package com.clevertap.android.sdk.inapp.delay;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.delay.InAppScheduler", m88263f = "InAppScheduler.kt", m88264l = {112}, m88265m = "cancelAllScheduling")
public final class InAppScheduler$cancelAllScheduling$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppScheduler<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppScheduler$cancelAllScheduling$1(InAppScheduler<T> inAppScheduler, Continuation<? super InAppScheduler$cancelAllScheduling$1> continuation) {
        super(continuation);
        this.this$0 = inAppScheduler;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.clevertap.android.sdk.inapp.delay.InAppScheduler$cancelAllScheduling$1 for r1v2 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            com.clevertap.android.sdk.inapp.delay.InAppScheduler<T> r2 = r1.this$0
            java.lang.Object r1 = r2.m6383b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.inapp.delay.InAppScheduler$cancelAllScheduling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
