package kotlinx.coroutines.channels;

import com.immomo.momomediaext.sei.BaseSei;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.internal.LowPriorityInOverloadResolution;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.qkq0;
import p149l.qq3;
import p149l.uce0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m87232d2 = {"Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "", b2s.C_ZONE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a;", "r", "p", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "n", "(Ljava/util/concurrent/CancellationException;)V", "Ll/uce0;", BaseSei.f13932Z, "()Ll/uce0;", "onReceive", "o", "onReceiveCatching", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface ReceiveChannel<E> {

    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m93984a(ReceiveChannel receiveChannel, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                qq3.m175877a("Super calls with default arguments not supported in this target, function: cancel");
                return;
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.mo93890n(cancellationException);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Deprecated
        @LowPriorityInOverloadResolution
        @Nullable
        /* JADX INFO: renamed from: b */
        public static <E> Object m93985b(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull Continuation<? super E> continuation) throws Throwable {
            ReceiveChannel$receiveOrNull$1 receiveChannel$receiveOrNull$1;
            Object objMo93901r;
            if (continuation instanceof ReceiveChannel$receiveOrNull$1) {
                receiveChannel$receiveOrNull$1 = (ReceiveChannel$receiveOrNull$1) continuation;
                int i = receiveChannel$receiveOrNull$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    receiveChannel$receiveOrNull$1.label = i - Integer.MIN_VALUE;
                } else {
                    receiveChannel$receiveOrNull$1 = new ReceiveChannel$receiveOrNull$1(continuation);
                }
            } else {
                receiveChannel$receiveOrNull$1 = new ReceiveChannel$receiveOrNull$1(continuation);
            }
            Object obj = receiveChannel$receiveOrNull$1.result;
            Object objM196133e = uwp.m196133e();
            int i2 = receiveChannel$receiveOrNull$1.label;
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                receiveChannel$receiveOrNull$1.label = 1;
                objMo93901r = receiveChannel.mo93901r(receiveChannel$receiveOrNull$1);
                if (objMo93901r == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
                objMo93901r = ((C15414a) obj).getHolder();
            }
            return C15414a.m93995f(objMo93901r);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C */
    Object mo93835C(@NotNull Continuation<? super E> continuation);

    @NotNull
    ChannelIterator<E> iterator();

    /* JADX INFO: renamed from: n */
    void mo93890n(@Nullable CancellationException cause);

    @NotNull
    /* JADX INFO: renamed from: o */
    uce0<C15414a<E>> mo93893o();

    @NotNull
    /* JADX INFO: renamed from: p */
    Object mo93896p();

    @Nullable
    /* JADX INFO: renamed from: r */
    Object mo93901r(@NotNull Continuation<? super C15414a<? extends E>> continuation);

    @NotNull
    /* JADX INFO: renamed from: z */
    uce0<E> mo93910z();
}
