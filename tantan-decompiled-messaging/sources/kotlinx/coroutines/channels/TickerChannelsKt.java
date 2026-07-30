package kotlinx.coroutines.channels;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a.\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007\u001a.\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m87232d2 = {"", "delayMillis", "initialDelayMillis", "Ll/nee0;", "", "channel", Constants.INAPP_DATA_TAG, "(JJLl/nee0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class TickerChannelsKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (kotlinx.coroutines.DelayKt.m93611b(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:14:0x0034). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m93988c(long r6, long r8, p149l.nee0<? super kotlin.Unit> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p149l.uwp.m196133e()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L52
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L36
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            l.nee0 r8 = (p149l.nee0) r8
            kotlin.ResultKt.m87239b(r11)
        L34:
            r10 = r8
            goto L62
        L36:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r6)
            r6 = 0
            return r6
        L3d:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            l.nee0 r8 = (p149l.nee0) r8
            kotlin.ResultKt.m87239b(r11)
            goto L72
        L47:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            r10 = r8
            l.nee0 r10 = (p149l.nee0) r10
            kotlin.ResultKt.m87239b(r11)
            goto L62
        L52:
            kotlin.ResultKt.m87239b(r11)
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r5
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m93611b(r8, r0)
            if (r8 != r1) goto L62
            goto L7e
        L62:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r8 = r10.mo93787E(r8, r0)
            if (r8 != r1) goto L71
            goto L7e
        L71:
            r8 = r10
        L72:
            r0.L$0 = r8
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.m93611b(r6, r0)
            if (r9 != r1) goto L34
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.m93988c(long, long, l.nee0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
    
        if (kotlinx.coroutines.DelayKt.m93611b(r4, r1) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        if (kotlinx.coroutines.DelayKt.m93611b(r4, r1) == r2) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fc -> B:31:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0112 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m93989d(long r18, long r20, p149l.nee0<? super kotlin.Unit> r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.m93989d(long, long, l.nee0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
