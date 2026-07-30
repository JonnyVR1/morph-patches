package com.p046p1.mobile.android.media.gltransition.impl;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.std0;
import p149l.uwp;

/* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/fri;", "", "<anonymous>", "(Ll/fri;)V", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, m87233k = 3, m87234mv = {2, 2, 0})
@DebugMetadata(m87373c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1", m87374f = "TransitionEngineImpl.kt", m87375l = {40}, m87376m = "invokeSuspend", m87377v = 1)
@SourceDebugExtension
public final class C4330xfc914da3 extends SuspendLambda implements Function2<fri<? super std0>, Continuation<? super Unit>, Object> {
    final /* synthetic */ eri $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransitionEngineImpl this$0;

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class AnonymousClass1<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fri<std0> f15603a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TransitionEngineImpl f15604b;

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
        @DebugMetadata(m87373c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1$1", m87374f = "TransitionEngineImpl.kt", m87375l = {223}, m87376m = "emit", m87377v = 1)
        @SourceDebugExtension
        public static final class C226951 extends ContinuationImpl {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public C226951(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(fri friVar, TransitionEngineImpl transitionEngineImpl) {
            this.f15604b = transitionEngineImpl;
            this.f15603a = friVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.fri
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            C226951 c226951;
            if (continuation instanceof C226951) {
                c226951 = (C226951) continuation;
                int i = c226951.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c226951.label = i - Integer.MIN_VALUE;
                } else {
                    c226951 = new C226951(continuation);
                }
            } else {
                c226951 = new C226951(continuation);
            }
            Object obj = c226951.result;
            Object objM196133e = uwp.m196133e();
            int i2 = c226951.label;
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                fri<std0> friVar = this.f15603a;
                String str = (String) t;
                std0 std0VarCreateScene = this.f15604b.createScene(str);
                c226951.L$0 = SpillingKt.m87384a(t);
                c226951.L$1 = SpillingKt.m87384a(c226951);
                c226951.L$2 = SpillingKt.m87384a(str);
                c226951.L$3 = SpillingKt.m87384a(friVar);
                c226951.I$0 = 0;
                c226951.label = 1;
                if (friVar.emit(std0VarCreateScene, c226951) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4330xfc914da3(eri eriVar, Continuation continuation, TransitionEngineImpl transitionEngineImpl) {
        super(2, continuation);
        this.$this_transform = eriVar;
        this.this$0 = transitionEngineImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C4330xfc914da3 c4330xfc914da3 = new C4330xfc914da3(this.$this_transform, continuation, this.this$0);
        c4330xfc914da3.L$0 = obj;
        return c4330xfc914da3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull fri<? super std0> friVar, @Nullable Continuation<? super Unit> continuation) {
        return ((C4330xfc914da3) create(friVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            fri friVar = (fri) this.L$0;
            eri eriVar = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(friVar, this.this$0);
            this.L$0 = SpillingKt.m87384a(friVar);
            this.label = 1;
            if (eriVar.collect(anonymousClass1, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        return Unit.INSTANCE;
    }
}
