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
import p149l.n8c;
import tv.danmaku.ijk.media.streamer.StreamProducer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MuxBase implements Runnable, MuxBaseInterface {

    /* JADX INFO: renamed from: b */
    protected MediaFormat f208164b;

    /* JADX INFO: renamed from: c */
    protected MediaCodec f208165c;

    /* JADX INFO: renamed from: e */
    protected ByteBuffer[] f208167e;

    /* JADX INFO: renamed from: i */
    protected Thread f208171i;

    /* JADX INFO: renamed from: q */
    protected SinkBase f208179q;

    /* JADX INFO: renamed from: a */
    public final String f208163a = "MediaCodecAudioMux";

    /* JADX INFO: renamed from: d */
    protected MediaCodec.BufferInfo f208166d = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: f */
    protected ByteBuffer f208168f = null;

    /* JADX INFO: renamed from: g */
    protected int f208169g = -1;

    /* JADX INFO: renamed from: h */
    protected volatile boolean f208170h = false;

    /* JADX INFO: renamed from: j */
    protected ByteBuffer f208172j = null;

    /* JADX INFO: renamed from: k */
    protected ByteBuffer f208173k = null;

    /* JADX INFO: renamed from: l */
    protected byte[] f208174l = null;

    /* JADX INFO: renamed from: m */
    private int f208175m = 500000;

    /* JADX INFO: renamed from: n */
    private long f208176n = 0;

    /* JADX INFO: renamed from: o */
    EncoderFrameRateUpdataListener f208177o = null;

    /* JADX INFO: renamed from: p */
    StreamProducer.PacketBufferlingStatusListener f208178p = null;

    /* JADX INFO: renamed from: r */
    protected Object f208180r = new Object();

    /* JADX INFO: renamed from: s */
    byte[] f208181s = {0, 0, 0, 1, 6, 100, 46};

    /* JADX INFO: renamed from: t */
    String f208182t = "momoa9a427d1andr22";

    /* JADX INFO: renamed from: u */
    String f208183u = WeJson.EMPTY_MAP;

    public interface EncoderFrameRateUpdataListener {
    }

    public MuxBase(MediaCodec mediaCodec, SinkBase sinkBase) {
        this.f208165c = null;
        this.f208167e = null;
        this.f208179q = null;
        this.f208165c = mediaCodec;
        this.f208167e = mediaCodec.getOutputBuffers();
        this.f208179q = sinkBase;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m222138a() {
        JSONObject jSONObject;
        String str = new String(this.f208181s);
        try {
            jSONObject = new JSONObject(this.f208183u);
            if (jSONObject.has(Constants.f57189TS)) {
                jSONObject.remove(Constants.f57189TS);
            }
            jSONObject.put(Constants.f57189TS, System.currentTimeMillis() + this.f208176n);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            this.f208183u = jSONObject.toString();
        }
        short length = (short) this.f208183u.getBytes().length;
        n8c.m158485c("MediaCodecAudioMux", "genSei len :" + ((int) length));
        byte[] bytes = (str + this.f208182t + this.f208183u).getBytes();
        bytes[24] = (byte) (length & 255);
        bytes[23] = (byte) ((length >> 8) & 255);
        bytes[6] = (byte) (((short) (length + 17)) & 255);
        bytes[5] = -27;
        return bytes;
    }

    /* JADX INFO: renamed from: b */
    public boolean m222139b(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 1;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo222130c() throws IOException;

    /* JADX INFO: renamed from: d */
    public void m222140d(int i) {
        m222145i(i, 1);
    }

    /* JADX INFO: renamed from: e */
    public void m222141e(boolean z) {
        m222146j(this.f208175m, 1);
    }

    /* JADX INFO: renamed from: f */
    public void m222142f(EncoderFrameRateUpdataListener encoderFrameRateUpdataListener) {
        this.f208177o = encoderFrameRateUpdataListener;
    }

    /* JADX INFO: renamed from: g */
    public void m222143g(long j) {
        this.f208176n = j - System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public void m222144h(StreamProducer.PacketBufferlingStatusListener packetBufferlingStatusListener) {
        this.f208178p = packetBufferlingStatusListener;
    }

    /* JADX INFO: renamed from: i */
    public void m222145i(int i, int i2) {
        this.f208175m = i;
        m222146j(i, 1);
    }

    /* JADX INFO: renamed from: j */
    public boolean m222146j(int i, int i2) {
        n8c.m158485c("MediaCodecAudioMux", "setRates: " + i);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            MediaCodec mediaCodec = this.f208165c;
            if (mediaCodec == null) {
                return true;
            }
            mediaCodec.setParameters(bundle);
            return true;
        } catch (Error e) {
            n8c.m158486d("MediaCodecAudioMux", "setRates failed not susport", e);
            return false;
        } catch (Exception e2) {
            n8c.m158486d("MediaCodecAudioMux", "setRates failed", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m222147k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f208183u = str;
    }

    /* JADX INFO: renamed from: l */
    public void m222148l() throws IOException {
        if (this.f208171i == null) {
            Thread thread = new Thread(this, "live-media-VideoMux");
            this.f208171i = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m222149m(SinkBase sinkBase) {
        synchronized (this.f208180r) {
            this.f208179q = sinkBase;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        n8c.m158483a("MediaCodecAudioMux", "H264 packetizer started !");
        while (!Thread.interrupted() && !this.f208170h) {
            try {
                mo222130c();
            } catch (IOException unused) {
            }
        }
        n8c.m158483a("MediaCodecAudioMux", "H264 packetizer stopped !");
    }

    public void stop() {
        n8c.m158485c("MediaCodecAudioMux", "stop t");
        this.f208170h = true;
        Thread thread = this.f208171i;
        if (thread != null) {
            try {
                thread.join(2000L);
            } catch (InterruptedException unused) {
                this.f208171i.interrupt();
            }
            this.f208171i = null;
        }
        n8c.m158485c("MediaCodecAudioMux", "stop mWriteTread");
        try {
            n8c.m158485c("MediaCodecAudioMux", "stop mMediaCodec");
            MediaCodec mediaCodec = this.f208165c;
            if (mediaCodec != null) {
                mediaCodec.flush();
                this.f208165c.release();
                this.f208165c = null;
            }
        } catch (Error | Exception unused2) {
        }
        m222149m(null);
        this.f208173k = null;
        this.f208172j = null;
        this.f208174l = null;
    }
}
