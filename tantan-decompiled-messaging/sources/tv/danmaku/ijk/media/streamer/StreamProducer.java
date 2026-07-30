package tv.danmaku.ijk.media.streamer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.audio.AudioProcess;
import com.immomo.mediacore.audio.AudioQuality;
import com.immomo.mediacore.audio.NonBlockingAudioTrack;
import com.immomo.mediacore.audio.audio_Indicator;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.sink.SinkBase;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import com.immomo.mediacore.strinf.confrenceHelp;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p149l.ii5;
import p149l.mpd0;
import p149l.n8c;
import p149l.uze;
import p149l.z1l0;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.processing.encodec.MediaCodecAudioMux;
import tv.danmaku.ijk.media.processing.encodec.MediaCodecVideoMux;
import tv.danmaku.ijk.media.processing.encodec.MuxBase;
import tv.danmaku.ijk.media.source.AidSource;
import tv.danmaku.ijk.media.source.SourceBase;
import tv.danmaku.ijk.media.source.audio.audioSource;

/* JADX INFO: loaded from: classes3.dex */
public class StreamProducer extends confrenceHelp implements NotifyCenter, MomoSurface.PostDrawImageCallback {

    /* JADX INFO: renamed from: T1 */
    private static byte f208631T1;

    /* JADX INFO: renamed from: A */
    Activity f208632A;

    /* JADX INFO: renamed from: A1 */
    private boolean f208633A1;

    /* JADX INFO: renamed from: B */
    Context f208634B;

    /* JADX INFO: renamed from: B1 */
    private int f208635B1;

    /* JADX INFO: renamed from: C */
    public ijkMediaStreamer f208636C;

    /* JADX INFO: renamed from: C1 */
    private NonBlockingAudioTrack f208637C1;

    /* JADX INFO: renamed from: D */
    IntentFilter f208638D;

    /* JADX INFO: renamed from: D1 */
    private boolean f208639D1;

    /* JADX INFO: renamed from: E */
    private Object f208640E;

    /* JADX INFO: renamed from: E0 */
    private long f208641E0;

    /* JADX INFO: renamed from: E1 */
    private Handler f208642E1;

    /* JADX INFO: renamed from: F */
    private Object f208643F;

    /* JADX INFO: renamed from: F0 */
    private float f208644F0;

    /* JADX INFO: renamed from: F1 */
    private HandlerThread f208645F1;

    /* JADX INFO: renamed from: G */
    int f208646G;

    /* JADX INFO: renamed from: G0 */
    private float f208647G0;

    /* JADX INFO: renamed from: G1 */
    private audio_Indicator f208648G1;

    /* JADX INFO: renamed from: H */
    private int f208649H;

    /* JADX INFO: renamed from: H0 */
    private boolean f208650H0;

    /* JADX INFO: renamed from: H1 */
    private Object f208651H1;

    /* JADX INFO: renamed from: I */
    private ByteBuffer f208652I;

    /* JADX INFO: renamed from: I0 */
    private boolean f208653I0;

    /* JADX INFO: renamed from: I1 */
    private volatile SinkBase.PcmDateCallback f208654I1;

    /* JADX INFO: renamed from: J */
    private ByteBuffer f208655J;

    /* JADX INFO: renamed from: J0 */
    private long f208656J0;

    /* JADX INFO: renamed from: J1 */
    private volatile SinkBase.ExtPcmDateCallback f208657J1;

    /* JADX INFO: renamed from: K */
    private ByteBuffer f208658K;

    /* JADX INFO: renamed from: K0 */
    private long f208659K0;

    /* JADX INFO: renamed from: K1 */
    private volatile SinkBase.PcmDateCallback f208660K1;

    /* JADX INFO: renamed from: L */
    private int f208661L;

    /* JADX INFO: renamed from: L0 */
    private long f208662L0;

    /* JADX INFO: renamed from: L1 */
    IMediaPlayer.OnPreparedListener f208663L1;

    /* JADX INFO: renamed from: M */
    private int f208664M;

    /* JADX INFO: renamed from: M0 */
    private volatile boolean f208665M0;

    /* JADX INFO: renamed from: M1 */
    private IMediaPlayer.OnCompletionListener f208666M1;

    /* JADX INFO: renamed from: N */
    private int f208667N;

    /* JADX INFO: renamed from: N0 */
    private volatile boolean f208668N0;

    /* JADX INFO: renamed from: N1 */
    private IMediaPlayer.OnErrorListener f208669N1;

    /* JADX INFO: renamed from: O */
    private ByteBuffer[] f208670O;

    /* JADX INFO: renamed from: O0 */
    private volatile boolean f208671O0;

    /* JADX INFO: renamed from: O1 */
    private IMediaPlayer.OnBufferingUpdateListener f208672O1;

    /* JADX INFO: renamed from: P */
    private AudioProcess f208673P;

    /* JADX INFO: renamed from: P0 */
    private AudioRecord f208674P0;

    /* JADX INFO: renamed from: P1 */
    private IMediaPlayer.OnInfoListener f208675P1;

    /* JADX INFO: renamed from: Q */
    private int f208676Q;

    /* JADX INFO: renamed from: Q0 */
    private Surface f208677Q0;

    /* JADX INFO: renamed from: Q1 */
    private IMediaPlayer.OnSeekCompleteListener f208678Q1;

    /* JADX INFO: renamed from: R */
    private boolean f208679R;

    /* JADX INFO: renamed from: R0 */
    private Surface f208680R0;

    /* JADX INFO: renamed from: R1 */
    private IjkMediaPlayer.MediaDateCallback f208681R1;

    /* JADX INFO: renamed from: S */
    private int f208682S;

    /* JADX INFO: renamed from: S0 */
    private volatile long f208683S0;

    /* JADX INFO: renamed from: S1 */
    private Handler f208684S1;

    /* JADX INFO: renamed from: T */
    private boolean f208685T;

    /* JADX INFO: renamed from: T0 */
    private volatile long f208686T0;

    /* JADX INFO: renamed from: U */
    private int f208687U;

    /* JADX INFO: renamed from: U0 */
    private byte[] f208688U0;

    /* JADX INFO: renamed from: V */
    private int f208689V;

    /* JADX INFO: renamed from: V0 */
    private byte[] f208690V0;

    /* JADX INFO: renamed from: W */
    private int f208691W;

    /* JADX INFO: renamed from: W0 */
    private MomoSurface f208692W0;

    /* JADX INFO: renamed from: X */
    private int f208693X;

    /* JADX INFO: renamed from: X0 */
    private MediaCodecVideoMux f208694X0;

    /* JADX INFO: renamed from: Y */
    private float f208695Y;

    /* JADX INFO: renamed from: Y0 */
    private MediaCodecVideoMux f208696Y0;

    /* JADX INFO: renamed from: Z */
    private int f208697Z;

    /* JADX INFO: renamed from: Z0 */
    private MediaCodecAudioMux f208698Z0;

    /* JADX INFO: renamed from: a1 */
    private long f208700a1;

    /* JADX INFO: renamed from: b1 */
    protected AudioRecordRunnable f208702b1;

    /* JADX INFO: renamed from: c1 */
    private boolean f208704c1;

    /* JADX INFO: renamed from: d1 */
    private VideoRecordRunnable f208706d1;

    /* JADX INFO: renamed from: e1 */
    private Thread f208708e1;

    /* JADX INFO: renamed from: f1 */
    private Thread f208710f1;

    /* JADX INFO: renamed from: g */
    protected AudioQuality f208711g;

    /* JADX INFO: renamed from: g1 */
    private Thread f208712g1;

    /* JADX INFO: renamed from: h */
    protected AudioQuality f208713h;

    /* JADX INFO: renamed from: h1 */
    private String f208714h1;

    /* JADX INFO: renamed from: i */
    protected VideoQuality f208715i;

    /* JADX INFO: renamed from: i1 */
    private HeadsetPlugReceiver f208716i1;

    /* JADX INFO: renamed from: j */
    protected VideoQuality f208717j;

    /* JADX INFO: renamed from: j1 */
    private BlueConnectStateBroadcastReceiver f208718j1;

    /* JADX INFO: renamed from: k */
    protected VideoQuality f208719k;

    /* JADX INFO: renamed from: k0 */
    private boolean f208720k0;

    /* JADX INFO: renamed from: k1 */
    private int f208721k1;

    /* JADX INFO: renamed from: l */
    protected byte f208722l;

    /* JADX INFO: renamed from: l1 */
    private long f208723l1;

    /* JADX INFO: renamed from: m */
    protected int f208724m;

    /* JADX INFO: renamed from: m1 */
    protected ijkMediaStreamer.OnSurroundMusicStatusListener f208725m1;

    /* JADX INFO: renamed from: n */
    protected int f208726n;

    /* JADX INFO: renamed from: n1 */
    private SourceBase f208727n1;

    /* JADX INFO: renamed from: o */
    protected MediaCodec f208728o;

    /* JADX INFO: renamed from: o1 */
    private audioSource f208729o1;

    /* JADX INFO: renamed from: p */
    protected MediaCodec f208730p;

    /* JADX INFO: renamed from: p0 */
    private boolean f208731p0;

    /* JADX INFO: renamed from: p1 */
    private audioSource f208732p1;

    /* JADX INFO: renamed from: q */
    protected MediaCodec f208733q;

    /* JADX INFO: renamed from: q1 */
    private volatile int f208734q1;

    /* JADX INFO: renamed from: r */
    IjkMediaPlayer f208735r;

    /* JADX INFO: renamed from: r1 */
    private SinkBase f208736r1;

    /* JADX INFO: renamed from: s */
    ByteBuffer f208737s;

    /* JADX INFO: renamed from: s1 */
    private volatile SinkBase f208738s1;

    /* JADX INFO: renamed from: t */
    ByteBuffer[] f208739t;

    /* JADX INFO: renamed from: t1 */
    private boolean f208740t1;

    /* JADX INFO: renamed from: u */
    private int f208741u;

    /* JADX INFO: renamed from: u1 */
    private boolean f208742u1;

    /* JADX INFO: renamed from: v */
    private int f208743v;

    /* JADX INFO: renamed from: v1 */
    private Map f208744v1;

    /* JADX INFO: renamed from: w */
    private int f208745w;

    /* JADX INFO: renamed from: w1 */
    private int f208746w1;

    /* JADX INFO: renamed from: x */
    private int f208747x;

    /* JADX INFO: renamed from: x1 */
    private ijkMediaStreamer.OnWiredHeadsetStatusListener f208748x1;

    /* JADX INFO: renamed from: y */
    private int f208749y;

    /* JADX INFO: renamed from: y1 */
    private boolean f208750y1;

    /* JADX INFO: renamed from: z */
    private int f208751z;

    /* JADX INFO: renamed from: z1 */
    private int f208752z1;

    /* JADX INFO: renamed from: a */
    private PointF f208699a = new PointF(16.0f, 9.0f);

    /* JADX INFO: renamed from: b */
    private float f208701b = 1.0f;

    /* JADX INFO: renamed from: c */
    private boolean f208703c = false;

    /* JADX INFO: renamed from: d */
    private boolean f208705d = true;

    /* JADX INFO: renamed from: e */
    private String f208707e = WeJson.EMPTY_MAP;

    /* JADX INFO: renamed from: f */
    private final int f208709f = -12345;

    public class AudioEncoderRunnable implements Runnable {
        private AudioEncoderRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mpd0 mpd0VarTake;
            if (StreamProducer.this.f208673P != null) {
                StreamProducer.this.f208673P.clear();
            }
            StreamProducer.this.f208671O0 = true;
            long j = 0;
            loop0: while (true) {
                mpd0VarTake = null;
                while (true) {
                    if (Thread.interrupted() || !StreamProducer.this.f208671O0 || StreamProducer.this.f208673P == null) {
                        break loop0;
                    }
                    n8c.m158485c("streamerCameraProducer", "mAudioProcess.take over" + ((int) StreamProducer.this.f208722l));
                    try {
                        StreamProducer streamProducer = StreamProducer.this;
                        if (streamProducer.f208722l != 1) {
                            mpd0VarTake = streamProducer.f208673P.take();
                            if (mpd0VarTake != null) {
                                break;
                            }
                        } else {
                            int i = 2048;
                            if (streamProducer.f208737s == null) {
                                streamProducer.f208737s = ByteBuffer.allocateDirect(2048);
                            }
                            StreamProducer.this.f208737s.position(0);
                            while (i >= StreamProducer.this.f208649H) {
                                n8c.m158485c("streamerCameraProducer", "soft loop pos" + i);
                                mpd0VarTake = StreamProducer.this.f208673P.take();
                                if (mpd0VarTake != null) {
                                    StreamProducer.this.f208737s.put(mpd0VarTake.m155799b());
                                }
                                i -= StreamProducer.this.f208649H;
                            }
                            j += 2048;
                            long jM222797b = Util.m222797b(j);
                            if (StreamProducer.this.f208736r1 != null) {
                                ByteBuffer byteBuffer = StreamProducer.this.f208737s;
                                StreamProducer.this.f208736r1.writeAudio(jM222797b / 1000, byteBuffer, byteBuffer.limit());
                            }
                        }
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }
                }
                int iDequeueInputBuffer = StreamProducer.this.f208733q.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    if (StreamProducer.this.f208654I1 == null || !StreamProducer.this.f208731p0) {
                        StreamProducer.this.postPcmData(0L, mpd0VarTake.f135036b.array(), 44100, false);
                        StreamProducer.this.postRecordFrame(mpd0VarTake.f135036b.array(), 44100, false);
                    }
                    if (mpd0VarTake.f135036b != null) {
                        StreamProducer.this.f208670O[iDequeueInputBuffer].put(mpd0VarTake.f135036b);
                        StreamProducer.this.f208670O[iDequeueInputBuffer].flip();
                    }
                    if (StreamProducer.this.f208683S0 == 0) {
                        StreamProducer.this.f208683S0 = System.nanoTime() / 1000;
                    } else {
                        System.nanoTime();
                        long unused = StreamProducer.this.f208683S0;
                    }
                    n8c.m158485c("streamerCameraProducer", "mAudioCodec.queueInputBuffer bufferIndex" + iDequeueInputBuffer + "mMediaCodecInputBuffers:" + StreamProducer.this.f208670O[iDequeueInputBuffer]);
                    int iLimit = mpd0VarTake.f135036b.limit();
                    StreamProducer.this.f208733q.queueInputBuffer(iDequeueInputBuffer, 0, iLimit, mpd0VarTake.m155801d(), 0);
                    j += (long) iLimit;
                } else {
                    n8c.m158485c("streamerCameraProducer", "zjl found mAudioCodec no input buffer");
                }
                mpd0VarTake.m155803f();
            }
            if (mpd0VarTake != null) {
                mpd0VarTake.m155803f();
            }
            if (StreamProducer.this.f208673P != null) {
                StreamProducer.this.f208673P.clear();
            }
            StreamProducer.this.f208737s = null;
            n8c.m158485c("streamerCameraProducer", "zjl found Thread 1 over");
        }
    }

    public class AudioRecordRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        int f208768a;

        /* JADX INFO: renamed from: b */
        int f208769b;

        /* JADX INFO: renamed from: c */
        AudioProcess f208770c;

        /* JADX INFO: renamed from: d */
        Surface f208771d;

        /* JADX INFO: renamed from: e */
        private Object f208772e;

        /* JADX INFO: renamed from: f */
        public boolean f208773f;

        private AudioRecordRunnable() {
            this.f208769b = 0;
            this.f208770c = null;
            this.f208771d = null;
            this.f208772e = new Object();
            this.f208773f = false;
            n8c.m158485c("streamerCameraProducer", "new AudioRecordRunnable");
            AudioQuality audioQuality = StreamProducer.this.f208713h;
            int i = audioQuality.samplingRate;
            int i2 = (((i * 120) / 1000) * 32) >> 3;
            int i3 = audioQuality.channelNum == 2 ? 12 : 16;
            int minBufferSize = AudioRecord.getMinBufferSize(i, i3, 2) * 16;
            try {
                StreamProducer.this.f208674P0 = new AudioRecord(1, StreamProducer.this.f208713h.samplingRate, i3, 2, i2 < minBufferSize ? minBufferSize : i2);
            } catch (Exception unused) {
                StreamProducer.this.notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_ILLEGAL_STATE, 3, null);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m222745a(AudioProcess audioProcess) {
            synchronized (this.f208772e) {
                try {
                    this.f208770c = audioProcess;
                    if (audioProcess != null) {
                        audioProcess.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            n8c.m158485c("streamerCameraProducer", "AudioRecordRunnable addAudioProcess");
        }

        /* JADX INFO: renamed from: b */
        public void m222746b(Surface surface) {
            synchronized (this.f208772e) {
                this.f208771d = surface;
            }
            n8c.m158485c("streamerCameraProducer", "AudioRecordRunnable addCodecSurface");
        }

        /* JADX INFO: renamed from: c */
        public void m222747c(boolean z) {
            this.f208773f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (StreamProducer.this.f208674P0 != null) {
                while (StreamProducer.this.f208674P0.getState() == 0 && this.f208769b < 5) {
                    try {
                        Thread.sleep(100L);
                        this.f208769b++;
                        n8c.m158485c("streamerCameraProducer", "mAudioRecord.getState " + StreamProducer.this.f208674P0.getState());
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    StreamProducer.this.f208674P0.startRecording();
                } catch (Exception unused2) {
                }
                n8c.m158485c("streamerCameraProducer", "AudioRecordRunnable mAudioCapturing:" + StreamProducer.this.f208668N0);
                while (!Thread.interrupted() && StreamProducer.this.f208668N0) {
                    synchronized (this.f208772e) {
                        try {
                            if (this.f208771d != null && StreamProducer.this.f208692W0 != null) {
                                StreamProducer.this.f208692W0.m222465Z(this.f208771d);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    StreamProducer streamProducer = StreamProducer.this;
                    streamProducer.f208688U0 = new byte[streamProducer.f208649H];
                    n8c.m158485c("streamerCameraProducer", "allocatebuff mAudioFrame" + StreamProducer.this.f208649H);
                    try {
                        try {
                            this.f208768a = StreamProducer.this.f208674P0.read(StreamProducer.this.f208688U0, 0, StreamProducer.this.f208649H);
                            n8c.m158485c("streamerCameraProducer", "this.audioRecord.read size" + this.f208768a);
                            if (this.f208768a > 0) {
                                synchronized (this.f208772e) {
                                    try {
                                        AudioProcess audioProcess = this.f208770c;
                                        if (audioProcess != null) {
                                            StreamProducer.this.f208688U0 = audioProcess.processStereoAudioData(StreamProducer.this.f208688U0, this.f208768a);
                                        }
                                        StreamProducer.this.m222679U0();
                                        StreamProducer streamProducer2 = StreamProducer.this;
                                        streamProducer2.m222733t2(streamProducer2.f208688U0, StreamProducer.this.f208688U0.length);
                                        if (this.f208770c != null && StreamProducer.this.f208738s1 == null) {
                                            boolean z = this.f208773f;
                                            StreamProducer streamProducer3 = StreamProducer.this;
                                            if (!z) {
                                                if (streamProducer3.f208648G1 != null) {
                                                    StreamProducer.this.f208648G1.putAudioData(StreamProducer.this.f208688U0);
                                                }
                                                if (StreamProducer.this.f208671O0) {
                                                    this.f208770c.putAudioData(new mpd0(StreamProducer.this.f208688U0, System.nanoTime() / 1000, StreamProducer.this.f208713h.channelNum));
                                                }
                                            } else if (streamProducer3.f208671O0) {
                                                StreamProducer.this.f208690V0 = new byte[this.f208768a];
                                                this.f208770c.putAudioData(new mpd0(StreamProducer.this.f208690V0, System.nanoTime() / 1000, StreamProducer.this.f208713h.channelNum));
                                            }
                                            StreamProducer.m222600b0(StreamProducer.this);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } else {
                                if (!StreamProducer.this.f208668N0) {
                                    break;
                                }
                                try {
                                    Thread.sleep(20L);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    } catch (Exception unused3) {
                        Thread.sleep(20L);
                    }
                }
                n8c.m158485c("streamerCameraProducer", " AudioRecordRunnable mAudioRecord.stop() and release");
                if (StreamProducer.this.f208692W0 != null) {
                    StreamProducer.this.f208692W0.m222465Z(this.f208771d);
                }
                if (StreamProducer.this.f208674P0 != null) {
                    try {
                        StreamProducer.this.f208674P0.release();
                        StreamProducer.this.f208674P0 = null;
                    } catch (Exception unused4) {
                    }
                }
            }
            StreamProducer.this.f208702b1 = null;
        }
    }

    public class BlueConnectStateBroadcastReceiver extends BroadcastReceiver {
        public BlueConnectStateBroadcastReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m222748a() {
            try {
                super.finalize();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Context context2;
            Context context3;
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
            if (intExtra == 0) {
                ijkMediaStreamer ijkmediastreamer = StreamProducer.this.f208636C;
                if (ijkmediastreamer != null && ijkmediastreamer.getStreamerType() == 2 && (context2 = StreamProducer.this.f208634B) != null) {
                    ((AudioManager) context2.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(true);
                }
                n8c.m158485c("BlueConnectStateBroadcastReceiver", "STATE_DISCONNECTED");
                if (StreamProducer.this.f208736r1 != null) {
                    StreamProducer.this.f208736r1.setHeadsetStatus(false);
                }
                if (StreamProducer.this.f208738s1 != null) {
                    StreamProducer.this.f208738s1.setHeadsetStatus(false);
                    return;
                }
                return;
            }
            if (intExtra != 2) {
                return;
            }
            ijkMediaStreamer ijkmediastreamer2 = StreamProducer.this.f208636C;
            if (ijkmediastreamer2 != null && ijkmediastreamer2.getStreamerType() == 2 && (context3 = StreamProducer.this.f208634B) != null) {
                ((AudioManager) context3.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(false);
            }
            n8c.m158485c("BlueConnectStateBroadcastReceiver", "STATE_CONNECTED");
            if (StreamProducer.this.f208736r1 != null) {
                StreamProducer.this.f208736r1.setHeadsetStatus(true);
            }
            if (StreamProducer.this.f208738s1 != null) {
                StreamProducer.this.f208738s1.setHeadsetStatus(true);
            }
        }
    }

    public class HeadsetPlugReceiver extends BroadcastReceiver {
        private HeadsetPlugReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m222749a() {
            try {
                super.finalize();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Context context2;
            if (intent.hasExtra("state")) {
                if (intent.getIntExtra("state", 0) == 0) {
                    StreamProducer streamProducer = StreamProducer.this;
                    if (streamProducer.f208735r != null && !streamProducer.f208704c1) {
                        StreamProducer.this.f208735r.setMediaDataCallback(null);
                    }
                    StreamProducer.this.f208750y1 = false;
                    if (StreamProducer.this.f208748x1 != null) {
                        StreamProducer.this.f208748x1.m222836a(StreamProducer.this.f208636C, 1, 0);
                    }
                    StreamProducer.this.m222690b();
                    n8c.m158485c("streamerCameraProducer", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + StreamProducer.this.f208750y1);
                    ijkMediaStreamer ijkmediastreamer = StreamProducer.this.f208636C;
                    if (ijkmediastreamer != null && ijkmediastreamer.getStreamerType() == 2 && (context2 = StreamProducer.this.f208634B) != null) {
                        ((AudioManager) context2.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(true);
                    }
                    if (StreamProducer.this.f208736r1 != null) {
                        StreamProducer.this.f208736r1.setHeadsetStatus(false);
                    }
                    if (StreamProducer.this.f208738s1 != null) {
                        StreamProducer.this.f208738s1.setHeadsetStatus(false);
                    }
                    StreamProducer.this.m222625p0();
                    return;
                }
                if (intent.getIntExtra("state", 0) == 1) {
                    StreamProducer streamProducer2 = StreamProducer.this;
                    IjkMediaPlayer ijkMediaPlayer = streamProducer2.f208735r;
                    if (ijkMediaPlayer != null) {
                        ijkMediaPlayer.setMediaDataCallback(streamProducer2.f208681R1);
                    }
                    StreamProducer.this.f208750y1 = true;
                    if (StreamProducer.this.f208748x1 != null) {
                        StreamProducer.this.f208748x1.m222836a(StreamProducer.this.f208636C, 1, 1);
                    }
                    StreamProducer streamProducer3 = StreamProducer.this;
                    ijkMediaStreamer ijkmediastreamer2 = streamProducer3.f208636C;
                    if (ijkmediastreamer2 != null && streamProducer3.f208634B != null && ijkmediastreamer2.getStreamerType() == 2) {
                        ((AudioManager) StreamProducer.this.f208634B.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(false);
                    }
                    if (StreamProducer.this.f208736r1 != null) {
                        StreamProducer.this.f208736r1.setHeadsetStatus(true);
                    }
                    if (StreamProducer.this.f208738s1 != null) {
                        StreamProducer.this.f208738s1.setHeadsetStatus(true);
                    }
                    StreamProducer.this.m222625p0();
                    n8c.m158485c("streamerCameraProducer", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + StreamProducer.this.f208750y1);
                }
            }
        }
    }

    public interface PacketBufferlingStatusListener {
        /* JADX INFO: renamed from: a */
        void mo222744a(int i, long j);
    }

    public class VideoRecordRunnable implements Runnable {
        private VideoRecordRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (StreamProducer.this.f208665M0) {
                mpd0 mpd0VarM222472d1 = StreamProducer.this.f208692W0.m222472d1();
                if (mpd0VarM222472d1 != null) {
                    ByteBuffer byteBufferM155799b = mpd0VarM222472d1.m155799b();
                    long jM155801d = mpd0VarM222472d1.m155801d();
                    if (jM155801d == -12345) {
                        return;
                    }
                    StreamProducer streamProducer = StreamProducer.this;
                    MediaCodec mediaCodec = streamProducer.f208728o;
                    long j = 0;
                    if (mediaCodec != null) {
                        try {
                            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                            if (iDequeueInputBuffer >= 0) {
                                int iCapacity = StreamProducer.this.f208739t[iDequeueInputBuffer].capacity() < byteBufferM155799b.limit() ? StreamProducer.this.f208739t[iDequeueInputBuffer].capacity() : byteBufferM155799b.limit();
                                StreamProducer.this.f208739t[iDequeueInputBuffer].clear();
                                byteBufferM155799b.rewind();
                                StreamProducer.this.f208739t[iDequeueInputBuffer].put(byteBufferM155799b);
                                StreamProducer.this.f208728o.queueInputBuffer(iDequeueInputBuffer, 0, iCapacity, jM155801d, 0);
                            } else {
                                n8c.m158485c("streamerCameraProducer", "No buffer available !");
                            }
                        } catch (IllegalStateException unused) {
                        }
                    } else {
                        long j2 = streamProducer.f208686T0;
                        StreamProducer streamProducer2 = StreamProducer.this;
                        if (j2 == 0) {
                            streamProducer2.f208686T0 = jM155801d;
                        } else {
                            j = (jM155801d / 1000) - (streamProducer2.f208686T0 / 1000);
                        }
                        if (StreamProducer.this.f208736r1 != null) {
                            StreamProducer.this.f208736r1.writeVideo(j, byteBufferM155799b, byteBufferM155799b.limit());
                        }
                    }
                }
            }
        }
    }

    static {
        try {
            Class.forName("android.media.MediaCodec");
            n8c.m158485c("streamerCameraProducer", "Phone supports the MediaCoded API");
            f208631T1 = (byte) 5;
            n8c.m158485c("streamerCameraProducer", "Phone supports the MediaCoded v2 API");
        } catch (ClassNotFoundException unused) {
            f208631T1 = (byte) 1;
            n8c.m158485c("streamerCameraProducer", "Phone does not support the MediaCodec API");
        }
    }

    public StreamProducer(Context context, ijkMediaStreamer ijkmediastreamer, MomoSurface momoSurface) {
        AudioQuality audioQualityM223810clone = AudioQuality.DEFAULT_AUDIO_QUALITY.m223810clone();
        this.f208711g = audioQualityM223810clone;
        this.f208713h = audioQualityM223810clone.m223810clone();
        VideoQuality videoQualityM223811clone = VideoQuality.DEFAULT_VIDEO_QUALITY.m223811clone();
        this.f208715i = videoQualityM223811clone;
        this.f208717j = videoQualityM223811clone.m223811clone();
        this.f208719k = this.f208715i.m223811clone();
        this.f208722l = (byte) -1;
        this.f208724m = 0;
        this.f208726n = 0;
        this.f208728o = null;
        this.f208730p = null;
        this.f208733q = null;
        this.f208735r = null;
        this.f208737s = null;
        this.f208739t = null;
        this.f208741u = 0;
        this.f208743v = 0;
        this.f208745w = 0;
        this.f208747x = 0;
        this.f208749y = 1;
        this.f208751z = 1;
        this.f208632A = null;
        this.f208634B = null;
        this.f208636C = null;
        this.f208638D = null;
        this.f208640E = new Object();
        this.f208643F = new Object();
        this.f208646G = 0;
        this.f208649H = 2048;
        this.f208652I = ByteBuffer.allocate(2048);
        this.f208655J = ByteBuffer.allocate(this.f208649H);
        this.f208658K = ByteBuffer.allocate(this.f208649H);
        this.f208661L = 0;
        this.f208664M = 0;
        this.f208667N = 0;
        this.f208670O = null;
        this.f208676Q = 0;
        this.f208679R = false;
        this.f208682S = 0;
        this.f208685T = false;
        this.f208687U = -1;
        this.f208689V = 0;
        this.f208691W = -1;
        this.f208693X = 0;
        this.f208695Y = 0.0f;
        this.f208697Z = 0;
        this.f208720k0 = false;
        this.f208731p0 = false;
        this.f208641E0 = 0L;
        this.f208644F0 = 1.0f;
        this.f208647G0 = 0.5f;
        this.f208650H0 = false;
        this.f208653I0 = false;
        this.f208656J0 = 6000L;
        this.f208659K0 = 1000L;
        this.f208662L0 = 3000L;
        this.f208665M0 = false;
        this.f208668N0 = true;
        this.f208671O0 = false;
        this.f208674P0 = null;
        this.f208677Q0 = null;
        this.f208680R0 = null;
        this.f208683S0 = 0L;
        this.f208686T0 = 0L;
        this.f208688U0 = null;
        this.f208690V0 = null;
        this.f208692W0 = null;
        this.f208694X0 = null;
        this.f208696Y0 = null;
        this.f208698Z0 = null;
        this.f208700a1 = -1L;
        this.f208704c1 = false;
        this.f208716i1 = null;
        this.f208718j1 = null;
        this.f208721k1 = 0;
        this.f208734q1 = 0;
        this.f208740t1 = false;
        this.f208742u1 = false;
        this.f208744v1 = new HashMap();
        this.f208746w1 = -1;
        this.f208750y1 = false;
        this.f208752z1 = 20;
        this.f208633A1 = false;
        this.f208635B1 = 0;
        this.f208637C1 = null;
        this.f208639D1 = false;
        this.f208642E1 = null;
        this.f208645F1 = null;
        this.f208648G1 = new audio_Indicator();
        this.f208651H1 = new Object();
        this.f208654I1 = null;
        this.f208657J1 = new SinkBase.ExtPcmDateCallback() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.1
            @Override // com.immomo.mediacore.sink.SinkBase.ExtPcmDateCallback
            public void onPcmDateCallback(byte[] bArr, int i, long j) {
                int length = bArr.length;
                StreamProducer.this.f208731p0 = true;
                try {
                    StreamProducer.this.m222631t0();
                    int i2 = 0;
                    while (StreamProducer.this.f208667N + length >= StreamProducer.this.f208649H) {
                        int i3 = StreamProducer.this.f208667N;
                        StreamProducer streamProducer = StreamProducer.this;
                        if (i3 > 0) {
                            byte[] bArr2 = new byte[streamProducer.f208649H];
                            StreamProducer.this.f208658K.rewind();
                            StreamProducer.this.f208658K.get(bArr2, 0, StreamProducer.this.f208667N);
                            StreamProducer.this.f208658K.clear();
                            n8c.m158485c("streamerCameraProducer", "mExtRemainAudioIndex > 0 arraycopy :" + i2 + ";mExtRemainAudioIndex:" + StreamProducer.this.f208667N);
                            System.arraycopy(bArr, i2, bArr2, StreamProducer.this.f208667N, StreamProducer.this.f208649H - StreamProducer.this.f208667N);
                            i2 += StreamProducer.this.f208649H - StreamProducer.this.f208667N;
                            length -= StreamProducer.this.f208649H - StreamProducer.this.f208667N;
                            if (StreamProducer.this.f208673P != null) {
                                n8c.m158485c("streamerCameraProducer", "mExtRemainAudioIndex > 0 putSurroundData :" + i2 + ";lens:" + length);
                                if (StreamProducer.this.f208734q1 == 2) {
                                    StreamProducer.this.m222701e2();
                                }
                                StreamProducer.this.f208673P.putAudioData(new mpd0(bArr2, System.nanoTime() / 1000, StreamProducer.this.f208713h.channelNum));
                            }
                            StreamProducer.this.f208667N = 0;
                        } else {
                            byte[] bArr3 = new byte[streamProducer.f208649H];
                            System.arraycopy(bArr, i2, bArr3, 0, StreamProducer.this.f208649H);
                            if (StreamProducer.this.f208673P != null) {
                                n8c.m158485c("streamerCameraProducer", "mExtRemainAudioIndex == 0 putSurroundData pos :" + i2 + ";lens:" + length);
                                if (StreamProducer.this.f208734q1 == 2) {
                                    StreamProducer.this.m222701e2();
                                }
                                StreamProducer.this.f208673P.putAudioData(new mpd0(bArr3, System.nanoTime() / 1000, StreamProducer.this.f208713h.channelNum));
                            }
                            length -= StreamProducer.this.f208649H;
                            i2 += StreamProducer.this.f208649H;
                        }
                    }
                    if (length > 0) {
                        StreamProducer.this.f208658K.put(bArr, i2, length);
                        StreamProducer.m222633v(StreamProducer.this, length);
                        n8c.m158485c("streamerCameraProducer", "mExtRemainAudioIndex.put:pos:" + i2 + ";lens:" + StreamProducer.this.f208667N);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    StreamProducer.this.f208667N = 0;
                    StreamProducer.this.f208658K.clear();
                    n8c.m158485c("streamerCameraProducer", "onMediaDateCallback:exception");
                }
            }
        };
        this.f208660K1 = new SinkBase.PcmDateCallback() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.2
            @Override // com.immomo.mediacore.sink.SinkBase.PcmDateCallback
            public void onPcmDateCallback(long j, byte[] bArr, int i, boolean z) {
                int length = bArr.length;
                int i2 = 0;
                while (StreamProducer.this.f208664M + length >= StreamProducer.this.f208649H) {
                    try {
                        int i3 = StreamProducer.this.f208664M;
                        StreamProducer streamProducer = StreamProducer.this;
                        if (i3 > 0) {
                            byte[] bArr2 = new byte[streamProducer.f208649H];
                            StreamProducer.this.f208655J.rewind();
                            StreamProducer.this.f208655J.get(bArr2, 0, StreamProducer.this.f208664M);
                            StreamProducer.this.f208655J.clear();
                            n8c.m158485c("streamerCameraProducer", "mAttachMergeRemainAudioIndex > 0 arraycopy :" + i2 + ";mAttachMergeRemainAudioIndex:" + StreamProducer.this.f208664M);
                            System.arraycopy(bArr, i2, bArr2, StreamProducer.this.f208664M, StreamProducer.this.f208649H - StreamProducer.this.f208664M);
                            i2 += StreamProducer.this.f208649H - StreamProducer.this.f208664M;
                            length -= StreamProducer.this.f208649H - StreamProducer.this.f208664M;
                            if (StreamProducer.this.f208673P != null) {
                                n8c.m158485c("streamerCameraProducer", "mAttachMergeRemainAudioIndex > 0 putSurroundData :" + i2 + ";lens:" + length);
                                StreamProducer.this.f208673P.putAudioData(new mpd0(bArr2, System.nanoTime() / 1000, StreamProducer.this.f208713h.channelNum));
                            }
                            StreamProducer.this.f208664M = 0;
                        } else {
                            byte[] bArr3 = new byte[streamProducer.f208649H];
                            System.arraycopy(bArr, i2, bArr3, 0, StreamProducer.this.f208649H);
                            if (StreamProducer.this.f208673P != null) {
                                n8c.m158485c("streamerCameraProducer", "mAttachMergeRemainAudioIndex == 0 putSurroundData pos :" + i2 + ";lens:" + length);
                                StreamProducer.this.f208673P.putAudioData(new mpd0(bArr3, System.nanoTime() / 1000, StreamProducer.this.f208713h.channelNum));
                            }
                            length -= StreamProducer.this.f208649H;
                            i2 += StreamProducer.this.f208649H;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        StreamProducer.this.f208664M = 0;
                        StreamProducer.this.f208655J.clear();
                        n8c.m158485c("streamerCameraProducer", "onMediaDateCallback:exception");
                        return;
                    }
                }
                if (length > 0) {
                    StreamProducer.this.f208655J.put(bArr, i2, length);
                    StreamProducer.m222616k0(StreamProducer.this, length);
                    n8c.m158485c("streamerCameraProducer", "mAttachMergeRemainAudio.put:pos:" + i2 + ";lens:" + StreamProducer.this.f208664M);
                }
            }
        };
        this.f208663L1 = new IMediaPlayer.OnPreparedListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.3
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                n8c.m158483a("streamerCameraProducer", "Mediaplayer onPrepared");
                StreamProducer.this.f208721k1 = 2;
                StreamProducer.this.f208742u1 = true;
                long j = StreamProducer.this.f208723l1;
                if (j != 0) {
                    StreamProducer.this.m222712l1(j);
                    StreamProducer.this.m222699e();
                }
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f208725m1;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m222834a(streamProducer.f208636C, 1, 0);
                }
                StreamProducer.this.m222625p0();
            }
        };
        this.f208666M1 = new IMediaPlayer.OnCompletionListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.4
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                StreamProducer.this.f208742u1 = false;
                StreamProducer.this.f208721k1 = 5;
                n8c.m158483a("streamerCameraProducer", "Mediaplayer onCompletion");
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f208725m1;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m222834a(streamProducer.f208636C, 2, 0);
                }
            }
        };
        this.f208669N1 = new IMediaPlayer.OnErrorListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.5
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                n8c.m158484b("streamerCameraProducer", "Mediaplayer Error: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
                StreamProducer.this.f208742u1 = false;
                StreamProducer.this.f208721k1 = -1;
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f208725m1;
                if (onSurroundMusicStatusListener == null) {
                    return true;
                }
                onSurroundMusicStatusListener.m222834a(streamProducer.f208636C, -1, 0);
                return true;
            }
        };
        this.f208672O1 = new IMediaPlayer.OnBufferingUpdateListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.6
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            }
        };
        this.f208675P1 = new IMediaPlayer.OnInfoListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.7
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                n8c.m158484b("streamerCameraProducer", "Mediaplayer onInfo: (%d, %d)", Integer.valueOf(i), Integer.valueOf(i2));
                return true;
            }
        };
        this.f208678Q1 = new IMediaPlayer.OnSeekCompleteListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.8
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                n8c.m158483a("streamerCameraProducer", "Mediaplayer onSeekComplete");
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f208725m1;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m222834a(streamProducer.f208636C, 3, 0);
                }
            }
        };
        this.f208681R1 = new IjkMediaPlayer.MediaDateCallback() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.9
            @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
            public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
                n8c.m158485c("streamerCameraProducer", "Mediaplayer mMediaDateCallback data.len" + bArr.length + ";recording:" + StreamProducer.this.f208740t1);
                int length = bArr.length;
                if (StreamProducer.this.f208740t1 && StreamProducer.this.f208742u1) {
                    int i3 = 0;
                    while (length >= StreamProducer.this.f208649H) {
                        try {
                            int i4 = StreamProducer.this.f208661L;
                            StreamProducer streamProducer = StreamProducer.this;
                            if (i4 > 0) {
                                byte[] bArr2 = new byte[streamProducer.f208649H];
                                StreamProducer.this.f208652I.rewind();
                                StreamProducer.this.f208652I.get(bArr2, 0, StreamProducer.this.f208661L);
                                StreamProducer.this.f208652I.clear();
                                n8c.m158485c("streamerCameraProducer", "mRemainAudioIndex > 0 arraycopy :" + i3 + ";mRemainAudioIndex:" + StreamProducer.this.f208661L);
                                System.arraycopy(bArr, i3, bArr2, StreamProducer.this.f208661L, StreamProducer.this.f208649H - StreamProducer.this.f208661L);
                                i3 += StreamProducer.this.f208649H - StreamProducer.this.f208661L;
                                length -= StreamProducer.this.f208649H - StreamProducer.this.f208661L;
                                if (StreamProducer.this.f208673P == null) {
                                    StreamProducer.this.f208673P = new AudioProcess();
                                }
                                if (StreamProducer.this.f208673P != null) {
                                    n8c.m158485c("streamerCameraProducer", "mRemainAudioIndex > 0 putSurroundData :" + i3 + ";lens:" + length);
                                    StreamProducer.this.f208673P.putSurroundData(new mpd0(bArr2, System.nanoTime() / 1000, StreamProducer.this.f208713h.channelNum));
                                }
                                StreamProducer.this.f208661L = 0;
                            } else {
                                byte[] bArr3 = new byte[streamProducer.f208649H];
                                System.arraycopy(bArr, i3, bArr3, 0, StreamProducer.this.f208649H);
                                if (StreamProducer.this.f208673P != null) {
                                    n8c.m158485c("streamerCameraProducer", "mRemainAudioIndex == 0 putSurroundData pos :" + i3 + ";lens:" + length);
                                    StreamProducer.this.f208673P.putSurroundData(new mpd0(bArr3, System.nanoTime() / 1000, StreamProducer.this.f208713h.channelNum));
                                }
                                length -= StreamProducer.this.f208649H;
                                i3 += StreamProducer.this.f208649H;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            StreamProducer.this.f208661L = 0;
                            StreamProducer.this.f208652I.clear();
                            n8c.m158485c("streamerCameraProducer", "onMediaDateCallback:exception");
                            return;
                        }
                    }
                    if (length > 0) {
                        StreamProducer.this.f208652I.put(bArr, i3, length);
                        StreamProducer.this.f208661L = length;
                        n8c.m158485c("streamerCameraProducer", "mRemainAudio.put:pos:" + i3 + ";lens:" + StreamProducer.this.f208661L);
                    }
                }
            }
        };
        this.f208684S1 = new Handler(Looper.getMainLooper());
        n8c.m158485c("streamerCameraProducer", "StreamProducer:" + ((int) this.f208722l));
        this.f208634B = context;
        this.f208636C = ijkmediastreamer;
        this.f208692W0 = momoSurface;
        if (this.f208645F1 == null) {
            HandlerThread handlerThread = new HandlerThread("ijkStrMonitor");
            this.f208645F1 = handlerThread;
            handlerThread.start();
            this.f208642E1 = new Handler(this.f208645F1.getLooper());
        }
        m222711k2();
        m222617k1();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m222571C(StreamProducer streamProducer) {
        int i = streamProducer.f208635B1;
        streamProducer.f208635B1 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public void m222582M1() {
        Handler handler = this.f208642E1;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.10
                @Override // java.lang.Runnable
                public void run() {
                    StreamProducer.this.notifyExtralAudioLoss();
                }
            }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
    }

    /* JADX INFO: renamed from: V0 */
    private void m222592V0() {
        this.f208706d1 = new VideoRecordRunnable();
        Thread thread = new Thread(this.f208706d1, "live-media-StreamVideoRecorder");
        this.f208708e1 = thread;
        thread.start();
    }

    /* JADX INFO: renamed from: Z1 */
    private void m222597Z1() {
        n8c.m158485c("streamerCameraProducer", "AudioRecordRunnable startAudioCapture stopAudioCapture");
        m222701e2();
        synchronized (this.f208643F) {
            try {
                if (this.f208738s1 == null && this.f208729o1 == null) {
                    n8c.m158485c("streamerCameraProducer", "AudioRecordRunnable startAudioCapture");
                    this.f208668N0 = true;
                    if (this.f208673P == null) {
                        AudioProcess audioProcess = new AudioProcess();
                        this.f208673P = audioProcess;
                        audioProcess.setMasterAudioLevel(this.f208644F0);
                        this.f208673P.setSlaveAudioLevel(this.f208647G0);
                        this.f208673P.startAudioProcessding();
                        boolean z = this.f208679R;
                        if (z) {
                            this.f208673P.adjustEQ(this.f208676Q, z);
                        }
                        boolean z2 = this.f208720k0;
                        if (z2) {
                            this.f208673P.adjustTune(this.f208697Z, z2);
                        }
                        boolean z3 = this.f208685T;
                        if (z3) {
                            this.f208673P.adjustAef(this.f208682S, z3);
                        }
                        int i = this.f208687U;
                        if (i >= 0) {
                            this.f208673P.adjustEf(i, this.f208689V);
                        }
                        int i2 = this.f208691W;
                        if (i2 >= 0) {
                            this.f208673P.SabineEffectSet(i2, this.f208693X, this.f208695Y);
                        }
                        this.f208673P.openSabineEf(44100, 2, this.f208649H / 2);
                    }
                    if (this.f208702b1 == null) {
                        AudioRecordRunnable audioRecordRunnable = new AudioRecordRunnable();
                        this.f208702b1 = audioRecordRunnable;
                        audioRecordRunnable.m222747c(this.f208704c1);
                    }
                    if (this.f208710f1 == null) {
                        Thread thread = new Thread(this.f208702b1, "live-media-AudRec");
                        this.f208710f1 = thread;
                        thread.start();
                    }
                    this.f208702b1.m222745a(this.f208673P);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a2 */
    private int m222599a2() {
        n8c.m158485c("streamerCameraProducer", "AudioRecordRunnable startAudioCapture stopAudioCapture");
        return 0;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ long m222600b0(StreamProducer streamProducer) {
        long j = streamProducer.f208641E0;
        streamProducer.f208641E0 = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: f2 */
    private void m222606f2() {
        if (this.f208712g1 != null) {
            try {
                this.f208671O0 = false;
                this.f208712g1.join(1000L);
            } catch (InterruptedException unused) {
                this.f208712g1.interrupt();
            }
            this.f208712g1 = null;
        }
        if (this.f208654I1 != null) {
            removePcmDataCallback(this.f208654I1);
            this.f208654I1 = null;
        }
        n8c.m158485c("streamerCameraProducer", "stopAudioEncode");
        MediaCodecAudioMux mediaCodecAudioMux = this.f208698Z0;
        if (mediaCodecAudioMux != null) {
            mediaCodecAudioMux.stop();
            this.f208698Z0 = null;
        }
        this.f208733q = null;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ int m222616k0(StreamProducer streamProducer, int i) {
        int i2 = streamProducer.f208664M + i;
        streamProducer.f208664M = i2;
        return i2;
    }

    /* JADX INFO: renamed from: k1 */
    private void m222617k1() {
        try {
            this.f208716i1 = new HeadsetPlugReceiver();
            this.f208718j1 = new BlueConnectStateBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            this.f208638D = intentFilter;
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            Context context = this.f208634B;
            if (context != null) {
                ii5.m136342l(context, this.f208716i1, this.f208638D);
                ii5.m136342l(this.f208634B, this.f208718j1, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                this.f208750y1 = ((AudioManager) this.f208634B.getApplicationContext().getSystemService("audio")).isWiredHeadsetOn();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public void m222625p0() {
        IjkMediaPlayer ijkMediaPlayer = this.f208735r;
        if (ijkMediaPlayer != null) {
            if (this.f208750y1 && this.f208639D1) {
                float f = this.f208647G0;
                ijkMediaPlayer.setVolume(f * 0.18f, f * 0.18f);
            } else {
                float f2 = this.f208647G0;
                ijkMediaPlayer.setVolume(f2 * 0.18f, f2 * 0.18f);
            }
        }
    }

    /* JADX INFO: renamed from: s2 */
    private void m222629s2() {
        VideoQuality videoQuality = this.f208717j;
        int i = videoQuality.resX;
        if (i % 2 != 0) {
            videoQuality.resX = i - 1;
        }
        int i2 = videoQuality.resY;
        if (i2 % 2 != 0) {
            videoQuality.resY = i2 - 1;
        }
        if (videoQuality.resX < 176) {
            videoQuality.resX = 176;
        }
        if (videoQuality.resY < 32) {
            videoQuality.resY = 32;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m222631t0() {
        Handler handler = this.f208642E1;
        if (handler != null) {
            handler.removeCallbacks(null);
            this.f208642E1.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m222633v(StreamProducer streamProducer, int i) {
        int i2 = streamProducer.f208667N + i;
        streamProducer.f208667N = i2;
        return i2;
    }

    /* JADX INFO: renamed from: v0 */
    private void m222634v0() throws IOException {
        Thread thread = new Thread(new AudioEncoderRunnable(), "live-media-EnAudioSoft");
        this.f208712g1 = thread;
        thread.start();
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    /* JADX INFO: renamed from: w0 */
    private void m222636w0() throws IOException {
        try {
            this.f208671O0 = true;
            this.f208733q = MediaCodec.createEncoderByType("audio/mp4a-latm");
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
            mediaFormat.setInteger("bitrate", this.f208713h.bitRate);
            mediaFormat.setInteger("channel-count", this.f208713h.channelNum);
            mediaFormat.setInteger("sample-rate", this.f208713h.samplingRate);
            mediaFormat.setInteger("aac-profile", 2);
            mediaFormat.setInteger("max-input-size", this.f208649H);
            this.f208733q.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f208733q.start();
            this.f208670O = this.f208733q.getInputBuffers();
            SinkBase sinkBase = this.f208736r1;
            if (sinkBase != null) {
                sinkBase.setErrorCode(0);
            }
            MediaCodecAudioMux mediaCodecAudioMux = new MediaCodecAudioMux(this.f208733q, this.f208736r1);
            this.f208698Z0 = mediaCodecAudioMux;
            mediaCodecAudioMux.m222148l();
            this.f208698Z0.m222144h(new PacketBufferlingStatusListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.14
                @Override // tv.danmaku.ijk.media.streamer.StreamProducer.PacketBufferlingStatusListener
                /* JADX INFO: renamed from: a */
                public void mo222744a(int i, long j) {
                    n8c.m158485c("streamerCameraProducer", "audioMux PacketBufferlingStatusUpdata: " + i + ";duration:" + j);
                    if (i == 104) {
                        long unused = StreamProducer.this.f208656J0;
                        long unused2 = StreamProducer.this.f208656J0;
                    }
                }
            });
            Thread thread = new Thread(new AudioEncoderRunnable(), "live-media-EnAudioMCodec");
            this.f208712g1 = thread;
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public long m222640A0() {
        MediaCodecAudioMux mediaCodecAudioMux = this.f208698Z0;
        if (mediaCodecAudioMux != null) {
            return mediaCodecAudioMux.m222131n();
        }
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20010, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: A1 */
    public void m222641A1(long j) {
        MediaCodecVideoMux mediaCodecVideoMux = this.f208694X0;
        if (mediaCodecVideoMux == null) {
            this.f208700a1 = j;
        } else {
            mediaCodecVideoMux.m222143g(j);
            this.f208700a1 = -1L;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public long m222642B0() {
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            return audioProcess.getAudioFrames();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: B1 */
    public void m222643B1(long j) {
        this.f208662L0 = j;
        if (j <= 0) {
            this.f208662L0 = 1000L;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public long m222644C0() {
        return this.f208641E0 * ((long) this.f208649H);
    }

    /* JADX INFO: renamed from: C1 */
    public void m222645C1(ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener) {
        this.f208725m1 = onSurroundMusicStatusListener;
    }

    /* JADX INFO: renamed from: D0 */
    public long m222646D0() {
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20008, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: D1 */
    public void m222647D1(ijkMediaStreamer.OnWiredHeadsetStatusListener onWiredHeadsetStatusListener) {
        this.f208748x1 = onWiredHeadsetStatusListener;
    }

    /* JADX INFO: renamed from: E0 */
    public long m222648E0() {
        MediaCodecAudioMux mediaCodecAudioMux = this.f208698Z0;
        if (mediaCodecAudioMux != null) {
            return mediaCodecAudioMux.m222132o();
        }
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20016, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: E1 */
    public void m222649E1(PointF pointF) {
        this.f208699a = pointF;
    }

    /* JADX INFO: renamed from: F0 */
    public long m222650F0() {
        MediaCodecVideoMux mediaCodecVideoMux = this.f208694X0;
        if (mediaCodecVideoMux != null) {
            return mediaCodecVideoMux.m222134n();
        }
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20015, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F1 */
    public void m222651F1(float f) {
        this.f208701b = f;
    }

    /* JADX INFO: renamed from: G0 */
    public float m222652G0() {
        return this.f208644F0;
    }

    /* JADX INFO: renamed from: G1 */
    public void m222653G1(String str) {
        n8c.m158485c("streamerCameraProducer", "setSei:" + str);
        this.f208707e = str;
        MediaCodecVideoMux mediaCodecVideoMux = this.f208694X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.m222147k(str);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public int m222654H0() {
        return this.f208746w1;
    }

    /* JADX INFO: renamed from: H1 */
    public void m222655H1(float f) {
        this.f208647G0 = f;
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
        m222625p0();
    }

    /* JADX INFO: renamed from: I0 */
    public int m222656I0() {
        return 0;
    }

    /* JADX INFO: renamed from: I1 */
    public void m222657I1(long j, boolean z) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f208692W0;
            if (momoSurface != null) {
                momoSurface.m222458U0(j, z);
                return;
            }
            return;
        }
        Map map = this.f208744v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f208744v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m222215o2(j, z);
    }

    /* JADX INFO: renamed from: J0 */
    public MomoSurface m222658J0() {
        return this.f208692W0;
    }

    /* JADX INFO: renamed from: J1 */
    public void m222659J1(long j, boolean z) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f208692W0;
            if (momoSurface != null) {
                momoSurface.m222459V0(j, z);
                return;
            }
            return;
        }
        Map map = this.f208744v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f208744v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m222219s2(j, z);
    }

    /* JADX INFO: renamed from: K0 */
    public long m222660K0() {
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20004, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: K1 */
    public void m222661K1(long j, int i, int i2, int i3, int i4, int i5) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f208692W0;
            if (momoSurface != null) {
                momoSurface.m222460W0(j, i, i2, i3, i4, i5);
                return;
            }
            return;
        }
        Map map = this.f208744v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f208744v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m222214C2(j, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m222662L0() {
        return this.f208740t1;
    }

    /* JADX INFO: renamed from: L1 */
    public void m222663L1(long j, int i, int i2, int i3, int i4) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f208692W0;
            if (momoSurface != null) {
                momoSurface.m222462X0(j, i, i2, i3, i4);
                return;
            }
            return;
        }
        Map map = this.f208744v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f208744v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m222225z2(j, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: M0 */
    public float m222664M0() {
        return this.f208647G0;
    }

    /* JADX INFO: renamed from: N0 */
    public long m222665N0() {
        IjkMediaPlayer ijkMediaPlayer = this.f208735r;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: N1 */
    public void m222666N1(int i) {
        audio_Indicator audio_indicator = this.f208648G1;
        if (audio_indicator != null) {
            audio_indicator.setUserID(i);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public long m222667O0() {
        IjkMediaPlayer ijkMediaPlayer = this.f208735r;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: O1 */
    public void m222668O1(z1l0 z1l0Var) {
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            sinkBase.setVideoChannellistener(z1l0Var);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public long m222669P0() {
        MediaCodecVideoMux mediaCodecVideoMux = this.f208694X0;
        if (mediaCodecVideoMux != null) {
            return mediaCodecVideoMux.m222136p();
        }
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20013, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: P1 */
    public void m222670P1(int i) {
        n8c.m158485c("streamerCameraProducer", "----setVideoEncodingBitRate: " + this.f208717j.bitrate + "---->" + i);
        this.f208717j.bitrate = i;
        MediaCodecVideoMux mediaCodecVideoMux = this.f208694X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.m222140d(i);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public long m222671Q0() {
        MediaCodecVideoMux mediaCodecVideoMux = this.f208694X0;
        if (mediaCodecVideoMux != null) {
            return mediaCodecVideoMux.m222135o();
        }
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20012, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m222672Q1(int i) {
        VideoQuality videoQuality = this.f208717j;
        videoQuality.framerate = i;
        if (i > 30) {
            videoQuality.framerate = 30;
        }
        if (videoQuality.framerate <= 0) {
            videoQuality.framerate = 20;
        }
        this.f208752z1 = videoQuality.framerate;
        m222696d(i, false);
    }

    /* JADX INFO: renamed from: R0 */
    public int m222673R0() {
        return this.f208717j.bitrate;
    }

    /* JADX INFO: renamed from: R1 */
    public void m222674R1(int i, int i2) {
        VideoQuality videoQuality = this.f208717j;
        videoQuality.resX = i;
        videoQuality.resY = i2;
    }

    /* JADX INFO: renamed from: S0 */
    public long m222675S0() {
        MomoSurface momoSurface = this.f208692W0;
        if (momoSurface != null) {
            return momoSurface.m222492w0();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: S1 */
    public void m222676S1(int i) {
        this.f208749y = i;
    }

    /* JADX INFO: renamed from: T0 */
    public int m222677T0() {
        return this.f208635B1;
    }

    /* JADX INFO: renamed from: T1 */
    public void m222678T1(int i) {
        MomoSurface momoSurface = this.f208692W0;
        if (momoSurface != null) {
            momoSurface.m222466Z0(i);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m222679U0() {
        synchronized (this.f208651H1) {
            try {
                if (this.f208637C1 == null && this.f208750y1 && this.f208639D1) {
                    AudioQuality audioQuality = this.f208713h;
                    NonBlockingAudioTrack nonBlockingAudioTrack = new NonBlockingAudioTrack(audioQuality.samplingRate, audioQuality.channelNum);
                    this.f208637C1 = nonBlockingAudioTrack;
                    nonBlockingAudioTrack.play();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m222680U1(boolean z) {
        this.f208639D1 = z;
        if (!z) {
            m222690b();
        }
        m222625p0();
    }

    /* JADX INFO: renamed from: V1 */
    public void m222681V1() {
        if (m222599a2() == 0) {
            m222597Z1();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m222682W0() {
        int i;
        return (this.f208735r == null || (i = this.f208721k1) == -1 || i == 0 || i == 1) ? false : true;
    }

    /* JADX INFO: renamed from: W1 */
    public void m222683W1() {
        synchronized (this.f208640E) {
            try {
                try {
                    m222681V1();
                    if (this.f208722l == 5) {
                        m222636w0();
                    } else {
                        m222634v0();
                    }
                } catch (Error e) {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m222684X0() {
        return this.f208750y1;
    }

    /* JADX INFO: renamed from: X1 */
    public void m222685X1(Activity activity, Bitmap bitmap, int i, int i2, int i3, int i4) {
        n8c.m158485c("streamerCameraProducer", "----startCaptureImage(S):" + this.f208727n1);
        SourceBase sourceBase = this.f208727n1;
        if (sourceBase != null) {
            this.f208646G = 0;
            sourceBase.mo222317J(activity, bitmap, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m222686Y0(boolean z) {
    }

    /* JADX INFO: renamed from: Y1 */
    public void m222687Y1(Activity activity, int i, int i2, MediaProjection mediaProjection, int i3) {
        n8c.m158485c("streamerCameraProducer", "----startCaptureScreen(S):" + this.f208727n1);
        SourceBase sourceBase = this.f208727n1;
        if (sourceBase != null) {
            this.f208646G = 0;
            sourceBase.mo222331K(activity, i, i2, mediaProjection, i3);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m222688Z0(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.streamer.MomoSurface.PostDrawImageCallback
    /* JADX INFO: renamed from: a */
    public void mo222494a(int i) {
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            sinkBase.postDrawImage(i);
        }
        if (this.f208738s1 != null) {
            this.f208738s1.postDrawImage(i);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m222689a1(boolean z) {
        this.f208704c1 = z;
        AudioRecordRunnable audioRecordRunnable = this.f208702b1;
        if (audioRecordRunnable != null) {
            audioRecordRunnable.m222747c(z);
        }
        IjkMediaPlayer ijkMediaPlayer = this.f208735r;
        if (ijkMediaPlayer != null) {
            if (this.f208704c1) {
                ijkMediaPlayer.setMediaDataCallback(null);
                this.f208735r.setMediaDataCallback(this.f208681R1);
                this.f208735r.setMediaDateCallbackFlags(1);
            } else {
                if (this.f208750y1) {
                    return;
                }
                ijkMediaPlayer.setMediaDataCallback(null);
                this.f208735r.setMediaDateCallbackFlags(0);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m222690b() {
        synchronized (this.f208651H1) {
            try {
                NonBlockingAudioTrack nonBlockingAudioTrack = this.f208637C1;
                if (nonBlockingAudioTrack != null) {
                    nonBlockingAudioTrack.stop();
                    this.f208637C1.release();
                    this.f208637C1 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m222691b1(boolean z) {
    }

    /* JADX INFO: renamed from: b2 */
    public void m222692b2() {
        n8c.m158485c("streamerCameraProducer", "----startRecording(S):" + ((int) this.f208722l) + ";recording =" + this.f208740t1 + ";mVideoSource=" + this.f208727n1);
        if (!this.f208740t1 && m222707i1()) {
            this.f208740t1 = true;
            m222683W1();
            m222695c2();
            this.f208650H0 = false;
            n8c.m158485c("streamerCameraProducer", "----startRecording(E):" + ((int) this.f208722l) + ";recording =" + this.f208740t1);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m222693c(boolean z) {
        synchronized (this.f208640E) {
            try {
                AudioProcess audioProcess = this.f208673P;
                if (audioProcess != null) {
                    if (z) {
                        n8c.m158485c("streamerCameraProducer", "AudioRecordRunnable EnableExternalAudio stopAudioCapture");
                        m222701e2();
                    } else {
                        audioProcess.clear();
                        n8c.m158485c("streamerCameraProducer", "AudioRecordRunnable EnableExternalAudio startAudioCapture");
                        m222681V1();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m222694c1(long j, boolean z) {
    }

    /* JADX INFO: renamed from: c2 */
    public void m222695c2() {
        synchronized (this.f208640E) {
            try {
                try {
                    this.f208665M0 = true;
                    if (this.f208722l != 5) {
                        MomoSurface momoSurface = this.f208692W0;
                        if (momoSurface != null) {
                            momoSurface.m222465Z(null);
                            this.f208692W0.m222449M0(this.f208717j.framerate, false);
                        }
                        this.f208692W0.m222467b0();
                        m222592V0();
                    } else {
                        m222738x0();
                    }
                    this.f208740t1 = true;
                } catch (Error e) {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m222696d(int i, boolean z) {
        if (this.f208692W0 != null) {
            n8c.m158485c("streamerCameraProducer", "softFrameRateUpdata: " + i + ";needDrop:" + z);
            this.f208692W0.m222449M0(i, z);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m222697d1(long j, boolean z) {
    }

    /* JADX INFO: renamed from: d2 */
    public void m222698d2() {
        MomoSurface momoSurface = this.f208692W0;
        if (momoSurface != null) {
            momoSurface.m222442C0();
        }
        MediaCodecVideoMux mediaCodecVideoMux = this.f208696Y0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.stop();
            this.f208696Y0 = null;
        }
        this.f208696Y0 = null;
    }

    /* JADX INFO: renamed from: e */
    public void m222699e() {
        if (m222682W0()) {
            this.f208735r.start();
            this.f208721k1 = 3;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m222700e1(Activity activity, long j, Bitmap bitmap) {
        if (bitmap == null || this.f208692W0 == null || this.f208744v1 == null) {
            return;
        }
        n8c.m158485c("streamerCameraProducer", "openPublishHelp(S): label [" + j + "], bitmap=" + bitmap);
        if (this.f208744v1.containsKey(Long.valueOf(j))) {
            if (((AidSource) this.f208744v1.get(Long.valueOf(j))) != null) {
                n8c.m158485c("streamerCameraProducer", "openPublishHelp: userID[" + j + "]未释放！！！");
                return;
            }
            return;
        }
        AidSource aidSource = new AidSource(bitmap, this.f208692W0, j, -1);
        n8c.m158485c("streamerCameraProducer", "openPublishHelp: add [" + j + Constants.AES_SUFFIX);
        this.f208744v1.put(Long.valueOf(j), aidSource);
    }

    /* JADX INFO: renamed from: e2 */
    public void m222701e2() {
        synchronized (this.f208643F) {
            try {
                if (this.f208729o1 != null) {
                    return;
                }
                AudioRecordRunnable audioRecordRunnable = this.f208702b1;
                if (audioRecordRunnable != null) {
                    audioRecordRunnable.m222745a(null);
                }
                if (this.f208710f1 != null) {
                    try {
                        this.f208668N0 = false;
                        this.f208710f1.join(2000L);
                    } catch (InterruptedException unused) {
                        this.f208710f1.interrupt();
                    }
                    this.f208710f1 = null;
                    n8c.m158485c("streamerCameraProducer", "AudioRecordRunnable stopAudioCapture");
                }
                this.f208702b1 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m222702f1(Activity activity, ijkMediaStreamer ijkmediastreamer, long j, String str, int i, int i2, ijkMediaStreamer.SizeChangedCallback sizeChangedCallback, int i3, ijkMediaStreamer.aidSwitchResolution aidswitchresolution) {
        String str2 = "tcp://" + str + ":" + i + "?listen";
        if (str == null || this.f208692W0 == null || ijkmediastreamer == null || this.f208744v1 == null) {
            return;
        }
        n8c.m158485c("streamerCameraProducer", "openPublishHelp(S): label [" + j + "], type=" + i3 + ", ip[" + str + "], " + sizeChangedCallback);
        if (this.f208744v1.containsKey(Long.valueOf(j))) {
            if (((AidSource) this.f208744v1.get(Long.valueOf(j))) != null) {
                n8c.m158485c("streamerCameraProducer", "openPublishHelp: userID[" + j + "]未释放！！！");
                return;
            }
            return;
        }
        AidSource aidSource = new AidSource(activity, this, ijkmediastreamer, str2, this.f208692W0, j, sizeChangedCallback, i3, -1, aidswitchresolution);
        n8c.m158485c("streamerCameraProducer", "openPublishHelp: add [" + j + Constants.AES_SUFFIX);
        this.f208744v1.put(Long.valueOf(j), aidSource);
    }

    /* JADX INFO: renamed from: g1 */
    public void m222703g1(Activity activity, ijkMediaStreamer ijkmediastreamer, long j, String str, ijkMediaStreamer.SizeChangedCallback sizeChangedCallback, int i) {
        if (str == null || this.f208692W0 == null || ijkmediastreamer == null || this.f208744v1 == null) {
            return;
        }
        n8c.m158485c("streamerCameraProducer", "openPublishHelp(S): label [" + j + "], type=" + i + ", url[" + str + "], " + sizeChangedCallback);
        if (this.f208744v1.containsKey(Long.valueOf(j))) {
            if (((AidSource) this.f208744v1.get(Long.valueOf(j))) != null) {
                n8c.m158485c("streamerCameraProducer", "openPublishHelp: userID[" + j + "]未释放！！！");
                return;
            }
            return;
        }
        AidSource aidSource = new AidSource(activity, this, ijkmediastreamer, str, this.f208692W0, j, sizeChangedCallback, i, -1, null);
        n8c.m158485c("streamerCameraProducer", "openPublishHelp: add [" + j + Constants.AES_SUFFIX);
        this.f208744v1.put(Long.valueOf(j), aidSource);
    }

    /* JADX INFO: renamed from: g2 */
    public void m222704g2() {
        n8c.m158485c("streamerCameraProducer", "AudioRecordRunnable stopAudioRecording stopAudioCapture");
        m222701e2();
        m222606f2();
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.stopAudioProcessding();
            this.f208673P.clear();
            this.f208673P.release();
            this.f208673P = null;
        }
        n8c.m158485c("streamerCameraProducer", "stopAudioRecording");
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public PointF getPreviewScale() {
        return this.f208699a;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public float getPreviewZoom() {
        return this.f208701b;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public int getStreamerType() {
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            return sinkBase.getStreamerType();
        }
        return 0;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public VideoQuality getVideoQuality() {
        n8c.m158485c("streamerCameraProducer", "getVideoQuality: width" + this.f208717j.resX + ";heigh:" + this.f208717j.resY);
        return this.f208717j;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public Object getWriter() {
        return this.f208736r1;
    }

    /* JADX INFO: renamed from: h1 */
    public void m222705h1() {
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        if (m222682W0() && this.f208735r.isPlaying()) {
            this.f208735r.pause();
            this.f208721k1 = 4;
        }
    }

    /* JADX INFO: renamed from: h2 */
    public synchronized void m222706h2(long j) {
        AidSource aidSource;
        n8c.m158485c("streamerCameraProducer", "stopPublishHelp(S): label [" + j + Constants.AES_SUFFIX);
        Map map = this.f208744v1;
        if (map != null && map.containsKey(Long.valueOf(j)) && (aidSource = (AidSource) this.f208744v1.get(Long.valueOf(j))) != null) {
            this.f208744v1.remove(Long.valueOf(j));
            aidSource.m222220u2(1);
            n8c.m158485c("streamerCameraProducer", "stopPublishHelp: remove [" + j + Constants.AES_SUFFIX);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m222707i1() {
        SourceBase sourceBase = this.f208727n1;
        if (sourceBase != null && !sourceBase.mo222290p()) {
            n8c.m158485c("streamerCameraProducer", "zjlfound prepare fail");
            return false;
        }
        n8c.m158485c("streamerCameraProducer", "----zjlfound prepare：bitrate=" + this.f208717j.bitrate);
        this.f208636C.setAudioSource(this.f208751z);
        this.f208636C.setVideoSource(this.f208749y);
        this.f208636C.setAudioEncoder(3);
        this.f208636C.setVideoEncoder(2);
        n8c.m158485c("streamerCameraProducer", "----prepare call setVideoFrameRate: mVideoQuality.bitrate=" + this.f208717j.bitrate);
        this.f208636C.setVideoFrameRate(this.f208717j.framerate);
        this.f208636C.setVideoEncodingBitRate(this.f208717j.bitrate);
        this.f208636C.setAudioEncodingBitRate(this.f208713h.bitRate);
        this.f208636C.setAudioSamplingRate(this.f208713h.samplingRate);
        ijkMediaStreamer ijkmediastreamer = this.f208636C;
        VideoQuality videoQuality = this.f208717j;
        ijkmediastreamer.setVideoSize(videoQuality.resX, videoQuality.resY);
        byte b = this.f208722l;
        ijkMediaStreamer ijkmediastreamer2 = this.f208636C;
        if (b == 5) {
            ijkmediastreamer2.setMediaCodecEnable(true);
        } else {
            ijkmediastreamer2.setMediaCodecEnable(false);
        }
        this.f208636C.setMaxCacheDuration(this.f208656J0);
        this.f208636C.setMinCacheDuration(this.f208659K0);
        this.f208636C.setStreamPixFmt(this.f208692W0.f208485d ? 1L : 0L);
        return this.f208636C.prepare();
    }

    /* JADX INFO: renamed from: i2 */
    public void m222708i2() {
        n8c.m158485c("streamerCameraProducer", "----stopRecording:recording=" + this.f208740t1);
        if (this.f208740t1) {
            this.f208740t1 = false;
            audioSource audiosource = this.f208732p1;
            if (audiosource != null) {
                audiosource.m222339b(this.f208657J1);
            }
            m222710j2();
            m222704g2();
            m222698d2();
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m222709j1(byte[] bArr, int i, long j) {
        synchronized (this.f208640E) {
            try {
                this.f208731p0 = true;
                audioSource audiosource = this.f208732p1;
                if (audiosource != null) {
                    audiosource.m222339b(this.f208657J1);
                }
                if (this.f208673P != null) {
                    n8c.m158485c("streamerCameraProducer", "mqbuffer;lens:" + i + ";timestamp:" + j);
                    m222701e2();
                    this.f208673P.clear();
                    if (this.f208657J1 != null) {
                        this.f208657J1.onPcmDateCallback(bArr, i, System.nanoTime() / 1000);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j2 */
    public void m222710j2() {
        this.f208741u = 0;
        this.f208743v = 0;
        MomoSurface momoSurface = this.f208692W0;
        if (momoSurface != null) {
            momoSurface.m222443E0();
            this.f208692W0.m222444G0();
        }
        n8c.m158485c("streamerCameraProducer", "stopRecording mMode:" + ((int) this.f208722l));
        if (this.f208708e1 != null) {
            try {
                this.f208665M0 = false;
                this.f208708e1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f208708e1 = null;
        }
        n8c.m158485c("streamerCameraProducer", "stopRecording mVideoRecordThread stoped mThread:");
        MediaCodecVideoMux mediaCodecVideoMux = this.f208694X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.stop();
            this.f208694X0 = null;
        }
        this.f208700a1 = -1L;
        this.f208728o = null;
        n8c.m158485c("streamerCameraProducer", "stopRecording videoMux stoped ");
    }

    /* JADX INFO: renamed from: k2 */
    public void m222711k2() {
        try {
            Context context = this.f208634B;
            if (context != null) {
                HeadsetPlugReceiver headsetPlugReceiver = this.f208716i1;
                if (headsetPlugReceiver != null) {
                    context.unregisterReceiver(headsetPlugReceiver);
                    this.f208716i1.m222749a();
                    this.f208716i1 = null;
                }
                BlueConnectStateBroadcastReceiver blueConnectStateBroadcastReceiver = this.f208718j1;
                if (blueConnectStateBroadcastReceiver != null) {
                    this.f208634B.unregisterReceiver(blueConnectStateBroadcastReceiver);
                    this.f208718j1.m222748a();
                    this.f208718j1 = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m222712l1(long j) {
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        if (!m222682W0()) {
            this.f208723l1 = j;
        } else {
            this.f208735r.seekTo(j);
            this.f208723l1 = 0L;
        }
    }

    /* JADX INFO: renamed from: l2 */
    public void m222713l2(SinkBase sinkBase) {
        this.f208738s1 = sinkBase;
        if (this.f208738s1 != null && this.f208654I1 == null) {
            this.f208654I1 = this.f208660K1;
            m222701e2();
            removePcmDataCallback(this.f208654I1);
            setPcmDataCallback(this.f208654I1);
            AudioProcess audioProcess = this.f208673P;
            if (audioProcess != null) {
                audioProcess.clear();
            }
            this.f208738s1.setPcmDataCallback(this.f208654I1);
        }
        if (this.f208738s1 == null) {
            if (this.f208654I1 != null) {
                removePcmDataCallback(this.f208654I1);
                m222681V1();
            }
            m222698d2();
            this.f208654I1 = null;
        }
        if (this.f208738s1 != null) {
            this.f208738s1.setHeadsetStatus(this.f208750y1);
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m222714m1(VideoQuality videoQuality) {
        n8c.m158485c("streamerCameraProducer", "setAttachedVideoQuality: width");
        if (videoQuality != null) {
            this.f208719k = videoQuality;
        }
        MomoSurface momoSurface = this.f208692W0;
        if (momoSurface != null) {
            momoSurface.m222461X(videoQuality);
        }
    }

    /* JADX INFO: renamed from: m2 */
    public void m222715m2(Bitmap bitmap, int i, int i2, int i3) {
        SourceBase sourceBase = this.f208727n1;
        if (sourceBase != null) {
            sourceBase.mo222319Q(bitmap, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m222716n0(Object obj) {
        MomoSurface momoSurface = this.f208692W0;
        if (momoSurface != null) {
            momoSurface.m222457U(obj);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m222717n1(int i) {
        this.f208713h.channelNum = i;
    }

    /* JADX INFO: renamed from: n2 */
    public void m222718n2(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f208692W0;
            if (momoSurface != null) {
                momoSurface.m222479i1(j, surfaceTexture, i, bitmap);
                return;
            }
            return;
        }
        Map map = this.f208744v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f208744v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m222213B2(j, surfaceTexture, i, bitmap);
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notify(int i, int i2, int i3, Object obj) {
        SinkBase sinkBase;
        if (i == 300 && (sinkBase = this.f208736r1) != null) {
            if (sinkBase.getErrorCode() == 300) {
                return;
            } else {
                this.f208736r1.setErrorCode(300);
            }
        }
        ijkMediaStreamer ijkmediastreamer = this.f208636C;
        if (ijkmediastreamer != null) {
            ijkMediaStreamer.postEventFromStreamPro(ijkmediastreamer, i, i2, i3, obj);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustAef(int i, boolean z) {
        this.f208682S = i;
        this.f208685T = z;
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.adjustAef(i, z);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustEQ(int i, boolean z) {
        this.f208676Q = i;
        this.f208679R = z;
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.adjustEQ(i, z);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustEf(int i, int i2) {
        this.f208687U = i;
        this.f208689V = i2;
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.adjustEf(i, i2);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustTune(int i, boolean z) {
        this.f208697Z = i;
        this.f208720k0 = z;
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.adjustTune(i, z);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEffectReset() {
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset();
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEffectSet(int i, int i2, float f) {
        this.f208691W = i;
        this.f208693X = i2;
        this.f208695Y = f;
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet(i, i2, f);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEnableExtralAudio(boolean z) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyExtralAudioLoss() {
        n8c.m158485c("streamerCameraProducer", "sabineAudioSource notifyExtralAudioLoss");
        if (this.f208732p1 == null || this.f208734q1 == 1) {
            return;
        }
        this.f208734q1 = 1;
        this.f208732p1.m222339b(this.f208657J1);
        if (this.f208740t1) {
            m222597Z1();
        }
        if (getExternAudioDevStatusCallback() != null) {
            getExternAudioDevStatusCallback().onAudioDevStatusNotify(0);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyExtralAudioReady() {
        n8c.m158485c("streamerCameraProducer", "sabineAudioSource notifyExtralAudioReady");
        if (this.f208732p1 == null || this.f208734q1 == 2) {
            return;
        }
        if (this.f208740t1) {
            this.f208684S1.post(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.11
                @Override // java.lang.Runnable
                public void run() {
                    StreamProducer.this.f208732p1.mo222341d();
                    StreamProducer.this.f208732p1.m222339b(StreamProducer.this.f208657J1);
                    StreamProducer.this.f208732p1.m222340c(StreamProducer.this.f208657J1);
                    StreamProducer.this.m222582M1();
                }
            });
        }
        if (getExternAudioDevStatusCallback() != null) {
            getExternAudioDevStatusCallback().onAudioDevStatusNotify(1);
        }
        this.f208734q1 = 2;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyRecording() {
        n8c.m158485c("streamerCameraProducer", "----notifyRecording: call startRecording()");
        m222692b2();
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyResumeRecording() {
        n8c.m158485c("streamerCameraProducer", "----notifyResumeRecording:recording=" + this.f208740t1 + ",old[" + this.f208741u + Constants.SEPARATOR_COMMA + this.f208743v + "], new[" + this.f208717j.resX + Constants.SEPARATOR_COMMA + this.f208717j.resY + Constants.AES_SUFFIX);
        if (this.f208740t1) {
            int i = this.f208741u;
            VideoQuality videoQuality = this.f208717j;
            if (i == videoQuality.resX && this.f208743v == videoQuality.resY) {
                return;
            }
            m222710j2();
            m222695c2();
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyUpdateResolution() {
        SourceBase sourceBase = this.f208727n1;
        if (sourceBase != null && sourceBase.mo222288n() != null) {
            this.f208717j.resY = this.f208727n1.mo222288n().resY;
            this.f208717j.resX = this.f208727n1.mo222288n().resX;
        }
        m222629s2();
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            sinkBase.notifyUpdateResolution();
        }
        if (this.f208738s1 != null) {
            this.f208736r1.notifyUpdateResolution();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m222719o0(MRtcAudioHandler mRtcAudioHandler) {
        audio_Indicator audio_indicator = this.f208648G1;
        if (audio_indicator != null) {
            audio_indicator.addMRtcAudioHandler(mRtcAudioHandler);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m222720o1(int i) {
        this.f208713h.bitRate = i;
    }

    /* JADX INFO: renamed from: o2 */
    public void m222721o2(int i) {
        if (i == 0) {
            m222681V1();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public void m222722p1(int i) {
        this.f208713h.samplingRate = i;
    }

    /* JADX INFO: renamed from: p2 */
    public void m222723p2(VideoQuality videoQuality) {
        this.f208717j = videoQuality;
        m222629s2();
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            sinkBase.notifyUpdateResolution();
        }
        if (this.f208738s1 != null) {
            this.f208736r1.notifyUpdateResolution();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public long m222724q0(long j) {
        AidSource aidSource;
        Map map = this.f208744v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f208744v1.get(Long.valueOf(j))) == null) {
            return 0L;
        }
        return aidSource.m222216p2();
    }

    /* JADX INFO: renamed from: q1 */
    public void m222725q1(int i) {
        this.f208751z = i;
    }

    /* JADX INFO: renamed from: q2 */
    public void m222726q2(SinkBase sinkBase) {
        this.f208736r1 = sinkBase;
        MediaCodecVideoMux mediaCodecVideoMux = this.f208694X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.m222149m(sinkBase);
        }
        MediaCodecAudioMux mediaCodecAudioMux = this.f208698Z0;
        if (mediaCodecAudioMux != null) {
            mediaCodecAudioMux.m222149m(this.f208736r1);
        }
        SinkBase sinkBase2 = this.f208736r1;
        if (sinkBase2 != null) {
            sinkBase2.setHeadsetStatus(this.f208750y1);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public long m222727r0(long j) {
        AidSource aidSource;
        Map map = this.f208744v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f208744v1.get(Long.valueOf(j))) == null) {
            return 0L;
        }
        return aidSource.getDuration();
    }

    /* JADX INFO: renamed from: r1 */
    public void m222728r1(int i) {
    }

    /* JADX INFO: renamed from: r2 */
    public void m222729r2(Activity activity, SourceBase sourceBase) {
        n8c.m158485c("streamerCameraProducer", "----updateVideoSource(S):" + this.f208727n1);
        this.f208632A = activity;
        SourceBase sourceBase2 = this.f208727n1;
        if (sourceBase2 != null) {
            sourceBase2.mo222291q();
        }
        this.f208727n1 = sourceBase;
        n8c.m158485c("streamerCameraProducer", "----updateVideoSource(E):" + this.f208727n1);
    }

    @Override // com.immomo.mediacore.strinf.confrenceHelp
    public void release() {
        n8c.m158485c("streamerCameraProducer", "mCamera.release begin");
        super.release();
        if (this.f208727n1 != null) {
            this.f208727n1 = null;
        }
        if (this.f208736r1 != null) {
            this.f208736r1 = null;
        }
        audio_Indicator audio_indicator = this.f208648G1;
        if (audio_indicator != null) {
            audio_indicator.release();
            this.f208648G1 = null;
        }
        m222631t0();
        HandlerThread handlerThread = this.f208645F1;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f208645F1 = null;
        this.f208642E1 = null;
        audioSource audiosource = this.f208732p1;
        if (audiosource != null) {
            audiosource.m222339b(this.f208657J1);
            this.f208732p1.m222338a();
            this.f208732p1 = null;
        }
        m222711k2();
        m222710j2();
        m222704g2();
        m222698d2();
        m222690b();
        this.f208716i1 = null;
        this.f208718j1 = null;
        this.f208638D = null;
        stopSurroundMusic();
        this.f208652I = null;
        n8c.m158485c("streamerCameraProducer", "mCamera.release end");
        this.f208632A = null;
        this.f208636C = null;
        try {
            Surface surface = this.f208677Q0;
            if (surface != null) {
                surface.release();
            }
        } catch (Exception unused) {
        }
        try {
            Surface surface2 = this.f208680R0;
            if (surface2 != null) {
                surface2.release();
            }
        } catch (Exception unused2) {
        }
        this.f208677Q0 = null;
        this.f208680R0 = null;
        Map map = this.f208744v1;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Long l2 = (Long) ((Map.Entry) it.next()).getKey();
                AidSource aidSource = (AidSource) this.f208744v1.get(l2);
                if (aidSource != null) {
                    aidSource.m222220u2(1);
                }
                this.f208744v1.remove(l2);
            }
            this.f208744v1.clear();
        }
        this.f208634B = null;
    }

    /* JADX INFO: renamed from: s0 */
    public void m222730s0(long j, long j2) {
        AidSource aidSource;
        Map map = this.f208744v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f208744v1.get(Long.valueOf(j))) == null) {
            return;
        }
        n8c.m158485c("streamerCameraProducer", "aidSeekTo: [" + j + "], " + j2);
        aidSource.m222221v2(j2);
    }

    /* JADX INFO: renamed from: s1 */
    public void m222731s1(boolean z) {
        this.f208653I0 = z;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void setSourceSucess() {
        ijkMediaStreamer ijkmediastreamer = this.f208636C;
        if (ijkmediastreamer != null) {
            ijkmediastreamer.setCameraSuccess();
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void startSurroundMusic(String str, int i, long j) {
        n8c.m158485c("streamerCameraProducer", "Mediaplayer startSurroundMusic: " + str);
        this.f208742u1 = false;
        this.f208714h1 = str;
        this.f208721k1 = 0;
        IjkMediaPlayer ijkMediaPlayer = this.f208735r;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
            this.f208735r.release();
            this.f208735r = null;
        }
        if (this.f208634B == null || this.f208714h1 == null) {
            return;
        }
        this.f208723l1 = j;
        try {
            IjkMediaPlayer ijkMediaPlayer2 = new IjkMediaPlayer(this.f208634B);
            this.f208735r = ijkMediaPlayer2;
            ijkMediaPlayer2.setOnPreparedListener(this.f208663L1);
            this.f208735r.setOnCompletionListener(this.f208666M1);
            this.f208735r.setOnErrorListener(this.f208669N1);
            this.f208735r.setOnBufferingUpdateListener(this.f208672O1);
            this.f208735r.setOnInfoListener(this.f208675P1);
            this.f208735r.setOnSeekCompleteListener(this.f208678Q1);
            if (this.f208750y1 || this.f208636C.getStreamerType() == 2) {
                this.f208735r.setMediaDataCallback(this.f208681R1);
            }
            this.f208735r.setDataSource(this.f208714h1.toString());
            this.f208735r.setMediaDateCallbackFlags(1);
            int streamerType = this.f208636C.getStreamerType();
            IjkMediaPlayer ijkMediaPlayer3 = this.f208735r;
            if (streamerType != 0) {
                ijkMediaPlayer3.setPropertyLong(20024, 44100L);
            } else {
                ijkMediaPlayer3.setPropertyLong(20024, 44100L);
            }
            this.f208735r.setPropertyLong(20022, 2L);
            this.f208735r.setPropertyLong(20023, 3L);
            this.f208735r.prepareAsync();
            this.f208721k1 = 1;
        } catch (IOException e) {
            n8c.m158486d("streamerCameraProducer", "Mediaplayer Unable to open content: " + this.f208714h1, e);
            this.f208721k1 = -1;
        } catch (IllegalArgumentException e2) {
            n8c.m158486d("streamerCameraProducer", "Mediaplayer Unable to open content: " + this.f208714h1, e2);
            this.f208721k1 = -1;
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void stopSurroundMusic() {
        IjkMediaPlayer ijkMediaPlayer = this.f208735r;
        if (ijkMediaPlayer != null) {
            this.f208742u1 = false;
            ijkMediaPlayer.setMediaDataCallback(null);
            this.f208735r.setOnPreparedListener(null);
            this.f208735r.setOnCompletionListener(null);
            this.f208735r.setOnErrorListener(null);
            this.f208735r.setOnBufferingUpdateListener(null);
            this.f208735r.setOnInfoListener(null);
            this.f208735r.setOnSeekCompleteListener(null);
            this.f208735r.stop();
            this.f208735r.release();
            this.f208721k1 = 0;
            this.f208735r = null;
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m222732t1(int i, int i2) {
        this.f208724m = i;
        this.f208726n = i2;
        if (i2 < 0 || i2 > 3) {
            this.f208726n = 0;
        }
        if (i < 0 || i > 3) {
            this.f208724m = 0;
        }
        n8c.m158485c("streamerCameraProducer", "after setCameraRotation mFrontCameraRotation:" + this.f208724m + ";mBackCameraRotation:" + this.f208726n);
    }

    /* JADX INFO: renamed from: t2 */
    public void m222733t2(byte[] bArr, int i) {
        if (this.f208750y1 && this.f208639D1 && !this.f208704c1) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            synchronized (this.f208651H1) {
                try {
                    NonBlockingAudioTrack nonBlockingAudioTrack = this.f208637C1;
                    if (nonBlockingAudioTrack != null) {
                        nonBlockingAudioTrack.write(bArr2, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m222734u0(int i, int i2) {
        audio_Indicator audio_indicator = this.f208648G1;
        if (audio_indicator != null) {
            audio_indicator.enableAudioVolumeIndication(i, i2);
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m222735u1(boolean z) {
    }

    /* JADX INFO: renamed from: v1 */
    public void m222736v1(float f) {
        this.f208644F0 = f;
        AudioProcess audioProcess = this.f208673P;
        if (audioProcess != null) {
            audioProcess.setMasterAudioLevel(f);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m222737w1(long j) {
        this.f208656J0 = j;
        if (j <= 0) {
            this.f208656J0 = 6000L;
        }
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    /* JADX INFO: renamed from: x0 */
    public void m222738x0() throws IOException, RuntimeException {
        n8c.m158485c("streamerCameraProducer", "Video encoded using the MediaCodec API with a surface mVideoQuality.framerate" + this.f208752z1);
        if (this.f208728o != null) {
            return;
        }
        this.f208728o = MediaCodec.createByCodecName(uze.m196412b(YtVideoEncoder.MIME_TYPE).getName());
        m222629s2();
        VideoQuality videoQuality = this.f208717j;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, videoQuality.resX, videoQuality.resY);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.f208717j.bitrate);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f208752z1);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec mediaCodec = this.f208728o;
        if (mediaCodec == null) {
            notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 2, null);
            return;
        }
        mediaCodec.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f208677Q0 = this.f208728o.createInputSurface();
        this.f208728o.start();
        VideoQuality videoQuality2 = this.f208717j;
        this.f208741u = videoQuality2.resX;
        this.f208743v = videoQuality2.resY;
        this.f208745w = videoQuality2.bitrate;
        this.f208747x = this.f208752z1;
        n8c.m158485c("streamerCameraProducer", "-------recording:resolution(" + this.f208717j.resX + Constants.SEPARATOR_COMMA + this.f208717j.resY + "),bitrate=" + this.f208717j.bitrate + ", framerate=" + this.f208752z1);
        AudioRecordRunnable audioRecordRunnable = this.f208702b1;
        if (audioRecordRunnable != null) {
            audioRecordRunnable.m222746b(this.f208677Q0);
            this.f208702b1.m222745a(this.f208673P);
        } else {
            MomoSurface momoSurface = this.f208692W0;
            if (momoSurface != null) {
                momoSurface.m222465Z(this.f208677Q0);
            }
        }
        SinkBase sinkBase = this.f208736r1;
        if (sinkBase != null) {
            sinkBase.setErrorCode(0);
        }
        MediaCodecVideoMux mediaCodecVideoMux = new MediaCodecVideoMux(this.f208728o, this.f208736r1);
        this.f208694X0 = mediaCodecVideoMux;
        mediaCodecVideoMux.m222148l();
        this.f208694X0.m222140d(this.f208717j.bitrate);
        this.f208694X0.m222141e(this.f208653I0);
        this.f208694X0.m222147k(this.f208707e);
        long j = this.f208700a1;
        if (j != -1) {
            this.f208694X0.m222143g(j);
        }
        this.f208694X0.m222142f(new MuxBase.EncoderFrameRateUpdataListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.12
        });
        this.f208694X0.m222144h(new PacketBufferlingStatusListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.13
            @Override // tv.danmaku.ijk.media.streamer.StreamProducer.PacketBufferlingStatusListener
            /* JADX INFO: renamed from: a */
            public void mo222744a(int i, long j2) {
                n8c.m158485c("streamerCameraProducer", "videoMux PacketBufferlingStatusUpdata: " + i + ";duration:" + j2);
                StreamProducer streamProducer = StreamProducer.this;
                if (streamProducer.f208636C == null || i != 104) {
                    return;
                }
                long j3 = streamProducer.f208662L0;
                StreamProducer streamProducer2 = StreamProducer.this;
                if (j2 < j3) {
                    if (streamProducer2.f208705d || !StreamProducer.this.f208703c) {
                        return;
                    }
                    StreamProducer.this.notify(105, (int) j2, 0, null);
                    StreamProducer.this.f208705d = true;
                    StreamProducer.this.f208703c = false;
                    return;
                }
                if (streamProducer2.f208703c || !StreamProducer.this.f208705d) {
                    return;
                }
                StreamProducer.this.notify(103, (int) j2, 0, null);
                StreamProducer.this.f208703c = true;
                StreamProducer.this.f208705d = false;
                StreamProducer.m222571C(StreamProducer.this);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public int m222739x1(int i) {
        this.f208746w1 = i;
        return i;
    }

    /* JADX INFO: renamed from: y0 */
    public VideoQuality m222740y0() {
        n8c.m158485c("streamerCameraProducer", "getVideoQuality: width" + this.f208719k.resX + ";heigh:" + this.f208719k.resY);
        return this.f208719k;
    }

    /* JADX INFO: renamed from: y1 */
    public void m222741y1(boolean z) {
        byte b = f208631T1;
        if (b == 1 || !z) {
            this.f208722l = (byte) 1;
        } else {
            this.f208722l = b;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public int m222742z0() {
        return this.f208719k.bitrate;
    }

    /* JADX INFO: renamed from: z1 */
    public void m222743z1(long j) {
        this.f208659K0 = j;
        if (j <= 0) {
            this.f208659K0 = 1000L;
        }
    }
}
