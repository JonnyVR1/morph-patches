package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "action", "a", "(Ll/aui;Lkotlin/jvm/functions/Function2;)Ll/aui;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__TransformKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> aui<T> m95002a(@NotNull final aui<? extends T> auiVar, @NotNull final Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new aui<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2 */
            @Metadata(m88120d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/wui", "<anonymous>"}, m88122k = 3, m88123mv = {1, 9, 0})
            @SourceDebugExtension
            public static final class C155592<T> implements bui {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ bui f67527a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Function2 f67528b;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
                @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m88263f = "Transform.kt", m88264l = {219, 220}, m88265m = "emit")
                @SourceDebugExtension
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        return C155592.this.emit(null, this);
                    }
                }

                public C155592(bui buiVar, Function2 function2) {
                    this.f67527a = buiVar;
                    this.f67528b = function2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
                
                    if (r6.emit(r7, r0) == r1) goto L22;
                 */
                @Override // p153l.bui
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    bui buiVar;
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
                    Object obj = anonymousClass1.result;
                    Object objM198688e = uyp.m198688e();
                    int i2 = anonymousClass1.label;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            buiVar = (bui) anonymousClass1.L$1;
                            t = (T) anonymousClass1.L$0;
                            ResultKt.m88128b(obj);
                        } else {
                            if (i2 != 2) {
                                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ResultKt.m88128b(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.m88128b(obj);
                    bui buiVar2 = this.f67527a;
                    Function2 function2 = this.f67528b;
                    anonymousClass1.L$0 = t;
                    anonymousClass1.L$1 = buiVar2;
                    anonymousClass1.label = 1;
                    InlineMarker.m88373c(6);
                    Object objInvoke = function2.invoke(t, anonymousClass1);
                    InlineMarker.m88373c(7);
                    if (objInvoke != objM198688e) {
                        buiVar = buiVar2;
                    }
                    return objM198688e;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                }
            }

            @Override // p153l.aui
            @Nullable
            public Object collect(@NotNull bui buiVar, @NotNull Continuation continuation) {
                Object objCollect = auiVar.collect(new C155592(buiVar, function2), continuation);
                return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
