package com.immomo.molive.apm;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.immomo.molive.apm.fps.FpsTracer;
import com.immomo.molive.apm.temp.TempSummary;
import com.immomo.molive.apm.temp.TempTracer;
import com.immomo.molive.debuger.performance.tracer.memory.MemTracer;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p149l.asb;
import p149l.b2s;
import p149l.cj60;
import p149l.l1j;
import p149l.nrb;
import p149l.r7y;
import p149l.rt0;
import p149l.tt0;
import p149l.vh2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 m2\u00020\u0001:\u0001*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u000eJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b)\u0010\u001fR\u001a\u0010,\u001a\u00020 8\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\"R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00103\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u0015R\u001b\u0010>\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010C\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010.\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0018R\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u0010GR\"\u0010L\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010.\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010\u0018R\u001b\u0010P\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\bN\u0010OR\"\u0010S\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010.\u001a\u0004\bQ\u0010A\"\u0004\bR\u0010\u0018R\u001b\u0010W\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\bU\u0010VR\"\u0010Z\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010.\u001a\u0004\bX\u0010A\"\u0004\bY\u0010\u0018R\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010;\u001a\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010aR\u001b\u0010i\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010;\u001a\u0004\b\\\u0010hR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010j\u001a\u0004\bk\u0010l¨\u0006n"}, m87232d2 = {"Lcom/immomo/molive/apm/ApmPlugin;", "", "Ll/cj60;", "perfSource", "<init>", "(Ll/cj60;)V", "Ll/tt0;", "apmPluginConfig", "", "N", "(Ll/tt0;)V", "Landroid/content/Context;", "context", "G", "(Ll/tt0;Landroid/content/Context;)V", "H", "()V", "F", "M", "", "isOpen", "J", "(ZLandroid/content/Context;)V", "I", "(Z)V", "K", "L", BloodType.f38728O, "P", "", "k", "()F", "", BLiveStormDanmakuGiftResourceType.f44444l, "()I", "q", "r", Constants.KEY_T, BaseSei.f13931Y, BaseSei.f13932Z, b2s.C_ZONE, "E", "a", "B", "RUN_TRACKER_MSG", "b", "Z", "isHandlerThreadStart", "c", "isSendTracerSampleMsg", Constants.INAPP_DATA_TAG, "isApmStarted", "e", "Ll/tt0;", "debugApmPluginConfig", "", "f", "delayTracer", "g", "Lkotlin/Lazy;", "p", "()Ll/tt0;", "innerApmPluginConfig", "h", ResourceDirection.f38808v, "()Z", "setOpenFpsTracer", "openFpsTracer", "Lcom/immomo/molive/apm/fps/FpsTracer;", RXScreenCaptureService.KEY_INDEX, "n", "()Lcom/immomo/molive/apm/fps/FpsTracer;", "fpsTracer", "j", "u", "setOpenCpuTracer", "openCpuTracer", "Ll/asb;", "m", "()Ll/asb;", "cpuTracer", "w", "setOpenMemTracer", "openMemTracer", "Lcom/immomo/molive/debuger/performance/tracer/memory/MemTracer;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lcom/immomo/molive/debuger/performance/tracer/memory/MemTracer;", "memTracer", BaseSei.f13930X, "setOpenTempTracer", "openTempTracer", "Lcom/immomo/molive/apm/temp/TempTracer;", "o", "D", "()Lcom/immomo/molive/apm/temp/TempTracer;", "tempTracer", "Landroid/os/Handler;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "tracerHandlerThread", "tracerHandler", "Landroid/os/Handler$Callback;", "()Landroid/os/Handler$Callback;", "handlerCallback", "Ll/cj60;", "A", "()Ll/cj60;", "Companion", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class ApmPlugin {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u */
    private static final Lazy f13009u = LazyKt__LazyJVMKt.m87229b(new Function0<ApmPlugin>() { // from class: com.immomo.molive.apm.ApmPlugin$Companion$INSTANCE$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ApmPlugin invoke() {
            return new ApmPlugin(null, 1, 0 == true ? 1 : 0);
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int RUN_TRACKER_MSG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private volatile boolean isHandlerThreadStart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private volatile boolean isSendTracerSampleMsg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private volatile boolean isApmStarted;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private tt0 debugApmPluginConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long delayTracer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy innerApmPluginConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean openFpsTracer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy fpsTracer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean openCpuTracer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Lazy cpuTracer;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean openMemTracer;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy memTracer;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean openTempTracer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Lazy tempTracer;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Handler mainHandler;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private HandlerThread tracerHandlerThread;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Handler tracerHandler;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Lazy handlerCallback;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final cj60 perfSource;

    /* JADX INFO: renamed from: com.immomo.molive.apm.ApmPlugin$b */
    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "run"}, m87233k = 3, m87234mv = {1, 1, 16})
    public static final class RunnableC3808b implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ tt0 f13031b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Context f13032c;

        public RunnableC3808b(tt0 tt0Var, Context context) {
            this.f13031b = tt0Var;
            this.f13032c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ApmPlugin.this.m18454G(this.f13031b, this.f13032c);
        }
    }

    /* JADX INFO: renamed from: com.immomo.molive.apm.ApmPlugin$c */
    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "run"}, m87233k = 3, m87234mv = {1, 1, 16})
    public static final class RunnableC3809c implements Runnable {
        public RunnableC3809c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ApmPlugin.this.m18455H();
        }
    }

    public ApmPlugin(@NotNull cj60 cj60Var) {
        cj60Var.getClass();
        this.perfSource = cj60Var;
        this.RUN_TRACKER_MSG = 1;
        this.innerApmPluginConfig = LazyKt__LazyJVMKt.m87229b(new Function0<tt0>() { // from class: com.immomo.molive.apm.ApmPlugin$innerApmPluginConfig$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final tt0 invoke() {
                return new tt0(false, 3000L, false, false, false, false, 60, null);
            }
        });
        this.fpsTracer = LazyKt__LazyJVMKt.m87229b(new Function0<FpsTracer>() { // from class: com.immomo.molive.apm.ApmPlugin$fpsTracer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FpsTracer invoke() {
                return new FpsTracer(new vh2(this.this$0.m18475p().getSampleInterval(), null, 2, null));
            }
        });
        this.cpuTracer = LazyKt__LazyJVMKt.m87229b(new Function0<asb>() { // from class: com.immomo.molive.apm.ApmPlugin$cpuTracer$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final asb invoke() {
                return new asb(new vh2(this.this$0.m18475p().getSampleInterval(), null, 2, null));
            }
        });
        this.memTracer = LazyKt__LazyJVMKt.m87229b(new Function0<MemTracer>() { // from class: com.immomo.molive.apm.ApmPlugin$memTracer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MemTracer invoke() {
                return new MemTracer(new vh2(this.this$0.m18475p().getSampleInterval(), null, 2, null));
            }
        });
        this.tempTracer = LazyKt__LazyJVMKt.m87229b(new Function0<TempTracer>() { // from class: com.immomo.molive.apm.ApmPlugin$tempTracer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TempTracer invoke() {
                return new TempTracer(new vh2(this.this$0.m18475p().getSampleInterval(), null, 2, null));
            }
        });
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.handlerCallback = LazyKt__LazyJVMKt.m87229b(new Function0<Handler.Callback>() { // from class: com.immomo.molive.apm.ApmPlugin$handlerCallback$2

            /* JADX INFO: renamed from: com.immomo.molive.apm.ApmPlugin$handlerCallback$2$a */
            @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m87232d2 = {"<anonymous>", "", Careers.f38732it, "Landroid/os/Message;", "handleMessage"}, m87233k = 3, m87234mv = {1, 1, 16})
            public static final class C3810a implements Handler.Callback {
                public C3810a() {
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(@NotNull Message message) {
                    Handler handler;
                    message.getClass();
                    if (message.what != ApmPlugin$handlerCallback$2.this.this$0.getRUN_TRACKER_MSG()) {
                        return true;
                    }
                    ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                    if (ApmPlugin$handlerCallback$2.this.this$0.getOpenFpsTracer() && ApmPlugin$handlerCallback$2.this.this$0.m18473n().getFpsTracerEnable()) {
                        ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                        ApmPlugin$handlerCallback$2.this.this$0.m18473n().m156012d();
                        l1j l1jVarM156010a = ApmPlugin$handlerCallback$2.this.this$0.m18473n().m156010a();
                        if (l1jVarM156010a != null) {
                            ApmPlugin$handlerCallback$2.this.this$0.getPerfSource().m107122m(l1jVarM156010a.getPageFps(), l1jVarM156010a.getAvgFps(), l1jVarM156010a.getWindowFps());
                            ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                        }
                    } else {
                        ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                    }
                    if (ApmPlugin$handlerCallback$2.this.this$0.getOpenCpuTracer() && ApmPlugin$handlerCallback$2.this.this$0.m18472m().getCpuTracerEnable()) {
                        ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                        ApmPlugin$handlerCallback$2.this.this$0.m18472m().m156012d();
                        nrb nrbVarM156010a = ApmPlugin$handlerCallback$2.this.this$0.m18472m().m156010a();
                        if (nrbVarM156010a != null) {
                            ApmPlugin$handlerCallback$2.this.this$0.getPerfSource().m107121l(nrbVarM156010a.getAppUsage(), nrbVarM156010a.getTotalUsage());
                            ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                        }
                    } else {
                        ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                    }
                    if (ApmPlugin$handlerCallback$2.this.this$0.getOpenMemTracer() && ApmPlugin$handlerCallback$2.this.this$0.m18476s().getMemTracerEnable()) {
                        ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                        ApmPlugin$handlerCallback$2.this.this$0.m18476s().m156012d();
                        r7y r7yVarM156010a = ApmPlugin$handlerCallback$2.this.this$0.m18476s().m156010a();
                        if (r7yVarM156010a != null) {
                            ApmPlugin$handlerCallback$2.this.this$0.getPerfSource().m107127r(r7yVarM156010a.getAppMem(), r7yVarM156010a.getTotalMem(), r7yVarM156010a.getFreeMem());
                            ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                        }
                    } else {
                        ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                    }
                    if (ApmPlugin$handlerCallback$2.this.this$0.getOpenTempTracer() && ApmPlugin$handlerCallback$2.this.this$0.m18452D().m18584i()) {
                        ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                        ApmPlugin$handlerCallback$2.this.this$0.m18452D().m156012d();
                        TempSummary tempSummaryM156010a = ApmPlugin$handlerCallback$2.this.this$0.m18452D().m156010a();
                        if (tempSummaryM156010a != null) {
                            ApmPlugin$handlerCallback$2.this.this$0.getPerfSource().m107128s(tempSummaryM156010a.getCupTemp().getTempValue(), tempSummaryM156010a.getSkinTemp().getTempValue(), tempSummaryM156010a.getBatteryTemp().getTempValue());
                            ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                        }
                    } else {
                        ApmPlugin.m18462a(ApmPlugin$handlerCallback$2.this.this$0);
                    }
                    Handler handler2 = ApmPlugin$handlerCallback$2.this.this$0.tracerHandler;
                    if (handler2 != null) {
                        handler2.removeMessages(ApmPlugin$handlerCallback$2.this.this$0.getRUN_TRACKER_MSG());
                    }
                    if (!ApmPlugin$handlerCallback$2.this.this$0.m18475p().getEnable() || (handler = ApmPlugin$handlerCallback$2.this.this$0.tracerHandler) == null) {
                        return true;
                    }
                    handler.sendEmptyMessageDelayed(ApmPlugin$handlerCallback$2.this.this$0.getRUN_TRACKER_MSG(), ApmPlugin$handlerCallback$2.this.this$0.m18475p().getSampleInterval());
                    return true;
                }
            }

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Handler.Callback invoke() {
                return new C3810a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final TempTracer m18452D() {
        return (TempTracer) this.tempTracer.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final void m18453F() {
        if (this.isHandlerThreadStart) {
            return;
        }
        try {
            if (this.tracerHandlerThread == null) {
                HandlerThread handlerThread = new HandlerThread("live-PerfTracer");
                this.tracerHandlerThread = handlerThread;
                handlerThread.start();
            }
            if (this.tracerHandler == null) {
                HandlerThread handlerThread2 = this.tracerHandlerThread;
                if (handlerThread2 == null) {
                    Intrinsics.m87497m();
                }
                this.tracerHandler = new Handler(handlerThread2.getLooper(), m18474o());
            }
            this.isHandlerThreadStart = true;
        } catch (Exception unused) {
            this.isHandlerThreadStart = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final void m18454G(tt0 apmPluginConfig, Context context) {
        try {
            if (this.isApmStarted) {
                return;
            }
            if (!this.isApmStarted && apmPluginConfig.getEnable()) {
                this.isApmStarted = true;
            }
            tt0 tt0Var = this.debugApmPluginConfig;
            if (tt0Var != null) {
                if (tt0Var == null) {
                    Intrinsics.m87497m();
                }
                m18461N(tt0Var);
            } else {
                m18461N(apmPluginConfig);
            }
            if (m18475p().getEnable()) {
                System.currentTimeMillis();
                if (m18475p().getFpsEnable() || m18475p().getCpuEnable() || m18475p().getMemEnable() || m18475p().getTempEnable()) {
                    m18453F();
                }
                m18456I(m18475p().getCpuEnable());
                m18457J(m18475p().getFpsEnable(), context);
                m18458K(m18475p().getMemEnable(), context);
                m18459L(m18475p().getTempEnable());
                m18460M();
            }
        } catch (Exception unused) {
            this.isApmStarted = false;
            this.isHandlerThreadStart = false;
            Handler handler = this.tracerHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.tracerHandlerThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.tracerHandlerThread = null;
            this.tracerHandler = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final void m18455H() {
        try {
            if (this.isApmStarted) {
                this.isApmStarted = false;
                m18475p().m190583h(false);
                m18475p().m190584i(false);
                m18475p().m190582g(false);
                m18475p().m190585j(false);
                m18475p().m190587l(false);
                System.currentTimeMillis();
                Handler handler = this.tracerHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                HandlerThread handlerThread = this.tracerHandlerThread;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.tracerHandler = null;
                this.tracerHandlerThread = null;
                this.isSendTracerSampleMsg = false;
                this.isHandlerThreadStart = false;
                this.perfSource.m107120k();
                m18456I(false);
                m18458K(false, null);
                m18459L(false);
                m18457J(false, null);
            }
        } catch (Exception unused) {
            this.isApmStarted = false;
            this.isHandlerThreadStart = false;
            Handler handler2 = this.tracerHandler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            this.mainHandler.removeCallbacksAndMessages(null);
            HandlerThread handlerThread2 = this.tracerHandlerThread;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            this.tracerHandlerThread = null;
            this.tracerHandler = null;
        }
    }

    /* JADX INFO: renamed from: I */
    private final void m18456I(boolean isOpen) {
        if (this.openCpuTracer && isOpen) {
            return;
        }
        this.openCpuTracer = isOpen;
        cj60 cj60Var = this.perfSource;
        if (isOpen) {
            cj60Var.m107123n(true);
        } else {
            cj60Var.m107123n(false);
            m18472m().mo18569g();
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m18457J(boolean isOpen, Context context) {
        if (this.openFpsTracer && isOpen) {
            return;
        }
        this.openFpsTracer = isOpen;
        cj60 cj60Var = this.perfSource;
        if (isOpen) {
            cj60Var.m107124o(true);
            m18473n().m18572p(context);
        } else {
            cj60Var.m107124o(false);
            m18473n().mo18569g();
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m18458K(boolean isOpen, Context context) {
        if (this.openMemTracer && isOpen) {
            return;
        }
        this.openMemTracer = isOpen;
        boolean z = this.openCpuTracer;
        cj60 cj60Var = this.perfSource;
        if (z) {
            cj60Var.m107125p(true);
            m18476s().m18598l(context);
        } else {
            cj60Var.m107125p(false);
            m18476s().mo18569g();
        }
    }

    /* JADX INFO: renamed from: L */
    private final void m18459L(boolean isOpen) {
        if (this.openTempTracer && isOpen) {
            return;
        }
        this.openTempTracer = isOpen;
        cj60 cj60Var = this.perfSource;
        if (isOpen) {
            cj60Var.m107126q(true);
        } else {
            cj60Var.m107126q(false);
            m18452D().mo18569g();
        }
    }

    /* JADX INFO: renamed from: M */
    private final void m18460M() {
        if (this.isSendTracerSampleMsg) {
            return;
        }
        this.isSendTracerSampleMsg = true;
        Handler handler = this.tracerHandler;
        if (handler != null) {
            handler.removeMessages(this.RUN_TRACKER_MSG);
        }
        long j = this.delayTracer;
        Handler handler2 = this.tracerHandler;
        if (j > 0) {
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(this.RUN_TRACKER_MSG, j);
            }
        } else if (handler2 != null) {
            handler2.sendEmptyMessage(this.RUN_TRACKER_MSG);
        }
    }

    /* JADX INFO: renamed from: N */
    private final void m18461N(tt0 apmPluginConfig) {
        m18475p().m190583h(apmPluginConfig.getEnable());
        m18475p().m190586k(Math.max(apmPluginConfig.getSampleInterval(), 3000L));
        m18475p().m190584i(apmPluginConfig.getFpsEnable());
        m18475p().m190582g(apmPluginConfig.getCpuEnable());
        m18475p().m190585j(apmPluginConfig.getMemEnable());
        m18475p().m190587l(apmPluginConfig.getTempEnable());
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ rt0 m18462a(ApmPlugin apmPlugin) {
        apmPlugin.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final asb m18472m() {
        return (asb) this.cpuTracer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final FpsTracer m18473n() {
        return (FpsTracer) this.fpsTracer.getValue();
    }

    /* JADX INFO: renamed from: o */
    private final Handler.Callback m18474o() {
        return (Handler.Callback) this.handlerCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final tt0 m18475p() {
        return (tt0) this.innerApmPluginConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final MemTracer m18476s() {
        return (MemTracer) this.memTracer.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: A, reason: from getter */
    public final cj60 getPerfSource() {
        return this.perfSource;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getRUN_TRACKER_MSG() {
        return this.RUN_TRACKER_MSG;
    }

    /* JADX INFO: renamed from: C */
    public int m18479C() {
        return this.perfSource.getMSkinTemp();
    }

    /* JADX INFO: renamed from: E */
    public float m18480E() {
        return this.perfSource.getMTotalCpuUsage();
    }

    /* JADX INFO: renamed from: O */
    public final void m18481O(@NotNull tt0 apmPluginConfig, @NotNull Context context) {
        apmPluginConfig.getClass();
        context.getClass();
        this.mainHandler.post(new RunnableC3808b(apmPluginConfig, context));
    }

    /* JADX INFO: renamed from: P */
    public final void m18482P() {
        this.mainHandler.post(new RunnableC3809c());
    }

    /* JADX INFO: renamed from: k */
    public float m18483k() {
        return this.perfSource.getMAppCpuUsage();
    }

    /* JADX INFO: renamed from: l */
    public int m18484l() {
        return this.perfSource.getMCpuTemp();
    }

    /* JADX INFO: renamed from: q */
    public int m18485q() {
        return this.perfSource.getMMemFree();
    }

    /* JADX INFO: renamed from: r */
    public int m18486r() {
        return this.perfSource.getMMemTotal();
    }

    /* JADX INFO: renamed from: t */
    public int m18487t() {
        return this.perfSource.getMMemUsage();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getOpenCpuTracer() {
        return this.openCpuTracer;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getOpenFpsTracer() {
        return this.openFpsTracer;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getOpenMemTracer() {
        return this.openMemTracer;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getOpenTempTracer() {
        return this.openTempTracer;
    }

    /* JADX INFO: renamed from: y */
    public int m18492y() {
        return this.perfSource.getMPageAvgFps();
    }

    /* JADX INFO: renamed from: z */
    public int m18493z() {
        return this.perfSource.getMPageFps();
    }

    /* JADX INFO: renamed from: com.immomo.molive.apm.ApmPlugin$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Lcom/immomo/molive/apm/ApmPlugin$a;", "", "<init>", "()V", "Ll/tt0;", "apmPluginConfig", "Landroid/content/Context;", "context", "", "k", "(Ll/tt0;Landroid/content/Context;)V", BLiveStormDanmakuGiftResourceType.f44444l, "", "a", "()F", "j", "", "h", "()I", "g", "f", "e", Constants.INAPP_DATA_TAG, "b", RXScreenCaptureService.KEY_INDEX, "Lcom/immomo/molive/apm/ApmPlugin;", "INSTANCE$delegate", "Lkotlin/Lazy;", "c", "()Lcom/immomo/molive/apm/ApmPlugin;", "INSTANCE", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: c */
        private final ApmPlugin m18494c() {
            return (ApmPlugin) ApmPlugin.f13009u.getValue();
        }

        /* JADX INFO: renamed from: a */
        public float m18495a() {
            return m18494c().m18483k();
        }

        /* JADX INFO: renamed from: b */
        public int m18496b() {
            return m18494c().m18484l();
        }

        /* JADX INFO: renamed from: d */
        public int m18497d() {
            return m18494c().m18485q();
        }

        /* JADX INFO: renamed from: e */
        public int m18498e() {
            return m18494c().m18486r();
        }

        /* JADX INFO: renamed from: f */
        public int m18499f() {
            return m18494c().m18487t();
        }

        /* JADX INFO: renamed from: g */
        public int m18500g() {
            return m18494c().m18492y();
        }

        /* JADX INFO: renamed from: h */
        public int m18501h() {
            return m18494c().m18493z();
        }

        /* JADX INFO: renamed from: i */
        public int m18502i() {
            return m18494c().m18479C();
        }

        /* JADX INFO: renamed from: j */
        public float m18503j() {
            return m18494c().m18480E();
        }

        /* JADX INFO: renamed from: k */
        public final void m18504k(@NotNull tt0 apmPluginConfig, @NotNull Context context) {
            apmPluginConfig.getClass();
            context.getClass();
            m18494c().m18481O(apmPluginConfig, context);
        }

        /* JADX INFO: renamed from: l */
        public final void m18505l() {
            m18494c().m18482P();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApmPlugin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ApmPlugin(cj60 cj60Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new cj60() : cj60Var);
    }
}
