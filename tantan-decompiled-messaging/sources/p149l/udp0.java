package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.mediacore.audio.pcmDataAvailableCallback;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcClientRoleChangedHandler;
import com.immomo.mediacore.coninf.MRtcConnectHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.coninf.MRtcExitRoomHandler;
import com.immomo.mediacore.coninf.MRtcPusherHandler;
import com.immomo.mediacore.coninf.MRtcQualityHandler;
import com.immomo.mediacore.coninf.MRtcReceiveSeiHandler;
import com.immomo.mediacore.coninf.MRtcSurroundMusicHander;
import com.immomo.mediacore.coninf.MRtcTokenWillExpireHander;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;

/* JADX INFO: loaded from: classes8.dex */
public class udp0 extends oq2 implements ttl {

    /* JADX INFO: renamed from: A */
    a2l0 f175939A;

    /* JADX INFO: renamed from: B */
    cbl0 f175940B;

    /* JADX INFO: renamed from: C */
    b2l0 f175941C;

    /* JADX INFO: renamed from: D */
    MRtcEventHandler f175942D;

    /* JADX INFO: renamed from: E */
    PipelineConcurrentHashMap<Long, uki0> f175943E;

    /* JADX INFO: renamed from: F */
    boolean f175944F;

    /* JADX INFO: renamed from: G */
    private boolean f175945G;

    /* JADX INFO: renamed from: H */
    private int f175946H;

    /* JADX INFO: renamed from: I */
    private int f175947I;

    /* JADX INFO: renamed from: J */
    private int f175948J;

    /* JADX INFO: renamed from: K */
    private boolean f175949K;

    /* JADX INFO: renamed from: L */
    private String f175950L;

    /* JADX INFO: renamed from: y */
    tdp0 f175951y;

    /* JADX INFO: renamed from: z */
    z1l0 f175952z;

    /* JADX INFO: renamed from: l.udp0$a */
    public class C20408a implements a2l0 {
        public C20408a(ttl.InterfaceC20269a interfaceC20269a) {
        }

        @Override // p149l.a2l0
        /* JADX INFO: renamed from: a */
        public void mo94620a(long j, ski0 ski0Var, int i, int i2) {
            tdp0 tdp0Var = udp0.this.f175951y;
            if (tdp0Var != null) {
                tdp0Var.m188398b8(1);
            }
            udp0 udp0Var = udp0.this;
            udp0.this.f175943E.put(Long.valueOf(j), new uki0(udp0Var.f145075a, udp0Var.f145078d, ski0Var, j));
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + j);
        }

        @Override // p149l.a2l0
        /* JADX INFO: renamed from: b */
        public void mo94621b(long j, int i) {
            tdp0 tdp0Var;
            uki0 uki0Var = udp0.this.f175943E.get(Long.valueOf(j));
            if (uki0Var != null) {
                uki0Var.mo97705G();
            }
            udp0.this.f175943E.remove(Long.valueOf(j));
            if (udp0.this.f175943E.size() == 0 && (tdp0Var = udp0.this.f175951y) != null) {
                tdp0Var.m188398b8(0);
            }
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt: userID=" + j);
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.udp0$b */
    public class C20409b implements sml.InterfaceC19992a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ya1 f175954a;

        public C20409b(ya1 ya1Var) {
            this.f175954a = ya1Var;
        }

        @Override // p149l.sml.InterfaceC19992a
        /* JADX INFO: renamed from: C */
        public mpd0 mo128315C(mpd0 mpd0Var) {
            return this.f175954a.mo18364C(mpd0Var);
        }
    }

    public udp0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC4109a interfaceC4109a, String str) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC4109a);
        this.f175943E = new PipelineConcurrentHashMap<>();
        this.f175944F = false;
        this.f175945G = false;
        this.f175946H = 2;
        this.f175947I = -1;
        this.f175948J = -1;
        this.f175949K = false;
        this.f175950L = "";
        Context contextM165393t2 = m165393t2();
        uv00 uv00Var2 = this.f145075a;
        MomoCodec momoCodecM200153q = vv00.m200153q(contextM165393t2, uv00Var2, uv00Var2.mo19704j0(), this.f145075a.mo19674A0(), vlwVar, str);
        this.f145080f = momoCodecM200153q;
        if (!(momoCodecM200153q instanceof tdp0)) {
            eyx.m118802c().m118808g("createAgoraPushFilter create must instanceof VolcPushFilter");
        }
        this.f175951y = (tdp0) this.f145080f;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: A */
    public void mo139330A() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" stopRecord"));
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19696e0(this.f145080f);
        }
        super.mo139330A();
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20137z1(this.f145078d.f177135d0);
            ExtAudioWrapper extAudioWrapper = (ExtAudioWrapper) this.f145079e;
            vlw vlwVar = this.f145078d;
            extAudioWrapper.m20087I2(2048, vlwVar.f177117P, vlwVar.f177119R, "Momo");
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: A0 */
    public void mo160288A0(int i, int i2) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188391Y6(i, i2);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: A1 */
    public void mo160289A1(int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188414h7(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: B */
    public void mo160290B(String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188379T7(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: B0 */
    public void mo160291B0(xmw xmwVar) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188359M5(xmwVar);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: B1 */
    public void mo139331B1(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188348I6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: C0 */
    public void mo160292C0(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188418j6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: D */
    public void mo160293D(int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188338D7(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: D0 */
    public void mo160294D0(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188435q7(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E */
    public void mo160296E(MRtcPusherHandler mRtcPusherHandler) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188371R5(mRtcPusherHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E0 */
    public int mo160297E0(int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            return tdp0Var.m188390Y5(i);
        }
        return -1;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E1 */
    public void mo160298E1(boolean z, boolean z2) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188448x7(z, z2);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: F */
    public void mo20082F(String str, String str2) {
        this.f175950L = str;
        super.mo20082F(str, str2);
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20119l(1);
            this.f145079e.mo20082F(str, str2);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: F0 */
    public void mo160299F0() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188397b7();
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: F1 */
    public void mo139333F1(int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188385W5(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: G */
    public void mo160300G(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188346H6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: H0 */
    public void mo160301H0(ymw ymwVar) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188365P5(ymwVar);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: H1 */
    public void mo139335H1(long j, boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188354K6(j, z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: J0 */
    public void mo160303J0(MRtcQualityHandler mRtcQualityHandler) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188374S5(mRtcQualityHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K */
    public void mo160304K(int i, int i2, int i3, int i4) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188382U7(i, i2, i3, i4);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K0 */
    public void mo160305K0(int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188417i7(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K1 */
    public boolean mo160306K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var == null) {
            return false;
        }
        tdp0Var.m188378T6(i, str, i2, d, d2, z, d3);
        return true;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: L */
    public void mo160307L(long j, float f) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188388X5(j, f);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: L0 */
    public void mo160308L0(byte[] bArr) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188405e7(new String(bArr));
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M */
    public void mo160309M(int i, double d) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188396a8(i, d);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M0 */
    public void mo160310M0(int i, int i2) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188424l7(i, i2);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M1 */
    public void mo160311M1(ttl.InterfaceC20269a interfaceC20269a) {
        if (interfaceC20269a == null) {
            this.f175939A = null;
            tdp0 tdp0Var = this.f175951y;
            if (tdp0Var != null) {
                tdp0Var.m188373R7(null);
            }
        }
        C20408a c20408a = new C20408a(interfaceC20269a);
        this.f175939A = c20408a;
        tdp0 tdp0Var2 = this.f175951y;
        if (tdp0Var2 != null) {
            tdp0Var2.m188373R7(c20408a);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: N */
    public void mo160312N(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188413h6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: N0 */
    public void mo160313N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188347I5(mRtcExitRoomHandler);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: N1 */
    public void mo20091N1() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188415h8();
        }
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20091N1();
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: O0 */
    public void mo160314O0(wmw wmwVar) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188350J5(wmwVar);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: O1 */
    public boolean mo20093O1(String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var == null) {
            return false;
        }
        tdp0Var.m188403d8(str);
        return true;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: P0 */
    public void mo160315P0(b2l0 b2l0Var) {
        this.f175941C = b2l0Var;
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            vlw vlwVar = this.f145078d;
            if (b2l0Var != null) {
                vlwVar.f182037Z0 = true;
            } else {
                vlwVar.f182037Z0 = false;
            }
            tdp0Var.m188367P7(b2l0Var);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: Q0 */
    public void mo139341Q0(long j, boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188351J6(j, z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Q1 */
    public void mo160317Q1(String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188405e7(str);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: R */
    public void mo160318R(ya1 ya1Var) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "Screen recording setOnFrameAvailabelCallback >>>>>>>>>>>>>>" + ya1Var);
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            if (ya1Var != null) {
                tdp0Var.m188386W6(true);
                this.f145075a.mo196047L(new C20409b(ya1Var));
            } else {
                this.f145075a.mo196047L(null);
            }
            super.mo160318R(null);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: S */
    public void mo160319S(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188404e6(z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo139343T0(int i) {
        super.mo139343T0(i);
        this.f145083i = i;
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188431o7(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: T1 */
    public void mo160320T1(boolean z) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "setStreamReplaceMode:" + z);
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188355K7(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: U */
    public void mo160321U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188383V5(mRtcTokenWillExpireHander);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: W */
    public void mo160322W(boolean z, String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188410g6(z, str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: W0 */
    public int mo160323W0(int i, ikw ikwVar) {
        return 0;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: W1 */
    public void mo20101W1(float f) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188352J7(f);
        }
        super.mo20101W1(f);
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: X1 */
    public void mo160325X1(MRtcEventHandler mRtcEventHandler) {
        this.f175942D = mRtcEventHandler;
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188345H5(mRtcEventHandler);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: Y0 */
    public void mo20102Y0(long j, boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188400c8();
        }
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20102Y0(j, z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Y1 */
    public void mo160327Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188377T5(mRtcReceiveSeiHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Z */
    public void mo160328Z(String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188444v7(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Z0 */
    public void mo160329Z0(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188416i6(z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: Z1 */
    public void mo139347Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        super.mo139347Z1(mRtcAudioHandler, i, i2);
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188353K5(mRtcAudioHandler);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: a */
    public void mo139348a(boolean z) {
        super.mo139348a(z);
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188343G6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: a0 */
    public void mo160330a0(anw anwVar) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188380U5(anwVar);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: a2 */
    public void mo160331a2(MRtcConnectHandler mRtcConnectHandler) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188363O5(mRtcConnectHandler);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: b */
    public void mo139349b(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188357L6(z);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: c */
    public long mo20108c() {
        tdp0 tdp0Var = this.f175951y;
        return tdp0Var != null ? tdp0Var.m188443v6() : super.mo20108c();
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: c0 */
    public void mo160332c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188368Q5(mRtcClientRoleChangedHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: c1 */
    public void mo160333c1(int i, boolean z) {
        this.f175948J = i;
        this.f175949K = z;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: c2 */
    public void mo139350c2(MRtcAudioHandler mRtcAudioHandler, int i, int i2, int i3) {
        super.mo139350c2(mRtcAudioHandler, i, i2, i3);
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188353K5(mRtcAudioHandler);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: d */
    public float mo20109d() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            return interfaceC4109a.mo20109d();
        }
        return 1.0f;
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: e */
    public void mo139351e(String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188429n8(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: e0 */
    public int mo160334e0(int i) {
        return 0;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: f */
    public void mo139353f() {
        String str;
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName().concat(" stopRecord"));
        if (this.f145080f != null) {
            str = "" + this.f145080f.hashCode();
        } else {
            str = "null";
        }
        eyx.m118802c().m118808g("VolcPusherPipline stopRecord this.code:" + hashCode() + ",codec hashcode:" + str);
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19695d0(this.f145080f);
        }
        super.mo139353f();
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20137z1(this.f145078d.f177135d0);
            ExtAudioWrapper extAudioWrapper = (ExtAudioWrapper) this.f145079e;
            vlw vlwVar = this.f145078d;
            extAudioWrapper.m20087I2(2048, vlwVar.f177117P, vlwVar.f177119R, "Momo");
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: f1 */
    public void mo139354f1(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188341F6(z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: f2 */
    public void mo139355f2(int i) {
        super.mo139355f2(i);
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: g0 */
    public void mo160335g0(float f) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188335A7(f);
        }
        super.mo160335g0(f);
    }

    @Override // p149l.oq2, p149l.ttl
    public double getEffectsVolume() {
        tdp0 tdp0Var = this.f175951y;
        return tdp0Var != null ? tdp0Var.m188434q6() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // p149l.u3m
    public long getMusicDuration() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            return interfaceC4109a.getMusicDuration();
        }
        return 0L;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h */
    public int mo160336h(int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            return tdp0Var.m188392Y7(i);
        }
        return -1;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h0 */
    public void mo160337h0(String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188433p7(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h1 */
    public void mo160338h1(String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188442u7(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h2 */
    public int mo160339h2(String str, String str2, String str3) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            return tdp0Var.m188419j8(str, str2, str3);
        }
        return -3;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: i0 */
    public void mo160340i0(MRtcChannelHandler mRtcChannelHandler) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188360N5(mRtcChannelHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: i2 */
    public int mo160341i2(int i) {
        return 0;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: j */
    public void mo20117j() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188375S6();
        }
        super.mo20117j();
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: j1 */
    public void mo160342j1(boolean z, int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188336B7(z, i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: j2 */
    public void mo160343j2(hgd0 hgd0Var) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188349I7(hgd0Var);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: k */
    public int mo160344k() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            return tdp0Var.m188430o6();
        }
        return 0;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: k0 */
    public void mo139358k0() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188428n7(this.f175946H);
            this.f175951y.m188344G7(this.f175947I);
            this.f175951y.m188431o7(this.f145083i);
            this.f175951y.m188370Q7(this.f175952z);
            this.f175951y.m188373R7(this.f175939A);
            this.f175951y.m188389X7(this.f175940B);
            this.f175951y.m188345H5(this.f175942D);
            this.f175951y.m188408f7(this.f175944F);
        }
        int i = this.f175948J;
        if (i != -1) {
            this.f175951y.m188342F7(i, this.f175949K);
        }
        this.f145075a.mo19677C0(this.f175951y);
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec == null) {
            return;
        }
        momoCodec.mo19661e1(this.f145079e);
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            vlw vlwVar = this.f145078d;
            ((ExtAudioWrapper) interfaceC4109a).m20087I2(2048, vlwVar.f177117P, vlwVar.f177119R, "Volc");
        }
        super.mo139358k0();
    }

    @Override // p149l.oq2, p149l.ttl
    /* JADX INFO: renamed from: k2 */
    public void mo162751k2(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188407f6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: l1 */
    public int mo160345l1(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var == null) {
            return 0;
        }
        tdp0Var.m188394Z7(z);
        return 0;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: l2 */
    public void mo160346l2(String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188425l8(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: m0 */
    public void mo160347m0(z1l0 z1l0Var) {
        this.f175952z = z1l0Var;
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188370Q7(z1l0Var);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: m1 */
    public void mo139361m1(pcmDataAvailableCallback pcmdataavailablecallback) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188337C7(pcmdataavailablecallback);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: m2 */
    public sml mo139362m2() {
        return this.f175951y;
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: n0 */
    public void mo139364n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188356L5(mRtcAudioHandlerEx);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: o */
    public void mo139365o() {
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19710o();
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: o0 */
    public void mo20122o0() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20122o0();
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: o1 */
    public void mo160348o1(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188439s7(z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: p */
    public void mo139366p(String str, int i) {
        super.mo139366p(str, i);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: p1 */
    public void mo20123p1() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20123p1();
        }
    }

    @Override // p149l.oq2, p149l.ttl
    public void pauseAllEffects() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188366P6();
        }
    }

    @Override // p149l.oq2, p149l.ttl
    public void pauseEffect(int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188369Q6(i);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: q */
    public void mo20125q() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188399c7();
        }
        super.mo20125q();
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: q0 */
    public void mo20126q0(long j) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20126q0(j);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: q1 */
    public void mo160349q1(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188340E7(z);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: r */
    public long mo20127r() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            return tdp0Var.m188445w6();
        }
        return 0L;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: r0 */
    public void mo160350r0(String str, boolean z, boolean z2, int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188406e8(str, z, z2, i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: r1 */
    public void mo160351r1(cbl0 cbl0Var) {
        this.f175940B = cbl0Var;
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188389X7(cbl0Var);
        }
    }

    @Override // p149l.oq2, p149l.ttl
    public void resumeAllEffects() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188393Z6();
        }
    }

    @Override // p149l.oq2, p149l.ttl
    public void resumeEffect(int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188395a7(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: s */
    public void mo160352s() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188372R6();
        }
    }

    @Override // p149l.ttl
    public int selectAudioTrack(int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var == null) {
            return 0;
        }
        tdp0Var.m188402d7(i);
        return 0;
    }

    @Override // p149l.ttl
    public void setEffectsVolume(double d) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188437r7(d);
        }
    }

    @Override // p149l.ttl
    public int setEnableSpeakerphone(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            return tdp0Var.m188440t7(z);
        }
        return -1;
    }

    @Override // p149l.u3m
    public void setMusicPitch(int i) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.setMusicPitch(i);
        }
    }

    @Override // p149l.u3m
    public void setMusicVolume(float f) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.setMusicVolume(f);
        }
    }

    @Override // p149l.ttl
    public void stopAllEffects() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188409f8();
        }
    }

    @Override // p149l.ttl
    public void stopEffect(int i) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188412g8(i);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    public void stopSurroundMusic() {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.stopSurroundMusic();
        }
        super.stopSurroundMusic();
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo139369t0() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188428n7(this.f175946H);
            this.f175951y.m188344G7(this.f175947I);
            this.f175951y.m188431o7(this.f145083i);
            this.f175951y.m188370Q7(this.f175952z);
            this.f175951y.m188373R7(this.f175939A);
            this.f175951y.m188389X7(this.f175940B);
            this.f175951y.m188345H5(this.f175942D);
            this.f175951y.m188408f7(this.f175944F);
        }
        int i = this.f175948J;
        if (i != -1) {
            this.f175951y.m188342F7(i, this.f175949K);
        }
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19677C0(this.f175951y);
        }
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec == null) {
            return -5;
        }
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            momoCodec.mo19661e1(interfaceC4109a);
            ExtAudioWrapper extAudioWrapper = (ExtAudioWrapper) this.f145079e;
            vlw vlwVar = this.f145078d;
            extAudioWrapper.m20087I2(2048, vlwVar.f177117P, vlwVar.f177119R, "Volc");
        }
        return super.mo139369t0();
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: t1 */
    public void mo139370t1(int i) {
        this.f175946H = i;
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188428n7(i);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo139372u0(boolean z) {
        super.mo139372u0(z);
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188421k7(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: u1 */
    public void mo160354u1(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188401d6(z);
        }
    }

    @Override // p149l.oq2, p149l.ttl
    /* JADX INFO: renamed from: v */
    public void mo162752v(String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var == null || str == null) {
            return;
        }
        tdp0Var.m188446w7(str);
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: v0 */
    public void mo139373v0(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188420k6(z);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: v1 */
    public void mo20129v1(long j) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188400c8();
        }
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20129v1(j);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: w */
    public long mo20130w() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            return interfaceC4109a.mo20130w();
        }
        return 0L;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: w0 */
    public void mo20131w0(long j) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188358L7((int) j);
        }
        super.mo20131w0(j);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: w1 */
    public void mo20132w1() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20132w1();
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: x */
    public void mo139374x(boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188339E6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: x1 */
    public int mo160355x1(String str) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            return tdp0Var.m188422k8(str);
        }
        return -3;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: y1 */
    public float mo20135y1() {
        tdp0 tdp0Var = this.f175951y;
        return tdp0Var != null ? tdp0Var.m188441u6() : super.mo20135y1();
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: z */
    public void mo20136z(boolean z) {
        super.mo20136z(z);
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: z0 */
    public void mo160356z0(long j, boolean z) {
        tdp0 tdp0Var = this.f175951y;
        if (tdp0Var != null) {
            tdp0Var.m188423l6(j, z);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: Y */
    public void mo160326Y() {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: D1 */
    public void mo160295D1(bnw bnwVar) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: I0 */
    public void mo160302I0(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: P1 */
    public void mo160316P1(boolean z) {
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: m */
    public void mo139360m(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: s0 */
    public void mo160353s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: u */
    public void mo139371u(boolean z) {
    }

    public udp0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC4109a interfaceC4109a) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC4109a);
        this.f175943E = new PipelineConcurrentHashMap<>();
        this.f175944F = false;
        this.f175945G = false;
        this.f175946H = 2;
        this.f175947I = -1;
        this.f175948J = -1;
        this.f175949K = false;
        this.f175950L = "";
        Context contextM165393t2 = m165393t2();
        uv00 uv00Var2 = this.f145075a;
        MomoCodec momoCodecM200152p = vv00.m200152p(contextM165393t2, uv00Var2, uv00Var2.mo19704j0(), this.f145075a.mo19674A0(), vlwVar);
        this.f145080f = momoCodecM200152p;
        if (!(momoCodecM200152p instanceof tdp0)) {
            eyx.m118802c().m118808g("createAgoraPushFilter create must instanceof VolcPushFilter");
        }
        this.f175951y = (tdp0) this.f145080f;
    }
}
