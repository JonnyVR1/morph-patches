package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020!0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0005R\u0014\u0010D\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0018\u0010O\u001a\u0006\u0012\u0002\b\u00030L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001c\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010[R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020`0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010[R\u0014\u0010d\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010#R\u0014\u0010f\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010CR\u0016\u0010j\u001a\u0004\u0018\u00010g8&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0016\u0010n\u001a\u0004\u0018\u00010k8&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8&X¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\"\u0010{\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020x\u0018\u00010w8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R'\u0010\u0084\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020A\u0018\u00010\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, m88121d2 = {"Ll/tjm;", "", "Ll/a7h0;", "Ll/npy;", BaseSei.f14625Y, "()Ll/a7h0;", "bitmapMemoryCacheParamsSupplier", "Ll/mpy$a;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/mpy$a;", "bitmapMemoryCacheTrimStrategy", "r", "encodedMemoryCacheTrimStrategy", "Ll/hsb$b;", "Ll/by3;", "e", "()Ll/hsb$b;", "bitmapMemoryCacheEntryStateObserver", "Ll/cy3;", c4s.C_ZONE, "()Ll/cy3;", "cacheKeyFactory", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Ll/g4e;", "A", "diskCachesStoreSupplier", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "F", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "", "f", "()Z", "isDiskCacheEnabled", "h", "encodedMemoryCacheParamsSupplier", "Ll/d7f;", "H", "()Ll/d7f;", "executorSupplier", "Ll/vqe0;", "u", "()Ll/vqe0;", "executorServiceForAnimatedImages", "Ll/mhm;", "k", "()Ll/mhm;", "imageCacheStatsTracker", "Ll/shm;", "g", "()Ll/shm;", "imageDecoder", "Ll/xkm;", "w", "()Ll/xkm;", "imageTranscoderFactory", "", ResourceDirection.f39656v, "()Ljava/lang/Integer;", "imageTranscoderType", BLiveStormDanmakuGiftResourceType.f45292l, "isPrefetchEnabledSupplier", "Ll/b4e;", "p", "()Ll/b4e;", "mainDiskCacheConfig", "Ll/gqy;", "m", "()Ll/gqy;", "memoryTrimmableRegistry", BaseSei.f14626Z, "()I", "memoryChunkType", "Ll/vj20;", "o", "()Ll/vj20;", "networkFetcher", "Ll/aj80;", RXScreenCaptureService.KEY_INDEX, "()Ll/aj80;", "poolFactory", "Ll/t4b0;", "c", "()Ll/t4b0;", "progressiveJpegConfig", "", "Ll/j2d0;", "q", "()Ljava/util/Set;", "requestListeners", "Ll/k2d0;", "a", "requestListener2s", "Ll/lzb;", "E", "customProducerSequenceFactories", "D", "isResizeAndRotateEnabledForNetwork", Constants.KEY_T, "smallImageDiskCacheConfig", "Ll/thm;", BaseSei.f14624X, "()Ll/thm;", "imageDecoderConfig", "Ll/e94;", "G", "()Ll/e94;", "callerContextVerifier", "Ll/ujm;", "n", "()Ll/ujm;", "experiments", "Ll/hb5;", "j", "()Ll/hb5;", "closeableReferenceLeakTracker", "Ll/mpy;", "Lcom/facebook/common/memory/PooledByteBuffer;", "b", "()Ll/mpy;", "encodedMemoryCacheOverride", "Ll/m23;", "B", "()Ll/m23;", "bitmapMemoryCacheFactory", "", "", Constants.INAPP_DATA_TAG, "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface tjm {
    @NotNull
    /* JADX INFO: renamed from: A */
    a7h0<g4e> mo186171A();

    @NotNull
    /* JADX INFO: renamed from: B */
    m23 getBitmapMemoryCacheFactory();

    @NotNull
    /* JADX INFO: renamed from: C */
    cy3 getCacheKeyFactory();

    /* JADX INFO: renamed from: D */
    boolean getIsResizeAndRotateEnabledForNetwork();

    @NotNull
    /* JADX INFO: renamed from: E */
    Set<lzb> mo186175E();

    @NotNull
    /* JADX INFO: renamed from: F */
    DownsampleMode getDownsampleMode();

    @Nullable
    /* JADX INFO: renamed from: G */
    e94 mo186177G();

    @NotNull
    /* JADX INFO: renamed from: H */
    d7f getExecutorSupplier();

    @NotNull
    /* JADX INFO: renamed from: a */
    Set<k2d0> mo186179a();

    @Nullable
    /* JADX INFO: renamed from: b */
    mpy<by3, PooledByteBuffer> mo186180b();

    @NotNull
    /* JADX INFO: renamed from: c */
    t4b0 getProgressiveJpegConfig();

    @Nullable
    /* JADX INFO: renamed from: d */
    Map<String, b4e> mo186182d();

    @Nullable
    /* JADX INFO: renamed from: e */
    hsb.InterfaceC17569b<by3> mo186183e();

    /* JADX INFO: renamed from: f */
    boolean getIsDiskCacheEnabled();

    @Nullable
    /* JADX INFO: renamed from: g */
    shm getImageDecoder();

    @NotNull
    Context getContext();

    @NotNull
    /* JADX INFO: renamed from: h */
    a7h0<npy> mo186186h();

    @NotNull
    /* JADX INFO: renamed from: i */
    aj80 getPoolFactory();

    @NotNull
    /* JADX INFO: renamed from: j */
    hb5 getCloseableReferenceLeakTracker();

    @NotNull
    /* JADX INFO: renamed from: k */
    mhm getImageCacheStatsTracker();

    @NotNull
    /* JADX INFO: renamed from: l */
    a7h0<Boolean> mo186190l();

    @NotNull
    /* JADX INFO: renamed from: m */
    gqy getMemoryTrimmableRegistry();

    @NotNull
    /* JADX INFO: renamed from: n */
    ujm getExperiments();

    @NotNull
    /* JADX INFO: renamed from: o */
    vj20<?> mo186193o();

    @NotNull
    /* JADX INFO: renamed from: p */
    b4e getMainDiskCacheConfig();

    @NotNull
    /* JADX INFO: renamed from: q */
    Set<j2d0> mo186195q();

    @NotNull
    /* JADX INFO: renamed from: r */
    mpy.InterfaceC18667a getEncodedMemoryCacheTrimStrategy();

    @NotNull
    /* JADX INFO: renamed from: s */
    mpy.InterfaceC18667a getBitmapMemoryCacheTrimStrategy();

    @NotNull
    /* JADX INFO: renamed from: t */
    b4e getSmallImageDiskCacheConfig();

    @Nullable
    /* JADX INFO: renamed from: u */
    vqe0 getExecutorServiceForAnimatedImages();

    @Nullable
    /* JADX INFO: renamed from: v */
    Integer getImageTranscoderType();

    @Nullable
    /* JADX INFO: renamed from: w */
    xkm getImageTranscoderFactory();

    @Nullable
    /* JADX INFO: renamed from: x */
    thm mo186202x();

    @NotNull
    /* JADX INFO: renamed from: y */
    a7h0<npy> mo186203y();

    /* JADX INFO: renamed from: z */
    int getMemoryChunkType();
}
