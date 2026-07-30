package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 h2\u00020\u0001:\u0004\u0007\u0015\u0010\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!R\u0017\u0010$\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010(\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b\u0018\u0010\nR\u0017\u0010+\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010!R\u0017\u0010.\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b-\u0010\nR\u0017\u00100\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b/\u0010\nR\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0006078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b \u0010:R\u0017\u0010>\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b=\u0010\nR\u0017\u0010?\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u0010\b\u001a\u0004\b'\u0010\nR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0006078\u0006¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010:R\u0017\u0010E\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u0010\b\u001a\u0004\bD\u0010\nR\u0017\u0010I\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\b2\u0010HR\u0017\u0010J\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bA\u0010\b\u001a\u0004\b,\u0010\nR\u0017\u0010L\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bK\u0010\b\u001a\u0004\b%\u0010\nR\u0017\u0010N\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\bM\u0010\nR\u0017\u0010P\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\bO\u0010\nR\u0017\u0010R\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\bQ\u0010\nR\u0017\u0010T\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\bS\u0010\nR\u0017\u0010V\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bU\u0010 \u001a\u0004\bK\u0010!R\u0017\u0010W\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u0007\u0010\nR\u0017\u0010X\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bS\u0010\b\u001a\u0004\b)\u0010\nR\u0017\u0010Y\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010\b\u001a\u0004\bC\u0010\nR\u0017\u0010Z\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bQ\u0010\b\u001a\u0004\b@\u0010\nR\u0017\u0010[\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bO\u0010\b\u001a\u0004\bG\u0010\nR\u0017\u0010\\\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\b\f\u0010\nR\u0017\u0010]\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010\b\u001a\u0004\b#\u0010\nR\u0017\u0010^\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b \u0010 \u001a\u0004\b\u0010\u0010!R\u0017\u0010_\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b<\u0010\nR\u0017\u0010c\u001a\u00020`8\u0006¢\u0006\f\n\u0004\b/\u0010a\u001a\u0004\b8\u0010bR\u0019\u0010e\u001a\u0004\u0018\u00010d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bU\u0010g¨\u0006i"}, m88121d2 = {"Ll/ujm;", "", "Ll/ujm$a;", "builder", "<init>", "(Ll/ujm$a;)V", "", "a", "Z", "L", "()Z", "isWebpSupportEnabled", "b", "B", "isDecodeCancellationEnabled", "Ll/uup0;", "c", "Ll/uup0;", BaseSei.f14626Z, "()Ll/uup0;", "webpBitmapFactory", Constants.INAPP_DATA_TAG, BaseSei.f14625Y, "useDownsamplingRatioForResizing", "e", BaseSei.f14624X, "useBitmapPrepareToDraw", "f", "w", "useBalancedAnimationStrategy", "", "g", "I", "()I", "animationStrategyBufferLengthMilliseconds", "h", "bitmapPrepareToDrawMinSizeBytes", RXScreenCaptureService.KEY_INDEX, "bitmapPrepareToDrawMaxSizeBytes", "j", "bitmapPrepareToDrawForPrefetch", "k", "m", "maxBitmapDimension", BLiveStormDanmakuGiftResourceType.f45292l, "J", "isNativeCodeDisabled", "K", "isPartialImageCachingEnabled", "Ll/ujm$d;", "n", "Ll/ujm$d;", "q", "()Ll/ujm$d;", "producerFactoryMethod", "Ll/a7h0;", "o", "Ll/a7h0;", "()Ll/a7h0;", "isLazyDataSource", "p", "H", "isGingerbreadDecoderEnabled", "downscaleFrameToDrawableDimensions", "r", "u", "suppressBitmapPrefetchingSupplier", BLiveStormDanmakuGiftResourceType.f45294s, "G", "isExperimentalThreadHandoffQueueEnabled", "", Constants.KEY_T, "()J", "memoryType", "keepCancelledFetchAsLowPriority", ResourceDirection.f39656v, "downsampleIfLargeBitmap", "D", "isEncodedCacheEnabled", "F", "isEnsureTranscoderLibraryLoaded", "E", "isEncodedMemoryCacheProbingEnabled", c4s.C_ZONE, "isDiskCacheProbingEnabled", "A", "trackedKeysSize", "allowDelay", "handOffOnUiThreadOnly", "shouldStoreCacheEntrySize", "shouldIgnoreCacheSizeMismatch", "shouldUseDecodingBufferHelper", "allowProgressiveOnPrefetch", "cancelDecodeOnCacheMiss", "animationRenderFpsLimit", "prefetchShortcutEnabled", "Ll/bd80;", "Ll/bd80;", "()Ll/bd80;", "platformDecoderOptions", "Ll/uup0$a;", "webpErrorLogger", "Ll/uup0$a;", "()Ll/uup0$a;", "Companion", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ujm {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final int trackedKeysSize;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final boolean allowDelay;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final boolean handOffOnUiThreadOnly;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final boolean shouldStoreCacheEntrySize;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final boolean shouldIgnoreCacheSizeMismatch;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final boolean shouldUseDecodingBufferHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final boolean allowProgressiveOnPrefetch;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final boolean cancelDecodeOnCacheMiss;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final int animationRenderFpsLimit;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final boolean prefetchShortcutEnabled;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final bd80 platformDecoderOptions;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isWebpSupportEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isDecodeCancellationEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final uup0 webpBitmapFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean useDownsamplingRatioForResizing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean useBitmapPrepareToDraw;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean useBalancedAnimationStrategy;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int animationStrategyBufferLengthMilliseconds;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int bitmapPrepareToDrawMinSizeBytes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int bitmapPrepareToDrawMaxSizeBytes;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final boolean bitmapPrepareToDrawForPrefetch;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int maxBitmapDimension;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean isNativeCodeDisabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final boolean isPartialImageCachingEnabled;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC20590d producerFactoryMethod;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final a7h0<Boolean> isLazyDataSource;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final boolean isGingerbreadDecoderEnabled;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final boolean downscaleFrameToDrawableDimensions;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final a7h0<Boolean> suppressBitmapPrefetchingSupplier;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final boolean isExperimentalThreadHandoffQueueEnabled;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final long memoryType;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final boolean keepCancelledFetchAsLowPriority;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final boolean downsampleIfLargeBitmap;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final boolean isEncodedCacheEnabled;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final boolean isEnsureTranscoderLibraryLoaded;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final boolean isEncodedMemoryCacheProbingEnabled;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final boolean isDiskCacheProbingEnabled;

    /* JADX INFO: renamed from: l.ujm$a */
    @Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0016\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0016\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0016\u0010\u001f\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010%\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\fR\u0016\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0016\u0010)\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010\fR\u0016\u0010+\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010\fR\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u0010\fR\u0016\u00107\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u0010\fR$\u0010:\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010\n0\n008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b9\u00102R\u0016\u0010<\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u0010\fR\u0016\u0010@\u001a\u00020=8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010\fR\u0016\u0010D\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010\fR\u0016\u0010F\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bE\u0010\fR\u0016\u0010H\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010\fR\u0016\u0010J\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bI\u0010\fR\u0016\u0010L\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010\fR\u0016\u0010N\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010\u001eR\u0016\u0010P\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010\fR\u0016\u0010R\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bQ\u0010\fR\u0016\u0010T\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bS\u0010\fR\u0016\u0010V\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bU\u0010\fR\u0016\u0010X\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bW\u0010\fR\u0016\u0010Y\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001eR\u0016\u0010Z\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010\fR\u0016\u0010\\\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b[\u0010\fR\u0016\u0010`\u001a\u00020]8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006a"}, m88121d2 = {"Ll/ujm$a;", "", "Ll/sjm$a;", "configBuilder", "<init>", "(Ll/sjm$a;)V", "Ll/ujm;", "a", "()Ll/ujm;", "Ll/sjm$a;", "", "b", "Z", "shouldUseDecodingBufferHelper", "c", "webpSupportEnabled", Constants.INAPP_DATA_TAG, "decodeCancellationEnabled", "Ll/uup0;", "e", "Ll/uup0;", "webpBitmapFactory", "f", "useDownsamplingRatioForResizing", "g", "useBitmapPrepareToDraw", "h", "useBalancedAnimationStrategy", "", RXScreenCaptureService.KEY_INDEX, "I", "animationStrategyBufferLengthMilliseconds", "j", "bitmapPrepareToDrawMinSizeBytes", "k", "bitmapPrepareToDrawMaxSizeBytes", BLiveStormDanmakuGiftResourceType.f45292l, "bitmapPrepareToDrawForPrefetch", "m", "maxBitmapDimension", "n", "nativeCodeDisabled", "o", "isPartialImageCachingEnabled", "Ll/ujm$d;", "p", "Ll/ujm$d;", "producerFactoryMethod", "Ll/a7h0;", "q", "Ll/a7h0;", "lazyDataSource", "r", "gingerbreadDecoderEnabled", BLiveStormDanmakuGiftResourceType.f45294s, "downscaleFrameToDrawableDimensions", "kotlin.jvm.PlatformType", Constants.KEY_T, "suppressBitmapPrefetchingSupplier", "u", "experimentalThreadHandoffQueueEnabled", "", ResourceDirection.f39656v, "J", "memoryType", "w", "keepCancelledFetchAsLowPriority", BaseSei.f14624X, "downsampleIfLargeBitmap", BaseSei.f14625Y, "encodedCacheEnabled", BaseSei.f14626Z, "ensureTranscoderLibraryLoaded", "A", "isEncodedMemoryCacheProbingEnabled", "B", "isDiskCacheProbingEnabled", c4s.C_ZONE, "trackedKeysSize", "D", "allowDelay", "E", "handOffOnUiThreadOnly", "F", "shouldStoreCacheEntrySize", "G", "shouldIgnoreCacheSizeMismatch", "H", "allowProgressiveOnPrefetch", "animationRenderFpsLimit", "cancelDecodeOnCacheMiss", "K", "prefetchShortcutEnabled", "Ll/bd80;", "L", "Ll/bd80;", "platformDecoderOptions", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C20587a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @JvmField
        public boolean isEncodedMemoryCacheProbingEnabled;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @JvmField
        public boolean isDiskCacheProbingEnabled;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @JvmField
        public int trackedKeysSize;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @JvmField
        public boolean allowDelay;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        @JvmField
        public boolean handOffOnUiThreadOnly;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @JvmField
        public boolean shouldStoreCacheEntrySize;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        @JvmField
        public boolean shouldIgnoreCacheSizeMismatch;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        @JvmField
        public boolean allowProgressiveOnPrefetch;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        @JvmField
        public int animationRenderFpsLimit;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        @JvmField
        public boolean cancelDecodeOnCacheMiss;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        @JvmField
        public boolean prefetchShortcutEnabled;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public bd80 platformDecoderOptions;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final sjm.C20058a configBuilder;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        public boolean shouldUseDecodingBufferHelper;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        public boolean webpSupportEnabled;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        public boolean decodeCancellationEnabled;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public uup0 webpBitmapFactory;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @JvmField
        public boolean useDownsamplingRatioForResizing;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        public boolean useBitmapPrepareToDraw;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @JvmField
        public boolean useBalancedAnimationStrategy;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @JvmField
        public int animationStrategyBufferLengthMilliseconds;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @JvmField
        public int bitmapPrepareToDrawMinSizeBytes;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @JvmField
        public int bitmapPrepareToDrawMaxSizeBytes;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @JvmField
        public boolean bitmapPrepareToDrawForPrefetch;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @JvmField
        public int maxBitmapDimension;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @JvmField
        public boolean nativeCodeDisabled;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @JvmField
        public boolean isPartialImageCachingEnabled;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public InterfaceC20590d producerFactoryMethod;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public a7h0<Boolean> lazyDataSource;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @JvmField
        public boolean gingerbreadDecoderEnabled;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @JvmField
        public boolean downscaleFrameToDrawableDimensions;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public a7h0<Boolean> suppressBitmapPrefetchingSupplier;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @JvmField
        public boolean experimentalThreadHandoffQueueEnabled;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @JvmField
        public long memoryType;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @JvmField
        public boolean keepCancelledFetchAsLowPriority;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @JvmField
        public boolean downsampleIfLargeBitmap;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @JvmField
        public boolean encodedCacheEnabled;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @JvmField
        public boolean ensureTranscoderLibraryLoaded;

        public C20587a(@NotNull sjm.C20058a c20058a) {
            c20058a.getClass();
            this.configBuilder = c20058a;
            this.animationStrategyBufferLengthMilliseconds = 1000;
            this.maxBitmapDimension = 2048;
            a7h0<Boolean> a7h0VarM114734a = d7h0.m114734a(Boolean.FALSE);
            a7h0VarM114734a.getClass();
            this.suppressBitmapPrefetchingSupplier = a7h0VarM114734a;
            this.encodedCacheEnabled = true;
            this.ensureTranscoderLibraryLoaded = true;
            this.trackedKeysSize = 20;
            this.animationRenderFpsLimit = 30;
            this.platformDecoderOptions = new bd80(false, false, 3, null);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ujm m196412a() {
            return new ujm(this, null);
        }
    }

    /* JADX INFO: renamed from: l.ujm$c */
    @Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jå\u0001\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00172\u0016\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020$H\u0016¢\u0006\u0004\b.\u0010/¨\u00060"}, m88121d2 = {"Ll/ujm$c;", "Ll/ujm$d;", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/wq3;", "byteArrayPool", "Ll/shm;", "imageDecoder", "Ll/t4b0;", "progressiveJpegConfig", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "", "resizeAndRotateEnabledForNetwork", "decodeCancellationEnabled", "Ll/d7f;", "executorSupplier", "Ll/fj80;", "pooledByteBufferFactory", "Ll/ij80;", "pooledByteStreams", "Ll/mpy;", "Ll/by3;", "Ll/db5;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Ll/a7h0;", "Ll/g4e;", "diskCachesStoreSupplier", "Ll/cy3;", "cacheKeyFactory", "Ll/xc80;", "platformBitmapFactory", "", "bitmapPrepareToDrawMinSizeBytes", "bitmapPrepareToDrawMaxSizeBytes", "bitmapPrepareToDrawForPrefetch", "maxBitmapSize", "Ll/gb5;", "closeableReferenceFactory", "keepCancelledFetchAsLowPriority", "trackedKeysSize", "Ll/bl90;", "a", "(Landroid/content/Context;Ll/wq3;Ll/shm;Ll/t4b0;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLl/d7f;Ll/fj80;Ll/ij80;Ll/mpy;Ll/mpy;Ll/a7h0;Ll/cy3;Ll/xc80;IIZILl/gb5;ZI)Ll/bl90;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C20589c implements InterfaceC20590d {
        @Override // p153l.ujm.InterfaceC20590d
        @NotNull
        /* JADX INFO: renamed from: a */
        public bl90 mo196413a(@NotNull Context context, @NotNull wq3 byteArrayPool, @NotNull shm imageDecoder, @NotNull t4b0 progressiveJpegConfig, @NotNull DownsampleMode downsampleMode, boolean resizeAndRotateEnabledForNetwork, boolean decodeCancellationEnabled, @NotNull d7f executorSupplier, @NotNull fj80 pooledByteBufferFactory, @NotNull ij80 pooledByteStreams, @NotNull mpy<by3, db5> bitmapMemoryCache, @NotNull mpy<by3, PooledByteBuffer> encodedMemoryCache, @NotNull a7h0<g4e> diskCachesStoreSupplier, @NotNull cy3 cacheKeyFactory, @NotNull xc80 platformBitmapFactory, int bitmapPrepareToDrawMinSizeBytes, int bitmapPrepareToDrawMaxSizeBytes, boolean bitmapPrepareToDrawForPrefetch, int maxBitmapSize, @NotNull gb5 closeableReferenceFactory, boolean keepCancelledFetchAsLowPriority, int trackedKeysSize) {
            context.getClass();
            byteArrayPool.getClass();
            imageDecoder.getClass();
            progressiveJpegConfig.getClass();
            downsampleMode.getClass();
            executorSupplier.getClass();
            pooledByteBufferFactory.getClass();
            pooledByteStreams.getClass();
            bitmapMemoryCache.getClass();
            encodedMemoryCache.getClass();
            diskCachesStoreSupplier.getClass();
            cacheKeyFactory.getClass();
            platformBitmapFactory.getClass();
            closeableReferenceFactory.getClass();
            return new bl90(context, byteArrayPool, imageDecoder, progressiveJpegConfig, downsampleMode, resizeAndRotateEnabledForNetwork, decodeCancellationEnabled, executorSupplier, pooledByteBufferFactory, bitmapMemoryCache, encodedMemoryCache, diskCachesStoreSupplier, cacheKeyFactory, platformBitmapFactory, bitmapPrepareToDrawMinSizeBytes, bitmapPrepareToDrawMaxSizeBytes, bitmapPrepareToDrawForPrefetch, maxBitmapSize, closeableReferenceFactory, keepCancelledFetchAsLowPriority, trackedKeysSize);
        }
    }

    /* JADX INFO: renamed from: l.ujm$d */
    @Metadata(m88120d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jå\u0001\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\"2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\"H&¢\u0006\u0004\b,\u0010-¨\u0006."}, m88121d2 = {"Ll/ujm$d;", "", "Landroid/content/Context;", "context", "Ll/wq3;", "byteArrayPool", "Ll/shm;", "imageDecoder", "Ll/t4b0;", "progressiveJpegConfig", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "", "resizeAndRotateEnabledForNetwork", "decodeCancellationEnabled", "Ll/d7f;", "executorSupplier", "Ll/fj80;", "pooledByteBufferFactory", "Ll/ij80;", "pooledByteStreams", "Ll/mpy;", "Ll/by3;", "Ll/db5;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Ll/a7h0;", "Ll/g4e;", "diskCachesStoreSupplier", "Ll/cy3;", "cacheKeyFactory", "Ll/xc80;", "platformBitmapFactory", "", "bitmapPrepareToDrawMinSizeBytes", "bitmapPrepareToDrawMaxSizeBytes", "bitmapPrepareToDrawForPrefetch", "maxBitmapSize", "Ll/gb5;", "closeableReferenceFactory", "keepCancelledFetchAsLowPriority", "trackedKeysSize", "Ll/bl90;", "a", "(Landroid/content/Context;Ll/wq3;Ll/shm;Ll/t4b0;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLl/d7f;Ll/fj80;Ll/ij80;Ll/mpy;Ll/mpy;Ll/a7h0;Ll/cy3;Ll/xc80;IIZILl/gb5;ZI)Ll/bl90;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface InterfaceC20590d {
        @NotNull
        /* JADX INFO: renamed from: a */
        bl90 mo196413a(@NotNull Context context, @NotNull wq3 byteArrayPool, @NotNull shm imageDecoder, @NotNull t4b0 progressiveJpegConfig, @NotNull DownsampleMode downsampleMode, boolean resizeAndRotateEnabledForNetwork, boolean decodeCancellationEnabled, @NotNull d7f executorSupplier, @NotNull fj80 pooledByteBufferFactory, @NotNull ij80 pooledByteStreams, @NotNull mpy<by3, db5> bitmapMemoryCache, @NotNull mpy<by3, PooledByteBuffer> encodedMemoryCache, @NotNull a7h0<g4e> diskCachesStoreSupplier, @NotNull cy3 cacheKeyFactory, @NotNull xc80 platformBitmapFactory, int bitmapPrepareToDrawMinSizeBytes, int bitmapPrepareToDrawMaxSizeBytes, boolean bitmapPrepareToDrawForPrefetch, int maxBitmapSize, @NotNull gb5 closeableReferenceFactory, boolean keepCancelledFetchAsLowPriority, int trackedKeysSize);
    }

    public ujm(C20587a c20587a) {
        this.isWebpSupportEnabled = c20587a.webpSupportEnabled;
        this.isDecodeCancellationEnabled = c20587a.decodeCancellationEnabled;
        this.webpBitmapFactory = c20587a.webpBitmapFactory;
        this.useDownsamplingRatioForResizing = c20587a.useDownsamplingRatioForResizing;
        this.useBitmapPrepareToDraw = c20587a.useBitmapPrepareToDraw;
        this.useBalancedAnimationStrategy = c20587a.useBalancedAnimationStrategy;
        this.animationStrategyBufferLengthMilliseconds = c20587a.animationStrategyBufferLengthMilliseconds;
        this.bitmapPrepareToDrawMinSizeBytes = c20587a.bitmapPrepareToDrawMinSizeBytes;
        this.bitmapPrepareToDrawMaxSizeBytes = c20587a.bitmapPrepareToDrawMaxSizeBytes;
        this.bitmapPrepareToDrawForPrefetch = c20587a.bitmapPrepareToDrawForPrefetch;
        this.maxBitmapDimension = c20587a.maxBitmapDimension;
        this.isNativeCodeDisabled = c20587a.nativeCodeDisabled;
        this.isPartialImageCachingEnabled = c20587a.isPartialImageCachingEnabled;
        InterfaceC20590d interfaceC20590d = c20587a.producerFactoryMethod;
        this.producerFactoryMethod = interfaceC20590d == null ? new C20589c() : interfaceC20590d;
        a7h0<Boolean> a7h0Var = c20587a.lazyDataSource;
        if (a7h0Var == null) {
            a7h0Var = d7h0.f85513b;
            a7h0Var.getClass();
        }
        this.isLazyDataSource = a7h0Var;
        this.isGingerbreadDecoderEnabled = c20587a.gingerbreadDecoderEnabled;
        this.downscaleFrameToDrawableDimensions = c20587a.downscaleFrameToDrawableDimensions;
        this.suppressBitmapPrefetchingSupplier = c20587a.suppressBitmapPrefetchingSupplier;
        this.isExperimentalThreadHandoffQueueEnabled = c20587a.experimentalThreadHandoffQueueEnabled;
        this.memoryType = c20587a.memoryType;
        this.keepCancelledFetchAsLowPriority = c20587a.keepCancelledFetchAsLowPriority;
        this.downsampleIfLargeBitmap = c20587a.downsampleIfLargeBitmap;
        this.isEncodedCacheEnabled = c20587a.encodedCacheEnabled;
        this.isEnsureTranscoderLibraryLoaded = c20587a.ensureTranscoderLibraryLoaded;
        this.isEncodedMemoryCacheProbingEnabled = c20587a.isEncodedMemoryCacheProbingEnabled;
        this.isDiskCacheProbingEnabled = c20587a.isDiskCacheProbingEnabled;
        this.trackedKeysSize = c20587a.trackedKeysSize;
        this.allowProgressiveOnPrefetch = c20587a.allowProgressiveOnPrefetch;
        this.animationRenderFpsLimit = c20587a.animationRenderFpsLimit;
        this.allowDelay = c20587a.allowDelay;
        this.handOffOnUiThreadOnly = c20587a.handOffOnUiThreadOnly;
        this.shouldStoreCacheEntrySize = c20587a.shouldStoreCacheEntrySize;
        this.shouldIgnoreCacheSizeMismatch = c20587a.shouldIgnoreCacheSizeMismatch;
        this.shouldUseDecodingBufferHelper = c20587a.shouldUseDecodingBufferHelper;
        this.cancelDecodeOnCacheMiss = c20587a.cancelDecodeOnCacheMiss;
        this.prefetchShortcutEnabled = c20587a.prefetchShortcutEnabled;
        this.platformDecoderOptions = c20587a.platformDecoderOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final uup0.InterfaceC20680a m196374A() {
        return null;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final boolean getIsDecodeCancellationEnabled() {
        return this.isDecodeCancellationEnabled;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getIsDiskCacheProbingEnabled() {
        return this.isDiskCacheProbingEnabled;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getIsEncodedCacheEnabled() {
        return this.isEncodedCacheEnabled;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getIsEncodedMemoryCacheProbingEnabled() {
        return this.isEncodedMemoryCacheProbingEnabled;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final boolean getIsEnsureTranscoderLibraryLoaded() {
        return this.isEnsureTranscoderLibraryLoaded;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getIsExperimentalThreadHandoffQueueEnabled() {
        return this.isExperimentalThreadHandoffQueueEnabled;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final boolean getIsGingerbreadDecoderEnabled() {
        return this.isGingerbreadDecoderEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final a7h0<Boolean> m196382I() {
        return this.isLazyDataSource;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getIsNativeCodeDisabled() {
        return this.isNativeCodeDisabled;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getIsPartialImageCachingEnabled() {
        return this.isPartialImageCachingEnabled;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getIsWebpSupportEnabled() {
        return this.isWebpSupportEnabled;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllowDelay() {
        return this.allowDelay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowProgressiveOnPrefetch() {
        return this.allowProgressiveOnPrefetch;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAnimationRenderFpsLimit() {
        return this.animationRenderFpsLimit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAnimationStrategyBufferLengthMilliseconds() {
        return this.animationStrategyBufferLengthMilliseconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getBitmapPrepareToDrawForPrefetch() {
        return this.bitmapPrepareToDrawForPrefetch;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getBitmapPrepareToDrawMaxSizeBytes() {
        return this.bitmapPrepareToDrawMaxSizeBytes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getBitmapPrepareToDrawMinSizeBytes() {
        return this.bitmapPrepareToDrawMinSizeBytes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getCancelDecodeOnCacheMiss() {
        return this.cancelDecodeOnCacheMiss;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getDownsampleIfLargeBitmap() {
        return this.downsampleIfLargeBitmap;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getDownscaleFrameToDrawableDimensions() {
        return this.downscaleFrameToDrawableDimensions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getHandOffOnUiThreadOnly() {
        return this.handOffOnUiThreadOnly;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getKeepCancelledFetchAsLowPriority() {
        return this.keepCancelledFetchAsLowPriority;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getMaxBitmapDimension() {
        return this.maxBitmapDimension;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getMemoryType() {
        return this.memoryType;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final bd80 getPlatformDecoderOptions() {
        return this.platformDecoderOptions;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getPrefetchShortcutEnabled() {
        return this.prefetchShortcutEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterfaceC20590d getProducerFactoryMethod() {
        return this.producerFactoryMethod;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getShouldIgnoreCacheSizeMismatch() {
        return this.shouldIgnoreCacheSizeMismatch;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getShouldStoreCacheEntrySize() {
        return this.shouldStoreCacheEntrySize;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getShouldUseDecodingBufferHelper() {
        return this.shouldUseDecodingBufferHelper;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final a7h0<Boolean> m196406u() {
        return this.suppressBitmapPrefetchingSupplier;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getTrackedKeysSize() {
        return this.trackedKeysSize;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getUseBalancedAnimationStrategy() {
        return this.useBalancedAnimationStrategy;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getUseBitmapPrepareToDraw() {
        return this.useBitmapPrepareToDraw;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getUseDownsamplingRatioForResizing() {
        return this.useDownsamplingRatioForResizing;
    }

    @Nullable
    /* JADX INFO: renamed from: z, reason: from getter */
    public final uup0 getWebpBitmapFactory() {
        return this.webpBitmapFactory;
    }

    public /* synthetic */ ujm(C20587a c20587a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c20587a);
    }
}
