package com.momo.piplinemomoext.input.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mediacore.audio.AudioProcess;
import com.immomo.mediacore.audio.NonBlockingAudioTrack;
import com.immomo.mediacore.audio.VadDetector;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import l.ab1;
import l.eyx;
import l.fjx;
import l.g16;
import l.ii5;
import l.ii70;
import l.mpd0;
import l.rb1;
import l.ya1;
import l.za1;
import p007l.db1;
import p007l.m300;
import p007l.qb1;
import p007l.r3r;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ExtAudioWrapper extends m300 implements ya1, InterfaceC0021a {

    /* JADX INFO: renamed from: A */
    private boolean f188A;

    /* JADX INFO: renamed from: B */
    private boolean f189B;

    /* JADX INFO: renamed from: C */
    private int f190C;

    /* JADX INFO: renamed from: D */
    private boolean f191D;

    /* JADX INFO: renamed from: E */
    private int f192E;

    /* JADX INFO: renamed from: F */
    private int f193F;

    /* JADX INFO: renamed from: G */
    private boolean f194G;

    /* JADX INFO: renamed from: H */
    private int f195H;

    /* JADX INFO: renamed from: I */
    private boolean f196I;

    /* JADX INFO: renamed from: J */
    private boolean f197J;

    /* JADX INFO: renamed from: K */
    private int f198K;

    /* JADX INFO: renamed from: L */
    private r3r f199L;

    /* JADX INFO: renamed from: M */
    private VadDetector f200M;

    /* JADX INFO: renamed from: N */
    private Object f201N;

    /* JADX INFO: renamed from: O */
    private String f202O;

    /* JADX INFO: renamed from: P */
    private boolean f203P;

    /* JADX INFO: renamed from: Q */
    private qb1 f204Q;

    /* JADX INFO: renamed from: R */
    IMediaPlayer.OnPreparedListener f205R;

    /* JADX INFO: renamed from: S */
    private IMediaPlayer.OnCompletionListener f206S;

    /* JADX INFO: renamed from: T */
    private IMediaPlayer.OnErrorListener f207T;

    /* JADX INFO: renamed from: U */
    private IMediaPlayer.OnBufferingUpdateListener f208U;

    /* JADX INFO: renamed from: V */
    private IMediaPlayer.OnInfoListener f209V;

    /* JADX INFO: renamed from: W */
    private IMediaPlayer.OnSeekCompleteListener f210W;

    /* JADX INFO: renamed from: X */
    private IjkMediaPlayer.MediaDateCallback f211X;

    /* JADX INFO: renamed from: Y */
    private boolean f212Y;

    /* JADX INFO: renamed from: Z */
    private IjkMediaPlayer.MediaDateCallback f213Z;

    /* JADX INFO: renamed from: k0 */
    private int f214k0;

    /* JADX INFO: renamed from: l */
    private String f215l;

    /* JADX INFO: renamed from: m */
    IjkMediaPlayer f216m;

    /* JADX INFO: renamed from: n */
    private WeakReference<Context> f217n;

    /* JADX INFO: renamed from: o */
    private HeadsetPlugReceiver f218o;

    /* JADX INFO: renamed from: p */
    private BlueConnectStateBroadcastReceiver f219p;

    /* JADX INFO: renamed from: p0 */
    private rb1 f220p0;

    /* JADX INFO: renamed from: q */
    IntentFilter f221q;

    /* JADX INFO: renamed from: r */
    private int f222r;

    /* JADX INFO: renamed from: s */
    private long f223s;

    /* JADX INFO: renamed from: t */
    private NonBlockingAudioTrack f224t;

    /* JADX INFO: renamed from: u */
    protected za1 f225u;

    /* JADX INFO: renamed from: v */
    private boolean f226v;

    /* JADX INFO: renamed from: w */
    private InterfaceC0020i f227w;

    /* JADX INFO: renamed from: x */
    private db1 f228x;

    /* JADX INFO: renamed from: y */
    private float f229y;

    /* JADX INFO: renamed from: z */
    private byte[] f230z;

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$a */
    public class C0012a implements IMediaPlayer.OnPreparedListener {
        public C0012a() {
        }

        public void onPrepared(IMediaPlayer iMediaPlayer) {
            ii70.d().a("ExtAudioWrapper", "Mediaplayer onPrepared");
            ExtAudioWrapper.this.f222r = 2;
            long j = ExtAudioWrapper.this.f223s;
            if (j != 0) {
                ExtAudioWrapper.this.m397w0(j);
                ExtAudioWrapper.this.m391q();
            }
            ExtAudioWrapper.this.m332A2();
            za1 za1Var = ExtAudioWrapper.this.f225u;
            if (za1Var != null) {
                za1Var.a((Object) null, 1, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$b */
    public class C0013b implements IMediaPlayer.OnCompletionListener {
        public C0013b() {
        }

        public void onCompletion(IMediaPlayer iMediaPlayer) {
            ExtAudioWrapper.this.f222r = 5;
            ii70.d().a("ExtAudioWrapper", "Mediaplayer onCompletion");
            za1 za1Var = ExtAudioWrapper.this.f225u;
            if (za1Var != null) {
                za1Var.a((Object) null, 2, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$c */
    public class C0014c implements IMediaPlayer.OnErrorListener {
        public C0014c() {
        }

        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            ii70.d().c("ExtAudioWrapper", "Mediaplayer Error" + i + " " + i2);
            ExtAudioWrapper.this.f222r = -1;
            za1 za1Var = ExtAudioWrapper.this.f225u;
            if (za1Var == null) {
                return true;
            }
            za1Var.a((Object) null, -1, 0);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$d */
    public class C0015d implements IMediaPlayer.OnBufferingUpdateListener {
        public C0015d() {
        }

        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$e */
    public class C0016e implements IMediaPlayer.OnInfoListener {
        public C0016e() {
        }

        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            ii70.d().c("ExtAudioWrapper", "Mediaplayer onInfo: " + i + " " + i2);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$f */
    public class C0017f implements IMediaPlayer.OnSeekCompleteListener {
        public C0017f() {
        }

        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            ii70.d().a("ExtAudioWrapper", "Mediaplayer onSeekComplete");
            za1 za1Var = ExtAudioWrapper.this.f225u;
            if (za1Var != null) {
                za1Var.a((Object) null, 3, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$g */
    public class C0018g implements IjkMediaPlayer.MediaDateCallback {
        public C0018g() {
        }

        public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
            if (ExtAudioWrapper.this.f227w.getStreamerType() != 2) {
                ExtAudioWrapper extAudioWrapper = ExtAudioWrapper.this;
                extAudioWrapper.m9858G0(bArr, i, i2, ijkMediaPlayer, extAudioWrapper.f3280f);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$h */
    public class C0019h implements IjkMediaPlayer.MediaDateCallback {
        public C0019h() {
        }

        public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
            ExtAudioWrapper extAudioWrapper = ExtAudioWrapper.this;
            extAudioWrapper.m9858G0(bArr, i, i2, ijkMediaPlayer, extAudioWrapper.f3280f);
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$i */
    public interface InterfaceC0020i {
        /* JADX INFO: renamed from: a */
        void mo324a(String str);

        /* JADX INFO: renamed from: b */
        void mo325b();

        int getStreamerType();
    }

    public ExtAudioWrapper(int i, int i2, Context context, boolean z) {
        super(2048, i, i2, true);
        this.f216m = null;
        this.f218o = null;
        this.f219p = null;
        this.f221q = null;
        this.f222r = 0;
        this.f224t = null;
        this.f226v = false;
        this.f229y = 1.0f;
        this.f230z = null;
        this.f188A = false;
        this.f189B = false;
        this.f190C = 0;
        this.f191D = false;
        this.f192E = 0;
        this.f193F = 0;
        this.f194G = false;
        this.f195H = 0;
        this.f196I = false;
        this.f197J = false;
        this.f198K = 0;
        this.f199L = null;
        this.f200M = null;
        this.f201N = new Object();
        this.f202O = "Momo";
        this.f203P = false;
        this.f204Q = null;
        this.f205R = new C0012a();
        this.f206S = new C0013b();
        this.f207T = new C0014c();
        this.f208U = new C0015d();
        this.f209V = new C0016e();
        this.f210W = new C0017f();
        this.f211X = new C0018g();
        this.f212Y = false;
        this.f213Z = new C0019h();
        this.f214k0 = 0;
        this.f220p0 = null;
        this.f217n = new WeakReference<>(context);
        m356L2();
        mo403z1(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public void m332A2() {
        IjkMediaPlayer ijkMediaPlayer = this.f216m;
        if (ijkMediaPlayer != null) {
            if (this.f212Y && this.f226v) {
                float f = this.f229y;
                ijkMediaPlayer.setVolume(f * 0.18f, f * 0.18f);
            } else {
                float f2 = this.f229y;
                ijkMediaPlayer.setVolume(f2 * 0.18f, f2 * 0.18f);
            }
        }
    }

    /* JADX INFO: renamed from: E2 */
    private boolean m333E2() {
        return ((AudioManager) m344B2().getSystemService("audio")).isWiredHeadsetOn();
    }

    /* JADX INFO: renamed from: F2 */
    private boolean m334F2(String str) {
        ii70.d().c("ExtAudioWrapper", "ExtAudioWrapper startSurroundMusic: " + str);
        this.f215l = str;
        IjkMediaPlayer ijkMediaPlayer = this.f216m;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
            this.f216m.release();
            this.f216m = null;
        }
        if (this.f215l != null) {
            try {
                IjkMediaPlayer ijkMediaPlayer2 = new IjkMediaPlayer(m344B2());
                this.f216m = ijkMediaPlayer2;
                ijkMediaPlayer2.setOnPreparedListener(this.f205R);
                this.f216m.setOnCompletionListener(this.f206S);
                this.f216m.setOnErrorListener(this.f207T);
                this.f216m.setOnBufferingUpdateListener(this.f208U);
                this.f216m.setOnInfoListener(this.f209V);
                this.f216m.setOnSeekCompleteListener(this.f210W);
                if (this.f212Y) {
                    this.f216m.setMediaDataCallback(this.f211X);
                }
                if (this.f203P) {
                    this.f216m.setMediaDataCallback(this.f213Z);
                }
                this.f216m.setDataSource(this.f215l.toString());
                this.f216m.setMediaDateCallbackFlags(1);
                this.f216m.setPropertyLong(20024, 44100L);
                int i = this.f3280f;
                IjkMediaPlayer ijkMediaPlayer3 = this.f216m;
                if (i == 2) {
                    ijkMediaPlayer3.setPropertyLong(20022, i);
                    this.f216m.setPropertyLong(20023, 3L);
                } else {
                    ijkMediaPlayer3.setPropertyLong(20022, 1L);
                }
                this.f216m.prepareAsync();
            } catch (IOException unused) {
                ii70.d().c("ExtAudioWrapper", "Mediaplayer Unable to open content: " + this.f215l);
            } catch (IllegalArgumentException unused2) {
                ii70.d().c("ExtAudioWrapper", "Mediaplayer Unable to open content: " + this.f215l);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: M2 */
    private void m335M2() {
        InterfaceC0020i interfaceC0020i = this.f227w;
        if (interfaceC0020i == null) {
            return;
        }
        int streamerType = interfaceC0020i.getStreamerType();
        int i = 3;
        if (streamerType != 0 && !m333E2() && (streamerType != 2 ? streamerType != 3 || !fjx.R().J() : !fjx.R().D())) {
            i = 0;
        }
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            r3rVar.m10534U(i);
        }
        qb1 qb1Var = this.f204Q;
        if (qb1Var != null) {
            qb1Var.m10329t(i);
        }
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ ab1 m342y2(ExtAudioWrapper extAudioWrapper) {
        extAudioWrapper.getClass();
        return null;
    }

    /* JADX INFO: renamed from: B2 */
    public Context m344B2() {
        WeakReference<Context> weakReference = this.f217n;
        if (weakReference == null) {
            return g16.a;
        }
        return weakReference.get() == null ? g16.a : this.f217n.get();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    @Override // p007l.m300
    /* JADX INFO: renamed from: C */
    public mpd0 mo345C(mpd0 mpd0Var) {
        byte[] bArrProcessStereoAudioData;
        db1 db1Var;
        byte[] bArrC;
        if (mpd0Var.a()) {
            if (this.f3282h == null) {
                bArrProcessStereoAudioData = null;
            } else {
                if (TextUtils.equals(this.f202O, "Momo") && fjx.R().w0() && fjx.R().x0() == 0) {
                    if (this.f200M == null) {
                        VadDetector vadDetector = new VadDetector();
                        this.f200M = vadDetector;
                        vadDetector.initVadDector(48000);
                    }
                    synchronized (this.f201N) {
                        try {
                            VadDetector vadDetector2 = this.f200M;
                            if (vadDetector2 != null) {
                                if (this.f200M.adjustSabinLevel(vadDetector2.vadDetect(mpd0Var.c(), mpd0Var.e(), this.f3280f, 44100))) {
                                    this.f3282h.setSabindenoiseLevel(this.f200M.getDenoiseLevel());
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                int i = this.f3280f;
                if (i == 1) {
                    bArrProcessStereoAudioData = this.f3282h.processAudioData(mpd0Var.c(), mpd0Var.e());
                } else if (i == 2) {
                    bArrProcessStereoAudioData = this.f3282h.processStereoAudioData(mpd0Var.c(), mpd0Var.e());
                } else {
                    bArrProcessStereoAudioData = null;
                }
            }
            if (!this.f3285k && this.f212Y && this.f226v && (db1Var = this.f228x) != null) {
                if (this.f3280f == 1 && db1Var.m8880b() == 2) {
                    bArrC = bArrProcessStereoAudioData != null ? m300.m9856o2(bArrProcessStereoAudioData, bArrProcessStereoAudioData.length) : m300.m9856o2(mpd0Var.c(), mpd0Var.e());
                } else {
                    bArrC = bArrProcessStereoAudioData != null ? bArrProcessStereoAudioData : mpd0Var.c();
                }
                this.f228x.m8881c(bArrC, bArrC.length);
            }
            if (TextUtils.equals(this.f202O, "Momo")) {
                if (!this.f3285k) {
                    return bArrProcessStereoAudioData != null ? super.mo345C(new mpd0(bArrProcessStereoAudioData, mpd0Var.d(), this.f3280f)) : super.mo345C(mpd0Var);
                }
                byte[] bArr = new byte[mpd0Var.e()];
                this.f230z = bArr;
                return super.mo345C(new mpd0(bArr, mpd0Var.d(), this.f3280f));
            }
            if (bArrProcessStereoAudioData != null) {
                return this.f195H == 1 ? super.mo345C(new mpd0(bArrProcessStereoAudioData, mpd0Var.d(), this.f3280f)) : new mpd0(bArrProcessStereoAudioData, mpd0Var.d(), this.f3280f);
            }
        }
        return mpd0Var;
    }

    /* JADX INFO: renamed from: C2 */
    public za1 m346C2() {
        return this.f225u;
    }

    /* JADX INFO: renamed from: D2 */
    public boolean m347D2() {
        int i;
        return (this.f216m == null || (i = this.f222r) == -1 || i == 0 || i == 1) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public void m348F(String str, String str2) {
        if (this.f199L == null) {
            this.f199L = new r3r(str2, this.f3278d, this.f3280f, this.f3282h);
        }
        if (this.f199L != null) {
            r3r.m10496Z(this.f225u);
        }
        m335M2();
        this.f199L.m10537X(str, str2);
    }

    /* JADX INFO: renamed from: G1 */
    public void m349G1(za1 za1Var) {
        this.f225u = za1Var;
        if (this.f199L != null) {
            r3r.m10496Z(za1Var);
        }
    }

    /* JADX INFO: renamed from: G2 */
    public void m350G2() {
        WeakReference<Context> weakReference = this.f217n;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public void m351H2() {
        r3r.m10496Z(null);
        r3r.m10493Q();
    }

    /* JADX INFO: renamed from: I */
    public void m352I() {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset_ex();
        }
    }

    /* JADX INFO: renamed from: I2 */
    public void m353I2(int i, int i2, int i3, String str) {
        boolean z = (this.f3276b == i && this.f3278d == i2 && this.f3280f == i3 && this.f202O.equals(str)) ? false : true;
        if (z || this.f3282h == null) {
            ii70.d().c("ExtAudioWrapper", "setAudioRecorderBuffSize: name:" + str + " , channel:" + i3);
            this.f3276b = i;
            this.f3278d = i2;
            this.f3280f = i3;
            this.f3281g = ByteBuffer.allocate(i);
            this.f202O = str;
            AudioProcess audioProcess = this.f3282h;
            if (audioProcess == null) {
                this.f3282h = new AudioProcess();
            } else if (z) {
                audioProcess.release();
                this.f3282h = new AudioProcess();
            }
            this.f3282h.openSabineEf(this.f3278d, this.f3280f, this.f3276b / 2);
            this.f3282h.setSlaveAudioGain(1.0f);
            this.f3282h.setSlaveAudioLevel(1.0f);
            this.f3282h.setMasterAudioLevel(1.0f);
            m384j0(this.f192E, this.f191D);
            m372b0(this.f193F, this.f194G);
            m400y0(this.f190C, this.f189B);
            m380f0(this.f198K);
            db1 db1Var = this.f228x;
            if (db1Var != null) {
                db1Var.m8879a();
                this.f228x = new db1(this.f3278d, this.f3280f);
            }
            r3r r3rVar = this.f199L;
            if (r3rVar != null) {
                r3rVar.m10539c0(this.f3282h, this.f3280f);
            }
            qb1 qb1Var = this.f204Q;
            if (qb1Var != null) {
                qb1Var.m10332x(this.f3282h, this.f3280f);
            }
        }
    }

    /* JADX INFO: renamed from: J2 */
    public void m354J2(@NonNull InterfaceC0020i interfaceC0020i) {
        this.f227w = interfaceC0020i;
        m358N2();
    }

    /* JADX INFO: renamed from: K2 */
    public boolean m355K2(int i, String str, long j, long j2, boolean z, boolean z2) {
        if (this.f204Q == null) {
            this.f204Q = new qb1(this.f3282h);
            m335M2();
            this.f204Q.m10324o(this.f3278d, this.f3279e, this.f3280f);
            rb1 rb1Var = this.f220p0;
            if (rb1Var != null) {
                this.f204Q.m10328s(rb1Var);
            }
        }
        return this.f204Q.m10322m(i, str, j, j2, z, z2);
    }

    /* JADX INFO: renamed from: L2 */
    public void m356L2() {
        try {
            if (m344B2() != null) {
                if (this.f218o != null) {
                    m344B2().unregisterReceiver(this.f218o);
                    this.f218o.m405a();
                    this.f218o = null;
                }
                if (this.f219p != null) {
                    m344B2().unregisterReceiver(this.f219p);
                    this.f219p.m404a();
                    this.f219p = null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: N1 */
    public void m357N1() {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            r3rVar.m10538b0();
        }
    }

    /* JADX INFO: renamed from: N2 */
    public void m358N2() {
        m335M2();
    }

    /* JADX INFO: renamed from: O1 */
    public boolean m359O1(String str) {
        InterfaceC0020i interfaceC0020i = this.f227w;
        if (interfaceC0020i == null) {
            return true;
        }
        interfaceC0020i.mo324a(str);
        this.f188A = true;
        if (this.f227w.getStreamerType() == 0) {
            return m334F2(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m360P() {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset();
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m361Q(int i, float f, float f2) {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_peq_Shelving(i, f, f2);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m362R1(int i) {
        qb1 qb1Var = this.f204Q;
        if (qb1Var != null) {
            qb1Var.m10326q(i);
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m363S1(boolean z) {
        this.f197J = z;
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.setElcEffect(z);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m364T(int i, int i2) {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.adjustEf(i, i2);
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m365U1(float f) {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_ans(f);
        }
    }

    @Override // p007l.m300
    /* JADX INFO: renamed from: W1 */
    public void mo367W1(float f) {
        this.f229y = 0.8f * f;
        super.mo367W1(f);
        m332A2();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m368Y0(long j, boolean z) {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            r3rVar.m10529N((int) j, z);
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC0021a
    /* JADX INFO: renamed from: a */
    public void mo369a(boolean z) {
        this.f3285k = z;
    }

    @Override // p007l.m300, com.momo.piplinemomoext.input.audio.InterfaceC0021a
    /* JADX INFO: renamed from: a1 */
    public void mo370a1() {
        super.mo370a1();
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC0021a
    /* JADX INFO: renamed from: b */
    public void mo371b(boolean z) {
        this.f196I = z;
    }

    /* JADX INFO: renamed from: b0 */
    public void m372b0(int i, boolean z) {
        this.f193F = i;
        this.f194G = z;
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.adjustAef(i, z);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m373b2() {
        InterfaceC0020i interfaceC0020i = this.f227w;
        if (interfaceC0020i != null) {
            this.f188A = false;
            this.f203P = false;
            interfaceC0020i.mo325b();
            IjkMediaPlayer ijkMediaPlayer = this.f216m;
            if (ijkMediaPlayer != null) {
                ijkMediaPlayer.stop();
                this.f216m.release();
                this.f216m = null;
            }
            AudioProcess audioProcess = this.f3282h;
            if (audioProcess != null) {
                audioProcess.clear();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public long m374c() {
        IjkMediaPlayer ijkMediaPlayer = this.f216m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public float m375d() {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            return r3rVar.m10524H();
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: d0 */
    public void m376d0(int i, float f, int i2) {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_peq_fliter(i, f, i2);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m377d1() {
        mo390p2();
    }

    /* JADX INFO: renamed from: d2 */
    public void m378d2() {
        qb1 qb1Var = this.f204Q;
        if (qb1Var != null) {
            qb1Var.m10325p();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m379e1(int i, int i2, float f) {
        if (i == 2 || i == 3) {
            eyx.c().g(new Object[]{"nMode:" + i + ",idx:" + i2});
            fjx.R().C1(0);
        }
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet(i, i2, f);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m380f0(int i) {
        this.f198K = i;
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.setAudioEffectType(i);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m381g1(String str) {
        InterfaceC0020i interfaceC0020i = this.f227w;
        if (interfaceC0020i == null) {
            return true;
        }
        interfaceC0020i.mo324a(str);
        this.f188A = true;
        return m334F2(str);
    }

    public long getMusicDuration() {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            return r3rVar.m10523G();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: i1 */
    public void m382i1(int i, float f) {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_reverb(i, f);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m383j() {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        if (m347D2() && this.f216m.isPlaying()) {
            this.f216m.pause();
            this.f222r = 4;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m384j0(int i, boolean z) {
        this.f192E = i;
        this.f191D = z;
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.adjustTune(i, z);
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC0021a
    /* JADX INFO: renamed from: l */
    public void mo385l(int i) {
        this.f195H = i;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m386l0(int i, String str, boolean z, boolean z2) {
        return m355K2(i, str, 0L, 0L, z, z2);
    }

    /* JADX INFO: renamed from: n1 */
    public void m387n1(int i, float f, float f2, float f3) {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_peq_peak(i, f, f2, f3);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m388o0() {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            r3rVar.m10531P();
            this.f199L = null;
        }
        m351H2();
    }

    /* JADX INFO: renamed from: p1 */
    public void m389p1() {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            r3rVar.m10532S();
        }
    }

    @Override // p007l.m300
    /* JADX INFO: renamed from: p2 */
    public void mo390p2() {
        m356L2();
        super.mo390p2();
        this.f203P = false;
        IjkMediaPlayer ijkMediaPlayer = this.f216m;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setMediaDataCallback((IjkMediaPlayer.MediaDateCallback) null);
            this.f216m.stop();
            this.f216m.release();
            this.f222r = 0;
            this.f216m = null;
        }
        db1 db1Var = this.f228x;
        if (db1Var != null) {
            db1Var.m8879a();
            this.f228x = null;
        }
        this.f227w = null;
        this.f218o = null;
        this.f219p = null;
        if (fjx.R().w0() && fjx.R().x0() == 0) {
            synchronized (this.f201N) {
                try {
                    VadDetector vadDetector = this.f200M;
                    if (vadDetector != null) {
                        vadDetector.releaseVad();
                        this.f200M = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m350G2();
        this.f225u = null;
    }

    /* JADX INFO: renamed from: q */
    public void m391q() {
        if (m347D2()) {
            this.f216m.start();
            this.f222r = 3;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m392q0(long j) {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            r3rVar.m10533T((int) j);
        }
    }

    /* JADX INFO: renamed from: r */
    public long m393r() {
        IjkMediaPlayer ijkMediaPlayer = this.f216m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC0021a
    /* JADX INFO: renamed from: s1 */
    public void mo394s1(int i) {
        m353I2(this.f3276b, this.f3278d, i, this.f202O);
    }

    public void setMusicPitch(int i) {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            r3rVar.m10535V(i);
        }
    }

    public void setMusicVolume(float f) {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            r3rVar.m10536W(f);
        }
    }

    public void stopSurroundMusic() {
        InterfaceC0020i interfaceC0020i = this.f227w;
        if (interfaceC0020i != null) {
            this.f188A = false;
            interfaceC0020i.mo325b();
            if (this.f227w.getStreamerType() == 0 || this.f227w.getStreamerType() == 2) {
                IjkMediaPlayer ijkMediaPlayer = this.f216m;
                if (ijkMediaPlayer != null) {
                    ijkMediaPlayer.stop();
                    this.f216m.release();
                    this.f216m = null;
                }
                AudioProcess audioProcess = this.f3282h;
                if (audioProcess != null) {
                    audioProcess.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m395v1(long j) {
        if (this.f199L != null) {
            m358N2();
            this.f199L.m10528M((int) j);
        }
    }

    /* JADX INFO: renamed from: w */
    public long m396w() {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            return r3rVar.m10522F();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: w0 */
    public void m397w0(long j) {
        if (!m347D2()) {
            this.f223s = j;
        } else {
            this.f216m.seekTo(j);
            this.f223s = 0L;
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m398w1() {
        r3r r3rVar = this.f199L;
        if (r3rVar != null) {
            r3rVar.m10527L();
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC0021a
    /* JADX INFO: renamed from: x0 */
    public void mo399x0(boolean z) {
        this.f203P = z;
    }

    /* JADX INFO: renamed from: y0 */
    public void m400y0(int i, boolean z) {
        this.f190C = i;
        this.f189B = z;
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.adjustEQ(i, z);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public float m401y1() {
        return this.f229y;
    }

    /* JADX INFO: renamed from: z */
    public void m402z(boolean z) {
        db1 db1Var;
        this.f226v = z;
        if (!z && (db1Var = this.f228x) != null) {
            db1Var.m8879a();
            this.f228x = null;
        }
        if (this.f226v && this.f228x == null) {
            this.f228x = new db1(this.f3278d, 2);
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC0021a
    /* JADX INFO: renamed from: z1 */
    public void mo403z1(boolean z) {
        m356L2();
        try {
            C0012a c0012a = null;
            this.f218o = new HeadsetPlugReceiver(this, c0012a);
            this.f219p = new BlueConnectStateBroadcastReceiver(this, c0012a);
            IntentFilter intentFilter = new IntentFilter();
            this.f221q = intentFilter;
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            if (m344B2() != null) {
                ii5.l(m344B2(), this.f218o, this.f221q);
                ii5.l(m344B2(), this.f219p, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                AudioManager audioManager = (AudioManager) m344B2().getSystemService("audio");
                if (z) {
                    this.f212Y = true;
                } else {
                    this.f212Y = audioManager.isWiredHeadsetOn();
                }
            }
        } catch (Exception unused) {
        }
    }

    public class BlueConnectStateBroadcastReceiver extends BroadcastReceiver {
        private BlueConnectStateBroadcastReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m404a() {
            try {
                super.finalize();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
            if (intExtra == 0) {
                ii70.d().c("HeadsetPlugReceiver", "STATE_DISCONNECTED");
            } else {
                if (intExtra != 2) {
                    return;
                }
                ii70.d().c("HeadsetPlugReceiver", "STATE_CONNECTED");
            }
        }

        public /* synthetic */ BlueConnectStateBroadcastReceiver(ExtAudioWrapper extAudioWrapper, C0012a c0012a) {
            this();
        }
    }

    public class HeadsetPlugReceiver extends BroadcastReceiver {
        private HeadsetPlugReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m405a() {
            try {
                ExtAudioWrapper.this.m388o0();
                super.finalize();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.hasExtra("state")) {
                if (intent.getIntExtra("state", 0) == 0) {
                    ExtAudioWrapper extAudioWrapper = ExtAudioWrapper.this;
                    if (extAudioWrapper.f216m != null && extAudioWrapper.f227w.getStreamerType() != 2) {
                        ExtAudioWrapper.this.f216m.setMediaDataCallback((IjkMediaPlayer.MediaDateCallback) null);
                    }
                    ExtAudioWrapper.this.f212Y = false;
                    ExtAudioWrapper.m342y2(ExtAudioWrapper.this);
                    ii70.d().c("ExtAudioWrapper", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + ExtAudioWrapper.this.f212Y);
                    ExtAudioWrapper.this.m332A2();
                    ExtAudioWrapper.this.m358N2();
                    return;
                }
                if (intent.getIntExtra("state", 0) == 1) {
                    ExtAudioWrapper extAudioWrapper2 = ExtAudioWrapper.this;
                    IjkMediaPlayer ijkMediaPlayer = extAudioWrapper2.f216m;
                    if (ijkMediaPlayer != null) {
                        ijkMediaPlayer.setMediaDataCallback(extAudioWrapper2.f211X);
                    }
                    ExtAudioWrapper.this.f212Y = true;
                    ExtAudioWrapper.m342y2(ExtAudioWrapper.this);
                    ExtAudioWrapper.this.m332A2();
                    ExtAudioWrapper.this.m358N2();
                    ii70.d().c("ExtAudioWrapper", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + ExtAudioWrapper.this.f212Y);
                }
            }
        }

        public /* synthetic */ HeadsetPlugReceiver(ExtAudioWrapper extAudioWrapper, C0012a c0012a) {
            this();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m366V(ab1 ab1Var) {
    }
}
