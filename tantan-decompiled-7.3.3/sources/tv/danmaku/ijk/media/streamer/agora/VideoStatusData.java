package tv.danmaku.ijk.media.streamer.agora;

import android.view.SurfaceView;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public class VideoStatusData {

    /* JADX INFO: renamed from: a */
    public int f209784a;

    /* JADX INFO: renamed from: b */
    public SoftReference<SurfaceView> f209785b;

    /* JADX INFO: renamed from: c */
    public int f209786c;

    /* JADX INFO: renamed from: d */
    public int f209787d;

    public String toString() {
        return "VideoStatusData{mUid=" + this.f209784a + ", mView=" + this.f209785b + ", mStatus=" + this.f209786c + ", mVolume=" + this.f209787d + '}';
    }
}
