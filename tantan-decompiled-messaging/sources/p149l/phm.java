package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 º\u00012\u00020\u0001:\u0003\u0014\u0007\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00107\u001a\b\u0012\u0004\u0012\u0002040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\u000f\u001a\u0004\b6\u0010\u0011R \u00109\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b/\u0010\u0011R\u001a\u0010?\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010D\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b;\u0010CR\u001c\u0010I\u001a\u0004\u0018\u00010E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b)\u0010HR\u001c\u0010O\u001a\u0004\u0018\u00010J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010S\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010\u000f\u001a\u0004\bR\u0010\u0011R\"\u0010[\u001a\u0004\u0018\u00010T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR \u0010]\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010\u000f\u001a\u0004\bA\u0010\u0011R\u001a\u0010a\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\bU\u0010`R\u001a\u0010e\u001a\u00020b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bF\u0010dR \u0010k\u001a\u00020T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bj\u0010Z\u001a\u0004\bh\u0010iR\u001e\u0010p\u001a\u0006\u0012\u0002\b\u00030l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bQ\u0010oR\u0014\u0010q\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010gR\u001c\u0010v\u001a\u0004\u0018\u00010r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010{\u001a\u00020w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\b5\u0010zR\u001a\u0010\u007f\u001a\u00020|8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010}\u001a\u0004\b\u0014\u0010~R%\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bh\u0010\u0082\u0001\u001a\u0005\b\\\u0010\u0083\u0001R%\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b6\u0010\u0082\u0001\u001a\u0005\b\u0007\u0010\u0083\u0001R'\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0082\u0001\u001a\u0006\b\u0089\u0001\u0010\u0083\u0001R\u001e\u0010\u008e\u0001\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b%\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u008c\u0001\u0010_\u001a\u0004\bf\u0010`R\u001f\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u0091\u0001\u001a\u0005\bK\u0010\u0092\u0001R\u001d\u0010\u0094\u0001\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b1\u0010\u008b\u0001\u001a\u0005\b#\u0010\u008d\u0001R\u001f\u0010\u0099\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0005\b8\u0010\u0098\u0001R.\u0010\u009f\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0018\u00010\u009a\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b=\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R-\u0010¡\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030 \u0001\u0018\u00010\u009a\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bg\u0010\u009c\u0001\u001a\u0005\b\u000e\u0010\u009e\u0001R!\u0010¦\u0001\u001a\u0005\u0018\u00010¢\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0005\bm\u0010¥\u0001R \u0010«\u0001\u001a\u00030§\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\b\u0088\u0001\u0010ª\u0001R.\u0010±\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u00ad\u0001\u0012\u0004\u0012\u00020^\u0018\u00010¬\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0005\b\u0019\u0010°\u0001R!\u0010³\u0001\u001a\u0005\u0018\u00010²\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b³\u0001\u0010´\u0001\u001a\u0005\bx\u0010µ\u0001R\"\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b\u0096\u0001\u0010¹\u0001¨\u0006»\u0001"}, m87232d2 = {"Ll/phm;", "Ll/qhm;", "Ll/phm$a;", "builder", "<init>", "(Ll/phm$a;)V", "Landroid/graphics/Bitmap$Config;", "a", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ll/syg0;", "Ll/qgy;", "b", "Ll/syg0;", BaseSei.f13931Y, "()Ll/syg0;", "bitmapMemoryCacheParamsSupplier", "Ll/pgy$a;", "c", "Ll/pgy$a;", BLiveStormDanmakuGiftResourceType.f44446s, "()Ll/pgy$a;", "bitmapMemoryCacheTrimStrategy", Constants.INAPP_DATA_TAG, "r", "encodedMemoryCacheTrimStrategy", "Ll/tqb$b;", "Ll/cx3;", "e", "Ll/tqb$b;", "()Ll/tqb$b;", "bitmapMemoryCacheEntryStateObserver", "Ll/dx3;", "f", "Ll/dx3;", b2s.C_ZONE, "()Ll/dx3;", "cacheKeyFactory", "Landroid/content/Context;", "g", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "h", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "F", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "Ll/s2e;", RXScreenCaptureService.KEY_INDEX, "A", "diskCachesStoreSupplier", "j", "encodedMemoryCacheParamsSupplier", "Ll/x5f;", "k", "Ll/x5f;", "H", "()Ll/x5f;", "executorSupplier", "Ll/wem;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/wem;", "()Ll/wem;", "imageCacheStatsTracker", "Ll/cfm;", "m", "Ll/cfm;", "()Ll/cfm;", "imageDecoder", "Ll/uim;", "n", "Ll/uim;", "w", "()Ll/uim;", "imageTranscoderFactory", "", "o", "getEnableEncodedImageColorSpaceUsage", "enableEncodedImageColorSpaceUsage", "", "p", "Ljava/lang/Integer;", ResourceDirection.f38808v, "()Ljava/lang/Integer;", "getImageTranscoderType$annotations", "()V", "imageTranscoderType", "q", "isPrefetchEnabledSupplier", "Ll/n2e;", "Ll/n2e;", "()Ll/n2e;", "mainDiskCacheConfig", "Ll/jhy;", "Ll/jhy;", "()Ll/jhy;", "memoryTrimmableRegistry", Constants.KEY_T, "I", BaseSei.f13932Z, "()I", "getMemoryChunkType$annotations", "memoryChunkType", "Ll/mb20;", "u", "Ll/mb20;", "()Ll/mb20;", "networkFetcher", "httpNetworkTimeout", "Ll/r480;", "Ll/r480;", "getPlatformBitmapFactory", "()Ll/r480;", "platformBitmapFactory", "Ll/ua80;", BaseSei.f13930X, "Ll/ua80;", "()Ll/ua80;", "poolFactory", "Ll/pwa0;", "Ll/pwa0;", "()Ll/pwa0;", "progressiveJpegConfig", "", "Ll/guc0;", "Ljava/util/Set;", "()Ljava/util/Set;", "requestListeners", "Ll/huc0;", "requestListener2s", "Ll/xxb;", "B", "E", "customProducerSequenceFactories", "Z", "D", "()Z", "isResizeAndRotateEnabledForNetwork", "smallImageDiskCacheConfig", "Ll/rhm;", "Ll/rhm;", "()Ll/rhm;", "experiments", "isDiskCacheEnabled", "Ll/ha5;", "G", "Ll/ha5;", "()Ll/ha5;", "closeableReferenceLeakTracker", "Ll/pgy;", "Ll/da5;", "Ll/pgy;", "getBitmapCacheOverride", "()Ll/pgy;", "bitmapCacheOverride", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCacheOverride", "Ll/qie0;", "J", "Ll/qie0;", "()Ll/qie0;", "executorServiceForAnimatedImages", "Ll/w13;", "K", "Ll/w13;", "()Ll/w13;", "bitmapMemoryCacheFactory", "", "", "L", "Ljava/util/Map;", "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "Ll/dfm;", "imageDecoderConfig", "Ll/dfm;", "()Ll/dfm;", "Ll/f84;", "callerContextVerifier", "Ll/f84;", "()Ll/f84;", "Companion", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class phm implements qhm {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: M */
    @NotNull
    public static C19217c f148941M = new C19217c();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Set<huc0> requestListener2s;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Set<xxb> customProducerSequenceFactories;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final boolean isResizeAndRotateEnabledForNetwork;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final n2e smallImageDiskCacheConfig;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final rhm experiments;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final boolean isDiskCacheEnabled;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final ha5 closeableReferenceLeakTracker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public final pgy<cx3, da5> bitmapCacheOverride;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public final pgy<cx3, PooledByteBuffer> encodedMemoryCacheOverride;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public final qie0 executorServiceForAnimatedImages;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final w13 bitmapMemoryCacheFactory;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public final Map<String, n2e> dynamicDiskCacheConfigMap;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final syg0<qgy> bitmapMemoryCacheParamsSupplier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final pgy.InterfaceC19209a bitmapMemoryCacheTrimStrategy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final pgy.InterfaceC19209a encodedMemoryCacheTrimStrategy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final tqb.InterfaceC20245b<cx3> bitmapMemoryCacheEntryStateObserver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final dx3 cacheKeyFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final DownsampleMode downsampleMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final syg0<s2e> diskCachesStoreSupplier;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final syg0<qgy> encodedMemoryCacheParamsSupplier;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final x5f executorSupplier;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final wem imageCacheStatsTracker;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final cfm imageDecoder;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public final uim imageTranscoderFactory;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final syg0<Boolean> enableEncodedImageColorSpaceUsage;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public final Integer imageTranscoderType;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final syg0<Boolean> isPrefetchEnabledSupplier;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final n2e mainDiskCacheConfig;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final jhy memoryTrimmableRegistry;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int memoryChunkType;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final mb20<?> networkFetcher;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final int httpNetworkTimeout;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public final r480 platformBitmapFactory;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final ua80 poolFactory;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final pwa0 progressiveJpegConfig;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Set<guc0> requestListeners;

    /* JADX INFO: renamed from: l.phm$a */
    @Metadata(m87231d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00002\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010!¢\u0006\u0004\b.\u0010$J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101R(\u00106\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b4\u00105R4\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b8\u00109R4\u0010@\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R(\u0010E\u001a\u0004\u0018\u00010A2\b\u00102\u001a\u0004\u0018\u00010A8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010B\u001a\u0004\bC\u0010DR(\u0010H\u001a\u0004\u0018\u00010A2\b\u00102\u001a\u0004\u0018\u00010A8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u00102\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010L\u001a\u0004\bM\u0010NR$\u0010\u0014\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010O\u001a\u0004\bP\u0010QR4\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\bS\u00109R(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u00102\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR(\u0010\\\u001a\u0004\u0018\u00010X2\b\u00102\u001a\u0004\u0018\u00010X8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010Y\u001a\u0004\bZ\u0010[R(\u0010b\u001a\u0004\u0018\u00010]2\b\u00102\u001a\u0004\u0018\u00010]8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR4\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bc\u00107\u001a\u0004\bd\u00109R(\u0010k\u001a\u0004\u0018\u00010f2\b\u00102\u001a\u0004\u0018\u00010f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR*\u0010t\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bP\u0010m\u0012\u0004\br\u0010s\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR4\u0010w\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bu\u00107\u001a\u0004\bv\u00109R(\u0010\"\u001a\u0004\u0018\u00010!2\b\u00102\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bd\u0010x\u001a\u0004\by\u0010zR(\u0010&\u001a\u0004\u0018\u00010%2\b\u00102\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R-\u0010\u0082\u0001\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u001a\n\u0004\bS\u0010m\u0012\u0005\b\u0081\u0001\u0010s\u001a\u0004\b\u007f\u0010o\"\u0005\b\u0080\u0001\u0010qR3\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\f\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010)8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bG\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R.\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0086\u00012\t\u00102\u001a\u0005\u0018\u00010\u0086\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bV\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R/\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008b\u00012\t\u00102\u001a\u0005\u0018\u00010\u008b\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R/\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0091\u00012\t\u00102\u001a\u0005\u0018\u00010\u0091\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R=\u0010\u009d\u0001\u001a\f\u0012\u0005\u0012\u00030\u0098\u0001\u0018\u00010\u0097\u00012\u0010\u00102\u001a\f\u0012\u0005\u0012\u00030\u0098\u0001\u0018\u00010\u0097\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R<\u0010 \u0001\u001a\f\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0097\u00012\u0010\u00102\u001a\f\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0097\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bZ\u0010\u009a\u0001\u001a\u0006\b\u009f\u0001\u0010\u009c\u0001R;\u0010¢\u0001\u001a\f\u0012\u0005\u0012\u00030¡\u0001\u0018\u00010\u0097\u00012\u0010\u00102\u001a\f\u0012\u0005\u0012\u00030¡\u0001\u0018\u00010\u0097\u00018\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b`\u0010\u009a\u0001\u001a\u0005\b^\u0010\u009c\u0001R(\u0010¦\u0001\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b£\u0001\u0010+\u001a\u0006\b¤\u0001\u0010¥\u0001R)\u0010-\u001a\u0004\u0018\u00010!2\b\u00102\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\bi\u0010x\u001a\u0005\b§\u0001\u0010zR.\u0010«\u0001\u001a\u0005\u0018\u00010¨\u00012\t\u00102\u001a\u0005\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bn\u0010©\u0001\u001a\u0006\b\u0092\u0001\u0010ª\u0001R7\u0010\u00ad\u0001\u001a\u000b\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010\n2\u000f\u00102\u001a\u000b\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\by\u00107\u001a\u0004\bg\u00109R(\u0010¯\u0001\u001a\u00020l2\u0006\u00102\u001a\u00020l8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u007f\u0010\u008e\u0001\u001a\u0006\b\u0099\u0001\u0010®\u0001R\u001c\u0010³\u0001\u001a\u00030°\u00018\u0006¢\u0006\u000f\n\u0005\b}\u0010±\u0001\u001a\u0006\b\u008c\u0001\u0010²\u0001R'\u0010´\u0001\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010+\u001a\u0005\bc\u0010¥\u0001R*\u0010¸\u0001\u001a\u00030µ\u00012\u0007\u00102\u001a\u00030µ\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0088\u0001\u0010¶\u0001\u001a\u0005\bT\u0010·\u0001RH\u0010½\u0001\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030º\u0001\u0018\u00010¹\u00012\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030º\u0001\u0018\u00010¹\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010»\u0001\u001a\u0005\b<\u0010¼\u0001RH\u0010¿\u0001\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030¾\u0001\u0018\u00010¹\u00012\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030¾\u0001\u0018\u00010¹\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010»\u0001\u001a\u0005\b{\u0010¼\u0001R/\u0010Ä\u0001\u001a\u0005\u0018\u00010À\u00012\t\u00102\u001a\u0005\u0018\u00010À\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R.\u0010È\u0001\u001a\u0005\u0018\u00010Å\u00012\t\u00102\u001a\u0005\u0018\u00010Å\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010Æ\u0001\u001a\u0005\bF\u0010Ç\u0001RH\u0010Í\u0001\u001a\u0012\u0012\u0005\u0012\u00030Ê\u0001\u0012\u0004\u0012\u00020!\u0018\u00010É\u00012\u0016\u00102\u001a\u0012\u0012\u0005\u0012\u00030Ê\u0001\u0012\u0004\u0012\u00020!\u0018\u00010É\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b¤\u0001\u0010Ë\u0001\u001a\u0005\bu\u0010Ì\u0001R/\u0010Ï\u0001\u001a\u0005\u0018\u00010Î\u00012\t\u00102\u001a\u0005\u0018\u00010Î\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\b£\u0001\u0010Ñ\u0001R.\u0010Ó\u0001\u001a\u0005\u0018\u00010Ò\u00012\t\u00102\u001a\u0005\u0018\u00010Ò\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0005\bR\u0010Õ\u0001¨\u0006Ö\u0001"}, m87232d2 = {"Ll/phm$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Bitmap$Config;", Constants.KEY_CONFIG, "R", "(Landroid/graphics/Bitmap$Config;)Ll/phm$a;", "Ll/syg0;", "Ll/qgy;", "bitmapMemoryCacheParamsSupplier", "Q", "(Ll/syg0;)Ll/phm$a;", "Ll/dx3;", "cacheKeyFactory", j6f.LATITUDE_SOUTH, "(Ll/dx3;)Ll/phm$a;", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "U", "(Lcom/facebook/imagepipeline/core/DownsampleMode;)Ll/phm$a;", "", "downsampleEnabled", j6f.GPS_DIRECTION_TRUE, "(Z)Ll/phm$a;", "encodedMemoryCacheParamsSupplier", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ll/x5f;", "executorSupplier", "W", "(Ll/x5f;)Ll/phm$a;", "Ll/n2e;", "mainDiskCacheConfig", "X", "(Ll/n2e;)Ll/phm$a;", "Ll/jhy;", "memoryTrimmableRegistry", "Y", "(Ll/jhy;)Ll/phm$a;", "Ll/mb20;", "networkFetcher", "Z", "(Ll/mb20;)Ll/phm$a;", "smallImageDiskCacheConfig", "a0", "Ll/phm;", "a", "()Ll/phm;", "value", "Landroid/graphics/Bitmap$Config;", "b", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ll/syg0;", "f", "()Ll/syg0;", "Ll/tqb$b;", "Ll/cx3;", "c", "Ll/tqb$b;", Constants.INAPP_DATA_TAG, "()Ll/tqb$b;", "bitmapMemoryCacheEntryStateObserver", "Ll/pgy$a;", "Ll/pgy$a;", "g", "()Ll/pgy$a;", "bitmapMemoryCacheTrimStrategy", "e", Constants.KEY_T, "encodedMemoryCacheTrimStrategy", "Ll/dx3;", "h", "()Ll/dx3;", "Landroid/content/Context;", "k", "()Landroid/content/Context;", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "o", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", RXScreenCaptureService.KEY_INDEX, BLiveStormDanmakuGiftResourceType.f44446s, "j", "Ll/x5f;", "u", "()Ll/x5f;", "Ll/wem;", "Ll/wem;", BaseSei.f13931Y, "()Ll/wem;", "imageCacheStatsTracker", "Ll/cfm;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/cfm;", BaseSei.f13932Z, "()Ll/cfm;", "imageDecoder", "m", "q", "enableEncodedImageColorSpaceUsage", "Ll/uim;", "n", "Ll/uim;", "B", "()Ll/uim;", "imageTranscoderFactory", "", "Ljava/lang/Integer;", b2s.C_ZONE, "()Ljava/lang/Integer;", "setImageTranscoderType", "(Ljava/lang/Integer;)V", "getImageTranscoderType$annotations", "()V", "imageTranscoderType", "p", "P", "isPrefetchEnabledSupplier", "Ll/n2e;", "D", "()Ll/n2e;", "r", "Ll/jhy;", "F", "()Ll/jhy;", "E", "setMemoryChunkType", "getMemoryChunkType$annotations", "memoryChunkType", "Ll/mb20;", "G", "()Ll/mb20;", "Ll/r480;", "Ll/r480;", "H", "()Ll/r480;", "platformBitmapFactory", "Ll/ua80;", ResourceDirection.f38808v, "Ll/ua80;", "I", "()Ll/ua80;", "poolFactory", "Ll/pwa0;", "w", "Ll/pwa0;", "J", "()Ll/pwa0;", "progressiveJpegConfig", "", "Ll/guc0;", BaseSei.f13930X, "Ljava/util/Set;", "L", "()Ljava/util/Set;", "requestListeners", "Ll/huc0;", "K", "requestListener2s", "Ll/xxb;", "customProducerSequenceFactories", "A", "M", "()Z", "resizeAndRotateEnabledForNetwork", BloodType.f38728O, "Ll/nfi;", "Ll/nfi;", "()Ll/nfi;", "fileCacheFactory", "Ll/s2e;", "diskCachesStoreSupplier", "()I", "httpConnectionTimeout", "Ll/rhm$a;", "Ll/rhm$a;", "()Ll/rhm$a;", "experimentsBuilder", "diskCacheEnabled", "Ll/ha5;", "Ll/ha5;", "()Ll/ha5;", "closeableReferenceLeakTracker", "Ll/pgy;", "Ll/da5;", "Ll/pgy;", "()Ll/pgy;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Ll/qie0;", "Ll/qie0;", "N", "()Ll/qie0;", "serialExecutorServiceForAnimatedImages", "Ll/w13;", "Ll/w13;", "()Ll/w13;", "bitmapMemoryCacheFactory", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "Ll/dfm;", "imageDecoderConfig", "Ll/dfm;", "()Ll/dfm;", "Ll/f84;", "callerContextVerifier", "Ll/f84;", "()Ll/f84;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C19215a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        public boolean resizeAndRotateEnabledForNetwork;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @Nullable
        public n2e smallImageDiskCacheConfig;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @Nullable
        public nfi fileCacheFactory;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @Nullable
        public syg0<s2e> diskCachesStoreSupplier;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        public int httpConnectionTimeout;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @NotNull
        public final rhm.C19698a experimentsBuilder;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        public boolean diskCacheEnabled;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        @NotNull
        public ha5 closeableReferenceLeakTracker;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        @Nullable
        public pgy<cx3, da5> bitmapMemoryCache;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        @Nullable
        public pgy<cx3, PooledByteBuffer> encodedMemoryCache;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        @Nullable
        public qie0 serialExecutorServiceForAnimatedImages;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        @Nullable
        public w13 bitmapMemoryCacheFactory;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        @Nullable
        public Map<String, ? extends n2e> dynamicDiskCacheConfigMap;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Bitmap.Config bitmapConfig;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public syg0<qgy> bitmapMemoryCacheParamsSupplier;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public tqb.InterfaceC20245b<cx3> bitmapMemoryCacheEntryStateObserver;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public pgy.InterfaceC19209a bitmapMemoryCacheTrimStrategy;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public pgy.InterfaceC19209a encodedMemoryCacheTrimStrategy;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public dx3 cacheKeyFactory;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public DownsampleMode downsampleMode;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public syg0<qgy> encodedMemoryCacheParamsSupplier;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public x5f executorSupplier;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public wem imageCacheStatsTracker;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public cfm imageDecoder;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public syg0<Boolean> enableEncodedImageColorSpaceUsage;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @Nullable
        public uim imageTranscoderFactory;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @Nullable
        public Integer imageTranscoderType;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public syg0<Boolean> isPrefetchEnabledSupplier;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @Nullable
        public n2e mainDiskCacheConfig;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public jhy memoryTrimmableRegistry;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @Nullable
        public Integer memoryChunkType;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @Nullable
        public mb20<?> networkFetcher;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @Nullable
        public r480 platformBitmapFactory;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @Nullable
        public ua80 poolFactory;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @Nullable
        public pwa0 progressiveJpegConfig;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @Nullable
        public Set<? extends guc0> requestListeners;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @Nullable
        public Set<? extends huc0> requestListener2s;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @Nullable
        public Set<? extends xxb> customProducerSequenceFactories;

        public C19215a(@NotNull Context context) {
            context.getClass();
            this.downsampleMode = DownsampleMode.AUTO;
            this.resizeAndRotateEnabledForNetwork = true;
            this.httpConnectionTimeout = -1;
            this.experimentsBuilder = new rhm.C19698a(this);
            this.diskCacheEnabled = true;
            this.closeableReferenceLeakTracker = new mk40();
            this.context = context;
        }

        @Nullable
        /* JADX INFO: renamed from: A */
        public final dfm m169014A() {
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final uim getImageTranscoderFactory() {
            return this.imageTranscoderFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final Integer getImageTranscoderType() {
            return this.imageTranscoderType;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final n2e getMainDiskCacheConfig() {
            return this.mainDiskCacheConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: E, reason: from getter */
        public final Integer getMemoryChunkType() {
            return this.memoryChunkType;
        }

        @Nullable
        /* JADX INFO: renamed from: F, reason: from getter */
        public final jhy getMemoryTrimmableRegistry() {
            return this.memoryTrimmableRegistry;
        }

        @Nullable
        /* JADX INFO: renamed from: G */
        public final mb20<?> m169020G() {
            return this.networkFetcher;
        }

        @Nullable
        /* JADX INFO: renamed from: H, reason: from getter */
        public final r480 getPlatformBitmapFactory() {
            return this.platformBitmapFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: I, reason: from getter */
        public final ua80 getPoolFactory() {
            return this.poolFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: J, reason: from getter */
        public final pwa0 getProgressiveJpegConfig() {
            return this.progressiveJpegConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: K */
        public final Set<huc0> m169024K() {
            return this.requestListener2s;
        }

        @Nullable
        /* JADX INFO: renamed from: L */
        public final Set<guc0> m169025L() {
            return this.requestListeners;
        }

        /* JADX INFO: renamed from: M, reason: from getter */
        public final boolean getResizeAndRotateEnabledForNetwork() {
            return this.resizeAndRotateEnabledForNetwork;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final qie0 getSerialExecutorServiceForAnimatedImages() {
            return this.serialExecutorServiceForAnimatedImages;
        }

        @Nullable
        /* JADX INFO: renamed from: O, reason: from getter */
        public final n2e getSmallImageDiskCacheConfig() {
            return this.smallImageDiskCacheConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: P */
        public final syg0<Boolean> m169029P() {
            return this.isPrefetchEnabledSupplier;
        }

        @NotNull
        /* JADX INFO: renamed from: Q */
        public final C19215a m169030Q(@Nullable syg0<qgy> bitmapMemoryCacheParamsSupplier) {
            if (bitmapMemoryCacheParamsSupplier != null) {
                this.bitmapMemoryCacheParamsSupplier = bitmapMemoryCacheParamsSupplier;
                return this;
            }
            qkq0.m175383a("Required value was null.");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: R */
        public final C19215a m169031R(@Nullable Bitmap.Config config) {
            this.bitmapConfig = config;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: S */
        public final C19215a m169032S(@Nullable dx3 cacheKeyFactory) {
            this.cacheKeyFactory = cacheKeyFactory;
            return this;
        }

        @Deprecated
        @NotNull
        /* JADX INFO: renamed from: T */
        public final C19215a m169033T(boolean downsampleEnabled) {
            if (downsampleEnabled) {
                m169034U(DownsampleMode.ALWAYS);
                return this;
            }
            m169034U(DownsampleMode.AUTO);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: U */
        public final C19215a m169034U(@NotNull DownsampleMode downsampleMode) {
            downsampleMode.getClass();
            this.downsampleMode = downsampleMode;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: V */
        public final C19215a m169035V(@Nullable syg0<qgy> encodedMemoryCacheParamsSupplier) {
            if (encodedMemoryCacheParamsSupplier != null) {
                this.encodedMemoryCacheParamsSupplier = encodedMemoryCacheParamsSupplier;
                return this;
            }
            qkq0.m175383a("Required value was null.");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: W */
        public final C19215a m169036W(@Nullable x5f executorSupplier) {
            this.executorSupplier = executorSupplier;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: X */
        public final C19215a m169037X(@Nullable n2e mainDiskCacheConfig) {
            this.mainDiskCacheConfig = mainDiskCacheConfig;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: Y */
        public final C19215a m169038Y(@Nullable jhy memoryTrimmableRegistry) {
            this.memoryTrimmableRegistry = memoryTrimmableRegistry;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: Z */
        public final C19215a m169039Z(@Nullable mb20<?> networkFetcher) {
            this.networkFetcher = networkFetcher;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final phm m169040a() {
            return new phm(this, null);
        }

        @NotNull
        /* JADX INFO: renamed from: a0 */
        public final C19215a m169041a0(@Nullable n2e smallImageDiskCacheConfig) {
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
        public final pgy<cx3, da5> m169043c() {
            return this.bitmapMemoryCache;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final tqb.InterfaceC20245b<cx3> m169044d() {
            return this.bitmapMemoryCacheEntryStateObserver;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final w13 getBitmapMemoryCacheFactory() {
            return this.bitmapMemoryCacheFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final syg0<qgy> m169046f() {
            return this.bitmapMemoryCacheParamsSupplier;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final pgy.InterfaceC19209a getBitmapMemoryCacheTrimStrategy() {
            return this.bitmapMemoryCacheTrimStrategy;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final dx3 getCacheKeyFactory() {
            return this.cacheKeyFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public final f84 m169049i() {
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final ha5 getCloseableReferenceLeakTracker() {
            return this.closeableReferenceLeakTracker;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        /* JADX INFO: renamed from: l */
        public final Set<xxb> m169052l() {
            return this.customProducerSequenceFactories;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getDiskCacheEnabled() {
            return this.diskCacheEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: n */
        public final syg0<s2e> m169054n() {
            return this.diskCachesStoreSupplier;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final DownsampleMode getDownsampleMode() {
            return this.downsampleMode;
        }

        @Nullable
        /* JADX INFO: renamed from: p */
        public final Map<String, n2e> m169056p() {
            return this.dynamicDiskCacheConfigMap;
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public final syg0<Boolean> m169057q() {
            return this.enableEncodedImageColorSpaceUsage;
        }

        @Nullable
        /* JADX INFO: renamed from: r */
        public final pgy<cx3, PooledByteBuffer> m169058r() {
            return this.encodedMemoryCache;
        }

        @Nullable
        /* JADX INFO: renamed from: s */
        public final syg0<qgy> m169059s() {
            return this.encodedMemoryCacheParamsSupplier;
        }

        @Nullable
        /* JADX INFO: renamed from: t, reason: from getter */
        public final pgy.InterfaceC19209a getEncodedMemoryCacheTrimStrategy() {
            return this.encodedMemoryCacheTrimStrategy;
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final x5f getExecutorSupplier() {
            return this.executorSupplier;
        }

        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public final rhm.C19698a getExperimentsBuilder() {
            return this.experimentsBuilder;
        }

        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public final nfi getFileCacheFactory() {
            return this.fileCacheFactory;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final int getHttpConnectionTimeout() {
            return this.httpConnectionTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public final wem getImageCacheStatsTracker() {
            return this.imageCacheStatsTracker;
        }

        @Nullable
        /* JADX INFO: renamed from: z, reason: from getter */
        public final cfm getImageDecoder() {
            return this.imageDecoder;
        }
    }

    /* JADX INFO: renamed from: l.phm$c */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m87232d2 = {"Ll/phm$c;", "", "<init>", "()V", "", "a", "Z", "()Z", "setProgressiveRenderingEnabled", "(Z)V", "isProgressiveRenderingEnabled", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C19217c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isProgressiveRenderingEnabled;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsProgressiveRenderingEnabled() {
            return this.isProgressiveRenderingEnabled;
        }
    }

    public phm(C19215a c19215a) {
        mb20<?> mb20VarM169020G;
        if (o6j.m162852d()) {
            o6j.m162850a("ImagePipelineConfig()");
        }
        this.experiments = c19215a.getExperimentsBuilder().m179426a();
        syg0<qgy> syg0VarM169046f = c19215a.m169046f();
        if (syg0VarM169046f == null) {
            Object systemService = c19215a.getContext().getSystemService("activity");
            if (systemService == null) {
                qkq0.m175383a("Required value was null.");
                throw null;
            }
            syg0VarM169046f = new mld((ActivityManager) systemService);
        }
        this.bitmapMemoryCacheParamsSupplier = syg0VarM169046f;
        pgy.InterfaceC19209a bitmapMemoryCacheTrimStrategy = c19215a.getBitmapMemoryCacheTrimStrategy();
        this.bitmapMemoryCacheTrimStrategy = bitmapMemoryCacheTrimStrategy == null ? new b23() : bitmapMemoryCacheTrimStrategy;
        pgy.InterfaceC19209a encodedMemoryCacheTrimStrategy = c19215a.getEncodedMemoryCacheTrimStrategy();
        this.encodedMemoryCacheTrimStrategy = encodedMemoryCacheTrimStrategy == null ? new m620() : encodedMemoryCacheTrimStrategy;
        this.bitmapMemoryCacheEntryStateObserver = c19215a.m169044d();
        Bitmap.Config bitmapConfig = c19215a.getBitmapConfig();
        this.bitmapConfig = bitmapConfig == null ? Bitmap.Config.ARGB_8888 : bitmapConfig;
        dx3 cacheKeyFactory = c19215a.getCacheKeyFactory();
        if (cacheKeyFactory == null) {
            cacheKeyFactory = rld.m179780f();
            cacheKeyFactory.getClass();
        }
        this.cacheKeyFactory = cacheKeyFactory;
        Context context = c19215a.getContext();
        if (context == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.context = context;
        this.downsampleMode = c19215a.getDownsampleMode();
        syg0<qgy> syg0VarM169059s = c19215a.m169059s();
        this.encodedMemoryCacheParamsSupplier = syg0VarM169059s == null ? new gnd() : syg0VarM169059s;
        wem imageCacheStatsTracker = c19215a.getImageCacheStatsTracker();
        if (imageCacheStatsTracker == null) {
            imageCacheStatsTracker = qk40.m175131o();
            imageCacheStatsTracker.getClass();
        }
        this.imageCacheStatsTracker = imageCacheStatsTracker;
        this.imageDecoder = c19215a.getImageDecoder();
        syg0<Boolean> syg0VarM169057q = c19215a.m169057q();
        if (syg0VarM169057q == null) {
            syg0VarM169057q = vyg0.f183524b;
            syg0VarM169057q.getClass();
        }
        this.enableEncodedImageColorSpaceUsage = syg0VarM169057q;
        Companion companion = INSTANCE;
        this.imageTranscoderFactory = companion.m169073g(c19215a);
        this.imageTranscoderType = c19215a.getImageTranscoderType();
        syg0<Boolean> syg0VarM169029P = c19215a.m169029P();
        if (syg0VarM169029P == null) {
            syg0VarM169029P = vyg0.f183523a;
            syg0VarM169029P.getClass();
        }
        this.isPrefetchEnabledSupplier = syg0VarM169029P;
        n2e mainDiskCacheConfig = c19215a.getMainDiskCacheConfig();
        this.mainDiskCacheConfig = mainDiskCacheConfig == null ? companion.m169072f(c19215a.getContext()) : mainDiskCacheConfig;
        jhy memoryTrimmableRegistry = c19215a.getMemoryTrimmableRegistry();
        if (memoryTrimmableRegistry == null) {
            memoryTrimmableRegistry = sk40.m184576b();
            memoryTrimmableRegistry.getClass();
        }
        this.memoryTrimmableRegistry = memoryTrimmableRegistry;
        this.memoryChunkType = companion.m169074h(c19215a, getExperiments());
        int httpConnectionTimeout = c19215a.getHttpConnectionTimeout() < 0 ? 30000 : c19215a.getHttpConnectionTimeout();
        this.httpNetworkTimeout = httpConnectionTimeout;
        if (o6j.m162852d()) {
            o6j.m162850a("ImagePipelineConfig->mNetworkFetcher");
            try {
                mb20VarM169020G = c19215a.m169020G();
                mb20VarM169020G = mb20VarM169020G == null ? new dll(httpConnectionTimeout) : mb20VarM169020G;
                o6j.m162851b();
            } catch (Throwable th) {
                o6j.m162851b();
                throw th;
            }
        } else {
            mb20VarM169020G = c19215a.m169020G();
            if (mb20VarM169020G == null) {
                mb20VarM169020G = new dll(httpConnectionTimeout);
            }
        }
        this.networkFetcher = mb20VarM169020G;
        this.platformBitmapFactory = c19215a.getPlatformBitmapFactory();
        ua80 poolFactory = c19215a.getPoolFactory();
        this.poolFactory = poolFactory == null ? new ua80(sa80.m182856n().m182882m()) : poolFactory;
        pwa0 progressiveJpegConfig = c19215a.getProgressiveJpegConfig();
        this.progressiveJpegConfig = progressiveJpegConfig == null ? new chf0() : progressiveJpegConfig;
        Set<guc0> setM169025L = c19215a.m169025L();
        this.requestListeners = setM169025L == null ? SetsKt.emptySet() : setM169025L;
        Set<huc0> setM169024K = c19215a.m169024K();
        this.requestListener2s = setM169024K == null ? SetsKt.emptySet() : setM169024K;
        Set<xxb> setM169052l = c19215a.m169052l();
        this.customProducerSequenceFactories = setM169052l == null ? SetsKt.emptySet() : setM169052l;
        this.isResizeAndRotateEnabledForNetwork = c19215a.getResizeAndRotateEnabledForNetwork();
        n2e smallImageDiskCacheConfig = c19215a.getSmallImageDiskCacheConfig();
        this.smallImageDiskCacheConfig = smallImageDiskCacheConfig == null ? getMainDiskCacheConfig() : smallImageDiskCacheConfig;
        c19215a.m169014A();
        int iM192740e = getPoolFactory().m192740e();
        x5f executorSupplier = c19215a.getExecutorSupplier();
        this.executorSupplier = executorSupplier == null ? new knd(iM192740e) : executorSupplier;
        this.isDiskCacheEnabled = c19215a.getDiskCacheEnabled();
        c19215a.m169049i();
        this.closeableReferenceLeakTracker = c19215a.getCloseableReferenceLeakTracker();
        this.bitmapCacheOverride = c19215a.m169043c();
        w13 bitmapMemoryCacheFactory = c19215a.getBitmapMemoryCacheFactory();
        this.bitmapMemoryCacheFactory = bitmapMemoryCacheFactory == null ? new rqb() : bitmapMemoryCacheFactory;
        this.encodedMemoryCacheOverride = c19215a.m169058r();
        this.executorServiceForAnimatedImages = c19215a.getSerialExecutorServiceForAnimatedImages();
        this.dynamicDiskCacheConfigMap = c19215a.m169056p();
        syg0<s2e> syg0VarM169054n = c19215a.m169054n();
        if (syg0VarM169054n == null) {
            nfi fileCacheFactory = c19215a.getFileCacheFactory();
            syg0VarM169054n = new a3e(fileCacheFactory == null ? new n3e(new vfe()) : fileCacheFactory, this);
        }
        this.diskCachesStoreSupplier = syg0VarM169054n;
        qlp0 qlp0VarM179425z = getExperiments().getWebpBitmapFactory();
        if (qlp0VarM179425z != null) {
            companion.m169076j(qlp0VarM179425z, getExperiments(), new ael(getPoolFactory()));
        }
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public static final C19217c m168978J() {
        return INSTANCE.m169071e();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: K */
    public static final C19215a m168979K(@NotNull Context context) {
        return INSTANCE.m169075i(context);
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: A */
    public syg0<s2e> mo168980A() {
        return this.diskCachesStoreSupplier;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: B, reason: from getter */
    public w13 getBitmapMemoryCacheFactory() {
        return this.bitmapMemoryCacheFactory;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public dx3 getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @Override // p149l.qhm
    /* JADX INFO: renamed from: D, reason: from getter */
    public boolean getIsResizeAndRotateEnabledForNetwork() {
        return this.isResizeAndRotateEnabledForNetwork;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: E */
    public Set<xxb> mo168984E() {
        return this.customProducerSequenceFactories;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: F, reason: from getter */
    public DownsampleMode getDownsampleMode() {
        return this.downsampleMode;
    }

    @Override // p149l.qhm
    @Nullable
    /* JADX INFO: renamed from: G */
    public f84 mo168986G() {
        return null;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public x5f getExecutorSupplier() {
        return this.executorSupplier;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<huc0> mo168988a() {
        return this.requestListener2s;
    }

    @Override // p149l.qhm
    @Nullable
    /* JADX INFO: renamed from: b */
    public pgy<cx3, PooledByteBuffer> mo168989b() {
        return this.encodedMemoryCacheOverride;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public pwa0 getProgressiveJpegConfig() {
        return this.progressiveJpegConfig;
    }

    @Override // p149l.qhm
    @Nullable
    /* JADX INFO: renamed from: d */
    public Map<String, n2e> mo168991d() {
        return this.dynamicDiskCacheConfigMap;
    }

    @Override // p149l.qhm
    @Nullable
    /* JADX INFO: renamed from: e */
    public tqb.InterfaceC20245b<cx3> mo168992e() {
        return this.bitmapMemoryCacheEntryStateObserver;
    }

    @Override // p149l.qhm
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getIsDiskCacheEnabled() {
        return this.isDiskCacheEnabled;
    }

    @Override // p149l.qhm
    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public cfm getImageDecoder() {
        return this.imageDecoder;
    }

    @Override // p149l.qhm
    @NotNull
    public Context getContext() {
        return this.context;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: h */
    public syg0<qgy> mo168995h() {
        return this.encodedMemoryCacheParamsSupplier;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public ua80 getPoolFactory() {
        return this.poolFactory;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public ha5 getCloseableReferenceLeakTracker() {
        return this.closeableReferenceLeakTracker;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public wem getImageCacheStatsTracker() {
        return this.imageCacheStatsTracker;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: l */
    public syg0<Boolean> mo168999l() {
        return this.isPrefetchEnabledSupplier;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public jhy getMemoryTrimmableRegistry() {
        return this.memoryTrimmableRegistry;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public rhm getExperiments() {
        return this.experiments;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: o */
    public mb20<?> mo169002o() {
        return this.networkFetcher;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public n2e getMainDiskCacheConfig() {
        return this.mainDiskCacheConfig;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: q */
    public Set<guc0> mo169004q() {
        return this.requestListeners;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public pgy.InterfaceC19209a getEncodedMemoryCacheTrimStrategy() {
        return this.encodedMemoryCacheTrimStrategy;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public pgy.InterfaceC19209a getBitmapMemoryCacheTrimStrategy() {
        return this.bitmapMemoryCacheTrimStrategy;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public n2e getSmallImageDiskCacheConfig() {
        return this.smallImageDiskCacheConfig;
    }

    @Override // p149l.qhm
    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public qie0 getExecutorServiceForAnimatedImages() {
        return this.executorServiceForAnimatedImages;
    }

    @Override // p149l.qhm
    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public Integer getImageTranscoderType() {
        return this.imageTranscoderType;
    }

    @Override // p149l.qhm
    @Nullable
    /* JADX INFO: renamed from: w, reason: from getter */
    public uim getImageTranscoderFactory() {
        return this.imageTranscoderFactory;
    }

    @Override // p149l.qhm
    @Nullable
    /* JADX INFO: renamed from: x */
    public dfm mo169011x() {
        return null;
    }

    @Override // p149l.qhm
    @NotNull
    /* JADX INFO: renamed from: y */
    public syg0<qgy> mo169012y() {
        return this.bitmapMemoryCacheParamsSupplier;
    }

    @Override // p149l.qhm
    /* JADX INFO: renamed from: z, reason: from getter */
    public int getMemoryChunkType() {
        return this.memoryChunkType;
    }

    /* JADX INFO: renamed from: l.phm$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b \u0010!¨\u0006#"}, m87232d2 = {"Ll/phm$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/phm$a;", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;)Ll/phm$a;", "Ll/qlp0;", "webpBitmapFactory", "Ll/rhm;", "imagePipelineExperiments", "Ll/a13;", "bitmapCreator", "", "j", "(Ll/qlp0;Ll/rhm;Ll/a13;)V", "Ll/n2e;", "f", "(Landroid/content/Context;)Ll/n2e;", "builder", "Ll/uim;", "g", "(Ll/phm$a;)Ll/uim;", "", "h", "(Ll/phm$a;Ll/rhm;)I", "Ll/phm$c;", "value", "defaultImageRequestConfig", "Ll/phm$c;", "e", "()Ll/phm$c;", "getDefaultImageRequestConfig$annotations", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C19217c m169071e() {
            return phm.f148941M;
        }

        /* JADX INFO: renamed from: f */
        public final n2e m169072f(Context context) {
            n2e n2eVarM157592n;
            if (o6j.m162852d()) {
                o6j.m162850a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
                try {
                    n2eVarM157592n = n2e.m157566m(context).m157592n();
                    o6j.m162851b();
                } catch (Throwable th) {
                    o6j.m162851b();
                    throw th;
                }
            } else {
                n2eVarM157592n = n2e.m157566m(context).m157592n();
            }
            n2eVarM157592n.getClass();
            return n2eVarM157592n;
        }

        /* JADX INFO: renamed from: g */
        public final uim m169073g(C19215a builder) {
            if (builder.getImageTranscoderFactory() == null || builder.getImageTranscoderType() == null) {
                return builder.getImageTranscoderFactory();
            }
            qkq0.m175383a("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
            return null;
        }

        /* JADX INFO: renamed from: h */
        public final int m169074h(C19215a builder, rhm imagePipelineExperiments) {
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
        public final C19215a m169075i(@NotNull Context context) {
            context.getClass();
            return new C19215a(context);
        }

        /* JADX INFO: renamed from: j */
        public final void m169076j(qlp0 webpBitmapFactory, rhm imagePipelineExperiments, a13 bitmapCreator) {
            rlp0.f159988b = webpBitmapFactory;
            imagePipelineExperiments.m179388A();
            if (bitmapCreator != null) {
                webpBitmapFactory.mo9250a(bitmapCreator);
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ phm(C19215a c19215a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c19215a);
    }
}
