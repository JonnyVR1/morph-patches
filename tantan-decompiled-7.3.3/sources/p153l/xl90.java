package p153l;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.producers.C1650a;
import com.facebook.imagepipeline.producers.C1651b;
import com.facebook.imagepipeline.producers.C1652c;
import com.facebook.imagepipeline.producers.C1653d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010%\n\u0002\b<\u0018\u0000 \u0090\u00012\u00020\u0001:\u0001?B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b%\u0010&J=\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b,\u0010&J#\u0010-\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b-\u0010&J/\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b.\u0010&J7\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b/\u0010+J)\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b0\u00101J/\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b2\u0010&J+\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b4\u0010&J/\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b5\u0010&J/\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b6\u0010&J!\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b8\u0010\"J\u001d\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b9\u0010\"J!\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b:\u0010\"J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b;\u0010\"J\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b<\u0010=J'\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e¢\u0006\u0004\b>\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010,R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010,R\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010,R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010,R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010,R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010,R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TRL\u0010^\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e0U8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bV\u0010W\u0012\u0004\b\\\u0010]\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[RH\u0010c\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e0U8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b_\u0010W\u0012\u0004\bb\u0010]\u001a\u0004\b`\u0010Y\"\u0004\ba\u0010[RL\u0010h\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e0U8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bd\u0010W\u0012\u0004\bg\u0010]\u001a\u0004\be\u0010Y\"\u0004\bf\u0010[R'\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR-\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f0\u001e8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bn\u0010j\u0012\u0004\bp\u0010]\u001a\u0004\bo\u0010lR'\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\br\u0010j\u001a\u0004\bs\u0010lR'\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010j\u001a\u0004\bu\u0010lR#\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010j\u001a\u0004\br\u0010lR#\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bx\u0010j\u001a\u0004\by\u0010lR!\u0010|\u001a\b\u0012\u0004\u0012\u00020#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b{\u0010j\u001a\u0004\bx\u0010lR#\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010j\u001a\u0004\b}\u0010lR#\u0010\u007f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010j\u001a\u0004\bn\u0010lR$\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010j\u001a\u0004\bi\u0010lR)\u0010\u0082\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b6\u0010j\u001a\u0005\b\u0081\u0001\u0010lR)\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b9\u0010j\u001a\u0005\b\u0083\u0001\u0010lR)\u0010\u0086\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b8\u0010j\u001a\u0005\b\u0085\u0001\u0010lR*\u0010\u0089\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8GX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010j\u001a\u0005\b\u0088\u0001\u0010lR)\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\bs\u0010j\u001a\u0005\b\u008a\u0001\u0010lR*\u0010\u008d\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010j\u001a\u0005\b\u008c\u0001\u0010lR)\u0010\u008e\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\bo\u0010j\u001a\u0005\b\u0087\u0001\u0010lR(\u0010\u008f\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b}\u0010j\u001a\u0004\b{\u0010l¨\u0006\u0091\u0001"}, m88121d2 = {"Ll/xl90;", "", "Landroid/content/ContentResolver;", "contentResolver", "Ll/bl90;", "producerFactory", "Ll/vj20;", "networkFetcher", "", "resizeAndRotateEnabledForNetwork", "webpSupportEnabled", "Ll/oxi0;", "threadHandoffProducerQueue", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "useBitmapPrepareToDraw", "partialImageCachingEnabled", "diskCacheEnabled", "Ll/xkm;", "imageTranscoderFactory", "isEncodedMemoryCacheProbingEnabled", "isDiskCacheProbingEnabled", "allowDelay", "", "Ll/lzb;", "customProducerSequenceFactories", "<init>", "(Landroid/content/ContentResolver;Ll/bl90;Ll/vj20;ZZLl/oxi0;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZZLl/xkm;ZZZLjava/util/Set;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/wk90;", "Ll/fb5;", "Ll/db5;", ResourceDirection.f39656v, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ll/wk90;", "Ll/n0f;", "inputProducer", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Ll/wk90;)Ll/wk90;", "", "Ll/azi0;", "thumbnailProducers", "W", "(Ll/wk90;[Ll/azi0;)Ll/wk90;", "Z", "Y", p7f.GPS_DIRECTION_TRUE, "b0", "a0", "([Ll/azi0;)Ll/wk90;", "R", "Ljava/lang/Void;", "A", "w", c4s.C_ZONE, "Lcom/facebook/common/memory/PooledByteBuffer;", "E", "D", "B", BaseSei.f14626Z, "X", "(Ll/vj20;)Ll/wk90;", "U", "a", "Landroid/content/ContentResolver;", "b", "Ll/bl90;", "c", "Ll/vj20;", Constants.INAPP_DATA_TAG, "e", "f", "Ll/oxi0;", "g", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "h", RXScreenCaptureService.KEY_INDEX, "j", "k", "Ll/xkm;", BLiveStormDanmakuGiftResourceType.f45292l, "m", "n", "o", "Ljava/util/Set;", "", "p", "Ljava/util/Map;", "getPostprocessorSequences", "()Ljava/util/Map;", "setPostprocessorSequences", "(Ljava/util/Map;)V", "getPostprocessorSequences$annotations", "()V", "postprocessorSequences", "q", "getCloseableImagePrefetchSequences", "setCloseableImagePrefetchSequences", "getCloseableImagePrefetchSequences$annotations", "closeableImagePrefetchSequences", "r", "getBitmapPrepareSequences", "setBitmapPrepareSequences", "getBitmapPrepareSequences$annotations", "bitmapPrepareSequences", BLiveStormDanmakuGiftResourceType.f45294s, "Lkotlin/Lazy;", BloodType.f39576O, "()Ll/wk90;", "networkFetchEncodedImageProducerSequence", Constants.KEY_T, "I", "getLocalFileFetchEncodedImageProducerSequence$annotations", "localFileFetchEncodedImageProducerSequence", "u", "G", "localContentUriFetchEncodedImageProducerSequence", "P", "networkFetchSequence", "backgroundNetworkFetchToEncodedMemorySequence", BaseSei.f14624X, "Q", "networkFetchToEncodedMemoryPrefetchSequence", BaseSei.f14625Y, "commonNetworkFetchToEncodedMemorySequence", "J", "localFileFetchToEncodedMemoryPrefetchSequence", "backgroundLocalFileFetchToEncodeMemorySequence", "backgroundLocalContentUriFetchToEncodeMemorySequence", "K", "localImageFileFetchSequence", "N", "localVideoFileFetchSequence", "H", "localContentUriFetchSequence", "F", "M", "localThumbnailBitmapSdk29FetchSequence", p7f.LATITUDE_SOUTH, "qualifiedResourceFetchSequence", "L", "localResourceFetchSequence", "localAssetFetchSequence", "dataFetchSequence", "Companion", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xl90 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy backgroundLocalFileFetchToEncodeMemorySequence;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Lazy backgroundLocalContentUriFetchToEncodeMemorySequence;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Lazy localImageFileFetchSequence;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Lazy localVideoFileFetchSequence;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Lazy localContentUriFetchSequence;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Lazy localThumbnailBitmapSdk29FetchSequence;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Lazy qualifiedResourceFetchSequence;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final Lazy localResourceFetchSequence;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final Lazy localAssetFetchSequence;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public final Lazy dataFetchSequence;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ContentResolver contentResolver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final bl90 producerFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final vj20<?> networkFetcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean resizeAndRotateEnabledForNetwork;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean webpSupportEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final oxi0 threadHandoffProducerQueue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final DownsampleMode downsampleMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean useBitmapPrepareToDraw;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean partialImageCachingEnabled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final boolean diskCacheEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final xkm imageTranscoderFactory;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean isEncodedMemoryCacheProbingEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final boolean isDiskCacheProbingEnabled;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final boolean allowDelay;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public final Set<lzb> customProducerSequenceFactories;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public Map<wk90<fb5<db5>>, wk90<fb5<db5>>> postprocessorSequences;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public Map<wk90<fb5<db5>>, wk90<Void>> closeableImagePrefetchSequences;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public Map<wk90<fb5<db5>>, wk90<fb5<db5>>> bitmapPrepareSequences;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Lazy networkFetchEncodedImageProducerSequence;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Lazy localFileFetchEncodedImageProducerSequence;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Lazy localContentUriFetchEncodedImageProducerSequence;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Lazy networkFetchSequence;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Lazy backgroundNetworkFetchToEncodedMemorySequence;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Lazy networkFetchToEncodedMemoryPrefetchSequence;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Lazy commonNetworkFetchToEncodedMemorySequence;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy localFileFetchToEncodedMemoryPrefetchSequence;

    /* JADX WARN: Multi-variable type inference failed */
    public xl90(@NotNull ContentResolver contentResolver, @NotNull bl90 bl90Var, @NotNull vj20<?> vj20Var, boolean z, boolean z2, @NotNull oxi0 oxi0Var, @NotNull DownsampleMode downsampleMode, boolean z3, boolean z4, boolean z5, @NotNull xkm xkmVar, boolean z6, boolean z7, boolean z8, @Nullable Set<? extends lzb> set) {
        contentResolver.getClass();
        bl90Var.getClass();
        vj20Var.getClass();
        oxi0Var.getClass();
        downsampleMode.getClass();
        xkmVar.getClass();
        this.contentResolver = contentResolver;
        this.producerFactory = bl90Var;
        this.networkFetcher = vj20Var;
        this.resizeAndRotateEnabledForNetwork = z;
        this.webpSupportEnabled = z2;
        this.threadHandoffProducerQueue = oxi0Var;
        this.downsampleMode = downsampleMode;
        this.useBitmapPrepareToDraw = z3;
        this.partialImageCachingEnabled = z4;
        this.diskCacheEnabled = z5;
        this.imageTranscoderFactory = xkmVar;
        this.isEncodedMemoryCacheProbingEnabled = z6;
        this.isDiskCacheProbingEnabled = z7;
        this.allowDelay = z8;
        this.customProducerSequenceFactories = set;
        this.postprocessorSequences = new LinkedHashMap();
        this.closeableImagePrefetchSequences = new LinkedHashMap();
        this.bitmapPrepareSequences = new LinkedHashMap();
        this.networkFetchEncodedImageProducerSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.fl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211552e(this.f99630a);
            }
        });
        this.localFileFetchEncodedImageProducerSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.wl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211563p(this.f189664a);
            }
        });
        this.localContentUriFetchEncodedImageProducerSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.gl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211556i(this.f104831a);
            }
        });
        this.networkFetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.hl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211565r(this.f110490a);
            }
        });
        this.backgroundNetworkFetchToEncodedMemorySequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.il90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211549b(this.f115559a);
            }
        });
        this.networkFetchToEncodedMemoryPrefetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.jl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211553f(this.f121535a);
            }
        });
        this.commonNetworkFetchToEncodedMemorySequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.kl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211558k(this.f127356a);
            }
        });
        this.localFileFetchToEncodedMemoryPrefetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ll90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211561n(this.f132535a);
            }
        });
        this.backgroundLocalFileFetchToEncodeMemorySequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ml90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211557j(this.f137384a);
            }
        });
        this.backgroundLocalContentUriFetchToEncodeMemorySequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.nl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211550c(this.f142519a);
            }
        });
        this.localImageFileFetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ol90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211559l(this.f147817a);
            }
        });
        this.localVideoFileFetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.pl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211562o(this.f153002a);
            }
        });
        this.localContentUriFetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ql90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211554g(this.f158215a);
            }
        });
        this.localThumbnailBitmapSdk29FetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.rl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211555h(this.f163709a);
            }
        });
        this.qualifiedResourceFetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.sl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211548a(this.f169356a);
            }
        });
        this.localResourceFetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.tl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211564q(this.f174804a);
            }
        });
        this.localAssetFetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ul90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211560m(this.f179495a);
            }
        });
        this.dataFetchSequence = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.vl90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xl90.m211551d(this.f184551a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static wk90 m211548a(xl90 xl90Var) {
        xl90Var.getClass();
        pvb0 pvb0VarM104875C = xl90Var.producerFactory.m104875C();
        pvb0VarM104875C.getClass();
        return xl90Var.m211587V(pvb0VarM104875C);
    }

    /* JADX INFO: renamed from: b */
    public static wk90 m211549b(xl90 xl90Var) {
        xl90Var.getClass();
        if (!i9j.m139099d()) {
            return xl90Var.producerFactory.m104880b(xl90Var.m211599x(), xl90Var.threadHandoffProducerQueue);
        }
        i9j.m139097a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return xl90Var.producerFactory.m104880b(xl90Var.m211599x(), xl90Var.threadHandoffProducerQueue);
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: c */
    public static wk90 m211550c(xl90 xl90Var) {
        xl90Var.getClass();
        if (!i9j.m139099d()) {
            auv auvVarM104895r = xl90Var.producerFactory.m104895r();
            auvVarM104895r.getClass();
            return xl90Var.producerFactory.m104880b(xl90Var.m211591Z(auvVarM104895r), xl90Var.threadHandoffProducerQueue);
        }
        i9j.m139097a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            auv auvVarM104895r2 = xl90Var.producerFactory.m104895r();
            auvVarM104895r2.getClass();
            return xl90Var.producerFactory.m104880b(xl90Var.m211591Z(auvVarM104895r2), xl90Var.threadHandoffProducerQueue);
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: d */
    public static wk90 m211551d(xl90 xl90Var) {
        xl90Var.getClass();
        s5c s5cVarM104886i = xl90Var.producerFactory.m104886i();
        s5cVarM104886i.getClass();
        return xl90Var.m211586U(xl90Var.producerFactory.m104876D(bl90.m104871a(s5cVarM104886i), true, xl90Var.imageTranscoderFactory));
    }

    /* JADX INFO: renamed from: e */
    public static bzc0 m211552e(xl90 xl90Var) {
        xl90Var.getClass();
        if (!i9j.m139099d()) {
            return new bzc0(xl90Var.m211596u());
        }
        i9j.m139097a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
        try {
            return new bzc0(xl90Var.m211596u());
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: f */
    public static ffh0 m211553f(xl90 xl90Var) {
        xl90Var.getClass();
        if (!i9j.m139099d()) {
            return xl90Var.producerFactory.m104877E(xl90Var.m211596u());
        }
        i9j.m139097a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        try {
            return xl90Var.producerFactory.m104877E(xl90Var.m211596u());
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: g */
    public static wk90 m211554g(xl90 xl90Var) {
        xl90Var.getClass();
        auv auvVarM104895r = xl90Var.producerFactory.m104895r();
        auvVarM104895r.getClass();
        return xl90Var.m211588W(auvVarM104895r, new azi0[]{xl90Var.producerFactory.m104896s(), xl90Var.producerFactory.m104897t()});
    }

    /* JADX INFO: renamed from: h */
    public static wk90 m211555h(xl90 xl90Var) throws Throwable {
        xl90Var.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
        }
        axv axvVarM104900w = xl90Var.producerFactory.m104900w();
        axvVarM104900w.getClass();
        return xl90Var.m211585T(axvVarM104900w);
    }

    /* JADX INFO: renamed from: i */
    public static bzc0 m211556i(xl90 xl90Var) {
        xl90Var.getClass();
        if (!i9j.m139099d()) {
            return new bzc0(xl90Var.m211594s());
        }
        i9j.m139097a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
        try {
            return new bzc0(xl90Var.m211594s());
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: j */
    public static wk90 m211557j(xl90 xl90Var) {
        xl90Var.getClass();
        if (!i9j.m139099d()) {
            ovv ovvVarM104898u = xl90Var.producerFactory.m104898u();
            ovvVarM104898u.getClass();
            return xl90Var.producerFactory.m104880b(xl90Var.m211591Z(ovvVarM104898u), xl90Var.threadHandoffProducerQueue);
        }
        i9j.m139097a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        try {
            ovv ovvVarM104898u2 = xl90Var.producerFactory.m104898u();
            ovvVarM104898u2.getClass();
            return xl90Var.producerFactory.m104880b(xl90Var.m211591Z(ovvVarM104898u2), xl90Var.threadHandoffProducerQueue);
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: k */
    public static wk90 m211558k(xl90 xl90Var) {
        xl90Var.getClass();
        if (!i9j.m139099d()) {
            return xl90Var.m211589X(xl90Var.networkFetcher);
        }
        i9j.m139097a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        try {
            return xl90Var.m211589X(xl90Var.networkFetcher);
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: l */
    public static wk90 m211559l(xl90 xl90Var) {
        xl90Var.getClass();
        ovv ovvVarM104898u = xl90Var.producerFactory.m104898u();
        ovvVarM104898u.getClass();
        return xl90Var.m211587V(ovvVarM104898u);
    }

    /* JADX INFO: renamed from: m */
    public static wk90 m211560m(xl90 xl90Var) {
        xl90Var.getClass();
        ytv ytvVarM104894q = xl90Var.producerFactory.m104894q();
        ytvVarM104894q.getClass();
        return xl90Var.m211587V(ytvVarM104894q);
    }

    /* JADX INFO: renamed from: n */
    public static ffh0 m211561n(xl90 xl90Var) {
        xl90Var.getClass();
        if (!i9j.m139099d()) {
            return xl90Var.producerFactory.m104877E(xl90Var.m211595t());
        }
        i9j.m139097a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
        try {
            return xl90Var.producerFactory.m104877E(xl90Var.m211595t());
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: o */
    public static wk90 m211562o(xl90 xl90Var) {
        xl90Var.getClass();
        exv exvVarM104901x = xl90Var.producerFactory.m104901x();
        exvVarM104901x.getClass();
        return xl90Var.m211585T(exvVarM104901x);
    }

    /* JADX INFO: renamed from: p */
    public static bzc0 m211563p(xl90 xl90Var) {
        xl90Var.getClass();
        if (!i9j.m139099d()) {
            return new bzc0(xl90Var.m211595t());
        }
        i9j.m139097a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
        try {
            return new bzc0(xl90Var.m211595t());
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: q */
    public static wk90 m211564q(xl90 xl90Var) {
        xl90Var.getClass();
        wwv wwvVarM104899v = xl90Var.producerFactory.m104899v();
        wwvVarM104899v.getClass();
        return xl90Var.m211587V(wwvVarM104899v);
    }

    /* JADX INFO: renamed from: r */
    public static wk90 m211565r(xl90 xl90Var) {
        xl90Var.getClass();
        if (!i9j.m139099d()) {
            return xl90Var.m211586U(xl90Var.m211599x());
        }
        i9j.m139097a("ProducerSequenceFactory#getNetworkFetchSequence:init");
        try {
            return xl90Var.m211586U(xl90Var.m211599x());
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: A */
    public final synchronized wk90<Void> m211566A(wk90<fb5<db5>> inputProducer) {
        wk90<Void> wk90VarM104877E;
        wk90VarM104877E = this.closeableImagePrefetchSequences.get(inputProducer);
        if (wk90VarM104877E == null) {
            wk90VarM104877E = this.producerFactory.m104877E(inputProducer);
            this.closeableImagePrefetchSequences.put(inputProducer, wk90VarM104877E);
        }
        return wk90VarM104877E;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final wk90<fb5<db5>> m211567B(@NotNull ImageRequest imageRequest) {
        imageRequest.getClass();
        if (!i9j.m139099d()) {
            wk90<fb5<db5>> wk90VarM211597v = m211597v(imageRequest);
            if (imageRequest.m8629m() != null) {
                wk90VarM211597v = m211583R(wk90VarM211597v);
            }
            if (this.useBitmapPrepareToDraw) {
                wk90VarM211597v = m211598w(wk90VarM211597v);
            }
            return (!this.allowDelay || imageRequest.m8622f() <= 0) ? wk90VarM211597v : m211568C(wk90VarM211597v);
        }
        i9j.m139097a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            wk90<fb5<db5>> wk90VarM211597v2 = m211597v(imageRequest);
            if (imageRequest.m8629m() != null) {
                wk90VarM211597v2 = m211583R(wk90VarM211597v2);
            }
            if (this.useBitmapPrepareToDraw) {
                wk90VarM211597v2 = m211598w(wk90VarM211597v2);
            }
            if (this.allowDelay && imageRequest.m8622f() > 0) {
                wk90VarM211597v2 = m211568C(wk90VarM211597v2);
            }
            return wk90VarM211597v2;
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: C */
    public final synchronized wk90<fb5<db5>> m211568C(wk90<fb5<db5>> inputProducer) {
        hud hudVarM104888k;
        hudVarM104888k = this.producerFactory.m104888k(inputProducer);
        hudVarM104888k.getClass();
        return hudVarM104888k;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final wk90<Void> m211569D(@NotNull ImageRequest imageRequest) {
        imageRequest.getClass();
        Companion companion = INSTANCE;
        companion.m211605d(imageRequest);
        int iM8640x = imageRequest.m8640x();
        if (iM8640x == 0) {
            return m211582Q();
        }
        if (iM8640x == 2 || iM8640x == 3) {
            return m211575J();
        }
        Uri uriM8639w = imageRequest.m8639w();
        uriM8639w.getClass();
        yg3.m215829a("Unsupported uri scheme for encoded image fetch! Uri is: ", companion.m211604c(uriM8639w));
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final wk90<fb5<PooledByteBuffer>> m211570E(@NotNull ImageRequest imageRequest) {
        wk90<fb5<PooledByteBuffer>> wk90VarM211580O;
        imageRequest.getClass();
        if (!i9j.m139099d()) {
            INSTANCE.m211605d(imageRequest);
            Uri uriM8639w = imageRequest.m8639w();
            uriM8639w.getClass();
            int iM8640x = imageRequest.m8640x();
            if (iM8640x == 0) {
                return m211580O();
            }
            if (iM8640x == 2 || iM8640x == 3) {
                return m211574I();
            }
            if (iM8640x == 4) {
                return m211572G();
            }
            Set<lzb> set = this.customProducerSequenceFactories;
            if (set != null) {
                Iterator<lzb> it = set.iterator();
                while (it.hasNext()) {
                    wk90<fb5<PooledByteBuffer>> wk90VarM156428c = it.next().m156428c(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue);
                    if (wk90VarM156428c != null) {
                        return wk90VarM156428c;
                    }
                }
            }
            yg3.m215829a("Unsupported uri scheme for encoded image fetch! Uri is: ", INSTANCE.m211604c(uriM8639w));
            return null;
        }
        i9j.m139097a("ProducerSequenceFactory#getEncodedImageProducerSequence");
        try {
            INSTANCE.m211605d(imageRequest);
            Uri uriM8639w2 = imageRequest.m8639w();
            uriM8639w2.getClass();
            int iM8640x2 = imageRequest.m8640x();
            if (iM8640x2 == 0) {
                wk90VarM211580O = m211580O();
            } else if (iM8640x2 == 2 || iM8640x2 == 3) {
                wk90VarM211580O = m211574I();
            } else {
                if (iM8640x2 != 4) {
                    Set<lzb> set2 = this.customProducerSequenceFactories;
                    if (set2 != null) {
                        Iterator<lzb> it2 = set2.iterator();
                        while (it2.hasNext()) {
                            wk90<fb5<PooledByteBuffer>> wk90VarM156428c2 = it2.next().m156428c(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue);
                            if (wk90VarM156428c2 != null) {
                                i9j.m139098b();
                                return wk90VarM156428c2;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + INSTANCE.m211604c(uriM8639w2));
                }
                wk90VarM211580O = m211572G();
            }
            i9j.m139098b();
            return wk90VarM211580O;
        } catch (Throwable th) {
            i9j.m139098b();
            throw th;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final wk90<fb5<db5>> m211571F() {
        return (wk90) this.localAssetFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final wk90<fb5<PooledByteBuffer>> m211572G() {
        return (wk90) this.localContentUriFetchEncodedImageProducerSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final wk90<fb5<db5>> m211573H() {
        return (wk90) this.localContentUriFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final wk90<fb5<PooledByteBuffer>> m211574I() {
        return (wk90) this.localFileFetchEncodedImageProducerSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final wk90<Void> m211575J() {
        Object value = this.localFileFetchToEncodedMemoryPrefetchSequence.getValue();
        value.getClass();
        return (wk90) value;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final wk90<fb5<db5>> m211576K() {
        return (wk90) this.localImageFileFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final wk90<fb5<db5>> m211577L() {
        return (wk90) this.localResourceFetchSequence.getValue();
    }

    @RequiresApi(29)
    @NotNull
    /* JADX INFO: renamed from: M */
    public final wk90<fb5<db5>> m211578M() {
        return (wk90) this.localThumbnailBitmapSdk29FetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final wk90<fb5<db5>> m211579N() {
        return (wk90) this.localVideoFileFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final wk90<fb5<PooledByteBuffer>> m211580O() {
        return (wk90) this.networkFetchEncodedImageProducerSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final wk90<fb5<db5>> m211581P() {
        return (wk90) this.networkFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final wk90<Void> m211582Q() {
        Object value = this.networkFetchToEncodedMemoryPrefetchSequence.getValue();
        value.getClass();
        return (wk90) value;
    }

    /* JADX INFO: renamed from: R */
    public final synchronized wk90<fb5<db5>> m211583R(wk90<fb5<db5>> inputProducer) {
        wk90<fb5<db5>> wk90VarM104873A;
        wk90VarM104873A = this.postprocessorSequences.get(inputProducer);
        if (wk90VarM104873A == null) {
            gm80 gm80VarM104874B = this.producerFactory.m104874B(inputProducer);
            gm80VarM104874B.getClass();
            wk90VarM104873A = this.producerFactory.m104873A(gm80VarM104874B);
            this.postprocessorSequences.put(inputProducer, wk90VarM104873A);
        }
        return wk90VarM104873A;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final wk90<fb5<db5>> m211584S() {
        return (wk90) this.qualifiedResourceFetchSequence.getValue();
    }

    /* JADX INFO: renamed from: T */
    public final wk90<fb5<db5>> m211585T(wk90<fb5<db5>> inputProducer) {
        q23 q23VarM104883e = this.producerFactory.m104883e(inputProducer);
        q23VarM104883e.getClass();
        p23 p23VarM104882d = this.producerFactory.m104882d(q23VarM104883e);
        p23VarM104882d.getClass();
        wk90<fb5<db5>> wk90VarM104880b = this.producerFactory.m104880b(p23VarM104882d, this.threadHandoffProducerQueue);
        wk90VarM104880b.getClass();
        if (!this.isEncodedMemoryCacheProbingEnabled && !this.isDiskCacheProbingEnabled) {
            n23 n23VarM104881c = this.producerFactory.m104881c(wk90VarM104880b);
            n23VarM104881c.getClass();
            return n23VarM104881c;
        }
        n23 n23VarM104881c2 = this.producerFactory.m104881c(wk90VarM104880b);
        n23VarM104881c2.getClass();
        b33 b33VarM104885g = this.producerFactory.m104885g(n23VarM104881c2);
        b33VarM104885g.getClass();
        return b33VarM104885g;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final wk90<fb5<db5>> m211586U(@NotNull wk90<n0f> inputProducer) {
        inputProducer.getClass();
        if (!i9j.m139099d()) {
            C1650a c1650aM104887j = this.producerFactory.m104887j(inputProducer);
            c1650aM104887j.getClass();
            return m211585T(c1650aM104887j);
        }
        i9j.m139097a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            C1650a c1650aM104887j2 = this.producerFactory.m104887j(inputProducer);
            c1650aM104887j2.getClass();
            return m211585T(c1650aM104887j2);
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: V */
    public final wk90<fb5<db5>> m211587V(wk90<n0f> inputProducer) {
        return m211588W(inputProducer, new azi0[]{this.producerFactory.m104897t()});
    }

    /* JADX INFO: renamed from: W */
    public final wk90<fb5<db5>> m211588W(wk90<n0f> inputProducer, azi0<n0f>[] thumbnailProducers) {
        return m211586U(m211593b0(m211591Z(inputProducer), thumbnailProducers));
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final synchronized wk90<n0f> m211589X(@NotNull vj20<?> networkFetcher) {
        try {
            networkFetcher.getClass();
            boolean z = false;
            if (!i9j.m139099d()) {
                wk90<n0f> wk90VarM104902y = this.producerFactory.m104902y(networkFetcher);
                wk90VarM104902y.getClass();
                t80 t80VarM104871a = bl90.m104871a(m211591Z(wk90VarM104902y));
                t80VarM104871a.getClass();
                bl90 bl90Var = this.producerFactory;
                if (this.resizeAndRotateEnabledForNetwork && this.downsampleMode != DownsampleMode.NEVER) {
                    z = true;
                }
                return bl90Var.m104876D(t80VarM104871a, z, this.imageTranscoderFactory);
            }
            i9j.m139097a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                wk90<n0f> wk90VarM104902y2 = this.producerFactory.m104902y(networkFetcher);
                wk90VarM104902y2.getClass();
                t80 t80VarM104871a2 = bl90.m104871a(m211591Z(wk90VarM104902y2));
                t80VarM104871a2.getClass();
                bl90 bl90Var2 = this.producerFactory;
                if (this.resizeAndRotateEnabledForNetwork && this.downsampleMode != DownsampleMode.NEVER) {
                    z = true;
                }
                C1653d c1653dM104876D = bl90Var2.m104876D(t80VarM104871a2, z, this.imageTranscoderFactory);
                i9j.m139098b();
                return c1653dM104876D;
            } catch (Throwable th) {
                i9j.m139098b();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final wk90<n0f> m211590Y(wk90<n0f> inputProducer) {
        C1652c c1652cM104890m;
        C1652c c1652cM104890m2;
        if (!i9j.m139099d()) {
            boolean z = this.partialImageCachingEnabled;
            bl90 bl90Var = this.producerFactory;
            if (z) {
                rg60 rg60VarM104903z = bl90Var.m104903z(inputProducer);
                rg60VarM104903z.getClass();
                c1652cM104890m2 = this.producerFactory.m104890m(rg60VarM104903z);
            } else {
                c1652cM104890m2 = bl90Var.m104890m(inputProducer);
            }
            c1652cM104890m2.getClass();
            C1651b c1651bM104889l = this.producerFactory.m104889l(c1652cM104890m2);
            c1651bM104889l.getClass();
            return c1651bM104889l;
        }
        i9j.m139097a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            boolean z2 = this.partialImageCachingEnabled;
            bl90 bl90Var2 = this.producerFactory;
            if (z2) {
                rg60 rg60VarM104903z2 = bl90Var2.m104903z(inputProducer);
                rg60VarM104903z2.getClass();
                c1652cM104890m = this.producerFactory.m104890m(rg60VarM104903z2);
            } else {
                c1652cM104890m = bl90Var2.m104890m(inputProducer);
            }
            c1652cM104890m.getClass();
            C1651b c1651bM104889l2 = this.producerFactory.m104889l(c1652cM104890m);
            c1651bM104889l2.getClass();
            return c1651bM104889l2;
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final wk90<n0f> m211591Z(wk90<n0f> inputProducer) {
        if (this.diskCacheEnabled) {
            inputProducer = m211590Y(inputProducer);
        }
        wk90<n0f> wk90VarM104892o = this.producerFactory.m104892o(inputProducer);
        wk90VarM104892o.getClass();
        boolean z = this.isDiskCacheProbingEnabled;
        bl90 bl90Var = this.producerFactory;
        if (!z) {
            l0f l0fVarM104891n = bl90Var.m104891n(wk90VarM104892o);
            l0fVarM104891n.getClass();
            return l0fVarM104891n;
        }
        r0f r0fVarM104893p = bl90Var.m104893p(wk90VarM104892o);
        r0fVarM104893p.getClass();
        l0f l0fVarM104891n2 = this.producerFactory.m104891n(r0fVarM104893p);
        l0fVarM104891n2.getClass();
        return l0fVarM104891n2;
    }

    /* JADX INFO: renamed from: a0 */
    public final wk90<n0f> m211592a0(azi0<n0f>[] thumbnailProducers) {
        zyi0 zyi0VarM104879G = this.producerFactory.m104879G(thumbnailProducers);
        zyi0VarM104879G.getClass();
        C1653d c1653dM104876D = this.producerFactory.m104876D(zyi0VarM104879G, true, this.imageTranscoderFactory);
        c1653dM104876D.getClass();
        return c1653dM104876D;
    }

    /* JADX INFO: renamed from: b0 */
    public final wk90<n0f> m211593b0(wk90<n0f> inputProducer, azi0<n0f>[] thumbnailProducers) {
        t80 t80VarM104871a = bl90.m104871a(inputProducer);
        t80VarM104871a.getClass();
        syi0 syi0VarM104878F = this.producerFactory.m104878F(this.producerFactory.m104876D(t80VarM104871a, true, this.imageTranscoderFactory));
        syi0VarM104878F.getClass();
        gf3 gf3VarM104872h = bl90.m104872h(m211592a0(thumbnailProducers), syi0VarM104878F);
        gf3VarM104872h.getClass();
        return gf3VarM104872h;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final wk90<n0f> m211594s() {
        Object value = this.backgroundLocalContentUriFetchToEncodeMemorySequence.getValue();
        value.getClass();
        return (wk90) value;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final wk90<n0f> m211595t() {
        Object value = this.backgroundLocalFileFetchToEncodeMemorySequence.getValue();
        value.getClass();
        return (wk90) value;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final wk90<n0f> m211596u() {
        Object value = this.backgroundNetworkFetchToEncodedMemorySequence.getValue();
        value.getClass();
        return (wk90) value;
    }

    /* JADX INFO: renamed from: v */
    public final wk90<fb5<db5>> m211597v(ImageRequest imageRequest) {
        wk90<fb5<db5>> wk90VarM211581P;
        if (!i9j.m139099d()) {
            Uri uriM8639w = imageRequest.m8639w();
            uriM8639w.getClass();
            if (uriM8639w == null) {
                wtq0.m207906a("Uri is null.");
                return null;
            }
            int iM8640x = imageRequest.m8640x();
            if (iM8640x == 0) {
                return m211581P();
            }
            switch (iM8640x) {
                case 2:
                    return imageRequest.m8626j() ? m211578M() : m211579N();
                case 3:
                    return imageRequest.m8626j() ? m211578M() : m211576K();
                case 4:
                    if (imageRequest.m8626j()) {
                        return m211578M();
                    }
                    return o7y.m166388c(this.contentResolver.getType(uriM8639w)) ? m211579N() : m211573H();
                case 5:
                    return m211571F();
                case 6:
                    return m211577L();
                case 7:
                    return m211600y();
                case 8:
                    return m211584S();
                default:
                    Set<lzb> set = this.customProducerSequenceFactories;
                    if (set != null) {
                        Iterator<lzb> it = set.iterator();
                        while (it.hasNext()) {
                            xl90 xl90Var = this;
                            ImageRequest imageRequest2 = imageRequest;
                            wk90<fb5<db5>> wk90VarM156427b = it.next().m156427b(imageRequest2, xl90Var, this.producerFactory, this.threadHandoffProducerQueue, this.isEncodedMemoryCacheProbingEnabled, this.isDiskCacheProbingEnabled);
                            if (wk90VarM156427b != null) {
                                return wk90VarM156427b;
                            }
                            imageRequest = imageRequest2;
                            this = xl90Var;
                        }
                    }
                    yg3.m215829a("Unsupported uri scheme! Uri is: ", INSTANCE.m211604c(uriM8639w));
                    return null;
            }
        }
        i9j.m139097a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri uriM8639w2 = imageRequest.m8639w();
            uriM8639w2.getClass();
            if (uriM8639w2 == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int iM8640x2 = imageRequest.m8640x();
            if (iM8640x2 != 0) {
                switch (iM8640x2) {
                    case 2:
                        if (imageRequest.m8626j()) {
                            wk90<fb5<db5>> wk90VarM211578M = m211578M();
                            i9j.m139098b();
                            return wk90VarM211578M;
                        }
                        wk90VarM211581P = m211579N();
                        break;
                    case 3:
                        if (imageRequest.m8626j()) {
                            wk90<fb5<db5>> wk90VarM211578M2 = m211578M();
                            i9j.m139098b();
                            return wk90VarM211578M2;
                        }
                        wk90VarM211581P = m211576K();
                        break;
                    case 4:
                        if (imageRequest.m8626j()) {
                            wk90<fb5<db5>> wk90VarM211578M3 = m211578M();
                            i9j.m139098b();
                            return wk90VarM211578M3;
                        }
                        if (o7y.m166388c(this.contentResolver.getType(uriM8639w2))) {
                            wk90<fb5<db5>> wk90VarM211579N = m211579N();
                            i9j.m139098b();
                            return wk90VarM211579N;
                        }
                        wk90VarM211581P = m211573H();
                        break;
                    case 5:
                        wk90VarM211581P = m211571F();
                        break;
                    case 6:
                        wk90VarM211581P = m211577L();
                        break;
                    case 7:
                        wk90VarM211581P = m211600y();
                        break;
                    case 8:
                        wk90VarM211581P = m211584S();
                        break;
                    default:
                        Set<lzb> set2 = this.customProducerSequenceFactories;
                        if (set2 != null) {
                            Iterator<lzb> it2 = set2.iterator();
                            while (it2.hasNext()) {
                                wk90<fb5<db5>> wk90VarM156427b2 = it2.next().m156427b(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue, this.isEncodedMemoryCacheProbingEnabled, this.isDiskCacheProbingEnabled);
                                if (wk90VarM156427b2 != null) {
                                    i9j.m139098b();
                                    return wk90VarM156427b2;
                                }
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + INSTANCE.m211604c(uriM8639w2));
                }
            } else {
                wk90VarM211581P = m211581P();
            }
            i9j.m139098b();
            return wk90VarM211581P;
        } catch (Throwable th) {
            i9j.m139098b();
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public final synchronized wk90<fb5<db5>> m211598w(wk90<fb5<db5>> inputProducer) {
        wk90<fb5<db5>> wk90VarM104884f;
        wk90VarM104884f = this.bitmapPrepareSequences.get(inputProducer);
        if (wk90VarM104884f == null) {
            wk90VarM104884f = this.producerFactory.m104884f(inputProducer);
            this.bitmapPrepareSequences.put(inputProducer, wk90VarM104884f);
        }
        return wk90VarM104884f;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final wk90<n0f> m211599x() {
        return (wk90) this.commonNetworkFetchToEncodedMemorySequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final wk90<fb5<db5>> m211600y() {
        return (wk90) this.dataFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final wk90<Void> m211601z(@NotNull ImageRequest imageRequest) {
        imageRequest.getClass();
        wk90<fb5<db5>> wk90VarM211597v = m211597v(imageRequest);
        if (this.useBitmapPrepareToDraw) {
            wk90VarM211597v = m211598w(wk90VarM211597v);
        }
        return m211566A(wk90VarM211597v);
    }

    /* JADX INFO: renamed from: l.xl90$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/xl90$a;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "", Constants.INAPP_DATA_TAG, "(Lcom/facebook/imagepipeline/request/ImageRequest;)V", "Landroid/net/Uri;", "uri", "", "c", "(Landroid/net/Uri;)Ljava/lang/String;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final String m211604c(Uri uri) {
            String string = uri.toString();
            string.getClass();
            return string.length() > 30 ? string.substring(0, 30).concat("...") : string;
        }

        /* JADX INFO: renamed from: d */
        public final void m211605d(ImageRequest imageRequest) {
            wn80.m207177b(Boolean.valueOf(imageRequest.m8628l().getValue() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()));
        }

        public Companion() {
        }
    }
}
