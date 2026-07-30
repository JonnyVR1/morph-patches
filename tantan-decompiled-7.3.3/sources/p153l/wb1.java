package p153l;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 E2\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010)\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\"\u00107\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00106\u001a\u0004\b7\u0010\u0010\"\u0004\b8\u00109R\"\u0010?\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b:\u0010>R\"\u0010@\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\b@\u0010\u0010\"\u0004\bA\u00109R\"\u0010D\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00106\u001a\u0004\bB\u0010\u0010\"\u0004\bC\u00109¨\u0006F"}, m88121d2 = {"Ll/wb1;", "", "Ll/ap0;", GameIdentity.player, "<init>", "(Ll/ap0;)V", "Ll/wtl;", "fileContainer", "", "h", "(Ll/wtl;)V", "j", "()V", "b", "", "e", "()Z", RXScreenCaptureService.KEY_INDEX, "f", "c", "", "channelCount", Constants.INAPP_DATA_TAG, "(I)I", "a", "Ll/ap0;", "getPlayer", "()Ll/ap0;", "Landroid/media/MediaExtractor;", "Landroid/media/MediaExtractor;", "getExtractor", "()Landroid/media/MediaExtractor;", "setExtractor", "(Landroid/media/MediaExtractor;)V", "extractor", "Landroid/media/MediaCodec;", "Landroid/media/MediaCodec;", "getDecoder", "()Landroid/media/MediaCodec;", "setDecoder", "(Landroid/media/MediaCodec;)V", "decoder", "Landroid/media/AudioTrack;", "Landroid/media/AudioTrack;", "getAudioTrack", "()Landroid/media/AudioTrack;", "setAudioTrack", "(Landroid/media/AudioTrack;)V", "audioTrack", "Ll/oxk;", "Ll/oxk;", "getDecodeThread", "()Ll/oxk;", "decodeThread", "Z", "isRunning", "setRunning", "(Z)V", "g", "I", "getPlayLoop", "()I", "(I)V", "playLoop", "isStopReq", "setStopReq", "getNeedDestroy", "setNeedDestroy", "needDestroy", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wb1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ap0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public MediaExtractor extractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public MediaCodec decoder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public AudioTrack audioTrack;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final oxk decodeThread;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isRunning;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int playLoop;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isStopReq;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean needDestroy;

    public wb1(@NotNull ap0 ap0Var) {
        ap0Var.getClass();
        this.player = ap0Var;
        this.decodeThread = new oxk(null, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m205690a(wb1 wb1Var, wtl wtlVar) {
        try {
            wb1Var.m205698i(wtlVar);
        } catch (Throwable th) {
            C21726z0.INSTANCE.m218094c("AnimPlayer.AudioPlayer", "Audio exception=" + th, th);
            wb1Var.m205695f();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m205691b() {
        if (!this.isRunning) {
            m205692c();
        } else {
            this.needDestroy = true;
            m205699j();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m205692c() {
        if (this.player.getIsDetachedFromWindow()) {
            C21726z0.INSTANCE.m218095d("AnimPlayer.AudioPlayer", "destroyThread");
            Handler handler = this.decodeThread.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            oxk oxkVar = this.decodeThread;
            oxkVar.m169722d(gid.INSTANCE.m130322b(oxkVar.getThread()));
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m205693d(int channelCount) {
        switch (channelCount) {
            case 1:
                return 2;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            default:
                throw new RuntimeException("Unsupported channel count: " + channelCount);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m205694e() {
        return gid.INSTANCE.m130321a(this.decodeThread, "anim_audio_thread");
    }

    /* JADX INFO: renamed from: f */
    public final void m205695f() {
        try {
            MediaCodec mediaCodec = this.decoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                mediaCodec.release();
            }
            this.decoder = null;
            MediaExtractor mediaExtractor = this.extractor;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            this.extractor = null;
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null) {
                audioTrack.pause();
                audioTrack.flush();
                audioTrack.stop();
                audioTrack.release();
            }
            this.audioTrack = null;
        } catch (Throwable th) {
            C21726z0.INSTANCE.m218094c("AnimPlayer.AudioPlayer", "release exception=" + th, th);
        }
        this.isRunning = false;
        if (this.needDestroy) {
            m205692c();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m205696g(int i) {
        this.playLoop = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m205697h(@NotNull final wtl fileContainer) {
        fileContainer.getClass();
        this.isStopReq = false;
        this.needDestroy = false;
        if (m205694e()) {
            if (this.isRunning) {
                m205699j();
            }
            this.isRunning = true;
            Handler handler = this.decodeThread.getHandler();
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.sb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        wb1.m205690a(this.f167098a, fileContainer);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m205698i(wtl fileContainer) throws IOException {
        boolean z;
        int iDequeueInputBuffer;
        m7y m7yVar = m7y.INSTANCE;
        MediaExtractor mediaExtractorM157345c = m7yVar.m157345c(fileContainer);
        this.extractor = mediaExtractorM157345c;
        int iM157347e = m7yVar.m157347e(mediaExtractorM157345c);
        if (iM157347e < 0) {
            C21726z0.INSTANCE.m218093b("AnimPlayer.AudioPlayer", "cannot find audio track");
            m205695f();
            return;
        }
        mediaExtractorM157345c.selectTrack(iM157347e);
        MediaFormat trackFormat = mediaExtractorM157345c.getTrackFormat(iM157347e);
        trackFormat.getClass();
        String string = trackFormat.getString(IMediaFormat.KEY_MIME);
        if (string == null) {
            string = "";
        }
        C21726z0 c21726z0 = C21726z0.INSTANCE;
        c21726z0.m218095d("AnimPlayer.AudioPlayer", "audio mime=".concat(string));
        if (!m7yVar.m157344b(string)) {
            c21726z0.m218093b("AnimPlayer.AudioPlayer", "mime=" + string + " not support");
            m205695f();
            return;
        }
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
        mediaCodecCreateDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
        mediaCodecCreateDecoderByType.start();
        this.decoder = mediaCodecCreateDecoderByType;
        ByteBuffer[] inputBuffers = mediaCodecCreateDecoderByType.getInputBuffers();
        inputBuffers.getClass();
        ByteBuffer[] outputBuffers = mediaCodecCreateDecoderByType.getOutputBuffers();
        outputBuffers.getClass();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int integer = trackFormat.getInteger("sample-rate");
        int iM205693d = m205693d(trackFormat.getInteger("channel-count"));
        char c = 2;
        AudioTrack audioTrack = new AudioTrack(3, integer, iM205693d, 2, AudioTrack.getMinBufferSize(integer, iM205693d, 2), 1);
        this.audioTrack = audioTrack;
        boolean z2 = true;
        if (audioTrack.getState() != 1) {
            m205695f();
            c21726z0.m218093b("AnimPlayer.AudioPlayer", "init audio track failure");
            return;
        }
        audioTrack.play();
        boolean z3 = false;
        ByteBuffer[] outputBuffers2 = outputBuffers;
        while (!this.isStopReq) {
            if (z3 || (iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(1000L)) < 0) {
                z = z2;
            } else {
                ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                byteBuffer.clear();
                int sampleData = mediaExtractorM157345c.readSampleData(byteBuffer, 0);
                if (sampleData < 0) {
                    z = z2;
                    mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    z3 = z;
                } else {
                    z = z2;
                    mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, 0L, 0);
                    mediaExtractorM157345c.advance();
                }
            }
            int iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -2) {
                outputBuffers2 = mediaCodecCreateDecoderByType.getOutputBuffers();
                outputBuffers2.getClass();
            }
            if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer2 = outputBuffers2[iDequeueOutputBuffer];
                byte[] bArr = new byte[bufferInfo.size];
                byteBuffer2.get(bArr);
                byteBuffer2.clear();
                audioTrack.write(bArr, 0, bufferInfo.size);
                mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
            if (z3 && (bufferInfo.flags & 4) != 0) {
                int i = this.playLoop - 1;
                this.playLoop = i;
                if (i <= 0) {
                    C21726z0.INSTANCE.m218095d("AnimPlayer.AudioPlayer", "decode finish");
                    m205695f();
                    break;
                } else {
                    C21726z0.INSTANCE.m218092a("AnimPlayer.AudioPlayer", "Reached EOS, looping -> playLoop");
                    c = 2;
                    mediaExtractorM157345c.seekTo(0L, 2);
                    mediaCodecCreateDecoderByType.flush();
                    z3 = false;
                }
            } else {
                c = 2;
            }
            z2 = z;
        }
        m205695f();
    }

    /* JADX INFO: renamed from: j */
    public final void m205699j() {
        this.isStopReq = true;
    }
}
