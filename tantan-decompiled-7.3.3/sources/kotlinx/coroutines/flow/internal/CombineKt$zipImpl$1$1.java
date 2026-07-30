package kotlinx.coroutines.flow.internal;

import com.momo.momortc.MMConstants;
import com.p051p1.mobile.putong.data.Careers;
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
import kotlinx.coroutines.channels.C15521a;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.eui;
import p153l.h350;
import p153l.is4;
import p153l.po5;
import p153l.sme0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"T1", "T2", "R", "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m88263f = "Combine.kt", m88264l = {123}, m88265m = "invokeSuspend")
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ aui<Object> $flow;
    final /* synthetic */ aui<Object> $flow2;
    final /* synthetic */ bui<Object> $this_unsafeFlow;
    final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, m88121d2 = {"<anonymous>", "", "T1", "T2", "R", Careers.f39580it}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m88263f = "Combine.kt", m88264l = {124}, m88265m = "invokeSuspend")
    public static final class C155812 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ po5 $collectJob;
        final /* synthetic */ aui<Object> $flow;
        final /* synthetic */ CoroutineContext $scopeContext;
        final /* synthetic */ ReceiveChannel<Object> $second;
        final /* synthetic */ bui<Object> $this_unsafeFlow;
        final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> $transform;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m88121d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
        public static final class AnonymousClass1<T> implements bui {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CoroutineContext f67561a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f67562b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ReceiveChannel<Object> f67563c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ bui<Object> f67564d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> f67565e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ po5 f67566f;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, m88121d2 = {"<anonymous>", "", "T1", "T2", "R", Careers.f39580it}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
            @DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m88263f = "Combine.kt", m88264l = {126, MMConstants.ERR_WATERMARK_READ, MMConstants.ERR_WATERMARK_READ}, m88265m = "invokeSuspend")
            @SourceDebugExtension
            public static final class C228351 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final /* synthetic */ po5 $collectJob;
                final /* synthetic */ ReceiveChannel<Object> $second;
                final /* synthetic */ bui<Object> $this_unsafeFlow;
                final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> $transform;
                final /* synthetic */ Object $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C228351(ReceiveChannel<? extends Object> receiveChannel, bui<Object> buiVar, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Object obj, po5 po5Var, Continuation<? super C228351> continuation) {
                    super(2, continuation);
                    this.$second = receiveChannel;
                    this.$this_unsafeFlow = buiVar;
                    this.$transform = function3;
                    this.$value = obj;
                    this.$collectJob = po5Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C228351(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                    return ((C228351) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
                
                    if (r1.emit(r9, r8) == r0) goto L29;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objMo94793r;
                    bui<Object> buiVar;
                    Object objM198688e = uyp.m198688e();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.m88128b(obj);
                        ReceiveChannel<Object> receiveChannel = this.$second;
                        this.label = 1;
                        objMo94793r = receiveChannel.mo94793r(this);
                        if (objMo94793r != objM198688e) {
                        }
                        return objM198688e;
                    }
                    if (i == 1) {
                        ResultKt.m88128b(obj);
                        objMo94793r = ((C15521a) obj).getHolder();
                    } else if (i == 2) {
                        buiVar = (bui) this.L$0;
                        ResultKt.m88128b(obj);
                        this.L$0 = null;
                        this.label = 3;
                    } else {
                        if (i != 3) {
                            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.m88128b(obj);
                    }
                    return Unit.INSTANCE;
                    po5 po5Var = this.$collectJob;
                    if (objMo94793r instanceof C15521a.c) {
                        Throwable thM94886e = C15521a.m94886e(objMo94793r);
                        if (thM94886e == null) {
                            throw new AbortFlowException(po5Var);
                        }
                        throw thM94886e;
                    }
                    buiVar = this.$this_unsafeFlow;
                    Function3<Object, Object, Continuation<Object>, Object> function3 = this.$transform;
                    Object obj2 = this.$value;
                    if (objMo94793r == h350.f107614a) {
                        objMo94793r = null;
                    }
                    this.L$0 = buiVar;
                    this.label = 2;
                    obj = function3.invoke(obj2, objMo94793r, this);
                    if (obj != objM198688e) {
                        this.L$0 = null;
                        this.label = 3;
                    }
                    return objM198688e;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, bui<Object> buiVar, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, po5 po5Var) {
                this.f67561a = coroutineContext;
                this.f67562b = obj;
                this.f67563c = receiveChannel;
                this.f67564d = buiVar;
                this.f67565e = function3;
                this.f67566f = po5Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p153l.bui
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
                Object objM198688e = uyp.m198688e();
                int i2 = combineKt$zipImpl$1$1$2$1$emit$1.label;
                if (i2 == 0) {
                    ResultKt.m88128b(obj2);
                    CoroutineContext coroutineContext = this.f67561a;
                    Unit unit = Unit.INSTANCE;
                    Object obj3 = this.f67562b;
                    C228351 c228351 = new C228351(this.f67563c, this.f67564d, this.f67565e, obj, this.f67566f, null);
                    combineKt$zipImpl$1$1$2$1$emit$1.label = 1;
                    if (is4.m141866c(coroutineContext, unit, obj3, c228351, combineKt$zipImpl$1$1$2$1$emit$1) == objM198688e) {
                        return objM198688e;
                    }
                } else {
                    if (i2 != 1) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.m88128b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C155812(aui<Object> auiVar, CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, bui<Object> buiVar, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, po5 po5Var, Continuation<? super C155812> continuation) {
            super(2, continuation);
            this.$flow = auiVar;
            this.$scopeContext = coroutineContext;
            this.$cnt = obj;
            this.$second = receiveChannel;
            this.$this_unsafeFlow = buiVar;
            this.$transform = function3;
            this.$collectJob = po5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C155812(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
            return ((C155812) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                aui<Object> auiVar = this.$flow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(aui<Object> auiVar, aui<Object> auiVar2, bui<Object> buiVar, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super CombineKt$zipImpl$1$1> continuation) {
        super(2, continuation);
        this.$flow2 = auiVar;
        this.$flow = auiVar2;
        this.$this_unsafeFlow = buiVar;
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
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((CombineKt$zipImpl$1$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        final po5 po5VarM94507b;
        ReceiveChannel receiveChannel;
        ReceiveChannel receiveChannel2;
        po5 po5Var;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = (drb) this.L$0;
            ReceiveChannel receiveChannelM94874d = ProduceKt.m94874d(drbVar, null, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3, null);
            po5VarM94507b = JobKt__JobKt.m94507b(null, 1, null);
            receiveChannelM94874d.getClass();
            ((sme0) receiveChannelM94874d).mo94775j(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    if (po5VarM94507b.mo94581k()) {
                        po5 po5Var2 = po5VarM94507b;
                        po5Var2.mo94586n(new AbortFlowException(po5Var2));
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
                    CoroutineContext coroutineContext = drbVar.getCoroutineContext();
                    Object objM95109b = ThreadContextKt.m95109b(coroutineContext);
                    CoroutineContext coroutineContextPlus = drbVar.getCoroutineContext().plus(po5VarM94507b);
                    try {
                        Unit unit = Unit.INSTANCE;
                        C155812 c155812 = new C155812(this.$flow, coroutineContext, objM95109b, receiveChannelM94874d, this.$this_unsafeFlow, this.$transform, po5VarM94507b, null);
                        receiveChannel = receiveChannelM94874d;
                        po5Var = po5VarM94507b;
                        try {
                            this.L$0 = receiveChannel;
                            this.L$1 = po5Var;
                            this.label = 1;
                            if (is4.m141867d(coroutineContextPlus, unit, null, c155812, this, 4, null) == objM198688e) {
                                return objM198688e;
                            }
                            receiveChannel2 = receiveChannel;
                        } catch (AbortFlowException e) {
                            e = e;
                            po5VarM94507b = po5Var;
                            receiveChannel2 = receiveChannel;
                            eui.m122570a(e, po5VarM94507b);
                        } catch (Throwable th) {
                            th = th;
                            receiveChannel2 = receiveChannel;
                            ReceiveChannel.DefaultImpls.m94876a(receiveChannel2, null, 1, null);
                            throw th;
                        }
                    } catch (AbortFlowException e2) {
                        e = e2;
                        receiveChannel = receiveChannelM94874d;
                        po5Var = po5VarM94507b;
                    }
                } catch (AbortFlowException e3) {
                    e = e3;
                    receiveChannel = receiveChannelM94874d;
                }
            } catch (Throwable th2) {
                th = th2;
                receiveChannel = receiveChannelM94874d;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            po5VarM94507b = (po5) this.L$1;
            receiveChannel2 = (ReceiveChannel) this.L$0;
            try {
                try {
                    ResultKt.m88128b(obj);
                } catch (AbortFlowException e4) {
                    e = e4;
                    eui.m122570a(e, po5VarM94507b);
                }
            } catch (Throwable th3) {
                th = th3;
                ReceiveChannel.DefaultImpls.m94876a(receiveChannel2, null, 1, null);
                throw th;
            }
        }
        ReceiveChannel.DefaultImpls.m94876a(receiveChannel2, null, 1, null);
        return Unit.INSTANCE;
    }
}
