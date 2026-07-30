package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ad90;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ad90;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", m87374f = "TickerChannels.kt", m87375l = {68, 69}, m87376m = "invokeSuspend")
final class TickerChannelsKt$ticker$3 extends SuspendLambda implements Function2<ad90<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ long $initialDelayMillis;
    final /* synthetic */ TickerMode $mode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$a */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public /* synthetic */ class C15413a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66750a;

        static {
            int[] iArr = new int[TickerMode.values().length];
            try {
                iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66750a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickerChannelsKt$ticker$3(TickerMode tickerMode, long j, long j2, Continuation<? super TickerChannelsKt$ticker$3> continuation) {
        super(2, continuation);
        this.$mode = tickerMode;
        this.$delayMillis = j;
        this.$initialDelayMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.$mode, this.$delayMillis, this.$initialDelayMillis, continuation);
        tickerChannelsKt$ticker$3.L$0 = obj;
        return tickerChannelsKt$ticker$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ad90<? super Unit> ad90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((TickerChannelsKt$ticker$3) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (kotlinx.coroutines.channels.TickerChannelsKt.m93988c(r4, r6, r8, r10) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (kotlinx.coroutines.channels.TickerChannelsKt.m93989d(r1, r3, r5, r10) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto Le
            if (r1 != r2) goto L12
        Le:
            kotlin.ResultKt.m87239b(r11)
            goto L54
        L12:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r10)
            r10 = 0
            return r10
        L19:
            kotlin.ResultKt.m87239b(r11)
            java.lang.Object r11 = r10.L$0
            l.ad90 r11 = (p149l.ad90) r11
            kotlinx.coroutines.channels.TickerMode r1 = r10.$mode
            int[] r4 = kotlinx.coroutines.channels.TickerChannelsKt$ticker$3.C15413a.f66750a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            if (r1 == r3) goto L41
            if (r1 == r2) goto L2f
            goto L54
        L2f:
            long r4 = r10.$delayMillis
            long r6 = r10.$initialDelayMillis
            l.nee0 r8 = r11.getChannel()
            r10.label = r2
            r9 = r10
            java.lang.Object r10 = kotlinx.coroutines.channels.TickerChannelsKt.m93986a(r4, r6, r8, r9)
            if (r10 != r0) goto L54
            goto L53
        L41:
            r6 = r10
            long r1 = r6.$delayMillis
            r10 = r3
            long r3 = r6.$initialDelayMillis
            l.nee0 r5 = r11.getChannel()
            r6.label = r10
            java.lang.Object r10 = kotlinx.coroutines.channels.TickerChannelsKt.m93987b(r1, r3, r5, r6)
            if (r10 != r0) goto L54
        L53:
            return r0
        L54:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
