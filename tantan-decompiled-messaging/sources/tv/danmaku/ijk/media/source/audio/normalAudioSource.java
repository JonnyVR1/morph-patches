package tv.danmaku.ijk.media.source.audio;

import android.media.AudioRecord;
import android.os.Process;
import android.view.Surface;
import com.immomo.mediacore.audio.AudioProcess;
import com.immomo.mediacore.audio.AudioQuality;
import p149l.mpd0;
import p149l.n8c;

/* JADX INFO: loaded from: classes3.dex */
public class normalAudioSource extends audioSource {

    /* JADX INFO: renamed from: f */
    private AudioRecordRunnable f208393f;

    /* JADX INFO: renamed from: k */
    private Thread f208398k;

    /* JADX INFO: renamed from: g */
    private int f208394g = 1024;

    /* JADX INFO: renamed from: h */
    private volatile boolean f208395h = true;

    /* JADX INFO: renamed from: i */
    private long f208396i = 0;

    /* JADX INFO: renamed from: j */
    private AudioRecord f208397j = null;

    /* JADX INFO: renamed from: l */
    private byte[] f208399l = null;

    public class AudioRecordRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        int f208400a;

        /* JADX INFO: renamed from: b */
        int f208401b;

        /* JADX INFO: renamed from: c */
        AudioProcess f208402c;

        /* JADX INFO: renamed from: d */
        Surface f208403d;

        /* JADX INFO: renamed from: e */
        private Object f208404e;

        /* JADX INFO: renamed from: f */
        public boolean f208405f;

        private AudioRecordRunnable() {
            this.f208401b = 0;
            this.f208402c = null;
            this.f208403d = null;
            this.f208404e = new Object();
            this.f208405f = false;
            AudioQuality audioQuality = normalAudioSource.this.f208389b;
            audioQuality.samplingRate = 44100;
            audioQuality.bitRate = 64000;
            int i = (((44100 * 120) / 1000) * 32) >> 3;
            int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2) * 16;
            try {
                normalAudioSource.this.f208397j = new AudioRecord(1, normalAudioSource.this.f208389b.samplingRate, 16, 2, i < minBufferSize ? minBufferSize : i);
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: a */
        public void m222350a(AudioProcess audioProcess) {
            synchronized (this.f208404e) {
                this.f208402c = audioProcess;
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0053 -> B:12:0x0053). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (normalAudioSource.this.f208397j != null) {
                while (normalAudioSource.this.f208397j.getState() == 0 && this.f208401b < 5) {
                    try {
                        Thread.sleep(100L);
                        this.f208401b++;
                        n8c.m158485c("streamerCameraProducer", "mAudioRecord.getState " + normalAudioSource.this.f208397j.getState());
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    normalAudioSource.this.f208397j.startRecording();
                } catch (Exception unused2) {
                }
                while (!Thread.interrupted() && normalAudioSource.this.f208395h) {
                    synchronized (this.f208404e) {
                    }
                    normalAudioSource normalaudiosource = normalAudioSource.this;
                    normalaudiosource.f208399l = new byte[normalaudiosource.f208394g];
                    n8c.m158485c("streamerCameraProducer", "allocatebuff mAudioFrame" + normalAudioSource.this.f208394g);
                    this.f208400a = normalAudioSource.this.f208397j.read(normalAudioSource.this.f208399l, 0, normalAudioSource.this.f208394g);
                    n8c.m158485c("streamerCameraProducer", "this.audioRecord.read size" + this.f208400a);
                    if (this.f208400a <= 0) {
                        break;
                    }
                    synchronized (this.f208404e) {
                        try {
                            AudioProcess audioProcess = this.f208402c;
                            if (audioProcess != null) {
                                audioProcess.putAudioData(new mpd0(normalAudioSource.this.f208399l, System.nanoTime() / 1000, normalAudioSource.this.f208389b.channelNum));
                                normalAudioSource.m222348k(normalAudioSource.this);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                n8c.m158485c("streamerCameraProducer", " mAudioRecord.stop() and release");
                if (normalAudioSource.this.f208397j != null) {
                    try {
                        normalAudioSource.this.f208397j.release();
                        normalAudioSource.this.f208397j = null;
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ long m222348k(normalAudioSource normalaudiosource) {
        long j = normalaudiosource.f208396i;
        normalaudiosource.f208396i = 1 + j;
        return j;
    }

    @Override // tv.danmaku.ijk.media.source.audio.audioSource
    /* JADX INFO: renamed from: d */
    public void mo222341d() {
        m222349l();
        this.f208395h = true;
        if (this.f208393f == null) {
            this.f208393f = new AudioRecordRunnable();
        }
        if (this.f208398k == null) {
            Thread thread = new Thread(this.f208393f, "live-media-AudRec");
            this.f208398k = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m222349l() {
        AudioRecordRunnable audioRecordRunnable = this.f208393f;
        if (audioRecordRunnable != null) {
            audioRecordRunnable.m222350a(null);
        }
        if (this.f208398k != null) {
            try {
                this.f208395h = false;
                this.f208398k.join();
            } catch (InterruptedException unused) {
                this.f208398k.interrupt();
            }
            this.f208398k = null;
        }
        this.f208393f = null;
    }
}
