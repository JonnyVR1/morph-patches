package tv.danmaku.ijk.media.source.audio;

import android.media.AudioRecord;
import android.os.Process;
import android.view.Surface;
import com.immomo.mediacore.audio.AudioProcess;
import com.immomo.mediacore.audio.AudioQuality;
import p153l.oxd0;
import p153l.t9c;

/* JADX INFO: loaded from: classes3.dex */
public class normalAudioSource extends audioSource {

    /* JADX INFO: renamed from: f */
    private AudioRecordRunnable f209315f;

    /* JADX INFO: renamed from: k */
    private Thread f209320k;

    /* JADX INFO: renamed from: g */
    private int f209316g = 1024;

    /* JADX INFO: renamed from: h */
    private volatile boolean f209317h = true;

    /* JADX INFO: renamed from: i */
    private long f209318i = 0;

    /* JADX INFO: renamed from: j */
    private AudioRecord f209319j = null;

    /* JADX INFO: renamed from: l */
    private byte[] f209321l = null;

    public class AudioRecordRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        int f209322a;

        /* JADX INFO: renamed from: b */
        int f209323b;

        /* JADX INFO: renamed from: c */
        AudioProcess f209324c;

        /* JADX INFO: renamed from: d */
        Surface f209325d;

        /* JADX INFO: renamed from: e */
        private Object f209326e;

        /* JADX INFO: renamed from: f */
        public boolean f209327f;

        private AudioRecordRunnable() {
            this.f209323b = 0;
            this.f209324c = null;
            this.f209325d = null;
            this.f209326e = new Object();
            this.f209327f = false;
            AudioQuality audioQuality = normalAudioSource.this.f209311b;
            audioQuality.samplingRate = 44100;
            audioQuality.bitRate = 64000;
            int i = (((44100 * 120) / 1000) * 32) >> 3;
            int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2) * 16;
            try {
                normalAudioSource.this.f209319j = new AudioRecord(1, normalAudioSource.this.f209311b.samplingRate, 16, 2, i < minBufferSize ? minBufferSize : i);
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: a */
        public void m223596a(AudioProcess audioProcess) {
            synchronized (this.f209326e) {
                this.f209324c = audioProcess;
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0053 -> B:12:0x0053). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (normalAudioSource.this.f209319j != null) {
                while (normalAudioSource.this.f209319j.getState() == 0 && this.f209323b < 5) {
                    try {
                        Thread.sleep(100L);
                        this.f209323b++;
                        t9c.m189745c("streamerCameraProducer", "mAudioRecord.getState " + normalAudioSource.this.f209319j.getState());
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    normalAudioSource.this.f209319j.startRecording();
                } catch (Exception unused2) {
                }
                while (!Thread.interrupted() && normalAudioSource.this.f209317h) {
                    synchronized (this.f209326e) {
                    }
                    normalAudioSource normalaudiosource = normalAudioSource.this;
                    normalaudiosource.f209321l = new byte[normalaudiosource.f209316g];
                    t9c.m189745c("streamerCameraProducer", "allocatebuff mAudioFrame" + normalAudioSource.this.f209316g);
                    this.f209322a = normalAudioSource.this.f209319j.read(normalAudioSource.this.f209321l, 0, normalAudioSource.this.f209316g);
                    t9c.m189745c("streamerCameraProducer", "this.audioRecord.read size" + this.f209322a);
                    if (this.f209322a <= 0) {
                        break;
                    }
                    synchronized (this.f209326e) {
                        try {
                            AudioProcess audioProcess = this.f209324c;
                            if (audioProcess != null) {
                                audioProcess.putAudioData(new oxd0(normalAudioSource.this.f209321l, System.nanoTime() / 1000, normalAudioSource.this.f209311b.channelNum));
                                normalAudioSource.m223594k(normalAudioSource.this);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                t9c.m189745c("streamerCameraProducer", " mAudioRecord.stop() and release");
                if (normalAudioSource.this.f209319j != null) {
                    try {
                        normalAudioSource.this.f209319j.release();
                        normalAudioSource.this.f209319j = null;
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ long m223594k(normalAudioSource normalaudiosource) {
        long j = normalaudiosource.f209318i;
        normalaudiosource.f209318i = 1 + j;
        return j;
    }

    @Override // tv.danmaku.ijk.media.source.audio.audioSource
    /* JADX INFO: renamed from: d */
    public void mo223587d() {
        m223595l();
        this.f209317h = true;
        if (this.f209315f == null) {
            this.f209315f = new AudioRecordRunnable();
        }
        if (this.f209320k == null) {
            Thread thread = new Thread(this.f209315f, "live-media-AudRec");
            this.f209320k = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m223595l() {
        AudioRecordRunnable audioRecordRunnable = this.f209315f;
        if (audioRecordRunnable != null) {
            audioRecordRunnable.m223596a(null);
        }
        if (this.f209320k != null) {
            try {
                this.f209317h = false;
                this.f209320k.join();
            } catch (InterruptedException unused) {
                this.f209320k.interrupt();
            }
            this.f209320k = null;
        }
        this.f209315f = null;
    }
}
