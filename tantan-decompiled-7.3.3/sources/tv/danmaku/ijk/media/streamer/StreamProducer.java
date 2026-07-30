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
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p153l.ebl0;
import p153l.jj5;
import p153l.oxd0;
import p153l.t9c;
import p153l.y0f;
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
    private static byte f209553T1;

    /* JADX INFO: renamed from: A */
    Activity f209554A;

    /* JADX INFO: renamed from: A1 */
    private boolean f209555A1;

    /* JADX INFO: renamed from: B */
    Context f209556B;

    /* JADX INFO: renamed from: B1 */
    private int f209557B1;

    /* JADX INFO: renamed from: C */
    public ijkMediaStreamer f209558C;

    /* JADX INFO: renamed from: C1 */
    private NonBlockingAudioTrack f209559C1;

    /* JADX INFO: renamed from: D */
    IntentFilter f209560D;

    /* JADX INFO: renamed from: D1 */
    private boolean f209561D1;

    /* JADX INFO: renamed from: E */
    private Object f209562E;

    /* JADX INFO: renamed from: E0 */
    private long f209563E0;

    /* JADX INFO: renamed from: E1 */
    private Handler f209564E1;

    /* JADX INFO: renamed from: F */
    private Object f209565F;

    /* JADX INFO: renamed from: F0 */
    private float f209566F0;

    /* JADX INFO: renamed from: F1 */
    private HandlerThread f209567F1;

    /* JADX INFO: renamed from: G */
    int f209568G;

    /* JADX INFO: renamed from: G0 */
    private float f209569G0;

    /* JADX INFO: renamed from: G1 */
    private audio_Indicator f209570G1;

    /* JADX INFO: renamed from: H */
    private int f209571H;

    /* JADX INFO: renamed from: H0 */
    private boolean f209572H0;

    /* JADX INFO: renamed from: H1 */
    private Object f209573H1;

    /* JADX INFO: renamed from: I */
    private ByteBuffer f209574I;

    /* JADX INFO: renamed from: I0 */
    private boolean f209575I0;

    /* JADX INFO: renamed from: I1 */
    private volatile SinkBase.PcmDateCallback f209576I1;

    /* JADX INFO: renamed from: J */
    private ByteBuffer f209577J;

    /* JADX INFO: renamed from: J0 */
    private long f209578J0;

    /* JADX INFO: renamed from: J1 */
    private volatile SinkBase.ExtPcmDateCallback f209579J1;

    /* JADX INFO: renamed from: K */
    private ByteBuffer f209580K;

    /* JADX INFO: renamed from: K0 */
    private long f209581K0;

    /* JADX INFO: renamed from: K1 */
    private volatile SinkBase.PcmDateCallback f209582K1;

    /* JADX INFO: renamed from: L */
    private int f209583L;

    /* JADX INFO: renamed from: L0 */
    private long f209584L0;

    /* JADX INFO: renamed from: L1 */
    IMediaPlayer.OnPreparedListener f209585L1;

    /* JADX INFO: renamed from: M */
    private int f209586M;

    /* JADX INFO: renamed from: M0 */
    private volatile boolean f209587M0;

    /* JADX INFO: renamed from: M1 */
    private IMediaPlayer.OnCompletionListener f209588M1;

    /* JADX INFO: renamed from: N */
    private int f209589N;

    /* JADX INFO: renamed from: N0 */
    private volatile boolean f209590N0;

    /* JADX INFO: renamed from: N1 */
    private IMediaPlayer.OnErrorListener f209591N1;

    /* JADX INFO: renamed from: O */
    private ByteBuffer[] f209592O;

    /* JADX INFO: renamed from: O0 */
    private volatile boolean f209593O0;

    /* JADX INFO: renamed from: O1 */
    private IMediaPlayer.OnBufferingUpdateListener f209594O1;

    /* JADX INFO: renamed from: P */
    private AudioProcess f209595P;

    /* JADX INFO: renamed from: P0 */
    private AudioRecord f209596P0;

    /* JADX INFO: renamed from: P1 */
    private IMediaPlayer.OnInfoListener f209597P1;

    /* JADX INFO: renamed from: Q */
    private int f209598Q;

    /* JADX INFO: renamed from: Q0 */
    private Surface f209599Q0;

    /* JADX INFO: renamed from: Q1 */
    private IMediaPlayer.OnSeekCompleteListener f209600Q1;

    /* JADX INFO: renamed from: R */
    private boolean f209601R;

    /* JADX INFO: renamed from: R0 */
    private Surface f209602R0;

    /* JADX INFO: renamed from: R1 */
    private IjkMediaPlayer.MediaDateCallback f209603R1;

    /* JADX INFO: renamed from: S */
    private int f209604S;

    /* JADX INFO: renamed from: S0 */
    private volatile long f209605S0;

    /* JADX INFO: renamed from: S1 */
    private Handler f209606S1;

    /* JADX INFO: renamed from: T */
    private boolean f209607T;

    /* JADX INFO: renamed from: T0 */
    private volatile long f209608T0;

    /* JADX INFO: renamed from: U */
    private int f209609U;

    /* JADX INFO: renamed from: U0 */
    private byte[] f209610U0;

    /* JADX INFO: renamed from: V */
    private int f209611V;

    /* JADX INFO: renamed from: V0 */
    private byte[] f209612V0;

    /* JADX INFO: renamed from: W */
    private int f209613W;

    /* JADX INFO: renamed from: W0 */
    private MomoSurface f209614W0;

    /* JADX INFO: renamed from: X */
    private int f209615X;

    /* JADX INFO: renamed from: X0 */
    private MediaCodecVideoMux f209616X0;

    /* JADX INFO: renamed from: Y */
    private float f209617Y;

    /* JADX INFO: renamed from: Y0 */
    private MediaCodecVideoMux f209618Y0;

    /* JADX INFO: renamed from: Z */
    private int f209619Z;

    /* JADX INFO: renamed from: Z0 */
    private MediaCodecAudioMux f209620Z0;

    /* JADX INFO: renamed from: a1 */
    private long f209622a1;

    /* JADX INFO: renamed from: b1 */
    protected AudioRecordRunnable f209624b1;

    /* JADX INFO: renamed from: c1 */
    private boolean f209626c1;

    /* JADX INFO: renamed from: d1 */
    private VideoRecordRunnable f209628d1;

    /* JADX INFO: renamed from: e1 */
    private Thread f209630e1;

    /* JADX INFO: renamed from: f1 */
    private Thread f209632f1;

    /* JADX INFO: renamed from: g */
    protected AudioQuality f209633g;

    /* JADX INFO: renamed from: g1 */
    private Thread f209634g1;

    /* JADX INFO: renamed from: h */
    protected AudioQuality f209635h;

    /* JADX INFO: renamed from: h1 */
    private String f209636h1;

    /* JADX INFO: renamed from: i */
    protected VideoQuality f209637i;

    /* JADX INFO: renamed from: i1 */
    private HeadsetPlugReceiver f209638i1;

    /* JADX INFO: renamed from: j */
    protected VideoQuality f209639j;

    /* JADX INFO: renamed from: j1 */
    private BlueConnectStateBroadcastReceiver f209640j1;

    /* JADX INFO: renamed from: k */
    protected VideoQuality f209641k;

    /* JADX INFO: renamed from: k0 */
    private boolean f209642k0;

    /* JADX INFO: renamed from: k1 */
    private int f209643k1;

    /* JADX INFO: renamed from: l */
    protected byte f209644l;

    /* JADX INFO: renamed from: l1 */
    private long f209645l1;

    /* JADX INFO: renamed from: m */
    protected int f209646m;

    /* JADX INFO: renamed from: m1 */
    protected ijkMediaStreamer.OnSurroundMusicStatusListener f209647m1;

    /* JADX INFO: renamed from: n */
    protected int f209648n;

    /* JADX INFO: renamed from: n1 */
    private SourceBase f209649n1;

    /* JADX INFO: renamed from: o */
    protected MediaCodec f209650o;

    /* JADX INFO: renamed from: o1 */
    private audioSource f209651o1;

    /* JADX INFO: renamed from: p */
    protected MediaCodec f209652p;

    /* JADX INFO: renamed from: p0 */
    private boolean f209653p0;

    /* JADX INFO: renamed from: p1 */
    private audioSource f209654p1;

    /* JADX INFO: renamed from: q */
    protected MediaCodec f209655q;

    /* JADX INFO: renamed from: q1 */
    private volatile int f209656q1;

    /* JADX INFO: renamed from: r */
    IjkMediaPlayer f209657r;

    /* JADX INFO: renamed from: r1 */
    private SinkBase f209658r1;

    /* JADX INFO: renamed from: s */
    ByteBuffer f209659s;

    /* JADX INFO: renamed from: s1 */
    private volatile SinkBase f209660s1;

    /* JADX INFO: renamed from: t */
    ByteBuffer[] f209661t;

    /* JADX INFO: renamed from: t1 */
    private boolean f209662t1;

    /* JADX INFO: renamed from: u */
    private int f209663u;

    /* JADX INFO: renamed from: u1 */
    private boolean f209664u1;

    /* JADX INFO: renamed from: v */
    private int f209665v;

    /* JADX INFO: renamed from: v1 */
    private Map f209666v1;

    /* JADX INFO: renamed from: w */
    private int f209667w;

    /* JADX INFO: renamed from: w1 */
    private int f209668w1;

    /* JADX INFO: renamed from: x */
    private int f209669x;

    /* JADX INFO: renamed from: x1 */
    private ijkMediaStreamer.OnWiredHeadsetStatusListener f209670x1;

    /* JADX INFO: renamed from: y */
    private int f209671y;

    /* JADX INFO: renamed from: y1 */
    private boolean f209672y1;

    /* JADX INFO: renamed from: z */
    private int f209673z;

    /* JADX INFO: renamed from: z1 */
    private int f209674z1;

    /* JADX INFO: renamed from: a */
    private PointF f209621a = new PointF(16.0f, 9.0f);

    /* JADX INFO: renamed from: b */
    private float f209623b = 1.0f;

    /* JADX INFO: renamed from: c */
    private boolean f209625c = false;

    /* JADX INFO: renamed from: d */
    private boolean f209627d = true;

    /* JADX INFO: renamed from: e */
    private String f209629e = WeJson.EMPTY_MAP;

    /* JADX INFO: renamed from: f */
    private final int f209631f = -12345;

    public class AudioEncoderRunnable implements Runnable {
        private AudioEncoderRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oxd0 oxd0VarTake;
            if (StreamProducer.this.f209595P != null) {
                StreamProducer.this.f209595P.clear();
            }
            StreamProducer.this.f209593O0 = true;
            long j = 0;
            loop0: while (true) {
                oxd0VarTake = null;
                while (true) {
                    if (Thread.interrupted() || !StreamProducer.this.f209593O0 || StreamProducer.this.f209595P == null) {
                        break loop0;
                    }
                    t9c.m189745c("streamerCameraProducer", "mAudioProcess.take over" + ((int) StreamProducer.this.f209644l));
                    try {
                        StreamProducer streamProducer = StreamProducer.this;
                        if (streamProducer.f209644l != 1) {
                            oxd0VarTake = streamProducer.f209595P.take();
                            if (oxd0VarTake != null) {
                                break;
                            }
                        } else {
                            int i = 2048;
                            if (streamProducer.f209659s == null) {
                                streamProducer.f209659s = ByteBuffer.allocateDirect(2048);
                            }
                            StreamProducer.this.f209659s.position(0);
                            while (i >= StreamProducer.this.f209571H) {
                                t9c.m189745c("streamerCameraProducer", "soft loop pos" + i);
                                oxd0VarTake = StreamProducer.this.f209595P.take();
                                if (oxd0VarTake != null) {
                                    StreamProducer.this.f209659s.put(oxd0VarTake.m169686b());
                                }
                                i -= StreamProducer.this.f209571H;
                            }
                            j += 2048;
                            long jM224043b = Util.m224043b(j);
                            if (StreamProducer.this.f209658r1 != null) {
                                ByteBuffer byteBuffer = StreamProducer.this.f209659s;
                                StreamProducer.this.f209658r1.writeAudio(jM224043b / 1000, byteBuffer, byteBuffer.limit());
                            }
                        }
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }
                }
                int iDequeueInputBuffer = StreamProducer.this.f209655q.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    if (StreamProducer.this.f209576I1 == null || !StreamProducer.this.f209653p0) {
                        StreamProducer.this.postPcmData(0L, oxd0VarTake.f149639b.array(), 44100, false);
                        StreamProducer.this.postRecordFrame(oxd0VarTake.f149639b.array(), 44100, false);
                    }
                    if (oxd0VarTake.f149639b != null) {
                        StreamProducer.this.f209592O[iDequeueInputBuffer].put(oxd0VarTake.f149639b);
                        StreamProducer.this.f209592O[iDequeueInputBuffer].flip();
                    }
                    if (StreamProducer.this.f209605S0 == 0) {
                        StreamProducer.this.f209605S0 = System.nanoTime() / 1000;
                    } else {
                        System.nanoTime();
                        long unused = StreamProducer.this.f209605S0;
                    }
                    t9c.m189745c("streamerCameraProducer", "mAudioCodec.queueInputBuffer bufferIndex" + iDequeueInputBuffer + "mMediaCodecInputBuffers:" + StreamProducer.this.f209592O[iDequeueInputBuffer]);
                    int iLimit = oxd0VarTake.f149639b.limit();
                    StreamProducer.this.f209655q.queueInputBuffer(iDequeueInputBuffer, 0, iLimit, oxd0VarTake.m169688d(), 0);
                    j += (long) iLimit;
                } else {
                    t9c.m189745c("streamerCameraProducer", "zjl found mAudioCodec no input buffer");
                }
                oxd0VarTake.m169690f();
            }
            if (oxd0VarTake != null) {
                oxd0VarTake.m169690f();
            }
            if (StreamProducer.this.f209595P != null) {
                StreamProducer.this.f209595P.clear();
            }
            StreamProducer.this.f209659s = null;
            t9c.m189745c("streamerCameraProducer", "zjl found Thread 1 over");
        }
    }

    public class AudioRecordRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        int f209690a;

        /* JADX INFO: renamed from: b */
        int f209691b;

        /* JADX INFO: renamed from: c */
        AudioProcess f209692c;

        /* JADX INFO: renamed from: d */
        Surface f209693d;

        /* JADX INFO: renamed from: e */
        private Object f209694e;

        /* JADX INFO: renamed from: f */
        public boolean f209695f;

        private AudioRecordRunnable() {
            this.f209691b = 0;
            this.f209692c = null;
            this.f209693d = null;
            this.f209694e = new Object();
            this.f209695f = false;
            t9c.m189745c("streamerCameraProducer", "new AudioRecordRunnable");
            AudioQuality audioQuality = StreamProducer.this.f209635h;
            int i = audioQuality.samplingRate;
            int i2 = (((i * 120) / 1000) * 32) >> 3;
            int i3 = audioQuality.channelNum == 2 ? 12 : 16;
            int minBufferSize = AudioRecord.getMinBufferSize(i, i3, 2) * 16;
            try {
                StreamProducer.this.f209596P0 = new AudioRecord(1, StreamProducer.this.f209635h.samplingRate, i3, 2, i2 < minBufferSize ? minBufferSize : i2);
            } catch (Exception unused) {
                StreamProducer.this.notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_ILLEGAL_STATE, 3, null);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m223991a(AudioProcess audioProcess) {
            synchronized (this.f209694e) {
                try {
                    this.f209692c = audioProcess;
                    if (audioProcess != null) {
                        audioProcess.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            t9c.m189745c("streamerCameraProducer", "AudioRecordRunnable addAudioProcess");
        }

        /* JADX INFO: renamed from: b */
        public void m223992b(Surface surface) {
            synchronized (this.f209694e) {
                this.f209693d = surface;
            }
            t9c.m189745c("streamerCameraProducer", "AudioRecordRunnable addCodecSurface");
        }

        /* JADX INFO: renamed from: c */
        public void m223993c(boolean z) {
            this.f209695f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            if (StreamProducer.this.f209596P0 != null) {
                while (StreamProducer.this.f209596P0.getState() == 0 && this.f209691b < 5) {
                    try {
                        Thread.sleep(100L);
                        this.f209691b++;
                        t9c.m189745c("streamerCameraProducer", "mAudioRecord.getState " + StreamProducer.this.f209596P0.getState());
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    StreamProducer.this.f209596P0.startRecording();
                } catch (Exception unused2) {
                }
                t9c.m189745c("streamerCameraProducer", "AudioRecordRunnable mAudioCapturing:" + StreamProducer.this.f209590N0);
                while (!Thread.interrupted() && StreamProducer.this.f209590N0) {
                    synchronized (this.f209694e) {
                        try {
                            if (this.f209693d != null && StreamProducer.this.f209614W0 != null) {
                                StreamProducer.this.f209614W0.m223711Z(this.f209693d);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    StreamProducer streamProducer = StreamProducer.this;
                    streamProducer.f209610U0 = new byte[streamProducer.f209571H];
                    t9c.m189745c("streamerCameraProducer", "allocatebuff mAudioFrame" + StreamProducer.this.f209571H);
                    try {
                        try {
                            this.f209690a = StreamProducer.this.f209596P0.read(StreamProducer.this.f209610U0, 0, StreamProducer.this.f209571H);
                            t9c.m189745c("streamerCameraProducer", "this.audioRecord.read size" + this.f209690a);
                            if (this.f209690a > 0) {
                                synchronized (this.f209694e) {
                                    try {
                                        AudioProcess audioProcess = this.f209692c;
                                        if (audioProcess != null) {
                                            StreamProducer.this.f209610U0 = audioProcess.processStereoAudioData(StreamProducer.this.f209610U0, this.f209690a);
                                        }
                                        StreamProducer.this.m223925U0();
                                        StreamProducer streamProducer2 = StreamProducer.this;
                                        streamProducer2.m223979t2(streamProducer2.f209610U0, StreamProducer.this.f209610U0.length);
                                        if (this.f209692c != null && StreamProducer.this.f209660s1 == null) {
                                            boolean z = this.f209695f;
                                            StreamProducer streamProducer3 = StreamProducer.this;
                                            if (!z) {
                                                if (streamProducer3.f209570G1 != null) {
                                                    StreamProducer.this.f209570G1.putAudioData(StreamProducer.this.f209610U0);
                                                }
                                                if (StreamProducer.this.f209593O0) {
                                                    this.f209692c.putAudioData(new oxd0(StreamProducer.this.f209610U0, System.nanoTime() / 1000, StreamProducer.this.f209635h.channelNum));
                                                }
                                            } else if (streamProducer3.f209593O0) {
                                                StreamProducer.this.f209612V0 = new byte[this.f209690a];
                                                this.f209692c.putAudioData(new oxd0(StreamProducer.this.f209612V0, System.nanoTime() / 1000, StreamProducer.this.f209635h.channelNum));
                                            }
                                            StreamProducer.m223846b0(StreamProducer.this);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } else {
                                if (!StreamProducer.this.f209590N0) {
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
                t9c.m189745c("streamerCameraProducer", " AudioRecordRunnable mAudioRecord.stop() and release");
                if (StreamProducer.this.f209614W0 != null) {
                    StreamProducer.this.f209614W0.m223711Z(this.f209693d);
                }
                if (StreamProducer.this.f209596P0 != null) {
                    try {
                        StreamProducer.this.f209596P0.release();
                        StreamProducer.this.f209596P0 = null;
                    } catch (Exception unused4) {
                    }
                }
            }
            StreamProducer.this.f209624b1 = null;
        }
    }

    public class BlueConnectStateBroadcastReceiver extends BroadcastReceiver {
        public BlueConnectStateBroadcastReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m223994a() {
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
                ijkMediaStreamer ijkmediastreamer = StreamProducer.this.f209558C;
                if (ijkmediastreamer != null && ijkmediastreamer.getStreamerType() == 2 && (context2 = StreamProducer.this.f209556B) != null) {
                    ((AudioManager) context2.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(true);
                }
                t9c.m189745c("BlueConnectStateBroadcastReceiver", "STATE_DISCONNECTED");
                if (StreamProducer.this.f209658r1 != null) {
                    StreamProducer.this.f209658r1.setHeadsetStatus(false);
                }
                if (StreamProducer.this.f209660s1 != null) {
                    StreamProducer.this.f209660s1.setHeadsetStatus(false);
                    return;
                }
                return;
            }
            if (intExtra != 2) {
                return;
            }
            ijkMediaStreamer ijkmediastreamer2 = StreamProducer.this.f209558C;
            if (ijkmediastreamer2 != null && ijkmediastreamer2.getStreamerType() == 2 && (context3 = StreamProducer.this.f209556B) != null) {
                ((AudioManager) context3.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(false);
            }
            t9c.m189745c("BlueConnectStateBroadcastReceiver", "STATE_CONNECTED");
            if (StreamProducer.this.f209658r1 != null) {
                StreamProducer.this.f209658r1.setHeadsetStatus(true);
            }
            if (StreamProducer.this.f209660s1 != null) {
                StreamProducer.this.f209660s1.setHeadsetStatus(true);
            }
        }
    }

    public class HeadsetPlugReceiver extends BroadcastReceiver {
        private HeadsetPlugReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m223995a() {
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
                    if (streamProducer.f209657r != null && !streamProducer.f209626c1) {
                        StreamProducer.this.f209657r.setMediaDataCallback(null);
                    }
                    StreamProducer.this.f209672y1 = false;
                    if (StreamProducer.this.f209670x1 != null) {
                        StreamProducer.this.f209670x1.m224082a(StreamProducer.this.f209558C, 1, 0);
                    }
                    StreamProducer.this.m223936b();
                    t9c.m189745c("streamerCameraProducer", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + StreamProducer.this.f209672y1);
                    ijkMediaStreamer ijkmediastreamer = StreamProducer.this.f209558C;
                    if (ijkmediastreamer != null && ijkmediastreamer.getStreamerType() == 2 && (context2 = StreamProducer.this.f209556B) != null) {
                        ((AudioManager) context2.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(true);
                    }
                    if (StreamProducer.this.f209658r1 != null) {
                        StreamProducer.this.f209658r1.setHeadsetStatus(false);
                    }
                    if (StreamProducer.this.f209660s1 != null) {
                        StreamProducer.this.f209660s1.setHeadsetStatus(false);
                    }
                    StreamProducer.this.m223871p0();
                    return;
                }
                if (intent.getIntExtra("state", 0) == 1) {
                    StreamProducer streamProducer2 = StreamProducer.this;
                    IjkMediaPlayer ijkMediaPlayer = streamProducer2.f209657r;
                    if (ijkMediaPlayer != null) {
                        ijkMediaPlayer.setMediaDataCallback(streamProducer2.f209603R1);
                    }
                    StreamProducer.this.f209672y1 = true;
                    if (StreamProducer.this.f209670x1 != null) {
                        StreamProducer.this.f209670x1.m224082a(StreamProducer.this.f209558C, 1, 1);
                    }
                    StreamProducer streamProducer3 = StreamProducer.this;
                    ijkMediaStreamer ijkmediastreamer2 = streamProducer3.f209558C;
                    if (ijkmediastreamer2 != null && streamProducer3.f209556B != null && ijkmediastreamer2.getStreamerType() == 2) {
                        ((AudioManager) StreamProducer.this.f209556B.getApplicationContext().getSystemService("audio")).setSpeakerphoneOn(false);
                    }
                    if (StreamProducer.this.f209658r1 != null) {
                        StreamProducer.this.f209658r1.setHeadsetStatus(true);
                    }
                    if (StreamProducer.this.f209660s1 != null) {
                        StreamProducer.this.f209660s1.setHeadsetStatus(true);
                    }
                    StreamProducer.this.m223871p0();
                    t9c.m189745c("streamerCameraProducer", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + StreamProducer.this.f209672y1);
                }
            }
        }
    }

    public interface PacketBufferlingStatusListener {
        /* JADX INFO: renamed from: a */
        void mo223990a(int i, long j);
    }

    public class VideoRecordRunnable implements Runnable {
        private VideoRecordRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (StreamProducer.this.f209587M0) {
                oxd0 oxd0VarM223718d1 = StreamProducer.this.f209614W0.m223718d1();
                if (oxd0VarM223718d1 != null) {
                    ByteBuffer byteBufferM169686b = oxd0VarM223718d1.m169686b();
                    long jM169688d = oxd0VarM223718d1.m169688d();
                    if (jM169688d == -12345) {
                        return;
                    }
                    StreamProducer streamProducer = StreamProducer.this;
                    MediaCodec mediaCodec = streamProducer.f209650o;
                    long j = 0;
                    if (mediaCodec != null) {
                        try {
                            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                            if (iDequeueInputBuffer >= 0) {
                                int iCapacity = StreamProducer.this.f209661t[iDequeueInputBuffer].capacity() < byteBufferM169686b.limit() ? StreamProducer.this.f209661t[iDequeueInputBuffer].capacity() : byteBufferM169686b.limit();
                                StreamProducer.this.f209661t[iDequeueInputBuffer].clear();
                                byteBufferM169686b.rewind();
                                StreamProducer.this.f209661t[iDequeueInputBuffer].put(byteBufferM169686b);
                                StreamProducer.this.f209650o.queueInputBuffer(iDequeueInputBuffer, 0, iCapacity, jM169688d, 0);
                            } else {
                                t9c.m189745c("streamerCameraProducer", "No buffer available !");
                            }
                        } catch (IllegalStateException unused) {
                        }
                    } else {
                        long j2 = streamProducer.f209608T0;
                        StreamProducer streamProducer2 = StreamProducer.this;
                        if (j2 == 0) {
                            streamProducer2.f209608T0 = jM169688d;
                        } else {
                            j = (jM169688d / 1000) - (streamProducer2.f209608T0 / 1000);
                        }
                        if (StreamProducer.this.f209658r1 != null) {
                            StreamProducer.this.f209658r1.writeVideo(j, byteBufferM169686b, byteBufferM169686b.limit());
                        }
                    }
                }
            }
        }
    }

    static {
        try {
            Class.forName("android.media.MediaCodec");
            t9c.m189745c("streamerCameraProducer", "Phone supports the MediaCoded API");
            f209553T1 = (byte) 5;
            t9c.m189745c("streamerCameraProducer", "Phone supports the MediaCoded v2 API");
        } catch (ClassNotFoundException unused) {
            f209553T1 = (byte) 1;
            t9c.m189745c("streamerCameraProducer", "Phone does not support the MediaCodec API");
        }
    }

    public StreamProducer(Context context, ijkMediaStreamer ijkmediastreamer, MomoSurface momoSurface) {
        AudioQuality audioQualityM225056clone = AudioQuality.DEFAULT_AUDIO_QUALITY.m225056clone();
        this.f209633g = audioQualityM225056clone;
        this.f209635h = audioQualityM225056clone.m225056clone();
        VideoQuality videoQualityM225057clone = VideoQuality.DEFAULT_VIDEO_QUALITY.m225057clone();
        this.f209637i = videoQualityM225057clone;
        this.f209639j = videoQualityM225057clone.m225057clone();
        this.f209641k = this.f209637i.m225057clone();
        this.f209644l = (byte) -1;
        this.f209646m = 0;
        this.f209648n = 0;
        this.f209650o = null;
        this.f209652p = null;
        this.f209655q = null;
        this.f209657r = null;
        this.f209659s = null;
        this.f209661t = null;
        this.f209663u = 0;
        this.f209665v = 0;
        this.f209667w = 0;
        this.f209669x = 0;
        this.f209671y = 1;
        this.f209673z = 1;
        this.f209554A = null;
        this.f209556B = null;
        this.f209558C = null;
        this.f209560D = null;
        this.f209562E = new Object();
        this.f209565F = new Object();
        this.f209568G = 0;
        this.f209571H = 2048;
        this.f209574I = ByteBuffer.allocate(2048);
        this.f209577J = ByteBuffer.allocate(this.f209571H);
        this.f209580K = ByteBuffer.allocate(this.f209571H);
        this.f209583L = 0;
        this.f209586M = 0;
        this.f209589N = 0;
        this.f209592O = null;
        this.f209598Q = 0;
        this.f209601R = false;
        this.f209604S = 0;
        this.f209607T = false;
        this.f209609U = -1;
        this.f209611V = 0;
        this.f209613W = -1;
        this.f209615X = 0;
        this.f209617Y = 0.0f;
        this.f209619Z = 0;
        this.f209642k0 = false;
        this.f209653p0 = false;
        this.f209563E0 = 0L;
        this.f209566F0 = 1.0f;
        this.f209569G0 = 0.5f;
        this.f209572H0 = false;
        this.f209575I0 = false;
        this.f209578J0 = 6000L;
        this.f209581K0 = 1000L;
        this.f209584L0 = 3000L;
        this.f209587M0 = false;
        this.f209590N0 = true;
        this.f209593O0 = false;
        this.f209596P0 = null;
        this.f209599Q0 = null;
        this.f209602R0 = null;
        this.f209605S0 = 0L;
        this.f209608T0 = 0L;
        this.f209610U0 = null;
        this.f209612V0 = null;
        this.f209614W0 = null;
        this.f209616X0 = null;
        this.f209618Y0 = null;
        this.f209620Z0 = null;
        this.f209622a1 = -1L;
        this.f209626c1 = false;
        this.f209638i1 = null;
        this.f209640j1 = null;
        this.f209643k1 = 0;
        this.f209656q1 = 0;
        this.f209662t1 = false;
        this.f209664u1 = false;
        this.f209666v1 = new HashMap();
        this.f209668w1 = -1;
        this.f209672y1 = false;
        this.f209674z1 = 20;
        this.f209555A1 = false;
        this.f209557B1 = 0;
        this.f209559C1 = null;
        this.f209561D1 = false;
        this.f209564E1 = null;
        this.f209567F1 = null;
        this.f209570G1 = new audio_Indicator();
        this.f209573H1 = new Object();
        this.f209576I1 = null;
        this.f209579J1 = new SinkBase.ExtPcmDateCallback() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.1
            @Override // com.immomo.mediacore.sink.SinkBase.ExtPcmDateCallback
            public void onPcmDateCallback(byte[] bArr, int i, long j) {
                int length = bArr.length;
                StreamProducer.this.f209653p0 = true;
                try {
                    StreamProducer.this.m223877t0();
                    int i2 = 0;
                    while (StreamProducer.this.f209589N + length >= StreamProducer.this.f209571H) {
                        int i3 = StreamProducer.this.f209589N;
                        StreamProducer streamProducer = StreamProducer.this;
                        if (i3 > 0) {
                            byte[] bArr2 = new byte[streamProducer.f209571H];
                            StreamProducer.this.f209580K.rewind();
                            StreamProducer.this.f209580K.get(bArr2, 0, StreamProducer.this.f209589N);
                            StreamProducer.this.f209580K.clear();
                            t9c.m189745c("streamerCameraProducer", "mExtRemainAudioIndex > 0 arraycopy :" + i2 + ";mExtRemainAudioIndex:" + StreamProducer.this.f209589N);
                            System.arraycopy(bArr, i2, bArr2, StreamProducer.this.f209589N, StreamProducer.this.f209571H - StreamProducer.this.f209589N);
                            i2 += StreamProducer.this.f209571H - StreamProducer.this.f209589N;
                            length -= StreamProducer.this.f209571H - StreamProducer.this.f209589N;
                            if (StreamProducer.this.f209595P != null) {
                                t9c.m189745c("streamerCameraProducer", "mExtRemainAudioIndex > 0 putSurroundData :" + i2 + ";lens:" + length);
                                if (StreamProducer.this.f209656q1 == 2) {
                                    StreamProducer.this.m223947e2();
                                }
                                StreamProducer.this.f209595P.putAudioData(new oxd0(bArr2, System.nanoTime() / 1000, StreamProducer.this.f209635h.channelNum));
                            }
                            StreamProducer.this.f209589N = 0;
                        } else {
                            byte[] bArr3 = new byte[streamProducer.f209571H];
                            System.arraycopy(bArr, i2, bArr3, 0, StreamProducer.this.f209571H);
                            if (StreamProducer.this.f209595P != null) {
                                t9c.m189745c("streamerCameraProducer", "mExtRemainAudioIndex == 0 putSurroundData pos :" + i2 + ";lens:" + length);
                                if (StreamProducer.this.f209656q1 == 2) {
                                    StreamProducer.this.m223947e2();
                                }
                                StreamProducer.this.f209595P.putAudioData(new oxd0(bArr3, System.nanoTime() / 1000, StreamProducer.this.f209635h.channelNum));
                            }
                            length -= StreamProducer.this.f209571H;
                            i2 += StreamProducer.this.f209571H;
                        }
                    }
                    if (length > 0) {
                        StreamProducer.this.f209580K.put(bArr, i2, length);
                        StreamProducer.m223879v(StreamProducer.this, length);
                        t9c.m189745c("streamerCameraProducer", "mExtRemainAudioIndex.put:pos:" + i2 + ";lens:" + StreamProducer.this.f209589N);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    StreamProducer.this.f209589N = 0;
                    StreamProducer.this.f209580K.clear();
                    t9c.m189745c("streamerCameraProducer", "onMediaDateCallback:exception");
                }
            }
        };
        this.f209582K1 = new SinkBase.PcmDateCallback() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.2
            @Override // com.immomo.mediacore.sink.SinkBase.PcmDateCallback
            public void onPcmDateCallback(long j, byte[] bArr, int i, boolean z) {
                int length = bArr.length;
                int i2 = 0;
                while (StreamProducer.this.f209586M + length >= StreamProducer.this.f209571H) {
                    try {
                        int i3 = StreamProducer.this.f209586M;
                        StreamProducer streamProducer = StreamProducer.this;
                        if (i3 > 0) {
                            byte[] bArr2 = new byte[streamProducer.f209571H];
                            StreamProducer.this.f209577J.rewind();
                            StreamProducer.this.f209577J.get(bArr2, 0, StreamProducer.this.f209586M);
                            StreamProducer.this.f209577J.clear();
                            t9c.m189745c("streamerCameraProducer", "mAttachMergeRemainAudioIndex > 0 arraycopy :" + i2 + ";mAttachMergeRemainAudioIndex:" + StreamProducer.this.f209586M);
                            System.arraycopy(bArr, i2, bArr2, StreamProducer.this.f209586M, StreamProducer.this.f209571H - StreamProducer.this.f209586M);
                            i2 += StreamProducer.this.f209571H - StreamProducer.this.f209586M;
                            length -= StreamProducer.this.f209571H - StreamProducer.this.f209586M;
                            if (StreamProducer.this.f209595P != null) {
                                t9c.m189745c("streamerCameraProducer", "mAttachMergeRemainAudioIndex > 0 putSurroundData :" + i2 + ";lens:" + length);
                                StreamProducer.this.f209595P.putAudioData(new oxd0(bArr2, System.nanoTime() / 1000, StreamProducer.this.f209635h.channelNum));
                            }
                            StreamProducer.this.f209586M = 0;
                        } else {
                            byte[] bArr3 = new byte[streamProducer.f209571H];
                            System.arraycopy(bArr, i2, bArr3, 0, StreamProducer.this.f209571H);
                            if (StreamProducer.this.f209595P != null) {
                                t9c.m189745c("streamerCameraProducer", "mAttachMergeRemainAudioIndex == 0 putSurroundData pos :" + i2 + ";lens:" + length);
                                StreamProducer.this.f209595P.putAudioData(new oxd0(bArr3, System.nanoTime() / 1000, StreamProducer.this.f209635h.channelNum));
                            }
                            length -= StreamProducer.this.f209571H;
                            i2 += StreamProducer.this.f209571H;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        StreamProducer.this.f209586M = 0;
                        StreamProducer.this.f209577J.clear();
                        t9c.m189745c("streamerCameraProducer", "onMediaDateCallback:exception");
                        return;
                    }
                }
                if (length > 0) {
                    StreamProducer.this.f209577J.put(bArr, i2, length);
                    StreamProducer.m223862k0(StreamProducer.this, length);
                    t9c.m189745c("streamerCameraProducer", "mAttachMergeRemainAudio.put:pos:" + i2 + ";lens:" + StreamProducer.this.f209586M);
                }
            }
        };
        this.f209585L1 = new IMediaPlayer.OnPreparedListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.3
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                t9c.m189743a("streamerCameraProducer", "Mediaplayer onPrepared");
                StreamProducer.this.f209643k1 = 2;
                StreamProducer.this.f209664u1 = true;
                long j = StreamProducer.this.f209645l1;
                if (j != 0) {
                    StreamProducer.this.m223958l1(j);
                    StreamProducer.this.m223945e();
                }
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f209647m1;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m224080a(streamProducer.f209558C, 1, 0);
                }
                StreamProducer.this.m223871p0();
            }
        };
        this.f209588M1 = new IMediaPlayer.OnCompletionListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.4
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                StreamProducer.this.f209664u1 = false;
                StreamProducer.this.f209643k1 = 5;
                t9c.m189743a("streamerCameraProducer", "Mediaplayer onCompletion");
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f209647m1;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m224080a(streamProducer.f209558C, 2, 0);
                }
            }
        };
        this.f209591N1 = new IMediaPlayer.OnErrorListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.5
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                t9c.m189744b("streamerCameraProducer", "Mediaplayer Error: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
                StreamProducer.this.f209664u1 = false;
                StreamProducer.this.f209643k1 = -1;
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f209647m1;
                if (onSurroundMusicStatusListener == null) {
                    return true;
                }
                onSurroundMusicStatusListener.m224080a(streamProducer.f209558C, -1, 0);
                return true;
            }
        };
        this.f209594O1 = new IMediaPlayer.OnBufferingUpdateListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.6
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            }
        };
        this.f209597P1 = new IMediaPlayer.OnInfoListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.7
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                t9c.m189744b("streamerCameraProducer", "Mediaplayer onInfo: (%d, %d)", Integer.valueOf(i), Integer.valueOf(i2));
                return true;
            }
        };
        this.f209600Q1 = new IMediaPlayer.OnSeekCompleteListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.8
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                t9c.m189743a("streamerCameraProducer", "Mediaplayer onSeekComplete");
                StreamProducer streamProducer = StreamProducer.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = streamProducer.f209647m1;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m224080a(streamProducer.f209558C, 3, 0);
                }
            }
        };
        this.f209603R1 = new IjkMediaPlayer.MediaDateCallback() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.9
            @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
            public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
                t9c.m189745c("streamerCameraProducer", "Mediaplayer mMediaDateCallback data.len" + bArr.length + ";recording:" + StreamProducer.this.f209662t1);
                int length = bArr.length;
                if (StreamProducer.this.f209662t1 && StreamProducer.this.f209664u1) {
                    int i3 = 0;
                    while (length >= StreamProducer.this.f209571H) {
                        try {
                            int i4 = StreamProducer.this.f209583L;
                            StreamProducer streamProducer = StreamProducer.this;
                            if (i4 > 0) {
                                byte[] bArr2 = new byte[streamProducer.f209571H];
                                StreamProducer.this.f209574I.rewind();
                                StreamProducer.this.f209574I.get(bArr2, 0, StreamProducer.this.f209583L);
                                StreamProducer.this.f209574I.clear();
                                t9c.m189745c("streamerCameraProducer", "mRemainAudioIndex > 0 arraycopy :" + i3 + ";mRemainAudioIndex:" + StreamProducer.this.f209583L);
                                System.arraycopy(bArr, i3, bArr2, StreamProducer.this.f209583L, StreamProducer.this.f209571H - StreamProducer.this.f209583L);
                                i3 += StreamProducer.this.f209571H - StreamProducer.this.f209583L;
                                length -= StreamProducer.this.f209571H - StreamProducer.this.f209583L;
                                if (StreamProducer.this.f209595P == null) {
                                    StreamProducer.this.f209595P = new AudioProcess();
                                }
                                if (StreamProducer.this.f209595P != null) {
                                    t9c.m189745c("streamerCameraProducer", "mRemainAudioIndex > 0 putSurroundData :" + i3 + ";lens:" + length);
                                    StreamProducer.this.f209595P.putSurroundData(new oxd0(bArr2, System.nanoTime() / 1000, StreamProducer.this.f209635h.channelNum));
                                }
                                StreamProducer.this.f209583L = 0;
                            } else {
                                byte[] bArr3 = new byte[streamProducer.f209571H];
                                System.arraycopy(bArr, i3, bArr3, 0, StreamProducer.this.f209571H);
                                if (StreamProducer.this.f209595P != null) {
                                    t9c.m189745c("streamerCameraProducer", "mRemainAudioIndex == 0 putSurroundData pos :" + i3 + ";lens:" + length);
                                    StreamProducer.this.f209595P.putSurroundData(new oxd0(bArr3, System.nanoTime() / 1000, StreamProducer.this.f209635h.channelNum));
                                }
                                length -= StreamProducer.this.f209571H;
                                i3 += StreamProducer.this.f209571H;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            StreamProducer.this.f209583L = 0;
                            StreamProducer.this.f209574I.clear();
                            t9c.m189745c("streamerCameraProducer", "onMediaDateCallback:exception");
                            return;
                        }
                    }
                    if (length > 0) {
                        StreamProducer.this.f209574I.put(bArr, i3, length);
                        StreamProducer.this.f209583L = length;
                        t9c.m189745c("streamerCameraProducer", "mRemainAudio.put:pos:" + i3 + ";lens:" + StreamProducer.this.f209583L);
                    }
                }
            }
        };
        this.f209606S1 = new Handler(Looper.getMainLooper());
        t9c.m189745c("streamerCameraProducer", "StreamProducer:" + ((int) this.f209644l));
        this.f209556B = context;
        this.f209558C = ijkmediastreamer;
        this.f209614W0 = momoSurface;
        if (this.f209567F1 == null) {
            HandlerThread handlerThread = new HandlerThread("ijkStrMonitor");
            this.f209567F1 = handlerThread;
            handlerThread.start();
            this.f209564E1 = new Handler(this.f209567F1.getLooper());
        }
        m223957k2();
        m223863k1();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m223817C(StreamProducer streamProducer) {
        int i = streamProducer.f209557B1;
        streamProducer.f209557B1 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public void m223828M1() {
        Handler handler = this.f209564E1;
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
    private void m223838V0() {
        this.f209628d1 = new VideoRecordRunnable();
        Thread thread = new Thread(this.f209628d1, "live-media-StreamVideoRecorder");
        this.f209630e1 = thread;
        thread.start();
    }

    /* JADX INFO: renamed from: Z1 */
    private void m223843Z1() {
        t9c.m189745c("streamerCameraProducer", "AudioRecordRunnable startAudioCapture stopAudioCapture");
        m223947e2();
        synchronized (this.f209565F) {
            try {
                if (this.f209660s1 == null && this.f209651o1 == null) {
                    t9c.m189745c("streamerCameraProducer", "AudioRecordRunnable startAudioCapture");
                    this.f209590N0 = true;
                    if (this.f209595P == null) {
                        AudioProcess audioProcess = new AudioProcess();
                        this.f209595P = audioProcess;
                        audioProcess.setMasterAudioLevel(this.f209566F0);
                        this.f209595P.setSlaveAudioLevel(this.f209569G0);
                        this.f209595P.startAudioProcessding();
                        boolean z = this.f209601R;
                        if (z) {
                            this.f209595P.adjustEQ(this.f209598Q, z);
                        }
                        boolean z2 = this.f209642k0;
                        if (z2) {
                            this.f209595P.adjustTune(this.f209619Z, z2);
                        }
                        boolean z3 = this.f209607T;
                        if (z3) {
                            this.f209595P.adjustAef(this.f209604S, z3);
                        }
                        int i = this.f209609U;
                        if (i >= 0) {
                            this.f209595P.adjustEf(i, this.f209611V);
                        }
                        int i2 = this.f209613W;
                        if (i2 >= 0) {
                            this.f209595P.SabineEffectSet(i2, this.f209615X, this.f209617Y);
                        }
                        this.f209595P.openSabineEf(44100, 2, this.f209571H / 2);
                    }
                    if (this.f209624b1 == null) {
                        AudioRecordRunnable audioRecordRunnable = new AudioRecordRunnable();
                        this.f209624b1 = audioRecordRunnable;
                        audioRecordRunnable.m223993c(this.f209626c1);
                    }
                    if (this.f209632f1 == null) {
                        Thread thread = new Thread(this.f209624b1, "live-media-AudRec");
                        this.f209632f1 = thread;
                        thread.start();
                    }
                    this.f209624b1.m223991a(this.f209595P);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a2 */
    private int m223845a2() {
        t9c.m189745c("streamerCameraProducer", "AudioRecordRunnable startAudioCapture stopAudioCapture");
        return 0;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ long m223846b0(StreamProducer streamProducer) {
        long j = streamProducer.f209563E0;
        streamProducer.f209563E0 = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: f2 */
    private void m223852f2() {
        if (this.f209634g1 != null) {
            try {
                this.f209593O0 = false;
                this.f209634g1.join(1000L);
            } catch (InterruptedException unused) {
                this.f209634g1.interrupt();
            }
            this.f209634g1 = null;
        }
        if (this.f209576I1 != null) {
            removePcmDataCallback(this.f209576I1);
            this.f209576I1 = null;
        }
        t9c.m189745c("streamerCameraProducer", "stopAudioEncode");
        MediaCodecAudioMux mediaCodecAudioMux = this.f209620Z0;
        if (mediaCodecAudioMux != null) {
            mediaCodecAudioMux.stop();
            this.f209620Z0 = null;
        }
        this.f209655q = null;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ int m223862k0(StreamProducer streamProducer, int i) {
        int i2 = streamProducer.f209586M + i;
        streamProducer.f209586M = i2;
        return i2;
    }

    /* JADX INFO: renamed from: k1 */
    private void m223863k1() {
        try {
            this.f209638i1 = new HeadsetPlugReceiver();
            this.f209640j1 = new BlueConnectStateBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            this.f209560D = intentFilter;
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            Context context = this.f209556B;
            if (context != null) {
                jj5.m145018l(context, this.f209638i1, this.f209560D);
                jj5.m145018l(this.f209556B, this.f209640j1, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                this.f209672y1 = ((AudioManager) this.f209556B.getApplicationContext().getSystemService("audio")).isWiredHeadsetOn();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public void m223871p0() {
        IjkMediaPlayer ijkMediaPlayer = this.f209657r;
        if (ijkMediaPlayer != null) {
            if (this.f209672y1 && this.f209561D1) {
                float f = this.f209569G0;
                ijkMediaPlayer.setVolume(f * 0.18f, f * 0.18f);
            } else {
                float f2 = this.f209569G0;
                ijkMediaPlayer.setVolume(f2 * 0.18f, f2 * 0.18f);
            }
        }
    }

    /* JADX INFO: renamed from: s2 */
    private void m223875s2() {
        VideoQuality videoQuality = this.f209639j;
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
    public void m223877t0() {
        Handler handler = this.f209564E1;
        if (handler != null) {
            handler.removeCallbacks(null);
            this.f209564E1.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m223879v(StreamProducer streamProducer, int i) {
        int i2 = streamProducer.f209589N + i;
        streamProducer.f209589N = i2;
        return i2;
    }

    /* JADX INFO: renamed from: v0 */
    private void m223880v0() throws IOException {
        Thread thread = new Thread(new AudioEncoderRunnable(), "live-media-EnAudioSoft");
        this.f209634g1 = thread;
        thread.start();
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    /* JADX INFO: renamed from: w0 */
    private void m223882w0() throws IOException {
        try {
            this.f209593O0 = true;
            this.f209655q = MediaCodec.createEncoderByType("audio/mp4a-latm");
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
            mediaFormat.setInteger("bitrate", this.f209635h.bitRate);
            mediaFormat.setInteger("channel-count", this.f209635h.channelNum);
            mediaFormat.setInteger("sample-rate", this.f209635h.samplingRate);
            mediaFormat.setInteger("aac-profile", 2);
            mediaFormat.setInteger("max-input-size", this.f209571H);
            this.f209655q.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f209655q.start();
            this.f209592O = this.f209655q.getInputBuffers();
            SinkBase sinkBase = this.f209658r1;
            if (sinkBase != null) {
                sinkBase.setErrorCode(0);
            }
            MediaCodecAudioMux mediaCodecAudioMux = new MediaCodecAudioMux(this.f209655q, this.f209658r1);
            this.f209620Z0 = mediaCodecAudioMux;
            mediaCodecAudioMux.m223394l();
            this.f209620Z0.m223390h(new PacketBufferlingStatusListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.14
                @Override // tv.danmaku.ijk.media.streamer.StreamProducer.PacketBufferlingStatusListener
                /* JADX INFO: renamed from: a */
                public void mo223990a(int i, long j) {
                    t9c.m189745c("streamerCameraProducer", "audioMux PacketBufferlingStatusUpdata: " + i + ";duration:" + j);
                    if (i == 104) {
                        long unused = StreamProducer.this.f209578J0;
                        long unused2 = StreamProducer.this.f209578J0;
                    }
                }
            });
            Thread thread = new Thread(new AudioEncoderRunnable(), "live-media-EnAudioMCodec");
            this.f209634g1 = thread;
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public long m223886A0() {
        MediaCodecAudioMux mediaCodecAudioMux = this.f209620Z0;
        if (mediaCodecAudioMux != null) {
            return mediaCodecAudioMux.m223377n();
        }
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20010, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: A1 */
    public void m223887A1(long j) {
        MediaCodecVideoMux mediaCodecVideoMux = this.f209616X0;
        if (mediaCodecVideoMux == null) {
            this.f209622a1 = j;
        } else {
            mediaCodecVideoMux.m223389g(j);
            this.f209622a1 = -1L;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public long m223888B0() {
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            return audioProcess.getAudioFrames();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: B1 */
    public void m223889B1(long j) {
        this.f209584L0 = j;
        if (j <= 0) {
            this.f209584L0 = 1000L;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public long m223890C0() {
        return this.f209563E0 * ((long) this.f209571H);
    }

    /* JADX INFO: renamed from: C1 */
    public void m223891C1(ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener) {
        this.f209647m1 = onSurroundMusicStatusListener;
    }

    /* JADX INFO: renamed from: D0 */
    public long m223892D0() {
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20008, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: D1 */
    public void m223893D1(ijkMediaStreamer.OnWiredHeadsetStatusListener onWiredHeadsetStatusListener) {
        this.f209670x1 = onWiredHeadsetStatusListener;
    }

    /* JADX INFO: renamed from: E0 */
    public long m223894E0() {
        MediaCodecAudioMux mediaCodecAudioMux = this.f209620Z0;
        if (mediaCodecAudioMux != null) {
            return mediaCodecAudioMux.m223378o();
        }
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20016, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: E1 */
    public void m223895E1(PointF pointF) {
        this.f209621a = pointF;
    }

    /* JADX INFO: renamed from: F0 */
    public long m223896F0() {
        MediaCodecVideoMux mediaCodecVideoMux = this.f209616X0;
        if (mediaCodecVideoMux != null) {
            return mediaCodecVideoMux.m223380n();
        }
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20015, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F1 */
    public void m223897F1(float f) {
        this.f209623b = f;
    }

    /* JADX INFO: renamed from: G0 */
    public float m223898G0() {
        return this.f209566F0;
    }

    /* JADX INFO: renamed from: G1 */
    public void m223899G1(String str) {
        t9c.m189745c("streamerCameraProducer", "setSei:" + str);
        this.f209629e = str;
        MediaCodecVideoMux mediaCodecVideoMux = this.f209616X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.m223393k(str);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public int m223900H0() {
        return this.f209668w1;
    }

    /* JADX INFO: renamed from: H1 */
    public void m223901H1(float f) {
        this.f209569G0 = f;
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
        m223871p0();
    }

    /* JADX INFO: renamed from: I0 */
    public int m223902I0() {
        return 0;
    }

    /* JADX INFO: renamed from: I1 */
    public void m223903I1(long j, boolean z) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f209614W0;
            if (momoSurface != null) {
                momoSurface.m223704U0(j, z);
                return;
            }
            return;
        }
        Map map = this.f209666v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f209666v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m223461o2(j, z);
    }

    /* JADX INFO: renamed from: J0 */
    public MomoSurface m223904J0() {
        return this.f209614W0;
    }

    /* JADX INFO: renamed from: J1 */
    public void m223905J1(long j, boolean z) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f209614W0;
            if (momoSurface != null) {
                momoSurface.m223705V0(j, z);
                return;
            }
            return;
        }
        Map map = this.f209666v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f209666v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m223465s2(j, z);
    }

    /* JADX INFO: renamed from: K0 */
    public long m223906K0() {
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20004, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: K1 */
    public void m223907K1(long j, int i, int i2, int i3, int i4, int i5) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f209614W0;
            if (momoSurface != null) {
                momoSurface.m223706W0(j, i, i2, i3, i4, i5);
                return;
            }
            return;
        }
        Map map = this.f209666v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f209666v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m223460C2(j, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m223908L0() {
        return this.f209662t1;
    }

    /* JADX INFO: renamed from: L1 */
    public void m223909L1(long j, int i, int i2, int i3, int i4) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f209614W0;
            if (momoSurface != null) {
                momoSurface.m223708X0(j, i, i2, i3, i4);
                return;
            }
            return;
        }
        Map map = this.f209666v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f209666v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m223471z2(j, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: M0 */
    public float m223910M0() {
        return this.f209569G0;
    }

    /* JADX INFO: renamed from: N0 */
    public long m223911N0() {
        IjkMediaPlayer ijkMediaPlayer = this.f209657r;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: N1 */
    public void m223912N1(int i) {
        audio_Indicator audio_indicator = this.f209570G1;
        if (audio_indicator != null) {
            audio_indicator.setUserID(i);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public long m223913O0() {
        IjkMediaPlayer ijkMediaPlayer = this.f209657r;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: O1 */
    public void m223914O1(ebl0 ebl0Var) {
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            sinkBase.setVideoChannellistener(ebl0Var);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public long m223915P0() {
        MediaCodecVideoMux mediaCodecVideoMux = this.f209616X0;
        if (mediaCodecVideoMux != null) {
            return mediaCodecVideoMux.m223382p();
        }
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20013, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: P1 */
    public void m223916P1(int i) {
        t9c.m189745c("streamerCameraProducer", "----setVideoEncodingBitRate: " + this.f209639j.bitrate + "---->" + i);
        this.f209639j.bitrate = i;
        MediaCodecVideoMux mediaCodecVideoMux = this.f209616X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.m223386d(i);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public long m223917Q0() {
        MediaCodecVideoMux mediaCodecVideoMux = this.f209616X0;
        if (mediaCodecVideoMux != null) {
            return mediaCodecVideoMux.m223381o();
        }
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(20012, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m223918Q1(int i) {
        VideoQuality videoQuality = this.f209639j;
        videoQuality.framerate = i;
        if (i > 30) {
            videoQuality.framerate = 30;
        }
        if (videoQuality.framerate <= 0) {
            videoQuality.framerate = 20;
        }
        this.f209674z1 = videoQuality.framerate;
        m223942d(i, false);
    }

    /* JADX INFO: renamed from: R0 */
    public int m223919R0() {
        return this.f209639j.bitrate;
    }

    /* JADX INFO: renamed from: R1 */
    public void m223920R1(int i, int i2) {
        VideoQuality videoQuality = this.f209639j;
        videoQuality.resX = i;
        videoQuality.resY = i2;
    }

    /* JADX INFO: renamed from: S0 */
    public long m223921S0() {
        MomoSurface momoSurface = this.f209614W0;
        if (momoSurface != null) {
            return momoSurface.m223738w0();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: S1 */
    public void m223922S1(int i) {
        this.f209671y = i;
    }

    /* JADX INFO: renamed from: T0 */
    public int m223923T0() {
        return this.f209557B1;
    }

    /* JADX INFO: renamed from: T1 */
    public void m223924T1(int i) {
        MomoSurface momoSurface = this.f209614W0;
        if (momoSurface != null) {
            momoSurface.m223712Z0(i);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m223925U0() {
        synchronized (this.f209573H1) {
            try {
                if (this.f209559C1 == null && this.f209672y1 && this.f209561D1) {
                    AudioQuality audioQuality = this.f209635h;
                    NonBlockingAudioTrack nonBlockingAudioTrack = new NonBlockingAudioTrack(audioQuality.samplingRate, audioQuality.channelNum);
                    this.f209559C1 = nonBlockingAudioTrack;
                    nonBlockingAudioTrack.play();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m223926U1(boolean z) {
        this.f209561D1 = z;
        if (!z) {
            m223936b();
        }
        m223871p0();
    }

    /* JADX INFO: renamed from: V1 */
    public void m223927V1() {
        if (m223845a2() == 0) {
            m223843Z1();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m223928W0() {
        int i;
        return (this.f209657r == null || (i = this.f209643k1) == -1 || i == 0 || i == 1) ? false : true;
    }

    /* JADX INFO: renamed from: W1 */
    public void m223929W1() {
        synchronized (this.f209562E) {
            try {
                try {
                    m223927V1();
                    if (this.f209644l == 5) {
                        m223882w0();
                    } else {
                        m223880v0();
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
    public boolean m223930X0() {
        return this.f209672y1;
    }

    /* JADX INFO: renamed from: X1 */
    public void m223931X1(Activity activity, Bitmap bitmap, int i, int i2, int i3, int i4) {
        t9c.m189745c("streamerCameraProducer", "----startCaptureImage(S):" + this.f209649n1);
        SourceBase sourceBase = this.f209649n1;
        if (sourceBase != null) {
            this.f209568G = 0;
            sourceBase.mo223563J(activity, bitmap, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m223932Y0(boolean z) {
    }

    /* JADX INFO: renamed from: Y1 */
    public void m223933Y1(Activity activity, int i, int i2, MediaProjection mediaProjection, int i3) {
        t9c.m189745c("streamerCameraProducer", "----startCaptureScreen(S):" + this.f209649n1);
        SourceBase sourceBase = this.f209649n1;
        if (sourceBase != null) {
            this.f209568G = 0;
            sourceBase.mo223577K(activity, i, i2, mediaProjection, i3);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m223934Z0(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.streamer.MomoSurface.PostDrawImageCallback
    /* JADX INFO: renamed from: a */
    public void mo223740a(int i) {
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            sinkBase.postDrawImage(i);
        }
        if (this.f209660s1 != null) {
            this.f209660s1.postDrawImage(i);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m223935a1(boolean z) {
        this.f209626c1 = z;
        AudioRecordRunnable audioRecordRunnable = this.f209624b1;
        if (audioRecordRunnable != null) {
            audioRecordRunnable.m223993c(z);
        }
        IjkMediaPlayer ijkMediaPlayer = this.f209657r;
        if (ijkMediaPlayer != null) {
            if (this.f209626c1) {
                ijkMediaPlayer.setMediaDataCallback(null);
                this.f209657r.setMediaDataCallback(this.f209603R1);
                this.f209657r.setMediaDateCallbackFlags(1);
            } else {
                if (this.f209672y1) {
                    return;
                }
                ijkMediaPlayer.setMediaDataCallback(null);
                this.f209657r.setMediaDateCallbackFlags(0);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m223936b() {
        synchronized (this.f209573H1) {
            try {
                NonBlockingAudioTrack nonBlockingAudioTrack = this.f209559C1;
                if (nonBlockingAudioTrack != null) {
                    nonBlockingAudioTrack.stop();
                    this.f209559C1.release();
                    this.f209559C1 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m223937b1(boolean z) {
    }

    /* JADX INFO: renamed from: b2 */
    public void m223938b2() {
        t9c.m189745c("streamerCameraProducer", "----startRecording(S):" + ((int) this.f209644l) + ";recording =" + this.f209662t1 + ";mVideoSource=" + this.f209649n1);
        if (!this.f209662t1 && m223953i1()) {
            this.f209662t1 = true;
            m223929W1();
            m223941c2();
            this.f209572H0 = false;
            t9c.m189745c("streamerCameraProducer", "----startRecording(E):" + ((int) this.f209644l) + ";recording =" + this.f209662t1);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m223939c(boolean z) {
        synchronized (this.f209562E) {
            try {
                AudioProcess audioProcess = this.f209595P;
                if (audioProcess != null) {
                    if (z) {
                        t9c.m189745c("streamerCameraProducer", "AudioRecordRunnable EnableExternalAudio stopAudioCapture");
                        m223947e2();
                    } else {
                        audioProcess.clear();
                        t9c.m189745c("streamerCameraProducer", "AudioRecordRunnable EnableExternalAudio startAudioCapture");
                        m223927V1();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m223940c1(long j, boolean z) {
    }

    /* JADX INFO: renamed from: c2 */
    public void m223941c2() {
        synchronized (this.f209562E) {
            try {
                try {
                    this.f209587M0 = true;
                    if (this.f209644l != 5) {
                        MomoSurface momoSurface = this.f209614W0;
                        if (momoSurface != null) {
                            momoSurface.m223711Z(null);
                            this.f209614W0.m223695M0(this.f209639j.framerate, false);
                        }
                        this.f209614W0.m223713b0();
                        m223838V0();
                    } else {
                        m223984x0();
                    }
                    this.f209662t1 = true;
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
    public void m223942d(int i, boolean z) {
        if (this.f209614W0 != null) {
            t9c.m189745c("streamerCameraProducer", "softFrameRateUpdata: " + i + ";needDrop:" + z);
            this.f209614W0.m223695M0(i, z);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m223943d1(long j, boolean z) {
    }

    /* JADX INFO: renamed from: d2 */
    public void m223944d2() {
        MomoSurface momoSurface = this.f209614W0;
        if (momoSurface != null) {
            momoSurface.m223688C0();
        }
        MediaCodecVideoMux mediaCodecVideoMux = this.f209618Y0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.stop();
            this.f209618Y0 = null;
        }
        this.f209618Y0 = null;
    }

    /* JADX INFO: renamed from: e */
    public void m223945e() {
        if (m223928W0()) {
            this.f209657r.start();
            this.f209643k1 = 3;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m223946e1(Activity activity, long j, Bitmap bitmap) {
        if (bitmap == null || this.f209614W0 == null || this.f209666v1 == null) {
            return;
        }
        t9c.m189745c("streamerCameraProducer", "openPublishHelp(S): label [" + j + "], bitmap=" + bitmap);
        if (this.f209666v1.containsKey(Long.valueOf(j))) {
            if (((AidSource) this.f209666v1.get(Long.valueOf(j))) != null) {
                t9c.m189745c("streamerCameraProducer", "openPublishHelp: userID[" + j + "]未释放！！！");
                return;
            }
            return;
        }
        AidSource aidSource = new AidSource(bitmap, this.f209614W0, j, -1);
        t9c.m189745c("streamerCameraProducer", "openPublishHelp: add [" + j + Constants.AES_SUFFIX);
        this.f209666v1.put(Long.valueOf(j), aidSource);
    }

    /* JADX INFO: renamed from: e2 */
    public void m223947e2() {
        synchronized (this.f209565F) {
            try {
                if (this.f209651o1 != null) {
                    return;
                }
                AudioRecordRunnable audioRecordRunnable = this.f209624b1;
                if (audioRecordRunnable != null) {
                    audioRecordRunnable.m223991a(null);
                }
                if (this.f209632f1 != null) {
                    try {
                        this.f209590N0 = false;
                        this.f209632f1.join(2000L);
                    } catch (InterruptedException unused) {
                        this.f209632f1.interrupt();
                    }
                    this.f209632f1 = null;
                    t9c.m189745c("streamerCameraProducer", "AudioRecordRunnable stopAudioCapture");
                }
                this.f209624b1 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m223948f1(Activity activity, ijkMediaStreamer ijkmediastreamer, long j, String str, int i, int i2, ijkMediaStreamer.SizeChangedCallback sizeChangedCallback, int i3, ijkMediaStreamer.aidSwitchResolution aidswitchresolution) {
        String str2 = "tcp://" + str + ":" + i + "?listen";
        if (str == null || this.f209614W0 == null || ijkmediastreamer == null || this.f209666v1 == null) {
            return;
        }
        t9c.m189745c("streamerCameraProducer", "openPublishHelp(S): label [" + j + "], type=" + i3 + ", ip[" + str + "], " + sizeChangedCallback);
        if (this.f209666v1.containsKey(Long.valueOf(j))) {
            if (((AidSource) this.f209666v1.get(Long.valueOf(j))) != null) {
                t9c.m189745c("streamerCameraProducer", "openPublishHelp: userID[" + j + "]未释放！！！");
                return;
            }
            return;
        }
        AidSource aidSource = new AidSource(activity, this, ijkmediastreamer, str2, this.f209614W0, j, sizeChangedCallback, i3, -1, aidswitchresolution);
        t9c.m189745c("streamerCameraProducer", "openPublishHelp: add [" + j + Constants.AES_SUFFIX);
        this.f209666v1.put(Long.valueOf(j), aidSource);
    }

    /* JADX INFO: renamed from: g1 */
    public void m223949g1(Activity activity, ijkMediaStreamer ijkmediastreamer, long j, String str, ijkMediaStreamer.SizeChangedCallback sizeChangedCallback, int i) {
        if (str == null || this.f209614W0 == null || ijkmediastreamer == null || this.f209666v1 == null) {
            return;
        }
        t9c.m189745c("streamerCameraProducer", "openPublishHelp(S): label [" + j + "], type=" + i + ", url[" + str + "], " + sizeChangedCallback);
        if (this.f209666v1.containsKey(Long.valueOf(j))) {
            if (((AidSource) this.f209666v1.get(Long.valueOf(j))) != null) {
                t9c.m189745c("streamerCameraProducer", "openPublishHelp: userID[" + j + "]未释放！！！");
                return;
            }
            return;
        }
        AidSource aidSource = new AidSource(activity, this, ijkmediastreamer, str, this.f209614W0, j, sizeChangedCallback, i, -1, null);
        t9c.m189745c("streamerCameraProducer", "openPublishHelp: add [" + j + Constants.AES_SUFFIX);
        this.f209666v1.put(Long.valueOf(j), aidSource);
    }

    /* JADX INFO: renamed from: g2 */
    public void m223950g2() {
        t9c.m189745c("streamerCameraProducer", "AudioRecordRunnable stopAudioRecording stopAudioCapture");
        m223947e2();
        m223852f2();
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.stopAudioProcessding();
            this.f209595P.clear();
            this.f209595P.release();
            this.f209595P = null;
        }
        t9c.m189745c("streamerCameraProducer", "stopAudioRecording");
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public PointF getPreviewScale() {
        return this.f209621a;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public float getPreviewZoom() {
        return this.f209623b;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public int getStreamerType() {
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            return sinkBase.getStreamerType();
        }
        return 0;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public VideoQuality getVideoQuality() {
        t9c.m189745c("streamerCameraProducer", "getVideoQuality: width" + this.f209639j.resX + ";heigh:" + this.f209639j.resY);
        return this.f209639j;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public Object getWriter() {
        return this.f209658r1;
    }

    /* JADX INFO: renamed from: h1 */
    public void m223951h1() {
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        if (m223928W0() && this.f209657r.isPlaying()) {
            this.f209657r.pause();
            this.f209643k1 = 4;
        }
    }

    /* JADX INFO: renamed from: h2 */
    public synchronized void m223952h2(long j) {
        AidSource aidSource;
        t9c.m189745c("streamerCameraProducer", "stopPublishHelp(S): label [" + j + Constants.AES_SUFFIX);
        Map map = this.f209666v1;
        if (map != null && map.containsKey(Long.valueOf(j)) && (aidSource = (AidSource) this.f209666v1.get(Long.valueOf(j))) != null) {
            this.f209666v1.remove(Long.valueOf(j));
            aidSource.m223466u2(1);
            t9c.m189745c("streamerCameraProducer", "stopPublishHelp: remove [" + j + Constants.AES_SUFFIX);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m223953i1() {
        SourceBase sourceBase = this.f209649n1;
        if (sourceBase != null && !sourceBase.mo223536p()) {
            t9c.m189745c("streamerCameraProducer", "zjlfound prepare fail");
            return false;
        }
        t9c.m189745c("streamerCameraProducer", "----zjlfound prepare：bitrate=" + this.f209639j.bitrate);
        this.f209558C.setAudioSource(this.f209673z);
        this.f209558C.setVideoSource(this.f209671y);
        this.f209558C.setAudioEncoder(3);
        this.f209558C.setVideoEncoder(2);
        t9c.m189745c("streamerCameraProducer", "----prepare call setVideoFrameRate: mVideoQuality.bitrate=" + this.f209639j.bitrate);
        this.f209558C.setVideoFrameRate(this.f209639j.framerate);
        this.f209558C.setVideoEncodingBitRate(this.f209639j.bitrate);
        this.f209558C.setAudioEncodingBitRate(this.f209635h.bitRate);
        this.f209558C.setAudioSamplingRate(this.f209635h.samplingRate);
        ijkMediaStreamer ijkmediastreamer = this.f209558C;
        VideoQuality videoQuality = this.f209639j;
        ijkmediastreamer.setVideoSize(videoQuality.resX, videoQuality.resY);
        byte b = this.f209644l;
        ijkMediaStreamer ijkmediastreamer2 = this.f209558C;
        if (b == 5) {
            ijkmediastreamer2.setMediaCodecEnable(true);
        } else {
            ijkmediastreamer2.setMediaCodecEnable(false);
        }
        this.f209558C.setMaxCacheDuration(this.f209578J0);
        this.f209558C.setMinCacheDuration(this.f209581K0);
        this.f209558C.setStreamPixFmt(this.f209614W0.f209407d ? 1L : 0L);
        return this.f209558C.prepare();
    }

    /* JADX INFO: renamed from: i2 */
    public void m223954i2() {
        t9c.m189745c("streamerCameraProducer", "----stopRecording:recording=" + this.f209662t1);
        if (this.f209662t1) {
            this.f209662t1 = false;
            audioSource audiosource = this.f209654p1;
            if (audiosource != null) {
                audiosource.m223585b(this.f209579J1);
            }
            m223956j2();
            m223950g2();
            m223944d2();
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m223955j1(byte[] bArr, int i, long j) {
        synchronized (this.f209562E) {
            try {
                this.f209653p0 = true;
                audioSource audiosource = this.f209654p1;
                if (audiosource != null) {
                    audiosource.m223585b(this.f209579J1);
                }
                if (this.f209595P != null) {
                    t9c.m189745c("streamerCameraProducer", "mqbuffer;lens:" + i + ";timestamp:" + j);
                    m223947e2();
                    this.f209595P.clear();
                    if (this.f209579J1 != null) {
                        this.f209579J1.onPcmDateCallback(bArr, i, System.nanoTime() / 1000);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j2 */
    public void m223956j2() {
        this.f209663u = 0;
        this.f209665v = 0;
        MomoSurface momoSurface = this.f209614W0;
        if (momoSurface != null) {
            momoSurface.m223689E0();
            this.f209614W0.m223690G0();
        }
        t9c.m189745c("streamerCameraProducer", "stopRecording mMode:" + ((int) this.f209644l));
        if (this.f209630e1 != null) {
            try {
                this.f209587M0 = false;
                this.f209630e1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f209630e1 = null;
        }
        t9c.m189745c("streamerCameraProducer", "stopRecording mVideoRecordThread stoped mThread:");
        MediaCodecVideoMux mediaCodecVideoMux = this.f209616X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.stop();
            this.f209616X0 = null;
        }
        this.f209622a1 = -1L;
        this.f209650o = null;
        t9c.m189745c("streamerCameraProducer", "stopRecording videoMux stoped ");
    }

    /* JADX INFO: renamed from: k2 */
    public void m223957k2() {
        try {
            Context context = this.f209556B;
            if (context != null) {
                HeadsetPlugReceiver headsetPlugReceiver = this.f209638i1;
                if (headsetPlugReceiver != null) {
                    context.unregisterReceiver(headsetPlugReceiver);
                    this.f209638i1.m223995a();
                    this.f209638i1 = null;
                }
                BlueConnectStateBroadcastReceiver blueConnectStateBroadcastReceiver = this.f209640j1;
                if (blueConnectStateBroadcastReceiver != null) {
                    this.f209556B.unregisterReceiver(blueConnectStateBroadcastReceiver);
                    this.f209640j1.m223994a();
                    this.f209640j1 = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m223958l1(long j) {
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        if (!m223928W0()) {
            this.f209645l1 = j;
        } else {
            this.f209657r.seekTo(j);
            this.f209645l1 = 0L;
        }
    }

    /* JADX INFO: renamed from: l2 */
    public void m223959l2(SinkBase sinkBase) {
        this.f209660s1 = sinkBase;
        if (this.f209660s1 != null && this.f209576I1 == null) {
            this.f209576I1 = this.f209582K1;
            m223947e2();
            removePcmDataCallback(this.f209576I1);
            setPcmDataCallback(this.f209576I1);
            AudioProcess audioProcess = this.f209595P;
            if (audioProcess != null) {
                audioProcess.clear();
            }
            this.f209660s1.setPcmDataCallback(this.f209576I1);
        }
        if (this.f209660s1 == null) {
            if (this.f209576I1 != null) {
                removePcmDataCallback(this.f209576I1);
                m223927V1();
            }
            m223944d2();
            this.f209576I1 = null;
        }
        if (this.f209660s1 != null) {
            this.f209660s1.setHeadsetStatus(this.f209672y1);
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m223960m1(VideoQuality videoQuality) {
        t9c.m189745c("streamerCameraProducer", "setAttachedVideoQuality: width");
        if (videoQuality != null) {
            this.f209641k = videoQuality;
        }
        MomoSurface momoSurface = this.f209614W0;
        if (momoSurface != null) {
            momoSurface.m223707X(videoQuality);
        }
    }

    /* JADX INFO: renamed from: m2 */
    public void m223961m2(Bitmap bitmap, int i, int i2, int i3) {
        SourceBase sourceBase = this.f209649n1;
        if (sourceBase != null) {
            sourceBase.mo223565Q(bitmap, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m223962n0(Object obj) {
        MomoSurface momoSurface = this.f209614W0;
        if (momoSurface != null) {
            momoSurface.m223703U(obj);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m223963n1(int i) {
        this.f209635h.channelNum = i;
    }

    /* JADX INFO: renamed from: n2 */
    public void m223964n2(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        AidSource aidSource;
        if (j == 0) {
            MomoSurface momoSurface = this.f209614W0;
            if (momoSurface != null) {
                momoSurface.m223725i1(j, surfaceTexture, i, bitmap);
                return;
            }
            return;
        }
        Map map = this.f209666v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f209666v1.get(Long.valueOf(j))) == null) {
            return;
        }
        aidSource.m223459B2(j, surfaceTexture, i, bitmap);
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notify(int i, int i2, int i3, Object obj) {
        SinkBase sinkBase;
        if (i == 300 && (sinkBase = this.f209658r1) != null) {
            if (sinkBase.getErrorCode() == 300) {
                return;
            } else {
                this.f209658r1.setErrorCode(300);
            }
        }
        ijkMediaStreamer ijkmediastreamer = this.f209558C;
        if (ijkmediastreamer != null) {
            ijkMediaStreamer.postEventFromStreamPro(ijkmediastreamer, i, i2, i3, obj);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustAef(int i, boolean z) {
        this.f209604S = i;
        this.f209607T = z;
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.adjustAef(i, z);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustEQ(int i, boolean z) {
        this.f209598Q = i;
        this.f209601R = z;
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.adjustEQ(i, z);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustEf(int i, int i2) {
        this.f209609U = i;
        this.f209611V = i2;
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.adjustEf(i, i2);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyAdjustTune(int i, boolean z) {
        this.f209619Z = i;
        this.f209642k0 = z;
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.adjustTune(i, z);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEffectReset() {
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset();
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEffectSet(int i, int i2, float f) {
        this.f209613W = i;
        this.f209615X = i2;
        this.f209617Y = f;
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet(i, i2, f);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyEnableExtralAudio(boolean z) {
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyExtralAudioLoss() {
        t9c.m189745c("streamerCameraProducer", "sabineAudioSource notifyExtralAudioLoss");
        if (this.f209654p1 == null || this.f209656q1 == 1) {
            return;
        }
        this.f209656q1 = 1;
        this.f209654p1.m223585b(this.f209579J1);
        if (this.f209662t1) {
            m223843Z1();
        }
        if (getExternAudioDevStatusCallback() != null) {
            getExternAudioDevStatusCallback().onAudioDevStatusNotify(0);
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyExtralAudioReady() {
        t9c.m189745c("streamerCameraProducer", "sabineAudioSource notifyExtralAudioReady");
        if (this.f209654p1 == null || this.f209656q1 == 2) {
            return;
        }
        if (this.f209662t1) {
            this.f209606S1.post(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.11
                @Override // java.lang.Runnable
                public void run() {
                    StreamProducer.this.f209654p1.mo223587d();
                    StreamProducer.this.f209654p1.m223585b(StreamProducer.this.f209579J1);
                    StreamProducer.this.f209654p1.m223586c(StreamProducer.this.f209579J1);
                    StreamProducer.this.m223828M1();
                }
            });
        }
        if (getExternAudioDevStatusCallback() != null) {
            getExternAudioDevStatusCallback().onAudioDevStatusNotify(1);
        }
        this.f209656q1 = 2;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyRecording() {
        t9c.m189745c("streamerCameraProducer", "----notifyRecording: call startRecording()");
        m223938b2();
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyResumeRecording() {
        t9c.m189745c("streamerCameraProducer", "----notifyResumeRecording:recording=" + this.f209662t1 + ",old[" + this.f209663u + Constants.SEPARATOR_COMMA + this.f209665v + "], new[" + this.f209639j.resX + Constants.SEPARATOR_COMMA + this.f209639j.resY + Constants.AES_SUFFIX);
        if (this.f209662t1) {
            int i = this.f209663u;
            VideoQuality videoQuality = this.f209639j;
            if (i == videoQuality.resX && this.f209665v == videoQuality.resY) {
                return;
            }
            m223956j2();
            m223941c2();
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void notifyUpdateResolution() {
        SourceBase sourceBase = this.f209649n1;
        if (sourceBase != null && sourceBase.mo223534n() != null) {
            this.f209639j.resY = this.f209649n1.mo223534n().resY;
            this.f209639j.resX = this.f209649n1.mo223534n().resX;
        }
        m223875s2();
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            sinkBase.notifyUpdateResolution();
        }
        if (this.f209660s1 != null) {
            this.f209658r1.notifyUpdateResolution();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m223965o0(MRtcAudioHandler mRtcAudioHandler) {
        audio_Indicator audio_indicator = this.f209570G1;
        if (audio_indicator != null) {
            audio_indicator.addMRtcAudioHandler(mRtcAudioHandler);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m223966o1(int i) {
        this.f209635h.bitRate = i;
    }

    /* JADX INFO: renamed from: o2 */
    public void m223967o2(int i) {
        if (i == 0) {
            m223927V1();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public void m223968p1(int i) {
        this.f209635h.samplingRate = i;
    }

    /* JADX INFO: renamed from: p2 */
    public void m223969p2(VideoQuality videoQuality) {
        this.f209639j = videoQuality;
        m223875s2();
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            sinkBase.notifyUpdateResolution();
        }
        if (this.f209660s1 != null) {
            this.f209658r1.notifyUpdateResolution();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public long m223970q0(long j) {
        AidSource aidSource;
        Map map = this.f209666v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f209666v1.get(Long.valueOf(j))) == null) {
            return 0L;
        }
        return aidSource.m223462p2();
    }

    /* JADX INFO: renamed from: q1 */
    public void m223971q1(int i) {
        this.f209673z = i;
    }

    /* JADX INFO: renamed from: q2 */
    public void m223972q2(SinkBase sinkBase) {
        this.f209658r1 = sinkBase;
        MediaCodecVideoMux mediaCodecVideoMux = this.f209616X0;
        if (mediaCodecVideoMux != null) {
            mediaCodecVideoMux.m223395m(sinkBase);
        }
        MediaCodecAudioMux mediaCodecAudioMux = this.f209620Z0;
        if (mediaCodecAudioMux != null) {
            mediaCodecAudioMux.m223395m(this.f209658r1);
        }
        SinkBase sinkBase2 = this.f209658r1;
        if (sinkBase2 != null) {
            sinkBase2.setHeadsetStatus(this.f209672y1);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public long m223973r0(long j) {
        AidSource aidSource;
        Map map = this.f209666v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f209666v1.get(Long.valueOf(j))) == null) {
            return 0L;
        }
        return aidSource.getDuration();
    }

    /* JADX INFO: renamed from: r1 */
    public void m223974r1(int i) {
    }

    /* JADX INFO: renamed from: r2 */
    public void m223975r2(Activity activity, SourceBase sourceBase) {
        t9c.m189745c("streamerCameraProducer", "----updateVideoSource(S):" + this.f209649n1);
        this.f209554A = activity;
        SourceBase sourceBase2 = this.f209649n1;
        if (sourceBase2 != null) {
            sourceBase2.mo223537q();
        }
        this.f209649n1 = sourceBase;
        t9c.m189745c("streamerCameraProducer", "----updateVideoSource(E):" + this.f209649n1);
    }

    @Override // com.immomo.mediacore.strinf.confrenceHelp
    public void release() {
        t9c.m189745c("streamerCameraProducer", "mCamera.release begin");
        super.release();
        if (this.f209649n1 != null) {
            this.f209649n1 = null;
        }
        if (this.f209658r1 != null) {
            this.f209658r1 = null;
        }
        audio_Indicator audio_indicator = this.f209570G1;
        if (audio_indicator != null) {
            audio_indicator.release();
            this.f209570G1 = null;
        }
        m223877t0();
        HandlerThread handlerThread = this.f209567F1;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f209567F1 = null;
        this.f209564E1 = null;
        audioSource audiosource = this.f209654p1;
        if (audiosource != null) {
            audiosource.m223585b(this.f209579J1);
            this.f209654p1.m223584a();
            this.f209654p1 = null;
        }
        m223957k2();
        m223956j2();
        m223950g2();
        m223944d2();
        m223936b();
        this.f209638i1 = null;
        this.f209640j1 = null;
        this.f209560D = null;
        stopSurroundMusic();
        this.f209574I = null;
        t9c.m189745c("streamerCameraProducer", "mCamera.release end");
        this.f209554A = null;
        this.f209558C = null;
        try {
            Surface surface = this.f209599Q0;
            if (surface != null) {
                surface.release();
            }
        } catch (Exception unused) {
        }
        try {
            Surface surface2 = this.f209602R0;
            if (surface2 != null) {
                surface2.release();
            }
        } catch (Exception unused2) {
        }
        this.f209599Q0 = null;
        this.f209602R0 = null;
        Map map = this.f209666v1;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Long l2 = (Long) ((Map.Entry) it.next()).getKey();
                AidSource aidSource = (AidSource) this.f209666v1.get(l2);
                if (aidSource != null) {
                    aidSource.m223466u2(1);
                }
                this.f209666v1.remove(l2);
            }
            this.f209666v1.clear();
        }
        this.f209556B = null;
    }

    /* JADX INFO: renamed from: s0 */
    public void m223976s0(long j, long j2) {
        AidSource aidSource;
        Map map = this.f209666v1;
        if (map == null || !map.containsKey(Long.valueOf(j)) || (aidSource = (AidSource) this.f209666v1.get(Long.valueOf(j))) == null) {
            return;
        }
        t9c.m189745c("streamerCameraProducer", "aidSeekTo: [" + j + "], " + j2);
        aidSource.m223467v2(j2);
    }

    /* JADX INFO: renamed from: s1 */
    public void m223977s1(boolean z) {
        this.f209575I0 = z;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void setSourceSucess() {
        ijkMediaStreamer ijkmediastreamer = this.f209558C;
        if (ijkmediastreamer != null) {
            ijkmediastreamer.setCameraSuccess();
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void startSurroundMusic(String str, int i, long j) {
        t9c.m189745c("streamerCameraProducer", "Mediaplayer startSurroundMusic: " + str);
        this.f209664u1 = false;
        this.f209636h1 = str;
        this.f209643k1 = 0;
        IjkMediaPlayer ijkMediaPlayer = this.f209657r;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
            this.f209657r.release();
            this.f209657r = null;
        }
        if (this.f209556B == null || this.f209636h1 == null) {
            return;
        }
        this.f209645l1 = j;
        try {
            IjkMediaPlayer ijkMediaPlayer2 = new IjkMediaPlayer(this.f209556B);
            this.f209657r = ijkMediaPlayer2;
            ijkMediaPlayer2.setOnPreparedListener(this.f209585L1);
            this.f209657r.setOnCompletionListener(this.f209588M1);
            this.f209657r.setOnErrorListener(this.f209591N1);
            this.f209657r.setOnBufferingUpdateListener(this.f209594O1);
            this.f209657r.setOnInfoListener(this.f209597P1);
            this.f209657r.setOnSeekCompleteListener(this.f209600Q1);
            if (this.f209672y1 || this.f209558C.getStreamerType() == 2) {
                this.f209657r.setMediaDataCallback(this.f209603R1);
            }
            this.f209657r.setDataSource(this.f209636h1.toString());
            this.f209657r.setMediaDateCallbackFlags(1);
            int streamerType = this.f209558C.getStreamerType();
            IjkMediaPlayer ijkMediaPlayer3 = this.f209657r;
            if (streamerType != 0) {
                ijkMediaPlayer3.setPropertyLong(20024, 44100L);
            } else {
                ijkMediaPlayer3.setPropertyLong(20024, 44100L);
            }
            this.f209657r.setPropertyLong(20022, 2L);
            this.f209657r.setPropertyLong(20023, 3L);
            this.f209657r.prepareAsync();
            this.f209643k1 = 1;
        } catch (IOException e) {
            t9c.m189746d("streamerCameraProducer", "Mediaplayer Unable to open content: " + this.f209636h1, e);
            this.f209643k1 = -1;
        } catch (IllegalArgumentException e2) {
            t9c.m189746d("streamerCameraProducer", "Mediaplayer Unable to open content: " + this.f209636h1, e2);
            this.f209643k1 = -1;
        }
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void stopSurroundMusic() {
        IjkMediaPlayer ijkMediaPlayer = this.f209657r;
        if (ijkMediaPlayer != null) {
            this.f209664u1 = false;
            ijkMediaPlayer.setMediaDataCallback(null);
            this.f209657r.setOnPreparedListener(null);
            this.f209657r.setOnCompletionListener(null);
            this.f209657r.setOnErrorListener(null);
            this.f209657r.setOnBufferingUpdateListener(null);
            this.f209657r.setOnInfoListener(null);
            this.f209657r.setOnSeekCompleteListener(null);
            this.f209657r.stop();
            this.f209657r.release();
            this.f209643k1 = 0;
            this.f209657r = null;
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m223978t1(int i, int i2) {
        this.f209646m = i;
        this.f209648n = i2;
        if (i2 < 0 || i2 > 3) {
            this.f209648n = 0;
        }
        if (i < 0 || i > 3) {
            this.f209646m = 0;
        }
        t9c.m189745c("streamerCameraProducer", "after setCameraRotation mFrontCameraRotation:" + this.f209646m + ";mBackCameraRotation:" + this.f209648n);
    }

    /* JADX INFO: renamed from: t2 */
    public void m223979t2(byte[] bArr, int i) {
        if (this.f209672y1 && this.f209561D1 && !this.f209626c1) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            synchronized (this.f209573H1) {
                try {
                    NonBlockingAudioTrack nonBlockingAudioTrack = this.f209559C1;
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
    public void m223980u0(int i, int i2) {
        audio_Indicator audio_indicator = this.f209570G1;
        if (audio_indicator != null) {
            audio_indicator.enableAudioVolumeIndication(i, i2);
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m223981u1(boolean z) {
    }

    /* JADX INFO: renamed from: v1 */
    public void m223982v1(float f) {
        this.f209566F0 = f;
        AudioProcess audioProcess = this.f209595P;
        if (audioProcess != null) {
            audioProcess.setMasterAudioLevel(f);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m223983w1(long j) {
        this.f209578J0 = j;
        if (j <= 0) {
            this.f209578J0 = 6000L;
        }
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    /* JADX INFO: renamed from: x0 */
    public void m223984x0() throws IOException, RuntimeException {
        t9c.m189745c("streamerCameraProducer", "Video encoded using the MediaCodec API with a surface mVideoQuality.framerate" + this.f209674z1);
        if (this.f209650o != null) {
            return;
        }
        this.f209650o = MediaCodec.createByCodecName(y0f.m213845b(YtVideoEncoder.MIME_TYPE).getName());
        m223875s2();
        VideoQuality videoQuality = this.f209639j;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, videoQuality.resX, videoQuality.resY);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.f209639j.bitrate);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f209674z1);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec mediaCodec = this.f209650o;
        if (mediaCodec == null) {
            notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 2, null);
            return;
        }
        mediaCodec.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f209599Q0 = this.f209650o.createInputSurface();
        this.f209650o.start();
        VideoQuality videoQuality2 = this.f209639j;
        this.f209663u = videoQuality2.resX;
        this.f209665v = videoQuality2.resY;
        this.f209667w = videoQuality2.bitrate;
        this.f209669x = this.f209674z1;
        t9c.m189745c("streamerCameraProducer", "-------recording:resolution(" + this.f209639j.resX + Constants.SEPARATOR_COMMA + this.f209639j.resY + "),bitrate=" + this.f209639j.bitrate + ", framerate=" + this.f209674z1);
        AudioRecordRunnable audioRecordRunnable = this.f209624b1;
        if (audioRecordRunnable != null) {
            audioRecordRunnable.m223992b(this.f209599Q0);
            this.f209624b1.m223991a(this.f209595P);
        } else {
            MomoSurface momoSurface = this.f209614W0;
            if (momoSurface != null) {
                momoSurface.m223711Z(this.f209599Q0);
            }
        }
        SinkBase sinkBase = this.f209658r1;
        if (sinkBase != null) {
            sinkBase.setErrorCode(0);
        }
        MediaCodecVideoMux mediaCodecVideoMux = new MediaCodecVideoMux(this.f209650o, this.f209658r1);
        this.f209616X0 = mediaCodecVideoMux;
        mediaCodecVideoMux.m223394l();
        this.f209616X0.m223386d(this.f209639j.bitrate);
        this.f209616X0.m223387e(this.f209575I0);
        this.f209616X0.m223393k(this.f209629e);
        long j = this.f209622a1;
        if (j != -1) {
            this.f209616X0.m223389g(j);
        }
        this.f209616X0.m223388f(new MuxBase.EncoderFrameRateUpdataListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.12
        });
        this.f209616X0.m223390h(new PacketBufferlingStatusListener() { // from class: tv.danmaku.ijk.media.streamer.StreamProducer.13
            @Override // tv.danmaku.ijk.media.streamer.StreamProducer.PacketBufferlingStatusListener
            /* JADX INFO: renamed from: a */
            public void mo223990a(int i, long j2) {
                t9c.m189745c("streamerCameraProducer", "videoMux PacketBufferlingStatusUpdata: " + i + ";duration:" + j2);
                StreamProducer streamProducer = StreamProducer.this;
                if (streamProducer.f209558C == null || i != 104) {
                    return;
                }
                long j3 = streamProducer.f209584L0;
                StreamProducer streamProducer2 = StreamProducer.this;
                if (j2 < j3) {
                    if (streamProducer2.f209627d || !StreamProducer.this.f209625c) {
                        return;
                    }
                    StreamProducer.this.notify(105, (int) j2, 0, null);
                    StreamProducer.this.f209627d = true;
                    StreamProducer.this.f209625c = false;
                    return;
                }
                if (streamProducer2.f209625c || !StreamProducer.this.f209627d) {
                    return;
                }
                StreamProducer.this.notify(103, (int) j2, 0, null);
                StreamProducer.this.f209625c = true;
                StreamProducer.this.f209627d = false;
                StreamProducer.m223817C(StreamProducer.this);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public int m223985x1(int i) {
        this.f209668w1 = i;
        return i;
    }

    /* JADX INFO: renamed from: y0 */
    public VideoQuality m223986y0() {
        t9c.m189745c("streamerCameraProducer", "getVideoQuality: width" + this.f209641k.resX + ";heigh:" + this.f209641k.resY);
        return this.f209641k;
    }

    /* JADX INFO: renamed from: y1 */
    public void m223987y1(boolean z) {
        byte b = f209553T1;
        if (b == 1 || !z) {
            this.f209644l = (byte) 1;
        } else {
            this.f209644l = b;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public int m223988z0() {
        return this.f209641k.bitrate;
    }

    /* JADX INFO: renamed from: z1 */
    public void m223989z1(long j) {
        this.f209581K0 = j;
        if (j <= 0) {
            this.f209581K0 = 1000L;
        }
    }
}
