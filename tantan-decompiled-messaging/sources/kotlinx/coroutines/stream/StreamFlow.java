package kotlinx.coroutines.stream;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u000e"}, m87232d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/stream/Stream;", "a", "Ljava/util/stream/Stream;", "stream", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class StreamFlow<T> implements eri<T> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66973b = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Stream<T> stream;
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.stream.StreamFlow", m87374f = "Stream.kt", m87375l = {22}, m87376m = "collect")
    public static final class C154991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StreamFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154991(StreamFlow<T> streamFlow, Continuation<? super C154991> continuation) {
            super(continuation);
            this.this$0 = streamFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:22:0x0059, B:24:0x005f), top: B:37:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:37:0x0059->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p149l.eri
    @Nullable
    public Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C154991 c154991;
        StreamFlow<T> streamFlow;
        Throwable th;
        Iterator<T> it;
        fri friVar2;
        T next;
        if (continuation instanceof C154991) {
            c154991 = (C154991) continuation;
            int i = c154991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c154991.label = i - Integer.MIN_VALUE;
            } else {
                c154991 = new C154991(this, continuation);
            }
        } else {
            c154991 = new C154991(this, continuation);
        }
        Object obj = c154991.result;
        Object objM196133e = uwp.m196133e();
        int i2 = c154991.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            if (!f66973b.compareAndSet(this, 0, 1)) {
                qkq0.m175383a("Stream.consumeAsFlow can be collected only once");
                return null;
            }
            try {
                streamFlow = this;
                it = this.stream.iterator();
                friVar2 = friVar;
                while (it.hasNext()) {
                    next = it.next();
                    c154991.L$0 = streamFlow;
                    c154991.L$1 = friVar2;
                    c154991.L$2 = it;
                    c154991.label = 1;
                    if (friVar2.emit(next, c154991) == objM196133e) {
                        return objM196133e;
                    }
                }
                streamFlow.stream.close();
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                streamFlow = this;
                th = th2;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) c154991.L$2;
            fri friVar3 = (fri) c154991.L$1;
            StreamFlow<T> streamFlow2 = (StreamFlow) c154991.L$0;
            try {
                ResultKt.m87239b(obj);
                friVar2 = friVar3;
                streamFlow = streamFlow2;
                while (it.hasNext()) {
                    try {
                        next = it.next();
                        c154991.L$0 = streamFlow;
                        c154991.L$1 = friVar2;
                        c154991.L$2 = it;
                        c154991.label = 1;
                        if (friVar2.emit(next, c154991) == objM196133e) {
                            return objM196133e;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                streamFlow.stream.close();
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
                streamFlow = streamFlow2;
            }
        }
        streamFlow.stream.close();
        throw th;
    }
}
