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
import p153l.t9c;
import tv.danmaku.ijk.media.util.netspeedutil.ResultBean;
import tv.danmaku.ijk.media.util.netspeedutil.SpeedTask;

/* JADX INFO: loaded from: classes3.dex */
public class ijkStrMeasurer implements NotifyCenter, SpeedTask {

    /* JADX INFO: renamed from: a */
    private SinkBase f209793a;

    /* JADX INFO: renamed from: b */
    private int f209794b;

    /* JADX INFO: renamed from: c */
    private int f209795c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f209796d;

    /* JADX INFO: renamed from: e */
    private ByteBuffer f209797e;

    /* JADX INFO: renamed from: f */
    private boolean f209798f;

    /* JADX INFO: renamed from: g */
    private long f209799g;

    /* JADX INFO: renamed from: h */
    private ResultBean f209800h;

    /* JADX INFO: renamed from: i */
    private long f209801i;

    /* JADX INFO: renamed from: j */
    private List<Integer> f209802j;

    /* JADX INFO: renamed from: k */
    private int f209803k;

    /* JADX INFO: renamed from: l */
    private Object f209804l;

    /* JADX INFO: renamed from: m */
    private OnMeasurerFinishedListener f209805m;

    /* JADX INFO: renamed from: n */
    private OnMeasurerIntervalListener f209806n;

    /* JADX INFO: renamed from: o */
    private long f209807o;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.streamer.ijkStrMeasurer$1 */
    class HandlerC226391 extends Handler {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ijkStrMeasurer f209808a;

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            synchronized (this.f209808a.f209804l) {
                try {
                    if (this.f209808a.f209793a != null) {
                        long rtmpSendSize = (int) this.f209808a.f209793a.getRtmpSendSize();
                        int i = (int) (rtmpSendSize - this.f209808a.f209801i);
                        this.f209808a.f209801i = rtmpSendSize;
                        this.f209808a.m224104r(((int) ((i * 8) / (this.f209808a.f209807o / 1000.0f))) / 1000);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (ijkStrMeasurer.m224092f(this.f209808a) > 0) {
                sendEmptyMessageDelayed(1, this.f209808a.f209807o);
            }
        }
    }

    public class MeasureRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        private volatile boolean f209809a;

        /* JADX INFO: renamed from: b */
        private long f209810b;

        /* JADX INFO: renamed from: c */
        private long f209811c;

        /* JADX INFO: renamed from: d */
        private long f209812d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ijkStrMeasurer f209813e;

        @Override // java.lang.Runnable
        public void run() {
            this.f209813e.f209793a.prepare();
            if (this.f209810b == 0) {
                this.f209810b = System.currentTimeMillis();
            }
            while (this.f209813e.f209799g > 0) {
                if (this.f209809a) {
                    t9c.m189743a("ijkStrMeasurer", "MeasureRunnable:" + this.f209809a);
                    break;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f209813e.f209793a != null && this.f209813e.f209798f) {
                    if (this.f209811c == 0) {
                        this.f209811c = System.currentTimeMillis();
                    }
                    this.f209813e.f209793a.writeAudioPacket(System.currentTimeMillis(), this.f209813e.f209796d, this.f209813e.f209794b, 1);
                }
                ijkStrMeasurer.m224093g(this.f209813e, System.currentTimeMillis() - jCurrentTimeMillis);
                try {
                    Thread.sleep(this.f209813e.f209795c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ijkStrMeasurer ijkstrmeasurer = this.f209813e;
                ijkStrMeasurer.m224093g(ijkstrmeasurer, ijkstrmeasurer.f209795c);
                if (this.f209811c != 0 && this.f209813e.f209807o != 0 && System.currentTimeMillis() - this.f209811c >= this.f209813e.f209807o) {
                    int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f209811c);
                    this.f209811c = System.currentTimeMillis();
                    long rtmpSendSize = this.f209813e.f209793a.getRtmpSendSize();
                    ijkStrMeasurer ijkstrmeasurer2 = this.f209813e;
                    if (rtmpSendSize > 0) {
                        int rtmpSendSize2 = (int) (ijkstrmeasurer2.f209793a.getRtmpSendSize() - this.f209812d);
                        this.f209812d = this.f209813e.f209793a.getRtmpSendSize();
                        this.f209813e.m224102p((int) (rtmpSendSize2 / (iCurrentTimeMillis * 1.0f)));
                    } else {
                        ijkstrmeasurer2.m224102p(0);
                    }
                }
            }
            t9c.m189745c("ijkStrMeasurer", "MeasureRunnable exit success：" + (System.currentTimeMillis() - this.f209810b));
            long rtmpSendSize3 = this.f209813e.f209793a.getRtmpSendSize();
            ijkStrMeasurer ijkstrmeasurer3 = this.f209813e;
            if (rtmpSendSize3 > 0) {
                this.f209813e.m224103q(((int) ((((int) ijkstrmeasurer3.f209793a.getRtmpSendSize()) * 1.0f) / ((int) (System.currentTimeMillis() - this.f209810b)))) * TXRecordCommon.AUDIO_SAMPLERATE_8000);
            } else {
                ijkstrmeasurer3.m224103q(0);
            }
            if (this.f209813e.f209793a != null) {
                this.f209813e.f209793a.release();
                this.f209813e.f209793a = null;
            }
        }
    }

    public interface OnMeasurerFinishedListener {
        /* JADX INFO: renamed from: a */
        void m224105a(int i);
    }

    public interface OnMeasurerIntervalListener {
        /* JADX INFO: renamed from: a */
        void m224106a(int i);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m224092f(ijkStrMeasurer ijkstrmeasurer) {
        int i = ijkstrmeasurer.f209803k - 1;
        ijkstrmeasurer.f209803k = i;
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ long m224093g(ijkStrMeasurer ijkstrmeasurer, long j) {
        long j2 = ijkstrmeasurer.f209799g - j;
        ijkstrmeasurer.f209799g = j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m224102p(int i) {
        OnMeasurerIntervalListener onMeasurerIntervalListener = this.f209806n;
        if (onMeasurerIntervalListener != null) {
            onMeasurerIntervalListener.m224106a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m224103q(int i) {
        OnMeasurerFinishedListener onMeasurerFinishedListener = this.f209805m;
        if (onMeasurerFinishedListener != null) {
            onMeasurerFinishedListener.m224105a(i);
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
        return this.f209793a;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notify(int i, int i2, int i3, Object obj) {
        IjkWriter ijkWriter = (IjkWriter) obj;
        if (i == 100 && ijkWriter == this.f209793a) {
            ijkWriter.writeAudioExtradata(this.f209797e, 4L);
            this.f209798f = true;
        } else if (i == 300) {
            this.f209800h.m224122a(i3);
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
    public void m224104r(int i) {
        List<Integer> list = this.f209802j;
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
