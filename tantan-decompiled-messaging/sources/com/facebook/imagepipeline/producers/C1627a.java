package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.producers.C1627a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Ref;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p149l.aa5;
import p149l.b2s;
import p149l.btd;
import p149l.c9e;
import p149l.cfm;
import p149l.ci2;
import p149l.da5;
import p149l.egm;
import p149l.fa5;
import p149l.fvj0;
import p149l.ga5;
import p149l.ia5;
import p149l.jze;
import p149l.kod;
import p149l.mnb0;
import p149l.nq2;
import p149l.nvc0;
import p149l.o6j;
import p149l.oed0;
import p149l.pwa0;
import p149l.qwa0;
import p149l.sc90;
import p149l.syg0;
import p149l.t23;
import p149l.tsf;
import p149l.uc90;
import p149l.uz5;
import p149l.wp3;
import p149l.yc90;
import p149l.ykm;
import p149l.zem;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\u0018\u0000 J2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0004/\"+$Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020!2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b/\u00107R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00106\u001a\u0004\b8\u00107R\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b+\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b9\u0010FR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b=\u0010I¨\u0006K"}, m87232d2 = {"Lcom/facebook/imagepipeline/producers/a;", "Ll/sc90;", "Ll/fa5;", "Ll/da5;", "Ll/wp3;", "byteArrayPool", "Ljava/util/concurrent/Executor;", "executor", "Ll/cfm;", "imageDecoder", "Ll/pwa0;", "progressiveJpegConfig", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "", "downsampleEnabledForNetwork", "decodeCancellationEnabled", "Ll/jze;", "inputProducer", "", "maxBitmapDimension", "Ll/ga5;", "closeableReferenceFactory", "Ljava/lang/Runnable;", "reclaimMemoryRunnable", "Ll/syg0;", "recoverFromDecoderOOM", "<init>", "(Ll/wp3;Ljava/util/concurrent/Executor;Ll/cfm;Ll/pwa0;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLl/sc90;ILl/ga5;Ljava/lang/Runnable;Ll/syg0;)V", "Ll/uz5;", "consumer", "Ll/uc90;", "context", "", "b", "(Ll/uz5;Ll/uc90;)V", "a", "Ll/wp3;", "getByteArrayPool", "()Ll/wp3;", "Ljava/util/concurrent/Executor;", "f", "()Ljava/util/concurrent/Executor;", "c", "Ll/cfm;", "g", "()Ll/cfm;", Constants.INAPP_DATA_TAG, "Ll/pwa0;", "getProgressiveJpegConfig", "()Ll/pwa0;", "e", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "Z", "()Z", "getDecodeCancellationEnabled", "h", "Ll/sc90;", "getInputProducer", "()Ll/sc90;", RXScreenCaptureService.KEY_INDEX, "I", "getMaxBitmapDimension", "()I", "j", "Ll/ga5;", "()Ll/ga5;", "k", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/syg0;", "()Ll/syg0;", "Companion", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C1627a implements sc90<fa5<da5>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final wp3 byteArrayPool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final cfm imageDecoder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final pwa0 progressiveJpegConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final DownsampleMode downsampleMode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean downsampleEnabledForNetwork;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean decodeCancellationEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final sc90<jze> inputProducer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int maxBitmapDimension;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final ga5 closeableReferenceFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final Runnable reclaimMemoryRunnable;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final syg0<Boolean> recoverFromDecoderOOM;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\r¨\u0006\u001b"}, m87232d2 = {"Lcom/facebook/imagepipeline/producers/a$a;", "", "<init>", "()V", "Ll/jze;", "encodedImage", "Ll/zem;", "imageDecodeOptions", "", "b", "(Ll/jze;Ll/zem;)Z", "", "PRODUCER_NAME", "Ljava/lang/String;", "", "DECODE_EXCEPTION_MESSAGE_NUM_HEADER_BYTES", "I", "MAX_BITMAP_SIZE", "EXTRA_BITMAP_SIZE", "EXTRA_HAS_GOOD_QUALITY", "EXTRA_IS_FINAL", "EXTRA_IMAGE_FORMAT_NAME", "EXTRA_BITMAP_BYTES", "ENCODED_IMAGE_SIZE", "REQUESTED_IMAGE_SIZE", "SAMPLE_SIZE", "NON_FATAL_DECODE_ERROR", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m8506b(jze encodedImage, zem imageDecodeOptions) {
            return (((long) encodedImage.getWidth()) * ((long) encodedImage.getHeight())) * ((long) t23.m186958g(imageDecodeOptions.f202845h)) > 104857600;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$b */
    @Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Lcom/facebook/imagepipeline/producers/a$b;", "Lcom/facebook/imagepipeline/producers/a$d;", "Lcom/facebook/imagepipeline/producers/a;", "Ll/uz5;", "Ll/fa5;", "Ll/da5;", "consumer", "Ll/uc90;", "producerContext", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/a;Ll/uz5;Ll/uc90;ZI)V", "Ll/jze;", "encodedImage", NotificationCompat.CATEGORY_STATUS, "H", "(Ll/jze;I)Z", ResourceDirection.f38808v, "(Ll/jze;)I", "Ll/mnb0;", BaseSei.f13930X, "()Ll/mnb0;", "qualityInfo", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public final class b extends d {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C1627a f6501k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C1627a c1627a, @NotNull uz5<fa5<da5>> uz5Var, uc90 uc90Var, boolean z, int i) {
            super(c1627a, uz5Var, uc90Var, z, i);
            uz5Var.getClass();
            uc90Var.getClass();
            this.f6501k = c1627a;
        }

        @Override // com.facebook.imagepipeline.producers.C1627a.d
        /* JADX INFO: renamed from: H */
        public synchronized boolean mo8507H(@Nullable jze encodedImage, int status) {
            return ci2.m107029e(status) ? false : super.mo8507H(encodedImage, status);
        }

        @Override // com.facebook.imagepipeline.producers.C1627a.d
        /* JADX INFO: renamed from: v */
        public int mo8508v(@NotNull jze encodedImage) {
            encodedImage.getClass();
            return encodedImage.m143902M();
        }

        @Override // com.facebook.imagepipeline.producers.C1627a.d
        @NotNull
        /* JADX INFO: renamed from: x */
        public mnb0 mo8509x() {
            mnb0 mnb0VarM215143d = ykm.m215143d(0, false, false);
            mnb0VarM215143d.getClass();
            return mnb0VarM215143d;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$c */
    @Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002BC\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m87232d2 = {"Lcom/facebook/imagepipeline/producers/a$c;", "Lcom/facebook/imagepipeline/producers/a$d;", "Lcom/facebook/imagepipeline/producers/a;", "Ll/uz5;", "Ll/fa5;", "Ll/da5;", "consumer", "Ll/uc90;", "producerContext", "Ll/qwa0;", "progressiveJpegParser", "Ll/pwa0;", "progressiveJpegConfig", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/a;Ll/uz5;Ll/uc90;Ll/qwa0;Ll/pwa0;ZI)V", "Ll/jze;", "encodedImage", NotificationCompat.CATEGORY_STATUS, "H", "(Ll/jze;I)Z", ResourceDirection.f38808v, "(Ll/jze;)I", "k", "Ll/qwa0;", "getProgressiveJpegParser", "()Ll/qwa0;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/pwa0;", "getProgressiveJpegConfig", "()Ll/pwa0;", "Ll/mnb0;", BaseSei.f13930X, "()Ll/mnb0;", "qualityInfo", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public final class c extends d {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final qwa0 progressiveJpegParser;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final pwa0 progressiveJpegConfig;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ C1627a f6504m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull C1627a c1627a, @NotNull uz5<fa5<da5>> uz5Var, @NotNull uc90 uc90Var, @NotNull qwa0 qwa0Var, pwa0 pwa0Var, boolean z, int i) {
            super(c1627a, uz5Var, uc90Var, z, i);
            uz5Var.getClass();
            uc90Var.getClass();
            qwa0Var.getClass();
            pwa0Var.getClass();
            this.f6504m = c1627a;
            this.progressiveJpegParser = qwa0Var;
            this.progressiveJpegConfig = pwa0Var;
            m8520G(0);
        }

        @Override // com.facebook.imagepipeline.producers.C1627a.d
        /* JADX INFO: renamed from: H */
        public synchronized boolean mo8507H(@Nullable jze encodedImage, int status) {
            if (encodedImage == null) {
                return false;
            }
            try {
                boolean zMo8507H = super.mo8507H(encodedImage, status);
                if (ci2.m107029e(status) || ci2.m107032m(status, 8)) {
                    if (!ci2.m107032m(status, 4) && jze.m143894c0(encodedImage) && encodedImage.m143898F() == kod.JPEG) {
                        if (!this.progressiveJpegParser.m176784g(encodedImage)) {
                            return false;
                        }
                        int iM176781d = this.progressiveJpegParser.m176781d();
                        if (iM176781d <= getLastScheduledScanNumber()) {
                            return false;
                        }
                        if (iM176781d < this.progressiveJpegConfig.mo106862a(getLastScheduledScanNumber()) && !this.progressiveJpegParser.m176782e()) {
                            return false;
                        }
                        m8520G(iM176781d);
                    }
                }
                return zMo8507H;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.facebook.imagepipeline.producers.C1627a.d
        /* JADX INFO: renamed from: v */
        public int mo8508v(@NotNull jze encodedImage) {
            encodedImage.getClass();
            return this.progressiveJpegParser.m176780c();
        }

        @Override // com.facebook.imagepipeline.producers.C1627a.d
        @NotNull
        /* JADX INFO: renamed from: x */
        public mnb0 mo8509x() {
            mnb0 mnb0VarMo106863b = this.progressiveJpegConfig.mo106863b(this.progressiveJpegParser.m176781d());
            mnb0VarMo106863b.getClass();
            return mnb0VarMo106863b;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$d */
    @Metadata(m87231d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b¢\u0004\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0002H$¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J'\u0010\u0019\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010'J)\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J)\u0010.\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010/J_\u00109\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000203\u0018\u0001082\b\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020)2\u0006\u00102\u001a\u00020\t2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u000203H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u00020\u00112\b\u0010>\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bA\u0010\u001bJ\u000f\u0010B\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u0002038\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010MR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010&\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020)8$X¤\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006]"}, m87232d2 = {"Lcom/facebook/imagepipeline/producers/a$d;", "Ll/btd;", "Ll/jze;", "Ll/fa5;", "Ll/da5;", "Ll/uz5;", "consumer", "Ll/uc90;", "producerContext", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/a;Ll/uz5;Ll/uc90;ZI)V", "newResult", NotificationCompat.CATEGORY_STATUS, "", "E", "(Ll/jze;I)V", "", "progress", RXScreenCaptureService.KEY_INDEX, "(F)V", "", Constants.KEY_T, "g", "(Ljava/lang/Throwable;)V", "f", "()V", Ref.TYPE, "H", "(Ll/jze;I)Z", "encodedImage", ResourceDirection.f38808v, "(Ll/jze;)I", "D", "(Ll/jze;)V", "lastScheduledScanNumber", "(Ll/jze;II)V", "length", "Ll/mnb0;", "quality", "B", "(Ll/jze;ILl/mnb0;)Ll/da5;", "image", "F", "(Ll/jze;Ll/da5;I)V", "", "queueTime", "isFinal", "", "imageFormatName", "encodedImageSize", "requestImageSize", "sampleSize", "", "u", "(Ll/da5;JLl/mnb0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "shouldFinish", b2s.C_ZONE, "(Z)V", "decodedImage", "A", "(Ll/da5;I)V", BaseSei.f13932Z, BaseSei.f13931Y, "c", "Ll/uc90;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "TAG", "Ll/yc90;", "e", "Ll/yc90;", "producerListener", "Ll/zem;", "Ll/zem;", "imageDecodeOptions", "Z", "isFinished", "Lcom/facebook/imagepipeline/producers/JobScheduler;", "h", "Lcom/facebook/imagepipeline/producers/JobScheduler;", "jobScheduler", "I", "w", "()I", "G", "(I)V", BaseSei.f13930X, "()Ll/mnb0;", "qualityInfo", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public abstract class d extends btd<jze, fa5<da5>> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final uc90 producerContext;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final String TAG;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final yc90 producerListener;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final zem imageDecodeOptions;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean isFinished;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final JobScheduler jobScheduler;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public int lastScheduledScanNumber;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C1627a f6512j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$d$a */
        @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"com/facebook/imagepipeline/producers/a$d$a", "Ll/nq2;", "", "a", "()V", "b", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class a extends nq2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f6514b;

            public a(boolean z) {
                this.f6514b = z;
            }

            @Override // p149l.nq2, p149l.vc90
            /* JADX INFO: renamed from: a */
            public void mo8530a() {
                if (d.this.producerContext.mo155858F()) {
                    d.this.jobScheduler.m8477h();
                }
            }

            @Override // p149l.nq2, p149l.vc90
            /* JADX INFO: renamed from: b */
            public void mo8497b() {
                if (this.f6514b) {
                    d.this.m8528y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull final C1627a c1627a, @NotNull uz5<fa5<da5>> uz5Var, uc90 uc90Var, boolean z, final int i) {
            super(uz5Var);
            uz5Var.getClass();
            uc90Var.getClass();
            this.f6512j = c1627a;
            this.producerContext = uc90Var;
            this.TAG = "ProgressiveDecoder";
            this.producerListener = uc90Var.mo155870n();
            zem zemVarM8571i = uc90Var.mo155873t().m8571i();
            zemVarM8571i.getClass();
            this.imageDecodeOptions = zemVarM8571i;
            this.jobScheduler = new JobScheduler(c1627a.getExecutor(), new JobScheduler.InterfaceC1623d() { // from class: l.ogd
                @Override // com.facebook.imagepipeline.producers.JobScheduler.InterfaceC1623d
                /* JADX INFO: renamed from: a */
                public final void mo8480a(jze jzeVar, int i2) {
                    C1627a.d.m8510p(this.f143853a, c1627a, i, jzeVar, i2);
                }
            }, zemVarM8571i.f202838a);
            uc90Var.mo155872q(new a(z));
        }

        /* JADX INFO: renamed from: p */
        public static void m8510p(d dVar, C1627a c1627a, int i, jze jzeVar, int i2) {
            dVar.getClass();
            c1627a.getClass();
            if (jzeVar != null) {
                ImageRequest imageRequestMo155873t = dVar.producerContext.mo155873t();
                dVar.producerContext.mo155861b("image_format", jzeVar.m143898F().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                Uri uriM8585w = imageRequestMo155873t.m8585w();
                jzeVar.m143920p0(uriM8585w != null ? uriM8585w.toString() : null);
                DownsampleMode downsampleModeM8570h = imageRequestMo155873t.m8570h();
                if (downsampleModeM8570h == null) {
                    downsampleModeM8570h = c1627a.getDownsampleMode();
                }
                boolean zM107032m = ci2.m107032m(i2, 16);
                if ((downsampleModeM8570h == DownsampleMode.ALWAYS || (downsampleModeM8570h == DownsampleMode.AUTO && !zM107032m)) && (c1627a.getDownsampleEnabledForNetwork() || !fvj0.m123320o(imageRequestMo155873t.m8585w()))) {
                    oed0 oed0VarM8583u = imageRequestMo155873t.m8583u();
                    oed0VarM8583u.getClass();
                    jzeVar.m143919o0(c9e.m105845b(oed0VarM8583u, imageRequestMo155873t.m8581s(), jzeVar, i));
                }
                if (dVar.producerContext.mo155869m().getExperiments().getDownsampleIfLargeBitmap()) {
                    dVar.m8517D(jzeVar);
                }
                dVar.m8525t(jzeVar, i2, dVar.lastScheduledScanNumber);
            }
        }

        /* JADX INFO: renamed from: A */
        public final void m8514A(da5 decodedImage, int status) {
            fa5<da5> fa5VarM124922b = this.f6512j.getCloseableReferenceFactory().m124922b(decodedImage);
            try {
                m8516C(ci2.m107028d(status));
                m103812o().mo107035b(fa5VarM124922b, status);
            } finally {
                fa5.m120154v(fa5VarM124922b);
            }
        }

        /* JADX INFO: renamed from: B */
        public final da5 m8515B(jze encodedImage, int length, mnb0 quality) {
            boolean z = this.f6512j.getReclaimMemoryRunnable() != null && this.f6512j.m8504i().get().booleanValue();
            try {
                return this.f6512j.getImageDecoder().mo8377a(encodedImage, length, quality, this.imageDecodeOptions);
            } catch (OutOfMemoryError e) {
                if (!z) {
                    throw e;
                }
                Runnable reclaimMemoryRunnable = this.f6512j.getReclaimMemoryRunnable();
                if (reclaimMemoryRunnable != null) {
                    reclaimMemoryRunnable.run();
                }
                System.gc();
                return this.f6512j.getImageDecoder().mo8377a(encodedImage, length, quality, this.imageDecodeOptions);
            }
        }

        /* JADX INFO: renamed from: C */
        public final void m8516C(boolean shouldFinish) {
            synchronized (this) {
                if (shouldFinish) {
                    if (!this.isFinished) {
                        m103812o().mo107036c(1.0f);
                        this.isFinished = true;
                        Unit unit = Unit.INSTANCE;
                        this.jobScheduler.m8472c();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m8517D(jze encodedImage) {
            if (encodedImage.m143898F() != kod.JPEG) {
                return;
            }
            encodedImage.m143919o0(c9e.m105846c(encodedImage, t23.m186958g(this.imageDecodeOptions.f202845h), 104857600));
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo8523h(@Nullable jze newResult, int status) {
            if (!o6j.m162852d()) {
                boolean zM107028d = ci2.m107028d(status);
                if (zM107028d) {
                    if (newResult == null) {
                        boolean zM87488d = Intrinsics.m87488d(this.producerContext.mo155863e("cached_value_found"), Boolean.TRUE);
                        if (!this.producerContext.mo155869m().getExperiments().getCancelDecodeOnCacheMiss() || this.producerContext.mo155860I() == ImageRequest.RequestLevel.FULL_FETCH || zM87488d) {
                            m8529z(new ExceptionWithNoStacktrace("Encoded image is null."));
                            return;
                        }
                    } else if (!newResult.m143908Z()) {
                        m8529z(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (mo8507H(newResult, status)) {
                    boolean zM107032m = ci2.m107032m(status, 4);
                    if (zM107028d || zM107032m || this.producerContext.mo155858F()) {
                        this.jobScheduler.m8477h();
                        return;
                    }
                    return;
                }
                return;
            }
            o6j.m162850a("DecodeProducer#onNewResultImpl");
            try {
                boolean zM107028d2 = ci2.m107028d(status);
                if (zM107028d2) {
                    if (newResult == null) {
                        boolean zM87488d2 = Intrinsics.m87488d(this.producerContext.mo155863e("cached_value_found"), Boolean.TRUE);
                        if (!this.producerContext.mo155869m().getExperiments().getCancelDecodeOnCacheMiss() || this.producerContext.mo155860I() == ImageRequest.RequestLevel.FULL_FETCH || zM87488d2) {
                            m8529z(new ExceptionWithNoStacktrace("Encoded image is null."));
                            return;
                        }
                    } else if (!newResult.m143908Z()) {
                        m8529z(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (mo8507H(newResult, status)) {
                    boolean zM107032m2 = ci2.m107032m(status, 4);
                    if (zM107028d2 || zM107032m2 || this.producerContext.mo155858F()) {
                        this.jobScheduler.m8477h();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } finally {
                o6j.m162851b();
            }
        }

        /* JADX INFO: renamed from: F */
        public final void m8519F(jze encodedImage, da5 image, int lastScheduledScanNumber) {
            this.producerContext.mo155861b("encoded_width", Integer.valueOf(encodedImage.getWidth()));
            this.producerContext.mo155861b("encoded_height", Integer.valueOf(encodedImage.getHeight()));
            this.producerContext.mo155861b("encoded_size", Integer.valueOf(encodedImage.m143902M()));
            this.producerContext.mo155861b("image_color_space", encodedImage.m143925v());
            if (image instanceof aa5) {
                this.producerContext.mo155861b("bitmap_config", String.valueOf(((aa5) image).mo95529a0().getConfig()));
            }
            if (image != null) {
                image.mo155862d(this.producerContext.getExtras());
            }
            this.producerContext.mo155861b("last_scan_num", Integer.valueOf(lastScheduledScanNumber));
        }

        /* JADX INFO: renamed from: G */
        public final void m8520G(int i) {
            this.lastScheduledScanNumber = i;
        }

        /* JADX INFO: renamed from: H */
        public boolean mo8507H(@Nullable jze ref, int status) {
            return this.jobScheduler.m8479k(ref, status);
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: f */
        public void mo8521f() {
            m8528y();
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: g */
        public void mo8522g(@NotNull Throwable t) {
            t.getClass();
            m8529z(t);
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: i */
        public void mo8524i(float progress) {
            super.mo8524i(progress * 0.99f);
        }

        /* JADX INFO: renamed from: t */
        public final void m8525t(jze encodedImage, int status, int lastScheduledScanNumber) {
            da5 da5VarM8515B;
            int i = status;
            if ((encodedImage.m143898F() == kod.JPEG || !ci2.m107029e(i)) && !this.isFinished && jze.m143894c0(encodedImage)) {
                if (Intrinsics.m87488d(encodedImage.m143898F(), kod.GIF) && C1627a.INSTANCE.m8506b(encodedImage, this.imageDecodeOptions)) {
                    IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + encodedImage.getWidth() + ", h = " + encodedImage.getHeight() + ", pixel config = " + this.imageDecodeOptions.f202845h + ", max bitmap size = 104857600");
                    this.producerListener.mo104757i(this.producerContext, "DecodeProducer", illegalStateException, null);
                    m8529z(illegalStateException);
                    return;
                }
                egm egmVarM143898F = encodedImage.m143898F();
                egmVarM143898F.getClass();
                String str = egmVarM143898F.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String();
                String str2 = "unknown";
                String str3 = str == null ? "unknown" : str;
                String str4 = encodedImage.getWidth() + BaseSei.f13930X + encodedImage.getHeight();
                String strValueOf = String.valueOf(encodedImage.m143901J());
                boolean zM107028d = ci2.m107028d(i);
                boolean z = zM107028d && !ci2.m107032m(i, 8);
                boolean zM107032m = ci2.m107032m(i, 4);
                nvc0 nvc0VarM8581s = this.producerContext.mo155873t().m8581s();
                if (nvc0VarM8581s != null) {
                    str2 = nvc0VarM8581s.width + BaseSei.f13930X + nvc0VarM8581s.height;
                }
                try {
                    long jM8475f = this.jobScheduler.m8475f();
                    String string = this.producerContext.mo155873t().m8585w().toString();
                    string.getClass();
                    int iM143902M = (z || zM107032m) ? encodedImage.m143902M() : mo8508v(encodedImage);
                    mnb0 mnb0VarMo8509x = (z || zM107032m) ? ykm.f198776d : mo8509x();
                    this.producerListener.mo104754d(this.producerContext, "DecodeProducer");
                    try {
                        mnb0VarMo8509x.getClass();
                        da5VarM8515B = m8515B(encodedImage, iM143902M, mnb0VarMo8509x);
                        try {
                            if (encodedImage.m143901J() != 1) {
                                i |= 16;
                            }
                            this.producerListener.mo104756f(this.producerContext, "DecodeProducer", m8526u(da5VarM8515B, jM8475f, mnb0VarMo8509x, zM107028d, str3, str4, str2, strValueOf));
                            m8519F(encodedImage, da5VarM8515B, lastScheduledScanNumber);
                            m8514A(da5VarM8515B, i);
                        } catch (Exception e) {
                            e = e;
                            mnb0VarMo8509x = mnb0VarMo8509x;
                            str2 = str2;
                            jM8475f = jM8475f;
                            mnb0VarMo8509x.getClass();
                            this.producerListener.mo104757i(this.producerContext, "DecodeProducer", e, m8526u(da5VarM8515B, jM8475f, mnb0VarMo8509x, zM107028d, str3, str4, str2, strValueOf));
                            m8529z(e);
                        }
                    } catch (DecodeException e2) {
                        try {
                            jze encodedImage2 = e2.getEncodedImage();
                            tsf.m190560z(this.TAG, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e2.getMessage(), string, encodedImage2.m143897B(10), Integer.valueOf(encodedImage2.m143902M()));
                            throw e2;
                        } catch (Exception e3) {
                            e = e3;
                            da5VarM8515B = null;
                            mnb0VarMo8509x.getClass();
                            this.producerListener.mo104757i(this.producerContext, "DecodeProducer", e, m8526u(da5VarM8515B, jM8475f, mnb0VarMo8509x, zM107028d, str3, str4, str2, strValueOf));
                            m8529z(e);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        da5VarM8515B = null;
                        mnb0VarMo8509x.getClass();
                        this.producerListener.mo104757i(this.producerContext, "DecodeProducer", e, m8526u(da5VarM8515B, jM8475f, mnb0VarMo8509x, zM107028d, str3, str4, str2, strValueOf));
                        m8529z(e);
                    }
                } finally {
                    jze.m143896n(encodedImage);
                }
            }
        }

        /* JADX INFO: renamed from: u */
        public final Map<String, String> m8526u(da5 image, long queueTime, mnb0 quality, boolean isFinal, String imageFormatName, String encodedImageSize, String requestImageSize, String sampleSize) {
            Map<String, Object> extras;
            Object obj;
            String string = null;
            if (!this.producerListener.mo104759k(this.producerContext, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(queueTime);
            String strValueOf2 = String.valueOf(quality.mo155504b());
            String strValueOf3 = String.valueOf(isFinal);
            if (image != null && (extras = image.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            if (!(image instanceof ia5)) {
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
            Bitmap bitmapMo95529a0 = ((ia5) image).mo95529a0();
            bitmapMo95529a0.getClass();
            String str2 = string;
            String str3 = bitmapMo95529a0.getWidth() + BaseSei.f13930X + bitmapMo95529a0.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str3);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", encodedImageSize);
            map2.put("imageFormat", imageFormatName);
            map2.put("requestedImageSize", requestImageSize);
            map2.put("sampleSize", sampleSize);
            int byteCount = bitmapMo95529a0.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            map2.put("byteCount", sb.toString());
            if (str2 != null) {
                map2.put("non_fatal_decode_error", str2);
            }
            return ImmutableMap.copyOf((Map) map2);
        }

        /* JADX INFO: renamed from: v */
        public abstract int mo8508v(@NotNull jze encodedImage);

        /* JADX INFO: renamed from: w, reason: from getter */
        public final int getLastScheduledScanNumber() {
            return this.lastScheduledScanNumber;
        }

        @NotNull
        /* JADX INFO: renamed from: x */
        public abstract mnb0 mo8509x();

        /* JADX INFO: renamed from: y */
        public final void m8528y() {
            m8516C(true);
            m103812o().mo107034a();
        }

        /* JADX INFO: renamed from: z */
        public final void m8529z(Throwable t) {
            m8516C(true);
            m103812o().onFailure(t);
        }
    }

    public C1627a(@NotNull wp3 wp3Var, @NotNull Executor executor, @NotNull cfm cfmVar, @NotNull pwa0 pwa0Var, @NotNull DownsampleMode downsampleMode, boolean z, boolean z2, @NotNull sc90<jze> sc90Var, int i, @NotNull ga5 ga5Var, @Nullable Runnable runnable, @NotNull syg0<Boolean> syg0Var) {
        wp3Var.getClass();
        executor.getClass();
        cfmVar.getClass();
        pwa0Var.getClass();
        downsampleMode.getClass();
        sc90Var.getClass();
        ga5Var.getClass();
        syg0Var.getClass();
        this.byteArrayPool = wp3Var;
        this.executor = executor;
        this.imageDecoder = cfmVar;
        this.progressiveJpegConfig = pwa0Var;
        this.downsampleMode = downsampleMode;
        this.downsampleEnabledForNetwork = z;
        this.decodeCancellationEnabled = z2;
        this.inputProducer = sc90Var;
        this.maxBitmapDimension = i;
        this.closeableReferenceFactory = ga5Var;
        this.reclaimMemoryRunnable = runnable;
        this.recoverFromDecoderOOM = syg0Var;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(@NotNull uz5<fa5<da5>> consumer, @NotNull uc90 context) {
        C1627a c1627a;
        uc90 uc90Var;
        uz5<jze> cVar;
        consumer.getClass();
        context.getClass();
        if (o6j.m162852d()) {
            o6j.m162850a("DecodeProducer#produceResults");
            try {
                ImageRequest imageRequestMo155873t = context.mo155873t();
                this.inputProducer.mo8485b((fvj0.m123320o(imageRequestMo155873t.m8585w()) || ImageRequestBuilder.m8590s(imageRequestMo155873t.m8585w())) ? new c(this, consumer, context, new qwa0(this.byteArrayPool), this.progressiveJpegConfig, this.decodeCancellationEnabled, this.maxBitmapDimension) : new b(this, consumer, context, this.decodeCancellationEnabled, this.maxBitmapDimension), context);
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                o6j.m162851b();
            }
        }
        ImageRequest imageRequestMo155873t2 = context.mo155873t();
        if (fvj0.m123320o(imageRequestMo155873t2.m8585w()) || ImageRequestBuilder.m8590s(imageRequestMo155873t2.m8585w())) {
            c1627a = this;
            uc90Var = context;
            cVar = new c(c1627a, consumer, uc90Var, new qwa0(c1627a.byteArrayPool), c1627a.progressiveJpegConfig, c1627a.decodeCancellationEnabled, c1627a.maxBitmapDimension);
        } else {
            cVar = new b(this, consumer, context, this.decodeCancellationEnabled, this.maxBitmapDimension);
            c1627a = this;
            uc90Var = context;
        }
        c1627a.inputProducer.mo8485b(cVar, uc90Var);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ga5 getCloseableReferenceFactory() {
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
    public final cfm getImageDecoder() {
        return this.imageDecoder;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Runnable getReclaimMemoryRunnable() {
        return this.reclaimMemoryRunnable;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final syg0<Boolean> m8504i() {
        return this.recoverFromDecoderOOM;
    }
}
