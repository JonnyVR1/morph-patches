package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020!0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0005R\u0014\u0010D\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0018\u0010O\u001a\u0006\u0012\u0002\b\u00030L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001c\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010[R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020`0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010[R\u0014\u0010d\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010#R\u0014\u0010f\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010CR\u0016\u0010j\u001a\u0004\u0018\u00010g8&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0016\u0010n\u001a\u0004\u0018\u00010k8&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8&X¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\"\u0010{\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020x\u0018\u00010w8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R'\u0010\u0084\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020A\u0018\u00010\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, m87232d2 = {"Ll/qhm;", "", "Ll/syg0;", "Ll/qgy;", BaseSei.f13931Y, "()Ll/syg0;", "bitmapMemoryCacheParamsSupplier", "Ll/pgy$a;", BLiveStormDanmakuGiftResourceType.f44446s, "()Ll/pgy$a;", "bitmapMemoryCacheTrimStrategy", "r", "encodedMemoryCacheTrimStrategy", "Ll/tqb$b;", "Ll/cx3;", "e", "()Ll/tqb$b;", "bitmapMemoryCacheEntryStateObserver", "Ll/dx3;", b2s.C_ZONE, "()Ll/dx3;", "cacheKeyFactory", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Ll/s2e;", "A", "diskCachesStoreSupplier", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "F", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "", "f", "()Z", "isDiskCacheEnabled", "h", "encodedMemoryCacheParamsSupplier", "Ll/x5f;", "H", "()Ll/x5f;", "executorSupplier", "Ll/qie0;", "u", "()Ll/qie0;", "executorServiceForAnimatedImages", "Ll/wem;", "k", "()Ll/wem;", "imageCacheStatsTracker", "Ll/cfm;", "g", "()Ll/cfm;", "imageDecoder", "Ll/uim;", "w", "()Ll/uim;", "imageTranscoderFactory", "", ResourceDirection.f38808v, "()Ljava/lang/Integer;", "imageTranscoderType", BLiveStormDanmakuGiftResourceType.f44444l, "isPrefetchEnabledSupplier", "Ll/n2e;", "p", "()Ll/n2e;", "mainDiskCacheConfig", "Ll/jhy;", "m", "()Ll/jhy;", "memoryTrimmableRegistry", BaseSei.f13932Z, "()I", "memoryChunkType", "Ll/mb20;", "o", "()Ll/mb20;", "networkFetcher", "Ll/ua80;", RXScreenCaptureService.KEY_INDEX, "()Ll/ua80;", "poolFactory", "Ll/pwa0;", "c", "()Ll/pwa0;", "progressiveJpegConfig", "", "Ll/guc0;", "q", "()Ljava/util/Set;", "requestListeners", "Ll/huc0;", "a", "requestListener2s", "Ll/xxb;", "E", "customProducerSequenceFactories", "D", "isResizeAndRotateEnabledForNetwork", Constants.KEY_T, "smallImageDiskCacheConfig", "Ll/dfm;", BaseSei.f13930X, "()Ll/dfm;", "imageDecoderConfig", "Ll/f84;", "G", "()Ll/f84;", "callerContextVerifier", "Ll/rhm;", "n", "()Ll/rhm;", "experiments", "Ll/ha5;", "j", "()Ll/ha5;", "closeableReferenceLeakTracker", "Ll/pgy;", "Lcom/facebook/common/memory/PooledByteBuffer;", "b", "()Ll/pgy;", "encodedMemoryCacheOverride", "Ll/w13;", "B", "()Ll/w13;", "bitmapMemoryCacheFactory", "", "", Constants.INAPP_DATA_TAG, "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface qhm {
    @NotNull
    /* JADX INFO: renamed from: A */
    syg0<s2e> mo168980A();

    @NotNull
    /* JADX INFO: renamed from: B */
    w13 getBitmapMemoryCacheFactory();

    @NotNull
    /* JADX INFO: renamed from: C */
    dx3 getCacheKeyFactory();

    /* JADX INFO: renamed from: D */
    boolean getIsResizeAndRotateEnabledForNetwork();

    @NotNull
    /* JADX INFO: renamed from: E */
    Set<xxb> mo168984E();

    @NotNull
    /* JADX INFO: renamed from: F */
    DownsampleMode getDownsampleMode();

    @Nullable
    /* JADX INFO: renamed from: G */
    f84 mo168986G();

    @NotNull
    /* JADX INFO: renamed from: H */
    x5f getExecutorSupplier();

    @NotNull
    /* JADX INFO: renamed from: a */
    Set<huc0> mo168988a();

    @Nullable
    /* JADX INFO: renamed from: b */
    pgy<cx3, PooledByteBuffer> mo168989b();

    @NotNull
    /* JADX INFO: renamed from: c */
    pwa0 getProgressiveJpegConfig();

    @Nullable
    /* JADX INFO: renamed from: d */
    Map<String, n2e> mo168991d();

    @Nullable
    /* JADX INFO: renamed from: e */
    tqb.InterfaceC20245b<cx3> mo168992e();

    /* JADX INFO: renamed from: f */
    boolean getIsDiskCacheEnabled();

    @Nullable
    /* JADX INFO: renamed from: g */
    cfm getImageDecoder();

    @NotNull
    Context getContext();

    @NotNull
    /* JADX INFO: renamed from: h */
    syg0<qgy> mo168995h();

    @NotNull
    /* JADX INFO: renamed from: i */
    ua80 getPoolFactory();

    @NotNull
    /* JADX INFO: renamed from: j */
    ha5 getCloseableReferenceLeakTracker();

    @NotNull
    /* JADX INFO: renamed from: k */
    wem getImageCacheStatsTracker();

    @NotNull
    /* JADX INFO: renamed from: l */
    syg0<Boolean> mo168999l();

    @NotNull
    /* JADX INFO: renamed from: m */
    jhy getMemoryTrimmableRegistry();

    @NotNull
    /* JADX INFO: renamed from: n */
    rhm getExperiments();

    @NotNull
    /* JADX INFO: renamed from: o */
    mb20<?> mo169002o();

    @NotNull
    /* JADX INFO: renamed from: p */
    n2e getMainDiskCacheConfig();

    @NotNull
    /* JADX INFO: renamed from: q */
    Set<guc0> mo169004q();

    @NotNull
    /* JADX INFO: renamed from: r */
    pgy.InterfaceC19209a getEncodedMemoryCacheTrimStrategy();

    @NotNull
    /* JADX INFO: renamed from: s */
    pgy.InterfaceC19209a getBitmapMemoryCacheTrimStrategy();

    @NotNull
    /* JADX INFO: renamed from: t */
    n2e getSmallImageDiskCacheConfig();

    @Nullable
    /* JADX INFO: renamed from: u */
    qie0 getExecutorServiceForAnimatedImages();

    @Nullable
    /* JADX INFO: renamed from: v */
    Integer getImageTranscoderType();

    @Nullable
    /* JADX INFO: renamed from: w */
    uim getImageTranscoderFactory();

    @Nullable
    /* JADX INFO: renamed from: x */
    dfm mo169011x();

    @NotNull
    /* JADX INFO: renamed from: y */
    syg0<qgy> mo169012y();

    /* JADX INFO: renamed from: z */
    int getMemoryChunkType();
}
