package p153l;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Ll/eq0;", "", "<init>", "()V", "Ll/xc80;", "platformBitmapFactory", "Ll/d7f;", "executorSupplier", "Ll/hsb;", "Ll/by3;", "Ll/db5;", "backingCache", "", "downscaleFrameToDrawableDimensions", "useBalancedAnimationStrategy", "", "animationFpsLimit", "bufferLengthMilliseconds", "Ljava/util/concurrent/ExecutorService;", "serialExecutorService", "Ll/dq0;", "a", "(Ll/xc80;Ll/d7f;Ll/hsb;ZZIILjava/util/concurrent/ExecutorService;)Ll/dq0;", "Z", "implLoaded", "b", "Ll/dq0;", "impl", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class eq0 {

    @NotNull
    public static final eq0 INSTANCE = new eq0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean implLoaded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static dq0 impl;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final dq0 m121887a(@Nullable xc80 platformBitmapFactory, @Nullable d7f executorSupplier, @Nullable hsb<by3, db5> backingCache, boolean downscaleFrameToDrawableDimensions, boolean useBalancedAnimationStrategy, int animationFpsLimit, int bufferLengthMilliseconds, @Nullable ExecutorService serialExecutorService) {
        if (!implLoaded) {
            try {
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                Object objNewInstance = AnimatedFactoryV2Impl.class.getConstructor(xc80.class, d7f.class, hsb.class, cls, cls, cls2, cls2, vqe0.class).newInstance(platformBitmapFactory, executorSupplier, backingCache, Boolean.valueOf(downscaleFrameToDrawableDimensions), Boolean.valueOf(useBalancedAnimationStrategy), Integer.valueOf(animationFpsLimit), Integer.valueOf(bufferLengthMilliseconds), serialExecutorService);
                objNewInstance.getClass();
                impl = (dq0) objNewInstance;
            } catch (Throwable unused) {
            }
            if (impl != null) {
                implLoaded = true;
            }
        }
        return impl;
    }
}
