package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1837d;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.InterfaceC2067y;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class eji0 extends AbstractC1837d implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    @Nullable
    public k5g0 f91725A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public k5g0 f91726B;

    /* JADX INFO: renamed from: C */
    public int f91727C;

    /* JADX INFO: renamed from: D */
    public long f91728D;

    /* JADX INFO: renamed from: E */
    public long f91729E;

    /* JADX INFO: renamed from: F */
    public long f91730F;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final Handler f91731p;

    /* JADX INFO: renamed from: q */
    public final aji0 f91732q;

    /* JADX INFO: renamed from: r */
    public final h5g0 f91733r;

    /* JADX INFO: renamed from: s */
    public final uyi f91734s;

    /* JADX INFO: renamed from: t */
    public boolean f91735t;

    /* JADX INFO: renamed from: u */
    public boolean f91736u;

    /* JADX INFO: renamed from: v */
    public boolean f91737v;

    /* JADX INFO: renamed from: w */
    public int f91738w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public C1871k f91739x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public g5g0 f91740y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public j5g0 f91741z;

    public eji0(aji0 aji0Var, @Nullable Looper looper, h5g0 h5g0Var) {
        super(3);
        this.f91732q = (aji0) p11.m167011e(aji0Var);
        this.f91731p = looper == null ? null : vck0.m197894v(looper, this);
        this.f91733r = h5g0Var;
        this.f91734s = new uyi();
        this.f91728D = -9223372036854775807L;
        this.f91729E = -9223372036854775807L;
        this.f91730F = -9223372036854775807L;
    }

    @SideEffectFree
    /* JADX INFO: renamed from: a0 */
    private long m116847a0(long j) {
        p11.m167013g(j != -9223372036854775807L);
        p11.m167013g(this.f91729E != -9223372036854775807L);
        return j - this.f91729E;
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: L */
    public void mo9636L() {
        this.f91739x = null;
        this.f91728D = -9223372036854775807L;
        m116848X();
        this.f91729E = -9223372036854775807L;
        this.f91730F = -9223372036854775807L;
        m116855f0();
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: N */
    public void mo9638N(long j, boolean z) {
        this.f91730F = j;
        m116848X();
        this.f91735t = false;
        this.f91736u = false;
        this.f91728D = -9223372036854775807L;
        if (this.f91738w != 0) {
            m116856g0();
        } else {
            m116854e0();
            ((g5g0) p11.m167011e(this.f91740y)).flush();
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: T */
    public void mo9771T(C1871k[] c1871kArr, long j, long j2) {
        this.f91729E = j2;
        this.f91739x = c1871kArr[0];
        if (this.f91740y != null) {
            this.f91738w = 1;
        } else {
            m116852c0();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m116848X() {
        m116858i0(new cxb(ImmutableList.m15685of(), m116847a0(this.f91730F)));
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    /* JADX INFO: renamed from: Y */
    public final long m116849Y(long j) {
        int iMo114793f = this.f91725A.mo114793f(j);
        if (iMo114793f == 0 || this.f91725A.mo114792b() == 0) {
            return this.f91725A.f97498b;
        }
        k5g0 k5g0Var = this.f91725A;
        return iMo114793f == -1 ? k5g0Var.mo114791a(k5g0Var.mo114792b() - 1) : k5g0Var.mo114791a(iMo114793f - 1);
    }

    /* JADX INFO: renamed from: Z */
    public final long m116850Z() {
        if (this.f91727C == -1) {
            return Long.MAX_VALUE;
        }
        p11.m167011e(this.f91725A);
        if (this.f91727C >= this.f91725A.mo114792b()) {
            return Long.MAX_VALUE;
        }
        return this.f91725A.mo114791a(this.f91727C);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2067y
    /* JADX INFO: renamed from: a */
    public int mo10384a(C1871k c1871k) {
        if (this.f91733r.mo129398a(c1871k)) {
            return InterfaceC2067y.m12212v(c1871k.f7735G == 0 ? 4 : 2);
        }
        return n200.m157536r(c1871k.f7748l) ? InterfaceC2067y.m12212v(1) : InterfaceC2067y.m12212v(0);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: b */
    public boolean mo9653b() {
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m116851b0(SubtitleDecoderException subtitleDecoderException) {
        jwv.m143684d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f91739x, subtitleDecoderException);
        m116848X();
        m116856g0();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: c */
    public boolean mo9654c() {
        return this.f91736u;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m116852c0() {
        this.f91737v = true;
        this.f91740y = this.f91733r.mo129399b((C1871k) p11.m167011e(this.f91739x));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m116853d0(cxb cxbVar) {
        this.f91732q.mo10126p(cxbVar.f82866a);
        this.f91732q.mo10118d(cxbVar);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m116854e0() {
        this.f91741z = null;
        this.f91727C = -1;
        k5g0 k5g0Var = this.f91725A;
        if (k5g0Var != null) {
            k5g0Var.mo121353u();
            this.f91725A = null;
        }
        k5g0 k5g0Var2 = this.f91726B;
        if (k5g0Var2 != null) {
            k5g0Var2.mo121353u();
            this.f91726B = null;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m116855f0() {
        m116854e0();
        ((g5g0) p11.m167011e(this.f91740y)).release();
        this.f91740y = null;
        this.f91738w = 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m116856g0() {
        m116855f0();
        m116852c0();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x, com.google.android.exoplayer2.InterfaceC2067y
    public String getName() {
        return "TextRenderer";
    }

    /* JADX INFO: renamed from: h0 */
    public void m116857h0(long j) {
        p11.m167013g(mo9776g());
        this.f91728D = j;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m116853d0((cxb) message.obj);
            return true;
        }
        ohg0.m164364a();
        return false;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m116858i0(cxb cxbVar) {
        Handler handler = this.f91731p;
        if (handler != null) {
            handler.obtainMessage(0, cxbVar).sendToTarget();
        } else {
            m116853d0(cxbVar);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: j */
    public void mo10393j(long j, long j2) throws DecoderException {
        boolean z;
        this.f91730F = j;
        if (mo9776g()) {
            long j3 = this.f91728D;
            if (j3 != -9223372036854775807L && j >= j3) {
                m116854e0();
                this.f91736u = true;
            }
        }
        if (this.f91736u) {
            return;
        }
        if (this.f91726B == null) {
            ((g5g0) p11.m167011e(this.f91740y)).mo124526b(j);
            try {
                this.f91726B = ((g5g0) p11.m167011e(this.f91740y)).mo101812c();
            } catch (SubtitleDecoderException e) {
                m116851b0(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f91725A != null) {
            long jM116850Z = m116850Z();
            z = false;
            while (jM116850Z <= j) {
                this.f91727C++;
                jM116850Z = m116850Z();
                z = true;
            }
        } else {
            z = false;
        }
        k5g0 k5g0Var = this.f91726B;
        if (k5g0Var != null) {
            if (k5g0Var.m154495p()) {
                if (!z && m116850Z() == Long.MAX_VALUE) {
                    if (this.f91738w == 2) {
                        m116856g0();
                    } else {
                        m116854e0();
                        this.f91736u = true;
                    }
                }
            } else if (k5g0Var.f97498b <= j) {
                k5g0 k5g0Var2 = this.f91725A;
                if (k5g0Var2 != null) {
                    k5g0Var2.mo121353u();
                }
                this.f91727C = k5g0Var.mo114793f(j);
                this.f91725A = k5g0Var;
                this.f91726B = null;
                z = true;
            }
        }
        if (z) {
            p11.m167011e(this.f91725A);
            m116858i0(new cxb(this.f91725A.mo114794g(j), m116847a0(m116849Y(j))));
        }
        if (this.f91738w == 2) {
            return;
        }
        while (!this.f91735t) {
            try {
                j5g0 j5g0VarMo101811a = this.f91741z;
                if (j5g0VarMo101811a == null) {
                    j5g0VarMo101811a = ((g5g0) p11.m167011e(this.f91740y)).mo101811a();
                    if (j5g0VarMo101811a == null) {
                        return;
                    } else {
                        this.f91741z = j5g0VarMo101811a;
                    }
                }
                if (this.f91738w == 1) {
                    j5g0VarMo101811a.m154499t(4);
                    ((g5g0) p11.m167011e(this.f91740y)).mo101813d(j5g0VarMo101811a);
                    this.f91741z = null;
                    this.f91738w = 2;
                    return;
                }
                int iM9772U = m9772U(this.f91734s, j5g0VarMo101811a, 0);
                if (iM9772U == -4) {
                    if (j5g0VarMo101811a.m154495p()) {
                        this.f91735t = true;
                        this.f91737v = false;
                    } else {
                        C1871k c1871k = this.f91734s.f178866b;
                        if (c1871k == null) {
                            return;
                        }
                        j5g0VarMo101811a.f116317i = c1871k.f7752p;
                        j5g0VarMo101811a.m9806w();
                        this.f91737v &= !j5g0VarMo101811a.m154497r();
                    }
                    if (!this.f91737v) {
                        ((g5g0) p11.m167011e(this.f91740y)).mo101813d(j5g0VarMo101811a);
                        this.f91741z = null;
                    }
                } else if (iM9772U == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                m116851b0(e2);
                return;
            }
        }
    }

    public eji0(aji0 aji0Var, @Nullable Looper looper) {
        this(aji0Var, looper, h5g0.f105947a);
    }
}
