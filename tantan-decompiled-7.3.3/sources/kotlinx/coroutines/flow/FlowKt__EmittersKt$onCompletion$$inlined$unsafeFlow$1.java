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
import p153l.aui;
import p153l.bui;
import p153l.uyp;
import p153l.wtq0;
import p153l.wyi0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m88121d2 = {"l/gwd0", "Ll/aui;", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements aui<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aui f67484a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function3 f67485b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m88263f = "Emitters.kt", m88264l = {113, 120, 127}, m88265m = "collect")
    @SourceDebugExtension
    public static final class C155401 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C155401(Continuation continuation) {
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

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(aui auiVar, Function3 function3) {
        this.f67484a = auiVar;
        this.f67485b = function3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p153l.aui
    @Nullable
    public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C155401 c155401;
        SafeCollector safeCollector;
        SafeCollector safeCollector2;
        if (continuation instanceof C155401) {
            c155401 = (C155401) continuation;
            int i = c155401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c155401.label = i - Integer.MIN_VALUE;
            } else {
                c155401 = new C155401(continuation);
            }
        } else {
            c155401 = new C155401(continuation);
        }
        Object obj = c155401.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c155401.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.m88128b(obj);
                    aui auiVar = this.f67484a;
                    c155401.L$0 = this;
                    c155401.L$1 = buiVar;
                    c155401.label = 1;
                    if (auiVar.collect(buiVar, c155401) != objM198688e) {
                    }
                    return objM198688e;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) c155401.L$0;
                        ResultKt.m88128b(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    safeCollector2 = (SafeCollector) c155401.L$0;
                    try {
                        ResultKt.m88128b(obj);
                        safeCollector2.releaseIntercepted();
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector2.releaseIntercepted();
                        throw th;
                    }
                }
                buiVar = (bui) c155401.L$1;
                this = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) c155401.L$0;
                ResultKt.m88128b(obj);
                Function3 function3 = this.f67485b;
                c155401.L$0 = safeCollector;
                c155401.L$1 = null;
                c155401.label = 3;
                InlineMarker.m88373c(6);
                Object objInvoke = function3.invoke(safeCollector, null, c155401);
                InlineMarker.m88373c(7);
                if (objInvoke != objM198688e) {
                    safeCollector2 = safeCollector;
                    safeCollector2.releaseIntercepted();
                    return Unit.INSTANCE;
                }
                return objM198688e;
            } catch (Throwable th3) {
                th = th3;
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                throw th;
            }
            safeCollector = new SafeCollector(buiVar, c155401.getContext());
        } catch (Throwable th4) {
            FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
            wyi0 wyi0Var = new wyi0(th4);
            Function3 function4 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f67485b;
            c155401.L$0 = th4;
            c155401.L$1 = null;
            c155401.label = 2;
            if (FlowKt__EmittersKt.m94978c(wyi0Var, function4, th4, c155401) != objM198688e) {
                throw th4;
            }
        }
    }
}
