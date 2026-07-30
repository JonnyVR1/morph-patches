package p153l;

import android.os.Build;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.p052rx.rxthread.FastIoScheduler;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
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
public class sdh0 {
    /* JADX INFO: renamed from: a */
    public static void m185464a() {
        uqi.m197339f(LaunchStep.SvgaInit);
        try {
            SVGAConfig.Builder builder = new SVGAConfig.Builder();
            int i = Build.VERSION.SDK_INT;
            builder.setMemoryCacheSize(i >= 26 ? 52428800L : 26214400L).setDiskCacheSize(52428800L).setInSampleSize(i >= 26 ? 1 : 2).setFastIoExecutor(FastIoScheduler.f16348a).setIoExecutor(whi0.m206362i().mo119713a());
            SVGA.init(App.f16088e, builder.setLoadResourceListener(new C20021b()).setTrackerListener(new C20020a()).setDiskCacheDir(App.f16088e.getFilesDir()).enableCacheTrace(false).setDebug(false).build());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        uqi.m197337d(LaunchStep.SvgaInit);
    }

    /* JADX INFO: renamed from: l.sdh0$b */
    public class C20021b implements LoadResourceListener {
        @Override // com.tantan.library.svga.LoadResourceListener
        public void onFailed(@NonNull String str, @NonNull SVGAException sVGAException) {
            CrashHelper.m82479c(sVGAException);
        }

        @Override // com.tantan.library.svga.LoadResourceListener
        public void onSuccess(@NonNull String str) {
        }
    }

    /* JADX INFO: renamed from: l.sdh0$a */
    public class C20020a implements CacheTrackerListener {
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
