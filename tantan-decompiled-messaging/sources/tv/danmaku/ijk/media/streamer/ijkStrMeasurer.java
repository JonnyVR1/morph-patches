package tv.danmaku.ijk.media.streamer;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import com.immomo.mediacore.sink.IjkWriter;
import com.immomo.mediacore.sink.SinkBase;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import com.tencent.ugc.TXRecordCommon;
import java.nio.ByteBuffer;
import java.util.List;
import p149l.n8c;
import tv.danmaku.ijk.media.util.netspeedutil.ResultBean;
import tv.danmaku.ijk.media.util.netspeedutil.SpeedTask;

/* JADX INFO: loaded from: classes3.dex */
public class ijkStrMeasurer implements NotifyCenter, SpeedTask {

    /* JADX INFO: renamed from: a */
    private SinkBase f208871a;

    /* JADX INFO: renamed from: b */
    private int f208872b;

    /* JADX INFO: renamed from: c */
    private int f208873c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f208874d;

    /* JADX INFO: renamed from: e */
    private ByteBuffer f208875e;

    /* JADX INFO: renamed from: f */
    private boolean f208876f;

    /* JADX INFO: renamed from: g */
    private long f208877g;

    /* JADX INFO: renamed from: h */
    private ResultBean f208878h;

    /* JADX INFO: renamed from: i */
    private long f208879i;

    /* JADX INFO: renamed from: j */
    private List<Integer> f208880j;

    /* JADX INFO: renamed from: k */
    private int f208881k;

    /* JADX INFO: renamed from: l */
    private Object f208882l;

    /* JADX INFO: renamed from: m */
    private OnMeasurerFinishedListener f208883m;

    /* JADX INFO: renamed from: n */
    private OnMeasurerIntervalListener f208884n;

    /* JADX INFO: renamed from: o */
    private long f208885o;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.streamer.ijkStrMeasurer$1 */
    class HandlerC225241 extends Handler {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ijkStrMeasurer f208886a;

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            synchronized (this.f208886a.f208882l) {
                try {
                    if (this.f208886a.f208871a != null) {
                        long rtmpSendSize = (int) this.f208886a.f208871a.getRtmpSendSize();
                        int i = (int) (rtmpSendSize - this.f208886a.f208879i);
                        this.f208886a.f208879i = rtmpSendSize;
                        this.f208886a.m222858r(((int) ((i * 8) / (this.f208886a.f208885o / 1000.0f))) / 1000);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (ijkStrMeasurer.m222846f(this.f208886a) > 0) {
                sendEmptyMessageDelayed(1, this.f208886a.f208885o);
            }
        }
    }

    public class MeasureRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        private volatile boolean f208887a;

        /* JADX INFO: renamed from: b */
        private long f208888b;

        /* JADX INFO: renamed from: c */
        private long f208889c;

        /* JADX INFO: renamed from: d */
        private long f208890d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ijkStrMeasurer f208891e;

        @Override // java.lang.Runnable
        public void run() {
            this.f208891e.f208871a.prepare();
            if (this.f208888b == 0) {
                this.f208888b = System.currentTimeMillis();
            }
            while (this.f208891e.f208877g > 0) {
                if (this.f208887a) {
                    n8c.m158483a("ijkStrMeasurer", "MeasureRunnable:" + this.f208887a);
                    break;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f208891e.f208871a != null && this.f208891e.f208876f) {
                    if (this.f208889c == 0) {
                        this.f208889c = System.currentTimeMillis();
                    }
                    this.f208891e.f208871a.writeAudioPacket(System.currentTimeMillis(), this.f208891e.f208874d, this.f208891e.f208872b, 1);
                }
                ijkStrMeasurer.m222847g(this.f208891e, System.currentTimeMillis() - jCurrentTimeMillis);
                try {
                    Thread.sleep(this.f208891e.f208873c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ijkStrMeasurer ijkstrmeasurer = this.f208891e;
                ijkStrMeasurer.m222847g(ijkstrmeasurer, ijkstrmeasurer.f208873c);
                if (this.f208889c != 0 && this.f208891e.f208885o != 0 && System.currentTimeMillis() - this.f208889c >= this.f208891e.f208885o) {
                    int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f208889c);
                    this.f208889c = System.currentTimeMillis();
                    long rtmpSendSize = this.f208891e.f208871a.getRtmpSendSize();
                    ijkStrMeasurer ijkstrmeasurer2 = this.f208891e;
                    if (rtmpSendSize > 0) {
                        int rtmpSendSize2 = (int) (ijkstrmeasurer2.f208871a.getRtmpSendSize() - this.f208890d);
                        this.f208890d = this.f208891e.f208871a.getRtmpSendSize();
                        this.f208891e.m222856p((int) (rtmpSendSize2 / (iCurrentTimeMillis * 1.0f)));
                    } else {
                        ijkstrmeasurer2.m222856p(0);
                    }
                }
            }
            n8c.m158485c("ijkStrMeasurer", "MeasureRunnable exit success：" + (System.currentTimeMillis() - this.f208888b));
            long rtmpSendSize3 = this.f208891e.f208871a.getRtmpSendSize();
            ijkStrMeasurer ijkstrmeasurer3 = this.f208891e;
            if (rtmpSendSize3 > 0) {
                this.f208891e.m222857q(((int) ((((int) ijkstrmeasurer3.f208871a.getRtmpSendSize()) * 1.0f) / ((int) (System.currentTimeMillis() - this.f208888b)))) * TXRecordCommon.AUDIO_SAMPLERATE_8000);
            } else {
                ijkstrmeasurer3.m222857q(0);
            }
            if (this.f208891e.f208871a != null) {
                this.f208891e.f208871a.release();
                this.f208891e.f208871a = null;
            }
        }
    }

    public interface OnMeasurerFinishedListener {
        /* JADX INFO: renamed from: a */
        void m222859a(int i);
    }

    public interface OnMeasurerIntervalListener {
        /* JADX INFO: renamed from: a */
        void m222860a(int i);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m222846f(ijkStrMeasurer ijkstrmeasurer) {
        int i = ijkstrmeasurer.f208881k - 1;
        ijkstrmeasurer.f208881k = i;
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ long m222847g(ijkStrMeasurer ijkstrmeasurer, long j) {
        long j2 = ijkstrmeasurer.f208877g - j;
        ijkstrmeasurer.f208877g = j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m222856p(int i) {
        OnMeasurerIntervalListener onMeasurerIntervalListener = this.f208884n;
        if (onMeasurerIntervalListener != null) {
            onMeasurerIntervalListener.m222860a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m222857q(int i) {
        OnMeasurerFinishedListener onMeasurerFinishedListener = this.f208883m;
        if (onMeasurerFinishedListener != null) {
            onMeasurerFinishedListener.m222859a(i);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public PointF getPreviewScale() {
        return null;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public float getPreviewZoom() {
        return 1.0f;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public int getStreamerCaptureType(int i) {
        return 3;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public int getStreamerType() {
        return 0;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public VideoQuality getVideoQuality() {
        return null;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public Object getWriter() {
        return this.f208871a;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notify(int i, int i2, int i3, Object obj) {
        IjkWriter ijkWriter = (IjkWriter) obj;
        if (i == 100 && ijkWriter == this.f208871a) {
            ijkWriter.writeAudioExtradata(this.f208875e, 4L);
            this.f208876f = true;
        } else if (i == 300) {
            this.f208878h.m222876a(i3);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustAef(int i, boolean z) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustEQ(int i, boolean z) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustEf(int i, int i2) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustTune(int i, boolean z) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEffectReset() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEffectSet(int i, int i2, float f) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEnableExtralAudio(boolean z) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyExtralAudioLoss() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyExtralAudioReady() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyRecording() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyResumeRecording() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyUpdateResolution() {
    }

    /* JADX INFO: renamed from: r */
    public void m222858r(int i) {
        List<Integer> list = this.f208880j;
        if (list != null) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void setSourceSucess() {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void setStreamerCaptureType(int i, int i2) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void startSurroundMusic(String str, int i, long j) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void stopSurroundMusic() {
    }
}
