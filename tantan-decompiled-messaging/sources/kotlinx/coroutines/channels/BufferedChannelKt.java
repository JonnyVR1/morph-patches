package kotlinx.coroutines.channels;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import p149l.bf4;
import p149l.j6f;
import p149l.ur4;
import p149l.whh0;
import p149l.yfh0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\u001a3\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001aN\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!\"\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010(\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'\"\u0014\u0010.\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u00100\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-\"\u0014\u00102\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-\"\u0014\u00104\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010-\"\u0014\u00106\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010-\"\u0014\u00108\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010-\"\u0014\u0010:\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010-\"\u0014\u0010<\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010-\"\u001a\u0010@\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b>\u0010?\"\u0014\u0010B\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010-\"\u0014\u0010D\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010-\"\u0014\u0010F\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010-\"\u0014\u0010H\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010-\"\u0014\u0010J\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010-\"\u0014\u0010L\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010-\"\u0014\u0010N\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010-¨\u0006O"}, m87232d2 = {"E", "Lkotlin/reflect/KFunction2;", "", "Ll/ur4;", BaseSei.f13931Y, "()Lkotlin/reflect/KFunction;", "id", "prev", BaseSei.f13930X, "(JLl/ur4;)Ll/ur4;", j6f.GPS_DIRECTION_TRUE, "Ll/bf4;", "value", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "", "onCancellation", "", "B", "(Ll/bf4;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "", "capacity", "A", "(I)J", Counter.TYPE, "closeStatus", "w", "(JI)J", "pauseEB", ResourceDirection.f38808v, "(JZ)J", "", "a", "Ll/ur4;", "NULL_SEGMENT", "b", "I", "SEGMENT_SIZE", "c", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "Ll/yfh0;", Constants.INAPP_DATA_TAG, "Ll/yfh0;", "BUFFERED", "e", "IN_BUFFER", "f", "RESUMING_BY_RCV", "g", "RESUMING_BY_EB", "h", "POISONED", RXScreenCaptureService.KEY_INDEX, "DONE_RCV", "j", "INTERRUPTED_SEND", "k", "INTERRUPTED_RCV", BLiveStormDanmakuGiftResourceType.f44444l, BaseSei.f13932Z, "()Ll/yfh0;", "CHANNEL_CLOSED", "m", "SUSPEND", "n", "SUSPEND_NO_WAITER", "o", "FAILED", "p", "NO_RECEIVE_RESULT", "q", "CLOSE_HANDLER_CLOSED", "r", "CLOSE_HANDLER_INVOKED", BLiveStormDanmakuGiftResourceType.f44446s, "NO_CLOSE_CAUSE", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class BufferedChannelKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ur4<Object> f66728a = new ur4<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b */
    @JvmField
    public static final int f66729b = whh0.m203219e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    public static final int f66730c = whh0.m203219e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final yfh0 f66731d = new yfh0("BUFFERED");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final yfh0 f66732e = new yfh0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final yfh0 f66733f = new yfh0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final yfh0 f66734g = new yfh0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final yfh0 f66735h = new yfh0("POISONED");

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final yfh0 f66736i = new yfh0("DONE_RCV");

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final yfh0 f66737j = new yfh0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final yfh0 f66738k = new yfh0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final yfh0 f66739l = new yfh0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final yfh0 f66740m = new yfh0("SUSPEND");

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final yfh0 f66741n = new yfh0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final yfh0 f66742o = new yfh0("FAILED");

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final yfh0 f66743p = new yfh0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final yfh0 f66744q = new yfh0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final yfh0 f66745r = new yfh0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final yfh0 f66746s = new yfh0("NO_CLOSE_CAUSE");

    /* JADX INFO: renamed from: A */
    public static final long m93922A(int i) {
        if (i == 0) {
            return 0L;
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static final <T> boolean m93923B(bf4<? super T> bf4Var, T t, Function1<? super Throwable, Unit> function1) {
        Object objMo93742A = bf4Var.mo93742A(t, null, function1);
        if (objMo93742A == null) {
            return false;
        }
        bf4Var.mo93779w(objMo93742A);
        return true;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m93924C(bf4 bf4Var, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return m93923B(bf4Var, obj, function1);
    }

    /* JADX INFO: renamed from: v */
    public static final long m93946v(long j, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j;
    }

    /* JADX INFO: renamed from: w */
    public static final long m93947w(long j, int i) {
        return (((long) i) << 60) + j;
    }

    /* JADX INFO: renamed from: x */
    public static final <E> ur4<E> m93948x(long j, ur4<E> ur4Var) {
        return new ur4<>(j, ur4Var, ur4Var.m195047y(), 0);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static final <E> KFunction<ur4<E>> m93949y() {
        return BufferedChannelKt$createSegmentFunction$1.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final yfh0 m93950z() {
        return f66739l;
    }
}
