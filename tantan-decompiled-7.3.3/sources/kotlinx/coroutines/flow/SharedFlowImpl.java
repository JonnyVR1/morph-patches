package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
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
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.AbstractC21042w7;
import p153l.AbstractC21534y7;
import p153l.C21262x7;
import p153l.aui;
import p153l.bui;
import p153l.c4s;
import p153l.cg4;
import p153l.dcg0;
import p153l.fpq;
import p153l.goh0;
import p153l.l3f0;
import p153l.ldj;
import p153l.m3f0;
import p153l.p7f;
import p153l.t120;
import p153l.uyp;
import p153l.wtq0;
import p153l.z5e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001SB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\u0010\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J/\u0010-\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0002¢\u0006\u0004\b/\u0010\u0015J\u0019\u0010\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0001\u00101J\u0017\u00102\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0004\u0018\u00010\u00052\u0006\u00104\u001a\u00020\u0016H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b7\u00108J3\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001090\u001d2\u0014\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001090\u001dH\u0002¢\u0006\u0004\b;\u0010<J\u001e\u0010@\u001a\u00020?2\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0096@¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bB\u0010\u0011J\u0018\u0010C\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@¢\u0006\u0004\bC\u0010$J\u000f\u0010D\u001a\u00020\u0016H\u0000¢\u0006\u0004\bD\u0010EJ%\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001090\u001d2\u0006\u0010F\u001a\u00020\u0016H\u0000¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0003H\u0014¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d2\u0006\u0010K\u001a\u00020\u0007H\u0014¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010\u0015J-\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000R2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR \u0010\\\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u0016\u0010e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010VR\u0014\u0010f\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010ER\u0014\u0010i\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010hR\u0014\u0010l\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010ER\u0014\u0010n\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010ER\u001a\u0010r\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bq\u0010\u0015\u001a\u0004\bo\u0010p¨\u0006s"}, m88121d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", p7f.GPS_DIRECTION_TRUE, "Ll/w7;", "Ll/m3f0;", "Ll/t120;", "", "Ll/ldj;", "", "replay", "bufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "value", "", "Q", "(Ljava/lang/Object;)Z", "R", "", "D", "()V", "", "newHead", "A", "(J)V", Item.TYPE, "G", "(Ljava/lang/Object;)V", "", "curBuffer", "curSize", "newSize", "P", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "F", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "emitter", BaseSei.f14624X, "(Lkotlinx/coroutines/flow/SharedFlowImpl$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "U", "(JJJJ)V", BaseSei.f14625Y, "slot", "(Ll/m3f0;)Ljava/lang/Object;", p7f.LATITUDE_SOUTH, "(Ll/m3f0;)J", FirebaseAnalytics.Param.INDEX, "L", "(J)Ljava/lang/Object;", "w", "(Ll/m3f0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "resumesIn", "H", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "emit", "W", "()J", "oldIndex", p7f.GPS_MEASUREMENT_INTERRUPTED, "(J)[Lkotlin/coroutines/Continuation;", "B", "()Ll/m3f0;", "size", c4s.C_ZONE, "(I)[Ll/m3f0;", "b", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Ll/aui;", "a", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/aui;", "e", "I", "f", "g", "Lkotlinx/coroutines/channels/BufferOverflow;", "h", "[Ljava/lang/Object;", "buffer", RXScreenCaptureService.KEY_INDEX, "J", "replayIndex", "j", "minCollectorIndex", "k", "bufferSize", BLiveStormDanmakuGiftResourceType.f45292l, "queueSize", "head", "N", "()I", "replaySize", BloodType.f39576O, "totalSize", "bufferEndIndex", "M", "queueEndIndex", "K", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public class SharedFlowImpl<T> extends AbstractC21042w7<m3f0> implements t120<T>, aui, ldj<T> {

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
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "Ll/z5e;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "flow", "", FirebaseAnalytics.Param.INDEX, "", "value", "Lkotlin/coroutines/Continuation;", "", "cont", "<init>", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "()V", "a", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "b", "J", "c", "Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C15570a implements z5e {

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
        public C15570a(@NotNull SharedFlowImpl<?> sharedFlowImpl, long j, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // p153l.z5e
        public void dispose() {
            this.flow.m95045x(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$b */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public /* synthetic */ class C15571b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f67541a;

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
            f67541a = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.SharedFlowImpl", m88263f = "SharedFlow.kt", m88264l = {382, 389, 392}, m88265m = "collect$suspendImpl")
    public static final class C155721<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C155721(SharedFlowImpl<T> sharedFlowImpl, Continuation<? super C155721> continuation) {
            super(continuation);
            this.this$0 = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.m95016z(this.this$0, null, this);
        }
    }

    public SharedFlowImpl(int i, int i2, @NotNull BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i2;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ <T> Object m95005E(SharedFlowImpl<T> sharedFlowImpl, T t, Continuation<? super Unit> continuation) throws Throwable {
        if (sharedFlowImpl.mo95041c(t)) {
            return Unit.INSTANCE;
        }
        Object objM95021F = sharedFlowImpl.m95021F(t, continuation);
        return objM95021F == uyp.m198688e() ? objM95021F : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (((p153l.dcg0) r9).m115273a(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <T> Object m95016z(SharedFlowImpl<T> sharedFlowImpl, bui<? super T> buiVar, Continuation<?> continuation) throws Throwable {
        C155721 c155721;
        SharedFlowImpl<T> sharedFlowImpl2;
        Throwable th;
        m3f0 m3f0Var;
        bui<? super T> buiVar2;
        InterfaceC15593o interfaceC15593o;
        bui buiVar3;
        if (continuation instanceof C155721) {
            c155721 = (C155721) continuation;
            int i = c155721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c155721.label = i - Integer.MIN_VALUE;
            } else {
                c155721 = new C155721(sharedFlowImpl, continuation);
            }
        } else {
            c155721 = new C155721(sharedFlowImpl, continuation);
        }
        Object obj = c155721.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c155721.label;
        if (i2 != 0) {
            if (i2 == 1) {
                m3f0Var = (m3f0) c155721.L$2;
                bui<? super T> buiVar4 = (bui) c155721.L$1;
                SharedFlowImpl<T> sharedFlowImpl3 = (SharedFlowImpl) c155721.L$0;
                try {
                    ResultKt.m88128b(obj);
                    buiVar2 = buiVar4;
                    sharedFlowImpl = sharedFlowImpl3;
                    try {
                        interfaceC15593o = (InterfaceC15593o) c155721.getContext().get(InterfaceC15593o.INSTANCE);
                        buiVar3 = buiVar2;
                    } catch (Throwable th2) {
                        sharedFlowImpl2 = sharedFlowImpl;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sharedFlowImpl2 = sharedFlowImpl3;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InterfaceC15593o interfaceC15593o2 = (InterfaceC15593o) c155721.L$3;
                m3f0Var = (m3f0) c155721.L$2;
                bui buiVar5 = (bui) c155721.L$1;
                sharedFlowImpl2 = (SharedFlowImpl) c155721.L$0;
                try {
                    ResultKt.m88128b(obj);
                    buiVar3 = buiVar5;
                    interfaceC15593o = interfaceC15593o2;
                    sharedFlowImpl = sharedFlowImpl2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            sharedFlowImpl2.m205209j(m3f0Var);
            throw th;
        }
        ResultKt.m88128b(obj);
        m3f0 m3f0VarM205207f = sharedFlowImpl.m205207f();
        try {
            if (buiVar instanceof dcg0) {
                c155721.L$0 = sharedFlowImpl;
                c155721.L$1 = buiVar;
                c155721.L$2 = m3f0VarM205207f;
                c155721.label = 1;
            }
            buiVar2 = buiVar;
            m3f0Var = m3f0VarM205207f;
            interfaceC15593o = (InterfaceC15593o) c155721.getContext().get(InterfaceC15593o.INSTANCE);
            buiVar3 = buiVar2;
        } catch (Throwable th5) {
            sharedFlowImpl2 = sharedFlowImpl;
            th = th5;
            m3f0Var = m3f0VarM205207f;
        }
        while (true) {
            Object objM95035T = sharedFlowImpl.m95035T(m3f0Var);
            if (objM95035T == l3f0.f129874a) {
                c155721.L$0 = sharedFlowImpl;
                c155721.L$1 = buiVar3;
                c155721.L$2 = m3f0Var;
                c155721.L$3 = interfaceC15593o;
                c155721.label = 2;
                if (sharedFlowImpl.m95044w(m3f0Var, c155721) == objM198688e) {
                    break;
                }
            } else {
                if (interfaceC15593o != null) {
                    fpq.m126712k(interfaceC15593o);
                }
                c155721.L$0 = sharedFlowImpl;
                c155721.L$1 = buiVar3;
                c155721.L$2 = m3f0Var;
                c155721.L$3 = interfaceC15593o;
                c155721.label = 3;
                if (buiVar3.emit(objM95035T, c155721) == objM198688e) {
                    break;
                }
            }
        }
        return objM198688e;
    }

    /* JADX INFO: renamed from: A */
    public final void m95017A(long newHead) {
        AbstractC21534y7[] abstractC21534y7Arr;
        if (this.nCollectors != 0 && (abstractC21534y7Arr = this.slots) != null) {
            for (AbstractC21534y7 abstractC21534y7 : abstractC21534y7Arr) {
                if (abstractC21534y7 != null) {
                    m3f0 m3f0Var = (m3f0) abstractC21534y7;
                    long j = m3f0Var.index;
                    if (j >= 0 && j < newHead) {
                        m3f0Var.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    @Override // p153l.AbstractC21042w7
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public m3f0 mo95042h() {
        return new m3f0();
    }

    @Override // p153l.AbstractC21042w7
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public m3f0[] mo95043i(int size) {
        return new m3f0[size];
    }

    /* JADX INFO: renamed from: D */
    public final void m95020D() {
        Object[] objArr = this.buffer;
        objArr.getClass();
        l3f0.m152701e(objArr, m95025J(), null);
        this.bufferSize--;
        long jM95025J = m95025J() + 1;
        if (this.replayIndex < jM95025J) {
            this.replayIndex = jM95025J;
        }
        if (this.minCollectorIndex < jM95025J) {
            m95017A(jM95025J);
        }
    }

    /* JADX INFO: renamed from: F */
    public final Object m95021F(T t, Continuation<? super Unit> continuation) throws Throwable {
        SharedFlowImpl<T> sharedFlowImpl;
        Throwable th;
        Continuation<Unit>[] continuationArrM95023H;
        C15570a c15570a;
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        Continuation<Unit>[] continuationArrM95023H2 = C21262x7.f192655a;
        synchronized (this) {
            try {
                if (m95032Q(t)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        c15514c.resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
                        continuationArrM95023H = m95023H(continuationArrM95023H2);
                        c15570a = null;
                        sharedFlowImpl = this;
                    } catch (Throwable th2) {
                        th = th2;
                        sharedFlowImpl = this;
                        throw th;
                    }
                } else {
                    sharedFlowImpl = this;
                    try {
                        c15570a = new C15570a(sharedFlowImpl, m95025J() + ((long) m95030O()), t, c15514c);
                        sharedFlowImpl.m95022G(c15570a);
                        sharedFlowImpl.queueSize++;
                        if (sharedFlowImpl.bufferCapacity == 0) {
                            continuationArrM95023H2 = sharedFlowImpl.m95023H(continuationArrM95023H2);
                        }
                        continuationArrM95023H = continuationArrM95023H2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (c15570a != null) {
                    cg4.m109663a(c15514c, c15570a);
                }
                for (Continuation<Unit> continuation2 : continuationArrM95023H) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
                    }
                }
                Object objM94670v = c15514c.m94670v();
                if (objM94670v == uyp.m198688e()) {
                    DebugProbesKt.m88272c(continuation);
                }
                return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
                sharedFlowImpl = this;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m95022G(Object item) {
        int iM95030O = m95030O();
        Object[] objArrM95031P = this.buffer;
        if (objArrM95031P == null) {
            objArrM95031P = m95031P(null, 0, 2);
        } else if (iM95030O >= objArrM95031P.length) {
            objArrM95031P = m95031P(objArrM95031P, iM95030O, objArrM95031P.length * 2);
        }
        l3f0.m152701e(objArrM95031P, m95025J() + ((long) iM95030O), item);
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
    public final Continuation<Unit>[] m95023H(Continuation<Unit>[] resumesIn) {
        AbstractC21534y7[] abstractC21534y7Arr;
        m3f0 m3f0Var;
        Continuation<? super Unit> continuation;
        int length = resumesIn.length;
        if (this.nCollectors != 0 && (abstractC21534y7Arr = this.slots) != null) {
            int length2 = abstractC21534y7Arr.length;
            int i = 0;
            while (i < length2) {
                AbstractC21534y7 abstractC21534y7 = abstractC21534y7Arr[i];
                if (abstractC21534y7 == null || (continuation = (m3f0Var = (m3f0) abstractC21534y7).cont) == null || m95034S(m3f0Var) < 0) {
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
                    m3f0Var.cont = null;
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
    public final long m95024I() {
        return m95025J() + ((long) this.bufferSize);
    }

    /* JADX INFO: renamed from: J */
    public final long m95025J() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    /* JADX INFO: renamed from: K */
    public final T m95026K() {
        Object[] objArr = this.buffer;
        objArr.getClass();
        return (T) l3f0.m152700d(objArr, (this.replayIndex + ((long) m95029N())) - 1);
    }

    /* JADX INFO: renamed from: L */
    public final Object m95027L(long index) {
        Object[] objArr = this.buffer;
        objArr.getClass();
        Object objM152700d = l3f0.m152700d(objArr, index);
        return objM152700d instanceof C15570a ? ((C15570a) objM152700d).value : objM152700d;
    }

    /* JADX INFO: renamed from: M */
    public final long m95028M() {
        return m95025J() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    /* JADX INFO: renamed from: N */
    public final int m95029N() {
        return (int) ((m95025J() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: renamed from: O */
    public final int m95030O() {
        return this.bufferSize + this.queueSize;
    }

    /* JADX INFO: renamed from: P */
    public final Object[] m95031P(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            wtq0.m207906a("Buffer size overflow");
            return null;
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer != null) {
            long jM95025J = m95025J();
            for (int i = 0; i < curSize; i++) {
                long j = ((long) i) + jM95025J;
                l3f0.m152701e(objArr, j, l3f0.m152700d(curBuffer, j));
            }
        }
        return objArr;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m95032Q(T value) {
        if (getNCollectors() == 0) {
            return m95033R(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = C15571b.f67541a[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        m95022G(value);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.bufferCapacity) {
            m95020D();
        }
        if (m95029N() > this.replay) {
            m95036U(this.replayIndex + 1, this.minCollectorIndex, m95024I(), m95028M());
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m95033R(T value) {
        if (this.replay == 0) {
            return true;
        }
        m95022G(value);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            m95020D();
        }
        this.minCollectorIndex = m95025J() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: renamed from: S */
    public final long m95034S(m3f0 slot) {
        long j = slot.index;
        if (j >= m95024I() && (this.bufferCapacity > 0 || j > m95025J() || this.queueSize == 0)) {
            return -1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: T */
    public final Object m95035T(m3f0 slot) {
        Object obj;
        Continuation<Unit>[] continuationArrM95037V = C21262x7.f192655a;
        synchronized (this) {
            try {
                long jM95034S = m95034S(slot);
                if (jM95034S < 0) {
                    obj = l3f0.f129874a;
                } else {
                    long j = slot.index;
                    Object objM95027L = m95027L(jM95034S);
                    slot.index = jM95034S + 1;
                    continuationArrM95037V = m95037V(j);
                    obj = objM95027L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<Unit> continuation : continuationArrM95037V) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: U */
    public final void m95036U(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long jM95025J = m95025J(); jM95025J < jMin; jM95025J++) {
            Object[] objArr = this.buffer;
            objArr.getClass();
            l3f0.m152701e(objArr, jM95025J, null);
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
    public final Continuation<Unit>[] m95037V(long oldIndex) {
        long j;
        long j2;
        long j3;
        long j4;
        Continuation<Unit>[] continuationArr;
        long jMax;
        Object[] objArr;
        AbstractC21534y7[] abstractC21534y7Arr;
        if (oldIndex > this.minCollectorIndex) {
            return C21262x7.f192655a;
        }
        long jM95025J = m95025J();
        long j5 = ((long) this.bufferSize) + jM95025J;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j5++;
        }
        int i = 0;
        if (this.nCollectors != 0 && (abstractC21534y7Arr = this.slots) != null) {
            for (AbstractC21534y7 abstractC21534y7 : abstractC21534y7Arr) {
                if (abstractC21534y7 != null) {
                    long j6 = ((m3f0) abstractC21534y7).index;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.minCollectorIndex) {
            return C21262x7.f192655a;
        }
        long jM95024I = m95024I();
        int nCollectors = getNCollectors();
        int iMin = this.queueSize;
        if (nCollectors > 0) {
            iMin = Math.min(iMin, this.bufferCapacity - ((int) (jM95024I - j5)));
        }
        Continuation<Unit>[] continuationArr2 = C21262x7.f192655a;
        long j7 = ((long) this.queueSize) + jM95024I;
        if (iMin > 0) {
            continuationArr2 = new Continuation[iMin];
            Object[] objArr2 = this.buffer;
            objArr2.getClass();
            j3 = 1;
            long j8 = jM95024I;
            while (true) {
                if (jM95024I >= j7) {
                    j = jM95025J;
                    j2 = j5;
                    continuationArr = continuationArr2;
                    j4 = j8;
                    break;
                }
                Object objM152700d = l3f0.m152700d(objArr2, jM95024I);
                j = jM95025J;
                goh0 goh0Var = l3f0.f129874a;
                if (objM152700d != goh0Var) {
                    objM152700d.getClass();
                    C15570a c15570a = (C15570a) objM152700d;
                    int i2 = i + 1;
                    j2 = j5;
                    continuationArr2[i] = c15570a.cont;
                    l3f0.m152701e(objArr2, jM95024I, goh0Var);
                    l3f0.m152701e(objArr2, j8, c15570a.value);
                    j4 = j8 + 1;
                    if (i2 < iMin) {
                        i = i2;
                        j8 = j4;
                    }
                } else {
                    j2 = j5;
                }
                jM95024I++;
                jM95025J = j;
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
                if (Intrinsics.m88377d(l3f0.m152700d(objArr, jMax), l3f0.f129874a)) {
                    j4 += j3;
                    jMax += j3;
                }
            }
            m95036U(jMax, j2, j4, j7);
            m95046y();
            if (continuationArr.length == 0) {
                return continuationArr;
            }
            return m95023H(continuationArr);
        }
        j = jM95025J;
        j2 = j5;
        j3 = 1;
        j4 = jM95024I;
        continuationArr = continuationArr2;
        int i4 = (int) (j4 - j);
        if (getNCollectors() == 0) {
            j2 = j4;
        }
        jMax = Math.max(this.replayIndex, j4 - ((long) Math.min(this.replay, i4)));
        if (this.bufferCapacity == 0) {
            objArr = this.buffer;
            objArr.getClass();
            if (Intrinsics.m88377d(l3f0.m152700d(objArr, jMax), l3f0.f129874a)) {
                j4 += j3;
                jMax += j3;
            }
        }
        m95036U(jMax, j2, j4, j7);
        m95046y();
        if (continuationArr.length == 0) {
            return continuationArr;
        }
        return m95023H(continuationArr);
    }

    /* JADX INFO: renamed from: W */
    public final long m95038W() {
        long j = this.replayIndex;
        if (j < this.minCollectorIndex) {
            this.minCollectorIndex = j;
        }
        return j;
    }

    @Override // p153l.ldj
    @NotNull
    /* JADX INFO: renamed from: a */
    public aui<T> mo95039a(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return l3f0.m152699c(this, context, capacity, onBufferOverflow);
    }

    @Override // p153l.t120
    /* JADX INFO: renamed from: b */
    public void mo95040b() throws Throwable {
        SharedFlowImpl<T> sharedFlowImpl;
        synchronized (this) {
            try {
                sharedFlowImpl = this;
                try {
                    sharedFlowImpl.m95036U(m95024I(), this.minCollectorIndex, m95024I(), m95028M());
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

    @Override // p153l.t120
    /* JADX INFO: renamed from: c */
    public boolean mo95041c(T value) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArrM95023H = C21262x7.f192655a;
        synchronized (this) {
            if (m95032Q(value)) {
                continuationArrM95023H = m95023H(continuationArrM95023H);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArrM95023H) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    @Override // p153l.k3f0, p153l.aui
    @Nullable
    public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<?> continuation) {
        return m95016z(this, buiVar, continuation);
    }

    @Override // p153l.bui
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        return m95005E(this, t, continuation);
    }

    /* JADX INFO: renamed from: w */
    public final Object m95044w(m3f0 m3f0Var, Continuation<? super Unit> continuation) {
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        synchronized (this) {
            try {
                if (m95034S(m3f0Var) < 0) {
                    m3f0Var.cont = c15514c;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    c15514c.resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public final void m95045x(C15570a emitter) {
        synchronized (this) {
            if (emitter.index < m95025J()) {
                return;
            }
            Object[] objArr = this.buffer;
            objArr.getClass();
            if (l3f0.m152700d(objArr, emitter.index) != emitter) {
                return;
            }
            l3f0.m152701e(objArr, emitter.index, l3f0.f129874a);
            m95046y();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m95046y() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            objArr.getClass();
            while (this.queueSize > 0 && l3f0.m152700d(objArr, (m95025J() + ((long) m95030O())) - 1) == l3f0.f129874a) {
                this.queueSize--;
                l3f0.m152701e(objArr, m95025J() + ((long) m95030O()), null);
            }
        }
    }
}
