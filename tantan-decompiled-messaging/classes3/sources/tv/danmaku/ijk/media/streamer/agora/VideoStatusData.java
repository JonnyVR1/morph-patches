package tv.danmaku.ijk.media.streamer.agora;

import android.view.SurfaceView;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VideoStatusData {

    /* JADX INFO: renamed from: a */
    public int f12487a;

    /* JADX INFO: renamed from: b */
    public SoftReference<SurfaceView> f12488b;

    /* JADX INFO: renamed from: c */
    public int f12489c;

    /* JADX INFO: renamed from: d */
    public int f12490d;

    public String toString() {
        return "VideoStatusData{mUid=" + this.f12487a + ", mView=" + this.f12488b + ", mStatus=" + this.f12489c + ", mVolume=" + this.f12490d + '}';
    }
}
