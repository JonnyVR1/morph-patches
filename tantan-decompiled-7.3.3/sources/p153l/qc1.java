package p153l;

import android.media.AudioRecord;
import android.os.Process;
import android.util.Log;
import com.core.glcore.util.Log4Cam;
import com.immomo.medialog.LogLevel;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class qc1 extends jc00 {

    /* JADX INFO: renamed from: l */
    private final String f156531l;

    /* JADX INFO: renamed from: m */
    private AudioRecord f156532m;

    /* JADX INFO: renamed from: n */
    private int f156533n;

    /* JADX INFO: renamed from: o */
    private boolean f156534o;

    /* JADX INFO: renamed from: p */
    private Thread f156535p;

    /* JADX INFO: renamed from: q */
    private Object f156536q;

    /* JADX INFO: renamed from: r */
    private q210.InterfaceC19500a f156537r;

    /* JADX INFO: renamed from: s */
    private Runnable f156538s;

    /* JADX INFO: renamed from: l.qc1$a */
    public class RunnableC19547a implements Runnable {

        /* JADX INFO: renamed from: a */
        private byte[] f156539a = null;

        /* JADX INFO: renamed from: b */
        private int f156540b = 0;

        public RunnableC19547a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (qc1.this.f156532m != null) {
                int i = 0;
                while (qc1.this.f156532m != null && qc1.this.f156532m.getState() == 0 && i < 5) {
                    try {
                        Thread.sleep(100L);
                        i++;
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    qc1.this.f156532m.startRecording();
                    int i2 = 0;
                    while (qc1.this.f156532m.getRecordingState() != 3 && i2 < 10) {
                        try {
                            Thread.sleep(100L);
                            i2++;
                            qc1.this.f156532m.startRecording();
                        } catch (InterruptedException unused2) {
                        }
                    }
                    if (qc1.this.f156532m.getRecordingState() != 3) {
                        if (qc1.this.f156537r != null) {
                            qc1.this.f156537r.mo165950g(37120, 2, 0, null);
                        }
                        b7y.m102882c().m102888g("AudioRecorder getRecordingState error");
                        b7y.m102882c().m102886e("audioCapture", "audioRecorder", qc1.this.f156532m.getRecordingState(), "RecordingState error", LogLevel.ERROR.value());
                        return;
                    }
                    loop2: while (true) {
                        int i3 = 0;
                        while (true) {
                            if (!Thread.interrupted() && qc1.this.f156534o) {
                                if (this.f156539a == null) {
                                    this.f156539a = new byte[qc1.this.f156533n];
                                }
                                int i4 = qc1.this.f156532m.read(this.f156539a, 0, qc1.this.f156533n);
                                this.f156540b = i4;
                                if (i4 <= 0) {
                                    if (i4 >= 0) {
                                        if (i4 == 0 && (i3 = i3 + 1) > 20) {
                                            qc1.m176098u2(qc1.this);
                                            if (qc1.this.f156537r != null) {
                                                qc1.this.f156537r.mo165950g(37120, 3, 0, null);
                                            }
                                            b7y.m102882c().m102886e("audioCapture", "audioRecorder", 4, "mAudioRecord read error", LogLevel.ERROR.value());
                                            break loop2;
                                        }
                                    } else {
                                        qc1.m176098u2(qc1.this);
                                        if (qc1.this.f156537r != null) {
                                            qc1.this.f156537r.mo165950g(37120, 3, 0, null);
                                        }
                                        b7y.m102882c().m102886e("audioCapture", "audioRecorder", 3, "mAudioRecord read error", LogLevel.ERROR.value());
                                        break loop2;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break loop2;
                            }
                        }
                        synchronized (qc1.this.f156536q) {
                            try {
                                qc1 qc1Var = qc1.this;
                                if (qc1Var.f120014j != null) {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(qc1Var.f156533n);
                                    byteBufferAllocate.put(this.f156539a);
                                    byteBufferAllocate.rewind();
                                    qc1.this.f120014j.mo19373C(new oxd0(byteBufferAllocate, System.nanoTime() / 1000, 2));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Log4Cam.m7377e("AudioRecorderWrapper", " mAudioRecord.stop() and release");
                    try {
                        qc1.this.f156532m.stop();
                    } catch (IllegalStateException unused3) {
                        qc1.m176098u2(qc1.this);
                        if (qc1.this.f156537r != null) {
                            qc1.this.f156537r.mo165950g(37120, 2, 0, null);
                        }
                        b7y.m102882c().m102886e("audioCapture", "audioRecorder", 2, "mAudioRecord stop error", LogLevel.ERROR.value());
                    } catch (Exception unused4) {
                    }
                } catch (Exception e) {
                    qc1.m176098u2(qc1.this);
                    if (qc1.this.f156537r != null) {
                        qc1.this.f156537r.mo165950g(37120, 2, 0, null);
                    }
                    b7y.m102882c().m102886e("audioCapture", "audioRecorder", 1, "" + e.toString(), LogLevel.ERROR.value());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.qc1$b */
    public interface InterfaceC19548b {
    }

    public qc1(int i, int i2, int i3) {
        super(i3, i, i2, false);
        this.f156531l = "AudioRecorderWrapper";
        this.f156532m = null;
        this.f156533n = 0;
        this.f156534o = false;
        this.f156535p = null;
        this.f156536q = new Object();
        this.f156538s = new RunnableC19547a();
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ InterfaceC19548b m176098u2(qc1 qc1Var) {
        qc1Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: A2 */
    public void m176102A2(q210.InterfaceC19500a interfaceC19500a) {
        this.f156537r = interfaceC19500a;
    }

    /* JADX INFO: renamed from: B2 */
    public void m176103B2() {
        this.f156534o = true;
        if (this.f156535p == null) {
            Thread thread = new Thread(this.f156538s, "live-media-AReThread");
            this.f156535p = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m176104C2() {
        if (this.f156534o) {
            this.f156534o = false;
            Thread thread = this.f156535p;
            if (thread != null) {
                try {
                    thread.join(3000L);
                } catch (Exception e) {
                    this.f156535p.interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // p153l.jc00
    /* JADX INFO: renamed from: p2 */
    public void mo21123p2() {
        if (this.f156534o) {
            m176104C2();
            this.f156535p = null;
        }
        AudioRecord audioRecord = this.f156532m;
        if (audioRecord != null) {
            audioRecord.release();
            this.f156532m = null;
        }
        synchronized (this.f156536q) {
            this.f120014j = null;
        }
    }

    /* JADX INFO: renamed from: y2 */
    public boolean m176105y2(String str, int i, int i2, int i3, int i4) {
        this.f120009e = i2;
        this.f120008d = i;
        this.f120010f = i3;
        this.f156533n = i4;
        int i5 = (((i * 120) / 1000) * 32) >> 3;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i3 == 1 ? 16 : 12, 2) * 16;
        try {
            this.f156532m = new AudioRecord(1, this.f120008d, this.f120010f == 1 ? 16 : 12, 2, i5 < minBufferSize ? minBufferSize : i5);
            Log.e("AudioRecorderWrapper", " startRecord  recorderaudio audioSampleRate:" + this.f120008d + ";mSampleChannels:" + this.f120010f);
            return true;
        } catch (Exception unused) {
            q210.InterfaceC19500a interfaceC19500a = this.f156537r;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(37120, 1, 0, null);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m176106z2(int i) {
        this.f120008d = i;
    }
}
