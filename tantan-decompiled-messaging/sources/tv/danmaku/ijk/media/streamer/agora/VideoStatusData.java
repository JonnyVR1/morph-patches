package tv.danmaku.ijk.media.streamer.agora;

import android.view.SurfaceView;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public class VideoStatusData {

    /* JADX INFO: renamed from: a */
    public int f208862a;

    /* JADX INFO: renamed from: b */
    public SoftReference<SurfaceView> f208863b;

    /* JADX INFO: renamed from: c */
    public int f208864c;

    /* JADX INFO: renamed from: d */
    public int f208865d;

    public String toString() {
        return "VideoStatusData{mUid=" + this.f208862a + ", mView=" + this.f208863b + ", mStatus=" + this.f208864c + ", mVolume=" + this.f208865d + '}';
    }
}
