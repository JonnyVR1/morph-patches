package p149l;

import android.media.AudioRecord;
import android.os.Process;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class ic1 {

    /* JADX INFO: renamed from: o */
    public static int f112398o = 1;

    /* JADX INFO: renamed from: p */
    public static int f112399p = 2;

    /* JADX INFO: renamed from: a */
    private final String f112400a = "AudioRecorderWrapper";

    /* JADX INFO: renamed from: b */
    private int f112401b = 44100;

    /* JADX INFO: renamed from: c */
    private int f112402c = 16;

    /* JADX INFO: renamed from: d */
    private int f112403d = 1;

    /* JADX INFO: renamed from: e */
    private AudioRecord f112404e = null;

    /* JADX INFO: renamed from: f */
    private int f112405f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f112406g = false;

    /* JADX INFO: renamed from: h */
    private Thread f112407h = null;

    /* JADX INFO: renamed from: i */
    private InterfaceC17517b f112408i = null;

    /* JADX INFO: renamed from: j */
    private boolean f112409j = false;

    /* JADX INFO: renamed from: k */
    private Object f112410k = new Object();

    /* JADX INFO: renamed from: l */
    private int f112411l = 1;

    /* JADX INFO: renamed from: m */
    private tmw f112412m = null;

    /* JADX INFO: renamed from: n */
    private Runnable f112413n = new RunnableC17516a();

    /* JADX INFO: renamed from: l.ic1$a */
    public class RunnableC17516a implements Runnable {

        /* JADX INFO: renamed from: a */
        private int f112414a = 0;

        /* JADX INFO: renamed from: b */
        private byte[] f112415b = null;

        /* JADX INFO: renamed from: c */
        private int f112416c = 0;

        public RunnableC17516a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (ic1.this.f112404e != null) {
                while (ic1.this.f112404e.getState() == 0 && this.f112414a < 5) {
                    try {
                        Thread.sleep(100L);
                        this.f112414a++;
                        kwv.m147653c("AudioRecorderWrapper", "mAudioRecord.getState " + ic1.this.f112404e.getState());
                    } catch (InterruptedException e) {
                        if (ic1.this.f112412m != null) {
                            ic1.this.f112412m.onFail(2004, "AudioRecord thread exception ! [" + e.toString() + Constants.AES_SUFFIX);
                        }
                    }
                }
                try {
                    ic1.this.f112404e.startRecording();
                    while (!Thread.interrupted() && ic1.this.f112406g) {
                        if (this.f112415b == null) {
                            this.f112415b = new byte[ic1.this.f112405f];
                        }
                        int i = ic1.this.f112404e.read(this.f112415b, 0, ic1.this.f112405f);
                        this.f112416c = i;
                        ic1 ic1Var = ic1.this;
                        if (i <= 0) {
                            ic1Var.f112409j = false;
                            kwv.m147653c("AudioRecorderWrapper", "MediaRecorder.read() return errorcode=" + this.f112416c);
                            j3f.m139570a(4096, ic1.f112399p);
                            if (ic1.this.f112412m == null) {
                                break;
                            }
                            ic1.this.f112412m.onFail(2004, "MediaRecorder.read() return errorcode=" + this.f112416c);
                            break;
                        }
                        ic1Var.f112409j = true;
                        synchronized (ic1.this.f112410k) {
                            try {
                                if (ic1.this.f112408i != null) {
                                    u460 u460Var = new u460(ic1.this.f112405f);
                                    u460Var.m191672a().put(this.f112415b);
                                    u460Var.m191672a().rewind();
                                    u460Var.m191675d(ic1.this.f112405f, 0, 0, System.nanoTime() / 1000, 0);
                                    ic1.this.f112408i.mo135314a(u460Var);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    kwv.m147653c("AudioRecorderWrapper", " mAudioRecord.stop() and release");
                } catch (Exception e2) {
                    kwv.m147653c("AudioRecorderWrapper", "call MediaRecord.startRecording error ! [" + e2.toString() + Constants.AES_SUFFIX);
                    if (ic1.this.f112412m != null) {
                        ic1.this.f112412m.onFail(2002, "call MediaRecord.startRecording error ! [" + e2.toString() + Constants.AES_SUFFIX);
                    }
                    j3f.m139570a(4096, ic1.f112398o);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.ic1$b */
    public interface InterfaceC17517b {
        /* JADX INFO: renamed from: a */
        void mo135314a(u460 u460Var);
    }

    /* JADX INFO: renamed from: h */
    public boolean m135308h(int i, int i2, int i3, int i4) {
        this.f112402c = i2;
        this.f112401b = i;
        this.f112403d = i3;
        this.f112405f = i4;
        int i5 = (((i * 120) / 1000) * 32) >> 3;
        int i6 = i3 == 2 ? 12 : 16;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i6, 2) * 16;
        try {
            this.f112404e = new AudioRecord(this.f112411l, this.f112401b, i6, 2, i5 < minBufferSize ? minBufferSize : i5);
            return true;
        } catch (Exception e) {
            kwv.m147653c("AudioRecorderWrapper", "Open Recorder devcie error ! [" + e.toString() + Constants.AES_SUFFIX);
            tmw tmwVar = this.f112412m;
            if (tmwVar == null) {
                return false;
            }
            tmwVar.onFail(2001, "Open Recorder devcie error ! [" + e.toString() + Constants.AES_SUFFIX);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m135309i() {
        if (this.f112406g) {
            m135313m();
            this.f112407h = null;
        }
        AudioRecord audioRecord = this.f112404e;
        if (audioRecord != null) {
            audioRecord.release();
            this.f112404e = null;
        }
        synchronized (this.f112410k) {
            this.f112408i = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m135310j(tmw tmwVar) {
        this.f112412m = tmwVar;
    }

    /* JADX INFO: renamed from: k */
    public void m135311k(InterfaceC17517b interfaceC17517b) {
        synchronized (this.f112410k) {
            this.f112408i = interfaceC17517b;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m135312l() {
        this.f112406g = true;
        if (this.f112407h == null) {
            Thread thread = new Thread(this.f112413n, "AudioRecorderThread" + zzf0.m221018b());
            this.f112407h = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m135313m() {
        if (this.f112406g) {
            this.f112406g = false;
            Thread thread = this.f112407h;
            if (thread != null) {
                try {
                    thread.join();
                } catch (Exception e) {
                    tmw tmwVar = this.f112412m;
                    if (tmwVar != null) {
                        tmwVar.onFail(2003, "Stop Recording  failed ! [" + e.toString() + Constants.AES_SUFFIX);
                    }
                    e.printStackTrace();
                }
                this.f112407h = null;
            }
        }
    }
}
