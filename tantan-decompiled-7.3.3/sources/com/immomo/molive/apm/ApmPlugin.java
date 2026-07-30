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
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p153l.btb;
import p153l.c4s;
import p153l.ci2;
import p153l.g4j;
import p153l.hr60;
import p153l.ogy;
import p153l.otb;
import p153l.xt0;
import p153l.zt0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 m2\u00020\u0001:\u0001*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u000eJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b)\u0010\u001fR\u001a\u0010,\u001a\u00020 8\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\"R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00103\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u0015R\u001b\u0010>\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010C\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010.\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0018R\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u0010GR\"\u0010L\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010.\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010\u0018R\u001b\u0010P\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\bN\u0010OR\"\u0010S\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010.\u001a\u0004\bQ\u0010A\"\u0004\bR\u0010\u0018R\u001b\u0010W\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\bU\u0010VR\"\u0010Z\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010.\u001a\u0004\bX\u0010A\"\u0004\bY\u0010\u0018R\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010;\u001a\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010aR\u001b\u0010i\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010;\u001a\u0004\b\\\u0010hR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010j\u001a\u0004\bk\u0010l¨\u0006n"}, m88121d2 = {"Lcom/immomo/molive/apm/ApmPlugin;", "", "Ll/hr60;", "perfSource", "<init>", "(Ll/hr60;)V", "Ll/zt0;", "apmPluginConfig", "", "N", "(Ll/zt0;)V", "Landroid/content/Context;", "context", "G", "(Ll/zt0;Landroid/content/Context;)V", "H", "()V", "F", "M", "", "isOpen", "J", "(ZLandroid/content/Context;)V", "I", "(Z)V", "K", "L", BloodType.f39576O, "P", "", "k", "()F", "", BLiveStormDanmakuGiftResourceType.f45292l, "()I", "q", "r", Constants.KEY_T, BaseSei.f14625Y, BaseSei.f14626Z, c4s.C_ZONE, "E", "a", "B", "RUN_TRACKER_MSG", "b", "Z", "isHandlerThreadStart", "c", "isSendTracerSampleMsg", Constants.INAPP_DATA_TAG, "isApmStarted", "e", "Ll/zt0;", "debugApmPluginConfig", "", "f", "delayTracer", "g", "Lkotlin/Lazy;", "p", "()Ll/zt0;", "innerApmPluginConfig", "h", ResourceDirection.f39656v, "()Z", "setOpenFpsTracer", "openFpsTracer", "Lcom/immomo/molive/apm/fps/FpsTracer;", RXScreenCaptureService.KEY_INDEX, "n", "()Lcom/immomo/molive/apm/fps/FpsTracer;", "fpsTracer", "j", "u", "setOpenCpuTracer", "openCpuTracer", "Ll/otb;", "m", "()Ll/otb;", "cpuTracer", "w", "setOpenMemTracer", "openMemTracer", "Lcom/immomo/molive/debuger/performance/tracer/memory/MemTracer;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lcom/immomo/molive/debuger/performance/tracer/memory/MemTracer;", "memTracer", BaseSei.f14624X, "setOpenTempTracer", "openTempTracer", "Lcom/immomo/molive/apm/temp/TempTracer;", "o", "D", "()Lcom/immomo/molive/apm/temp/TempTracer;", "tempTracer", "Landroid/os/Handler;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "tracerHandlerThread", "tracerHandler", "Landroid/os/Handler$Callback;", "()Landroid/os/Handler$Callback;", "handlerCallback", "Ll/hr60;", "A", "()Ll/hr60;", "Companion", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ApmPlugin {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u */
    private static final Lazy f13703u = LazyKt__LazyJVMKt.m88118b(new Function0<ApmPlugin>() { // from class: com.immomo.molive.apm.ApmPlugin$Companion$INSTANCE$2
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
    private zt0 debugApmPluginConfig;

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
    private final hr60 perfSource;

    /* JADX INFO: renamed from: com.immomo.molive.apm.ApmPlugin$b */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3951b implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ zt0 f13725b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Context f13726c;

        public RunnableC3951b(zt0 zt0Var, Context context) {
            this.f13725b = zt0Var;
            this.f13726c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ApmPlugin.this.m19434G(this.f13725b, this.f13726c);
        }
    }

    /* JADX INFO: renamed from: com.immomo.molive.apm.ApmPlugin$c */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3952c implements Runnable {
        public RunnableC3952c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ApmPlugin.this.m19435H();
        }
    }

    public ApmPlugin(@NotNull hr60 hr60Var) {
        hr60Var.getClass();
        this.perfSource = hr60Var;
        this.RUN_TRACKER_MSG = 1;
        this.innerApmPluginConfig = LazyKt__LazyJVMKt.m88118b(new Function0<zt0>() { // from class: com.immomo.molive.apm.ApmPlugin$innerApmPluginConfig$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final zt0 invoke() {
                return new zt0(false, 3000L, false, false, false, false, 60, null);
            }
        });
        this.fpsTracer = LazyKt__LazyJVMKt.m88118b(new Function0<FpsTracer>() { // from class: com.immomo.molive.apm.ApmPlugin$fpsTracer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FpsTracer invoke() {
                return new FpsTracer(new ci2(this.this$0.m19455p().getSampleInterval(), null, 2, null));
            }
        });
        this.cpuTracer = LazyKt__LazyJVMKt.m88118b(new Function0<otb>() { // from class: com.immomo.molive.apm.ApmPlugin$cpuTracer$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final otb invoke() {
                return new otb(new ci2(this.this$0.m19455p().getSampleInterval(), null, 2, null));
            }
        });
        this.memTracer = LazyKt__LazyJVMKt.m88118b(new Function0<MemTracer>() { // from class: com.immomo.molive.apm.ApmPlugin$memTracer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MemTracer invoke() {
                return new MemTracer(new ci2(this.this$0.m19455p().getSampleInterval(), null, 2, null));
            }
        });
        this.tempTracer = LazyKt__LazyJVMKt.m88118b(new Function0<TempTracer>() { // from class: com.immomo.molive.apm.ApmPlugin$tempTracer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TempTracer invoke() {
                return new TempTracer(new ci2(this.this$0.m19455p().getSampleInterval(), null, 2, null));
            }
        });
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.handlerCallback = LazyKt__LazyJVMKt.m88118b(new Function0<Handler.Callback>() { // from class: com.immomo.molive.apm.ApmPlugin$handlerCallback$2

            /* JADX INFO: renamed from: com.immomo.molive.apm.ApmPlugin$handlerCallback$2$a */
            @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, "Landroid/os/Message;", "handleMessage"}, m88122k = 3, m88123mv = {1, 1, 16})
            public static final class C3953a implements Handler.Callback {
                public C3953a() {
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(@NotNull Message message) {
                    Handler handler;
                    message.getClass();
                    if (message.what != ApmPlugin$handlerCallback$2.this.this$0.getRUN_TRACKER_MSG()) {
                        return true;
                    }
                    ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                    if (ApmPlugin$handlerCallback$2.this.this$0.getOpenFpsTracer() && ApmPlugin$handlerCallback$2.this.this$0.m19453n().getFpsTracerEnable()) {
                        ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                        ApmPlugin$handlerCallback$2.this.this$0.m19453n().m112111d();
                        g4j g4jVarM112109a = ApmPlugin$handlerCallback$2.this.this$0.m19453n().m112109a();
                        if (g4jVarM112109a != null) {
                            ApmPlugin$handlerCallback$2.this.this$0.getPerfSource().m136773m(g4jVarM112109a.getPageFps(), g4jVarM112109a.getAvgFps(), g4jVarM112109a.getWindowFps());
                            ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                        }
                    } else {
                        ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                    }
                    if (ApmPlugin$handlerCallback$2.this.this$0.getOpenCpuTracer() && ApmPlugin$handlerCallback$2.this.this$0.m19452m().getCpuTracerEnable()) {
                        ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                        ApmPlugin$handlerCallback$2.this.this$0.m19452m().m112111d();
                        btb btbVarM112109a = ApmPlugin$handlerCallback$2.this.this$0.m19452m().m112109a();
                        if (btbVarM112109a != null) {
                            ApmPlugin$handlerCallback$2.this.this$0.getPerfSource().m136772l(btbVarM112109a.getAppUsage(), btbVarM112109a.getTotalUsage());
                            ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                        }
                    } else {
                        ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                    }
                    if (ApmPlugin$handlerCallback$2.this.this$0.getOpenMemTracer() && ApmPlugin$handlerCallback$2.this.this$0.m19456s().getMemTracerEnable()) {
                        ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                        ApmPlugin$handlerCallback$2.this.this$0.m19456s().m112111d();
                        ogy ogyVarM112109a = ApmPlugin$handlerCallback$2.this.this$0.m19456s().m112109a();
                        if (ogyVarM112109a != null) {
                            ApmPlugin$handlerCallback$2.this.this$0.getPerfSource().m136778r(ogyVarM112109a.getAppMem(), ogyVarM112109a.getTotalMem(), ogyVarM112109a.getFreeMem());
                            ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                        }
                    } else {
                        ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                    }
                    if (ApmPlugin$handlerCallback$2.this.this$0.getOpenTempTracer() && ApmPlugin$handlerCallback$2.this.this$0.m19432D().m19564i()) {
                        ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                        ApmPlugin$handlerCallback$2.this.this$0.m19432D().m112111d();
                        TempSummary tempSummaryM112109a = ApmPlugin$handlerCallback$2.this.this$0.m19432D().m112109a();
                        if (tempSummaryM112109a != null) {
                            ApmPlugin$handlerCallback$2.this.this$0.getPerfSource().m136779s(tempSummaryM112109a.getCupTemp().getTempValue(), tempSummaryM112109a.getSkinTemp().getTempValue(), tempSummaryM112109a.getBatteryTemp().getTempValue());
                            ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                        }
                    } else {
                        ApmPlugin.m19442a(ApmPlugin$handlerCallback$2.this.this$0);
                    }
                    Handler handler2 = ApmPlugin$handlerCallback$2.this.this$0.tracerHandler;
                    if (handler2 != null) {
                        handler2.removeMessages(ApmPlugin$handlerCallback$2.this.this$0.getRUN_TRACKER_MSG());
                    }
                    if (!ApmPlugin$handlerCallback$2.this.this$0.m19455p().getEnable() || (handler = ApmPlugin$handlerCallback$2.this.this$0.tracerHandler) == null) {
                        return true;
                    }
                    handler.sendEmptyMessageDelayed(ApmPlugin$handlerCallback$2.this.this$0.getRUN_TRACKER_MSG(), ApmPlugin$handlerCallback$2.this.this$0.m19455p().getSampleInterval());
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
                return new C3953a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final TempTracer m19432D() {
        return (TempTracer) this.tempTracer.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final void m19433F() {
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
                    Intrinsics.m88386m();
                }
                this.tracerHandler = new Handler(handlerThread2.getLooper(), m19454o());
            }
            this.isHandlerThreadStart = true;
        } catch (Exception unused) {
            this.isHandlerThreadStart = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final void m19434G(zt0 apmPluginConfig, Context context) {
        try {
            if (this.isApmStarted) {
                return;
            }
            if (!this.isApmStarted && apmPluginConfig.getEnable()) {
                this.isApmStarted = true;
            }
            zt0 zt0Var = this.debugApmPluginConfig;
            if (zt0Var != null) {
                if (zt0Var == null) {
                    Intrinsics.m88386m();
                }
                m19441N(zt0Var);
            } else {
                m19441N(apmPluginConfig);
            }
            if (m19455p().getEnable()) {
                System.currentTimeMillis();
                if (m19455p().getFpsEnable() || m19455p().getCpuEnable() || m19455p().getMemEnable() || m19455p().getTempEnable()) {
                    m19433F();
                }
                m19436I(m19455p().getCpuEnable());
                m19437J(m19455p().getFpsEnable(), context);
                m19438K(m19455p().getMemEnable(), context);
                m19439L(m19455p().getTempEnable());
                m19440M();
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
    public final void m19435H() {
        try {
            if (this.isApmStarted) {
                this.isApmStarted = false;
                m19455p().m221375h(false);
                m19455p().m221376i(false);
                m19455p().m221374g(false);
                m19455p().m221377j(false);
                m19455p().m221379l(false);
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
                this.perfSource.m136771k();
                m19436I(false);
                m19438K(false, null);
                m19439L(false);
                m19437J(false, null);
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
    private final void m19436I(boolean isOpen) {
        if (this.openCpuTracer && isOpen) {
            return;
        }
        this.openCpuTracer = isOpen;
        hr60 hr60Var = this.perfSource;
        if (isOpen) {
            hr60Var.m136774n(true);
        } else {
            hr60Var.m136774n(false);
            m19452m().mo19549g();
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m19437J(boolean isOpen, Context context) {
        if (this.openFpsTracer && isOpen) {
            return;
        }
        this.openFpsTracer = isOpen;
        hr60 hr60Var = this.perfSource;
        if (isOpen) {
            hr60Var.m136775o(true);
            m19453n().m19552p(context);
        } else {
            hr60Var.m136775o(false);
            m19453n().mo19549g();
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m19438K(boolean isOpen, Context context) {
        if (this.openMemTracer && isOpen) {
            return;
        }
        this.openMemTracer = isOpen;
        boolean z = this.openCpuTracer;
        hr60 hr60Var = this.perfSource;
        if (z) {
            hr60Var.m136776p(true);
            m19456s().m19578l(context);
        } else {
            hr60Var.m136776p(false);
            m19456s().mo19549g();
        }
    }

    /* JADX INFO: renamed from: L */
    private final void m19439L(boolean isOpen) {
        if (this.openTempTracer && isOpen) {
            return;
        }
        this.openTempTracer = isOpen;
        hr60 hr60Var = this.perfSource;
        if (isOpen) {
            hr60Var.m136777q(true);
        } else {
            hr60Var.m136777q(false);
            m19432D().mo19549g();
        }
    }

    /* JADX INFO: renamed from: M */
    private final void m19440M() {
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
    private final void m19441N(zt0 apmPluginConfig) {
        m19455p().m221375h(apmPluginConfig.getEnable());
        m19455p().m221378k(Math.max(apmPluginConfig.getSampleInterval(), 3000L));
        m19455p().m221376i(apmPluginConfig.getFpsEnable());
        m19455p().m221374g(apmPluginConfig.getCpuEnable());
        m19455p().m221377j(apmPluginConfig.getMemEnable());
        m19455p().m221379l(apmPluginConfig.getTempEnable());
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ xt0 m19442a(ApmPlugin apmPlugin) {
        apmPlugin.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final otb m19452m() {
        return (otb) this.cpuTracer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final FpsTracer m19453n() {
        return (FpsTracer) this.fpsTracer.getValue();
    }

    /* JADX INFO: renamed from: o */
    private final Handler.Callback m19454o() {
        return (Handler.Callback) this.handlerCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final zt0 m19455p() {
        return (zt0) this.innerApmPluginConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final MemTracer m19456s() {
        return (MemTracer) this.memTracer.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: A, reason: from getter */
    public final hr60 getPerfSource() {
        return this.perfSource;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getRUN_TRACKER_MSG() {
        return this.RUN_TRACKER_MSG;
    }

    /* JADX INFO: renamed from: C */
    public int m19459C() {
        return this.perfSource.getMSkinTemp();
    }

    /* JADX INFO: renamed from: E */
    public float m19460E() {
        return this.perfSource.getMTotalCpuUsage();
    }

    /* JADX INFO: renamed from: O */
    public final void m19461O(@NotNull zt0 apmPluginConfig, @NotNull Context context) {
        apmPluginConfig.getClass();
        context.getClass();
        this.mainHandler.post(new RunnableC3951b(apmPluginConfig, context));
    }

    /* JADX INFO: renamed from: P */
    public final void m19462P() {
        this.mainHandler.post(new RunnableC3952c());
    }

    /* JADX INFO: renamed from: k */
    public float m19463k() {
        return this.perfSource.getMAppCpuUsage();
    }

    /* JADX INFO: renamed from: l */
    public int m19464l() {
        return this.perfSource.getMCpuTemp();
    }

    /* JADX INFO: renamed from: q */
    public int m19465q() {
        return this.perfSource.getMMemFree();
    }

    /* JADX INFO: renamed from: r */
    public int m19466r() {
        return this.perfSource.getMMemTotal();
    }

    /* JADX INFO: renamed from: t */
    public int m19467t() {
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
    public int m19472y() {
        return this.perfSource.getMPageAvgFps();
    }

    /* JADX INFO: renamed from: z */
    public int m19473z() {
        return this.perfSource.getMPageFps();
    }

    /* JADX INFO: renamed from: com.immomo.molive.apm.ApmPlugin$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Lcom/immomo/molive/apm/ApmPlugin$a;", "", "<init>", "()V", "Ll/zt0;", "apmPluginConfig", "Landroid/content/Context;", "context", "", "k", "(Ll/zt0;Landroid/content/Context;)V", BLiveStormDanmakuGiftResourceType.f45292l, "", "a", "()F", "j", "", "h", "()I", "g", "f", "e", Constants.INAPP_DATA_TAG, "b", RXScreenCaptureService.KEY_INDEX, "Lcom/immomo/molive/apm/ApmPlugin;", "INSTANCE$delegate", "Lkotlin/Lazy;", "c", "()Lcom/immomo/molive/apm/ApmPlugin;", "INSTANCE", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: c */
        private final ApmPlugin m19474c() {
            return (ApmPlugin) ApmPlugin.f13703u.getValue();
        }

        /* JADX INFO: renamed from: a */
        public float m19475a() {
            return m19474c().m19463k();
        }

        /* JADX INFO: renamed from: b */
        public int m19476b() {
            return m19474c().m19464l();
        }

        /* JADX INFO: renamed from: d */
        public int m19477d() {
            return m19474c().m19465q();
        }

        /* JADX INFO: renamed from: e */
        public int m19478e() {
            return m19474c().m19466r();
        }

        /* JADX INFO: renamed from: f */
        public int m19479f() {
            return m19474c().m19467t();
        }

        /* JADX INFO: renamed from: g */
        public int m19480g() {
            return m19474c().m19472y();
        }

        /* JADX INFO: renamed from: h */
        public int m19481h() {
            return m19474c().m19473z();
        }

        /* JADX INFO: renamed from: i */
        public int m19482i() {
            return m19474c().m19459C();
        }

        /* JADX INFO: renamed from: j */
        public float m19483j() {
            return m19474c().m19460E();
        }

        /* JADX INFO: renamed from: k */
        public final void m19484k(@NotNull zt0 apmPluginConfig, @NotNull Context context) {
            apmPluginConfig.getClass();
            context.getClass();
            m19474c().m19461O(apmPluginConfig, context);
        }

        /* JADX INFO: renamed from: l */
        public final void m19485l() {
            m19474c().m19462P();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApmPlugin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ApmPlugin(hr60 hr60Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new hr60() : hr60Var);
    }
}
