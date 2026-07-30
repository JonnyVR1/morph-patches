package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;

/* JADX INFO: loaded from: classes8.dex */
public class t410 extends fr2 implements zzl {

    /* JADX INFO: renamed from: A */
    boolean f171960A;

    /* JADX INFO: renamed from: B */
    private int f171961B;

    /* JADX INFO: renamed from: C */
    private String f171962C;

    /* JADX INFO: renamed from: D */
    private int f171963D;

    /* JADX INFO: renamed from: E */
    private uow f171964E;

    /* JADX INFO: renamed from: F */
    private int f171965F;

    /* JADX INFO: renamed from: G */
    private int f171966G;

    /* JADX INFO: renamed from: H */
    private int f171967H;

    /* JADX INFO: renamed from: I */
    private String f171968I;

    /* JADX INFO: renamed from: y */
    dpl f171969y;

    /* JADX INFO: renamed from: z */
    s410 f171970z;

    public t410(@NonNull Context context, @NonNull c410 c410Var, @NonNull z5m z5mVar, @NonNull uow uowVar, @NonNull InterfaceC4260a interfaceC4260a) {
        super(context, c410Var, z5mVar, uowVar, interfaceC4260a);
        this.f171960A = false;
        this.f171961B = 10;
        this.f171962C = null;
        this.f171963D = 2;
        this.f171964E = null;
        this.f171965F = 0;
        this.f171966G = 0;
        this.f171967H = 0;
        this.f171968I = "";
    }

    /* JADX INFO: renamed from: B2 */
    public void m189139B2(dpl dplVar) {
        this.f171969y = dplVar;
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: L1 */
    public int mo107897L1() {
        return this.f171967H;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: O1 */
    public boolean mo21092O1(String str) {
        return super.mo21092O1(str);
    }

    @Override // p153l.zzl
    /* JADX INFO: renamed from: R0 */
    public void mo189140R0() {
        s410 s410Var = this.f171970z;
        if (s410Var != null) {
            s410Var.m184422x4();
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: T0 */
    public void mo107901T0(int i) {
        super.mo107901T0(i);
        this.f100370i = i;
        s410 s410Var = this.f171970z;
        if (s410Var != null) {
            s410Var.m184404A4(i);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: V0 */
    public int mo107903V0() {
        return this.f171966G;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: a */
    public void mo107906a(boolean z) {
        super.mo107906a(z);
        s410 s410Var = this.f171970z;
        if (s410Var != null) {
            s410Var.m184420q4(z);
        }
    }

    @Override // p153l.zzl
    /* JADX INFO: renamed from: b1 */
    public void mo189141b1(boolean z) {
        s410 s410Var = this.f171970z;
        if (s410Var != null) {
            s410Var.m184406C4(z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: f */
    public void mo107911f() {
        oq70.m168791d().m168793a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName().concat(" stopRecord"));
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20694d0(this.f100367f);
            s410 s410Var = this.f171970z;
            if (s410Var != null) {
                this.f171965F = s410Var.m184415e4();
                this.f171966G = this.f171970z.m184417g4();
                this.f171967H = this.f171970z.m184416f4();
            }
            this.f171970z = null;
        }
        super.mo107911f();
    }

    @Override // p153l.zzl
    /* JADX INFO: renamed from: g2 */
    public void mo189142g2() {
        s410 s410Var = this.f171970z;
        if (s410Var != null) {
            s410Var.m184421u4();
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: k1 */
    public int mo107917k1() {
        return this.f171965F;
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: p0 */
    public void mo107925p0(int i, String str) {
        this.f171961B = i;
        this.f171962C = str;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: t0 */
    public int mo107927t0() {
        Context contextM126853t2 = m126853t2();
        c410 c410Var = this.f100362a;
        MomoCodec momoCodecM123869d = f410.m123869d(contextM126853t2, c410Var, c410Var.mo20673A0());
        this.f100367f = momoCodecM123869d;
        this.f171970z = (s410) momoCodecM123869d;
        this.f100366e.mo21127s1(this.f100365d.f175461R);
        this.f100367f.mo20660e1(this.f100366e);
        this.f171970z.m131936O2(this.f171960A);
        this.f171970z.m184423z4(this.f171963D);
        this.f171970z.m184404A4(this.f100370i);
        this.f171970z.m184407D4(this.f171961B, null, this.f171962C);
        if (!TextUtils.isEmpty(this.f100369h)) {
            this.f171970z.mo20650J(this.f100369h);
        }
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            uow uowVar = this.f100365d;
            ((ExtAudioWrapper) interfaceC4260a).m21086I2(2048, uowVar.f175459P, uowVar.f175461R, "Momo");
        }
        return super.mo107927t0();
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: t1 */
    public void mo107928t1(int i) {
        this.f171963D = i;
        s410 s410Var = this.f171970z;
        if (s410Var != null) {
            s410Var.m184423z4(i);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: u */
    public void mo107929u(boolean z) {
        s410 s410Var = this.f171970z;
        if (s410Var != null) {
            s410Var.m184405B4(z);
            oq70.m168791d().m168793a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + " replace setReplaceStream:" + z);
        }
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: u0 */
    public void mo107930u0(boolean z) {
        super.mo107930u0(z);
        this.f171960A = z;
    }
}
