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
public class ymp0 extends fr2 implements hwl {

    /* JADX INFO: renamed from: A */
    fbl0 f200693A;

    /* JADX INFO: renamed from: B */
    gkl0 f200694B;

    /* JADX INFO: renamed from: C */
    gbl0 f200695C;

    /* JADX INFO: renamed from: D */
    MRtcEventHandler f200696D;

    /* JADX INFO: renamed from: E */
    PipelineConcurrentHashMap<Long, uti0> f200697E;

    /* JADX INFO: renamed from: F */
    boolean f200698F;

    /* JADX INFO: renamed from: G */
    private boolean f200699G;

    /* JADX INFO: renamed from: H */
    private int f200700H;

    /* JADX INFO: renamed from: I */
    private int f200701I;

    /* JADX INFO: renamed from: J */
    private int f200702J;

    /* JADX INFO: renamed from: K */
    private boolean f200703K;

    /* JADX INFO: renamed from: L */
    private String f200704L;

    /* JADX INFO: renamed from: y */
    xmp0 f200705y;

    /* JADX INFO: renamed from: z */
    ebl0 f200706z;

    /* JADX INFO: renamed from: l.ymp0$a */
    public class C21632a implements fbl0 {
        public C21632a(hwl.InterfaceC17586a interfaceC17586a) {
        }

        @Override // p153l.fbl0
        /* JADX INFO: renamed from: a */
        public void mo109337a(long j, sti0 sti0Var, int i, int i2) {
            xmp0 xmp0Var = ymp0.this.f200705y;
            if (xmp0Var != null) {
                xmp0Var.m212009b8(1);
            }
            ymp0 ymp0Var = ymp0.this;
            ymp0.this.f200697E.put(Long.valueOf(j), new uti0(ymp0Var.f100362a, ymp0Var.f100365d, sti0Var, j));
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + j);
        }

        @Override // p153l.fbl0
        /* JADX INFO: renamed from: b */
        public void mo109338b(long j, int i) {
            xmp0 xmp0Var;
            uti0 uti0Var = ymp0.this.f200697E.get(Long.valueOf(j));
            if (uti0Var != null) {
                uti0Var.mo109166G();
            }
            ymp0.this.f200697E.remove(Long.valueOf(j));
            if (ymp0.this.f200697E.size() == 0 && (xmp0Var = ymp0.this.f200705y) != null) {
                xmp0Var.m212009b8(0);
            }
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt: userID=" + j);
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.ymp0$b */
    public class C21633b implements dpl.InterfaceC16599a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ fb1 f200708a;

        public C21633b(fb1 fb1Var) {
            this.f200708a = fb1Var;
        }

        @Override // p153l.dpl.InterfaceC16599a
        /* JADX INFO: renamed from: C */
        public oxd0 mo109339C(oxd0 oxd0Var) {
            return this.f200708a.mo19373C(oxd0Var);
        }
    }

    public ymp0(@NonNull Context context, @NonNull c410 c410Var, @NonNull z5m z5mVar, @NonNull uow uowVar, @NonNull InterfaceC4260a interfaceC4260a, String str) {
        super(context, c410Var, z5mVar, uowVar, interfaceC4260a);
        this.f200697E = new PipelineConcurrentHashMap<>();
        this.f200698F = false;
        this.f200699G = false;
        this.f200700H = 2;
        this.f200701I = -1;
        this.f200702J = -1;
        this.f200703K = false;
        this.f200704L = "";
        Context contextM126853t2 = m126853t2();
        c410 c410Var2 = this.f100362a;
        MomoCodec momoCodecM114080q = d410.m114080q(contextM126853t2, c410Var2, c410Var2.mo20703j0(), this.f100362a.mo20673A0(), uowVar, str);
        this.f100367f = momoCodecM114080q;
        if (!(momoCodecM114080q instanceof xmp0)) {
            b7y.m102882c().m102888g("createAgoraPushFilter create must instanceof VolcPushFilter");
        }
        this.f200705y = (xmp0) this.f100367f;
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212002Y6(i, i2);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: A1 */
    public void mo109267A1(int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212025h7(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: B */
    public void mo109268B(String str) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211990T7(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: B0 */
    public void mo109269B0(vpw vpwVar) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211970M5(vpwVar);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: B1 */
    public void mo107889B1(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211959I6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: C0 */
    public void mo109270C0(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212029j6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: D */
    public void mo109271D(int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211949D7(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: D0 */
    public void mo109272D0(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212046q7(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E */
    public void mo109274E(MRtcPusherHandler mRtcPusherHandler) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211982R5(mRtcPusherHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E0 */
    public int mo109275E0(int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            return xmp0Var.m212001Y5(i);
        }
        return -1;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E1 */
    public void mo109276E1(boolean z, boolean z2) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212059x7(z, z2);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: F */
    public void mo21081F(String str, String str2) {
        this.f200704L = str;
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212008b7();
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: F1 */
    public void mo107891F1(int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211996W5(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: G */
    public void mo109278G(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211957H6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: H0 */
    public void mo109279H0(wpw wpwVar) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211976P5(wpwVar);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: H1 */
    public void mo107893H1(long j, boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211965K6(j, z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: J0 */
    public void mo109281J0(MRtcQualityHandler mRtcQualityHandler) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211985S5(mRtcQualityHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K */
    public void mo109282K(int i, int i2, int i3, int i4) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211993U7(i, i2, i3, i4);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K0 */
    public void mo109283K0(int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212028i7(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K1 */
    public boolean mo109284K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var == null) {
            return false;
        }
        xmp0Var.m211989T6(i, str, i2, d, d2, z, d3);
        return true;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: L */
    public void mo109285L(long j, float f) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211999X5(j, f);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: L0 */
    public void mo109286L0(byte[] bArr) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212016e7(new String(bArr));
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M */
    public void mo109287M(int i, double d) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212007a8(i, d);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M0 */
    public void mo109288M0(int i, int i2) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212035l7(i, i2);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M1 */
    public void mo109289M1(hwl.InterfaceC17586a interfaceC17586a) {
        if (interfaceC17586a == null) {
            this.f200693A = null;
            xmp0 xmp0Var = this.f200705y;
            if (xmp0Var != null) {
                xmp0Var.m211984R7(null);
            }
        }
        C21632a c21632a = new C21632a(interfaceC17586a);
        this.f200693A = c21632a;
        xmp0 xmp0Var2 = this.f200705y;
        if (xmp0Var2 != null) {
            xmp0Var2.m211984R7(c21632a);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: N */
    public void mo109290N(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212024h6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: N0 */
    public void mo109291N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211958I5(mRtcExitRoomHandler);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: N1 */
    public void mo21090N1() {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212026h8();
        }
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21090N1();
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: O0 */
    public void mo109292O0(upw upwVar) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211961J5(upwVar);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: O1 */
    public boolean mo21092O1(String str) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var == null) {
            return false;
        }
        xmp0Var.m212014d8(str);
        return true;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: P0 */
    public void mo109293P0(gbl0 gbl0Var) {
        this.f200695C = gbl0Var;
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            uow uowVar = this.f100365d;
            if (gbl0Var != null) {
                uowVar.f180181Z0 = true;
            } else {
                uowVar.f180181Z0 = false;
            }
            xmp0Var.m211978P7(gbl0Var);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: Q0 */
    public void mo107899Q0(long j, boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211962J6(j, z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Q1 */
    public void mo109295Q1(String str) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212016e7(str);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: R */
    public void mo109296R(fb1 fb1Var) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "Screen recording setOnFrameAvailabelCallback >>>>>>>>>>>>>>" + fb1Var);
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            if (fb1Var != null) {
                xmp0Var.m211997W6(true);
                this.f100362a.mo107817L(new C21633b(fb1Var));
            } else {
                this.f100362a.mo107817L(null);
            }
            super.mo109296R(null);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: S */
    public void mo109297S(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212015e6(z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: T0 */
    public void mo107901T0(int i) {
        super.mo107901T0(i);
        this.f100370i = i;
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212042o7(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: T1 */
    public void mo109298T1(boolean z) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "setStreamReplaceMode:" + z);
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211966K7(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: U */
    public void mo109299U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211994V5(mRtcTokenWillExpireHander);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: W */
    public void mo109300W(boolean z, String str) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212021g6(z, str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: W0 */
    public int mo109301W0(int i, hnw hnwVar) {
        return 0;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: W1 */
    public void mo21100W1(float f) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211963J7(f);
        }
        super.mo21100W1(f);
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: X1 */
    public void mo109303X1(MRtcEventHandler mRtcEventHandler) {
        this.f200696D = mRtcEventHandler;
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211956H5(mRtcEventHandler);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: Y0 */
    public void mo21101Y0(long j, boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212011c8();
        }
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21101Y0(j, z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Y1 */
    public void mo109305Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211988T5(mRtcReceiveSeiHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Z */
    public void mo109306Z(String str) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212055v7(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Z0 */
    public void mo109307Z0(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212027i6(z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: Z1 */
    public void mo107905Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        super.mo107905Z1(mRtcAudioHandler, i, i2);
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211964K5(mRtcAudioHandler);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: a */
    public void mo107906a(boolean z) {
        super.mo107906a(z);
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211954G6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: a0 */
    public void mo109308a0(ypw ypwVar) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211991U5(ypwVar);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: a2 */
    public void mo109309a2(MRtcConnectHandler mRtcConnectHandler) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211974O5(mRtcConnectHandler);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: b */
    public void mo107907b(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211968L6(z);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: c */
    public long mo21107c() {
        xmp0 xmp0Var = this.f200705y;
        return xmp0Var != null ? xmp0Var.m212054v6() : super.mo21107c();
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: c0 */
    public void mo109310c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211979Q5(mRtcClientRoleChangedHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: c1 */
    public void mo109311c1(int i, boolean z) {
        this.f200702J = i;
        this.f200703K = z;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: c2 */
    public void mo107908c2(MRtcAudioHandler mRtcAudioHandler, int i, int i2, int i3) {
        super.mo107908c2(mRtcAudioHandler, i, i2, i3);
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211964K5(mRtcAudioHandler);
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212040n8(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: e0 */
    public int mo109312e0(int i) {
        return 0;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: f */
    public void mo107911f() {
        String str;
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName().concat(" stopRecord"));
        if (this.f100367f != null) {
            str = "" + this.f100367f.hashCode();
        } else {
            str = "null";
        }
        b7y.m102882c().m102888g("VolcPusherPipline stopRecord this.code:" + hashCode() + ",codec hashcode:" + str);
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211952F6(z);
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211946A7(f);
        }
        super.mo109313g0(f);
    }

    @Override // p153l.fr2, p153l.hwl
    public double getEffectsVolume() {
        xmp0 xmp0Var = this.f200705y;
        return xmp0Var != null ? xmp0Var.m212045q6() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            return xmp0Var.m212003Y7(i);
        }
        return -1;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h0 */
    public void mo109315h0(String str) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212044p7(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h1 */
    public void mo109316h1(String str) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212053u7(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h2 */
    public int mo109317h2(String str, String str2, String str3) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            return xmp0Var.m212030j8(str, str2, str3);
        }
        return -3;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: i0 */
    public void mo109318i0(MRtcChannelHandler mRtcChannelHandler) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211971N5(mRtcChannelHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: i2 */
    public int mo109319i2(int i) {
        return 0;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: j */
    public void mo21116j() {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211986S6();
        }
        super.mo21116j();
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: j1 */
    public void mo109320j1(boolean z, int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211947B7(z, i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: j2 */
    public void mo109321j2(kod0 kod0Var) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211960I7(kod0Var);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: k */
    public int mo109322k() {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            return xmp0Var.m212041o6();
        }
        return 0;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: k0 */
    public void mo107916k0() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212039n7(this.f200700H);
            this.f200705y.m211955G7(this.f200701I);
            this.f200705y.m212042o7(this.f100370i);
            this.f200705y.m211981Q7(this.f200706z);
            this.f200705y.m211984R7(this.f200693A);
            this.f200705y.m212000X7(this.f200694B);
            this.f200705y.m211956H5(this.f200696D);
            this.f200705y.m212019f7(this.f200698F);
        }
        int i = this.f200702J;
        if (i != -1) {
            this.f200705y.m211953F7(i, this.f200703K);
        }
        this.f100362a.mo20676C0(this.f200705y);
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec == null) {
            return;
        }
        momoCodec.mo20660e1(this.f100366e);
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            uow uowVar = this.f100365d;
            ((ExtAudioWrapper) interfaceC4260a).m21086I2(2048, uowVar.f175459P, uowVar.f175461R, "Volc");
        }
        super.mo107916k0();
    }

    @Override // p153l.fr2, p153l.hwl
    /* JADX INFO: renamed from: k2 */
    public void mo109323k2(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212018f6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: l1 */
    public int mo109324l1(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var == null) {
            return 0;
        }
        xmp0Var.m212005Z7(z);
        return 0;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: l2 */
    public void mo109325l2(String str) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212036l8(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: m0 */
    public void mo109326m0(ebl0 ebl0Var) {
        this.f200706z = ebl0Var;
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211981Q7(ebl0Var);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: m1 */
    public void mo107919m1(pcmDataAvailableCallback pcmdataavailablecallback) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211948C7(pcmdataavailablecallback);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: m2 */
    public dpl mo107920m2() {
        return this.f200705y;
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: n0 */
    public void mo107922n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211967L5(mRtcAudioHandlerEx);
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212050s7(z);
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211977P6();
        }
    }

    @Override // p153l.fr2, p153l.hwl
    public void pauseEffect(int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211980Q6(i);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: q */
    public void mo21124q() {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212010c7();
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211951E7(z);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: r */
    public long mo21126r() {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            return xmp0Var.m212056w6();
        }
        return 0L;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: r0 */
    public void mo109329r0(String str, boolean z, boolean z2, int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212017e8(str, z, z2, i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: r1 */
    public void mo109330r1(gkl0 gkl0Var) {
        this.f200694B = gkl0Var;
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212000X7(gkl0Var);
        }
    }

    @Override // p153l.fr2, p153l.hwl
    public void resumeAllEffects() {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212004Z6();
        }
    }

    @Override // p153l.fr2, p153l.hwl
    public void resumeEffect(int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212006a7(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: s */
    public void mo109331s() {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211983R6();
        }
    }

    @Override // p153l.hwl
    public int selectAudioTrack(int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var == null) {
            return 0;
        }
        xmp0Var.m212013d7(i);
        return 0;
    }

    @Override // p153l.hwl
    public void setEffectsVolume(double d) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212048r7(d);
        }
    }

    @Override // p153l.hwl
    public int setEnableSpeakerphone(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            return xmp0Var.m212051t7(z);
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212020f8();
        }
    }

    @Override // p153l.hwl
    public void stopEffect(int i) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212023g8(i);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    public void stopSurroundMusic() {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.stopSurroundMusic();
        }
        super.stopSurroundMusic();
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: t0 */
    public int mo107927t0() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212039n7(this.f200700H);
            this.f200705y.m211955G7(this.f200701I);
            this.f200705y.m212042o7(this.f100370i);
            this.f200705y.m211981Q7(this.f200706z);
            this.f200705y.m211984R7(this.f200693A);
            this.f200705y.m212000X7(this.f200694B);
            this.f200705y.m211956H5(this.f200696D);
            this.f200705y.m212019f7(this.f200698F);
        }
        int i = this.f200702J;
        if (i != -1) {
            this.f200705y.m211953F7(i, this.f200703K);
        }
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20676C0(this.f200705y);
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
            extAudioWrapper.m21086I2(2048, uowVar.f175459P, uowVar.f175461R, "Volc");
        }
        return super.mo107927t0();
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: t1 */
    public void mo107928t1(int i) {
        this.f200700H = i;
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212039n7(i);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: u0 */
    public void mo107930u0(boolean z) {
        super.mo107930u0(z);
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212032k7(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: u1 */
    public void mo109333u1(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212012d6(z);
        }
    }

    @Override // p153l.fr2, p153l.hwl
    /* JADX INFO: renamed from: v */
    public void mo109334v(String str) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var == null || str == null) {
            return;
        }
        xmp0Var.m212057w7(str);
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: v0 */
    public void mo107931v0(boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212031k6(z);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: v1 */
    public void mo21128v1(long j) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212011c8();
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211969L7((int) j);
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
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m211950E6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: x1 */
    public int mo109335x1(String str) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            return xmp0Var.m212033k8(str);
        }
        return -3;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: y1 */
    public float mo21134y1() {
        xmp0 xmp0Var = this.f200705y;
        return xmp0Var != null ? xmp0Var.m212052u6() : super.mo21134y1();
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: z */
    public void mo21135z(boolean z) {
        super.mo21135z(z);
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: z0 */
    public void mo109336z0(long j, boolean z) {
        xmp0 xmp0Var = this.f200705y;
        if (xmp0Var != null) {
            xmp0Var.m212034l6(j, z);
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

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: m */
    public void mo107918m(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: s0 */
    public void mo109332s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: u */
    public void mo107929u(boolean z) {
    }

    public ymp0(@NonNull Context context, @NonNull c410 c410Var, @NonNull z5m z5mVar, @NonNull uow uowVar, @NonNull InterfaceC4260a interfaceC4260a) {
        super(context, c410Var, z5mVar, uowVar, interfaceC4260a);
        this.f200697E = new PipelineConcurrentHashMap<>();
        this.f200698F = false;
        this.f200699G = false;
        this.f200700H = 2;
        this.f200701I = -1;
        this.f200702J = -1;
        this.f200703K = false;
        this.f200704L = "";
        Context contextM126853t2 = m126853t2();
        c410 c410Var2 = this.f100362a;
        MomoCodec momoCodecM114079p = d410.m114079p(contextM126853t2, c410Var2, c410Var2.mo20703j0(), this.f100362a.mo20673A0(), uowVar);
        this.f100367f = momoCodecM114079p;
        if (!(momoCodecM114079p instanceof xmp0)) {
            b7y.m102882c().m102888g("createAgoraPushFilter create must instanceof VolcPushFilter");
        }
        this.f200705y = (xmp0) this.f100367f;
    }
}
