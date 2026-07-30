package p149l;

import android.content.Context;
import com.facebook.common.memory.PooledByteBuffer;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class shm {

    /* JADX INFO: renamed from: p */
    public static final Class<?> f164597p = shm.class;

    /* JADX INFO: renamed from: q */
    public static shm f164598q;

    /* JADX INFO: renamed from: r */
    public static ohm f164599r;

    /* JADX INFO: renamed from: s */
    public static boolean f164600s;

    /* JADX INFO: renamed from: a */
    public final moi0 f164601a;

    /* JADX INFO: renamed from: b */
    public final qhm f164602b;

    /* JADX INFO: renamed from: c */
    public final ga5 f164603c;

    /* JADX INFO: renamed from: d */
    public final syg0<s2e> f164604d;

    /* JADX INFO: renamed from: e */
    public tqb<cx3, da5> f164605e;

    /* JADX INFO: renamed from: f */
    public gwm<cx3, da5> f164606f;

    /* JADX INFO: renamed from: g */
    public tqb<cx3, PooledByteBuffer> f164607g;

    /* JADX INFO: renamed from: h */
    public gwm<cx3, PooledByteBuffer> f164608h;

    /* JADX INFO: renamed from: i */
    public cfm f164609i;

    /* JADX INFO: renamed from: j */
    public uim f164610j;

    /* JADX INFO: renamed from: k */
    public xc90 f164611k;

    /* JADX INFO: renamed from: l */
    public td90 f164612l;

    /* JADX INFO: renamed from: m */
    public r480 f164613m;

    /* JADX INFO: renamed from: n */
    public t480 f164614n;

    /* JADX INFO: renamed from: o */
    public hq0 f164615o;

    public shm(qhm qhmVar) {
        if (o6j.m162852d()) {
            o6j.m162850a("ImagePipelineConfig()");
        }
        qhm qhmVar2 = (qhm) rf80.m179116g(qhmVar);
        this.f164602b = qhmVar2;
        this.f164601a = qhmVar2.getExperiments().getIsExperimentalThreadHandoffQueueEnabled() ? new mnf(qhmVar.getExecutorSupplier().getLightWeightBackgroundExecutor()) : new noi0(qhmVar.getExecutorSupplier().getLightWeightBackgroundExecutor());
        this.f164603c = new ga5(qhmVar.getCloseableReferenceLeakTracker());
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
        this.f164604d = qhmVar2.mo168980A();
    }

    /* JADX INFO: renamed from: m */
    public static shm m184242m() {
        return (shm) rf80.m179117h(f164598q, "ImagePipelineFactory was not initialized!");
    }

    /* JADX INFO: renamed from: r */
    public static synchronized void m184243r(Context context) {
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("ImagePipelineFactory#initialize");
            }
            m184244s(phm.m168979K(context).m169040a());
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public static synchronized void m184244s(qhm qhmVar) {
        if (f164598q != null) {
            tsf.m190555u(f164597p, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            if (f164600s) {
                return;
            }
        }
        f164598q = new shm(qhmVar);
    }

    /* JADX INFO: renamed from: a */
    public final ohm m184245a() {
        td90 td90VarM184260q = m184260q();
        Set<guc0> setMo169004q = this.f164602b.mo169004q();
        Set<huc0> setMo168988a = this.f164602b.mo168988a();
        syg0<Boolean> syg0VarMo168999l = this.f164602b.mo168999l();
        gwm<cx3, da5> gwmVarM184249e = m184249e();
        gwm<cx3, PooledByteBuffer> gwmVarM184253i = m184253i();
        syg0<s2e> syg0Var = this.f164604d;
        dx3 cacheKeyFactory = this.f164602b.getCacheKeyFactory();
        moi0 moi0Var = this.f164601a;
        syg0<Boolean> syg0VarM179420u = this.f164602b.getExperiments().m179420u();
        syg0<Boolean> syg0VarM179396I = this.f164602b.getExperiments().m179396I();
        this.f164602b.mo168986G();
        return new ohm(td90VarM184260q, setMo169004q, setMo168988a, syg0VarMo168999l, gwmVarM184249e, gwmVarM184253i, syg0Var, cacheKeyFactory, moi0Var, syg0VarM179420u, syg0VarM179396I, null, this.f164602b);
    }

    /* JADX INFO: renamed from: b */
    public nbe m184246b(Context context) {
        hq0 hq0VarM184247c = m184247c();
        if (hq0VarM184247c == null) {
            return null;
        }
        return hq0VarM184247c.mo8369a(context);
    }

    /* JADX INFO: renamed from: c */
    public final hq0 m184247c() {
        if (this.f164615o == null) {
            this.f164615o = iq0.m137609a(m184257n(), this.f164602b.getExecutorSupplier(), m184248d(), this.f164602b.getExperiments().getDownscaleFrameToDrawableDimensions(), this.f164602b.getExperiments().getUseBalancedAnimationStrategy(), this.f164602b.getExperiments().getAnimationRenderFpsLimit(), this.f164602b.getExperiments().getAnimationStrategyBufferLengthMilliseconds(), this.f164602b.getExecutorServiceForAnimatedImages());
        }
        return this.f164615o;
    }

    /* JADX INFO: renamed from: d */
    public tqb<cx3, da5> m184248d() {
        if (this.f164605e == null) {
            this.f164605e = this.f164602b.getBitmapMemoryCacheFactory().mo180409a(this.f164602b.mo169012y(), this.f164602b.getMemoryTrimmableRegistry(), this.f164602b.getBitmapMemoryCacheTrimStrategy(), this.f164602b.getExperiments().getShouldStoreCacheEntrySize(), this.f164602b.getExperiments().getShouldIgnoreCacheSizeMismatch(), this.f164602b.mo168992e());
        }
        return this.f164605e;
    }

    /* JADX INFO: renamed from: e */
    public gwm<cx3, da5> m184249e() {
        if (this.f164606f == null) {
            this.f164606f = hwm.m133252a(m184248d(), this.f164602b.getImageCacheStatsTracker());
        }
        return this.f164606f;
    }

    /* JADX INFO: renamed from: f */
    public ga5 m184250f() {
        return this.f164603c;
    }

    /* JADX INFO: renamed from: g */
    public syg0<s2e> m184251g() {
        return this.f164604d;
    }

    /* JADX INFO: renamed from: h */
    public tqb<cx3, PooledByteBuffer> m184252h() {
        if (this.f164607g == null) {
            this.f164607g = ize.m139041a(this.f164602b.mo168995h(), this.f164602b.getMemoryTrimmableRegistry(), this.f164602b.getEncodedMemoryCacheTrimStrategy());
        }
        return this.f164607g;
    }

    /* JADX INFO: renamed from: i */
    public gwm<cx3, PooledByteBuffer> m184253i() {
        if (this.f164608h == null) {
            this.f164608h = lze.m152344a(this.f164602b.mo168989b() != null ? this.f164602b.mo168989b() : m184252h(), this.f164602b.getImageCacheStatsTracker());
        }
        return this.f164608h;
    }

    /* JADX INFO: renamed from: j */
    public final cfm m184254j() {
        cfm cfmVarMo8371c;
        cfm cfmVarMo8370b;
        if (this.f164609i == null) {
            if (this.f164602b.getImageDecoder() != null) {
                this.f164609i = this.f164602b.getImageDecoder();
            } else {
                hq0 hq0VarM184247c = m184247c();
                if (hq0VarM184247c != null) {
                    cfmVarMo8371c = hq0VarM184247c.mo8371c();
                    cfmVarMo8370b = hq0VarM184247c.mo8370b();
                } else {
                    cfmVarMo8371c = null;
                    cfmVarMo8370b = null;
                }
                this.f164602b.mo169011x();
                this.f164609i = new iod(cfmVarMo8371c, cfmVarMo8370b, m184258o());
            }
        }
        return this.f164609i;
    }

    /* JADX INFO: renamed from: k */
    public ohm m184255k() {
        if (f164599r == null) {
            f164599r = m184245a();
        }
        return f164599r;
    }

    /* JADX INFO: renamed from: l */
    public final uim m184256l() {
        if (this.f164610j == null) {
            if (this.f164602b.getImageTranscoderFactory() == null && this.f164602b.getImageTranscoderType() == null && this.f164602b.getExperiments().getIsNativeCodeDisabled()) {
                this.f164610j = new sgf0(this.f164602b.getExperiments().getMaxBitmapDimension());
            } else {
                this.f164610j = new vj10(this.f164602b.getExperiments().getMaxBitmapDimension(), this.f164602b.getExperiments().getUseDownsamplingRatioForResizing(), this.f164602b.getImageTranscoderFactory(), this.f164602b.getImageTranscoderType(), this.f164602b.getExperiments().getIsEnsureTranscoderLibraryLoaded());
            }
        }
        return this.f164610j;
    }

    /* JADX INFO: renamed from: n */
    public r480 m184257n() {
        if (this.f164613m == null) {
            this.f164613m = s480.m182214a(this.f164602b.getPoolFactory(), m184258o(), m184250f());
        }
        return this.f164613m;
    }

    /* JADX INFO: renamed from: o */
    public t480 m184258o() {
        if (this.f164614n == null) {
            this.f164614n = u480.m191720a(this.f164602b.getPoolFactory(), this.f164602b.getExperiments().getIsGingerbreadDecoderEnabled(), this.f164602b.getExperiments().getShouldUseDecodingBufferHelper(), this.f164602b.getExperiments().getPlatformDecoderOptions());
        }
        return this.f164614n;
    }

    /* JADX INFO: renamed from: p */
    public final xc90 m184259p() {
        if (this.f164611k == null) {
            this.f164611k = this.f164602b.getExperiments().getProducerFactoryMethod().mo179427a(this.f164602b.getContext(), this.f164602b.getPoolFactory().m192746k(), m184254j(), this.f164602b.getProgressiveJpegConfig(), this.f164602b.getDownsampleMode(), this.f164602b.getIsResizeAndRotateEnabledForNetwork(), this.f164602b.getExperiments().getIsDecodeCancellationEnabled(), this.f164602b.getExecutorSupplier(), this.f164602b.getPoolFactory().m192744i(this.f164602b.getMemoryChunkType()), this.f164602b.getPoolFactory().m192745j(), m184249e(), m184253i(), this.f164604d, this.f164602b.getCacheKeyFactory(), m184257n(), this.f164602b.getExperiments().getBitmapPrepareToDrawMinSizeBytes(), this.f164602b.getExperiments().getBitmapPrepareToDrawMaxSizeBytes(), this.f164602b.getExperiments().getBitmapPrepareToDrawForPrefetch(), this.f164602b.getExperiments().getMaxBitmapDimension(), m184250f(), this.f164602b.getExperiments().getKeepCancelledFetchAsLowPriority(), this.f164602b.getExperiments().getTrackedKeysSize());
        }
        return this.f164611k;
    }

    /* JADX INFO: renamed from: q */
    public final td90 m184260q() {
        boolean useBitmapPrepareToDraw = this.f164602b.getExperiments().getUseBitmapPrepareToDraw();
        if (this.f164612l == null) {
            this.f164612l = new td90(this.f164602b.getContext().getApplicationContext().getContentResolver(), m184259p(), this.f164602b.mo169002o(), this.f164602b.getIsResizeAndRotateEnabledForNetwork(), this.f164602b.getExperiments().getIsWebpSupportEnabled(), this.f164601a, this.f164602b.getDownsampleMode(), useBitmapPrepareToDraw, this.f164602b.getExperiments().getIsPartialImageCachingEnabled(), this.f164602b.getIsDiskCacheEnabled(), m184256l(), this.f164602b.getExperiments().getIsEncodedMemoryCacheProbingEnabled(), this.f164602b.getExperiments().getIsDiskCacheProbingEnabled(), this.f164602b.getExperiments().getAllowDelay(), this.f164602b.mo168984E());
        }
        return this.f164612l;
    }
}
