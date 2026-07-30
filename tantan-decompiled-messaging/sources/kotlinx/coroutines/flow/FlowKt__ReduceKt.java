package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.Careers;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.ig3;
import p149l.iri;
import p149l.j6f;
import p149l.kgj0;
import p149l.qkq0;
import p149l.su40;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001ar\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022F\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001ax\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u00012H\b\u0004\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086H¢\u0006\u0004\b\u0010\u0010\u0011\u001a \u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\"\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0014\u0010\u0013\u001a \u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0015\u0010\u0013\u001aD\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u001a\u001a\"\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u001b\u0010\u0013\u001aF\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@¢\u0006\u0004\b\u001c\u0010\u001a\u001a \u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u001d\u0010\u0013\u001a\"\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, m87232d2 = {j6f.LATITUDE_SOUTH, j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "accumulator", "value", "Lkotlin/coroutines/Continuation;", "", MessageType.operation, "h", "(Ll/eri;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "initial", "acc", "e", "(Ll/eri;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RXScreenCaptureService.KEY_INDEX, "(Ll/eri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "a", "Lkotlin/Function2;", "", "predicate", "b", "(Ll/eri;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", Constants.INAPP_DATA_TAG, "f", "g", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$a */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m87232d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/fri;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15441a<T> implements fri<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef f66833a;

        public C15441a(Ref.ObjectRef objectRef) {
            this.f66833a = objectRef;
        }

        @Override // p149l.fri
        @Nullable
        public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f66833a.element = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$b */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m87232d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/fri;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15442b<T> implements fri<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef f66834a;

        public C15442b(Ref.ObjectRef objectRef) {
            this.f66834a = objectRef;
        }

        @Override // p149l.fri
        @Nullable
        public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f66834a.element = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$c */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, Careers.f38732it, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C15443c<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<Object> f66835a;

        public C15443c(Ref.ObjectRef<Object> objectRef) {
            this.f66835a = objectRef;
        }

        @Override // p149l.fri
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f66835a.element = t;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$d */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, Careers.f38732it, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C15444d<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<T> f66836a;

        public C15444d(Ref.ObjectRef<T> objectRef) {
            this.f66836a = objectRef;
        }

        @Override // p149l.fri
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f66836a.element = t;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$e */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15445e<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<Object> f66837a;

        public C15445e(Ref.ObjectRef<Object> objectRef) {
            this.f66837a = objectRef;
        }

        @Override // p149l.fri
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            Ref.ObjectRef<Object> objectRef = this.f66837a;
            if (objectRef.element == su40.f166433a) {
                objectRef.element = t;
                return Unit.INSTANCE;
            }
            ig3.m135964a("Flow has more than one element");
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$f */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m87232d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/fri;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15446f<T> implements fri<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef f66838a;

        public C15446f(Ref.ObjectRef objectRef) {
            this.f66838a = objectRef;
        }

        @Override // p149l.fri
        @Nullable
        public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            Ref.ObjectRef objectRef = this.f66838a;
            T t2 = objectRef.element;
            T t3 = (T) su40.f166433a;
            if (t2 == t3) {
                objectRef.element = t;
                return Unit.INSTANCE;
            }
            objectRef.element = t3;
            throw new AbortFlowException(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m94099a(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        fri<? super Object> friVar;
        if (continuation instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuation;
            int i = flowKt__ReduceKt$first$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
        }
        Object obj = flowKt__ReduceKt$first$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$first$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) su40.f166433a;
            fri<? super Object> c15441a = new C15441a<>(objectRef2);
            try {
                flowKt__ReduceKt$first$1.L$0 = objectRef2;
                flowKt__ReduceKt$first$1.L$1 = c15441a;
                flowKt__ReduceKt$first$1.label = 1;
                if (eriVar.collect(c15441a, flowKt__ReduceKt$first$1) == objM196133e) {
                    return objM196133e;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                friVar = c15441a;
                iri.m137898a(e, friVar);
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            friVar = (C15441a) flowKt__ReduceKt$first$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$first$1.L$0;
            try {
                ResultKt.m87239b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                iri.m137898a(e, friVar);
            }
        }
        T t = objectRef.element;
        if (t != su40.f166433a) {
            return t;
        }
        kgj0.m145892a("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94100b(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function3;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        fri<? super Object> friVar;
        if (continuation instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuation;
            int i = flowKt__ReduceKt$first$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuation);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuation);
        }
        Object obj = flowKt__ReduceKt$first$3.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$first$3.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) su40.f166433a;
            fri<? super Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                flowKt__ReduceKt$first$3.L$0 = function2;
                flowKt__ReduceKt$first$3.L$1 = objectRef2;
                flowKt__ReduceKt$first$3.L$2 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                flowKt__ReduceKt$first$3.label = 1;
                if (eriVar.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, flowKt__ReduceKt$first$3) == objM196133e) {
                    return objM196133e;
                }
                function3 = function2;
                objectRef = objectRef2;
            } catch (AbortFlowException e2) {
                function3 = function2;
                objectRef = objectRef2;
                e = e2;
                friVar = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                iri.m137898a(e, friVar);
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            friVar = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.L$2;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$first$3.L$1;
            function3 = (Function2) flowKt__ReduceKt$first$3.L$0;
            try {
                ResultKt.m87239b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                iri.m137898a(e, friVar);
            }
        }
        T t = objectRef.element;
        if (t != su40.f166433a) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + function3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m94101c(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        fri<? super Object> friVar;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) continuation;
            int i = flowKt__ReduceKt$firstOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$firstOrNull$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            fri<? super Object> c15442b = new C15442b<>(objectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$1.L$0 = objectRef2;
                flowKt__ReduceKt$firstOrNull$1.L$1 = c15442b;
                flowKt__ReduceKt$firstOrNull$1.label = 1;
                if (eriVar.collect(c15442b, flowKt__ReduceKt$firstOrNull$1) == objM196133e) {
                    return objM196133e;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                friVar = c15442b;
                iri.m137898a(e, friVar);
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            friVar = (C15442b) flowKt__ReduceKt$firstOrNull$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$1.L$0;
            try {
                ResultKt.m87239b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                iri.m137898a(e, friVar);
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m94102d(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        fri<? super Object> friVar;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) continuation;
            int i = flowKt__ReduceKt$firstOrNull$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuation);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuation);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$3.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$firstOrNull$3.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            fri<? super Object> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$3.L$0 = objectRef2;
                flowKt__ReduceKt$firstOrNull$3.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                flowKt__ReduceKt$firstOrNull$3.label = 1;
                if (eriVar.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, flowKt__ReduceKt$firstOrNull$3) == objM196133e) {
                    return objM196133e;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                friVar = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                iri.m137898a(e, friVar);
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            friVar = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) flowKt__ReduceKt$firstOrNull$3.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$3.L$0;
            try {
                ResultKt.m87239b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                iri.m137898a(e, friVar);
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T, R> Object m94103e(@NotNull eri<? extends T> eriVar, R r, @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, @NotNull Continuation<? super R> continuation) throws Throwable {
        FlowKt__ReduceKt$fold$1 flowKt__ReduceKt$fold$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof FlowKt__ReduceKt$fold$1) {
            flowKt__ReduceKt$fold$1 = (FlowKt__ReduceKt$fold$1) continuation;
            int i = flowKt__ReduceKt$fold$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$fold$1 = new FlowKt__ReduceKt$fold$1(continuation);
            }
        } else {
            flowKt__ReduceKt$fold$1 = new FlowKt__ReduceKt$fold$1(continuation);
        }
        Object obj = flowKt__ReduceKt$fold$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$fold$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = r;
            fri<? super Object> flowKt__ReduceKt$fold$2 = new FlowKt__ReduceKt$fold$2<>(objectRef2, function3);
            flowKt__ReduceKt$fold$1.L$0 = objectRef2;
            flowKt__ReduceKt$fold$1.label = 1;
            if (eriVar.collect(flowKt__ReduceKt$fold$2, flowKt__ReduceKt$fold$1) == objM196133e) {
                return objM196133e;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$fold$1.L$0;
            ResultKt.m87239b(obj);
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final <T> Object m94104f(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$last$1 flowKt__ReduceKt$last$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof FlowKt__ReduceKt$last$1) {
            flowKt__ReduceKt$last$1 = (FlowKt__ReduceKt$last$1) continuation;
            int i = flowKt__ReduceKt$last$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$last$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$last$1 = new FlowKt__ReduceKt$last$1(continuation);
            }
        } else {
            flowKt__ReduceKt$last$1 = new FlowKt__ReduceKt$last$1(continuation);
        }
        Object obj = flowKt__ReduceKt$last$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$last$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) su40.f166433a;
            fri<? super Object> c15443c = new C15443c<>(objectRef2);
            flowKt__ReduceKt$last$1.L$0 = objectRef2;
            flowKt__ReduceKt$last$1.label = 1;
            if (eriVar.collect(c15443c, flowKt__ReduceKt$last$1) == objM196133e) {
                return objM196133e;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$last$1.L$0;
            ResultKt.m87239b(obj);
        }
        T t = objectRef.element;
        if (t != su40.f166433a) {
            return t;
        }
        kgj0.m145892a("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final <T> Object m94105g(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$lastOrNull$1 flowKt__ReduceKt$lastOrNull$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof FlowKt__ReduceKt$lastOrNull$1) {
            flowKt__ReduceKt$lastOrNull$1 = (FlowKt__ReduceKt$lastOrNull$1) continuation;
            int i = flowKt__ReduceKt$lastOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$lastOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$lastOrNull$1 = new FlowKt__ReduceKt$lastOrNull$1(continuation);
            }
        } else {
            flowKt__ReduceKt$lastOrNull$1 = new FlowKt__ReduceKt$lastOrNull$1(continuation);
        }
        Object obj = flowKt__ReduceKt$lastOrNull$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$lastOrNull$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            fri<? super Object> c15444d = new C15444d<>(objectRef2);
            flowKt__ReduceKt$lastOrNull$1.L$0 = objectRef2;
            flowKt__ReduceKt$lastOrNull$1.label = 1;
            if (eriVar.collect(c15444d, flowKt__ReduceKt$lastOrNull$1) == objM196133e) {
                return objM196133e;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$lastOrNull$1.L$0;
            ResultKt.m87239b(obj);
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, l.yfh0] */
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final <S, T extends S> Object m94106h(@NotNull eri<? extends T> eriVar, @NotNull Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3, @NotNull Continuation<? super S> continuation) throws Throwable {
        FlowKt__ReduceKt$reduce$1 flowKt__ReduceKt$reduce$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof FlowKt__ReduceKt$reduce$1) {
            flowKt__ReduceKt$reduce$1 = (FlowKt__ReduceKt$reduce$1) continuation;
            int i = flowKt__ReduceKt$reduce$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$reduce$1 = new FlowKt__ReduceKt$reduce$1(continuation);
            }
        } else {
            flowKt__ReduceKt$reduce$1 = new FlowKt__ReduceKt$reduce$1(continuation);
        }
        Object obj = flowKt__ReduceKt$reduce$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$reduce$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = su40.f166433a;
            fri<? super Object> flowKt__ReduceKt$reduce$2 = new FlowKt__ReduceKt$reduce$2<>(objectRef2, function3);
            flowKt__ReduceKt$reduce$1.L$0 = objectRef2;
            flowKt__ReduceKt$reduce$1.label = 1;
            if (eriVar.collect(flowKt__ReduceKt$reduce$2, flowKt__ReduceKt$reduce$1) == objM196133e) {
                return objM196133e;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$reduce$1.L$0;
            ResultKt.m87239b(obj);
        }
        T t = objectRef.element;
        if (t != su40.f166433a) {
            return t;
        }
        kgj0.m145892a("Empty flow can't be reduced");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final <T> Object m94107i(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof FlowKt__ReduceKt$single$1) {
            flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1) continuation;
            int i = flowKt__ReduceKt$single$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$single$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(continuation);
            }
        } else {
            flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(continuation);
        }
        Object obj = flowKt__ReduceKt$single$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$single$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) su40.f166433a;
            fri<? super Object> c15445e = new C15445e<>(objectRef2);
            flowKt__ReduceKt$single$1.L$0 = objectRef2;
            flowKt__ReduceKt$single$1.label = 1;
            if (eriVar.collect(c15445e, flowKt__ReduceKt$single$1) == objM196133e) {
                return objM196133e;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$single$1.L$0;
            ResultKt.m87239b(obj);
        }
        T t = objectRef.element;
        if (t != su40.f166433a) {
            return t;
        }
        kgj0.m145892a("Flow is empty");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: j */
    public static final <T> Object m94108j(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$singleOrNull$1 flowKt__ReduceKt$singleOrNull$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        fri<? super Object> friVar;
        if (continuation instanceof FlowKt__ReduceKt$singleOrNull$1) {
            flowKt__ReduceKt$singleOrNull$1 = (FlowKt__ReduceKt$singleOrNull$1) continuation;
            int i = flowKt__ReduceKt$singleOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$singleOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$singleOrNull$1 = new FlowKt__ReduceKt$singleOrNull$1(continuation);
            }
        } else {
            flowKt__ReduceKt$singleOrNull$1 = new FlowKt__ReduceKt$singleOrNull$1(continuation);
        }
        Object obj = flowKt__ReduceKt$singleOrNull$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$singleOrNull$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) su40.f166433a;
            fri<? super Object> c15446f = new C15446f<>(objectRef2);
            try {
                flowKt__ReduceKt$singleOrNull$1.L$0 = objectRef2;
                flowKt__ReduceKt$singleOrNull$1.L$1 = c15446f;
                flowKt__ReduceKt$singleOrNull$1.label = 1;
                if (eriVar.collect(c15446f, flowKt__ReduceKt$singleOrNull$1) == objM196133e) {
                    return objM196133e;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                friVar = c15446f;
                iri.m137898a(e, friVar);
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            friVar = (C15446f) flowKt__ReduceKt$singleOrNull$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$singleOrNull$1.L$0;
            try {
                ResultKt.m87239b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                iri.m137898a(e, friVar);
            }
        }
        T t = objectRef.element;
        if (t == su40.f166433a) {
            return null;
        }
        return t;
    }
}
