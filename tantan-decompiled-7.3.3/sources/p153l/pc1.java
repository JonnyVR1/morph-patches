package p153l;

import android.media.AudioRecord;
import android.os.Process;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class pc1 {

    /* JADX INFO: renamed from: o */
    public static int f151491o = 1;

    /* JADX INFO: renamed from: p */
    public static int f151492p = 2;

    /* JADX INFO: renamed from: a */
    private final String f151493a = "AudioRecorderWrapper";

    /* JADX INFO: renamed from: b */
    private int f151494b = 44100;

    /* JADX INFO: renamed from: c */
    private int f151495c = 16;

    /* JADX INFO: renamed from: d */
    private int f151496d = 1;

    /* JADX INFO: renamed from: e */
    private AudioRecord f151497e = null;

    /* JADX INFO: renamed from: f */
    private int f151498f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f151499g = false;

    /* JADX INFO: renamed from: h */
    private Thread f151500h = null;

    /* JADX INFO: renamed from: i */
    private InterfaceC19341b f151501i = null;

    /* JADX INFO: renamed from: j */
    private boolean f151502j = false;

    /* JADX INFO: renamed from: k */
    private Object f151503k = new Object();

    /* JADX INFO: renamed from: l */
    private int f151504l = 1;

    /* JADX INFO: renamed from: m */
    private spw f151505m = null;

    /* JADX INFO: renamed from: n */
    private Runnable f151506n = new RunnableC19340a();

    /* JADX INFO: renamed from: l.pc1$a */
    public class RunnableC19340a implements Runnable {

        /* JADX INFO: renamed from: a */
        private int f151507a = 0;

        /* JADX INFO: renamed from: b */
        private byte[] f151508b = null;

        /* JADX INFO: renamed from: c */
        private int f151509c = 0;

        public RunnableC19340a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (pc1.this.f151497e != null) {
                while (pc1.this.f151497e.getState() == 0 && this.f151507a < 5) {
                    try {
                        Thread.sleep(100L);
                        this.f151507a++;
                        lyv.m156389c("AudioRecorderWrapper", "mAudioRecord.getState " + pc1.this.f151497e.getState());
                    } catch (InterruptedException e) {
                        if (pc1.this.f151505m != null) {
                            pc1.this.f151505m.onFail(2004, "AudioRecord thread exception ! [" + e.toString() + Constants.AES_SUFFIX);
                        }
                    }
                }
                try {
                    pc1.this.f151497e.startRecording();
                    while (!Thread.interrupted() && pc1.this.f151499g) {
                        if (this.f151508b == null) {
                            this.f151508b = new byte[pc1.this.f151498f];
                        }
                        int i = pc1.this.f151497e.read(this.f151508b, 0, pc1.this.f151498f);
                        this.f151509c = i;
                        pc1 pc1Var = pc1.this;
                        if (i <= 0) {
                            pc1Var.f151502j = false;
                            lyv.m156389c("AudioRecorderWrapper", "MediaRecorder.read() return errorcode=" + this.f151509c);
                            o4f.m165999a(4096, pc1.f151492p);
                            if (pc1.this.f151505m == null) {
                                break;
                            }
                            pc1.this.f151505m.onFail(2004, "MediaRecorder.read() return errorcode=" + this.f151509c);
                            break;
                        }
                        pc1Var.f151502j = true;
                        synchronized (pc1.this.f151503k) {
                            try {
                                if (pc1.this.f151501i != null) {
                                    ad60 ad60Var = new ad60(pc1.this.f151498f);
                                    ad60Var.m97015a().put(this.f151508b);
                                    ad60Var.m97015a().rewind();
                                    ad60Var.m97018d(pc1.this.f151498f, 0, 0, System.nanoTime() / 1000, 0);
                                    pc1.this.f151501i.mo167019a(ad60Var);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    lyv.m156389c("AudioRecorderWrapper", " mAudioRecord.stop() and release");
                } catch (Exception e2) {
                    lyv.m156389c("AudioRecorderWrapper", "call MediaRecord.startRecording error ! [" + e2.toString() + Constants.AES_SUFFIX);
                    if (pc1.this.f151505m != null) {
                        pc1.this.f151505m.onFail(2002, "call MediaRecord.startRecording error ! [" + e2.toString() + Constants.AES_SUFFIX);
                    }
                    o4f.m165999a(4096, pc1.f151491o);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.pc1$b */
    public interface InterfaceC19341b {
        /* JADX INFO: renamed from: a */
        void mo167019a(ad60 ad60Var);
    }

    /* JADX INFO: renamed from: h */
    public boolean m171613h(int i, int i2, int i3, int i4) {
        this.f151495c = i2;
        this.f151494b = i;
        this.f151496d = i3;
        this.f151498f = i4;
        int i5 = (((i * 120) / 1000) * 32) >> 3;
        int i6 = i3 == 2 ? 12 : 16;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i6, 2) * 16;
        try {
            this.f151497e = new AudioRecord(this.f151504l, this.f151494b, i6, 2, i5 < minBufferSize ? minBufferSize : i5);
            return true;
        } catch (Exception e) {
            lyv.m156389c("AudioRecorderWrapper", "Open Recorder devcie error ! [" + e.toString() + Constants.AES_SUFFIX);
            spw spwVar = this.f151505m;
            if (spwVar == null) {
                return false;
            }
            spwVar.onFail(2001, "Open Recorder devcie error ! [" + e.toString() + Constants.AES_SUFFIX);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m171614i() {
        if (this.f151499g) {
            m171618m();
            this.f151500h = null;
        }
        AudioRecord audioRecord = this.f151497e;
        if (audioRecord != null) {
            audioRecord.release();
            this.f151497e = null;
        }
        synchronized (this.f151503k) {
            this.f151501i = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m171615j(spw spwVar) {
        this.f151505m = spwVar;
    }

    /* JADX INFO: renamed from: k */
    public void m171616k(InterfaceC19341b interfaceC19341b) {
        synchronized (this.f151503k) {
            this.f151501i = interfaceC19341b;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m171617l() {
        this.f151499g = true;
        if (this.f151500h == null) {
            Thread thread = new Thread(this.f151506n, "AudioRecorderThread" + g8g0.m129407b());
            this.f151500h = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m171618m() {
        if (this.f151499g) {
            this.f151499g = false;
            Thread thread = this.f151500h;
            if (thread != null) {
                try {
                    thread.join();
                } catch (Exception e) {
                    spw spwVar = this.f151505m;
                    if (spwVar != null) {
                        spwVar.onFail(2003, "Stop Recording  failed ! [" + e.toString() + Constants.AES_SUFFIX);
                    }
                    e.printStackTrace();
                }
                this.f151500h = null;
            }
        }
    }
}
