package p149l;

import android.annotation.SuppressLint;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.immomo.molive.apm.fps.jankstats.StateInfo;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/vjq;", "Ll/ujq;", "Ll/qjq;", "jankStats", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/view/Window;", BLiveBottomPopupStyleTypeEnum.window, "<init>", "(Ll/qjq;Landroid/view/View;Landroid/view/Window;)V", "", StudentVerRejectedReason.startTime, "uiDuration", "expectedDuration", "Landroid/view/FrameMetrics;", "frameMetrics", "", "isJank", "Ll/s3j;", BLiveStormDanmakuGiftResourceType.f44446s, "(JJJLandroid/view/FrameMetrics;Z)Ll/s3j;", "metrics", "k", "(Landroid/view/FrameMetrics;)J", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class vjq extends ujq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjq(@NotNull qjq qjqVar, @NotNull View view, @NotNull Window window) {
        super(qjqVar, view, window);
        qjqVar.getClass();
        view.getClass();
        window.getClass();
    }

    @Override // p149l.tjq
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public long mo189399k(@NotNull FrameMetrics metrics) {
        metrics.getClass();
        return metrics.getMetric(13);
    }

    @Override // p149l.tjq
    @SuppressLint({"WrongConstant"})
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public s3j mo189400l(long startTime, long uiDuration, long expectedDuration, @NotNull FrameMetrics frameMetrics, boolean isJank) {
        List<StateInfo> listEmptyList;
        frameMetrics.getClass();
        gj60 state = getMetricsStateHolder().getState();
        if (state == null || (listEmptyList = state.m126459c(startTime, startTime + uiDuration)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new s3j(startTime, uiDuration, frameMetrics.getMetric(6) + uiDuration + frameMetrics.getMetric(7), frameMetrics.getMetric(8) - frameMetrics.getMetric(13), isJank, listEmptyList);
    }
}
