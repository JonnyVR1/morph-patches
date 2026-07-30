package com.momo.piplinemomoext.input.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.mediacore.audio.AudioProcess;
import com.immomo.mediacore.audio.NonBlockingAudioTrack;
import com.immomo.mediacore.audio.VadDetector;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import p149l.ab1;
import p149l.db1;
import p149l.eyx;
import p149l.fjx;
import p149l.g16;
import p149l.ii5;
import p149l.ii70;
import p149l.m300;
import p149l.mpd0;
import p149l.qb1;
import p149l.r3r;
import p149l.rb1;
import p149l.ya1;
import p149l.za1;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes8.dex */
public class ExtAudioWrapper extends m300 implements ya1, InterfaceC4109a {

    /* JADX INFO: renamed from: A */
    private boolean f14489A;

    /* JADX INFO: renamed from: B */
    private boolean f14490B;

    /* JADX INFO: renamed from: C */
    private int f14491C;

    /* JADX INFO: renamed from: D */
    private boolean f14492D;

    /* JADX INFO: renamed from: E */
    private int f14493E;

    /* JADX INFO: renamed from: F */
    private int f14494F;

    /* JADX INFO: renamed from: G */
    private boolean f14495G;

    /* JADX INFO: renamed from: H */
    private int f14496H;

    /* JADX INFO: renamed from: I */
    private boolean f14497I;

    /* JADX INFO: renamed from: J */
    private boolean f14498J;

    /* JADX INFO: renamed from: K */
    private int f14499K;

    /* JADX INFO: renamed from: L */
    private r3r f14500L;

    /* JADX INFO: renamed from: M */
    private VadDetector f14501M;

    /* JADX INFO: renamed from: N */
    private Object f14502N;

    /* JADX INFO: renamed from: O */
    private String f14503O;

    /* JADX INFO: renamed from: P */
    private boolean f14504P;

    /* JADX INFO: renamed from: Q */
    private qb1 f14505Q;

    /* JADX INFO: renamed from: R */
    IMediaPlayer.OnPreparedListener f14506R;

    /* JADX INFO: renamed from: S */
    private IMediaPlayer.OnCompletionListener f14507S;

    /* JADX INFO: renamed from: T */
    private IMediaPlayer.OnErrorListener f14508T;

    /* JADX INFO: renamed from: U */
    private IMediaPlayer.OnBufferingUpdateListener f14509U;

    /* JADX INFO: renamed from: V */
    private IMediaPlayer.OnInfoListener f14510V;

    /* JADX INFO: renamed from: W */
    private IMediaPlayer.OnSeekCompleteListener f14511W;

    /* JADX INFO: renamed from: X */
    private IjkMediaPlayer.MediaDateCallback f14512X;

    /* JADX INFO: renamed from: Y */
    private boolean f14513Y;

    /* JADX INFO: renamed from: Z */
    private IjkMediaPlayer.MediaDateCallback f14514Z;

    /* JADX INFO: renamed from: k0 */
    private int f14515k0;

    /* JADX INFO: renamed from: l */
    private String f14516l;

    /* JADX INFO: renamed from: m */
    IjkMediaPlayer f14517m;

    /* JADX INFO: renamed from: n */
    private WeakReference<Context> f14518n;

    /* JADX INFO: renamed from: o */
    private HeadsetPlugReceiver f14519o;

    /* JADX INFO: renamed from: p */
    private BlueConnectStateBroadcastReceiver f14520p;

    /* JADX INFO: renamed from: p0 */
    private rb1 f14521p0;

    /* JADX INFO: renamed from: q */
    IntentFilter f14522q;

    /* JADX INFO: renamed from: r */
    private int f14523r;

    /* JADX INFO: renamed from: s */
    private long f14524s;

    /* JADX INFO: renamed from: t */
    private NonBlockingAudioTrack f14525t;

    /* JADX INFO: renamed from: u */
    protected za1 f14526u;

    /* JADX INFO: renamed from: v */
    private boolean f14527v;

    /* JADX INFO: renamed from: w */
    private InterfaceC4108i f14528w;

    /* JADX INFO: renamed from: x */
    private db1 f14529x;

    /* JADX INFO: renamed from: y */
    private float f14530y;

    /* JADX INFO: renamed from: z */
    private byte[] f14531z;

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$a */
    public class C4100a implements IMediaPlayer.OnPreparedListener {
        public C4100a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            ii70.m136344d().m136346a("ExtAudioWrapper", "Mediaplayer onPrepared");
            ExtAudioWrapper.this.f14523r = 2;
            long j = ExtAudioWrapper.this.f14524s;
            if (j != 0) {
                ExtAudioWrapper.this.mo20131w0(j);
                ExtAudioWrapper.this.mo20125q();
            }
            ExtAudioWrapper.this.m20067A2();
            za1 za1Var = ExtAudioWrapper.this.f14526u;
            if (za1Var != null) {
                za1Var.mo18373a(null, 1, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$b */
    public class C4101b implements IMediaPlayer.OnCompletionListener {
        public C4101b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            ExtAudioWrapper.this.f14523r = 5;
            ii70.m136344d().m136346a("ExtAudioWrapper", "Mediaplayer onCompletion");
            za1 za1Var = ExtAudioWrapper.this.f14526u;
            if (za1Var != null) {
                za1Var.mo18373a(null, 2, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$c */
    public class C4102c implements IMediaPlayer.OnErrorListener {
        public C4102c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            ii70.m136344d().m136348c("ExtAudioWrapper", "Mediaplayer Error" + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
            ExtAudioWrapper.this.f14523r = -1;
            za1 za1Var = ExtAudioWrapper.this.f14526u;
            if (za1Var == null) {
                return true;
            }
            za1Var.mo18373a(null, -1, 0);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$d */
    public class C4103d implements IMediaPlayer.OnBufferingUpdateListener {
        public C4103d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$e */
    public class C4104e implements IMediaPlayer.OnInfoListener {
        public C4104e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            ii70.m136344d().m136348c("ExtAudioWrapper", "Mediaplayer onInfo: " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$f */
    public class C4105f implements IMediaPlayer.OnSeekCompleteListener {
        public C4105f() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            ii70.m136344d().m136346a("ExtAudioWrapper", "Mediaplayer onSeekComplete");
            za1 za1Var = ExtAudioWrapper.this.f14526u;
            if (za1Var != null) {
                za1Var.mo18373a(null, 3, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$g */
    public class C4106g implements IjkMediaPlayer.MediaDateCallback {
        public C4106g() {
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
        public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
            if (ExtAudioWrapper.this.f14528w.getStreamerType() != 2) {
                ExtAudioWrapper extAudioWrapper = ExtAudioWrapper.this;
                extAudioWrapper.m152746G0(bArr, i, i2, ijkMediaPlayer, extAudioWrapper.f130962f);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$h */
    public class C4107h implements IjkMediaPlayer.MediaDateCallback {
        public C4107h() {
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
        public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
            ExtAudioWrapper extAudioWrapper = ExtAudioWrapper.this;
            extAudioWrapper.m152746G0(bArr, i, i2, ijkMediaPlayer, extAudioWrapper.f130962f);
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$i */
    public interface InterfaceC4108i {
        /* JADX INFO: renamed from: a */
        void mo20060a(String str);

        /* JADX INFO: renamed from: b */
        void mo20061b();

        int getStreamerType();
    }

    public ExtAudioWrapper(int i, int i2, Context context, boolean z) {
        super(2048, i, i2, true);
        this.f14517m = null;
        this.f14519o = null;
        this.f14520p = null;
        this.f14522q = null;
        this.f14523r = 0;
        this.f14525t = null;
        this.f14527v = false;
        this.f14530y = 1.0f;
        this.f14531z = null;
        this.f14489A = false;
        this.f14490B = false;
        this.f14491C = 0;
        this.f14492D = false;
        this.f14493E = 0;
        this.f14494F = 0;
        this.f14495G = false;
        this.f14496H = 0;
        this.f14497I = false;
        this.f14498J = false;
        this.f14499K = 0;
        this.f14500L = null;
        this.f14501M = null;
        this.f14502N = new Object();
        this.f14503O = "Momo";
        this.f14504P = false;
        this.f14505Q = null;
        this.f14506R = new C4100a();
        this.f14507S = new C4101b();
        this.f14508T = new C4102c();
        this.f14509U = new C4103d();
        this.f14510V = new C4104e();
        this.f14511W = new C4105f();
        this.f14512X = new C4106g();
        this.f14513Y = false;
        this.f14514Z = new C4107h();
        this.f14515k0 = 0;
        this.f14521p0 = null;
        this.f14518n = new WeakReference<>(context);
        m20090L2();
        mo20137z1(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public void m20067A2() {
        IjkMediaPlayer ijkMediaPlayer = this.f14517m;
        if (ijkMediaPlayer != null) {
            if (this.f14513Y && this.f14527v) {
                float f = this.f14530y;
                ijkMediaPlayer.setVolume(f * 0.18f, f * 0.18f);
            } else {
                float f2 = this.f14530y;
                ijkMediaPlayer.setVolume(f2 * 0.18f, f2 * 0.18f);
            }
        }
    }

    /* JADX INFO: renamed from: E2 */
    private boolean m20068E2() {
        return ((AudioManager) m20079B2().getSystemService("audio")).isWiredHeadsetOn();
    }

    /* JADX INFO: renamed from: F2 */
    private boolean m20069F2(String str) {
        ii70.m136344d().m136348c("ExtAudioWrapper", "ExtAudioWrapper startSurroundMusic: " + str);
        this.f14516l = str;
        IjkMediaPlayer ijkMediaPlayer = this.f14517m;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
            this.f14517m.release();
            this.f14517m = null;
        }
        if (this.f14516l != null) {
            try {
                IjkMediaPlayer ijkMediaPlayer2 = new IjkMediaPlayer(m20079B2());
                this.f14517m = ijkMediaPlayer2;
                ijkMediaPlayer2.setOnPreparedListener(this.f14506R);
                this.f14517m.setOnCompletionListener(this.f14507S);
                this.f14517m.setOnErrorListener(this.f14508T);
                this.f14517m.setOnBufferingUpdateListener(this.f14509U);
                this.f14517m.setOnInfoListener(this.f14510V);
                this.f14517m.setOnSeekCompleteListener(this.f14511W);
                if (this.f14513Y) {
                    this.f14517m.setMediaDataCallback(this.f14512X);
                }
                if (this.f14504P) {
                    this.f14517m.setMediaDataCallback(this.f14514Z);
                }
                this.f14517m.setDataSource(this.f14516l.toString());
                this.f14517m.setMediaDateCallbackFlags(1);
                this.f14517m.setPropertyLong(20024, 44100L);
                int i = this.f130962f;
                IjkMediaPlayer ijkMediaPlayer3 = this.f14517m;
                if (i == 2) {
                    ijkMediaPlayer3.setPropertyLong(20022, i);
                    this.f14517m.setPropertyLong(20023, 3L);
                } else {
                    ijkMediaPlayer3.setPropertyLong(20022, 1L);
                }
                this.f14517m.prepareAsync();
            } catch (IOException unused) {
                ii70.m136344d().m136348c("ExtAudioWrapper", "Mediaplayer Unable to open content: " + this.f14516l);
            } catch (IllegalArgumentException unused2) {
                ii70.m136344d().m136348c("ExtAudioWrapper", "Mediaplayer Unable to open content: " + this.f14516l);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: M2 */
    private void m20070M2() {
        InterfaceC4108i interfaceC4108i = this.f14528w;
        if (interfaceC4108i == null) {
            return;
        }
        int streamerType = interfaceC4108i.getStreamerType();
        int i = 3;
        if (streamerType != 0 && !m20068E2() && (streamerType != 2 ? streamerType != 3 || !fjx.m121638R().m121666J() : !fjx.m121638R().m121648D())) {
            i = 0;
        }
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            r3rVar.m177732U(i);
        }
        qb1 qb1Var = this.f14505Q;
        if (qb1Var != null) {
            qb1Var.m173806t(i);
        }
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ ab1 m20077y2(ExtAudioWrapper extAudioWrapper) {
        extAudioWrapper.getClass();
        return null;
    }

    /* JADX INFO: renamed from: B2 */
    public Context m20079B2() {
        WeakReference<Context> weakReference = this.f14518n;
        if (weakReference == null) {
            return g16.f100119a;
        }
        return weakReference.get() == null ? g16.f100119a : this.f14518n.get();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    @Override // p149l.m300, p149l.ya1
    /* JADX INFO: renamed from: C */
    public mpd0 mo18364C(mpd0 mpd0Var) {
        byte[] bArrProcessStereoAudioData;
        db1 db1Var;
        byte[] bArrM155800c;
        if (mpd0Var.m155798a()) {
            if (this.f130964h == null) {
                bArrProcessStereoAudioData = null;
            } else {
                if (TextUtils.equals(this.f14503O, "Momo") && fjx.m121638R().m121797w0() && fjx.m121638R().m121800x0() == 0) {
                    if (this.f14501M == null) {
                        VadDetector vadDetector = new VadDetector();
                        this.f14501M = vadDetector;
                        vadDetector.initVadDector(48000);
                    }
                    synchronized (this.f14502N) {
                        try {
                            VadDetector vadDetector2 = this.f14501M;
                            if (vadDetector2 != null) {
                                if (this.f14501M.adjustSabinLevel(vadDetector2.vadDetect(mpd0Var.m155800c(), mpd0Var.m155802e(), this.f130962f, 44100))) {
                                    this.f130964h.setSabindenoiseLevel(this.f14501M.getDenoiseLevel());
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                int i = this.f130962f;
                if (i == 1) {
                    bArrProcessStereoAudioData = this.f130964h.processAudioData(mpd0Var.m155800c(), mpd0Var.m155802e());
                } else if (i == 2) {
                    bArrProcessStereoAudioData = this.f130964h.processStereoAudioData(mpd0Var.m155800c(), mpd0Var.m155802e());
                } else {
                    bArrProcessStereoAudioData = null;
                }
            }
            if (!this.f130967k && this.f14513Y && this.f14527v && (db1Var = this.f14529x) != null) {
                if (this.f130962f == 1 && db1Var.m110634b() == 2) {
                    bArrM155800c = bArrProcessStereoAudioData != null ? m300.m152744o2(bArrProcessStereoAudioData, bArrProcessStereoAudioData.length) : m300.m152744o2(mpd0Var.m155800c(), mpd0Var.m155802e());
                } else {
                    bArrM155800c = bArrProcessStereoAudioData != null ? bArrProcessStereoAudioData : mpd0Var.m155800c();
                }
                this.f14529x.m110635c(bArrM155800c, bArrM155800c.length);
            }
            if (TextUtils.equals(this.f14503O, "Momo")) {
                if (!this.f130967k) {
                    return bArrProcessStereoAudioData != null ? super.mo18364C(new mpd0(bArrProcessStereoAudioData, mpd0Var.m155801d(), this.f130962f)) : super.mo18364C(mpd0Var);
                }
                byte[] bArr = new byte[mpd0Var.m155802e()];
                this.f14531z = bArr;
                return super.mo18364C(new mpd0(bArr, mpd0Var.m155801d(), this.f130962f));
            }
            if (bArrProcessStereoAudioData != null) {
                return this.f14496H == 1 ? super.mo18364C(new mpd0(bArrProcessStereoAudioData, mpd0Var.m155801d(), this.f130962f)) : new mpd0(bArrProcessStereoAudioData, mpd0Var.m155801d(), this.f130962f);
            }
        }
        return mpd0Var;
    }

    /* JADX INFO: renamed from: C2 */
    public za1 m20080C2() {
        return this.f14526u;
    }

    /* JADX INFO: renamed from: D2 */
    public boolean m20081D2() {
        int i;
        return (this.f14517m == null || (i = this.f14523r) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: F */
    public void mo20082F(String str, String str2) {
        if (this.f14500L == null) {
            this.f14500L = new r3r(str2, this.f130960d, this.f130962f, this.f130964h);
        }
        if (this.f14500L != null) {
            r3r.m177694Z(this.f14526u);
        }
        m20070M2();
        this.f14500L.m177735X(str, str2);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: G1 */
    public void mo20083G1(za1 za1Var) {
        this.f14526u = za1Var;
        if (this.f14500L != null) {
            r3r.m177694Z(za1Var);
        }
    }

    /* JADX INFO: renamed from: G2 */
    public void m20084G2() {
        WeakReference<Context> weakReference = this.f14518n;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public void m20085H2() {
        r3r.m177694Z(null);
        r3r.m177691Q();
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: I */
    public void mo20086I() {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset_ex();
        }
    }

    /* JADX INFO: renamed from: I2 */
    public void m20087I2(int i, int i2, int i3, String str) {
        boolean z = (this.f130958b == i && this.f130960d == i2 && this.f130962f == i3 && this.f14503O.equals(str)) ? false : true;
        if (z || this.f130964h == null) {
            ii70.m136344d().m136348c("ExtAudioWrapper", "setAudioRecorderBuffSize: name:" + str + " , channel:" + i3);
            this.f130958b = i;
            this.f130960d = i2;
            this.f130962f = i3;
            this.f130963g = ByteBuffer.allocate(i);
            this.f14503O = str;
            AudioProcess audioProcess = this.f130964h;
            if (audioProcess == null) {
                this.f130964h = new AudioProcess();
            } else if (z) {
                audioProcess.release();
                this.f130964h = new AudioProcess();
            }
            this.f130964h.openSabineEf(this.f130960d, this.f130962f, this.f130958b / 2);
            this.f130964h.setSlaveAudioGain(1.0f);
            this.f130964h.setSlaveAudioLevel(1.0f);
            this.f130964h.setMasterAudioLevel(1.0f);
            mo20118j0(this.f14493E, this.f14492D);
            mo20106b0(this.f14494F, this.f14495G);
            mo20134y0(this.f14491C, this.f14490B);
            mo20114f0(this.f14499K);
            db1 db1Var = this.f14529x;
            if (db1Var != null) {
                db1Var.m110633a();
                this.f14529x = new db1(this.f130960d, this.f130962f);
            }
            r3r r3rVar = this.f14500L;
            if (r3rVar != null) {
                r3rVar.m177737c0(this.f130964h, this.f130962f);
            }
            qb1 qb1Var = this.f14505Q;
            if (qb1Var != null) {
                qb1Var.m173809x(this.f130964h, this.f130962f);
            }
        }
    }

    /* JADX INFO: renamed from: J2 */
    public void m20088J2(@NonNull InterfaceC4108i interfaceC4108i) {
        this.f14528w = interfaceC4108i;
        m20092N2();
    }

    /* JADX INFO: renamed from: K2 */
    public boolean m20089K2(int i, String str, long j, long j2, boolean z, boolean z2) {
        if (this.f14505Q == null) {
            this.f14505Q = new qb1(this.f130964h);
            m20070M2();
            this.f14505Q.m173801o(this.f130960d, this.f130961e, this.f130962f);
            rb1 rb1Var = this.f14521p0;
            if (rb1Var != null) {
                this.f14505Q.m173805s(rb1Var);
            }
        }
        return this.f14505Q.m173799m(i, str, j, j2, z, z2);
    }

    /* JADX INFO: renamed from: L2 */
    public void m20090L2() {
        try {
            if (m20079B2() != null) {
                if (this.f14519o != null) {
                    m20079B2().unregisterReceiver(this.f14519o);
                    this.f14519o.m20139a();
                    this.f14519o = null;
                }
                if (this.f14520p != null) {
                    m20079B2().unregisterReceiver(this.f14520p);
                    this.f14520p.m20138a();
                    this.f14520p = null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: N1 */
    public void mo20091N1() {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            r3rVar.m177736b0();
        }
    }

    /* JADX INFO: renamed from: N2 */
    public void m20092N2() {
        m20070M2();
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: O1 */
    public boolean mo20093O1(String str) {
        InterfaceC4108i interfaceC4108i = this.f14528w;
        if (interfaceC4108i == null) {
            return true;
        }
        interfaceC4108i.mo20060a(str);
        this.f14489A = true;
        if (this.f14528w.getStreamerType() == 0) {
            return m20069F2(str);
        }
        return true;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: P */
    public void mo20094P() {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset();
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: Q */
    public void mo20095Q(int i, float f, float f2) {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_peq_Shelving(i, f, f2);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: R1 */
    public void mo20096R1(int i) {
        qb1 qb1Var = this.f14505Q;
        if (qb1Var != null) {
            qb1Var.m173803q(i);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: S1 */
    public void mo20097S1(boolean z) {
        this.f14498J = z;
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.setElcEffect(z);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: T */
    public void mo20098T(int i, int i2) {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.adjustEf(i, i2);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: U1 */
    public void mo20099U1(float f) {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_ans(f);
        }
    }

    @Override // p149l.m300, p149l.u3m
    /* JADX INFO: renamed from: W1 */
    public void mo20101W1(float f) {
        this.f14530y = 0.8f * f;
        super.mo20101W1(f);
        m20067A2();
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: Y0 */
    public void mo20102Y0(long j, boolean z) {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            r3rVar.m177727N((int) j, z);
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4109a
    /* JADX INFO: renamed from: a */
    public void mo20103a(boolean z) {
        this.f130967k = z;
    }

    @Override // p149l.m300, com.momo.piplinemomoext.input.audio.InterfaceC4109a
    /* JADX INFO: renamed from: a1 */
    public void mo20104a1() {
        super.mo20104a1();
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4109a
    /* JADX INFO: renamed from: b */
    public void mo20105b(boolean z) {
        this.f14497I = z;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: b0 */
    public void mo20106b0(int i, boolean z) {
        this.f14494F = i;
        this.f14495G = z;
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.adjustAef(i, z);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: b2 */
    public void mo20107b2() {
        InterfaceC4108i interfaceC4108i = this.f14528w;
        if (interfaceC4108i != null) {
            this.f14489A = false;
            this.f14504P = false;
            interfaceC4108i.mo20061b();
            IjkMediaPlayer ijkMediaPlayer = this.f14517m;
            if (ijkMediaPlayer != null) {
                ijkMediaPlayer.stop();
                this.f14517m.release();
                this.f14517m = null;
            }
            AudioProcess audioProcess = this.f130964h;
            if (audioProcess != null) {
                audioProcess.clear();
            }
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: c */
    public long mo20108c() {
        IjkMediaPlayer ijkMediaPlayer = this.f14517m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: d */
    public float mo20109d() {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            return r3rVar.m177722H();
        }
        return 1.0f;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: d0 */
    public void mo20110d0(int i, float f, int i2) {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_peq_fliter(i, f, i2);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: d1 */
    public void mo20111d1() {
        mo20124p2();
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: d2 */
    public void mo20112d2() {
        qb1 qb1Var = this.f14505Q;
        if (qb1Var != null) {
            qb1Var.m173802p();
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: e1 */
    public void mo20113e1(int i, int i2, float f) {
        if (i == 2 || i == 3) {
            eyx.m118802c().m118808g("nMode:" + i + ",idx:" + i2);
            fjx.m121638R().m121647C1(0);
        }
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet(i, i2, f);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: f0 */
    public void mo20114f0(int i) {
        this.f14499K = i;
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.setAudioEffectType(i);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: g1 */
    public boolean mo20115g1(String str) {
        InterfaceC4108i interfaceC4108i = this.f14528w;
        if (interfaceC4108i == null) {
            return true;
        }
        interfaceC4108i.mo20060a(str);
        this.f14489A = true;
        return m20069F2(str);
    }

    @Override // p149l.u3m
    public long getMusicDuration() {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            return r3rVar.m177721G();
        }
        return 0L;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: i1 */
    public void mo20116i1(int i, float f) {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_reverb(i, f);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: j */
    public void mo20117j() {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        if (m20081D2() && this.f14517m.isPlaying()) {
            this.f14517m.pause();
            this.f14523r = 4;
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: j0 */
    public void mo20118j0(int i, boolean z) {
        this.f14493E = i;
        this.f14492D = z;
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.adjustTune(i, z);
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4109a
    /* JADX INFO: renamed from: l */
    public void mo20119l(int i) {
        this.f14496H = i;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: l0 */
    public boolean mo20120l0(int i, String str, boolean z, boolean z2) {
        return m20089K2(i, str, 0L, 0L, z, z2);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: n1 */
    public void mo20121n1(int i, float f, float f2, float f3) {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_peq_peak(i, f, f2, f3);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: o0 */
    public void mo20122o0() {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            r3rVar.m177729P();
            this.f14500L = null;
        }
        m20085H2();
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: p1 */
    public void mo20123p1() {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            r3rVar.m177730S();
        }
    }

    @Override // p149l.m300
    /* JADX INFO: renamed from: p2 */
    public void mo20124p2() {
        m20090L2();
        super.mo20124p2();
        this.f14504P = false;
        IjkMediaPlayer ijkMediaPlayer = this.f14517m;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setMediaDataCallback(null);
            this.f14517m.stop();
            this.f14517m.release();
            this.f14523r = 0;
            this.f14517m = null;
        }
        db1 db1Var = this.f14529x;
        if (db1Var != null) {
            db1Var.m110633a();
            this.f14529x = null;
        }
        this.f14528w = null;
        this.f14519o = null;
        this.f14520p = null;
        if (fjx.m121638R().m121797w0() && fjx.m121638R().m121800x0() == 0) {
            synchronized (this.f14502N) {
                try {
                    VadDetector vadDetector = this.f14501M;
                    if (vadDetector != null) {
                        vadDetector.releaseVad();
                        this.f14501M = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m20084G2();
        this.f14526u = null;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: q */
    public void mo20125q() {
        if (m20081D2()) {
            this.f14517m.start();
            this.f14523r = 3;
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: q0 */
    public void mo20126q0(long j) {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            r3rVar.m177731T((int) j);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: r */
    public long mo20127r() {
        IjkMediaPlayer ijkMediaPlayer = this.f14517m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4109a
    /* JADX INFO: renamed from: s1 */
    public void mo20128s1(int i) {
        m20087I2(this.f130958b, this.f130960d, i, this.f14503O);
    }

    @Override // p149l.u3m
    public void setMusicPitch(int i) {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            r3rVar.m177733V(i);
        }
    }

    @Override // p149l.u3m
    public void setMusicVolume(float f) {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            r3rVar.m177734W(f);
        }
    }

    @Override // p149l.u3m
    public void stopSurroundMusic() {
        InterfaceC4108i interfaceC4108i = this.f14528w;
        if (interfaceC4108i != null) {
            this.f14489A = false;
            interfaceC4108i.mo20061b();
            if (this.f14528w.getStreamerType() == 0 || this.f14528w.getStreamerType() == 2) {
                IjkMediaPlayer ijkMediaPlayer = this.f14517m;
                if (ijkMediaPlayer != null) {
                    ijkMediaPlayer.stop();
                    this.f14517m.release();
                    this.f14517m = null;
                }
                AudioProcess audioProcess = this.f130964h;
                if (audioProcess != null) {
                    audioProcess.clear();
                }
            }
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: v1 */
    public void mo20129v1(long j) {
        if (this.f14500L != null) {
            m20092N2();
            this.f14500L.m177726M((int) j);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: w */
    public long mo20130w() {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            return r3rVar.m177720F();
        }
        return 0L;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: w0 */
    public void mo20131w0(long j) {
        if (!m20081D2()) {
            this.f14524s = j;
        } else {
            this.f14517m.seekTo(j);
            this.f14524s = 0L;
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: w1 */
    public void mo20132w1() {
        r3r r3rVar = this.f14500L;
        if (r3rVar != null) {
            r3rVar.m177725L();
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4109a
    /* JADX INFO: renamed from: x0 */
    public void mo20133x0(boolean z) {
        this.f14504P = z;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: y0 */
    public void mo20134y0(int i, boolean z) {
        this.f14491C = i;
        this.f14490B = z;
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.adjustEQ(i, z);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: y1 */
    public float mo20135y1() {
        return this.f14530y;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: z */
    public void mo20136z(boolean z) {
        db1 db1Var;
        this.f14527v = z;
        if (!z && (db1Var = this.f14529x) != null) {
            db1Var.m110633a();
            this.f14529x = null;
        }
        if (this.f14527v && this.f14529x == null) {
            this.f14529x = new db1(this.f130960d, 2);
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4109a
    /* JADX INFO: renamed from: z1 */
    public void mo20137z1(boolean z) {
        m20090L2();
        try {
            C4100a c4100a = null;
            this.f14519o = new HeadsetPlugReceiver(this, c4100a);
            this.f14520p = new BlueConnectStateBroadcastReceiver(this, c4100a);
            IntentFilter intentFilter = new IntentFilter();
            this.f14522q = intentFilter;
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            if (m20079B2() != null) {
                ii5.m136342l(m20079B2(), this.f14519o, this.f14522q);
                ii5.m136342l(m20079B2(), this.f14520p, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                AudioManager audioManager = (AudioManager) m20079B2().getSystemService("audio");
                if (z) {
                    this.f14513Y = true;
                } else {
                    this.f14513Y = audioManager.isWiredHeadsetOn();
                }
            }
        } catch (Exception unused) {
        }
    }

    public class BlueConnectStateBroadcastReceiver extends BroadcastReceiver {
        private BlueConnectStateBroadcastReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m20138a() {
            try {
                super.finalize();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
            if (intExtra == 0) {
                ii70.m136344d().m136348c("HeadsetPlugReceiver", "STATE_DISCONNECTED");
            } else {
                if (intExtra != 2) {
                    return;
                }
                ii70.m136344d().m136348c("HeadsetPlugReceiver", "STATE_CONNECTED");
            }
        }

        public /* synthetic */ BlueConnectStateBroadcastReceiver(ExtAudioWrapper extAudioWrapper, C4100a c4100a) {
            this();
        }
    }

    public class HeadsetPlugReceiver extends BroadcastReceiver {
        private HeadsetPlugReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m20139a() {
            try {
                ExtAudioWrapper.this.mo20122o0();
                super.finalize();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.hasExtra("state")) {
                if (intent.getIntExtra("state", 0) == 0) {
                    ExtAudioWrapper extAudioWrapper = ExtAudioWrapper.this;
                    if (extAudioWrapper.f14517m != null && extAudioWrapper.f14528w.getStreamerType() != 2) {
                        ExtAudioWrapper.this.f14517m.setMediaDataCallback(null);
                    }
                    ExtAudioWrapper.this.f14513Y = false;
                    ExtAudioWrapper.m20077y2(ExtAudioWrapper.this);
                    ii70.m136344d().m136348c("ExtAudioWrapper", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + ExtAudioWrapper.this.f14513Y);
                    ExtAudioWrapper.this.m20067A2();
                    ExtAudioWrapper.this.m20092N2();
                    return;
                }
                if (intent.getIntExtra("state", 0) == 1) {
                    ExtAudioWrapper extAudioWrapper2 = ExtAudioWrapper.this;
                    IjkMediaPlayer ijkMediaPlayer = extAudioWrapper2.f14517m;
                    if (ijkMediaPlayer != null) {
                        ijkMediaPlayer.setMediaDataCallback(extAudioWrapper2.f14512X);
                    }
                    ExtAudioWrapper.this.f14513Y = true;
                    ExtAudioWrapper.m20077y2(ExtAudioWrapper.this);
                    ExtAudioWrapper.this.m20067A2();
                    ExtAudioWrapper.this.m20092N2();
                    ii70.m136344d().m136348c("ExtAudioWrapper", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + ExtAudioWrapper.this.f14513Y);
                }
            }
        }

        public /* synthetic */ HeadsetPlugReceiver(ExtAudioWrapper extAudioWrapper, C4100a c4100a) {
            this();
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: V */
    public void mo20100V(ab1 ab1Var) {
    }
}
