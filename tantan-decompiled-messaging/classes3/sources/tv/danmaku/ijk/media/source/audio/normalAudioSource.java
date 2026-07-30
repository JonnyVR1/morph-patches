package tv.danmaku.ijk.media.source.audio;

import android.media.AudioRecord;
import android.os.Process;
import android.view.Surface;
import com.immomo.mediacore.audio.AudioProcess;
import com.immomo.mediacore.audio.AudioQuality;
import l.mpd0;
import l.n8c;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class normalAudioSource extends audioSource {

    /* JADX INFO: renamed from: f */
    private AudioRecordRunnable f12018f;

    /* JADX INFO: renamed from: k */
    private Thread f12023k;

    /* JADX INFO: renamed from: g */
    private int f12019g = 1024;

    /* JADX INFO: renamed from: h */
    private volatile boolean f12020h = true;

    /* JADX INFO: renamed from: i */
    private long f12021i = 0;

    /* JADX INFO: renamed from: j */
    private AudioRecord f12022j = null;

    /* JADX INFO: renamed from: l */
    private byte[] f12024l = null;

    public class AudioRecordRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        int f12025a;

        /* JADX INFO: renamed from: b */
        int f12026b;

        /* JADX INFO: renamed from: c */
        AudioProcess f12027c;

        /* JADX INFO: renamed from: d */
        Surface f12028d;

        /* JADX INFO: renamed from: e */
        private Object f12029e;

        /* JADX INFO: renamed from: f */
        public boolean f12030f;

        private AudioRecordRunnable() {
            this.f12026b = 0;
            this.f12027c = null;
            this.f12028d = null;
            this.f12029e = new Object();
            this.f12030f = false;
            AudioQuality audioQuality = normalAudioSource.this.f12014b;
            audioQuality.samplingRate = 44100;
            audioQuality.bitRate = 64000;
            int i = (((44100 * EACTags.COMPATIBLE_TAG_ALLOCATION_AUTHORITY) / 1000) * 32) >> 3;
            int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2) * 16;
            try {
                normalAudioSource.this.f12022j = new AudioRecord(1, normalAudioSource.this.f12014b.samplingRate, 16, 2, i < minBufferSize ? minBufferSize : i);
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: a */
        public void m10821a(AudioProcess audioProcess) {
            synchronized (this.f12029e) {
                this.f12027c = audioProcess;
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0053 -> B:12:0x0053). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (normalAudioSource.this.f12022j != null) {
                while (normalAudioSource.this.f12022j.getState() == 0 && this.f12026b < 5) {
                    try {
                        Thread.sleep(100L);
                        this.f12026b++;
                        n8c.c("streamerCameraProducer", "mAudioRecord.getState " + normalAudioSource.this.f12022j.getState());
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    normalAudioSource.this.f12022j.startRecording();
                } catch (Exception unused2) {
                }
                while (!Thread.interrupted() && normalAudioSource.this.f12020h) {
                    synchronized (this.f12029e) {
                    }
                    normalAudioSource normalaudiosource = normalAudioSource.this;
                    normalaudiosource.f12024l = new byte[normalaudiosource.f12019g];
                    n8c.c("streamerCameraProducer", "allocatebuff mAudioFrame" + normalAudioSource.this.f12019g);
                    this.f12025a = normalAudioSource.this.f12022j.read(normalAudioSource.this.f12024l, 0, normalAudioSource.this.f12019g);
                    n8c.c("streamerCameraProducer", "this.audioRecord.read size" + this.f12025a);
                    if (this.f12025a <= 0) {
                        break;
                    }
                    synchronized (this.f12029e) {
                        try {
                            AudioProcess audioProcess = this.f12027c;
                            if (audioProcess != null) {
                                audioProcess.putAudioData(new mpd0(normalAudioSource.this.f12024l, System.nanoTime() / 1000, normalAudioSource.this.f12014b.channelNum));
                                normalAudioSource.m10819k(normalAudioSource.this);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                n8c.c("streamerCameraProducer", " mAudioRecord.stop() and release");
                if (normalAudioSource.this.f12022j != null) {
                    try {
                        normalAudioSource.this.f12022j.release();
                        normalAudioSource.this.f12022j = null;
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ long m10819k(normalAudioSource normalaudiosource) {
        long j = normalaudiosource.f12021i;
        normalaudiosource.f12021i = 1 + j;
        return j;
    }

    @Override // tv.danmaku.ijk.media.source.audio.audioSource
    /* JADX INFO: renamed from: d */
    public void mo10812d() {
        m10820l();
        this.f12020h = true;
        if (this.f12018f == null) {
            this.f12018f = new AudioRecordRunnable();
        }
        if (this.f12023k == null) {
            Thread thread = new Thread(this.f12018f, "live-media-AudRec");
            this.f12023k = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m10820l() {
        AudioRecordRunnable audioRecordRunnable = this.f12018f;
        if (audioRecordRunnable != null) {
            audioRecordRunnable.m10821a(null);
        }
        if (this.f12023k != null) {
            try {
                this.f12020h = false;
                this.f12023k.join();
            } catch (InterruptedException unused) {
                this.f12023k.interrupt();
            }
            this.f12023k = null;
        }
        this.f12018f = null;
    }
}
