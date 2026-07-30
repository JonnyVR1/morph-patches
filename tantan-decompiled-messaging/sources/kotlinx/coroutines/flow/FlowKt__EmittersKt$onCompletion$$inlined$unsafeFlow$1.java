package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.qkq0;
import p149l.tpi0;
import p149l.uwp;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m87232d2 = {"l/eod0", "Ll/eri;", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements eri<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eri f66810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function3 f66811b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m87374f = "Emitters.kt", m87375l = {113, 120, 127}, m87376m = "collect")
    @SourceDebugExtension
    public static final class C154331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C154331(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(eri eriVar, Function3 function3) {
        this.f66810a = eriVar;
        this.f66811b = function3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p149l.eri
    @Nullable
    public Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C154331 c154331;
        SafeCollector safeCollector;
        SafeCollector safeCollector2;
        if (continuation instanceof C154331) {
            c154331 = (C154331) continuation;
            int i = c154331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c154331.label = i - Integer.MIN_VALUE;
            } else {
                c154331 = new C154331(continuation);
            }
        } else {
            c154331 = new C154331(continuation);
        }
        Object obj = c154331.result;
        Object objM196133e = uwp.m196133e();
        int i2 = c154331.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.m87239b(obj);
                    eri eriVar = this.f66810a;
                    c154331.L$0 = this;
                    c154331.L$1 = friVar;
                    c154331.label = 1;
                    if (eriVar.collect(friVar, c154331) != objM196133e) {
                    }
                    return objM196133e;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) c154331.L$0;
                        ResultKt.m87239b(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    safeCollector2 = (SafeCollector) c154331.L$0;
                    try {
                        ResultKt.m87239b(obj);
                        safeCollector2.releaseIntercepted();
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector2.releaseIntercepted();
                        throw th;
                    }
                }
                friVar = (fri) c154331.L$1;
                this = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) c154331.L$0;
                ResultKt.m87239b(obj);
                Function3 function3 = this.f66811b;
                c154331.L$0 = safeCollector;
                c154331.L$1 = null;
                c154331.label = 3;
                InlineMarker.m87484c(6);
                Object objInvoke = function3.invoke(safeCollector, null, c154331);
                InlineMarker.m87484c(7);
                if (objInvoke != objM196133e) {
                    safeCollector2 = safeCollector;
                    safeCollector2.releaseIntercepted();
                    return Unit.INSTANCE;
                }
                return objM196133e;
            } catch (Throwable th3) {
                th = th3;
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                throw th;
            }
            safeCollector = new SafeCollector(friVar, c154331.getContext());
        } catch (Throwable th4) {
            FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
            tpi0 tpi0Var = new tpi0(th4);
            Function3 function4 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f66811b;
            c154331.L$0 = th4;
            c154331.L$1 = null;
            c154331.label = 2;
            if (FlowKt__EmittersKt.m94085c(tpi0Var, function4, th4, c154331) != objM196133e) {
                throw th4;
            }
        }
    }
}
