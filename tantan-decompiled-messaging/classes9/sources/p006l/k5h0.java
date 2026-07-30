package p006l;

import android.os.Build;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.rx.rxthread.FastIoScheduler;
import com.p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.LoadResourceListener;
import com.tantan.library.svga.SVGA;
import com.tantan.library.svga.SVGAConfig;
import com.tantan.library.svga.data.cache.Key;
import com.tantan.library.svga.exception.SVGAException;
import com.tantan.library.svga.tracker.CacheTrackerListener;
import com.tantan.library.svga.tracker.CacheType;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Pair;
import l.w8i0;
import l.yni;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class k5h0 {
    /* JADX INFO: renamed from: a */
    public static void m17941a() {
        yni.f(new LaunchStep[]{LaunchStep.SvgaInit});
        try {
            SVGAConfig.Builder builder = new SVGAConfig.Builder();
            int i = Build.VERSION.SDK_INT;
            builder.setMemoryCacheSize(i >= 26 ? 52428800L : 26214400L).setDiskCacheSize(52428800L).setInSampleSize(i >= 26 ? 1 : 2).setFastIoExecutor(FastIoScheduler.a).setIoExecutor(w8i0.i().a());
            SVGA.init(App.e, builder.setLoadResourceListener(new C0918b()).setTrackerListener(new C0917a()).setDiskCacheDir(App.e.getFilesDir()).enableCacheTrace(false).setDebug(false).build());
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        yni.d(LaunchStep.SvgaInit);
    }

    /* JADX INFO: renamed from: l.k5h0$b */
    public class C0918b implements LoadResourceListener {
        public void onFailed(@NonNull String str, @NonNull SVGAException sVGAException) {
            CrashHelper.c(sVGAException);
        }

        public void onSuccess(@NonNull String str) {
        }
    }

    /* JADX INFO: renamed from: l.k5h0$a */
    public class C0917a implements CacheTrackerListener {
        public void onCacheHit(@NonNull CacheType cacheType, @NonNull Key key) {
        }

        public void onCacheMiss(@NonNull CacheType cacheType, @NonNull Key key) {
        }

        public void onCacheRemoved(@NonNull CacheType cacheType, @NonNull Key key) {
        }

        public void onCachePut(@NonNull CacheType cacheType, @NonNull Key key, @NonNull Pair<Long, Long> pair) {
        }
    }
}
