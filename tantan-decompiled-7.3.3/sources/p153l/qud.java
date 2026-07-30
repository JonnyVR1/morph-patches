package p153l;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/qud;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "", "delegates", "<init>", "(Ljava/util/List;)V", "Landroid/view/Window;", BLiveBottomPopupStyleTypeEnum.window, "Landroid/view/FrameMetrics;", "frameMetrics", "", "dropCount", "", "onFrameMetricsAvailable", "(Landroid/view/Window;Landroid/view/FrameMetrics;I)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
final class qud implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Window.OnFrameMetricsAvailableListener> delegates;

    public qud(@NotNull List<Window.OnFrameMetricsAvailableListener> list) {
        list.getClass();
        this.delegates = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<Window.OnFrameMetricsAvailableListener> m178146a() {
        return this.delegates;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(@Nullable Window window, @Nullable FrameMetrics frameMetrics, int dropCount) {
        try {
            Object[] array = this.delegates.toArray(new Window.OnFrameMetricsAvailableListener[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener : (Window.OnFrameMetricsAvailableListener[]) array) {
                onFrameMetricsAvailableListener.onFrameMetricsAvailable(window, frameMetrics, dropCount);
            }
            if ((window != null ? window.getDecorView() : null) != null) {
                lr60.Companion companion = lr60.INSTANCE;
                View decorView = window.getDecorView();
                decorView.getClass();
                lr60 state = companion.m155586b(decorView).getState();
                if (state != null) {
                    state.m155583b();
                }
            }
        } catch (Exception unused) {
        }
    }
}
