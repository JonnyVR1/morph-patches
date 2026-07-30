package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15407c;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.AbstractC15825b8;
import p149l.AbstractC16310d8;
import p149l.C16091c8;
import p149l.b2s;
import p149l.df4;
import p149l.eri;
import p149l.eve0;
import p149l.fri;
import p149l.fve0;
import p149l.j6f;
import p149l.l4e;
import p149l.lt10;
import p149l.qkq0;
import p149l.raj;
import p149l.uwp;
import p149l.yfh0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001SB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\u0010\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J/\u0010-\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0002¢\u0006\u0004\b/\u0010\u0015J\u0019\u0010\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0001\u00101J\u0017\u00102\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0004\u0018\u00010\u00052\u0006\u00104\u001a\u00020\u0016H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b7\u00108J3\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001090\u001d2\u0014\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001090\u001dH\u0002¢\u0006\u0004\b;\u0010<J\u001e\u0010@\u001a\u00020?2\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0096@¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bB\u0010\u0011J\u0018\u0010C\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@¢\u0006\u0004\bC\u0010$J\u000f\u0010D\u001a\u00020\u0016H\u0000¢\u0006\u0004\bD\u0010EJ%\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001090\u001d2\u0006\u0010F\u001a\u00020\u0016H\u0000¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0003H\u0014¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d2\u0006\u0010K\u001a\u00020\u0007H\u0014¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010\u0015J-\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000R2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR \u0010\\\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u0016\u0010e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010VR\u0014\u0010f\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010ER\u0014\u0010i\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010hR\u0014\u0010l\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010ER\u0014\u0010n\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010ER\u001a\u0010r\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bq\u0010\u0015\u001a\u0004\bo\u0010p¨\u0006s"}, m87232d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", j6f.GPS_DIRECTION_TRUE, "Ll/b8;", "Ll/fve0;", "Ll/lt10;", "", "Ll/raj;", "", "replay", "bufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "value", "", "Q", "(Ljava/lang/Object;)Z", "R", "", "D", "()V", "", "newHead", "A", "(J)V", Item.TYPE, "G", "(Ljava/lang/Object;)V", "", "curBuffer", "curSize", "newSize", "P", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "F", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "emitter", BaseSei.f13930X, "(Lkotlinx/coroutines/flow/SharedFlowImpl$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "U", "(JJJJ)V", BaseSei.f13931Y, "slot", "(Ll/fve0;)Ljava/lang/Object;", j6f.LATITUDE_SOUTH, "(Ll/fve0;)J", FirebaseAnalytics.Param.INDEX, "L", "(J)Ljava/lang/Object;", "w", "(Ll/fve0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "resumesIn", "H", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "emit", "W", "()J", "oldIndex", j6f.GPS_MEASUREMENT_INTERRUPTED, "(J)[Lkotlin/coroutines/Continuation;", "B", "()Ll/fve0;", "size", b2s.C_ZONE, "(I)[Ll/fve0;", "b", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Ll/eri;", "a", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/eri;", "e", "I", "f", "g", "Lkotlinx/coroutines/channels/BufferOverflow;", "h", "[Ljava/lang/Object;", "buffer", RXScreenCaptureService.KEY_INDEX, "J", "replayIndex", "j", "minCollectorIndex", "k", "bufferSize", BLiveStormDanmakuGiftResourceType.f44444l, "queueSize", "head", "N", "()I", "replaySize", BloodType.f38728O, "totalSize", "bufferEndIndex", "M", "queueEndIndex", "K", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public class SharedFlowImpl<T> extends AbstractC15825b8<fve0> implements lt10<T>, eri, raj<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int replay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int bufferCapacity;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Object[] buffer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long replayIndex;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public long minCollectorIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int bufferSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int queueSize;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$a */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "Ll/l4e;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "flow", "", FirebaseAnalytics.Param.INDEX, "", "value", "Lkotlin/coroutines/Continuation;", "", "cont", "<init>", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "()V", "a", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "b", "J", "c", "Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C15463a implements l4e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final SharedFlowImpl<?> flow;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        public long index;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final Continuation<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public C15463a(@NotNull SharedFlowImpl<?> sharedFlowImpl, long j, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // p149l.l4e
        public void dispose() {
            this.flow.m94152x(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$b */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public /* synthetic */ class C15464b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66867a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66867a = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.SharedFlowImpl", m87374f = "SharedFlow.kt", m87375l = {382, 389, 392}, m87376m = "collect$suspendImpl")
    public static final class C154651<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154651(SharedFlowImpl<T> sharedFlowImpl, Continuation<? super C154651> continuation) {
            super(continuation);
            this.this$0 = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.m94123z(this.this$0, null, this);
        }
    }

    public SharedFlowImpl(int i, int i2, @NotNull BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i2;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ <T> Object m94112E(SharedFlowImpl<T> sharedFlowImpl, T t, Continuation<? super Unit> continuation) throws Throwable {
        if (sharedFlowImpl.mo94148c(t)) {
            return Unit.INSTANCE;
        }
        Object objM94128F = sharedFlowImpl.m94128F(t, continuation);
        return objM94128F == uwp.m196133e() ? objM94128F : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (((p149l.w3g0) r9).m201316a(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object m94123z(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, p149l.fri<? super T> r9, kotlin.coroutines.Continuation<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.m94123z(kotlinx.coroutines.flow.SharedFlowImpl, l.fri, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: A */
    public final void m94124A(long newHead) {
        AbstractC16310d8[] abstractC16310d8Arr;
        if (this.nCollectors != 0 && (abstractC16310d8Arr = this.slots) != null) {
            for (AbstractC16310d8 abstractC16310d8 : abstractC16310d8Arr) {
                if (abstractC16310d8 != null) {
                    fve0 fve0Var = (fve0) abstractC16310d8;
                    long j = fve0Var.index;
                    if (j >= 0 && j < newHead) {
                        fve0Var.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    @Override // p149l.AbstractC15825b8
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public fve0 mo94149h() {
        return new fve0();
    }

    @Override // p149l.AbstractC15825b8
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public fve0[] mo94150i(int size) {
        return new fve0[size];
    }

    /* JADX INFO: renamed from: D */
    public final void m94127D() {
        Object[] objArr = this.buffer;
        objArr.getClass();
        eve0.m118263e(objArr, m94132J(), null);
        this.bufferSize--;
        long jM94132J = m94132J() + 1;
        if (this.replayIndex < jM94132J) {
            this.replayIndex = jM94132J;
        }
        if (this.minCollectorIndex < jM94132J) {
            m94124A(jM94132J);
        }
    }

    /* JADX INFO: renamed from: F */
    public final Object m94128F(T t, Continuation<? super Unit> continuation) throws Throwable {
        SharedFlowImpl<T> sharedFlowImpl;
        Throwable th;
        Continuation<Unit>[] continuationArrM94130H;
        C15463a c15463a;
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        Continuation<Unit>[] continuationArrM94130H2 = C16091c8.f79669a;
        synchronized (this) {
            try {
                if (m94139Q(t)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        c15407c.resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
                        continuationArrM94130H = m94130H(continuationArrM94130H2);
                        c15463a = null;
                        sharedFlowImpl = this;
                    } catch (Throwable th2) {
                        th = th2;
                        sharedFlowImpl = this;
                        throw th;
                    }
                } else {
                    sharedFlowImpl = this;
                    try {
                        c15463a = new C15463a(sharedFlowImpl, m94132J() + ((long) m94137O()), t, c15407c);
                        sharedFlowImpl.m94129G(c15463a);
                        sharedFlowImpl.queueSize++;
                        if (sharedFlowImpl.bufferCapacity == 0) {
                            continuationArrM94130H2 = sharedFlowImpl.m94130H(continuationArrM94130H2);
                        }
                        continuationArrM94130H = continuationArrM94130H2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (c15463a != null) {
                    df4.m111429a(c15407c, c15463a);
                }
                for (Continuation<Unit> continuation2 : continuationArrM94130H) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
                    }
                }
                Object objM93778v = c15407c.m93778v();
                if (objM93778v == uwp.m196133e()) {
                    DebugProbesKt.m87383c(continuation);
                }
                return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
                sharedFlowImpl = this;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m94129G(Object item) {
        int iM94137O = m94137O();
        Object[] objArrM94138P = this.buffer;
        if (objArrM94138P == null) {
            objArrM94138P = m94138P(null, 0, 2);
        } else if (iM94137O >= objArrM94138P.length) {
            objArrM94138P = m94138P(objArrM94138P, iM94137O, objArrM94138P.length * 2);
        }
        eve0.m118263e(objArrM94138P, m94132J() + ((long) iM94137O), item);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: H */
    public final Continuation<Unit>[] m94130H(Continuation<Unit>[] resumesIn) {
        AbstractC16310d8[] abstractC16310d8Arr;
        fve0 fve0Var;
        Continuation<? super Unit> continuation;
        int length = resumesIn.length;
        if (this.nCollectors != 0 && (abstractC16310d8Arr = this.slots) != null) {
            int length2 = abstractC16310d8Arr.length;
            int i = 0;
            while (i < length2) {
                AbstractC16310d8 abstractC16310d8 = abstractC16310d8Arr[i];
                if (abstractC16310d8 == null || (continuation = (fve0Var = (fve0) abstractC16310d8).cont) == null || m94141S(fve0Var) < 0) {
                    resumesIn = resumesIn;
                } else {
                    if (length >= resumesIn.length) {
                        resumesIn = resumesIn;
                        resumesIn = resumesIn;
                        resumesIn = Arrays.copyOf((Object[]) resumesIn, Math.max(2, resumesIn.length * 2));
                    }
                    resumesIn = resumesIn;
                    resumesIn = resumesIn;
                    ((Continuation[]) resumesIn)[length] = continuation;
                    fve0Var.cont = null;
                    length++;
                }
                i++;
                resumesIn = resumesIn;
            }
            resumesIn = resumesIn;
        }
        return (Continuation[]) resumesIn;
    }

    /* JADX INFO: renamed from: I */
    public final long m94131I() {
        return m94132J() + ((long) this.bufferSize);
    }

    /* JADX INFO: renamed from: J */
    public final long m94132J() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    /* JADX INFO: renamed from: K */
    public final T m94133K() {
        Object[] objArr = this.buffer;
        objArr.getClass();
        return (T) eve0.m118262d(objArr, (this.replayIndex + ((long) m94136N())) - 1);
    }

    /* JADX INFO: renamed from: L */
    public final Object m94134L(long index) {
        Object[] objArr = this.buffer;
        objArr.getClass();
        Object objM118262d = eve0.m118262d(objArr, index);
        return objM118262d instanceof C15463a ? ((C15463a) objM118262d).value : objM118262d;
    }

    /* JADX INFO: renamed from: M */
    public final long m94135M() {
        return m94132J() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    /* JADX INFO: renamed from: N */
    public final int m94136N() {
        return (int) ((m94132J() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: renamed from: O */
    public final int m94137O() {
        return this.bufferSize + this.queueSize;
    }

    /* JADX INFO: renamed from: P */
    public final Object[] m94138P(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            qkq0.m175383a("Buffer size overflow");
            return null;
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer != null) {
            long jM94132J = m94132J();
            for (int i = 0; i < curSize; i++) {
                long j = ((long) i) + jM94132J;
                eve0.m118263e(objArr, j, eve0.m118262d(curBuffer, j));
            }
        }
        return objArr;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m94139Q(T value) {
        if (getNCollectors() == 0) {
            return m94140R(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = C15464b.f66867a[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        m94129G(value);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.bufferCapacity) {
            m94127D();
        }
        if (m94136N() > this.replay) {
            m94143U(this.replayIndex + 1, this.minCollectorIndex, m94131I(), m94135M());
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m94140R(T value) {
        if (this.replay == 0) {
            return true;
        }
        m94129G(value);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            m94127D();
        }
        this.minCollectorIndex = m94132J() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: renamed from: S */
    public final long m94141S(fve0 slot) {
        long j = slot.index;
        if (j >= m94131I() && (this.bufferCapacity > 0 || j > m94132J() || this.queueSize == 0)) {
            return -1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: T */
    public final Object m94142T(fve0 slot) {
        Object obj;
        Continuation<Unit>[] continuationArrM94144V = C16091c8.f79669a;
        synchronized (this) {
            try {
                long jM94141S = m94141S(slot);
                if (jM94141S < 0) {
                    obj = eve0.f93331a;
                } else {
                    long j = slot.index;
                    Object objM94134L = m94134L(jM94141S);
                    slot.index = jM94141S + 1;
                    continuationArrM94144V = m94144V(j);
                    obj = objM94134L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<Unit> continuation : continuationArrM94144V) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: U */
    public final void m94143U(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long jM94132J = m94132J(); jM94132J < jMin; jM94132J++) {
            Object[] objArr = this.buffer;
            objArr.getClass();
            eve0.m118263e(objArr, jM94132J, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    @NotNull
    /* JADX INFO: renamed from: V */
    public final Continuation<Unit>[] m94144V(long oldIndex) {
        long j;
        long j2;
        long j3;
        long j4;
        Continuation<Unit>[] continuationArr;
        long jMax;
        Object[] objArr;
        AbstractC16310d8[] abstractC16310d8Arr;
        if (oldIndex > this.minCollectorIndex) {
            return C16091c8.f79669a;
        }
        long jM94132J = m94132J();
        long j5 = ((long) this.bufferSize) + jM94132J;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j5++;
        }
        int i = 0;
        if (this.nCollectors != 0 && (abstractC16310d8Arr = this.slots) != null) {
            for (AbstractC16310d8 abstractC16310d8 : abstractC16310d8Arr) {
                if (abstractC16310d8 != null) {
                    long j6 = ((fve0) abstractC16310d8).index;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.minCollectorIndex) {
            return C16091c8.f79669a;
        }
        long jM94131I = m94131I();
        int nCollectors = getNCollectors();
        int iMin = this.queueSize;
        if (nCollectors > 0) {
            iMin = Math.min(iMin, this.bufferCapacity - ((int) (jM94131I - j5)));
        }
        Continuation<Unit>[] continuationArr2 = C16091c8.f79669a;
        long j7 = ((long) this.queueSize) + jM94131I;
        if (iMin > 0) {
            continuationArr2 = new Continuation[iMin];
            Object[] objArr2 = this.buffer;
            objArr2.getClass();
            j3 = 1;
            long j8 = jM94131I;
            while (true) {
                if (jM94131I >= j7) {
                    j = jM94132J;
                    j2 = j5;
                    continuationArr = continuationArr2;
                    j4 = j8;
                    break;
                }
                Object objM118262d = eve0.m118262d(objArr2, jM94131I);
                j = jM94132J;
                yfh0 yfh0Var = eve0.f93331a;
                if (objM118262d != yfh0Var) {
                    objM118262d.getClass();
                    C15463a c15463a = (C15463a) objM118262d;
                    int i2 = i + 1;
                    j2 = j5;
                    continuationArr2[i] = c15463a.cont;
                    eve0.m118263e(objArr2, jM94131I, yfh0Var);
                    eve0.m118263e(objArr2, j8, c15463a.value);
                    j4 = j8 + 1;
                    if (i2 < iMin) {
                        i = i2;
                        j8 = j4;
                    }
                } else {
                    j2 = j5;
                }
                jM94131I++;
                jM94132J = j;
                j5 = j2;
            }
            int i3 = (int) (j4 - j);
            if (getNCollectors() == 0) {
                j2 = j4;
            }
            jMax = Math.max(this.replayIndex, j4 - ((long) Math.min(this.replay, i3)));
            if (this.bufferCapacity == 0 && jMax < j7) {
                objArr = this.buffer;
                objArr.getClass();
                if (Intrinsics.m87488d(eve0.m118262d(objArr, jMax), eve0.f93331a)) {
                    j4 += j3;
                    jMax += j3;
                }
            }
            m94143U(jMax, j2, j4, j7);
            m94153y();
            if (continuationArr.length == 0) {
                return continuationArr;
            }
            return m94130H(continuationArr);
        }
        j = jM94132J;
        j2 = j5;
        j3 = 1;
        j4 = jM94131I;
        continuationArr = continuationArr2;
        int i4 = (int) (j4 - j);
        if (getNCollectors() == 0) {
            j2 = j4;
        }
        jMax = Math.max(this.replayIndex, j4 - ((long) Math.min(this.replay, i4)));
        if (this.bufferCapacity == 0) {
            objArr = this.buffer;
            objArr.getClass();
            if (Intrinsics.m87488d(eve0.m118262d(objArr, jMax), eve0.f93331a)) {
                j4 += j3;
                jMax += j3;
            }
        }
        m94143U(jMax, j2, j4, j7);
        m94153y();
        if (continuationArr.length == 0) {
            return continuationArr;
        }
        return m94130H(continuationArr);
    }

    /* JADX INFO: renamed from: W */
    public final long m94145W() {
        long j = this.replayIndex;
        if (j < this.minCollectorIndex) {
            this.minCollectorIndex = j;
        }
        return j;
    }

    @Override // p149l.raj
    @NotNull
    /* JADX INFO: renamed from: a */
    public eri<T> mo94146a(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return eve0.m118261c(this, context, capacity, onBufferOverflow);
    }

    @Override // p149l.lt10
    /* JADX INFO: renamed from: b */
    public void mo94147b() throws Throwable {
        SharedFlowImpl<T> sharedFlowImpl;
        synchronized (this) {
            try {
                sharedFlowImpl = this;
                try {
                    sharedFlowImpl.m94143U(m94131I(), this.minCollectorIndex, m94131I(), m94135M());
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                sharedFlowImpl = this;
            }
        }
    }

    @Override // p149l.lt10
    /* JADX INFO: renamed from: c */
    public boolean mo94148c(T value) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArrM94130H = C16091c8.f79669a;
        synchronized (this) {
            if (m94139Q(value)) {
                continuationArrM94130H = m94130H(continuationArrM94130H);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArrM94130H) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    @Override // p149l.dve0, p149l.eri
    @Nullable
    public Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<?> continuation) {
        return m94123z(this, friVar, continuation);
    }

    @Override // p149l.fri
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        return m94112E(this, t, continuation);
    }

    /* JADX INFO: renamed from: w */
    public final Object m94151w(fve0 fve0Var, Continuation<? super Unit> continuation) {
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        synchronized (this) {
            try {
                if (m94141S(fve0Var) < 0) {
                    fve0Var.cont = c15407c;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    c15407c.resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM93778v = c15407c.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public final void m94152x(C15463a emitter) {
        synchronized (this) {
            if (emitter.index < m94132J()) {
                return;
            }
            Object[] objArr = this.buffer;
            objArr.getClass();
            if (eve0.m118262d(objArr, emitter.index) != emitter) {
                return;
            }
            eve0.m118263e(objArr, emitter.index, eve0.f93331a);
            m94153y();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m94153y() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            objArr.getClass();
            while (this.queueSize > 0 && eve0.m118262d(objArr, (m94132J() + ((long) m94137O())) - 1) == eve0.f93331a) {
                this.queueSize--;
                eve0.m118263e(objArr, m94132J() + ((long) m94137O()), null);
            }
        }
    }
}
