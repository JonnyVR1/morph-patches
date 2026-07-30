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
import com.momo.piplineext.codec.MoMoRtcPushFilter;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes8.dex */
public class o500 extends oq2 implements ttl {

    /* JADX INFO: renamed from: A */
    a2l0 f141849A;

    /* JADX INFO: renamed from: B */
    cbl0 f141850B;

    /* JADX INFO: renamed from: C */
    MRtcEventHandler f141851C;

    /* JADX INFO: renamed from: D */
    PipelineConcurrentHashMap<Long, uki0> f141852D;

    /* JADX INFO: renamed from: E */
    boolean f141853E;

    /* JADX INFO: renamed from: F */
    private boolean f141854F;

    /* JADX INFO: renamed from: G */
    private int f141855G;

    /* JADX INFO: renamed from: H */
    private int f141856H;

    /* JADX INFO: renamed from: I */
    private int f141857I;

    /* JADX INFO: renamed from: J */
    private boolean f141858J;

    /* JADX INFO: renamed from: K */
    private String f141859K;

    /* JADX INFO: renamed from: y */
    MoMoRtcPushFilter f141860y;

    /* JADX INFO: renamed from: z */
    z1l0 f141861z;

    /* JADX INFO: renamed from: l.o500$a */
    public class C18845a implements a2l0 {
        public C18845a(ttl.InterfaceC20269a interfaceC20269a) {
        }

        @Override // p149l.a2l0
        /* JADX INFO: renamed from: a */
        public void mo94620a(long j, ski0 ski0Var, int i, int i2) {
            o500 o500Var = o500.this;
            o500.this.f141852D.put(Long.valueOf(j), new uki0(o500Var.f145075a, o500Var.f145078d, ski0Var, j));
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + j);
        }

        @Override // p149l.a2l0
        /* JADX INFO: renamed from: b */
        public void mo94621b(long j, int i) {
            uki0 uki0Var = o500.this.f141852D.get(Long.valueOf(j));
            if (uki0Var != null) {
                uki0Var.mo97705G();
            }
            o500.this.f141852D.remove(Long.valueOf(j));
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt: userID=" + j);
        }
    }

    /* JADX INFO: renamed from: l.o500$b */
    public class C18846b implements sml.InterfaceC19992a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ya1 f141863a;

        public C18846b(ya1 ya1Var) {
            this.f141863a = ya1Var;
        }

        @Override // p149l.sml.InterfaceC19992a
        /* JADX INFO: renamed from: C */
        public mpd0 mo128315C(mpd0 mpd0Var) {
            return this.f141863a.mo18364C(mpd0Var);
        }
    }

    public o500(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC4109a interfaceC4109a, String str) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC4109a);
        this.f141852D = new PipelineConcurrentHashMap<>();
        this.f141853E = false;
        this.f141854F = false;
        this.f141855G = 2;
        this.f141856H = -1;
        this.f141857I = -1;
        this.f141858J = false;
        this.f141859K = "";
        Context contextM165393t2 = m165393t2();
        uv00 uv00Var2 = this.f145075a;
        MomoCodec momoCodecM200148l = vv00.m200148l(contextM165393t2, uv00Var2, uv00Var2.mo19704j0(), this.f145075a.mo19674A0(), vlwVar, str);
        this.f145080f = momoCodecM200148l;
        if (!(momoCodecM200148l instanceof MoMoRtcPushFilter)) {
            throw new InvalidParameterException("createmomortcPushFilter create must instanceof momortcPushFilter");
        }
        this.f141860y = (MoMoRtcPushFilter) momoCodecM200148l;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: A0 */
    public void mo160288A0(int i, int i2) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19997Z5(i, i2);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: A1 */
    public void mo160289A1(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20018i6(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: B */
    public void mo160290B(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19951M6(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: B0 */
    public void mo160291B0(xmw xmwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19957O4(xmwVar);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: B1 */
    public void mo139331B1(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19936I5(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: C0 */
    public void mo160292C0(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20026l5(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: D */
    public void mo160293D(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19917B6(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: D0 */
    public void mo160294D0(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20037p6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E */
    public void mo160296E(MRtcPusherHandler mRtcPusherHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19974T4(mRtcPusherHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E0 */
    public int mo160297E0(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            return moMoRtcPushFilter.m19999a5(i);
        }
        return -1;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E1 */
    public void mo160298E1(boolean z, boolean z2) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20051v6(z, z2);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: F */
    public void mo20082F(String str, String str2) {
        this.f141859K = str;
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20004c6();
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: F1 */
    public void mo139333F1(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19993Y4(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: G */
    public void mo160300G(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19933H5(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: H0 */
    public void mo160301H0(ymw ymwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19967R4(ymwVar);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: H1 */
    public void mo139335H1(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19946L5(j, z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: J0 */
    public void mo160303J0(MRtcQualityHandler mRtcQualityHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19977U4(mRtcQualityHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K */
    public void mo160304K(int i, int i2, int i3, int i4) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19955N6(i, i2, i3, i4);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K1 */
    public boolean mo160306K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter == null) {
            return false;
        }
        moMoRtcPushFilter.m19978U5(i, str, i2, d, d2, z, d3);
        return true;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: L */
    public void mo160307L(long j, float f) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19996Z4(j, f);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M */
    public void mo160309M(int i, double d) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19966Q6(i, d);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M0 */
    public void mo160310M0(int i, int i2) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20024k6(i, i2);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M1 */
    public void mo160311M1(ttl.InterfaceC20269a interfaceC20269a) {
        if (interfaceC20269a == null) {
            this.f141849A = null;
            MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
            if (moMoRtcPushFilter != null) {
                moMoRtcPushFilter.m19947L6(null);
                return;
            }
            return;
        }
        C18845a c18845a = new C18845a(interfaceC20269a);
        this.f141849A = c18845a;
        MoMoRtcPushFilter moMoRtcPushFilter2 = this.f141860y;
        if (moMoRtcPushFilter2 != null) {
            moMoRtcPushFilter2.m19947L6(c18845a);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: N */
    public void mo160312N(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20017i5(z);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: N1 */
    public void mo20091N1() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19986W6();
        }
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20091N1();
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: O0 */
    public void mo160314O0(wmw wmwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19945L4(wmwVar);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: O1 */
    public boolean mo20093O1(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter == null) {
            return false;
        }
        moMoRtcPushFilter.m19972S6(str);
        return true;
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: Q0 */
    public void mo139341Q0(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19938J5(j, z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Q1 */
    public void mo160317Q1(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20007e6(str);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: R */
    public void mo160318R(ya1 ya1Var) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "Screen recording setOnFrameAvailabelCallback >>>>>>>>>>>>>>" + ya1Var);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            if (ya1Var != null) {
                moMoRtcPushFilter.m19994Y5(true);
                this.f145075a.mo196047L(new C18846b(ya1Var));
            } else {
                this.f145075a.mo196047L(null);
            }
            super.mo160318R(null);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: S */
    public void mo160319S(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20008f5(z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo139343T0(int i) {
        super.mo139343T0(i);
        this.f145083i = i;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20033n6(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: T1 */
    public void mo160320T1(boolean z) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "setStreamReplaceMode:" + z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19932G6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: U */
    public void mo160321U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19989X4(mRtcTokenWillExpireHander);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: U0 */
    public void mo139344U0(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19940K5(j, z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: W */
    public void mo160322W(boolean z, String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20015h5(z, str);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19929F6(f);
        }
        super.mo20101W1(f);
    }

    @Override // p149l.oq2, p149l.ttl
    /* JADX INFO: renamed from: X */
    public void mo162750X(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20020j5(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: X1 */
    public void mo160325X1(MRtcEventHandler mRtcEventHandler) {
        this.f141851C = mRtcEventHandler;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19939K4(mRtcEventHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Y1 */
    public void mo160327Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19981V4(mRtcReceiveSeiHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Z */
    public void mo160328Z(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20046t6(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Z0 */
    public void mo160329Z0(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20023k5(z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: Z1 */
    public void mo139347Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        super.mo139347Z1(mRtcAudioHandler, i, i2);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19949M4(mRtcAudioHandler);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: a */
    public void mo139348a(boolean z) {
        super.mo139348a(z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            if (z) {
                moMoRtcPushFilter.m20057y6(0.0f);
            } else {
                moMoRtcPushFilter.m20057y6(1.0f);
                this.f141860y.m19931G5(false);
            }
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: a0 */
    public void mo160330a0(anw anwVar) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19984W4(anwVar);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: a2 */
    public void mo160331a2(MRtcConnectHandler mRtcConnectHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19964Q4(mRtcConnectHandler);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: b */
    public void mo139349b(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19950M5(z);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: c */
    public long mo20108c() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        return moMoRtcPushFilter != null ? moMoRtcPushFilter.m20058z5() : super.mo20108c();
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: c0 */
    public void mo160332c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19970S4(mRtcClientRoleChangedHandler);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: c1 */
    public void mo160333c1(int i, boolean z) {
        this.f141857I = i;
        this.f141858J = z;
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19995Y6(str);
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
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" stopRecord"));
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19928F5(z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: f2 */
    public void mo139355f2(int i) {
        super.mo139355f2(i);
    }

    @Override // p149l.oq2, p149l.j1m, p149l.ttl
    /* JADX INFO: renamed from: g */
    public igb0 mo139356g() {
        return null;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: g0 */
    public void mo160335g0(float f) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20057y6(f);
        }
        super.mo160335g0(f);
    }

    @Override // p149l.oq2, p149l.ttl
    public double getEffectsVolume() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        return moMoRtcPushFilter != null ? moMoRtcPushFilter.m20039q5() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
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
        return 0;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h0 */
    public void mo160337h0(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20035o6(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h1 */
    public void mo160338h1(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20045s6(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h2 */
    public int mo160339h2(String str, String str2, String str3) {
        return 0;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: i0 */
    public void mo160340i0(MRtcChannelHandler mRtcChannelHandler) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19960P4(mRtcChannelHandler);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19975T5();
        }
        super.mo20117j();
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: j1 */
    public void mo160342j1(boolean z, int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20059z6(z, i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: j2 */
    public void mo160343j2(hgd0 hgd0Var) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19924E6(hgd0Var);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: k */
    public int mo160344k() {
        return 0;
    }

    @Override // p149l.oq2, p149l.ttl
    /* JADX INFO: renamed from: k2 */
    public void mo162751k2(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20011g5(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: l1 */
    public int mo160345l1(boolean z) {
        return 0;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: l2 */
    public void mo160346l2(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19991X6(str);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: m0 */
    public void mo160347m0(z1l0 z1l0Var) {
        this.f141861z = z1l0Var;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19941K6(z1l0Var);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: m1 */
    public void mo139361m1(pcmDataAvailableCallback pcmdataavailablecallback) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19916A6(pcmdataavailablecallback);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: m2 */
    public sml mo139362m2() {
        return this.f141860y;
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: n0 */
    public void mo139364n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19954N4(mRtcAudioHandlerEx);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19965Q5();
        }
    }

    @Override // p149l.oq2, p149l.ttl
    public void pauseEffect(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19968R5(i);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: q */
    public void mo20125q() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20005d6();
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

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: r */
    public long mo20127r() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            return moMoRtcPushFilter.m19915A5();
        }
        return 0L;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: r0 */
    public void mo160350r0(String str, boolean z, boolean z2, int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19976T6(str, z, z2, i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: r1 */
    public void mo160351r1(cbl0 cbl0Var) {
        this.f141850B = cbl0Var;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19958O6(cbl0Var);
        }
    }

    @Override // p149l.oq2, p149l.ttl
    public void resumeAllEffects() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20000a6();
        }
    }

    @Override // p149l.oq2, p149l.ttl
    public void resumeEffect(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20002b6(i);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: s */
    public void mo160352s() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19971S5();
        }
    }

    @Override // p149l.ttl
    public int selectAudioTrack(int i) {
        return 0;
    }

    @Override // p149l.ttl
    public void setEffectsVolume(double d) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20040q6(d);
        }
    }

    @Override // p149l.ttl
    public int setEnableSpeakerphone(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            return moMoRtcPushFilter.m20043r6(z);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19979U6();
        }
    }

    @Override // p149l.ttl
    public void stopEffect(int i) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19982V6(i);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    public void stopSurroundMusic() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.stopSurroundMusic();
        }
        super.stopSurroundMusic();
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo139369t0() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName().concat(" startRecord"));
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20029m6(this.f141855G);
            this.f141860y.m19921D6(this.f141856H);
            this.f141860y.m20033n6(this.f145083i);
            this.f141860y.m19941K6(this.f141861z);
            this.f141860y.m19947L6(this.f141849A);
            this.f141860y.m19958O6(this.f141850B);
            this.f141860y.m19939K4(this.f141851C);
            this.f141860y.m20012g6(this.f141853E);
        }
        int i = this.f141857I;
        if (i != -1) {
            this.f141860y.m19918C6(i, this.f141858J);
        }
        this.f145075a.mo19677C0(this.f141860y);
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec == null) {
            return -5;
        }
        momoCodec.mo19661e1(this.f145079e);
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            ((ExtAudioWrapper) interfaceC4109a).m20087I2(2048, this.f145078d.f177117P, 1, "MomoRtc");
        }
        return super.mo139369t0();
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: t1 */
    public void mo139370t1(int i) {
        this.f141855G = i;
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20029m6(i);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo139372u0(boolean z) {
        super.mo139372u0(z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20021j6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: u1 */
    public void mo160354u1(boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20006e5(z);
        }
    }

    @Override // p149l.oq2, p149l.ttl
    /* JADX INFO: renamed from: v */
    public void mo162752v(String str) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter == null || str == null) {
            return;
        }
        moMoRtcPushFilter.m20050u6(str);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: v1 */
    public void mo20129v1(long j) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19969R6();
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19934H6((int) j);
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
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19923E5(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: x1 */
    public int mo160355x1(String str) {
        return 0;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: y1 */
    public float mo20135y1() {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        return moMoRtcPushFilter != null ? moMoRtcPushFilter.m20056y5() : super.mo20135y1();
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: z */
    public void mo20136z(boolean z) {
        super.mo20136z(z);
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m19962P6(z);
        }
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: z0 */
    public void mo160356z0(long j, boolean z) {
        MoMoRtcPushFilter moMoRtcPushFilter = this.f141860y;
        if (moMoRtcPushFilter != null) {
            moMoRtcPushFilter.m20032n5(j, z);
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: Y */
    public void mo160326Y() {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: o */
    public void mo139365o() {
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
    /* JADX INFO: renamed from: K0 */
    public void mo160305K0(int i) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: L0 */
    public void mo160308L0(byte[] bArr) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: N0 */
    public void mo160313N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: P0 */
    public void mo160315P0(b2l0 b2l0Var) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: P1 */
    public void mo160316P1(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: o1 */
    public void mo160348o1(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: q1 */
    public void mo160349q1(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: s0 */
    public void mo160353s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: u */
    public void mo139371u(boolean z) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: v0 */
    public void mo139373v0(boolean z) {
    }

    public o500(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC4109a interfaceC4109a) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC4109a);
        this.f141852D = new PipelineConcurrentHashMap<>();
        this.f141853E = false;
        this.f141854F = false;
        this.f141855G = 2;
        this.f141856H = -1;
        this.f141857I = -1;
        this.f141858J = false;
        this.f141859K = "";
        Context contextM165393t2 = m165393t2();
        uv00 uv00Var2 = this.f145075a;
        MomoCodec momoCodecM200147k = vv00.m200147k(contextM165393t2, uv00Var2, uv00Var2.mo19704j0(), this.f145075a.mo19674A0(), vlwVar);
        this.f145080f = momoCodecM200147k;
        if (momoCodecM200147k instanceof MoMoRtcPushFilter) {
            this.f141860y = (MoMoRtcPushFilter) momoCodecM200147k;
            return;
        }
        throw new InvalidParameterException("createmomortcPushFilter create must instanceof momortcPushFilter");
    }
}
