package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.TreasurePrizeCategory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.jr4;
import p149l.ppb;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/fri;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "channel", "", "b", "(Ll/fri;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", TreasurePrizeCategory.consume, "c", "(Ll/fri;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/eri;", "Ll/ppb;", "scope", Constants.INAPP_DATA_TAG, "(Ll/eri;Ll/ppb;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__ChannelsKt {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94070b(@NotNull fri<? super T> friVar, @NotNull ReceiveChannel<? extends T> receiveChannel, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objM94071c = m94071c(friVar, receiveChannel, true, continuation);
        return objM94071c == uwp.m196133e() ? objM94071c : Unit.INSTANCE;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m94071c(p149l.fri<? super T> r7, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p149l.uwp.m196133e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L57
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3f
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.L$0
            l.fri r2 = (p149l.fri) r2
            kotlin.ResultKt.m87239b(r10)     // Catch: java.lang.Throwable -> L3d
        L3a:
            r10 = r7
            r7 = r2
            goto L61
        L3d:
            r7 = move-exception
            goto L9b
        L3f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r7)
            return r5
        L45:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.L$0
            l.fri r2 = (p149l.fri) r2
            kotlin.ResultKt.m87239b(r10)     // Catch: java.lang.Throwable -> L3d
            goto L76
        L57:
            kotlin.ResultKt.m87239b(r10)
            p149l.jri.m142958q(r7)
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> L3d
        L61:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L3d
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3d
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L3d
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L3d
            r0.label = r4     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r10.mo93915a(r0)     // Catch: java.lang.Throwable -> L3d
            if (r2 != r1) goto L72
            goto L92
        L72:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L76:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L3d
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r10 == 0) goto L93
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L3d
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L3d
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3d
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L3d
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L3d
            r0.label = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L3d
            if (r10 != r1) goto L3a
        L92:
            return r1
        L93:
            if (r9 == 0) goto L98
            p149l.vr4.m199619b(r8, r5)
        L98:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L9b:
            throw r7     // Catch: java.lang.Throwable -> L9c
        L9c:
            r10 = move-exception
            if (r9 == 0) goto La2
            p149l.vr4.m199619b(r8, r7)
        La2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.m94071c(l.fri, kotlinx.coroutines.channels.ReceiveChannel, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> ReceiveChannel<T> m94072d(@NotNull eri<? extends T> eriVar, @NotNull ppb ppbVar) {
        return jr4.m142919b(eriVar).m94167k(ppbVar);
    }
}
