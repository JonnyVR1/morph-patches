package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;

/* JADX INFO: loaded from: classes6.dex */
public final class atr0 implements hur0 {

    /* JADX INFO: renamed from: a */
    public final yrr0 f73399a;

    /* JADX INFO: renamed from: b */
    public final dfw0 f73400b = new dfw0(new byte[10], 10);

    /* JADX INFO: renamed from: c */
    public int f73401c = 0;

    /* JADX INFO: renamed from: d */
    public int f73402d;

    /* JADX INFO: renamed from: e */
    public nnw0 f73403e;

    /* JADX INFO: renamed from: f */
    public boolean f73404f;

    /* JADX INFO: renamed from: g */
    public boolean f73405g;

    /* JADX INFO: renamed from: h */
    public boolean f73406h;

    /* JADX INFO: renamed from: i */
    public int f73407i;

    /* JADX INFO: renamed from: j */
    public int f73408j;

    /* JADX INFO: renamed from: k */
    public boolean f73409k;

    public atr0(yrr0 yrr0Var) {
        this.f73399a = yrr0Var;
    }

    @Override // p153l.hur0
    /* JADX INFO: renamed from: a */
    public final void mo100239a(nnw0 nnw0Var, ser0 ser0Var, gur0 gur0Var) {
        this.f73403e = nnw0Var;
        this.f73399a.mo155731d(ser0Var, gur0Var);
    }

    @Override // p153l.hur0
    /* JADX INFO: renamed from: b */
    public final void mo100240b(bgw0 bgw0Var, int i) throws zzcc {
        int i2;
        int i3;
        long jM163999b;
        lev0.m153954b(this.f73403e);
        int i4 = -1;
        int i5 = 2;
        if ((i & 1) != 0) {
            int i6 = this.f73401c;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.f73408j;
                    if (i7 != -1) {
                        y4w0.m214278f("PesReader", "Unexpected start indicator: expected " + i7 + " more bytes");
                    }
                    this.f73399a.mo155728a(bgw0Var.m104278t() == 0);
                } else {
                    y4w0.m214278f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m100241c(1);
        }
        int i8 = i;
        while (bgw0Var.m104275q() > 0) {
            int i9 = this.f73401c;
            if (i9 == 0) {
                i2 = i5;
                bgw0Var.m104270l(bgw0Var.m104275q());
            } else if (i9 != 1) {
                if (i9 != i5) {
                    int iM104275q = bgw0Var.m104275q();
                    int i10 = this.f73408j;
                    int i11 = i10 == i4 ? 0 : iM104275q - i10;
                    if (i11 > 0) {
                        iM104275q -= i11;
                        bgw0Var.m104268j(bgw0Var.m104277s() + iM104275q);
                    }
                    this.f73399a.mo155729b(bgw0Var);
                    int i12 = this.f73408j;
                    if (i12 != i4) {
                        int i13 = i12 - iM104275q;
                        this.f73408j = i13;
                        if (i13 == 0) {
                            this.f73399a.mo155728a(false);
                            m100241c(1);
                        }
                    }
                } else {
                    if (m100242d(bgw0Var, this.f73400b.f88231a, Math.min(10, this.f73407i)) && m100242d(bgw0Var, null, this.f73407i)) {
                        this.f73400b.m115559k(0);
                        if (this.f73404f) {
                            this.f73400b.m115561m(4);
                            long jM115552d = this.f73400b.m115552d(3);
                            this.f73400b.m115561m(1);
                            int iM115552d = this.f73400b.m115552d(15) << 15;
                            this.f73400b.m115561m(1);
                            long jM115552d2 = this.f73400b.m115552d(15);
                            this.f73400b.m115561m(1);
                            if (!this.f73406h && this.f73405g) {
                                this.f73400b.m115561m(4);
                                long jM115552d3 = ((long) this.f73400b.m115552d(3)) << 30;
                                this.f73400b.m115561m(1);
                                int iM115552d2 = this.f73400b.m115552d(15) << 15;
                                this.f73400b.m115561m(1);
                                long jM115552d4 = this.f73400b.m115552d(15);
                                this.f73400b.m115561m(1);
                                this.f73403e.m163999b(jM115552d3 | ((long) iM115552d2) | jM115552d4);
                                this.f73406h = true;
                            }
                            jM163999b = this.f73403e.m163999b((jM115552d << 30) | ((long) iM115552d) | jM115552d2);
                        } else {
                            jM163999b = -9223372036854775807L;
                        }
                        i8 |= true != this.f73409k ? 0 : 4;
                        this.f73399a.mo155730c(jM163999b, i8);
                        m100241c(3);
                        i4 = -1;
                        i5 = 2;
                    }
                }
                i2 = i5;
            } else if (m100242d(bgw0Var, this.f73400b.f88231a, 9)) {
                this.f73400b.m115559k(0);
                int iM115552d3 = this.f73400b.m115552d(24);
                if (iM115552d3 != 1) {
                    y4w0.m214278f("PesReader", "Unexpected start code prefix: " + iM115552d3);
                    i4 = -1;
                    this.f73408j = -1;
                    i3 = 0;
                    i2 = 2;
                } else {
                    this.f73400b.m115561m(8);
                    dfw0 dfw0Var = this.f73400b;
                    int iM115552d4 = dfw0Var.m115552d(16);
                    dfw0Var.m115561m(5);
                    this.f73409k = this.f73400b.m115563o();
                    i2 = 2;
                    this.f73400b.m115561m(2);
                    this.f73404f = this.f73400b.m115563o();
                    this.f73405g = this.f73400b.m115563o();
                    this.f73400b.m115561m(6);
                    int iM115552d5 = this.f73400b.m115552d(8);
                    this.f73407i = iM115552d5;
                    if (iM115552d4 == 0) {
                        this.f73408j = -1;
                        i4 = -1;
                    } else {
                        int i14 = (iM115552d4 - 3) - iM115552d5;
                        this.f73408j = i14;
                        if (i14 < 0) {
                            y4w0.m214278f("PesReader", "Found negative packet payload size: " + i14);
                            i4 = -1;
                            this.f73408j = -1;
                        } else {
                            i4 = -1;
                        }
                    }
                    i3 = 2;
                }
                m100241c(i3);
            } else {
                i4 = -1;
                i2 = 2;
            }
            i5 = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m100241c(int i) {
        this.f73401c = i;
        this.f73402d = 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m100242d(bgw0 bgw0Var, @Nullable byte[] bArr, int i) {
        int iMin = Math.min(bgw0Var.m104275q(), i - this.f73402d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            bgw0Var.m104270l(iMin);
        } else {
            bgw0Var.m104265g(bArr, this.f73402d, iMin);
        }
        int i2 = this.f73402d + iMin;
        this.f73402d = i2;
        return i2 == i;
    }

    @Override // p153l.hur0
    public final void zzc() {
        this.f73401c = 0;
        this.f73402d = 0;
        this.f73406h = false;
        this.f73399a.zze();
    }
}
