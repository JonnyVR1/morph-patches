package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;

/* JADX INFO: loaded from: classes8.dex */
public class lw00 extends oq2 implements gxl {

    /* JADX INFO: renamed from: A */
    boolean f130223A;

    /* JADX INFO: renamed from: B */
    private int f130224B;

    /* JADX INFO: renamed from: C */
    private String f130225C;

    /* JADX INFO: renamed from: D */
    private int f130226D;

    /* JADX INFO: renamed from: E */
    private vlw f130227E;

    /* JADX INFO: renamed from: F */
    private int f130228F;

    /* JADX INFO: renamed from: G */
    private int f130229G;

    /* JADX INFO: renamed from: H */
    private int f130230H;

    /* JADX INFO: renamed from: I */
    private String f130231I;

    /* JADX INFO: renamed from: y */
    sml f130232y;

    /* JADX INFO: renamed from: z */
    kw00 f130233z;

    public lw00(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC4109a interfaceC4109a) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC4109a);
        this.f130223A = false;
        this.f130224B = 10;
        this.f130225C = null;
        this.f130226D = 2;
        this.f130227E = null;
        this.f130228F = 0;
        this.f130229G = 0;
        this.f130230H = 0;
        this.f130231I = "";
    }

    /* JADX INFO: renamed from: B2 */
    public void m151930B2(sml smlVar) {
        this.f130232y = smlVar;
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: L1 */
    public int mo139339L1() {
        return this.f130230H;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: O1 */
    public boolean mo20093O1(String str) {
        return super.mo20093O1(str);
    }

    @Override // p149l.gxl
    /* JADX INFO: renamed from: R0 */
    public void mo128616R0() {
        kw00 kw00Var = this.f130233z;
        if (kw00Var != null) {
            kw00Var.m147504x4();
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo139343T0(int i) {
        super.mo139343T0(i);
        this.f145083i = i;
        kw00 kw00Var = this.f130233z;
        if (kw00Var != null) {
            kw00Var.m147486A4(i);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: V0 */
    public int mo139345V0() {
        return this.f130229G;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: a */
    public void mo139348a(boolean z) {
        super.mo139348a(z);
        kw00 kw00Var = this.f130233z;
        if (kw00Var != null) {
            kw00Var.m147502q4(z);
        }
    }

    @Override // p149l.gxl
    /* JADX INFO: renamed from: b1 */
    public void mo128617b1(boolean z) {
        kw00 kw00Var = this.f130233z;
        if (kw00Var != null) {
            kw00Var.m147488C4(z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: f */
    public void mo139353f() {
        ii70.m136344d().m136346a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName().concat(" stopRecord"));
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19695d0(this.f145080f);
            kw00 kw00Var = this.f130233z;
            if (kw00Var != null) {
                this.f130228F = kw00Var.m147497e4();
                this.f130229G = this.f130233z.m147499g4();
                this.f130230H = this.f130233z.m147498f4();
            }
            this.f130233z = null;
        }
        super.mo139353f();
    }

    @Override // p149l.gxl
    /* JADX INFO: renamed from: g2 */
    public void mo128618g2() {
        kw00 kw00Var = this.f130233z;
        if (kw00Var != null) {
            kw00Var.m147503u4();
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: k1 */
    public int mo139359k1() {
        return this.f130228F;
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: p0 */
    public void mo139367p0(int i, String str) {
        this.f130224B = i;
        this.f130225C = str;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo139369t0() {
        Context contextM165393t2 = m165393t2();
        uv00 uv00Var = this.f145075a;
        MomoCodec momoCodecM211241d = xv00.m211241d(contextM165393t2, uv00Var, uv00Var.mo19674A0());
        this.f145080f = momoCodecM211241d;
        this.f130233z = (kw00) momoCodecM211241d;
        this.f145079e.mo20128s1(this.f145078d.f177119R);
        this.f145080f.mo19661e1(this.f145079e);
        this.f130233z.m141703O2(this.f130223A);
        this.f130233z.m147505z4(this.f130226D);
        this.f130233z.m147486A4(this.f145083i);
        this.f130233z.m147489D4(this.f130224B, null, this.f130225C);
        if (!TextUtils.isEmpty(this.f145082h)) {
            this.f130233z.mo19651J(this.f145082h);
        }
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            vlw vlwVar = this.f145078d;
            ((ExtAudioWrapper) interfaceC4109a).m20087I2(2048, vlwVar.f177117P, vlwVar.f177119R, "Momo");
        }
        return super.mo139369t0();
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: t1 */
    public void mo139370t1(int i) {
        this.f130226D = i;
        kw00 kw00Var = this.f130233z;
        if (kw00Var != null) {
            kw00Var.m147505z4(i);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: u */
    public void mo139371u(boolean z) {
        kw00 kw00Var = this.f130233z;
        if (kw00Var != null) {
            kw00Var.m147487B4(z);
            ii70.m136344d().m136346a("Pipeline_Flow_pip->MOMO", getClass().getSimpleName() + " replace setReplaceStream:" + z);
        }
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo139372u0(boolean z) {
        super.mo139372u0(z);
        this.f130223A = z;
    }
}
