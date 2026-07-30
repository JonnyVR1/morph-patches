package p149l;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m87232d2 = {"Ll/iq0;", "", "<init>", "()V", "Ll/r480;", "platformBitmapFactory", "Ll/x5f;", "executorSupplier", "Ll/tqb;", "Ll/cx3;", "Ll/da5;", "backingCache", "", "downscaleFrameToDrawableDimensions", "useBalancedAnimationStrategy", "", "animationFpsLimit", "bufferLengthMilliseconds", "Ljava/util/concurrent/ExecutorService;", "serialExecutorService", "Ll/hq0;", "a", "(Ll/r480;Ll/x5f;Ll/tqb;ZZIILjava/util/concurrent/ExecutorService;)Ll/hq0;", "Z", "implLoaded", "b", "Ll/hq0;", "impl", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class iq0 {

    @NotNull
    public static final iq0 INSTANCE = new iq0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean implLoaded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static hq0 impl;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final hq0 m137609a(@Nullable r480 platformBitmapFactory, @Nullable x5f executorSupplier, @Nullable tqb<cx3, da5> backingCache, boolean downscaleFrameToDrawableDimensions, boolean useBalancedAnimationStrategy, int animationFpsLimit, int bufferLengthMilliseconds, @Nullable ExecutorService serialExecutorService) {
        if (!implLoaded) {
            try {
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                Object objNewInstance = AnimatedFactoryV2Impl.class.getConstructor(r480.class, x5f.class, tqb.class, cls, cls, cls2, cls2, qie0.class).newInstance(platformBitmapFactory, executorSupplier, backingCache, Boolean.valueOf(downscaleFrameToDrawableDimensions), Boolean.valueOf(useBalancedAnimationStrategy), Integer.valueOf(animationFpsLimit), Integer.valueOf(bufferLengthMilliseconds), serialExecutorService);
                objNewInstance.getClass();
                impl = (hq0) objNewInstance;
            } catch (Throwable unused) {
            }
            if (impl != null) {
                implLoaded = true;
            }
        }
        return impl;
    }
}
