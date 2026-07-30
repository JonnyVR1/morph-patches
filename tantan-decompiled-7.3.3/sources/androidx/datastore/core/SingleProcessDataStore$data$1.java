package androidx.datastore.core;

import com.p051p1.mobile.putong.data.Careers;
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
import p153l.aui;
import p153l.bui;
import p153l.dmc0;
import p153l.eoi;
import p153l.fui;
import p153l.gtj0;
import p153l.l3g0;
import p153l.nbr;
import p153l.p7f;
import p153l.q4c;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/bui;", "", "<anonymous>", "(Ll/bui;)V"}, m88122k = 3, m88123mv = {1, 5, 1})
@DebugMetadata(m88262c = "androidx.datastore.core.SingleProcessDataStore$data$1", m88263f = "SingleProcessDataStore.kt", m88264l = {117}, m88265m = "invokeSuspend")
public final class SingleProcessDataStore$data$1<T> extends SuspendLambda implements Function2<bui<? super T>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1 */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/l3g0;", Careers.f39580it, "", "<anonymous>", "(Ll/l3g0;)Z"}, m88122k = 3, m88123mv = {1, 5, 1})
    @DebugMetadata(m88262c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", m88263f = "SingleProcessDataStore.kt", m88264l = {}, m88265m = "invokeSuspend")
    public static final class C02701 extends SuspendLambda implements Function2<l3g0<T>, Continuation<? super Boolean>, Object> {
        final /* synthetic */ l3g0<T> $currentDownStreamFlowState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02701(l3g0<T> l3g0Var, Continuation<? super C02701> continuation) {
            super(2, continuation);
            this.$currentDownStreamFlowState = l3g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C02701 c02701 = new C02701(this.$currentDownStreamFlowState, continuation);
            c02701.L$0 = obj;
            return c02701;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull l3g0<T> l3g0Var, @Nullable Continuation<? super Boolean> continuation) {
            return ((C02701) create(l3g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            uyp.m198688e();
            if (this.label != 0) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            l3g0<T> l3g0Var = (l3g0) this.L$0;
            l3g0<T> l3g0Var2 = this.$currentDownStreamFlowState;
            boolean z = false;
            if (!(l3g0Var2 instanceof q4c) && !(l3g0Var2 instanceof eoi) && l3g0Var == l3g0Var2) {
                z = true;
            }
            return Boxing.m88259a(z);
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
    public final Object invoke(@NotNull bui<? super T> buiVar, @Nullable Continuation<? super Unit> continuation) {
        return ((SingleProcessDataStore$data$1) create(buiVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            bui buiVar = (bui) this.L$0;
            l3g0 l3g0Var = (l3g0) this.this$0.downstreamFlow.getValue();
            if (!(l3g0Var instanceof q4c)) {
                this.this$0.com.p1.mobile.putong.data.Careers.actor java.lang.String.m1399e(new SingleProcessDataStore.AbstractC0268b.a(l3g0Var));
            }
            final aui auiVarM127490n = fui.m127490n(this.this$0.downstreamFlow, new C02701(l3g0Var, null));
            aui<T> auiVar = new aui<T>() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2 */
                @Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, m88121d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Ll/bui;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/lvi", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
                public static final class C02712 implements bui<l3g0<T>> {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ bui f1528a;

                    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m88122k = 3, m88123mv = {1, 5, 1}, m88125xi = 48)
                    @DebugMetadata(m88262c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", m88263f = "SingleProcessDataStore.kt", m88264l = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA}, m88265m = "emit")
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
                            return C02712.this.emit(null, this);
                        }
                    }

                    public C02712(bui buiVar) {
                        this.f1528a = buiVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p153l.bui
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
                        Object objM198688e = uyp.m198688e();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.m88128b(obj2);
                            bui buiVar = this.f1528a;
                            l3g0 l3g0Var = (l3g0) obj;
                            if (l3g0Var instanceof dmc0) {
                                throw ((dmc0) l3g0Var).getReadException();
                            }
                            if (l3g0Var instanceof eoi) {
                                throw ((eoi) l3g0Var).getFinalException();
                            }
                            if (!(l3g0Var instanceof q4c)) {
                                if (l3g0Var instanceof gtj0) {
                                    wtq0.m207906a("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    return null;
                                }
                                nbr.m162172a();
                                return null;
                            }
                            Object objM175208b = ((q4c) l3g0Var).m175208b();
                            anonymousClass1.label = 1;
                            if (buiVar.emit(objM175208b, anonymousClass1) == objM198688e) {
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

                @Override // p153l.aui
                @Nullable
                public Object collect(@NotNull bui buiVar2, @NotNull Continuation continuation) {
                    Object objCollect = auiVarM127490n.collect(new C02712(buiVar2), continuation);
                    return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (fui.m127492p(buiVar, auiVar, this) == objM198688e) {
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
