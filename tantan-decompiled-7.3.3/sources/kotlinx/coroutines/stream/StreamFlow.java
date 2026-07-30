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
import p153l.aui;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u000e"}, m88121d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/stream/Stream;", "a", "Ljava/util/stream/Stream;", "stream", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class StreamFlow<T> implements aui<T> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67647b = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Stream<T> stream;
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.stream.StreamFlow", m88263f = "Stream.kt", m88264l = {22}, m88265m = "collect")
    public static final class C156061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StreamFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C156061(StreamFlow<T> streamFlow, Continuation<? super C156061> continuation) {
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
    @Override // p153l.aui
    @Nullable
    public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C156061 c156061;
        StreamFlow<T> streamFlow;
        Throwable th;
        Iterator<T> it;
        bui buiVar2;
        T next;
        if (continuation instanceof C156061) {
            c156061 = (C156061) continuation;
            int i = c156061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c156061.label = i - Integer.MIN_VALUE;
            } else {
                c156061 = new C156061(this, continuation);
            }
        } else {
            c156061 = new C156061(this, continuation);
        }
        Object obj = c156061.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c156061.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            if (!f67647b.compareAndSet(this, 0, 1)) {
                wtq0.m207906a("Stream.consumeAsFlow can be collected only once");
                return null;
            }
            try {
                streamFlow = this;
                it = this.stream.iterator();
                buiVar2 = buiVar;
                while (it.hasNext()) {
                    next = it.next();
                    c156061.L$0 = streamFlow;
                    c156061.L$1 = buiVar2;
                    c156061.L$2 = it;
                    c156061.label = 1;
                    if (buiVar2.emit(next, c156061) == objM198688e) {
                        return objM198688e;
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
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) c156061.L$2;
            bui buiVar3 = (bui) c156061.L$1;
            StreamFlow<T> streamFlow2 = (StreamFlow) c156061.L$0;
            try {
                ResultKt.m88128b(obj);
                buiVar2 = buiVar3;
                streamFlow = streamFlow2;
                while (it.hasNext()) {
                    try {
                        next = it.next();
                        c156061.L$0 = streamFlow;
                        c156061.L$1 = buiVar2;
                        c156061.L$2 = it;
                        c156061.label = 1;
                        if (buiVar2.emit(next, c156061) == objM198688e) {
                            return objM198688e;
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
