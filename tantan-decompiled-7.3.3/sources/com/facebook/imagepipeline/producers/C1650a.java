package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.producers.C1650a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Ref;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.a7h0;
import p153l.ab5;
import p153l.anm;
import p153l.c4s;
import p153l.cl90;
import p153l.db5;
import p153l.er2;
import p153l.fb5;
import p153l.gae;
import p153l.gb5;
import p153l.him;
import p153l.huf;
import p153l.i4k0;
import p153l.i9j;
import p153l.ib5;
import p153l.j33;
import p153l.ji2;
import p153l.n0f;
import p153l.phm;
import p153l.ppd;
import p153l.pud;
import p153l.q3d0;
import p153l.qmd0;
import p153l.qvb0;
import p153l.shm;
import p153l.t4b0;
import p153l.u4b0;
import p153l.wk90;
import p153l.wq3;
import p153l.yk90;
import p153l.z06;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\u0018\u0000 J2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0004/\"+$Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020!2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b/\u00107R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00106\u001a\u0004\b8\u00107R\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b+\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b9\u0010FR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b=\u0010I¨\u0006K"}, m88121d2 = {"Lcom/facebook/imagepipeline/producers/a;", "Ll/wk90;", "Ll/fb5;", "Ll/db5;", "Ll/wq3;", "byteArrayPool", "Ljava/util/concurrent/Executor;", "executor", "Ll/shm;", "imageDecoder", "Ll/t4b0;", "progressiveJpegConfig", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "", "downsampleEnabledForNetwork", "decodeCancellationEnabled", "Ll/n0f;", "inputProducer", "", "maxBitmapDimension", "Ll/gb5;", "closeableReferenceFactory", "Ljava/lang/Runnable;", "reclaimMemoryRunnable", "Ll/a7h0;", "recoverFromDecoderOOM", "<init>", "(Ll/wq3;Ljava/util/concurrent/Executor;Ll/shm;Ll/t4b0;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLl/wk90;ILl/gb5;Ljava/lang/Runnable;Ll/a7h0;)V", "Ll/z06;", "consumer", "Ll/yk90;", "context", "", "b", "(Ll/z06;Ll/yk90;)V", "a", "Ll/wq3;", "getByteArrayPool", "()Ll/wq3;", "Ljava/util/concurrent/Executor;", "f", "()Ljava/util/concurrent/Executor;", "c", "Ll/shm;", "g", "()Ll/shm;", Constants.INAPP_DATA_TAG, "Ll/t4b0;", "getProgressiveJpegConfig", "()Ll/t4b0;", "e", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "Z", "()Z", "getDecodeCancellationEnabled", "h", "Ll/wk90;", "getInputProducer", "()Ll/wk90;", RXScreenCaptureService.KEY_INDEX, "I", "getMaxBitmapDimension", "()I", "j", "Ll/gb5;", "()Ll/gb5;", "k", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/a7h0;", "()Ll/a7h0;", "Companion", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C1650a implements wk90<fb5<db5>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final wq3 byteArrayPool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final shm imageDecoder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final t4b0 progressiveJpegConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final DownsampleMode downsampleMode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean downsampleEnabledForNetwork;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean decodeCancellationEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final wk90<n0f> inputProducer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int maxBitmapDimension;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final gb5 closeableReferenceFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final Runnable reclaimMemoryRunnable;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final a7h0<Boolean> recoverFromDecoderOOM;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\r¨\u0006\u001b"}, m88121d2 = {"Lcom/facebook/imagepipeline/producers/a$a;", "", "<init>", "()V", "Ll/n0f;", "encodedImage", "Ll/phm;", "imageDecodeOptions", "", "b", "(Ll/n0f;Ll/phm;)Z", "", "PRODUCER_NAME", "Ljava/lang/String;", "", "DECODE_EXCEPTION_MESSAGE_NUM_HEADER_BYTES", "I", "MAX_BITMAP_SIZE", "EXTRA_BITMAP_SIZE", "EXTRA_HAS_GOOD_QUALITY", "EXTRA_IS_FINAL", "EXTRA_IMAGE_FORMAT_NAME", "EXTRA_BITMAP_BYTES", "ENCODED_IMAGE_SIZE", "REQUESTED_IMAGE_SIZE", "SAMPLE_SIZE", "NON_FATAL_DECODE_ERROR", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m8560b(n0f encodedImage, phm imageDecodeOptions) {
            return (((long) encodedImage.getWidth()) * ((long) encodedImage.getHeight())) * ((long) j33.m143308g(imageDecodeOptions.f152455h)) > 104857600;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$b */
    @Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Lcom/facebook/imagepipeline/producers/a$b;", "Lcom/facebook/imagepipeline/producers/a$d;", "Lcom/facebook/imagepipeline/producers/a;", "Ll/z06;", "Ll/fb5;", "Ll/db5;", "consumer", "Ll/yk90;", "producerContext", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/a;Ll/z06;Ll/yk90;ZI)V", "Ll/n0f;", "encodedImage", NotificationCompat.CATEGORY_STATUS, "H", "(Ll/n0f;I)Z", ResourceDirection.f39656v, "(Ll/n0f;)I", "Ll/qvb0;", BaseSei.f14624X, "()Ll/qvb0;", "qualityInfo", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public final class b extends d {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C1650a f6538k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C1650a c1650a, @NotNull z06<fb5<db5>> z06Var, yk90 yk90Var, boolean z, int i) {
            super(c1650a, z06Var, yk90Var, z, i);
            z06Var.getClass();
            yk90Var.getClass();
            this.f6538k = c1650a;
        }

        @Override // com.facebook.imagepipeline.producers.C1650a.d
        /* JADX INFO: renamed from: H */
        public synchronized boolean mo8561H(@Nullable n0f encodedImage, int status) {
            return ji2.m144948e(status) ? false : super.mo8561H(encodedImage, status);
        }

        @Override // com.facebook.imagepipeline.producers.C1650a.d
        /* JADX INFO: renamed from: v */
        public int mo8562v(@NotNull n0f encodedImage) {
            encodedImage.getClass();
            return encodedImage.m160965M();
        }

        @Override // com.facebook.imagepipeline.producers.C1650a.d
        @NotNull
        /* JADX INFO: renamed from: x */
        public qvb0 mo8563x() {
            qvb0 qvb0VarM99001d = anm.m99001d(0, false, false);
            qvb0VarM99001d.getClass();
            return qvb0VarM99001d;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$c */
    @Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002BC\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m88121d2 = {"Lcom/facebook/imagepipeline/producers/a$c;", "Lcom/facebook/imagepipeline/producers/a$d;", "Lcom/facebook/imagepipeline/producers/a;", "Ll/z06;", "Ll/fb5;", "Ll/db5;", "consumer", "Ll/yk90;", "producerContext", "Ll/u4b0;", "progressiveJpegParser", "Ll/t4b0;", "progressiveJpegConfig", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/a;Ll/z06;Ll/yk90;Ll/u4b0;Ll/t4b0;ZI)V", "Ll/n0f;", "encodedImage", NotificationCompat.CATEGORY_STATUS, "H", "(Ll/n0f;I)Z", ResourceDirection.f39656v, "(Ll/n0f;)I", "k", "Ll/u4b0;", "getProgressiveJpegParser", "()Ll/u4b0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/t4b0;", "getProgressiveJpegConfig", "()Ll/t4b0;", "Ll/qvb0;", BaseSei.f14624X, "()Ll/qvb0;", "qualityInfo", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public final class c extends d {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final u4b0 progressiveJpegParser;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final t4b0 progressiveJpegConfig;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ C1650a f6541m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull C1650a c1650a, @NotNull z06<fb5<db5>> z06Var, @NotNull yk90 yk90Var, @NotNull u4b0 u4b0Var, t4b0 t4b0Var, boolean z, int i) {
            super(c1650a, z06Var, yk90Var, z, i);
            z06Var.getClass();
            yk90Var.getClass();
            u4b0Var.getClass();
            t4b0Var.getClass();
            this.f6541m = c1650a;
            this.progressiveJpegParser = u4b0Var;
            this.progressiveJpegConfig = t4b0Var;
            m8574G(0);
        }

        @Override // com.facebook.imagepipeline.producers.C1650a.d
        /* JADX INFO: renamed from: H */
        public synchronized boolean mo8561H(@Nullable n0f encodedImage, int status) {
            if (encodedImage == null) {
                return false;
            }
            try {
                boolean zMo8561H = super.mo8561H(encodedImage, status);
                if (ji2.m144948e(status) || ji2.m144951m(status, 8)) {
                    if (!ji2.m144951m(status, 4) && n0f.m160957d0(encodedImage) && encodedImage.m160961F() == ppd.JPEG) {
                        if (!this.progressiveJpegParser.m194474g(encodedImage)) {
                            return false;
                        }
                        int iM194471d = this.progressiveJpegParser.m194471d();
                        if (iM194471d <= getLastScheduledScanNumber()) {
                            return false;
                        }
                        if (iM194471d < this.progressiveJpegConfig.mo150723a(getLastScheduledScanNumber()) && !this.progressiveJpegParser.m194472e()) {
                            return false;
                        }
                        m8574G(iM194471d);
                    }
                }
                return zMo8561H;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.facebook.imagepipeline.producers.C1650a.d
        /* JADX INFO: renamed from: v */
        public int mo8562v(@NotNull n0f encodedImage) {
            encodedImage.getClass();
            return this.progressiveJpegParser.m194470c();
        }

        @Override // com.facebook.imagepipeline.producers.C1650a.d
        @NotNull
        /* JADX INFO: renamed from: x */
        public qvb0 mo8563x() {
            qvb0 qvb0VarMo150724b = this.progressiveJpegConfig.mo150724b(this.progressiveJpegParser.m194471d());
            qvb0VarMo150724b.getClass();
            return qvb0VarMo150724b;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$d */
    @Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b¢\u0004\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0002H$¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J'\u0010\u0019\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010'J)\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J)\u0010.\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010/J_\u00109\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000203\u0018\u0001082\b\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020)2\u0006\u00102\u001a\u00020\t2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u000203H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u00020\u00112\b\u0010>\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bA\u0010\u001bJ\u000f\u0010B\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u0002038\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010MR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010&\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020)8$X¤\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006]"}, m88121d2 = {"Lcom/facebook/imagepipeline/producers/a$d;", "Ll/pud;", "Ll/n0f;", "Ll/fb5;", "Ll/db5;", "Ll/z06;", "consumer", "Ll/yk90;", "producerContext", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/a;Ll/z06;Ll/yk90;ZI)V", "newResult", NotificationCompat.CATEGORY_STATUS, "", "E", "(Ll/n0f;I)V", "", "progress", RXScreenCaptureService.KEY_INDEX, "(F)V", "", Constants.KEY_T, "g", "(Ljava/lang/Throwable;)V", "f", "()V", Ref.TYPE, "H", "(Ll/n0f;I)Z", "encodedImage", ResourceDirection.f39656v, "(Ll/n0f;)I", "D", "(Ll/n0f;)V", "lastScheduledScanNumber", "(Ll/n0f;II)V", "length", "Ll/qvb0;", "quality", "B", "(Ll/n0f;ILl/qvb0;)Ll/db5;", "image", "F", "(Ll/n0f;Ll/db5;I)V", "", "queueTime", "isFinal", "", "imageFormatName", "encodedImageSize", "requestImageSize", "sampleSize", "", "u", "(Ll/db5;JLl/qvb0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "shouldFinish", c4s.C_ZONE, "(Z)V", "decodedImage", "A", "(Ll/db5;I)V", BaseSei.f14626Z, BaseSei.f14625Y, "c", "Ll/yk90;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "TAG", "Ll/cl90;", "e", "Ll/cl90;", "producerListener", "Ll/phm;", "Ll/phm;", "imageDecodeOptions", "Z", "isFinished", "Lcom/facebook/imagepipeline/producers/JobScheduler;", "h", "Lcom/facebook/imagepipeline/producers/JobScheduler;", "jobScheduler", "I", "w", "()I", "G", "(I)V", BaseSei.f14624X, "()Ll/qvb0;", "qualityInfo", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public abstract class d extends pud<n0f, fb5<db5>> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final yk90 producerContext;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final String TAG;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final cl90 producerListener;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final phm imageDecodeOptions;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean isFinished;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final JobScheduler jobScheduler;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public int lastScheduledScanNumber;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C1650a f6549j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$d$a */
        @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"com/facebook/imagepipeline/producers/a$d$a", "Ll/er2;", "", "a", "()V", "b", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final class a extends er2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f6551b;

            public a(boolean z) {
                this.f6551b = z;
            }

            @Override // p153l.er2, p153l.zk90
            /* JADX INFO: renamed from: a */
            public void mo8584a() {
                if (d.this.producerContext.mo117665F()) {
                    d.this.jobScheduler.m8531h();
                }
            }

            @Override // p153l.er2, p153l.zk90
            /* JADX INFO: renamed from: b */
            public void mo8551b() {
                if (this.f6551b) {
                    d.this.m8582y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull final C1650a c1650a, @NotNull z06<fb5<db5>> z06Var, yk90 yk90Var, boolean z, final int i) {
            super(z06Var);
            z06Var.getClass();
            yk90Var.getClass();
            this.f6549j = c1650a;
            this.producerContext = yk90Var;
            this.TAG = "ProgressiveDecoder";
            this.producerListener = yk90Var.mo117675n();
            phm phmVarM8625i = yk90Var.mo117678t().m8625i();
            phmVarM8625i.getClass();
            this.imageDecodeOptions = phmVarM8625i;
            this.jobScheduler = new JobScheduler(c1650a.getExecutor(), new JobScheduler.InterfaceC1646d() { // from class: l.uhd
                @Override // com.facebook.imagepipeline.producers.JobScheduler.InterfaceC1646d
                /* JADX INFO: renamed from: a */
                public final void mo8534a(n0f n0fVar, int i2) {
                    C1650a.d.m8564p(this.f179013a, c1650a, i, n0fVar, i2);
                }
            }, phmVarM8625i.f152448a);
            yk90Var.mo117677q(new a(z));
        }

        /* JADX INFO: renamed from: p */
        public static void m8564p(d dVar, C1650a c1650a, int i, n0f n0fVar, int i2) {
            dVar.getClass();
            c1650a.getClass();
            if (n0fVar != null) {
                ImageRequest imageRequestMo117678t = dVar.producerContext.mo117678t();
                dVar.producerContext.mo97949b("image_format", n0fVar.m160961F().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                Uri uriM8639w = imageRequestMo117678t.m8639w();
                n0fVar.m160984q0(uriM8639w != null ? uriM8639w.toString() : null);
                DownsampleMode downsampleModeM8624h = imageRequestMo117678t.m8624h();
                if (downsampleModeM8624h == null) {
                    downsampleModeM8624h = c1650a.getDownsampleMode();
                }
                boolean zM144951m = ji2.m144951m(i2, 16);
                if ((downsampleModeM8624h == DownsampleMode.ALWAYS || (downsampleModeM8624h == DownsampleMode.AUTO && !zM144951m)) && (c1650a.getDownsampleEnabledForNetwork() || !i4k0.m138566o(imageRequestMo117678t.m8639w()))) {
                    qmd0 qmd0VarM8637u = imageRequestMo117678t.m8637u();
                    qmd0VarM8637u.getClass();
                    n0fVar.m160982p0(gae.m129692b(qmd0VarM8637u, imageRequestMo117678t.m8635s(), n0fVar, i));
                }
                if (dVar.producerContext.mo117674m().getExperiments().getDownsampleIfLargeBitmap()) {
                    dVar.m8571D(n0fVar);
                }
                dVar.m8579t(n0fVar, i2, dVar.lastScheduledScanNumber);
            }
        }

        /* JADX INFO: renamed from: A */
        public final void m8568A(db5 decodedImage, int status) {
            fb5<db5> fb5VarM129768b = this.f6549j.getCloseableReferenceFactory().m129768b(decodedImage);
            try {
                m8570C(ji2.m144947d(status));
                m173861o().mo144954b(fb5VarM129768b, status);
            } finally {
                fb5.m124874v(fb5VarM129768b);
            }
        }

        /* JADX INFO: renamed from: B */
        public final db5 m8569B(n0f encodedImage, int length, qvb0 quality) {
            boolean z = this.f6549j.getReclaimMemoryRunnable() != null && this.f6549j.m8558i().get().booleanValue();
            try {
                return this.f6549j.getImageDecoder().mo8431a(encodedImage, length, quality, this.imageDecodeOptions);
            } catch (OutOfMemoryError e) {
                if (!z) {
                    throw e;
                }
                Runnable reclaimMemoryRunnable = this.f6549j.getReclaimMemoryRunnable();
                if (reclaimMemoryRunnable != null) {
                    reclaimMemoryRunnable.run();
                }
                System.gc();
                return this.f6549j.getImageDecoder().mo8431a(encodedImage, length, quality, this.imageDecodeOptions);
            }
        }

        /* JADX INFO: renamed from: C */
        public final void m8570C(boolean shouldFinish) {
            synchronized (this) {
                if (shouldFinish) {
                    if (!this.isFinished) {
                        m173861o().mo144955c(1.0f);
                        this.isFinished = true;
                        Unit unit = Unit.INSTANCE;
                        this.jobScheduler.m8526c();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m8571D(n0f encodedImage) {
            if (encodedImage.m160961F() != ppd.JPEG) {
                return;
            }
            encodedImage.m160982p0(gae.m129693c(encodedImage, j33.m143308g(this.imageDecodeOptions.f152455h), 104857600));
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo8577h(@Nullable n0f newResult, int status) {
            if (!i9j.m139099d()) {
                boolean zM144947d = ji2.m144947d(status);
                if (zM144947d) {
                    if (newResult == null) {
                        boolean zM88377d = Intrinsics.m88377d(this.producerContext.mo117668e("cached_value_found"), Boolean.TRUE);
                        if (!this.producerContext.mo117674m().getExperiments().getCancelDecodeOnCacheMiss() || this.producerContext.mo117667I() == ImageRequest.RequestLevel.FULL_FETCH || zM88377d) {
                            m8583z(new ExceptionWithNoStacktrace("Encoded image is null."));
                            return;
                        }
                    } else if (!newResult.m160971a0()) {
                        m8583z(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (mo8561H(newResult, status)) {
                    boolean zM144951m = ji2.m144951m(status, 4);
                    if (zM144947d || zM144951m || this.producerContext.mo117665F()) {
                        this.jobScheduler.m8531h();
                        return;
                    }
                    return;
                }
                return;
            }
            i9j.m139097a("DecodeProducer#onNewResultImpl");
            try {
                boolean zM144947d2 = ji2.m144947d(status);
                if (zM144947d2) {
                    if (newResult == null) {
                        boolean zM88377d2 = Intrinsics.m88377d(this.producerContext.mo117668e("cached_value_found"), Boolean.TRUE);
                        if (!this.producerContext.mo117674m().getExperiments().getCancelDecodeOnCacheMiss() || this.producerContext.mo117667I() == ImageRequest.RequestLevel.FULL_FETCH || zM88377d2) {
                            m8583z(new ExceptionWithNoStacktrace("Encoded image is null."));
                            return;
                        }
                    } else if (!newResult.m160971a0()) {
                        m8583z(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (mo8561H(newResult, status)) {
                    boolean zM144951m2 = ji2.m144951m(status, 4);
                    if (zM144947d2 || zM144951m2 || this.producerContext.mo117665F()) {
                        this.jobScheduler.m8531h();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } finally {
                i9j.m139098b();
            }
        }

        /* JADX INFO: renamed from: F */
        public final void m8573F(n0f encodedImage, db5 image, int lastScheduledScanNumber) {
            this.producerContext.mo97949b("encoded_width", Integer.valueOf(encodedImage.getWidth()));
            this.producerContext.mo97949b("encoded_height", Integer.valueOf(encodedImage.getHeight()));
            this.producerContext.mo97949b("encoded_size", Integer.valueOf(encodedImage.m160965M()));
            this.producerContext.mo97949b("image_color_space", encodedImage.m160988v());
            if (image instanceof ab5) {
                this.producerContext.mo97949b("bitmap_config", String.valueOf(((ab5) image).mo96697b0().getConfig()));
            }
            if (image != null) {
                image.mo97950d(this.producerContext.getExtras());
            }
            this.producerContext.mo97949b("last_scan_num", Integer.valueOf(lastScheduledScanNumber));
        }

        /* JADX INFO: renamed from: G */
        public final void m8574G(int i) {
            this.lastScheduledScanNumber = i;
        }

        /* JADX INFO: renamed from: H */
        public boolean mo8561H(@Nullable n0f ref, int status) {
            return this.jobScheduler.m8533k(ref, status);
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: f */
        public void mo8575f() {
            m8582y();
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: g */
        public void mo8576g(@NotNull Throwable t) {
            t.getClass();
            m8583z(t);
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: i */
        public void mo8578i(float progress) {
            super.mo8578i(progress * 0.99f);
        }

        /* JADX INFO: renamed from: t */
        public final void m8579t(n0f encodedImage, int status, int lastScheduledScanNumber) {
            db5 db5VarM8569B;
            int i = status;
            if ((encodedImage.m160961F() == ppd.JPEG || !ji2.m144948e(i)) && !this.isFinished && n0f.m160957d0(encodedImage)) {
                if (Intrinsics.m88377d(encodedImage.m160961F(), ppd.GIF) && C1650a.INSTANCE.m8560b(encodedImage, this.imageDecodeOptions)) {
                    IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + encodedImage.getWidth() + ", h = " + encodedImage.getHeight() + ", pixel config = " + this.imageDecodeOptions.f152455h + ", max bitmap size = 104857600");
                    this.producerListener.mo110447i(this.producerContext, "DecodeProducer", illegalStateException, null);
                    m8583z(illegalStateException);
                    return;
                }
                him himVarM160961F = encodedImage.m160961F();
                himVarM160961F.getClass();
                String str = himVarM160961F.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String();
                String str2 = "unknown";
                String str3 = str == null ? "unknown" : str;
                String str4 = encodedImage.getWidth() + BaseSei.f14624X + encodedImage.getHeight();
                String strValueOf = String.valueOf(encodedImage.m160964J());
                boolean zM144947d = ji2.m144947d(i);
                boolean z = zM144947d && !ji2.m144951m(i, 8);
                boolean zM144951m = ji2.m144951m(i, 4);
                q3d0 q3d0VarM8635s = this.producerContext.mo117678t().m8635s();
                if (q3d0VarM8635s != null) {
                    str2 = q3d0VarM8635s.width + BaseSei.f14624X + q3d0VarM8635s.height;
                }
                try {
                    long jM8529f = this.jobScheduler.m8529f();
                    String string = this.producerContext.mo117678t().m8639w().toString();
                    string.getClass();
                    int iM160965M = (z || zM144951m) ? encodedImage.m160965M() : mo8562v(encodedImage);
                    qvb0 qvb0VarMo8563x = (z || zM144951m) ? anm.f72363d : mo8563x();
                    this.producerListener.mo110444d(this.producerContext, "DecodeProducer");
                    try {
                        qvb0VarMo8563x.getClass();
                        db5VarM8569B = m8569B(encodedImage, iM160965M, qvb0VarMo8563x);
                        try {
                            if (encodedImage.m160964J() != 1) {
                                i |= 16;
                            }
                            this.producerListener.mo110446f(this.producerContext, "DecodeProducer", m8580u(db5VarM8569B, jM8529f, qvb0VarMo8563x, zM144947d, str3, str4, str2, strValueOf));
                            m8573F(encodedImage, db5VarM8569B, lastScheduledScanNumber);
                            m8568A(db5VarM8569B, i);
                        } catch (Exception e) {
                            e = e;
                            qvb0VarMo8563x = qvb0VarMo8563x;
                            str2 = str2;
                            jM8529f = jM8529f;
                            qvb0VarMo8563x.getClass();
                            this.producerListener.mo110447i(this.producerContext, "DecodeProducer", e, m8580u(db5VarM8569B, jM8529f, qvb0VarMo8563x, zM144947d, str3, str4, str2, strValueOf));
                            m8583z(e);
                        }
                    } catch (DecodeException e2) {
                        try {
                            n0f encodedImage2 = e2.getEncodedImage();
                            huf.m137198z(this.TAG, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e2.getMessage(), string, encodedImage2.m160960B(10), Integer.valueOf(encodedImage2.m160965M()));
                            throw e2;
                        } catch (Exception e3) {
                            e = e3;
                            db5VarM8569B = null;
                            qvb0VarMo8563x.getClass();
                            this.producerListener.mo110447i(this.producerContext, "DecodeProducer", e, m8580u(db5VarM8569B, jM8529f, qvb0VarMo8563x, zM144947d, str3, str4, str2, strValueOf));
                            m8583z(e);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        db5VarM8569B = null;
                        qvb0VarMo8563x.getClass();
                        this.producerListener.mo110447i(this.producerContext, "DecodeProducer", e, m8580u(db5VarM8569B, jM8529f, qvb0VarMo8563x, zM144947d, str3, str4, str2, strValueOf));
                        m8583z(e);
                    }
                } finally {
                    n0f.m160959n(encodedImage);
                }
            }
        }

        /* JADX INFO: renamed from: u */
        public final Map<String, String> m8580u(db5 image, long queueTime, qvb0 quality, boolean isFinal, String imageFormatName, String encodedImageSize, String requestImageSize, String sampleSize) {
            Map<String, Object> extras;
            Object obj;
            String string = null;
            if (!this.producerListener.mo110449k(this.producerContext, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(queueTime);
            String strValueOf2 = String.valueOf(quality.mo99003b());
            String strValueOf3 = String.valueOf(isFinal);
            if (image != null && (extras = image.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            if (!(image instanceof ib5)) {
                String str = string;
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", encodedImageSize);
                map.put("imageFormat", imageFormatName);
                map.put("requestedImageSize", requestImageSize);
                map.put("sampleSize", sampleSize);
                if (str != null) {
                    map.put("non_fatal_decode_error", str);
                }
                return ImmutableMap.copyOf((Map) map);
            }
            Bitmap bitmapMo96697b0 = ((ib5) image).mo96697b0();
            bitmapMo96697b0.getClass();
            String str2 = string;
            String str3 = bitmapMo96697b0.getWidth() + BaseSei.f14624X + bitmapMo96697b0.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str3);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", encodedImageSize);
            map2.put("imageFormat", imageFormatName);
            map2.put("requestedImageSize", requestImageSize);
            map2.put("sampleSize", sampleSize);
            int byteCount = bitmapMo96697b0.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            map2.put("byteCount", sb.toString());
            if (str2 != null) {
                map2.put("non_fatal_decode_error", str2);
            }
            return ImmutableMap.copyOf((Map) map2);
        }

        /* JADX INFO: renamed from: v */
        public abstract int mo8562v(@NotNull n0f encodedImage);

        /* JADX INFO: renamed from: w, reason: from getter */
        public final int getLastScheduledScanNumber() {
            return this.lastScheduledScanNumber;
        }

        @NotNull
        /* JADX INFO: renamed from: x */
        public abstract qvb0 mo8563x();

        /* JADX INFO: renamed from: y */
        public final void m8582y() {
            m8570C(true);
            m173861o().mo144953a();
        }

        /* JADX INFO: renamed from: z */
        public final void m8583z(Throwable t) {
            m8570C(true);
            m173861o().onFailure(t);
        }
    }

    public C1650a(@NotNull wq3 wq3Var, @NotNull Executor executor, @NotNull shm shmVar, @NotNull t4b0 t4b0Var, @NotNull DownsampleMode downsampleMode, boolean z, boolean z2, @NotNull wk90<n0f> wk90Var, int i, @NotNull gb5 gb5Var, @Nullable Runnable runnable, @NotNull a7h0<Boolean> a7h0Var) {
        wq3Var.getClass();
        executor.getClass();
        shmVar.getClass();
        t4b0Var.getClass();
        downsampleMode.getClass();
        wk90Var.getClass();
        gb5Var.getClass();
        a7h0Var.getClass();
        this.byteArrayPool = wq3Var;
        this.executor = executor;
        this.imageDecoder = shmVar;
        this.progressiveJpegConfig = t4b0Var;
        this.downsampleMode = downsampleMode;
        this.downsampleEnabledForNetwork = z;
        this.decodeCancellationEnabled = z2;
        this.inputProducer = wk90Var;
        this.maxBitmapDimension = i;
        this.closeableReferenceFactory = gb5Var;
        this.reclaimMemoryRunnable = runnable;
        this.recoverFromDecoderOOM = a7h0Var;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(@NotNull z06<fb5<db5>> consumer, @NotNull yk90 context) {
        C1650a c1650a;
        yk90 yk90Var;
        z06<n0f> cVar;
        consumer.getClass();
        context.getClass();
        if (i9j.m139099d()) {
            i9j.m139097a("DecodeProducer#produceResults");
            try {
                ImageRequest imageRequestMo117678t = context.mo117678t();
                this.inputProducer.mo8539b((i4k0.m138566o(imageRequestMo117678t.m8639w()) || ImageRequestBuilder.m8644s(imageRequestMo117678t.m8639w())) ? new c(this, consumer, context, new u4b0(this.byteArrayPool), this.progressiveJpegConfig, this.decodeCancellationEnabled, this.maxBitmapDimension) : new b(this, consumer, context, this.decodeCancellationEnabled, this.maxBitmapDimension), context);
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                i9j.m139098b();
            }
        }
        ImageRequest imageRequestMo117678t2 = context.mo117678t();
        if (i4k0.m138566o(imageRequestMo117678t2.m8639w()) || ImageRequestBuilder.m8644s(imageRequestMo117678t2.m8639w())) {
            c1650a = this;
            yk90Var = context;
            cVar = new c(c1650a, consumer, yk90Var, new u4b0(c1650a.byteArrayPool), c1650a.progressiveJpegConfig, c1650a.decodeCancellationEnabled, c1650a.maxBitmapDimension);
        } else {
            cVar = new b(this, consumer, context, this.decodeCancellationEnabled, this.maxBitmapDimension);
            c1650a = this;
            yk90Var = context;
        }
        c1650a.inputProducer.mo8539b(cVar, yk90Var);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final gb5 getCloseableReferenceFactory() {
        return this.closeableReferenceFactory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDownsampleEnabledForNetwork() {
        return this.downsampleEnabledForNetwork;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final DownsampleMode getDownsampleMode() {
        return this.downsampleMode;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final shm getImageDecoder() {
        return this.imageDecoder;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Runnable getReclaimMemoryRunnable() {
        return this.reclaimMemoryRunnable;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final a7h0<Boolean> m8558i() {
        return this.recoverFromDecoderOOM;
    }
}
