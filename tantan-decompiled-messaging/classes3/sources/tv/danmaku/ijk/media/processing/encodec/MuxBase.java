package tv.danmaku.ijk.media.processing.encodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.text.TextUtils;
import com.immomo.mediacore.sink.SinkBase;
import java.io.IOException;
import java.nio.ByteBuffer;
import l.n8c;
import org.json.JSONObject;
import tv.danmaku.ijk.media.streamer.StreamProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class MuxBase implements Runnable, MuxBaseInterface {

    /* JADX INFO: renamed from: b */
    protected MediaFormat f11789b;

    /* JADX INFO: renamed from: c */
    protected MediaCodec f11790c;

    /* JADX INFO: renamed from: e */
    protected ByteBuffer[] f11792e;

    /* JADX INFO: renamed from: i */
    protected Thread f11796i;

    /* JADX INFO: renamed from: q */
    protected SinkBase f11804q;

    /* JADX INFO: renamed from: a */
    public final String f11788a = "MediaCodecAudioMux";

    /* JADX INFO: renamed from: d */
    protected MediaCodec.BufferInfo f11791d = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: f */
    protected ByteBuffer f11793f = null;

    /* JADX INFO: renamed from: g */
    protected int f11794g = -1;

    /* JADX INFO: renamed from: h */
    protected volatile boolean f11795h = false;

    /* JADX INFO: renamed from: j */
    protected ByteBuffer f11797j = null;

    /* JADX INFO: renamed from: k */
    protected ByteBuffer f11798k = null;

    /* JADX INFO: renamed from: l */
    protected byte[] f11799l = null;

    /* JADX INFO: renamed from: m */
    private int f11800m = 500000;

    /* JADX INFO: renamed from: n */
    private long f11801n = 0;

    /* JADX INFO: renamed from: o */
    EncoderFrameRateUpdataListener f11802o = null;

    /* JADX INFO: renamed from: p */
    StreamProducer.PacketBufferlingStatusListener f11803p = null;

    /* JADX INFO: renamed from: r */
    protected Object f11805r = new Object();

    /* JADX INFO: renamed from: s */
    byte[] f11806s = {0, 0, 0, 1, 6, 100, 46};

    /* JADX INFO: renamed from: t */
    String f11807t = "momoa9a427d1andr22";

    /* JADX INFO: renamed from: u */
    String f11808u = "{}";

    public interface EncoderFrameRateUpdataListener {
    }

    public MuxBase(MediaCodec mediaCodec, SinkBase sinkBase) {
        this.f11790c = null;
        this.f11792e = null;
        this.f11804q = null;
        this.f11790c = mediaCodec;
        this.f11792e = mediaCodec.getOutputBuffers();
        this.f11804q = sinkBase;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m10609a() {
        JSONObject jSONObject;
        String str = new String(this.f11806s);
        try {
            jSONObject = new JSONObject(this.f11808u);
            if (jSONObject.has("ts")) {
                jSONObject.remove("ts");
            }
            jSONObject.put("ts", System.currentTimeMillis() + this.f11801n);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            this.f11808u = jSONObject.toString();
        }
        short length = (short) this.f11808u.getBytes().length;
        n8c.c("MediaCodecAudioMux", "genSei len :" + ((int) length));
        byte[] bytes = (str + this.f11807t + this.f11808u).getBytes();
        bytes[24] = (byte) (length & 255);
        bytes[23] = (byte) ((length >> 8) & 255);
        bytes[6] = (byte) (((short) (length + 17)) & 255);
        bytes[5] = -27;
        return bytes;
    }

    /* JADX INFO: renamed from: b */
    public boolean m10610b(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 1;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo10601c() throws IOException;

    /* JADX INFO: renamed from: d */
    public void m10611d(int i) {
        m10616i(i, 1);
    }

    /* JADX INFO: renamed from: e */
    public void m10612e(boolean z) {
        m10617j(this.f11800m, 1);
    }

    /* JADX INFO: renamed from: f */
    public void m10613f(EncoderFrameRateUpdataListener encoderFrameRateUpdataListener) {
        this.f11802o = encoderFrameRateUpdataListener;
    }

    /* JADX INFO: renamed from: g */
    public void m10614g(long j) {
        this.f11801n = j - System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public void m10615h(StreamProducer.PacketBufferlingStatusListener packetBufferlingStatusListener) {
        this.f11803p = packetBufferlingStatusListener;
    }

    /* JADX INFO: renamed from: i */
    public void m10616i(int i, int i2) {
        this.f11800m = i;
        m10617j(i, 1);
    }

    /* JADX INFO: renamed from: j */
    public boolean m10617j(int i, int i2) {
        n8c.c("MediaCodecAudioMux", "setRates: " + i);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            MediaCodec mediaCodec = this.f11790c;
            if (mediaCodec == null) {
                return true;
            }
            mediaCodec.setParameters(bundle);
            return true;
        } catch (Error e) {
            n8c.d("MediaCodecAudioMux", "setRates failed not susport", e);
            return false;
        } catch (Exception e2) {
            n8c.d("MediaCodecAudioMux", "setRates failed", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m10618k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11808u = str;
    }

    /* JADX INFO: renamed from: l */
    public void m10619l() throws IOException {
        if (this.f11796i == null) {
            Thread thread = new Thread(this, "live-media-VideoMux");
            this.f11796i = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m10620m(SinkBase sinkBase) {
        synchronized (this.f11805r) {
            this.f11804q = sinkBase;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        n8c.a("MediaCodecAudioMux", "H264 packetizer started !");
        while (!Thread.interrupted() && !this.f11795h) {
            try {
                mo10601c();
            } catch (IOException unused) {
            }
        }
        n8c.a("MediaCodecAudioMux", "H264 packetizer stopped !");
    }

    public void stop() {
        n8c.c("MediaCodecAudioMux", "stop t");
        this.f11795h = true;
        Thread thread = this.f11796i;
        if (thread != null) {
            try {
                thread.join(2000L);
            } catch (InterruptedException unused) {
                this.f11796i.interrupt();
            }
            this.f11796i = null;
        }
        n8c.c("MediaCodecAudioMux", "stop mWriteTread");
        try {
            n8c.c("MediaCodecAudioMux", "stop mMediaCodec");
            MediaCodec mediaCodec = this.f11790c;
            if (mediaCodec != null) {
                mediaCodec.flush();
                this.f11790c.release();
                this.f11790c = null;
            }
        } catch (Error | Exception unused2) {
        }
        m10620m(null);
        this.f11798k = null;
        this.f11797j = null;
        this.f11799l = null;
    }
}
