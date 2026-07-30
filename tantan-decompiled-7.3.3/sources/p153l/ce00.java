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
import com.momo.piplineext.codec.MoMoRtcPushFilter;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes8.dex */
public class ce00 extends fr2 implements hwl {

    /* JADX INFO: renamed from: A */
    fbl0 f81291A;

    /* JADX INFO: renamed from: B */
    gkl0 f81292B;

    /* JADX INFO: renamed from: C */
    MRtcEventHandler f81293C;

    /* JADX INFO: renamed from: D */
    PipelineConcurrentHashMap<Long, uti0> f81294D;

    /* JADX INFO: renamed from: E */
    boolean f81295E;

    /* JADX INFO: renamed from: F */
    private boolean f81296F;

    /* JADX INFO: renamed from: G */
    private int f81297G;

    /* JADX INFO: renamed from: H */
    private int f81298H;

    /* JADX INFO: renamed from: I */
    private int f81299I;

    /* JADX INFO: renamed from: J */
    private boolean f81300J;

    /* JADX INFO: renamed from: K */
    private String f81301K;

    /* JADX INFO: renamed from: y */
    MoMoRtcPushFilter f81302y;

    /* JADX INFO: renamed from: z */
    ebl0 f81303z;

    /* JADX INFO: renamed from: l.ce00$a */
    public class C16237a implements fbl0 {
        public C16237a(hwl.InterfaceC17586a interfaceC17586a) {
        }

        @Override // p153l.fbl0
        /* JADX INFO: renamed from: a */
        public void mo109337a(long j, sti0 sti0Var, int i, int i2) {
            ce00 ce00Var = ce00.this;
            ce00.this.f81294D.put(Long.valueOf(j), new uti0(ce00Var.f100362a, ce00Var.f100365d, sti0Var, j));
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + j);
        }

        @Override // p153l.fbl0
        /* JADX INFO: renamed from: b */
        public void mo109338b(long j, int i) {
            uti0 uti0Var = ce00.this.f81294D.get(Long.valueOf(j));
            if (uti0Var != null) {
                uti0Var.mo109166G();
            }
            ce00.this.f81294D.remove(Long.valueOf(j));
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt: userID=" + j);
        }
    }

    /* JADX INFO: renamed from: l.ce00$b */
    public class C16238b implements dpl.InterfaceC16599a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ fb1 f81305a;

        public C16238b(fb1 fb1Var) {
            this.f81305a = fb1Var;
        }

        @Override // p153l.dpl.InterfaceC16599a
        /* JADX INFO: renamed from: C */
        public oxd0 mo109339C(oxd0 oxd0Var) {
            return this.f81305a.mo19373C(oxd0Var);
        }
    }

    public ce00(@NonNull Context context, @NonNull c410 c410Var, @NonNull z5m z5mVar, @NonNull uow uowVar, @NonNull InterfaceC4260a interfaceC4260a, String str) {
        super(context, c410Var, z5mVar, uowVar, interfaceC4260a);
        this.f81294D = new PipelineConcurrentHashMap<>();
        this.f81295E = false;
        this.f81296F = false;
        this.f81297G = 2;
        this.f81298H = -1;
        this.f81299I = -1;
        this.f81300J = false;
        this.f81301K = "";
        Context contextM126853t2 = m126853t2();
        c410 c410Var2 = this.f100362a;
        MomoCodec momoCodecM114075l = d410.m114075l(contextM126853t2, c410Var2, c410Var2.mo20703j0(), this.f100362a.mo20673A0(), uowVar, str);
        this.f100367f = momoCodecM114075l;
        if (!(momoCodecM114075l instanceof MoMoRtcPushFilter)) {
            throw new InvalidParameterException("createmomortcPushFilter create must instanceof momortcPushFilter");
        }
        this.f81302y = (MoMoRtcPushFilter) momoCodecM114075l;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: A0 */
    public void mo109266A0(int i, int i2) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20996Z5(i, i2);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: A1 */
    public void mo109267A1(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21017i6(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: B */
    public void mo109268B(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20950M6(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: B0 */
    public void mo109269B0(vpw vpwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20956O4(vpwVar);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: B1 */
    public void mo107889B1(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20935I5(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: C0 */
    public void mo109270C0(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21025l5(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: D */
    public void mo109271D(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20916B6(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: D0 */
    public void mo109272D0(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21036p6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E */
    public void mo109274E(MRtcPusherHandler mRtcPusherHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20973T4(mRtcPusherHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E0 */
    public int mo109275E0(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            return moMoRtcPushFilter.m20998a5(i);
        }
        return -1;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E1 */
    public void mo109276E1(boolean z, boolean z2) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21050v6(z, z2);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: F */
    public void mo21081F(String str, String str2) {
        this.f81301K = str;
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21003c6();
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: F1 */
    public void mo107891F1(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20992Y4(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: G */
    public void mo109278G(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20932H5(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: H0 */
    public void mo109279H0(wpw wpwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20966R4(wpwVar);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: H1 */
    public void mo107893H1(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20945L5(j, z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: J0 */
    public void mo109281J0(MRtcQualityHandler mRtcQualityHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20976U4(mRtcQualityHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K */
    public void mo109282K(int i, int i2, int i3, int i4) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20954N6(i, i2, i3, i4);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K1 */
    public boolean mo109284K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter == null) {
            return false;
        }
        moMoRtcPushFilter.m20977U5(i, str, i2, d, d2, z, d3);
        return true;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: L */
    public void mo109285L(long j, float f) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20995Z4(j, f);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M */
    public void mo109287M(int i, double d) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20965Q6(i, d);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M0 */
    public void mo109288M0(int i, int i2) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21023k6(i, i2);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M1 */
    public void mo109289M1(hwl.InterfaceC17586a interfaceC17586a) {
        if (interfaceC17586a == null) {
            this.f81291A = null;
            MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
            if (moMoRtcPushFilter != null) {
                moMoRtcPushFilter.m20946L6(null);
                return;
            }
            return;
        }
        C16237a c16237a = new C16237a(interfaceC17586a);
        this.f81291A = c16237a;
        MoMoRtcPushFilter moMoRtcPushFilter2 = this.f81302y;
        if (moMoRtcPushFilter2 != null) {
            moMoRtcPushFilter2.m20946L6(c16237a);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: N */
    public void mo109290N(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21016i5(z);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: N1 */
    public void mo21090N1() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20985W6();
        }
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21090N1();
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: O0 */
    public void mo109292O0(upw upwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20944L4(upwVar);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: O1 */
    public boolean mo21092O1(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter == null) {
            return false;
        }
        moMoRtcPushFilter.m20971S6(str);
        return true;
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: Q0 */
    public void mo107899Q0(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20937J5(j, z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Q1 */
    public void mo109295Q1(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21006e6(str);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: R */
    public void mo109296R(fb1 fb1Var) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "Screen recording setOnFrameAvailabelCallback >>>>>>>>>>>>>>" + fb1Var);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            if (fb1Var != null) {
                moMoRtcPushFilter.m20993Y5(true);
                this.f100362a.mo107817L(new C16238b(fb1Var));
            } else {
                this.f100362a.mo107817L(null);
            }
            super.mo109296R(null);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: S */
    public void mo109297S(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21007f5(z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: T0 */
    public void mo107901T0(int i) {
        super.mo107901T0(i);
        this.f100370i = i;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21032n6(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: T1 */
    public void mo109298T1(boolean z) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "setStreamReplaceMode:" + z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20931G6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: U */
    public void mo109299U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20988X4(mRtcTokenWillExpireHander);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: U0 */
    public void mo107902U0(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20939K5(j, z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: W */
    public void mo109300W(boolean z, String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21014h5(z, str);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20928F6(f);
        }
        super.mo21100W1(f);
    }

    @Override // p153l.fr2, p153l.hwl
    /* JADX INFO: renamed from: X */
    public void mo109302X(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21019j5(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: X1 */
    public void mo109303X1(MRtcEventHandler mRtcEventHandler) {
        this.f81293C = mRtcEventHandler;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20938K4(mRtcEventHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Y1 */
    public void mo109305Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20980V4(mRtcReceiveSeiHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Z */
    public void mo109306Z(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21045t6(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Z0 */
    public void mo109307Z0(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21022k5(z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: Z1 */
    public void mo107905Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        super.mo107905Z1(mRtcAudioHandler, i, i2);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20948M4(mRtcAudioHandler);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: a */
    public void mo107906a(boolean z) {
        super.mo107906a(z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            if (z) {
                moMoRtcPushFilter.m21056y6(0.0f);
            } else {
                moMoRtcPushFilter.m21056y6(1.0f);
                this.f81302y.m20930G5(false);
            }
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: a0 */
    public void mo109308a0(ypw ypwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20983W4(ypwVar);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: a2 */
    public void mo109309a2(MRtcConnectHandler mRtcConnectHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20963Q4(mRtcConnectHandler);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: b */
    public void mo107907b(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20949M5(z);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: c */
    public long mo21107c() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        return moMoRtcPushFilter != null ? moMoRtcPushFilter.m21057z5() : super.mo21107c();
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: c0 */
    public void mo109310c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20969S4(mRtcClientRoleChangedHandler);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: c1 */
    public void mo109311c1(int i, boolean z) {
        this.f81299I = i;
        this.f81300J = z;
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20994Y6(str);
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
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" stopRecord"));
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20927F5(z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: f2 */
    public void mo107913f2(int i) {
        super.mo107913f2(i);
    }

    @Override // p153l.fr2, p153l.c4m, p153l.hwl
    /* JADX INFO: renamed from: g */
    public mob0 mo107914g() {
        return null;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: g0 */
    public void mo109313g0(float f) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21056y6(f);
        }
        super.mo109313g0(f);
    }

    @Override // p153l.fr2, p153l.hwl
    public double getEffectsVolume() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        return moMoRtcPushFilter != null ? moMoRtcPushFilter.m21038q5() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
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
        return 0;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h0 */
    public void mo109315h0(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21034o6(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h1 */
    public void mo109316h1(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21044s6(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h2 */
    public int mo109317h2(String str, String str2, String str3) {
        return 0;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: i0 */
    public void mo109318i0(MRtcChannelHandler mRtcChannelHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20959P4(mRtcChannelHandler);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20974T5();
        }
        super.mo21116j();
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: j1 */
    public void mo109320j1(boolean z, int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21058z6(z, i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: j2 */
    public void mo109321j2(kod0 kod0Var) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20923E6(kod0Var);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: k */
    public int mo109322k() {
        return 0;
    }

    @Override // p153l.fr2, p153l.hwl
    /* JADX INFO: renamed from: k2 */
    public void mo109323k2(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21010g5(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: l1 */
    public int mo109324l1(boolean z) {
        return 0;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: l2 */
    public void mo109325l2(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20990X6(str);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: m0 */
    public void mo109326m0(ebl0 ebl0Var) {
        this.f81303z = ebl0Var;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20940K6(ebl0Var);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: m1 */
    public void mo107919m1(pcmDataAvailableCallback pcmdataavailablecallback) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20915A6(pcmdataavailablecallback);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: m2 */
    public dpl mo107920m2() {
        return this.f81302y;
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: n0 */
    public void mo107922n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20953N4(mRtcAudioHandlerEx);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20964Q5();
        }
    }

    @Override // p153l.fr2, p153l.hwl
    public void pauseEffect(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20967R5(i);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: q */
    public void mo21124q() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21004d6();
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

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: r */
    public long mo21126r() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            return moMoRtcPushFilter.m20914A5();
        }
        return 0L;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: r0 */
    public void mo109329r0(String str, boolean z, boolean z2, int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20975T6(str, z, z2, i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: r1 */
    public void mo109330r1(gkl0 gkl0Var) {
        this.f81292B = gkl0Var;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20957O6(gkl0Var);
        }
    }

    @Override // p153l.fr2, p153l.hwl
    public void resumeAllEffects() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20999a6();
        }
    }

    @Override // p153l.fr2, p153l.hwl
    public void resumeEffect(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21001b6(i);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: s */
    public void mo109331s() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20970S5();
        }
    }

    @Override // p153l.hwl
    public int selectAudioTrack(int i) {
        return 0;
    }

    @Override // p153l.hwl
    public void setEffectsVolume(double d) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21039q6(d);
        }
    }

    @Override // p153l.hwl
    public int setEnableSpeakerphone(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            return moMoRtcPushFilter.m21042r6(z);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20978U6();
        }
    }

    @Override // p153l.hwl
    public void stopEffect(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20981V6(i);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    public void stopSurroundMusic() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.stopSurroundMusic();
        }
        super.stopSurroundMusic();
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: t0 */
    public int mo107927t0() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21028m6(this.f81297G);
            this.f81302y.m20920D6(this.f81298H);
            this.f81302y.m21032n6(this.f100370i);
            this.f81302y.m20940K6(this.f81303z);
            this.f81302y.m20946L6(this.f81291A);
            this.f81302y.m20957O6(this.f81292B);
            this.f81302y.m20938K4(this.f81293C);
            this.f81302y.m21011g6(this.f81295E);
        }
        int i = this.f81299I;
        if (i != -1) {
            this.f81302y.m20917C6(i, this.f81300J);
        }
        this.f100362a.mo20676C0(this.f81302y);
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec == null) {
            return -5;
        }
        momoCodec.mo20660e1(this.f100366e);
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            ((ExtAudioWrapper) interfaceC4260a).m21086I2(2048, this.f100365d.f175459P, 1, "MomoRtc");
        }
        return super.mo107927t0();
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: t1 */
    public void mo107928t1(int i) {
        this.f81297G = i;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21028m6(i);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: u0 */
    public void mo107930u0(boolean z) {
        super.mo107930u0(z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21020j6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: u1 */
    public void mo109333u1(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21005e5(z);
        }
    }

    @Override // p153l.fr2, p153l.hwl
    /* JADX INFO: renamed from: v */
    public void mo109334v(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter == null || str == null) {
            return;
        }
        moMoRtcPushFilter.m21049u6(str);
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: v1 */
    public void mo21128v1(long j) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20968R6();
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20933H6((int) j);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20922E5(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: x1 */
    public int mo109335x1(String str) {
        return 0;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: y1 */
    public float mo21134y1() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        return moMoRtcPushFilter != null ? moMoRtcPushFilter.m21055y5() : super.mo21134y1();
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: z */
    public void mo21135z(boolean z) {
        super.mo21135z(z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20961P6(z);
        }
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: z0 */
    public void mo109336z0(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f81302y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m21031n5(j, z);
        }
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: Y */
    public void mo109304Y() {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: o */
    public void mo107923o() {
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
    /* JADX INFO: renamed from: K0 */
    public void mo109283K0(int i) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: L0 */
    public void mo109286L0(byte[] bArr) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: N0 */
    public void mo109291N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: P0 */
    public void mo109293P0(gbl0 gbl0Var) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: P1 */
    public void mo109294P1(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: o1 */
    public void mo109327o1(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: q1 */
    public void mo109328q1(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: s0 */
    public void mo109332s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: u */
    public void mo107929u(boolean z) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: v0 */
    public void mo107931v0(boolean z) {
    }

    public ce00(@NonNull Context context, @NonNull c410 c410Var, @NonNull z5m z5mVar, @NonNull uow uowVar, @NonNull InterfaceC4260a interfaceC4260a) {
        super(context, c410Var, z5mVar, uowVar, interfaceC4260a);
        this.f81294D = new PipelineConcurrentHashMap<>();
        this.f81295E = false;
        this.f81296F = false;
        this.f81297G = 2;
        this.f81298H = -1;
        this.f81299I = -1;
        this.f81300J = false;
        this.f81301K = "";
        Context contextM126853t2 = m126853t2();
        c410 c410Var2 = this.f100362a;
        MomoCodec momoCodecM114074k = d410.m114074k(contextM126853t2, c410Var2, c410Var2.mo20703j0(), this.f100362a.mo20673A0(), uowVar);
        this.f100367f = momoCodecM114074k;
        if (momoCodecM114074k instanceof MoMoRtcPushFilter) {
            this.f81302y = (MoMoRtcPushFilter) momoCodecM114074k;
            return;
        }
        throw new InvalidParameterException("createmomortcPushFilter create must instanceof momortcPushFilter");
    }
}
