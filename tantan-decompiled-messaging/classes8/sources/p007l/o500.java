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
import com.momo.piplineext.codec.MoMoRtcPushFilter;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import java.security.InvalidParameterException;
import l.a2l0;
import l.anw;
import l.b2l0;
import l.bnw;
import l.cbl0;
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
public class o500 extends oq2 implements ttl {

    /* JADX INFO: renamed from: A */
    a2l0 f3497A;

    /* JADX INFO: renamed from: B */
    cbl0 f3498B;

    /* JADX INFO: renamed from: C */
    MRtcEventHandler f3499C;

    /* JADX INFO: renamed from: D */
    PipelineConcurrentHashMap<Long, uki0> f3500D;

    /* JADX INFO: renamed from: E */
    boolean f3501E;

    /* JADX INFO: renamed from: F */
    private boolean f3502F;

    /* JADX INFO: renamed from: G */
    private int f3503G;

    /* JADX INFO: renamed from: H */
    private int f3504H;

    /* JADX INFO: renamed from: I */
    private int f3505I;

    /* JADX INFO: renamed from: J */
    private boolean f3506J;

    /* JADX INFO: renamed from: K */
    private String f3507K;

    /* JADX INFO: renamed from: y */
    MoMoRtcPushFilter f3508y;

    /* JADX INFO: renamed from: z */
    z1l0 f3509z;

    /* JADX INFO: renamed from: l.o500$a */
    public class C0631a implements a2l0 {
        public C0631a(ttl.InterfaceC0721a interfaceC0721a) {
        }

        /* JADX INFO: renamed from: a */
        public void m10186a(long j, ski0 ski0Var, int i, int i2) {
            o500 o500Var = o500.this;
            o500.this.f3500D.put(Long.valueOf(j), new uki0(o500Var.f3550a, o500Var.f3553d, ski0Var, j));
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + j);
        }

        /* JADX INFO: renamed from: b */
        public void m10187b(long j, int i) {
            uki0 uki0Var = (uki0) o500.this.f3500D.get(Long.valueOf(j));
            if (uki0Var != null) {
                uki0Var.mo8566G();
            }
            o500.this.f3500D.remove(Long.valueOf(j));
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt: userID=" + j);
        }
    }

    /* JADX INFO: renamed from: l.o500$b */
    public class C0632b implements sml.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ya1 f3511a;

        public C0632b(ya1 ya1Var) {
            this.f3511a = ya1Var;
        }

        /* JADX INFO: renamed from: C */
        public mpd0 m10188C(mpd0 mpd0Var) {
            return this.f3511a.C(mpd0Var);
        }
    }

    public o500(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC0021a interfaceC0021a, String str) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC0021a);
        this.f3500D = new PipelineConcurrentHashMap<>();
        this.f3501E = false;
        this.f3502F = false;
        this.f3503G = 2;
        this.f3504H = -1;
        this.f3505I = -1;
        this.f3506J = false;
        this.f3507K = "";
        Context contextM10229t2 = m10229t2();
        uv00 uv00Var2 = this.f3550a;
        MoMoRtcPushFilter moMoRtcPushFilterL = vv00.l(contextM10229t2, uv00Var2, uv00Var2.j0(), this.f3550a.A0(), vlwVar, str);
        this.f3555f = moMoRtcPushFilterL;
        if (!(moMoRtcPushFilterL instanceof MoMoRtcPushFilter)) {
            throw new InvalidParameterException("createmomortcPushFilter create must instanceof momortcPushFilter");
        }
        this.f3508y = moMoRtcPushFilterL;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: A0 */
    public void mo9993A0(int i, int i2) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m239Z5(i, i2);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m10174A1(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m272i6(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: B */
    public void mo9995B(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m190M6(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: B0 */
    public void mo9996B0(xmw xmwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m196O4(xmwVar);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: B1 */
    public void mo9456B1(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m172I5(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: C0 */
    public void mo9997C0(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m281l5(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: D */
    public void mo9998D(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m150B6(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: D0 */
    public void mo9999D0(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m297p6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E */
    public void mo10001E(MRtcPusherHandler mRtcPusherHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m215T4(mRtcPusherHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E0 */
    public int mo10002E0(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            return moMoRtcPushFilter.m241a5(i);
        }
        return -1;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E1 */
    public void mo10003E1(boolean z, boolean z2) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m313v6(z, z2);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: F */
    public void mo10004F(String str, String str2) {
        this.f3507K = str;
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m249c6();
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: F1 */
    public void mo9458F1(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m235Y4(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: G */
    public void mo10006G(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m169H5(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: H0 */
    public void mo10007H0(ymw ymwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m207R4(ymwVar);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: H1 */
    public void mo9460H1(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m184L5(j, z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: J0 */
    public void mo10009J0(MRtcQualityHandler mRtcQualityHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m218U4(mRtcQualityHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K */
    public void mo10010K(int i, int i2, int i3, int i4) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m194N6(i, i2, i3, i4);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K1 */
    public boolean mo10012K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter == null) {
            return false;
        }
        moMoRtcPushFilter.m219U5(i, str, i2, d, d2, z, d3);
        return true;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: L */
    public void mo10013L(long j, float f) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m238Z4(j, f);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M */
    public void mo10015M(int i, double d) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m205Q6(i, d);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M0 */
    public void mo10016M0(int i, int i2) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m278k6(i, i2);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M1 */
    public void mo10017M1(ttl.InterfaceC0721a interfaceC0721a) {
        if (interfaceC0721a == null) {
            this.f3497A = null;
            MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
            if (moMoRtcPushFilter != null) {
                moMoRtcPushFilter.m185L6(null);
                return;
            }
            return;
        }
        C0631a c0631a = new C0631a(interfaceC0721a);
        this.f3497A = c0631a;
        MoMoRtcPushFilter moMoRtcPushFilter2 = this.f3508y;
        if (moMoRtcPushFilter2 != null) {
            moMoRtcPushFilter2.m185L6(c0631a);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: N */
    public void mo10018N(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m271i5(z);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public void m10175N1() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m227W6();
        }
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.N1();
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: O0 */
    public void mo10021O0(wmw wmwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m183L4(wmwVar);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: O1 */
    public boolean mo9854O1(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter == null) {
            return false;
        }
        moMoRtcPushFilter.m213S6(str);
        return true;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: Q0 */
    public void mo9466Q0(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m175J5(j, z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Q1 */
    public void mo10024Q1(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m256e6(str);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: R */
    public void mo10025R(ya1 ya1Var) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "Screen recording setOnFrameAvailabelCallback >>>>>>>>>>>>>>" + ya1Var);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            if (ya1Var != null) {
                moMoRtcPushFilter.m236Y5(true);
                this.f3550a.L(new C0632b(ya1Var));
            } else {
                this.f3550a.L((sml.a) null);
            }
            super.mo10025R(null);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: S */
    public void mo10026S(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m259f5(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo9468T0(int i) {
        super.mo9468T0(i);
        this.f3558i = i;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m290n6(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: T1 */
    public void mo10027T1(boolean z) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "setStreamReplaceMode:" + z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m167G6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: U */
    public void mo10028U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m230X4(mRtcTokenWillExpireHander);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: U0 */
    public void mo9469U0(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m178K5(j, z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: W */
    public void mo10029W(boolean z, String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m268h5(z, str);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m164F6(f);
        }
        super.mo10031W1(f);
    }

    @Override // p007l.oq2, p007l.ttl
    /* JADX INFO: renamed from: X */
    public void mo10176X(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m274j5(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: X1 */
    public void mo10033X1(MRtcEventHandler mRtcEventHandler) {
        this.f3499C = mRtcEventHandler;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m177K4(mRtcEventHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Y1 */
    public void mo10036Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m222V4(mRtcReceiveSeiHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Z */
    public void mo10037Z(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m307t6(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Z0 */
    public void mo10038Z0(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m277k5(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: Z1 */
    public void mo9472Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        super.mo9472Z1(mRtcAudioHandler, i, i2);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m188M4(mRtcAudioHandler);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: a */
    public void mo9473a(boolean z) {
        super.mo9473a(z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            if (z) {
                moMoRtcPushFilter.m321y6(0.0f);
            } else {
                moMoRtcPushFilter.m321y6(1.0f);
                this.f3508y.m166G5(false);
            }
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: a0 */
    public void mo10039a0(anw anwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m225W4(anwVar);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: a2 */
    public void mo10040a2(MRtcConnectHandler mRtcConnectHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m203Q4(mRtcConnectHandler);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: b */
    public void mo9474b(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m189M5(z);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: c */
    public long mo10041c() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        return moMoRtcPushFilter != null ? moMoRtcPushFilter.m322z5() : super.mo10041c();
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: c0 */
    public void mo10042c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m211S4(mRtcClientRoleChangedHandler);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: c1 */
    public void mo10043c1(int i, boolean z) {
        this.f3505I = i;
        this.f3506J = z;
    }

    /* JADX INFO: renamed from: d */
    public float m10177d() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            return interfaceC0021a.d();
        }
        return 1.0f;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: e */
    public void mo9476e(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m237Y6(str);
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
        ii70.d().a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" stopRecord"));
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m163F5(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: f2 */
    public void mo9480f2(int i) {
        super.mo9480f2(i);
    }

    @Override // p007l.oq2, p007l.j1m, p007l.ttl
    /* JADX INFO: renamed from: g */
    public igb0 mo9481g() {
        return null;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: g0 */
    public void mo10046g0(float f) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m321y6(f);
        }
        super.mo10046g0(f);
    }

    @Override // p007l.oq2, p007l.ttl
    public double getEffectsVolume() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            return moMoRtcPushFilter.m299q5();
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
        return 0;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h0 */
    public void mo10048h0(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m294o6(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h1 */
    public void mo10049h1(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m306s6(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h2 */
    public int mo10050h2(String str, String str2, String str3) {
        return 0;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: i0 */
    public void mo10051i0(MRtcChannelHandler mRtcChannelHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m199P4(mRtcChannelHandler);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m216T5();
        }
        super.mo10053j();
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: j1 */
    public void mo10054j1(boolean z, int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m323z6(z, i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: j2 */
    public void mo10055j2(hgd0 hgd0Var) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m159E6(hgd0Var);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: k */
    public int mo10056k() {
        return 0;
    }

    @Override // p007l.oq2, p007l.ttl
    /* JADX INFO: renamed from: k2 */
    public void mo10178k2(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m263g5(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: l1 */
    public int mo10057l1(boolean z) {
        return 0;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: l2 */
    public void mo10058l2(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m232X6(str);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: m0 */
    public void mo10059m0(z1l0 z1l0Var) {
        this.f3509z = z1l0Var;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m179K6(z1l0Var);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: m1 */
    public void mo9486m1(pcmDataAvailableCallback pcmdataavailablecallback) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m149A6(pcmdataavailablecallback);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: m2 */
    public sml mo9487m2() {
        return this.f3508y;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: n0 */
    public void mo9489n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m193N4(mRtcAudioHandlerEx);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m10179o0() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.o0();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public void m10180p1() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.p1();
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void pauseAllEffects() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m204Q5();
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void pauseEffect(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m208R5(i);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: q */
    public void mo10063q() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m252d6();
        }
        super.mo10063q();
    }

    /* JADX INFO: renamed from: q0 */
    public void m10181q0(long j) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.q0(j);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: r */
    public long mo10066r() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            return moMoRtcPushFilter.m148A5();
        }
        return 0L;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: r0 */
    public void mo10067r0(String str, boolean z, boolean z2, int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m217T6(str, z, z2, i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: r1 */
    public void mo10068r1(cbl0 cbl0Var) {
        this.f3498B = cbl0Var;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m197O6(cbl0Var);
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void resumeAllEffects() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m242a6();
        }
    }

    @Override // p007l.oq2, p007l.ttl
    public void resumeEffect(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m245b6(i);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: s */
    public void mo10069s() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m212S5();
        }
    }

    @Override // p007l.ttl
    public int selectAudioTrack(int i) {
        return 0;
    }

    @Override // p007l.ttl
    public void setEffectsVolume(double d) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m300q6(d);
        }
    }

    @Override // p007l.ttl
    public int setEnableSpeakerphone(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            return moMoRtcPushFilter.m304r6(z);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m220U6();
        }
    }

    @Override // p007l.ttl
    public void stopEffect(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m223V6(i);
        }
    }

    @Override // p007l.oq2
    public void stopSurroundMusic() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.stopSurroundMusic();
        }
        super.stopSurroundMusic();
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo9494t0() {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m285m6(this.f3503G);
            this.f3508y.m156D6(this.f3504H);
            this.f3508y.m290n6(this.f3558i);
            this.f3508y.m179K6(this.f3509z);
            this.f3508y.m185L6(this.f3497A);
            this.f3508y.m197O6(this.f3498B);
            this.f3508y.m177K4(this.f3499C);
            this.f3508y.m264g6(this.f3501E);
        }
        int i = this.f3505I;
        if (i != -1) {
            this.f3508y.m153C6(i, this.f3506J);
        }
        this.f3550a.C0(this.f3508y);
        MomoCodec momoCodec = this.f3555f;
        if (momoCodec == null) {
            return -5;
        }
        momoCodec.e1(this.f3554e);
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            ((ExtAudioWrapper) interfaceC0021a).m353I2(2048, ((ulw) this.f3553d).P, 1, "MomoRtc");
        }
        return super.mo9494t0();
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: t1 */
    public void mo9495t1(int i) {
        this.f3503G = i;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m285m6(i);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo9497u0(boolean z) {
        super.mo9497u0(z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m275j6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: u1 */
    public void mo10071u1(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m255e5(z);
        }
    }

    @Override // p007l.oq2, p007l.ttl
    /* JADX INFO: renamed from: v */
    public void mo10182v(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter == null || str == null) {
            return;
        }
        moMoRtcPushFilter.m311u6(str);
    }

    /* JADX INFO: renamed from: v1 */
    public void m10183v1(long j) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m209R6();
        }
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.v1(j);
        }
    }

    /* JADX INFO: renamed from: w */
    public long m10184w() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            return interfaceC0021a.w();
        }
        return 0L;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: w0 */
    public void mo10074w0(long j) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m170H6((int) j);
        }
        super.mo10074w0(j);
    }

    /* JADX INFO: renamed from: w1 */
    public void m10185w1() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.w1();
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: x */
    public void mo9499x(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m158E5(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: x1 */
    public int mo10076x1(String str) {
        return 0;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: y1 */
    public float mo10077y1() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        return moMoRtcPushFilter != null ? moMoRtcPushFilter.m320y5() : super.mo10077y1();
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: z */
    public void mo10078z(boolean z) {
        super.mo10078z(z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m201P6(z);
        }
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: z0 */
    public void mo10079z0(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f3508y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m289n5(j, z);
        }
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: Y */
    public void mo10034Y() {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: o */
    public void mo9490o() {
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
    /* JADX INFO: renamed from: K0 */
    public void mo10011K0(int i) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: L0 */
    public void mo10014L0(byte[] bArr) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: N0 */
    public void mo10019N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: P0 */
    public void mo10022P0(b2l0 b2l0Var) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: P1 */
    public void mo10023P1(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: o1 */
    public void mo10061o1(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: q1 */
    public void mo10065q1(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: s0 */
    public void mo10070s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: u */
    public void mo9496u(boolean z) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: v0 */
    public void mo9498v0(boolean z) {
    }

    public o500(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC0021a interfaceC0021a) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC0021a);
        this.f3500D = new PipelineConcurrentHashMap<>();
        this.f3501E = false;
        this.f3502F = false;
        this.f3503G = 2;
        this.f3504H = -1;
        this.f3505I = -1;
        this.f3506J = false;
        this.f3507K = "";
        Context contextM10229t2 = m10229t2();
        uv00 uv00Var2 = this.f3550a;
        MoMoRtcPushFilter moMoRtcPushFilterK = vv00.k(contextM10229t2, uv00Var2, uv00Var2.j0(), this.f3550a.A0(), vlwVar);
        this.f3555f = moMoRtcPushFilterK;
        if (moMoRtcPushFilterK instanceof MoMoRtcPushFilter) {
            this.f3508y = moMoRtcPushFilterK;
            return;
        }
        throw new InvalidParameterException("createmomortcPushFilter create must instanceof momortcPushFilter");
    }
}
