package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes13.dex */
public interface cul {
    /* JADX INFO: renamed from: a */
    PullWatchInfo mo108789a();

    /* JADX INFO: renamed from: b */
    void mo108790b(boolean z);

    /* JADX INFO: renamed from: c */
    void mo108791c(@NotNull bul bulVar);

    /* JADX INFO: renamed from: d */
    void mo108792d(FrameLayout frameLayout);

    /* JADX INFO: renamed from: e */
    boolean mo108793e();

    /* JADX INFO: renamed from: f */
    void mo108794f(FrameLayout frameLayout);

    /* JADX INFO: renamed from: g */
    void mo108795g(boolean z);

    /* JADX INFO: renamed from: h */
    void mo108796h(bul bulVar);

    /* JADX INFO: renamed from: i */
    String mo108797i();

    boolean isPlaying();

    /* JADX INFO: renamed from: j */
    void mo108798j(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5);

    /* JADX INFO: renamed from: k */
    float mo108799k();

    /* JADX INFO: renamed from: l */
    void mo108800l(String str, String str2, BLiveAbsData bLiveAbsData);

    void reset();

    void setMute(boolean z);
}
