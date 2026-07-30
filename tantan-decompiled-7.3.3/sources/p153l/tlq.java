package p153l;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/tlq;", "Ll/slq;", "Ll/plq;", "jankStats", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/view/Window;", BLiveBottomPopupStyleTypeEnum.window, "<init>", "(Ll/plq;Landroid/view/View;Landroid/view/Window;)V", "Landroid/view/FrameMetrics;", "frameMetrics", "", "m", "(Landroid/view/FrameMetrics;)J", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class tlq extends slq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlq(@NotNull plq plqVar, @NotNull View view, @NotNull Window window) {
        super(plqVar, view, window);
        plqVar.getClass();
        view.getClass();
        window.getClass();
    }

    @Override // p153l.slq
    /* JADX INFO: renamed from: m */
    public long mo186653m(@NotNull FrameMetrics frameMetrics) {
        frameMetrics.getClass();
        return frameMetrics.getMetric(11);
    }
}
