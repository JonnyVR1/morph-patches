package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 º\u00012\u00020\u0001:\u0003\u0014\u0007\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00107\u001a\b\u0012\u0004\u0012\u0002040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\u000f\u001a\u0004\b6\u0010\u0011R \u00109\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b/\u0010\u0011R\u001a\u0010?\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010D\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b;\u0010CR\u001c\u0010I\u001a\u0004\u0018\u00010E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b)\u0010HR\u001c\u0010O\u001a\u0004\u0018\u00010J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010S\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010\u000f\u001a\u0004\bR\u0010\u0011R\"\u0010[\u001a\u0004\u0018\u00010T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR \u0010]\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010\u000f\u001a\u0004\bA\u0010\u0011R\u001a\u0010a\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\bU\u0010`R\u001a\u0010e\u001a\u00020b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bF\u0010dR \u0010k\u001a\u00020T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bj\u0010Z\u001a\u0004\bh\u0010iR\u001e\u0010p\u001a\u0006\u0012\u0002\b\u00030l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bQ\u0010oR\u0014\u0010q\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010gR\u001c\u0010v\u001a\u0004\u0018\u00010r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010{\u001a\u00020w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\b5\u0010zR\u001a\u0010\u007f\u001a\u00020|8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010}\u001a\u0004\b\u0014\u0010~R%\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bh\u0010\u0082\u0001\u001a\u0005\b\\\u0010\u0083\u0001R%\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b6\u0010\u0082\u0001\u001a\u0005\b\u0007\u0010\u0083\u0001R'\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0082\u0001\u001a\u0006\b\u0089\u0001\u0010\u0083\u0001R\u001e\u0010\u008e\u0001\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b%\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u008c\u0001\u0010_\u001a\u0004\bf\u0010`R\u001f\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u0091\u0001\u001a\u0005\bK\u0010\u0092\u0001R\u001d\u0010\u0094\u0001\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b1\u0010\u008b\u0001\u001a\u0005\b#\u0010\u008d\u0001R\u001f\u0010\u0099\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0005\b8\u0010\u0098\u0001R.\u0010\u009f\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0018\u00010\u009a\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b=\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R-\u0010¡\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030 \u0001\u0018\u00010\u009a\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bg\u0010\u009c\u0001\u001a\u0005\b\u000e\u0010\u009e\u0001R!\u0010¦\u0001\u001a\u0005\u0018\u00010¢\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0005\bm\u0010¥\u0001R \u0010«\u0001\u001a\u00030§\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\b\u0088\u0001\u0010ª\u0001R.\u0010±\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u00ad\u0001\u0012\u0004\u0012\u00020^\u0018\u00010¬\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0005\b\u0019\u0010°\u0001R!\u0010³\u0001\u001a\u0005\u0018\u00010²\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b³\u0001\u0010´\u0001\u001a\u0005\bx\u0010µ\u0001R\"\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b\u0096\u0001\u0010¹\u0001¨\u0006»\u0001"}, m88121d2 = {"Ll/sjm;", "Ll/tjm;", "Ll/sjm$a;", "builder", "<init>", "(Ll/sjm$a;)V", "Landroid/graphics/Bitmap$Config;", "a", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ll/a7h0;", "Ll/npy;", "b", "Ll/a7h0;", BaseSei.f14625Y, "()Ll/a7h0;", "bitmapMemoryCacheParamsSupplier", "Ll/mpy$a;", "c", "Ll/mpy$a;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/mpy$a;", "bitmapMemoryCacheTrimStrategy", Constants.INAPP_DATA_TAG, "r", "encodedMemoryCacheTrimStrategy", "Ll/hsb$b;", "Ll/by3;", "e", "Ll/hsb$b;", "()Ll/hsb$b;", "bitmapMemoryCacheEntryStateObserver", "Ll/cy3;", "f", "Ll/cy3;", c4s.C_ZONE, "()Ll/cy3;", "cacheKeyFactory", "Landroid/content/Context;", "g", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "h", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "F", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "Ll/g4e;", RXScreenCaptureService.KEY_INDEX, "A", "diskCachesStoreSupplier", "j", "encodedMemoryCacheParamsSupplier", "Ll/d7f;", "k", "Ll/d7f;", "H", "()Ll/d7f;", "executorSupplier", "Ll/mhm;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/mhm;", "()Ll/mhm;", "imageCacheStatsTracker", "Ll/shm;", "m", "Ll/shm;", "()Ll/shm;", "imageDecoder", "Ll/xkm;", "n", "Ll/xkm;", "w", "()Ll/xkm;", "imageTranscoderFactory", "", "o", "getEnableEncodedImageColorSpaceUsage", "enableEncodedImageColorSpaceUsage", "", "p", "Ljava/lang/Integer;", ResourceDirection.f39656v, "()Ljava/lang/Integer;", "getImageTranscoderType$annotations", "()V", "imageTranscoderType", "q", "isPrefetchEnabledSupplier", "Ll/b4e;", "Ll/b4e;", "()Ll/b4e;", "mainDiskCacheConfig", "Ll/gqy;", "Ll/gqy;", "()Ll/gqy;", "memoryTrimmableRegistry", Constants.KEY_T, "I", BaseSei.f14626Z, "()I", "getMemoryChunkType$annotations", "memoryChunkType", "Ll/vj20;", "u", "Ll/vj20;", "()Ll/vj20;", "networkFetcher", "httpNetworkTimeout", "Ll/xc80;", "Ll/xc80;", "getPlatformBitmapFactory", "()Ll/xc80;", "platformBitmapFactory", "Ll/aj80;", BaseSei.f14624X, "Ll/aj80;", "()Ll/aj80;", "poolFactory", "Ll/t4b0;", "Ll/t4b0;", "()Ll/t4b0;", "progressiveJpegConfig", "", "Ll/j2d0;", "Ljava/util/Set;", "()Ljava/util/Set;", "requestListeners", "Ll/k2d0;", "requestListener2s", "Ll/lzb;", "B", "E", "customProducerSequenceFactories", "Z", "D", "()Z", "isResizeAndRotateEnabledForNetwork", "smallImageDiskCacheConfig", "Ll/ujm;", "Ll/ujm;", "()Ll/ujm;", "experiments", "isDiskCacheEnabled", "Ll/hb5;", "G", "Ll/hb5;", "()Ll/hb5;", "closeableReferenceLeakTracker", "Ll/mpy;", "Ll/db5;", "Ll/mpy;", "getBitmapCacheOverride", "()Ll/mpy;", "bitmapCacheOverride", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCacheOverride", "Ll/vqe0;", "J", "Ll/vqe0;", "()Ll/vqe0;", "executorServiceForAnimatedImages", "Ll/m23;", "K", "Ll/m23;", "()Ll/m23;", "bitmapMemoryCacheFactory", "", "", "L", "Ljava/util/Map;", "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "Ll/thm;", "imageDecoderConfig", "Ll/thm;", "()Ll/thm;", "Ll/e94;", "callerContextVerifier", "Ll/e94;", "()Ll/e94;", "Companion", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class sjm implements tjm {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: M */
    @NotNull
    public static C20060c f169033M = new C20060c();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Set<k2d0> requestListener2s;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Set<lzb> customProducerSequenceFactories;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final boolean isResizeAndRotateEnabledForNetwork;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final b4e smallImageDiskCacheConfig;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final ujm experiments;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final boolean isDiskCacheEnabled;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final hb5 closeableReferenceLeakTracker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public final mpy<by3, db5> bitmapCacheOverride;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public final mpy<by3, PooledByteBuffer> encodedMemoryCacheOverride;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public final vqe0 executorServiceForAnimatedImages;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final m23 bitmapMemoryCacheFactory;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public final Map<String, b4e> dynamicDiskCacheConfigMap;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a7h0<npy> bitmapMemoryCacheParamsSupplier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final mpy.InterfaceC18667a bitmapMemoryCacheTrimStrategy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final mpy.InterfaceC18667a encodedMemoryCacheTrimStrategy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final hsb.InterfaceC17569b<by3> bitmapMemoryCacheEntryStateObserver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final cy3 cacheKeyFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final DownsampleMode downsampleMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final a7h0<g4e> diskCachesStoreSupplier;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final a7h0<npy> encodedMemoryCacheParamsSupplier;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final d7f executorSupplier;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final mhm imageCacheStatsTracker;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final shm imageDecoder;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public final xkm imageTranscoderFactory;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final a7h0<Boolean> enableEncodedImageColorSpaceUsage;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public final Integer imageTranscoderType;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final a7h0<Boolean> isPrefetchEnabledSupplier;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final b4e mainDiskCacheConfig;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final gqy memoryTrimmableRegistry;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int memoryChunkType;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final vj20<?> networkFetcher;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final int httpNetworkTimeout;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public final xc80 platformBitmapFactory;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final aj80 poolFactory;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final t4b0 progressiveJpegConfig;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Set<j2d0> requestListeners;

    /* JADX INFO: renamed from: l.sjm$a */
    @Metadata(m88120d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00002\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010!¢\u0006\u0004\b.\u0010$J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101R(\u00106\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b4\u00105R4\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b8\u00109R4\u0010@\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R(\u0010E\u001a\u0004\u0018\u00010A2\b\u00102\u001a\u0004\u0018\u00010A8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010B\u001a\u0004\bC\u0010DR(\u0010H\u001a\u0004\u0018\u00010A2\b\u00102\u001a\u0004\u0018\u00010A8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u00102\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010L\u001a\u0004\bM\u0010NR$\u0010\u0014\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010O\u001a\u0004\bP\u0010QR4\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\bS\u00109R(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u00102\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR(\u0010\\\u001a\u0004\u0018\u00010X2\b\u00102\u001a\u0004\u0018\u00010X8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010Y\u001a\u0004\bZ\u0010[R(\u0010b\u001a\u0004\u0018\u00010]2\b\u00102\u001a\u0004\u0018\u00010]8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR4\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bc\u00107\u001a\u0004\bd\u00109R(\u0010k\u001a\u0004\u0018\u00010f2\b\u00102\u001a\u0004\u0018\u00010f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR*\u0010t\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bP\u0010m\u0012\u0004\br\u0010s\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR4\u0010w\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bu\u00107\u001a\u0004\bv\u00109R(\u0010\"\u001a\u0004\u0018\u00010!2\b\u00102\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bd\u0010x\u001a\u0004\by\u0010zR(\u0010&\u001a\u0004\u0018\u00010%2\b\u00102\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R-\u0010\u0082\u0001\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u001a\n\u0004\bS\u0010m\u0012\u0005\b\u0081\u0001\u0010s\u001a\u0004\b\u007f\u0010o\"\u0005\b\u0080\u0001\u0010qR3\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\f\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010)8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bG\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R.\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0086\u00012\t\u00102\u001a\u0005\u0018\u00010\u0086\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bV\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R/\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008b\u00012\t\u00102\u001a\u0005\u0018\u00010\u008b\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R/\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0091\u00012\t\u00102\u001a\u0005\u0018\u00010\u0091\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R=\u0010\u009d\u0001\u001a\f\u0012\u0005\u0012\u00030\u0098\u0001\u0018\u00010\u0097\u00012\u0010\u00102\u001a\f\u0012\u0005\u0012\u00030\u0098\u0001\u0018\u00010\u0097\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R<\u0010 \u0001\u001a\f\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0097\u00012\u0010\u00102\u001a\f\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0097\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bZ\u0010\u009a\u0001\u001a\u0006\b\u009f\u0001\u0010\u009c\u0001R;\u0010¢\u0001\u001a\f\u0012\u0005\u0012\u00030¡\u0001\u0018\u00010\u0097\u00012\u0010\u00102\u001a\f\u0012\u0005\u0012\u00030¡\u0001\u0018\u00010\u0097\u00018\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b`\u0010\u009a\u0001\u001a\u0005\b^\u0010\u009c\u0001R(\u0010¦\u0001\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b£\u0001\u0010+\u001a\u0006\b¤\u0001\u0010¥\u0001R)\u0010-\u001a\u0004\u0018\u00010!2\b\u00102\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\bi\u0010x\u001a\u0005\b§\u0001\u0010zR.\u0010«\u0001\u001a\u0005\u0018\u00010¨\u00012\t\u00102\u001a\u0005\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bn\u0010©\u0001\u001a\u0006\b\u0092\u0001\u0010ª\u0001R7\u0010\u00ad\u0001\u001a\u000b\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010\n2\u000f\u00102\u001a\u000b\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\by\u00107\u001a\u0004\bg\u00109R(\u0010¯\u0001\u001a\u00020l2\u0006\u00102\u001a\u00020l8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u007f\u0010\u008e\u0001\u001a\u0006\b\u0099\u0001\u0010®\u0001R\u001c\u0010³\u0001\u001a\u00030°\u00018\u0006¢\u0006\u000f\n\u0005\b}\u0010±\u0001\u001a\u0006\b\u008c\u0001\u0010²\u0001R'\u0010´\u0001\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010+\u001a\u0005\bc\u0010¥\u0001R*\u0010¸\u0001\u001a\u00030µ\u00012\u0007\u00102\u001a\u00030µ\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0088\u0001\u0010¶\u0001\u001a\u0005\bT\u0010·\u0001RH\u0010½\u0001\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030º\u0001\u0018\u00010¹\u00012\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030º\u0001\u0018\u00010¹\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010»\u0001\u001a\u0005\b<\u0010¼\u0001RH\u0010¿\u0001\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030¾\u0001\u0018\u00010¹\u00012\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030¾\u0001\u0018\u00010¹\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010»\u0001\u001a\u0005\b{\u0010¼\u0001R/\u0010Ä\u0001\u001a\u0005\u0018\u00010À\u00012\t\u00102\u001a\u0005\u0018\u00010À\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R.\u0010È\u0001\u001a\u0005\u0018\u00010Å\u00012\t\u00102\u001a\u0005\u0018\u00010Å\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010Æ\u0001\u001a\u0005\bF\u0010Ç\u0001RH\u0010Í\u0001\u001a\u0012\u0012\u0005\u0012\u00030Ê\u0001\u0012\u0004\u0012\u00020!\u0018\u00010É\u00012\u0016\u00102\u001a\u0012\u0012\u0005\u0012\u00030Ê\u0001\u0012\u0004\u0012\u00020!\u0018\u00010É\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b¤\u0001\u0010Ë\u0001\u001a\u0005\bu\u0010Ì\u0001R/\u0010Ï\u0001\u001a\u0005\u0018\u00010Î\u00012\t\u00102\u001a\u0005\u0018\u00010Î\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\b£\u0001\u0010Ñ\u0001R.\u0010Ó\u0001\u001a\u0005\u0018\u00010Ò\u00012\t\u00102\u001a\u0005\u0018\u00010Ò\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0005\bR\u0010Õ\u0001¨\u0006Ö\u0001"}, m88121d2 = {"Ll/sjm$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Bitmap$Config;", Constants.KEY_CONFIG, "R", "(Landroid/graphics/Bitmap$Config;)Ll/sjm$a;", "Ll/a7h0;", "Ll/npy;", "bitmapMemoryCacheParamsSupplier", "Q", "(Ll/a7h0;)Ll/sjm$a;", "Ll/cy3;", "cacheKeyFactory", p7f.LATITUDE_SOUTH, "(Ll/cy3;)Ll/sjm$a;", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "U", "(Lcom/facebook/imagepipeline/core/DownsampleMode;)Ll/sjm$a;", "", "downsampleEnabled", p7f.GPS_DIRECTION_TRUE, "(Z)Ll/sjm$a;", "encodedMemoryCacheParamsSupplier", p7f.GPS_MEASUREMENT_INTERRUPTED, "Ll/d7f;", "executorSupplier", "W", "(Ll/d7f;)Ll/sjm$a;", "Ll/b4e;", "mainDiskCacheConfig", "X", "(Ll/b4e;)Ll/sjm$a;", "Ll/gqy;", "memoryTrimmableRegistry", "Y", "(Ll/gqy;)Ll/sjm$a;", "Ll/vj20;", "networkFetcher", "Z", "(Ll/vj20;)Ll/sjm$a;", "smallImageDiskCacheConfig", "a0", "Ll/sjm;", "a", "()Ll/sjm;", "value", "Landroid/graphics/Bitmap$Config;", "b", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ll/a7h0;", "f", "()Ll/a7h0;", "Ll/hsb$b;", "Ll/by3;", "c", "Ll/hsb$b;", Constants.INAPP_DATA_TAG, "()Ll/hsb$b;", "bitmapMemoryCacheEntryStateObserver", "Ll/mpy$a;", "Ll/mpy$a;", "g", "()Ll/mpy$a;", "bitmapMemoryCacheTrimStrategy", "e", Constants.KEY_T, "encodedMemoryCacheTrimStrategy", "Ll/cy3;", "h", "()Ll/cy3;", "Landroid/content/Context;", "k", "()Landroid/content/Context;", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "o", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", RXScreenCaptureService.KEY_INDEX, BLiveStormDanmakuGiftResourceType.f45294s, "j", "Ll/d7f;", "u", "()Ll/d7f;", "Ll/mhm;", "Ll/mhm;", BaseSei.f14625Y, "()Ll/mhm;", "imageCacheStatsTracker", "Ll/shm;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/shm;", BaseSei.f14626Z, "()Ll/shm;", "imageDecoder", "m", "q", "enableEncodedImageColorSpaceUsage", "Ll/xkm;", "n", "Ll/xkm;", "B", "()Ll/xkm;", "imageTranscoderFactory", "", "Ljava/lang/Integer;", c4s.C_ZONE, "()Ljava/lang/Integer;", "setImageTranscoderType", "(Ljava/lang/Integer;)V", "getImageTranscoderType$annotations", "()V", "imageTranscoderType", "p", "P", "isPrefetchEnabledSupplier", "Ll/b4e;", "D", "()Ll/b4e;", "r", "Ll/gqy;", "F", "()Ll/gqy;", "E", "setMemoryChunkType", "getMemoryChunkType$annotations", "memoryChunkType", "Ll/vj20;", "G", "()Ll/vj20;", "Ll/xc80;", "Ll/xc80;", "H", "()Ll/xc80;", "platformBitmapFactory", "Ll/aj80;", ResourceDirection.f39656v, "Ll/aj80;", "I", "()Ll/aj80;", "poolFactory", "Ll/t4b0;", "w", "Ll/t4b0;", "J", "()Ll/t4b0;", "progressiveJpegConfig", "", "Ll/j2d0;", BaseSei.f14624X, "Ljava/util/Set;", "L", "()Ljava/util/Set;", "requestListeners", "Ll/k2d0;", "K", "requestListener2s", "Ll/lzb;", "customProducerSequenceFactories", "A", "M", "()Z", "resizeAndRotateEnabledForNetwork", BloodType.f39576O, "Ll/jii;", "Ll/jii;", "()Ll/jii;", "fileCacheFactory", "Ll/g4e;", "diskCachesStoreSupplier", "()I", "httpConnectionTimeout", "Ll/ujm$a;", "Ll/ujm$a;", "()Ll/ujm$a;", "experimentsBuilder", "diskCacheEnabled", "Ll/hb5;", "Ll/hb5;", "()Ll/hb5;", "closeableReferenceLeakTracker", "Ll/mpy;", "Ll/db5;", "Ll/mpy;", "()Ll/mpy;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Ll/vqe0;", "Ll/vqe0;", "N", "()Ll/vqe0;", "serialExecutorServiceForAnimatedImages", "Ll/m23;", "Ll/m23;", "()Ll/m23;", "bitmapMemoryCacheFactory", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "Ll/thm;", "imageDecoderConfig", "Ll/thm;", "()Ll/thm;", "Ll/e94;", "callerContextVerifier", "Ll/e94;", "()Ll/e94;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C20058a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        public boolean resizeAndRotateEnabledForNetwork;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @Nullable
        public b4e smallImageDiskCacheConfig;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @Nullable
        public jii fileCacheFactory;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @Nullable
        public a7h0<g4e> diskCachesStoreSupplier;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        public int httpConnectionTimeout;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @NotNull
        public final ujm.C20587a experimentsBuilder;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        public boolean diskCacheEnabled;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        @NotNull
        public hb5 closeableReferenceLeakTracker;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        @Nullable
        public mpy<by3, db5> bitmapMemoryCache;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        @Nullable
        public mpy<by3, PooledByteBuffer> encodedMemoryCache;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        @Nullable
        public vqe0 serialExecutorServiceForAnimatedImages;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        @Nullable
        public m23 bitmapMemoryCacheFactory;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        @Nullable
        public Map<String, ? extends b4e> dynamicDiskCacheConfigMap;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Bitmap.Config bitmapConfig;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public a7h0<npy> bitmapMemoryCacheParamsSupplier;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public hsb.InterfaceC17569b<by3> bitmapMemoryCacheEntryStateObserver;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public mpy.InterfaceC18667a bitmapMemoryCacheTrimStrategy;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public mpy.InterfaceC18667a encodedMemoryCacheTrimStrategy;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public cy3 cacheKeyFactory;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public DownsampleMode downsampleMode;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public a7h0<npy> encodedMemoryCacheParamsSupplier;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public d7f executorSupplier;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public mhm imageCacheStatsTracker;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public shm imageDecoder;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public a7h0<Boolean> enableEncodedImageColorSpaceUsage;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @Nullable
        public xkm imageTranscoderFactory;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @Nullable
        public Integer imageTranscoderType;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public a7h0<Boolean> isPrefetchEnabledSupplier;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @Nullable
        public b4e mainDiskCacheConfig;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public gqy memoryTrimmableRegistry;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @Nullable
        public Integer memoryChunkType;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @Nullable
        public vj20<?> networkFetcher;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @Nullable
        public xc80 platformBitmapFactory;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @Nullable
        public aj80 poolFactory;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @Nullable
        public t4b0 progressiveJpegConfig;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @Nullable
        public Set<? extends j2d0> requestListeners;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @Nullable
        public Set<? extends k2d0> requestListener2s;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @Nullable
        public Set<? extends lzb> customProducerSequenceFactories;

        public C20058a(@NotNull Context context) {
            context.getClass();
            this.downsampleMode = DownsampleMode.AUTO;
            this.resizeAndRotateEnabledForNetwork = true;
            this.httpConnectionTimeout = -1;
            this.experimentsBuilder = new ujm.C20587a(this);
            this.diskCacheEnabled = true;
            this.closeableReferenceLeakTracker = new at40();
            this.context = context;
        }

        @Nullable
        /* JADX INFO: renamed from: A */
        public final thm m186205A() {
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final xkm getImageTranscoderFactory() {
            return this.imageTranscoderFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final Integer getImageTranscoderType() {
            return this.imageTranscoderType;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final b4e getMainDiskCacheConfig() {
            return this.mainDiskCacheConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: E, reason: from getter */
        public final Integer getMemoryChunkType() {
            return this.memoryChunkType;
        }

        @Nullable
        /* JADX INFO: renamed from: F, reason: from getter */
        public final gqy getMemoryTrimmableRegistry() {
            return this.memoryTrimmableRegistry;
        }

        @Nullable
        /* JADX INFO: renamed from: G */
        public final vj20<?> m186211G() {
            return this.networkFetcher;
        }

        @Nullable
        /* JADX INFO: renamed from: H, reason: from getter */
        public final xc80 getPlatformBitmapFactory() {
            return this.platformBitmapFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: I, reason: from getter */
        public final aj80 getPoolFactory() {
            return this.poolFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: J, reason: from getter */
        public final t4b0 getProgressiveJpegConfig() {
            return this.progressiveJpegConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: K */
        public final Set<k2d0> m186215K() {
            return this.requestListener2s;
        }

        @Nullable
        /* JADX INFO: renamed from: L */
        public final Set<j2d0> m186216L() {
            return this.requestListeners;
        }

        /* JADX INFO: renamed from: M, reason: from getter */
        public final boolean getResizeAndRotateEnabledForNetwork() {
            return this.resizeAndRotateEnabledForNetwork;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final vqe0 getSerialExecutorServiceForAnimatedImages() {
            return this.serialExecutorServiceForAnimatedImages;
        }

        @Nullable
        /* JADX INFO: renamed from: O, reason: from getter */
        public final b4e getSmallImageDiskCacheConfig() {
            return this.smallImageDiskCacheConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: P */
        public final a7h0<Boolean> m186220P() {
            return this.isPrefetchEnabledSupplier;
        }

        @NotNull
        /* JADX INFO: renamed from: Q */
        public final C20058a m186221Q(@Nullable a7h0<npy> bitmapMemoryCacheParamsSupplier) {
            if (bitmapMemoryCacheParamsSupplier != null) {
                this.bitmapMemoryCacheParamsSupplier = bitmapMemoryCacheParamsSupplier;
                return this;
            }
            wtq0.m207906a("Required value was null.");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: R */
        public final C20058a m186222R(@Nullable Bitmap.Config config) {
            this.bitmapConfig = config;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: S */
        public final C20058a m186223S(@Nullable cy3 cacheKeyFactory) {
            this.cacheKeyFactory = cacheKeyFactory;
            return this;
        }

        @Deprecated
        @NotNull
        /* JADX INFO: renamed from: T */
        public final C20058a m186224T(boolean downsampleEnabled) {
            if (downsampleEnabled) {
                m186225U(DownsampleMode.ALWAYS);
                return this;
            }
            m186225U(DownsampleMode.AUTO);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: U */
        public final C20058a m186225U(@NotNull DownsampleMode downsampleMode) {
            downsampleMode.getClass();
            this.downsampleMode = downsampleMode;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: V */
        public final C20058a m186226V(@Nullable a7h0<npy> encodedMemoryCacheParamsSupplier) {
            if (encodedMemoryCacheParamsSupplier != null) {
                this.encodedMemoryCacheParamsSupplier = encodedMemoryCacheParamsSupplier;
                return this;
            }
            wtq0.m207906a("Required value was null.");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: W */
        public final C20058a m186227W(@Nullable d7f executorSupplier) {
            this.executorSupplier = executorSupplier;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: X */
        public final C20058a m186228X(@Nullable b4e mainDiskCacheConfig) {
            this.mainDiskCacheConfig = mainDiskCacheConfig;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: Y */
        public final C20058a m186229Y(@Nullable gqy memoryTrimmableRegistry) {
            this.memoryTrimmableRegistry = memoryTrimmableRegistry;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: Z */
        public final C20058a m186230Z(@Nullable vj20<?> networkFetcher) {
            this.networkFetcher = networkFetcher;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final sjm m186231a() {
            return new sjm(this, null);
        }

        @NotNull
        /* JADX INFO: renamed from: a0 */
        public final C20058a m186232a0(@Nullable b4e smallImageDiskCacheConfig) {
            this.smallImageDiskCacheConfig = smallImageDiskCacheConfig;
            return this;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Bitmap.Config getBitmapConfig() {
            return this.bitmapConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final mpy<by3, db5> m186234c() {
            return this.bitmapMemoryCache;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final hsb.InterfaceC17569b<by3> m186235d() {
            return this.bitmapMemoryCacheEntryStateObserver;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final m23 getBitmapMemoryCacheFactory() {
            return this.bitmapMemoryCacheFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final a7h0<npy> m186237f() {
            return this.bitmapMemoryCacheParamsSupplier;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final mpy.InterfaceC18667a getBitmapMemoryCacheTrimStrategy() {
            return this.bitmapMemoryCacheTrimStrategy;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final cy3 getCacheKeyFactory() {
            return this.cacheKeyFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public final e94 m186240i() {
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final hb5 getCloseableReferenceLeakTracker() {
            return this.closeableReferenceLeakTracker;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        /* JADX INFO: renamed from: l */
        public final Set<lzb> m186243l() {
            return this.customProducerSequenceFactories;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getDiskCacheEnabled() {
            return this.diskCacheEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: n */
        public final a7h0<g4e> m186245n() {
            return this.diskCachesStoreSupplier;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final DownsampleMode getDownsampleMode() {
            return this.downsampleMode;
        }

        @Nullable
        /* JADX INFO: renamed from: p */
        public final Map<String, b4e> m186247p() {
            return this.dynamicDiskCacheConfigMap;
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public final a7h0<Boolean> m186248q() {
            return this.enableEncodedImageColorSpaceUsage;
        }

        @Nullable
        /* JADX INFO: renamed from: r */
        public final mpy<by3, PooledByteBuffer> m186249r() {
            return this.encodedMemoryCache;
        }

        @Nullable
        /* JADX INFO: renamed from: s */
        public final a7h0<npy> m186250s() {
            return this.encodedMemoryCacheParamsSupplier;
        }

        @Nullable
        /* JADX INFO: renamed from: t, reason: from getter */
        public final mpy.InterfaceC18667a getEncodedMemoryCacheTrimStrategy() {
            return this.encodedMemoryCacheTrimStrategy;
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final d7f getExecutorSupplier() {
            return this.executorSupplier;
        }

        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public final ujm.C20587a getExperimentsBuilder() {
            return this.experimentsBuilder;
        }

        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public final jii getFileCacheFactory() {
            return this.fileCacheFactory;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final int getHttpConnectionTimeout() {
            return this.httpConnectionTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public final mhm getImageCacheStatsTracker() {
            return this.imageCacheStatsTracker;
        }

        @Nullable
        /* JADX INFO: renamed from: z, reason: from getter */
        public final shm getImageDecoder() {
            return this.imageDecoder;
        }
    }

    /* JADX INFO: renamed from: l.sjm$c */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m88121d2 = {"Ll/sjm$c;", "", "<init>", "()V", "", "a", "Z", "()Z", "setProgressiveRenderingEnabled", "(Z)V", "isProgressiveRenderingEnabled", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C20060c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isProgressiveRenderingEnabled;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsProgressiveRenderingEnabled() {
            return this.isProgressiveRenderingEnabled;
        }
    }

    public sjm(C20058a c20058a) {
        vj20<?> vj20VarM186211G;
        if (i9j.m139099d()) {
            i9j.m139097a("ImagePipelineConfig()");
        }
        this.experiments = c20058a.getExperimentsBuilder().m196412a();
        a7h0<npy> a7h0VarM186237f = c20058a.m186237f();
        if (a7h0VarM186237f == null) {
            Object systemService = c20058a.getContext().getSystemService("activity");
            if (systemService == null) {
                wtq0.m207906a("Required value was null.");
                throw null;
            }
            a7h0VarM186237f = new smd((ActivityManager) systemService);
        }
        this.bitmapMemoryCacheParamsSupplier = a7h0VarM186237f;
        mpy.InterfaceC18667a bitmapMemoryCacheTrimStrategy = c20058a.getBitmapMemoryCacheTrimStrategy();
        this.bitmapMemoryCacheTrimStrategy = bitmapMemoryCacheTrimStrategy == null ? new r23() : bitmapMemoryCacheTrimStrategy;
        mpy.InterfaceC18667a encodedMemoryCacheTrimStrategy = c20058a.getEncodedMemoryCacheTrimStrategy();
        this.encodedMemoryCacheTrimStrategy = encodedMemoryCacheTrimStrategy == null ? new ue20() : encodedMemoryCacheTrimStrategy;
        this.bitmapMemoryCacheEntryStateObserver = c20058a.m186235d();
        Bitmap.Config bitmapConfig = c20058a.getBitmapConfig();
        this.bitmapConfig = bitmapConfig == null ? Bitmap.Config.ARGB_8888 : bitmapConfig;
        cy3 cacheKeyFactory = c20058a.getCacheKeyFactory();
        if (cacheKeyFactory == null) {
            cacheKeyFactory = xmd.m211716f();
            cacheKeyFactory.getClass();
        }
        this.cacheKeyFactory = cacheKeyFactory;
        Context context = c20058a.getContext();
        if (context == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.context = context;
        this.downsampleMode = c20058a.getDownsampleMode();
        a7h0<npy> a7h0VarM186250s = c20058a.m186250s();
        this.encodedMemoryCacheParamsSupplier = a7h0VarM186250s == null ? new lod() : a7h0VarM186250s;
        mhm imageCacheStatsTracker = c20058a.getImageCacheStatsTracker();
        if (imageCacheStatsTracker == null) {
            imageCacheStatsTracker = et40.m122414o();
            imageCacheStatsTracker.getClass();
        }
        this.imageCacheStatsTracker = imageCacheStatsTracker;
        this.imageDecoder = c20058a.getImageDecoder();
        a7h0<Boolean> a7h0VarM186248q = c20058a.m186248q();
        if (a7h0VarM186248q == null) {
            a7h0VarM186248q = d7h0.f85513b;
            a7h0VarM186248q.getClass();
        }
        this.enableEncodedImageColorSpaceUsage = a7h0VarM186248q;
        Companion companion = INSTANCE;
        this.imageTranscoderFactory = companion.m186264g(c20058a);
        this.imageTranscoderType = c20058a.getImageTranscoderType();
        a7h0<Boolean> a7h0VarM186220P = c20058a.m186220P();
        if (a7h0VarM186220P == null) {
            a7h0VarM186220P = d7h0.f85512a;
            a7h0VarM186220P.getClass();
        }
        this.isPrefetchEnabledSupplier = a7h0VarM186220P;
        b4e mainDiskCacheConfig = c20058a.getMainDiskCacheConfig();
        this.mainDiskCacheConfig = mainDiskCacheConfig == null ? companion.m186263f(c20058a.getContext()) : mainDiskCacheConfig;
        gqy memoryTrimmableRegistry = c20058a.getMemoryTrimmableRegistry();
        if (memoryTrimmableRegistry == null) {
            memoryTrimmableRegistry = gt40.m132200b();
            memoryTrimmableRegistry.getClass();
        }
        this.memoryTrimmableRegistry = memoryTrimmableRegistry;
        this.memoryChunkType = companion.m186265h(c20058a, getExperiments());
        int httpConnectionTimeout = c20058a.getHttpConnectionTimeout() < 0 ? 30000 : c20058a.getHttpConnectionTimeout();
        this.httpNetworkTimeout = httpConnectionTimeout;
        if (i9j.m139099d()) {
            i9j.m139097a("ImagePipelineConfig->mNetworkFetcher");
            try {
                vj20VarM186211G = c20058a.m186211G();
                vj20VarM186211G = vj20VarM186211G == null ? new snl(httpConnectionTimeout) : vj20VarM186211G;
                i9j.m139098b();
            } catch (Throwable th) {
                i9j.m139098b();
                throw th;
            }
        } else {
            vj20VarM186211G = c20058a.m186211G();
            if (vj20VarM186211G == null) {
                vj20VarM186211G = new snl(httpConnectionTimeout);
            }
        }
        this.networkFetcher = vj20VarM186211G;
        this.platformBitmapFactory = c20058a.getPlatformBitmapFactory();
        aj80 poolFactory = c20058a.getPoolFactory();
        this.poolFactory = poolFactory == null ? new aj80(yi80.m216015n().m216041m()) : poolFactory;
        t4b0 progressiveJpegConfig = c20058a.getProgressiveJpegConfig();
        this.progressiveJpegConfig = progressiveJpegConfig == null ? new kpf0() : progressiveJpegConfig;
        Set<j2d0> setM186216L = c20058a.m186216L();
        this.requestListeners = setM186216L == null ? SetsKt.emptySet() : setM186216L;
        Set<k2d0> setM186215K = c20058a.m186215K();
        this.requestListener2s = setM186215K == null ? SetsKt.emptySet() : setM186215K;
        Set<lzb> setM186243l = c20058a.m186243l();
        this.customProducerSequenceFactories = setM186243l == null ? SetsKt.emptySet() : setM186243l;
        this.isResizeAndRotateEnabledForNetwork = c20058a.getResizeAndRotateEnabledForNetwork();
        b4e smallImageDiskCacheConfig = c20058a.getSmallImageDiskCacheConfig();
        this.smallImageDiskCacheConfig = smallImageDiskCacheConfig == null ? getMainDiskCacheConfig() : smallImageDiskCacheConfig;
        c20058a.m186205A();
        int iM98359e = getPoolFactory().m98359e();
        d7f executorSupplier = c20058a.getExecutorSupplier();
        this.executorSupplier = executorSupplier == null ? new pod(iM98359e) : executorSupplier;
        this.isDiskCacheEnabled = c20058a.getDiskCacheEnabled();
        c20058a.m186240i();
        this.closeableReferenceLeakTracker = c20058a.getCloseableReferenceLeakTracker();
        this.bitmapCacheOverride = c20058a.m186234c();
        m23 bitmapMemoryCacheFactory = c20058a.getBitmapMemoryCacheFactory();
        this.bitmapMemoryCacheFactory = bitmapMemoryCacheFactory == null ? new fsb() : bitmapMemoryCacheFactory;
        this.encodedMemoryCacheOverride = c20058a.m186249r();
        this.executorServiceForAnimatedImages = c20058a.getSerialExecutorServiceForAnimatedImages();
        this.dynamicDiskCacheConfigMap = c20058a.m186247p();
        a7h0<g4e> a7h0VarM186245n = c20058a.m186245n();
        if (a7h0VarM186245n == null) {
            jii fileCacheFactory = c20058a.getFileCacheFactory();
            a7h0VarM186245n = new o4e(fileCacheFactory == null ? new b5e(new zge()) : fileCacheFactory, this);
        }
        this.diskCachesStoreSupplier = a7h0VarM186245n;
        uup0 uup0VarM196411z = getExperiments().getWebpBitmapFactory();
        if (uup0VarM196411z != null) {
            companion.m186267j(uup0VarM196411z, getExperiments(), new qgl(getPoolFactory()));
        }
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public static final C20060c m186169J() {
        return INSTANCE.m186262e();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: K */
    public static final C20058a m186170K(@NotNull Context context) {
        return INSTANCE.m186266i(context);
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: A */
    public a7h0<g4e> mo186171A() {
        return this.diskCachesStoreSupplier;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: B, reason: from getter */
    public m23 getBitmapMemoryCacheFactory() {
        return this.bitmapMemoryCacheFactory;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public cy3 getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @Override // p153l.tjm
    /* JADX INFO: renamed from: D, reason: from getter */
    public boolean getIsResizeAndRotateEnabledForNetwork() {
        return this.isResizeAndRotateEnabledForNetwork;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: E */
    public Set<lzb> mo186175E() {
        return this.customProducerSequenceFactories;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: F, reason: from getter */
    public DownsampleMode getDownsampleMode() {
        return this.downsampleMode;
    }

    @Override // p153l.tjm
    @Nullable
    /* JADX INFO: renamed from: G */
    public e94 mo186177G() {
        return null;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public d7f getExecutorSupplier() {
        return this.executorSupplier;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<k2d0> mo186179a() {
        return this.requestListener2s;
    }

    @Override // p153l.tjm
    @Nullable
    /* JADX INFO: renamed from: b */
    public mpy<by3, PooledByteBuffer> mo186180b() {
        return this.encodedMemoryCacheOverride;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public t4b0 getProgressiveJpegConfig() {
        return this.progressiveJpegConfig;
    }

    @Override // p153l.tjm
    @Nullable
    /* JADX INFO: renamed from: d */
    public Map<String, b4e> mo186182d() {
        return this.dynamicDiskCacheConfigMap;
    }

    @Override // p153l.tjm
    @Nullable
    /* JADX INFO: renamed from: e */
    public hsb.InterfaceC17569b<by3> mo186183e() {
        return this.bitmapMemoryCacheEntryStateObserver;
    }

    @Override // p153l.tjm
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getIsDiskCacheEnabled() {
        return this.isDiskCacheEnabled;
    }

    @Override // p153l.tjm
    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public shm getImageDecoder() {
        return this.imageDecoder;
    }

    @Override // p153l.tjm
    @NotNull
    public Context getContext() {
        return this.context;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: h */
    public a7h0<npy> mo186186h() {
        return this.encodedMemoryCacheParamsSupplier;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public aj80 getPoolFactory() {
        return this.poolFactory;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public hb5 getCloseableReferenceLeakTracker() {
        return this.closeableReferenceLeakTracker;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public mhm getImageCacheStatsTracker() {
        return this.imageCacheStatsTracker;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: l */
    public a7h0<Boolean> mo186190l() {
        return this.isPrefetchEnabledSupplier;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public gqy getMemoryTrimmableRegistry() {
        return this.memoryTrimmableRegistry;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public ujm getExperiments() {
        return this.experiments;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: o */
    public vj20<?> mo186193o() {
        return this.networkFetcher;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public b4e getMainDiskCacheConfig() {
        return this.mainDiskCacheConfig;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: q */
    public Set<j2d0> mo186195q() {
        return this.requestListeners;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public mpy.InterfaceC18667a getEncodedMemoryCacheTrimStrategy() {
        return this.encodedMemoryCacheTrimStrategy;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public mpy.InterfaceC18667a getBitmapMemoryCacheTrimStrategy() {
        return this.bitmapMemoryCacheTrimStrategy;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public b4e getSmallImageDiskCacheConfig() {
        return this.smallImageDiskCacheConfig;
    }

    @Override // p153l.tjm
    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public vqe0 getExecutorServiceForAnimatedImages() {
        return this.executorServiceForAnimatedImages;
    }

    @Override // p153l.tjm
    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public Integer getImageTranscoderType() {
        return this.imageTranscoderType;
    }

    @Override // p153l.tjm
    @Nullable
    /* JADX INFO: renamed from: w, reason: from getter */
    public xkm getImageTranscoderFactory() {
        return this.imageTranscoderFactory;
    }

    @Override // p153l.tjm
    @Nullable
    /* JADX INFO: renamed from: x */
    public thm mo186202x() {
        return null;
    }

    @Override // p153l.tjm
    @NotNull
    /* JADX INFO: renamed from: y */
    public a7h0<npy> mo186203y() {
        return this.bitmapMemoryCacheParamsSupplier;
    }

    @Override // p153l.tjm
    /* JADX INFO: renamed from: z, reason: from getter */
    public int getMemoryChunkType() {
        return this.memoryChunkType;
    }

    /* JADX INFO: renamed from: l.sjm$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b \u0010!¨\u0006#"}, m88121d2 = {"Ll/sjm$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/sjm$a;", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;)Ll/sjm$a;", "Ll/uup0;", "webpBitmapFactory", "Ll/ujm;", "imagePipelineExperiments", "Ll/p13;", "bitmapCreator", "", "j", "(Ll/uup0;Ll/ujm;Ll/p13;)V", "Ll/b4e;", "f", "(Landroid/content/Context;)Ll/b4e;", "builder", "Ll/xkm;", "g", "(Ll/sjm$a;)Ll/xkm;", "", "h", "(Ll/sjm$a;Ll/ujm;)I", "Ll/sjm$c;", "value", "defaultImageRequestConfig", "Ll/sjm$c;", "e", "()Ll/sjm$c;", "getDefaultImageRequestConfig$annotations", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C20060c m186262e() {
            return sjm.f169033M;
        }

        /* JADX INFO: renamed from: f */
        public final b4e m186263f(Context context) {
            b4e b4eVarM102441n;
            if (i9j.m139099d()) {
                i9j.m139097a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
                try {
                    b4eVarM102441n = b4e.m102415m(context).m102441n();
                    i9j.m139098b();
                } catch (Throwable th) {
                    i9j.m139098b();
                    throw th;
                }
            } else {
                b4eVarM102441n = b4e.m102415m(context).m102441n();
            }
            b4eVarM102441n.getClass();
            return b4eVarM102441n;
        }

        /* JADX INFO: renamed from: g */
        public final xkm m186264g(C20058a builder) {
            if (builder.getImageTranscoderFactory() == null || builder.getImageTranscoderType() == null) {
                return builder.getImageTranscoderFactory();
            }
            wtq0.m207906a("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
            return null;
        }

        /* JADX INFO: renamed from: h */
        public final int m186265h(C20058a builder, ujm imagePipelineExperiments) {
            Integer memoryChunkType = builder.getMemoryChunkType();
            if (memoryChunkType != null) {
                return memoryChunkType.intValue();
            }
            if (imagePipelineExperiments.getMemoryType() == 2 && Build.VERSION.SDK_INT >= 27) {
                return 2;
            }
            if (imagePipelineExperiments.getMemoryType() == 1) {
                return 1;
            }
            imagePipelineExperiments.getMemoryType();
            return 0;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: i */
        public final C20058a m186266i(@NotNull Context context) {
            context.getClass();
            return new C20058a(context);
        }

        /* JADX INFO: renamed from: j */
        public final void m186267j(uup0 webpBitmapFactory, ujm imagePipelineExperiments, p13 bitmapCreator) {
            vup0.f185832b = webpBitmapFactory;
            imagePipelineExperiments.m196374A();
            if (bitmapCreator != null) {
                webpBitmapFactory.mo9304a(bitmapCreator);
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ sjm(C20058a c20058a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c20058a);
    }
}
