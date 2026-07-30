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
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;
import p149l.jh3;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m87374f = "Merge.kt", m87375l = {23}, m87376m = "invokeSuspend")
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ fri<R> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C154711<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<InterfaceC15486o> f66880a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ppb f66881b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ChannelFlowTransformLatest<T, R> f66882c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fri<R> f66883d;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
        @DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m87374f = "Merge.kt", m87375l = {30}, m87376m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
            final /* synthetic */ fri<R> $collector;
            final /* synthetic */ T $value;
            int label;
            final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, fri<? super R> friVar, T t, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = channelFlowTransformLatest;
                this.$collector = friVar;
                this.$value = t;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$collector, this.$value, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objM196133e = uwp.m196133e();
                int i = this.label;
                if (i == 0) {
                    ResultKt.m87239b(obj);
                    Function3 function3 = this.this$0.transform;
                    Object obj2 = this.$collector;
                    T t = this.$value;
                    this.label = 1;
                    if (function3.invoke(obj2, t, this) == objM196133e) {
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

        /* JADX WARN: Multi-variable type inference failed */
        public C154711(Ref.ObjectRef<InterfaceC15486o> objectRef, ppb ppbVar, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, fri<? super R> friVar) {
            this.f66880a = objectRef;
            this.f66881b = ppbVar;
            this.f66882c = channelFlowTransformLatest;
            this.f66883d = friVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p149l.fri
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
            Object objM196133e = uwp.m196133e();
            int i2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                InterfaceC15486o interfaceC15486o = this.f66880a.element;
                if (interfaceC15486o != null) {
                    interfaceC15486o.mo93695n(new ChildCancelledException());
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = this;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = t;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = interfaceC15486o;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                    if (interfaceC15486o.mo93663S(channelFlowTransformLatest$flowCollect$3$1$emit$1) == objM196133e) {
                        return objM196133e;
                    }
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1;
                this = (C154711) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                ResultKt.m87239b(obj);
            }
            this.f66880a.element = (T) jh3.m141367d(this.f66881b, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this.f66882c, this.f66883d, t, null), 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, fri<? super R> friVar, Continuation<? super ChannelFlowTransformLatest$flowCollect$3> continuation) {
        super(2, continuation);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = friVar;
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
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            kotlin.ResultKt.m87239b(r8)
            goto L36
        Lf:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r7)
            r7 = 0
            return r7
        L16:
            kotlin.ResultKt.m87239b(r8)
            java.lang.Object r8 = r7.L$0
            l.ppb r8 = (p149l.ppb) r8
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r3 = r7.this$0
            l.eri<S> r4 = r3.flow
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r5 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1
            l.fri<R> r6 = r7.$collector
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
