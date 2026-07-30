package p007l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
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
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import l.a2l0;
import l.anw;
import l.b2l0;
import l.bnw;
import l.cbl0;
import l.eyx;
import l.i3m;
import l.ii70;
import l.mpd0;
import l.sml;
import l.ulw;
import l.uv00;
import l.vlw;
import l.vv00;
import l.wmw;
import l.xmw;
import l.ya1;
import l.ymw;
import l.z1l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class yc0 extends oq2 implements ttl {

    /* JADX INFO: renamed from: A */
    a2l0 f5400A;

    /* JADX INFO: renamed from: B */
    cbl0 f5401B;

    /* JADX INFO: renamed from: C */
    b2l0 f5402C;

    /* JADX INFO: renamed from: D */
    MRtcEventHandler f5403D;

    /* JADX INFO: renamed from: E */
    PipelineConcurrentHashMap<Long, uki0> f5404E;

    /* JADX INFO: renamed from: F */
    boolean f5405F;

    /* JADX INFO: renamed from: G */
    private boolean f5406G;

    /* JADX INFO: renamed from: H */
    private int f5407H;

    /* JADX INFO: renamed from: I */
    private int f5408I;

    /* JADX INFO: renamed from: J */
    private int f5409J;

    /* JADX INFO: renamed from: K */
    private boolean f5410K;

    /* JADX INFO: renamed from: L */
    private String f5411L;

    /* JADX INFO: renamed from: y */
    xc0 f5412y;

    /* JADX INFO: renamed from: z */
    z1l0 f5413z;

    /* JADX INFO: renamed from: l.yc0$a */
    public class C0791a implements a2l0 {
        public C0791a(ttl.InterfaceC0721a interfaceC0721a) {
        }

        /* JADX INFO: renamed from: a */
        public void m11916a(long j, ski0 ski0Var, int i, int i2) {
            xc0 xc0Var = yc0.this.f5412y;
            if (xc0Var != null) {
                xc0Var.m11680Y7(1);
            }
            yc0 yc0Var = yc0.this;
            yc0.this.f5404E.put(Long.valueOf(j), new uki0(yc0Var.f3550a, yc0Var.f3553d, ski0Var, j));
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + j);
        }

        /* JADX INFO: renamed from: b */
        public void m11917b(long j, int i) {
            xc0 xc0Var;
            uki0 uki0Var = (uki0) yc0.this.f5404E.get(Long.valueOf(j));
            if (uki0Var != null) {
                uki0Var.mo8566G();
            }
            yc0.this.f5404E.remove(Long.valueOf(j));
            if (yc0.this.f5404E.size() == 0 && (xc0Var = yc0.this.f5412y) != null) {
                xc0Var.m11680Y7(0);
            }
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt: userID=" + j);
        }
    }

    /* JADX INFO: renamed from: l.yc0$b */
    public class C0792b implements sml.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ya1 f5415a;

        public C0792b(ya1 ya1Var) {
            this.f5415a = ya1Var;
        }

        /* JADX INFO: renamed from: C */
        public mpd0 m11918C(mpd0 mpd0Var) {
            return this.f5415a.C(mpd0Var);
        }
    }

    public yc0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC0021a interfaceC0021a, String str) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC0021a);
        this.f5404E = new PipelineConcurrentHashMap<>();
        this.f5405F = false;
        this.f5406G = false;
        this.f5407H = 2;
        this.f5408I = -1;
        this.f5409J = -1;
        this.f5410K = false;
        this.f5411L = "";
        Context contextM10229t2 = m10229t2();
        uv00 uv00Var2 = this.f3550a;
        MomoCodec momoCodecI = vv00.i(contextM10229t2, uv00Var2, uv00Var2.j0(), this.f3550a.A0(), vlwVar, str);
        this.f3555f = momoCodecI;
        if (!(momoCodecI instanceof xc0)) {
            eyx.c().g(new Object[]{"createAgoraPushFilter create must instanceof AgoraPushFilter"});
        }
        this.f5412y = this.f3555f;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: A */
    public void mo9455A() {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" stopRecord"));
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.e0(this.f3555f);
        }
        super.mo9455A();
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.mo403z1(((ulw) this.f3553d).d0);
            ExtAudioWrapper extAudioWrapper = (ExtAudioWrapper) this.f3554e;
            vlw vlwVar = this.f3553d;
            extAudioWrapper.m353I2(2048, ((ulw) vlwVar).P, ((ulw) vlwVar).R, "Momo");
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: A0 */
    public void mo9993A0(int i, int i2) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11674X6(i, i2);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m11907A1(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11726i7(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: B */
    public void mo9995B(String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11662T7(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: B0 */
    public void mo9996B0(xmw xmwVar) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11600E5(xmwVar);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: B1 */
    public void mo9456B1(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11619I6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: C0 */
    public void mo9997C0(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11705e6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: D */
    public void mo9998D(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11608F7(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: D0 */
    public void mo9999D0(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11760q7(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E */
    public void mo10001E(MRtcPusherHandler mRtcPusherHandler) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11623J5(mRtcPusherHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E0 */
    public int mo10002E0(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11654R5(i);
        }
        return -1;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E1 */
    public void mo10003E1(boolean z, boolean z2) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11783y7(z, z2);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: F */
    public void mo10004F(String str, String str2) {
        this.f5411L = str;
        super.mo10004F(str, str2);
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.mo385l(1);
            this.f3554e.F(str, str2);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: F0 */
    public void mo10005F0() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11686a7();
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: F1 */
    public void mo9458F1(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11647P5(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: G */
    public void mo10006G(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11615H6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: H0 */
    public void mo10007H0(ymw ymwVar) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11614H5(ymwVar);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: H1 */
    public void mo9460H1(long j, boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11627K6(j, z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: J0 */
    public void mo10009J0(MRtcQualityHandler mRtcQualityHandler) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11626K5(mRtcQualityHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K */
    public void mo10010K(int i, int i2, int i3, int i4) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11664U7(i, i2, i3, i4);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K0 */
    public void mo10011K0(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11644O5(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K1 */
    public boolean mo10012K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var == null) {
            return false;
        }
        xc0Var.m11661T6(i, str, i2, d, d2, z, d3);
        return true;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: L */
    public void mo10013L(long j, float f) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11650Q5(j, f);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: L0 */
    public void mo10014L0(byte[] bArr) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11706e7(bArr);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M */
    public void mo10015M(int i, double d) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11675X7(i, d);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M0 */
    public void mo10016M0(int i, int i2) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11733k7(i, i2);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M1 */
    public void mo10017M1(ttl.InterfaceC0721a interfaceC0721a) {
        if (interfaceC0721a == null) {
            this.f5400A = null;
            xc0 xc0Var = this.f5412y;
            if (xc0Var != null) {
                xc0Var.m11659S7(null);
            }
        }
        C0791a c0791a = new C0791a(interfaceC0721a);
        this.f5400A = c0791a;
        xc0 xc0Var2 = this.f5412y;
        if (xc0Var2 != null) {
            xc0Var2.m11659S7(c0791a);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: N */
    public void mo10018N(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11689b6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: N0 */
    public void mo10019N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11586A5(mRtcExitRoomHandler);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public void m11908N1() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11718g8();
        }
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.N1();
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: O0 */
    public void mo10021O0(wmw wmwVar) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11588B5(wmwVar);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: O1 */
    public boolean mo9854O1(String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var == null) {
            return false;
        }
        xc0Var.m11697c8(str);
        return true;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: P0 */
    public void mo10022P0(b2l0 b2l0Var) {
        this.f5402C = b2l0Var;
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            vlw vlwVar = this.f3553d;
            if (b2l0Var != null) {
                vlwVar.Z0 = true;
            } else {
                vlwVar.Z0 = false;
            }
            xc0Var.m11652Q7(b2l0Var);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: Q0 */
    public void mo9466Q0(long j, boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11624J6(j, z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Q1 */
    public void mo10024Q1(String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11701d7(str);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: R */
    public void mo10025R(ya1 ya1Var) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "Screen recording setOnFrameAvailabelCallback >>>>>>>>>>>>>>" + ya1Var);
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            if (ya1Var != null) {
                xc0Var.m11669W6(true);
                this.f3550a.L(new C0792b(ya1Var));
            } else {
                this.f3550a.L((sml.a) null);
            }
            super.mo10025R(null);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: S */
    public void mo10026S(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11678Y5(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo9468T0(int i) {
        super.mo9468T0(i);
        this.f3558i = i;
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11748n7(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: T1 */
    public void mo10027T1(boolean z) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "setStreamReplaceMode:" + z);
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11638M7(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: U */
    public void mo10028U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11641N5(mRtcTokenWillExpireHander);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: W */
    public void mo10029W(boolean z, String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11685a6(z, str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: W0 */
    public int mo10030W0(int i, ikw ikwVar) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11764r7(i, ikwVar);
        }
        return -1;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: W1 */
    public void mo10031W1(float f) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11634L7(f);
        }
        super.mo10031W1(f);
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: X1 */
    public void mo10033X1(MRtcEventHandler mRtcEventHandler) {
        this.f5403D = mRtcEventHandler;
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11784z5(mRtcEventHandler);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: Y0 */
    public void mo10035Y0(long j, boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11691b8();
        }
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.Y0(j, z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Y1 */
    public void mo10036Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11632L5(mRtcReceiveSeiHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Z */
    public void mo10037Z(String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11776w7(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Z0 */
    public void mo10038Z0(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11700d6(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: Z1 */
    public void mo9472Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        super.mo9472Z1(mRtcAudioHandler, i, i2);
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11592C5(mRtcAudioHandler);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: a */
    public void mo9473a(boolean z) {
        super.mo9473a(z);
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            if (z) {
                xc0Var.m11589B7(0.0f);
            } else {
                xc0Var.m11589B7(1.0f);
                this.f5412y.m11611G6(false);
            }
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: a0 */
    public void mo10039a0(anw anwVar) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11637M5(anwVar);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: a2 */
    public void mo10040a2(MRtcConnectHandler mRtcConnectHandler) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11610G5(mRtcConnectHandler);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: b */
    public void mo9474b(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11633L6(z);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: c */
    public long mo10041c() {
        xc0 xc0Var = this.f5412y;
        return xc0Var != null ? xc0Var.m11778x6() : super.mo10041c();
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: c0 */
    public void mo10042c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11618I5(mRtcClientRoleChangedHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: c1 */
    public void mo10043c1(int i, boolean z) {
        this.f5409J = i;
        this.f5410K = z;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: c2 */
    public void mo9475c2(MRtcAudioHandler mRtcAudioHandler, int i, int i2, int i3) {
        super.mo9475c2(mRtcAudioHandler, i, i2, i3);
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11592C5(mRtcAudioHandler);
        }
    }

    /* JADX INFO: renamed from: d */
    public float m11909d() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            return interfaceC0021a.d();
        }
        return 1.0f;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: e */
    public void mo9476e(String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11744m8(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: e0 */
    public int mo10045e0(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11722h7(i);
        }
        return -1;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: f */
    public void mo9478f() {
        String str;
        ii70.d().a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" stopRecord"));
        if (this.f3555f != null) {
            str = "" + this.f3555f.hashCode();
        } else {
            str = "null";
        }
        eyx.c().g(new Object[]{"AgoraPushPipline stopRecord this.code:" + hashCode() + ",codec hashcode:" + str});
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.d0(this.f3555f);
        }
        super.mo9478f();
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.mo403z1(((ulw) this.f3553d).d0);
            ExtAudioWrapper extAudioWrapper = (ExtAudioWrapper) this.f3554e;
            vlw vlwVar = this.f3553d;
            extAudioWrapper.m353I2(2048, ((ulw) vlwVar).P, ((ulw) vlwVar).R, "Momo");
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: f1 */
    public void mo9479f1(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11607F6(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: f2 */
    public void mo9480f2(int i) {
        super.mo9480f2(i);
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: g0 */
    public void mo10046g0(float f) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11589B7(f);
        }
        super.mo10046g0(f);
    }

    @Override // p007l.oq2, p007l.ttl
    public double getEffectsVolume() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11752o6();
        }
        return 0.0d;
    }

    public long getMusicDuration() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            return interfaceC0021a.getMusicDuration();
        }
        return 0L;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h */
    public int mo10047h(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11717g7(i);
        }
        return 0;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h0 */
    public void mo10048h0(String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11753o7(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h1 */
    public void mo10049h1(String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11773v7(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h2 */
    public int mo10050h2(String str, String str2, String str3) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11723h8(str, str2);
        }
        return -3;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: i0 */
    public void mo10051i0(MRtcChannelHandler mRtcChannelHandler) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11606F5(mRtcChannelHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: i2 */
    public int mo10052i2(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11602E7(i);
        }
        return -1;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: j */
    public void mo10053j() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11658S6();
        }
        super.mo10053j();
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: j1 */
    public void mo10054j1(boolean z, int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11593C7(z, i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: j2 */
    public void mo10055j2(hgd0 hgd0Var) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11628K7(hgd0Var);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: k */
    public int mo10056k() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11742m6();
        }
        return -1;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: k0 */
    public void mo9483k0() {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11743m7(this.f5407H);
            this.f5412y.m11620I7(this.f5408I);
            this.f5412y.m11748n7(this.f3558i);
            this.f5412y.m11656R7(this.f5413z);
            this.f5412y.m11659S7(this.f5400A);
            this.f5412y.m11670W7(this.f5401B);
            this.f5412y.m11784z5(this.f5403D);
            this.f5412y.m11711f7(this.f5405F);
        }
        int i = this.f5409J;
        if (i != -1) {
            this.f5412y.m11616H7(i, this.f5410K);
        }
        this.f3550a.C0(this.f5412y);
        MomoCodec momoCodec = this.f3555f;
        if (momoCodec == null) {
            return;
        }
        momoCodec.e1(this.f3554e);
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            vlw vlwVar = this.f3553d;
            ((ExtAudioWrapper) interfaceC0021a).m353I2(2048, ((ulw) vlwVar).P, ((ulw) vlwVar).R, "Agora");
        }
        super.mo9483k0();
    }

    @Override // p007l.oq2, p007l.ttl
    /* JADX INFO: renamed from: k2 */
    public void mo10178k2(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11681Z5(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: l1 */
    public int mo10057l1(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var == null) {
            return 0;
        }
        xc0Var.m11695c6(z);
        return 0;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: l2 */
    public void mo10058l2(String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11739l8(str);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: m */
    public void mo9485m(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11756p7(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: m0 */
    public void mo10059m0(z1l0 z1l0Var) {
        this.f5413z = z1l0Var;
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11656R7(z1l0Var);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: m1 */
    public void mo9486m1(pcmDataAvailableCallback pcmdataavailablecallback) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11598D7(pcmdataavailablecallback);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: m2 */
    public sml mo9487m2() {
        return this.f5412y;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: n0 */
    public void mo9489n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11596D5(mRtcAudioHandlerEx);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: o */
    public void mo9490o() {
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.o();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m11910o0() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.o0();
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: o1 */
    public void mo10061o1(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11768t7(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: p */
    public void mo9491p(String str, int i) {
        super.mo9491p(str, i);
    }

    /* JADX INFO: renamed from: p1 */
    public void m11911p1() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.p1();
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void pauseAllEffects() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11648P6();
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void pauseEffect(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11651Q6(i);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: q */
    public void mo10063q() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11690b7();
        }
        super.mo10063q();
    }

    /* JADX INFO: renamed from: q0 */
    public void m11912q0(long j) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.q0(j);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: q1 */
    public void mo10065q1(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11612G7(z);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: r */
    public long mo10066r() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11782y6();
        }
        return 0L;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: r0 */
    public void mo10067r0(String str, boolean z, boolean z2, int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11702d8(str, z, z2, i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: r1 */
    public void mo10068r1(cbl0 cbl0Var) {
        this.f5401B = cbl0Var;
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11670W7(cbl0Var);
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void resumeAllEffects() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11679Y6();
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void resumeEffect(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11682Z6(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: s */
    public void mo10069s() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11655R6();
        }
    }

    @Override // p007l.ttl
    public int selectAudioTrack(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11696c7(i);
        }
        return -1;
    }

    @Override // p007l.ttl
    public void setEffectsVolume(double d) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11767s7(d);
        }
    }

    @Override // p007l.ttl
    public int setEnableSpeakerphone(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11771u7(z);
        }
        return -1;
    }

    public void setMusicPitch(int i) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.setMusicPitch(i);
        }
    }

    public void setMusicVolume(float f) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.setMusicVolume(f);
        }
    }

    @Override // p007l.ttl
    public void stopAllEffects() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11707e8();
        }
    }

    @Override // p007l.ttl
    public void stopEffect(int i) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11712f8(i);
        }
    }

    @Override // p007l.oq2
    public void stopSurroundMusic() {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.stopSurroundMusic();
        }
        super.stopSurroundMusic();
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo9494t0() {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11743m7(this.f5407H);
            this.f5412y.m11620I7(this.f5408I);
            this.f5412y.m11748n7(this.f3558i);
            this.f5412y.m11656R7(this.f5413z);
            this.f5412y.m11659S7(this.f5400A);
            this.f5412y.m11670W7(this.f5401B);
            this.f5412y.m11784z5(this.f5403D);
            this.f5412y.m11711f7(this.f5405F);
        }
        int i = this.f5409J;
        if (i != -1) {
            this.f5412y.m11616H7(i, this.f5410K);
        }
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.C0(this.f5412y);
        }
        MomoCodec momoCodec = this.f3555f;
        if (momoCodec == null) {
            return -5;
        }
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            momoCodec.e1(interfaceC0021a);
            ExtAudioWrapper extAudioWrapper = (ExtAudioWrapper) this.f3554e;
            vlw vlwVar = this.f3553d;
            extAudioWrapper.m353I2(2048, ((ulw) vlwVar).P, ((ulw) vlwVar).R, "Agora");
        }
        return super.mo9494t0();
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: t1 */
    public void mo9495t1(int i) {
        this.f5407H = i;
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11743m7(i);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo9497u0(boolean z) {
        super.mo9497u0(z);
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11730j7(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: u1 */
    public void mo10071u1(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11673X5(z);
        }
    }

    @Override // p007l.oq2, p007l.ttl
    /* JADX INFO: renamed from: v */
    public void mo10182v(String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var == null || str == null) {
            return;
        }
        xc0Var.m11779x7(str);
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: v0 */
    public void mo9498v0(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11710f6(z);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m11913v1(long j) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11691b8();
        }
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.v1(j);
        }
    }

    /* JADX INFO: renamed from: w */
    public long m11914w() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            return interfaceC0021a.w();
        }
        return 0L;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: w0 */
    public void mo10074w0(long j) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11642N7((int) j);
        }
        super.mo10074w0(j);
    }

    /* JADX INFO: renamed from: w1 */
    public void m11915w1() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.w1();
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: x */
    public void mo9499x(boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11601E6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: x1 */
    public int mo10076x1(String str) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            return xc0Var.m11734k8(str);
        }
        return -3;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: y1 */
    public float mo10077y1() {
        xc0 xc0Var = this.f5412y;
        return xc0Var != null ? xc0Var.m11775w6() : super.mo10077y1();
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: z */
    public void mo10078z(boolean z) {
        super.mo10078z(z);
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: z0 */
    public void mo10079z0(long j, boolean z) {
        xc0 xc0Var = this.f5412y;
        if (xc0Var != null) {
            xc0Var.m11725i6(j, z);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: Y */
    public void mo10034Y() {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: D1 */
    public void mo10000D1(bnw bnwVar) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: I0 */
    public void mo10008I0(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: P1 */
    public void mo10023P1(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: s0 */
    public void mo10070s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: u */
    public void mo9496u(boolean z) {
    }

    public yc0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC0021a interfaceC0021a) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC0021a);
        this.f5404E = new PipelineConcurrentHashMap<>();
        this.f5405F = false;
        this.f5406G = false;
        this.f5407H = 2;
        this.f5408I = -1;
        this.f5409J = -1;
        this.f5410K = false;
        this.f5411L = "";
        Context contextM10229t2 = m10229t2();
        uv00 uv00Var2 = this.f3550a;
        MomoCodec momoCodecH = vv00.h(contextM10229t2, uv00Var2, uv00Var2.j0(), this.f3550a.A0(), vlwVar);
        this.f3555f = momoCodecH;
        if (!(momoCodecH instanceof xc0)) {
            eyx.c().g(new Object[]{"createAgoraPushFilter create must instanceof AgoraPushFilter"});
        }
        this.f5412y = this.f3555f;
    }
}
