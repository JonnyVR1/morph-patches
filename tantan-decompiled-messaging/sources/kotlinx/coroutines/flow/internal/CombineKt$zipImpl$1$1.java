package kotlinx.coroutines.flow.internal;

import com.momo.momortc.MMConstants;
import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.iri;
import p149l.jr4;
import p149l.ln5;
import p149l.nee0;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"T1", "T2", "R", "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m87374f = "Combine.kt", m87375l = {123}, m87376m = "invokeSuspend")
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ eri<Object> $flow;
    final /* synthetic */ eri<Object> $flow2;
    final /* synthetic */ fri<Object> $this_unsafeFlow;
    final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, m87232d2 = {"<anonymous>", "", "T1", "T2", "R", Careers.f38732it}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m87374f = "Combine.kt", m87375l = {124}, m87376m = "invokeSuspend")
    public static final class C154742 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ ln5 $collectJob;
        final /* synthetic */ eri<Object> $flow;
        final /* synthetic */ CoroutineContext $scopeContext;
        final /* synthetic */ ReceiveChannel<Object> $second;
        final /* synthetic */ fri<Object> $this_unsafeFlow;
        final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> $transform;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m87232d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
        public static final class AnonymousClass1<T> implements fri {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CoroutineContext f66887a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f66888b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ReceiveChannel<Object> f66889c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ fri<Object> f66890d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> f66891e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ln5 f66892f;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, m87232d2 = {"<anonymous>", "", "T1", "T2", "R", Careers.f38732it}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
            @DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m87374f = "Combine.kt", m87375l = {126, MMConstants.ERR_WATERMARK_READ, MMConstants.ERR_WATERMARK_READ}, m87376m = "invokeSuspend")
            @SourceDebugExtension
            public static final class C227191 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final /* synthetic */ ln5 $collectJob;
                final /* synthetic */ ReceiveChannel<Object> $second;
                final /* synthetic */ fri<Object> $this_unsafeFlow;
                final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> $transform;
                final /* synthetic */ Object $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C227191(ReceiveChannel<? extends Object> receiveChannel, fri<Object> friVar, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Object obj, ln5 ln5Var, Continuation<? super C227191> continuation) {
                    super(2, continuation);
                    this.$second = receiveChannel;
                    this.$this_unsafeFlow = friVar;
                    this.$transform = function3;
                    this.$value = obj;
                    this.$collectJob = ln5Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C227191(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                    return ((C227191) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
                
                    if (r1.emit(r9, r8) == r0) goto L29;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        java.lang.Object r0 = p149l.uwp.m196133e()
                        int r1 = r8.label
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L2e
                        if (r1 == r5) goto L24
                        if (r1 == r4) goto L1c
                        if (r1 != r3) goto L16
                        kotlin.ResultKt.m87239b(r9)
                        goto L6f
                    L16:
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        p149l.qkq0.m175383a(r8)
                        return r2
                    L1c:
                        java.lang.Object r1 = r8.L$0
                        l.fri r1 = (p149l.fri) r1
                        kotlin.ResultKt.m87239b(r9)
                        goto L64
                    L24:
                        kotlin.ResultKt.m87239b(r9)
                        kotlinx.coroutines.channels.a r9 = (kotlinx.coroutines.channels.C15414a) r9
                        java.lang.Object r9 = r9.getHolder()
                        goto L3c
                    L2e:
                        kotlin.ResultKt.m87239b(r9)
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r9 = r8.$second
                        r8.label = r5
                        java.lang.Object r9 = r9.mo93901r(r8)
                        if (r9 != r0) goto L3c
                        goto L6e
                    L3c:
                        l.ln5 r1 = r8.$collectJob
                        boolean r5 = r9 instanceof kotlinx.coroutines.channels.C15414a.c
                        if (r5 == 0) goto L4e
                        java.lang.Throwable r8 = kotlinx.coroutines.channels.C15414a.m93994e(r9)
                        if (r8 != 0) goto L4d
                        kotlinx.coroutines.flow.internal.AbortFlowException r8 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r8.<init>(r1)
                    L4d:
                        throw r8
                    L4e:
                        l.fri<java.lang.Object> r1 = r8.$this_unsafeFlow
                        kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r5 = r8.$transform
                        java.lang.Object r6 = r8.$value
                        l.yfh0 r7 = p149l.su40.f166433a
                        if (r9 != r7) goto L59
                        r9 = r2
                    L59:
                        r8.L$0 = r1
                        r8.label = r4
                        java.lang.Object r9 = r5.invoke(r6, r9, r8)
                        if (r9 != r0) goto L64
                        goto L6e
                    L64:
                        r8.L$0 = r2
                        r8.label = r3
                        java.lang.Object r8 = r1.emit(r9, r8)
                        if (r8 != r0) goto L6f
                    L6e:
                        return r0
                    L6f:
                        kotlin.Unit r8 = kotlin.Unit.INSTANCE
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C154742.AnonymousClass1.C227191.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, fri<Object> friVar, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, ln5 ln5Var) {
                this.f66887a = coroutineContext;
                this.f66888b = obj;
                this.f66889c = receiveChannel;
                this.f66890d = friVar;
                this.f66891e = function3;
                this.f66892f = ln5Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p149l.fri
            @Nullable
            public final Object emit(Object obj, @NotNull Continuation<? super Unit> continuation) throws Throwable {
                CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                if (continuation instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) continuation;
                    int i = combineKt$zipImpl$1$1$2$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
                    }
                } else {
                    combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
                }
                Object obj2 = combineKt$zipImpl$1$1$2$1$emit$1.result;
                Object objM196133e = uwp.m196133e();
                int i2 = combineKt$zipImpl$1$1$2$1$emit$1.label;
                if (i2 == 0) {
                    ResultKt.m87239b(obj2);
                    CoroutineContext coroutineContext = this.f66887a;
                    Unit unit = Unit.INSTANCE;
                    Object obj3 = this.f66888b;
                    C227191 c227191 = new C227191(this.f66889c, this.f66890d, this.f66891e, obj, this.f66892f, null);
                    combineKt$zipImpl$1$1$2$1$emit$1.label = 1;
                    if (jr4.m142920c(coroutineContext, unit, obj3, c227191, combineKt$zipImpl$1$1$2$1$emit$1) == objM196133e) {
                        return objM196133e;
                    }
                } else {
                    if (i2 != 1) {
                        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.m87239b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C154742(eri<Object> eriVar, CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, fri<Object> friVar, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, ln5 ln5Var, Continuation<? super C154742> continuation) {
            super(2, continuation);
            this.$flow = eriVar;
            this.$scopeContext = coroutineContext;
            this.$cnt = obj;
            this.$second = receiveChannel;
            this.$this_unsafeFlow = friVar;
            this.$transform = function3;
            this.$collectJob = ln5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C154742(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
            return ((C154742) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                eri<Object> eriVar = this.$flow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(eri<Object> eriVar, eri<Object> eriVar2, fri<Object> friVar, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super CombineKt$zipImpl$1$1> continuation) {
        super(2, continuation);
        this.$flow2 = eriVar;
        this.$flow = eriVar2;
        this.$this_unsafeFlow = friVar;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, continuation);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((CombineKt$zipImpl$1$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        final ln5 ln5VarM93616b;
        ReceiveChannel receiveChannel;
        ReceiveChannel receiveChannel2;
        ln5 ln5Var;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ppb ppbVar = (ppb) this.L$0;
            ReceiveChannel receiveChannelM93982d = ProduceKt.m93982d(ppbVar, null, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3, null);
            ln5VarM93616b = JobKt__JobKt.m93616b(null, 1, null);
            receiveChannelM93982d.getClass();
            ((nee0) receiveChannelM93982d).mo93883j(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    if (ln5VarM93616b.mo93690k()) {
                        ln5 ln5Var2 = ln5VarM93616b;
                        ln5Var2.mo93695n(new AbortFlowException(ln5Var2));
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
            try {
                try {
                    CoroutineContext coroutineContext = ppbVar.getCoroutineContext();
                    Object objM94216b = ThreadContextKt.m94216b(coroutineContext);
                    CoroutineContext coroutineContextPlus = ppbVar.getCoroutineContext().plus(ln5VarM93616b);
                    try {
                        Unit unit = Unit.INSTANCE;
                        C154742 c154742 = new C154742(this.$flow, coroutineContext, objM94216b, receiveChannelM93982d, this.$this_unsafeFlow, this.$transform, ln5VarM93616b, null);
                        receiveChannel = receiveChannelM93982d;
                        ln5Var = ln5VarM93616b;
                        try {
                            this.L$0 = receiveChannel;
                            this.L$1 = ln5Var;
                            this.label = 1;
                            if (jr4.m142921d(coroutineContextPlus, unit, null, c154742, this, 4, null) == objM196133e) {
                                return objM196133e;
                            }
                            receiveChannel2 = receiveChannel;
                        } catch (AbortFlowException e) {
                            e = e;
                            ln5VarM93616b = ln5Var;
                            receiveChannel2 = receiveChannel;
                            iri.m137898a(e, ln5VarM93616b);
                        } catch (Throwable th) {
                            th = th;
                            receiveChannel2 = receiveChannel;
                            ReceiveChannel.DefaultImpls.m93984a(receiveChannel2, null, 1, null);
                            throw th;
                        }
                    } catch (AbortFlowException e2) {
                        e = e2;
                        receiveChannel = receiveChannelM93982d;
                        ln5Var = ln5VarM93616b;
                    }
                } catch (AbortFlowException e3) {
                    e = e3;
                    receiveChannel = receiveChannelM93982d;
                }
            } catch (Throwable th2) {
                th = th2;
                receiveChannel = receiveChannelM93982d;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ln5VarM93616b = (ln5) this.L$1;
            receiveChannel2 = (ReceiveChannel) this.L$0;
            try {
                try {
                    ResultKt.m87239b(obj);
                } catch (AbortFlowException e4) {
                    e = e4;
                    iri.m137898a(e, ln5VarM93616b);
                }
            } catch (Throwable th3) {
                th = th3;
                ReceiveChannel.DefaultImpls.m93984a(receiveChannel2, null, 1, null);
                throw th;
            }
        }
        ReceiveChannel.DefaultImpls.m93984a(receiveChannel2, null, 1, null);
        return Unit.INSTANCE;
    }
}
