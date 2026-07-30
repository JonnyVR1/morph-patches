package androidx.datastore.core;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.cvf0;
import p149l.dkj0;
import p149l.eri;
import p149l.fri;
import p149l.h3c;
import p149l.ili;
import p149l.j6f;
import p149l.jri;
import p149l.l9r;
import p149l.qkq0;
import p149l.uwp;
import p149l.wdc0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/fri;", "", "<anonymous>", "(Ll/fri;)V"}, m87233k = 3, m87234mv = {1, 5, 1})
@DebugMetadata(m87373c = "androidx.datastore.core.SingleProcessDataStore$data$1", m87374f = "SingleProcessDataStore.kt", m87375l = {117}, m87376m = "invokeSuspend")
public final class SingleProcessDataStore$data$1<T> extends SuspendLambda implements Function2<fri<? super T>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1 */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/cvf0;", Careers.f38732it, "", "<anonymous>", "(Ll/cvf0;)Z"}, m87233k = 3, m87234mv = {1, 5, 1})
    @DebugMetadata(m87373c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", m87374f = "SingleProcessDataStore.kt", m87375l = {}, m87376m = "invokeSuspend")
    public static final class C02691 extends SuspendLambda implements Function2<cvf0<T>, Continuation<? super Boolean>, Object> {
        final /* synthetic */ cvf0<T> $currentDownStreamFlowState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02691(cvf0<T> cvf0Var, Continuation<? super C02691> continuation) {
            super(2, continuation);
            this.$currentDownStreamFlowState = cvf0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C02691 c02691 = new C02691(this.$currentDownStreamFlowState, continuation);
            c02691.L$0 = obj;
            return c02691;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull cvf0<T> cvf0Var, @Nullable Continuation<? super Boolean> continuation) {
            return ((C02691) create(cvf0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            uwp.m196133e();
            if (this.label != 0) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
            cvf0<T> cvf0Var = (cvf0) this.L$0;
            cvf0<T> cvf0Var2 = this.$currentDownStreamFlowState;
            boolean z = false;
            if (!(cvf0Var2 instanceof h3c) && !(cvf0Var2 instanceof ili) && cvf0Var == cvf0Var2) {
                z = true;
            }
            return Boxing.m87370a(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super SingleProcessDataStore$data$1> continuation) {
        super(2, continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.this$0, continuation);
        singleProcessDataStore$data$1.L$0 = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull fri<? super T> friVar, @Nullable Continuation<? super Unit> continuation) {
        return ((SingleProcessDataStore$data$1) create(friVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            fri friVar = (fri) this.L$0;
            cvf0 cvf0Var = (cvf0) this.this$0.downstreamFlow.getValue();
            if (!(cvf0Var instanceof h3c)) {
                this.this$0.com.p1.mobile.putong.data.Careers.actor java.lang.String.m1398e(new SingleProcessDataStore.AbstractC0267b.a(cvf0Var));
            }
            final eri eriVarM142955n = jri.m142955n(this.this$0.downstreamFlow, new C02691(cvf0Var, null));
            eri<T> eriVar = new eri<T>() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2 */
                @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, m87232d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Ll/fri;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/psi", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
                public static final class C02702 implements fri<cvf0<T>> {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ fri f1528a;

                    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m87233k = 3, m87234mv = {1, 5, 1}, m87236xi = 48)
                    @DebugMetadata(m87373c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", m87374f = "SingleProcessDataStore.kt", m87375l = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA}, m87376m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C02702.this.emit(null, this);
                        }
                    }

                    public C02702(fri friVar) {
                        this.f1528a = friVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p149l.fri
                    @Nullable
                    public Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objM196133e = uwp.m196133e();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.m87239b(obj2);
                            fri friVar = this.f1528a;
                            cvf0 cvf0Var = (cvf0) obj;
                            if (cvf0Var instanceof wdc0) {
                                throw ((wdc0) cvf0Var).getReadException();
                            }
                            if (cvf0Var instanceof ili) {
                                throw ((ili) cvf0Var).getFinalException();
                            }
                            if (!(cvf0Var instanceof h3c)) {
                                if (cvf0Var instanceof dkj0) {
                                    qkq0.m175383a("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    return null;
                                }
                                l9r.m149037a();
                                return null;
                            }
                            Object objM129163b = ((h3c) cvf0Var).m129163b();
                            anonymousClass1.label = 1;
                            if (friVar.emit(objM129163b, anonymousClass1) == objM196133e) {
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

                @Override // p149l.eri
                @Nullable
                public Object collect(@NotNull fri friVar2, @NotNull Continuation continuation) {
                    Object objCollect = eriVarM142955n.collect(new C02702(friVar2), continuation);
                    return objCollect == uwp.m196133e() ? objCollect : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (jri.m142957p(friVar, eriVar, this) == objM196133e) {
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
