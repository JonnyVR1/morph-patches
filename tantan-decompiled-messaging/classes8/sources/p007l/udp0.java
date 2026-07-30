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
public class udp0 extends oq2 implements ttl {

    /* JADX INFO: renamed from: A */
    a2l0 f4894A;

    /* JADX INFO: renamed from: B */
    cbl0 f4895B;

    /* JADX INFO: renamed from: C */
    b2l0 f4896C;

    /* JADX INFO: renamed from: D */
    MRtcEventHandler f4897D;

    /* JADX INFO: renamed from: E */
    PipelineConcurrentHashMap<Long, uki0> f4898E;

    /* JADX INFO: renamed from: F */
    boolean f4899F;

    /* JADX INFO: renamed from: G */
    private boolean f4900G;

    /* JADX INFO: renamed from: H */
    private int f4901H;

    /* JADX INFO: renamed from: I */
    private int f4902I;

    /* JADX INFO: renamed from: J */
    private int f4903J;

    /* JADX INFO: renamed from: K */
    private boolean f4904K;

    /* JADX INFO: renamed from: L */
    private String f4905L;

    /* JADX INFO: renamed from: y */
    tdp0 f4906y;

    /* JADX INFO: renamed from: z */
    z1l0 f4907z;

    /* JADX INFO: renamed from: l.udp0$a */
    public class C0728a implements a2l0 {
        public C0728a(ttl.InterfaceC0721a interfaceC0721a) {
        }

        /* JADX INFO: renamed from: a */
        public void m11225a(long j, ski0 ski0Var, int i, int i2) {
            tdp0 tdp0Var = udp0.this.f4906y;
            if (tdp0Var != null) {
                tdp0Var.m11079b8(1);
            }
            udp0 udp0Var = udp0.this;
            udp0.this.f4898E.put(Long.valueOf(j), new uki0(udp0Var.f3550a, udp0Var.f3553d, ski0Var, j));
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + j);
        }

        /* JADX INFO: renamed from: b */
        public void m11226b(long j, int i) {
            tdp0 tdp0Var;
            uki0 uki0Var = (uki0) udp0.this.f4898E.get(Long.valueOf(j));
            if (uki0Var != null) {
                uki0Var.mo8566G();
            }
            udp0.this.f4898E.remove(Long.valueOf(j));
            if (udp0.this.f4898E.size() == 0 && (tdp0Var = udp0.this.f4906y) != null) {
                tdp0Var.m11079b8(0);
            }
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt: userID=" + j);
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.udp0$b */
    public class C0729b implements sml.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ya1 f4909a;

        public C0729b(ya1 ya1Var) {
            this.f4909a = ya1Var;
        }

        /* JADX INFO: renamed from: C */
        public mpd0 m11227C(mpd0 mpd0Var) {
            return this.f4909a.C(mpd0Var);
        }
    }

    public udp0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC0021a interfaceC0021a, String str) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC0021a);
        this.f4898E = new PipelineConcurrentHashMap<>();
        this.f4899F = false;
        this.f4900G = false;
        this.f4901H = 2;
        this.f4902I = -1;
        this.f4903J = -1;
        this.f4904K = false;
        this.f4905L = "";
        Context contextM10229t2 = m10229t2();
        uv00 uv00Var2 = this.f3550a;
        MomoCodec momoCodecQ = vv00.q(contextM10229t2, uv00Var2, uv00Var2.j0(), this.f3550a.A0(), vlwVar, str);
        this.f3555f = momoCodecQ;
        if (!(momoCodecQ instanceof tdp0)) {
            eyx.c().g(new Object[]{"createAgoraPushFilter create must instanceof VolcPushFilter"});
        }
        this.f4906y = this.f3555f;
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
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11069Y6(i, i2);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m11216A1(int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11109h7(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: B */
    public void mo9995B(String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11051T7(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: B0 */
    public void mo9996B0(xmw xmwVar) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11024M5(xmwVar);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: B1 */
    public void mo9456B1(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11005I6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: C0 */
    public void mo9997C0(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11115j6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: D */
    public void mo9998D(int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m10988D7(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: D0 */
    public void mo9999D0(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11146q7(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E */
    public void mo10001E(MRtcPusherHandler mRtcPusherHandler) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11042R5(mRtcPusherHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E0 */
    public int mo10002E0(int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            return tdp0Var.m11068Y5(i);
        }
        return -1;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E1 */
    public void mo10003E1(boolean z, boolean z2) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11167x7(z, z2);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: F */
    public void mo10004F(String str, String str2) {
        this.f4905L = str;
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
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11078b7();
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: F1 */
    public void mo9458F1(int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11059W5(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: G */
    public void mo10006G(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11002H6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: H0 */
    public void mo10007H0(ymw ymwVar) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11034P5(ymwVar);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: H1 */
    public void mo9460H1(long j, boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11014K6(j, z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: J0 */
    public void mo10009J0(MRtcQualityHandler mRtcQualityHandler) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11045S5(mRtcQualityHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K */
    public void mo10010K(int i, int i2, int i3, int i4) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11054U7(i, i2, i3, i4);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K0 */
    public void mo10011K0(int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11113i7(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K1 */
    public boolean mo10012K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var == null) {
            return false;
        }
        tdp0Var.m11050T6(i, str, i2, d, d2, z, d3);
        return true;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: L */
    public void mo10013L(long j, float f) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11064X5(j, f);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: L0 */
    public void mo10014L0(byte[] bArr) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11092e7(new String(bArr));
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M */
    public void mo10015M(int i, double d) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11075a8(i, d);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M0 */
    public void mo10016M0(int i, int i2) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11125l7(i, i2);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M1 */
    public void mo10017M1(ttl.InterfaceC0721a interfaceC0721a) {
        if (interfaceC0721a == null) {
            this.f4894A = null;
            tdp0 tdp0Var = this.f4906y;
            if (tdp0Var != null) {
                tdp0Var.m11044R7(null);
            }
        }
        C0728a c0728a = new C0728a(interfaceC0721a);
        this.f4894A = c0728a;
        tdp0 tdp0Var2 = this.f4906y;
        if (tdp0Var2 != null) {
            tdp0Var2.m11044R7(c0728a);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: N */
    public void mo10018N(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11108h6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: N0 */
    public void mo10019N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11004I5(mRtcExitRoomHandler);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public void m11217N1() {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11110h8();
        }
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.N1();
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: O0 */
    public void mo10021O0(wmw wmwVar) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11009J5(wmwVar);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: O1 */
    public boolean mo9854O1(String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var == null) {
            return false;
        }
        tdp0Var.m11088d8(str);
        return true;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: P0 */
    public void mo10022P0(b2l0 b2l0Var) {
        this.f4896C = b2l0Var;
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            vlw vlwVar = this.f3553d;
            if (b2l0Var != null) {
                vlwVar.Z0 = true;
            } else {
                vlwVar.Z0 = false;
            }
            tdp0Var.m11036P7(b2l0Var);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: Q0 */
    public void mo9466Q0(long j, boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11010J6(j, z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Q1 */
    public void mo10024Q1(String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11092e7(str);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: R */
    public void mo10025R(ya1 ya1Var) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "Screen recording setOnFrameAvailabelCallback >>>>>>>>>>>>>>" + ya1Var);
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            if (ya1Var != null) {
                tdp0Var.m11060W6(true);
                this.f3550a.L(new C0729b(ya1Var));
            } else {
                this.f3550a.L((sml.a) null);
            }
            super.mo10025R(null);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: S */
    public void mo10026S(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11091e6(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo9468T0(int i) {
        super.mo9468T0(i);
        this.f3558i = i;
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11139o7(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: T1 */
    public void mo10027T1(boolean z) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "setStreamReplaceMode:" + z);
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11015K7(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: U */
    public void mo10028U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11056V5(mRtcTokenWillExpireHander);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: W */
    public void mo10029W(boolean z, String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11102g6(z, str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: W0 */
    public int mo10030W0(int i, ikw ikwVar) {
        return 0;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: W1 */
    public void mo10031W1(float f) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11011J7(f);
        }
        super.mo10031W1(f);
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: X1 */
    public void mo10033X1(MRtcEventHandler mRtcEventHandler) {
        this.f4897D = mRtcEventHandler;
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11001H5(mRtcEventHandler);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: Y0 */
    public void mo10035Y0(long j, boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11084c8();
        }
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.Y0(j, z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Y1 */
    public void mo10036Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11049T5(mRtcReceiveSeiHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Z */
    public void mo10037Z(String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11161v7(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Z0 */
    public void mo10038Z0(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11112i6(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: Z1 */
    public void mo9472Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        super.mo9472Z1(mRtcAudioHandler, i, i2);
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11013K5(mRtcAudioHandler);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: a */
    public void mo9473a(boolean z) {
        super.mo9473a(z);
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m10998G6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: a0 */
    public void mo10039a0(anw anwVar) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11052U5(anwVar);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: a2 */
    public void mo10040a2(MRtcConnectHandler mRtcConnectHandler) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11031O5(mRtcConnectHandler);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: b */
    public void mo9474b(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11020L6(z);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: c */
    public long mo10041c() {
        tdp0 tdp0Var = this.f4906y;
        return tdp0Var != null ? tdp0Var.m11160v6() : super.mo10041c();
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: c0 */
    public void mo10042c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11038Q5(mRtcClientRoleChangedHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: c1 */
    public void mo10043c1(int i, boolean z) {
        this.f4903J = i;
        this.f4904K = z;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: c2 */
    public void mo9475c2(MRtcAudioHandler mRtcAudioHandler, int i, int i2, int i3) {
        super.mo9475c2(mRtcAudioHandler, i, i2, i3);
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11013K5(mRtcAudioHandler);
        }
    }

    /* JADX INFO: renamed from: d */
    public float m11218d() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            return interfaceC0021a.d();
        }
        return 1.0f;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: e */
    public void mo9476e(String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11135n8(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: e0 */
    public int mo10045e0(int i) {
        return 0;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: f */
    public void mo9478f() {
        String str;
        ii70.d().a("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName().concat(" stopRecord"));
        if (this.f3555f != null) {
            str = "" + this.f3555f.hashCode();
        } else {
            str = "null";
        }
        eyx.c().g(new Object[]{"VolcPusherPipline stopRecord this.code:" + hashCode() + ",codec hashcode:" + str});
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
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m10995F6(z);
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
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m10981A7(f);
        }
        super.mo10046g0(f);
    }

    @Override // p007l.oq2, p007l.ttl
    public double getEffectsVolume() {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            return tdp0Var.m11145q6();
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
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            return tdp0Var.m11070Y7(i);
        }
        return -1;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h0 */
    public void mo10048h0(String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11143p7(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h1 */
    public void mo10049h1(String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11158u7(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h2 */
    public int mo10050h2(String str, String str2, String str3) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            return tdp0Var.m11116j8(str, str2, str3);
        }
        return -3;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: i0 */
    public void mo10051i0(MRtcChannelHandler mRtcChannelHandler) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11027N5(mRtcChannelHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: i2 */
    public int mo10052i2(int i) {
        return 0;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: j */
    public void mo10053j() {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11046S6();
        }
        super.mo10053j();
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: j1 */
    public void mo10054j1(boolean z, int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m10982B7(z, i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: j2 */
    public void mo10055j2(hgd0 hgd0Var) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11006I7(hgd0Var);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: k */
    public int mo10056k() {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            return tdp0Var.m11138o6();
        }
        return 0;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: k0 */
    public void mo9483k0() {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11134n7(this.f4901H);
            this.f4906y.m10999G7(this.f4902I);
            this.f4906y.m11139o7(this.f3558i);
            this.f4906y.m11040Q7(this.f4907z);
            this.f4906y.m11044R7(this.f4894A);
            this.f4906y.m11065X7(this.f4895B);
            this.f4906y.m11001H5(this.f4897D);
            this.f4906y.m11097f7(this.f4899F);
        }
        int i = this.f4903J;
        if (i != -1) {
            this.f4906y.m10996F7(i, this.f4904K);
        }
        this.f3550a.C0(this.f4906y);
        MomoCodec momoCodec = this.f3555f;
        if (momoCodec == null) {
            return;
        }
        momoCodec.e1(this.f3554e);
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            vlw vlwVar = this.f3553d;
            ((ExtAudioWrapper) interfaceC0021a).m353I2(2048, ((ulw) vlwVar).P, ((ulw) vlwVar).R, "Volc");
        }
        super.mo9483k0();
    }

    @Override // p007l.oq2, p007l.ttl
    /* JADX INFO: renamed from: k2 */
    public void mo10178k2(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11096f6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: l1 */
    public int mo10057l1(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var == null) {
            return 0;
        }
        tdp0Var.m11072Z7(z);
        return 0;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: l2 */
    public void mo10058l2(String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11126l8(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: m0 */
    public void mo10059m0(z1l0 z1l0Var) {
        this.f4907z = z1l0Var;
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11040Q7(z1l0Var);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: m1 */
    public void mo9486m1(pcmDataAvailableCallback pcmdataavailablecallback) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m10985C7(pcmdataavailablecallback);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: m2 */
    public sml mo9487m2() {
        return this.f4906y;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: n0 */
    public void mo9489n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11019L5(mRtcAudioHandlerEx);
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
    public void m11219o0() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.o0();
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: o1 */
    public void mo10061o1(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11153s7(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: p */
    public void mo9491p(String str, int i) {
        super.mo9491p(str, i);
    }

    /* JADX INFO: renamed from: p1 */
    public void m11220p1() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.p1();
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void pauseAllEffects() {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11035P6();
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void pauseEffect(int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11039Q6(i);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: q */
    public void mo10063q() {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11083c7();
        }
        super.mo10063q();
    }

    /* JADX INFO: renamed from: q0 */
    public void m11221q0(long j) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.q0(j);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: q1 */
    public void mo10065q1(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m10991E7(z);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: r */
    public long mo10066r() {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            return tdp0Var.m11163w6();
        }
        return 0L;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: r0 */
    public void mo10067r0(String str, boolean z, boolean z2, int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11093e8(str, z, z2, i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: r1 */
    public void mo10068r1(cbl0 cbl0Var) {
        this.f4895B = cbl0Var;
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11065X7(cbl0Var);
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void resumeAllEffects() {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11071Z6();
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void resumeEffect(int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11074a7(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: s */
    public void mo10069s() {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11043R6();
        }
    }

    @Override // p007l.ttl
    public int selectAudioTrack(int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var == null) {
            return 0;
        }
        tdp0Var.m11087d7(i);
        return 0;
    }

    @Override // p007l.ttl
    public void setEffectsVolume(double d) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11150r7(d);
        }
    }

    @Override // p007l.ttl
    public int setEnableSpeakerphone(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            return tdp0Var.m11154t7(z);
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
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11098f8();
        }
    }

    @Override // p007l.ttl
    public void stopEffect(int i) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11104g8(i);
        }
    }

    @Override // p007l.oq2
    public void stopSurroundMusic() {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.stopSurroundMusic();
        }
        super.stopSurroundMusic();
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo9494t0() {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11134n7(this.f4901H);
            this.f4906y.m10999G7(this.f4902I);
            this.f4906y.m11139o7(this.f3558i);
            this.f4906y.m11040Q7(this.f4907z);
            this.f4906y.m11044R7(this.f4894A);
            this.f4906y.m11065X7(this.f4895B);
            this.f4906y.m11001H5(this.f4897D);
            this.f4906y.m11097f7(this.f4899F);
        }
        int i = this.f4903J;
        if (i != -1) {
            this.f4906y.m10996F7(i, this.f4904K);
        }
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.C0(this.f4906y);
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
            extAudioWrapper.m353I2(2048, ((ulw) vlwVar).P, ((ulw) vlwVar).R, "Volc");
        }
        return super.mo9494t0();
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: t1 */
    public void mo9495t1(int i) {
        this.f4901H = i;
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11134n7(i);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo9497u0(boolean z) {
        super.mo9497u0(z);
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11120k7(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: u1 */
    public void mo10071u1(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11086d6(z);
        }
    }

    @Override // p007l.oq2, p007l.ttl
    /* JADX INFO: renamed from: v */
    public void mo10182v(String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var == null || str == null) {
            return;
        }
        tdp0Var.m11164w7(str);
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: v0 */
    public void mo9498v0(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11119k6(z);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m11222v1(long j) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11084c8();
        }
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.v1(j);
        }
    }

    /* JADX INFO: renamed from: w */
    public long m11223w() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            return interfaceC0021a.w();
        }
        return 0L;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: w0 */
    public void mo10074w0(long j) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11021L7((int) j);
        }
        super.mo10074w0(j);
    }

    /* JADX INFO: renamed from: w1 */
    public void m11224w1() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.w1();
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: x */
    public void mo9499x(boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m10990E6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: x1 */
    public int mo10076x1(String str) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            return tdp0Var.m11121k8(str);
        }
        return -3;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: y1 */
    public float mo10077y1() {
        tdp0 tdp0Var = this.f4906y;
        return tdp0Var != null ? tdp0Var.m11157u6() : super.mo10077y1();
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: z */
    public void mo10078z(boolean z) {
        super.mo10078z(z);
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: z0 */
    public void mo10079z0(long j, boolean z) {
        tdp0 tdp0Var = this.f4906y;
        if (tdp0Var != null) {
            tdp0Var.m11124l6(j, z);
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

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: m */
    public void mo9485m(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: s0 */
    public void mo10070s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: u */
    public void mo9496u(boolean z) {
    }

    public udp0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC0021a interfaceC0021a) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC0021a);
        this.f4898E = new PipelineConcurrentHashMap<>();
        this.f4899F = false;
        this.f4900G = false;
        this.f4901H = 2;
        this.f4902I = -1;
        this.f4903J = -1;
        this.f4904K = false;
        this.f4905L = "";
        Context contextM10229t2 = m10229t2();
        uv00 uv00Var2 = this.f3550a;
        MomoCodec momoCodecP = vv00.p(contextM10229t2, uv00Var2, uv00Var2.j0(), this.f3550a.A0(), vlwVar);
        this.f3555f = momoCodecP;
        if (!(momoCodecP instanceof tdp0)) {
            eyx.c().g(new Object[]{"createAgoraPushFilter create must instanceof VolcPushFilter"});
        }
        this.f4906y = this.f3555f;
    }
}
