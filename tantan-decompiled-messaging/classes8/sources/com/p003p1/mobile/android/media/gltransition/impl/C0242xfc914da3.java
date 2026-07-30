package com.p003p1.mobile.android.media.gltransition.impl;

import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import l.eri;
import l.fri;
import l.qkq0;
import l.uwp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p007l.std0;

/* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Ll/fri;", "", "<anonymous>", "(Ll/fri;)V", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1", f = "TransitionEngineImpl.kt", l = {40}, m = "invokeSuspend", v = 1)
@SourceDebugExtension
public final class C0242xfc914da3 extends SuspendLambda implements Function2<fri<? super std0>, Continuation<? super Unit>, Object> {
    final /* synthetic */ eri $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransitionEngineImpl this$0;

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class AnonymousClass1<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fri<std0> f1302a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TransitionEngineImpl f1303b;

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        @DebugMetadata(c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1$1", f = "TransitionEngineImpl.kt", l = {223}, m = "emit", v = 1)
        @SourceDebugExtension
        public static final class C08211 extends ContinuationImpl {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public C08211(Continuation continuation) {
                super(continuation);
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(fri friVar, TransitionEngineImpl transitionEngineImpl) {
            this.f1303b = transitionEngineImpl;
            this.f1302a = friVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws NoSuchAlgorithmException {
            C08211 c08211;
            if (continuation instanceof C08211) {
                c08211 = (C08211) continuation;
                int i = c08211.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c08211.label = i - Integer.MIN_VALUE;
                } else {
                    c08211 = new C08211(continuation);
                }
            } else {
                c08211 = new C08211(continuation);
            }
            Object obj = c08211.result;
            Object objE = uwp.e();
            int i2 = c08211.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                fri<std0> friVar = this.f1302a;
                String str = (String) t;
                std0 std0VarCreateScene = this.f1303b.createScene(str);
                c08211.L$0 = SpillingKt.a(t);
                c08211.L$1 = SpillingKt.a(c08211);
                c08211.L$2 = SpillingKt.a(str);
                c08211.L$3 = SpillingKt.a(friVar);
                c08211.I$0 = 0;
                c08211.label = 1;
                if (friVar.emit(std0VarCreateScene, c08211) == objE) {
                    return objE;
                }
            } else {
                if (i2 != 1) {
                    qkq0.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0242xfc914da3(eri eriVar, Continuation continuation, TransitionEngineImpl transitionEngineImpl) {
        super(2, continuation);
        this.$this_transform = eriVar;
        this.this$0 = transitionEngineImpl;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C0242xfc914da3 c0242xfc914da3 = new C0242xfc914da3(this.$this_transform, continuation, this.this$0);
        c0242xfc914da3.L$0 = obj;
        return c0242xfc914da3;
    }

    @Nullable
    public final Object invoke(@NotNull fri<? super std0> friVar, @Nullable Continuation<? super Unit> continuation) {
        return create(friVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objE = uwp.e();
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            fri friVar = (fri) this.L$0;
            eri eriVar = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(friVar, this.this$0);
            this.L$0 = SpillingKt.a(friVar);
            this.label = 1;
            if (eriVar.collect(anonymousClass1, this) == objE) {
                return objE;
            }
        } else {
            if (i != 1) {
                qkq0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.b(obj);
        }
        return Unit.INSTANCE;
    }
}
