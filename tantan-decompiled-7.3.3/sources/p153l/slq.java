package p153l;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.immomo.molive.apm.fps.jankstats.StateInfo;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0010\u0018\u0000 42\u00020\u0001:\u00015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014*\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010$R\"\u0010+\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u0014\u00102\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103¨\u00066"}, m88121d2 = {"Ll/slq;", "Ll/rlq;", "Ll/plq;", "jankStats", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/view/Window;", BLiveBottomPopupStyleTypeEnum.window, "<init>", "(Ll/plq;Landroid/view/View;Landroid/view/Window;)V", "Landroid/view/FrameMetrics;", "frameMetrics", "", "j", "(Landroid/view/FrameMetrics;)J", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "delegate", "", "q", "(Landroid/view/Window;Landroid/view/Window$OnFrameMetricsAvailableListener;)V", "", "o", "(Landroid/view/Window;)Ljava/util/List;", StudentVerRejectedReason.startTime, "uiDuration", "expectedDuration", "", "isJank", "Ll/m6j;", BLiveStormDanmakuGiftResourceType.f45292l, "(JJJLandroid/view/FrameMetrics;Z)Ll/m6j;", "m", "metrics", "k", "enable", "c", "(Z)V", "g", "J", "p", "()J", "r", "(J)V", "prevStart", "h", "n", "setListenerAddedTime", "listenerAddedTime", RXScreenCaptureService.KEY_INDEX, "Landroid/view/Window$OnFrameMetricsAvailableListener;", "frameMetricsAvailableListenerDelegate", "Landroid/view/Window;", "Companion", "a", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class slq extends rlq {

    /* JADX INFO: renamed from: k */
    @Nullable
    private static Handler f169447k;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long prevStart;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long listenerAddedTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Window.OnFrameMetricsAvailableListener frameMetricsAvailableListenerDelegate;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Window window;

    /* JADX INFO: renamed from: l.slq$b */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/Window;", "kotlin.jvm.PlatformType", "frameMetrics", "Landroid/view/FrameMetrics;", "<anonymous parameter 2>", "", "onFrameMetricsAvailable"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class WindowOnFrameMetricsAvailableListenerC20101b implements Window.OnFrameMetricsAvailableListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ plq f169453b;

        public WindowOnFrameMetricsAvailableListenerC20101b(plq plqVar) {
            this.f169453b = plqVar;
        }

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            slq slqVar = slq.this;
            frameMetrics.getClass();
            long jMo186653m = slqVar.mo186653m(frameMetrics);
            if (jMo186653m < slq.this.getListenerAddedTime() || jMo186653m == slq.this.getPrevStart()) {
                return;
            }
            float fMo186651k = slq.this.mo186651k(frameMetrics) * this.f169453b.getJankHeuristicMultiplier();
            long jM186647j = slq.this.m186647j(frameMetrics);
            boolean z = ((float) jM186647j) > fMo186651k;
            if (!this.f169453b.getOnlyMonitorJankFame()) {
                this.f169453b.m172846c(slq.this.mo186652l(jMo186653m, jM186647j, (long) fMo186651k, frameMetrics, z));
            } else if (z) {
                this.f169453b.m172847d(slq.this.m177009f(jMo186653m, jM186647j, (long) fMo186651k, true));
            }
            slq.this.m186656r(jMo186653m);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slq(@NotNull plq plqVar, @NotNull View view, @NotNull Window window) {
        super(plqVar, view);
        plqVar.getClass();
        view.getClass();
        window.getClass();
        this.window = window;
        this.frameMetricsAvailableListenerDelegate = new WindowOnFrameMetricsAvailableListenerC20101b(plqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final long m186647j(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    /* JADX INFO: renamed from: o */
    private final List<Window.OnFrameMetricsAvailableListener> m186648o(@NotNull Window window) {
        qud qudVar = (qud) window.getDecorView().getTag(tcc0.f173227a);
        if (qudVar == null) {
            qud qudVar2 = new qud(new ArrayList());
            if (f169447k == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                handlerThread.start();
                f169447k = new Handler(handlerThread.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(qudVar2, f169447k);
            window.getDecorView().setTag(tcc0.f173227a, qudVar2);
            qudVar = qudVar2;
        }
        return qudVar.m178146a();
    }

    @SuppressLint({"GlideWithUsage"})
    /* JADX INFO: renamed from: q */
    private final void m186649q(@NotNull Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        qud qudVar = (qud) window.getDecorView().getTag(tcc0.f173227a);
        List<Window.OnFrameMetricsAvailableListener> listM178146a = qudVar != null ? qudVar.m178146a() : null;
        if (listM178146a != null) {
            listM178146a.remove(onFrameMetricsAvailableListener);
        }
        if (listM178146a == null || listM178146a.size() != 0) {
            return;
        }
        window.removeOnFrameMetricsAvailableListener(qudVar);
        window.getDecorView().setTag(tcc0.f173227a, null);
    }

    @Override // p153l.vlq
    /* JADX INFO: renamed from: c */
    public void mo186650c(boolean enable) {
        Window window = this.window;
        if (!enable) {
            m186649q(window, this.frameMetricsAvailableListenerDelegate);
            this.listenerAddedTime = 0L;
        } else if (this.listenerAddedTime == 0) {
            m186648o(window).add(this.frameMetricsAvailableListenerDelegate);
            this.listenerAddedTime = System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: k */
    public long mo186651k(@NotNull FrameMetrics metrics) {
        metrics.getClass();
        return m177008e(m177007d().get());
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public m6j mo186652l(long startTime, long uiDuration, long expectedDuration, @NotNull FrameMetrics frameMetrics, boolean isJank) {
        List<StateInfo> listEmptyList;
        frameMetrics.getClass();
        lr60 state = getMetricsStateHolder().getState();
        if (state == null || (listEmptyList = state.m155584c(startTime, startTime + uiDuration)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new m6j(startTime, uiDuration, frameMetrics.getMetric(6) + uiDuration + frameMetrics.getMetric(7), isJank, listEmptyList);
    }

    /* JADX INFO: renamed from: m */
    public long mo186653m(@NotNull FrameMetrics frameMetrics) {
        frameMetrics.getClass();
        return m177010g();
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
    public final void m186656r(long j) {
        this.prevStart = j;
    }
}
