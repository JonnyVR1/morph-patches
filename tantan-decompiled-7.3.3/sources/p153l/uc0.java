package p153l;

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
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;

/* JADX INFO: loaded from: classes8.dex */
public class uc0 extends fr2 implements hwl {

    /* JADX INFO: renamed from: A */
    fbl0 f178377A;

    /* JADX INFO: renamed from: B */
    gkl0 f178378B;

    /* JADX INFO: renamed from: C */
    gbl0 f178379C;

    /* JADX INFO: renamed from: D */
    MRtcEventHandler f178380D;

    /* JADX INFO: renamed from: E */
    PipelineConcurrentHashMap<Long, uti0> f178381E;

    /* JADX INFO: renamed from: F */
    boolean f178382F;

    /* JADX INFO: renamed from: G */
    private boolean f178383G;

    /* JADX INFO: renamed from: H */
    private int f178384H;

    /* JADX INFO: renamed from: I */
    private int f178385I;

    /* JADX INFO: renamed from: J */
    private int f178386J;

    /* JADX INFO: renamed from: K */
    private boolean f178387K;

    /* JADX INFO: renamed from: L */
    private String f178388L;

    /* JADX INFO: renamed from: y */
    tc0 f178389y;

    /* JADX INFO: renamed from: z */
    ebl0 f178390z;

    /* JADX INFO: renamed from: l.uc0$a */
    public class C20540a implements fbl0 {
        public C20540a(hwl.InterfaceC17586a interfaceC17586a) {
        }

        @Override // p153l.fbl0
        /* JADX INFO: renamed from: a */
        public void mo109337a(long j, sti0 sti0Var, int i, int i2) {
            tc0 tc0Var = uc0.this.f178389y;
            if (tc0Var != null) {
                tc0Var.m190345Y7(1);
            }
            uc0 uc0Var = uc0.this;
            uc0.this.f178381E.put(Long.valueOf(j), new uti0(uc0Var.f100362a, uc0Var.f100365d, sti0Var, j));
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + j);
        }

        @Override // p153l.fbl0
        /* JADX INFO: renamed from: b */
        public void mo109338b(long j, int i) {
            tc0 tc0Var;
            uti0 uti0Var = uc0.this.f178381E.get(Long.valueOf(j));
            if (uti0Var != null) {
                uti0Var.mo109166G();
            }
            uc0.this.f178381E.remove(Long.valueOf(j));
            if (uc0.this.f178381E.size() == 0 && (tc0Var = uc0.this.f178389y) != null) {
                tc0Var.m190345Y7(0);
            }
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt: userID=" + j);
        }
    }

    /* JADX INFO: renamed from: l.uc0$b */
    public class C20541b implements dpl.InterfaceC16599a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ fb1 f178392a;

        public C20541b(fb1 fb1Var) {
            this.f178392a = fb1Var;
        }

        @Override // p153l.dpl.InterfaceC16599a
        /* JADX INFO: renamed from: C */
        public oxd0 mo109339C(oxd0 oxd0Var) {
            return this.f178392a.mo19373C(oxd0Var);
        }
    }

    public uc0(@NonNull Context context, @NonNull c410 c410Var, @NonNull z5m z5mVar, @NonNull uow uowVar, @NonNull InterfaceC4260a interfaceC4260a, String str) {
        super(context, c410Var, z5mVar, uowVar, interfaceC4260a);
        this.f178381E = new PipelineConcurrentHashMap<>();
        this.f178382F = false;
        this.f178383G = false;
        this.f178384H = 2;
        this.f178385I = -1;
        this.f178386J = -1;
        this.f178387K = false;
        this.f178388L = "";
        Context contextM126853t2 = m126853t2();
        c410 c410Var2 = this.f100362a;
        MomoCodec momoCodecM114072i = d410.m114072i(contextM126853t2, c410Var2, c410Var2.mo20703j0(), this.f100362a.mo20673A0(), uowVar, str);
        this.f100367f = momoCodecM114072i;
        if (!(momoCodecM114072i instanceof tc0)) {
            b7y.m102882c().m102888g("createAgoraPushFilter create must instanceof AgoraPushFilter");
        }
        this.f178389y = (tc0) this.f100367f;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: A */
    public void mo107888A() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" stopRecord"));
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20695e0(this.f100367f);
        }
        super.mo107888A();
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21136z1(this.f100365d.f175477d0);
            ExtAudioWrapper extAudioWrapper = (ExtAudioWrapper) this.f100366e;
            uow uowVar = this.f100365d;
            extAudioWrapper.m21086I2(2048, uowVar.f175459P, uowVar.f175461R, "Momo");
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: A0 */
    public void mo109266A0(int i, int i2) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190341X6(i, i2);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: A1 */
    public void mo109267A1(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190372i7(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: B */
    public void mo109268B(String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190333T7(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: B0 */
    public void mo109269B0(vpw vpwVar) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190292E5(vpwVar);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: B1 */
    public void mo107889B1(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190305I6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: C0 */
    public void mo109270C0(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190360e6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: D */
    public void mo109271D(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190297F7(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: D0 */
    public void mo109272D0(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190391q7(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E */
    public void mo109274E(MRtcPusherHandler mRtcPusherHandler) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190307J5(mRtcPusherHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E0 */
    public int mo109275E0(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190326R5(i);
        }
        return -1;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E1 */
    public void mo109276E1(boolean z, boolean z2) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190404y7(z, z2);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: F */
    public void mo21081F(String str, String str2) {
        this.f178388L = str;
        super.mo21081F(str, str2);
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21118l(1);
            this.f100366e.mo21081F(str, str2);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: F0 */
    public void mo109277F0() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190350a7();
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: F1 */
    public void mo107891F1(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190321P5(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: G */
    public void mo109278G(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190302H6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: H0 */
    public void mo109279H0(wpw wpwVar) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190301H5(wpwVar);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: H1 */
    public void mo107893H1(long j, boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190310K6(j, z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: J0 */
    public void mo109281J0(MRtcQualityHandler mRtcQualityHandler) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190309K5(mRtcQualityHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K */
    public void mo109282K(int i, int i2, int i3, int i4) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190335U7(i, i2, i3, i4);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K0 */
    public void mo109283K0(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190319O5(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K1 */
    public boolean mo109284K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var == null) {
            return false;
        }
        tc0Var.m190332T6(i, str, i2, d, d2, z, d3);
        return true;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: L */
    public void mo109285L(long j, float f) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190323Q5(j, f);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: L0 */
    public void mo109286L0(byte[] bArr) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190361e7(bArr);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M */
    public void mo109287M(int i, double d) throws Throwable {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190342X7(i, d);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M0 */
    public void mo109288M0(int i, int i2) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190377k7(i, i2);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M1 */
    public void mo109289M1(hwl.InterfaceC17586a interfaceC17586a) {
        if (interfaceC17586a == null) {
            this.f178377A = null;
            tc0 tc0Var = this.f178389y;
            if (tc0Var != null) {
                tc0Var.m190331S7(null);
            }
        }
        C20540a c20540a = new C20540a(interfaceC17586a);
        this.f178377A = c20540a;
        tc0 tc0Var2 = this.f178389y;
        if (tc0Var2 != null) {
            tc0Var2.m190331S7(c20540a);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: N */
    public void mo109290N(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190351b6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: N0 */
    public void mo109291N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190283A5(mRtcExitRoomHandler);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: N1 */
    public void mo21090N1() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190368g8();
        }
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21090N1();
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: O0 */
    public void mo109292O0(upw upwVar) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190285B5(upwVar);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: O1 */
    public boolean mo21092O1(String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var == null) {
            return false;
        }
        tc0Var.m190356c8(str);
        return true;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: P0 */
    public void mo109293P0(gbl0 gbl0Var) {
        this.f178379C = gbl0Var;
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            uow uowVar = this.f100365d;
            if (gbl0Var != null) {
                uowVar.f180181Z0 = true;
            } else {
                uowVar.f180181Z0 = false;
            }
            tc0Var.m190325Q7(gbl0Var);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: Q0 */
    public void mo107899Q0(long j, boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190308J6(j, z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Q1 */
    public void mo109295Q1(String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190358d7(str);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: R */
    public void mo109296R(fb1 fb1Var) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "Screen recording setOnFrameAvailabelCallback >>>>>>>>>>>>>>" + fb1Var);
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            if (fb1Var != null) {
                tc0Var.m190338W6(true);
                this.f100362a.mo107817L(new C20541b(fb1Var));
            } else {
                this.f100362a.mo107817L(null);
            }
            super.mo109296R(null);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: S */
    public void mo109297S(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190343Y5(z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: T0 */
    public void mo107901T0(int i) {
        super.mo107901T0(i);
        this.f100370i = i;
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190385n7(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: T1 */
    public void mo109298T1(boolean z) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "setStreamReplaceMode:" + z);
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190316M7(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: U */
    public void mo109299U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190317N5(mRtcTokenWillExpireHander);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: W */
    public void mo109300W(boolean z, String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190349a6(z, str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: W0 */
    public int mo109301W0(int i, hnw hnwVar) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190393r7(i, hnwVar);
        }
        return -1;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: W1 */
    public void mo21100W1(float f) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190314L7(f);
        }
        super.mo21100W1(f);
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: X1 */
    public void mo109303X1(MRtcEventHandler mRtcEventHandler) {
        this.f178380D = mRtcEventHandler;
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190405z5(mRtcEventHandler);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: Y0 */
    public void mo21101Y0(long j, boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190353b8();
        }
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21101Y0(j, z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Y1 */
    public void mo109305Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190312L5(mRtcReceiveSeiHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Z */
    public void mo109306Z(String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190400w7(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Z0 */
    public void mo109307Z0(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190357d6(z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: Z1 */
    public void mo107905Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        super.mo107905Z1(mRtcAudioHandler, i, i2);
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190287C5(mRtcAudioHandler);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: a */
    public void mo107906a(boolean z) {
        super.mo107906a(z);
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            if (z) {
                tc0Var.m190286B7(0.0f);
            } else {
                tc0Var.m190286B7(1.0f);
                this.f178389y.m190299G6(false);
            }
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: a0 */
    public void mo109308a0(ypw ypwVar) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190315M5(ypwVar);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: a2 */
    public void mo109309a2(MRtcConnectHandler mRtcConnectHandler) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190298G5(mRtcConnectHandler);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: b */
    public void mo107907b(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190313L6(z);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: c */
    public long mo21107c() {
        tc0 tc0Var = this.f178389y;
        return tc0Var != null ? tc0Var.m190401x6() : super.mo21107c();
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: c0 */
    public void mo109310c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190304I5(mRtcClientRoleChangedHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: c1 */
    public void mo109311c1(int i, boolean z) {
        this.f178386J = i;
        this.f178387K = z;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: c2 */
    public void mo107908c2(MRtcAudioHandler mRtcAudioHandler, int i, int i2, int i3) {
        super.mo107908c2(mRtcAudioHandler, i, i2, i3);
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190287C5(mRtcAudioHandler);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: d */
    public float mo21108d() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            return interfaceC4260a.mo21108d();
        }
        return 1.0f;
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: e */
    public void mo107909e(String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190384m8(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: e0 */
    public int mo109312e0(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190369h7(i);
        }
        return -1;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: f */
    public void mo107911f() {
        String str;
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" stopRecord"));
        if (this.f100367f != null) {
            str = "" + this.f100367f.hashCode();
        } else {
            str = "null";
        }
        b7y.m102882c().m102888g("AgoraPushPipline stopRecord this.code:" + hashCode() + ",codec hashcode:" + str);
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20694d0(this.f100367f);
        }
        super.mo107911f();
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21136z1(this.f100365d.f175477d0);
            ExtAudioWrapper extAudioWrapper = (ExtAudioWrapper) this.f100366e;
            uow uowVar = this.f100365d;
            extAudioWrapper.m21086I2(2048, uowVar.f175459P, uowVar.f175461R, "Momo");
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: f1 */
    public void mo107912f1(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190296F6(z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: f2 */
    public void mo107913f2(int i) {
        super.mo107913f2(i);
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: g0 */
    public void mo109313g0(float f) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190286B7(f);
        }
        super.mo109313g0(f);
    }

    @Override // p153l.fr2, p153l.hwl
    public double getEffectsVolume() {
        tc0 tc0Var = this.f178389y;
        return tc0Var != null ? tc0Var.m190386o6() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // p153l.l6m
    public long getMusicDuration() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            return interfaceC4260a.getMusicDuration();
        }
        return 0L;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h */
    public int mo109314h(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190367g7(i);
        }
        return 0;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h0 */
    public void mo109315h0(String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190387o7(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h1 */
    public void mo109316h1(String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190398v7(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h2 */
    public int mo109317h2(String str, String str2, String str3) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190370h8(str, str2);
        }
        return -3;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: i0 */
    public void mo109318i0(MRtcChannelHandler mRtcChannelHandler) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190295F5(mRtcChannelHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: i2 */
    public int mo109319i2(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190294E7(i);
        }
        return -1;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: j */
    public void mo21116j() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190330S6();
        }
        super.mo21116j();
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: j1 */
    public void mo109320j1(boolean z, int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190288C7(z, i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: j2 */
    public void mo109321j2(kod0 kod0Var) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190311K7(kod0Var);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: k */
    public int mo109322k() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190382m6();
        }
        return -1;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: k0 */
    public void mo107916k0() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190383m7(this.f178384H);
            this.f178389y.m190306I7(this.f178385I);
            this.f178389y.m190385n7(this.f100370i);
            this.f178389y.m190328R7(this.f178390z);
            this.f178389y.m190331S7(this.f178377A);
            this.f178389y.m190339W7(this.f178378B);
            this.f178389y.m190405z5(this.f178380D);
            this.f178389y.m190364f7(this.f178382F);
        }
        int i = this.f178386J;
        if (i != -1) {
            this.f178389y.m190303H7(i, this.f178387K);
        }
        this.f100362a.mo20676C0(this.f178389y);
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec == null) {
            return;
        }
        momoCodec.mo20660e1(this.f100366e);
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            uow uowVar = this.f100365d;
            ((ExtAudioWrapper) interfaceC4260a).m21086I2(2048, uowVar.f175459P, uowVar.f175461R, "Agora");
        }
        super.mo107916k0();
    }

    @Override // p153l.fr2, p153l.hwl
    /* JADX INFO: renamed from: k2 */
    public void mo109323k2(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190346Z5(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: l1 */
    public int mo109324l1(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var == null) {
            return 0;
        }
        tc0Var.m190354c6(z);
        return 0;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: l2 */
    public void mo109325l2(String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190381l8(str);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: m */
    public void mo107918m(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190388p7(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: m0 */
    public void mo109326m0(ebl0 ebl0Var) {
        this.f178390z = ebl0Var;
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190328R7(ebl0Var);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: m1 */
    public void mo107919m1(pcmDataAvailableCallback pcmdataavailablecallback) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190291D7(pcmdataavailablecallback);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: m2 */
    public dpl mo107920m2() {
        return this.f178389y;
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: n0 */
    public void mo107922n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190289D5(mRtcAudioHandlerEx);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: o */
    public void mo107923o() {
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20709o();
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: o0 */
    public void mo21121o0() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21121o0();
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: o1 */
    public void mo109327o1(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190396t7(z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: p */
    public void mo107924p(String str, int i) {
        super.mo107924p(str, i);
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: p1 */
    public void mo21122p1() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21122p1();
        }
    }

    @Override // p153l.fr2, p153l.hwl
    public void pauseAllEffects() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190322P6();
        }
    }

    @Override // p153l.fr2, p153l.hwl
    public void pauseEffect(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190324Q6(i);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: q */
    public void mo21124q() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190352b7();
        }
        super.mo21124q();
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: q0 */
    public void mo21125q0(long j) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21125q0(j);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: q1 */
    public void mo109328q1(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190300G7(z);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: r */
    public long mo21126r() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190403y6();
        }
        return 0L;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: r0 */
    public void mo109329r0(String str, boolean z, boolean z2, int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190359d8(str, z, z2, i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: r1 */
    public void mo109330r1(gkl0 gkl0Var) {
        this.f178378B = gkl0Var;
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190339W7(gkl0Var);
        }
    }

    @Override // p153l.fr2, p153l.hwl
    public void resumeAllEffects() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190344Y6();
        }
    }

    @Override // p153l.fr2, p153l.hwl
    public void resumeEffect(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190347Z6(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: s */
    public void mo109331s() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190327R6();
        }
    }

    @Override // p153l.hwl
    public int selectAudioTrack(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190355c7(i);
        }
        return -1;
    }

    @Override // p153l.hwl
    public void setEffectsVolume(double d) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190395s7(d);
        }
    }

    @Override // p153l.hwl
    public int setEnableSpeakerphone(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190397u7(z);
        }
        return -1;
    }

    @Override // p153l.l6m
    public void setMusicPitch(int i) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.setMusicPitch(i);
        }
    }

    @Override // p153l.l6m
    public void setMusicVolume(float f) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.setMusicVolume(f);
        }
    }

    @Override // p153l.hwl
    public void stopAllEffects() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190362e8();
        }
    }

    @Override // p153l.hwl
    public void stopEffect(int i) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190365f8(i);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    public void stopSurroundMusic() {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.stopSurroundMusic();
        }
        super.stopSurroundMusic();
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: t0 */
    public int mo107927t0() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190383m7(this.f178384H);
            this.f178389y.m190306I7(this.f178385I);
            this.f178389y.m190385n7(this.f100370i);
            this.f178389y.m190328R7(this.f178390z);
            this.f178389y.m190331S7(this.f178377A);
            this.f178389y.m190339W7(this.f178378B);
            this.f178389y.m190405z5(this.f178380D);
            this.f178389y.m190364f7(this.f178382F);
        }
        int i = this.f178386J;
        if (i != -1) {
            this.f178389y.m190303H7(i, this.f178387K);
        }
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20676C0(this.f178389y);
        }
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec == null) {
            return -5;
        }
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            momoCodec.mo20660e1(interfaceC4260a);
            ExtAudioWrapper extAudioWrapper = (ExtAudioWrapper) this.f100366e;
            uow uowVar = this.f100365d;
            extAudioWrapper.m21086I2(2048, uowVar.f175459P, uowVar.f175461R, "Agora");
        }
        return super.mo107927t0();
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: t1 */
    public void mo107928t1(int i) {
        this.f178384H = i;
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190383m7(i);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: u0 */
    public void mo107930u0(boolean z) {
        super.mo107930u0(z);
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190375j7(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: u1 */
    public void mo109333u1(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190340X5(z);
        }
    }

    @Override // p153l.fr2, p153l.hwl
    /* JADX INFO: renamed from: v */
    public void mo109334v(String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var == null || str == null) {
            return;
        }
        tc0Var.m190402x7(str);
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: v0 */
    public void mo107931v0(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190363f6(z);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: v1 */
    public void mo21128v1(long j) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190353b8();
        }
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21128v1(j);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: w */
    public long mo21129w() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            return interfaceC4260a.mo21129w();
        }
        return 0L;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: w0 */
    public void mo21130w0(long j) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190318N7((int) j);
        }
        super.mo21130w0(j);
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: w1 */
    public void mo21131w1() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21131w1();
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: x */
    public void mo107932x(boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190293E6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: x1 */
    public int mo109335x1(String str) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            return tc0Var.m190378k8(str);
        }
        return -3;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: y1 */
    public float mo21134y1() {
        tc0 tc0Var = this.f178389y;
        return tc0Var != null ? tc0Var.m190399w6() : super.mo21134y1();
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: z */
    public void mo21135z(boolean z) {
        super.mo21135z(z);
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: z0 */
    public void mo109336z0(long j, boolean z) {
        tc0 tc0Var = this.f178389y;
        if (tc0Var != null) {
            tc0Var.m190371i6(j, z);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: Y */
    public void mo109304Y() {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: D1 */
    public void mo109273D1(zpw zpwVar) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: I0 */
    public void mo109280I0(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: P1 */
    public void mo109294P1(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: s0 */
    public void mo109332s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: u */
    public void mo107929u(boolean z) {
    }

    public uc0(@NonNull Context context, @NonNull c410 c410Var, @NonNull z5m z5mVar, @NonNull uow uowVar, @NonNull InterfaceC4260a interfaceC4260a) {
        super(context, c410Var, z5mVar, uowVar, interfaceC4260a);
        this.f178381E = new PipelineConcurrentHashMap<>();
        this.f178382F = false;
        this.f178383G = false;
        this.f178384H = 2;
        this.f178385I = -1;
        this.f178386J = -1;
        this.f178387K = false;
        this.f178388L = "";
        Context contextM126853t2 = m126853t2();
        c410 c410Var2 = this.f100362a;
        MomoCodec momoCodecM114071h = d410.m114071h(contextM126853t2, c410Var2, c410Var2.mo20703j0(), this.f100362a.mo20673A0(), uowVar);
        this.f100367f = momoCodecM114071h;
        if (!(momoCodecM114071h instanceof tc0)) {
            b7y.m102882c().m102888g("createAgoraPushFilter create must instanceof AgoraPushFilter");
        }
        this.f178389y = (tc0) this.f100367f;
    }
}
