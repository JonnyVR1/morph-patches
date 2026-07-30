package p149l;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.momo.mcamera.util.MDLogTag;
import com.p046p1.mobile.android.media.gltransition.TransitionEngine;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87231d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJa\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\bJ\u0019\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J[\u0010%\u001a\u00020\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010DR\u0016\u0010H\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010JR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010MR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010MR\u0016\u0010P\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010MR\u0016\u0010R\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010QR\u0016\u0010S\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010QR\u0016\u0010U\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u0016\u0010V\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010MR\u0016\u0010W\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0016\u0010Y\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010XR\u0016\u0010\u0012\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010Q¨\u0006Z"}, m87232d2 = {"Ll/o3l0;", "", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine;", "transitionEngine", "<init>", "(Lcom/p1/mobile/android/media/gltransition/TransitionEngine;)V", "", "g", "()V", "Ll/r4l0;", "videoEntry", "Lkotlin/Function1;", "", "progress", "Lkotlin/Function0;", "done", "", NotificationCompat.CATEGORY_ERROR, "cancel", "o", "(Ll/r4l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "p", "(Ll/r4l0;)V", "f", "Ll/z4l0;", "videoFormat", RXScreenCaptureService.KEY_INDEX, "(Ll/z4l0;)V", "", "output", "k", "(Ljava/lang/String;)V", "j", "Ll/ja1;", "audioEntry", "r", "(Ll/ja1;)V", "m", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "endOfStream", "onCancel", BLiveStormDanmakuGiftResourceType.f44444l, "(ZLkotlin/jvm/functions/Function0;)V", "", "frameIndex", "h", "(J)J", "q", "a", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine;", "Landroid/media/MediaCodec$BufferInfo;", "b", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "Landroid/media/MediaFormat;", "c", "Landroid/media/MediaFormat;", "mediaFormat", "Landroid/media/MediaCodec;", Constants.INAPP_DATA_TAG, "Landroid/media/MediaCodec;", "mediaEncoder", "Landroid/view/Surface;", "e", "Landroid/view/Surface;", "surface", "Landroid/media/MediaMuxer;", "Landroid/media/MediaMuxer;", MDLogTag.MEDIA_MUXER_TAG, "Ll/a8q0;", "Ll/a8q0;", "encoderSurface", "Ll/bbl0;", "Ll/bbl0;", "videoTextureDrawer", "", "I", "width", "height", "frameRate", "Z", "isMediaMuxerReleased", "isMediaEncoderReleased", "n", "videoTrackIndex", "audioTrackIndex", "muxerStarted", "J", "frameCount", "android_release"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class o3l0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TransitionEngine transitionEngine;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public MediaCodec.BufferInfo bufferInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public MediaFormat mediaFormat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public MediaCodec mediaEncoder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Surface surface;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public MediaMuxer mediaMuxer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public a8q0 encoderSurface;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public bbl0 videoTextureDrawer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int width;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int height;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int frameRate;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean isMediaMuxerReleased;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isMediaEncoderReleased;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int videoTrackIndex;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int audioTrackIndex;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean muxerStarted;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public long frameCount;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean cancel;

    public o3l0(@NotNull TransitionEngine transitionEngine) {
        transitionEngine.getClass();
        this.transitionEngine = transitionEngine;
        this.width = 720;
        this.height = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        this.frameRate = 30;
        this.isMediaMuxerReleased = true;
        this.isMediaEncoderReleased = true;
        this.videoTrackIndex = -1;
        this.audioTrackIndex = -1;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m162440b(o3l0 o3l0Var, r4l0 r4l0Var) {
        o3l0Var.m162454p(r4l0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m162441c(final o3l0 o3l0Var, Function1 function1, final Ref.BooleanRef booleanRef, final Function0 function0, final Function1 function2, Function0 function3) {
        Object objM223820constructorimpl;
        a8q0 a8q0Var = o3l0Var.encoderSurface;
        if (a8q0Var == null) {
            Intrinsics.m87502r("encoderSurface");
            a8q0Var = null;
        }
        a8q0Var.m108495b();
        long j = o3l0Var.frameCount;
        for (final long j2 = 0; j2 < j && !o3l0Var.cancel; j2++) {
            float f = j2 / o3l0Var.frameCount;
            final long jM162447h = o3l0Var.m162447h(j2);
            function1.invoke(Float.valueOf(f));
            o3l0Var.transitionEngine.processFrame$android_release(false, f, new Function1() { // from class: l.n3l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return o3l0.m162444n(this.f137005a, jM162447h, function0, function2, booleanRef, j2, ((Integer) obj).intValue());
                }
            });
            if (booleanRef.element) {
                return Unit.INSTANCE;
            }
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            o3l0Var.m162451l(true, function0);
            objM223820constructorimpl = Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        Throwable thM223823exceptionOrNullimpl = Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
        if (thM223823exceptionOrNullimpl != null) {
            function2.invoke(thM223823exceptionOrNullimpl);
            o3l0Var.m162455q();
            booleanRef.element = true;
        }
        if (Result.m223827isSuccessimpl(objM223820constructorimpl)) {
            function3.invoke();
            o3l0Var.m162455q();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m162442d(o3l0 o3l0Var, r4l0 r4l0Var) throws IOException {
        o3l0Var.bufferInfo = new MediaCodec.BufferInfo();
        o3l0Var.cancel = false;
        o3l0Var.m162445f(r4l0Var);
        o3l0Var.m162448i(r4l0Var.getVideoFormat());
        o3l0Var.m162450k(r4l0Var.getOutput());
        o3l0Var.m162449j();
        r4l0Var.m177814a();
        o3l0Var.m162456r(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m162443e(Function0 function0, Function1 function1, o3l0 o3l0Var, Function1 function2, Function0 function3, Throwable th) {
        if (th instanceof CancellationException) {
            function0.invoke();
        } else if (th != null) {
            function1.invoke(th);
        } else {
            o3l0Var.m162452m(function2, function3, function1, function0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m162444n(o3l0 o3l0Var, long j, Function0 function0, Function1 function1, Ref.BooleanRef booleanRef, long j2, int i) {
        Object objM223820constructorimpl;
        bbl0 bbl0Var = o3l0Var.videoTextureDrawer;
        a8q0 a8q0Var = null;
        if (bbl0Var == null) {
            Intrinsics.m87502r("videoTextureDrawer");
            bbl0Var = null;
        }
        bbl0Var.m100982a(i, o3l0Var.width, o3l0Var.height);
        a8q0 a8q0Var2 = o3l0Var.encoderSurface;
        if (a8q0Var2 == null) {
            Intrinsics.m87502r("encoderSurface");
            a8q0Var2 = null;
        }
        a8q0Var2.m108496c(j);
        a8q0 a8q0Var3 = o3l0Var.encoderSurface;
        if (a8q0Var3 == null) {
            Intrinsics.m87502r("encoderSurface");
        } else {
            a8q0Var = a8q0Var3;
        }
        a8q0Var.m108497d();
        try {
            Result.Companion companion = Result.INSTANCE;
            o3l0Var.m162451l(false, function0);
            objM223820constructorimpl = Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        Throwable thM223823exceptionOrNullimpl = Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
        if (thM223823exceptionOrNullimpl != null) {
            function1.invoke(thM223823exceptionOrNullimpl);
            o3l0Var.m162455q();
            booleanRef.element = true;
        }
        if (Result.m223827isSuccessimpl(objM223820constructorimpl)) {
            vek0.m198203c("[export] [drainEncoder] [success] [" + j2 + Constants.AES_SUFFIX);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m162445f(r4l0 videoEntry) {
        z4l0 videoFormat = videoEntry.getVideoFormat();
        this.frameCount = (((long) videoFormat.getFrameRate()) * videoEntry.getTotalDuration()) / 1000;
        this.width = videoFormat.getWidth();
        this.height = videoFormat.getHeight();
        this.frameRate = videoFormat.getFrameRate();
    }

    /* JADX INFO: renamed from: g */
    public final void m162446g() {
        this.cancel = true;
        m162455q();
    }

    /* JADX INFO: renamed from: h */
    public final long m162447h(long frameIndex) {
        return (frameIndex * 1000000000) / ((long) this.frameRate);
    }

    /* JADX INFO: renamed from: i */
    public final void m162448i(z4l0 videoFormat) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, videoFormat.getWidth(), videoFormat.getHeight());
        mediaFormatCreateVideoFormat.getClass();
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", videoFormat.getBitRate());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", videoFormat.getFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
        this.mediaFormat = mediaFormatCreateVideoFormat;
    }

    /* JADX INFO: renamed from: j */
    public final void m162449j() {
        cre creVarRequireEglCore$android_release = this.transitionEngine.requireEglCore$android_release();
        Surface surface = this.surface;
        bbl0 bbl0Var = null;
        if (surface == null) {
            Intrinsics.m87502r("surface");
            surface = null;
        }
        this.encoderSurface = new a8q0(creVarRequireEglCore$android_release, surface, true);
        this.videoTextureDrawer = new bbl0();
        a8q0 a8q0Var = this.encoderSurface;
        if (a8q0Var == null) {
            Intrinsics.m87502r("encoderSurface");
            a8q0Var = null;
        }
        a8q0Var.m108495b();
        bbl0 bbl0Var2 = this.videoTextureDrawer;
        if (bbl0Var2 == null) {
            Intrinsics.m87502r("videoTextureDrawer");
        } else {
            bbl0Var = bbl0Var2;
        }
        bbl0Var.m100983b();
    }

    /* JADX INFO: renamed from: k */
    public final void m162450k(String output) throws IOException {
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(YtVideoEncoder.MIME_TYPE);
        mediaCodecCreateEncoderByType.getClass();
        MediaFormat mediaFormat = this.mediaFormat;
        if (mediaFormat == null) {
            Intrinsics.m87502r("mediaFormat");
            mediaFormat = null;
        }
        mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        Surface surfaceCreateInputSurface = mediaCodecCreateEncoderByType.createInputSurface();
        surfaceCreateInputSurface.getClass();
        this.surface = surfaceCreateInputSurface;
        mediaCodecCreateEncoderByType.start();
        this.mediaMuxer = new MediaMuxer(output, 0);
        this.isMediaMuxerReleased = false;
        this.mediaEncoder = mediaCodecCreateEncoderByType;
        this.isMediaEncoderReleased = false;
    }

    /* JADX INFO: renamed from: l */
    public final void m162451l(boolean endOfStream, Function0<Unit> onCancel) {
        if (this.cancel) {
            onCancel.invoke();
            m162455q();
            return;
        }
        MediaCodec mediaCodec = this.mediaEncoder;
        if (mediaCodec == null) {
            qkq0.m175383a("MediaEncoder not initialized");
            return;
        }
        if (mediaCodec == null) {
            Intrinsics.m87502r("mediaEncoder");
            mediaCodec = null;
        }
        if (endOfStream) {
            mediaCodec.signalEndOfInputStream();
        }
        while (!this.cancel) {
            MediaCodec.BufferInfo bufferInfo = this.bufferInfo;
            if (bufferInfo == null) {
                Intrinsics.m87502r("bufferInfo");
                bufferInfo = null;
            }
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -3) {
                vek0.m198203c("INFO_OUTPUT_BUFFERS_CHANGED");
            } else if (iDequeueOutputBuffer != -2) {
                if (iDequeueOutputBuffer != -1) {
                    vek0.m198203c("DO ENCODER " + iDequeueOutputBuffer);
                    if (iDequeueOutputBuffer < 0) {
                        vek0.m198202b("unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, null, 2, null);
                    } else {
                        if (this.videoTrackIndex < 0) {
                            upk0.m194883a("no video track index");
                            return;
                        }
                        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                        if (outputBuffer == null) {
                            zyp.m220936a("encoderOutputBuffer ", iDequeueOutputBuffer, " was null");
                            return;
                        }
                        MediaCodec.BufferInfo bufferInfo2 = this.bufferInfo;
                        if (bufferInfo2 == null) {
                            Intrinsics.m87502r("bufferInfo");
                            bufferInfo2 = null;
                        }
                        if ((bufferInfo2.flags & 2) != 0) {
                            MediaCodec.BufferInfo bufferInfo3 = this.bufferInfo;
                            if (bufferInfo3 == null) {
                                Intrinsics.m87502r("bufferInfo");
                                bufferInfo3 = null;
                            }
                            vek0.m198202b("ignoring BUFFER_FLAG_CODEC_CONFIG: " + bufferInfo3.flags, null, 2, null);
                            MediaCodec.BufferInfo bufferInfo4 = this.bufferInfo;
                            if (bufferInfo4 == null) {
                                Intrinsics.m87502r("bufferInfo");
                                bufferInfo4 = null;
                            }
                            bufferInfo4.size = 0;
                        }
                        MediaCodec.BufferInfo bufferInfo5 = this.bufferInfo;
                        if (bufferInfo5 == null) {
                            Intrinsics.m87502r("bufferInfo");
                            bufferInfo5 = null;
                        }
                        if (bufferInfo5.size != 0) {
                            if (!this.muxerStarted) {
                                upk0.m194883a("muxer hasn't started");
                                return;
                            }
                            MediaCodec.BufferInfo bufferInfo6 = this.bufferInfo;
                            if (bufferInfo6 == null) {
                                Intrinsics.m87502r("bufferInfo");
                                bufferInfo6 = null;
                            }
                            outputBuffer.position(bufferInfo6.offset);
                            MediaCodec.BufferInfo bufferInfo7 = this.bufferInfo;
                            if (bufferInfo7 == null) {
                                Intrinsics.m87502r("bufferInfo");
                                bufferInfo7 = null;
                            }
                            int i = bufferInfo7.offset;
                            MediaCodec.BufferInfo bufferInfo8 = this.bufferInfo;
                            if (bufferInfo8 == null) {
                                Intrinsics.m87502r("bufferInfo");
                                bufferInfo8 = null;
                            }
                            outputBuffer.limit(i + bufferInfo8.size);
                            MediaMuxer mediaMuxer = this.mediaMuxer;
                            if (mediaMuxer == null) {
                                Intrinsics.m87502r(MDLogTag.MEDIA_MUXER_TAG);
                                mediaMuxer = null;
                            }
                            int i2 = this.videoTrackIndex;
                            MediaCodec.BufferInfo bufferInfo9 = this.bufferInfo;
                            if (bufferInfo9 == null) {
                                Intrinsics.m87502r("bufferInfo");
                                bufferInfo9 = null;
                            }
                            mediaMuxer.writeSampleData(i2, outputBuffer, bufferInfo9);
                            MediaCodec.BufferInfo bufferInfo10 = this.bufferInfo;
                            if (bufferInfo10 == null) {
                                Intrinsics.m87502r("bufferInfo");
                                bufferInfo10 = null;
                            }
                            vek0.m198203c("sent " + bufferInfo10.size + " bytes to muxer");
                        }
                        mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        MediaCodec.BufferInfo bufferInfo11 = this.bufferInfo;
                        if (bufferInfo11 == null) {
                            Intrinsics.m87502r("bufferInfo");
                            bufferInfo11 = null;
                        }
                        if ((bufferInfo11.flags & 4) != 0) {
                            if (endOfStream) {
                                vek0.m198203c("reached end of stream");
                                return;
                            } else {
                                vek0.m198202b("reached end of stream unexpectedly", null, 2, null);
                                return;
                            }
                        }
                    }
                } else {
                    vek0.m198203c("INFO_TRY_AGAIN_LATER");
                    if (!endOfStream) {
                        return;
                    } else {
                        vek0.m198203c("no output buffer available, spinning to await EOS");
                    }
                }
            } else {
                if (this.muxerStarted) {
                    qkq0.m175383a("format changed twice");
                    return;
                }
                vek0.m198203c("INFO_OUTPUT_FORMAT_CHANGED");
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                outputFormat.getClass();
                MediaMuxer mediaMuxer2 = this.mediaMuxer;
                if (mediaMuxer2 == null) {
                    Intrinsics.m87502r(MDLogTag.MEDIA_MUXER_TAG);
                    mediaMuxer2 = null;
                }
                int iAddTrack = mediaMuxer2.addTrack(outputFormat);
                this.videoTrackIndex = iAddTrack;
                vek0.m198203c("INFO_OUTPUT_FORMAT_CHANGED " + iAddTrack);
                MediaMuxer mediaMuxer3 = this.mediaMuxer;
                if (mediaMuxer3 == null) {
                    Intrinsics.m87502r(MDLogTag.MEDIA_MUXER_TAG);
                    mediaMuxer3 = null;
                }
                mediaMuxer3.start();
                this.muxerStarted = true;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m162452m(final Function1<? super Float, Unit> progress, final Function0<Unit> done, final Function1<? super Throwable, Unit> err, final Function0<Unit> cancel) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.transitionEngine.render$android_release(new Function0() { // from class: l.m3l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o3l0.m162441c(this.f131103a, progress, booleanRef, cancel, err, done);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m162453o(@NotNull final r4l0 videoEntry, @NotNull final Function1<? super Float, Unit> progress, @NotNull final Function0<Unit> done, @NotNull final Function1<? super Throwable, Unit> err, @NotNull final Function0<Unit> cancel) {
        videoEntry.getClass();
        progress.getClass();
        done.getClass();
        err.getClass();
        cancel.getClass();
        this.transitionEngine.launch$android_release(d4e.m109980a(), new Function0() { // from class: l.j3l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o3l0.m162440b(this.f116085a, videoEntry);
            }
        }).mo93701u(new Function1() { // from class: l.k3l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o3l0.m162443e(cancel, err, this, progress, done, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m162454p(final r4l0 videoEntry) {
        this.transitionEngine.render$android_release(new Function0() { // from class: l.l3l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o3l0.m162442d(this.f125926a, videoEntry);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m162455q() {
        try {
            this.muxerStarted = false;
            MediaCodec mediaCodec = null;
            if (!this.isMediaMuxerReleased) {
                MediaMuxer mediaMuxer = this.mediaMuxer;
                if (mediaMuxer == null) {
                    Intrinsics.m87502r(MDLogTag.MEDIA_MUXER_TAG);
                    mediaMuxer = null;
                }
                mediaMuxer.stop();
                mediaMuxer.release();
                this.isMediaMuxerReleased = true;
            }
            if (!this.isMediaEncoderReleased) {
                MediaCodec mediaCodec2 = this.mediaEncoder;
                if (mediaCodec2 == null) {
                    Intrinsics.m87502r("mediaEncoder");
                } else {
                    mediaCodec = mediaCodec2;
                }
                mediaCodec.stop();
                mediaCodec.release();
                this.isMediaEncoderReleased = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m162456r(ja1 audioEntry) {
    }
}
