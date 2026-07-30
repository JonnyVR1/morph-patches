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
public class yc0 extends oq2 implements ttl {

    /* JADX INFO: renamed from: A */
    a2l0 f197380A;

    /* JADX INFO: renamed from: B */
    cbl0 f197381B;

    /* JADX INFO: renamed from: C */
    b2l0 f197382C;

    /* JADX INFO: renamed from: D */
    MRtcEventHandler f197383D;

    /* JADX INFO: renamed from: E */
    PipelineConcurrentHashMap<Long, uki0> f197384E;

    /* JADX INFO: renamed from: F */
    boolean f197385F;

    /* JADX INFO: renamed from: G */
    private boolean f197386G;

    /* JADX INFO: renamed from: H */
    private int f197387H;

    /* JADX INFO: renamed from: I */
    private int f197388I;

    /* JADX INFO: renamed from: J */
    private int f197389J;

    /* JADX INFO: renamed from: K */
    private boolean f197390K;

    /* JADX INFO: renamed from: L */
    private String f197391L;

    /* JADX INFO: renamed from: y */
    xc0 f197392y;

    /* JADX INFO: renamed from: z */
    z1l0 f197393z;

    /* JADX INFO: renamed from: l.yc0$a */
    public class C21364a implements a2l0 {
        public C21364a(ttl.InterfaceC20269a interfaceC20269a) {
        }

        @Override // p149l.a2l0
        /* JADX INFO: renamed from: a */
        public void mo94620a(long j, ski0 ski0Var, int i, int i2) {
            xc0 xc0Var = yc0.this.f197392y;
            if (xc0Var != null) {
                xc0Var.m207993Y7(1);
            }
            yc0 yc0Var = yc0.this;
            yc0.this.f197384E.put(Long.valueOf(j), new uki0(yc0Var.f145075a, yc0Var.f145078d, ski0Var, j));
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + j);
        }

        @Override // p149l.a2l0
        /* JADX INFO: renamed from: b */
        public void mo94621b(long j, int i) {
            xc0 xc0Var;
            uki0 uki0Var = yc0.this.f197384E.get(Long.valueOf(j));
            if (uki0Var != null) {
                uki0Var.mo97705G();
            }
            yc0.this.f197384E.remove(Long.valueOf(j));
            if (yc0.this.f197384E.size() == 0 && (xc0Var = yc0.this.f197392y) != null) {
                xc0Var.m207993Y7(0);
            }
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt: userID=" + j);
        }
    }

    /* JADX INFO: renamed from: l.yc0$b */
    public class C21365b implements sml.InterfaceC19992a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ya1 f197395a;

        public C21365b(ya1 ya1Var) {
            this.f197395a = ya1Var;
        }

        @Override // p149l.sml.InterfaceC19992a
        /* JADX INFO: renamed from: C */
        public mpd0 mo128315C(mpd0 mpd0Var) {
            return this.f197395a.mo18364C(mpd0Var);
        }
    }

    public yc0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC4109a interfaceC4109a, String str) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC4109a);
        this.f197384E = new PipelineConcurrentHashMap<>();
        this.f197385F = false;
        this.f197386G = false;
        this.f197387H = 2;
        this.f197388I = -1;
        this.f197389J = -1;
        this.f197390K = false;
        this.f197391L = "";
        Context contextM165393t2 = m165393t2();
        uv00 uv00Var2 = this.f145075a;
        MomoCodec momoCodecM200145i = vv00.m200145i(contextM165393t2, uv00Var2, uv00Var2.mo19704j0(), this.f145075a.mo19674A0(), vlwVar, str);
        this.f145080f = momoCodecM200145i;
        if (!(momoCodecM200145i instanceof xc0)) {
            eyx.m118802c().m118808g("createAgoraPushFilter create must instanceof AgoraPushFilter");
        }
        this.f197392y = (xc0) this.f145080f;
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207989X6(i, i2);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: A1 */
    public void mo160289A1(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208020i7(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: B */
    public void mo160290B(String str) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207981T7(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: B0 */
    public void mo160291B0(xmw xmwVar) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207940E5(xmwVar);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: B1 */
    public void mo139331B1(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207953I6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: C0 */
    public void mo160292C0(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208008e6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: D */
    public void mo160293D(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207945F7(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: D0 */
    public void mo160294D0(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208039q7(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E */
    public void mo160296E(MRtcPusherHandler mRtcPusherHandler) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207955J5(mRtcPusherHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E0 */
    public int mo160297E0(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m207974R5(i);
        }
        return -1;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E1 */
    public void mo160298E1(boolean z, boolean z2) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208052y7(z, z2);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: F */
    public void mo20082F(String str, String str2) {
        this.f197391L = str;
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207998a7();
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: F1 */
    public void mo139333F1(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207969P5(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: G */
    public void mo160300G(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207950H6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: H0 */
    public void mo160301H0(ymw ymwVar) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207949H5(ymwVar);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: H1 */
    public void mo139335H1(long j, boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207958K6(j, z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: J0 */
    public void mo160303J0(MRtcQualityHandler mRtcQualityHandler) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207957K5(mRtcQualityHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K */
    public void mo160304K(int i, int i2, int i3, int i4) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207983U7(i, i2, i3, i4);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K0 */
    public void mo160305K0(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207967O5(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K1 */
    public boolean mo160306K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var == null) {
            return false;
        }
        xc0Var.m207980T6(i, str, i2, d, d2, z, d3);
        return true;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: L */
    public void mo160307L(long j, float f) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207971Q5(j, f);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: L0 */
    public void mo160308L0(byte[] bArr) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208009e7(bArr);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M */
    public void mo160309M(int i, double d) throws Throwable {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207990X7(i, d);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M0 */
    public void mo160310M0(int i, int i2) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208025k7(i, i2);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M1 */
    public void mo160311M1(ttl.InterfaceC20269a interfaceC20269a) {
        if (interfaceC20269a == null) {
            this.f197380A = null;
            xc0 xc0Var = this.f197392y;
            if (xc0Var != null) {
                xc0Var.m207979S7(null);
            }
        }
        C21364a c21364a = new C21364a(interfaceC20269a);
        this.f197380A = c21364a;
        xc0 xc0Var2 = this.f197392y;
        if (xc0Var2 != null) {
            xc0Var2.m207979S7(c21364a);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: N */
    public void mo160312N(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207999b6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: N0 */
    public void mo160313N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207931A5(mRtcExitRoomHandler);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: N1 */
    public void mo20091N1() {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208016g8();
        }
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20091N1();
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: O0 */
    public void mo160314O0(wmw wmwVar) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207933B5(wmwVar);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: O1 */
    public boolean mo20093O1(String str) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var == null) {
            return false;
        }
        xc0Var.m208004c8(str);
        return true;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: P0 */
    public void mo160315P0(b2l0 b2l0Var) {
        this.f197382C = b2l0Var;
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            vlw vlwVar = this.f145078d;
            if (b2l0Var != null) {
                vlwVar.f182037Z0 = true;
            } else {
                vlwVar.f182037Z0 = false;
            }
            xc0Var.m207973Q7(b2l0Var);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: Q0 */
    public void mo139341Q0(long j, boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207956J6(j, z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Q1 */
    public void mo160317Q1(String str) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208006d7(str);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: R */
    public void mo160318R(ya1 ya1Var) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "Screen recording setOnFrameAvailabelCallback >>>>>>>>>>>>>>" + ya1Var);
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            if (ya1Var != null) {
                xc0Var.m207986W6(true);
                this.f145075a.mo196047L(new C21365b(ya1Var));
            } else {
                this.f145075a.mo196047L(null);
            }
            super.mo160318R(null);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: S */
    public void mo160319S(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207991Y5(z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo139343T0(int i) {
        super.mo139343T0(i);
        this.f145083i = i;
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208033n7(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: T1 */
    public void mo160320T1(boolean z) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "setStreamReplaceMode:" + z);
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207964M7(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: U */
    public void mo160321U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207965N5(mRtcTokenWillExpireHander);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: W */
    public void mo160322W(boolean z, String str) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207997a6(z, str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: W0 */
    public int mo160323W0(int i, ikw ikwVar) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m208041r7(i, ikwVar);
        }
        return -1;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: W1 */
    public void mo20101W1(float f) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207962L7(f);
        }
        super.mo20101W1(f);
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: X1 */
    public void mo160325X1(MRtcEventHandler mRtcEventHandler) {
        this.f197383D = mRtcEventHandler;
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208053z5(mRtcEventHandler);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: Y0 */
    public void mo20102Y0(long j, boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208001b8();
        }
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20102Y0(j, z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Y1 */
    public void mo160327Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207960L5(mRtcReceiveSeiHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Z */
    public void mo160328Z(String str) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208048w7(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Z0 */
    public void mo160329Z0(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208005d6(z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: Z1 */
    public void mo139347Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        super.mo139347Z1(mRtcAudioHandler, i, i2);
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207935C5(mRtcAudioHandler);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: a */
    public void mo139348a(boolean z) {
        super.mo139348a(z);
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            if (z) {
                xc0Var.m207934B7(0.0f);
            } else {
                xc0Var.m207934B7(1.0f);
                this.f197392y.m207947G6(false);
            }
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: a0 */
    public void mo160330a0(anw anwVar) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207963M5(anwVar);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: a2 */
    public void mo160331a2(MRtcConnectHandler mRtcConnectHandler) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207946G5(mRtcConnectHandler);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: b */
    public void mo139349b(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207961L6(z);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: c */
    public long mo20108c() {
        xc0 xc0Var = this.f197392y;
        return xc0Var != null ? xc0Var.m208049x6() : super.mo20108c();
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: c0 */
    public void mo160332c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207952I5(mRtcClientRoleChangedHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: c1 */
    public void mo160333c1(int i, boolean z) {
        this.f197389J = i;
        this.f197390K = z;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: c2 */
    public void mo139350c2(MRtcAudioHandler mRtcAudioHandler, int i, int i2, int i3) {
        super.mo139350c2(mRtcAudioHandler, i, i2, i3);
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207935C5(mRtcAudioHandler);
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208032m8(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: e0 */
    public int mo160334e0(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m208017h7(i);
        }
        return -1;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: f */
    public void mo139353f() {
        String str;
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" stopRecord"));
        if (this.f145080f != null) {
            str = "" + this.f145080f.hashCode();
        } else {
            str = "null";
        }
        eyx.m118802c().m118808g("AgoraPushPipline stopRecord this.code:" + hashCode() + ",codec hashcode:" + str);
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207944F6(z);
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207934B7(f);
        }
        super.mo160335g0(f);
    }

    @Override // p149l.oq2, p149l.ttl
    public double getEffectsVolume() {
        xc0 xc0Var = this.f197392y;
        return xc0Var != null ? xc0Var.m208034o6() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m208015g7(i);
        }
        return 0;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h0 */
    public void mo160337h0(String str) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208035o7(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h1 */
    public void mo160338h1(String str) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208046v7(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h2 */
    public int mo160339h2(String str, String str2, String str3) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m208018h8(str, str2);
        }
        return -3;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: i0 */
    public void mo160340i0(MRtcChannelHandler mRtcChannelHandler) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207943F5(mRtcChannelHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: i2 */
    public int mo160341i2(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m207942E7(i);
        }
        return -1;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: j */
    public void mo20117j() {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207978S6();
        }
        super.mo20117j();
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: j1 */
    public void mo160342j1(boolean z, int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207936C7(z, i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: j2 */
    public void mo160343j2(hgd0 hgd0Var) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207959K7(hgd0Var);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: k */
    public int mo160344k() {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m208030m6();
        }
        return -1;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: k0 */
    public void mo139358k0() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208031m7(this.f197387H);
            this.f197392y.m207954I7(this.f197388I);
            this.f197392y.m208033n7(this.f145083i);
            this.f197392y.m207976R7(this.f197393z);
            this.f197392y.m207979S7(this.f197380A);
            this.f197392y.m207987W7(this.f197381B);
            this.f197392y.m208053z5(this.f197383D);
            this.f197392y.m208012f7(this.f197385F);
        }
        int i = this.f197389J;
        if (i != -1) {
            this.f197392y.m207951H7(i, this.f197390K);
        }
        this.f145075a.mo19677C0(this.f197392y);
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec == null) {
            return;
        }
        momoCodec.mo19661e1(this.f145079e);
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            vlw vlwVar = this.f145078d;
            ((ExtAudioWrapper) interfaceC4109a).m20087I2(2048, vlwVar.f177117P, vlwVar.f177119R, "Agora");
        }
        super.mo139358k0();
    }

    @Override // p149l.oq2, p149l.ttl
    /* JADX INFO: renamed from: k2 */
    public void mo162751k2(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207994Z5(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: l1 */
    public int mo160345l1(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var == null) {
            return 0;
        }
        xc0Var.m208002c6(z);
        return 0;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: l2 */
    public void mo160346l2(String str) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208029l8(str);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: m */
    public void mo139360m(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208036p7(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: m0 */
    public void mo160347m0(z1l0 z1l0Var) {
        this.f197393z = z1l0Var;
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207976R7(z1l0Var);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: m1 */
    public void mo139361m1(pcmDataAvailableCallback pcmdataavailablecallback) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207939D7(pcmdataavailablecallback);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: m2 */
    public sml mo139362m2() {
        return this.f197392y;
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: n0 */
    public void mo139364n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207937D5(mRtcAudioHandlerEx);
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208044t7(z);
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207970P6();
        }
    }

    @Override // p149l.oq2, p149l.ttl
    public void pauseEffect(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207972Q6(i);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: q */
    public void mo20125q() {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208000b7();
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207948G7(z);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: r */
    public long mo20127r() {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m208051y6();
        }
        return 0L;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: r0 */
    public void mo160350r0(String str, boolean z, boolean z2, int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208007d8(str, z, z2, i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: r1 */
    public void mo160351r1(cbl0 cbl0Var) {
        this.f197381B = cbl0Var;
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207987W7(cbl0Var);
        }
    }

    @Override // p149l.oq2, p149l.ttl
    public void resumeAllEffects() {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207992Y6();
        }
    }

    @Override // p149l.oq2, p149l.ttl
    public void resumeEffect(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207995Z6(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: s */
    public void mo160352s() {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207975R6();
        }
    }

    @Override // p149l.ttl
    public int selectAudioTrack(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m208003c7(i);
        }
        return -1;
    }

    @Override // p149l.ttl
    public void setEffectsVolume(double d) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208043s7(d);
        }
    }

    @Override // p149l.ttl
    public int setEnableSpeakerphone(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m208045u7(z);
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208010e8();
        }
    }

    @Override // p149l.ttl
    public void stopEffect(int i) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208013f8(i);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    public void stopSurroundMusic() {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.stopSurroundMusic();
        }
        super.stopSurroundMusic();
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo139369t0() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208031m7(this.f197387H);
            this.f197392y.m207954I7(this.f197388I);
            this.f197392y.m208033n7(this.f145083i);
            this.f197392y.m207976R7(this.f197393z);
            this.f197392y.m207979S7(this.f197380A);
            this.f197392y.m207987W7(this.f197381B);
            this.f197392y.m208053z5(this.f197383D);
            this.f197392y.m208012f7(this.f197385F);
        }
        int i = this.f197389J;
        if (i != -1) {
            this.f197392y.m207951H7(i, this.f197390K);
        }
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19677C0(this.f197392y);
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
            extAudioWrapper.m20087I2(2048, vlwVar.f177117P, vlwVar.f177119R, "Agora");
        }
        return super.mo139369t0();
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: t1 */
    public void mo139370t1(int i) {
        this.f197387H = i;
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208031m7(i);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo139372u0(boolean z) {
        super.mo139372u0(z);
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208023j7(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: u1 */
    public void mo160354u1(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207988X5(z);
        }
    }

    @Override // p149l.oq2, p149l.ttl
    /* JADX INFO: renamed from: v */
    public void mo162752v(String str) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var == null || str == null) {
            return;
        }
        xc0Var.m208050x7(str);
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: v0 */
    public void mo139373v0(boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208011f6(z);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: v1 */
    public void mo20129v1(long j) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208001b8();
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207966N7((int) j);
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
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m207941E6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: x1 */
    public int mo160355x1(String str) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            return xc0Var.m208026k8(str);
        }
        return -3;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: y1 */
    public float mo20135y1() {
        xc0 xc0Var = this.f197392y;
        return xc0Var != null ? xc0Var.m208047w6() : super.mo20135y1();
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: z */
    public void mo20136z(boolean z) {
        super.mo20136z(z);
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: z0 */
    public void mo160356z0(long j, boolean z) {
        xc0 xc0Var = this.f197392y;
        if (xc0Var != null) {
            xc0Var.m208019i6(j, z);
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

    @Override // p149l.ttl
    /* JADX INFO: renamed from: s0 */
    public void mo160353s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: u */
    public void mo139371u(boolean z) {
    }

    public yc0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC4109a interfaceC4109a) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC4109a);
        this.f197384E = new PipelineConcurrentHashMap<>();
        this.f197385F = false;
        this.f197386G = false;
        this.f197387H = 2;
        this.f197388I = -1;
        this.f197389J = -1;
        this.f197390K = false;
        this.f197391L = "";
        Context contextM165393t2 = m165393t2();
        uv00 uv00Var2 = this.f145075a;
        MomoCodec momoCodecM200144h = vv00.m200144h(contextM165393t2, uv00Var2, uv00Var2.mo19704j0(), this.f145075a.mo19674A0(), vlwVar);
        this.f145080f = momoCodecM200144h;
        if (!(momoCodecM200144h instanceof xc0)) {
            eyx.m118802c().m118808g("createAgoraPushFilter create must instanceof AgoraPushFilter");
        }
        this.f197392y = (xc0) this.f145080f;
    }
}
