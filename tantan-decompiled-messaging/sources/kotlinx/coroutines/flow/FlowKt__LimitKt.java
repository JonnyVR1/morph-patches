package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.iri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u000f\u0010\b\u001aU\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0080H¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "c", "(Ll/eri;Lkotlin/jvm/functions/Function2;)Ll/eri;", "Ll/fri;", "value", "ownershipMarker", "", Constants.INAPP_DATA_TAG, "(Ll/fri;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "b", "(Ll/eri;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m87232d2 = {"l/eod0", "Ll/eri;", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15437a<T> implements eri<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eri f66820a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2 f66821b;

        public C15437a(eri eriVar, Function2 function2) {
            this.f66820a = eriVar;
            this.f66821b = function2;
        }

        @Override // p149l.eri
        @Nullable
        public Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation) {
            Object objCollect = this.f66820a.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref.BooleanRef(), friVar, this.f66821b), continuation);
            return objCollect == uwp.m196133e() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94093b(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__LimitKt$collectWhile$1 flowKt__LimitKt$collectWhile$1;
        fri<? super Object> friVar;
        if (continuation instanceof FlowKt__LimitKt$collectWhile$1) {
            flowKt__LimitKt$collectWhile$1 = (FlowKt__LimitKt$collectWhile$1) continuation;
            int i = flowKt__LimitKt$collectWhile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$collectWhile$1 = new FlowKt__LimitKt$collectWhile$1(continuation);
            }
        } else {
            flowKt__LimitKt$collectWhile$1 = new FlowKt__LimitKt$collectWhile$1(continuation);
        }
        Object obj = flowKt__LimitKt$collectWhile$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__LimitKt$collectWhile$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            fri<? super Object> flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1<>(function2);
            try {
                flowKt__LimitKt$collectWhile$1.L$0 = flowKt__LimitKt$collectWhile$collector$1;
                flowKt__LimitKt$collectWhile$1.label = 1;
                if (eriVar.collect(flowKt__LimitKt$collectWhile$collector$1, flowKt__LimitKt$collectWhile$1) == objM196133e) {
                    return objM196133e;
                }
            } catch (AbortFlowException e) {
                e = e;
                friVar = flowKt__LimitKt$collectWhile$collector$1;
                iri.m137898a(e, friVar);
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            friVar = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$1.L$0;
            try {
                ResultKt.m87239b(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                iri.m137898a(e, friVar);
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> eri<T> m94094c(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new C15437a(eriVar, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final <T> Object m94095d(fri<? super T> friVar, T t, Object obj, Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (continuation instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuation;
            int i = flowKt__LimitKt$emitAbort$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuation);
            }
        } else {
            flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuation);
        }
        Object obj2 = flowKt__LimitKt$emitAbort$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__LimitKt$emitAbort$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj2);
            flowKt__LimitKt$emitAbort$1.L$0 = obj;
            flowKt__LimitKt$emitAbort$1.label = 1;
            if (friVar.emit(t, flowKt__LimitKt$emitAbort$1) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = flowKt__LimitKt$emitAbort$1.L$0;
            ResultKt.m87239b(obj2);
        }
        throw new AbortFlowException(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> eri<T> m94096e(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(eriVar, function2);
    }
}
