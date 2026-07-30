package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.el90;
import p153l.sme0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", m88263f = "TickerChannels.kt", m88264l = {68, 69}, m88265m = "invokeSuspend")
final class TickerChannelsKt$ticker$3 extends SuspendLambda implements Function2<el90<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ long $initialDelayMillis;
    final /* synthetic */ TickerMode $mode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$a */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public /* synthetic */ class C15520a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f67424a;

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
            f67424a = iArr;
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
    public final Object invoke(@NotNull el90<? super Unit> el90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((TickerChannelsKt$ticker$3) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (kotlinx.coroutines.channels.TickerChannelsKt.m94880c(r4, r6, r8, r10) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (kotlinx.coroutines.channels.TickerChannelsKt.m94881d(r1, r3, r5, r10) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            el90 el90Var = (el90) this.L$0;
            int i2 = C15520a.f67424a[this.$mode.ordinal()];
            if (i2 == 1) {
                long j = this.$delayMillis;
                long j2 = this.$initialDelayMillis;
                sme0 channel = el90Var.getChannel();
                this.label = 1;
            } else if (i2 == 2) {
                long j3 = this.$delayMillis;
                long j4 = this.$initialDelayMillis;
                sme0 channel2 = el90Var.getChannel();
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
