package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class osr0 implements yrr0 {

    /* JADX INFO: renamed from: l */
    public static final float[] f148891l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    @Nullable
    public final jur0 f148892a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final bgw0 f148893b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f148894c;

    /* JADX INFO: renamed from: d */
    public final msr0 f148895d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ysr0 f148896e;

    /* JADX INFO: renamed from: f */
    public nsr0 f148897f;

    /* JADX INFO: renamed from: g */
    public long f148898g;

    /* JADX INFO: renamed from: h */
    public String f148899h;

    /* JADX INFO: renamed from: i */
    public sgr0 f148900i;

    /* JADX INFO: renamed from: j */
    public boolean f148901j;

    /* JADX INFO: renamed from: k */
    public long f148902k;

    public osr0(@Nullable jur0 jur0Var) {
        this.f148892a = jur0Var;
        this.f148894c = new boolean[4];
        this.f148895d = new msr0(128);
        this.f148902k = -9223372036854775807L;
        this.f148896e = new ysr0(178, 128);
        this.f148893b = new bgw0();
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
        lev0.m153954b(this.f148897f);
        if (z) {
            this.f148897f.m164631b(this.f148898g, 0, this.f148901j);
            this.f148897f.m164633d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) {
        int i;
        int i2;
        lev0.m153954b(this.f148897f);
        lev0.m153954b(this.f148900i);
        int iM104277s = bgw0Var.m104277s();
        int iM104278t = bgw0Var.m104278t();
        byte[] bArrM104271m = bgw0Var.m104271m();
        this.f148898g += (long) bgw0Var.m104275q();
        this.f148900i.mo99375f(bgw0Var, bgw0Var.m104275q());
        while (true) {
            int iM204791a = w3x0.m204791a(bArrM104271m, iM104277s, iM104278t, this.f148894c);
            if (iM204791a == iM104278t) {
                break;
            }
            int i3 = iM204791a + 3;
            int i4 = bgw0Var.m104271m()[i3] & 255;
            int i5 = iM204791a - iM104277s;
            if (!this.f148901j) {
                if (i5 > 0) {
                    this.f148895d.m159933a(bArrM104271m, iM104277s, iM204791a);
                }
                if (this.f148895d.m159935c(i4, i5 < 0 ? -i5 : 0)) {
                    sgr0 sgr0Var = this.f148900i;
                    msr0 msr0Var = this.f148895d;
                    int i6 = msr0Var.f138519d;
                    String str = this.f148899h;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(msr0Var.f138520e, msr0Var.f138518c);
                    dfw0 dfw0Var = new dfw0(bArrCopyOf, bArrCopyOf.length);
                    dfw0Var.m115562n(i6);
                    dfw0Var.m115562n(4);
                    dfw0Var.m115560l();
                    dfw0Var.m115561m(8);
                    if (dfw0Var.m115563o()) {
                        dfw0Var.m115561m(4);
                        dfw0Var.m115561m(3);
                    }
                    int iM115552d = dfw0Var.m115552d(4);
                    float f = 1.0f;
                    if (iM115552d == 15) {
                        int iM115552d2 = dfw0Var.m115552d(8);
                        int iM115552d3 = dfw0Var.m115552d(8);
                        if (iM115552d3 == 0) {
                            y4w0.m214278f("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = iM115552d2 / iM115552d3;
                        }
                    } else if (iM115552d < 7) {
                        f = f148891l[iM115552d];
                    } else {
                        y4w0.m214278f("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (dfw0Var.m115563o()) {
                        dfw0Var.m115561m(2);
                        dfw0Var.m115561m(1);
                        if (dfw0Var.m115563o()) {
                            dfw0Var.m115561m(15);
                            dfw0Var.m115560l();
                            dfw0Var.m115561m(15);
                            dfw0Var.m115560l();
                            dfw0Var.m115561m(15);
                            dfw0Var.m115560l();
                            dfw0Var.m115561m(3);
                            dfw0Var.m115561m(11);
                            dfw0Var.m115560l();
                            dfw0Var.m115561m(15);
                            dfw0Var.m115560l();
                            i2 = 2;
                        } else {
                            i2 = 2;
                        }
                    } else {
                        i2 = 2;
                    }
                    if (dfw0Var.m115552d(i2) != 0) {
                        y4w0.m214278f("H263Reader", "Unhandled video object layer shape");
                    }
                    dfw0Var.m115560l();
                    int iM115552d4 = dfw0Var.m115552d(16);
                    dfw0Var.m115560l();
                    if (dfw0Var.m115563o()) {
                        if (iM115552d4 == 0) {
                            y4w0.m214278f("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = iM115552d4 - 1;
                            int i8 = 0;
                            while (i7 > 0) {
                                i7 >>= 1;
                                i8++;
                            }
                            dfw0Var.m115561m(i8);
                        }
                    }
                    dfw0Var.m115560l();
                    int iM115552d5 = dfw0Var.m115552d(13);
                    dfw0Var.m115560l();
                    int iM115552d6 = dfw0Var.m115552d(13);
                    dfw0Var.m115560l();
                    dfw0Var.m115560l();
                    znr0 znr0Var = new znr0();
                    znr0Var.m220658k(str);
                    znr0Var.m220672w("video/mp4v-es");
                    znr0Var.m220644C(iM115552d5);
                    znr0Var.m220654i(iM115552d6);
                    znr0Var.m220668s(f2);
                    znr0Var.m220660l(Collections.singletonList(bArrCopyOf));
                    sgr0Var.mo99373d(znr0Var.m220645D());
                    this.f148901j = true;
                }
            }
            this.f148897f.m164630a(bArrM104271m, iM104277s, iM204791a);
            ysr0 ysr0Var = this.f148896e;
            if (i5 > 0) {
                ysr0Var.m217273a(bArrM104271m, iM104277s, iM204791a);
                i = 0;
            } else {
                i = -i5;
            }
            if (this.f148896e.m217276d(i)) {
                ysr0 ysr0Var2 = this.f148896e;
                int iM204792b = w3x0.m204792b(ysr0Var2.f201447d, ysr0Var2.f201448e);
                bgw0 bgw0Var2 = this.f148893b;
                int i9 = mpw0.f137957a;
                bgw0Var2.m104267i(this.f148896e.f201447d, iM204792b);
                this.f148892a.m146995a(this.f148902k, this.f148893b);
            }
            if (i4 == 178) {
                if (bgw0Var.m104271m()[iM204791a + 2] == 1) {
                    this.f148896e.m217275c(178);
                }
                i4 = 178;
            }
            int i10 = iM104278t - iM204791a;
            this.f148897f.m164631b(this.f148898g - ((long) i10), i10, this.f148901j);
            this.f148897f.m164632c(i4, this.f148902k);
            iM104277s = i3;
            iM104278t = iM104278t;
        }
        if (!this.f148901j) {
            this.f148895d.m159933a(bArrM104271m, iM104277s, iM104278t);
        }
        this.f148897f.m164630a(bArrM104271m, iM104277s, iM104278t);
        this.f148896e.m217273a(bArrM104271m, iM104277s, iM104278t);
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        this.f148902k = j;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        this.f148899h = gur0Var.m132385b();
        sgr0 sgr0VarMo101550i = ser0Var.mo101550i(gur0Var.m132384a(), 2);
        this.f148900i = sgr0VarMo101550i;
        this.f148897f = new nsr0(sgr0VarMo101550i);
        this.f148892a.m146996b(ser0Var, gur0Var);
    }

    @Override // p153l.yrr0
    public final void zze() {
        w3x0.m204796f(this.f148894c);
        this.f148895d.m159934b();
        nsr0 nsr0Var = this.f148897f;
        if (nsr0Var != null) {
            nsr0Var.m164633d();
        }
        this.f148896e.m217274b();
        this.f148898g = 0L;
        this.f148902k = -9223372036854775807L;
    }

    public osr0() {
        this(null);
    }
}
