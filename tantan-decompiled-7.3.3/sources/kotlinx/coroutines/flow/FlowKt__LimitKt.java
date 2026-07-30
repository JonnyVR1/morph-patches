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
import p153l.aui;
import p153l.bui;
import p153l.eui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u000f\u0010\b\u001aU\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0080H¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "c", "(Ll/aui;Lkotlin/jvm/functions/Function2;)Ll/aui;", "Ll/bui;", "value", "ownershipMarker", "", Constants.INAPP_DATA_TAG, "(Ll/bui;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "b", "(Ll/aui;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m88121d2 = {"l/gwd0", "Ll/aui;", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15544a<T> implements aui<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aui f67494a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2 f67495b;

        public C15544a(aui auiVar, Function2 function2) {
            this.f67494a = auiVar;
            this.f67495b = function2;
        }

        @Override // p153l.aui
        @Nullable
        public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) {
            Object objCollect = this.f67494a.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref.BooleanRef(), buiVar, this.f67495b), continuation);
            return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94986b(@NotNull aui<? extends T> auiVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__LimitKt$collectWhile$1 flowKt__LimitKt$collectWhile$1;
        bui<? super Object> buiVar;
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__LimitKt$collectWhile$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            bui<? super Object> flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1<>(function2);
            try {
                flowKt__LimitKt$collectWhile$1.L$0 = flowKt__LimitKt$collectWhile$collector$1;
                flowKt__LimitKt$collectWhile$1.label = 1;
                if (auiVar.collect(flowKt__LimitKt$collectWhile$collector$1, flowKt__LimitKt$collectWhile$1) == objM198688e) {
                    return objM198688e;
                }
            } catch (AbortFlowException e) {
                e = e;
                buiVar = flowKt__LimitKt$collectWhile$collector$1;
                eui.m122570a(e, buiVar);
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buiVar = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$1.L$0;
            try {
                ResultKt.m88128b(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                eui.m122570a(e, buiVar);
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> aui<T> m94987c(@NotNull aui<? extends T> auiVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new C15544a(auiVar, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final <T> Object m94988d(bui<? super T> buiVar, T t, Object obj, Continuation<? super Unit> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__LimitKt$emitAbort$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj2);
            flowKt__LimitKt$emitAbort$1.L$0 = obj;
            flowKt__LimitKt$emitAbort$1.label = 1;
            if (buiVar.emit(t, flowKt__LimitKt$emitAbort$1) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = flowKt__LimitKt$emitAbort$1.L$0;
            ResultKt.m88128b(obj2);
        }
        throw new AbortFlowException(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> aui<T> m94989e(@NotNull aui<? extends T> auiVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(auiVar, function2);
    }
}
