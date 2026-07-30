package p149l;

import android.os.Build;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.p047rx.rxthread.FastIoScheduler;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.LoadResourceListener;
import com.tantan.library.svga.SVGA;
import com.tantan.library.svga.SVGAConfig;
import com.tantan.library.svga.data.cache.Key;
import com.tantan.library.svga.exception.SVGAException;
import com.tantan.library.svga.tracker.CacheTrackerListener;
import com.tantan.library.svga.tracker.CacheType;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public class k5h0 {
    /* JADX INFO: renamed from: a */
    public static void m144540a() {
        yni.m215417f(LaunchStep.SvgaInit);
        try {
            SVGAConfig.Builder builder = new SVGAConfig.Builder();
            int i = Build.VERSION.SDK_INT;
            builder.setMemoryCacheSize(i >= 26 ? 52428800L : 26214400L).setDiskCacheSize(52428800L).setInSampleSize(i >= 26 ? 1 : 2).setFastIoExecutor(FastIoScheduler.f15629a).setIoExecutor(w8i0.m202177i().mo162607a());
            SVGA.init(App.f15369e, builder.setLoadResourceListener(new C17930b()).setTrackerListener(new C17929a()).setDiskCacheDir(App.f15369e.getFilesDir()).enableCacheTrace(false).setDebug(false).build());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        yni.m215415d(LaunchStep.SvgaInit);
    }

    /* JADX INFO: renamed from: l.k5h0$b */
    public class C17930b implements LoadResourceListener {
        @Override // com.tantan.library.svga.LoadResourceListener
        public void onFailed(@NonNull String str, @NonNull SVGAException sVGAException) {
            CrashHelper.m81296c(sVGAException);
        }

        @Override // com.tantan.library.svga.LoadResourceListener
        public void onSuccess(@NonNull String str) {
        }
    }

    /* JADX INFO: renamed from: l.k5h0$a */
    public class C17929a implements CacheTrackerListener {
        @Override // com.tantan.library.svga.tracker.CacheTrackerListener
        public void onCacheHit(@NonNull CacheType cacheType, @NonNull Key key) {
        }

        @Override // com.tantan.library.svga.tracker.CacheTrackerListener
        public void onCacheMiss(@NonNull CacheType cacheType, @NonNull Key key) {
        }

        @Override // com.tantan.library.svga.tracker.CacheTrackerListener
        public void onCacheRemoved(@NonNull CacheType cacheType, @NonNull Key key) {
        }

        @Override // com.tantan.library.svga.tracker.CacheTrackerListener
        public void onCachePut(@NonNull CacheType cacheType, @NonNull Key key, @NonNull Pair<Long, Long> pair) {
        }
    }
}
