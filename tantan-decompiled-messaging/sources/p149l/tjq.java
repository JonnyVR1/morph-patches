package p149l;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.immomo.molive.apm.fps.jankstats.StateInfo;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0010\u0018\u0000 42\u00020\u0001:\u00015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014*\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010$R\"\u0010+\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u0014\u00102\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103¨\u00066"}, m87232d2 = {"Ll/tjq;", "Ll/sjq;", "Ll/qjq;", "jankStats", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/view/Window;", BLiveBottomPopupStyleTypeEnum.window, "<init>", "(Ll/qjq;Landroid/view/View;Landroid/view/Window;)V", "Landroid/view/FrameMetrics;", "frameMetrics", "", "j", "(Landroid/view/FrameMetrics;)J", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "delegate", "", "q", "(Landroid/view/Window;Landroid/view/Window$OnFrameMetricsAvailableListener;)V", "", "o", "(Landroid/view/Window;)Ljava/util/List;", StudentVerRejectedReason.startTime, "uiDuration", "expectedDuration", "", "isJank", "Ll/r3j;", BLiveStormDanmakuGiftResourceType.f44444l, "(JJJLandroid/view/FrameMetrics;Z)Ll/r3j;", "m", "metrics", "k", "enable", "c", "(Z)V", "g", "J", "p", "()J", "r", "(J)V", "prevStart", "h", "n", "setListenerAddedTime", "listenerAddedTime", RXScreenCaptureService.KEY_INDEX, "Landroid/view/Window$OnFrameMetricsAvailableListener;", "frameMetricsAvailableListenerDelegate", "Landroid/view/Window;", "Companion", "a", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public class tjq extends sjq {

    /* JADX INFO: renamed from: k */
    @Nullable
    private static Handler f170786k;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long prevStart;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long listenerAddedTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Window.OnFrameMetricsAvailableListener frameMetricsAvailableListenerDelegate;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Window window;

    /* JADX INFO: renamed from: l.tjq$b */
    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, m87232d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/Window;", "kotlin.jvm.PlatformType", "frameMetrics", "Landroid/view/FrameMetrics;", "<anonymous parameter 2>", "", "onFrameMetricsAvailable"}, m87233k = 3, m87234mv = {1, 1, 16})
    public static final class WindowOnFrameMetricsAvailableListenerC20194b implements Window.OnFrameMetricsAvailableListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ qjq f170792b;

        public WindowOnFrameMetricsAvailableListenerC20194b(qjq qjqVar) {
            this.f170792b = qjqVar;
        }

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            tjq tjqVar = tjq.this;
            frameMetrics.getClass();
            long jMo189401m = tjqVar.mo189401m(frameMetrics);
            if (jMo189401m < tjq.this.getListenerAddedTime() || jMo189401m == tjq.this.getPrevStart()) {
                return;
            }
            float fMo189399k = tjq.this.mo189399k(frameMetrics) * this.f170792b.getJankHeuristicMultiplier();
            long jM189395j = tjq.this.m189395j(frameMetrics);
            boolean z = ((float) jM189395j) > fMo189399k;
            if (!this.f170792b.getOnlyMonitorJankFame()) {
                this.f170792b.m175029c(tjq.this.mo189400l(jMo189401m, jM189395j, (long) fMo189399k, frameMetrics, z));
            } else if (z) {
                this.f170792b.m175030d(tjq.this.m179660f(jMo189401m, jM189395j, (long) fMo189399k, true));
            }
            tjq.this.m189404r(jMo189401m);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjq(@NotNull qjq qjqVar, @NotNull View view, @NotNull Window window) {
        super(qjqVar, view);
        qjqVar.getClass();
        view.getClass();
        window.getClass();
        this.window = window;
        this.frameMetricsAvailableListenerDelegate = new WindowOnFrameMetricsAvailableListenerC20194b(qjqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final long m189395j(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    /* JADX INFO: renamed from: o */
    private final List<Window.OnFrameMetricsAvailableListener> m189396o(@NotNull Window window) {
        ctd ctdVar = (ctd) window.getDecorView().getTag(n4c0.f137089a);
        if (ctdVar == null) {
            ctd ctdVar2 = new ctd(new ArrayList());
            if (f170786k == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                handlerThread.start();
                f170786k = new Handler(handlerThread.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(ctdVar2, f170786k);
            window.getDecorView().setTag(n4c0.f137089a, ctdVar2);
            ctdVar = ctdVar2;
        }
        return ctdVar.m108667a();
    }

    @SuppressLint({"GlideWithUsage"})
    /* JADX INFO: renamed from: q */
    private final void m189397q(@NotNull Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        ctd ctdVar = (ctd) window.getDecorView().getTag(n4c0.f137089a);
        List<Window.OnFrameMetricsAvailableListener> listM108667a = ctdVar != null ? ctdVar.m108667a() : null;
        if (listM108667a != null) {
            listM108667a.remove(onFrameMetricsAvailableListener);
        }
        if (listM108667a == null || listM108667a.size() != 0) {
            return;
        }
        window.removeOnFrameMetricsAvailableListener(ctdVar);
        window.getDecorView().setTag(n4c0.f137089a, null);
    }

    @Override // p149l.wjq
    /* JADX INFO: renamed from: c */
    public void mo189398c(boolean enable) {
        Window window = this.window;
        if (!enable) {
            m189397q(window, this.frameMetricsAvailableListenerDelegate);
            this.listenerAddedTime = 0L;
        } else if (this.listenerAddedTime == 0) {
            m189396o(window).add(this.frameMetricsAvailableListenerDelegate);
            this.listenerAddedTime = System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: k */
    public long mo189399k(@NotNull FrameMetrics metrics) {
        metrics.getClass();
        return m179659e(m179658d().get());
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public r3j mo189400l(long startTime, long uiDuration, long expectedDuration, @NotNull FrameMetrics frameMetrics, boolean isJank) {
        List<StateInfo> listEmptyList;
        frameMetrics.getClass();
        gj60 state = getMetricsStateHolder().getState();
        if (state == null || (listEmptyList = state.m126459c(startTime, startTime + uiDuration)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new r3j(startTime, uiDuration, frameMetrics.getMetric(6) + uiDuration + frameMetrics.getMetric(7), isJank, listEmptyList);
    }

    /* JADX INFO: renamed from: m */
    public long mo189401m(@NotNull FrameMetrics frameMetrics) {
        frameMetrics.getClass();
        return m179661g();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getListenerAddedTime() {
        return this.listenerAddedTime;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getPrevStart() {
        return this.prevStart;
    }

    /* JADX INFO: renamed from: r */
    public final void m189404r(long j) {
        this.prevStart = j;
    }
}
