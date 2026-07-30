package com.p003p1.mobile.android.media.gltransition.impl;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import l.ppb;
import l.qkq0;
import l.uwp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$launch$1", f = "TransitionEngineImpl.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TransitionEngineImpl$launch$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $runnable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionEngineImpl$launch$1(Function0<Unit> function0, Continuation<? super TransitionEngineImpl$launch$1> continuation) {
        super(2, continuation);
        this.$runnable = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransitionEngineImpl$launch$1(this.$runnable, continuation);
    }

    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return create(ppbVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        uwp.e();
        if (this.label != 0) {
            qkq0.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.b(obj);
        this.$runnable.invoke();
        return Unit.INSTANCE;
    }
}
