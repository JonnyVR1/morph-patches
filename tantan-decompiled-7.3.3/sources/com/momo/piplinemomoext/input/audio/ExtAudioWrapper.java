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
import p153l.b7y;
import p153l.csx;
import p153l.fb1;
import p153l.gb1;
import p153l.hb1;
import p153l.jc00;
import p153l.jj5;
import p153l.kb1;
import p153l.l26;
import p153l.oq70;
import p153l.oxd0;
import p153l.s5r;
import p153l.xb1;
import p153l.yb1;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes8.dex */
public class ExtAudioWrapper extends jc00 implements fb1, InterfaceC4260a {

    /* JADX INFO: renamed from: A */
    private boolean f15208A;

    /* JADX INFO: renamed from: B */
    private boolean f15209B;

    /* JADX INFO: renamed from: C */
    private int f15210C;

    /* JADX INFO: renamed from: D */
    private boolean f15211D;

    /* JADX INFO: renamed from: E */
    private int f15212E;

    /* JADX INFO: renamed from: F */
    private int f15213F;

    /* JADX INFO: renamed from: G */
    private boolean f15214G;

    /* JADX INFO: renamed from: H */
    private int f15215H;

    /* JADX INFO: renamed from: I */
    private boolean f15216I;

    /* JADX INFO: renamed from: J */
    private boolean f15217J;

    /* JADX INFO: renamed from: K */
    private int f15218K;

    /* JADX INFO: renamed from: L */
    private s5r f15219L;

    /* JADX INFO: renamed from: M */
    private VadDetector f15220M;

    /* JADX INFO: renamed from: N */
    private Object f15221N;

    /* JADX INFO: renamed from: O */
    private String f15222O;

    /* JADX INFO: renamed from: P */
    private boolean f15223P;

    /* JADX INFO: renamed from: Q */
    private xb1 f15224Q;

    /* JADX INFO: renamed from: R */
    IMediaPlayer.OnPreparedListener f15225R;

    /* JADX INFO: renamed from: S */
    private IMediaPlayer.OnCompletionListener f15226S;

    /* JADX INFO: renamed from: T */
    private IMediaPlayer.OnErrorListener f15227T;

    /* JADX INFO: renamed from: U */
    private IMediaPlayer.OnBufferingUpdateListener f15228U;

    /* JADX INFO: renamed from: V */
    private IMediaPlayer.OnInfoListener f15229V;

    /* JADX INFO: renamed from: W */
    private IMediaPlayer.OnSeekCompleteListener f15230W;

    /* JADX INFO: renamed from: X */
    private IjkMediaPlayer.MediaDateCallback f15231X;

    /* JADX INFO: renamed from: Y */
    private boolean f15232Y;

    /* JADX INFO: renamed from: Z */
    private IjkMediaPlayer.MediaDateCallback f15233Z;

    /* JADX INFO: renamed from: k0 */
    private int f15234k0;

    /* JADX INFO: renamed from: l */
    private String f15235l;

    /* JADX INFO: renamed from: m */
    IjkMediaPlayer f15236m;

    /* JADX INFO: renamed from: n */
    private WeakReference<Context> f15237n;

    /* JADX INFO: renamed from: o */
    private HeadsetPlugReceiver f15238o;

    /* JADX INFO: renamed from: p */
    private BlueConnectStateBroadcastReceiver f15239p;

    /* JADX INFO: renamed from: p0 */
    private yb1 f15240p0;

    /* JADX INFO: renamed from: q */
    IntentFilter f15241q;

    /* JADX INFO: renamed from: r */
    private int f15242r;

    /* JADX INFO: renamed from: s */
    private long f15243s;

    /* JADX INFO: renamed from: t */
    private NonBlockingAudioTrack f15244t;

    /* JADX INFO: renamed from: u */
    protected gb1 f15245u;

    /* JADX INFO: renamed from: v */
    private boolean f15246v;

    /* JADX INFO: renamed from: w */
    private InterfaceC4259i f15247w;

    /* JADX INFO: renamed from: x */
    private kb1 f15248x;

    /* JADX INFO: renamed from: y */
    private float f15249y;

    /* JADX INFO: renamed from: z */
    private byte[] f15250z;

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$a */
    public class C4251a implements IMediaPlayer.OnPreparedListener {
        public C4251a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            oq70.m168791d().m168793a("ExtAudioWrapper", "Mediaplayer onPrepared");
            ExtAudioWrapper.this.f15242r = 2;
            long j = ExtAudioWrapper.this.f15243s;
            if (j != 0) {
                ExtAudioWrapper.this.mo21130w0(j);
                ExtAudioWrapper.this.mo21124q();
            }
            ExtAudioWrapper.this.m21066A2();
            gb1 gb1Var = ExtAudioWrapper.this.f15245u;
            if (gb1Var != null) {
                gb1Var.mo19382a(null, 1, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$b */
    public class C4252b implements IMediaPlayer.OnCompletionListener {
        public C4252b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            ExtAudioWrapper.this.f15242r = 5;
            oq70.m168791d().m168793a("ExtAudioWrapper", "Mediaplayer onCompletion");
            gb1 gb1Var = ExtAudioWrapper.this.f15245u;
            if (gb1Var != null) {
                gb1Var.mo19382a(null, 2, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$c */
    public class C4253c implements IMediaPlayer.OnErrorListener {
        public C4253c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            oq70.m168791d().m168795c("ExtAudioWrapper", "Mediaplayer Error" + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
            ExtAudioWrapper.this.f15242r = -1;
            gb1 gb1Var = ExtAudioWrapper.this.f15245u;
            if (gb1Var == null) {
                return true;
            }
            gb1Var.mo19382a(null, -1, 0);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$d */
    public class C4254d implements IMediaPlayer.OnBufferingUpdateListener {
        public C4254d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$e */
    public class C4255e implements IMediaPlayer.OnInfoListener {
        public C4255e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            oq70.m168791d().m168795c("ExtAudioWrapper", "Mediaplayer onInfo: " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$f */
    public class C4256f implements IMediaPlayer.OnSeekCompleteListener {
        public C4256f() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            oq70.m168791d().m168793a("ExtAudioWrapper", "Mediaplayer onSeekComplete");
            gb1 gb1Var = ExtAudioWrapper.this.f15245u;
            if (gb1Var != null) {
                gb1Var.mo19382a(null, 3, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$g */
    public class C4257g implements IjkMediaPlayer.MediaDateCallback {
        public C4257g() {
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
        public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
            if (ExtAudioWrapper.this.f15247w.getStreamerType() != 2) {
                ExtAudioWrapper extAudioWrapper = ExtAudioWrapper.this;
                extAudioWrapper.m144338G0(bArr, i, i2, ijkMediaPlayer, extAudioWrapper.f120010f);
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$h */
    public class C4258h implements IjkMediaPlayer.MediaDateCallback {
        public C4258h() {
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
        public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
            ExtAudioWrapper extAudioWrapper = ExtAudioWrapper.this;
            extAudioWrapper.m144338G0(bArr, i, i2, ijkMediaPlayer, extAudioWrapper.f120010f);
        }
    }

    /* JADX INFO: renamed from: com.momo.piplinemomoext.input.audio.ExtAudioWrapper$i */
    public interface InterfaceC4259i {
        /* JADX INFO: renamed from: a */
        void mo21059a(String str);

        /* JADX INFO: renamed from: b */
        void mo21060b();

        int getStreamerType();
    }

    public ExtAudioWrapper(int i, int i2, Context context, boolean z) {
        super(2048, i, i2, true);
        this.f15236m = null;
        this.f15238o = null;
        this.f15239p = null;
        this.f15241q = null;
        this.f15242r = 0;
        this.f15244t = null;
        this.f15246v = false;
        this.f15249y = 1.0f;
        this.f15250z = null;
        this.f15208A = false;
        this.f15209B = false;
        this.f15210C = 0;
        this.f15211D = false;
        this.f15212E = 0;
        this.f15213F = 0;
        this.f15214G = false;
        this.f15215H = 0;
        this.f15216I = false;
        this.f15217J = false;
        this.f15218K = 0;
        this.f15219L = null;
        this.f15220M = null;
        this.f15221N = new Object();
        this.f15222O = "Momo";
        this.f15223P = false;
        this.f15224Q = null;
        this.f15225R = new C4251a();
        this.f15226S = new C4252b();
        this.f15227T = new C4253c();
        this.f15228U = new C4254d();
        this.f15229V = new C4255e();
        this.f15230W = new C4256f();
        this.f15231X = new C4257g();
        this.f15232Y = false;
        this.f15233Z = new C4258h();
        this.f15234k0 = 0;
        this.f15240p0 = null;
        this.f15237n = new WeakReference<>(context);
        m21089L2();
        mo21136z1(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public void m21066A2() {
        IjkMediaPlayer ijkMediaPlayer = this.f15236m;
        if (ijkMediaPlayer != null) {
            if (this.f15232Y && this.f15246v) {
                float f = this.f15249y;
                ijkMediaPlayer.setVolume(f * 0.18f, f * 0.18f);
            } else {
                float f2 = this.f15249y;
                ijkMediaPlayer.setVolume(f2 * 0.18f, f2 * 0.18f);
            }
        }
    }

    /* JADX INFO: renamed from: E2 */
    private boolean m21067E2() {
        return ((AudioManager) m21078B2().getSystemService("audio")).isWiredHeadsetOn();
    }

    /* JADX INFO: renamed from: F2 */
    private boolean m21068F2(String str) {
        oq70.m168791d().m168795c("ExtAudioWrapper", "ExtAudioWrapper startSurroundMusic: " + str);
        this.f15235l = str;
        IjkMediaPlayer ijkMediaPlayer = this.f15236m;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
            this.f15236m.release();
            this.f15236m = null;
        }
        if (this.f15235l != null) {
            try {
                IjkMediaPlayer ijkMediaPlayer2 = new IjkMediaPlayer(m21078B2());
                this.f15236m = ijkMediaPlayer2;
                ijkMediaPlayer2.setOnPreparedListener(this.f15225R);
                this.f15236m.setOnCompletionListener(this.f15226S);
                this.f15236m.setOnErrorListener(this.f15227T);
                this.f15236m.setOnBufferingUpdateListener(this.f15228U);
                this.f15236m.setOnInfoListener(this.f15229V);
                this.f15236m.setOnSeekCompleteListener(this.f15230W);
                if (this.f15232Y) {
                    this.f15236m.setMediaDataCallback(this.f15231X);
                }
                if (this.f15223P) {
                    this.f15236m.setMediaDataCallback(this.f15233Z);
                }
                this.f15236m.setDataSource(this.f15235l.toString());
                this.f15236m.setMediaDateCallbackFlags(1);
                this.f15236m.setPropertyLong(20024, 44100L);
                int i = this.f120010f;
                IjkMediaPlayer ijkMediaPlayer3 = this.f15236m;
                if (i == 2) {
                    ijkMediaPlayer3.setPropertyLong(20022, i);
                    this.f15236m.setPropertyLong(20023, 3L);
                } else {
                    ijkMediaPlayer3.setPropertyLong(20022, 1L);
                }
                this.f15236m.prepareAsync();
            } catch (IOException unused) {
                oq70.m168791d().m168795c("ExtAudioWrapper", "Mediaplayer Unable to open content: " + this.f15235l);
            } catch (IllegalArgumentException unused2) {
                oq70.m168791d().m168795c("ExtAudioWrapper", "Mediaplayer Unable to open content: " + this.f15235l);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: M2 */
    private void m21069M2() {
        InterfaceC4259i interfaceC4259i = this.f15247w;
        if (interfaceC4259i == null) {
            return;
        }
        int streamerType = interfaceC4259i.getStreamerType();
        int i = 3;
        if (streamerType != 0 && !m21067E2() && (streamerType != 2 ? streamerType != 3 || !csx.m112235R().m112263J() : !csx.m112235R().m112245D())) {
            i = 0;
        }
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            s5rVar.m184788U(i);
        }
        xb1 xb1Var = this.f15224Q;
        if (xb1Var != null) {
            xb1Var.m209939t(i);
        }
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ hb1 m21076y2(ExtAudioWrapper extAudioWrapper) {
        extAudioWrapper.getClass();
        return null;
    }

    /* JADX INFO: renamed from: B2 */
    public Context m21078B2() {
        WeakReference<Context> weakReference = this.f15237n;
        if (weakReference == null) {
            return l26.f129743a;
        }
        return weakReference.get() == null ? l26.f129743a : this.f15237n.get();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    @Override // p153l.jc00, p153l.fb1
    /* JADX INFO: renamed from: C */
    public oxd0 mo19373C(oxd0 oxd0Var) {
        byte[] bArrProcessStereoAudioData;
        kb1 kb1Var;
        byte[] bArrM169687c;
        if (oxd0Var.m169685a()) {
            if (this.f120012h == null) {
                bArrProcessStereoAudioData = null;
            } else {
                if (TextUtils.equals(this.f15222O, "Momo") && csx.m112235R().m112394w0() && csx.m112235R().m112397x0() == 0) {
                    if (this.f15220M == null) {
                        VadDetector vadDetector = new VadDetector();
                        this.f15220M = vadDetector;
                        vadDetector.initVadDector(48000);
                    }
                    synchronized (this.f15221N) {
                        try {
                            VadDetector vadDetector2 = this.f15220M;
                            if (vadDetector2 != null) {
                                if (this.f15220M.adjustSabinLevel(vadDetector2.vadDetect(oxd0Var.m169687c(), oxd0Var.m169689e(), this.f120010f, 44100))) {
                                    this.f120012h.setSabindenoiseLevel(this.f15220M.getDenoiseLevel());
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                int i = this.f120010f;
                if (i == 1) {
                    bArrProcessStereoAudioData = this.f120012h.processAudioData(oxd0Var.m169687c(), oxd0Var.m169689e());
                } else if (i == 2) {
                    bArrProcessStereoAudioData = this.f120012h.processStereoAudioData(oxd0Var.m169687c(), oxd0Var.m169689e());
                } else {
                    bArrProcessStereoAudioData = null;
                }
            }
            if (!this.f120015k && this.f15232Y && this.f15246v && (kb1Var = this.f15248x) != null) {
                if (this.f120010f == 1 && kb1Var.m149022b() == 2) {
                    bArrM169687c = bArrProcessStereoAudioData != null ? jc00.m144336o2(bArrProcessStereoAudioData, bArrProcessStereoAudioData.length) : jc00.m144336o2(oxd0Var.m169687c(), oxd0Var.m169689e());
                } else {
                    bArrM169687c = bArrProcessStereoAudioData != null ? bArrProcessStereoAudioData : oxd0Var.m169687c();
                }
                this.f15248x.m149023c(bArrM169687c, bArrM169687c.length);
            }
            if (TextUtils.equals(this.f15222O, "Momo")) {
                if (!this.f120015k) {
                    return bArrProcessStereoAudioData != null ? super.mo19373C(new oxd0(bArrProcessStereoAudioData, oxd0Var.m169688d(), this.f120010f)) : super.mo19373C(oxd0Var);
                }
                byte[] bArr = new byte[oxd0Var.m169689e()];
                this.f15250z = bArr;
                return super.mo19373C(new oxd0(bArr, oxd0Var.m169688d(), this.f120010f));
            }
            if (bArrProcessStereoAudioData != null) {
                return this.f15215H == 1 ? super.mo19373C(new oxd0(bArrProcessStereoAudioData, oxd0Var.m169688d(), this.f120010f)) : new oxd0(bArrProcessStereoAudioData, oxd0Var.m169688d(), this.f120010f);
            }
        }
        return oxd0Var;
    }

    /* JADX INFO: renamed from: C2 */
    public gb1 m21079C2() {
        return this.f15245u;
    }

    /* JADX INFO: renamed from: D2 */
    public boolean m21080D2() {
        int i;
        return (this.f15236m == null || (i = this.f15242r) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: F */
    public void mo21081F(String str, String str2) {
        if (this.f15219L == null) {
            this.f15219L = new s5r(str2, this.f120008d, this.f120010f, this.f120012h);
        }
        if (this.f15219L != null) {
            s5r.m184750Z(this.f15245u);
        }
        m21069M2();
        this.f15219L.m184791X(str, str2);
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: G1 */
    public void mo21082G1(gb1 gb1Var) {
        this.f15245u = gb1Var;
        if (this.f15219L != null) {
            s5r.m184750Z(gb1Var);
        }
    }

    /* JADX INFO: renamed from: G2 */
    public void m21083G2() {
        WeakReference<Context> weakReference = this.f15237n;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public void m21084H2() {
        s5r.m184750Z(null);
        s5r.m184747Q();
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: I */
    public void mo21085I() {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset_ex();
        }
    }

    /* JADX INFO: renamed from: I2 */
    public void m21086I2(int i, int i2, int i3, String str) {
        boolean z = (this.f120006b == i && this.f120008d == i2 && this.f120010f == i3 && this.f15222O.equals(str)) ? false : true;
        if (z || this.f120012h == null) {
            oq70.m168791d().m168795c("ExtAudioWrapper", "setAudioRecorderBuffSize: name:" + str + " , channel:" + i3);
            this.f120006b = i;
            this.f120008d = i2;
            this.f120010f = i3;
            this.f120011g = ByteBuffer.allocate(i);
            this.f15222O = str;
            AudioProcess audioProcess = this.f120012h;
            if (audioProcess == null) {
                this.f120012h = new AudioProcess();
            } else if (z) {
                audioProcess.release();
                this.f120012h = new AudioProcess();
            }
            this.f120012h.openSabineEf(this.f120008d, this.f120010f, this.f120006b / 2);
            this.f120012h.setSlaveAudioGain(1.0f);
            this.f120012h.setSlaveAudioLevel(1.0f);
            this.f120012h.setMasterAudioLevel(1.0f);
            mo21117j0(this.f15212E, this.f15211D);
            mo21105b0(this.f15213F, this.f15214G);
            mo21133y0(this.f15210C, this.f15209B);
            mo21113f0(this.f15218K);
            kb1 kb1Var = this.f15248x;
            if (kb1Var != null) {
                kb1Var.m149021a();
                this.f15248x = new kb1(this.f120008d, this.f120010f);
            }
            s5r s5rVar = this.f15219L;
            if (s5rVar != null) {
                s5rVar.m184796c0(this.f120012h, this.f120010f);
            }
            xb1 xb1Var = this.f15224Q;
            if (xb1Var != null) {
                xb1Var.m209942x(this.f120012h, this.f120010f);
            }
        }
    }

    /* JADX INFO: renamed from: J2 */
    public void m21087J2(@NonNull InterfaceC4259i interfaceC4259i) {
        this.f15247w = interfaceC4259i;
        m21091N2();
    }

    /* JADX INFO: renamed from: K2 */
    public boolean m21088K2(int i, String str, long j, long j2, boolean z, boolean z2) {
        if (this.f15224Q == null) {
            this.f15224Q = new xb1(this.f120012h);
            m21069M2();
            this.f15224Q.m209934o(this.f120008d, this.f120009e, this.f120010f);
            yb1 yb1Var = this.f15240p0;
            if (yb1Var != null) {
                this.f15224Q.m209938s(yb1Var);
            }
        }
        return this.f15224Q.m209932m(i, str, j, j2, z, z2);
    }

    /* JADX INFO: renamed from: L2 */
    public void m21089L2() {
        try {
            if (m21078B2() != null) {
                if (this.f15238o != null) {
                    m21078B2().unregisterReceiver(this.f15238o);
                    this.f15238o.m21138a();
                    this.f15238o = null;
                }
                if (this.f15239p != null) {
                    m21078B2().unregisterReceiver(this.f15239p);
                    this.f15239p.m21137a();
                    this.f15239p = null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: N1 */
    public void mo21090N1() {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            s5rVar.m184794b0();
        }
    }

    /* JADX INFO: renamed from: N2 */
    public void m21091N2() {
        m21069M2();
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: O1 */
    public boolean mo21092O1(String str) {
        InterfaceC4259i interfaceC4259i = this.f15247w;
        if (interfaceC4259i == null) {
            return true;
        }
        interfaceC4259i.mo21059a(str);
        this.f15208A = true;
        if (this.f15247w.getStreamerType() == 0) {
            return m21068F2(str);
        }
        return true;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: P */
    public void mo21093P() {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset();
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: Q */
    public void mo21094Q(int i, float f, float f2) {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_peq_Shelving(i, f, f2);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: R1 */
    public void mo21095R1(int i) {
        xb1 xb1Var = this.f15224Q;
        if (xb1Var != null) {
            xb1Var.m209936q(i);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: S1 */
    public void mo21096S1(boolean z) {
        this.f15217J = z;
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.setElcEffect(z);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: T */
    public void mo21097T(int i, int i2) {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.adjustEf(i, i2);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: U1 */
    public void mo21098U1(float f) {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_ans(f);
        }
    }

    @Override // p153l.jc00, p153l.l6m
    /* JADX INFO: renamed from: W1 */
    public void mo21100W1(float f) {
        this.f15249y = 0.8f * f;
        super.mo21100W1(f);
        m21066A2();
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: Y0 */
    public void mo21101Y0(long j, boolean z) {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            s5rVar.m184783N((int) j, z);
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4260a
    /* JADX INFO: renamed from: a */
    public void mo21102a(boolean z) {
        this.f120015k = z;
    }

    @Override // p153l.jc00, com.momo.piplinemomoext.input.audio.InterfaceC4260a
    /* JADX INFO: renamed from: a1 */
    public void mo21103a1() {
        super.mo21103a1();
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4260a
    /* JADX INFO: renamed from: b */
    public void mo21104b(boolean z) {
        this.f15216I = z;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: b0 */
    public void mo21105b0(int i, boolean z) {
        this.f15213F = i;
        this.f15214G = z;
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.adjustAef(i, z);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: b2 */
    public void mo21106b2() {
        InterfaceC4259i interfaceC4259i = this.f15247w;
        if (interfaceC4259i != null) {
            this.f15208A = false;
            this.f15223P = false;
            interfaceC4259i.mo21060b();
            IjkMediaPlayer ijkMediaPlayer = this.f15236m;
            if (ijkMediaPlayer != null) {
                ijkMediaPlayer.stop();
                this.f15236m.release();
                this.f15236m = null;
            }
            AudioProcess audioProcess = this.f120012h;
            if (audioProcess != null) {
                audioProcess.clear();
            }
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: c */
    public long mo21107c() {
        IjkMediaPlayer ijkMediaPlayer = this.f15236m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: d */
    public float mo21108d() {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            return s5rVar.m184778H();
        }
        return 1.0f;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: d0 */
    public void mo21109d0(int i, float f, int i2) {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_peq_fliter(i, f, i2);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: d1 */
    public void mo21110d1() {
        mo21123p2();
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: d2 */
    public void mo21111d2() {
        xb1 xb1Var = this.f15224Q;
        if (xb1Var != null) {
            xb1Var.m209935p();
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: e1 */
    public void mo21112e1(int i, int i2, float f) {
        if (i == 2 || i == 3) {
            b7y.m102882c().m102888g("nMode:" + i + ",idx:" + i2);
            csx.m112235R().m112244C1(0);
        }
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet(i, i2, f);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: f0 */
    public void mo21113f0(int i) {
        this.f15218K = i;
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.setAudioEffectType(i);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: g1 */
    public boolean mo21114g1(String str) {
        InterfaceC4259i interfaceC4259i = this.f15247w;
        if (interfaceC4259i == null) {
            return true;
        }
        interfaceC4259i.mo21059a(str);
        this.f15208A = true;
        return m21068F2(str);
    }

    @Override // p153l.l6m
    public long getMusicDuration() {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            return s5rVar.m184777G();
        }
        return 0L;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: i1 */
    public void mo21115i1(int i, float f) {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_reverb(i, f);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: j */
    public void mo21116j() {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        if (m21080D2() && this.f15236m.isPlaying()) {
            this.f15236m.pause();
            this.f15242r = 4;
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: j0 */
    public void mo21117j0(int i, boolean z) {
        this.f15212E = i;
        this.f15211D = z;
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.adjustTune(i, z);
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4260a
    /* JADX INFO: renamed from: l */
    public void mo21118l(int i) {
        this.f15215H = i;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: l0 */
    public boolean mo21119l0(int i, String str, boolean z, boolean z2) {
        return m21088K2(i, str, 0L, 0L, z, z2);
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: n1 */
    public void mo21120n1(int i, float f, float f2, float f3) {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet_peq_peak(i, f, f2, f3);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: o0 */
    public void mo21121o0() {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            s5rVar.m184785P();
            this.f15219L = null;
        }
        m21084H2();
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: p1 */
    public void mo21122p1() {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            s5rVar.m184786S();
        }
    }

    @Override // p153l.jc00
    /* JADX INFO: renamed from: p2 */
    public void mo21123p2() {
        m21089L2();
        super.mo21123p2();
        this.f15223P = false;
        IjkMediaPlayer ijkMediaPlayer = this.f15236m;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setMediaDataCallback(null);
            this.f15236m.stop();
            this.f15236m.release();
            this.f15242r = 0;
            this.f15236m = null;
        }
        kb1 kb1Var = this.f15248x;
        if (kb1Var != null) {
            kb1Var.m149021a();
            this.f15248x = null;
        }
        this.f15247w = null;
        this.f15238o = null;
        this.f15239p = null;
        if (csx.m112235R().m112394w0() && csx.m112235R().m112397x0() == 0) {
            synchronized (this.f15221N) {
                try {
                    VadDetector vadDetector = this.f15220M;
                    if (vadDetector != null) {
                        vadDetector.releaseVad();
                        this.f15220M = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m21083G2();
        this.f15245u = null;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: q */
    public void mo21124q() {
        if (m21080D2()) {
            this.f15236m.start();
            this.f15242r = 3;
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: q0 */
    public void mo21125q0(long j) {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            s5rVar.m184787T((int) j);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: r */
    public long mo21126r() {
        IjkMediaPlayer ijkMediaPlayer = this.f15236m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4260a
    /* JADX INFO: renamed from: s1 */
    public void mo21127s1(int i) {
        m21086I2(this.f120006b, this.f120008d, i, this.f15222O);
    }

    @Override // p153l.l6m
    public void setMusicPitch(int i) {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            s5rVar.m184789V(i);
        }
    }

    @Override // p153l.l6m
    public void setMusicVolume(float f) {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            s5rVar.m184790W(f);
        }
    }

    @Override // p153l.l6m
    public void stopSurroundMusic() {
        InterfaceC4259i interfaceC4259i = this.f15247w;
        if (interfaceC4259i != null) {
            this.f15208A = false;
            interfaceC4259i.mo21060b();
            if (this.f15247w.getStreamerType() == 0 || this.f15247w.getStreamerType() == 2) {
                IjkMediaPlayer ijkMediaPlayer = this.f15236m;
                if (ijkMediaPlayer != null) {
                    ijkMediaPlayer.stop();
                    this.f15236m.release();
                    this.f15236m = null;
                }
                AudioProcess audioProcess = this.f120012h;
                if (audioProcess != null) {
                    audioProcess.clear();
                }
            }
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: v1 */
    public void mo21128v1(long j) {
        if (this.f15219L != null) {
            m21091N2();
            this.f15219L.m184782M((int) j);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: w */
    public long mo21129w() {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            return s5rVar.m184776F();
        }
        return 0L;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: w0 */
    public void mo21130w0(long j) {
        if (!m21080D2()) {
            this.f15243s = j;
        } else {
            this.f15236m.seekTo(j);
            this.f15243s = 0L;
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: w1 */
    public void mo21131w1() {
        s5r s5rVar = this.f15219L;
        if (s5rVar != null) {
            s5rVar.m184781L();
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4260a
    /* JADX INFO: renamed from: x0 */
    public void mo21132x0(boolean z) {
        this.f15223P = z;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: y0 */
    public void mo21133y0(int i, boolean z) {
        this.f15210C = i;
        this.f15209B = z;
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.adjustEQ(i, z);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: y1 */
    public float mo21134y1() {
        return this.f15249y;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: z */
    public void mo21135z(boolean z) {
        kb1 kb1Var;
        this.f15246v = z;
        if (!z && (kb1Var = this.f15248x) != null) {
            kb1Var.m149021a();
            this.f15248x = null;
        }
        if (this.f15246v && this.f15248x == null) {
            this.f15248x = new kb1(this.f120008d, 2);
        }
    }

    @Override // com.momo.piplinemomoext.input.audio.InterfaceC4260a
    /* JADX INFO: renamed from: z1 */
    public void mo21136z1(boolean z) {
        m21089L2();
        try {
            C4251a c4251a = null;
            this.f15238o = new HeadsetPlugReceiver(this, c4251a);
            this.f15239p = new BlueConnectStateBroadcastReceiver(this, c4251a);
            IntentFilter intentFilter = new IntentFilter();
            this.f15241q = intentFilter;
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            if (m21078B2() != null) {
                jj5.m145018l(m21078B2(), this.f15238o, this.f15241q);
                jj5.m145018l(m21078B2(), this.f15239p, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                AudioManager audioManager = (AudioManager) m21078B2().getSystemService("audio");
                if (z) {
                    this.f15232Y = true;
                } else {
                    this.f15232Y = audioManager.isWiredHeadsetOn();
                }
            }
        } catch (Exception unused) {
        }
    }

    public class BlueConnectStateBroadcastReceiver extends BroadcastReceiver {
        private BlueConnectStateBroadcastReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m21137a() {
            try {
                super.finalize();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
            if (intExtra == 0) {
                oq70.m168791d().m168795c("HeadsetPlugReceiver", "STATE_DISCONNECTED");
            } else {
                if (intExtra != 2) {
                    return;
                }
                oq70.m168791d().m168795c("HeadsetPlugReceiver", "STATE_CONNECTED");
            }
        }

        public /* synthetic */ BlueConnectStateBroadcastReceiver(ExtAudioWrapper extAudioWrapper, C4251a c4251a) {
            this();
        }
    }

    public class HeadsetPlugReceiver extends BroadcastReceiver {
        private HeadsetPlugReceiver() {
        }

        /* JADX INFO: renamed from: a */
        public void m21138a() {
            try {
                ExtAudioWrapper.this.mo21121o0();
                super.finalize();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.hasExtra("state")) {
                if (intent.getIntExtra("state", 0) == 0) {
                    ExtAudioWrapper extAudioWrapper = ExtAudioWrapper.this;
                    if (extAudioWrapper.f15236m != null && extAudioWrapper.f15247w.getStreamerType() != 2) {
                        ExtAudioWrapper.this.f15236m.setMediaDataCallback(null);
                    }
                    ExtAudioWrapper.this.f15232Y = false;
                    ExtAudioWrapper.m21076y2(ExtAudioWrapper.this);
                    oq70.m168791d().m168795c("ExtAudioWrapper", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + ExtAudioWrapper.this.f15232Y);
                    ExtAudioWrapper.this.m21066A2();
                    ExtAudioWrapper.this.m21091N2();
                    return;
                }
                if (intent.getIntExtra("state", 0) == 1) {
                    ExtAudioWrapper extAudioWrapper2 = ExtAudioWrapper.this;
                    IjkMediaPlayer ijkMediaPlayer = extAudioWrapper2.f15236m;
                    if (ijkMediaPlayer != null) {
                        ijkMediaPlayer.setMediaDataCallback(extAudioWrapper2.f15231X);
                    }
                    ExtAudioWrapper.this.f15232Y = true;
                    ExtAudioWrapper.m21076y2(ExtAudioWrapper.this);
                    ExtAudioWrapper.this.m21066A2();
                    ExtAudioWrapper.this.m21091N2();
                    oq70.m168791d().m168795c("ExtAudioWrapper", "HeadsetPlugReceiver ;mIsWiredHeadsetOn" + ExtAudioWrapper.this.f15232Y);
                }
            }
        }

        public /* synthetic */ HeadsetPlugReceiver(ExtAudioWrapper extAudioWrapper, C4251a c4251a) {
            this();
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: V */
    public void mo21099V(hb1 hb1Var) {
    }
}
