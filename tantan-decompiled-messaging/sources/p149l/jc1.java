package p149l;

import android.media.AudioRecord;
import android.os.Process;
import android.util.Log;
import com.core.glcore.util.Log4Cam;
import com.immomo.medialog.LogLevel;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class jc1 extends m300 {

    /* JADX INFO: renamed from: l */
    private final String f117243l;

    /* JADX INFO: renamed from: m */
    private AudioRecord f117244m;

    /* JADX INFO: renamed from: n */
    private int f117245n;

    /* JADX INFO: renamed from: o */
    private boolean f117246o;

    /* JADX INFO: renamed from: p */
    private Thread f117247p;

    /* JADX INFO: renamed from: q */
    private Object f117248q;

    /* JADX INFO: renamed from: r */
    private hu00.InterfaceC17392a f117249r;

    /* JADX INFO: renamed from: s */
    private Runnable f117250s;

    /* JADX INFO: renamed from: l.jc1$a */
    public class RunnableC17742a implements Runnable {

        /* JADX INFO: renamed from: a */
        private byte[] f117251a = null;

        /* JADX INFO: renamed from: b */
        private int f117252b = 0;

        public RunnableC17742a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (jc1.this.f117244m != null) {
                int i = 0;
                while (jc1.this.f117244m != null && jc1.this.f117244m.getState() == 0 && i < 5) {
                    try {
                        Thread.sleep(100L);
                        i++;
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    jc1.this.f117244m.startRecording();
                    int i2 = 0;
                    while (jc1.this.f117244m.getRecordingState() != 3 && i2 < 10) {
                        try {
                            Thread.sleep(100L);
                            i2++;
                            jc1.this.f117244m.startRecording();
                        } catch (InterruptedException unused2) {
                        }
                    }
                    if (jc1.this.f117244m.getRecordingState() != 3) {
                        if (jc1.this.f117249r != null) {
                            jc1.this.f117249r.mo128349g(37120, 2, 0, null);
                        }
                        eyx.m118802c().m118808g("AudioRecorder getRecordingState error");
                        eyx.m118802c().m118806e("audioCapture", "audioRecorder", jc1.this.f117244m.getRecordingState(), "RecordingState error", LogLevel.ERROR.value());
                        return;
                    }
                    loop2: while (true) {
                        int i3 = 0;
                        while (true) {
                            if (!Thread.interrupted() && jc1.this.f117246o) {
                                if (this.f117251a == null) {
                                    this.f117251a = new byte[jc1.this.f117245n];
                                }
                                int i4 = jc1.this.f117244m.read(this.f117251a, 0, jc1.this.f117245n);
                                this.f117252b = i4;
                                if (i4 <= 0) {
                                    if (i4 >= 0) {
                                        if (i4 == 0 && (i3 = i3 + 1) > 20) {
                                            jc1.m140840u2(jc1.this);
                                            if (jc1.this.f117249r != null) {
                                                jc1.this.f117249r.mo128349g(37120, 3, 0, null);
                                            }
                                            eyx.m118802c().m118806e("audioCapture", "audioRecorder", 4, "mAudioRecord read error", LogLevel.ERROR.value());
                                            break loop2;
                                        }
                                    } else {
                                        jc1.m140840u2(jc1.this);
                                        if (jc1.this.f117249r != null) {
                                            jc1.this.f117249r.mo128349g(37120, 3, 0, null);
                                        }
                                        eyx.m118802c().m118806e("audioCapture", "audioRecorder", 3, "mAudioRecord read error", LogLevel.ERROR.value());
                                        break loop2;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break loop2;
                            }
                        }
                        synchronized (jc1.this.f117248q) {
                            try {
                                jc1 jc1Var = jc1.this;
                                if (jc1Var.f130966j != null) {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(jc1Var.f117245n);
                                    byteBufferAllocate.put(this.f117251a);
                                    byteBufferAllocate.rewind();
                                    jc1.this.f130966j.mo18364C(new mpd0(byteBufferAllocate, System.nanoTime() / 1000, 2));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Log4Cam.m7323e("AudioRecorderWrapper", " mAudioRecord.stop() and release");
                    try {
                        jc1.this.f117244m.stop();
                    } catch (IllegalStateException unused3) {
                        jc1.m140840u2(jc1.this);
                        if (jc1.this.f117249r != null) {
                            jc1.this.f117249r.mo128349g(37120, 2, 0, null);
                        }
                        eyx.m118802c().m118806e("audioCapture", "audioRecorder", 2, "mAudioRecord stop error", LogLevel.ERROR.value());
                    } catch (Exception unused4) {
                    }
                } catch (Exception e) {
                    jc1.m140840u2(jc1.this);
                    if (jc1.this.f117249r != null) {
                        jc1.this.f117249r.mo128349g(37120, 2, 0, null);
                    }
                    eyx.m118802c().m118806e("audioCapture", "audioRecorder", 1, "" + e.toString(), LogLevel.ERROR.value());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.jc1$b */
    public interface InterfaceC17743b {
    }

    public jc1(int i, int i2, int i3) {
        super(i3, i, i2, false);
        this.f117243l = "AudioRecorderWrapper";
        this.f117244m = null;
        this.f117245n = 0;
        this.f117246o = false;
        this.f117247p = null;
        this.f117248q = new Object();
        this.f117250s = new RunnableC17742a();
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ InterfaceC17743b m140840u2(jc1 jc1Var) {
        jc1Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: A2 */
    public void m140844A2(hu00.InterfaceC17392a interfaceC17392a) {
        this.f117249r = interfaceC17392a;
    }

    /* JADX INFO: renamed from: B2 */
    public void m140845B2() {
        this.f117246o = true;
        if (this.f117247p == null) {
            Thread thread = new Thread(this.f117250s, "live-media-AReThread");
            this.f117247p = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m140846C2() {
        if (this.f117246o) {
            this.f117246o = false;
            Thread thread = this.f117247p;
            if (thread != null) {
                try {
                    thread.join(3000L);
                } catch (Exception e) {
                    this.f117247p.interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // p149l.m300
    /* JADX INFO: renamed from: p2 */
    public void mo20124p2() {
        if (this.f117246o) {
            m140846C2();
            this.f117247p = null;
        }
        AudioRecord audioRecord = this.f117244m;
        if (audioRecord != null) {
            audioRecord.release();
            this.f117244m = null;
        }
        synchronized (this.f117248q) {
            this.f130966j = null;
        }
    }

    /* JADX INFO: renamed from: y2 */
    public boolean m140847y2(String str, int i, int i2, int i3, int i4) {
        this.f130961e = i2;
        this.f130960d = i;
        this.f130962f = i3;
        this.f117245n = i4;
        int i5 = (((i * 120) / 1000) * 32) >> 3;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i3 == 1 ? 16 : 12, 2) * 16;
        try {
            this.f117244m = new AudioRecord(1, this.f130960d, this.f130962f == 1 ? 16 : 12, 2, i5 < minBufferSize ? minBufferSize : i5);
            Log.e("AudioRecorderWrapper", " startRecord  recorderaudio audioSampleRate:" + this.f130960d + ";mSampleChannels:" + this.f130962f);
            return true;
        } catch (Exception unused) {
            hu00.InterfaceC17392a interfaceC17392a = this.f117249r;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(37120, 1, 0, null);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m140848z2(int i) {
        this.f130960d = i;
    }
}
