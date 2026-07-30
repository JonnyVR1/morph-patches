package tv.danmaku.ijk.media.processing.encodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.text.TextUtils;
import com.immomo.mediacore.sink.SinkBase;
import com.tencent.connect.common.Constants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.json.JSONObject;
import p153l.t9c;
import tv.danmaku.ijk.media.streamer.StreamProducer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MuxBase implements Runnable, MuxBaseInterface {

    /* JADX INFO: renamed from: b */
    protected MediaFormat f209086b;

    /* JADX INFO: renamed from: c */
    protected MediaCodec f209087c;

    /* JADX INFO: renamed from: e */
    protected ByteBuffer[] f209089e;

    /* JADX INFO: renamed from: i */
    protected Thread f209093i;

    /* JADX INFO: renamed from: q */
    protected SinkBase f209101q;

    /* JADX INFO: renamed from: a */
    public final String f209085a = "MediaCodecAudioMux";

    /* JADX INFO: renamed from: d */
    protected MediaCodec.BufferInfo f209088d = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: f */
    protected ByteBuffer f209090f = null;

    /* JADX INFO: renamed from: g */
    protected int f209091g = -1;

    /* JADX INFO: renamed from: h */
    protected volatile boolean f209092h = false;

    /* JADX INFO: renamed from: j */
    protected ByteBuffer f209094j = null;

    /* JADX INFO: renamed from: k */
    protected ByteBuffer f209095k = null;

    /* JADX INFO: renamed from: l */
    protected byte[] f209096l = null;

    /* JADX INFO: renamed from: m */
    private int f209097m = 500000;

    /* JADX INFO: renamed from: n */
    private long f209098n = 0;

    /* JADX INFO: renamed from: o */
    EncoderFrameRateUpdataListener f209099o = null;

    /* JADX INFO: renamed from: p */
    StreamProducer.PacketBufferlingStatusListener f209100p = null;

    /* JADX INFO: renamed from: r */
    protected Object f209102r = new Object();

    /* JADX INFO: renamed from: s */
    byte[] f209103s = {0, 0, 0, 1, 6, 100, 46};

    /* JADX INFO: renamed from: t */
    String f209104t = "momoa9a427d1andr22";

    /* JADX INFO: renamed from: u */
    String f209105u = WeJson.EMPTY_MAP;

    public interface EncoderFrameRateUpdataListener {
    }

    public MuxBase(MediaCodec mediaCodec, SinkBase sinkBase) {
        this.f209087c = null;
        this.f209089e = null;
        this.f209101q = null;
        this.f209087c = mediaCodec;
        this.f209089e = mediaCodec.getOutputBuffers();
        this.f209101q = sinkBase;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m223384a() {
        JSONObject jSONObject;
        String str = new String(this.f209103s);
        try {
            jSONObject = new JSONObject(this.f209105u);
            if (jSONObject.has(Constants.f58037TS)) {
                jSONObject.remove(Constants.f58037TS);
            }
            jSONObject.put(Constants.f58037TS, System.currentTimeMillis() + this.f209098n);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            this.f209105u = jSONObject.toString();
        }
        short length = (short) this.f209105u.getBytes().length;
        t9c.m189745c("MediaCodecAudioMux", "genSei len :" + ((int) length));
        byte[] bytes = (str + this.f209104t + this.f209105u).getBytes();
        bytes[24] = (byte) (length & 255);
        bytes[23] = (byte) ((length >> 8) & 255);
        bytes[6] = (byte) (((short) (length + 17)) & 255);
        bytes[5] = -27;
        return bytes;
    }

    /* JADX INFO: renamed from: b */
    public boolean m223385b(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 1;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo223376c() throws IOException;

    /* JADX INFO: renamed from: d */
    public void m223386d(int i) {
        m223391i(i, 1);
    }

    /* JADX INFO: renamed from: e */
    public void m223387e(boolean z) {
        m223392j(this.f209097m, 1);
    }

    /* JADX INFO: renamed from: f */
    public void m223388f(EncoderFrameRateUpdataListener encoderFrameRateUpdataListener) {
        this.f209099o = encoderFrameRateUpdataListener;
    }

    /* JADX INFO: renamed from: g */
    public void m223389g(long j) {
        this.f209098n = j - System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public void m223390h(StreamProducer.PacketBufferlingStatusListener packetBufferlingStatusListener) {
        this.f209100p = packetBufferlingStatusListener;
    }

    /* JADX INFO: renamed from: i */
    public void m223391i(int i, int i2) {
        this.f209097m = i;
        m223392j(i, 1);
    }

    /* JADX INFO: renamed from: j */
    public boolean m223392j(int i, int i2) {
        t9c.m189745c("MediaCodecAudioMux", "setRates: " + i);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            MediaCodec mediaCodec = this.f209087c;
            if (mediaCodec == null) {
                return true;
            }
            mediaCodec.setParameters(bundle);
            return true;
        } catch (Error e) {
            t9c.m189746d("MediaCodecAudioMux", "setRates failed not susport", e);
            return false;
        } catch (Exception e2) {
            t9c.m189746d("MediaCodecAudioMux", "setRates failed", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m223393k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f209105u = str;
    }

    /* JADX INFO: renamed from: l */
    public void m223394l() throws IOException {
        if (this.f209093i == null) {
            Thread thread = new Thread(this, "live-media-VideoMux");
            this.f209093i = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m223395m(SinkBase sinkBase) {
        synchronized (this.f209102r) {
            this.f209101q = sinkBase;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        t9c.m189743a("MediaCodecAudioMux", "H264 packetizer started !");
        while (!Thread.interrupted() && !this.f209092h) {
            try {
                mo223376c();
            } catch (IOException unused) {
            }
        }
        t9c.m189743a("MediaCodecAudioMux", "H264 packetizer stopped !");
    }

    public void stop() {
        t9c.m189745c("MediaCodecAudioMux", "stop t");
        this.f209092h = true;
        Thread thread = this.f209093i;
        if (thread != null) {
            try {
                thread.join(2000L);
            } catch (InterruptedException unused) {
                this.f209093i.interrupt();
            }
            this.f209093i = null;
        }
        t9c.m189745c("MediaCodecAudioMux", "stop mWriteTread");
        try {
            t9c.m189745c("MediaCodecAudioMux", "stop mMediaCodec");
            MediaCodec mediaCodec = this.f209087c;
            if (mediaCodec != null) {
                mediaCodec.flush();
                this.f209087c.release();
                this.f209087c = null;
            }
        } catch (Error | Exception unused2) {
        }
        m223395m(null);
        this.f209095k = null;
        this.f209094j = null;
        this.f209096l = null;
    }
}
