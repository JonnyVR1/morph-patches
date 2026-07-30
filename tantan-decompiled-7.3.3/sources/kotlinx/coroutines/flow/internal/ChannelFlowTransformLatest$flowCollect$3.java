package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.drb;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m88263f = "Merge.kt", m88264l = {23}, m88265m = "invokeSuspend")
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ bui<R> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C155781<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<InterfaceC15593o> f67554a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ drb f67555b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ChannelFlowTransformLatest<T, R> f67556c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bui<R> f67557d;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
        @DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m88263f = "Merge.kt", m88264l = {30}, m88265m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
            final /* synthetic */ bui<R> $collector;
            final /* synthetic */ T $value;
            int label;
            final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, bui<? super R> buiVar, T t, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = channelFlowTransformLatest;
                this.$collector = buiVar;
                this.$value = t;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$collector, this.$value, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objM198688e = uyp.m198688e();
                int i = this.label;
                if (i == 0) {
                    ResultKt.m88128b(obj);
                    Function3 function3 = this.this$0.transform;
                    Object obj2 = this.$collector;
                    T t = this.$value;
                    this.label = 1;
                    if (function3.invoke(obj2, t, this) == objM198688e) {
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

        /* JADX WARN: Multi-variable type inference failed */
        public C155781(Ref.ObjectRef<InterfaceC15593o> objectRef, drb drbVar, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, bui<? super R> buiVar) {
            this.f67554a = objectRef;
            this.f67555b = drbVar;
            this.f67556c = channelFlowTransformLatest;
            this.f67557d = buiVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p153l.bui
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            if (continuation instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) continuation;
                int i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
                }
            } else {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
            }
            Object obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
            Object objM198688e = uyp.m198688e();
            int i2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                InterfaceC15593o interfaceC15593o = this.f67554a.element;
                if (interfaceC15593o != null) {
                    interfaceC15593o.mo94586n(new ChildCancelledException());
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = this;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = t;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = interfaceC15593o;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                    if (interfaceC15593o.mo94554S(channelFlowTransformLatest$flowCollect$3$1$emit$1) == objM198688e) {
                        return objM198688e;
                    }
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1;
                this = (C155781) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                ResultKt.m88128b(obj);
            }
            this.f67554a.element = (T) xh3.m210980d(this.f67555b, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this.f67556c, this.f67557d, t, null), 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, bui<? super R> buiVar, Continuation<? super ChannelFlowTransformLatest$flowCollect$3> continuation) {
        super(2, continuation);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = buiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, continuation);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 for r7v3 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p153l.uyp.m198688e()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            kotlin.ResultKt.m88128b(r8)
            goto L36
        Lf:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r7)
            r7 = 0
            return r7
        L16:
            kotlin.ResultKt.m88128b(r8)
            java.lang.Object r8 = r7.L$0
            l.drb r8 = (p153l.drb) r8
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r3 = r7.this$0
            l.aui<S> r4 = r3.flow
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r5 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1
            l.bui<R> r6 = r7.$collector
            r5.<init>(r1, r8, r3, r6)
            r7.label = r2
            java.lang.Object r7 = r4.collect(r5, r7)
            if (r7 != r0) goto L36
            return r0
        L36:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
