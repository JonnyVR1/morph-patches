package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes13.dex */
public interface qwl {
    /* JADX INFO: renamed from: a */
    PullWatchInfo mo178521a();

    /* JADX INFO: renamed from: b */
    void mo178522b(boolean z);

    /* JADX INFO: renamed from: c */
    void mo178523c(@NotNull pwl pwlVar);

    /* JADX INFO: renamed from: d */
    void mo178524d(FrameLayout frameLayout);

    /* JADX INFO: renamed from: e */
    boolean mo178525e();

    /* JADX INFO: renamed from: f */
    void mo178526f(FrameLayout frameLayout);

    /* JADX INFO: renamed from: g */
    void mo178527g(boolean z);

    /* JADX INFO: renamed from: h */
    void mo178528h(pwl pwlVar);

    /* JADX INFO: renamed from: i */
    String mo178529i();

    boolean isPlaying();

    /* JADX INFO: renamed from: j */
    void mo178530j(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5);

    /* JADX INFO: renamed from: k */
    float mo178531k();

    /* JADX INFO: renamed from: l */
    void mo178532l(String str, String str2, BLiveAbsData bLiveAbsData);

    void reset();

    void setMute(boolean z);
}
