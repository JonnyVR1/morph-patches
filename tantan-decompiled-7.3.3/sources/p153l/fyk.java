package p153l;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001NB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010)\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u0011R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010-R\u0016\u0010B\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010-R\u0016\u0010D\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010-R\u0016\u0010F\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010-R\u0016\u0010H\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010=R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006O"}, m88121d2 = {"Ll/fyk;", "Ll/gid;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "Ll/ap0;", GameIdentity.player, "<init>", "(Ll/ap0;)V", "Ll/wtl;", "fileContainer", "", "A", "(Ll/wtl;)V", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "onFrameAvailable", "(Landroid/graphics/SurfaceTexture;)V", "h", "()V", "L", "N", "Landroid/media/MediaExtractor;", "extractor", "Landroid/media/MediaCodec;", "decoder", "M", "(Landroid/media/MediaExtractor;Landroid/media/MediaCodec;)V", "", "outputIndex", "R", "(Landroid/media/MediaCodec;I)V", "", "yuv420sp", "P", "([B)[B", "src", "srcOffset", "inWidth", "inHeight", "dest", "outWidth", "outHeight", "Q", "([BIII[BII)V", "K", "(Landroid/media/MediaCodec;Landroid/media/MediaExtractor;)V", "I", "Landroid/view/Surface;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/Surface;", "surface", "m", "Landroid/graphics/SurfaceTexture;", "glTexture", "Landroid/media/MediaCodec$BufferInfo;", "n", "Lkotlin/Lazy;", "J", "()Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "", "o", "Z", "needDestroy", "p", "videoWidth", "q", "videoHeight", "r", "alignWidth", BLiveStormDanmakuGiftResourceType.f45294s, "alignHeight", Constants.KEY_T, "needYUV", "Landroid/media/MediaFormat;", "u", "Landroid/media/MediaFormat;", "outputFormat", "Companion", "a", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fyk extends gid implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Surface surface;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public SurfaceTexture glTexture;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy bufferInfo;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean needDestroy;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int videoWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int videoHeight;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int alignWidth;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int alignHeight;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean needYUV;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public MediaFormat outputFormat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyk(@NotNull ap0 ap0Var) {
        super(ap0Var);
        ap0Var.getClass();
        this.bufferInfo = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.byk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fyk.m128108G();
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static void m128105D(fyk fykVar) {
        fykVar.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getPluginManager().m105761d();
        q4m q4mVarM130307m = fykVar.getRender();
        if (q4mVarM130307m != null) {
            q4mVarM130307m.mo128153f();
        }
        fykVar.m130318x(null);
        fykVar.mo69827b();
        fykVar.m130303i();
    }

    /* JADX INFO: renamed from: E */
    public static void m128106E(fyk fykVar, wtl wtlVar) {
        fykVar.m128117N(wtlVar);
    }

    /* JADX INFO: renamed from: F */
    public static void m128107F(fyk fykVar) {
        try {
            SurfaceTexture surfaceTexture = fykVar.glTexture;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
                q4m q4mVarM130307m = fykVar.getRender();
                if (q4mVarM130307m != null) {
                    q4mVarM130307m.mo128152e();
                }
                fykVar.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getPluginManager().m105766i();
                q4m q4mVarM130307m2 = fykVar.getRender();
                if (q4mVarM130307m2 != null) {
                    q4mVarM130307m2.swapBuffers();
                }
            }
        } catch (Throwable th) {
            C21726z0.INSTANCE.m218094c("AnimPlayer.HardDecoder", "render exception=" + th, th);
        }
    }

    /* JADX INFO: renamed from: G */
    public static MediaCodec.BufferInfo m128108G() {
        return new MediaCodec.BufferInfo();
    }

    /* JADX INFO: renamed from: H */
    public static void m128109H(fyk fykVar, MediaCodec mediaCodec, MediaExtractor mediaExtractor) {
        q4m q4mVarM130307m = fykVar.getRender();
        if (q4mVarM130307m != null) {
            q4mVarM130307m.mo128155h();
        }
        try {
            C21726z0.INSTANCE.m218095d("AnimPlayer.HardDecoder", "release");
            if (mediaCodec != null) {
                mediaCodec.stop();
                mediaCodec.release();
            }
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            SurfaceTexture surfaceTexture = fykVar.glTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            fykVar.glTexture = null;
            fykVar.m130309o().m183266b();
            fykVar.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getPluginManager().m105764g();
            q4m q4mVarM130307m2 = fykVar.getRender();
            if (q4mVarM130307m2 != null) {
                q4mVarM130307m2.mo128154g();
            }
            Surface surface = fykVar.surface;
            if (surface != null) {
                surface.release();
            }
            fykVar.surface = null;
        } catch (Throwable th) {
            C21726z0.INSTANCE.m218094c("AnimPlayer.HardDecoder", "release e=" + th, th);
        }
        fykVar.m130319y(false);
        fykVar.mo69831f();
        if (fykVar.needDestroy) {
            fykVar.m128112I();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public static final void m128110O(fyk fykVar, Ref.ObjectRef objectRef, MediaCodec mediaCodec, Ref.ObjectRef objectRef2) {
        try {
            MediaExtractor mediaExtractor = (MediaExtractor) objectRef.element;
            mediaCodec.getClass();
            fykVar.m128116M(mediaExtractor, mediaCodec);
        } catch (Throwable th) {
            C21726z0.INSTANCE.m218094c("AnimPlayer.HardDecoder", "MediaCodec exception e=" + th, th);
            fykVar.mo69826a(10002, "0x2 MediaCodec exception e=" + th);
            fykVar.m128114K((MediaCodec) objectRef2.element, (MediaExtractor) objectRef.element);
        }
    }

    @Override // p153l.gid
    /* JADX INFO: renamed from: A */
    public void mo128111A(@NotNull final wtl fileContainer) {
        fileContainer.getClass();
        m130320z(false);
        this.needDestroy = false;
        m130319y(true);
        Handler handler = getRenderThread().getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.cyk
                @Override // java.lang.Runnable
                public final void run() {
                    fyk.m128106E(this.f84386a, fileContainer);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m128112I() {
        C21726z0.INSTANCE.m218095d("AnimPlayer.HardDecoder", "destroyInner");
        Handler handler = getRenderThread().getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.zxk
                @Override // java.lang.Runnable
                public final void run() {
                    fyk.m128105D(this.f206471a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final MediaCodec.BufferInfo m128113J() {
        return (MediaCodec.BufferInfo) this.bufferInfo.getValue();
    }

    /* JADX INFO: renamed from: K */
    public final void m128114K(final MediaCodec decoder, final MediaExtractor extractor) {
        Handler handler = getRenderThread().getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.eyk
                @Override // java.lang.Runnable
                public final void run() {
                    fyk.m128109H(this.f96448a, decoder, extractor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m128115L() {
        Handler handler = getRenderThread().getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ayk
                @Override // java.lang.Runnable
                public final void run() {
                    fyk.m128107F(this.f73977a);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:49:0x013d  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:65:0x019a  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: M */
    public final void m128116M(MediaExtractor extractor, MediaCodec decoder) {
        String str;
        boolean z;
        int iDequeueOutputBuffer;
        int iM130305k;
        boolean z2;
        C21726z0 c21726z0;
        boolean z3;
        MediaFormat outputFormat;
        int integer;
        int integer2;
        MediaCodec mediaCodec = decoder;
        ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
        inputBuffers.getClass();
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i2 = 0;
        int i3 = 0;
        boolean z6 = false;
        while (!z5) {
            if (getIsStopReq()) {
                C21726z0.INSTANCE.m218095d("AnimPlayer.HardDecoder", "stop decode");
                m128114K(mediaCodec, extractor);
                return;
            }
            long j = 10000;
            if (z4) {
                str = "AnimPlayer.HardDecoder";
            } else {
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    int sampleData = extractor.readSampleData(inputBuffers[iDequeueInputBuffer], i);
                    if (sampleData < 0) {
                        str = "AnimPlayer.HardDecoder";
                        i3 = i3;
                        z6 = z6;
                        j = 10000;
                        mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        C21726z0.INSTANCE.m218092a(str, "decode EOS");
                        mediaCodec = decoder;
                        z = true;
                    } else {
                        str = "AnimPlayer.HardDecoder";
                        mediaCodec = decoder;
                        mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, extractor.getSampleTime(), 0);
                        C21726z0.INSTANCE.m218092a(str, "submitted frame " + i2 + " to dec, size=" + sampleData);
                        i2++;
                        extractor.advance();
                    }
                    if (z5) {
                        z4 = z;
                        i3 = i3;
                        z6 = z6;
                    } else {
                        iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(m128113J(), j);
                        if (iDequeueOutputBuffer == -1) {
                            C21726z0.INSTANCE.m218092a(str, "no output from decoder available");
                        } else if (iDequeueOutputBuffer == -3) {
                            C21726z0.INSTANCE.m218092a(str, "decoder output buffers changed");
                        } else if (iDequeueOutputBuffer == -2) {
                            outputFormat = mediaCodec.getOutputFormat();
                            this.outputFormat = outputFormat;
                            if (outputFormat != null) {
                                try {
                                    integer = outputFormat.getInteger("stride");
                                    integer2 = outputFormat.getInteger("slice-height");
                                    if (integer > 0 && integer2 > 0) {
                                        this.alignWidth = integer;
                                        this.alignHeight = integer2;
                                    }
                                } catch (Throwable th) {
                                    C21726z0.INSTANCE.m218094c(str, String.valueOf(th), th);
                                }
                            }
                            C21726z0.INSTANCE.m218095d(str, "decoder output format changed: " + this.outputFormat);
                        } else {
                            if (iDequeueOutputBuffer >= 0) {
                                throw new RuntimeException("unexpected result from decoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                            }
                            if ((m128113J().flags & 4) != 0) {
                                m130317w(getPlayLoop() - 1);
                                iM130305k = getPlayLoop();
                                getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().m99264z(getPlayLoop());
                                if (getPlayLoop() <= 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z5 = z3;
                            } else {
                                iM130305k = 0;
                            }
                            if (!z5) {
                                m130309o().m183265a(m128113J().presentationTimeUs);
                            }
                            if (this.needYUV && !z5) {
                                m128120R(mediaCodec, iDequeueOutputBuffer);
                            }
                            if (!z5 || this.needYUV) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, z2);
                            if (i3 == 0 && !z6) {
                                mo69828c();
                            }
                            int i4 = i3;
                            getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getPluginManager().m105760c(i4);
                            mo69829d(i4, getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String());
                            i3 = i4 + 1;
                            c21726z0 = C21726z0.INSTANCE;
                            c21726z0.m218092a(str, "decode frameIndex=" + i3);
                            if (iM130305k > 0) {
                                c21726z0.m218092a(str, "Reached EOD, looping");
                                getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getPluginManager().m105763f();
                                extractor.seekTo(0L, 2);
                                mediaCodec.flush();
                                m130309o().m183266b();
                                z6 = true;
                                z4 = false;
                                i3 = 0;
                            } else {
                                z4 = z;
                                z6 = z6;
                            }
                            if (z5) {
                                m128114K(mediaCodec, extractor);
                            }
                        }
                        z4 = z;
                        i3 = i3;
                        z6 = z6;
                    }
                    i = 0;
                } else {
                    str = "AnimPlayer.HardDecoder";
                    C21726z0.INSTANCE.m218092a(str, "input buffer not available");
                }
            }
            z = z4;
            if (z5) {
                z4 = z;
                i3 = i3;
                z6 = z6;
            } else {
                iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(m128113J(), j);
                if (iDequeueOutputBuffer == -1) {
                    C21726z0.INSTANCE.m218092a(str, "no output from decoder available");
                } else if (iDequeueOutputBuffer == -3) {
                    C21726z0.INSTANCE.m218092a(str, "decoder output buffers changed");
                } else if (iDequeueOutputBuffer == -2) {
                    outputFormat = mediaCodec.getOutputFormat();
                    this.outputFormat = outputFormat;
                    if (outputFormat != null) {
                        integer = outputFormat.getInteger("stride");
                        integer2 = outputFormat.getInteger("slice-height");
                        if (integer > 0) {
                            this.alignWidth = integer;
                            this.alignHeight = integer2;
                        }
                    }
                    C21726z0.INSTANCE.m218095d(str, "decoder output format changed: " + this.outputFormat);
                } else {
                    if (iDequeueOutputBuffer >= 0) {
                        throw new RuntimeException("unexpected result from decoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                    }
                    if ((m128113J().flags & 4) != 0) {
                        m130317w(getPlayLoop() - 1);
                        iM130305k = getPlayLoop();
                        getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().m99264z(getPlayLoop());
                        if (getPlayLoop() <= 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z5 = z3;
                    } else {
                        iM130305k = 0;
                    }
                    if (!z5) {
                        m130309o().m183265a(m128113J().presentationTimeUs);
                    }
                    if (this.needYUV) {
                        m128120R(mediaCodec, iDequeueOutputBuffer);
                    }
                    if (z5) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, z2);
                    if (i3 == 0) {
                        mo69828c();
                    }
                    int i5 = i3;
                    getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getPluginManager().m105760c(i5);
                    mo69829d(i5, getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String());
                    i3 = i5 + 1;
                    c21726z0 = C21726z0.INSTANCE;
                    c21726z0.m218092a(str, "decode frameIndex=" + i3);
                    if (iM130305k > 0) {
                        c21726z0.m218092a(str, "Reached EOD, looping");
                        getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getPluginManager().m105763f();
                        extractor.seekTo(0L, 2);
                        mediaCodec.flush();
                        m130309o().m183266b();
                        z6 = true;
                        z4 = false;
                        i3 = 0;
                    } else {
                        z4 = z;
                        z6 = z6;
                    }
                    if (z5) {
                        m128114K(mediaCodec, extractor);
                    }
                }
                z4 = z;
                i3 = i3;
                z6 = z6;
            }
            i = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r12v5, types: [T, android.media.MediaExtractor] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: N */
    public final void m128117N(wtl fileContainer) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            m7y m7yVar = m7y.INSTANCE;
            ?? M157345c = m7yVar.m157345c(fileContainer);
            objectRef.element = M157345c;
            int iM157348f = m7yVar.m157348f(M157345c);
            if (iM157348f < 0) {
                throw new RuntimeException("No video track found");
            }
            ((MediaExtractor) objectRef.element).selectTrack(iM157348f);
            MediaFormat trackFormat = ((MediaExtractor) objectRef.element).getTrackFormat(iM157348f);
            if (trackFormat == null) {
                throw new RuntimeException("format is null");
            }
            if (m7yVar.m157343a(trackFormat) && !m7yVar.m157344b("video/hevc")) {
                mo69826a(10008, "0x8 hevc not support sdk:" + Build.VERSION.SDK_INT + ",support hevc:" + m7yVar.m157344b("video/hevc"));
                m128114K(null, null);
                return;
            }
            this.videoWidth = trackFormat.getInteger("width");
            int integer = trackFormat.getInteger("height");
            this.videoHeight = integer;
            int i = this.videoWidth;
            this.alignWidth = i;
            this.alignHeight = integer;
            C21726z0 c21726z0 = C21726z0.INSTANCE;
            c21726z0.m218095d("AnimPlayer.HardDecoder", "Video size is " + i + " x " + integer);
            boolean z = this.videoWidth % 16 != 0 && getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getEnableVersion1();
            this.needYUV = z;
            try {
                if (!m130314t(z)) {
                    throw new RuntimeException("render create fail");
                }
                m130313s(this.videoWidth, this.videoHeight);
                q4m q4mVarM130307m = getRender();
                if (q4mVarM130307m != null) {
                    SurfaceTexture surfaceTexture = new SurfaceTexture(q4mVarM130307m.mo128148a());
                    surfaceTexture.setOnFrameAvailableListener(this);
                    surfaceTexture.setDefaultBufferSize(this.videoWidth, this.videoHeight);
                    this.glTexture = surfaceTexture;
                    q4mVarM130307m.mo128155h();
                }
                try {
                    String string = trackFormat.getString(IMediaFormat.KEY_MIME);
                    if (string == null) {
                        string = "";
                    }
                    c21726z0.m218095d("AnimPlayer.HardDecoder", "Video MIME is ".concat(string));
                    final ?? CreateDecoderByType = MediaCodec.createDecoderByType(string);
                    if (this.needYUV) {
                        trackFormat.setInteger("color-format", 19);
                        CreateDecoderByType.configure(trackFormat, null, null, 0);
                    } else {
                        Surface surface = new Surface(this.glTexture);
                        this.surface = surface;
                        CreateDecoderByType.configure(trackFormat, surface, null, 0);
                    }
                    CreateDecoderByType.start();
                    Handler handler = getDecodeThread().getHandler();
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: l.dyk
                            @Override // java.lang.Runnable
                            public final void run() {
                                fyk.m128110O(this.f91260a, objectRef, CreateDecoderByType, objectRef2);
                            }
                        });
                    }
                    objectRef2.element = CreateDecoderByType;
                } catch (Throwable th) {
                    C21726z0.INSTANCE.m218094c("AnimPlayer.HardDecoder", "MediaCodec configure exception e=" + th, th);
                    mo69826a(10002, "0x2 MediaCodec exception e=" + th);
                    m128114K((MediaCodec) objectRef2.element, (MediaExtractor) objectRef.element);
                }
            } catch (Throwable th2) {
                mo69826a(10004, "0x4 render create fail e=" + th2);
                m128114K(null, null);
            }
        } catch (Throwable th3) {
            C21726z0.INSTANCE.m218094c("AnimPlayer.HardDecoder", "MediaExtractor exception e=" + th3, th3);
            mo69826a(10001, "0x1 MediaExtractor exception e=" + th3);
            m128114K((MediaCodec) objectRef2.element, (MediaExtractor) objectRef.element);
        }
    }

    /* JADX INFO: renamed from: P */
    public final byte[] m128118P(byte[] yuv420sp) {
        byte[] bArr = new byte[yuv420sp.length];
        int i = this.alignWidth;
        int i2 = this.alignHeight;
        int i3 = i * i2;
        System.arraycopy(yuv420sp, 0, bArr, 0, i * i2);
        int i4 = i3;
        int i5 = i4;
        while (i4 < (i3 * 3) / 2) {
            bArr[i5] = yuv420sp[i4];
            bArr[(i3 / 4) + i5] = yuv420sp[i4 + 1];
            i4 += 2;
            i5++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: Q */
    public final void m128119Q(byte[] src, int srcOffset, int inWidth, int inHeight, byte[] dest, int outWidth, int outHeight) {
        for (int i = 0; i < inHeight; i++) {
            if (i < outHeight) {
                System.arraycopy(src, (i * inWidth) + srcOffset, dest, i * outWidth, outWidth);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m128120R(MediaCodec decoder, int outputIndex) {
        ByteBuffer byteBuffer = decoder.getOutputBuffers()[outputIndex];
        if (byteBuffer != null) {
            byteBuffer.position(0);
            byteBuffer.limit(m128113J().offset + m128113J().size);
            int iRemaining = byteBuffer.remaining();
            byte[] bArrM128118P = new byte[iRemaining];
            byteBuffer.get(bArrM128118P);
            if (iRemaining == 0) {
                return;
            }
            int i = this.videoWidth;
            int i2 = this.videoHeight;
            byte[] bArr = new byte[i * i2];
            byte[] bArr2 = new byte[(i * i2) / 4];
            byte[] bArr3 = new byte[(i * i2) / 4];
            MediaFormat mediaFormat = this.outputFormat;
            if (mediaFormat != null && mediaFormat.getInteger("color-format") == 21) {
                bArrM128118P = m128118P(bArrM128118P);
            }
            byte[] bArr4 = bArrM128118P;
            m128119Q(bArr4, 0, this.alignWidth, this.alignHeight, bArr, this.videoWidth, this.videoHeight);
            int i3 = this.alignWidth;
            int i4 = this.alignHeight;
            m128119Q(bArr4, i3 * i4, i3 / 2, i4 / 2, bArr2, this.videoWidth / 2, this.videoHeight / 2);
            int i5 = this.alignWidth;
            int i6 = this.alignHeight;
            m128119Q(bArr4, ((i5 * i6) * 5) / 4, i5 / 2, i6 / 2, bArr3, this.videoWidth / 2, this.videoHeight / 2);
            q4m q4mVarM130307m = getRender();
            if (q4mVarM130307m != null) {
                q4mVarM130307m.mo128151d(this.videoWidth, this.videoHeight, bArr, bArr2, bArr3);
            }
            m128115L();
        }
    }

    @Override // p153l.gid
    /* JADX INFO: renamed from: h */
    public void mo128121h() {
        if (!getIsRunning()) {
            m128112I();
        } else {
            this.needDestroy = true;
            m130302B();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@Nullable SurfaceTexture surfaceTexture) {
        if (getIsStopReq()) {
            return;
        }
        C21726z0.INSTANCE.m218092a("AnimPlayer.HardDecoder", "onFrameAvailable");
        m128115L();
    }
}
