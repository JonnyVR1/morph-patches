package p007l;

import android.media.AudioRecord;
import android.os.Process;
import android.util.Log;
import com.core.glcore.util.Log4Cam;
import com.immomo.medialog.LogLevel;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import java.nio.ByteBuffer;
import l.eyx;
import l.hu00;
import l.mpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class jc1 extends m300 {

    /* JADX INFO: renamed from: l */
    private final String f2961l;

    /* JADX INFO: renamed from: m */
    private AudioRecord f2962m;

    /* JADX INFO: renamed from: n */
    private int f2963n;

    /* JADX INFO: renamed from: o */
    private boolean f2964o;

    /* JADX INFO: renamed from: p */
    private Thread f2965p;

    /* JADX INFO: renamed from: q */
    private Object f2966q;

    /* JADX INFO: renamed from: r */
    private hu00.a f2967r;

    /* JADX INFO: renamed from: s */
    private Runnable f2968s;

    /* JADX INFO: renamed from: l.jc1$a */
    public class RunnableC0572a implements Runnable {

        /* JADX INFO: renamed from: a */
        private byte[] f2969a = null;

        /* JADX INFO: renamed from: b */
        private int f2970b = 0;

        public RunnableC0572a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (jc1.this.f2962m != null) {
                int i = 0;
                while (jc1.this.f2962m != null && jc1.this.f2962m.getState() == 0 && i < 5) {
                    try {
                        Thread.sleep(100L);
                        i++;
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    jc1.this.f2962m.startRecording();
                    int i2 = 0;
                    while (jc1.this.f2962m.getRecordingState() != 3 && i2 < 10) {
                        try {
                            Thread.sleep(100L);
                            i2++;
                            jc1.this.f2962m.startRecording();
                        } catch (InterruptedException unused2) {
                        }
                    }
                    if (jc1.this.f2962m.getRecordingState() != 3) {
                        if (jc1.this.f2967r != null) {
                            jc1.this.f2967r.g(37120, 2, 0, (Object) null);
                        }
                        eyx.c().g(new Object[]{"AudioRecorder getRecordingState error"});
                        eyx.c().e("audioCapture", "audioRecorder", jc1.this.f2962m.getRecordingState(), "RecordingState error", LogLevel.ERROR.value());
                        return;
                    }
                    loop2: while (true) {
                        int i3 = 0;
                        while (true) {
                            if (!Thread.interrupted() && jc1.this.f2964o) {
                                if (this.f2969a == null) {
                                    this.f2969a = new byte[jc1.this.f2963n];
                                }
                                int i4 = jc1.this.f2962m.read(this.f2969a, 0, jc1.this.f2963n);
                                this.f2970b = i4;
                                if (i4 <= 0) {
                                    if (i4 >= 0) {
                                        if (i4 == 0 && (i3 = i3 + 1) > 20) {
                                            jc1.m9505u2(jc1.this);
                                            if (jc1.this.f2967r != null) {
                                                jc1.this.f2967r.g(37120, 3, 0, (Object) null);
                                            }
                                            eyx.c().e("audioCapture", "audioRecorder", 4, "mAudioRecord read error", LogLevel.ERROR.value());
                                            break loop2;
                                        }
                                    } else {
                                        jc1.m9505u2(jc1.this);
                                        if (jc1.this.f2967r != null) {
                                            jc1.this.f2967r.g(37120, 3, 0, (Object) null);
                                        }
                                        eyx.c().e("audioCapture", "audioRecorder", 3, "mAudioRecord read error", LogLevel.ERROR.value());
                                        break loop2;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break loop2;
                            }
                        }
                        synchronized (jc1.this.f2966q) {
                            try {
                                jc1 jc1Var = jc1.this;
                                if (jc1Var.f3284j != null) {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(jc1Var.f2963n);
                                    byteBufferAllocate.put(this.f2969a);
                                    byteBufferAllocate.rewind();
                                    jc1.this.f3284j.C(new mpd0(byteBufferAllocate, System.nanoTime() / 1000, 2));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Log4Cam.e("AudioRecorderWrapper", " mAudioRecord.stop() and release");
                    try {
                        jc1.this.f2962m.stop();
                    } catch (IllegalStateException unused3) {
                        jc1.m9505u2(jc1.this);
                        if (jc1.this.f2967r != null) {
                            jc1.this.f2967r.g(37120, 2, 0, (Object) null);
                        }
                        eyx.c().e("audioCapture", "audioRecorder", 2, "mAudioRecord stop error", LogLevel.ERROR.value());
                    } catch (Exception unused4) {
                    }
                } catch (Exception e) {
                    jc1.m9505u2(jc1.this);
                    if (jc1.this.f2967r != null) {
                        jc1.this.f2967r.g(37120, 2, 0, (Object) null);
                    }
                    eyx.c().e("audioCapture", "audioRecorder", 1, "" + e.toString(), LogLevel.ERROR.value());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.jc1$b */
    public interface InterfaceC0573b {
    }

    public jc1(int i, int i2, int i3) {
        super(i3, i, i2, false);
        this.f2961l = "AudioRecorderWrapper";
        this.f2962m = null;
        this.f2963n = 0;
        this.f2964o = false;
        this.f2965p = null;
        this.f2966q = new Object();
        this.f2968s = new RunnableC0572a();
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ InterfaceC0573b m9505u2(jc1 jc1Var) {
        jc1Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: A2 */
    public void m9509A2(hu00.a aVar) {
        this.f2967r = aVar;
    }

    /* JADX INFO: renamed from: B2 */
    public void m9510B2() {
        this.f2964o = true;
        if (this.f2965p == null) {
            Thread thread = new Thread(this.f2968s, "live-media-AReThread");
            this.f2965p = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m9511C2() {
        if (this.f2964o) {
            this.f2964o = false;
            Thread thread = this.f2965p;
            if (thread != null) {
                try {
                    thread.join(3000L);
                } catch (Exception e) {
                    this.f2965p.interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // p007l.m300
    /* JADX INFO: renamed from: p2 */
    public void mo390p2() {
        if (this.f2964o) {
            m9511C2();
            this.f2965p = null;
        }
        AudioRecord audioRecord = this.f2962m;
        if (audioRecord != null) {
            audioRecord.release();
            this.f2962m = null;
        }
        synchronized (this.f2966q) {
            this.f3284j = null;
        }
    }

    /* JADX INFO: renamed from: y2 */
    public boolean m9512y2(String str, int i, int i2, int i3, int i4) {
        this.f3279e = i2;
        this.f3278d = i;
        this.f3280f = i3;
        this.f2963n = i4;
        int i5 = (((i * 120) / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE) * 32) >> 3;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i3 == 1 ? 16 : 12, 2) * 16;
        try {
            this.f2962m = new AudioRecord(1, this.f3278d, this.f3280f == 1 ? 16 : 12, 2, i5 < minBufferSize ? minBufferSize : i5);
            Log.e("AudioRecorderWrapper", " startRecord  recorderaudio audioSampleRate:" + this.f3278d + ";mSampleChannels:" + this.f3280f);
            return true;
        } catch (Exception unused) {
            hu00.a aVar = this.f2967r;
            if (aVar != null) {
                aVar.g(37120, 1, 0, (Object) null);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m9513z2(int i) {
        this.f3278d = i;
    }
}
