package com.immomo.molive.apm.fps;

import android.app.Activity;
import android.content.Context;
import android.view.Choreographer;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.ci2;
import p153l.cs2;
import p153l.fhx;
import p153l.g4j;
import p153l.juf;
import p153l.l6j;
import p153l.plq;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000267B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u001c\u0010%\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u001c\u0010)\u001a\b\u0018\u00010&R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001eR\u0016\u0010-\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001eR\u0016\u00100\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00102\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b4\u00105¨\u00068"}, m88121d2 = {"Lcom/immomo/molive/apm/fps/FpsTracer;", "Ll/cs2;", "Ll/g4j;", "Ll/ci2;", "fpsConfig", "<init>", "(Ll/ci2;)V", "Landroid/app/Activity;", "activity", "", "q", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "r", "(Landroid/content/Context;)V", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/content/Context;)I", "o", "()V", "p", "f", "g", "n", "()Ll/g4j;", "", "m", "()Z", "e", "I", "DEFAULT_RATE", "Ll/plq;", "Ll/plq;", "currentActivityJankStats", "Lcom/immomo/molive/apm/fps/FpsTracer$a;", "Lcom/immomo/molive/apm/fps/FpsTracer$a;", "frameJankCalculateListener", "Lcom/immomo/molive/apm/fps/FpsTracer$b;", "h", "Lcom/immomo/molive/apm/fps/FpsTracer$b;", "frameCallback", RXScreenCaptureService.KEY_INDEX, "currentWindowRefreshRate", "j", "sampleIntervalSecond", "k", "Z", "fpsTracerEnable", "Lkotlin/Lazy;", "fps", "Ll/ci2;", "getFpsConfig", "()Ll/ci2;", "a", "b", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FpsTracer extends cs2<g4j> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int DEFAULT_RATE;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private plq currentActivityJankStats;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C3954a frameJankCalculateListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ChoreographerFrameCallbackC3955b frameCallback;

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
    private final ci2 fpsConfig;

    /* JADX INFO: renamed from: com.immomo.molive.apm.fps.FpsTracer$b */
    @Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, m88121d2 = {"Lcom/immomo/molive/apm/fps/FpsTracer$b;", "Landroid/view/Choreographer$FrameCallback;", "", "refreshRate", "<init>", "(Lcom/immomo/molive/apm/fps/FpsTracer;I)V", "", "frameTimeNanos", "", "doFrame", "(J)V", "c", "()V", "", "b", "()Z", "Ll/g4j;", "a", "()Ll/g4j;", "J", "mLastTimeNanos", "Ll/juf;", "Ll/juf;", "fpsArray", "I", "mClockFrame", Constants.INAPP_DATA_TAG, "Z", "isStop", "e", "fpsCount", "f", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public final class ChoreographerFrameCallbackC3955b implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long mLastTimeNanos;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final juf fpsArray = new juf();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int mClockFrame;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private volatile boolean isStop;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private volatile int fpsCount;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final int refreshRate;

        public ChoreographerFrameCallbackC3955b(int i) {
            this.refreshRate = i;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final g4j m19556a() {
            FpsTracer.this.m19542k().m128890i(this.fpsCount);
            FpsTracer.this.m19542k().m128888g(this.fpsArray.getAVG_FPS());
            return FpsTracer.this.m19542k();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsStop() {
            return this.isStop;
        }

        /* JADX INFO: renamed from: c */
        public final void m19558c() {
            this.isStop = true;
            this.fpsArray.m146980c();
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
                    this.fpsArray.m146978a(this.fpsCount);
                    this.mLastTimeNanos = frameTimeNanos;
                    this.mClockFrame = 0;
                }
                this.mClockFrame++;
            }
            if (this.isStop) {
                return;
            }
            FpsTracer.this.m19544o();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsTracer(@NotNull ci2 ci2Var) {
        super(ci2Var);
        ci2Var.getClass();
        this.fpsConfig = ci2Var;
        this.DEFAULT_RATE = 60;
        this.currentWindowRefreshRate = 60;
        this.sampleIntervalSecond = Math.min(1, (int) (ci2Var.getSampleIntervalMs() / 1000));
        this.fpsTracerEnable = true;
        this.fps = LazyKt__LazyJVMKt.m88118b(new Function0<g4j>() { // from class: com.immomo.molive.apm.fps.FpsTracer$fps$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final g4j invoke() {
                return new g4j("", 0, this.this$0.DEFAULT_RATE, this.this$0.DEFAULT_RATE, new int[5]);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final g4j m19542k() {
        return (g4j) this.fps.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final int m19543l(Context context) {
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
    public final void m19544o() {
        ChoreographerFrameCallbackC3955b choreographerFrameCallbackC3955b = this.frameCallback;
        if (choreographerFrameCallbackC3955b == null || choreographerFrameCallbackC3955b.getIsStop()) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC3955b);
    }

    /* JADX INFO: renamed from: q */
    private final void m19545q(Activity activity) {
        if (activity.getWindow() == null) {
            this.fpsTracerEnable = false;
            return;
        }
        this.currentWindowRefreshRate = m19543l(activity);
        m19542k().m128889h(activity.getClass().getName());
        m19542k().m128891j(this.currentWindowRefreshRate);
        this.frameJankCalculateListener = new C3954a(this, activity.getClass().getName(), this.currentWindowRefreshRate, 0, 4, null);
        plq.Companion companion = plq.INSTANCE;
        Window window = activity.getWindow();
        window.getClass();
        C3954a c3954a = this.frameJankCalculateListener;
        if (c3954a == null) {
            Intrinsics.m88386m();
        }
        plq plqVarM172849a = companion.m172849a(window, c3954a, true);
        this.currentActivityJankStats = plqVarM172849a;
        if (plqVarM172849a != null) {
            plqVarM172849a.m172848e(true);
        }
        mo19548f();
    }

    /* JADX INFO: renamed from: r */
    private final void m19546r(Context context) {
        this.currentWindowRefreshRate = m19543l(context);
        m19542k().m128891j(this.currentWindowRefreshRate);
        this.frameCallback = new ChoreographerFrameCallbackC3955b(this.currentWindowRefreshRate);
        m19544o();
        mo19548f();
    }

    @Override // p153l.cs2
    /* JADX INFO: renamed from: f */
    public void mo19548f() {
        if ((this.frameJankCalculateListener == null || this.currentActivityJankStats == null) && this.frameCallback == null) {
            this.fpsTracerEnable = false;
        } else {
            super.mo19548f();
        }
    }

    @Override // p153l.cs2
    /* JADX INFO: renamed from: g */
    public void mo19549g() {
        super.mo19549g();
        ChoreographerFrameCallbackC3955b choreographerFrameCallbackC3955b = this.frameCallback;
        if (choreographerFrameCallbackC3955b != null) {
            if (choreographerFrameCallbackC3955b != null) {
                choreographerFrameCallbackC3955b.m19558c();
            }
            Choreographer.getInstance().removeFrameCallback(this.frameCallback);
        }
        this.frameJankCalculateListener = null;
        plq plqVar = this.currentActivityJankStats;
        if (plqVar != null) {
            plqVar.m172848e(false);
        }
        this.currentActivityJankStats = null;
        this.currentWindowRefreshRate = 0;
        this.fpsTracerEnable = true;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getFpsTracerEnable() {
        return this.fpsTracerEnable;
    }

    @Override // p153l.cs2
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g4j mo19547c() {
        C3954a c3954a = this.frameJankCalculateListener;
        if (c3954a != null) {
            if (c3954a == null) {
                Intrinsics.m88386m();
            }
            return c3954a.m19555c();
        }
        ChoreographerFrameCallbackC3955b choreographerFrameCallbackC3955b = this.frameCallback;
        if (choreographerFrameCallbackC3955b == null) {
            return m19542k();
        }
        if (choreographerFrameCallbackC3955b == null) {
            Intrinsics.m88386m();
        }
        return choreographerFrameCallbackC3955b.m19556a();
    }

    /* JADX INFO: renamed from: p */
    public final void m19552p(@Nullable Context context) {
        if (context != null) {
            if (context instanceof Activity) {
                m19545q((Activity) context);
            } else {
                m19546r(context);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.molive.apm.fps.FpsTracer$a */
    @Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010 R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010 ¨\u0006,"}, m88121d2 = {"Lcom/immomo/molive/apm/fps/FpsTracer$a;", "Ll/plq$b;", "", "activity", "", "refreshRate", "sampleIntervalSecond", "<init>", "(Lcom/immomo/molive/apm/fps/FpsTracer;Ljava/lang/String;II)V", "Ll/g4j;", "c", "()Ll/g4j;", "Ll/l6j;", "frameData", "", "a", "(Ll/l6j;)V", "b", "", "Ljava/util/List;", "jankFrames", "jankFramesCopy", "", "J", "frameIntervalNs", "", Constants.INAPP_DATA_TAG, "F", "rateRatio", "e", "frozenFrameDuration", "f", "I", "heavyJankFactor", "g", "highJankFactor", "h", "middleJankFactor", RXScreenCaptureService.KEY_INDEX, "lightJankFactor", "j", "Ljava/lang/String;", "k", BLiveStormDanmakuGiftResourceType.f45292l, "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public final class C3954a implements plq.InterfaceC19397b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private List<l6j> jankFrames;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private List<l6j> jankFramesCopy;

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
        final /* synthetic */ FpsTracer f13785m;

        public C3954a(@NotNull FpsTracer fpsTracer, String str, int i, int i2) {
            str.getClass();
            this.f13785m = fpsTracer;
            this.activity = str;
            this.refreshRate = i;
            this.sampleIntervalSecond = i2;
            List<l6j> listSynchronizedList = Collections.synchronizedList(new ArrayList());
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

        @Override // p153l.plq.InterfaceC19397b
        /* JADX INFO: renamed from: a */
        public void mo19553a(@NotNull l6j frameData) {
            frameData.getClass();
        }

        @Override // p153l.plq.InterfaceC19397b
        /* JADX INFO: renamed from: b */
        public void mo19554b(@NotNull l6j frameData) {
            frameData.getClass();
            if (frameData.getIsJank()) {
                this.jankFrames.add(frameData);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final g4j m19555c() {
            if (this.jankFrames.size() <= 0) {
                this.jankFrames.clear();
                this.f13785m.m19542k().getJank()[0] = 0;
                this.f13785m.m19542k().getJank()[1] = 0;
                this.f13785m.m19542k().getJank()[2] = 0;
                this.f13785m.m19542k().getJank()[3] = 0;
                this.f13785m.m19542k().getJank()[4] = 0;
                if (this.f13785m.m19542k().getCom.p1.mobile.putong.data.OMSTemplateModeType.page java.lang.String().length() == 0) {
                    this.f13785m.m19542k().m128889h(this.activity);
                }
                if (this.f13785m.m19542k().getWindowFps() != this.refreshRate) {
                    this.f13785m.m19542k().m128891j(this.refreshRate);
                }
                if (this.f13785m.m19542k().getPageFps() != this.refreshRate) {
                    this.f13785m.m19542k().m128890i(this.refreshRate);
                }
                this.f13785m.m19542k().m128888g(this.f13785m.m19542k().getPageFps());
                return this.f13785m.m19542k();
            }
            this.jankFramesCopy.clear();
            this.jankFramesCopy.addAll(this.jankFrames);
            this.jankFrames.clear();
            Iterator<l6j> it = this.jankFramesCopy.iterator();
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
            int iM125609b = fhx.m125609b((j * 1.0f) / this.frameIntervalNs);
            int i6 = this.refreshRate * this.sampleIntervalSecond;
            if (iM125609b > i6) {
                iM125609b %= i6;
            }
            this.f13785m.m19542k().m128890i((i6 - iM125609b) / this.sampleIntervalSecond);
            this.f13785m.m19542k().m128888g(this.f13785m.m19542k().getPageFps());
            this.f13785m.m19542k().getJank()[0] = i;
            this.f13785m.m19542k().getJank()[1] = i2;
            this.f13785m.m19542k().getJank()[2] = i3;
            this.f13785m.m19542k().getJank()[3] = i4;
            this.f13785m.m19542k().getJank()[4] = i5;
            return this.f13785m.m19542k();
        }

        public /* synthetic */ C3954a(FpsTracer fpsTracer, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(fpsTracer, str, (i3 & 2) != 0 ? 60 : i, (i3 & 4) != 0 ? 1 : i2);
        }
    }
}
