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
import com.immomo.mediacore.audio.AudioProcess;
import com.immomo.mediacore.audio.AudioQuality;
import com.immomo.mediacore.audio.NonBlockingAudioTrack;
import com.immomo.mediacore.audio.audio_Indicator;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.sink.SinkBase;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import com.immomo.mediacore.strinf.confrenceHelp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l.ii5;
import l.mpd0;
import l.n8c;
import l.uze;
import l.z1l0;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.processing.encodec.MediaCodecAudioMux;
import tv.danmaku.ijk.media.processing.encodec.MediaCodecVideoMux;
import tv.danmaku.ijk.media.processing.encodec.MuxBase;
import tv.danmaku.ijk.media.source.AidSource;
import tv.danmaku.ijk.media.source.SourceBase;
import tv.danmaku.ijk.media.source.audio.audioSource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StreamProducer extends confrenceHelp implements NotifyCenter, MomoSurface.PostDrawImageCallback {

    /* JADX INFO: renamed from: T1 */
    private static byte f12256T1;

    /* JADX INFO: renamed from: A */
    Activity f12257A;

    /* JADX INFO: renamed from: A1 */
    private boolean f12258A1;

    /* JADX INFO: renamed from: B */
    Context f12259B;

    /* JADX INFO: renamed from: B1 */
    private int f12260B1;

    /* JADX INFO: renamed from: C */
    public ijkMediaStreamer f12261C;

    /* JADX INFO: renamed from: C1 */
    private NonBlockingAudioTrack f12262C1;

    /* JADX INFO: renamed from: D */
    IntentFilter f12263D;

    /* JADX INFO: renamed from: D1 */
    private boolean f12264D1;

    /* JADX INFO: renamed from: E */
    private Object f12265E;

    /* JADX INFO: renamed from: E0 */
    private long f12266E0;

    /* JADX INFO: renamed from: E1 */
    private Handler f12267E1;

    /* JADX INFO: renamed from: F */
    private Object f12268F;

    /* JADX INFO: renamed from: F0 */
    private float f12269F0;

    /* JADX INFO: renamed from: F1 */
    private HandlerThread f12270F1;

    /* JADX INFO: renamed from: G */
    int f12271G;

    /* JADX INFO: renamed from: G0 */
    private float f12272G0;

    /* JADX INFO: renamed from: G1 */
    private audio_Indicator f12273G1;

    /* JADX INFO: renamed from: H */
    private int f12274H;

    /* JADX INFO: renamed from: H0 */
    private boolean f12275H0;

    /* JADX INFO: renamed from: H1 */
    private Object f12276H1;

    /* JADX INFO: renamed from: I */
    private ByteBuffer f12277I;

    /* JADX INFO: renamed from: I0 */
    private boolean f12278I0;

    /* JADX INFO: renamed from: I1 */
    private volatile SinkBase.PcmDateCallback f12279I1;

    /* JADX INFO: renamed from: J */
    private ByteBuffer f12280J;

    /* JADX INFO: renamed from: J0 */
    private long f12281J0;

    /* JADX INFO: renamed from: J1 */
    private volatile SinkBase.ExtPcmDateCallback f12282J1;

    /* JADX INFO: renamed from: K */
    private ByteBuffer f12283K;

    /* JADX INFO: renamed from: K0 */
    private long f12284K0;

    /* JADX INFO: renamed from: K1 */
    private volatile SinkBase.PcmDateCallback f12285K1;

    /* JADX INFO: renamed from: L */
    private int f12286L;

    /* JADX INFO: renamed from: L0 */
    private long f12287L0;

    /* JADX INFO: renamed from: L1 */
    IMediaPlayer.OnPreparedListener f12288L1;

    /* JADX INFO: renamed from: M */
    private int f12289M;

    /* JADX INFO: renamed from: M0 */
    private volatile boolean f12290M0;

    /* JADX INFO: renamed from: M1 */
    private IMediaPlayer.OnCompletionListener f12291M1;

    /* JADX INFO: renamed from: N */
    private int f12292N;

    /* JADX INFO: renamed from: N0 */
    private volatile boolean f12293N0;

    /* JADX INFO: renamed from: N1 */
    private IMediaPlayer.OnErrorListener f12294N1;

    /* JADX INFO: renamed from: O */
    private ByteBuffer[] f12295O;

    /* JADX INFO: renamed from: O0 */
    private volatile boolean f12296O0;

    /* JADX INFO: renamed from: O1 */
    private IMediaPlayer.OnBufferingUpdateListener f12297O1;

    /* JADX INFO: renamed from: P */
    private AudioProcess f12298P;

    /* JADX INFO: renamed from: P0 */
    private AudioRecord f12299P0;

    /* JADX INFO: renamed from: P1 */
    private IMediaPlayer.OnInfoListener f12300P1;

    /* JADX INFO: renamed from: Q */
    private int f12301Q;

    /* JADX INFO: renamed from: Q0 */
    private Surface f12302Q0;

    /* JADX INFO: renamed from: Q1 */
    private IMediaPlayer.OnSeekCompleteListener f12303Q1;

    /* JADX INFO: renamed from: R */
    private boolean f12304R;

    /* JADX INFO: renamed from: R0 */
    private Surface f12305R0;

    /* JADX INFO: renamed from: R1 */
    private IjkMediaPlayer.MediaDateCallback f12306R1;

    /* JADX INFO: renamed from: S */
    private int f12307S;

    /* JADX INFO: renamed from: S0 */
    private volatile long f12308S0;

    /* JADX INFO: renamed from: S1 */
    private Handler f12309S1;

    /* JADX INFO: renamed from: T */
    private boolean f12310T;

    /* JADX INFO: renamed from: T0 */
    private volatile long f12311T0;

    /* JADX INFO: renamed from: U */
    private int f12312U;

    /* JADX INFO: renamed from: U0 */
    private byte[] f12313U0;

    /* JADX INFO: renamed from: V */
    private int f12314V;

    /* JADX INFO: renamed from: V0 */
    private byte[] f12315V0;

    /* JADX INFO: renamed from: W */
    private int f12316W;

    /* JADX INFO: renamed from: W0 */
    private MomoSurface f12317W0;

    /* JADX INFO: renamed from: X */
    private int f12318X;

    /* JADX INFO: renamed from: X0 */
    private MediaCodecVideoMux f12319X0;

    /* JADX INFO: renamed from: Y */
    private float f12320Y;

    /* JADX INFO: renamed from: Y0 */
    private MediaCodecVideoMux f12321Y0;

    /* JADX INFO: renamed from: Z */
    private int f12322Z;

    /* JADX INFO: renamed from: Z0 */
    private MediaCodecAudioMux f12323Z0;

    /* JADX INFO: renamed from: a1 */
    private long f12325a1;

    /* JADX INFO: renamed from: b1 */
    protected AudioRecordRunnable f12327b1;

    /* JADX INFO: renamed from: c1 */
    private boolean f12329c1;

    /* JADX INFO: renamed from: d1 */
    private VideoRecordRunnable f12331d1;

    /* JADX INFO: renamed from: e1 */
    private Thread f12333e1;

    /* JADX INFO: renamed from: f1 */
    private Thread f12335f1;

    /* JADX INFO: renamed from: g */
    protected AudioQuality f12336g;

    /* JADX INFO: renamed from: g1 */
    private Thread f12337g1;

    /* JADX INFO: renamed from: h */
    protected AudioQuality f12338h;

    /* JADX INFO: renamed from: h1 */
    private String f12339h1;

    /* JADX INFO: renamed from: i */
    protected VideoQuality f12340i;

    /* JADX INFO: renamed from: i1 */
    private HeadsetPlugReceiver f12341i1;

    /* JADX INFO: renamed from: j */
    protected VideoQuality f12342j;

    /* JADX INFO: renamed from: j1 */
    private BlueConnectStateBroadcastReceiver f12343j1;

    /* JADX INFO: renamed from: k */
    protected VideoQuality f12344k;

    /* JADX INFO: renamed from: k0 */
    private boolean f12345k0;

    /* JADX INFO: renamed from: k1 */
    private int f12346k1;

    /* JADX INFO: renamed from: l */
    protected byte f12347l;

    /* JADX INFO: renamed from: l1 */
    private long f12348l1;

    /* JADX INFO: renamed from: m */
    protected int f12349m;

    /* JADX INFO: renamed from: m1 */
    protected ijkMediaStreamer.OnSurroundMusicStatusListener f12350m1;

    /* JADX INFO: renamed from: n */
    protected int f12351n;

    /* JADX INFO: renamed from: n1 */
    private SourceBase f12352n1;

    /* JADX INFO: renamed from: o */
    protected MediaCodec f12353o;

    /* JADX INFO: renamed from: o1 */
    private audioSource f12354o1;

    /* JADX INFO: renamed from: p */
    protected MediaCodec f12355p;

    /* JADX INFO: renamed from: p0 */
    private boolean f12356p0;

    /* JADX INFO: renamed from: p1 */
    private audioSource f12357p1;

    /* JADX INFO: renamed from: q */
    protected MediaCodec f12358q;

    /* JADX INFO: renamed from: q1 */
    private volatile int f12359q1;

    /* JADX INFO: renamed from: r */
    IjkMediaPlayer f12360r;

    /* JADX INFO: renamed from: r1 */
    private SinkBase f12361r1;

    /* JADX INFO: renamed from: s */
    ByteBuffer f12362s;

    /* JADX INFO: renamed from: s1 */
    private volatile SinkBase f12363s1;

    /* JADX INFO: renamed from: t */
    ByteBuffer[] f12364t;

    /* JADX INFO: renamed from: t1 */
    private boolean f12365t1;

    /* JADX INFO: renamed from: u */
    private int f12366u;

    /* JADX INFO: renamed from: u1 */
    private boolean f12367u1;

    /* JADX INFO: renamed from: v */
    private int f12368v;

    /* JADX INFO: renamed from: v1 */
    private Map f12369v1;

    /* JADX INFO: renamed from: w */
    private int f12370w;

    /* JADX INFO: renamed from: w1 */
    private int f12371w1;

    /* JADX INFO: renamed from: x */
    private int f12372x;

    /* JADX INFO: renamed from: x1 */
    private ijkMediaStreamer.OnWiredHeadsetStatusListener f12373x1;

    /* JADX INFO: renamed from: y */
    private int f12374y;

    /* JADX INFO: renamed from: y1 */
    private boolean f12375y1;

    /* JADX INFO: renamed from: z */
    private int f12376z;

    /* JADX INFO: renamed from: z1 */
    private int f12377z1;

    /* JADX INFO: renamed from: a */
    private PointF f12324a = new PointF(16.0f, 9.0f);

    /* JADX INFO: renamed from: b */
    private float f12326b = 1.0f;

    /* JADX INFO: renamed from: c */
    private boolean f12328c = false;

    /* JADX INFO: renamed from: d */
    private boolean f12330d = true;

    /* JADX INFO: renamed from: e */
    private String f12332e = "{}";

    /* JADX INFO: renamed from: f */
    private final int f12334f = -12345;

    public class AudioEncoderRunnable implements Runnable {
        private AudioEncoderRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mpd0 mpd0VarTake;
            if (StreamProducer.this.f12298P != null) {
                StreamProducer.this.f12298P.clear();
            }
            StreamProducer.this.f12296O0 = true;
            long j = 0;
            loop0: while (true) {
                mpd0VarTake = null;
                while (true) {
                    if (Thread.interrupted() || !StreamProducer.this.f12296O0 || StreamProducer.this.f12298P == null) {
                        break loop0;
                    }
                    n8c.c("streamerCameraProducer", "mAudioProcess.take over" + ((int) StreamProducer.this.f12347l));
                    try {
                        StreamProducer streamProducer = StreamProducer.this;
                        if (streamProducer.f12347l != 1) {
                            mpd0VarTake = streamProducer.f12298P.take();
                            if (mpd0VarTake != null) {
                                break;
                            }
                        } else {
                            ByteBuffer byteBuffer = streamProducer.f12362s;
                            int i = PKIFailureInfo.wrongIntegrity;
                            if (byteBuffer == null) {
                                streamProducer.f12362s = ByteBuffer.allocateDirect(PKIFailureInfo.wrongIntegrity);
                            }
                            StreamProducer.this.f12362s.position(0);
                            while (i >= StreamProducer.this.f12274H) {
                                n8c.c("streamerCameraProducer", "soft loop pos" + i);
                                mpd0VarTake = StreamProducer.this.f12298P.take();
                                if (mpd0VarTake != null) {
                                    StreamProducer.this.f12362s.put(mpd0VarTake.b());
                                }
                                i -= StreamProducer.this.f12274H;
                            }
                            j += IjkMediaMeta.AV_CH_TOP_CENTER;
                            long jM11268b = Util.m11268b(j);
                            if (StreamProducer.this.f12361r1 != null) {
                                ByteBuffer byteBuffer2 = StreamProducer.this.f12362s;
                                StreamProducer.this.f12361r1.writeAudio(jM11268b / 1000, byteBuffer2, byteBuffer2.limit());
                            }
                        }
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }
                }
                int iDequeueInputBuffer = StreamProducer.this.f12358q.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    if (StreamProducer.this.f12279I1 == null || !StreamProducer.this.f12356p0) {
                        StreamProducer.this.postPcmData(0L, mpd0VarTake.b.array(), 44100, false);
                        StreamProducer.this.postRecordFrame(mpd0VarTake.b.array(), 44100, false);
                    }
                    if (mpd0VarTake.b != null) {
                        StreamProducer.this.f12295O[iDequeueInputBuffer].put(mpd0VarTake.b);
                        StreamProducer.this.f12295O[iDequeueInputBuffer].flip();
                    }
                    if (StreamProducer.this.f12308S0 == 0) {
                        StreamProducer.this.f12308S0 = System.nanoTime() / 1000;
                    } else {
                        System.nanoTime();
                        long unused = StreamProducer.this.f12308S0;
                    }
                    n8c.c("streamerCameraProducer", "mAudioCodec.queueInputBuffer bufferIndex" + iDequeueInputBuffer + "mMediaCodecInputBuffers:" + StreamProducer.this.f12295O[iDequeueInputBuffer]);
                    int iLimit = mpd0VarTake.b.limit();
                    StreamProducer.this.f12358q.queueInputBuffer(iDequeueInputBuffer, 0, iLimit, mpd0VarTake.d(), 0);
                    j += (long) iLimit;
                } else {
                    n8c.c("streamerCameraProducer", "zjl found mAudioCodec no input buffer");
                }
                mpd0VarTake.f();
            }
            if (mpd0VarTake != null) {
                mpd0VarTake.f();
            }
            if (StreamProducer.this.f12298P != null) {
                StreamProducer.this.f12298P.clear();
            }
            StreamProducer.this.f12362s = null;
            n8c.c("streamerCameraProducer", "zjl found Thread 1 over");
        }
    }

    public class AudioRecordRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        int f12393a;

        /* JADX INFO: renamed from: b */
        int f12394b;

        /* JADX INFO: renamed from: c */
        AudioProcess f12395c;

        /* JADX INFO: renamed from: d */
        Surface f12396d;

        /* JADX INFO: renamed from: e */
        private Object f12397e;

        /* JADX INFO: renamed from: f */
        public boolean f12398f;

        private AudioRecordRunnable() {
            this.f12394b = 0;
            this.f12395c = null;
            this.f12396d = null;
            this.f12397e = new Object();
            this.f12398f = false;
            n8c.c("streamerCameraProducer", "new AudioRecordRunnable");
            AudioQuality audioQuality = StreamProducer.this.f12338h;
            int i = audioQuality.samplingRate;
            int i2 = (((i * EACTags.COMPATIBLE_TAG_ALLOCATION_AUTHORITY) / 1000) * 32) >> 3;
            int i3 = audioQuality.channelNum == 2 ? 12 : 16;
            int minBufferSize = AudioRecord.getMinBufferSize(i, i3, 2) * 16;
            try {
                StreamProducer.this.f12299P0 = new AudioRecord(1, StreamProducer.this.f12338h.samplingRate, i3, 2, i2 < minBufferSize ? minBufferSize : i2);
            } catch (Exception unused) {
                StreamProducer.this.notify(HttpStatus.MULTIPLE_CHOICES_300, -302, 3, null);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m11216a(AudioProcess audioProcess) {
            synchronized (this.f12397e) {
                try {
                    this.f12395c = audioProcess;
                    if (audioProcess != null) {
                        audioProcess.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            n8c.c("streamerCameraProducer", "AudioRecordRunnable addAudioProcess");
        }

        /* JADX INFO: renamed from: b */
        public void m11217b(Surface surface) {
            synchronized (this.f12397e) {
                this.f12396d = surface;
            }
            n8c.c("streamerCameraProducer", "AudioRecordRunnable addCodecSurface");
        }

        /* JADX INFO: renamed from: c */
        public void m11218c(boolean z) {
            this.f12398f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (StreamProducer.this.f12299P0 != null) {
                while (StreamProducer.this.f12299P0.getState() == 0 && this.f12394b < 5) {
                    try {
                        Thread.sleep(100L);
                        this.f12394b++;
                        n8c.c("streamerCameraProducer", "mAudioRecord.getState " + StreamProducer.this.f12299P0.getState());
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    StreamProducer.this.f12299P0.startRecording();
                } catch (Exception unused2) {
                }
                n8c.c("streamerCameraProducer", "AudioRecordRunnable mAudioCapturing:" + StreamProducer.this.f12293N0);
                while (!Thread.interrupted() && StreamProducer.this.f12293N0) {
                    synchronized (this.f12397e) {
                        try {
                            if (this.f12396d != null && StreamProducer.this.f12317W0 != null) {
                                StreamProducer.this.f12317W0.m10936Z(this.f12396d);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    StreamProducer streamProducer = StreamProducer.this;
                    streamProducer.f12313U0 = new byte[streamProducer.f12274H];
                    n8c.c("streamerCameraProducer", "allocatebuff mAudioFrame" + StreamProducer.this.f12274H);
                    try {
                        try {
                            this.f12393a = StreamProducer.this.f12299P0.read(StreamProducer.this.f12313U0, 0, StreamProducer.this.f12274H);
                            n8c.c("streamerCameraProducer", "this.audioRecord.read size" + this.f12393a);
                            if (this.f12393a > 0) {
                                synchronized (this.f12397e) {
                                    try {
                                        AudioProcess audioProcess = this.f12395c;
                                        if (audioProcess != null) {
                                            StreamProducer.this.f12313U0 = audioProcess.processStereoAudioData(StreamProducer.this.f12313U0, this.f12393a);
                                        }
                                        StreamProducer.this.m11150U0();
                                        StreamProducer streamProducer2 = StreamProducer.this;
                                        streamProducer2.m11204t2(streamProducer2.f12313U0, StreamProducer.this.f12313U0.length);
                                        if (this.f12395c != null && StreamProducer.this.f12363s1 == null) {
                                            boolean z = this.f12398f;
                                            StreamProducer streamProducer3 = StreamProducer.this;
                                            if (!z) {
                                                if (streamProducer3.f12273G1 != null) {
                                                    StreamProducer.this.f12273G1.putAudioData(StreamProducer.this.f12313U0);
                                                }
                                                if (StreamProducer.this.f12296O0) {
                                                    this.f12395c.putAudioData(new mpd0(StreamProducer.this.f12313U0, System.nanoTime() / 1000, StreamProducer.this.f12338h.channelNum));
                                                }
                                            } else if (streamProducer3.f12296O0) {
                                                StreamProducer.this.f12315V0 = new byte[this.f12393a];
                                                this.f12395c.putAudioData(new mpd0(StreamProducer.this.f12315V0, System.nanoTime() / 1000, StreamProducer.this.f12338h.channelNum));
                                            }
                                            StreamProducer.m11071b0(StreamProducer.this);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } else {
                                if (!StreamProducer.this.f12293N0) {
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
                n8c.c("streamerCameraProducer", " AudioRecordRunnable mAudioRecord.stop() and release");
                if (StreamProducer.this.f12317W0 != null) {
                    StreamProducer.this.f12317W0.m10936Z(this.f12396d);
                }
                if (StreamProducer.this.f12299P0 != null) {
                    try {
                        StreamProducer.this.f12299P0.release();
                        StreamProducer.this.f12299P0 = null;
                    } catch (Exception unused4) {
                    }
                }
            }
            StreamProducer.this.f12327b1 = null;
        }
    }

    public class BlueConnectStateBroadcastReceiver extends BroadcastReceiver {
        public BlueConnectStateBroadcastReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m11219a() {
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
                ijkMediaStreamer ijkmediastreamer = StreamProducer.this.f12261C;
                if (ijkmediastreamer != null && ijkmediastreamer.getStreamerType() == 2 && (context2 = StreamProducer.this.f12259B) != null) {
                    ((AudioManager) context2.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(true);
                }
                n8c.c("BlueConnectStateBroadcastReceiver", "STATE_DISCONNECTED");
                if (StreamProducer.this.f12361r1 != null) {
                    StreamProducer.this.f12361r1.setHeadsetStatus(false);
                }
                if (StreamProducer.this.f12363s1 != null) {
                    StreamProducer.this.f12363s1.setHeadsetStatus(false);
                    return;
                }
                return;
            }
            if (intExtra != 2) {
                return;
            }
            ijkMediaStreamer ijkmediastreamer2 = StreamProducer.this.f12261C;
            if (ijkmediastreamer2 != null && ijkmediastreamer2.getStreamerType() == 2 && (context3 = StreamProducer.this.f12259B) != null) {
                ((AudioManager) context3.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(false);
            }
            n8c.c("BlueConnectStateBroadcastReceiver", "STATE_CONNECTED");
            if (StreamProducer.this.f12361r1 != null) {
                StreamProducer.this.f12361r1.setHeadsetStatus(true);
            }
            if (StreamProducer.this.f12363s1 != null) {
                StreamProducer.this.f12363s1.setHeadsetStatus(true);
            }
        }
    }

    public class HeadsetPlugReceiver extends BroadcastReceiver {
        private HeadsetPlugReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m11220a() {
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
                    if (streamProducer.f12360r != null && !streamProducer.f12329c1) {
                        StreamProducer.this.f12360r.setMediaDataCallback(null);
                    }
                    StreamProducer.this.f12375y1 = false;
                    if (StreamProducer.this.f12373x1 != null) {
                        StreamProducer.this.f12373x1.m11307a(StreamProducer.this.f12261C, 1, 0);
                    }
                    StreamProducer.this.m11161b();
                    n8c.c("streamerCameraProducer", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + StreamProducer.this.f12375y1);
                    ijkMediaStreamer ijkmediastreamer = StreamProducer.this.f12261C;
                    if (ijkmediastreamer != null && ijkmediastreamer.getStreamerType() == 2 && (context2 = StreamProducer.this.f12259B) != null) {
                        ((AudioManager) context2.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(true);
                    }
                    if (StreamProducer.this.f12361r1 != null) {
                        StreamProducer.this.f12361r1.setHeadsetStatus(false);
                    }
                    if (StreamProducer.this.f12363s1 != null) {
                        StreamProducer.this.f12363s1.setHeadsetStatus(false);
                    }
                    StreamProducer.this.m11096p0();
                    return;
                }
                if (intent.getIntExtra("state", 0) == 1) {
                    StreamProducer streamProducer2 = StreamProducer.this;
                    IjkMediaPlayer ijkMediaPlayer = streamProducer2.f12360r;
                    if (ijkMediaPlayer != null) {
                        ijkMediaPlayer.setMediaDataCallback(streamProducer2.f12306R1);
                    }
                    StreamProducer.this.f12375y1 = true;
                    if (StreamProducer.this.f12373x1 != null) {
                        StreamProducer.this.f12373x1.m11307a(StreamProducer.this.f12261C, 1, 1);
                    }
                    StreamProducer streamProducer3 = StreamProducer.this;
                    ijkMediaStreamer ijkmediastreamer2 = streamProducer3.f12261C;
                    if (ijkmediastreamer2 != null && streamProducer3.f12259B != null && ijkmediastreamer2.getStreamerType() == 2) {
                        ((AudioManager) StreamProducer.this.f12259B.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(false);
                    }
                    if (StreamProducer.this.f12361r1 != null) {
                        StreamProducer.this.f12361r1.setHeadsetStatus(true);
                    }
                    if (StreamProducer.this.f12363s1 != null) {
                        StreamProducer.this.f12363s1.setHeadsetStatus(true);
                    }
                    StreamProducer.this.m11096p0();
                    n8c.c("streamerCameraProducer", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + StreamProducer.this.f12375y1);
                }
            }
        }
    }

    public interface PacketBufferlingStatusListener {
        /* JADX INFO: renamed from: a */
        void mo11215a(int i, long j);
    }

    public class VideoRecordRunnable implements Runnable {
        private VideoRecordRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (StreamProducer.this.f12290M0) {
                mpd0 mpd0VarM10943d1 = StreamProducer.this.f12317W0.m10943d1();
                if (mpd0VarM10943d1 != null) {
                    ByteBuffer byteBufferB = mpd0VarM10943d1.b();
                    long jD = mpd0VarM10943d1.d();
                    if (jD == -12345) {
                        return;
                    }
                    StreamProducer streamProducer = StreamProducer.this;
                    MediaCodec mediaCodec = streamProducer.f12353o;
                    long j = 0;
                    if (mediaCodec != null) {
                        try {
                            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                            if (iDequeueInputBuffer >= 0) {
                                int iCapacity = StreamProducer.this.f12364t[iDequeueInputBuffer].capacity() < byteBufferB.limit() ? StreamProducer.this.f12364t[iDequeueInputBuffer].capacity() : byteBufferB.limit();
                                StreamProducer.this.f12364t[iDequeueInputBuffer].clear();
                                byteBufferB.rewind();
                                StreamProducer.this.f12364t[iDequeueInputBuffer].put(byteBufferB);
                                StreamProducer.this.f12353o.queueInputBuffer(iDequeueInputBuffer, 0, iCapacity, jD, 0);
                            } else {
                                n8c.c("streamerCameraProducer", "No buffer available !");
                            }
                        } catch (IllegalStateException unused) {
                        }
                    } else {
                        long j2 = streamProducer.f12311T0;
                        StreamProducer streamProducer2 = StreamProducer.this;
                        if (j2 == 0) {
                            streamProducer2.f12311T0 = jD;
                        } else {
                            j = (jD / 1000) - (streamProducer2.f12311T0 / 1000);
                        }
                        if (StreamProducer.this.f12361r1 != null) {
                            StreamProducer.this.f12361r1.writeVideo(j, byteBufferB, byteBufferB.limit());
                        }
                    }
                }
            }
        }
    }

    static {
        try {
            Class.forName("android.media.MediaCodec");
            n8c.c("streamerCameraProducer", "Phone supports the MediaCoded API");
            f12256T1 = (byte) 5;
            n8c.c("streamerCameraProducer", "Phone supports the MediaCoded v2 API");
        } catch (ClassNotFoundException unused) {
            f12256T1 = (byte) 1;
            n8c.c("streamerCameraProducer", "Phone does not support the MediaCodec API");
        }
    }

    public StreamProducer(Context context, ijkMediaStreamer ijkmediastreamer, MomoSurface momoSurface) {
        AudioQuality audioQualityClone = AudioQuality.DEFAULT_AUDIO_QUALITY.clone();
        this.f12336g = audioQualityClone;
        this.f12338h = audioQualityClone.clone();
        VideoQuality videoQualityClone = VideoQuality.DEFAULT_VIDEO_QUALITY.clone();
        this.f12340i = videoQualityClone;
        this.f12342j = videoQualityClone.clone();
        this.f12344k = this.f12340i.clone();
        this.f12347l = (byte) -1;
        this.f12349m = 0;
        this.f12351n = 0;
        this.f12353o = null;
        this.f12355p = null;
        this.f12358q = null;
        this.f12360r = null;
        this.f12362s = null;
        this.f12364t = null;
        this.f12366u = 0;
        this.f12368v = 0;
        this.f12370w = 0;
        this.f12372x = 0;
        this.f12374y = 1;
        this.f12376z = 1;
        this.f12257A = null;
        this.f12259B = null;
        this.f12261C = null;
        this.f12263D = null;
        this.f12265E = new Object();
        this.f12268F = new Object();
        this.f12271G = 0;
        this.f12274H = PKIFailureInfo.wrongIntegrity;
        this.f12277I = ByteBuffer.allocate(PKIFailureInfo.wrongIntegrity);
        this.f12280J = ByteBuffer.allocate(this.f12274H);
        this.f12283K = ByteBuffer.allocate(this.f12274H);
        this.f12286L = 0;
        this.f12289M = 0;
        this.f12292N = 0;
        this.f12295O = null;
        this.f12301Q = 0;
        this.f12304R = false;
        this.f12307S = 0;
        this.f12310T = false;
        this.f12312U = -1;
        this.f12314V = 0;
        this.f12316W = -1;
        this.f12318X = 0;
        this.f12320Y = 0.0f;
        this.f12322Z = 0;
        this.f12345k0 = false;
        this.f12356p0 = false;
        this.f12266E0 = 0L;
        this.f12269F0 = 1.0f;
        this.f12272G0 = 0.5f;
        this.f12275H0 = false;
        this.f12278I0 = false;
        this.f12281J0 = 6000L;
        this.f12284K0 = 1000L;
        this.f12287L0 = 3000L;
        this.f12290M0 = false;
        this.f12293N0 = true;
        this.f12296O0 = false;
        this.f12299P0 = null;
        this.f12302Q0 = null;
        this.f12305R0 = null;
        this.f12308S0 = 0L;
        this.f12311T0 = 0L;
        this.f12313U0 = null;
        this.f12315V0 = null;
        this.f12317W0 = null;
        this.f12319X0 = null;
        this.f12321Y0 = null;
        this.f12323Z0 = null;
        this.f12325a1 = -1L;
        this.f12329c1 = false;
        this.f12341i1 = null;
        this.f12343j1 = null;
        this.f12346k1 = 0;
        this.f12359q1 = 0;
        this.f12365t1 = false;
        this.f12367u1 = false;
        this.f12369v1 = new HashMap();
        this.f12371w1 = -1;
        this.f12375y1 = false;
        this.f12377z1 = 20;
        this.f12258A1 = false;
        this.f12260B1 = 0;
        this.f12262C1 = null;
        this.f12264D1 = false;
        this.f12267E1 = null;
        this.f12270F1 = null;
        this.f12273G1 = new audio_Indicator();
        this.f12276H1 = new Object();
        this.f12279I1 = null;
        this.f12282J1 = new SinkBase.ExtPcmDateCallback() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.1
            public void onPcmDateCallback(byte[] bArr, int i, long j) {
                int length = bArr.length;
                StreamProducer.this.f12356p0 = true;
                try {
                    StreamProducer.this.m11102t0();
                    int i2 = 0;
                    while (StreamProducer.this.f12292N + length >= StreamProducer.this.f12274H) {
                        int i3 = StreamProducer.this.f12292N;
                        StreamProducer streamProducer = StreamProducer.this;
                        if (i3 > 0) {
                            byte[] bArr2 = new byte[streamProducer.f12274H];
                            StreamProducer.this.f12283K.rewind();
                            StreamProducer.this.f12283K.get(bArr2, 0, StreamProducer.this.f12292N);
                            StreamProducer.this.f12283K.clear();
                            n8c.c("streamerCameraProducer", "mExtRemainAudioIndex > 0 arraycopy :" + i2 + ";mExtRemainAudioIndex:" + StreamProducer.this.f12292N);
                            System.arraycopy(bArr, i2, bArr2, StreamProducer.this.f12292N, StreamProducer.this.f12274H - StreamProducer.this.f12292N);
                            i2 += StreamProducer.this.f12274H - StreamProducer.this.f12292N;
                            length -= StreamProducer.this.f12274H - StreamProducer.this.f12292N;
                            if (StreamProducer.this.f12298P != null) {
                                n8c.c("streamerCameraProducer", "mExtRemainAudioIndex > 0 putSurroundData :" + i2 + ";lens:" + length);
                                if (StreamProducer.this.f12359q1 == 2) {
                                    StreamProducer.this.m11172e2();
                                }
                                StreamProducer.this.f12298P.putAudioData(new mpd0(bArr2, System.nanoTime() / 1000, StreamProducer.this.f12338h.channelNum));
                            }
                            StreamProducer.this.f12292N = 0;
                        } else {
                            byte[] bArr3 = new byte[streamProducer.f12274H];
                            System.arraycopy(bArr, i2, bArr3, 0, StreamProducer.this.f12274H);
                            if (StreamProducer.this.f12298P != null) {
                                n8c.c("streamerCameraProducer", "mExtRemainAudioIndex == 0 putSurroundData pos :" + i2 + ";lens:" + length);
                                if (StreamProducer.this.f12359q1 == 2) {
                                    StreamProducer.this.m11172e2();
                                }
                                StreamProducer.this.f12298P.putAudioData(new mpd0(bArr3, System.nanoTime() / 1000, StreamProducer.this.f12338h.channelNum));
                            }
                            length -= StreamProducer.this.f12274H;
                            i2 += StreamProducer.this.f12274H;
                        }
                    }
                    if (length > 0) {
                        StreamProducer.this.f12283K.put(bArr, i2, length);
                        StreamProducer.m11104v(StreamProducer.this, length);
                        n8c.c("streamerCameraProducer", "mExtRemainAudioIndex.put:pos:" + i2 + ";lens:" + StreamProducer.this.f12292N);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    StreamProducer.this.f12292N = 0;
                    StreamProducer.this.f12283K.clear();
                    n8c.c("streamerCameraProducer", "onMediaDateCallback:exception");
                }
            }
        };
        this.f12285K1 = new SinkBase.PcmDateCallback() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.2
            public void onPcmDateCallback(long j, byte[] bArr, int i, boolean z) {
                int length = bArr.length;
                int i2 = 0;
                while (StreamProducer.this.f12289M + length >= StreamProducer.this.f12274H) {
                    try {
                        int i3 = StreamProducer.this.f12289M;
                        StreamProducer streamProducer = StreamProducer.this;
                        if (i3 > 0) {
                            byte[] bArr2 = new byte[streamProducer.f12274H];
                            StreamProducer.this.f12280J.rewind();
                            StreamProducer.this.f12280J.get(bArr2, 0, StreamProducer.this.f12289M);
                            StreamProducer.this.f12280J.clear();
                            n8c.c("streamerCameraProducer", "mAttachMergeRemainAudioIndex > 0 arraycopy :" + i2 + ";mAttachMergeRemainAudioIndex:" + StreamProducer.this.f12289M);
                            System.arraycopy(bArr, i2, bArr2, StreamProducer.this.f12289M, StreamProducer.this.f12274H - StreamProducer.this.f12289M);
                            i2 += StreamProducer.this.f12274H - StreamProducer.this.f12289M;
                            length -= StreamProducer.this.f12274H - StreamProducer.this.f12289M;
                            if (StreamProducer.this.f12298P != null) {
                                n8c.c("streamerCameraProducer", "mAttachMergeRemainAudioIndex > 0 putSurroundData :" + i2 + ";lens:" + length);
                                StreamProducer.this.f12298P.putAudioData(new mpd0(bArr2, System.nanoTime() / 1000, StreamProducer.this.f12338h.channelNum));
                            }
                            StreamProducer.this.f12289M = 0;
                        } else {
                            byte[] bArr3 = new byte[streamProducer.f12274H];
                            System.arraycopy(bArr, i2, bArr3, 0, StreamProducer.this.f12274H);
                            if (StreamProducer.this.f12298P != null) {
                                n8c.c("streamerCameraProducer", "mAttachMergeRemainAudioIndex == 0 putSurroundData pos :" + i2 + ";lens:" + length);
                                StreamProducer.this.f12298P.putAudioData(new mpd0(bArr3, System.nanoTime() / 1000, StreamProducer.this.f12338h.channelNum));
                            }
                            length -= StreamProducer.this.f12274H;
                            i2 += StreamProducer.this.f12274H;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        StreamProducer.this.f12289M = 0;
                        StreamProducer.this.f12280J.clear();
                        n8c.c("streamerCameraProducer", "onMediaDateCallback:exception");
                        return;
                    }
                }
                if (length > 0) {
                    StreamProducer.this.f12280J.put(bArr, i2, length);
                    StreamProducer.m11087k0(StreamProducer.this, length);
                    n8c.c("streamerCameraProducer", "mAttachMergeRemainAudio.put:pos:" + i2 + ";lens:" + StreamProducer.this.f12289M);
                }
            }
        };
        this.f12288L1 = new IMediaPlayer.OnPreparedListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.3
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                n8c.a("streamerCameraProducer", "Mediaplayer onPrepared");
                StreamProducer.this.f12346k1 = 2;
                StreamProducer.this.f12367u1 = true;
                long j = StreamProducer.this.f12348l1;
                if (j != 0) {
                    StreamProducer.this.m11183l1(j);
                    StreamProducer.this.m11170e();
                }
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f12350m1;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m11305a(streamProducer.f12261C, 1, 0);
                }
                StreamProducer.this.m11096p0();
            }
        };
        this.f12291M1 = new IMediaPlayer.OnCompletionListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.4
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                StreamProducer.this.f12367u1 = false;
                StreamProducer.this.f12346k1 = 5;
                n8c.a("streamerCameraProducer", "Mediaplayer onCompletion");
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f12350m1;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m11305a(streamProducer.f12261C, 2, 0);
                }
            }
        };
        this.f12294N1 = new IMediaPlayer.OnErrorListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.5
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                n8c.b("streamerCameraProducer", "Mediaplayer Error: %d, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                StreamProducer.this.f12367u1 = false;
                StreamProducer.this.f12346k1 = -1;
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f12350m1;
                if (onSurroundMusicStatusListener == null) {
                    return true;
                }
                onSurroundMusicStatusListener.m11305a(streamProducer.f12261C, -1, 0);
                return true;
            }
        };
        this.f12297O1 = new IMediaPlayer.OnBufferingUpdateListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.6
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            }
        };
        this.f12300P1 = new IMediaPlayer.OnInfoListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.7
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                n8c.b("streamerCameraProducer", "Mediaplayer onInfo: (%d, %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                return true;
            }
        };
        this.f12303Q1 = new IMediaPlayer.OnSeekCompleteListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.8
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                n8c.a("streamerCameraProducer", "Mediaplayer onSeekComplete");
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f12350m1;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m11305a(streamProducer.f12261C, 3, 0);
                }
            }
        };
        this.f12306R1 = new IjkMediaPlayer.MediaDateCallback() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.9
            @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
            public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
                n8c.c("streamerCameraProducer", "Mediaplayer mMediaDateCallback data.len" + bArr.length + ";recording:" + StreamProducer.this.f12365t1);
                int length = bArr.length;
                if (StreamProducer.this.f12365t1 && StreamProducer.this.f12367u1) {
                    int i3 = 0;
                    while (length >= StreamProducer.this.f12274H) {
                        try {
                            int i4 = StreamProducer.this.f12286L;
                            StreamProducer streamProducer = StreamProducer.this;
                            if (i4 > 0) {
                                byte[] bArr2 = new byte[streamProducer.f12274H];
                                StreamProducer.this.f12277I.rewind();
                                StreamProducer.this.f12277I.get(bArr2, 0, StreamProducer.this.f12286L);
                                StreamProducer.this.f12277I.clear();
                                n8c.c("streamerCameraProducer", "mRemainAudioIndex > 0 arraycopy :" + i3 + ";mRemainAudioIndex:" + StreamProducer.this.f12286L);
                                System.arraycopy(bArr, i3, bArr2, StreamProducer.this.f12286L, StreamProducer.this.f12274H - StreamProducer.this.f12286L);
                                i3 += StreamProducer.this.f12274H - StreamProducer.this.f12286L;
                                length -= StreamProducer.this.f12274H - StreamProducer.this.f12286L;
                                if (StreamProducer.this.f12298P == null) {
                                    StreamProducer.this.f12298P = new AudioProcess();
                                }
                                if (StreamProducer.this.f12298P != null) {
                                    n8c.c("streamerCameraProducer", "mRemainAudioIndex > 0 putSurroundData :" + i3 + ";lens:" + length);
                                    StreamProducer.this.f12298P.putSurroundData(new mpd0(bArr2, System.nanoTime() / 1000, StreamProducer.this.f12338h.channelNum));
                                }
                                StreamProducer.this.f12286L = 0;
                            } else {
                                byte[] bArr3 = new byte[streamProducer.f12274H];
                                System.arraycopy(bArr, i3, bArr3, 0, StreamProducer.this.f12274H);
                                if (StreamProducer.this.f12298P != null) {
                                    n8c.c("streamerCameraProducer", "mRemainAudioIndex == 0 putSurroundData pos :" + i3 + ";lens:" + length);
                                    StreamProducer.this.f12298P.putSurroundData(new mpd0(bArr3, System.nanoTime() / 1000, StreamProducer.this.f12338h.channelNum));
                                }
                                length -= StreamProducer.this.f12274H;
                                i3 += StreamProducer.this.f12274H;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            StreamProducer.this.f12286L = 0;
                            StreamProducer.this.f12277I.clear();
                            n8c.c("streamerCameraProducer", "onMediaDateCallback:exception");
                            return;
                        }
                    }
                    if (length > 0) {
                        StreamProducer.this.f12277I.put(bArr, i3, length);
                        StreamProducer.this.f12286L = length;
                        n8c.c("streamerCameraProducer", "mRemainAudio.put:pos:" + i3 + ";lens:" + StreamProducer.this.f12286L);
                    }
                }
            }
        };
        this.f12309S1 = new Handler(Looper.getMainLooper());
        n8c.c("streamerCameraProducer", "StreamProducer:" + ((int) this.f12347l));
        this.f12259B = context;
        this.f12261C = ijkmediastreamer;
        this.f12317W0 = momoSurface;
        if (this.f12270F1 == null) {
            HandlerThread handlerThread = new HandlerThread("ijkStrMonitor");
            this.f12270F1 = handlerThread;
            handlerThread.start();
            this.f12267E1 = new Handler(this.f12270F1.getLooper());
        }
        m11182k2();
        m11088k1();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m11042C(StreamProducer streamProducer) {
        int i = streamProducer.f12260B1;
        streamProducer.f12260B1 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public void m11053M1() {
        Handler handler = this.f12267E1;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.10
                @Override // java.lang.Runnable
                public void run() {
                    StreamProducer.this.notifyExtralAudioLoss();
                }
            }, 5000L);
        }
    }

    /* JADX INFO: renamed from: V0 */
    private void m11063V0() {
        this.f12331d1 = new VideoRecordRunnable();
        Thread thread = new Thread(this.f12331d1, "live-media-StreamVideoRecorder");
        this.f12333e1 = thread;
        thread.start();
    }

    /* JADX INFO: renamed from: Z1 */
    private void m11068Z1() {
        n8c.c("streamerCameraProducer", "AudioRecordRunnable startAudioCapture stopAudioCapture");
        m11172e2();
        synchronized (this.f12268F) {
            try {
                if (this.f12363s1 == null && this.f12354o1 == null) {
                    n8c.c("streamerCameraProducer", "AudioRecordRunnable startAudioCapture");
                    this.f12293N0 = true;
                    if (this.f12298P == null) {
                        AudioProcess audioProcess = new AudioProcess();
                        this.f12298P = audioProcess;
                        audioProcess.setMasterAudioLevel(this.f12269F0);
                        this.f12298P.setSlaveAudioLevel(this.f12272G0);
                        this.f12298P.startAudioProcessding();
                        boolean z = this.f12304R;
                        if (z) {
                            this.f12298P.adjustEQ(this.f12301Q, z);
                        }
                        boolean z2 = this.f12345k0;
                        if (z2) {
                            this.f12298P.adjustTune(this.f12322Z, z2);
                        }
                        boolean z3 = this.f12310T;
                        if (z3) {
                            this.f12298P.adjustAef(this.f12307S, z3);
                        }
                        int i = this.f12312U;
                        if (i >= 0) {
                            this.f12298P.adjustEf(i, this.f12314V);
                        }
                        int i2 = this.f12316W;
                        if (i2 >= 0) {
                            this.f12298P.SabineEffectSet(i2, this.f12318X, this.f12320Y);
                        }
                        this.f12298P.openSabineEf(44100, 2, this.f12274H / 2);
                    }
                    if (this.f12327b1 == null) {
                        AudioRecordRunnable audioRecordRunnable = new AudioRecordRunnable();
                        this.f12327b1 = audioRecordRunnable;
                        audioRecordRunnable.m11218c(this.f12329c1);
                    }
                    if (this.f12335f1 == null) {
                        Thread thread = new Thread(this.f12327b1, "live-media-AudRec");
                        this.f12335f1 = thread;
                        thread.start();
                    }
                    this.f12327b1.m11216a(this.f12298P);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a2 */
    private int m11070a2() {
        n8c.c("streamerCameraProducer", "AudioRecordRunnable startAudioCapture stopAudioCapture");
        return 0;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ long m11071b0(StreamProducer streamProducer) {
        long j = streamProducer.f12266E0;
        streamProducer.f12266E0 = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: f2 */
    private void m11077f2() {
        if (this.f12337g1 != null) {
            try {
                this.f12296O0 = false;
                this.f12337g1.join(1000L);
            } catch (InterruptedException unused) {
                this.f12337g1.interrupt();
            }
            this.f12337g1 = null;
        }
        if (this.f12279I1 != null) {
            removePcmDataCallback(this.f12279I1);
            this.f12279I1 = null;
        }
        n8c.c("streamerCameraProducer", "stopAudioEncode");
        MediaCodecAudioMux mediaCodecAudioMux = this.f12323Z0;
        if (mediaCodecAudioMux != null) {
            mediaCodecAudioMux.stop();
            this.f12323Z0 = null;
        }
        this.f12358q = null;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ int m11087k0(StreamProducer streamProducer, int i) {
        int i2 = streamProducer.f12289M + i;
        streamProducer.f12289M = i2;
        return i2;
    }

    /* JADX INFO: renamed from: k1 */
    private void m11088k1() {
        try {
            this.f12341i1 = new HeadsetPlugReceiver();
            this.f12343j1 = new BlueConnectStateBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            this.f12263D = intentFilter;
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            Context context = this.f12259B;
            if (context != null) {
                ii5.l(context, this.f12341i1, this.f12263D);
                ii5.l(this.f12259B, this.f12343j1, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                this.f12375y1 = ((AudioManager) this.f12259B.getApplicationContext().getSystemService("audio")).isWiredHeadsetOn();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public void m11096p0() {
        IjkMediaPlayer ijkMediaPlayer = this.f12360r;
        if (ijkMediaPlayer != null) {
            if (this.f12375y1 && this.f12264D1) {
                float f = this.f12272G0;
                ijkMediaPlayer.setVolume(f * 0.18f, f * 0.18f);
            } else {
                float f2 = this.f12272G0;
                ijkMediaPlayer.setVolume(f2 * 0.18f, f2 * 0.18f);
            }
        }
    }

    /* JADX INFO: renamed from: s2 */
    private void m11100s2() {
        VideoQuality videoQuality = this.f12342j;
        int i = videoQuality.resX;
        if (i % 2 != 0) {
            videoQuality.resX = i - 1;
        }
        int i2 = videoQuality.resY;
        if (i2 % 2 != 0) {
            videoQuality.resY = i2 - 1;
        }
        if (videoQuality.resX < 176) {
            videoQuality.resX = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
        }
        if (videoQuality.resY < 32) {
            videoQuality.resY = 32;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m11102t0() {
        Handler handler = this.f12267E1;
        if (handler != null) {
            handler.removeCallbacks(null);
            this.f12267E1.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m11104v(StreamProducer streamProducer, int i) {
        int i2 = streamProducer.f12292N + i;
        streamProducer.f12292N = i2;
        return i2;
    }

    /* JADX INFO: renamed from: v0 */
    private void m11105v0() throws IOException {
        Thread thread = new Thread(new AudioEncoderRunnable(), "live-media-EnAudioSoft");
        this.f12337g1 = thread;
        thread.start();
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    /* JADX INFO: renamed from: w0 */
    private void m11107w0() throws IOException {
        try {
            this.f12296O0 = true;
            this.f12358q = MediaCodec.createEncoderByType("audio/mp4a-latm");
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, this.f12338h.bitRate);
            mediaFormat.setInteger("channel-count", this.f12338h.channelNum);
            mediaFormat.setInteger("sample-rate", this.f12338h.samplingRate);
            mediaFormat.setInteger("aac-profile", 2);
            mediaFormat.setInteger("max-input-size", this.f12274H);
            this.f12358q.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f12358q.start();
            this.f12295O = this.f12358q.getInputBuffers();
            SinkBase sinkBase = this.f12361r1;
            if (sinkBase != null) {
                sinkBase.setErrorCode(0);
            }
            MediaCodecAudioMux mediaCodecAudioMux = new MediaCodecAudioMux(this.f12358q, this.f12361r1);
            this.f12323Z0 = mediaCodecAudioMux;
            mediaCodecAudioMux.m10619l();
            this.f12323Z0.m10615h(new PacketBufferlingStatusListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.14
                @Override // tv.danmaku.ijk.media.streamer.StreamProducer.PacketBufferlingStatusListener
                /* JADX INFO: renamed from: a */
                public void mo11215a(int i, long j) {
                    n8c.c("streamerCameraProducer", "audioMux PacketBufferlingStatusUpdata: " + i + ";duration:" + j);
                    if (i == 104) {
                        long unused = StreamProducer.this.f12281J0;
                        long unused2 = StreamProducer.this.f12281J0;
                    }
                }
            });
            Thread thread = new Thread(new AudioEncoderRunnable(), "live-media-EnAudioMCodec");
            this.f12337g1 = thread;
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public long m11111A0() {
        MediaCodecAudioMux mediaCodecAudioMux = this.f12323Z0;
        if (mediaCodecAudioMux != null) {
            return mediaCodecAudioMux.m10602n();
        }
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_AUDIO_CACHED_PACKETS, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: A1 */
    public void m11112A1(long j) {
        MediaCodecVideoMux mediaCodecVideoMux = this.f12319X0;
        if (mediaCodecVideoMux == null) {
            this.f12325a1 = j;
        } else {
            mediaCodecVideoMux.m10614g(j);
            this.f12325a1 = -1L;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public long m11113B0() {
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            return audioProcess.getAudioFrames();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: B1 */
    public void m11114B1(long j) {
        this.f12287L0 = j;
        if (j <= 0) {
            this.f12287L0 = 1000L;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public long m11115C0() {
        return this.f12266E0 * ((long) this.f12274H);
    }

    /* JADX INFO: renamed from: C1 */
    public void m11116C1(ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener) {
        this.f12350m1 = onSurroundMusicStatusListener;
    }

    /* JADX INFO: renamed from: D0 */
    public long m11117D0() {
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_AUDIO_CACHED_BYTES, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: D1 */
    public void m11118D1(ijkMediaStreamer.OnWiredHeadsetStatusListener onWiredHeadsetStatusListener) {
        this.f12373x1 = onWiredHeadsetStatusListener;
    }

    /* JADX INFO: renamed from: E0 */
    public long m11119E0() {
        MediaCodecAudioMux mediaCodecAudioMux = this.f12323Z0;
        if (mediaCodecAudioMux != null) {
            return mediaCodecAudioMux.m10603o();
        }
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(IjkMediaPlayer.PROP_INT64_VIDEO_OUTPUT_FRAMES, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: E1 */
    public void m11120E1(PointF pointF) {
        this.f12324a = pointF;
    }

    /* JADX INFO: renamed from: F0 */
    public long m11121F0() {
        MediaCodecVideoMux mediaCodecVideoMux = this.f12319X0;
        if (mediaCodecVideoMux != null) {
            return mediaCodecVideoMux.m10605n();
        }
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(IjkMediaPlayer.PROP_INT64_VIDEO_DECODE_FRAMES, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F1 */
    public void m11122F1(float f) {
        this.f12326b = f;
    }

    /* JADX INFO: renamed from: G0 */
    public float m11123G0() {
        return this.f12269F0;
    }

    /* JADX INFO: renamed from: G1 */
    public void m11124G1(String str) {
        n8c.c("streamerCameraProducer", "setSei:" + str);
        this.f12332e = str;
        MediaCodecVideoMux mediaCodecVideoMux = this.f12319X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.m10618k(str);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public int m11125H0() {
        return this.f12371w1;
    }

    /* JADX INFO: renamed from: H1 */
    public void m11126H1(float f) {
        this.f12272G0 = f;
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
        m11096p0();
    }

    /* JADX INFO: renamed from: I0 */
    public int m11127I0() {
        return 0;
    }

    /* JADX INFO: renamed from: I1 */
    public void m11128I1(long j, boolean z) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f12317W0;
            if (momoSurface != null) {
                momoSurface.m10929U0(j, z);
                return;
            }
            return;
        }
        Map map = this.f12369v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f12369v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m10686o2(j, z);
    }

    /* JADX INFO: renamed from: J0 */
    public MomoSurface m11129J0() {
        return this.f12317W0;
    }

    /* JADX INFO: renamed from: J1 */
    public void m11130J1(long j, boolean z) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f12317W0;
            if (momoSurface != null) {
                momoSurface.m10930V0(j, z);
                return;
            }
            return;
        }
        Map map = this.f12369v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f12369v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m10690s2(j, z);
    }

    /* JADX INFO: renamed from: K0 */
    public long m11131K0() {
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_STREAM_COUNT, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: K1 */
    public void m11132K1(long j, int i, int i2, int i3, int i4, int i5) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f12317W0;
            if (momoSurface != null) {
                momoSurface.m10931W0(j, i, i2, i3, i4, i5);
                return;
            }
            return;
        }
        Map map = this.f12369v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f12369v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m10685C2(j, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m11133L0() {
        return this.f12365t1;
    }

    /* JADX INFO: renamed from: L1 */
    public void m11134L1(long j, int i, int i2, int i3, int i4) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f12317W0;
            if (momoSurface != null) {
                momoSurface.m10933X0(j, i, i2, i3, i4);
                return;
            }
            return;
        }
        Map map = this.f12369v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f12369v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m10696z2(j, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: M0 */
    public float m11135M0() {
        return this.f12272G0;
    }

    /* JADX INFO: renamed from: N0 */
    public long m11136N0() {
        IjkMediaPlayer ijkMediaPlayer = this.f12360r;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: N1 */
    public void m11137N1(int i) {
        audio_Indicator audio_indicator = this.f12273G1;
        if (audio_indicator != null) {
            audio_indicator.setUserID(i);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public long m11138O0() {
        IjkMediaPlayer ijkMediaPlayer = this.f12360r;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: O1 */
    public void m11139O1(z1l0 z1l0Var) {
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            sinkBase.setVideoChannellistener(z1l0Var);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public long m11140P0() {
        MediaCodecVideoMux mediaCodecVideoMux = this.f12319X0;
        if (mediaCodecVideoMux != null) {
            return mediaCodecVideoMux.m10607p();
        }
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_AUDIO_RENDER_BYTES, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: P1 */
    public void m11141P1(int i) {
        n8c.c("streamerCameraProducer", "----setVideoEncodingBitRate: " + this.f12342j.bitrate + "---->" + i);
        this.f12342j.bitrate = i;
        MediaCodecVideoMux mediaCodecVideoMux = this.f12319X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.m10611d(i);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public long m11142Q0() {
        MediaCodecVideoMux mediaCodecVideoMux = this.f12319X0;
        if (mediaCodecVideoMux != null) {
            return mediaCodecVideoMux.m10606o();
        }
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_VIDEO_READ_BYTES, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m11143Q1(int i) {
        VideoQuality videoQuality = this.f12342j;
        videoQuality.framerate = i;
        if (i > 30) {
            videoQuality.framerate = 30;
        }
        if (videoQuality.framerate <= 0) {
            videoQuality.framerate = 20;
        }
        this.f12377z1 = videoQuality.framerate;
        m11167d(i, false);
    }

    /* JADX INFO: renamed from: R0 */
    public int m11144R0() {
        return this.f12342j.bitrate;
    }

    /* JADX INFO: renamed from: R1 */
    public void m11145R1(int i, int i2) {
        VideoQuality videoQuality = this.f12342j;
        videoQuality.resX = i;
        videoQuality.resY = i2;
    }

    /* JADX INFO: renamed from: S0 */
    public long m11146S0() {
        MomoSurface momoSurface = this.f12317W0;
        if (momoSurface != null) {
            return momoSurface.m10963w0();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: S1 */
    public void m11147S1(int i) {
        this.f12374y = i;
    }

    /* JADX INFO: renamed from: T0 */
    public int m11148T0() {
        return this.f12260B1;
    }

    /* JADX INFO: renamed from: T1 */
    public void m11149T1(int i) {
        MomoSurface momoSurface = this.f12317W0;
        if (momoSurface != null) {
            momoSurface.m10937Z0(i);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m11150U0() {
        synchronized (this.f12276H1) {
            try {
                if (this.f12262C1 == null && this.f12375y1 && this.f12264D1) {
                    AudioQuality audioQuality = this.f12338h;
                    NonBlockingAudioTrack nonBlockingAudioTrack = new NonBlockingAudioTrack(audioQuality.samplingRate, audioQuality.channelNum);
                    this.f12262C1 = nonBlockingAudioTrack;
                    nonBlockingAudioTrack.play();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m11151U1(boolean z) {
        this.f12264D1 = z;
        if (!z) {
            m11161b();
        }
        m11096p0();
    }

    /* JADX INFO: renamed from: V1 */
    public void m11152V1() {
        if (m11070a2() == 0) {
            m11068Z1();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m11153W0() {
        int i;
        return (this.f12360r == null || (i = this.f12346k1) == -1 || i == 0 || i == 1) ? false : true;
    }

    /* JADX INFO: renamed from: W1 */
    public void m11154W1() {
        synchronized (this.f12265E) {
            try {
                try {
                    m11152V1();
                    if (this.f12347l == 5) {
                        m11107w0();
                    } else {
                        m11105v0();
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
    public boolean m11155X0() {
        return this.f12375y1;
    }

    /* JADX INFO: renamed from: X1 */
    public void m11156X1(Activity activity, Bitmap bitmap, int i, int i2, int i3, int i4) {
        n8c.c("streamerCameraProducer", "----startCaptureImage(S):" + this.f12352n1);
        SourceBase sourceBase = this.f12352n1;
        if (sourceBase != null) {
            this.f12271G = 0;
            sourceBase.mo10788J(activity, bitmap, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m11157Y0(boolean z) {
    }

    /* JADX INFO: renamed from: Y1 */
    public void m11158Y1(Activity activity, int i, int i2, MediaProjection mediaProjection, int i3) {
        n8c.c("streamerCameraProducer", "----startCaptureScreen(S):" + this.f12352n1);
        SourceBase sourceBase = this.f12352n1;
        if (sourceBase != null) {
            this.f12271G = 0;
            sourceBase.mo10802K(activity, i, i2, mediaProjection, i3);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m11159Z0(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.streamer.MomoSurface.PostDrawImageCallback
    /* JADX INFO: renamed from: a */
    public void mo10965a(int i) {
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            sinkBase.postDrawImage(i);
        }
        if (this.f12363s1 != null) {
            this.f12363s1.postDrawImage(i);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m11160a1(boolean z) {
        this.f12329c1 = z;
        AudioRecordRunnable audioRecordRunnable = this.f12327b1;
        if (audioRecordRunnable != null) {
            audioRecordRunnable.m11218c(z);
        }
        IjkMediaPlayer ijkMediaPlayer = this.f12360r;
        if (ijkMediaPlayer != null) {
            if (this.f12329c1) {
                ijkMediaPlayer.setMediaDataCallback(null);
                this.f12360r.setMediaDataCallback(this.f12306R1);
                this.f12360r.setMediaDateCallbackFlags(1);
            } else {
                if (this.f12375y1) {
                    return;
                }
                ijkMediaPlayer.setMediaDataCallback(null);
                this.f12360r.setMediaDateCallbackFlags(0);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11161b() {
        synchronized (this.f12276H1) {
            try {
                NonBlockingAudioTrack nonBlockingAudioTrack = this.f12262C1;
                if (nonBlockingAudioTrack != null) {
                    nonBlockingAudioTrack.stop();
                    this.f12262C1.release();
                    this.f12262C1 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m11162b1(boolean z) {
    }

    /* JADX INFO: renamed from: b2 */
    public void m11163b2() {
        n8c.c("streamerCameraProducer", "----startRecording(S):" + ((int) this.f12347l) + ";recording =" + this.f12365t1 + ";mVideoSource=" + this.f12352n1);
        if (!this.f12365t1 && m11178i1()) {
            this.f12365t1 = true;
            m11154W1();
            m11166c2();
            this.f12275H0 = false;
            n8c.c("streamerCameraProducer", "----startRecording(E):" + ((int) this.f12347l) + ";recording =" + this.f12365t1);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11164c(boolean z) {
        synchronized (this.f12265E) {
            try {
                AudioProcess audioProcess = this.f12298P;
                if (audioProcess != null) {
                    if (z) {
                        n8c.c("streamerCameraProducer", "AudioRecordRunnable EnableExternalAudio stopAudioCapture");
                        m11172e2();
                    } else {
                        audioProcess.clear();
                        n8c.c("streamerCameraProducer", "AudioRecordRunnable EnableExternalAudio startAudioCapture");
                        m11152V1();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m11165c1(long j, boolean z) {
    }

    /* JADX INFO: renamed from: c2 */
    public void m11166c2() {
        synchronized (this.f12265E) {
            try {
                try {
                    this.f12290M0 = true;
                    if (this.f12347l != 5) {
                        MomoSurface momoSurface = this.f12317W0;
                        if (momoSurface != null) {
                            momoSurface.m10936Z(null);
                            this.f12317W0.m10920M0(this.f12342j.framerate, false);
                        }
                        this.f12317W0.m10938b0();
                        m11063V0();
                    } else {
                        m11209x0();
                    }
                    this.f12365t1 = true;
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
    public void m11167d(int i, boolean z) {
        if (this.f12317W0 != null) {
            n8c.c("streamerCameraProducer", "softFrameRateUpdata: " + i + ";needDrop:" + z);
            this.f12317W0.m10920M0(i, z);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m11168d1(long j, boolean z) {
    }

    /* JADX INFO: renamed from: d2 */
    public void m11169d2() {
        MomoSurface momoSurface = this.f12317W0;
        if (momoSurface != null) {
            momoSurface.m10913C0();
        }
        MediaCodecVideoMux mediaCodecVideoMux = this.f12321Y0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.stop();
            this.f12321Y0 = null;
        }
        this.f12321Y0 = null;
    }

    /* JADX INFO: renamed from: e */
    public void m11170e() {
        if (m11153W0()) {
            this.f12360r.start();
            this.f12346k1 = 3;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m11171e1(Activity activity, long j, Bitmap bitmap) {
        if (bitmap == null || this.f12317W0 == null || this.f12369v1 == null) {
            return;
        }
        n8c.c("streamerCameraProducer", "openPublishHelp(S): label [" + j + "], bitmap=" + bitmap);
        if (this.f12369v1.containsKey(Long.valueOf(j))) {
            if (((AidSource) this.f12369v1.get(Long.valueOf(j))) != null) {
                n8c.c("streamerCameraProducer", "openPublishHelp: userID[" + j + "]未释放！！！");
                return;
            }
            return;
        }
        AidSource aidSource = new AidSource(bitmap, this.f12317W0, j, -1);
        n8c.c("streamerCameraProducer", "openPublishHelp: add [" + j + "]");
        this.f12369v1.put(Long.valueOf(j), aidSource);
    }

    /* JADX INFO: renamed from: e2 */
    public void m11172e2() {
        synchronized (this.f12268F) {
            try {
                if (this.f12354o1 != null) {
                    return;
                }
                AudioRecordRunnable audioRecordRunnable = this.f12327b1;
                if (audioRecordRunnable != null) {
                    audioRecordRunnable.m11216a(null);
                }
                if (this.f12335f1 != null) {
                    try {
                        this.f12293N0 = false;
                        this.f12335f1.join(2000L);
                    } catch (InterruptedException unused) {
                        this.f12335f1.interrupt();
                    }
                    this.f12335f1 = null;
                    n8c.c("streamerCameraProducer", "AudioRecordRunnable stopAudioCapture");
                }
                this.f12327b1 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m11173f1(Activity activity, ijkMediaStreamer ijkmediastreamer, long j, String str, int i, int i2, ijkMediaStreamer.SizeChangedCallback sizeChangedCallback, int i3, ijkMediaStreamer.aidSwitchResolution aidswitchresolution) {
        String str2 = "tcp://" + str + ":" + i + "?listen";
        if (str == null || this.f12317W0 == null || ijkmediastreamer == null || this.f12369v1 == null) {
            return;
        }
        n8c.c("streamerCameraProducer", "openPublishHelp(S): label [" + j + "], type=" + i3 + ", ip[" + str + "], " + sizeChangedCallback);
        if (this.f12369v1.containsKey(Long.valueOf(j))) {
            if (((AidSource) this.f12369v1.get(Long.valueOf(j))) != null) {
                n8c.c("streamerCameraProducer", "openPublishHelp: userID[" + j + "]未释放！！！");
                return;
            }
            return;
        }
        AidSource aidSource = new AidSource(activity, this, ijkmediastreamer, str2, this.f12317W0, j, sizeChangedCallback, i3, -1, aidswitchresolution);
        n8c.c("streamerCameraProducer", "openPublishHelp: add [" + j + "]");
        this.f12369v1.put(Long.valueOf(j), aidSource);
    }

    /* JADX INFO: renamed from: g1 */
    public void m11174g1(Activity activity, ijkMediaStreamer ijkmediastreamer, long j, String str, ijkMediaStreamer.SizeChangedCallback sizeChangedCallback, int i) {
        if (str == null || this.f12317W0 == null || ijkmediastreamer == null || this.f12369v1 == null) {
            return;
        }
        n8c.c("streamerCameraProducer", "openPublishHelp(S): label [" + j + "], type=" + i + ", url[" + str + "], " + sizeChangedCallback);
        if (this.f12369v1.containsKey(Long.valueOf(j))) {
            if (((AidSource) this.f12369v1.get(Long.valueOf(j))) != null) {
                n8c.c("streamerCameraProducer", "openPublishHelp: userID[" + j + "]未释放！！！");
                return;
            }
            return;
        }
        AidSource aidSource = new AidSource(activity, this, ijkmediastreamer, str, this.f12317W0, j, sizeChangedCallback, i, -1, null);
        n8c.c("streamerCameraProducer", "openPublishHelp: add [" + j + "]");
        this.f12369v1.put(Long.valueOf(j), aidSource);
    }

    /* JADX INFO: renamed from: g2 */
    public void m11175g2() {
        n8c.c("streamerCameraProducer", "AudioRecordRunnable stopAudioRecording stopAudioCapture");
        m11172e2();
        m11077f2();
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.stopAudioProcessding();
            this.f12298P.clear();
            this.f12298P.release();
            this.f12298P = null;
        }
        n8c.c("streamerCameraProducer", "stopAudioRecording");
    }

    public PointF getPreviewScale() {
        return this.f12324a;
    }

    public float getPreviewZoom() {
        return this.f12326b;
    }

    public int getStreamerType() {
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            return sinkBase.getStreamerType();
        }
        return 0;
    }

    public VideoQuality getVideoQuality() {
        n8c.c("streamerCameraProducer", "getVideoQuality: width" + this.f12342j.resX + ";heigh:" + this.f12342j.resY);
        return this.f12342j;
    }

    public Object getWriter() {
        return this.f12361r1;
    }

    /* JADX INFO: renamed from: h1 */
    public void m11176h1() {
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        if (m11153W0() && this.f12360r.isPlaying()) {
            this.f12360r.pause();
            this.f12346k1 = 4;
        }
    }

    /* JADX INFO: renamed from: h2 */
    public synchronized void m11177h2(long j) {
        AidSource aidSource;
        n8c.c("streamerCameraProducer", "stopPublishHelp(S): label [" + j + "]");
        Map map = this.f12369v1;
        if (map != null && map.containsKey(Long.valueOf(j)) && (aidSource = (AidSource) this.f12369v1.get(Long.valueOf(j))) != null) {
            this.f12369v1.remove(Long.valueOf(j));
            aidSource.m10691u2(1);
            n8c.c("streamerCameraProducer", "stopPublishHelp: remove [" + j + "]");
        }
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m11178i1() {
        SourceBase sourceBase = this.f12352n1;
        if (sourceBase != null && !sourceBase.mo10761p()) {
            n8c.c("streamerCameraProducer", "zjlfound prepare fail");
            return false;
        }
        n8c.c("streamerCameraProducer", "----zjlfound prepare：bitrate=" + this.f12342j.bitrate);
        this.f12261C.setAudioSource(this.f12376z);
        this.f12261C.setVideoSource(this.f12374y);
        this.f12261C.setAudioEncoder(3);
        this.f12261C.setVideoEncoder(2);
        n8c.c("streamerCameraProducer", "----prepare call setVideoFrameRate: mVideoQuality.bitrate=" + this.f12342j.bitrate);
        this.f12261C.setVideoFrameRate(this.f12342j.framerate);
        this.f12261C.setVideoEncodingBitRate(this.f12342j.bitrate);
        this.f12261C.setAudioEncodingBitRate(this.f12338h.bitRate);
        this.f12261C.setAudioSamplingRate(this.f12338h.samplingRate);
        ijkMediaStreamer ijkmediastreamer = this.f12261C;
        VideoQuality videoQuality = this.f12342j;
        ijkmediastreamer.setVideoSize(videoQuality.resX, videoQuality.resY);
        byte b = this.f12347l;
        ijkMediaStreamer ijkmediastreamer2 = this.f12261C;
        if (b == 5) {
            ijkmediastreamer2.setMediaCodecEnable(true);
        } else {
            ijkmediastreamer2.setMediaCodecEnable(false);
        }
        this.f12261C.setMaxCacheDuration(this.f12281J0);
        this.f12261C.setMinCacheDuration(this.f12284K0);
        this.f12261C.setStreamPixFmt(this.f12317W0.f12110d ? 1L : 0L);
        return this.f12261C.prepare();
    }

    /* JADX INFO: renamed from: i2 */
    public void m11179i2() {
        n8c.c("streamerCameraProducer", "----stopRecording:recording=" + this.f12365t1);
        if (this.f12365t1) {
            this.f12365t1 = false;
            audioSource audiosource = this.f12357p1;
            if (audiosource != null) {
                audiosource.m10810b(this.f12282J1);
            }
            m11181j2();
            m11175g2();
            m11169d2();
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m11180j1(byte[] bArr, int i, long j) {
        synchronized (this.f12265E) {
            try {
                this.f12356p0 = true;
                audioSource audiosource = this.f12357p1;
                if (audiosource != null) {
                    audiosource.m10810b(this.f12282J1);
                }
                if (this.f12298P != null) {
                    n8c.c("streamerCameraProducer", "mqbuffer;lens:" + i + ";timestamp:" + j);
                    m11172e2();
                    this.f12298P.clear();
                    if (this.f12282J1 != null) {
                        this.f12282J1.onPcmDateCallback(bArr, i, System.nanoTime() / 1000);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j2 */
    public void m11181j2() {
        this.f12366u = 0;
        this.f12368v = 0;
        MomoSurface momoSurface = this.f12317W0;
        if (momoSurface != null) {
            momoSurface.m10914E0();
            this.f12317W0.m10915G0();
        }
        n8c.c("streamerCameraProducer", "stopRecording mMode:" + ((int) this.f12347l));
        if (this.f12333e1 != null) {
            try {
                this.f12290M0 = false;
                this.f12333e1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f12333e1 = null;
        }
        n8c.c("streamerCameraProducer", "stopRecording mVideoRecordThread stoped mThread:");
        MediaCodecVideoMux mediaCodecVideoMux = this.f12319X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.stop();
            this.f12319X0 = null;
        }
        this.f12325a1 = -1L;
        this.f12353o = null;
        n8c.c("streamerCameraProducer", "stopRecording videoMux stoped ");
    }

    /* JADX INFO: renamed from: k2 */
    public void m11182k2() {
        try {
            Context context = this.f12259B;
            if (context != null) {
                HeadsetPlugReceiver headsetPlugReceiver = this.f12341i1;
                if (headsetPlugReceiver != null) {
                    context.unregisterReceiver(headsetPlugReceiver);
                    this.f12341i1.m11220a();
                    this.f12341i1 = null;
                }
                BlueConnectStateBroadcastReceiver blueConnectStateBroadcastReceiver = this.f12343j1;
                if (blueConnectStateBroadcastReceiver != null) {
                    this.f12259B.unregisterReceiver(blueConnectStateBroadcastReceiver);
                    this.f12343j1.m11219a();
                    this.f12343j1 = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m11183l1(long j) {
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        if (!m11153W0()) {
            this.f12348l1 = j;
        } else {
            this.f12360r.seekTo(j);
            this.f12348l1 = 0L;
        }
    }

    /* JADX INFO: renamed from: l2 */
    public void m11184l2(SinkBase sinkBase) {
        this.f12363s1 = sinkBase;
        if (this.f12363s1 != null && this.f12279I1 == null) {
            this.f12279I1 = this.f12285K1;
            m11172e2();
            removePcmDataCallback(this.f12279I1);
            setPcmDataCallback(this.f12279I1);
            AudioProcess audioProcess = this.f12298P;
            if (audioProcess != null) {
                audioProcess.clear();
            }
            this.f12363s1.setPcmDataCallback(this.f12279I1);
        }
        if (this.f12363s1 == null) {
            if (this.f12279I1 != null) {
                removePcmDataCallback(this.f12279I1);
                m11152V1();
            }
            m11169d2();
            this.f12279I1 = null;
        }
        if (this.f12363s1 != null) {
            this.f12363s1.setHeadsetStatus(this.f12375y1);
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m11185m1(VideoQuality videoQuality) {
        n8c.c("streamerCameraProducer", "setAttachedVideoQuality: width");
        if (videoQuality != null) {
            this.f12344k = videoQuality;
        }
        MomoSurface momoSurface = this.f12317W0;
        if (momoSurface != null) {
            momoSurface.m10932X(videoQuality);
        }
    }

    /* JADX INFO: renamed from: m2 */
    public void m11186m2(Bitmap bitmap, int i, int i2, int i3) {
        SourceBase sourceBase = this.f12352n1;
        if (sourceBase != null) {
            sourceBase.mo10790Q(bitmap, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m11187n0(Object obj) {
        MomoSurface momoSurface = this.f12317W0;
        if (momoSurface != null) {
            momoSurface.m10928U(obj);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m11188n1(int i) {
        this.f12338h.channelNum = i;
    }

    /* JADX INFO: renamed from: n2 */
    public void m11189n2(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f12317W0;
            if (momoSurface != null) {
                momoSurface.m10950i1(j, surfaceTexture, i, bitmap);
                return;
            }
            return;
        }
        Map map = this.f12369v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f12369v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m10684B2(j, surfaceTexture, i, bitmap);
    }

    public void notify(int i, int i2, int i3, Object obj) {
        SinkBase sinkBase;
        if (i == 300 && (sinkBase = this.f12361r1) != null) {
            if (sinkBase.getErrorCode() == 300) {
                return;
            } else {
                this.f12361r1.setErrorCode(HttpStatus.MULTIPLE_CHOICES_300);
            }
        }
        ijkMediaStreamer ijkmediastreamer = this.f12261C;
        if (ijkmediastreamer != null) {
            ijkMediaStreamer.postEventFromStreamPro(ijkmediastreamer, i, i2, i3, obj);
        }
    }

    public void notifyAdjustAef(int i, boolean z) {
        this.f12307S = i;
        this.f12310T = z;
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.adjustAef(i, z);
        }
    }

    public void notifyAdjustEQ(int i, boolean z) {
        this.f12301Q = i;
        this.f12304R = z;
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.adjustEQ(i, z);
        }
    }

    public void notifyAdjustEf(int i, int i2) {
        this.f12312U = i;
        this.f12314V = i2;
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.adjustEf(i, i2);
        }
    }

    public void notifyAdjustTune(int i, boolean z) {
        this.f12322Z = i;
        this.f12345k0 = z;
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.adjustTune(i, z);
        }
    }

    public void notifyEffectReset() {
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset();
        }
    }

    public void notifyEffectSet(int i, int i2, float f) {
        this.f12316W = i;
        this.f12318X = i2;
        this.f12320Y = f;
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet(i, i2, f);
        }
    }

    public void notifyEnableExtralAudio(boolean z) {
    }

    public void notifyExtralAudioLoss() {
        n8c.c("streamerCameraProducer", "sabineAudioSource notifyExtralAudioLoss");
        if (this.f12357p1 == null || this.f12359q1 == 1) {
            return;
        }
        this.f12359q1 = 1;
        this.f12357p1.m10810b(this.f12282J1);
        if (this.f12365t1) {
            m11068Z1();
        }
        if (getExternAudioDevStatusCallback() != null) {
            getExternAudioDevStatusCallback().onAudioDevStatusNotify(0);
        }
    }

    public void notifyExtralAudioReady() {
        n8c.c("streamerCameraProducer", "sabineAudioSource notifyExtralAudioReady");
        if (this.f12357p1 == null || this.f12359q1 == 2) {
            return;
        }
        if (this.f12365t1) {
            this.f12309S1.post(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.11
                @Override // java.lang.Runnable
                public void run() {
                    StreamProducer.this.f12357p1.mo10812d();
                    StreamProducer.this.f12357p1.m10810b(StreamProducer.this.f12282J1);
                    StreamProducer.this.f12357p1.m10811c(StreamProducer.this.f12282J1);
                    StreamProducer.this.m11053M1();
                }
            });
        }
        if (getExternAudioDevStatusCallback() != null) {
            getExternAudioDevStatusCallback().onAudioDevStatusNotify(1);
        }
        this.f12359q1 = 2;
    }

    public void notifyRecording() {
        n8c.c("streamerCameraProducer", "----notifyRecording: call startRecording()");
        m11163b2();
    }

    public void notifyResumeRecording() {
        n8c.c("streamerCameraProducer", "----notifyResumeRecording:recording=" + this.f12365t1 + ",old[" + this.f12366u + "," + this.f12368v + "], new[" + this.f12342j.resX + "," + this.f12342j.resY + "]");
        if (this.f12365t1) {
            int i = this.f12366u;
            VideoQuality videoQuality = this.f12342j;
            if (i == videoQuality.resX && this.f12368v == videoQuality.resY) {
                return;
            }
            m11181j2();
            m11166c2();
        }
    }

    public void notifyUpdateResolution() {
        SourceBase sourceBase = this.f12352n1;
        if (sourceBase != null && sourceBase.mo10759n() != null) {
            this.f12342j.resY = this.f12352n1.mo10759n().resY;
            this.f12342j.resX = this.f12352n1.mo10759n().resX;
        }
        m11100s2();
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            sinkBase.notifyUpdateResolution();
        }
        if (this.f12363s1 != null) {
            this.f12361r1.notifyUpdateResolution();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m11190o0(MRtcAudioHandler mRtcAudioHandler) {
        audio_Indicator audio_indicator = this.f12273G1;
        if (audio_indicator != null) {
            audio_indicator.addMRtcAudioHandler(mRtcAudioHandler);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m11191o1(int i) {
        this.f12338h.bitRate = i;
    }

    /* JADX INFO: renamed from: o2 */
    public void m11192o2(int i) {
        if (i == 0) {
            m11152V1();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public void m11193p1(int i) {
        this.f12338h.samplingRate = i;
    }

    /* JADX INFO: renamed from: p2 */
    public void m11194p2(VideoQuality videoQuality) {
        this.f12342j = videoQuality;
        m11100s2();
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            sinkBase.notifyUpdateResolution();
        }
        if (this.f12363s1 != null) {
            this.f12361r1.notifyUpdateResolution();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public long m11195q0(long j) {
        AidSource aidSource;
        Map map = this.f12369v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f12369v1.get(Long.valueOf(j))) == null) {
            return 0L;
        }
        return aidSource.m10687p2();
    }

    /* JADX INFO: renamed from: q1 */
    public void m11196q1(int i) {
        this.f12376z = i;
    }

    /* JADX INFO: renamed from: q2 */
    public void m11197q2(SinkBase sinkBase) {
        this.f12361r1 = sinkBase;
        MediaCodecVideoMux mediaCodecVideoMux = this.f12319X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.m10620m(sinkBase);
        }
        MediaCodecAudioMux mediaCodecAudioMux = this.f12323Z0;
        if (mediaCodecAudioMux != null) {
            mediaCodecAudioMux.m10620m(this.f12361r1);
        }
        SinkBase sinkBase2 = this.f12361r1;
        if (sinkBase2 != null) {
            sinkBase2.setHeadsetStatus(this.f12375y1);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public long m11198r0(long j) {
        AidSource aidSource;
        Map map = this.f12369v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f12369v1.get(Long.valueOf(j))) == null) {
            return 0L;
        }
        return aidSource.getDuration();
    }

    /* JADX INFO: renamed from: r1 */
    public void m11199r1(int i) {
    }

    /* JADX INFO: renamed from: r2 */
    public void m11200r2(Activity activity, SourceBase sourceBase) {
        n8c.c("streamerCameraProducer", "----updateVideoSource(S):" + this.f12352n1);
        this.f12257A = activity;
        SourceBase sourceBase2 = this.f12352n1;
        if (sourceBase2 != null) {
            sourceBase2.mo10762q();
        }
        this.f12352n1 = sourceBase;
        n8c.c("streamerCameraProducer", "----updateVideoSource(E):" + this.f12352n1);
    }

    public void release() {
        n8c.c("streamerCameraProducer", "mCamera.release begin");
        super.release();
        if (this.f12352n1 != null) {
            this.f12352n1 = null;
        }
        if (this.f12361r1 != null) {
            this.f12361r1 = null;
        }
        audio_Indicator audio_indicator = this.f12273G1;
        if (audio_indicator != null) {
            audio_indicator.release();
            this.f12273G1 = null;
        }
        m11102t0();
        HandlerThread handlerThread = this.f12270F1;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f12270F1 = null;
        this.f12267E1 = null;
        audioSource audiosource = this.f12357p1;
        if (audiosource != null) {
            audiosource.m10810b(this.f12282J1);
            this.f12357p1.m10809a();
            this.f12357p1 = null;
        }
        m11182k2();
        m11181j2();
        m11175g2();
        m11169d2();
        m11161b();
        this.f12341i1 = null;
        this.f12343j1 = null;
        this.f12263D = null;
        stopSurroundMusic();
        this.f12277I = null;
        n8c.c("streamerCameraProducer", "mCamera.release end");
        this.f12257A = null;
        this.f12261C = null;
        try {
            Surface surface = this.f12302Q0;
            if (surface != null) {
                surface.release();
            }
        } catch (Exception unused) {
        }
        try {
            Surface surface2 = this.f12305R0;
            if (surface2 != null) {
                surface2.release();
            }
        } catch (Exception unused2) {
        }
        this.f12302Q0 = null;
        this.f12305R0 = null;
        Map map = this.f12369v1;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Long l2 = (Long) ((Map.Entry) it.next()).getKey();
                AidSource aidSource = (AidSource) this.f12369v1.get(l2);
                if (aidSource != null) {
                    aidSource.m10691u2(1);
                }
                this.f12369v1.remove(l2);
            }
            this.f12369v1.clear();
        }
        this.f12259B = null;
    }

    /* JADX INFO: renamed from: s0 */
    public void m11201s0(long j, long j2) {
        AidSource aidSource;
        Map map = this.f12369v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f12369v1.get(Long.valueOf(j))) == null) {
            return;
        }
        n8c.c("streamerCameraProducer", "aidSeekTo: [" + j + "], " + j2);
        aidSource.m10692v2(j2);
    }

    /* JADX INFO: renamed from: s1 */
    public void m11202s1(boolean z) {
        this.f12278I0 = z;
    }

    public void setSourceSucess() {
        ijkMediaStreamer ijkmediastreamer = this.f12261C;
        if (ijkmediastreamer != null) {
            ijkmediastreamer.setCameraSuccess();
        }
    }

    public void startSurroundMusic(String str, int i, long j) {
        n8c.c("streamerCameraProducer", "Mediaplayer startSurroundMusic: " + str);
        this.f12367u1 = false;
        this.f12339h1 = str;
        this.f12346k1 = 0;
        IjkMediaPlayer ijkMediaPlayer = this.f12360r;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
            this.f12360r.release();
            this.f12360r = null;
        }
        if (this.f12259B == null || this.f12339h1 == null) {
            return;
        }
        this.f12348l1 = j;
        try {
            IjkMediaPlayer ijkMediaPlayer2 = new IjkMediaPlayer(this.f12259B);
            this.f12360r = ijkMediaPlayer2;
            ijkMediaPlayer2.setOnPreparedListener(this.f12288L1);
            this.f12360r.setOnCompletionListener(this.f12291M1);
            this.f12360r.setOnErrorListener(this.f12294N1);
            this.f12360r.setOnBufferingUpdateListener(this.f12297O1);
            this.f12360r.setOnInfoListener(this.f12300P1);
            this.f12360r.setOnSeekCompleteListener(this.f12303Q1);
            if (this.f12375y1 || this.f12261C.getStreamerType() == 2) {
                this.f12360r.setMediaDataCallback(this.f12306R1);
            }
            this.f12360r.setDataSource(this.f12339h1.toString());
            this.f12360r.setMediaDateCallbackFlags(1);
            int streamerType = this.f12261C.getStreamerType();
            IjkMediaPlayer ijkMediaPlayer3 = this.f12360r;
            if (streamerType != 0) {
                ijkMediaPlayer3.setPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_SPLIT_AUDIO_CHANNEL_FRQ, 44100L);
            } else {
                ijkMediaPlayer3.setPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_SPLIT_AUDIO_CHANNEL_FRQ, 44100L);
            }
            this.f12360r.setPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_SPLIT_AUDIO_CHANNELS, 2L);
            this.f12360r.setPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_SPLIT_AUDIO_CHANNEL_LAYOUT, 3L);
            this.f12360r.prepareAsync();
            this.f12346k1 = 1;
        } catch (IOException e) {
            n8c.d("streamerCameraProducer", "Mediaplayer Unable to open content: " + this.f12339h1, e);
            this.f12346k1 = -1;
        } catch (IllegalArgumentException e2) {
            n8c.d("streamerCameraProducer", "Mediaplayer Unable to open content: " + this.f12339h1, e2);
            this.f12346k1 = -1;
        }
    }

    public void stopSurroundMusic() {
        IjkMediaPlayer ijkMediaPlayer = this.f12360r;
        if (ijkMediaPlayer != null) {
            this.f12367u1 = false;
            ijkMediaPlayer.setMediaDataCallback(null);
            this.f12360r.setOnPreparedListener(null);
            this.f12360r.setOnCompletionListener(null);
            this.f12360r.setOnErrorListener(null);
            this.f12360r.setOnBufferingUpdateListener(null);
            this.f12360r.setOnInfoListener(null);
            this.f12360r.setOnSeekCompleteListener(null);
            this.f12360r.stop();
            this.f12360r.release();
            this.f12346k1 = 0;
            this.f12360r = null;
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m11203t1(int i, int i2) {
        this.f12349m = i;
        this.f12351n = i2;
        if (i2 < 0 || i2 > 3) {
            this.f12351n = 0;
        }
        if (i < 0 || i > 3) {
            this.f12349m = 0;
        }
        n8c.c("streamerCameraProducer", "after setCameraRotation mFrontCameraRotation:" + this.f12349m + ";mBackCameraRotation:" + this.f12351n);
    }

    /* JADX INFO: renamed from: t2 */
    public void m11204t2(byte[] bArr, int i) {
        if (this.f12375y1 && this.f12264D1 && !this.f12329c1) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            synchronized (this.f12276H1) {
                try {
                    NonBlockingAudioTrack nonBlockingAudioTrack = this.f12262C1;
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
    public void m11205u0(int i, int i2) {
        audio_Indicator audio_indicator = this.f12273G1;
        if (audio_indicator != null) {
            audio_indicator.enableAudioVolumeIndication(i, i2);
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m11206u1(boolean z) {
    }

    /* JADX INFO: renamed from: v1 */
    public void m11207v1(float f) {
        this.f12269F0 = f;
        AudioProcess audioProcess = this.f12298P;
        if (audioProcess != null) {
            audioProcess.setMasterAudioLevel(f);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m11208w1(long j) {
        this.f12281J0 = j;
        if (j <= 0) {
            this.f12281J0 = 6000L;
        }
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    /* JADX INFO: renamed from: x0 */
    public void m11209x0() throws IOException, RuntimeException {
        n8c.c("streamerCameraProducer", "Video encoded using the MediaCodec API with a surface mVideoQuality.framerate" + this.f12377z1);
        if (this.f12353o != null) {
            return;
        }
        this.f12353o = MediaCodec.createByCodecName(uze.b("video/avc").getName());
        m11100s2();
        VideoQuality videoQuality = this.f12342j;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", videoQuality.resX, videoQuality.resY);
        mediaFormatCreateVideoFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, this.f12342j.bitrate);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f12377z1);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec mediaCodec = this.f12353o;
        if (mediaCodec == null) {
            notify(HttpStatus.MULTIPLE_CHOICES_300, -303, 2, null);
            return;
        }
        mediaCodec.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f12302Q0 = this.f12353o.createInputSurface();
        this.f12353o.start();
        VideoQuality videoQuality2 = this.f12342j;
        this.f12366u = videoQuality2.resX;
        this.f12368v = videoQuality2.resY;
        this.f12370w = videoQuality2.bitrate;
        this.f12372x = this.f12377z1;
        n8c.c("streamerCameraProducer", "-------recording:resolution(" + this.f12342j.resX + "," + this.f12342j.resY + "),bitrate=" + this.f12342j.bitrate + ", framerate=" + this.f12377z1);
        AudioRecordRunnable audioRecordRunnable = this.f12327b1;
        if (audioRecordRunnable != null) {
            audioRecordRunnable.m11217b(this.f12302Q0);
            this.f12327b1.m11216a(this.f12298P);
        } else {
            MomoSurface momoSurface = this.f12317W0;
            if (momoSurface != null) {
                momoSurface.m10936Z(this.f12302Q0);
            }
        }
        SinkBase sinkBase = this.f12361r1;
        if (sinkBase != null) {
            sinkBase.setErrorCode(0);
        }
        MediaCodecVideoMux mediaCodecVideoMux = new MediaCodecVideoMux(this.f12353o, this.f12361r1);
        this.f12319X0 = mediaCodecVideoMux;
        mediaCodecVideoMux.m10619l();
        this.f12319X0.m10611d(this.f12342j.bitrate);
        this.f12319X0.m10612e(this.f12278I0);
        this.f12319X0.m10618k(this.f12332e);
        long j = this.f12325a1;
        if (j != -1) {
            this.f12319X0.m10614g(j);
        }
        this.f12319X0.m10613f(new MuxBase.EncoderFrameRateUpdataListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.12
        });
        this.f12319X0.m10615h(new PacketBufferlingStatusListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.13
            @Override // tv.danmaku.ijk.media.streamer.StreamProducer.PacketBufferlingStatusListener
            /* JADX INFO: renamed from: a */
            public void mo11215a(int i, long j2) {
                n8c.c("streamerCameraProducer", "videoMux PacketBufferlingStatusUpdata: " + i + ";duration:" + j2);
                StreamProducer streamProducer = StreamProducer.this;
                if (streamProducer.f12261C == null || i != 104) {
                    return;
                }
                long j3 = streamProducer.f12287L0;
                StreamProducer streamProducer2 = StreamProducer.this;
                if (j2 < j3) {
                    if (streamProducer2.f12330d || !StreamProducer.this.f12328c) {
                        return;
                    }
                    StreamProducer.this.notify(CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA256, (int) j2, 0, null);
                    StreamProducer.this.f12330d = true;
                    StreamProducer.this.f12328c = false;
                    return;
                }
                if (streamProducer2.f12328c || !StreamProducer.this.f12330d) {
                    return;
                }
                StreamProducer.this.notify(103, (int) j2, 0, null);
                StreamProducer.this.f12328c = true;
                StreamProducer.this.f12330d = false;
                StreamProducer.m11042C(StreamProducer.this);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public int m11210x1(int i) {
        this.f12371w1 = i;
        return i;
    }

    /* JADX INFO: renamed from: y0 */
    public VideoQuality m11211y0() {
        n8c.c("streamerCameraProducer", "getVideoQuality: width" + this.f12344k.resX + ";heigh:" + this.f12344k.resY);
        return this.f12344k;
    }

    /* JADX INFO: renamed from: y1 */
    public void m11212y1(boolean z) {
        byte b = f12256T1;
        if (b == 1 || !z) {
            this.f12347l = (byte) 1;
        } else {
            this.f12347l = b;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public int m11213z0() {
        return this.f12344k.bitrate;
    }

    /* JADX INFO: renamed from: z1 */
    public void m11214z1(long j) {
        this.f12284K0 = j;
        if (j <= 0) {
            this.f12284K0 = 1000L;
        }
    }
}
