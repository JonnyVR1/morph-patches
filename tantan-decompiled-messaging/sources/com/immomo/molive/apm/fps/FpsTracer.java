package com.immomo.molive.apm.fps;

import android.app.Activity;
import android.content.Context;
import android.view.Choreographer;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gex;
import p149l.l1j;
import p149l.mr2;
import p149l.q3j;
import p149l.qjq;
import p149l.vh2;
import p149l.vsf;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000267B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u001c\u0010%\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u001c\u0010)\u001a\b\u0018\u00010&R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001eR\u0016\u0010-\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001eR\u0016\u00100\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00102\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b4\u00105¨\u00068"}, m87232d2 = {"Lcom/immomo/molive/apm/fps/FpsTracer;", "Ll/mr2;", "Ll/l1j;", "Ll/vh2;", "fpsConfig", "<init>", "(Ll/vh2;)V", "Landroid/app/Activity;", "activity", "", "q", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "r", "(Landroid/content/Context;)V", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/content/Context;)I", "o", "()V", "p", "f", "g", "n", "()Ll/l1j;", "", "m", "()Z", "e", "I", "DEFAULT_RATE", "Ll/qjq;", "Ll/qjq;", "currentActivityJankStats", "Lcom/immomo/molive/apm/fps/FpsTracer$a;", "Lcom/immomo/molive/apm/fps/FpsTracer$a;", "frameJankCalculateListener", "Lcom/immomo/molive/apm/fps/FpsTracer$b;", "h", "Lcom/immomo/molive/apm/fps/FpsTracer$b;", "frameCallback", RXScreenCaptureService.KEY_INDEX, "currentWindowRefreshRate", "j", "sampleIntervalSecond", "k", "Z", "fpsTracerEnable", "Lkotlin/Lazy;", "fps", "Ll/vh2;", "getFpsConfig", "()Ll/vh2;", "a", "b", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class FpsTracer extends mr2<l1j> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int DEFAULT_RATE;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private qjq currentActivityJankStats;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C3811a frameJankCalculateListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ChoreographerFrameCallbackC3812b frameCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int currentWindowRefreshRate;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int sampleIntervalSecond;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean fpsTracerEnable;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Lazy fps;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final vh2 fpsConfig;

    /* JADX INFO: renamed from: com.immomo.molive.apm.fps.FpsTracer$b */
    @Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, m87232d2 = {"Lcom/immomo/molive/apm/fps/FpsTracer$b;", "Landroid/view/Choreographer$FrameCallback;", "", "refreshRate", "<init>", "(Lcom/immomo/molive/apm/fps/FpsTracer;I)V", "", "frameTimeNanos", "", "doFrame", "(J)V", "c", "()V", "", "b", "()Z", "Ll/l1j;", "a", "()Ll/l1j;", "J", "mLastTimeNanos", "Ll/vsf;", "Ll/vsf;", "fpsArray", "I", "mClockFrame", Constants.INAPP_DATA_TAG, "Z", "isStop", "e", "fpsCount", "f", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public final class ChoreographerFrameCallbackC3812b implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long mLastTimeNanos;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final vsf fpsArray = new vsf();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int mClockFrame;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private volatile boolean isStop;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private volatile int fpsCount;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final int refreshRate;

        public ChoreographerFrameCallbackC3812b(int i) {
            this.refreshRate = i;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final l1j m18576a() {
            FpsTracer.this.m18562k().m148189i(this.fpsCount);
            FpsTracer.this.m18562k().m148187g(this.fpsArray.getAVG_FPS());
            return FpsTracer.this.m18562k();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsStop() {
            return this.isStop;
        }

        /* JADX INFO: renamed from: c */
        public final void m18578c() {
            this.isStop = true;
            this.fpsArray.m199865c();
            this.mLastTimeNanos = 0L;
            this.mClockFrame = 0;
            this.fpsCount = 0;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            if (this.isStop) {
                return;
            }
            long j = this.mLastTimeNanos;
            if (j == 0) {
                this.mLastTimeNanos = frameTimeNanos;
                this.mClockFrame = 0;
            } else {
                if (frameTimeNanos - j >= 1000000000) {
                    this.fpsCount = Math.min(this.mClockFrame, this.refreshRate);
                    this.fpsArray.m199863a(this.fpsCount);
                    this.mLastTimeNanos = frameTimeNanos;
                    this.mClockFrame = 0;
                }
                this.mClockFrame++;
            }
            if (this.isStop) {
                return;
            }
            FpsTracer.this.m18564o();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsTracer(@NotNull vh2 vh2Var) {
        super(vh2Var);
        vh2Var.getClass();
        this.fpsConfig = vh2Var;
        this.DEFAULT_RATE = 60;
        this.currentWindowRefreshRate = 60;
        this.sampleIntervalSecond = Math.min(1, (int) (vh2Var.getSampleIntervalMs() / 1000));
        this.fpsTracerEnable = true;
        this.fps = LazyKt__LazyJVMKt.m87229b(new Function0<l1j>() { // from class: com.immomo.molive.apm.fps.FpsTracer$fps$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final l1j invoke() {
                return new l1j("", 0, this.this$0.DEFAULT_RATE, this.this$0.DEFAULT_RATE, new int[5]);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final l1j m18562k() {
        return (l1j) this.fps.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final int m18563l(Context context) {
        float refreshRate;
        try {
            if (!(context instanceof Activity) || ((Activity) context).getWindow() == null) {
                Object systemService = context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
                }
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                defaultDisplay.getClass();
                refreshRate = defaultDisplay.getRefreshRate();
            } else {
                Window window = ((Activity) context).getWindow();
                window.getClass();
                WindowManager windowManager = window.getWindowManager();
                windowManager.getClass();
                Display defaultDisplay2 = windowManager.getDefaultDisplay();
                defaultDisplay2.getClass();
                refreshRate = defaultDisplay2.getRefreshRate();
            }
            return Math.max(Math.round(((int) refreshRate) / 10.0f) * 10, this.DEFAULT_RATE);
        } catch (Exception unused) {
            return this.DEFAULT_RATE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m18564o() {
        ChoreographerFrameCallbackC3812b choreographerFrameCallbackC3812b = this.frameCallback;
        if (choreographerFrameCallbackC3812b == null || choreographerFrameCallbackC3812b.getIsStop()) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC3812b);
    }

    /* JADX INFO: renamed from: q */
    private final void m18565q(Activity activity) {
        if (activity.getWindow() == null) {
            this.fpsTracerEnable = false;
            return;
        }
        this.currentWindowRefreshRate = m18563l(activity);
        m18562k().m148188h(activity.getClass().getName());
        m18562k().m148190j(this.currentWindowRefreshRate);
        this.frameJankCalculateListener = new C3811a(this, activity.getClass().getName(), this.currentWindowRefreshRate, 0, 4, null);
        qjq.Companion companion = qjq.INSTANCE;
        Window window = activity.getWindow();
        window.getClass();
        C3811a c3811a = this.frameJankCalculateListener;
        if (c3811a == null) {
            Intrinsics.m87497m();
        }
        qjq qjqVarM175032a = companion.m175032a(window, c3811a, true);
        this.currentActivityJankStats = qjqVarM175032a;
        if (qjqVarM175032a != null) {
            qjqVarM175032a.m175031e(true);
        }
        mo18568f();
    }

    /* JADX INFO: renamed from: r */
    private final void m18566r(Context context) {
        this.currentWindowRefreshRate = m18563l(context);
        m18562k().m148190j(this.currentWindowRefreshRate);
        this.frameCallback = new ChoreographerFrameCallbackC3812b(this.currentWindowRefreshRate);
        m18564o();
        mo18568f();
    }

    @Override // p149l.mr2
    /* JADX INFO: renamed from: f */
    public void mo18568f() {
        if ((this.frameJankCalculateListener == null || this.currentActivityJankStats == null) && this.frameCallback == null) {
            this.fpsTracerEnable = false;
        } else {
            super.mo18568f();
        }
    }

    @Override // p149l.mr2
    /* JADX INFO: renamed from: g */
    public void mo18569g() {
        super.mo18569g();
        ChoreographerFrameCallbackC3812b choreographerFrameCallbackC3812b = this.frameCallback;
        if (choreographerFrameCallbackC3812b != null) {
            if (choreographerFrameCallbackC3812b != null) {
                choreographerFrameCallbackC3812b.m18578c();
            }
            Choreographer.getInstance().removeFrameCallback(this.frameCallback);
        }
        this.frameJankCalculateListener = null;
        qjq qjqVar = this.currentActivityJankStats;
        if (qjqVar != null) {
            qjqVar.m175031e(false);
        }
        this.currentActivityJankStats = null;
        this.currentWindowRefreshRate = 0;
        this.fpsTracerEnable = true;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getFpsTracerEnable() {
        return this.fpsTracerEnable;
    }

    @Override // p149l.mr2
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public l1j mo18567c() {
        C3811a c3811a = this.frameJankCalculateListener;
        if (c3811a != null) {
            if (c3811a == null) {
                Intrinsics.m87497m();
            }
            return c3811a.m18575c();
        }
        ChoreographerFrameCallbackC3812b choreographerFrameCallbackC3812b = this.frameCallback;
        if (choreographerFrameCallbackC3812b == null) {
            return m18562k();
        }
        if (choreographerFrameCallbackC3812b == null) {
            Intrinsics.m87497m();
        }
        return choreographerFrameCallbackC3812b.m18576a();
    }

    /* JADX INFO: renamed from: p */
    public final void m18572p(@Nullable Context context) {
        if (context != null) {
            if (context instanceof Activity) {
                m18565q((Activity) context);
            } else {
                m18566r(context);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.molive.apm.fps.FpsTracer$a */
    @Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010 R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010 ¨\u0006,"}, m87232d2 = {"Lcom/immomo/molive/apm/fps/FpsTracer$a;", "Ll/qjq$b;", "", "activity", "", "refreshRate", "sampleIntervalSecond", "<init>", "(Lcom/immomo/molive/apm/fps/FpsTracer;Ljava/lang/String;II)V", "Ll/l1j;", "c", "()Ll/l1j;", "Ll/q3j;", "frameData", "", "a", "(Ll/q3j;)V", "b", "", "Ljava/util/List;", "jankFrames", "jankFramesCopy", "", "J", "frameIntervalNs", "", Constants.INAPP_DATA_TAG, "F", "rateRatio", "e", "frozenFrameDuration", "f", "I", "heavyJankFactor", "g", "highJankFactor", "h", "middleJankFactor", RXScreenCaptureService.KEY_INDEX, "lightJankFactor", "j", "Ljava/lang/String;", "k", BLiveStormDanmakuGiftResourceType.f44444l, "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public final class C3811a implements qjq.InterfaceC19525b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private List<q3j> jankFrames;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private List<q3j> jankFramesCopy;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long frameIntervalNs;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private float rateRatio;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final long frozenFrameDuration;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final int heavyJankFactor;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final int highJankFactor;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final int middleJankFactor;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final int lightJankFactor;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String activity;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final int refreshRate;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final int sampleIntervalSecond;

        /* JADX INFO: renamed from: m */
        final /* synthetic */ FpsTracer f13091m;

        public C3811a(@NotNull FpsTracer fpsTracer, String str, int i, int i2) {
            str.getClass();
            this.f13091m = fpsTracer;
            this.activity = str;
            this.refreshRate = i;
            this.sampleIntervalSecond = i2;
            List<q3j> listSynchronizedList = Collections.synchronizedList(new ArrayList());
            listSynchronizedList.getClass();
            this.jankFrames = listSynchronizedList;
            this.jankFramesCopy = new ArrayList();
            this.frameIntervalNs = 1000000000 / ((long) i);
            float f = (i * 1.0f) / 60.0f;
            this.rateRatio = f;
            this.frozenFrameDuration = ((long) ((int) f)) * 700000000;
            this.heavyJankFactor = ((int) f) * 24;
            this.highJankFactor = ((int) f) * 10;
            this.middleJankFactor = ((int) f) * 5;
            this.lightJankFactor = ((int) f) * 2;
        }

        @Override // p149l.qjq.InterfaceC19525b
        /* JADX INFO: renamed from: a */
        public void mo18573a(@NotNull q3j frameData) {
            frameData.getClass();
        }

        @Override // p149l.qjq.InterfaceC19525b
        /* JADX INFO: renamed from: b */
        public void mo18574b(@NotNull q3j frameData) {
            frameData.getClass();
            if (frameData.getIsJank()) {
                this.jankFrames.add(frameData);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final l1j m18575c() {
            if (this.jankFrames.size() <= 0) {
                this.jankFrames.clear();
                this.f13091m.m18562k().getJank()[0] = 0;
                this.f13091m.m18562k().getJank()[1] = 0;
                this.f13091m.m18562k().getJank()[2] = 0;
                this.f13091m.m18562k().getJank()[3] = 0;
                this.f13091m.m18562k().getJank()[4] = 0;
                if (this.f13091m.m18562k().getCom.p1.mobile.putong.data.OMSTemplateModeType.page java.lang.String().length() == 0) {
                    this.f13091m.m18562k().m148188h(this.activity);
                }
                if (this.f13091m.m18562k().getWindowFps() != this.refreshRate) {
                    this.f13091m.m18562k().m148190j(this.refreshRate);
                }
                if (this.f13091m.m18562k().getPageFps() != this.refreshRate) {
                    this.f13091m.m18562k().m148189i(this.refreshRate);
                }
                this.f13091m.m18562k().m148187g(this.f13091m.m18562k().getPageFps());
                return this.f13091m.m18562k();
            }
            this.jankFramesCopy.clear();
            this.jankFramesCopy.addAll(this.jankFrames);
            this.jankFrames.clear();
            Iterator<q3j> it = this.jankFramesCopy.iterator();
            long j = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext()) {
                long frameDurationUiNanos = it.next().getFrameDurationUiNanos();
                long j2 = this.frameIntervalNs;
                if (frameDurationUiNanos > j2) {
                    j += frameDurationUiNanos - j2;
                }
                if (frameDurationUiNanos > this.frozenFrameDuration) {
                    i++;
                } else if (frameDurationUiNanos > ((long) this.heavyJankFactor) * j2) {
                    i2++;
                } else if (frameDurationUiNanos > ((long) this.highJankFactor) * j2) {
                    i3++;
                } else if (frameDurationUiNanos > ((long) this.middleJankFactor) * j2) {
                    i4++;
                } else if (frameDurationUiNanos > ((long) this.lightJankFactor) * j2) {
                    i5++;
                }
            }
            int iM125859b = gex.m125859b((j * 1.0f) / this.frameIntervalNs);
            int i6 = this.refreshRate * this.sampleIntervalSecond;
            if (iM125859b > i6) {
                iM125859b %= i6;
            }
            this.f13091m.m18562k().m148189i((i6 - iM125859b) / this.sampleIntervalSecond);
            this.f13091m.m18562k().m148187g(this.f13091m.m18562k().getPageFps());
            this.f13091m.m18562k().getJank()[0] = i;
            this.f13091m.m18562k().getJank()[1] = i2;
            this.f13091m.m18562k().getJank()[2] = i3;
            this.f13091m.m18562k().getJank()[3] = i4;
            this.f13091m.m18562k().getJank()[4] = i5;
            return this.f13091m.m18562k();
        }

        public /* synthetic */ C3811a(FpsTracer fpsTracer, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(fpsTracer, str, (i3 & 2) != 0 ? 60 : i, (i3 & 4) != 0 ? 1 : i2);
        }
    }
}
