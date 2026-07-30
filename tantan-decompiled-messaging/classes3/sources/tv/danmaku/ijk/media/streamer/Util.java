package tv.danmaku.ijk.media.streamer;

import android.hardware.Camera;
import java.io.File;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Util {

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.streamer.Util$1 */
    class RunnableC13121 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12459a;

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(this.f12459a);
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        }
    }

    public static class ResolutionComparator implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            int i = size.width;
            int i2 = size2.width;
            return i != i2 ? i - i2 : size.height - size2.height;
        }
    }

    public enum ScaleType {
        CENTER_INSIDE,
        CENTER_CROP
    }

    /* JADX INFO: renamed from: a */
    public static List<Camera.Size> m11267a(Camera camera) {
        return camera.getParameters().getSupportedPreviewSizes();
    }

    /* JADX INFO: renamed from: b */
    public static long m11268b(long j) {
        return (long) ((j / 4) / 0.0441d);
    }
}
