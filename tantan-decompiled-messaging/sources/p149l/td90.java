package p149l;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.producers.C1627a;
import com.facebook.imagepipeline.producers.C1628b;
import com.facebook.imagepipeline.producers.C1629c;
import com.facebook.imagepipeline.producers.C1630d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010%\n\u0002\b<\u0018\u0000 \u0090\u00012\u00020\u0001:\u0001?B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b%\u0010&J=\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b,\u0010&J#\u0010-\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b-\u0010&J/\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b.\u0010&J7\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b/\u0010+J)\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b0\u00101J/\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b2\u0010&J+\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b4\u0010&J/\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b5\u0010&J/\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b6\u0010&J!\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b8\u0010\"J\u001d\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b9\u0010\"J!\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b:\u0010\"J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b;\u0010\"J\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b<\u0010=J'\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e¢\u0006\u0004\b>\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010,R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010,R\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010,R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010,R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010,R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010,R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TRL\u0010^\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e0U8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bV\u0010W\u0012\u0004\b\\\u0010]\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[RH\u0010c\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e0U8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b_\u0010W\u0012\u0004\bb\u0010]\u001a\u0004\b`\u0010Y\"\u0004\ba\u0010[RL\u0010h\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e0U8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bd\u0010W\u0012\u0004\bg\u0010]\u001a\u0004\be\u0010Y\"\u0004\bf\u0010[R'\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR-\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f0\u001e8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bn\u0010j\u0012\u0004\bp\u0010]\u001a\u0004\bo\u0010lR'\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\br\u0010j\u001a\u0004\bs\u0010lR'\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010j\u001a\u0004\bu\u0010lR#\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010j\u001a\u0004\br\u0010lR#\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bx\u0010j\u001a\u0004\by\u0010lR!\u0010|\u001a\b\u0012\u0004\u0012\u00020#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b{\u0010j\u001a\u0004\bx\u0010lR#\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010j\u001a\u0004\b}\u0010lR#\u0010\u007f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010j\u001a\u0004\bn\u0010lR$\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010j\u001a\u0004\bi\u0010lR)\u0010\u0082\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b6\u0010j\u001a\u0005\b\u0081\u0001\u0010lR)\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b9\u0010j\u001a\u0005\b\u0083\u0001\u0010lR)\u0010\u0086\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b8\u0010j\u001a\u0005\b\u0085\u0001\u0010lR*\u0010\u0089\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8GX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010j\u001a\u0005\b\u0088\u0001\u0010lR)\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\bs\u0010j\u001a\u0005\b\u008a\u0001\u0010lR*\u0010\u008d\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010j\u001a\u0005\b\u008c\u0001\u0010lR)\u0010\u008e\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\bo\u0010j\u001a\u0005\b\u0087\u0001\u0010lR(\u0010\u008f\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b}\u0010j\u001a\u0004\b{\u0010l¨\u0006\u0091\u0001"}, m87232d2 = {"Ll/td90;", "", "Landroid/content/ContentResolver;", "contentResolver", "Ll/xc90;", "producerFactory", "Ll/mb20;", "networkFetcher", "", "resizeAndRotateEnabledForNetwork", "webpSupportEnabled", "Ll/moi0;", "threadHandoffProducerQueue", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "useBitmapPrepareToDraw", "partialImageCachingEnabled", "diskCacheEnabled", "Ll/uim;", "imageTranscoderFactory", "isEncodedMemoryCacheProbingEnabled", "isDiskCacheProbingEnabled", "allowDelay", "", "Ll/xxb;", "customProducerSequenceFactories", "<init>", "(Landroid/content/ContentResolver;Ll/xc90;Ll/mb20;ZZLl/moi0;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZZLl/uim;ZZZLjava/util/Set;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/sc90;", "Ll/fa5;", "Ll/da5;", ResourceDirection.f38808v, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ll/sc90;", "Ll/jze;", "inputProducer", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ll/sc90;)Ll/sc90;", "", "Ll/xpi0;", "thumbnailProducers", "W", "(Ll/sc90;[Ll/xpi0;)Ll/sc90;", "Z", "Y", j6f.GPS_DIRECTION_TRUE, "b0", "a0", "([Ll/xpi0;)Ll/sc90;", "R", "Ljava/lang/Void;", "A", "w", b2s.C_ZONE, "Lcom/facebook/common/memory/PooledByteBuffer;", "E", "D", "B", BaseSei.f13932Z, "X", "(Ll/mb20;)Ll/sc90;", "U", "a", "Landroid/content/ContentResolver;", "b", "Ll/xc90;", "c", "Ll/mb20;", Constants.INAPP_DATA_TAG, "e", "f", "Ll/moi0;", "g", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "h", RXScreenCaptureService.KEY_INDEX, "j", "k", "Ll/uim;", BLiveStormDanmakuGiftResourceType.f44444l, "m", "n", "o", "Ljava/util/Set;", "", "p", "Ljava/util/Map;", "getPostprocessorSequences", "()Ljava/util/Map;", "setPostprocessorSequences", "(Ljava/util/Map;)V", "getPostprocessorSequences$annotations", "()V", "postprocessorSequences", "q", "getCloseableImagePrefetchSequences", "setCloseableImagePrefetchSequences", "getCloseableImagePrefetchSequences$annotations", "closeableImagePrefetchSequences", "r", "getBitmapPrepareSequences", "setBitmapPrepareSequences", "getBitmapPrepareSequences$annotations", "bitmapPrepareSequences", BLiveStormDanmakuGiftResourceType.f44446s, "Lkotlin/Lazy;", BloodType.f38728O, "()Ll/sc90;", "networkFetchEncodedImageProducerSequence", Constants.KEY_T, "I", "getLocalFileFetchEncodedImageProducerSequence$annotations", "localFileFetchEncodedImageProducerSequence", "u", "G", "localContentUriFetchEncodedImageProducerSequence", "P", "networkFetchSequence", "backgroundNetworkFetchToEncodedMemorySequence", BaseSei.f13930X, "Q", "networkFetchToEncodedMemoryPrefetchSequence", BaseSei.f13931Y, "commonNetworkFetchToEncodedMemorySequence", "J", "localFileFetchToEncodedMemoryPrefetchSequence", "backgroundLocalFileFetchToEncodeMemorySequence", "backgroundLocalContentUriFetchToEncodeMemorySequence", "K", "localImageFileFetchSequence", "N", "localVideoFileFetchSequence", "H", "localContentUriFetchSequence", "F", "M", "localThumbnailBitmapSdk29FetchSequence", j6f.LATITUDE_SOUTH, "qualifiedResourceFetchSequence", "L", "localResourceFetchSequence", "localAssetFetchSequence", "dataFetchSequence", "Companion", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class td90 {

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
    public final xc90 producerFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final mb20<?> networkFetcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean resizeAndRotateEnabledForNetwork;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean webpSupportEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final moi0 threadHandoffProducerQueue;

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
    public final uim imageTranscoderFactory;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean isEncodedMemoryCacheProbingEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final boolean isDiskCacheProbingEnabled;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final boolean allowDelay;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public final Set<xxb> customProducerSequenceFactories;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public Map<sc90<fa5<da5>>, sc90<fa5<da5>>> postprocessorSequences;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public Map<sc90<fa5<da5>>, sc90<Void>> closeableImagePrefetchSequences;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public Map<sc90<fa5<da5>>, sc90<fa5<da5>>> bitmapPrepareSequences;

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
    public td90(@NotNull ContentResolver contentResolver, @NotNull xc90 xc90Var, @NotNull mb20<?> mb20Var, boolean z, boolean z2, @NotNull moi0 moi0Var, @NotNull DownsampleMode downsampleMode, boolean z3, boolean z4, boolean z5, @NotNull uim uimVar, boolean z6, boolean z7, boolean z8, @Nullable Set<? extends xxb> set) {
        contentResolver.getClass();
        xc90Var.getClass();
        mb20Var.getClass();
        moi0Var.getClass();
        downsampleMode.getClass();
        uimVar.getClass();
        this.contentResolver = contentResolver;
        this.producerFactory = xc90Var;
        this.networkFetcher = mb20Var;
        this.resizeAndRotateEnabledForNetwork = z;
        this.webpSupportEnabled = z2;
        this.threadHandoffProducerQueue = moi0Var;
        this.downsampleMode = downsampleMode;
        this.useBitmapPrepareToDraw = z3;
        this.partialImageCachingEnabled = z4;
        this.diskCacheEnabled = z5;
        this.imageTranscoderFactory = uimVar;
        this.isEncodedMemoryCacheProbingEnabled = z6;
        this.isDiskCacheProbingEnabled = z7;
        this.allowDelay = z8;
        this.customProducerSequenceFactories = set;
        this.postprocessorSequences = new LinkedHashMap();
        this.closeableImagePrefetchSequences = new LinkedHashMap();
        this.bitmapPrepareSequences = new LinkedHashMap();
        this.networkFetchEncodedImageProducerSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.bd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188071e(this.f75013a);
            }
        });
        this.localFileFetchEncodedImageProducerSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.sd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188082p(this.f163818a);
            }
        });
        this.localContentUriFetchEncodedImageProducerSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.cd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188075i(this.f80356a);
            }
        });
        this.networkFetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.dd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188084r(this.f85582a);
            }
        });
        this.backgroundNetworkFetchToEncodedMemorySequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ed90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188068b(this.f90594a);
            }
        });
        this.networkFetchToEncodedMemoryPrefetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.fd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188072f(this.f97020a);
            }
        });
        this.commonNetworkFetchToEncodedMemorySequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.gd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188077k(this.f102095a);
            }
        });
        this.localFileFetchToEncodedMemoryPrefetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.hd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188080n(this.f107222a);
            }
        });
        this.backgroundLocalFileFetchToEncodeMemorySequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.id90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188076j(this.f112538a);
            }
        });
        this.backgroundLocalContentUriFetchToEncodeMemorySequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.jd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188069c(this.f117373a);
            }
        });
        this.localImageFileFetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.kd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188078l(this.f122543a);
            }
        });
        this.localVideoFileFetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ld90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188081o(this.f127530a);
            }
        });
        this.localContentUriFetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.md90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188073g(this.f133219a);
            }
        });
        this.localThumbnailBitmapSdk29FetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.nd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188074h(this.f138272a);
            }
        });
        this.qualifiedResourceFetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.od90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188067a(this.f143191a);
            }
        });
        this.localResourceFetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.pd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188083q(this.f148287a);
            }
        });
        this.localAssetFetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.qd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188079m(this.f153899a);
            }
        });
        this.dataFetchSequence = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.rd90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return td90.m188070d(this.f158904a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static sc90 m188067a(td90 td90Var) {
        td90Var.getClass();
        lnb0 lnb0VarM208083C = td90Var.producerFactory.m208083C();
        lnb0VarM208083C.getClass();
        return td90Var.m188106V(lnb0VarM208083C);
    }

    /* JADX INFO: renamed from: b */
    public static sc90 m188068b(td90 td90Var) {
        td90Var.getClass();
        if (!o6j.m162852d()) {
            return td90Var.producerFactory.m208088b(td90Var.m188118x(), td90Var.threadHandoffProducerQueue);
        }
        o6j.m162850a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return td90Var.producerFactory.m208088b(td90Var.m188118x(), td90Var.threadHandoffProducerQueue);
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: c */
    public static sc90 m188069c(td90 td90Var) {
        td90Var.getClass();
        if (!o6j.m162852d()) {
            zrv zrvVarM208103r = td90Var.producerFactory.m208103r();
            zrvVarM208103r.getClass();
            return td90Var.producerFactory.m208088b(td90Var.m188110Z(zrvVarM208103r), td90Var.threadHandoffProducerQueue);
        }
        o6j.m162850a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            zrv zrvVarM208103r2 = td90Var.producerFactory.m208103r();
            zrvVarM208103r2.getClass();
            return td90Var.producerFactory.m208088b(td90Var.m188110Z(zrvVarM208103r2), td90Var.threadHandoffProducerQueue);
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: d */
    public static sc90 m188070d(td90 td90Var) {
        td90Var.getClass();
        k4c k4cVarM208094i = td90Var.producerFactory.m208094i();
        k4cVarM208094i.getClass();
        return td90Var.m188105U(td90Var.producerFactory.m208084D(xc90.m208079a(k4cVarM208094i), true, td90Var.imageTranscoderFactory));
    }

    /* JADX INFO: renamed from: e */
    public static wqc0 m188071e(td90 td90Var) {
        td90Var.getClass();
        if (!o6j.m162852d()) {
            return new wqc0(td90Var.m188115u());
        }
        o6j.m162850a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
        try {
            return new wqc0(td90Var.m188115u());
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: f */
    public static x6h0 m188072f(td90 td90Var) {
        td90Var.getClass();
        if (!o6j.m162852d()) {
            return td90Var.producerFactory.m208085E(td90Var.m188115u());
        }
        o6j.m162850a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        try {
            return td90Var.producerFactory.m208085E(td90Var.m188115u());
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: g */
    public static sc90 m188073g(td90 td90Var) {
        td90Var.getClass();
        zrv zrvVarM208103r = td90Var.producerFactory.m208103r();
        zrvVarM208103r.getClass();
        return td90Var.m188107W(zrvVarM208103r, new xpi0[]{td90Var.producerFactory.m208104s(), td90Var.producerFactory.m208105t()});
    }

    /* JADX INFO: renamed from: h */
    public static sc90 m188074h(td90 td90Var) throws Throwable {
        td90Var.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
        }
        zuv zuvVarM208108w = td90Var.producerFactory.m208108w();
        zuvVarM208108w.getClass();
        return td90Var.m188104T(zuvVarM208108w);
    }

    /* JADX INFO: renamed from: i */
    public static wqc0 m188075i(td90 td90Var) {
        td90Var.getClass();
        if (!o6j.m162852d()) {
            return new wqc0(td90Var.m188113s());
        }
        o6j.m162850a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
        try {
            return new wqc0(td90Var.m188113s());
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: j */
    public static sc90 m188076j(td90 td90Var) {
        td90Var.getClass();
        if (!o6j.m162852d()) {
            ntv ntvVarM208106u = td90Var.producerFactory.m208106u();
            ntvVarM208106u.getClass();
            return td90Var.producerFactory.m208088b(td90Var.m188110Z(ntvVarM208106u), td90Var.threadHandoffProducerQueue);
        }
        o6j.m162850a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        try {
            ntv ntvVarM208106u2 = td90Var.producerFactory.m208106u();
            ntvVarM208106u2.getClass();
            return td90Var.producerFactory.m208088b(td90Var.m188110Z(ntvVarM208106u2), td90Var.threadHandoffProducerQueue);
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: k */
    public static sc90 m188077k(td90 td90Var) {
        td90Var.getClass();
        if (!o6j.m162852d()) {
            return td90Var.m188108X(td90Var.networkFetcher);
        }
        o6j.m162850a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        try {
            return td90Var.m188108X(td90Var.networkFetcher);
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: l */
    public static sc90 m188078l(td90 td90Var) {
        td90Var.getClass();
        ntv ntvVarM208106u = td90Var.producerFactory.m208106u();
        ntvVarM208106u.getClass();
        return td90Var.m188106V(ntvVarM208106u);
    }

    /* JADX INFO: renamed from: m */
    public static sc90 m188079m(td90 td90Var) {
        td90Var.getClass();
        xrv xrvVarM208102q = td90Var.producerFactory.m208102q();
        xrvVarM208102q.getClass();
        return td90Var.m188106V(xrvVarM208102q);
    }

    /* JADX INFO: renamed from: n */
    public static x6h0 m188080n(td90 td90Var) {
        td90Var.getClass();
        if (!o6j.m162852d()) {
            return td90Var.producerFactory.m208085E(td90Var.m188114t());
        }
        o6j.m162850a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
        try {
            return td90Var.producerFactory.m208085E(td90Var.m188114t());
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: o */
    public static sc90 m188081o(td90 td90Var) {
        td90Var.getClass();
        dvv dvvVarM208109x = td90Var.producerFactory.m208109x();
        dvvVarM208109x.getClass();
        return td90Var.m188104T(dvvVarM208109x);
    }

    /* JADX INFO: renamed from: p */
    public static wqc0 m188082p(td90 td90Var) {
        td90Var.getClass();
        if (!o6j.m162852d()) {
            return new wqc0(td90Var.m188114t());
        }
        o6j.m162850a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
        try {
            return new wqc0(td90Var.m188114t());
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: q */
    public static sc90 m188083q(td90 td90Var) {
        td90Var.getClass();
        vuv vuvVarM208107v = td90Var.producerFactory.m208107v();
        vuvVarM208107v.getClass();
        return td90Var.m188106V(vuvVarM208107v);
    }

    /* JADX INFO: renamed from: r */
    public static sc90 m188084r(td90 td90Var) {
        td90Var.getClass();
        if (!o6j.m162852d()) {
            return td90Var.m188105U(td90Var.m188118x());
        }
        o6j.m162850a("ProducerSequenceFactory#getNetworkFetchSequence:init");
        try {
            return td90Var.m188105U(td90Var.m188118x());
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: A */
    public final synchronized sc90<Void> m188085A(sc90<fa5<da5>> inputProducer) {
        sc90<Void> sc90VarM208085E;
        sc90VarM208085E = this.closeableImagePrefetchSequences.get(inputProducer);
        if (sc90VarM208085E == null) {
            sc90VarM208085E = this.producerFactory.m208085E(inputProducer);
            this.closeableImagePrefetchSequences.put(inputProducer, sc90VarM208085E);
        }
        return sc90VarM208085E;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final sc90<fa5<da5>> m188086B(@NotNull ImageRequest imageRequest) {
        imageRequest.getClass();
        if (!o6j.m162852d()) {
            sc90<fa5<da5>> sc90VarM188116v = m188116v(imageRequest);
            if (imageRequest.m8575m() != null) {
                sc90VarM188116v = m188102R(sc90VarM188116v);
            }
            if (this.useBitmapPrepareToDraw) {
                sc90VarM188116v = m188117w(sc90VarM188116v);
            }
            return (!this.allowDelay || imageRequest.m8568f() <= 0) ? sc90VarM188116v : m188087C(sc90VarM188116v);
        }
        o6j.m162850a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            sc90<fa5<da5>> sc90VarM188116v2 = m188116v(imageRequest);
            if (imageRequest.m8575m() != null) {
                sc90VarM188116v2 = m188102R(sc90VarM188116v2);
            }
            if (this.useBitmapPrepareToDraw) {
                sc90VarM188116v2 = m188117w(sc90VarM188116v2);
            }
            if (this.allowDelay && imageRequest.m8568f() > 0) {
                sc90VarM188116v2 = m188087C(sc90VarM188116v2);
            }
            return sc90VarM188116v2;
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: C */
    public final synchronized sc90<fa5<da5>> m188087C(sc90<fa5<da5>> inputProducer) {
        tsd tsdVarM208096k;
        tsdVarM208096k = this.producerFactory.m208096k(inputProducer);
        tsdVarM208096k.getClass();
        return tsdVarM208096k;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final sc90<Void> m188088D(@NotNull ImageRequest imageRequest) {
        imageRequest.getClass();
        Companion companion = INSTANCE;
        companion.m188124d(imageRequest);
        int iM8586x = imageRequest.m8586x();
        if (iM8586x == 0) {
            return m188101Q();
        }
        if (iM8586x == 2 || iM8586x == 3) {
            return m188094J();
        }
        Uri uriM8585w = imageRequest.m8585w();
        uriM8585w.getClass();
        kg3.m145878a("Unsupported uri scheme for encoded image fetch! Uri is: ", companion.m188123c(uriM8585w));
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final sc90<fa5<PooledByteBuffer>> m188089E(@NotNull ImageRequest imageRequest) {
        sc90<fa5<PooledByteBuffer>> sc90VarM188099O;
        imageRequest.getClass();
        if (!o6j.m162852d()) {
            INSTANCE.m188124d(imageRequest);
            Uri uriM8585w = imageRequest.m8585w();
            uriM8585w.getClass();
            int iM8586x = imageRequest.m8586x();
            if (iM8586x == 0) {
                return m188099O();
            }
            if (iM8586x == 2 || iM8586x == 3) {
                return m188093I();
            }
            if (iM8586x == 4) {
                return m188091G();
            }
            Set<xxb> set = this.customProducerSequenceFactories;
            if (set != null) {
                Iterator<xxb> it = set.iterator();
                while (it.hasNext()) {
                    sc90<fa5<PooledByteBuffer>> sc90VarM211462c = it.next().m211462c(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue);
                    if (sc90VarM211462c != null) {
                        return sc90VarM211462c;
                    }
                }
            }
            kg3.m145878a("Unsupported uri scheme for encoded image fetch! Uri is: ", INSTANCE.m188123c(uriM8585w));
            return null;
        }
        o6j.m162850a("ProducerSequenceFactory#getEncodedImageProducerSequence");
        try {
            INSTANCE.m188124d(imageRequest);
            Uri uriM8585w2 = imageRequest.m8585w();
            uriM8585w2.getClass();
            int iM8586x2 = imageRequest.m8586x();
            if (iM8586x2 == 0) {
                sc90VarM188099O = m188099O();
            } else if (iM8586x2 == 2 || iM8586x2 == 3) {
                sc90VarM188099O = m188093I();
            } else {
                if (iM8586x2 != 4) {
                    Set<xxb> set2 = this.customProducerSequenceFactories;
                    if (set2 != null) {
                        Iterator<xxb> it2 = set2.iterator();
                        while (it2.hasNext()) {
                            sc90<fa5<PooledByteBuffer>> sc90VarM211462c2 = it2.next().m211462c(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue);
                            if (sc90VarM211462c2 != null) {
                                o6j.m162851b();
                                return sc90VarM211462c2;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + INSTANCE.m188123c(uriM8585w2));
                }
                sc90VarM188099O = m188091G();
            }
            o6j.m162851b();
            return sc90VarM188099O;
        } catch (Throwable th) {
            o6j.m162851b();
            throw th;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final sc90<fa5<da5>> m188090F() {
        return (sc90) this.localAssetFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final sc90<fa5<PooledByteBuffer>> m188091G() {
        return (sc90) this.localContentUriFetchEncodedImageProducerSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final sc90<fa5<da5>> m188092H() {
        return (sc90) this.localContentUriFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final sc90<fa5<PooledByteBuffer>> m188093I() {
        return (sc90) this.localFileFetchEncodedImageProducerSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final sc90<Void> m188094J() {
        Object value = this.localFileFetchToEncodedMemoryPrefetchSequence.getValue();
        value.getClass();
        return (sc90) value;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final sc90<fa5<da5>> m188095K() {
        return (sc90) this.localImageFileFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final sc90<fa5<da5>> m188096L() {
        return (sc90) this.localResourceFetchSequence.getValue();
    }

    @RequiresApi(29)
    @NotNull
    /* JADX INFO: renamed from: M */
    public final sc90<fa5<da5>> m188097M() {
        return (sc90) this.localThumbnailBitmapSdk29FetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final sc90<fa5<da5>> m188098N() {
        return (sc90) this.localVideoFileFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final sc90<fa5<PooledByteBuffer>> m188099O() {
        return (sc90) this.networkFetchEncodedImageProducerSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final sc90<fa5<da5>> m188100P() {
        return (sc90) this.networkFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final sc90<Void> m188101Q() {
        Object value = this.networkFetchToEncodedMemoryPrefetchSequence.getValue();
        value.getClass();
        return (sc90) value;
    }

    /* JADX INFO: renamed from: R */
    public final synchronized sc90<fa5<da5>> m188102R(sc90<fa5<da5>> inputProducer) {
        sc90<fa5<da5>> sc90VarM208081A;
        sc90VarM208081A = this.postprocessorSequences.get(inputProducer);
        if (sc90VarM208081A == null) {
            zd80 zd80VarM208082B = this.producerFactory.m208082B(inputProducer);
            zd80VarM208082B.getClass();
            sc90VarM208081A = this.producerFactory.m208081A(zd80VarM208082B);
            this.postprocessorSequences.put(inputProducer, sc90VarM208081A);
        }
        return sc90VarM208081A;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final sc90<fa5<da5>> m188103S() {
        return (sc90) this.qualifiedResourceFetchSequence.getValue();
    }

    /* JADX INFO: renamed from: T */
    public final sc90<fa5<da5>> m188104T(sc90<fa5<da5>> inputProducer) {
        a23 a23VarM208091e = this.producerFactory.m208091e(inputProducer);
        a23VarM208091e.getClass();
        z13 z13VarM208090d = this.producerFactory.m208090d(a23VarM208091e);
        z13VarM208090d.getClass();
        sc90<fa5<da5>> sc90VarM208088b = this.producerFactory.m208088b(z13VarM208090d, this.threadHandoffProducerQueue);
        sc90VarM208088b.getClass();
        if (!this.isEncodedMemoryCacheProbingEnabled && !this.isDiskCacheProbingEnabled) {
            x13 x13VarM208089c = this.producerFactory.m208089c(sc90VarM208088b);
            x13VarM208089c.getClass();
            return x13VarM208089c;
        }
        x13 x13VarM208089c2 = this.producerFactory.m208089c(sc90VarM208088b);
        x13VarM208089c2.getClass();
        l23 l23VarM208093g = this.producerFactory.m208093g(x13VarM208089c2);
        l23VarM208093g.getClass();
        return l23VarM208093g;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final sc90<fa5<da5>> m188105U(@NotNull sc90<jze> inputProducer) {
        inputProducer.getClass();
        if (!o6j.m162852d()) {
            C1627a c1627aM208095j = this.producerFactory.m208095j(inputProducer);
            c1627aM208095j.getClass();
            return m188104T(c1627aM208095j);
        }
        o6j.m162850a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            C1627a c1627aM208095j2 = this.producerFactory.m208095j(inputProducer);
            c1627aM208095j2.getClass();
            return m188104T(c1627aM208095j2);
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: V */
    public final sc90<fa5<da5>> m188106V(sc90<jze> inputProducer) {
        return m188107W(inputProducer, new xpi0[]{this.producerFactory.m208105t()});
    }

    /* JADX INFO: renamed from: W */
    public final sc90<fa5<da5>> m188107W(sc90<jze> inputProducer, xpi0<jze>[] thumbnailProducers) {
        return m188105U(m188112b0(m188110Z(inputProducer), thumbnailProducers));
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final synchronized sc90<jze> m188108X(@NotNull mb20<?> networkFetcher) {
        try {
            networkFetcher.getClass();
            boolean z = false;
            if (!o6j.m162852d()) {
                sc90<jze> sc90VarM208110y = this.producerFactory.m208110y(networkFetcher);
                sc90VarM208110y.getClass();
                x80 x80VarM208079a = xc90.m208079a(m188110Z(sc90VarM208110y));
                x80VarM208079a.getClass();
                xc90 xc90Var = this.producerFactory;
                if (this.resizeAndRotateEnabledForNetwork && this.downsampleMode != DownsampleMode.NEVER) {
                    z = true;
                }
                return xc90Var.m208084D(x80VarM208079a, z, this.imageTranscoderFactory);
            }
            o6j.m162850a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                sc90<jze> sc90VarM208110y2 = this.producerFactory.m208110y(networkFetcher);
                sc90VarM208110y2.getClass();
                x80 x80VarM208079a2 = xc90.m208079a(m188110Z(sc90VarM208110y2));
                x80VarM208079a2.getClass();
                xc90 xc90Var2 = this.producerFactory;
                if (this.resizeAndRotateEnabledForNetwork && this.downsampleMode != DownsampleMode.NEVER) {
                    z = true;
                }
                C1630d c1630dM208084D = xc90Var2.m208084D(x80VarM208079a2, z, this.imageTranscoderFactory);
                o6j.m162851b();
                return c1630dM208084D;
            } catch (Throwable th) {
                o6j.m162851b();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final sc90<jze> m188109Y(sc90<jze> inputProducer) {
        C1629c c1629cM208098m;
        C1629c c1629cM208098m2;
        if (!o6j.m162852d()) {
            boolean z = this.partialImageCachingEnabled;
            xc90 xc90Var = this.producerFactory;
            if (z) {
                m860 m860VarM208111z = xc90Var.m208111z(inputProducer);
                m860VarM208111z.getClass();
                c1629cM208098m2 = this.producerFactory.m208098m(m860VarM208111z);
            } else {
                c1629cM208098m2 = xc90Var.m208098m(inputProducer);
            }
            c1629cM208098m2.getClass();
            C1628b c1628bM208097l = this.producerFactory.m208097l(c1629cM208098m2);
            c1628bM208097l.getClass();
            return c1628bM208097l;
        }
        o6j.m162850a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            boolean z2 = this.partialImageCachingEnabled;
            xc90 xc90Var2 = this.producerFactory;
            if (z2) {
                m860 m860VarM208111z2 = xc90Var2.m208111z(inputProducer);
                m860VarM208111z2.getClass();
                c1629cM208098m = this.producerFactory.m208098m(m860VarM208111z2);
            } else {
                c1629cM208098m = xc90Var2.m208098m(inputProducer);
            }
            c1629cM208098m.getClass();
            C1628b c1628bM208097l2 = this.producerFactory.m208097l(c1629cM208098m);
            c1628bM208097l2.getClass();
            return c1628bM208097l2;
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final sc90<jze> m188110Z(sc90<jze> inputProducer) {
        if (this.diskCacheEnabled) {
            inputProducer = m188109Y(inputProducer);
        }
        sc90<jze> sc90VarM208100o = this.producerFactory.m208100o(inputProducer);
        sc90VarM208100o.getClass();
        boolean z = this.isDiskCacheProbingEnabled;
        xc90 xc90Var = this.producerFactory;
        if (!z) {
            hze hzeVarM208099n = xc90Var.m208099n(sc90VarM208100o);
            hzeVarM208099n.getClass();
            return hzeVarM208099n;
        }
        nze nzeVarM208101p = xc90Var.m208101p(sc90VarM208100o);
        nzeVarM208101p.getClass();
        hze hzeVarM208099n2 = this.producerFactory.m208099n(nzeVarM208101p);
        hzeVarM208099n2.getClass();
        return hzeVarM208099n2;
    }

    /* JADX INFO: renamed from: a0 */
    public final sc90<jze> m188111a0(xpi0<jze>[] thumbnailProducers) {
        wpi0 wpi0VarM208087G = this.producerFactory.m208087G(thumbnailProducers);
        wpi0VarM208087G.getClass();
        C1630d c1630dM208084D = this.producerFactory.m208084D(wpi0VarM208087G, true, this.imageTranscoderFactory);
        c1630dM208084D.getClass();
        return c1630dM208084D;
    }

    /* JADX INFO: renamed from: b0 */
    public final sc90<jze> m188112b0(sc90<jze> inputProducer, xpi0<jze>[] thumbnailProducers) {
        x80 x80VarM208079a = xc90.m208079a(inputProducer);
        x80VarM208079a.getClass();
        ppi0 ppi0VarM208086F = this.producerFactory.m208086F(this.producerFactory.m208084D(x80VarM208079a, true, this.imageTranscoderFactory));
        ppi0VarM208086F.getClass();
        re3 re3VarM208080h = xc90.m208080h(m188111a0(thumbnailProducers), ppi0VarM208086F);
        re3VarM208080h.getClass();
        return re3VarM208080h;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final sc90<jze> m188113s() {
        Object value = this.backgroundLocalContentUriFetchToEncodeMemorySequence.getValue();
        value.getClass();
        return (sc90) value;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final sc90<jze> m188114t() {
        Object value = this.backgroundLocalFileFetchToEncodeMemorySequence.getValue();
        value.getClass();
        return (sc90) value;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final sc90<jze> m188115u() {
        Object value = this.backgroundNetworkFetchToEncodedMemorySequence.getValue();
        value.getClass();
        return (sc90) value;
    }

    /* JADX INFO: renamed from: v */
    public final sc90<fa5<da5>> m188116v(ImageRequest imageRequest) {
        sc90<fa5<da5>> sc90VarM188100P;
        if (!o6j.m162852d()) {
            Uri uriM8585w = imageRequest.m8585w();
            uriM8585w.getClass();
            if (uriM8585w == null) {
                qkq0.m175383a("Uri is null.");
                return null;
            }
            int iM8586x = imageRequest.m8586x();
            if (iM8586x == 0) {
                return m188100P();
            }
            switch (iM8586x) {
                case 2:
                    return imageRequest.m8572j() ? m188097M() : m188098N();
                case 3:
                    return imageRequest.m8572j() ? m188097M() : m188095K();
                case 4:
                    if (imageRequest.m8572j()) {
                        return m188097M();
                    }
                    return ryx.m181716c(this.contentResolver.getType(uriM8585w)) ? m188098N() : m188092H();
                case 5:
                    return m188090F();
                case 6:
                    return m188096L();
                case 7:
                    return m188119y();
                case 8:
                    return m188103S();
                default:
                    Set<xxb> set = this.customProducerSequenceFactories;
                    if (set != null) {
                        Iterator<xxb> it = set.iterator();
                        while (it.hasNext()) {
                            td90 td90Var = this;
                            ImageRequest imageRequest2 = imageRequest;
                            sc90<fa5<da5>> sc90VarM211461b = it.next().m211461b(imageRequest2, td90Var, this.producerFactory, this.threadHandoffProducerQueue, this.isEncodedMemoryCacheProbingEnabled, this.isDiskCacheProbingEnabled);
                            if (sc90VarM211461b != null) {
                                return sc90VarM211461b;
                            }
                            imageRequest = imageRequest2;
                            this = td90Var;
                        }
                    }
                    kg3.m145878a("Unsupported uri scheme! Uri is: ", INSTANCE.m188123c(uriM8585w));
                    return null;
            }
        }
        o6j.m162850a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri uriM8585w2 = imageRequest.m8585w();
            uriM8585w2.getClass();
            if (uriM8585w2 == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int iM8586x2 = imageRequest.m8586x();
            if (iM8586x2 != 0) {
                switch (iM8586x2) {
                    case 2:
                        if (imageRequest.m8572j()) {
                            sc90<fa5<da5>> sc90VarM188097M = m188097M();
                            o6j.m162851b();
                            return sc90VarM188097M;
                        }
                        sc90VarM188100P = m188098N();
                        break;
                    case 3:
                        if (imageRequest.m8572j()) {
                            sc90<fa5<da5>> sc90VarM188097M2 = m188097M();
                            o6j.m162851b();
                            return sc90VarM188097M2;
                        }
                        sc90VarM188100P = m188095K();
                        break;
                    case 4:
                        if (imageRequest.m8572j()) {
                            sc90<fa5<da5>> sc90VarM188097M3 = m188097M();
                            o6j.m162851b();
                            return sc90VarM188097M3;
                        }
                        if (ryx.m181716c(this.contentResolver.getType(uriM8585w2))) {
                            sc90<fa5<da5>> sc90VarM188098N = m188098N();
                            o6j.m162851b();
                            return sc90VarM188098N;
                        }
                        sc90VarM188100P = m188092H();
                        break;
                    case 5:
                        sc90VarM188100P = m188090F();
                        break;
                    case 6:
                        sc90VarM188100P = m188096L();
                        break;
                    case 7:
                        sc90VarM188100P = m188119y();
                        break;
                    case 8:
                        sc90VarM188100P = m188103S();
                        break;
                    default:
                        Set<xxb> set2 = this.customProducerSequenceFactories;
                        if (set2 != null) {
                            Iterator<xxb> it2 = set2.iterator();
                            while (it2.hasNext()) {
                                sc90<fa5<da5>> sc90VarM211461b2 = it2.next().m211461b(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue, this.isEncodedMemoryCacheProbingEnabled, this.isDiskCacheProbingEnabled);
                                if (sc90VarM211461b2 != null) {
                                    o6j.m162851b();
                                    return sc90VarM211461b2;
                                }
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + INSTANCE.m188123c(uriM8585w2));
                }
            } else {
                sc90VarM188100P = m188100P();
            }
            o6j.m162851b();
            return sc90VarM188100P;
        } catch (Throwable th) {
            o6j.m162851b();
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public final synchronized sc90<fa5<da5>> m188117w(sc90<fa5<da5>> inputProducer) {
        sc90<fa5<da5>> sc90VarM208092f;
        sc90VarM208092f = this.bitmapPrepareSequences.get(inputProducer);
        if (sc90VarM208092f == null) {
            sc90VarM208092f = this.producerFactory.m208092f(inputProducer);
            this.bitmapPrepareSequences.put(inputProducer, sc90VarM208092f);
        }
        return sc90VarM208092f;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final sc90<jze> m188118x() {
        return (sc90) this.commonNetworkFetchToEncodedMemorySequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final sc90<fa5<da5>> m188119y() {
        return (sc90) this.dataFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final sc90<Void> m188120z(@NotNull ImageRequest imageRequest) {
        imageRequest.getClass();
        sc90<fa5<da5>> sc90VarM188116v = m188116v(imageRequest);
        if (this.useBitmapPrepareToDraw) {
            sc90VarM188116v = m188117w(sc90VarM188116v);
        }
        return m188085A(sc90VarM188116v);
    }

    /* JADX INFO: renamed from: l.td90$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/td90$a;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "", Constants.INAPP_DATA_TAG, "(Lcom/facebook/imagepipeline/request/ImageRequest;)V", "Landroid/net/Uri;", "uri", "", "c", "(Landroid/net/Uri;)Ljava/lang/String;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final String m188123c(Uri uri) {
            String string = uri.toString();
            string.getClass();
            return string.length() > 30 ? string.substring(0, 30).concat("...") : string;
        }

        /* JADX INFO: renamed from: d */
        public final void m188124d(ImageRequest imageRequest) {
            rf80.m179111b(Boolean.valueOf(imageRequest.m8574l().getValue() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()));
        }

        public Companion() {
        }
    }
}
