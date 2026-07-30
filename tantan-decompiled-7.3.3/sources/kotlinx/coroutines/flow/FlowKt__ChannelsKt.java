package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.TreasurePrizeCategory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.fui;
import p153l.is4;
import p153l.p7f;
import p153l.us4;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/bui;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "channel", "", "b", "(Ll/bui;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", TreasurePrizeCategory.consume, "c", "(Ll/bui;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/aui;", "Ll/drb;", "scope", Constants.INAPP_DATA_TAG, "(Ll/aui;Ll/drb;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__ChannelsKt {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94963b(@NotNull bui<? super T> buiVar, @NotNull ReceiveChannel<? extends T> receiveChannel, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objM94964c = m94964c(buiVar, receiveChannel, true, continuation);
        return objM94964c == uyp.m198688e() ? objM94964c : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0037, B:24:0x0061, B:28:0x0076, B:30:0x007e, B:20:0x0053, B:23:0x005d), top: B:44:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0090 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m94964c(bui<? super T> buiVar, ReceiveChannel<? extends T> receiveChannel, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        ChannelIterator<? extends T> it;
        ChannelIterator<? extends T> channelIterator;
        bui<? super T> buiVar2;
        Object objMo94807a;
        if (continuation instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
            flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1) continuation;
            int i = flowKt__ChannelsKt$emitAllImpl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ChannelsKt$emitAllImpl$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(continuation);
            }
        } else {
            flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(continuation);
        }
        Object obj = flowKt__ChannelsKt$emitAllImpl$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ChannelsKt$emitAllImpl$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                fui.m127493q(buiVar);
                it = receiveChannel.iterator();
                flowKt__ChannelsKt$emitAllImpl$1.L$0 = buiVar;
                flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                objMo94807a = it.mo94807a(flowKt__ChannelsKt$emitAllImpl$1);
                if (objMo94807a == objM198688e) {
                    buiVar2 = buiVar;
                    channelIterator = it;
                    obj = objMo94807a;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z) {
                            us4.m197675b(receiveChannel, null);
                        }
                        return Unit.INSTANCE;
                    }
                    T next = channelIterator.next();
                    flowKt__ChannelsKt$emitAllImpl$1.L$0 = buiVar2;
                    flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                    flowKt__ChannelsKt$emitAllImpl$1.L$2 = channelIterator;
                    flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                    flowKt__ChannelsKt$emitAllImpl$1.label = 2;
                }
                return objM198688e;
            }
            if (i2 == 1) {
                z = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                channelIterator = (ChannelIterator) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                receiveChannel = (ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                buiVar2 = (bui) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                ResultKt.m88128b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z) {
                        us4.m197675b(receiveChannel, null);
                    }
                    return Unit.INSTANCE;
                }
                T next2 = channelIterator.next();
                flowKt__ChannelsKt$emitAllImpl$1.L$0 = buiVar2;
                flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                flowKt__ChannelsKt$emitAllImpl$1.L$2 = channelIterator;
                flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                flowKt__ChannelsKt$emitAllImpl$1.label = 2;
            } else {
                if (i2 != 2) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                channelIterator = (ChannelIterator) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                receiveChannel = (ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                buiVar2 = (bui) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                ResultKt.m88128b(obj);
            }
            it = channelIterator;
            buiVar = buiVar2;
            flowKt__ChannelsKt$emitAllImpl$1.L$0 = buiVar;
            flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
            flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
            flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
            flowKt__ChannelsKt$emitAllImpl$1.label = 1;
            objMo94807a = it.mo94807a(flowKt__ChannelsKt$emitAllImpl$1);
            if (objMo94807a == objM198688e) {
                buiVar2 = buiVar;
                channelIterator = it;
                obj = objMo94807a;
                if (!((Boolean) obj).booleanValue()) {
                    if (z) {
                        us4.m197675b(receiveChannel, null);
                    }
                    return Unit.INSTANCE;
                }
                T next3 = channelIterator.next();
                flowKt__ChannelsKt$emitAllImpl$1.L$0 = buiVar2;
                flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                flowKt__ChannelsKt$emitAllImpl$1.L$2 = channelIterator;
                flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                flowKt__ChannelsKt$emitAllImpl$1.label = 2;
            }
            return objM198688e;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    us4.m197675b(receiveChannel, th);
                }
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> ReceiveChannel<T> m94965d(@NotNull aui<? extends T> auiVar, @NotNull drb drbVar) {
        return is4.m141865b(auiVar).m95060k(drbVar);
    }
}
