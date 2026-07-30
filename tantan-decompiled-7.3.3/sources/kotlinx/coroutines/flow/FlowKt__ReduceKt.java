package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.Careers;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.aui;
import p153l.bui;
import p153l.eui;
import p153l.h350;
import p153l.npj0;
import p153l.p7f;
import p153l.uyp;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001ar\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022F\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001ax\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u00012H\b\u0004\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086H¢\u0006\u0004\b\u0010\u0010\u0011\u001a \u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\"\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0014\u0010\u0013\u001a \u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0015\u0010\u0013\u001aD\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u001a\u001a\"\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u001b\u0010\u0013\u001aF\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@¢\u0006\u0004\b\u001c\u0010\u001a\u001a \u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u001d\u0010\u0013\u001a\"\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, m88121d2 = {p7f.LATITUDE_SOUTH, p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "accumulator", "value", "Lkotlin/coroutines/Continuation;", "", MessageType.operation, "h", "(Ll/aui;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "initial", "acc", "e", "(Ll/aui;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RXScreenCaptureService.KEY_INDEX, "(Ll/aui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "a", "Lkotlin/Function2;", "", "predicate", "b", "(Ll/aui;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", Constants.INAPP_DATA_TAG, "f", "g", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$a */
    @Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m88121d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/bui;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15548a<T> implements bui<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef f67507a;

        public C15548a(Ref.ObjectRef objectRef) {
            this.f67507a = objectRef;
        }

        @Override // p153l.bui
        @Nullable
        public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f67507a.element = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$b */
    @Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m88121d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/bui;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15549b<T> implements bui<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef f67508a;

        public C15549b(Ref.ObjectRef objectRef) {
            this.f67508a = objectRef;
        }

        @Override // p153l.bui
        @Nullable
        public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f67508a.element = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$c */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C15550c<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<Object> f67509a;

        public C15550c(Ref.ObjectRef<Object> objectRef) {
            this.f67509a = objectRef;
        }

        @Override // p153l.bui
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f67509a.element = t;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$d */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C15551d<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<T> f67510a;

        public C15551d(Ref.ObjectRef<T> objectRef) {
            this.f67510a = objectRef;
        }

        @Override // p153l.bui
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f67510a.element = t;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$e */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15552e<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<Object> f67511a;

        public C15552e(Ref.ObjectRef<Object> objectRef) {
            this.f67511a = objectRef;
        }

        @Override // p153l.bui
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            Ref.ObjectRef<Object> objectRef = this.f67511a;
            if (objectRef.element == h350.f107614a) {
                objectRef.element = t;
                return Unit.INSTANCE;
            }
            wg3.m206174a("Flow has more than one element");
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$f */
    @Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m88121d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/bui;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15553f<T> implements bui<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef f67512a;

        public C15553f(Ref.ObjectRef objectRef) {
            this.f67512a = objectRef;
        }

        @Override // p153l.bui
        @Nullable
        public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            Ref.ObjectRef objectRef = this.f67512a;
            T t2 = objectRef.element;
            T t3 = (T) h350.f107614a;
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
    public static final <T> Object m94992a(@NotNull aui<? extends T> auiVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        bui<? super Object> buiVar;
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$first$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) h350.f107614a;
            bui<? super Object> c15548a = new C15548a<>(objectRef2);
            try {
                flowKt__ReduceKt$first$1.L$0 = objectRef2;
                flowKt__ReduceKt$first$1.L$1 = c15548a;
                flowKt__ReduceKt$first$1.label = 1;
                if (auiVar.collect(c15548a, flowKt__ReduceKt$first$1) == objM198688e) {
                    return objM198688e;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                buiVar = c15548a;
                eui.m122570a(e, buiVar);
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buiVar = (C15548a) flowKt__ReduceKt$first$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$first$1.L$0;
            try {
                ResultKt.m88128b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                eui.m122570a(e, buiVar);
            }
        }
        T t = objectRef.element;
        if (t != h350.f107614a) {
            return t;
        }
        npj0.m164229a("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94993b(@NotNull aui<? extends T> auiVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function3;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        bui<? super Object> buiVar;
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$first$3.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) h350.f107614a;
            bui<? super Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                flowKt__ReduceKt$first$3.L$0 = function2;
                flowKt__ReduceKt$first$3.L$1 = objectRef2;
                flowKt__ReduceKt$first$3.L$2 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                flowKt__ReduceKt$first$3.label = 1;
                if (auiVar.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, flowKt__ReduceKt$first$3) == objM198688e) {
                    return objM198688e;
                }
                function3 = function2;
                objectRef = objectRef2;
            } catch (AbortFlowException e2) {
                function3 = function2;
                objectRef = objectRef2;
                e = e2;
                buiVar = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                eui.m122570a(e, buiVar);
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buiVar = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.L$2;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$first$3.L$1;
            function3 = (Function2) flowKt__ReduceKt$first$3.L$0;
            try {
                ResultKt.m88128b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                eui.m122570a(e, buiVar);
            }
        }
        T t = objectRef.element;
        if (t != h350.f107614a) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + function3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m94994c(@NotNull aui<? extends T> auiVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        bui<? super Object> buiVar;
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$firstOrNull$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            bui<? super Object> c15549b = new C15549b<>(objectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$1.L$0 = objectRef2;
                flowKt__ReduceKt$firstOrNull$1.L$1 = c15549b;
                flowKt__ReduceKt$firstOrNull$1.label = 1;
                if (auiVar.collect(c15549b, flowKt__ReduceKt$firstOrNull$1) == objM198688e) {
                    return objM198688e;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                buiVar = c15549b;
                eui.m122570a(e, buiVar);
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buiVar = (C15549b) flowKt__ReduceKt$firstOrNull$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$1.L$0;
            try {
                ResultKt.m88128b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                eui.m122570a(e, buiVar);
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m94995d(@NotNull aui<? extends T> auiVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        bui<? super Object> buiVar;
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$firstOrNull$3.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            bui<? super Object> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$3.L$0 = objectRef2;
                flowKt__ReduceKt$firstOrNull$3.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                flowKt__ReduceKt$firstOrNull$3.label = 1;
                if (auiVar.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, flowKt__ReduceKt$firstOrNull$3) == objM198688e) {
                    return objM198688e;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                buiVar = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                eui.m122570a(e, buiVar);
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buiVar = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) flowKt__ReduceKt$firstOrNull$3.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$3.L$0;
            try {
                ResultKt.m88128b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                eui.m122570a(e, buiVar);
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T, R> Object m94996e(@NotNull aui<? extends T> auiVar, R r, @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, @NotNull Continuation<? super R> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$fold$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = r;
            bui<? super Object> flowKt__ReduceKt$fold$2 = new FlowKt__ReduceKt$fold$2<>(objectRef2, function3);
            flowKt__ReduceKt$fold$1.L$0 = objectRef2;
            flowKt__ReduceKt$fold$1.label = 1;
            if (auiVar.collect(flowKt__ReduceKt$fold$2, flowKt__ReduceKt$fold$1) == objM198688e) {
                return objM198688e;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$fold$1.L$0;
            ResultKt.m88128b(obj);
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final <T> Object m94997f(@NotNull aui<? extends T> auiVar, @NotNull Continuation<? super T> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$last$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) h350.f107614a;
            bui<? super Object> c15550c = new C15550c<>(objectRef2);
            flowKt__ReduceKt$last$1.L$0 = objectRef2;
            flowKt__ReduceKt$last$1.label = 1;
            if (auiVar.collect(c15550c, flowKt__ReduceKt$last$1) == objM198688e) {
                return objM198688e;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$last$1.L$0;
            ResultKt.m88128b(obj);
        }
        T t = objectRef.element;
        if (t != h350.f107614a) {
            return t;
        }
        npj0.m164229a("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final <T> Object m94998g(@NotNull aui<? extends T> auiVar, @NotNull Continuation<? super T> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$lastOrNull$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            bui<? super Object> c15551d = new C15551d<>(objectRef2);
            flowKt__ReduceKt$lastOrNull$1.L$0 = objectRef2;
            flowKt__ReduceKt$lastOrNull$1.label = 1;
            if (auiVar.collect(c15551d, flowKt__ReduceKt$lastOrNull$1) == objM198688e) {
                return objM198688e;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$lastOrNull$1.L$0;
            ResultKt.m88128b(obj);
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, l.goh0] */
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final <S, T extends S> Object m94999h(@NotNull aui<? extends T> auiVar, @NotNull Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3, @NotNull Continuation<? super S> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$reduce$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = h350.f107614a;
            bui<? super Object> flowKt__ReduceKt$reduce$2 = new FlowKt__ReduceKt$reduce$2<>(objectRef2, function3);
            flowKt__ReduceKt$reduce$1.L$0 = objectRef2;
            flowKt__ReduceKt$reduce$1.label = 1;
            if (auiVar.collect(flowKt__ReduceKt$reduce$2, flowKt__ReduceKt$reduce$1) == objM198688e) {
                return objM198688e;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$reduce$1.L$0;
            ResultKt.m88128b(obj);
        }
        T t = objectRef.element;
        if (t != h350.f107614a) {
            return t;
        }
        npj0.m164229a("Empty flow can't be reduced");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final <T> Object m95000i(@NotNull aui<? extends T> auiVar, @NotNull Continuation<? super T> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$single$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) h350.f107614a;
            bui<? super Object> c15552e = new C15552e<>(objectRef2);
            flowKt__ReduceKt$single$1.L$0 = objectRef2;
            flowKt__ReduceKt$single$1.label = 1;
            if (auiVar.collect(c15552e, flowKt__ReduceKt$single$1) == objM198688e) {
                return objM198688e;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$single$1.L$0;
            ResultKt.m88128b(obj);
        }
        T t = objectRef.element;
        if (t != h350.f107614a) {
            return t;
        }
        npj0.m164229a("Flow is empty");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: j */
    public static final <T> Object m95001j(@NotNull aui<? extends T> auiVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        FlowKt__ReduceKt$singleOrNull$1 flowKt__ReduceKt$singleOrNull$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        bui<? super Object> buiVar;
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$singleOrNull$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) h350.f107614a;
            bui<? super Object> c15553f = new C15553f<>(objectRef2);
            try {
                flowKt__ReduceKt$singleOrNull$1.L$0 = objectRef2;
                flowKt__ReduceKt$singleOrNull$1.L$1 = c15553f;
                flowKt__ReduceKt$singleOrNull$1.label = 1;
                if (auiVar.collect(c15553f, flowKt__ReduceKt$singleOrNull$1) == objM198688e) {
                    return objM198688e;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                buiVar = c15553f;
                eui.m122570a(e, buiVar);
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buiVar = (C15553f) flowKt__ReduceKt$singleOrNull$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$singleOrNull$1.L$0;
            try {
                ResultKt.m88128b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                eui.m122570a(e, buiVar);
            }
        }
        T t = objectRef.element;
        if (t == h350.f107614a) {
            return null;
        }
        return t;
    }
}
