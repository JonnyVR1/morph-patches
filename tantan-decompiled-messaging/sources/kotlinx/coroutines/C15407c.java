package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C21643z7;
import p149l.b2s;
import p149l.bf4;
import p149l.cf4;
import p149l.d35;
import p149l.df4;
import p149l.j40;
import p149l.j6f;
import p149l.kf4;
import p149l.l4e;
import p149l.mce0;
import p149l.mpb;
import p149l.nl40;
import p149l.o8c;
import p149l.ofp0;
import p149l.on5;
import p149l.pn5;
import p149l.qkq0;
import p149l.qq3;
import p149l.sn5;
import p149l.to40;
import p149l.uwp;
import p149l.x3e;
import p149l.yfh0;
import p149l.z3e;

/* JADX INFO: renamed from: kotlinx.coroutines.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u0001\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0001\u0010\u000fJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&JZ\u0010.\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\t2#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b.\u0010/JH\u00100\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\t2%\b\u0002\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010)H\u0002¢\u0006\u0004\b0\u00101JJ\u00103\u001a\u0004\u0018\u0001022\b\u0010(\u001a\u0004\u0018\u00010\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u001d2#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010)H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u0002052\b\u0010(\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0016H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0016H\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\rH\u0001¢\u0006\u0004\b;\u0010\u000fJ\u0017\u0010>\u001a\n\u0018\u00010<j\u0004\u0018\u0001`=H\u0016¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\b@\u0010AJ!\u0010C\u001a\u00020\u00162\b\u0010B\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bE\u0010\u0013J\u0017\u0010F\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020H2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bI\u0010JJ8\u0010K\u001a\u00020\u00162!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00160)2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00102\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0011\u0010Q\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\bQ\u0010AJ\u000f\u0010R\u001a\u00020\u0016H\u0000¢\u0006\u0004\bR\u00109J\u001d\u0010U\u001a\u00020\u00162\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000SH\u0016¢\u0006\u0004\bU\u0010 J<\u0010W\u001a\u00020\u00162\u0006\u0010V\u001a\u00028\u00002#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010)H\u0016¢\u0006\u0004\bW\u0010XJ#\u0010Z\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010Y\u001a\u00020\tH\u0016¢\u0006\u0004\bZ\u0010[J8\u0010]\u001a\u00020\u00162'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00160)j\u0002`\\H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020HH\u0000¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0016H\u0000¢\u0006\u0004\ba\u00109JH\u0010b\u001a\u0004\u0018\u00010\u001d2\u0006\u0010V\u001a\u00028\u00002\b\u0010-\u001a\u0004\u0018\u00010\u001d2#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010)H\u0016¢\u0006\u0004\bb\u0010cJ\u0019\u0010e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010d\u001a\u00020\u0010H\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020\u00162\u0006\u0010g\u001a\u00020\u001dH\u0016¢\u0006\u0004\bh\u0010 J\u001b\u0010j\u001a\u00020\u0016*\u00020i2\u0006\u0010V\u001a\u00028\u0000H\u0016¢\u0006\u0004\bj\u0010kJ\u001b\u0010l\u001a\u00020\u0016*\u00020i2\u0006\u0010d\u001a\u00020\u0010H\u0016¢\u0006\u0004\bl\u0010mJ\u001f\u0010n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u0004\u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\bp\u0010qJ\u000f\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020rH\u0014¢\u0006\u0004\bu\u0010tR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010}\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010z\u001a\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u001cR\u0016\u0010\u0081\u0001\u001a\u00020r8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010tR\u0017\u0010!\u001a\u0004\u0018\u00010\u001d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010AR\u0016\u0010\u0084\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u000fR\u001f\u0010\u0087\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\r\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004R\u0015\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u008a\u00018\u0002X\u0082\u0004R\u0015\u0010\u008c\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u008a\u00018\u0002X\u0082\u0004¨\u0006\u008d\u0001"}, m87232d2 = {"Lkotlinx/coroutines/c;", j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/j;", "Ll/bf4;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ll/ofp0;", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "K", "()Z", "", "cause", "p", "(Ljava/lang/Throwable;)Z", "Ll/mce0;", "segment", "", "o", "(Ll/mce0;Ljava/lang/Throwable;)V", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ll/l4e;", "H", "()Ll/l4e;", "", "handler", "I", "(Ljava/lang/Object;)V", "state", "L", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", BLiveStormDanmakuGiftResourceType.f44446s, "(I)V", "Ll/to40;", "proposedUpdate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "onCancellation", "idempotent", j6f.LATITUDE_SOUTH, "(Ll/to40;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "Q", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Ll/yfh0;", "U", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll/yfh0;", "", "k", "(Ljava/lang/Object;)Ljava/lang/Void;", "r", "()V", "G", "P", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "j", "()Ljava/lang/Object;", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", RXScreenCaptureService.KEY_INDEX, "N", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/b;", BLiveStormDanmakuGiftResourceType.f44444l, "(Lkotlinx/coroutines/b;Ljava/lang/Throwable;)V", "n", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/o;", "parent", Constants.KEY_T, "(Lkotlinx/coroutines/o;)Ljava/lang/Throwable;", ResourceDirection.f38808v, BloodType.f38728O, "Lkotlin/Result;", LovePlanetStage.result, "resumeWith", "value", "f", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", FirebaseAnalytics.Param.INDEX, "g", "(Ll/mce0;I)V", "Lkotlinx/coroutines/CompletionHandler;", BaseSei.f13930X, "(Lkotlin/jvm/functions/Function1;)V", "J", "(Lkotlinx/coroutines/b;)V", "q", "A", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", BaseSei.f13931Y, "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "w", "Lkotlinx/coroutines/CoroutineDispatcher;", "B", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "a", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "M", "Lkotlin/coroutines/Continuation;", "c", "()Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "u", "parentHandle", b2s.C_ZONE, "stateDebugRepresentation", BaseSei.f13932Z, "m", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
@SourceDebugExtension
public class C15407c<T> extends AbstractC15481j<T> implements bf4<T>, CoroutineStackFrame, ofp0 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66699f = AtomicIntegerFieldUpdater.newUpdater(C15407c.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66700g = AtomicReferenceFieldUpdater.newUpdater(C15407c.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66701h = AtomicReferenceFieldUpdater.newUpdater(C15407c.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Continuation<T> delegate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX WARN: Multi-variable type inference failed */
    public C15407c(@NotNull Continuation<? super T> continuation, int i) {
        super(i);
        this.delegate = continuation;
        this.context = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = j40.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m93741R(C15407c c15407c, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if (obj2 != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: resumeImpl");
            return;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        c15407c.m93754Q(obj, i, function1);
    }

    @Override // p149l.bf4
    @Nullable
    /* JADX INFO: renamed from: A */
    public Object mo93742A(T value, @Nullable Object idempotent, @Nullable Function1<? super Throwable, Unit> onCancellation) {
        return m93757U(value, idempotent, onCancellation);
    }

    @Override // p149l.bf4
    /* JADX INFO: renamed from: B */
    public void mo93743B(@NotNull CoroutineDispatcher coroutineDispatcher, T t) {
        Continuation<T> continuation = this.delegate;
        x3e x3eVar = continuation instanceof x3e ? (x3e) continuation : null;
        m93741R(this, t, (x3eVar != null ? x3eVar.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    /* JADX INFO: renamed from: C */
    public final String m93744C() {
        Object objM93782z = m93782z();
        if (objM93782z instanceof to40) {
            return "Active";
        }
        return objM93782z instanceof kf4 ? "Cancelled" : "Completed";
    }

    /* JADX INFO: renamed from: G */
    public void m93745G() {
        l4e l4eVarM93746H = m93746H();
        if (l4eVarM93746H != null && mo93770m()) {
            l4eVarM93746H.dispose();
            f66701h.set(this, nl40.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: H */
    public final l4e m93746H() {
        InterfaceC15486o interfaceC15486o = (InterfaceC15486o) getContext().get(InterfaceC15486o.INSTANCE);
        if (interfaceC15486o == null) {
            return null;
        }
        l4e l4eVarM93627m = JobKt__JobKt.m93627m(interfaceC15486o, true, false, new d35(this), 2, null);
        C21643z7.m217426a(f66701h, this, null, l4eVarM93627m);
        return l4eVarM93627m;
    }

    /* JADX INFO: renamed from: I */
    public final void m93747I(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66700g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof j40)) {
                if (obj instanceof InterfaceC15406b ? true : obj instanceof mce0) {
                    m93750L(handler, obj);
                } else {
                    if (obj instanceof pn5) {
                        pn5 pn5Var = (pn5) obj;
                        if (!pn5Var.m170401c()) {
                            m93750L(handler, obj);
                        }
                        if (obj instanceof kf4) {
                            Throwable th = pn5Var.cause;
                            if (handler instanceof InterfaceC15406b) {
                                m93769l((InterfaceC15406b) handler, th);
                                return;
                            } else {
                                handler.getClass();
                                m93772o((mce0) handler, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj instanceof on5) {
                        on5 on5Var = (on5) obj;
                        if (on5Var.cancelHandler != null) {
                            m93750L(handler, obj);
                        }
                        if (handler instanceof mce0) {
                            return;
                        }
                        handler.getClass();
                        InterfaceC15406b interfaceC15406b = (InterfaceC15406b) handler;
                        if (on5Var.m165158c()) {
                            m93769l(interfaceC15406b, on5Var.cancelCause);
                            return;
                        } else {
                            if (C21643z7.m217426a(f66700g, this, obj, on5.m165156b(on5Var, null, interfaceC15406b, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (handler instanceof mce0) {
                            return;
                        }
                        handler.getClass();
                        if (C21643z7.m217426a(f66700g, this, obj, new on5(obj, (InterfaceC15406b) handler, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (C21643z7.m217426a(f66700g, this, obj, handler)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m93748J(@NotNull InterfaceC15406b handler) {
        m93747I(handler);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m93749K() {
        if (!z3e.m217027c(this.resumeMode)) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        continuation.getClass();
        return ((x3e) continuation).m206904q();
    }

    /* JADX INFO: renamed from: L */
    public final void m93750L(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public String mo93708M() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: N */
    public final void m93751N(@NotNull Throwable cause) {
        if (m93773p(cause)) {
            return;
        }
        mo93766i(cause);
        m93775r();
    }

    /* JADX INFO: renamed from: O */
    public final void m93752O() {
        Throwable thM206907t;
        Continuation<T> continuation = this.delegate;
        x3e x3eVar = continuation instanceof x3e ? (x3e) continuation : null;
        if (x3eVar == null || (thM206907t = x3eVar.m206907t(this)) == null) {
            return;
        }
        m93774q();
        mo93766i(thM206907t);
    }

    @JvmName
    /* JADX INFO: renamed from: P */
    public final boolean m93753P() {
        Object obj = f66700g.get(this);
        if ((obj instanceof on5) && ((on5) obj).idempotentResume != null) {
            m93774q();
            return false;
        }
        f66699f.set(this, 536870911);
        f66700g.set(this, j40.INSTANCE);
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m93754Q(Object proposedUpdate, int resumeMode, Function1<? super Throwable, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66700g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof to40)) {
                C15407c<T> c15407c = this;
                Object obj2 = proposedUpdate;
                Function1<? super Throwable, Unit> function1 = onCancellation;
                if (obj instanceof kf4) {
                    kf4 kf4Var = (kf4) obj;
                    if (kf4Var.m145823e()) {
                        if (function1 != null) {
                            c15407c.m93771n(function1, kf4Var.cause);
                            return;
                        }
                        return;
                    }
                }
                c15407c.m93768k(obj2);
                throw new KotlinNothingValueException();
            }
            C15407c<T> c15407c2 = this;
            Object obj3 = proposedUpdate;
            int i = resumeMode;
            Function1<? super Throwable, Unit> function2 = onCancellation;
            if (C21643z7.m217426a(f66700g, c15407c2, obj, c15407c2.m93755S((to40) obj, obj3, i, function2, null))) {
                c15407c2.m93775r();
                c15407c2.m93776s(i);
                return;
            } else {
                this = c15407c2;
                proposedUpdate = obj3;
                resumeMode = i;
                onCancellation = function2;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final Object m93755S(to40 state, Object proposedUpdate, int resumeMode, Function1<? super Throwable, Unit> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof pn5) {
            return proposedUpdate;
        }
        if ((z3e.m217026b(resumeMode) || idempotent != null) && !(onCancellation == null && !(state instanceof InterfaceC15406b) && idempotent == null)) {
            return new on5(proposedUpdate, state instanceof InterfaceC15406b ? (InterfaceC15406b) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m93756T() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f66699f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                qkq0.m175383a("Already resumed");
                return false;
            }
        } while (!f66699f.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final yfh0 m93757U(Object proposedUpdate, Object idempotent, Function1<? super Throwable, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66700g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof to40)) {
                Object obj2 = idempotent;
                if ((obj instanceof on5) && obj2 != null && ((on5) obj).idempotentResume == obj2) {
                    return cf4.f80536a;
                }
                return null;
            }
            C15407c<T> c15407c = this;
            Object obj3 = proposedUpdate;
            Object obj4 = idempotent;
            Function1<? super Throwable, Unit> function1 = onCancellation;
            if (C21643z7.m217426a(f66700g, c15407c, obj, c15407c.m93755S((to40) obj, obj3, this.resumeMode, function1, obj4))) {
                c15407c.m93775r();
                return cf4.f80536a;
            }
            this = c15407c;
            proposedUpdate = obj3;
            onCancellation = function1;
            idempotent = obj4;
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m93758V() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f66699f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                qkq0.m175383a("Already suspended");
                return false;
            }
        } while (!f66699f.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    @Override // p149l.bf4
    /* JADX INFO: renamed from: a */
    public void mo93759a(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th) {
        Continuation<T> continuation = this.delegate;
        x3e x3eVar = continuation instanceof x3e ? (x3e) continuation : null;
        m93741R(this, new pn5(th, false, 2, null), (x3eVar != null ? x3eVar.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.AbstractC15481j
    /* JADX INFO: renamed from: b */
    public void mo93760b(@Nullable Object takenState, @NotNull Throwable cause) {
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66700g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof to40) {
                qkq0.m175383a("Not completed");
                return;
            }
            if (obj instanceof pn5) {
                return;
            }
            if (obj instanceof on5) {
                on5 on5Var = (on5) obj;
                if (on5Var.m165158c()) {
                    qkq0.m175383a("Must be called at most once");
                    return;
                }
                Throwable th2 = cause;
                th = th2;
                if (C21643z7.m217426a(f66700g, this, obj, on5.m165156b(on5Var, null, null, null, null, th2, 15, null))) {
                    on5Var.m165159d(this, th);
                    return;
                }
            } else {
                th = cause;
                if (C21643z7.m217426a(f66700g, this, obj, new on5(obj, null, null, null, th, 14, null))) {
                    return;
                }
            }
            cause = th;
        }
    }

    @Override // kotlinx.coroutines.AbstractC15481j
    @NotNull
    /* JADX INFO: renamed from: c */
    public final Continuation<T> mo93761c() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.AbstractC15481j
    @Nullable
    /* JADX INFO: renamed from: d */
    public Throwable mo93762d(@Nullable Object state) {
        Throwable thMo93762d = super.mo93762d(state);
        if (thMo93762d != null) {
            return thMo93762d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.AbstractC15481j
    /* JADX INFO: renamed from: e */
    public <T> T mo93763e(@Nullable Object state) {
        return state instanceof on5 ? (T) ((on5) state).com.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String : state;
    }

    @Override // p149l.bf4
    /* JADX INFO: renamed from: f */
    public void mo93764f(T value, @Nullable Function1<? super Throwable, Unit> onCancellation) {
        m93754Q(value, this.resumeMode, onCancellation);
    }

    @Override // p149l.ofp0
    /* JADX INFO: renamed from: g */
    public void mo93765g(@NotNull mce0<?> segment, int index) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f66699f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & 536870911) != 536870911) {
                qkq0.m175383a("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, ((i >> 29) << 29) + index));
        m93747I(segment);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p149l.bf4
    /* JADX INFO: renamed from: i */
    public boolean mo93766i(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66700g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof to40)) {
                return false;
            }
        } while (!C21643z7.m217426a(f66700g, this, obj, new kf4(this, cause, (obj instanceof InterfaceC15406b) || (obj instanceof mce0))));
        to40 to40Var = (to40) obj;
        if (to40Var instanceof InterfaceC15406b) {
            m93769l((InterfaceC15406b) obj, cause);
        } else if (to40Var instanceof mce0) {
            m93772o((mce0) obj, cause);
        }
        m93775r();
        m93776s(this.resumeMode);
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC15481j
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo93767j() {
        return m93782z();
    }

    /* JADX INFO: renamed from: k */
    public final Void m93768k(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    /* JADX INFO: renamed from: l */
    public final void m93769l(@NotNull InterfaceC15406b handler, @Nullable Throwable cause) {
        try {
            handler.mo93737a(cause);
        } catch (Throwable th) {
            mpb.m155795a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    @Override // p149l.bf4
    /* JADX INFO: renamed from: m */
    public boolean mo93770m() {
        return !(m93782z() instanceof to40);
    }

    /* JADX INFO: renamed from: n */
    public final void m93771n(@NotNull Function1<? super Throwable, Unit> onCancellation, @NotNull Throwable cause) {
        try {
            onCancellation.invoke(cause);
        } catch (Throwable th) {
            mpb.m155795a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m93772o(mce0<?> segment, Throwable cause) {
        int i = f66699f.get(this) & 536870911;
        if (i == 536870911) {
            qkq0.m175383a("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            segment.mo145770s(i, cause, getContext());
        } catch (Throwable th) {
            mpb.m155795a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m93773p(Throwable cause) {
        if (!m93749K()) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        continuation.getClass();
        return ((x3e) continuation).m206905r(cause);
    }

    /* JADX INFO: renamed from: q */
    public final void m93774q() {
        l4e l4eVarM93777u = m93777u();
        if (l4eVarM93777u == null) {
            return;
        }
        l4eVarM93777u.dispose();
        f66701h.set(this, nl40.INSTANCE);
    }

    /* JADX INFO: renamed from: r */
    public final void m93775r() {
        if (m93749K()) {
            return;
        }
        m93774q();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
        m93741R(this, sn5.m185033c(result, this), this.resumeMode, null, 4, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m93776s(int mode) {
        if (m93756T()) {
            return;
        }
        z3e.m217025a(this, mode);
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public Throwable mo93709t(@NotNull InterfaceC15486o parent) {
        return parent.mo93653M();
    }

    @NotNull
    public String toString() {
        return mo93708M() + '(' + o8c.m163113c(this.delegate) + "){" + m93744C() + "}@" + o8c.m163112b(this);
    }

    /* JADX INFO: renamed from: u */
    public final l4e m93777u() {
        return (l4e) f66701h.get(this);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: v */
    public final Object m93778v() {
        InterfaceC15486o interfaceC15486o;
        boolean zM93749K = m93749K();
        if (m93758V()) {
            if (m93777u() == null) {
                m93746H();
            }
            if (zM93749K) {
                m93752O();
            }
            return uwp.m196133e();
        }
        if (zM93749K) {
            m93752O();
        }
        Object objM93782z = m93782z();
        if (objM93782z instanceof pn5) {
            throw ((pn5) objM93782z).cause;
        }
        if (!z3e.m217026b(this.resumeMode) || (interfaceC15486o = (InterfaceC15486o) getContext().get(InterfaceC15486o.INSTANCE)) == null || interfaceC15486o.mo93690k()) {
            return mo93763e(objM93782z);
        }
        CancellationException cancellationExceptionMo93653M = interfaceC15486o.mo93653M();
        mo93760b(objM93782z, cancellationExceptionMo93653M);
        throw cancellationExceptionMo93653M;
    }

    @Override // p149l.bf4
    /* JADX INFO: renamed from: w */
    public void mo93779w(@NotNull Object token) {
        m93776s(this.resumeMode);
    }

    @Override // p149l.bf4
    /* JADX INFO: renamed from: x */
    public void mo93780x(@NotNull Function1<? super Throwable, Unit> handler) {
        df4.m111431c(this, new InterfaceC15406b.a(handler));
    }

    @Override // p149l.bf4
    @Nullable
    /* JADX INFO: renamed from: y */
    public Object mo93781y(@NotNull Throwable exception) {
        return m93757U(new pn5(exception, false, 2, null), null, null);
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final Object m93782z() {
        return f66700g.get(this);
    }
}
