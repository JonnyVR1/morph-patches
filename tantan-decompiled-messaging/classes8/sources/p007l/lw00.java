package p007l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import l.i3m;
import l.ii70;
import l.sml;
import l.ulw;
import l.uv00;
import l.vlw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class lw00 extends oq2 implements gxl {

    /* JADX INFO: renamed from: A */
    boolean f3262A;

    /* JADX INFO: renamed from: B */
    private int f3263B;

    /* JADX INFO: renamed from: C */
    private String f3264C;

    /* JADX INFO: renamed from: D */
    private int f3265D;

    /* JADX INFO: renamed from: E */
    private vlw f3266E;

    /* JADX INFO: renamed from: F */
    private int f3267F;

    /* JADX INFO: renamed from: G */
    private int f3268G;

    /* JADX INFO: renamed from: H */
    private int f3269H;

    /* JADX INFO: renamed from: I */
    private String f3270I;

    /* JADX INFO: renamed from: y */
    sml f3271y;

    /* JADX INFO: renamed from: z */
    kw00 f3272z;

    public lw00(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC0021a interfaceC0021a) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC0021a);
        this.f3262A = false;
        this.f3263B = 10;
        this.f3264C = null;
        this.f3265D = 2;
        this.f3266E = null;
        this.f3267F = 0;
        this.f3268G = 0;
        this.f3269H = 0;
        this.f3270I = "";
    }

    /* JADX INFO: renamed from: B2 */
    public void m9853B2(sml smlVar) {
        this.f3271y = smlVar;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: L1 */
    public int mo9464L1() {
        return this.f3269H;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: O1 */
    public boolean mo9854O1(String str) {
        return super.mo9854O1(str);
    }

    @Override // p007l.gxl
    /* JADX INFO: renamed from: R0 */
    public void mo9276R0() {
        kw00 kw00Var = this.f3272z;
        if (kw00Var != null) {
            kw00Var.m9786x4();
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo9468T0(int i) {
        super.mo9468T0(i);
        this.f3558i = i;
        kw00 kw00Var = this.f3272z;
        if (kw00Var != null) {
            kw00Var.m9695A4(i);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: V0 */
    public int mo9470V0() {
        return this.f3268G;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: a */
    public void mo9473a(boolean z) {
        super.mo9473a(z);
        kw00 kw00Var = this.f3272z;
        if (kw00Var != null) {
            kw00Var.m9776q4(z);
        }
    }

    @Override // p007l.gxl
    /* JADX INFO: renamed from: b1 */
    public void mo9277b1(boolean z) {
        kw00 kw00Var = this.f3272z;
        if (kw00Var != null) {
            kw00Var.m9701C4(z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: f */
    public void mo9478f() {
        ii70.d().a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName().concat(" stopRecord"));
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.d0(this.f3555f);
            kw00 kw00Var = this.f3272z;
            if (kw00Var != null) {
                this.f3267F = kw00Var.m9750e4();
                this.f3268G = this.f3272z.m9756g4();
                this.f3269H = this.f3272z.m9753f4();
            }
            this.f3272z = null;
        }
        super.mo9478f();
    }

    @Override // p007l.gxl
    /* JADX INFO: renamed from: g2 */
    public void mo9278g2() {
        kw00 kw00Var = this.f3272z;
        if (kw00Var != null) {
            kw00Var.m9782u4();
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: k1 */
    public int mo9484k1() {
        return this.f3267F;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: p0 */
    public void mo9492p0(int i, String str) {
        this.f3263B = i;
        this.f3264C = str;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo9494t0() {
        Context contextM10229t2 = m10229t2();
        uv00 uv00Var = this.f3550a;
        kw00 kw00VarM11849d = xv00.m11849d(contextM10229t2, uv00Var, uv00Var.A0());
        this.f3555f = kw00VarM11849d;
        this.f3272z = kw00VarM11849d;
        this.f3554e.mo394s1(((ulw) this.f3553d).R);
        this.f3555f.e1(this.f3554e);
        this.f3272z.O2(this.f3262A);
        this.f3272z.m9789z4(this.f3265D);
        this.f3272z.m9695A4(this.f3558i);
        this.f3272z.m9704D4(this.f3263B, null, this.f3264C);
        if (!TextUtils.isEmpty(this.f3557h)) {
            this.f3272z.J(this.f3557h);
        }
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            vlw vlwVar = this.f3553d;
            ((ExtAudioWrapper) interfaceC0021a).m353I2(2048, ((ulw) vlwVar).P, ((ulw) vlwVar).R, "Momo");
        }
        return super.mo9494t0();
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: t1 */
    public void mo9495t1(int i) {
        this.f3265D = i;
        kw00 kw00Var = this.f3272z;
        if (kw00Var != null) {
            kw00Var.m9789z4(i);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: u */
    public void mo9496u(boolean z) {
        kw00 kw00Var = this.f3272z;
        if (kw00Var != null) {
            kw00Var.m9697B4(z);
            ii70.d().a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + " replace setReplaceStream:" + z);
        }
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo9497u0(boolean z) {
        super.mo9497u0(z);
        this.f3262A = z;
    }
}
