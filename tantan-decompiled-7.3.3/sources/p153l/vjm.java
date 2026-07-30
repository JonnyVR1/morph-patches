package p153l;

import android.content.Context;
import com.facebook.common.memory.PooledByteBuffer;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class vjm {

    /* JADX INFO: renamed from: p */
    public static final Class<?> f184409p = vjm.class;

    /* JADX INFO: renamed from: q */
    public static vjm f184410q;

    /* JADX INFO: renamed from: r */
    public static rjm f184411r;

    /* JADX INFO: renamed from: s */
    public static boolean f184412s;

    /* JADX INFO: renamed from: a */
    public final oxi0 f184413a;

    /* JADX INFO: renamed from: b */
    public final tjm f184414b;

    /* JADX INFO: renamed from: c */
    public final gb5 f184415c;

    /* JADX INFO: renamed from: d */
    public final a7h0<g4e> f184416d;

    /* JADX INFO: renamed from: e */
    public hsb<by3, db5> f184417e;

    /* JADX INFO: renamed from: f */
    public hym<by3, db5> f184418f;

    /* JADX INFO: renamed from: g */
    public hsb<by3, PooledByteBuffer> f184419g;

    /* JADX INFO: renamed from: h */
    public hym<by3, PooledByteBuffer> f184420h;

    /* JADX INFO: renamed from: i */
    public shm f184421i;

    /* JADX INFO: renamed from: j */
    public xkm f184422j;

    /* JADX INFO: renamed from: k */
    public bl90 f184423k;

    /* JADX INFO: renamed from: l */
    public xl90 f184424l;

    /* JADX INFO: renamed from: m */
    public xc80 f184425m;

    /* JADX INFO: renamed from: n */
    public zc80 f184426n;

    /* JADX INFO: renamed from: o */
    public dq0 f184427o;

    public vjm(tjm tjmVar) {
        if (i9j.m139099d()) {
            i9j.m139097a("ImagePipelineConfig()");
        }
        tjm tjmVar2 = (tjm) wn80.m207182g(tjmVar);
        this.f184414b = tjmVar2;
        this.f184413a = tjmVar2.getExperiments().getIsExperimentalThreadHandoffQueueEnabled() ? new tof(tjmVar.getExecutorSupplier().getLightWeightBackgroundExecutor()) : new pxi0(tjmVar.getExecutorSupplier().getLightWeightBackgroundExecutor());
        this.f184415c = new gb5(tjmVar.getCloseableReferenceLeakTracker());
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
        this.f184416d = tjmVar2.mo186171A();
    }

    /* JADX INFO: renamed from: m */
    public static vjm m201527m() {
        return (vjm) wn80.m207183h(f184410q, "ImagePipelineFactory was not initialized!");
    }

    /* JADX INFO: renamed from: r */
    public static synchronized void m201528r(Context context) {
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("ImagePipelineFactory#initialize");
            }
            m201529s(sjm.m186170K(context).m186231a());
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public static synchronized void m201529s(tjm tjmVar) {
        if (f184410q != null) {
            huf.m137193u(f184409p, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            if (f184412s) {
                return;
            }
        }
        f184410q = new vjm(tjmVar);
    }

    /* JADX INFO: renamed from: a */
    public final rjm m201530a() {
        xl90 xl90VarM201545q = m201545q();
        Set<j2d0> setMo186195q = this.f184414b.mo186195q();
        Set<k2d0> setMo186179a = this.f184414b.mo186179a();
        a7h0<Boolean> a7h0VarMo186190l = this.f184414b.mo186190l();
        hym<by3, db5> hymVarM201534e = m201534e();
        hym<by3, PooledByteBuffer> hymVarM201538i = m201538i();
        a7h0<g4e> a7h0Var = this.f184416d;
        cy3 cacheKeyFactory = this.f184414b.getCacheKeyFactory();
        oxi0 oxi0Var = this.f184413a;
        a7h0<Boolean> a7h0VarM196406u = this.f184414b.getExperiments().m196406u();
        a7h0<Boolean> a7h0VarM196382I = this.f184414b.getExperiments().m196382I();
        this.f184414b.mo186177G();
        return new rjm(xl90VarM201545q, setMo186195q, setMo186179a, a7h0VarMo186190l, hymVarM201534e, hymVarM201538i, a7h0Var, cacheKeyFactory, oxi0Var, a7h0VarM196406u, a7h0VarM196382I, null, this.f184414b);
    }

    /* JADX INFO: renamed from: b */
    public rce m201531b(Context context) {
        dq0 dq0VarM201532c = m201532c();
        if (dq0VarM201532c == null) {
            return null;
        }
        return dq0VarM201532c.mo8423a(context);
    }

    /* JADX INFO: renamed from: c */
    public final dq0 m201532c() {
        if (this.f184427o == null) {
            this.f184427o = eq0.m121887a(m201542n(), this.f184414b.getExecutorSupplier(), m201533d(), this.f184414b.getExperiments().getDownscaleFrameToDrawableDimensions(), this.f184414b.getExperiments().getUseBalancedAnimationStrategy(), this.f184414b.getExperiments().getAnimationRenderFpsLimit(), this.f184414b.getExperiments().getAnimationStrategyBufferLengthMilliseconds(), this.f184414b.getExecutorServiceForAnimatedImages());
        }
        return this.f184427o;
    }

    /* JADX INFO: renamed from: d */
    public hsb<by3, db5> m201533d() {
        if (this.f184417e == null) {
            this.f184417e = this.f184414b.getBitmapMemoryCacheFactory().mo127072a(this.f184414b.mo186203y(), this.f184414b.getMemoryTrimmableRegistry(), this.f184414b.getBitmapMemoryCacheTrimStrategy(), this.f184414b.getExperiments().getShouldStoreCacheEntrySize(), this.f184414b.getExperiments().getShouldIgnoreCacheSizeMismatch(), this.f184414b.mo186183e());
        }
        return this.f184417e;
    }

    /* JADX INFO: renamed from: e */
    public hym<by3, db5> m201534e() {
        if (this.f184418f == null) {
            this.f184418f = iym.m142707a(m201533d(), this.f184414b.getImageCacheStatsTracker());
        }
        return this.f184418f;
    }

    /* JADX INFO: renamed from: f */
    public gb5 m201535f() {
        return this.f184415c;
    }

    /* JADX INFO: renamed from: g */
    public a7h0<g4e> m201536g() {
        return this.f184416d;
    }

    /* JADX INFO: renamed from: h */
    public hsb<by3, PooledByteBuffer> m201537h() {
        if (this.f184419g == null) {
            this.f184419g = m0f.m156511a(this.f184414b.mo186186h(), this.f184414b.getMemoryTrimmableRegistry(), this.f184414b.getEncodedMemoryCacheTrimStrategy());
        }
        return this.f184419g;
    }

    /* JADX INFO: renamed from: i */
    public hym<by3, PooledByteBuffer> m201538i() {
        if (this.f184420h == null) {
            this.f184420h = p0f.m170052a(this.f184414b.mo186180b() != null ? this.f184414b.mo186180b() : m201537h(), this.f184414b.getImageCacheStatsTracker());
        }
        return this.f184420h;
    }

    /* JADX INFO: renamed from: j */
    public final shm m201539j() {
        shm shmVarMo8425c;
        shm shmVarMo8424b;
        if (this.f184421i == null) {
            if (this.f184414b.getImageDecoder() != null) {
                this.f184421i = this.f184414b.getImageDecoder();
            } else {
                dq0 dq0VarM201532c = m201532c();
                if (dq0VarM201532c != null) {
                    shmVarMo8425c = dq0VarM201532c.mo8425c();
                    shmVarMo8424b = dq0VarM201532c.mo8424b();
                } else {
                    shmVarMo8425c = null;
                    shmVarMo8424b = null;
                }
                this.f184414b.mo186202x();
                this.f184421i = new npd(shmVarMo8425c, shmVarMo8424b, m201543o());
            }
        }
        return this.f184421i;
    }

    /* JADX INFO: renamed from: k */
    public rjm m201540k() {
        if (f184411r == null) {
            f184411r = m201530a();
        }
        return f184411r;
    }

    /* JADX INFO: renamed from: l */
    public final xkm m201541l() {
        if (this.f184422j == null) {
            if (this.f184414b.getImageTranscoderFactory() == null && this.f184414b.getImageTranscoderType() == null && this.f184414b.getExperiments().getIsNativeCodeDisabled()) {
                this.f184422j = new apf0(this.f184414b.getExperiments().getMaxBitmapDimension());
            } else {
                this.f184422j = new fs10(this.f184414b.getExperiments().getMaxBitmapDimension(), this.f184414b.getExperiments().getUseDownsamplingRatioForResizing(), this.f184414b.getImageTranscoderFactory(), this.f184414b.getImageTranscoderType(), this.f184414b.getExperiments().getIsEnsureTranscoderLibraryLoaded());
            }
        }
        return this.f184422j;
    }

    /* JADX INFO: renamed from: n */
    public xc80 m201542n() {
        if (this.f184425m == null) {
            this.f184425m = yc80.m215141a(this.f184414b.getPoolFactory(), m201543o(), m201535f());
        }
        return this.f184425m;
    }

    /* JADX INFO: renamed from: o */
    public zc80 m201543o() {
        if (this.f184426n == null) {
            this.f184426n = ad80.m97063a(this.f184414b.getPoolFactory(), this.f184414b.getExperiments().getIsGingerbreadDecoderEnabled(), this.f184414b.getExperiments().getShouldUseDecodingBufferHelper(), this.f184414b.getExperiments().getPlatformDecoderOptions());
        }
        return this.f184426n;
    }

    /* JADX INFO: renamed from: p */
    public final bl90 m201544p() {
        if (this.f184423k == null) {
            this.f184423k = this.f184414b.getExperiments().getProducerFactoryMethod().mo196413a(this.f184414b.getContext(), this.f184414b.getPoolFactory().m98365k(), m201539j(), this.f184414b.getProgressiveJpegConfig(), this.f184414b.getDownsampleMode(), this.f184414b.getIsResizeAndRotateEnabledForNetwork(), this.f184414b.getExperiments().getIsDecodeCancellationEnabled(), this.f184414b.getExecutorSupplier(), this.f184414b.getPoolFactory().m98363i(this.f184414b.getMemoryChunkType()), this.f184414b.getPoolFactory().m98364j(), m201534e(), m201538i(), this.f184416d, this.f184414b.getCacheKeyFactory(), m201542n(), this.f184414b.getExperiments().getBitmapPrepareToDrawMinSizeBytes(), this.f184414b.getExperiments().getBitmapPrepareToDrawMaxSizeBytes(), this.f184414b.getExperiments().getBitmapPrepareToDrawForPrefetch(), this.f184414b.getExperiments().getMaxBitmapDimension(), m201535f(), this.f184414b.getExperiments().getKeepCancelledFetchAsLowPriority(), this.f184414b.getExperiments().getTrackedKeysSize());
        }
        return this.f184423k;
    }

    /* JADX INFO: renamed from: q */
    public final xl90 m201545q() {
        boolean useBitmapPrepareToDraw = this.f184414b.getExperiments().getUseBitmapPrepareToDraw();
        if (this.f184424l == null) {
            this.f184424l = new xl90(this.f184414b.getContext().getApplicationContext().getContentResolver(), m201544p(), this.f184414b.mo186193o(), this.f184414b.getIsResizeAndRotateEnabledForNetwork(), this.f184414b.getExperiments().getIsWebpSupportEnabled(), this.f184413a, this.f184414b.getDownsampleMode(), useBitmapPrepareToDraw, this.f184414b.getExperiments().getIsPartialImageCachingEnabled(), this.f184414b.getIsDiskCacheEnabled(), m201541l(), this.f184414b.getExperiments().getIsEncodedMemoryCacheProbingEnabled(), this.f184414b.getExperiments().getIsDiskCacheProbingEnabled(), this.f184414b.getExperiments().getAllowDelay(), this.f184414b.mo186175E());
        }
        return this.f184424l;
    }
}
