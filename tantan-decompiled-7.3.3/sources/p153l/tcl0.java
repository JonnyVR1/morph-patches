package p153l;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.momo.mcamera.util.MDLogTag;
import com.p051p1.mobile.android.media.gltransition.TransitionEngine;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJa\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\bJ\u0019\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J[\u0010%\u001a\u00020\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010DR\u0016\u0010H\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010JR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010MR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010MR\u0016\u0010P\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010MR\u0016\u0010R\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010QR\u0016\u0010S\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010QR\u0016\u0010U\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u0016\u0010V\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010MR\u0016\u0010W\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0016\u0010Y\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010XR\u0016\u0010\u0012\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010Q¨\u0006Z"}, m88121d2 = {"Ll/tcl0;", "", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine;", "transitionEngine", "<init>", "(Lcom/p1/mobile/android/media/gltransition/TransitionEngine;)V", "", "g", "()V", "Ll/vdl0;", "videoEntry", "Lkotlin/Function1;", "", "progress", "Lkotlin/Function0;", "done", "", NotificationCompat.CATEGORY_ERROR, "cancel", "o", "(Ll/vdl0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "p", "(Ll/vdl0;)V", "f", "Ll/del0;", "videoFormat", RXScreenCaptureService.KEY_INDEX, "(Ll/del0;)V", "", "output", "k", "(Ljava/lang/String;)V", "j", "Ll/qa1;", "audioEntry", "r", "(Ll/qa1;)V", "m", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "endOfStream", "onCancel", BLiveStormDanmakuGiftResourceType.f45292l, "(ZLkotlin/jvm/functions/Function0;)V", "", "frameIndex", "h", "(J)J", "q", "a", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine;", "Landroid/media/MediaCodec$BufferInfo;", "b", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "Landroid/media/MediaFormat;", "c", "Landroid/media/MediaFormat;", "mediaFormat", "Landroid/media/MediaCodec;", Constants.INAPP_DATA_TAG, "Landroid/media/MediaCodec;", "mediaEncoder", "Landroid/view/Surface;", "e", "Landroid/view/Surface;", "surface", "Landroid/media/MediaMuxer;", "Landroid/media/MediaMuxer;", MDLogTag.MEDIA_MUXER_TAG, "Ll/fhq0;", "Ll/fhq0;", "encoderSurface", "Ll/fkl0;", "Ll/fkl0;", "videoTextureDrawer", "", "I", "width", "height", "frameRate", "Z", "isMediaMuxerReleased", "isMediaEncoderReleased", "n", "videoTrackIndex", "audioTrackIndex", "muxerStarted", "J", "frameCount", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class tcl0 {

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
    public fhq0 encoderSurface;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public fkl0 videoTextureDrawer;

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

    public tcl0(@NotNull TransitionEngine transitionEngine) {
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
    public static Unit m190452b(tcl0 tcl0Var, vdl0 vdl0Var) {
        tcl0Var.m190466p(vdl0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m190453c(final tcl0 tcl0Var, Function1 function1, final Ref.BooleanRef booleanRef, final Function0 function0, final Function1 function2, Function0 function3) {
        Object objM225066constructorimpl;
        fhq0 fhq0Var = tcl0Var.encoderSurface;
        if (fhq0Var == null) {
            Intrinsics.m88391r("encoderSurface");
            fhq0Var = null;
        }
        fhq0Var.m132220b();
        long j = tcl0Var.frameCount;
        for (final long j2 = 0; j2 < j && !tcl0Var.cancel; j2++) {
            float f = j2 / tcl0Var.frameCount;
            final long jM190459h = tcl0Var.m190459h(j2);
            function1.invoke(Float.valueOf(f));
            tcl0Var.transitionEngine.processFrame$android_release(false, f, new Function1() { // from class: l.scl0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return tcl0.m190456n(this.f167265a, jM190459h, function0, function2, booleanRef, j2, ((Integer) obj).intValue());
                }
            });
            if (booleanRef.element) {
                return Unit.INSTANCE;
            }
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            tcl0Var.m190463l(true, function0);
            objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
        if (thM225069exceptionOrNullimpl != null) {
            function2.invoke(thM225069exceptionOrNullimpl);
            tcl0Var.m190467q();
            booleanRef.element = true;
        }
        if (Result.m225073isSuccessimpl(objM225066constructorimpl)) {
            function3.invoke();
            tcl0Var.m190467q();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m190454d(tcl0 tcl0Var, vdl0 vdl0Var) throws IOException {
        tcl0Var.bufferInfo = new MediaCodec.BufferInfo();
        tcl0Var.cancel = false;
        tcl0Var.m190457f(vdl0Var);
        tcl0Var.m190460i(vdl0Var.getVideoFormat());
        tcl0Var.m190462k(vdl0Var.getOutput());
        tcl0Var.m190461j();
        vdl0Var.m200984a();
        tcl0Var.m190468r(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m190455e(Function0 function0, Function1 function1, tcl0 tcl0Var, Function1 function2, Function0 function3, Throwable th) {
        if (th instanceof CancellationException) {
            function0.invoke();
        } else if (th != null) {
            function1.invoke(th);
        } else {
            tcl0Var.m190464m(function2, function3, function1, function0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m190456n(tcl0 tcl0Var, long j, Function0 function0, Function1 function1, Ref.BooleanRef booleanRef, long j2, int i) {
        Object objM225066constructorimpl;
        fkl0 fkl0Var = tcl0Var.videoTextureDrawer;
        fhq0 fhq0Var = null;
        if (fkl0Var == null) {
            Intrinsics.m88391r("videoTextureDrawer");
            fkl0Var = null;
        }
        fkl0Var.m126008a(i, tcl0Var.width, tcl0Var.height);
        fhq0 fhq0Var2 = tcl0Var.encoderSurface;
        if (fhq0Var2 == null) {
            Intrinsics.m88391r("encoderSurface");
            fhq0Var2 = null;
        }
        fhq0Var2.m132221c(j);
        fhq0 fhq0Var3 = tcl0Var.encoderSurface;
        if (fhq0Var3 == null) {
            Intrinsics.m88391r("encoderSurface");
        } else {
            fhq0Var = fhq0Var3;
        }
        fhq0Var.m132222d();
        try {
            Result.Companion companion = Result.INSTANCE;
            tcl0Var.m190463l(false, function0);
            objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
        if (thM225069exceptionOrNullimpl != null) {
            function1.invoke(thM225069exceptionOrNullimpl);
            tcl0Var.m190467q();
            booleanRef.element = true;
        }
        if (Result.m225073isSuccessimpl(objM225066constructorimpl)) {
            bok0.m105699c("[export] [drainEncoder] [success] [" + j2 + Constants.AES_SUFFIX);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m190457f(vdl0 videoEntry) {
        del0 videoFormat = videoEntry.getVideoFormat();
        this.frameCount = (((long) videoFormat.getFrameRate()) * videoEntry.getTotalDuration()) / 1000;
        this.width = videoFormat.getWidth();
        this.height = videoFormat.getHeight();
        this.frameRate = videoFormat.getFrameRate();
    }

    /* JADX INFO: renamed from: g */
    public final void m190458g() {
        this.cancel = true;
        m190467q();
    }

    /* JADX INFO: renamed from: h */
    public final long m190459h(long frameIndex) {
        return (frameIndex * 1000000000) / ((long) this.frameRate);
    }

    /* JADX INFO: renamed from: i */
    public final void m190460i(del0 videoFormat) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, videoFormat.getWidth(), videoFormat.getHeight());
        mediaFormatCreateVideoFormat.getClass();
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", videoFormat.getBitRate());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", videoFormat.getFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
        this.mediaFormat = mediaFormatCreateVideoFormat;
    }

    /* JADX INFO: renamed from: j */
    public final void m190461j() {
        gse gseVarRequireEglCore$android_release = this.transitionEngine.requireEglCore$android_release();
        Surface surface = this.surface;
        fkl0 fkl0Var = null;
        if (surface == null) {
            Intrinsics.m88391r("surface");
            surface = null;
        }
        this.encoderSurface = new fhq0(gseVarRequireEglCore$android_release, surface, true);
        this.videoTextureDrawer = new fkl0();
        fhq0 fhq0Var = this.encoderSurface;
        if (fhq0Var == null) {
            Intrinsics.m88391r("encoderSurface");
            fhq0Var = null;
        }
        fhq0Var.m132220b();
        fkl0 fkl0Var2 = this.videoTextureDrawer;
        if (fkl0Var2 == null) {
            Intrinsics.m88391r("videoTextureDrawer");
        } else {
            fkl0Var = fkl0Var2;
        }
        fkl0Var.m126009b();
    }

    /* JADX INFO: renamed from: k */
    public final void m190462k(String output) throws IOException {
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(YtVideoEncoder.MIME_TYPE);
        mediaCodecCreateEncoderByType.getClass();
        MediaFormat mediaFormat = this.mediaFormat;
        if (mediaFormat == null) {
            Intrinsics.m88391r("mediaFormat");
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
    public final void m190463l(boolean endOfStream, Function0<Unit> onCancel) {
        if (this.cancel) {
            onCancel.invoke();
            m190467q();
            return;
        }
        MediaCodec mediaCodec = this.mediaEncoder;
        if (mediaCodec == null) {
            wtq0.m207906a("MediaEncoder not initialized");
            return;
        }
        if (mediaCodec == null) {
            Intrinsics.m88391r("mediaEncoder");
            mediaCodec = null;
        }
        if (endOfStream) {
            mediaCodec.signalEndOfInputStream();
        }
        while (!this.cancel) {
            MediaCodec.BufferInfo bufferInfo = this.bufferInfo;
            if (bufferInfo == null) {
                Intrinsics.m88391r("bufferInfo");
                bufferInfo = null;
            }
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -3) {
                bok0.m105699c("INFO_OUTPUT_BUFFERS_CHANGED");
            } else if (iDequeueOutputBuffer != -2) {
                if (iDequeueOutputBuffer != -1) {
                    bok0.m105699c("DO ENCODER " + iDequeueOutputBuffer);
                    if (iDequeueOutputBuffer < 0) {
                        bok0.m105698b("unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, null, 2, null);
                    } else {
                        if (this.videoTrackIndex < 0) {
                            azk0.m101074a("no video track index");
                            return;
                        }
                        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                        if (outputBuffer == null) {
                            z0q.m218147a("encoderOutputBuffer ", iDequeueOutputBuffer, " was null");
                            return;
                        }
                        MediaCodec.BufferInfo bufferInfo2 = this.bufferInfo;
                        if (bufferInfo2 == null) {
                            Intrinsics.m88391r("bufferInfo");
                            bufferInfo2 = null;
                        }
                        if ((bufferInfo2.flags & 2) != 0) {
                            MediaCodec.BufferInfo bufferInfo3 = this.bufferInfo;
                            if (bufferInfo3 == null) {
                                Intrinsics.m88391r("bufferInfo");
                                bufferInfo3 = null;
                            }
                            bok0.m105698b("ignoring BUFFER_FLAG_CODEC_CONFIG: " + bufferInfo3.flags, null, 2, null);
                            MediaCodec.BufferInfo bufferInfo4 = this.bufferInfo;
                            if (bufferInfo4 == null) {
                                Intrinsics.m88391r("bufferInfo");
                                bufferInfo4 = null;
                            }
                            bufferInfo4.size = 0;
                        }
                        MediaCodec.BufferInfo bufferInfo5 = this.bufferInfo;
                        if (bufferInfo5 == null) {
                            Intrinsics.m88391r("bufferInfo");
                            bufferInfo5 = null;
                        }
                        if (bufferInfo5.size != 0) {
                            if (!this.muxerStarted) {
                                azk0.m101074a("muxer hasn't started");
                                return;
                            }
                            MediaCodec.BufferInfo bufferInfo6 = this.bufferInfo;
                            if (bufferInfo6 == null) {
                                Intrinsics.m88391r("bufferInfo");
                                bufferInfo6 = null;
                            }
                            outputBuffer.position(bufferInfo6.offset);
                            MediaCodec.BufferInfo bufferInfo7 = this.bufferInfo;
                            if (bufferInfo7 == null) {
                                Intrinsics.m88391r("bufferInfo");
                                bufferInfo7 = null;
                            }
                            int i = bufferInfo7.offset;
                            MediaCodec.BufferInfo bufferInfo8 = this.bufferInfo;
                            if (bufferInfo8 == null) {
                                Intrinsics.m88391r("bufferInfo");
                                bufferInfo8 = null;
                            }
                            outputBuffer.limit(i + bufferInfo8.size);
                            MediaMuxer mediaMuxer = this.mediaMuxer;
                            if (mediaMuxer == null) {
                                Intrinsics.m88391r(MDLogTag.MEDIA_MUXER_TAG);
                                mediaMuxer = null;
                            }
                            int i2 = this.videoTrackIndex;
                            MediaCodec.BufferInfo bufferInfo9 = this.bufferInfo;
                            if (bufferInfo9 == null) {
                                Intrinsics.m88391r("bufferInfo");
                                bufferInfo9 = null;
                            }
                            mediaMuxer.writeSampleData(i2, outputBuffer, bufferInfo9);
                            MediaCodec.BufferInfo bufferInfo10 = this.bufferInfo;
                            if (bufferInfo10 == null) {
                                Intrinsics.m88391r("bufferInfo");
                                bufferInfo10 = null;
                            }
                            bok0.m105699c("sent " + bufferInfo10.size + " bytes to muxer");
                        }
                        mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        MediaCodec.BufferInfo bufferInfo11 = this.bufferInfo;
                        if (bufferInfo11 == null) {
                            Intrinsics.m88391r("bufferInfo");
                            bufferInfo11 = null;
                        }
                        if ((bufferInfo11.flags & 4) != 0) {
                            if (endOfStream) {
                                bok0.m105699c("reached end of stream");
                                return;
                            } else {
                                bok0.m105698b("reached end of stream unexpectedly", null, 2, null);
                                return;
                            }
                        }
                    }
                } else {
                    bok0.m105699c("INFO_TRY_AGAIN_LATER");
                    if (!endOfStream) {
                        return;
                    } else {
                        bok0.m105699c("no output buffer available, spinning to await EOS");
                    }
                }
            } else {
                if (this.muxerStarted) {
                    wtq0.m207906a("format changed twice");
                    return;
                }
                bok0.m105699c("INFO_OUTPUT_FORMAT_CHANGED");
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                outputFormat.getClass();
                MediaMuxer mediaMuxer2 = this.mediaMuxer;
                if (mediaMuxer2 == null) {
                    Intrinsics.m88391r(MDLogTag.MEDIA_MUXER_TAG);
                    mediaMuxer2 = null;
                }
                int iAddTrack = mediaMuxer2.addTrack(outputFormat);
                this.videoTrackIndex = iAddTrack;
                bok0.m105699c("INFO_OUTPUT_FORMAT_CHANGED " + iAddTrack);
                MediaMuxer mediaMuxer3 = this.mediaMuxer;
                if (mediaMuxer3 == null) {
                    Intrinsics.m88391r(MDLogTag.MEDIA_MUXER_TAG);
                    mediaMuxer3 = null;
                }
                mediaMuxer3.start();
                this.muxerStarted = true;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m190464m(final Function1<? super Float, Unit> progress, final Function0<Unit> done, final Function1<? super Throwable, Unit> err, final Function0<Unit> cancel) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.transitionEngine.render$android_release(new Function0() { // from class: l.rcl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tcl0.m190453c(this.f162224a, progress, booleanRef, cancel, err, done);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m190465o(@NotNull final vdl0 videoEntry, @NotNull final Function1<? super Float, Unit> progress, @NotNull final Function0<Unit> done, @NotNull final Function1<? super Throwable, Unit> err, @NotNull final Function0<Unit> cancel) {
        videoEntry.getClass();
        progress.getClass();
        done.getClass();
        err.getClass();
        cancel.getClass();
        this.transitionEngine.launch$android_release(r5e.m179860a(), new Function0() { // from class: l.ocl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tcl0.m190452b(this.f146719a, videoEntry);
            }
        }).mo94592u(new Function1() { // from class: l.pcl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tcl0.m190455e(cancel, err, this, progress, done, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m190466p(final vdl0 videoEntry) {
        this.transitionEngine.render$android_release(new Function0() { // from class: l.qcl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tcl0.m190454d(this.f156608a, videoEntry);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m190467q() {
        try {
            this.muxerStarted = false;
            MediaCodec mediaCodec = null;
            if (!this.isMediaMuxerReleased) {
                MediaMuxer mediaMuxer = this.mediaMuxer;
                if (mediaMuxer == null) {
                    Intrinsics.m88391r(MDLogTag.MEDIA_MUXER_TAG);
                    mediaMuxer = null;
                }
                mediaMuxer.stop();
                mediaMuxer.release();
                this.isMediaMuxerReleased = true;
            }
            if (!this.isMediaEncoderReleased) {
                MediaCodec mediaCodec2 = this.mediaEncoder;
                if (mediaCodec2 == null) {
                    Intrinsics.m88391r("mediaEncoder");
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
    public final void m190468r(qa1 audioEntry) {
    }
}
