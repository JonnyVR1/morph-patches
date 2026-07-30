package tv.danmaku.ijk.media.streamer;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import com.immomo.mediacore.sink.IjkWriter;
import com.immomo.mediacore.sink.SinkBase;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import java.nio.ByteBuffer;
import java.util.List;
import l.n8c;
import tv.danmaku.ijk.media.util.netspeedutil.ResultBean;
import tv.danmaku.ijk.media.util.netspeedutil.SpeedTask;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ijkStrMeasurer implements NotifyCenter, SpeedTask {

    /* JADX INFO: renamed from: a */
    private SinkBase f12496a;

    /* JADX INFO: renamed from: b */
    private int f12497b;

    /* JADX INFO: renamed from: c */
    private int f12498c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f12499d;

    /* JADX INFO: renamed from: e */
    private ByteBuffer f12500e;

    /* JADX INFO: renamed from: f */
    private boolean f12501f;

    /* JADX INFO: renamed from: g */
    private long f12502g;

    /* JADX INFO: renamed from: h */
    private ResultBean f12503h;

    /* JADX INFO: renamed from: i */
    private long f12504i;

    /* JADX INFO: renamed from: j */
    private List<Integer> f12505j;

    /* JADX INFO: renamed from: k */
    private int f12506k;

    /* JADX INFO: renamed from: l */
    private Object f12507l;

    /* JADX INFO: renamed from: m */
    private OnMeasurerFinishedListener f12508m;

    /* JADX INFO: renamed from: n */
    private OnMeasurerIntervalListener f12509n;

    /* JADX INFO: renamed from: o */
    private long f12510o;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.streamer.ijkStrMeasurer$1 */
    class HandlerC13171 extends Handler {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ijkStrMeasurer f12511a;

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            synchronized (this.f12511a.f12507l) {
                try {
                    if (this.f12511a.f12496a != null) {
                        long rtmpSendSize = (int) this.f12511a.f12496a.getRtmpSendSize();
                        int i = (int) (rtmpSendSize - this.f12511a.f12504i);
                        this.f12511a.f12504i = rtmpSendSize;
                        this.f12511a.m11329r(((int) ((i * 8) / (this.f12511a.f12510o / 1000.0f))) / 1000);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (ijkStrMeasurer.m11317f(this.f12511a) > 0) {
                sendEmptyMessageDelayed(1, this.f12511a.f12510o);
            }
        }
    }

    public class MeasureRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        private volatile boolean f12512a;

        /* JADX INFO: renamed from: b */
        private long f12513b;

        /* JADX INFO: renamed from: c */
        private long f12514c;

        /* JADX INFO: renamed from: d */
        private long f12515d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ijkStrMeasurer f12516e;

        @Override // java.lang.Runnable
        public void run() {
            this.f12516e.f12496a.prepare();
            if (this.f12513b == 0) {
                this.f12513b = System.currentTimeMillis();
            }
            while (this.f12516e.f12502g > 0) {
                if (this.f12512a) {
                    n8c.a("ijkStrMeasurer", "MeasureRunnable:" + this.f12512a);
                    break;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f12516e.f12496a != null && this.f12516e.f12501f) {
                    if (this.f12514c == 0) {
                        this.f12514c = System.currentTimeMillis();
                    }
                    this.f12516e.f12496a.writeAudioPacket(System.currentTimeMillis(), this.f12516e.f12499d, this.f12516e.f12497b, 1);
                }
                ijkStrMeasurer.m11318g(this.f12516e, System.currentTimeMillis() - jCurrentTimeMillis);
                try {
                    Thread.sleep(this.f12516e.f12498c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ijkStrMeasurer ijkstrmeasurer = this.f12516e;
                ijkStrMeasurer.m11318g(ijkstrmeasurer, ijkstrmeasurer.f12498c);
                if (this.f12514c != 0 && this.f12516e.f12510o != 0 && System.currentTimeMillis() - this.f12514c >= this.f12516e.f12510o) {
                    int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f12514c);
                    this.f12514c = System.currentTimeMillis();
                    long rtmpSendSize = this.f12516e.f12496a.getRtmpSendSize();
                    ijkStrMeasurer ijkstrmeasurer2 = this.f12516e;
                    if (rtmpSendSize > 0) {
                        int rtmpSendSize2 = (int) (ijkstrmeasurer2.f12496a.getRtmpSendSize() - this.f12515d);
                        this.f12515d = this.f12516e.f12496a.getRtmpSendSize();
                        this.f12516e.m11327p((int) (rtmpSendSize2 / (iCurrentTimeMillis * 1.0f)));
                    } else {
                        ijkstrmeasurer2.m11327p(0);
                    }
                }
            }
            n8c.c("ijkStrMeasurer", "MeasureRunnable exit success：" + (System.currentTimeMillis() - this.f12513b));
            long rtmpSendSize3 = this.f12516e.f12496a.getRtmpSendSize();
            ijkStrMeasurer ijkstrmeasurer3 = this.f12516e;
            if (rtmpSendSize3 > 0) {
                this.f12516e.m11328q(((int) ((((int) ijkstrmeasurer3.f12496a.getRtmpSendSize()) * 1.0f) / ((int) (System.currentTimeMillis() - this.f12513b)))) * 8000);
            } else {
                ijkstrmeasurer3.m11328q(0);
            }
            if (this.f12516e.f12496a != null) {
                this.f12516e.f12496a.release();
                this.f12516e.f12496a = null;
            }
        }
    }

    public interface OnMeasurerFinishedListener {
        /* JADX INFO: renamed from: a */
        void m11330a(int i);
    }

    public interface OnMeasurerIntervalListener {
        /* JADX INFO: renamed from: a */
        void m11331a(int i);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m11317f(ijkStrMeasurer ijkstrmeasurer) {
        int i = ijkstrmeasurer.f12506k - 1;
        ijkstrmeasurer.f12506k = i;
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ long m11318g(ijkStrMeasurer ijkstrmeasurer, long j) {
        long j2 = ijkstrmeasurer.f12502g - j;
        ijkstrmeasurer.f12502g = j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m11327p(int i) {
        OnMeasurerIntervalListener onMeasurerIntervalListener = this.f12509n;
        if (onMeasurerIntervalListener != null) {
            onMeasurerIntervalListener.m11331a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m11328q(int i) {
        OnMeasurerFinishedListener onMeasurerFinishedListener = this.f12508m;
        if (onMeasurerFinishedListener != null) {
            onMeasurerFinishedListener.m11330a(i);
        }
    }

    public PointF getPreviewScale() {
        return null;
    }

    public float getPreviewZoom() {
        return 1.0f;
    }

    public int getStreamerCaptureType(int i) {
        return 3;
    }

    public int getStreamerType() {
        return 0;
    }

    public VideoQuality getVideoQuality() {
        return null;
    }

    public Object getWriter() {
        return this.f12496a;
    }

    public void notify(int i, int i2, int i3, Object obj) {
        SinkBase sinkBase = (IjkWriter) obj;
        if (i == 100 && sinkBase == this.f12496a) {
            sinkBase.writeAudioExtradata(this.f12500e, 4L);
            this.f12501f = true;
        } else if (i == 300) {
            this.f12503h.m11347a(i3);
        }
    }

    public void notifyAdjustAef(int i, boolean z) {
    }

    public void notifyAdjustEQ(int i, boolean z) {
    }

    public void notifyAdjustEf(int i, int i2) {
    }

    public void notifyAdjustTune(int i, boolean z) {
    }

    public void notifyEffectReset() {
    }

    public void notifyEffectSet(int i, int i2, float f) {
    }

    public void notifyEnableExtralAudio(boolean z) {
    }

    public void notifyExtralAudioLoss() {
    }

    public void notifyExtralAudioReady() {
    }

    public void notifyRecording() {
    }

    public void notifyResumeRecording() {
    }

    public void notifyUpdateResolution() {
    }

    /* JADX INFO: renamed from: r */
    public void m11329r(int i) {
        List<Integer> list = this.f12505j;
        if (list != null) {
            list.add(Integer.valueOf(i));
        }
    }

    public void setSourceSucess() {
    }

    public void setStreamerCaptureType(int i, int i2) {
    }

    public void startSurroundMusic(String str, int i, long j) {
    }

    public void stopSurroundMusic() {
    }
}
