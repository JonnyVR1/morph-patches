package com.p051p1.mobile.android.media.gltransition.impl;

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
import p153l.aui;
import p153l.bui;
import p153l.p7f;
import p153l.u1e0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "Ll/bui;", "", "<anonymous>", "(Ll/bui;)V", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, m88122k = 3, m88123mv = {2, 2, 0})
@DebugMetadata(m88262c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1", m88263f = "TransitionEngineImpl.kt", m88264l = {40}, m88265m = "invokeSuspend", m88266v = 1)
@SourceDebugExtension
public final class C4481xfc914da3 extends SuspendLambda implements Function2<bui<? super u1e0>, Continuation<? super Unit>, Object> {
    final /* synthetic */ aui $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransitionEngineImpl this$0;

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class AnonymousClass1<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bui<u1e0> f16322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TransitionEngineImpl f16323b;

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
        @DebugMetadata(m88262c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$transform$1$1", m88263f = "TransitionEngineImpl.kt", m88264l = {223}, m88265m = "emit", m88266v = 1)
        @SourceDebugExtension
        public static final class C228111 extends ContinuationImpl {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public C228111(Continuation continuation) {
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

        public AnonymousClass1(bui buiVar, TransitionEngineImpl transitionEngineImpl) {
            this.f16323b = transitionEngineImpl;
            this.f16322a = buiVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.bui
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            C228111 c228111;
            if (continuation instanceof C228111) {
                c228111 = (C228111) continuation;
                int i = c228111.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c228111.label = i - Integer.MIN_VALUE;
                } else {
                    c228111 = new C228111(continuation);
                }
            } else {
                c228111 = new C228111(continuation);
            }
            Object obj = c228111.result;
            Object objM198688e = uyp.m198688e();
            int i2 = c228111.label;
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                bui<u1e0> buiVar = this.f16322a;
                String str = (String) t;
                u1e0 u1e0VarCreateScene = this.f16323b.createScene(str);
                c228111.L$0 = SpillingKt.m88273a(t);
                c228111.L$1 = SpillingKt.m88273a(c228111);
                c228111.L$2 = SpillingKt.m88273a(str);
                c228111.L$3 = SpillingKt.m88273a(buiVar);
                c228111.I$0 = 0;
                c228111.label = 1;
                if (buiVar.emit(u1e0VarCreateScene, c228111) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4481xfc914da3(aui auiVar, Continuation continuation, TransitionEngineImpl transitionEngineImpl) {
        super(2, continuation);
        this.$this_transform = auiVar;
        this.this$0 = transitionEngineImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C4481xfc914da3 c4481xfc914da3 = new C4481xfc914da3(this.$this_transform, continuation, this.this$0);
        c4481xfc914da3.L$0 = obj;
        return c4481xfc914da3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull bui<? super u1e0> buiVar, @Nullable Continuation<? super Unit> continuation) {
        return ((C4481xfc914da3) create(buiVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            bui buiVar = (bui) this.L$0;
            aui auiVar = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(buiVar, this.this$0);
            this.L$0 = SpillingKt.m88273a(buiVar);
            this.label = 1;
            if (auiVar.collect(anonymousClass1, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
